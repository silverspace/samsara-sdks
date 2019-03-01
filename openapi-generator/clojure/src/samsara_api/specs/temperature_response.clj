(ns samsara-api.specs.temperature-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.temperature-response-sensors :refer :all]
            )
  (:import (java.io File)))


(def temperature-response-data
  {
   (ds/opt :groupId) int?
   (ds/opt :sensors) (s/coll-of temperature-response-sensors-spec)
   })

(def temperature-response-spec
  (ds/spec
    {:name ::temperature-response
     :spec temperature-response-data}))
