(ns samsara-api.specs.address
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.contact :refer :all]
            [samsara-api.specs.address-geofence :refer :all]
            [samsara-api.specs.tag-metadata :refer :all]
            )
  (:import (java.io File)))


(def address-data
  {
   (ds/opt :contacts) (s/coll-of contact-spec)
   (ds/opt :formattedAddress) string?
   (ds/opt :geofence) address-geofence-spec
   (ds/opt :id) int?
   (ds/opt :name) string?
   (ds/opt :notes) string?
   (ds/opt :tags) (s/coll-of tag-metadata-spec)
   })

(def address-spec
  (ds/spec
    {:name ::address
     :spec address-data}))
