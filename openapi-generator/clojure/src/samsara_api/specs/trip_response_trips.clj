(ns samsara-api.specs.trip-response-trips
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.trip-response-start-coordinates :refer :all]
            [samsara-api.specs.trip-response-end-coordinates :refer :all]
            )
  (:import (java.io File)))


(def trip-response-trips-data
  {
   (ds/opt :endOdometer) int?
   (ds/opt :distanceMeters) int?
   (ds/opt :endMs) int?
   (ds/opt :startMs) int?
   (ds/opt :fuelConsumedMl) int?
   (ds/opt :startAddress) string?
   (ds/opt :startCoordinates) trip-response-start-coordinates-spec
   (ds/opt :endCoordinates) trip-response-end-coordinates-spec
   (ds/opt :startOdometer) int?
   (ds/opt :driverId) int?
   (ds/opt :startLocation) string?
   (ds/opt :tollMeters) int?
   (ds/opt :endAddress) string?
   (ds/opt :endLocation) string?
   })

(def trip-response-trips-spec
  (ds/spec
    {:name ::trip-response-trips
     :spec trip-response-trips-data}))
