(ns samsara-api.specs.tagged-vehicle
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tagged-vehicle-data
  {
   (ds/req :id) int?
   (ds/opt :name) string?
   })

(def tagged-vehicle-spec
  (ds/spec
    {:name ::tagged-vehicle
     :spec tagged-vehicle-data}))
