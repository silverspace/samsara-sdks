(ns samsara-api.specs.inline-response-200-5-vehicle-stats
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.engine-state :refer :all]
            [samsara-api.specs.aux-input-series :refer :all]
            [samsara-api.specs.aux-input-series :refer :all]
            )
  (:import (java.io File)))


(def inline-response-200-5-vehicle-stats-data
  {
   (ds/opt :engineState) (s/coll-of engine-state-spec)
   (ds/opt :auxInput2) aux-input-series-spec
   (ds/req :vehicleId) int?
   (ds/opt :auxInput1) aux-input-series-spec
   })

(def inline-response-200-5-vehicle-stats-spec
  (ds/spec
    {:name ::inline-response-200-5-vehicle-stats
     :spec inline-response-200-5-vehicle-stats-data}))
