(ns shuffle.view.welcome)

(defn draw [the-tab]
  [:div.content
   [:h2 "The 7th Annual Doug Allen Memorial Trail Races will be October 3, 2020"]
   [:div "the Night Owl Races are an excellent next step in trail running.  Step into the world of night time trail running with the Night Owl 5K and 10K races or step up to ultra distance trail running at the Six Hour Shuffle."
   ]
   [:div.divflow
     [:div 
      [:h4 "Saturday October 3"]
      [:h4 "Lake Elmo Park Reserve"]
      [:h4 ""]
      [:h4 "Noon The Six Hour Shuffle"]
      [:h4 "8:00PM Night Owl 5K and 10K"]
      [:p]
      [:p]
      [:p]
      [:h2 "Registration will open March 15, 2020"]
      [:a {:href "http://ultrasignup.com/register.aspx?did=75822"
           :target "_blank"}
        [:img {:src "//ultrasignup.com/images/signup.jpg" 
               :alt "Ultra Signup registration link"}]
      ]
     ]
     [:div.twothirds.divright
       [:img {:src "img/TrailPic_600x450_medium.JPG"
              :alt "lake elmo park reserver trail picture"}]
     ]
  ]
 ])
