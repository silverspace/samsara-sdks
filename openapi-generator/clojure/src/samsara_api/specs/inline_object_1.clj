(ns samsara-api.specs.inline-object-1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.address-geofence :refer :all]
            )
  (:import (java.io File)))


(def inline-object-1-data
  {
   (ds/opt :contactIds) (s/coll-of int?)
   (ds/opt :formattedAddress) string?
   (ds/opt :geofence) address-geofence-spec
   (ds/opt :name) string?
   (ds/opt :notes) string?
   (ds/opt :tagIds) (s/coll-of int?)
   })

(def inline-object-1-spec
  (ds/spec
    {:name ::inline-object-1
     :spec inline-object-1-data}))
