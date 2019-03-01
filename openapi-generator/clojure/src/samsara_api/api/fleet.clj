(ns samsara-api.api.fleet
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


(defn-spec add-fleet-address-with-http-info any?
  "/fleet/add_address
  This method adds an address book entry to the specified group."
  [access_token string?, addressParam inline-object-2]
  (check-required-params access_token addressParam)
  (call-api "/fleet/add_address" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    addressParam
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec add-fleet-address any?
  "/fleet/add_address
  This method adds an address book entry to the specified group."
  [access_token string?, addressParam inline-object-2]
  (let [res (:data (add-fleet-address-with-http-info access_token addressParam))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec add-organization-addresses-with-http-info any?
  "/addresses
  Add one or more addresses to the organization"
  [access_token string?, addresses inline-object]
  (check-required-params access_token addresses)
  (call-api "/addresses" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    addresses
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec add-organization-addresses (s/coll-of address-spec)
  "/addresses
  Add one or more addresses to the organization"
  [access_token string?, addresses inline-object]
  (let [res (:data (add-organization-addresses-with-http-info access_token addresses))]
    (if (:decode-models *api-context*)
       (st/decode (s/coll-of address-spec) res st/string-transformer)
       res)))


(defn-spec create-dispatch-route-with-http-info any?
  "/fleet/dispatch/routes
  Create a new dispatch route."
  [access_token string?, createDispatchRouteParams dispatch-route-create]
  (check-required-params access_token createDispatchRouteParams)
  (call-api "/fleet/dispatch/routes" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    createDispatchRouteParams
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec create-dispatch-route dispatch-route-spec
  "/fleet/dispatch/routes
  Create a new dispatch route."
  [access_token string?, createDispatchRouteParams dispatch-route-create]
  (let [res (:data (create-dispatch-route-with-http-info access_token createDispatchRouteParams))]
    (if (:decode-models *api-context*)
       (st/decode dispatch-route-spec res st/string-transformer)
       res)))


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


(defn-spec create-driver-dispatch-route-with-http-info any?
  "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  Create a new dispatch route for the driver with driver_id."
  [access_token string?, driver_id int?, createDispatchRouteParams dispatch-route-create]
  (check-required-params access_token driver_id createDispatchRouteParams)
  (call-api "/fleet/drivers/{driver_id}/dispatch/routes" :post
            {:path-params   {"driver_id" driver_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    createDispatchRouteParams
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec create-driver-dispatch-route dispatch-route-spec
  "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  Create a new dispatch route for the driver with driver_id."
  [access_token string?, driver_id int?, createDispatchRouteParams dispatch-route-create]
  (let [res (:data (create-driver-dispatch-route-with-http-info access_token driver_id createDispatchRouteParams))]
    (if (:decode-models *api-context*)
       (st/decode dispatch-route-spec res st/string-transformer)
       res)))


(defn-spec create-driver-document-with-http-info any?
  "/fleet/drivers/{driver_id:[0-9]+}/documents
  Create a driver document for the given driver."
  [access_token string?, driver_id int?, createDocumentParams document-create]
  (check-required-params access_token driver_id createDocumentParams)
  (call-api "/fleet/drivers/{driver_id}/documents" :post
            {:path-params   {"driver_id" driver_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    createDocumentParams
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec create-driver-document document-spec
  "/fleet/drivers/{driver_id:[0-9]+}/documents
  Create a driver document for the given driver."
  [access_token string?, driver_id int?, createDocumentParams document-create]
  (let [res (:data (create-driver-document-with-http-info access_token driver_id createDocumentParams))]
    (if (:decode-models *api-context*)
       (st/decode document-spec res st/string-transformer)
       res)))


(defn-spec create-dvir-with-http-info any?
  "/fleet/maintenance/dvirs
  Create a new dvir, marking a vehicle or trailer safe or unsafe."
  [access_token string?, createDvirParam inline-object-12]
  (check-required-params access_token createDvirParam)
  (call-api "/fleet/maintenance/dvirs" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    createDvirParam
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec create-dvir dvir-base-spec
  "/fleet/maintenance/dvirs
  Create a new dvir, marking a vehicle or trailer safe or unsafe."
  [access_token string?, createDvirParam inline-object-12]
  (let [res (:data (create-dvir-with-http-info access_token createDvirParam))]
    (if (:decode-models *api-context*)
       (st/decode dvir-base-spec res st/string-transformer)
       res)))


(defn-spec create-vehicle-dispatch-route-with-http-info any?
  "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  Create a new dispatch route for the vehicle with vehicle_id."
  [access_token string?, vehicle_id int?, createDispatchRouteParams dispatch-route-create]
  (check-required-params access_token vehicle_id createDispatchRouteParams)
  (call-api "/fleet/vehicles/{vehicle_id}/dispatch/routes" :post
            {:path-params   {"vehicle_id" vehicle_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    createDispatchRouteParams
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec create-vehicle-dispatch-route dispatch-route-spec
  "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  Create a new dispatch route for the vehicle with vehicle_id."
  [access_token string?, vehicle_id int?, createDispatchRouteParams dispatch-route-create]
  (let [res (:data (create-vehicle-dispatch-route-with-http-info access_token vehicle_id createDispatchRouteParams))]
    (if (:decode-models *api-context*)
       (st/decode dispatch-route-spec res st/string-transformer)
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


(defn-spec delete-dispatch-route-by-id-with-http-info any?
  "/fleet/dispatch/routes/{route_id:[0-9]+}/
  Delete a dispatch route and its associated jobs."
  [access_token string?, route_id int?]
  (check-required-params access_token route_id)
  (call-api "/fleet/dispatch/routes/{route_id}" :delete
            {:path-params   {"route_id" route_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec delete-dispatch-route-by-id any?
  "/fleet/dispatch/routes/{route_id:[0-9]+}/
  Delete a dispatch route and its associated jobs."
  [access_token string?, route_id int?]
  (let [res (:data (delete-dispatch-route-by-id-with-http-info access_token route_id))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec delete-organization-address-with-http-info any?
  "/addresses/{addressId}
  Delete an address."
  [access_token string?, addressId int?]
  (check-required-params access_token addressId)
  (call-api "/addresses/{addressId}" :delete
            {:path-params   {"addressId" addressId }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec delete-organization-address any?
  "/addresses/{addressId}
  Delete an address."
  [access_token string?, addressId int?]
  (let [res (:data (delete-organization-address-with-http-info access_token addressId))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec fetch-all-dispatch-routes-with-http-info any?
  "/fleet/dispatch/routes
  Fetch all of the dispatch routes for the group."
  ([access_token string?, ] (fetch-all-dispatch-routes-with-http-info access_token nil))
  ([access_token string?, {:keys [group_id end_time duration]} (s/map-of keyword? any?)]
   (check-required-params access_token)
   (call-api "/fleet/dispatch/routes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access_token "group_id" group_id "end_time" end_time "duration" duration }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec fetch-all-dispatch-routes (s/coll-of dispatch-route-spec)
  "/fleet/dispatch/routes
  Fetch all of the dispatch routes for the group."
  ([access_token string?, ] (fetch-all-dispatch-routes access_token nil))
  ([access_token string?, optional-params any?]
   (let [res (:data (fetch-all-dispatch-routes-with-http-info access_token optional-params))]
     (if (:decode-models *api-context*)
        (st/decode (s/coll-of dispatch-route-spec) res st/string-transformer)
        res))))


(defn-spec fetch-all-route-job-updates-with-http-info any?
  "/fleet/dispatch/routes/job_updates
  Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID"
  ([access_token string?, ] (fetch-all-route-job-updates-with-http-info access_token nil))
  ([access_token string?, {:keys [group_id sequence_id include]} (s/map-of keyword? any?)]
   (check-required-params access_token)
   (call-api "/fleet/dispatch/routes/job_updates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access_token "group_id" group_id "sequence_id" sequence_id "include" include }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec fetch-all-route-job-updates all-route-job-updates-spec
  "/fleet/dispatch/routes/job_updates
  Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID"
  ([access_token string?, ] (fetch-all-route-job-updates access_token nil))
  ([access_token string?, optional-params any?]
   (let [res (:data (fetch-all-route-job-updates-with-http-info access_token optional-params))]
     (if (:decode-models *api-context*)
        (st/decode all-route-job-updates-spec res st/string-transformer)
        res))))


(defn-spec get-all-asset-current-locations-with-http-info any?
  "/fleet/assets/locations
  Fetch current locations of all assets for the group."
  ([access_token string?, ] (get-all-asset-current-locations-with-http-info access_token nil))
  ([access_token string?, {:keys [group_id]} (s/map-of keyword? any?)]
   (check-required-params access_token)
   (call-api "/fleet/assets/locations" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access_token "group_id" group_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-all-asset-current-locations inline-response-200-1-spec
  "/fleet/assets/locations
  Fetch current locations of all assets for the group."
  ([access_token string?, ] (get-all-asset-current-locations access_token nil))
  ([access_token string?, optional-params any?]
   (let [res (:data (get-all-asset-current-locations-with-http-info access_token optional-params))]
     (if (:decode-models *api-context*)
        (st/decode inline-response-200-1-spec res st/string-transformer)
        res))))


(defn-spec get-all-assets-with-http-info any?
  "/fleet/assets
  Fetch all of the assets for the group."
  ([access_token string?, ] (get-all-assets-with-http-info access_token nil))
  ([access_token string?, {:keys [group_id]} (s/map-of keyword? any?)]
   (check-required-params access_token)
   (call-api "/fleet/assets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access_token "group_id" group_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-all-assets inline-response-200-spec
  "/fleet/assets
  Fetch all of the assets for the group."
  ([access_token string?, ] (get-all-assets access_token nil))
  ([access_token string?, optional-params any?]
   (let [res (:data (get-all-assets-with-http-info access_token optional-params))]
     (if (:decode-models *api-context*)
        (st/decode inline-response-200-spec res st/string-transformer)
        res))))


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


(defn-spec get-asset-location-with-http-info any?
  "/fleet/assets/{assetId:[0-9]+}/locations
  Fetch the historical locations for the asset."
  [access_token string?, asset_id int?, startMs int?, endMs int?]
  (check-required-params access_token asset_id startMs endMs)
  (call-api "/fleet/assets/{asset_id}/locations" :get
            {:path-params   {"asset_id" asset_id }
             :header-params {}
             :query-params  {"access_token" access_token "startMs" startMs "endMs" endMs }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-asset-location (s/coll-of any?)
  "/fleet/assets/{assetId:[0-9]+}/locations
  Fetch the historical locations for the asset."
  [access_token string?, asset_id int?, startMs int?, endMs int?]
  (let [res (:data (get-asset-location-with-http-info access_token asset_id startMs endMs))]
    (if (:decode-models *api-context*)
       (st/decode (s/coll-of any?) res st/string-transformer)
       res)))


(defn-spec get-asset-reefer-with-http-info any?
  "/fleet/assets/{assetId:[0-9]+}/reefer
  Fetch the reefer-specific stats of an asset."
  [access_token string?, asset_id int?, startMs int?, endMs int?]
  (check-required-params access_token asset_id startMs endMs)
  (call-api "/fleet/assets/{asset_id}/reefer" :get
            {:path-params   {"asset_id" asset_id }
             :header-params {}
             :query-params  {"access_token" access_token "startMs" startMs "endMs" endMs }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-asset-reefer asset-reefer-response-spec
  "/fleet/assets/{assetId:[0-9]+}/reefer
  Fetch the reefer-specific stats of an asset."
  [access_token string?, asset_id int?, startMs int?, endMs int?]
  (let [res (:data (get-asset-reefer-with-http-info access_token asset_id startMs endMs))]
    (if (:decode-models *api-context*)
       (st/decode asset-reefer-response-spec res st/string-transformer)
       res)))


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


(defn-spec get-dispatch-route-by-id-with-http-info any?
  "/fleet/dispatch/routes/{route_id:[0-9]+}
  Fetch a dispatch route by id."
  [access_token string?, route_id int?]
  (check-required-params access_token route_id)
  (call-api "/fleet/dispatch/routes/{route_id}" :get
            {:path-params   {"route_id" route_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-dispatch-route-by-id dispatch-route-spec
  "/fleet/dispatch/routes/{route_id:[0-9]+}
  Fetch a dispatch route by id."
  [access_token string?, route_id int?]
  (let [res (:data (get-dispatch-route-by-id-with-http-info access_token route_id))]
    (if (:decode-models *api-context*)
       (st/decode dispatch-route-spec res st/string-transformer)
       res)))


(defn-spec get-dispatch-route-history-with-http-info any?
  "/fleet/dispatch/routes/{route_id:[0-9]+}/history
  Fetch the history of a dispatch route."
  ([access_token string?, route_id int?, ] (get-dispatch-route-history-with-http-info access_token route_id nil))
  ([access_token string?, route_id int?, {:keys [start_time end_time]} (s/map-of keyword? any?)]
   (check-required-params access_token route_id)
   (call-api "/fleet/dispatch/routes/{route_id}/history" :get
             {:path-params   {"route_id" route_id }
              :header-params {}
              :query-params  {"access_token" access_token "start_time" start_time "end_time" end_time }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-dispatch-route-history dispatch-route-history-spec
  "/fleet/dispatch/routes/{route_id:[0-9]+}/history
  Fetch the history of a dispatch route."
  ([access_token string?, route_id int?, ] (get-dispatch-route-history access_token route_id nil))
  ([access_token string?, route_id int?, optional-params any?]
   (let [res (:data (get-dispatch-route-history-with-http-info access_token route_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode dispatch-route-history-spec res st/string-transformer)
        res))))


(defn-spec get-dispatch-routes-by-driver-id-with-http-info any?
  "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  Fetch all of the dispatch routes for a given driver."
  ([access_token string?, driver_id int?, ] (get-dispatch-routes-by-driver-id-with-http-info access_token driver_id nil))
  ([access_token string?, driver_id int?, {:keys [end_time duration]} (s/map-of keyword? any?)]
   (check-required-params access_token driver_id)
   (call-api "/fleet/drivers/{driver_id}/dispatch/routes" :get
             {:path-params   {"driver_id" driver_id }
              :header-params {}
              :query-params  {"access_token" access_token "end_time" end_time "duration" duration }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-dispatch-routes-by-driver-id (s/coll-of dispatch-route-spec)
  "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  Fetch all of the dispatch routes for a given driver."
  ([access_token string?, driver_id int?, ] (get-dispatch-routes-by-driver-id access_token driver_id nil))
  ([access_token string?, driver_id int?, optional-params any?]
   (let [res (:data (get-dispatch-routes-by-driver-id-with-http-info access_token driver_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode (s/coll-of dispatch-route-spec) res st/string-transformer)
        res))))


(defn-spec get-dispatch-routes-by-vehicle-id-with-http-info any?
  "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  Fetch all of the dispatch routes for a given vehicle."
  ([access_token string?, vehicle_id int?, ] (get-dispatch-routes-by-vehicle-id-with-http-info access_token vehicle_id nil))
  ([access_token string?, vehicle_id int?, {:keys [end_time duration]} (s/map-of keyword? any?)]
   (check-required-params access_token vehicle_id)
   (call-api "/fleet/vehicles/{vehicle_id}/dispatch/routes" :get
             {:path-params   {"vehicle_id" vehicle_id }
              :header-params {}
              :query-params  {"access_token" access_token "end_time" end_time "duration" duration }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-dispatch-routes-by-vehicle-id (s/coll-of dispatch-route-spec)
  "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  Fetch all of the dispatch routes for a given vehicle."
  ([access_token string?, vehicle_id int?, ] (get-dispatch-routes-by-vehicle-id access_token vehicle_id nil))
  ([access_token string?, vehicle_id int?, optional-params any?]
   (let [res (:data (get-dispatch-routes-by-vehicle-id-with-http-info access_token vehicle_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode (s/coll-of dispatch-route-spec) res st/string-transformer)
        res))))


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


(defn-spec get-driver-document-types-by-org-id-with-http-info any?
  "/fleet/drivers/document_types
  Fetch all of the document types."
  []
  (call-api "/fleet/drivers/document_types" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-driver-document-types-by-org-id (s/coll-of document-type-spec)
  "/fleet/drivers/document_types
  Fetch all of the document types."
  []
  (let [res (:data (get-driver-document-types-by-org-id-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode (s/coll-of document-type-spec) res st/string-transformer)
       res)))


(defn-spec get-driver-documents-by-org-id-with-http-info any?
  "/fleet/drivers/documents
  Fetch all of the documents."
  ([access_token string?, ] (get-driver-documents-by-org-id-with-http-info access_token nil))
  ([access_token string?, {:keys [endMs durationMs]} (s/map-of keyword? any?)]
   (check-required-params access_token)
   (call-api "/fleet/drivers/documents" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access_token "endMs" endMs "durationMs" durationMs }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-driver-documents-by-org-id (s/coll-of document-spec)
  "/fleet/drivers/documents
  Fetch all of the documents."
  ([access_token string?, ] (get-driver-documents-by-org-id access_token nil))
  ([access_token string?, optional-params any?]
   (let [res (:data (get-driver-documents-by-org-id-with-http-info access_token optional-params))]
     (if (:decode-models *api-context*)
        (st/decode (s/coll-of document-spec) res st/string-transformer)
        res))))


(defn-spec get-driver-safety-score-with-http-info any?
  "/fleet/drivers/{driverId:[0-9]+}/safety/score
  Fetch the safety score for the driver."
  [driverId int?, access_token string?, startMs int?, endMs int?]
  (check-required-params driverId access_token startMs endMs)
  (call-api "/fleet/drivers/{driverId}/safety/score" :get
            {:path-params   {"driverId" driverId }
             :header-params {}
             :query-params  {"access_token" access_token "startMs" startMs "endMs" endMs }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-driver-safety-score driver-safety-score-response-spec
  "/fleet/drivers/{driverId:[0-9]+}/safety/score
  Fetch the safety score for the driver."
  [driverId int?, access_token string?, startMs int?, endMs int?]
  (let [res (:data (get-driver-safety-score-with-http-info driverId access_token startMs endMs))]
    (if (:decode-models *api-context*)
       (st/decode driver-safety-score-response-spec res st/string-transformer)
       res)))


(defn-spec get-dvirs-with-http-info any?
  "/fleet/maintenance/dvirs
  Get DVIRs for the org within provided time constraints"
  ([access_token string?, end_ms int?, duration_ms int?, ] (get-dvirs-with-http-info access_token end_ms duration_ms nil))
  ([access_token string?, end_ms int?, duration_ms int?, {:keys [group_id]} (s/map-of keyword? any?)]
   (check-required-params access_token end_ms duration_ms)
   (call-api "/fleet/maintenance/dvirs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access_token "end_ms" end_ms "duration_ms" duration_ms "group_id" group_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-dvirs dvir-list-response-spec
  "/fleet/maintenance/dvirs
  Get DVIRs for the org within provided time constraints"
  ([access_token string?, end_ms int?, duration_ms int?, ] (get-dvirs access_token end_ms duration_ms nil))
  ([access_token string?, end_ms int?, duration_ms int?, optional-params any?]
   (let [res (:data (get-dvirs-with-http-info access_token end_ms duration_ms optional-params))]
     (if (:decode-models *api-context*)
        (st/decode dvir-list-response-spec res st/string-transformer)
        res))))


(defn-spec get-fleet-drivers-with-http-info any?
  "/fleet/drivers
  Get all the drivers for the specified group."
  [access_token string?, groupDriversParam inline-object-3]
  (check-required-params access_token groupDriversParam)
  (call-api "/fleet/drivers" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    groupDriversParam
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-fleet-drivers drivers-response-spec
  "/fleet/drivers
  Get all the drivers for the specified group."
  [access_token string?, groupDriversParam inline-object-3]
  (let [res (:data (get-fleet-drivers-with-http-info access_token groupDriversParam))]
    (if (:decode-models *api-context*)
       (st/decode drivers-response-spec res st/string-transformer)
       res)))


(defn-spec get-fleet-drivers-hos-daily-logs-with-http-info any?
  "/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
  Get summarized daily HOS charts for a specified driver."
  [access_token string?, driver_id int?, hosLogsParam inline-object-6]
  (check-required-params access_token driver_id hosLogsParam)
  (call-api "/fleet/drivers/{driver_id}/hos_daily_logs" :post
            {:path-params   {"driver_id" driver_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    hosLogsParam
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-fleet-drivers-hos-daily-logs driver-daily-log-response-spec
  "/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
  Get summarized daily HOS charts for a specified driver."
  [access_token string?, driver_id int?, hosLogsParam inline-object-6]
  (let [res (:data (get-fleet-drivers-hos-daily-logs-with-http-info access_token driver_id hosLogsParam))]
    (if (:decode-models *api-context*)
       (st/decode driver-daily-log-response-spec res st/string-transformer)
       res)))


(defn-spec get-fleet-drivers-summary-with-http-info any?
  "/fleet/drivers/summary
  Get the distance and time each driver in an organization has driven in a given time period."
  ([access_token string?, driversSummaryParam inline-object-5, ] (get-fleet-drivers-summary-with-http-info access_token driversSummaryParam nil))
  ([access_token string?, driversSummaryParam inline-object-5, {:keys [snap_to_day_bounds]} (s/map-of keyword? any?)]
   (check-required-params access_token driversSummaryParam)
   (call-api "/fleet/drivers/summary" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access_token "snap_to_day_bounds" snap_to_day_bounds }
              :form-params   {}
              :body-param    driversSummaryParam
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-fleet-drivers-summary drivers-summary-response-spec
  "/fleet/drivers/summary
  Get the distance and time each driver in an organization has driven in a given time period."
  ([access_token string?, driversSummaryParam inline-object-5, ] (get-fleet-drivers-summary access_token driversSummaryParam nil))
  ([access_token string?, driversSummaryParam inline-object-5, optional-params any?]
   (let [res (:data (get-fleet-drivers-summary-with-http-info access_token driversSummaryParam optional-params))]
     (if (:decode-models *api-context*)
        (st/decode drivers-summary-response-spec res st/string-transformer)
        res))))


(defn-spec get-fleet-hos-authentication-logs-with-http-info any?
  "/fleet/hos_authentication_logs
  Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information."
  [access_token string?, hosAuthenticationLogsParam inline-object-7]
  (check-required-params access_token hosAuthenticationLogsParam)
  (call-api "/fleet/hos_authentication_logs" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    hosAuthenticationLogsParam
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-fleet-hos-authentication-logs hos-authentication-logs-response-spec
  "/fleet/hos_authentication_logs
  Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information."
  [access_token string?, hosAuthenticationLogsParam inline-object-7]
  (let [res (:data (get-fleet-hos-authentication-logs-with-http-info access_token hosAuthenticationLogsParam))]
    (if (:decode-models *api-context*)
       (st/decode hos-authentication-logs-response-spec res st/string-transformer)
       res)))


(defn-spec get-fleet-hos-logs-with-http-info any?
  "/fleet/hos_logs
  Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period."
  [access_token string?, hosLogsParam inline-object-8]
  (check-required-params access_token hosLogsParam)
  (call-api "/fleet/hos_logs" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    hosLogsParam
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-fleet-hos-logs hos-logs-response-spec
  "/fleet/hos_logs
  Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period."
  [access_token string?, hosLogsParam inline-object-8]
  (let [res (:data (get-fleet-hos-logs-with-http-info access_token hosLogsParam))]
    (if (:decode-models *api-context*)
       (st/decode hos-logs-response-spec res st/string-transformer)
       res)))


(defn-spec get-fleet-hos-logs-summary-with-http-info any?
  "/fleet/hos_logs_summary
  Get the current HOS status for all drivers in the group."
  [access_token string?, hosLogsParam inline-object-9]
  (check-required-params access_token hosLogsParam)
  (call-api "/fleet/hos_logs_summary" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    hosLogsParam
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-fleet-hos-logs-summary hos-logs-summary-response-spec
  "/fleet/hos_logs_summary
  Get the current HOS status for all drivers in the group."
  [access_token string?, hosLogsParam inline-object-9]
  (let [res (:data (get-fleet-hos-logs-summary-with-http-info access_token hosLogsParam))]
    (if (:decode-models *api-context*)
       (st/decode hos-logs-summary-response-spec res st/string-transformer)
       res)))


(defn-spec get-fleet-locations-with-http-info any?
  "/fleet/locations
  Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group."
  [access_token string?, groupParam inline-object-11]
  (check-required-params access_token groupParam)
  (call-api "/fleet/locations" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    groupParam
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-fleet-locations inline-response-200-3-spec
  "/fleet/locations
  Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group."
  [access_token string?, groupParam inline-object-11]
  (let [res (:data (get-fleet-locations-with-http-info access_token groupParam))]
    (if (:decode-models *api-context*)
       (st/decode inline-response-200-3-spec res st/string-transformer)
       res)))


(defn-spec get-fleet-maintenance-list-with-http-info any?
  "/fleet/maintenance/list
  Get list of the vehicles with any engine faults or check light data."
  [access_token string?, groupParam inline-object-13]
  (check-required-params access_token groupParam)
  (call-api "/fleet/maintenance/list" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    groupParam
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-fleet-maintenance-list inline-response-200-4-spec
  "/fleet/maintenance/list
  Get list of the vehicles with any engine faults or check light data."
  [access_token string?, groupParam inline-object-13]
  (let [res (:data (get-fleet-maintenance-list-with-http-info access_token groupParam))]
    (if (:decode-models *api-context*)
       (st/decode inline-response-200-4-spec res st/string-transformer)
       res)))


(defn-spec get-fleet-trips-with-http-info any?
  "/fleet/trips
  Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range."
  [access_token string?, tripsParam inline-object-15]
  (check-required-params access_token tripsParam)
  (call-api "/fleet/trips" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    tripsParam
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-fleet-trips trip-response-spec
  "/fleet/trips
  Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range."
  [access_token string?, tripsParam inline-object-15]
  (let [res (:data (get-fleet-trips-with-http-info access_token tripsParam))]
    (if (:decode-models *api-context*)
       (st/decode trip-response-spec res st/string-transformer)
       res)))


(defn-spec get-fleet-vehicle-with-http-info any?
  "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Gets a specific vehicle."
  [access_token string?, vehicle_id_or_external_id string?]
  (check-required-params access_token vehicle_id_or_external_id)
  (call-api "/fleet/vehicles/{vehicle_id_or_external_id}" :get
            {:path-params   {"vehicle_id_or_external_id" vehicle_id_or_external_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-fleet-vehicle fleet-vehicle-response-spec
  "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Gets a specific vehicle."
  [access_token string?, vehicle_id_or_external_id string?]
  (let [res (:data (get-fleet-vehicle-with-http-info access_token vehicle_id_or_external_id))]
    (if (:decode-models *api-context*)
       (st/decode fleet-vehicle-response-spec res st/string-transformer)
       res)))


(defn-spec get-organization-address-with-http-info any?
  "/addresses/{addressId}
  Fetch an address by its id."
  [access_token string?, addressId int?]
  (check-required-params access_token addressId)
  (call-api "/addresses/{addressId}" :get
            {:path-params   {"addressId" addressId }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-organization-address address-spec
  "/addresses/{addressId}
  Fetch an address by its id."
  [access_token string?, addressId int?]
  (let [res (:data (get-organization-address-with-http-info access_token addressId))]
    (if (:decode-models *api-context*)
       (st/decode address-spec res st/string-transformer)
       res)))


(defn-spec get-organization-addresses-with-http-info any?
  "/addresses
  Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries."
  [access_token string?]
  (check-required-params access_token)
  (call-api "/addresses" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-organization-addresses (s/coll-of address-spec)
  "/addresses
  Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries."
  [access_token string?]
  (let [res (:data (get-organization-addresses-with-http-info access_token))]
    (if (:decode-models *api-context*)
       (st/decode (s/coll-of address-spec) res st/string-transformer)
       res)))


(defn-spec get-organization-contact-with-http-info any?
  "/contacts/{contact_id}
  Fetch a contact by its id."
  [access_token string?, contact_id int?]
  (check-required-params access_token contact_id)
  (call-api "/contacts/{contact_id}" :get
            {:path-params   {"contact_id" contact_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-organization-contact contact-spec
  "/contacts/{contact_id}
  Fetch a contact by its id."
  [access_token string?, contact_id int?]
  (let [res (:data (get-organization-contact-with-http-info access_token contact_id))]
    (if (:decode-models *api-context*)
       (st/decode contact-spec res st/string-transformer)
       res)))


(defn-spec get-vehicle-harsh-event-with-http-info any?
  "/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
  Fetch harsh event details for a vehicle."
  [vehicleId int?, access_token string?, timestamp int?]
  (check-required-params vehicleId access_token timestamp)
  (call-api "/fleet/vehicles/{vehicleId}/safety/harsh_event" :get
            {:path-params   {"vehicleId" vehicleId }
             :header-params {}
             :query-params  {"access_token" access_token "timestamp" timestamp }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-vehicle-harsh-event vehicle-harsh-event-response-spec
  "/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
  Fetch harsh event details for a vehicle."
  [vehicleId int?, access_token string?, timestamp int?]
  (let [res (:data (get-vehicle-harsh-event-with-http-info vehicleId access_token timestamp))]
    (if (:decode-models *api-context*)
       (st/decode vehicle-harsh-event-response-spec res st/string-transformer)
       res)))


(defn-spec get-vehicle-locations-with-http-info any?
  "/fleet/vehicles/{vehicle_id:[0-9]+}/locations
  Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour."
  [access_token string?, vehicle_id int?, startMs int?, endMs int?]
  (check-required-params access_token vehicle_id startMs endMs)
  (call-api "/fleet/vehicles/{vehicle_id}/locations" :get
            {:path-params   {"vehicle_id" vehicle_id }
             :header-params {}
             :query-params  {"access_token" access_token "startMs" startMs "endMs" endMs }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-vehicle-locations (s/coll-of fleet-vehicle-location-spec)
  "/fleet/vehicles/{vehicle_id:[0-9]+}/locations
  Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour."
  [access_token string?, vehicle_id int?, startMs int?, endMs int?]
  (let [res (:data (get-vehicle-locations-with-http-info access_token vehicle_id startMs endMs))]
    (if (:decode-models *api-context*)
       (st/decode (s/coll-of fleet-vehicle-location-spec) res st/string-transformer)
       res)))


(defn-spec get-vehicle-safety-score-with-http-info any?
  "/fleet/vehicles/{vehicleId:[0-9]+}/safety/score
  Fetch the safety score for the vehicle."
  [vehicleId int?, access_token string?, startMs int?, endMs int?]
  (check-required-params vehicleId access_token startMs endMs)
  (call-api "/fleet/vehicles/{vehicleId}/safety/score" :get
            {:path-params   {"vehicleId" vehicleId }
             :header-params {}
             :query-params  {"access_token" access_token "startMs" startMs "endMs" endMs }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-vehicle-safety-score vehicle-safety-score-response-spec
  "/fleet/vehicles/{vehicleId:[0-9]+}/safety/score
  Fetch the safety score for the vehicle."
  [vehicleId int?, access_token string?, startMs int?, endMs int?]
  (let [res (:data (get-vehicle-safety-score-with-http-info vehicleId access_token startMs endMs))]
    (if (:decode-models *api-context*)
       (st/decode vehicle-safety-score-response-spec res st/string-transformer)
       res)))


(defn-spec get-vehicle-stats-with-http-info any?
  "/fleet/vehicles/stats
  Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time."
  ([access_token string?, startMs int?, endMs int?, ] (get-vehicle-stats-with-http-info access_token startMs endMs nil))
  ([access_token string?, startMs int?, endMs int?, {:keys [series tagIds startingAfter endingBefore limit]} (s/map-of keyword? any?)]
   (check-required-params access_token startMs endMs)
   (call-api "/fleet/vehicles/stats" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access_token "startMs" startMs "endMs" endMs "series" series "tagIds" tagIds "startingAfter" startingAfter "endingBefore" endingBefore "limit" limit }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-vehicle-stats inline-response-200-5-spec
  "/fleet/vehicles/stats
  Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time."
  ([access_token string?, startMs int?, endMs int?, ] (get-vehicle-stats access_token startMs endMs nil))
  ([access_token string?, startMs int?, endMs int?, optional-params any?]
   (let [res (:data (get-vehicle-stats-with-http-info access_token startMs endMs optional-params))]
     (if (:decode-models *api-context*)
        (st/decode inline-response-200-5-spec res st/string-transformer)
        res))))


(defn-spec get-vehicles-locations-with-http-info any?
  "/fleet/vehicles/locations
  Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes."
  [access_token string?, startMs int?, endMs int?]
  (check-required-params access_token startMs endMs)
  (call-api "/fleet/vehicles/locations" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token "startMs" startMs "endMs" endMs }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-vehicles-locations (s/coll-of any?)
  "/fleet/vehicles/locations
  Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes."
  [access_token string?, startMs int?, endMs int?]
  (let [res (:data (get-vehicles-locations-with-http-info access_token startMs endMs))]
    (if (:decode-models *api-context*)
       (st/decode (s/coll-of any?) res st/string-transformer)
       res)))


(defn-spec list-contacts-with-http-info any?
  "/contacts
  Fetch all contacts for the organization."
  [access_token string?]
  (check-required-params access_token)
  (call-api "/contacts" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec list-contacts (s/coll-of contact-spec)
  "/contacts
  Fetch all contacts for the organization."
  [access_token string?]
  (let [res (:data (list-contacts-with-http-info access_token))]
    (if (:decode-models *api-context*)
       (st/decode (s/coll-of contact-spec) res st/string-transformer)
       res)))


(defn-spec list-fleet-with-http-info any?
  "/fleet/list
  Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them."
  ([access_token string?, groupParam inline-object-10, ] (list-fleet-with-http-info access_token groupParam nil))
  ([access_token string?, groupParam inline-object-10, {:keys [startingAfter endingBefore limit]} (s/map-of keyword? any?)]
   (check-required-params access_token groupParam)
   (call-api "/fleet/list" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access_token "startingAfter" startingAfter "endingBefore" endingBefore "limit" limit }
              :form-params   {}
              :body-param    groupParam
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec list-fleet inline-response-200-2-spec
  "/fleet/list
  Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them."
  ([access_token string?, groupParam inline-object-10, ] (list-fleet access_token groupParam nil))
  ([access_token string?, groupParam inline-object-10, optional-params any?]
   (let [res (:data (list-fleet-with-http-info access_token groupParam optional-params))]
     (if (:decode-models *api-context*)
        (st/decode inline-response-200-2-spec res st/string-transformer)
        res))))


(defn-spec patch-fleet-vehicle-with-http-info any?
  "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396."
  [access_token string?, vehicle_id_or_external_id string?, data inline-object-16]
  (check-required-params access_token vehicle_id_or_external_id data)
  (call-api "/fleet/vehicles/{vehicle_id_or_external_id}" :patch
            {:path-params   {"vehicle_id_or_external_id" vehicle_id_or_external_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    data
             :content-types ["application/json" "application/merge-patch+json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec patch-fleet-vehicle fleet-vehicle-response-spec
  "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396."
  [access_token string?, vehicle_id_or_external_id string?, data inline-object-16]
  (let [res (:data (patch-fleet-vehicle-with-http-info access_token vehicle_id_or_external_id data))]
    (if (:decode-models *api-context*)
       (st/decode fleet-vehicle-response-spec res st/string-transformer)
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


(defn-spec update-dispatch-route-by-id-with-http-info any?
  "/fleet/dispatch/routes/{route_id:[0-9]+}/
  Update a dispatch route and its associated jobs."
  [access_token string?, route_id int?, updateDispatchRouteParams dispatch-route]
  (check-required-params access_token route_id updateDispatchRouteParams)
  (call-api "/fleet/dispatch/routes/{route_id}" :put
            {:path-params   {"route_id" route_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    updateDispatchRouteParams
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec update-dispatch-route-by-id dispatch-route-spec
  "/fleet/dispatch/routes/{route_id:[0-9]+}/
  Update a dispatch route and its associated jobs."
  [access_token string?, route_id int?, updateDispatchRouteParams dispatch-route]
  (let [res (:data (update-dispatch-route-by-id-with-http-info access_token route_id updateDispatchRouteParams))]
    (if (:decode-models *api-context*)
       (st/decode dispatch-route-spec res st/string-transformer)
       res)))


(defn-spec update-organization-address-with-http-info any?
  "/addresses/{addressId}
  Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string."
  [access_token string?, addressId int?, address inline-object-1]
  (check-required-params access_token addressId address)
  (call-api "/addresses/{addressId}" :patch
            {:path-params   {"addressId" addressId }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    address
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec update-organization-address any?
  "/addresses/{addressId}
  Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string."
  [access_token string?, addressId int?, address inline-object-1]
  (let [res (:data (update-organization-address-with-http-info access_token addressId address))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec update-vehicles-with-http-info any?
  "/fleet/set_data
  This method enables the mutation of metadata for vehicles in the Samsara Cloud."
  [access_token string?, vehicleUpdateParam inline-object-14]
  (check-required-params access_token vehicleUpdateParam)
  (call-api "/fleet/set_data" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    vehicleUpdateParam
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec update-vehicles any?
  "/fleet/set_data
  This method enables the mutation of metadata for vehicles in the Samsara Cloud."
  [access_token string?, vehicleUpdateParam inline-object-14]
  (let [res (:data (update-vehicles-with-http-info access_token vehicleUpdateParam))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


