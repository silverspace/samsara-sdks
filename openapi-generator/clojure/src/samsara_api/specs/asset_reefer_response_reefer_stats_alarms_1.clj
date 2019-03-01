(ns samsara-api.specs.asset-reefer-response-reefer-stats-alarms-1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.asset-reefer-response-reefer-stats-alarms :refer :all]
            )
  (:import (java.io File)))


(def asset-reefer-response-reefer-stats-alarms-1-data
  {
   (ds/opt :alarms) (s/coll-of asset-reefer-response-reefer-stats-alarms-spec)
   (ds/opt :changedAtMs) int?
   })

(def asset-reefer-response-reefer-stats-alarms-1-spec
  (ds/spec
    {:name ::asset-reefer-response-reefer-stats-alarms-1
     :spec asset-reefer-response-reefer-stats-alarms-1-data}))
