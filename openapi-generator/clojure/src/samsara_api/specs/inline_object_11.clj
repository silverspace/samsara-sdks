(ns samsara-api.specs.inline-object-11
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-object-11-data
  {
   (ds/req :groupId) int?
   })

(def inline-object-11-spec
  (ds/spec
    {:name ::inline-object-11
     :spec inline-object-11-data}))
