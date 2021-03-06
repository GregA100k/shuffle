(defproject shuffle "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.773"]
                 [http-kit "2.4.0"]
                 [reagent "0.7.0"]
                 [re-frame "0.10.2"]
                 [mattinieminen/re-fill "0.2.0"]
                 [compojure "1.5.0"
                    :exclusions
                    [ring/ring-core]]
                 [yogthos/config "0.8"]
                 [ring "1.8.1"]]

  :plugins [[lein-cljsbuild "1.1.5"]]

  :min-lein-version "2.5.3"

  :source-paths ["src/clj"]

  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"]

  :figwheel {:css-dirs ["resources/public/css"]
             :ring-handler shuffle.handler/dev-handler}

  :profiles
  {:dev
   {:dependencies [[binaryage/devtools "0.9.4"]]

    :plugins      [[lein-figwheel "0.5.13"]]}}

  :cljsbuild
  {:builds
   [{:id           "dev"
     :source-paths ["src/cljs"]
     :figwheel     {:on-jsload "shuffle.core/mount-root"}
     :compiler     {:main                 shuffle.core
                    :output-to            "resources/public/js/compiled/app.js"
                    :output-dir           "resources/public/js/compiled/out"
                    :asset-path           "js/compiled/out"
                    :source-map-timestamp true
                    :preloads             [devtools.preload]
                    :external-config      {:devtools/config {:features-to-install :all}}
                    }}

    {:id           "min"
     :source-paths ["src/cljs"]
     :jar true
     :compiler     {:main            shuffle.core
                    :output-to       "resources/public/js/compiled/app.js"
                    :optimizations   :advanced
                    :closure-defines {goog.DEBUG false}
                    :pretty-print    false}}


    ]}

  :main shuffle.server

  :aot [shuffle.server]

  :uberjar-name "shuffle.jar"

  :prep-tasks [["cljsbuild" "once" "min"] "compile"]
  )
