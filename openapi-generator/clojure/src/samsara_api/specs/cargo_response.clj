(ns samsara-api.specs.cargo-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.cargo-response-sensors :refer :all]
            )
  (:import (java.io File)))


(def cargo-response-data
  {
   (ds/opt :groupId) int?
   (ds/opt :sensors) (s/coll-of cargo-response-sensors-spec)
   })

(def cargo-response-spec
  (ds/spec
    {:name ::cargo-response
     :spec cargo-response-data}))
