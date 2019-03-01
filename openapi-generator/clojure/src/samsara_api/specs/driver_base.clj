(ns samsara-api.specs.driver-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def driver-base-data
  {
   (ds/opt :eldAdverseWeatherExemptionEnabled) boolean?
   (ds/opt :eldBigDayExemptionEnabled) boolean?
   (ds/opt :eldDayStartHour) int?
   (ds/opt :eldExempt) boolean?
   (ds/opt :eldExemptReason) string?
   (ds/opt :eldPcEnabled) boolean?
   (ds/opt :eldYmEnabled) boolean?
   (ds/opt :externalIds) (s/map-of string? string?)
   (ds/opt :groupId) int?
   (ds/opt :licenseNumber) string?
   (ds/opt :licenseState) string?
   (ds/req :name) string?
   (ds/opt :notes) string?
   (ds/opt :phone) string?
   (ds/opt :username) string?
   (ds/opt :vehicleId) int?
   })

(def driver-base-spec
  (ds/spec
    {:name ::driver-base
     :spec driver-base-data}))
