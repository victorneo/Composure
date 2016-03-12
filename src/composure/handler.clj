(ns composure.handler
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]))

(defapi app
  (GET "/" []
    (ok {:message "Hello"}))
  (GET "/hello" []
    :query-params [name :- String]
    (ok {:message (str "Hello, " name)})))
