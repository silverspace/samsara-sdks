(ns samsara-api.specs.inline-object-7
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-object-7-data
  {
   (ds/req :driverId) int?
   (ds/req :endMs) int?
   (ds/req :groupId) int?
   (ds/req :startMs) int?
   })

(def inline-object-7-spec
  (ds/spec
    {:name ::inline-object-7
     :spec inline-object-7-data}))
