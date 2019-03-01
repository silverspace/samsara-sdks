(ns samsara-api.specs.inline-object-5
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-object-5-data
  {
   (ds/req :endMs) int?
   (ds/req :orgId) int?
   (ds/req :startMs) int?
   })

(def inline-object-5-spec
  (ds/spec
    {:name ::inline-object-5
     :spec inline-object-5-data}))
