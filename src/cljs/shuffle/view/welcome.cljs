(ns shuffle.view.welcome)

(defn draw [the-tab]
  [:div.content
   [:h2 "The 7th Annual Doug Allen Memorial Trail Races will be October 3, 2020"]
   [:div "the Night Owl Races are an excellent next step in trail running.  Step into the world of night time trail running with the Night Owl 5K and 10K races or step up to ultra distance trail running at the Six Hour Shuffle."
   ]
   [:h3 "Covid-19 Update"]
   [:div.content.notice
    [:p "As it stands right now, July 10, we are unable to hold the Night Owl Races.  The first point of the "
      [:a {:href "https://staysafe.mn.gov/assets/outdoor-guidelines_tcm1152-435380.pdf"} 
          "Stay Safe MN Outdoor Recreation Guidelines for Events"]
      " says \"Postpone or cancel outdoor gatherings... of more than 25 people.\" While Minnesota is doing better in controlling the spread of Covid-19 than a lot of states, there is still a steady stream of new cases so it is unlikely that those rules will change."
    ]
    [:p "Since the goal of the Night Owl Races is to raise money for the the Doug Allen Memorial Scholarship, we are exploring options to still have an event that will be safe and hope to make the final decision on how to proceed by the end of July."
     ]]
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
