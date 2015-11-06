(ns xyzzwhy-corpora.action-events)

(def action-events
  [
   {:text "%0 %1 %2."
    :sub {0 {:class :actor}
          1 {:class :action}
          2 {:class :actor}}}
   {:text "%0 %1 you."
    :sub {0 {:class :actor}
          1 {:class :action}}}
   {:text "%0 appears in a puff of smoke, %1"
    :sub {0 {:class :person}
          1 {:class :actor-action}}}
   {:text "%0 arrives from the %1, carrying %2."
    :sub {0 {:class :actor :config #{:no-groups}}
          1 {:class :direction}
          2 {:class :item}}}
   {:text "%0 attacks you and knocks you out. You awake sometime later %1."
    :sub {0 {:class :actor}
          1 {:class :location}}}
   {:text "%0 attacks you but you fight back with %1,"
    :sub {0 {:class :actor}
          1 {:class :attack}}
    :follow-up {:optional? false
                :option [{:text "winning the battle."}
                         {:text "taking only a hit to your pride."}]}}
   {:text "%0 attacks you but you fight back with %1."
    :sub {0 {:class :actor}
          1 {:class :attack}}
    :follow-up {:optional? false
                :option [{:text "It isn't enough: you lose."}
                         {:text "This scares the shit out of %2. %3 runs away."
                          :sub {2 {:ref 0
                                   :class :gender
                                   :case :objective}
                                3 {:ref 0
                                   :class :gender
                                   :case :subjective}}}]}}
   {:text "%0 attacks with %1. You execute %2."
    :sub {0 {:class :actor}
          1 {:class :attack}
          2 {:class :attack}}
    :follow-up {:optional? false
                :option [{:text "You are victorious!"}
                         {:text "You have been killed."}
                         {:text "You have been slain!"}
                         {:text "%0 keels over all dead and stuff."
                          :sub {0 {:class :gender
                                   :case :subjective}}}]}}
   {:text "%0 attacks with %1. You respond with %2. You are defeated."
    :sub {0 {:class :actor}
          1 {:class :attack}
          2 {:class :attack}}}
   {:text "%0 attacks with %1. You strike back with %2. FATALITY. But who?!"
    :sub {0 {:class :actor}
          1 {:class :attack}
          2 {:class :attack}}}
   {:text "%0 attacks with %1. You with %2."
    :sub {0 {:class :actor}
          1 {:class :attack}
          2 {:class :attack}}
    :follow-up {:optional? false
                :option [{:text "Look at you what with the killing and all."}
                         {:text "%0 is a bloodstain."
                          :sub {0 {:class :gender
                                   :case :subjective}}}]}}
   {:text "%0 does a little jig. 'Bidibidibidi, wanna dance?'"
    :sub {0 {:class :actor}}}
   {:text "%0 drops %1 here."
    :sub {0 {:class :actor}
          1 {:class :item}}}
   {:text "%0 drops %1, looks at you %2, then leaves."
    :sub {0 {:class :actor}
          1 {:class :item}
          2 {:class :adverb}}}
   {:text "%0 gently places %1 on the ground and then backs away slowly."
    :sub {0 {:class :actor}
          1 {:class :item}}}
   {:text "%0 is calling from %1"
    :sub {0 {:class :person}
          1 {:class :location :config #{:no-prep}}}
    :follow-up {:optional? false
                :option [{:text "asking if %2 can come out and play."
                          :sub {2 {:class :person}}}
                         {:text "asking for %2."
                          :sub {2 {:class :item}}}]}}
   {:text "%0 makes a rude noise and points surreptitiously to %1 nearby."
    :sub {0 {:class :person}
          1 {:class :animal}}}
   {:text "%0 marches up to you and says, 'Hello please.'"
    :sub {0 {:class :person}}}
   {:text "%0 picks up %1."
    :sub {0 {:class :actor}
          1 {:class :item}}}
   {:text "%0 slams down a half-empty glass of %1."
    :sub {0 {:class :person}
          1 {:class :drink :config #{:no-prep :no-article}}}
    :follow-up {:optional? false
                :option [{:text "'All this nonsense about %0 needs to stop! I can't take it anymore!'"
                          :sub {0 {:class :item}}}
                         {:text "'They're making plans for Nigel! They want what's best for him!'"}
                         {:text "'You can't go up against city hall!'"}
                         {:text "'I just can't take you seriously anymore!'"}
                         {:text "'MOM?!'"}]}}
   {:text "%0 starts breakdancing and won't stop no matter how much you scream."
    :sub {0 {:class :person}}}
   {:text "%0 suddenly appears out of the shadows and"
    :sub {0 {:class :actor}}
    :follow-up {:optional? false
                :option [{:text "hisses at you, then scrambles away like a spider."}
                         {:text "says, 'Oh, sorry about that,' then retreats back into the shadows."}
                         {:text "says, '%0 will see you now,' then slowly retreats back into the shadows."
                          :sub {0 {:class :actor}}}]}}
   {:text "%0 suddenly shrieks."
    :sub {0 {:class :person}}}
   {:text "An overhead loudspeaker crackles to life,"
    :follow-up {:optional? false
                :option [{:text "'Citizen! Report immediately to the nearest oddly-angled inner tube.'"}
                         {:text "'Citizen! Report immediately to the nearest self-incrimination booth.'"}
                         {:text "'Citizen! Report immediately to the nearest Java stacktrace.'"}
                         {:text "'Citizen! Report immediately to the bean simulator.'"}
                         {:text "'Citizen! Report immediately to the nearest certified manhole.'"}
                         {:text "'Citizen! Report immediately to the National Baby Oil Slip-n-Slide.'"}
                         {:text "'Citizen! Report immediately to the Hall of Uncomfortable Touching.'"}
                         {:text "'Citizen! Report immediately to the Bakery of Unravelled Cinnamon Buns.'"}
                         {:text "'Citizen! Stop that.'"}
                         {:text "'Citizen! Report immediately to the Readers' Digest Condensation Camp.'"}
                         {:text "'Citizen! Open up your textbook and turn to the chapter concerning your death.'"}
                         {:text "'Citizen! Report immediately to the Out-of-Control Rototiller Museum.'"}
                         {:text "'Citizen! Report immediately to the nearest mandatory prison hug.'"}
                         {:text "'Citizen! Report immediately to the nearest sanctioned dogpile.'"}
                         {:text "'Citizen! Report immediately to the nearest full-contact Bible study group.'"}
                         {:text "'Citizen! Report immediately to the mannequin factory.'"}
                         {:text "'Citizen! Report immediately to The Garbagerie.'"}
                         {:text "'Citizen! Report immediately to Stall #3.'"}
                         {:text "'Citizen! Just shut up already.'"}]}}
   {:text "An overhead loudspeaker crackles to life. The announcement is completely garbled. The loudspeaker switches off with a squawk."}
   {:text "In the distance,"
    :follow-up {:optional? false
                :option [{:text "you hear %0 let the bass drop."
                          :sub {0 {:class :person}}}
                         {:text "you hear %0 drop the mic."
                          :sub {0 {:class :person}}}
                         {:text "you hear %0 get wicked."
                          :sub {0 {:class :person}}}
                         {:text "you hear %0 shake it off."
                          :sub {0 {:class :person}}}]}}
   {:text "You start spinning around and around."
    :follow-up {:optional? false
                :option [{:text "%0 looks unimpressed."
                          :sub {0 {:class :person}}}
                         {:text "%0 faints."
                          :sub {0 {:class :person}}}
                         {:text "You drill straight into the crust of the earth."}
                         {:text "You gracefully lift off into a blue sky."}
                         {:text "You gracefully lift off into a blue sky never to be seen again."}
                         {:text "You gracefully lift off, go sideways, and crash into a building."}]}}
   {:text "The phone rings."
    :follow-up {:optional? false
                :option [{:text "%0 stares at it %1. Eventually the ringing stops."
                          :sub {0 {:class :person}
                                1 {:class :adverb}}}
                         {:text "%0 watches as it starts to melt, the sound of the ring slowing and burbling to a stop."
                          :sub {0 {:class :person}}}
                         {:text "%0 picks it up, listens a moment, shrieks, and slams the phone down again."
                          :sub {0 {:class :person}}}
                         {:text "%0 picks it up, says, 'It's for you,' but you're longer there."
                          :sub {0 {:class :person}}}]}}
   {:text "The radio crackles to life."
    :follow-up {:optional? false
                :option [{:text "It sounds like someone with a cold is eating Rice Krispies." }
                         {:text "A hollow voice intones, '%0'"
                          :sub {0 {:class :intonation}}}
                         {:text "Ketchup begins seeping through the speaker holes."}
                         {:text "It continues to crackle to life. It's still crackling. It's on fire."}
                         {:text "An announcer shouts, 'They found rice on Mars!'"}
                         {:text "A news report is on about %0 %1."
                          :sub {0 {:class :disaster}
                                1 {:class :location :config #{:no-prep}}}}
                         {:text "%0 solemnly '%1'"}]}}
   {:text "You awake from a nightmare. You saw yourself %0. The corpse of %1 was there, holding %2."
    :sub {0 {:class :location}
          1 {:class :person :config #{:no-groups}}
          2 {:class :item}}}
   {:text "You check your health: you are %0."
    :sub {0 {:class :diagnose}}}
   {:text "You check your inventory."
    :follow-up {:optional? true
                :option [{:text "You are empty-handed."}
                         {:text "You are carrying %0, %1, and %2."
                          :sub {0 {:class :item}
                                1 {:class :item}
                                2 {:class :item}}}
                         {:text "You have %0 and %1."
                          :sub {0 {:class :item}
                                1 {:class :item}}}]}}
   {:text "You check your messages."
    :follow-up {:optional? false
                :option [{:text "%0 %1"
                          :sub {0 {:class :person :config #{:no-groups}}
                                1 {:class :dialogue}}}]}}
   {:text "You eat %0."
    :sub {0 {:class :food}}
    :follow-up {:optional? true
                :option [{:text "%0 looks on %1."
                          :sub {0 {:class :actor}
                                1 {:class :adverb}}}]}}
   {:text "You get tired of waiting for";
    :follow-up {:optional? false
                :option [{:text "your Uber and decide to walk to %0 instead."
                          :sub {0 {:class :location :config #{:no-prep}}}}
                         {:text "your private jet so you decide to walk to %0 instead."
                          :sub {0 {:class :location :config #{:no-prep}}}}
                         {:text "the all-you-can-eat-buffet to open so you walk to %0 instead."
                          :sub {0 {:class :location :config #{:no-prep}}}}]}}
   {:text "You feel a little famished so you eat %0."
    :sub {0 {:class :food}}}
   {:text "You find yourself being slowly teleported away. Very slowly. People are beginning to stare."}
   {:text "You open up %0."
    :sub {0 {:class :book}}
    :follow-up {:optional? false
                :option [{:text "Someone has scribbled all over the margins. You throw it down on the floor in disgust."}
                         {:text "Someone has left a recipe for beef stew inside."}
                         {:text "You read a bit before tossing it over your shoulder and then doing the electric slide."}]}}
   {:text "You pause and think, '%0'"
    :sub {0 {:class :thought}}}
   {:text "You peek out the window."
    :follow-up {:optional? true
                :option [{:text "%0 is messing around with your mailbox. You crouch in fear."
                          :sub {0 {:class :person}}}
                         {:text "%0 is laying facedown in your flowerbed. You sink to your knees with worry."
                          :sub {0 {:class :person}}}
                         {:text "%0 has set up a lemonade stand in your yard. It's on fire."
                          :sub {0 {:class :person}}}
                         {:text "%0 has set up a lemonade stand in your yard. It's covered in bees."
                          :sub {0 {:class :person}}}
                         {:text "%0 has set up a lemonade stand in your yard. The line stretches around the block."
                          :sub {0 {:class :person}}}
                         {:text "%0 has set up a lemonade stand across the street. You feel oddly jealous."
                          :sub {0 {:class :person}}}
                         {:text "%0 is struggling to start a chainsaw while staring at you. You bite your knuckle."
                          :sub {0 {:class :person}}}
                         {:text "%0 is standing in your yard, painting a portrait of you peeking out the window."
                          :sub {0 {:class :person}}}
                         {:text "Your entire house has been encased in a giant stone column."}]}}
   {:text "You pick up %0."
    :sub {0 {:class :item}}}
   {:text "You pick up %0 and hold it close to your chest."
    :sub {0 {:class :item}}
    :follow-up {:optional? false
                :option [{:text "hold it close to your chest."}
                         {:text "hold it up to %1's face."
                          :sub {0 {:class :person}}}]}}
   {:text "You read morning paper."
    :follow-up {:optional? false
                :option {:text "%0"
                         :sub {0 {:class :news}}}}}
   {:text "You start eating %0 and don't stop until you're done."
    :sub {0 {:class :food}}}
   {:text "You start spinning around and around while"
    :follow-up {:optional? false
                :option [{:text "%0 claps and cheers."
                          :sub {0 {:class :person}}}
                         {:text "%0 cries and points."
                          :sub {0 {:class :person}}}
                         {:text "%0 writes furiously on a clipboard."
                          :sub {0 {:class :person}}}
                         {:text "%0 beams with pride."
                          :sub {0 {:class :person}}}]}}
   {:text "You startle %0 who drops %1 and runs away."
    :sub {0 {:class :person}
          1 {:class :item}}}
   {:text "You take a sip of %0."
    :sub {0 {:class :drink :config #{:no-article}}}}
   {:text "You think to yourself, '%0'"
     :sub {0 {:class :thought}}}
   ])
