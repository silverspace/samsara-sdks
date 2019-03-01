(ns samsara-api.specs.drivers-summary-response-summaries
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def drivers-summary-response-summaries-data
  {
   (ds/opt :driverId) int?
   (ds/opt :distanceMiles) float?
   (ds/opt :driveMs) int?
   (ds/opt :activeMs) int?
   (ds/opt :driverUsername) string?
   (ds/opt :groupId) int?
   (ds/opt :driverName) string?
   (ds/opt :onDutyMs) int?
   })

(def drivers-summary-response-summaries-spec
  (ds/spec
    {:name ::drivers-summary-response-summaries
     :spec drivers-summary-response-summaries-data}))
