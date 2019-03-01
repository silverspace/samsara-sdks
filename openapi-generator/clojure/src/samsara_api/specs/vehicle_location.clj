(ns samsara-api.specs.vehicle-location
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def vehicle-location-data
  {
   (ds/opt :heading) float?
   (ds/req :id) int?
   (ds/opt :latitude) float?
   (ds/opt :location) string?
   (ds/opt :longitude) float?
   (ds/opt :name) string?
   (ds/opt :odometerMeters) int?
   (ds/opt :onTrip) boolean?
   (ds/opt :speed) float?
   (ds/opt :time) int?
   (ds/opt :vin) string?
   })

(def vehicle-location-spec
  (ds/spec
    {:name ::vehicle-location
     :spec vehicle-location-data}))
