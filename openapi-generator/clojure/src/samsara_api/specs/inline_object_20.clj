(ns samsara-api.specs.inline-object-20
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-object-20-data
  {
   (ds/req :groupId) int?
   (ds/req :sensors) (s/coll-of int?)
   })

(def inline-object-20-spec
  (ds/spec
    {:name ::inline-object-20
     :spec inline-object-20-data}))
