(ns samsara-api.specs.asset-cable
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-cable-data
  {
   (ds/opt :assetType) string?
   })

(def asset-cable-spec
  (ds/spec
    {:name ::asset-cable
     :spec asset-cable-data}))
