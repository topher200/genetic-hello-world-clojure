(ns genetic-clojure.core
  (:use [clojure.contrib.math]))

(def alphabet
     "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!? ")

(def target
     "Hello Clojure World!")

(defn difference-between-chars
  "Returns the distance between the int representations of two chars"
  [a b]
  (abs (- (int a) (int b))))

(defn fitness
  "Determines the fitness of a given chromo based on how far each of its
  characters are from the target string"
  [chromo]
  (reduce + (map difference-between-chars chromo target)))


(defn breed
  "Breeds two chromos together by splitting them in a random place and
  switching the halves"
  [s1 s2 position]
  '("not", "implemented"))

(defn random-char
  "Returns a random char in our alphabet"
  []
  (rand-nth alphabet))

(defn create-random-chromo
  "Creates a string of the given length composed of random letters"
  [length]
  (take length (repeatedly random-char)))


