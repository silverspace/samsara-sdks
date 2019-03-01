(ns samsara-api.specs.address-geofence-polygon
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.address-geofence-polygon-vertices :refer :all]
            )
  (:import (java.io File)))


(def address-geofence-polygon-data
  {
   (ds/opt :vertices) (s/coll-of address-geofence-polygon-vertices-spec)
   })

(def address-geofence-polygon-spec
  (ds/spec
    {:name ::address-geofence-polygon
     :spec address-geofence-polygon-data}))
