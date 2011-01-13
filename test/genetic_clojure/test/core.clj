(ns genetic-clojure.test.core
  (:use [genetic-clojure.core] :reload)
  (:use [clojure.test]))

(deftest target-test
  ;; our tests depend on a certain hardcoded target string
  (is (= "Hello Clojure World!" target)))

(deftest fitness-test
  (is (= 0 (fitness "Hello Clojure World!")))
  (is (= 1 (fitness "Iello Clojure World!")))
  (is (= 5 (fitness "Iallo Clojure World!"))))

(deftest breed-test
  (is (= '("aa", "bb") (breed "aa" "bb" 0)))
  (is (= '("ab", "ab") (breed "aa" "bb" 1)))
  (is (= '("abb", "baa") (breed "aaa" "bbb" 1))))

(deftest difference-between-chars-test
  (is (= 0 (difference-between-chars \a \a)))
  (is (= 1 (difference-between-chars \a \b)))
  (is (= 1 (difference-between-chars \b \a)))
  (is (= 1 (difference-between-chars \A \B)))
  (is (= 32 (difference-between-chars \a \A))))
