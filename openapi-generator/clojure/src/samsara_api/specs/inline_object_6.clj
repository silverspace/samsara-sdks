(ns samsara-api.specs.inline-object-6
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-object-6-data
  {
   (ds/req :driverId) int?
   (ds/req :endMs) int?
   (ds/req :groupId) int?
   (ds/req :startMs) int?
   })

(def inline-object-6-spec
  (ds/spec
    {:name ::inline-object-6
     :spec inline-object-6-data}))
