(ns samsara-api.specs.safety-report-harsh-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def safety-report-harsh-event-data
  {
   (ds/opt :harshEventType) string?
   (ds/opt :timestampMs) int?
   (ds/opt :vehicleId) int?
   })

(def safety-report-harsh-event-spec
  (ds/spec
    {:name ::safety-report-harsh-event
     :spec safety-report-harsh-event-data}))
