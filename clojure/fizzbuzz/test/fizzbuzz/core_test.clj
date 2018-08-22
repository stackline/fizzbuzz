(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest fizzbuzz-normal-test
  (testing "fizzbuzz return"
    (testing "'fizz' if it is diviible by a multiple of 3."
      (is (= (fizzbuzz 3) "fizz")))
    (testing "'buzz' if it is diviible by a multiple of 5."
      (is (= (fizzbuzz 5) "buzz")))
    (testing "'fizzbuzz' if it is diviible by a multiple of 3 and a multiple of 5."
      (is (= (fizzbuzz 15) "fizzbuzz")))))

(deftest fizzbuzz-abnormal-test
  (testing "fizzbuzz throw class cast exception"
    (is (thrown? java.lang.ClassCastException (= (fizzbuzz "aaa"))))))