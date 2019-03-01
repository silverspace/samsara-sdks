(ns samsara-api.specs.inline-response-200-1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.asset-current-locations-response :refer :all]
            )
  (:import (java.io File)))


(def inline-response-200-1-data
  {
   (ds/opt :assets) (s/coll-of asset-current-locations-response-spec)
   })

(def inline-response-200-1-spec
  (ds/spec
    {:name ::inline-response-200-1
     :spec inline-response-200-1-data}))
