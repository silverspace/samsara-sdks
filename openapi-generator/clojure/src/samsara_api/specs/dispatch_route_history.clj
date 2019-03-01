(ns samsara-api.specs.dispatch-route-history
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.dispatch-route-historical-entry :refer :all]
            )
  (:import (java.io File)))


(def dispatch-route-history-data
  {
   (ds/opt :history) (s/coll-of dispatch-route-historical-entry-spec)
   })

(def dispatch-route-history-spec
  (ds/spec
    {:name ::dispatch-route-history
     :spec dispatch-route-history-data}))
