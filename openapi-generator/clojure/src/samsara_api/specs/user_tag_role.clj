(ns samsara-api.specs.user-tag-role
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.user-tag-role-tag :refer :all]
            )
  (:import (java.io File)))


(def user-tag-role-data
  {
   (ds/opt :role) string?
   (ds/req :roleId) string?
   (ds/req :tag) user-tag-role-tag-spec
   })

(def user-tag-role-spec
  (ds/spec
    {:name ::user-tag-role
     :spec user-tag-role-data}))
