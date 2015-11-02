(ns xyzzwhy-corpora.items)

(def items
  [
   {:text "0%"
    :article ["a Laserdisc copy of" "a VHS cassette of" "a Betamax of"]
    :sub {0 {:class :movies}}}
   {:text ["Aquanet" "spackle" "spray-on bacon"]
    :article "can of"}
   {:text "books"
    :article "some"
    :modifier {:prefix {:multiple? true
                        :option ["children's" "dusty" "old" "pornographic" "rare"]}}}
   {:text ["baseball" "softball" "tennis ball"]
    :modifier {:prefix {:option ["huge" "oddly-shaped" "radioactive" "tiny"]}}}
   {:text "briefcase"
    :modifier {:prefix {:option ["familiar" "leather" "plastic" "unfamiliar"]}}
    :follow-up {:option [{:text "It's on fire."}
                         {:text "It's covered in bees."}
                         {:text "It's full of whole milk."}
                         {:text "It's been deep-fried."}
                         {:text "It appears to be empty."}]}}
   {:text "bucket of corks"}
   {:text "discarded puppets"
    :article ["a collection of" "a pile of" "a stack of" "a stash of"]}
   {:text "fat-soluble Jesus"
    :article "bottle of"}
   {:text "floppy disk"}
   {:text ["football" "soccer ball"]
    :modifier {:prefix {:option ["deflated" "huge" "oddly-shaped" "radioactive" "tiny"]}}}
   {:text "grade report card"
    :article ["your" "your mom's" "your dad's"]
    :modifiers {:prefix {:option ["first" "second" "third" "fourth" "fifth" "sixth"]}}}
   {:text ["jean shorts" "parachute pants" "skinny jeans"]
    :article "pair of"}
   {:text "giant styrofoam peanut"}
   {:text "kitten"
    :modifier {:prefix {:option ["angry" "hungry" "meowing" "playful"
                                 "purring" "sleeping" "sleppy" "soft"]}}}
   {:text "lantern"}
   {:text "Lincoln Log"
    :modifier {:prefix {:option ["giant" "radioactive" "smelly" "wet"]}}}
   {:text "llama treats"
    :article "bag of"}
   {:text "magic scroll"
    :follow-up {:option [{:text "It's a spell of %0."
                          :sub {0 {:class :spell
                                   :config #{:no-article}}}}]}}
   {:text "movie ticket"
    :modifier {:prefix {:option "old"}}
    :follow-up {:option [{:text "It's already been torn."}
                         {:text "Unfortunately, it's for a Vince Vaugnn movie."}]}}
   {:text "non-Euclidian Lego"}
   {:text "no tea"}
   {:text "newspaper"}
   {:text "pellets"
    :article "bag of"
    :modifier {:prefix {:option ["rabbit" "slick" "stinky" "tiny"]}}}
   {:text ["pen" "pencil"]}
   {:text "phone book"}
   {:text "pinecone"}
   {:text ["Cheetos" "Doritos" "marbles" "popcorn" "potatoes" "rice"]
    :article "bag of"}
   {:text "puppy"
    :modifier {:prefix {:option ["growling" "hungry" "panting" "playful"
                                 "sleeping" "sleepy" "tumbly"]}}}
   {:text "receipt from %0 outfit rental"
    :subs {0 {:class :animal}}}
   {:text "sandwich"
    :modifier {:prefix {:option ["damp" "deep-fried" "half-eaten" "moist"]}}}
   {:text "signed photograph of %0"
    :sub {0 {:class :person
             :qualifier :famous}}}
   {:text "slide rule"}
   {:text "Snausages"}
   {:text "sword"
    :modifier {:prefix {:option ["ancient" "elven" "magical"]}}
    :follow-up {:option [{:text "It's slightly glowing."}]}}
   {:text "towel from the Las Vegas Radisson"}
   {:text "trilby"
    :modifier {:prefix {:option "sweat-incrusted"}}}
   {:text "t-shirt"
    :modifier {:prefix {:option "hipster"}}}
   {:text ["Betamax tape" "Blu-ray" "DVD" "Laserdisc" "VHS cassette"]
    :modifier {:suffix {:option ["covered in blood"]}}}
   {:text "vitamins"
    :article "some"
    :modifier {:prefix {:option ["giant" "homeopathic" "oddly-shaped"]}}}
   ])
