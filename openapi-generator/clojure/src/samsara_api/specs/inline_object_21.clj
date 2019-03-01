(ns samsara-api.specs.inline-object-21
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.-sensors-history-series :refer :all]
            )
  (:import (java.io File)))


(def inline-object-21-data
  {
   (ds/req :endMs) int?
   (ds/opt :fillMissing) string?
   (ds/req :groupId) int?
   (ds/req :series) (s/coll-of -sensors-history-series-spec)
   (ds/req :startMs) int?
   (ds/req :stepMs) int?
   })

(def inline-object-21-spec
  (ds/spec
    {:name ::inline-object-21
     :spec inline-object-21-data}))
