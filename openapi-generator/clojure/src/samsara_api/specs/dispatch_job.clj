(ns samsara-api.specs.dispatch-job
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.job-status :refer :all]
            )
  (:import (java.io File)))


(def dispatch-job-data
  {
   (ds/opt :destination_address) string?
   (ds/opt :destination_address_id) int?
   (ds/opt :destination_lat) float?
   (ds/opt :destination_lng) float?
   (ds/opt :destination_name) string?
   (ds/opt :notes) string?
   (ds/req :scheduled_arrival_time_ms) int?
   (ds/opt :scheduled_departure_time_ms) int?
   (ds/opt :arrived_at_ms) int?
   (ds/opt :completed_at_ms) int?
   (ds/req :dispatch_route_id) int?
   (ds/opt :driver_id) int?
   (ds/opt :en_route_at_ms) int?
   (ds/opt :estimated_arrival_ms) int?
   (ds/opt :fleet_viewer_url) string?
   (ds/req :group_id) int?
   (ds/req :id) int?
   (ds/req :job_state) job-status-spec
   (ds/opt :skipped_at_ms) int?
   (ds/opt :vehicle_id) int?
   })

(def dispatch-job-spec
  (ds/spec
    {:name ::dispatch-job
     :spec dispatch-job-data}))
