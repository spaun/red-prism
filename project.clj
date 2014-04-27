(defproject red-prism "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
	[org.clojure/clojure "1.6.0"]
	[ring "1.2.2"]]
  :main ^:skip-aot red-prism.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :ring {:handler red-prism.core/handler})

