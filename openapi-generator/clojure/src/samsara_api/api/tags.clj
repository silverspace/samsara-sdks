(ns samsara-api.api.tags
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


(defn-spec create-tag-with-http-info any?
  "/tags
  Create a new tag for the group."
  [access_token string?, tagCreateParams tag-create]
  (check-required-params access_token tagCreateParams)
  (call-api "/tags" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    tagCreateParams
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec create-tag tag-spec
  "/tags
  Create a new tag for the group."
  [access_token string?, tagCreateParams tag-create]
  (let [res (:data (create-tag-with-http-info access_token tagCreateParams))]
    (if (:decode-models *api-context*)
       (st/decode tag-spec res st/string-transformer)
       res)))


(defn-spec delete-tag-by-id-with-http-info any?
  "/tags/{tag_id:[0-9]+}
  Permanently deletes a tag."
  [access_token string?, tag_id int?]
  (check-required-params access_token tag_id)
  (call-api "/tags/{tag_id}" :delete
            {:path-params   {"tag_id" tag_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec delete-tag-by-id any?
  "/tags/{tag_id:[0-9]+}
  Permanently deletes a tag."
  [access_token string?, tag_id int?]
  (let [res (:data (delete-tag-by-id-with-http-info access_token tag_id))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec get-all-tags-with-http-info any?
  "/tags
  Fetch all of the tags for a group."
  ([access_token string?, ] (get-all-tags-with-http-info access_token nil))
  ([access_token string?, {:keys [group_id]} (s/map-of keyword? any?)]
   (check-required-params access_token)
   (call-api "/tags" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access_token "group_id" group_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-all-tags inline-response-200-9-spec
  "/tags
  Fetch all of the tags for a group."
  ([access_token string?, ] (get-all-tags access_token nil))
  ([access_token string?, optional-params any?]
   (let [res (:data (get-all-tags-with-http-info access_token optional-params))]
     (if (:decode-models *api-context*)
        (st/decode inline-response-200-9-spec res st/string-transformer)
        res))))


(defn-spec get-tag-by-id-with-http-info any?
  "/tags/{tag_id:[0-9]+}
  Fetch a tag by id."
  [access_token string?, tag_id int?]
  (check-required-params access_token tag_id)
  (call-api "/tags/{tag_id}" :get
            {:path-params   {"tag_id" tag_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-tag-by-id tag-spec
  "/tags/{tag_id:[0-9]+}
  Fetch a tag by id."
  [access_token string?, tag_id int?]
  (let [res (:data (get-tag-by-id-with-http-info access_token tag_id))]
    (if (:decode-models *api-context*)
       (st/decode tag-spec res st/string-transformer)
       res)))


(defn-spec modify-tag-by-id-with-http-info any?
  "/tags/{tag_id:[0-9]+}
  Add or delete specific members from a tag, or modify the name of a tag."
  [access_token string?, tag_id int?, tagModifyParams tag-modify]
  (check-required-params access_token tag_id tagModifyParams)
  (call-api "/tags/{tag_id}" :patch
            {:path-params   {"tag_id" tag_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    tagModifyParams
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec modify-tag-by-id tag-spec
  "/tags/{tag_id:[0-9]+}
  Add or delete specific members from a tag, or modify the name of a tag."
  [access_token string?, tag_id int?, tagModifyParams tag-modify]
  (let [res (:data (modify-tag-by-id-with-http-info access_token tag_id tagModifyParams))]
    (if (:decode-models *api-context*)
       (st/decode tag-spec res st/string-transformer)
       res)))


(defn-spec update-tag-by-id-with-http-info any?
  "/tags/{tag_id:[0-9]+}
  Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint."
  [access_token string?, tag_id int?, updateTagParams tag-update]
  (check-required-params access_token tag_id updateTagParams)
  (call-api "/tags/{tag_id}" :put
            {:path-params   {"tag_id" tag_id }
             :header-params {}
             :query-params  {"access_token" access_token }
             :form-params   {}
             :body-param    updateTagParams
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec update-tag-by-id tag-spec
  "/tags/{tag_id:[0-9]+}
  Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint."
  [access_token string?, tag_id int?, updateTagParams tag-update]
  (let [res (:data (update-tag-by-id-with-http-info access_token tag_id updateTagParams))]
    (if (:decode-models *api-context*)
       (st/decode tag-spec res st/string-transformer)
       res)))


