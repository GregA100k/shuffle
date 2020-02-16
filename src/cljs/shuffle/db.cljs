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
   :tabs [{:name "Welcome" :current true :content welcome/draw }
          {:name "Race Info" :content raceinfo/draw :subtabs [{:name "5K 10K" :content raceinfo/subtab-5k :current true}
                                                              {:name "6 Hour" :content raceinfo/subtab-6hour}]}
          {:name "Race Course" :content racecourse/draw }
          {:name "Race Results" :content results/draw }
          {:name "Doug Allen" :content doug/draw }
          {:name "Photos" :content photos/draw }
          {:name "Sponsors" :content sponsors/draw }]
   }
  )
