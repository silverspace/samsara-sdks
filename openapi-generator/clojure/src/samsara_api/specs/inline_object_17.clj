(ns samsara-api.specs.inline-object-17
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-object-17-data
  {
   (ds/req :endMs) int?
   (ds/req :groupId) int?
   (ds/req :startMs) int?
   })

(def inline-object-17-spec
  (ds/spec
    {:name ::inline-object-17
     :spec inline-object-17-data}))
