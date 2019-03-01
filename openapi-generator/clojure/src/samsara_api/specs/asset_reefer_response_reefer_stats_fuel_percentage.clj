(ns samsara-api.specs.asset-reefer-response-reefer-stats-fuel-percentage
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-reefer-response-reefer-stats-fuel-percentage-data
  {
   (ds/opt :fuelPercentage) int?
   (ds/opt :changedAtMs) int?
   })

(def asset-reefer-response-reefer-stats-fuel-percentage-spec
  (ds/spec
    {:name ::asset-reefer-response-reefer-stats-fuel-percentage
     :spec asset-reefer-response-reefer-stats-fuel-percentage-data}))
