(ns genetic-clojure.test.core
  (:use [genetic-clojure.core] :reload)
  (:use [clojure.test]))

(deftest fitness-test
  (is (= 0 (fitness "Hello World!")))
  (is (= 1 (fitness "Iello World!")))
  (is (= 5 (fitness "Iallo World!"))))
