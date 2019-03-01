(ns samsara-api.specs.inline-object-13
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-object-13-data
  {
   (ds/req :groupId) int?
   })

(def inline-object-13-spec
  (ds/spec
    {:name ::inline-object-13
     :spec inline-object-13-data}))
