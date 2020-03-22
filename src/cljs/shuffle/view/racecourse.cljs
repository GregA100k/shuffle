(ns shuffle.view.racecourse)

(defn draw [the-tab]
  [:div.content
   [:h2 "Race Course"]
   [:div
    [:div.divflow
     [:div.onethird
      [:div
      "The races will be run on wide grass trails.  The fully lit trails include rolling hills with excellent views of the lakes and a brilliant display of fall color.  Each loop of the course is 3.35 miles so 5K is one loop and the 10K is two loops"
       [:p]
       "All three races are run on grassy ski trails over rolling hills.  The lights will be on for the 5K and 10K Night Owl races, but runners are encouraged to bring suplemental lighting with either a headlamp or hand held flashlight."
       ]
     ]

     [:div.divright.twothirds
       [:img {:src "img/Course_medium.png"
              :alt "Night Owl Races course map"}]
     ]
    ]
   ]
 ])
