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

(def tags #{:ancient-enemy
            :new-enemy})

(def input-meanings #{:wyter_ability
                      :wyter_weakness})

(defn- pick-answers [questions answer-indices]
  (map (fn [q a]
       (if (> a -1)
          (assoc (nth (:options q) a) :tag (:tag q))
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

(defn- tag-index [tag questions]
  (first (keep-indexed #(when (= tag (:tag %2)) %1) questions)))

(defn- gather-tagged-answers [answers-with-tags]
  (reduce
   (fn [acc val]
     (assoc acc val (some #(when (= (:tag %) val) (:title %)) answers-with-tags)))
   {}
   (vec tags)))

(defn resolve-questionnaire [questions answer-indices inputs]
  (let [picked (pick-answers questions answer-indices)
        all-modifiers (map :modifiers picked)
        rune-modifiers (map #(select-keys % runes) all-modifiers)
        resource-modifiers (map #(select-keys % resources) all-modifiers)
        virtue-modifiers (map #(select-keys % virtues) all-modifiers)
        specials (map :special picked)
        wyter-abilities (map :text (filter #(= (:meaning %) "wyter_ability") inputs))
        tagged-answers (gather-tagged-answers picked)]
    (merge
     tagged-answers
     {:rune-modifiers (count-modifiers rune-modifiers)
      :resource-modifiers (count-modifiers resource-modifiers)
      :virtue-modifiers (count-modifiers virtue-modifiers)
      :specials (remove nil? specials)
      :wyter-abilities wyter-abilities})))

;; Specs:

(s/def ::title string?)
(s/def ::description string?)
(s/def ::query string?)

(s/def ::rune (s/with-gen runes #(s/gen runes)))
(s/def ::rune-modifiers (s/map-of ::rune integer?))

(s/def ::resource (s/with-gen resources #(s/gen resources)))
(s/def ::resource-modifiers (s/map-of ::resource integer?))

(s/def ::virtue (s/with-gen virtues #(s/gen virtues)))
(s/def ::virtue-modifiers (s/map-of ::virtue integer?))

(s/def ::modifiers (s/map-of (s/or
                                :rune ::rune
                                :resource ::resource
                                :virtue ::virtue) integer?))

(s/def ::special string?)
(s/def ::specials (s/coll-of ::special))

(s/def ::explanation string?)

(s/def ::ancient-enemy (s/nilable string?))
(s/def ::new-enemy (s/nilable string?))

(s/def ::option (s/keys :req-un [::title ::modifiers]
                        :opt-un [::rune ::special ::disabled-by ::explanation]))
(s/def ::options (s/coll-of ::option))

(s/def ::tag (s/with-gen tags #(s/gen tags)))

(s/def ::wyter (s/with-gen input-meanings #(s/gen input-meanings)))
(s/def ::input (s/keys :opt-un [::title ::meaning ::text]))

(s/def ::disabled-by (s/coll-of integer?))
(s/def ::question (s/keys :req-un [::title ::options]
                          :opt-un [::description ::query ::disabled-by ::tag]))

(s/def ::result (s/keys :req-un [::rune-modifiers ::resource-modifiers ::virtue-modifiers]
                        :opt-un [::specials ::ancient-enemy ::new-enemy]))

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
      :answer-indices (s/coll-of integer?)
      :inputs (s/coll-of (s/nilable ::input)))
    :ret ::result)
