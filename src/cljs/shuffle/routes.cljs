(ns shuffle.routes)

(def routes ["/" {"" :routes/welcome
                  "welcome" :routes/welcome
                  "info" :routes/info
                  "course" :routes/course
                  "results" :routes/results
                  "volunteer" :routes/volunteer
                  true :routes/welcome
                  }
             ])
