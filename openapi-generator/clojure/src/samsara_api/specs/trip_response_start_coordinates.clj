(ns samsara-api.specs.trip-response-start-coordinates
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def trip-response-start-coordinates-data
  {
   (ds/opt :latitude) float?
   (ds/opt :longitude) float?
   })

(def trip-response-start-coordinates-spec
  (ds/spec
    {:name ::trip-response-start-coordinates
     :spec trip-response-start-coordinates-data}))
