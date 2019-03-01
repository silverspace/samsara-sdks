(ns samsara-api.specs.address-geofence
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.address-geofence-circle :refer :all]
            [samsara-api.specs.address-geofence-polygon :refer :all]
            )
  (:import (java.io File)))


(def address-geofence-data
  {
   (ds/opt :circle) address-geofence-circle-spec
   (ds/opt :polygon) address-geofence-polygon-spec
   })

(def address-geofence-spec
  (ds/spec
    {:name ::address-geofence
     :spec address-geofence-data}))
