(ns shuffle.view.raceinfo
  (:require [shuffle.views :as views]
            [re-frame.core :as re-frame]
  ))


(defn subtab-5k []
  [:div.content
    [:div.divtitle
    "Night Owl 5K and 10K"
    ]
    [:div
"Registration Check-In opens at 6:00 p.m. at the Nordic Center"
[:p]
"Race starts at 8 p.m."
[:p]

"Each loop of the course is 3.35 miles, so the 5K is one loop and the 10K is two loops."
[:p]

"This is a night run.  Although the trails are lit, headlamps are strongly encouraged."
[:p]

"This is the only race in the metro area that is run at night on fully lit trails.  What a great experience!"
[:p]

"Registration Fees:"
  [:ul
   [:li "$30 March 15 - June 21"]
   [:li "$35 June 22 - September 6"]
   [:li "$40 September 7 - September 23"]
   [:li "$50 Race Day"]
   ]
[:p]

"    Prices for 2018 are still being determined."
[:p]

"The combined total in the 5K and 10K will be limited to 250 participants"

    ]
  ]

)

(defn subtab-6hour []
  [:div.content
    [:div.divtitle
      "Night Owl 6 Hour Shuffle"
    ]
    [:div
     "Registration Check-In opens at 10:30 am at the Nordic Center"
     [:p]
     "Race starts at 12:00 pm"
     [:p]
     "How far can you run in 6 hours? "
     [:p]
     "Each loop of the course is 3.35 miles.  We will also have a 1 mile \"short loop\" for when time is running out or for a break from the long loop."
     [:p]
     "Registration Fees:"
       [:ul
        [:li "$40 March 15 - June 21"]
        [:li "$45 June 22 - September 6"]
        [:li "$50 September 7 - September 23"]
        [:li "$60 Race Day"]
       ]
     [:p]
    "Prices for 2018 are still being determined."
     [:p]
     "The race will be limited to 100 participants"
    ]
  ]
)


(defn draw-subtab [subtab]
  ((:content subtab))
  )
(defn draw-tab [t click-function]
  [(if (:current t) :li.nav__item.selected :li.nav__item)
     {:on-click (click-function t)} 
     (:name t)
   ])

(defn draw [the-tab]
  (let [subtab (some #(if (:current %) % nil) (:subtabs the-tab)) ]
  [:div.content
    [:h2 (:name the-tab)]
    [:div "The Night Owl Races are an excellent way to take the next step in trail running.  The Six Hour Shuffle is a good introduction to ultra running.  Long enough to get past the marathon distance, but not too long.  The Namesake Night Owl 5K and 10K are great introductions to night time trail running."
      [:p]
      "All three races are run on grassy ski trails over rolling hills.  The lights will be on for the 5K and 10K Night Owl races, but runners are encouraged to bring suplemental lighting with either a headlamp or hand held flashlight."
    ]
    [:div
      [:div.container
        [:div.inner
         ;;[:div#burgermenu.burgermenu ]
        ]
        (views/draw-sub-tabs (:subtabs the-tab)
                         :show
                         (fn [t] #(re-frame/dispatch [:change-subtab (:name t)])) :sub  )
      ]
     (draw-subtab subtab)
    ]
  ]))

