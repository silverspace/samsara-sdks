(ns samsara-api.specs.inline-object-24
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-object-24-data
  {
   (ds/req :groupId) int?
   (ds/req :sensors) (s/coll-of int?)
   })

(def inline-object-24-spec
  (ds/spec
    {:name ::inline-object-24
     :spec inline-object-24-data}))
