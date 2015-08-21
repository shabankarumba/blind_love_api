(ns blind-love.handlers.products
  (:require  [compojure.core :refer :all]
             [clojure.data.json :as json]
             [blind-love.db :as db]))

(defn not-found
  [items]
  (if (empty? items)
    (str "Not found")
    (json/write-str items)))

(defn product
  [id]
  (first (db/products-by-id db/db-spec (Integer. id))))

(defroutes product-routes
  (GET "/products/:id" [id]
       (not-found (product id))))
