(ns samsara-api.specs.document-field-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.document-field-create-photo-value :refer :all]
            )
  (:import (java.io File)))


(def document-field-create-data
  {
   (ds/opt :numberValue) float?
   (ds/opt :photoValue) (s/coll-of document-field-create-photo-value-spec)
   (ds/opt :stringValue) string?
   (ds/req :valueType) string?
   })

(def document-field-create-spec
  (ds/spec
    {:name ::document-field-create
     :spec document-field-create-data}))
