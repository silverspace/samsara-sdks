(ns samsara-api.specs.inline-object-3
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-object-3-data
  {
   (ds/req :groupId) int?
   })

(def inline-object-3-spec
  (ds/spec
    {:name ::inline-object-3
     :spec inline-object-3-data}))
