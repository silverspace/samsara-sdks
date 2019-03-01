(ns samsara-api.specs.vehicle-maintenance-passenger-diagnostic-trouble-codes
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def vehicle-maintenance-passenger-diagnostic-trouble-codes-data
  {
   (ds/opt :dtcShortCode) string?
   (ds/opt :dtcId) int?
   (ds/opt :dtcDescription) string?
   })

(def vehicle-maintenance-passenger-diagnostic-trouble-codes-spec
  (ds/spec
    {:name ::vehicle-maintenance-passenger-diagnostic-trouble-codes
     :spec vehicle-maintenance-passenger-diagnostic-trouble-codes-data}))
