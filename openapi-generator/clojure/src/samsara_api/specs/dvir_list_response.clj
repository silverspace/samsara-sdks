(ns samsara-api.specs.dvir-list-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.dvir-base :refer :all]
            )
  (:import (java.io File)))


(def dvir-list-response-data
  {
   (ds/opt :dvirs) (s/coll-of dvir-base-spec)
   })

(def dvir-list-response-spec
  (ds/spec
    {:name ::dvir-list-response
     :spec dvir-list-response-data}))
