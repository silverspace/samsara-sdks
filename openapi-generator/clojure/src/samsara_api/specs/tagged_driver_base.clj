(ns samsara-api.specs.tagged-driver-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tagged-driver-base-data
  {
   (ds/req :id) int?
   })

(def tagged-driver-base-spec
  (ds/spec
    {:name ::tagged-driver-base
     :spec tagged-driver-base-data}))
