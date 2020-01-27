(ns shuffle.subs
  (:require [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::name
 (fn [db]
   (:name db)))

(re-frame/reg-sub
  ::tabs
  (fn [db]
    (:tabs db)))

(re-frame/reg-sub
  ::pages
  (fn [db]
    (:pages db)))

(re-frame/reg-sub
  ::menu
  (fn [db]
    (:menu db)))

(re-frame/reg-sub
  ::subname
  (fn [db]
    (:subname db)))

