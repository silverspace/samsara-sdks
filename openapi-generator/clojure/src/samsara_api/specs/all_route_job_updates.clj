(ns samsara-api.specs.all-route-job-updates
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.job-update-object :refer :all]
            )
  (:import (java.io File)))


(def all-route-job-updates-data
  {
   (ds/opt :job_updates) (s/coll-of job-update-object-spec)
   (ds/opt :sequence_id) string?
   })

(def all-route-job-updates-spec
  (ds/spec
    {:name ::all-route-job-updates
     :spec all-route-job-updates-data}))
