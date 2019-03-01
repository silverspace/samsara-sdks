(ns samsara-api.specs.tag
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.tagged-address :refer :all]
            [samsara-api.specs.tagged-asset :refer :all]
            [samsara-api.specs.tagged-driver :refer :all]
            [samsara-api.specs.tagged-machine :refer :all]
            [samsara-api.specs.tagged-sensor :refer :all]
            [samsara-api.specs.tagged-vehicle :refer :all]
            )
  (:import (java.io File)))


(def tag-data
  {
   (ds/opt :addresses) (s/coll-of tagged-address-spec)
   (ds/opt :assets) (s/coll-of tagged-asset-spec)
   (ds/opt :drivers) (s/coll-of tagged-driver-spec)
   (ds/opt :groupId) int?
   (ds/req :id) int?
   (ds/opt :machines) (s/coll-of tagged-machine-spec)
   (ds/req :name) string?
   (ds/opt :parentTagId) int?
   (ds/opt :sensors) (s/coll-of tagged-sensor-spec)
   (ds/opt :vehicles) (s/coll-of tagged-vehicle-spec)
   })

(def tag-spec
  (ds/spec
    {:name ::tag
     :spec tag-data}))
