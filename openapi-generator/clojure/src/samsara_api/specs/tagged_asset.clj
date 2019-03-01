(ns samsara-api.specs.tagged-asset
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tagged-asset-data
  {
   (ds/req :id) int?
   (ds/opt :name) string?
   })

(def tagged-asset-spec
  (ds/spec
    {:name ::tagged-asset
     :spec tagged-asset-data}))
