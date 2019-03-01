(ns samsara-api.specs.tag-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.tagged-asset-base :refer :all]
            [samsara-api.specs.tagged-driver-base :refer :all]
            [samsara-api.specs.tagged-machine-base :refer :all]
            [samsara-api.specs.tagged-sensor-base :refer :all]
            [samsara-api.specs.tagged-vehicle-base :refer :all]
            )
  (:import (java.io File)))


(def tag-update-data
  {
   (ds/opt :assets) (s/coll-of tagged-asset-base-spec)
   (ds/opt :drivers) (s/coll-of tagged-driver-base-spec)
   (ds/opt :machines) (s/coll-of tagged-machine-base-spec)
   (ds/opt :name) string?
   (ds/opt :parentTagId) int?
   (ds/opt :sensors) (s/coll-of tagged-sensor-base-spec)
   (ds/opt :vehicles) (s/coll-of tagged-vehicle-base-spec)
   })

(def tag-update-spec
  (ds/spec
    {:name ::tag-update
     :spec tag-update-data}))
