(ns samsara-api.api.routes
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


