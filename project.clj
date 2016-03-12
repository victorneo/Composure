(defproject composure "0.1.0-SNAPSHOT"
  :description "composure"
  :url "http://github.com/victorneo/composure"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.0"]
                 [ring/ring-defaults "0.2.0"]
                 [cheshire "5.5.0"]
                 [metosin/compojure-api "1.0.1"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler timings.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})