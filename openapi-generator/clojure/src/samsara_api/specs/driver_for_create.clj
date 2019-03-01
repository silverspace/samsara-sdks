(ns samsara-api.specs.driver-for-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def driver-for-create-data
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
   (ds/req :password) string?
   (ds/opt :tagIds) (s/coll-of int?)
   })

(def driver-for-create-spec
  (ds/spec
    {:name ::driver-for-create
     :spec driver-for-create-data}))
