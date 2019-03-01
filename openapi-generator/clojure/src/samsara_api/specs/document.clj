(ns samsara-api.specs.document
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.document-field :refer :all]
            )
  (:import (java.io File)))


(def document-data
  {
   (ds/opt :dispatchJobId) int?
   (ds/opt :notes) string?
   (ds/req :documentType) string?
   (ds/req :driverCreatedAtMs) int?
   (ds/req :driverId) int?
   (ds/req :fields) (s/coll-of document-field-spec)
   (ds/opt :vehicleId) int?
   })

(def document-spec
  (ds/spec
    {:name ::document
     :spec document-data}))
