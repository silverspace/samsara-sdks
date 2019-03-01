(ns samsara-api.specs.current-driver
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def current-driver-data
  {
   })

(def current-driver-spec
  (ds/spec
    {:name ::current-driver
     :spec current-driver-data}))
