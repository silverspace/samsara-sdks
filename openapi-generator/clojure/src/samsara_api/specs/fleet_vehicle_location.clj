(ns samsara-api.specs.fleet-vehicle-location
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def fleet-vehicle-location-data
  {
   (ds/opt :latitude) float?
   (ds/opt :location) string?
   (ds/opt :longitude) float?
   (ds/opt :speedMilesPerHour) float?
   (ds/opt :timeMs) int?
   })

(def fleet-vehicle-location-spec
  (ds/spec
    {:name ::fleet-vehicle-location
     :spec fleet-vehicle-location-data}))
