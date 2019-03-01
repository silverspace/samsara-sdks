(ns samsara-api.specs.asset-current-locations-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.asset-cable :refer :all]
            [samsara-api.specs.asset-current-location :refer :all]
            )
  (:import (java.io File)))


(def asset-current-locations-response-data
  {
   (ds/opt :cable) (s/coll-of asset-cable-spec)
   (ds/opt :engineHours) int?
   (ds/req :id) int?
   (ds/opt :location) (s/coll-of asset-current-location-spec)
   (ds/opt :name) string?
   })

(def asset-current-locations-response-spec
  (ds/spec
    {:name ::asset-current-locations-response
     :spec asset-current-locations-response-data}))
