(ns samsara-api.specs.-sensors-history-series
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def -sensors-history-series-data
  {
   (ds/req :field) string?
   (ds/req :widgetId) int?
   })

(def -sensors-history-series-spec
  (ds/spec
    {:name ::-sensors-history-series
     :spec -sensors-history-series-data}))
