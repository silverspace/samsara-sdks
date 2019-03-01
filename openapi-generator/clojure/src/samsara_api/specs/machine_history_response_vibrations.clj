(ns samsara-api.specs.machine-history-response-vibrations
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def machine-history-response-vibrations-data
  {
   (ds/opt :X) float?
   (ds/opt :Y) float?
   (ds/opt :Z) float?
   (ds/opt :time) int?
   })

(def machine-history-response-vibrations-spec
  (ds/spec
    {:name ::machine-history-response-vibrations
     :spec machine-history-response-vibrations-data}))
