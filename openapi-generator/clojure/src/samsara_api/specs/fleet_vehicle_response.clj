(ns samsara-api.specs.fleet-vehicle-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.fleet-vehicle-response-vehicle-info :refer :all]
            )
  (:import (java.io File)))


(def fleet-vehicle-response-data
  {
   (ds/opt :externalIds) (s/map-of string? string?)
   (ds/opt :harshAccelSetting) string?
   (ds/req :id) int?
   (ds/req :name) string?
   (ds/opt :vehicleInfo) fleet-vehicle-response-vehicle-info-spec
   })

(def fleet-vehicle-response-spec
  (ds/spec
    {:name ::fleet-vehicle-response
     :spec fleet-vehicle-response-data}))
