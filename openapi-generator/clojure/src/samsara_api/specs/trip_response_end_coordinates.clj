(ns samsara-api.specs.trip-response-end-coordinates
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def trip-response-end-coordinates-data
  {
   (ds/opt :latitude) float?
   (ds/opt :longitude) float?
   })

(def trip-response-end-coordinates-spec
  (ds/spec
    {:name ::trip-response-end-coordinates
     :spec trip-response-end-coordinates-data}))
