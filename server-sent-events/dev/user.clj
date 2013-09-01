(defn dev
  []
  (require 'dev)
  (in-ns 'dev)
  #_(dev/start))

(dev)
(stop)

(defprotocol Component
  (head [this])
  (body [this])
  (input [this])
  (output [this]))



(reify
  )
