(ns samsara-api.specs.asset
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.asset-cable :refer :all]
            )
  (:import (java.io File)))


(def asset-data
  {
   (ds/opt :assetSerialNumber) string?
   (ds/opt :cable) (s/coll-of asset-cable-spec)
   (ds/opt :engineHours) int?
   (ds/req :id) int?
   (ds/opt :name) string?
   })

(def asset-spec
  (ds/spec
    {:name ::asset
     :spec asset-data}))
