(ns composure.core
  (require [clojure.tools.logging :as log]
           [composure.config :refer [env]]
           [composure.handler :refer [app]]
           [mount.core :as mount]
           [ring.adapter.jetty :as jetty])
  (:gen-class))

(defn init-app []
  (mount/start))

(defn -main [& args]
  (init-app)
  (log/info (str "Application will be started on port " (:port env)))
  (jetty/run-jetty app {:port (:port env)}))
