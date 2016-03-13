(defproject composure "0.1.0-SNAPSHOT"
  :description "composure"
  :url "http://github.com/victorneo/composure"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [cheshire "5.5.0"]
                 [compojure "1.5.0"]
                 [cprop "0.1.6"]
                 [log4j/log4j "1.2.17" :exclusions [javax.mail/mail
                                                    javax.jms/jms
                                                    com.sun.jmdk/jmxtools
                                                    com.sun.jmx/jmxri]]
                 [metosin/compojure-api "1.0.1"]
                 [mount "0.1.10"]
                 [org.slf4j/slf4j-log4j12 "1.7.18"]
                 [ring/ring-defaults "0.2.0"]
                 [ring/ring-jetty-adapter "1.2.1"]]
  :ring {:init composure.core/init-app
         :handler composure.handler/app}
  :main composure.core
  :resource-paths ["env/dev/resources"]
  :plugins [[lein-ring "0.9.7"]
            [lein-cprop "1.0.1"]]
  ;:ring {:handler composure.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}
   :uberjar {:resource-paths ["env/prod/resources"]}
   :test {:resource-paths ["env/dev/resources" "env/test/resources"]}
   :repl {:resource-paths ["env/dev/resources" "env/test/resources"]}})