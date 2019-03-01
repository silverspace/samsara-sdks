(ns samsara-api.specs.user-tag-role-tag
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-tag-role-tag-data
  {
   (ds/opt :parentTagId) int?
   (ds/req :name) string?
   (ds/req :id) int?
   })

(def user-tag-role-tag-spec
  (ds/spec
    {:name ::user-tag-role-tag
     :spec user-tag-role-tag-data}))
