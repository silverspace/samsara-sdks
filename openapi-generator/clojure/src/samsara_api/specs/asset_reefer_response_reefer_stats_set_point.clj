(ns samsara-api.specs.asset-reefer-response-reefer-stats-set-point
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-reefer-response-reefer-stats-set-point-data
  {
   (ds/opt :tempInMilliC) int?
   (ds/opt :changedAtMs) int?
   })

(def asset-reefer-response-reefer-stats-set-point-spec
  (ds/spec
    {:name ::asset-reefer-response-reefer-stats-set-point
     :spec asset-reefer-response-reefer-stats-set-point-data}))
