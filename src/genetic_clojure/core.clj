(ns genetic-clojure.core
  (:use [clojure.contrib.math]))

(def alphabet
     '("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
     "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B",
     "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
     "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "!", "?"))

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
  (reduce + (map (fn [a b] (- (int a) (int b))) chromo target)))


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


