(ns samsara-api.specs.address-geofence-circle
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def address-geofence-circle-data
  {
   (ds/opt :latitude) float?
   (ds/opt :radiusMeters) int?
   (ds/opt :longitude) float?
   })

(def address-geofence-circle-spec
  (ds/spec
    {:name ::address-geofence-circle
     :spec address-geofence-circle-data}))
