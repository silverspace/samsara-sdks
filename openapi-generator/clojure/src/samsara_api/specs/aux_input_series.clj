(ns samsara-api.specs.aux-input-series
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.aux-input :refer :all]
            )
  (:import (java.io File)))


(def aux-input-series-data
  {
   (ds/req :name) string?
   (ds/req :values) (s/coll-of aux-input-spec)
   })

(def aux-input-series-spec
  (ds/spec
    {:name ::aux-input-series
     :spec aux-input-series-data}))
