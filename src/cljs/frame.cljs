(ns hello-quil.frame
  (:require [quil.core :as q :include-macros true]))

(defn right-bounds []
  (/ (q/width) 2))

(defn left-bounds []
  (- (right-bounds)))

(defn top-bounds []
  (/ (q/width) 2))

(defn bottom-bounds []
  (- (top-bounds)))

#_(defn max-width
    [shape];filter to keep horiz then dp max
    )

#_(defn outside-frame?
  [shape]
  (let [width (max-width shape)
        height (max-height shape)
        x (get-in shape [:top-left :x-pos])
        y (get-in shape [:top-left :y-pos])]
    (or (> (+ x width) (right-bounds))
        (< (- x width) (left-bounds))
        (> (+ x height) (bottom-bounds))
        (< (- x height) (top-bounds)))))
