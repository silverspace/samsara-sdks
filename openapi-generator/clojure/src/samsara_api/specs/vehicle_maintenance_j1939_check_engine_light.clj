(ns samsara-api.specs.vehicle-maintenance-j1939-check-engine-light
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def vehicle-maintenance-j1939-check-engine-light-data
  {
   (ds/opt :protectIsOn) boolean?
   (ds/opt :stopIsOn) boolean?
   (ds/opt :warningIsOn) boolean?
   (ds/opt :emissionsIsOn) boolean?
   })

(def vehicle-maintenance-j1939-check-engine-light-spec
  (ds/spec
    {:name ::vehicle-maintenance-j1939-check-engine-light
     :spec vehicle-maintenance-j1939-check-engine-light-data}))
