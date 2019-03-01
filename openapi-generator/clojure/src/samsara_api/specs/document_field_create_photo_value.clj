(ns samsara-api.specs.document-field-create-photo-value
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def document-field-create-photo-value-data
  {
   (ds/opt :url) string?
   })

(def document-field-create-photo-value-spec
  (ds/spec
    {:name ::document-field-create-photo-value
     :spec document-field-create-photo-value-data}))
