(ns samsara-api.specs.dvir-base-trailer-defects
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def dvir-base-trailer-defects-data
  {
   (ds/opt :comment) string?
   (ds/opt :defectType) string?
   })

(def dvir-base-trailer-defects-spec
  (ds/spec
    {:name ::dvir-base-trailer-defects
     :spec dvir-base-trailer-defects-data}))
