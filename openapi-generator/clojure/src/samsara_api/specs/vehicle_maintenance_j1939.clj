(ns samsara-api.specs.vehicle-maintenance-j1939
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.vehicle-maintenance-j1939-check-engine-light :refer :all]
            [samsara-api.specs.vehicle-maintenance-j1939-diagnostic-trouble-codes :refer :all]
            )
  (:import (java.io File)))


(def vehicle-maintenance-j1939-data
  {
   (ds/opt :checkEngineLight) vehicle-maintenance-j1939-check-engine-light-spec
   (ds/opt :diagnosticTroubleCodes) (s/coll-of vehicle-maintenance-j1939-diagnostic-trouble-codes-spec)
   })

(def vehicle-maintenance-j1939-spec
  (ds/spec
    {:name ::vehicle-maintenance-j1939
     :spec vehicle-maintenance-j1939-data}))
