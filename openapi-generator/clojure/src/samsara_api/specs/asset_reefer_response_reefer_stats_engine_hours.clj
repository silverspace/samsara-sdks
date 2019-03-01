(ns samsara-api.specs.asset-reefer-response-reefer-stats-engine-hours
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-reefer-response-reefer-stats-engine-hours-data
  {
   (ds/opt :engineHours) int?
   (ds/opt :changedAtMs) int?
   })

(def asset-reefer-response-reefer-stats-engine-hours-spec
  (ds/spec
    {:name ::asset-reefer-response-reefer-stats-engine-hours
     :spec asset-reefer-response-reefer-stats-engine-hours-data}))
