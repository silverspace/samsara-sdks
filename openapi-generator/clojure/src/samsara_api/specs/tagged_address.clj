(ns samsara-api.specs.tagged-address
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tagged-address-data
  {
   (ds/req :id) int?
   (ds/opt :name) string?
   })

(def tagged-address-spec
  (ds/spec
    {:name ::tagged-address
     :spec tagged-address-data}))
