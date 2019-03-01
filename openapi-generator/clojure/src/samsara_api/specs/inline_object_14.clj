(ns samsara-api.specs.inline-object-14
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.vehicle :refer :all]
            )
  (:import (java.io File)))


(def inline-object-14-data
  {
   (ds/req :groupId) int?
   (ds/req :vehicles) (s/coll-of vehicle-spec)
   })

(def inline-object-14-spec
  (ds/spec
    {:name ::inline-object-14
     :spec inline-object-14-data}))
