(ns samsara-api.specs.dvir-base-vehicle
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def dvir-base-vehicle-data
  {
   (ds/opt :name) string?
   (ds/opt :id) int?
   })

(def dvir-base-vehicle-spec
  (ds/spec
    {:name ::dvir-base-vehicle
     :spec dvir-base-vehicle-data}))
