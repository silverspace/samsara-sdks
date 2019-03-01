(ns samsara-api.specs.document-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.document-field :refer :all]
            )
  (:import (java.io File)))


(def document-create-data
  {
   (ds/opt :dispatchJobId) int?
   (ds/opt :notes) string?
   (ds/req :documentTypeUuid) string?
   (ds/req :fields) (s/coll-of document-field-spec)
   })

(def document-create-spec
  (ds/spec
    {:name ::document-create
     :spec document-create-data}))
