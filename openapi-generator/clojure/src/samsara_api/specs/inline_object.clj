(ns samsara-api.specs.inline-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.-addresses-addresses :refer :all]
            )
  (:import (java.io File)))


(def inline-object-data
  {
   (ds/req :addresses) (s/coll-of -addresses-addresses-spec)
   })

(def inline-object-spec
  (ds/spec
    {:name ::inline-object
     :spec inline-object-data}))
