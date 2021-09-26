(ns shuffle.handler
  (:require [compojure.core :refer [GET defroutes]]
            [compojure.route :refer [resources]]
            [ring.util.response :refer [resource-response]]
            [ring.middleware.reload :refer [wrap-reload]]))

(defroutes routes
  (GET "/" [] (resource-response "index.html" {:root "public"}))
  (GET "/welcome" [] (resource-response "index.html" {:root "public"}))
  (GET "/info" [] (resource-response "index.html" {:root "public"}))
  (GET "/course" [] (resource-response "index.html" {:root "public"}))
  (GET "/results" [] (resource-response "index.html" {:root "public"}))
  (GET "/volunteer" [] (resource-response "index.html" {:root "public"}))
  (resources "/"))

(def dev-handler (-> #'routes wrap-reload))

(def handler routes)
