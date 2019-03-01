(ns samsara-api.specs.-addresses-addresses
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.address-geofence :refer :all]
            )
  (:import (java.io File)))


(def -addresses-addresses-data
  {
   (ds/opt :notes) string?
   (ds/req :formattedAddress) string?
   (ds/req :geofence) address-geofence-spec
   (ds/opt :tagIds) (s/coll-of int?)
   (ds/req :name) string?
   (ds/opt :contactIds) (s/coll-of int?)
   })

(def -addresses-addresses-spec
  (ds/spec
    {:name ::-addresses-addresses
     :spec -addresses-addresses-data}))
