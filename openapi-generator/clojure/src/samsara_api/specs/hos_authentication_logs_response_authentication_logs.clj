(ns samsara-api.specs.hos-authentication-logs-response-authentication-logs
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def hos-authentication-logs-response-authentication-logs-data
  {
   (ds/opt :actionType) string?
   (ds/opt :address) string?
   (ds/opt :city) string?
   (ds/opt :happenedAtMs) int?
   (ds/opt :addressName) string?
   (ds/opt :state) string?
   })

(def hos-authentication-logs-response-authentication-logs-spec
  (ds/spec
    {:name ::hos-authentication-logs-response-authentication-logs
     :spec hos-authentication-logs-response-authentication-logs-data}))
