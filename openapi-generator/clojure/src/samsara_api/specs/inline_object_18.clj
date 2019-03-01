(ns samsara-api.specs.inline-object-18
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-object-18-data
  {
   (ds/req :groupId) int?
   })

(def inline-object-18-spec
  (ds/spec
    {:name ::inline-object-18
     :spec inline-object-18-data}))
