(ns samsara-api.specs.asset-current-location
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-current-location-data
  {
   (ds/opt :latitude) float?
   (ds/opt :location) string?
   (ds/opt :longitude) float?
   (ds/opt :speedMilesPerHour) float?
   (ds/opt :timeMs) int?
   })

(def asset-current-location-spec
  (ds/spec
    {:name ::asset-current-location
     :spec asset-current-location-data}))
