(ns samsara-api.specs.hos-logs-summary-response-drivers
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def hos-logs-summary-response-drivers-data
  {
   (ds/opt :timeUntilBreak) int?
   (ds/opt :vehicleName) string?
   (ds/opt :drivingInViolationToday) int?
   (ds/opt :driverId) int?
   (ds/opt :cycleRemaining) int?
   (ds/opt :driverName) string?
   (ds/opt :dutyStatus) string?
   (ds/opt :cycleTomorrow) int?
   (ds/opt :shiftDriveRemaining) int?
   (ds/opt :timeInCurrentStatus) int?
   (ds/opt :drivingInViolationCycle) int?
   (ds/opt :shiftRemaining) int?
   })

(def hos-logs-summary-response-drivers-spec
  (ds/spec
    {:name ::hos-logs-summary-response-drivers
     :spec hos-logs-summary-response-drivers-data}))
