(ns samsara-api.specs.cargo-response-sensors
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def cargo-response-sensors-data
  {
   (ds/opt :cargoEmpty) boolean?
   (ds/opt :name) string?
   (ds/opt :id) int?
   })

(def cargo-response-sensors-spec
  (ds/spec
    {:name ::cargo-response-sensors
     :spec cargo-response-sensors-data}))
