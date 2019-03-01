(ns samsara-api.specs.dispatch-route-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.dispatch-job-create :refer :all]
            )
  (:import (java.io File)))


(def dispatch-route-create-data
  {
   (ds/opt :actual_end_ms) int?
   (ds/opt :actual_start_ms) int?
   (ds/opt :driver_id) int?
   (ds/opt :group_id) int?
   (ds/req :name) string?
   (ds/req :scheduled_end_ms) int?
   (ds/opt :scheduled_meters) int?
   (ds/req :scheduled_start_ms) int?
   (ds/opt :start_location_address) string?
   (ds/opt :start_location_address_id) int?
   (ds/opt :start_location_lat) float?
   (ds/opt :start_location_lng) float?
   (ds/opt :start_location_name) string?
   (ds/opt :trailer_id) int?
   (ds/opt :vehicle_id) int?
   (ds/req :dispatch_jobs) (s/coll-of dispatch-job-create-spec)
   })

(def dispatch-route-create-spec
  (ds/spec
    {:name ::dispatch-route-create
     :spec dispatch-route-create-data}))
