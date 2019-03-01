(ns samsara-api.specs.user-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-base-data
  {
   (ds/req :authType) string?
   (ds/req :email) string?
   (ds/opt :name) string?
   (ds/opt :organizationRoleId) string?
   })

(def user-base-spec
  (ds/spec
    {:name ::user-base
     :spec user-base-data}))
