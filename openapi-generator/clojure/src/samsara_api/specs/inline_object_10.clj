(ns samsara-api.specs.inline-object-10
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-object-10-data
  {
   (ds/req :groupId) int?
   })

(def inline-object-10-spec
  (ds/spec
    {:name ::inline-object-10
     :spec inline-object-10-data}))
