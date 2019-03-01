(ns samsara-api.specs.driver-safety-score-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.safety-report-harsh-event :refer :all]
            )
  (:import (java.io File)))


(def driver-safety-score-response-data
  {
   (ds/opt :crashCount) int?
   (ds/opt :driverId) int?
   (ds/opt :harshAccelCount) int?
   (ds/opt :harshBrakingCount) int?
   (ds/opt :harshEvents) (s/coll-of safety-report-harsh-event-spec)
   (ds/opt :harshTurningCount) int?
   (ds/opt :safetyScore) int?
   (ds/opt :safetyScoreRank) string?
   (ds/opt :timeOverSpeedLimitMs) int?
   (ds/opt :totalDistanceDrivenMeters) int?
   (ds/opt :totalHarshEventCount) int?
   (ds/opt :totalTimeDrivenMs) int?
   })

(def driver-safety-score-response-spec
  (ds/spec
    {:name ::driver-safety-score-response
     :spec driver-safety-score-response-data}))
