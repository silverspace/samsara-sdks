(ns samsara-api.specs.document-field
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.document-field-create-photo-value :refer :all]
            [samsara-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def document-field-data
  {
   (ds/opt :numberValue) float?
   (ds/opt :photoValue) (s/coll-of document-field-create-photo-value-spec)
   (ds/opt :stringValue) string?
   (ds/req :valueType) string?
   (ds/req :label) string?
   (ds/opt :value) any?
   })

(def document-field-spec
  (ds/spec
    {:name ::document-field
     :spec document-field-data}))
