(ns samsara-api.specs.trip-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.trip-response-trips :refer :all]
            )
  (:import (java.io File)))


(def trip-response-data
  {
   (ds/opt :trips) (s/coll-of trip-response-trips-spec)
   })

(def trip-response-spec
  (ds/spec
    {:name ::trip-response
     :spec trip-response-data}))
