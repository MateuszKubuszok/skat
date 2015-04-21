(ns skat.i18n_test
  (:require [clojure.test :refer :all]
            [skat.i18n :refer :all]))

(deftest t-test
  (testing "testing default translations"
    (is (= (t :en :skat/cli/answer/yes) "yes"))
    (is (= (t :en :skat/cli/answer/no)  "no"))
    (is (= (t :en :skat/cli/cards/allowed "test") "Allowed cards:\ntest"))
    (is (= (t :en :skat/cli/cards/owned "test")   "Owned cards:\ntest"))
    (is (= (t :en :skat/cli/cards/solist "test")  "Solists's cards:\ntest"))
    (is (= (t :en :skat/cli/figure/r7)  " 7"))
    (is (= (t :en :skat/cli/figure/r8)  " 8"))
    (is (= (t :en :skat/cli/figure/r9)  " 9"))
    (is (= (t :en :skat/cli/figure/r10) "10"))
    (is (= (t :en :skat/cli/figure/W)   " W"))
    (is (= (t :en :skat/cli/figure/D)   " D"))
    (is (= (t :en :skat/cli/figure/K)   " K"))
    (is (= (t :en :skat/cli/figure/A)   " A"))
    (is (= (t :en :skat/cli/player/make-bid 17)
           "Place bid (more than 17) or pass (17):"))
    (is (= (t :en :skat/cli/player/answer-bid 17)
           "You have been bid: 17\nDo you accept?"))
    (is (= (t :en :skat/cli/player/cpu-type)         "CPU player"))
    (is (= (t :en :skat/cli/player/human-type)       "Human player"))
    (is (= (t :en :skat/cli/player/name "test")      "[Player test]"))
    (is (= (t :en :skat/cli/player/choose-suit)      "Choose suit:"))
    (is (= (t :en :skat/cli/player/choose-hand)      "Choose hand:"))
    (is (= (t :en :skat/cli/player/choose-schneider) "Announce schneider:"))
    (is (= (t :en :skat/cli/player/choose-schwarz)   "Announce schwarz:"))
    (is (= (t :en :skat/cli/player/choose-ouvert)    "Choose ouvert:"))
    (is (= (t :en :skat/cli/player/swap-skat-card "test")
           "Choose card to swap for test:"))
    (is (= (t :en :skat/cli/player/played "x" "y") "x played: y"))
    (is (= (t :en :skat/cli/player/won-bid "x" 18) "x won bid: 18"))
    (is (= (t :en :skat/cli/player/bid-draw)       "No one won bid"))
    (is (= (t :en :skat/cli/player/declared
                  "Pl" "Kreuz" "yes" "yes" "yes" "yes" 18)
           (long-str "Solist: Pl\nSuit:   Kreuz\nHand:   yes\nOuvert: yes"
                     "Announced schneider: yes\nAnnounced schwarz:   yes"
                     "Placed bid: 18")))
    (is (= (t :en :skat/cli/results/trick "p1" "c1" "p2" "c2" "p3" "c3" "p1")
           "p1 played c1\np2 played c2\np3 played c3\np1 won trick"))
    (is (= (t :en :skat/cli/results/deal "test" 18 20 "yes")
           "Solist: test\nBid:    18\nPoints: 20\nWon:    yes"))
    (is (= (t :en :skat/cli/results/game "test" 18) "Player: test\nPoints: 18"))
    (is (= (t :en :skat/cli/select/nth-item) "Select which one you want:"))
    (is (= (t :en :skat/cli/select/player-name) "Select player's name:"))
    (is (= (t :en :skat/cli/suit/grand)  "Grand"))
    (is (= (t :en :skat/cli/suit/kreuz)  "Kreuz"))
    (is (= (t :en :skat/cli/suit/grun)   "Grün"))
    (is (= (t :en :skat/cli/suit/herz)   "Herz"))
    (is (= (t :en :skat/cli/suit/schell) "Schell"))
    (is (= (t :en :skat/cli/suit/null)   "Null"))))
