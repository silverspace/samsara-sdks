(ns samsara-api.specs.document-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def document-base-data
  {
   (ds/opt :dispatchJobId) int?
   (ds/opt :notes) string?
   })

(def document-base-spec
  (ds/spec
    {:name ::document-base
     :spec document-base-data}))
