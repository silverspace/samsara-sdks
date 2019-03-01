(ns samsara-api.specs.tagged-vehicle-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tagged-vehicle-base-data
  {
   (ds/req :id) int?
   })

(def tagged-vehicle-base-spec
  (ds/spec
    {:name ::tagged-vehicle-base
     :spec tagged-vehicle-base-data}))
