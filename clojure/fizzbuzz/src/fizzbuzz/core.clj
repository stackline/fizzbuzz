(ns fizzbuzz.core
  (:gen-class))

(defn -main []
  (loop [x 1]
    (when (<= x 100)
      (if (= (rem x 15) 0)
        (println "fizzbuzz")
        (if (= (rem x 3) 0)
          (println "fizz")
          (if (= (rem x 5) 0)
            (println "buzz")
            (println x))))
      (recur (+ x 1)))))