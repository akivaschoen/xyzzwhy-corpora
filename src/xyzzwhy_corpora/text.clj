(ns xyzzwhy-corpora.text)

;; This text presents source material for xyzzwhy's original corpus. Each
;; class (such as :location-events or :obstacles) is a map containing map
;; fragments the minimal requirement of which is a :text key.
;;
;; A fragment's :text value can contain a number of substitutions represented
;; by %0-%n. These require a :subs map which contains a key for each substitution.
;; These must contain at least a :class reference which is keyed to another
;; class. These are randomly chosen by xyzzwhy and then interpolated into the
;; fragment's :text. A substitution can also contain a :config map which has
;; options to skip the automatic prepending of prepositions and/or articles; and
;; the ability to ensure that an actor sub is a single person and not a group.
;; More config options will be added later.
;;
;; A fragment may also have follow-ups which may be marked as :optional?. A list of
;; options follows which is a vector of fragments which themselves may have :subs.
;; These subs must begin their %x count +1 from what's in the parent fragment's :text.
;; Each follow-up option's sub may contain a :ref key which allows it to refer to
;; a substitution from the parent fragment's text. For example, to use a pronoun
;; for a person class substitution at %0, the follow-up's substitution would :ref 0.
;;
;; Object classes and locations also have an :article and :preps for prepositions.
;; Locations have a :type which is either :interior or :exterior.
;; Actors have a :gender (:male, :female, or :group).
;;
;; Animals have :sounds (e.g., a kitten might purr or meow) and :adjectives
;; such as a 'whimpering' for a puppy.
;;
;; Future classes might have their own special keys and options.

(def events
  {:events [:location-event :action-event]})



(def classes
  ["events"
   "location-events"
   "action-events"
   "secondary-events"
   "tertiary-events"
   "actor-actions"
   "locations"
   "dialogues"
   "intonations"
   "books"
   "directions"
   "persons"
   "actions"
   "adjectives"
   "adverbs"
   "scents"
   "diagnoses"
   "foods"
   "drinks"
   "signs"
   "obstacles"
   "garments"
   "items"
   "animals"
   "noises"
   "attacks"
   "games"
   "thoughts"
   "news"
   "disasters"])
