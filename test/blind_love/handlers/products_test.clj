(ns blind-love.handlers.products-test
  (:require [clojure.test :refer :all]
            [blind-love.handler :refer :all]
            [blind-love.handlers.products :refer :all]
            [ring.mock.request :as mock]))

(deftest products-id
  (let [response (app (mock/request :get "/products/1"))]
  (str response)   
  (is (= (:status response) 200))
  (is (= (:body response) {}))))
