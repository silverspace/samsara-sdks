(ns samsara-api.specs.aux-input
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def aux-input-data
  {
   (ds/req :timeMs) any?
   (ds/req :value) boolean?
   })

(def aux-input-spec
  (ds/spec
    {:name ::aux-input
     :spec aux-input-data}))
