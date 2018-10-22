(ns sartar-clan-questionnaire.resolver
  (:require [clojure.spec.alpha :as s]
            [clojure.set :as set]))

(def elemental-runes #{:darkness
                       :water
                       :earth
                       :fire
                       :air})
(def power-runes #{:stasis
                   :movement
                   :life
                   :death
                   :truth
                   :illusion
                   :harmony
                   :disorder})
(def form-runes #{:plant
                  :beast
                  :man
                  :spirit
                  :chaos
                  :dragonewt})
(def condition-runes #{:mastery
                       :magicR
                       :infinity
                       :communication
                       :eternal_battle
                       :law
                       :luck})
(def runes (set/union elemental-runes
                      power-runes
                      form-runes
                      condition-runes))

(def resources #{:war
                 :wealth
                 :morale
                 :magic
                 :peace})

(def virtues #{:shrewd})

(defn- picked-answers [questions answer-indices]
  (map (fn [q a]
       (if (> a -1)
          (nth (:options q) a)
          {:title "Not relevant" :modifiers {}}))
     questions answer-indices))

(defn- count-modifiers [picked-modifiers]
  (reduce (fn [result modifier-map]
            (reduce (fn [modded [key val]]
                      (let [old-val (or (key modded) 0)]
                        (assoc modded key (+ old-val val))))
                    result
                    modifier-map))
          {}
          picked-modifiers))

(defn resolve-questionnaire [questions answers]
  (let [picked (picked-answers questions answers)
        all-modifiers (map :modifiers picked)
        rune-modifiers (map #(select-keys % runes) all-modifiers)
        resource-modifiers (map #(select-keys % resources) all-modifiers)
        virtue-modifiers (map #(select-keys % virtues) all-modifiers)
        specials (map :special picked)
        ancient-enemy-question-index (first (keep-indexed #(when (= :ancient-enemy (:tag %2)) %1) questions))]
    {:rune_modifiers (count-modifiers rune-modifiers)
     :resource_modifiers (count-modifiers resource-modifiers)
     :virtue_modifiers (count-modifiers virtue-modifiers)
     :specials (remove nil? specials)
     :ancient_enemy (if (and ancient-enemy-question-index (< ancient-enemy-question-index (count picked)))
                        (:title (nth picked ancient-enemy-question-index))
                        "None")
     }))

;; Specs:

(s/def ::title string?)
(s/def ::description string?)
(s/def ::query string?)

(s/def ::rune (s/with-gen runes #(s/gen runes)))
(s/def ::rune_modifiers (s/map-of ::rune integer?))

(s/def ::resource (s/with-gen resources #(s/gen resources)))
(s/def ::resource_modifiers (s/map-of ::resource integer?))

(s/def ::virtue (s/with-gen virtues #(s/gen virtues)))
(s/def ::virtue_modifiers (s/map-of ::virtue integer?))

(s/def ::modifiers (s/map-of (s/or
                                :rune ::rune
                                :resource ::resource
                                :virtue ::virtue) integer?))

(s/def ::special string?)
(s/def ::specials (s/coll-of ::special))

(s/def ::ancient_enemy string?)

(s/def ::option (s/keys :req-un [::title ::modifiers]
                        :opt-un [::rune ::special]))
(s/def ::options (s/coll-of ::option))

(def tags #{:ancient-enemy})
(s/def ::tag (s/with-gen tags #(s/gen tags)))

(s/def ::disabled_by (s/coll-of integer?))
(s/def ::question (s/keys :req-un [::title ::options]
                          :opt-un [::description ::query ::disabled_by ::tag]))

(s/def ::result (s/keys :req-un [::rune_modifiers ::resource_modifiers ::virtue_modifiers]
                        :opt-un [::specials ::ancient_enemy]))

(s/fdef picked-answers
    :args (s/cat
      :questions (s/coll-of ::question)
      :answer-indices (s/coll-of integer?))
    :ret ::options)

(s/fdef count-modifiers
    :args (s/cat :picked-modifiers (s/coll-of ::modifiers))
    :ret (s/coll-of any?))

(s/fdef resolve-questionnaire
    :args (s/cat
      :questions (s/coll-of ::question)
      :answer-indices (s/coll-of integer?))
    :ret ::result)
