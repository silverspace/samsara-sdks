(ns samsara-api.specs.drivers-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.driver :refer :all]
            )
  (:import (java.io File)))


(def drivers-response-data
  {
   (ds/opt :drivers) (s/coll-of driver-spec)
   })

(def drivers-response-spec
  (ds/spec
    {:name ::drivers-response
     :spec drivers-response-data}))
