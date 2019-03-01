(ns samsara-api.specs.machine-history-response-machines
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.machine-history-response-vibrations :refer :all]
            )
  (:import (java.io File)))


(def machine-history-response-machines-data
  {
   (ds/opt :name) string?
   (ds/opt :id) int?
   (ds/opt :vibrations) (s/coll-of machine-history-response-vibrations-spec)
   })

(def machine-history-response-machines-spec
  (ds/spec
    {:name ::machine-history-response-machines
     :spec machine-history-response-machines-data}))
