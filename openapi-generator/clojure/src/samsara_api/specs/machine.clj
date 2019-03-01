(ns samsara-api.specs.machine
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def machine-data
  {
   (ds/req :id) int?
   (ds/opt :name) string?
   (ds/opt :notes) string?
   })

(def machine-spec
  (ds/spec
    {:name ::machine
     :spec machine-data}))
