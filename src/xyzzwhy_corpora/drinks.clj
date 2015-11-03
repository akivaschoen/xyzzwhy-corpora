(ns xyzzwhy-corpora.drinks)

(def drinks
  [
   {:text "gravy"
    :article "a cup of"
    :modifier {:prefix {:optional? false
                        :option ["cold" "boiling" "lukewarm"
                                 "mushroom" "steaming" "turkey"]}}}
   {:text "juice"
    :article "a glass of"
    :modifier {:prefix {:optional? false
                        :optional ["apple" "cranberry" "grape" "grapefruit"
                                   "fruit" "orange"]}}}
   {:text "milk"
     :article "a gallon of"
    :modifier {:prefix {:option ["1%" "2%" "almond" "boiling"
                                 "breast" "rancid" "raw" "skim"
                                 "soy" "spoiled" "whole"]}}}
    {:text "tea"
     :article "some"}
    {:text "soda"
     :article "some"}
    {:text "water"
     :article "some"}
    {:text "broth"
     :article "some"
     :modifier {:prefix {:option ["beef" "chicken" "pork" "seafood" "vegetable"]}}}
    {:text "scotch"
     :article "a"}
    ])
