(ns sartar-clan-questionnaire.resolver-test
  (:use midje.sweet)
  (:require [sartar-clan-questionnaire.resolver :as resolver]
            [sartar-clan-questionnaire.questions :as questions]))

(def answers [1 0 1 0 0])
(def inputs [nil nil {:text "Wyter ability" :meaning "wyter_ability"} nil nil])

(def expectedResults
  {:rune_modifiers {:movement 3
                    :earth 2
                    :harmony 1
                    :air 5}
   :resource_modifiers {:morale 1
                        :magic 1
                        :wealth 1}
   :virtue_modifiers {}
   :specials ["Slogan: 'Violence is always an option'"
              "+3 when calling Orlanth for divination"]
   :ancient_enemy "None"
   :new_enemy "None"
   :wyter_abilities ["Wyter ability"]})

(facts "about `resolver`"
  (fact "it checks answers and returns rune and resource checks"
    (resolver/resolve-questionnaire questions/questions answers inputs) => expectedResults))
