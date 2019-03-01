(ns samsara-api.specs.asset-reefer-response-reefer-stats-power-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-reefer-response-reefer-stats-power-status-data
  {
   (ds/opt :changedAtMs) int?
   (ds/opt :status) string?
   })

(def asset-reefer-response-reefer-stats-power-status-spec
  (ds/spec
    {:name ::asset-reefer-response-reefer-stats-power-status
     :spec asset-reefer-response-reefer-stats-power-status-data}))
