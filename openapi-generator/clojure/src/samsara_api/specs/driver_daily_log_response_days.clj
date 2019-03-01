(ns samsara-api.specs.driver-daily-log-response-days
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs. :refer :all]
            [samsara-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def driver-daily-log-response-days-data
  {
   (ds/opt :certifiedAtMs) int?
   (ds/opt :endMs) int?
   (ds/opt :startMs) int?
   (ds/opt :trailerIds) any?
   (ds/opt :activeHours) float?
   (ds/opt :distanceMiles) float?
   (ds/opt :activeMs) int?
   (ds/opt :certified) boolean?
   (ds/opt :vehicleIds) any?
   })

(def driver-daily-log-response-days-spec
  (ds/spec
    {:name ::driver-daily-log-response-days
     :spec driver-daily-log-response-days-data}))
