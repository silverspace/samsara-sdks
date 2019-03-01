(ns samsara-api.specs.inline-object-12
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-object-12-data
  {
   (ds/req :inspectionType) string?
   (ds/opt :mechanicNotes) string?
   (ds/opt :odometerMiles) int?
   (ds/opt :previousDefectsCorrected) boolean?
   (ds/opt :previousDefectsIgnored) boolean?
   (ds/req :safe) string?
   (ds/opt :trailerId) int?
   (ds/req :userEmail) string?
   (ds/opt :vehicleId) int?
   })

(def inline-object-12-spec
  (ds/spec
    {:name ::inline-object-12
     :spec inline-object-12-data}))
