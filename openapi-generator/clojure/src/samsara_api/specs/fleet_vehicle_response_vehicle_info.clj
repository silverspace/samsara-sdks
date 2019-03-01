(ns samsara-api.specs.fleet-vehicle-response-vehicle-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def fleet-vehicle-response-vehicle-info-data
  {
   (ds/opt :year) int?
   (ds/opt :model) string?
   (ds/opt :vin) string?
   (ds/opt :make) string?
   })

(def fleet-vehicle-response-vehicle-info-spec
  (ds/spec
    {:name ::fleet-vehicle-response-vehicle-info
     :spec fleet-vehicle-response-vehicle-info-data}))
