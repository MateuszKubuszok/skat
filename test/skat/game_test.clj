(ns skat.game_test
  (:require [clojure.test :refer :all]
  	        skat.cards
            [skat.game :refer :all]))

(def c1 (skat.cards.Card. :kreuz :W))
(def c2 (skat.cards.Card. :kreuz :K))
(def c3 (skat.cards.Card. :schell :W))
(def players-cards { :p1 #{c1 c2} :p2 #{c1 c3} :p3 #{c2 c3} })

(defn map-equal [m1 m2] (.equals (into (sorted-map) m1) (into (sorted-map) m2)))

(deftest update-cards-played-test
  (let [all #{c1 c2 c3}
        played-now {:p1 c3 :p2 c2 :p3 c1}]
    (testing "adds cards played at given turn"
      (is (=
        (update-cards-played players-cards played-now)
        { :p1 all :p2 all :p3 all })))))

(deftest update-cards-owned-test
  (let [played-now {:p1 c1 :p2 c3 :p3 c2}]
    (testing "removed cards played at given turn"
      (is (=
        (update-cards-owned players-cards played-now)
        { :p1 #{c2} :p2 #{c1} :p3 #{c3} })))))

; (deftest update-knowledge-test
;   (let [p1-knowledge (skat.game.PlayerKnowledge "p1" )]
;     (testing "updates played and owned cards"
;       )))
