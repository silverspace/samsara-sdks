(ns samsara-api.specs.document-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def document-type-data
  {
   (ds/opt :fieldTypes) (s/coll-of list?)
   (ds/req :name) string?
   (ds/req :orgId) int?
   (ds/req :uuid) string?
   })

(def document-type-spec
  (ds/spec
    {:name ::document-type
     :spec document-type-data}))
