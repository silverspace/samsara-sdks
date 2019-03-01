(ns samsara-api.specs.tagged-asset-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tagged-asset-base-data
  {
   (ds/req :id) int?
   })

(def tagged-asset-base-spec
  (ds/spec
    {:name ::tagged-asset-base
     :spec tagged-asset-base-data}))
