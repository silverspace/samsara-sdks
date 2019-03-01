(ns samsara-api.specs.prev-job-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def prev-job-status-data
  {
   })

(def prev-job-status-spec
  (ds/spec
    {:name ::prev-job-status
     :spec prev-job-status-data}))
