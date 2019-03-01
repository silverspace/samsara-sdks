(ns samsara-api.specs.user-role
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-role-data
  {
   (ds/opt :id) string?
   (ds/opt :name) string?
   })

(def user-role-spec
  (ds/spec
    {:name ::user-role
     :spec user-role-data}))
