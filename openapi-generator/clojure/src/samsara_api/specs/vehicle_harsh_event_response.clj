(ns samsara-api.specs.vehicle-harsh-event-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.vehicle-harsh-event-response-location :refer :all]
            )
  (:import (java.io File)))


(def vehicle-harsh-event-response-data
  {
   (ds/opt :downloadForwardVideoUrl) string?
   (ds/opt :downloadInwardVideoUrl) string?
   (ds/opt :downloadTrackedInwardVideoUrl) string?
   (ds/req :harshEventType) string?
   (ds/req :incidentReportUrl) string?
   (ds/opt :isDistracted) boolean?
   (ds/opt :location) vehicle-harsh-event-response-location-spec
   })

(def vehicle-harsh-event-response-spec
  (ds/spec
    {:name ::vehicle-harsh-event-response
     :spec vehicle-harsh-event-response-data}))
