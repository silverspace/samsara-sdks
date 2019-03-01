(ns samsara-api.specs.inline-response-200-7
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.machine :refer :all]
            )
  (:import (java.io File)))


(def inline-response-200-7-data
  {
   (ds/opt :machines) (s/coll-of machine-spec)
   })

(def inline-response-200-7-spec
  (ds/spec
    {:name ::inline-response-200-7
     :spec inline-response-200-7-data}))
