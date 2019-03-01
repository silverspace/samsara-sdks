(ns samsara-api.specs.asset-reefer-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.asset-reefer-response-reefer-stats :refer :all]
            )
  (:import (java.io File)))


(def asset-reefer-response-data
  {
   (ds/opt :assetType) string?
   (ds/opt :id) int?
   (ds/opt :name) string?
   (ds/opt :reeferStats) asset-reefer-response-reefer-stats-spec
   })

(def asset-reefer-response-spec
  (ds/spec
    {:name ::asset-reefer-response
     :spec asset-reefer-response-data}))
