(ns genetic-clojure.test.core
  (:use [genetic-clojure.core] :reload)
  (:use [clojure.test]))

(deftest fitness-test
  (is (= 0 (fitness "Hello World!")))
  (is (= 1 (fitness "Iello World!")))
  (is (= 5 (fitness "Iallo World!"))))

(deftest breed-test
  (is (= '("aa", "bb") (breed "aa" "bb" 0)))
  (is (= '("ab", "ab") (breed "aa" "bb" 1)))
  (is (= '("abb", "baa") (breed "aaa" "bbb" 1))))
