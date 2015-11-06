(ns xyzzwhy-corpora.secondary-events)

(def secondary-events
  [
   {:text "%0 %1"
    :sub {0 {:class :person}
          1 {:class :dialogue}}}
   {:text "%0 follows you."
    :sub {0 {:class :actor}}}
   {:text "%0 is here."
    :sub {0 {:class :actor}}}
   {:text "%0 is here %1"
    :sub {0 {:class :actor}
          1 {:class :actor-action}}}
   {:text "%0 is here with %1. They look %2."
    :sub {0 {:class :actor}
          1 {:class :actor}
          2 {:class :adjective}}}
   {:text "%0 is here searching for %1."
    :sub {0 {:class :actor}
          1 {:class :item}}}
   {:text "%0 slinks up behind you."
    :sub {0 {:class :actor}}}
   {:text "%0 wanders by,"
    :sub {0 {:class :actor}}
    :follow-up {:optional? false
                :option [{:text "doing algebra and shit."}
                         {:text "playing a recorder."}
                         {:text "jamming on a mouth organ."}
                         {:text "wearing a cape."}
                         {:text "casually on fire."}
                         {:text "followed by a classy balloon."}
                         {:text "whistling the theme to the Andy Griffith Show."}
                         {:text "whistling the theme to the Garry Shandling Show."}]}}
   {:text "A hollow voice intones, '%0'"
    :sub {0 {:class :intonation}}}
   {:text "A fire truck goes by."
    :follow-up {:optional? false
                :option [{:text "It's covered in ice."}
                         {:text "It's playing a funeral dirge."}]}}
   {:text "An ice cream truck goes by."
    :follow-up {:optional? false
                :option [{:text "It's on fire."}
                         {:text "It's going by at nearly 100 mph. Somehow, a group of children are managing to keep up."}]}}
   {:text "It appears abandoned."}
   {:text "It seems that no one has been here for a long time."}
   {:text "It smells %0."
    :sub {0 {:class :scent}}}
   {:text "Someone has attached marionnette wires to your hands, feet, and head."}
   {:text "Someone has been here recently."}
   {:text "Someone has left a running bulldozer here."}
   {:text "Something smells %0 here."
    :sub {0 {:class :scent}}}
   {:text "Spray-painted on the wall here are the words 'Alice?! Alice?! Who the f...'. The rest is illegible."}
   {:text "There are fresh footprints here."}
   {:text "There has been significant damage from %0."
    :sub {0 {:class :disaster}}}
   {:text "There is %0 here."
    :sub {0 {:class :item}}}
   {:text "The wind howls in the distance."}
   {:text "The words 'eat dulp' are spray-painted on a wall here."}
   {:text "The words 'Hammerdog lives!' are spray-painted on a wall here."}
   {:text "The words 'Knifekitten lives!' are spray-painted on a wall here."}
   {:text "You drop %0 here."
    :sub {0 {:class :item}}
    :follow-up {:option [{:text "It bursts into flames."}
                         {:text "It turns into a wisp of smoke."}
                         {:text "And then some really bad CGI happens."}
                         {:text "It pierces the crust of the Earth."}
                         {:text "It bounces right back into your hand."}]}}
   {:text "You hear %0 in the distance."
    :sub {0 {:class :noise}}}
   {:text "You hear the sound of %0 nearby."
    :sub {0 {:class :noise}}}
   {:text "You find %0 here %1"
    :sub {0 {:class :actor}
          1 {:class :actor-action}}}
   {:text "You find %0 here. You back away %1."
    :sub {0 {:class :item}
          1 {:class :adjective}}}
   {:text "You pick up %0."
    :sub {0 {:class :item}}
    :follow-up {:option [{:text "It's covered in dust."}]}}
   {:text "You see %0 here."
    :sub {0 {:class :item}}
    :follow-up {:option [{:text "It looks oddly familiar"}]}}
    {:text "You see a sign here. On it is written '%0'"
     :sub {0 {:class :sign}}}
   ])
