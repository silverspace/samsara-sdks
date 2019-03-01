(ns samsara-api.specs.document-field-type-number-value-type-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def document-field-type-number-value-type-metadata-data
  {
   (ds/opt :numDecimalPlaces) int?
   })

(def document-field-type-number-value-type-metadata-spec
  (ds/spec
    {:name ::document-field-type-number-value-type-metadata
     :spec document-field-type-number-value-type-metadata-data}))
