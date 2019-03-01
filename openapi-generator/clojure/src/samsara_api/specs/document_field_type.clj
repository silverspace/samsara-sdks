(ns samsara-api.specs.document-field-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.document-field-type-number-value-type-metadata :refer :all]
            )
  (:import (java.io File)))


(def document-field-type-data
  {
   (ds/req :label) string?
   (ds/opt :numberValueTypeMetadata) document-field-type-number-value-type-metadata-spec
   (ds/req :valueType) string?
   })

(def document-field-type-spec
  (ds/spec
    {:name ::document-field-type
     :spec document-field-type-data}))
