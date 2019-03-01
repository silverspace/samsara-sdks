(ns samsara-api.specs.vehicle
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def vehicle-data
  {
   (ds/opt :engineHours) int?
   (ds/opt :fuelLevelPercent) float?
   (ds/req :id) int?
   (ds/opt :name) string?
   (ds/opt :note) string?
   (ds/opt :odometerMeters) int?
   (ds/opt :vin) string?
   })

(def vehicle-spec
  (ds/spec
    {:name ::vehicle
     :spec vehicle-data}))
