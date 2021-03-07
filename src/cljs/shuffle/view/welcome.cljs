(ns shuffle.view.welcome)

(defn draw [the-tab]
  [:div.content
   [:h2 "Night Owl Races 2021"]
   ;[:h3 "Covid-19 Update"]
   [:div.content
    [:p [:h3 "October 2, 2021" ]]
    [:p "The 2021 edition of the Night Owl Races is scheduled for Saturday October 2. "
     "We are excited for the return of in person running/racing but the shape of event will likely be different. "
     ]
    [:p "Registration will be on UltraSignup once again, but will not open until June at the earliest.  Even "
     "though new covid cases are trending downward and the vaccine doses are trending upward, It doesn't "
     "seem wise to open registration until there is more certainty about holding the race. "
     "We will continue to monitor the guidance and regulations at "
     [:a {:href "https://staysafe.mn.gov/" :target "_blank"} "Stay Safe MN (https://staysafe.mn.gov)" ]
     " and work to develop the required covid-19 preparedness plan in order to provide the safest event possible. "

     ]
    ]
   [:div "The Night Owl Races are an excellent next step in trail running.  Step into the world of night time trail running with the Night Owl 5K and 10K races or step up to ultra distance trail running at the Six Hour Shuffle."
   ]
   [:div.divflow
     [:div.onethird
      [:h4 "Saturday October 2"]
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
    ;  [:div
    ;    [:img {:src "img/2020_USATF_Sanctioned_Event_Logo_350.png"
    ;           :alt "Sanctioned by USATF logo"
    ;           }] ]
      [:p]
     ]
     [:div.twothirds.divright
       [:img {:src "img/TrailPic_600x450_medium.JPG"
              :alt "lake elmo park reserver trail picture"}]
     ]
  ]
   [:hr]

 ])
