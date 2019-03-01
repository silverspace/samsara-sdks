(ns samsara-api.specs.inline-object-19
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-object-19-data
  {
   (ds/req :groupId) int?
   (ds/req :sensors) (s/coll-of int?)
   })

(def inline-object-19-spec
  (ds/spec
    {:name ::inline-object-19
     :spec inline-object-19-data}))
