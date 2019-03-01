(ns samsara-api.specs.pagination
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pagination-data
  {
   (ds/req :endCursor) string?
   (ds/req :hasNextPage) boolean?
   (ds/req :hasPrevPage) boolean?
   (ds/req :startCursor) string?
   })

(def pagination-spec
  (ds/spec
    {:name ::pagination
     :spec pagination-data}))
