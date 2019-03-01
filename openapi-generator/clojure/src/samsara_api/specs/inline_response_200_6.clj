(ns samsara-api.specs.inline-response-200-6
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.data-input-history-response :refer :all]
            )
  (:import (java.io File)))


(def inline-response-200-6-data
  {
   (ds/opt :dataInputs) (s/coll-of data-input-history-response-spec)
   })

(def inline-response-200-6-spec
  (ds/spec
    {:name ::inline-response-200-6
     :spec inline-response-200-6-data}))
