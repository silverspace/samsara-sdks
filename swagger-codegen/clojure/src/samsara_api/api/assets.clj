(ns samsara-api.api.assets
  (:require [samsara-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-all-asset-current-locations-with-http-info
  "/fleet/assets/locations
  Fetch current locations of all assets for the group."
  ([access-token ] (get-all-asset-current-locations-with-http-info access-token nil))
  ([access-token {:keys [group-id ]}]
   (check-required-params access-token)
   (call-api "/fleet/assets/locations" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access-token "group_id" group-id }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-all-asset-current-locations
  "/fleet/assets/locations
  Fetch current locations of all assets for the group."
  ([access-token ] (get-all-asset-current-locations access-token nil))
  ([access-token optional-params]
   (:data (get-all-asset-current-locations-with-http-info access-token optional-params))))

(defn get-all-assets-with-http-info
  "/fleet/assets
  Fetch all of the assets for the group."
  ([access-token ] (get-all-assets-with-http-info access-token nil))
  ([access-token {:keys [group-id ]}]
   (check-required-params access-token)
   (call-api "/fleet/assets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access-token "group_id" group-id }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-all-assets
  "/fleet/assets
  Fetch all of the assets for the group."
  ([access-token ] (get-all-assets access-token nil))
  ([access-token optional-params]
   (:data (get-all-assets-with-http-info access-token optional-params))))

(defn get-asset-location-with-http-info
  "/fleet/assets/{assetId:[0-9]+}/locations
  Fetch the historical locations for the asset."
  [access-token asset-id start-ms end-ms ]
  (check-required-params access-token asset-id start-ms end-ms)
  (call-api "/fleet/assets/{asset_id}/locations" :get
            {:path-params   {"asset_id" asset-id }
             :header-params {}
             :query-params  {"access_token" access-token "startMs" start-ms "endMs" end-ms }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-asset-location
  "/fleet/assets/{assetId:[0-9]+}/locations
  Fetch the historical locations for the asset."
  [access-token asset-id start-ms end-ms ]
  (:data (get-asset-location-with-http-info access-token asset-id start-ms end-ms)))

(defn get-asset-reefer-with-http-info
  "/fleet/assets/{assetId:[0-9]+}/reefer
  Fetch the reefer-specific stats of an asset."
  [access-token asset-id start-ms end-ms ]
  (check-required-params access-token asset-id start-ms end-ms)
  (call-api "/fleet/assets/{asset_id}/reefer" :get
            {:path-params   {"asset_id" asset-id }
             :header-params {}
             :query-params  {"access_token" access-token "startMs" start-ms "endMs" end-ms }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-asset-reefer
  "/fleet/assets/{assetId:[0-9]+}/reefer
  Fetch the reefer-specific stats of an asset."
  [access-token asset-id start-ms end-ms ]
  (:data (get-asset-reefer-with-http-info access-token asset-id start-ms end-ms)))

