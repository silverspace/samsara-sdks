(ns samsara-api.specs.door-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.door-response-sensors :refer :all]
            )
  (:import (java.io File)))


(def door-response-data
  {
   (ds/opt :groupId) int?
   (ds/opt :sensors) (s/coll-of door-response-sensors-spec)
   })

(def door-response-spec
  (ds/spec
    {:name ::door-response
     :spec door-response-data}))
