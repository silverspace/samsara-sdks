(ns samsara-api.specs.dispatch-route-historical-entry
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.dispatch-route :refer :all]
            )
  (:import (java.io File)))


(def dispatch-route-historical-entry-data
  {
   (ds/opt :changed_at_ms) int?
   (ds/opt :route) dispatch-route-spec
   })

(def dispatch-route-historical-entry-spec
  (ds/spec
    {:name ::dispatch-route-historical-entry
     :spec dispatch-route-historical-entry-data}))
