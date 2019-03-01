(ns samsara-api.specs.data-input-history-response-points
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def data-input-history-response-points-data
  {
   (ds/opt :value) float?
   (ds/opt :timeMs) int?
   })

(def data-input-history-response-points-spec
  (ds/spec
    {:name ::data-input-history-response-points
     :spec data-input-history-response-points-data}))
