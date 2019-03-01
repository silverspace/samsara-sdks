(ns samsara-api.specs.user
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.user-tag-role :refer :all]
            )
  (:import (java.io File)))


(def user-data
  {
   (ds/req :authType) string?
   (ds/req :email) string?
   (ds/opt :name) string?
   (ds/opt :organizationRoleId) string?
   (ds/opt :id) int?
   (ds/opt :organizationRole) string?
   (ds/opt :tagRoles) (s/coll-of user-tag-role-spec)
   })

(def user-spec
  (ds/spec
    {:name ::user
     :spec user-data}))
