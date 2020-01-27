(ns shuffle.core
  (:require [reagent.core :as reagent]
            [re-frame.core :as re-frame]
            [shuffle.events :as events]
            [shuffle.views :as views]
            [shuffle.config :as config]))


(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [views/whole-page]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
