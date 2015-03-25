(ns skat.i18n_test
  (:require [clojure.test :refer :all]
            [skat.i18n :refer :all]))

(deftest t-test
  (testing "testing default translations"
    (is (= (t :en :skat/cli/answer/yes) "yes"))
    (is (= (t :en :skat/cli/answer/no)  "no"))
    (is (= (t :en :skat/cli/cards/allowed "test") "Allowed cards:\ntest"))
    (is (= (t :en :skat/cli/cards/owned "test")   "Owned cards:\ntest"))
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
    (is (= (t :en :skat/cli/player/choose-suit)      "Choose suit:"))
    (is (= (t :en :skat/cli/player/choose-hand)      "Choose hand:"))
    (is (= (t :en :skat/cli/player/choose-schneider) "Choose schneider:"))
    (is (= (t :en :skat/cli/player/choose-schwarz)   "Choose schwarz:"))
    (is (= (t :en :skat/cli/player/choose-ouvert)    "Choose ouvert:"))
    (is (= (t :en :skat/cli/player/swap-skat-card "test")
           "Choose card to swap for test:"))
    (is (= (t :en :skat/cli/player/played "x" "y") "x played: y"))
    (is (= (t :en :skat/cli/player/won-bid "x" 18) "x won bid: 18"))
    (is (= (t :en :skat/cli/player/bid-draw)       "No one won bid"))
    (is (= (t :en :skat/cli/select/nth-item) "Select which one you want:"))
    (is (= (t :en :skat/cli/select/player-name) "Select player's name:"))
    (is (= (t :en :skat/cli/suit/grand)  "Grand"))
    (is (= (t :en :skat/cli/suit/kreuz)  "Kreuz"))
    (is (= (t :en :skat/cli/suit/grun)   "Grün"))
    (is (= (t :en :skat/cli/suit/herz)   "Herz"))
    (is (= (t :en :skat/cli/suit/schell) "Schell"))
    (is (= (t :en :skat/cli/suit/null)   "Null"))))
