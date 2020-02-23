(ns shuffle.view.results
  (:require [shuffle.views :as views]
            [re-frame.core :as re-frame]))

(defn subtab-5k []
  [:div.content
    [:div.divtitle
    "Night Owl 5K"
    ]
  ]
)
(defn subtab-10k []
  [:div.content
    [:div.divtitle
    "Night Owl 10K"
    ]
  ]
)
(defn subtab-6hour []
  [:div.content
    [:div.divtitle
    "Night Owl 6 Hour Shuffle"
    ]
  ]
)

(defn draw-subtab [subtab-name]
  (if (= subtab-name "6 Hour")
    (subtab-6hour)
    (subtab-5k)
    )
  )

(defn draw [the-tab]
  [:div.content
   [:h2 "Results"]
   [:div 
    "Results and stuff"
     [:p]

    [:div
      [:div.container
        [:div.inner
         [:div#burgermenu.burgermenu 
        ]]
        (views/draw-tabs (:subtabs the-tab)
                         :show
                         (fn [t] #(re-frame/dispatch [:change-subtab (:name t)]))  )
      ]
     (draw-subtab subtab)
    ]

   ]
   ])
