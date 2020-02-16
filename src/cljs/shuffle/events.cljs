(ns shuffle.events
  (:require [re-frame.core :as re-frame]
            [shuffle.db :as db]))

(re-frame/reg-event-db
 ::initialize-db
 (fn  [_ _]
   db/default-db))

(defn set-current-tab [tabs tabname]
  (reduce (fn [v t] (conj v (assoc t :current (if (= tabname (:name t)) true false)))) [] tabs))

(defn handle-change-tab [db [_ tabname]]
  ;(js/alert (str "handle change tab " tabname))
  (assoc db :tabs (set-current-tab (:tabs db) tabname)
            :name tabname
            :menu :hide))

(re-frame/reg-event-db
  :change-tab
  handle-change-tab)

(defn handle-change-subtab [db [_ subtabname]]
  (let [_ (js/alert (str "change subtab called with " subtabname))
        index-of-name (fn [v name]
                       (first (keep-indexed #(when (= name (:name %2)) %1) v)))
        current-tab-index (reduce-kv (fn [a k v] (if (:current v) k a)) -1 (:tabs db))
        tabname (:name (get (:tabs db) current-tab-index))
        new-db (update-in db [:tabs (index-of-name (:tabs db) tabname)] assoc :subname subtabname :current true)
        ;;_ (js/alert (str "handle change subtab " (:tabs new-db)))
        _ (js/alert (str "handle change subtab setting subname " subtabname))
        _ (js/alert (str "handle change subtab -- db -- " new-db))
        ]
  (assoc new-db :subname subtabname)
  )
)

(re-frame/reg-event-db
  :change-subtab
  handle-change-subtab)

(defn show-dropdown-menu [db [_ v]]
  (let [update-value (if (= :show v) :hide :show)]
    (assoc db :menu update-value)))

(re-frame/reg-event-db
  :show-dropdown
  show-dropdown-menu)

