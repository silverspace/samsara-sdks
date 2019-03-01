(ns samsara-api.specs.inline-response-200-2
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.pagination :refer :all]
            [samsara-api.specs.vehicle :refer :all]
            )
  (:import (java.io File)))


(def inline-response-200-2-data
  {
   (ds/opt :pagination) pagination-spec
   (ds/opt :groupId) int?
   (ds/opt :vehicles) (s/coll-of vehicle-spec)
   })

(def inline-response-200-2-spec
  (ds/spec
    {:name ::inline-response-200-2
     :spec inline-response-200-2-data}))
