(ns samsara-api.specs.asset-reefer-response-reefer-stats-alarms
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-reefer-response-reefer-stats-alarms-data
  {
   (ds/opt :severity) int?
   (ds/opt :operatorAction) string?
   (ds/opt :description) string?
   (ds/opt :alarmCode) int?
   })

(def asset-reefer-response-reefer-stats-alarms-spec
  (ds/spec
    {:name ::asset-reefer-response-reefer-stats-alarms
     :spec asset-reefer-response-reefer-stats-alarms-data}))
