(ns samsara-api.specs.inline-response-200-3
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.vehicle-location :refer :all]
            )
  (:import (java.io File)))


(def inline-response-200-3-data
  {
   (ds/opt :groupId) int?
   (ds/opt :vehicles) (s/coll-of vehicle-location-spec)
   })

(def inline-response-200-3-spec
  (ds/spec
    {:name ::inline-response-200-3
     :spec inline-response-200-3-data}))
