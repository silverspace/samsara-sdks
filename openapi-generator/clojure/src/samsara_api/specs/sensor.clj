(ns samsara-api.specs.sensor
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def sensor-data
  {
   (ds/req :id) int?
   (ds/opt :macAddress) string?
   (ds/opt :name) string?
   })

(def sensor-spec
  (ds/spec
    {:name ::sensor
     :spec sensor-data}))
