(defproject pedestal.samples
  "1.0.0"
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :plugins [[lein-ancient "0.4.4"]
            [lein-sub "0.2.4"]]
  :sub ["auto-reload-server"
        "chat/chat-client"
        "chat/chat-server"
        "cors"
        "helloworld-app"
        "ring-middleware"
        "server-sent-events"
        "server-with-links"
        "square-root"
        "template-server"]
  )
