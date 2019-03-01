(ns samsara-api.specs.vehicle-maintenance-j1939-diagnostic-trouble-codes
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def vehicle-maintenance-j1939-diagnostic-trouble-codes-data
  {
   (ds/opt :spnDescription) string?
   (ds/opt :fmiText) string?
   (ds/opt :spnId) int?
   (ds/opt :occurrenceCount) int?
   (ds/opt :txId) int?
   (ds/opt :fmiId) int?
   })

(def vehicle-maintenance-j1939-diagnostic-trouble-codes-spec
  (ds/spec
    {:name ::vehicle-maintenance-j1939-diagnostic-trouble-codes
     :spec vehicle-maintenance-j1939-diagnostic-trouble-codes-data}))
