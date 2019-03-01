(ns samsara-api.specs.inline-response-200-4
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.vehicle-maintenance :refer :all]
            )
  (:import (java.io File)))


(def inline-response-200-4-data
  {
   (ds/opt :vehicles) (s/coll-of vehicle-maintenance-spec)
   })

(def inline-response-200-4-spec
  (ds/spec
    {:name ::inline-response-200-4
     :spec inline-response-200-4-data}))
