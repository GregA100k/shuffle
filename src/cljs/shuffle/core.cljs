(ns shuffle.core
  (:require [reagent.core :as reagent]
            [re-frame.core :as re-frame]
            [re-fill.routing :as routing]
            [re-fill.debounce :as debounce]
            [re-fill.notifications :as notifications]
            [shuffle.events :as events]
            [shuffle.views :as views]
            [shuffle.routes :as shuffroutes]
            [shuffle.config :as config]))


(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn controls-view []
  (let [debounce @(re-frame/subscribe [:re-fill/debounce])]
    [:div.controls
     {:style {:display "flex"
              }}
     [:a.controls__a {:href "/welcome"} "Welcome"]
     [:a.controls__a {:href "/info"} "Info"]
     [:a.controls__a {:href "/missig"} "missing"]
      ]))





(defn welcome-view []
  [:h1 "This is the welcome view"])

(defn info-view []
  [:h1 "This is the info view"])

(defn missing-view []
  [:h1 "This is the missing view"])

(defn loading-view []
  [:h1 "This is the loading view"])

;; event handlers for routes

(re-frame/reg-event-fx
  :routes/welcome
  (fn [_ [_ bidi-match]]
    (js/alert "Navigated (welcome) to " bidi-match)))

(re-frame/reg-event-fx
  :routes/info
  (fn [_ [_ bidi-match]]
   (js/alert "Navigated (info) to " bidi-match)))


(def views {:routes/welcome  welcome-view
            :routes/info     info-view
            :else loading-view})

(defn main-view [views]
  (let [_ (js/alert "Views parm is " views) ]
  [:div.main
   [:h1 "this is shown in all views"]
   [controls-view]
   [:h1 "this is shown after the controls view"]
   [routing/routed-view views]]))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  ;;(reagent/render [views/whole-page]
  ;;                (.getElementById js/document "app"))
  (reagent/render [main-view views]
                  (.getElementById js/document "app"))
  )

(defn ^:export init []
;  (re-frame/dispatch-sync [::events/initialize-db])
  (re-frame/dispatch [:re-fill/init-routing shuffroutes/routes])
  (dev-setup)
  (mount-root))
