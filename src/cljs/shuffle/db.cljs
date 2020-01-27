(ns shuffle.db
  (:require [shuffle.view.welcome :as welcome]
            [shuffle.view.raceinfo :as raceinfo]
            [shuffle.view.racecourse :as racecourse]
            [shuffle.view.results :as results]
            [shuffle.view.doug :as doug]
            [shuffle.view.photos :as photos]
            [shuffle.view.sponsors :as sponsors]
            ))

(def default-db
  {:name "Welcome" ; this is the name of the current tab
   :subname " "    ; this is the name of the current submenu selection
   :menu :hide
   :tabs [{:name "Welcome" :current true}
          {:name "Race Info"}
          {:name "Race Course"}
          {:name "Race Results"}
          {:name "Doug Allen"}
          {:name "Photos"}
          {:name "Sponsors"}]
   :pages [{:name "Welcome"
            :content welcome/draw
            }
           {:name "Race Info"
            :content raceinfo/draw
           }
           {:name "Race Course"
            :content racecourse/draw
           }
           {:name "Race Results"
            :content results/draw
           }
           {:name "Doug Allen"
            :content doug/draw
           }
           {:name "Photos"
            :content photos/draw
           }
           {:name "Sponsors"
            :content sponsors/draw
           }
          ]
   }
  )
