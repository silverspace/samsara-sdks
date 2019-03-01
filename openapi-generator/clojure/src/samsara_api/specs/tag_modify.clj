(ns samsara-api.specs.tag-modify
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.tag-modify-add :refer :all]
            [samsara-api.specs.tag-modify-delete :refer :all]
            )
  (:import (java.io File)))


(def tag-modify-data
  {
   (ds/opt :add) tag-modify-add-spec
   (ds/opt :delete) tag-modify-delete-spec
   (ds/opt :name) string?
   (ds/opt :parentTagId) int?
   })

(def tag-modify-spec
  (ds/spec
    {:name ::tag-modify
     :spec tag-modify-data}))
