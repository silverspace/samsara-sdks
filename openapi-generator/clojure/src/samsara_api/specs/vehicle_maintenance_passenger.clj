(ns samsara-api.specs.vehicle-maintenance-passenger
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.vehicle-maintenance-passenger-check-engine-light :refer :all]
            [samsara-api.specs.vehicle-maintenance-passenger-diagnostic-trouble-codes :refer :all]
            )
  (:import (java.io File)))


(def vehicle-maintenance-passenger-data
  {
   (ds/opt :checkEngineLight) vehicle-maintenance-passenger-check-engine-light-spec
   (ds/opt :diagnosticTroubleCodes) (s/coll-of vehicle-maintenance-passenger-diagnostic-trouble-codes-spec)
   })

(def vehicle-maintenance-passenger-spec
  (ds/spec
    {:name ::vehicle-maintenance-passenger
     :spec vehicle-maintenance-passenger-data}))
