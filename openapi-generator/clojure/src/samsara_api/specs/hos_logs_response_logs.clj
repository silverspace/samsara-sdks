(ns samsara-api.specs.hos-logs-response-logs
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def hos-logs-response-logs-data
  {
   (ds/opt :locLng) float?
   (ds/opt :logStartMs) int?
   (ds/opt :driverId) int?
   (ds/opt :statusType) string?
   (ds/opt :locCity) string?
   (ds/opt :groupId) int?
   (ds/opt :locName) string?
   (ds/opt :locLat) float?
   (ds/opt :remark) string?
   (ds/opt :locState) string?
   (ds/opt :vehicleId) int?
   (ds/opt :codriverIds) (s/coll-of int?)
   })

(def hos-logs-response-logs-spec
  (ds/spec
    {:name ::hos-logs-response-logs
     :spec hos-logs-response-logs-data}))
