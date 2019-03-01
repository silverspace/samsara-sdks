(ns samsara-api.specs.humidity-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.humidity-response-sensors :refer :all]
            )
  (:import (java.io File)))


(def humidity-response-data
  {
   (ds/opt :groupId) int?
   (ds/opt :sensors) (s/coll-of humidity-response-sensors-spec)
   })

(def humidity-response-spec
  (ds/spec
    {:name ::humidity-response
     :spec humidity-response-data}))
