(ns samsara-api.specs.address-geofence-polygon-vertices
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def address-geofence-polygon-vertices-data
  {
   (ds/opt :latitude) float?
   (ds/opt :longitude) float?
   })

(def address-geofence-polygon-vertices-spec
  (ds/spec
    {:name ::address-geofence-polygon-vertices
     :spec address-geofence-polygon-vertices-data}))
