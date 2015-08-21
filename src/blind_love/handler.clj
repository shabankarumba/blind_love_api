(ns blind-love.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [blind-love.handlers.products :refer [product-routes]]))

(defroutes app-routes
  product-routes)

(def app
  (wrap-defaults app-routes site-defaults))
