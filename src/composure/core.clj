(ns composure.core
  (require [composure.config :refer [env]]
           [composure.handler :refer [app]]
           [mount.core :as mount]
           [ring.adapter.jetty :as jetty]))


(defn -main [& args]
 (mount/start)
 (jetty/run-jetty app {:port 3000}))