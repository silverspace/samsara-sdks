(ns samsara-api.specs.vehicle-harsh-event-response-location
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def vehicle-harsh-event-response-location-data
  {
   (ds/opt :address) string?
   (ds/opt :latitude) string?
   (ds/opt :longitude) string?
   })

(def vehicle-harsh-event-response-location-spec
  (ds/spec
    {:name ::vehicle-harsh-event-response-location
     :spec vehicle-harsh-event-response-location-data}))
