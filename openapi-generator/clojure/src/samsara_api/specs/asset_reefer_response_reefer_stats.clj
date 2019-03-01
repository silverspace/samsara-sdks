(ns samsara-api.specs.asset-reefer-response-reefer-stats
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.asset-reefer-response-reefer-stats-fuel-percentage :refer :all]
            [samsara-api.specs.asset-reefer-response-reefer-stats-power-status :refer :all]
            [samsara-api.specs.asset-reefer-response-reefer-stats-engine-hours :refer :all]
            [samsara-api.specs.asset-reefer-response-reefer-stats-set-point :refer :all]
            [samsara-api.specs.asset-reefer-response-reefer-stats-return-air-temp :refer :all]
            [samsara-api.specs.asset-reefer-response-reefer-stats-alarms-1 :refer :all]
            )
  (:import (java.io File)))


(def asset-reefer-response-reefer-stats-data
  {
   (ds/opt :fuelPercentage) (s/coll-of asset-reefer-response-reefer-stats-fuel-percentage-spec)
   (ds/opt :powerStatus) (s/coll-of asset-reefer-response-reefer-stats-power-status-spec)
   (ds/opt :engineHours) (s/coll-of asset-reefer-response-reefer-stats-engine-hours-spec)
   (ds/opt :setPoint) (s/coll-of asset-reefer-response-reefer-stats-set-point-spec)
   (ds/opt :returnAirTemp) (s/coll-of asset-reefer-response-reefer-stats-return-air-temp-spec)
   (ds/opt :alarms) (s/coll-of asset-reefer-response-reefer-stats-alarms-1-spec)
   })

(def asset-reefer-response-reefer-stats-spec
  (ds/spec
    {:name ::asset-reefer-response-reefer-stats
     :spec asset-reefer-response-reefer-stats-data}))
