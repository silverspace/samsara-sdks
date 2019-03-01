(ns samsara-api.specs.machine-history-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.machine-history-response-machines :refer :all]
            )
  (:import (java.io File)))


(def machine-history-response-data
  {
   (ds/opt :machines) (s/coll-of machine-history-response-machines-spec)
   })

(def machine-history-response-spec
  (ds/spec
    {:name ::machine-history-response
     :spec machine-history-response-data}))
