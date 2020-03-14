(ns shuffle.view.results
  (:require [shuffle.views :as views]
            [re-frame.core :as re-frame]))

(defn subtab-5k []
  [:div.content
    [:div.divtitle
    "Night Owl 5K"
      [:div
        [:table nil
          [:tbody nil
            [:tr nil [:td nil [:a {:href "https://www.frontrunnerusa.com/wp-content/uploads/2018/10/nightowl5kresults2018.txt"} "2019"]] ]
            [:tr nil [:td nil [:a {:href "https://www.frontrunnerusa.com/wp-content/uploads/2018/10/nightowl5kresults2018.txt"} "2018"]] ]
            [:tr nil [:td nil [:a {:href "http://www.frontrunnerusa.com/wp-content/uploads/2017/09/nightowl5kresults17.txt"} "2017"]] ]
            [:tr nil [:td nil [:a {:href "http://www.frontrunnerusa.com/wp-content/uploads/2016/10/nightowl5kresults16.txt"} "2016"]] ]
            [:tr nil [:td nil [:a {:href "http://www.onlineraceresults.com/race/view_plain_text.php?race_id=50580"} "2015"]] ]
            [:tr nil [:td nil [:a {:href "http://www.onlineraceresults.com/race/view_plain_text.php?race_id=44087"} "2014"]] ]
          ]
        ]
      ]
    ]
  ]
)
(defn subtab-10k []
  [:div.content
    [:div.divtitle
    "Night Owl 10K"
      [:div
        [:table nil
          [:tbody nil
            [:tr nil [:td nil [:a {:href "https://www.frontrunnerusa.com/wp-content/uploads/2019/10/nightowl10kresults2019.txt"} "2019"]] ]
            [:tr nil [:td nil [:a {:href "https://www.frontrunnerusa.com/wp-content/uploads/2018/10/nightowl10kresults2018.txt"} "2018"]] ]
            [:tr nil [:td nil [:a {:href "http://www.frontrunnerusa.com/wp-content/uploads/2017/09/nightowl10kresults17.txt"} "2017"]] ]
            [:tr nil [:td nil [:a {:href "http://www.frontrunnerusa.com/wp-content/uploads/2016/10/nightowl10kresults16.txt"} "2016"]] ]
            [:tr nil [:td nil [:a {:href "http://www.onlineraceresults.com/race/view_plain_text.php?race_id=50581"} "2015"]] ]
            [:tr nil [:td nil [:a {:href "http://www.onlineraceresults.com/race/view_plain_text.php?race_id=44088"} "2014"]] ]
          ]
        ]
      ]
    ]
  ]
)
(defn subtab-6hour []
  [:div.content
    [:div.divtitle
    "Night Owl 6 Hour Shuffle"
      [:div
        [:table nil
          [:tbody nil
            [:tr nil [:td nil [:a {:href "http://ultrasignup.com/results_event.aspx?did=66951"} "2019"]] ]
            [:tr nil [:td nil [:a {:href "http://ultrasignup.com/results_event.aspx?did=56343"} "2018"]] ]
            [:tr nil [:td nil [:a {:href "http://ultrasignup.com/results_event.aspx?did=47035"} "2017"]] ]
            ;;[:tr nil [:td nil [:a {:href ""} "2016"]] ]
            [:tr nil [:td nil [:a {:href "http://www.grega100k.com/assets/2015SixHourShuffle-results.txt"} "2015"]] ]
            [:tr nil [:td nil [:a {:href "http://ultrasignup.com/results_event.aspx?did=29266"} "2014"]] ]
          ]
        ]
      ]
    ]
  ]
)

(defn draw-subtab [subtab]
  ((:content subtab))
  )


(defn draw [the-tab]
  (let [subtab (some #(if (:current %) % nil) (:subtabs the-tab))
       ]
    [:div.content
     [:h2 "Results"]
     [:div 
       [:p]

      [:div
        [:div.container
          [:div.inner
           [:div#burgermenu.burgermenu 
          ]]
          (views/draw-sub-tabs (:subtabs the-tab)
                            :show
                            (fn [t] #(re-frame/dispatch [:change-subtab (:name t)]))  )
        ]
       (draw-subtab subtab)
      ]
     ] ]))
