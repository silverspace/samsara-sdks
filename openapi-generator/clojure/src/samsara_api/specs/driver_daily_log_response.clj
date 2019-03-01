(ns samsara-api.specs.driver-daily-log-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.driver-daily-log-response-days :refer :all]
            )
  (:import (java.io File)))


(def driver-daily-log-response-data
  {
   (ds/opt :days) (s/coll-of driver-daily-log-response-days-spec)
   })

(def driver-daily-log-response-spec
  (ds/spec
    {:name ::driver-daily-log-response
     :spec driver-daily-log-response-data}))
