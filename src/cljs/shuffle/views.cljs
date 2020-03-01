(ns shuffle.views
  (:require [re-frame.core :as re-frame]
            [shuffle.subs :as subs]
            ))

(defn draw-page [tab]
    [:div ((:content tab) tab) ] 
)

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])
        pages (re-frame/subscribe [::subs/pages])
        tabs (re-frame/subscribe [::subs/tabs])
        page-by-name (fn [n ps] (some #(if (= n (:name %))
                                         %
                                         nil) ps))
        tab (page-by-name @name @tabs)
        page (:content tab)
        ]
    (if page
      (draw-page tab)
      [:div "Page from ..." @name " and then some more text" ]
    )
))

(defn draw-tab [t click-function & args]
  (let [sub? (if (= :sub (first args)) true false)]
    [(if (:current t)
         (if sub?  :li.nav__item_sub.selected :li.nav__item.selected) 
         (if sub? :li.nav__item_sub :li.nav__item))
     {:on-click (click-function t)} 
     (:name t)
   ]))

(defn draw-tabs [tablist show-or-hide click-function & args]
    [(if (= :show show-or-hide) :nav#menu.nav.show :nav#menu.nav.hide)
      [:ul (map #(draw-tab % click-function (first args)) tablist)]]
  )

(defn tab-click-function [t]
  #(re-frame/dispatch [:change-tab (:name t)]))

(defn tabs-panel []
  (let [tabs (re-frame/subscribe [::subs/tabs])
        show_or_hide (re-frame/subscribe [::subs/menu])
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
  [:div
    [tabs-panel]
    [main-panel]
  ]
)

