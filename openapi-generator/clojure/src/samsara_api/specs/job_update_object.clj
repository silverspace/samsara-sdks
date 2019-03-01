(ns samsara-api.specs.job-update-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.job-status :refer :all]
            [samsara-api.specs.prev-job-status :refer :all]
            [samsara-api.specs.dispatch-route :refer :all]
            )
  (:import (java.io File)))


(def job-update-object-data
  {
   (ds/opt :changed_at_ms) int?
   (ds/opt :job_id) int?
   (ds/opt :job_state) job-status-spec
   (ds/opt :prev_job_state) prev-job-status-spec
   (ds/opt :route) dispatch-route-spec
   (ds/opt :route_id) int?
   })

(def job-update-object-spec
  (ds/spec
    {:name ::job-update-object
     :spec job-update-object-data}))
