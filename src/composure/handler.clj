(ns composure.handler
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [composure.config :refer [env]]))

(defapi app
  (GET "/" []
    (ok {:message (str "Hello, " (:default-name env))}))
  (GET "/hello" []
    :query-params [name :- String]
    (ok {:message (str "Hello, " name)})))
