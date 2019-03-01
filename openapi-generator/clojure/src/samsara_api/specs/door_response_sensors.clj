(ns samsara-api.specs.door-response-sensors
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def door-response-sensors-data
  {
   (ds/opt :doorClosed) boolean?
   (ds/opt :name) string?
   (ds/opt :id) int?
   })

(def door-response-sensors-spec
  (ds/spec
    {:name ::door-response-sensors
     :spec door-response-sensors-data}))
