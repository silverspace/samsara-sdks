(ns samsara-api.specs.inline-response-200
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.asset :refer :all]
            )
  (:import (java.io File)))


(def inline-response-200-data
  {
   (ds/opt :assets) (s/coll-of asset-spec)
   })

(def inline-response-200-spec
  (ds/spec
    {:name ::inline-response-200
     :spec inline-response-200-data}))
