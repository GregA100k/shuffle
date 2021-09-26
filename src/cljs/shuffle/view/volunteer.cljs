(ns shuffle.view.volunteer)

(defn draw [the-tab]
  [:div.content
   [:h2 "Volunteer Info"]
   [:div
    [:div.divflow
     [:div
      [:div
      "Thank you for your interest in volunteering for the 2021 Night Owl Races.  We are looking for volunteer help "
      "in a number of areas so if you are interested, please fill out the form below.  Please be specific about the "
      "time you are available and if you have a preference on what tasks you are interested in you can specify that "
      "as well.  We will do our best to align volunteer assignments with requests but we may not be able to do that "
      "in order to insure that all areas of the race are covered."
       [:p]
       ]
      [:div.container
       [:iframe {:src "https://docs.google.com/forms/d/e/1FAIpQLSeVLb6M6iT61INf6etcQSMDjlJleUBDvMK-7PX_zR2z2EehmA/viewform?embedded=true"
                 :style {:display (if loading? "none" "block")
                         :width 800
                         :height 2000
                         :margin 0
                         :padding 0
                         :border none
                         }
                 }]
      ]
     ]

    ]
   ]
 ])

