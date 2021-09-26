(ns shuffle.db
  (:require [shuffle.view.welcome :as welcome]
            [shuffle.view.raceinfo :as raceinfo]
            [shuffle.view.racecourse :as racecourse]
            [shuffle.view.results :as results]
            [shuffle.view.volunteer :as volunteer]
            [shuffle.view.doug :as doug]
            [shuffle.view.photos :as photos]
            [shuffle.view.sponsors :as sponsors]
            ))

(def default-db
  {:name "Welcome" ; this is the name of the current tab
   :subname " "    ; this is the name of the current submenu selection
   :menu :hide
   :tabs [{:code "welcome"   :name "Welcome" :current true :content welcome/draw }
          {:code "info"      :name "Race Info"             :content raceinfo/draw 
                :subtabs [{:name "5K 10K" :content raceinfo/subtab-5k :current true}
                          {:name "6 Hour" :content raceinfo/subtab-6hour}]}
          {:code "course"    :name "Race Course"           :content racecourse/draw }
          {:code "results"   :name "Results"               :content results/draw 
                :subtabs [{:name "5K"     :content results/subtab-5k :current true}
                          {:name "10K"    :content results/subtab-10k}
                          {:name "6 Hour" :content results/subtab-6hour}]}
          {:code "volunteer" :name "Volunteer"             :content volunteer/draw }

      ;;    {:name "Doug Allen" :content doug/draw }
      ;;    {:name "Photos" :content photos/draw }
      ;;    {:name "Sponsors" :content sponsors/draw }
         ]
   }
  )
