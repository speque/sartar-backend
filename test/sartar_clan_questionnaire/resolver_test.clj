(ns sartar-clan-questionnaire.resolver-test
  (:require [clojure.test :refer :all]
            [testit.core :refer :all]
            [sartar-clan-questionnaire.resolver :as resolver]
            [sartar-clan-questionnaire.questions :as questions]))

(def answers [1 0 1 0 0])
(def inputs [nil nil {:text "Wyter ability" :meaning "wyter_ability"} nil nil])

(def expectedResults
  {:rune-modifiers {:movement 3
                    :earth 2
                    :harmony 1
                    :air 5}
   :resource-modifiers {:morale 1
                        :magic 1
                        :wealth 1}
   :virtue-modifiers {}
   :specials ["Slogan: 'Violence is always an option'"
              "+3 when calling Orlanth for divination"]
   :ancient-enemy nil
   :new-enemy nil
   :wyter-abilities ["Wyter ability"]})

(deftest test-resolver
  (fact "it checks answers and returns rune and resource checks"
    (resolver/resolve-questionnaire questions/questions answers inputs) => expectedResults))
