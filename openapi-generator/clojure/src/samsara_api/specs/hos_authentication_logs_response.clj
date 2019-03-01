(ns samsara-api.specs.hos-authentication-logs-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.hos-authentication-logs-response-authentication-logs :refer :all]
            )
  (:import (java.io File)))


(def hos-authentication-logs-response-data
  {
   (ds/opt :authenticationLogs) (s/coll-of hos-authentication-logs-response-authentication-logs-spec)
   })

(def hos-authentication-logs-response-spec
  (ds/spec
    {:name ::hos-authentication-logs-response
     :spec hos-authentication-logs-response-data}))
