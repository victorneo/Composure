(ns composure.handler-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [composure.handler :refer :all]
            [mount.core :as mount]
            [cheshire.core :as ch]))

(defn parse-response [body]
  (ch/parse-string (slurp body) true))

(deftest test-hello
  (mount/start)
  (testing "root route"
    (let [response (app (mock/request :get "/"))
          body     (parse-response (:body response))]
      (is (= 200 (:status response)))
      (is (= "Hello, Default" (:message body)))))
  (testing "hello route"
    (let [response (app (mock/request :get "/hello" {:name "test"}))
          body (parse-response (:body response))]
      (is (= 200 (:status response)))
      (is (= "Hello, test" (:message body))))))
