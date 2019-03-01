(ns samsara-api.specs.inline-object-2
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-object-2-data
  {
   (ds/req :address) string?
   (ds/req :groupId) int?
   (ds/req :name) string?
   (ds/req :radius) int?
   })

(def inline-object-2-spec
  (ds/spec
    {:name ::inline-object-2
     :spec inline-object-2-data}))
