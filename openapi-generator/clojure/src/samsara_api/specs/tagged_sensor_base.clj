(ns samsara-api.specs.tagged-sensor-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tagged-sensor-base-data
  {
   (ds/req :id) int?
   })

(def tagged-sensor-base-spec
  (ds/spec
    {:name ::tagged-sensor-base
     :spec tagged-sensor-base-data}))
