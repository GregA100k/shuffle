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


;; event handlers for routes

(re-frame/reg-event-fx
  :routes/welcome
  (fn [_ [_ bidi-match]]
  (re-frame/dispatch [:change-tab "Welcome"])))

(re-frame/reg-event-fx
  :routes/info
  (fn [_ [_ bidi-match]]
  (re-frame/dispatch [:change-tab "Race Info"])))

(re-frame/reg-event-fx
  :routes/course
  (fn [_ [_ bidi-match]]
  (re-frame/dispatch [:change-tab "Race Course"])))

(re-frame/reg-event-fx
  :routes/results
  (fn [_ [_ bidi-match]]
  (re-frame/dispatch [:change-tab "Results"])))

(re-frame/reg-event-fx
  :routes/volunteer
  (fn [_ [_ bidi-match]]
  (re-frame/dispatch [:change-tab "Volunteer"])))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [views/whole-page]
                  (.getElementById js/document "app"))
  )

(defn ^:export init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (re-frame/dispatch [:re-fill/init-routing shuffroutes/routes])
  (dev-setup)
  (mount-root))
