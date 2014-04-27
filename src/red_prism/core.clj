(ns red-prism.core
  (:use ring.adapter.jetty))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "<p>Big Brother is watching you</p>"})

(defn -main [port]
  (run-jetty handler {:port (Integer. port) :join? false}))

