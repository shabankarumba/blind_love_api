(defproject blind_love "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :main-lein-version "2.5.1"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"] 
                 [compojure "1.4.0"]
                 [org.clojure/data.json "0.2.6"]
                 [ring/ring-defaults "0.1.2"]
                 [org.postgresql/postgresql "9.4-1201-jdbc41"]
                 [yesql "0.4.2"]
                 [ring/ring-mock "0.2.0"]]
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler blind-love.handler/app}
 )
