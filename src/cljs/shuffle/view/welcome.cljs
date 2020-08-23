(ns shuffle.view.welcome)

(defn draw [the-tab]
  [:div.content
   [:h2 "The 7th Annual Doug Allen Memorial Trail Races on October 3, 2020 are cancelled"]
   ;[:h3 "Covid-19 Update"]
   [:div.content.notice
    [:p [:h3 "The 2020 Night Owl Races are Cancelled" ]]
    [:p "The primary goal of the Nightowl Races is to raise money for the Dr Doug Allen Sholarship for students of the medical profession, " 
     "With helping the medical profession as a goal, it does not make sense to do anything that could risk spreading the virus, so the 2020 Night Owl Races are cancelled."
     ]
    [:p 
     "The race committee explored options of holding a race with limited entries, or holding some form of virtual race, but, after careful consideration, decided to cancel this years race.  "
     "Please stay safe and we hope to see you October 2, 2021."
     ]
    ]
   [:div "The Night Owl Races are an excellent next step in trail running.  Step into the world of night time trail running with the Night Owl 5K and 10K races or step up to ultra distance trail running at the Six Hour Shuffle."
   ]
   [:div.divflow
     [:div.onethird
      [:h4 "Saturday October 3"]
      [:h4 "Lake Elmo Park Reserve"]
      [:h4 ""]
      [:h4 "Noon The Six Hour Shuffle"]
      [:h4 "8:00PM Night Owl 5K and 10K"]
      [:p]
      [:div
        [:h2 "Register at"
          [:div.divtop
            [:a {:href "http://ultrasignup.com/register.aspx?did=75822"
                 :target "_blank"}
              [:img {:src "//ultrasignup.com/images/signup.jpg" 
                     :alt "Ultra Signup registration link"}]
          ]]
        ]
      ]
      [:p]
      [:hr]
      [:div
        [:img {:src "img/2020_USATF_Sanctioned_Event_Logo_350.png"
               :alt "Sanctioned by USATF logo"
               }] ]
      [:p]
     ]
     [:div.twothirds.divright
       [:img {:src "img/TrailPic_600x450_medium.JPG"
              :alt "lake elmo park reserver trail picture"}]
     ]
  ]
   [:hr]

 ])
