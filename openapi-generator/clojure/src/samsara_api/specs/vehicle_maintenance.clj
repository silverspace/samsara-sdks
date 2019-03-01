(ns samsara-api.specs.vehicle-maintenance
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.vehicle-maintenance-j1939 :refer :all]
            [samsara-api.specs.vehicle-maintenance-passenger :refer :all]
            )
  (:import (java.io File)))


(def vehicle-maintenance-data
  {
   (ds/req :id) int?
   (ds/opt :j1939) vehicle-maintenance-j1939-spec
   (ds/opt :passenger) vehicle-maintenance-passenger-spec
   })

(def vehicle-maintenance-spec
  (ds/spec
    {:name ::vehicle-maintenance
     :spec vehicle-maintenance-data}))
