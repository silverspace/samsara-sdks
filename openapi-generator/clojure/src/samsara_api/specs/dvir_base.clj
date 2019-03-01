(ns samsara-api.specs.dvir-base
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [samsara-api.specs.dvir-base-author-signature :refer :all]
            [samsara-api.specs.dvir-base-mechanic-or-agent-signature :refer :all]
            [samsara-api.specs.dvir-base-next-driver-signature :refer :all]
            [samsara-api.specs.dvir-base-trailer-defects :refer :all]
            [samsara-api.specs.dvir-base-vehicle :refer :all]
            [samsara-api.specs.dvir-base-trailer-defects :refer :all]
            )
  (:import (java.io File)))


(def dvir-base-data
  {
   (ds/opt :authorSignature) dvir-base-author-signature-spec
   (ds/opt :defectsCorrected) boolean?
   (ds/opt :defectsNeedNotBeCorrected) boolean?
   (ds/opt :id) int?
   (ds/opt :inspectionType) string?
   (ds/opt :mechanicNotes) string?
   (ds/opt :mechanicOrAgentSignature) dvir-base-mechanic-or-agent-signature-spec
   (ds/opt :nextDriverSignature) dvir-base-next-driver-signature-spec
   (ds/opt :odometerMiles) int?
   (ds/opt :timeMs) int?
   (ds/opt :trailerDefects) (s/coll-of dvir-base-trailer-defects-spec)
   (ds/opt :trailerId) int?
   (ds/opt :trailerName) string?
   (ds/opt :vehicle) dvir-base-vehicle-spec
   (ds/opt :vehicleCondition) string?
   (ds/opt :vehicleDefects) (s/coll-of dvir-base-trailer-defects-spec)
   })

(def dvir-base-spec
  (ds/spec
    {:name ::dvir-base
     :spec dvir-base-data}))
