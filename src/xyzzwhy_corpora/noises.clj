(ns xyzzwhy-corpora.noises)

(def noises
  {:noises
   [{:text ["foghorn"]
     :options [{:modifiers {:config [:either]
                            :prefix ["distant"]}
                :articles ["a"]}]}

    {:text ["explosion"]
     :options [{:modifiers {:config [:either]
                            :prefix ["distant"]}
                :articles ["a"]}]}

    {:text ["laughter"]
     :options [{:modifiers {:config [:either]
                            :prefix ["loud" "obnoxious" "high-pitched"
                                     "sinister" "insane" "unnerving"
                                     "child-like" "distant"]}
                :articles ["some"]}
               {:alternates ["laugh" "chuckle" "cackle"
                             :modifiers {:config [:either]
                                         :prefix ["a loud" "an obnoxious" "a sinister"
                                                  "an insane" "unnerving"
                                                  "child-like" "distant"]}]}]}

    {:text ["laughing" "chuckling" "cackling"
            "laugh" "chuckle" "cackle"]
     :options [{:modifiers {:config [:either]
                            :suffix ["loudly" "quietly" "obnoxiously"
                                     "insanely"]}
                :articles ["someone" "somebody"]}]}

    {:text ["choking"]
     {:modifiers {:config [:both]
                  :prefix ["loudly" "quietly"]
                  :suffix ["to death"]}
      :articles ["someone" "somebody"]}}

    {:text ["crying"]
     :options [{:modifiers {:config [:either]
                            :suffix ["loudly" "quietly" "obnoxiously"]}
                :articles ["someone" "somebody"]}
               {:alternates ["weeping" "sobbing"]
                :modifiers {:config [:either]
                            :suffix ["loudly" "quietly"]}
                :articles ["someone" "somebody"]}]}

    {:text ["sneeze" "cough" "burp" "fart"]
     :options [{:modifiers {:config [:either]
                            :prefix ["loud" "wet" "quiet" "dainty" "manly"]}
                :articles ["a"]}
               {:modifiers {:config [:either]
                            :suffix ["loudly" "quietly" "daintly"]}
                :articles ["someone" "somebody"]}]}

    {:text ["sneezing" "coughing" "burping" "farting"]
     :options [{:modifiers {:config [:either]
                            :prefix ["loudly" "quietly" "repeatedly"]}
                :articles ["someone" "somebody"]
                :follow-ups
                {:text ["while crying" "while running" "while eating"]}}]}

    {:text ["wolves howling"]
     :options [{:modifiers {:config [:either]
                            :suffix ["in the distance" "under water"]}}]}

    {:text ["ice cream truck" "ambulance"]
     :options [{:articles ["an"]}]}

    {:text ["fire truck"]
     :options [{:articles ["a"]}]}

    {:text ["phone ringing"]
     :options [{:articles ["a" "the"]}]}

    {:text ["bell tower"]
     :options [{:articles ["a"]}]}

    {:text ["door slam"]
     :options [{:articles ["a"]}]}]})
