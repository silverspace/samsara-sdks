(ns samsara-api.specs.drivers-summary-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.drivers-summary-response-summaries :refer :all]
            )
  (:import (java.io File)))


(def drivers-summary-response-data
  {
   (ds/opt :Summaries) (s/coll-of drivers-summary-response-summaries-spec)
   })

(def drivers-summary-response-spec
  (ds/spec
    {:name ::drivers-summary-response
     :spec drivers-summary-response-data}))
