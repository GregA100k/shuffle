(ns shuffle.events-test
  (require [clojure.test :refer :all]
           [shuffle.events :refer :all]))

(deftest current-tab-test
  (testing "set-current-tab"
    (let [db [{:name "tab1" :current false}
              {:name "tab2" :current true}
              {:name "tab3" :current false}]
          testtab "tab3"
          expected-db [{:name "tab1" :current false}
              {:name "tab2" :current false}
              {:name "tab3" :current false}]
          ]
      (is (= expected-db (set-current-tab db testtab))))
    ))

