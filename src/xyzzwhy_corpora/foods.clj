(ns xyzzwhy-corpora.foods)

(def foods
  [
   {:text "apple pocket"}
   {:text "block of cheese"}
   {:text "bobka"
    :modifier {:prefix {:optional? false
                        :option ["cinnamon" "chocolate" "Satanic"]}}}
   {:text "bouquet of corndogs"}
   {:text "burger"
    :modifier {:prefix {:option ["half-eaten" "tongue" "tooth"]}}}
   {:text "burrito"}
   {:text "cake"
    :article ["a" "a slice of"]
    :modifier {:prefix {:option ["birthday"]}}}
   {:text ["Cheerios" "Rice Chex"]
    :article "a bowl of"}
   {:text "cheeseburger"
    :modifier {:prefix {:option ["half-eaten" "bacon double"]}}}
   {:text ["chips" "Doritos" "Fritos" "Funyons" "nacho chips"]
    :article "some"}
   {:text "delicious churro"}
   {:text "Cinnabon"}
   {:text "cornbread"
    :article "some"
    :modifier {:prefix {:option "weaponized"}}}
   {:text "corndog"}
   {:text "duck confit"
    :article "some"}
   {:text "kumquat"}
   {:text "pancakes"
    :article "some"}
   {:text "pasta"
    :article "some"}
   {:text "Pop Tart"
    :modifier {:prefix {:option ["angst" "apple cinnamon" "blueberry" "Dutch apple"
                                 "frosted feces" "nihilist" "snozzberry" "strawberry"]}}}
   {:text "Reese's Peanut Butter Cup"
    :article "a"}
   {:text "uncooked rice"
    :article "some"}
   {:text "salad"
    :modifier {:prefix {:option "big"}}}
   {:text "sandwich"
    :modifier {:prefix {:option ["ham" "persecution"]}}}
   {:text "slice of fried spam"}
   {:text "sushi"
    :article "some"}
   {:text "sweetroll"}
   {:text "wedge of cheese with some mold on it"}
   ])
