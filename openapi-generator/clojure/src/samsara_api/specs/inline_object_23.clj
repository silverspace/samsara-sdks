(ns samsara-api.specs.inline-object-23
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-object-23-data
  {
   (ds/req :groupId) int?
   })

(def inline-object-23-spec
  (ds/spec
    {:name ::inline-object-23
     :spec inline-object-23-data}))
