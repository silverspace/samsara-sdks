(ns samsara-api.specs.vehicle-maintenance-passenger-check-engine-light
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def vehicle-maintenance-passenger-check-engine-light-data
  {
   (ds/opt :isOn) boolean?
   })

(def vehicle-maintenance-passenger-check-engine-light-spec
  (ds/spec
    {:name ::vehicle-maintenance-passenger-check-engine-light
     :spec vehicle-maintenance-passenger-check-engine-light-data}))
