(ns samsara-api.api.drivers
  (:require [samsara-api.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [samsara-api.specs.fleet-vehicle-response :refer :all]
            [samsara-api.specs.hos-logs-response :refer :all]
            [samsara-api.specs.drivers-summary-response :refer :all]
            [samsara-api.specs.dvir-base :refer :all]
            [samsara-api.specs.document-field-create-photo-value :refer :all]
            [samsara-api.specs.temperature-response-sensors :refer :all]
            [samsara-api.specs.aux-input :refer :all]
            [samsara-api.specs.vehicle-safety-score-response :refer :all]
            [samsara-api.specs.vehicle-maintenance-passenger-diagnostic-trouble-codes :refer :all]
            [samsara-api.specs.vehicle-maintenance-passenger :refer :all]
            [samsara-api.specs.dispatch-route-create :refer :all]
            [samsara-api.specs.tagged-address :refer :all]
            [samsara-api.specs.cargo-response :refer :all]
            [samsara-api.specs.user-tag-role-tag :refer :all]
            [samsara-api.specs.vehicle-maintenance-passenger-check-engine-light :refer :all]
            [samsara-api.specs.vehicle-location :refer :all]
            [samsara-api.specs.job-update-object :refer :all]
            [samsara-api.specs.tagged-asset :refer :all]
            [samsara-api.specs.tag-update :refer :all]
            [samsara-api.specs.address-notes :refer :all]
            [samsara-api.specs.temperature-response :refer :all]
            [samsara-api.specs.dispatch-route-historical-entry :refer :all]
            [samsara-api.specs.fleet-vehicle-response-vehicle-info :refer :all]
            [samsara-api.specs.inline-object-10 :refer :all]
            [samsara-api.specs.inline-object-11 :refer :all]
            [samsara-api.specs.tag-create :refer :all]
            [samsara-api.specs.inline-object-12 :refer :all]
            [samsara-api.specs.dvir-base-author-signature :refer :all]
            [samsara-api.specs.trip-response-trips :refer :all]
            [samsara-api.specs.inline-object-13 :refer :all]
            [samsara-api.specs.-sensors-history-series :refer :all]
            [samsara-api.specs.inline-object-14 :refer :all]
            [samsara-api.specs.inline-object-15 :refer :all]
            [samsara-api.specs.inline-object-16 :refer :all]
            [samsara-api.specs.fleet-vehicle-location :refer :all]
            [samsara-api.specs.humidity-response :refer :all]
            [samsara-api.specs.safety-report-harsh-event :refer :all]
            [samsara-api.specs.tagged-driver-base :refer :all]
            [samsara-api.specs.asset-current-locations-response :refer :all]
            [samsara-api.specs.driver :refer :all]
            [samsara-api.specs.document-field-type-number-value-type-metadata :refer :all]
            [samsara-api.specs.drivers-response :refer :all]
            [samsara-api.specs.data-input-history-response-points :refer :all]
            [samsara-api.specs.inline-object-20 :refer :all]
            [samsara-api.specs.inline-object-21 :refer :all]
            [samsara-api.specs.inline-response-200-9 :refer :all]
            [samsara-api.specs.inline-object-22 :refer :all]
            [samsara-api.specs.inline-response-200-8 :refer :all]
            [samsara-api.specs.user-role :refer :all]
            [samsara-api.specs.inline-response-200-7 :refer :all]
            [samsara-api.specs.inline-object-23 :refer :all]
            [samsara-api.specs.inline-response-200-6 :refer :all]
            [samsara-api.specs.inline-object-24 :refer :all]
            [samsara-api.specs.inline-response-200-5 :refer :all]
            [samsara-api.specs.inline-response-200-4 :refer :all]
            [samsara-api.specs.document :refer :all]
            [samsara-api.specs.inline-response-200-3 :refer :all]
            [samsara-api.specs.asset-reefer-response :refer :all]
            [samsara-api.specs.driver-daily-log-response :refer :all]
            [samsara-api.specs.address-geofence :refer :all]
            [samsara-api.specs.vehicle :refer :all]
            [samsara-api.specs.inline-response-200 :refer :all]
            [samsara-api.specs.door-response :refer :all]
            [samsara-api.specs.document-field :refer :all]
            [samsara-api.specs.inline-object-17 :refer :all]
            [samsara-api.specs.inline-object-18 :refer :all]
            [samsara-api.specs.asset-reefer-response-reefer-stats :refer :all]
            [samsara-api.specs.inline-object-19 :refer :all]
            [samsara-api.specs.vehicle-harsh-event-response :refer :all]
            [samsara-api.specs.hos-authentication-logs-response-authentication-logs :refer :all]
            [samsara-api.specs.tagged-driver :refer :all]
            [samsara-api.specs.address :refer :all]
            [samsara-api.specs.current-driver :refer :all]
            [samsara-api.specs.asset-reefer-response-reefer-stats-alarms-1 :refer :all]
            [samsara-api.specs.sensor-history-response-results :refer :all]
            [samsara-api.specs.dispatch-job-create :refer :all]
            [samsara-api.specs.tagged-vehicle-base :refer :all]
            [samsara-api.specs.document-type :refer :all]
            [samsara-api.specs.vehicle-maintenance-j1939-diagnostic-trouble-codes :refer :all]
            [samsara-api.specs.dispatch-job :refer :all]
            [samsara-api.specs.hos-logs-summary-response-drivers :refer :all]
            [samsara-api.specs.asset-reefer-response-reefer-stats-fuel-percentage :refer :all]
            [samsara-api.specs.machine-history-response-machines :refer :all]
            [samsara-api.specs.tag-modify-delete :refer :all]
            [samsara-api.specs.machine :refer :all]
            [samsara-api.specs.driver-daily-log-response-days :refer :all]
            [samsara-api.specs.hos-logs-summary-response :refer :all]
            [samsara-api.specs.asset-reefer-response-reefer-stats-engine-hours :refer :all]
            [samsara-api.specs.asset :refer :all]
            [samsara-api.specs.tagged-address-base :refer :all]
            [samsara-api.specs.data-input-history-response :refer :all]
            [samsara-api.specs.tagged-sensor-base :refer :all]
            [samsara-api.specs.dvir-base-vehicle :refer :all]
            [samsara-api.specs.dvir-base-trailer-defects :refer :all]
            [samsara-api.specs.tagged-vehicle :refer :all]
            [samsara-api.specs.job-status :refer :all]
            [samsara-api.specs.document-create :refer :all]
            [samsara-api.specs.address-geofence-circle :refer :all]
            [samsara-api.specs.vehicle-maintenance-j1939-check-engine-light :refer :all]
            [samsara-api.specs.humidity-response-sensors :refer :all]
            [samsara-api.specs.asset-reefer-response-reefer-stats-return-air-temp :refer :all]
            [samsara-api.specs.cargo-response-sensors :refer :all]
            [samsara-api.specs.tagged-sensor :refer :all]
            [samsara-api.specs.contact :refer :all]
            [samsara-api.specs.inline-object :refer :all]
            [samsara-api.specs.tag :refer :all]
            [samsara-api.specs.machine-history-response-vibrations :refer :all]
            [samsara-api.specs.engine-state :refer :all]
            [samsara-api.specs.address-geofence-polygon-vertices :refer :all]
            [samsara-api.specs.document-field-type :refer :all]
            [samsara-api.specs.driver-safety-score-response :refer :all]
            [samsara-api.specs.door-response-sensors :refer :all]
            [samsara-api.specs.sensor-history-response :refer :all]
            [samsara-api.specs.asset-reefer-response-reefer-stats-power-status :refer :all]
            [samsara-api.specs.inline-response-200-2 :refer :all]
            [samsara-api.specs.inline-response-200-1 :refer :all]
            [samsara-api.specs.driver-base :refer :all]
            [samsara-api.specs.sensor :refer :all]
            [samsara-api.specs.all-route-job-updates :refer :all]
            [samsara-api.specs.tagged-asset-base :refer :all]
            [samsara-api.specs.inline-object-3 :refer :all]
            [samsara-api.specs.vehicle-maintenance :refer :all]
            [samsara-api.specs.inline-object-2 :refer :all]
            [samsara-api.specs.inline-object-5 :refer :all]
            [samsara-api.specs.pagination :refer :all]
            [samsara-api.specs.inline-object-4 :refer :all]
            [samsara-api.specs.inline-object-7 :refer :all]
            [samsara-api.specs.dispatch-route :refer :all]
            [samsara-api.specs.machine-history-response :refer :all]
            [samsara-api.specs.inline-object-6 :refer :all]
            [samsara-api.specs.drivers-summary-response-summaries :refer :all]
            [samsara-api.specs.dispatch-route-base :refer :all]
            [samsara-api.specs.inline-object-9 :refer :all]
            [samsara-api.specs.inline-object-8 :refer :all]
            [samsara-api.specs.dvir-list-response :refer :all]
            [samsara-api.specs.prev-job-status :refer :all]
            [samsara-api.specs.asset-current-location :refer :all]
            [samsara-api.specs.document-field-create :refer :all]
            [samsara-api.specs.trip-response :refer :all]
            [samsara-api.specs.inline-object-1 :refer :all]
            [samsara-api.specs.tagged-machine-base :refer :all]
            [samsara-api.specs.aux-input-series :refer :all]
            [samsara-api.specs.hos-logs-response-logs :refer :all]
            [samsara-api.specs.tag-modify-add :refer :all]
            [samsara-api.specs.hos-authentication-logs-response :refer :all]
            [samsara-api.specs.user-tag-role :refer :all]
            [samsara-api.specs.inline-response-200-5-vehicle-stats :refer :all]
            [samsara-api.specs.asset-cable :refer :all]
            [samsara-api.specs.driver-for-create :refer :all]
            [samsara-api.specs.-addresses-addresses :refer :all]
            [samsara-api.specs.tag-modify :refer :all]
            [samsara-api.specs.vehicle-harsh-event-response-location :refer :all]
            [samsara-api.specs.user-base :refer :all]
            [samsara-api.specs.tag-metadata :refer :all]
            [samsara-api.specs.trip-response-end-coordinates :refer :all]
            [samsara-api.specs.dvir-base-next-driver-signature :refer :all]
            [samsara-api.specs.error-response :refer :all]
            [samsara-api.specs.address-geofence-polygon :refer :all]
            [samsara-api.specs.vehicle-maintenance-j1939 :refer :all]
            [samsara-api.specs.asset-reefer-response-reefer-stats-set-point :refer :all]
            [samsara-api.specs.document-base :refer :all]
            [samsara-api.specs.tagged-machine :refer :all]
            [samsara-api.specs.asset-reefer-response-reefer-stats-alarms :refer :all]
            [samsara-api.specs.dispatch-route-history :refer :all]
            [samsara-api.specs.user :refer :all]
            [samsara-api.specs.dvir-base-mechanic-or-agent-signature :refer :all]
            [samsara-api.specs.trip-response-start-coordinates :refer :all]
            )
  (:import (java.io File)))


(defn-spec create-driver-with-http-info any?
  "/fleet/drivers/create
  Create a new driver."
  [access_token string?, createDriverParam driver-for-create]
  (check-required-params access_token createDriverParam)
  (call-api "/fleet/drivers/create" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    createDriverParam
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec create-driver driver-spec
  "/fleet/drivers/create
  Create a new driver."
  [access_token string?, createDriverParam driver-for-create]
  (let [res (:data (create-driver-with-http-info access_token createDriverParam))]
    (if (:decode-models *api-context*)
       (st/decode driver-spec res st/string-transformer)
       res)))


(defn-spec deactivate-driver-with-http-info any?
  "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Deactivate a driver with the given id."
  [access_token string?, driver_id_or_external_id string?]
  (check-required-params access_token driver_id_or_external_id)
  (call-api "/fleet/drivers/{driver_id_or_external_id}" :delete
            {:path-params   {"driver_id_or_external_id" driver_id_or_external_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec deactivate-driver any?
  "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Deactivate a driver with the given id."
  [access_token string?, driver_id_or_external_id string?]
  (let [res (:data (deactivate-driver-with-http-info access_token driver_id_or_external_id))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec get-all-deactivated-drivers-with-http-info any?
  "/fleet/drivers/inactive
  Fetch all deactivated drivers for the group."
  ([access_token string?, ] (get-all-deactivated-drivers-with-http-info access_token nil))
  ([access_token string?, {:keys [group_id]} (s/map-of keyword? any?)]
   (check-required-params access_token)
   (call-api "/fleet/drivers/inactive" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access_token "group_id" group_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-all-deactivated-drivers (s/coll-of driver-spec)
  "/fleet/drivers/inactive
  Fetch all deactivated drivers for the group."
  ([access_token string?, ] (get-all-deactivated-drivers access_token nil))
  ([access_token string?, optional-params any?]
   (let [res (:data (get-all-deactivated-drivers-with-http-info access_token optional-params))]
     (if (:decode-models *api-context*)
        (st/decode (s/coll-of driver-spec) res st/string-transformer)
        res))))


(defn-spec get-deactivated-driver-by-id-with-http-info any?
  "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Fetch deactivated driver by id."
  [access_token string?, driver_id_or_external_id string?]
  (check-required-params access_token driver_id_or_external_id)
  (call-api "/fleet/drivers/inactive/{driver_id_or_external_id}" :get
            {:path-params   {"driver_id_or_external_id" driver_id_or_external_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-deactivated-driver-by-id driver-spec
  "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Fetch deactivated driver by id."
  [access_token string?, driver_id_or_external_id string?]
  (let [res (:data (get-deactivated-driver-by-id-with-http-info access_token driver_id_or_external_id))]
    (if (:decode-models *api-context*)
       (st/decode driver-spec res st/string-transformer)
       res)))


(defn-spec get-driver-by-id-with-http-info any?
  "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Fetch driver by id."
  [access_token string?, driver_id_or_external_id string?]
  (check-required-params access_token driver_id_or_external_id)
  (call-api "/fleet/drivers/{driver_id_or_external_id}" :get
            {:path-params   {"driver_id_or_external_id" driver_id_or_external_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-driver-by-id driver-spec
  "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Fetch driver by id."
  [access_token string?, driver_id_or_external_id string?]
  (let [res (:data (get-driver-by-id-with-http-info access_token driver_id_or_external_id))]
    (if (:decode-models *api-context*)
       (st/decode driver-spec res st/string-transformer)
       res)))


(defn-spec reactivate-driver-by-id-with-http-info any?
  "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Reactivate the inactive driver having id."
  [access_token string?, driver_id_or_external_id string?, reactivateDriverParam inline-object-4]
  (check-required-params access_token driver_id_or_external_id reactivateDriverParam)
  (call-api "/fleet/drivers/inactive/{driver_id_or_external_id}" :put
            {:path-params   {"driver_id_or_external_id" driver_id_or_external_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    reactivateDriverParam
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec reactivate-driver-by-id driver-spec
  "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Reactivate the inactive driver having id."
  [access_token string?, driver_id_or_external_id string?, reactivateDriverParam inline-object-4]
  (let [res (:data (reactivate-driver-by-id-with-http-info access_token driver_id_or_external_id reactivateDriverParam))]
    (if (:decode-models *api-context*)
       (st/decode driver-spec res st/string-transformer)
       res)))


