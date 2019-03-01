(ns samsara-api.specs.tag-modify-add
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.tagged-asset-base :refer :all]
            [samsara-api.specs.tagged-sensor-base :refer :all]
            [samsara-api.specs.tagged-vehicle-base :refer :all]
            [samsara-api.specs.tagged-machine-base :refer :all]
            [samsara-api.specs.tagged-driver-base :refer :all]
            )
  (:import (java.io File)))


(def tag-modify-add-data
  {
   (ds/opt :assets) (s/coll-of tagged-asset-base-spec)
   (ds/opt :sensors) (s/coll-of tagged-sensor-base-spec)
   (ds/opt :vehicles) (s/coll-of tagged-vehicle-base-spec)
   (ds/opt :machines) (s/coll-of tagged-machine-base-spec)
   (ds/opt :drivers) (s/coll-of tagged-driver-base-spec)
   })

(def tag-modify-add-spec
  (ds/spec
    {:name ::tag-modify-add
     :spec tag-modify-add-data}))
