(ns shuffle.views
  (:require [re-frame.core :as re-frame]
            [shuffle.subs :as subs]
            ))

(defn draw-page [page]
  (if (:content page)
    ((:content page))
    [:div 
      (if (:heading page)
        [:h2 (:heading page)])
      (:body page)
   ] 
 ))

(defn sub-panel []
  (let [subname (re-frame/subscribe [::subs/subname])
       ]
 ;;   (js/alert (str "sub-panel view " @subname))
 ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])
        pages (re-frame/subscribe [::subs/pages])
        page-by-name (fn [n ps] (some #(if (= n (:name %))
                                         %
                                         nil) ps))
        page (page-by-name @name @pages)
    ;;    _ (js/alert (str "Main-panel " @name))
        ]
    (if page
      (draw-page page)
      [:div "Page from ..." @name " and then some more text" ]
    )
))

(defn draw-tab [t click-function]
  [(if (:current t) :li.nav__item.selected :li.nav__item)
     {:on-click (click-function t)} 
     (:name t)
   ])

(defn draw-tabs [tablist show-or-hide click-function]
    [(if (= :show show-or-hide) :nav#menu.nav.show :nav#menu.nav.hide)
      [:ul (map #(draw-tab % click-function) tablist)]]
  )

(defn tab-click-function [t]
  #(re-frame/dispatch [:change-tab (:name t)]))

(defn tabs-panel []
  (let [tabs (re-frame/subscribe [::subs/tabs])
        show_or_hide (re-frame/subscribe [::subs/menu])
   ;;     a (js/alert "tabs panel")
        ]
    [:div.container
     [:div.inner
      [:div#burgermenu.burgermenu 
       {:on-click #(re-frame/dispatch [:show-dropdown @show_or_hide])}
       [:div.burger]
       [:div.burger]
       [:div.burger]]]

    (draw-tabs @tabs @show_or_hide tab-click-function)
    ]))

(defn whole-page []
 ;;(js/alert "whole page") 
  [:div
    [tabs-panel]
    [main-panel]
  ]
)

