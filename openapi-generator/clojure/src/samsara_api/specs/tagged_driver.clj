(ns samsara-api.specs.tagged-driver
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tagged-driver-data
  {
   (ds/req :id) int?
   (ds/opt :name) string?
   })

(def tagged-driver-spec
  (ds/spec
    {:name ::tagged-driver
     :spec tagged-driver-data}))
