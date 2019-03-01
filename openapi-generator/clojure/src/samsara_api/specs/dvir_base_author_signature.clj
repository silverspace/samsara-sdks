(ns samsara-api.specs.dvir-base-author-signature
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def dvir-base-author-signature-data
  {
   (ds/opt :mechanicUserId) int?
   (ds/opt :driverId) int?
   (ds/opt :name) string?
   (ds/opt :signedAt) int?
   (ds/opt :type) string?
   (ds/opt :email) string?
   (ds/opt :username) string?
   })

(def dvir-base-author-signature-spec
  (ds/spec
    {:name ::dvir-base-author-signature
     :spec dvir-base-author-signature-data}))
