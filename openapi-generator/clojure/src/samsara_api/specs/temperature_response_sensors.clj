(ns samsara-api.specs.temperature-response-sensors
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def temperature-response-sensors-data
  {
   (ds/opt :probeTemperature) int?
   (ds/opt :name) string?
   (ds/opt :id) int?
   (ds/opt :ambientTemperature) int?
   })

(def temperature-response-sensors-spec
  (ds/spec
    {:name ::temperature-response-sensors
     :spec temperature-response-sensors-data}))
