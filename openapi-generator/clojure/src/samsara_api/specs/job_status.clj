(ns samsara-api.specs.job-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def job-status-data
  {
   })

(def job-status-spec
  (ds/spec
    {:name ::job-status
     :spec job-status-data}))
