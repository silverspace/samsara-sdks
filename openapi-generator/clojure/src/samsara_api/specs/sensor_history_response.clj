(ns samsara-api.specs.sensor-history-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.sensor-history-response-results :refer :all]
            )
  (:import (java.io File)))


(def sensor-history-response-data
  {
   (ds/opt :results) (s/coll-of sensor-history-response-results-spec)
   })

(def sensor-history-response-spec
  (ds/spec
    {:name ::sensor-history-response
     :spec sensor-history-response-data}))
