(ns shuffle.routes)

(def routes ["/" {"" :routes/welcome
                  "welcome" :routes/welcome
                  "info" :routes/info
                  true :routes/missing
                  }
             ;"/welcome" {"" :routes/welcome}
             ;"/info"    {""  :routes/info}
             ])
