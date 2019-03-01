(ns samsara-api.specs.tagged-sensor
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tagged-sensor-data
  {
   (ds/req :id) int?
   (ds/opt :name) string?
   })

(def tagged-sensor-spec
  (ds/spec
    {:name ::tagged-sensor
     :spec tagged-sensor-data}))
