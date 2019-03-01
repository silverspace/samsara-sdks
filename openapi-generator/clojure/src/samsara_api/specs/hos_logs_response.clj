(ns samsara-api.specs.hos-logs-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.hos-logs-response-logs :refer :all]
            )
  (:import (java.io File)))


(def hos-logs-response-data
  {
   (ds/opt :logs) (s/coll-of hos-logs-response-logs-spec)
   })

(def hos-logs-response-spec
  (ds/spec
    {:name ::hos-logs-response
     :spec hos-logs-response-data}))
