(ns samsara-api.specs.engine-state
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def engine-state-data
  {
   (ds/req :timeMs) any?
   (ds/req :value) string?
   })

(def engine-state-spec
  (ds/spec
    {:name ::engine-state
     :spec engine-state-data}))
