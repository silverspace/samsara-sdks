(ns samsara-api.specs.dispatch-job-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def dispatch-job-create-data
  {
   (ds/opt :destination_address) string?
   (ds/opt :destination_address_id) int?
   (ds/opt :destination_lat) float?
   (ds/opt :destination_lng) float?
   (ds/opt :destination_name) string?
   (ds/opt :notes) string?
   (ds/req :scheduled_arrival_time_ms) int?
   (ds/opt :scheduled_departure_time_ms) int?
   })

(def dispatch-job-create-spec
  (ds/spec
    {:name ::dispatch-job-create
     :spec dispatch-job-create-data}))
