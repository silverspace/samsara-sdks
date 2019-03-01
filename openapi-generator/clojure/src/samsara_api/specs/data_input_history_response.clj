(ns samsara-api.specs.data-input-history-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.data-input-history-response-points :refer :all]
            )
  (:import (java.io File)))


(def data-input-history-response-data
  {
   (ds/opt :id) int?
   (ds/req :name) string?
   (ds/opt :points) (s/coll-of data-input-history-response-points-spec)
   })

(def data-input-history-response-spec
  (ds/spec
    {:name ::data-input-history-response
     :spec data-input-history-response-data}))
