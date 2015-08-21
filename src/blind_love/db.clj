(ns blind-love.db
  (:require  [clojure.java.jdbc :as jdbc]
             [yesql.core :refer [defquery]]))

(def db-spec
  {:classname "org.postgresql.Driver"
   :database-name "blind_love_development"
   :subprotocol "postgresql"
   :subname "//localhost:5432/blind_love_development"
   :user "postgres"
   :password ""})

(defquery products-by-id "sql/products.sql") 
