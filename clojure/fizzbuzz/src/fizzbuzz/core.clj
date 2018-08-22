(ns fizzbuzz.core
  (:gen-class))

; (function or macro args...)
(defn fizzbuzz [x]
  (if (= (rem x 15) 0)
    "fizzbuzz"
    (if (= (rem x 3) 0)
      "fizz"
      (if (= (rem x 5) 0)
        "buzz"
        x))))

(defn -main []
  (loop [x 1]
    (when (<= x 100)
      (println (fizzbuzz x))
      (recur (+ x 1)))))