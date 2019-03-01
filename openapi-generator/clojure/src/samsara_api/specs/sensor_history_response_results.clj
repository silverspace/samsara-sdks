(ns samsara-api.specs.sensor-history-response-results
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def sensor-history-response-results-data
  {
   (ds/opt :series) (s/coll-of int?)
   (ds/opt :timeMs) int?
   })

(def sensor-history-response-results-spec
  (ds/spec
    {:name ::sensor-history-response-results
     :spec sensor-history-response-results-data}))
