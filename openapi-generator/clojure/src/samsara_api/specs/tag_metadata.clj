(ns samsara-api.specs.tag-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tag-metadata-data
  {
   (ds/req :id) int?
   (ds/req :name) string?
   })

(def tag-metadata-spec
  (ds/spec
    {:name ::tag-metadata
     :spec tag-metadata-data}))
