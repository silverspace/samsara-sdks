(ns samsara-api.specs.humidity-response-sensors
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def humidity-response-sensors-data
  {
   (ds/opt :name) string?
   (ds/opt :humidity) int?
   (ds/opt :id) int?
   })

(def humidity-response-sensors-spec
  (ds/spec
    {:name ::humidity-response-sensors
     :spec humidity-response-sensors-data}))
