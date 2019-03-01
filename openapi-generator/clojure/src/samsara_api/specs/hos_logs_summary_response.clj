(ns samsara-api.specs.hos-logs-summary-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.hos-logs-summary-response-drivers :refer :all]
            )
  (:import (java.io File)))


(def hos-logs-summary-response-data
  {
   (ds/opt :drivers) (s/coll-of hos-logs-summary-response-drivers-spec)
   })

(def hos-logs-summary-response-spec
  (ds/spec
    {:name ::hos-logs-summary-response
     :spec hos-logs-summary-response-data}))
