(ns samsara-api.specs.tagged-machine-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tagged-machine-base-data
  {
   (ds/req :id) int?
   })

(def tagged-machine-base-spec
  (ds/spec
    {:name ::tagged-machine-base
     :spec tagged-machine-base-data}))
