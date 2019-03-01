(ns samsara-api.specs.contact
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def contact-data
  {
   (ds/opt :email) string?
   (ds/opt :firstName) string?
   (ds/opt :id) int?
   (ds/opt :lastName) string?
   (ds/opt :phone) string?
   })

(def contact-spec
  (ds/spec
    {:name ::contact
     :spec contact-data}))
