(ns samsara-api.specs.tagged-address-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tagged-address-base-data
  {
   (ds/req :id) int?
   })

(def tagged-address-base-spec
  (ds/spec
    {:name ::tagged-address-base
     :spec tagged-address-base-data}))
