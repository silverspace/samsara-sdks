(ns samsara-api.specs.tagged-machine
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tagged-machine-data
  {
   (ds/req :id) int?
   (ds/opt :name) string?
   })

(def tagged-machine-spec
  (ds/spec
    {:name ::tagged-machine
     :spec tagged-machine-data}))
