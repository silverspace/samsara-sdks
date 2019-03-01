(ns samsara-api.specs.inline-response-200-5
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.pagination :refer :all]
            [samsara-api.specs.inline-response-200-5-vehicle-stats :refer :all]
            )
  (:import (java.io File)))


(def inline-response-200-5-data
  {
   (ds/opt :pagination) pagination-spec
   (ds/req :vehicleStats) (s/coll-of inline-response-200-5-vehicle-stats-spec)
   })

(def inline-response-200-5-spec
  (ds/spec
    {:name ::inline-response-200-5
     :spec inline-response-200-5-data}))
