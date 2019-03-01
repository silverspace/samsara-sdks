(ns samsara-api.api.fleet
  (:require [samsara-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn add-fleet-address-with-http-info
  "/fleet/add_address
  This method adds an address book entry to the specified group."
  [access-token address-param ]
  (check-required-params access-token address-param)
  (call-api "/fleet/add_address" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    address-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn add-fleet-address
  "/fleet/add_address
  This method adds an address book entry to the specified group."
  [access-token address-param ]
  (:data (add-fleet-address-with-http-info access-token address-param)))

(defn add-organization-addresses-with-http-info
  "/addresses
  Add one or more addresses to the organization"
  [access-token addresses ]
  (check-required-params access-token addresses)
  (call-api "/addresses" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    addresses
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn add-organization-addresses
  "/addresses
  Add one or more addresses to the organization"
  [access-token addresses ]
  (:data (add-organization-addresses-with-http-info access-token addresses)))

(defn create-dispatch-route-with-http-info
  "/fleet/dispatch/routes
  Create a new dispatch route."
  [access-token create-dispatch-route-params ]
  (check-required-params access-token create-dispatch-route-params)
  (call-api "/fleet/dispatch/routes" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    create-dispatch-route-params
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-dispatch-route
  "/fleet/dispatch/routes
  Create a new dispatch route."
  [access-token create-dispatch-route-params ]
  (:data (create-dispatch-route-with-http-info access-token create-dispatch-route-params)))

(defn create-driver-with-http-info
  "/fleet/drivers/create
  Create a new driver."
  [access-token create-driver-param ]
  (check-required-params access-token create-driver-param)
  (call-api "/fleet/drivers/create" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    create-driver-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-driver
  "/fleet/drivers/create
  Create a new driver."
  [access-token create-driver-param ]
  (:data (create-driver-with-http-info access-token create-driver-param)))

(defn create-driver-dispatch-route-with-http-info
  "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  Create a new dispatch route for the driver with driver_id."
  [access-token driver-id create-dispatch-route-params ]
  (check-required-params access-token driver-id create-dispatch-route-params)
  (call-api "/fleet/drivers/{driver_id}/dispatch/routes" :post
            {:path-params   {"driver_id" driver-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    create-dispatch-route-params
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-driver-dispatch-route
  "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  Create a new dispatch route for the driver with driver_id."
  [access-token driver-id create-dispatch-route-params ]
  (:data (create-driver-dispatch-route-with-http-info access-token driver-id create-dispatch-route-params)))

(defn create-driver-document-with-http-info
  "/fleet/drivers/{driver_id:[0-9]+}/documents
  Create a driver document for the given driver."
  [access-token driver-id create-document-params ]
  (check-required-params access-token driver-id create-document-params)
  (call-api "/fleet/drivers/{driver_id}/documents" :post
            {:path-params   {"driver_id" driver-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    create-document-params
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-driver-document
  "/fleet/drivers/{driver_id:[0-9]+}/documents
  Create a driver document for the given driver."
  [access-token driver-id create-document-params ]
  (:data (create-driver-document-with-http-info access-token driver-id create-document-params)))

(defn create-dvir-with-http-info
  "/fleet/maintenance/dvirs
  Create a new dvir, marking a vehicle or trailer safe or unsafe."
  [access-token create-dvir-param ]
  (check-required-params access-token create-dvir-param)
  (call-api "/fleet/maintenance/dvirs" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    create-dvir-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-dvir
  "/fleet/maintenance/dvirs
  Create a new dvir, marking a vehicle or trailer safe or unsafe."
  [access-token create-dvir-param ]
  (:data (create-dvir-with-http-info access-token create-dvir-param)))

(defn create-vehicle-dispatch-route-with-http-info
  "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  Create a new dispatch route for the vehicle with vehicle_id."
  [access-token vehicle-id create-dispatch-route-params ]
  (check-required-params access-token vehicle-id create-dispatch-route-params)
  (call-api "/fleet/vehicles/{vehicle_id}/dispatch/routes" :post
            {:path-params   {"vehicle_id" vehicle-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    create-dispatch-route-params
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-vehicle-dispatch-route
  "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  Create a new dispatch route for the vehicle with vehicle_id."
  [access-token vehicle-id create-dispatch-route-params ]
  (:data (create-vehicle-dispatch-route-with-http-info access-token vehicle-id create-dispatch-route-params)))

(defn deactivate-driver-with-http-info
  "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Deactivate a driver with the given id."
  [access-token driver-id-or-external-id ]
  (check-required-params access-token driver-id-or-external-id)
  (call-api "/fleet/drivers/{driver_id_or_external_id}" :delete
            {:path-params   {"driver_id_or_external_id" driver-id-or-external-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn deactivate-driver
  "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Deactivate a driver with the given id."
  [access-token driver-id-or-external-id ]
  (:data (deactivate-driver-with-http-info access-token driver-id-or-external-id)))

(defn delete-dispatch-route-by-id-with-http-info
  "/fleet/dispatch/routes/{route_id:[0-9]+}/
  Delete a dispatch route and its associated jobs."
  [access-token route-id ]
  (check-required-params access-token route-id)
  (call-api "/fleet/dispatch/routes/{route_id}" :delete
            {:path-params   {"route_id" route-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-dispatch-route-by-id
  "/fleet/dispatch/routes/{route_id:[0-9]+}/
  Delete a dispatch route and its associated jobs."
  [access-token route-id ]
  (:data (delete-dispatch-route-by-id-with-http-info access-token route-id)))

(defn delete-organization-address-with-http-info
  "/addresses/{addressId}
  Delete an address."
  [access-token address-id ]
  (check-required-params access-token address-id)
  (call-api "/addresses/{addressId}" :delete
            {:path-params   {"addressId" address-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-organization-address
  "/addresses/{addressId}
  Delete an address."
  [access-token address-id ]
  (:data (delete-organization-address-with-http-info access-token address-id)))

(defn fetch-all-dispatch-routes-with-http-info
  "/fleet/dispatch/routes
  Fetch all of the dispatch routes for the group."
  ([access-token ] (fetch-all-dispatch-routes-with-http-info access-token nil))
  ([access-token {:keys [group-id end-time duration ]}]
   (check-required-params access-token)
   (call-api "/fleet/dispatch/routes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access-token "group_id" group-id "end_time" end-time "duration" duration }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn fetch-all-dispatch-routes
  "/fleet/dispatch/routes
  Fetch all of the dispatch routes for the group."
  ([access-token ] (fetch-all-dispatch-routes access-token nil))
  ([access-token optional-params]
   (:data (fetch-all-dispatch-routes-with-http-info access-token optional-params))))

(defn fetch-all-route-job-updates-with-http-info
  "/fleet/dispatch/routes/job_updates
  Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID"
  ([access-token ] (fetch-all-route-job-updates-with-http-info access-token nil))
  ([access-token {:keys [group-id sequence-id include ]}]
   (check-required-params access-token)
   (call-api "/fleet/dispatch/routes/job_updates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access-token "group_id" group-id "sequence_id" sequence-id "include" include }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn fetch-all-route-job-updates
  "/fleet/dispatch/routes/job_updates
  Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID"
  ([access-token ] (fetch-all-route-job-updates access-token nil))
  ([access-token optional-params]
   (:data (fetch-all-route-job-updates-with-http-info access-token optional-params))))

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

(defn get-all-deactivated-drivers-with-http-info
  "/fleet/drivers/inactive
  Fetch all deactivated drivers for the group."
  ([access-token ] (get-all-deactivated-drivers-with-http-info access-token nil))
  ([access-token {:keys [group-id ]}]
   (check-required-params access-token)
   (call-api "/fleet/drivers/inactive" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access-token "group_id" group-id }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-all-deactivated-drivers
  "/fleet/drivers/inactive
  Fetch all deactivated drivers for the group."
  ([access-token ] (get-all-deactivated-drivers access-token nil))
  ([access-token optional-params]
   (:data (get-all-deactivated-drivers-with-http-info access-token optional-params))))

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

(defn get-deactivated-driver-by-id-with-http-info
  "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Fetch deactivated driver by id."
  [access-token driver-id-or-external-id ]
  (check-required-params access-token driver-id-or-external-id)
  (call-api "/fleet/drivers/inactive/{driver_id_or_external_id}" :get
            {:path-params   {"driver_id_or_external_id" driver-id-or-external-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-deactivated-driver-by-id
  "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Fetch deactivated driver by id."
  [access-token driver-id-or-external-id ]
  (:data (get-deactivated-driver-by-id-with-http-info access-token driver-id-or-external-id)))

(defn get-dispatch-route-by-id-with-http-info
  "/fleet/dispatch/routes/{route_id:[0-9]+}
  Fetch a dispatch route by id."
  [access-token route-id ]
  (check-required-params access-token route-id)
  (call-api "/fleet/dispatch/routes/{route_id}" :get
            {:path-params   {"route_id" route-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-dispatch-route-by-id
  "/fleet/dispatch/routes/{route_id:[0-9]+}
  Fetch a dispatch route by id."
  [access-token route-id ]
  (:data (get-dispatch-route-by-id-with-http-info access-token route-id)))

(defn get-dispatch-route-history-with-http-info
  "/fleet/dispatch/routes/{route_id:[0-9]+}/history
  Fetch the history of a dispatch route."
  ([access-token route-id ] (get-dispatch-route-history-with-http-info access-token route-id nil))
  ([access-token route-id {:keys [start-time end-time ]}]
   (check-required-params access-token route-id)
   (call-api "/fleet/dispatch/routes/{route_id}/history" :get
             {:path-params   {"route_id" route-id }
              :header-params {}
              :query-params  {"access_token" access-token "start_time" start-time "end_time" end-time }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-dispatch-route-history
  "/fleet/dispatch/routes/{route_id:[0-9]+}/history
  Fetch the history of a dispatch route."
  ([access-token route-id ] (get-dispatch-route-history access-token route-id nil))
  ([access-token route-id optional-params]
   (:data (get-dispatch-route-history-with-http-info access-token route-id optional-params))))

(defn get-dispatch-routes-by-driver-id-with-http-info
  "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  Fetch all of the dispatch routes for a given driver."
  ([access-token driver-id ] (get-dispatch-routes-by-driver-id-with-http-info access-token driver-id nil))
  ([access-token driver-id {:keys [end-time duration ]}]
   (check-required-params access-token driver-id)
   (call-api "/fleet/drivers/{driver_id}/dispatch/routes" :get
             {:path-params   {"driver_id" driver-id }
              :header-params {}
              :query-params  {"access_token" access-token "end_time" end-time "duration" duration }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-dispatch-routes-by-driver-id
  "/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  Fetch all of the dispatch routes for a given driver."
  ([access-token driver-id ] (get-dispatch-routes-by-driver-id access-token driver-id nil))
  ([access-token driver-id optional-params]
   (:data (get-dispatch-routes-by-driver-id-with-http-info access-token driver-id optional-params))))

(defn get-dispatch-routes-by-vehicle-id-with-http-info
  "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  Fetch all of the dispatch routes for a given vehicle."
  ([access-token vehicle-id ] (get-dispatch-routes-by-vehicle-id-with-http-info access-token vehicle-id nil))
  ([access-token vehicle-id {:keys [end-time duration ]}]
   (check-required-params access-token vehicle-id)
   (call-api "/fleet/vehicles/{vehicle_id}/dispatch/routes" :get
             {:path-params   {"vehicle_id" vehicle-id }
              :header-params {}
              :query-params  {"access_token" access-token "end_time" end-time "duration" duration }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-dispatch-routes-by-vehicle-id
  "/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  Fetch all of the dispatch routes for a given vehicle."
  ([access-token vehicle-id ] (get-dispatch-routes-by-vehicle-id access-token vehicle-id nil))
  ([access-token vehicle-id optional-params]
   (:data (get-dispatch-routes-by-vehicle-id-with-http-info access-token vehicle-id optional-params))))

(defn get-driver-by-id-with-http-info
  "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Fetch driver by id."
  [access-token driver-id-or-external-id ]
  (check-required-params access-token driver-id-or-external-id)
  (call-api "/fleet/drivers/{driver_id_or_external_id}" :get
            {:path-params   {"driver_id_or_external_id" driver-id-or-external-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-driver-by-id
  "/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Fetch driver by id."
  [access-token driver-id-or-external-id ]
  (:data (get-driver-by-id-with-http-info access-token driver-id-or-external-id)))

(defn get-driver-document-types-by-org-id-with-http-info
  "/fleet/drivers/document_types
  Fetch all of the document types."
  []
  (call-api "/fleet/drivers/document_types" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-driver-document-types-by-org-id
  "/fleet/drivers/document_types
  Fetch all of the document types."
  []
  (:data (get-driver-document-types-by-org-id-with-http-info)))

(defn get-driver-documents-by-org-id-with-http-info
  "/fleet/drivers/documents
  Fetch all of the documents."
  ([access-token ] (get-driver-documents-by-org-id-with-http-info access-token nil))
  ([access-token {:keys [end-ms duration-ms ]}]
   (check-required-params access-token)
   (call-api "/fleet/drivers/documents" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access-token "endMs" end-ms "durationMs" duration-ms }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-driver-documents-by-org-id
  "/fleet/drivers/documents
  Fetch all of the documents."
  ([access-token ] (get-driver-documents-by-org-id access-token nil))
  ([access-token optional-params]
   (:data (get-driver-documents-by-org-id-with-http-info access-token optional-params))))

(defn get-driver-safety-score-with-http-info
  "/fleet/drivers/{driverId:[0-9]+}/safety/score
  Fetch the safety score for the driver."
  [driver-id access-token start-ms end-ms ]
  (check-required-params driver-id access-token start-ms end-ms)
  (call-api "/fleet/drivers/{driverId}/safety/score" :get
            {:path-params   {"driverId" driver-id }
             :header-params {}
             :query-params  {"access_token" access-token "startMs" start-ms "endMs" end-ms }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-driver-safety-score
  "/fleet/drivers/{driverId:[0-9]+}/safety/score
  Fetch the safety score for the driver."
  [driver-id access-token start-ms end-ms ]
  (:data (get-driver-safety-score-with-http-info driver-id access-token start-ms end-ms)))

(defn get-dvirs-with-http-info
  "/fleet/maintenance/dvirs
  Get DVIRs for the org within provided time constraints"
  ([access-token end-ms duration-ms ] (get-dvirs-with-http-info access-token end-ms duration-ms nil))
  ([access-token end-ms duration-ms {:keys [group-id ]}]
   (check-required-params access-token end-ms duration-ms)
   (call-api "/fleet/maintenance/dvirs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access-token "end_ms" end-ms "duration_ms" duration-ms "group_id" group-id }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-dvirs
  "/fleet/maintenance/dvirs
  Get DVIRs for the org within provided time constraints"
  ([access-token end-ms duration-ms ] (get-dvirs access-token end-ms duration-ms nil))
  ([access-token end-ms duration-ms optional-params]
   (:data (get-dvirs-with-http-info access-token end-ms duration-ms optional-params))))

(defn get-fleet-drivers-with-http-info
  "/fleet/drivers
  Get all the drivers for the specified group."
  [access-token group-drivers-param ]
  (check-required-params access-token group-drivers-param)
  (call-api "/fleet/drivers" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    group-drivers-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-fleet-drivers
  "/fleet/drivers
  Get all the drivers for the specified group."
  [access-token group-drivers-param ]
  (:data (get-fleet-drivers-with-http-info access-token group-drivers-param)))

(defn get-fleet-drivers-hos-daily-logs-with-http-info
  "/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
  Get summarized daily HOS charts for a specified driver."
  [access-token driver-id hos-logs-param ]
  (check-required-params access-token driver-id hos-logs-param)
  (call-api "/fleet/drivers/{driver_id}/hos_daily_logs" :post
            {:path-params   {"driver_id" driver-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    hos-logs-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-fleet-drivers-hos-daily-logs
  "/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
  Get summarized daily HOS charts for a specified driver."
  [access-token driver-id hos-logs-param ]
  (:data (get-fleet-drivers-hos-daily-logs-with-http-info access-token driver-id hos-logs-param)))

(defn get-fleet-drivers-summary-with-http-info
  "/fleet/drivers/summary
  Get the distance and time each driver in an organization has driven in a given time period."
  ([access-token drivers-summary-param ] (get-fleet-drivers-summary-with-http-info access-token drivers-summary-param nil))
  ([access-token drivers-summary-param {:keys [snap-to-day-bounds ]}]
   (check-required-params access-token drivers-summary-param)
   (call-api "/fleet/drivers/summary" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access-token "snap_to_day_bounds" snap-to-day-bounds }
              :form-params   {}
              :body-param    drivers-summary-param
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-fleet-drivers-summary
  "/fleet/drivers/summary
  Get the distance and time each driver in an organization has driven in a given time period."
  ([access-token drivers-summary-param ] (get-fleet-drivers-summary access-token drivers-summary-param nil))
  ([access-token drivers-summary-param optional-params]
   (:data (get-fleet-drivers-summary-with-http-info access-token drivers-summary-param optional-params))))

(defn get-fleet-hos-authentication-logs-with-http-info
  "/fleet/hos_authentication_logs
  Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information."
  [access-token hos-authentication-logs-param ]
  (check-required-params access-token hos-authentication-logs-param)
  (call-api "/fleet/hos_authentication_logs" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    hos-authentication-logs-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-fleet-hos-authentication-logs
  "/fleet/hos_authentication_logs
  Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information."
  [access-token hos-authentication-logs-param ]
  (:data (get-fleet-hos-authentication-logs-with-http-info access-token hos-authentication-logs-param)))

(defn get-fleet-hos-logs-with-http-info
  "/fleet/hos_logs
  Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period."
  [access-token hos-logs-param ]
  (check-required-params access-token hos-logs-param)
  (call-api "/fleet/hos_logs" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    hos-logs-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-fleet-hos-logs
  "/fleet/hos_logs
  Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period."
  [access-token hos-logs-param ]
  (:data (get-fleet-hos-logs-with-http-info access-token hos-logs-param)))

(defn get-fleet-hos-logs-summary-with-http-info
  "/fleet/hos_logs_summary
  Get the current HOS status for all drivers in the group."
  [access-token hos-logs-param ]
  (check-required-params access-token hos-logs-param)
  (call-api "/fleet/hos_logs_summary" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    hos-logs-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-fleet-hos-logs-summary
  "/fleet/hos_logs_summary
  Get the current HOS status for all drivers in the group."
  [access-token hos-logs-param ]
  (:data (get-fleet-hos-logs-summary-with-http-info access-token hos-logs-param)))

(defn get-fleet-locations-with-http-info
  "/fleet/locations
  Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group."
  [access-token group-param ]
  (check-required-params access-token group-param)
  (call-api "/fleet/locations" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    group-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-fleet-locations
  "/fleet/locations
  Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group."
  [access-token group-param ]
  (:data (get-fleet-locations-with-http-info access-token group-param)))

(defn get-fleet-maintenance-list-with-http-info
  "/fleet/maintenance/list
  Get list of the vehicles with any engine faults or check light data."
  [access-token group-param ]
  (check-required-params access-token group-param)
  (call-api "/fleet/maintenance/list" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    group-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-fleet-maintenance-list
  "/fleet/maintenance/list
  Get list of the vehicles with any engine faults or check light data."
  [access-token group-param ]
  (:data (get-fleet-maintenance-list-with-http-info access-token group-param)))

(defn get-fleet-trips-with-http-info
  "/fleet/trips
  Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range."
  [access-token trips-param ]
  (check-required-params access-token trips-param)
  (call-api "/fleet/trips" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    trips-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-fleet-trips
  "/fleet/trips
  Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range."
  [access-token trips-param ]
  (:data (get-fleet-trips-with-http-info access-token trips-param)))

(defn get-fleet-vehicle-with-http-info
  "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Gets a specific vehicle."
  [access-token vehicle-id-or-external-id ]
  (check-required-params access-token vehicle-id-or-external-id)
  (call-api "/fleet/vehicles/{vehicle_id_or_external_id}" :get
            {:path-params   {"vehicle_id_or_external_id" vehicle-id-or-external-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-fleet-vehicle
  "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Gets a specific vehicle."
  [access-token vehicle-id-or-external-id ]
  (:data (get-fleet-vehicle-with-http-info access-token vehicle-id-or-external-id)))

(defn get-organization-address-with-http-info
  "/addresses/{addressId}
  Fetch an address by its id."
  [access-token address-id ]
  (check-required-params access-token address-id)
  (call-api "/addresses/{addressId}" :get
            {:path-params   {"addressId" address-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-organization-address
  "/addresses/{addressId}
  Fetch an address by its id."
  [access-token address-id ]
  (:data (get-organization-address-with-http-info access-token address-id)))

(defn get-organization-addresses-with-http-info
  "/addresses
  Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries."
  [access-token ]
  (check-required-params access-token)
  (call-api "/addresses" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-organization-addresses
  "/addresses
  Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries."
  [access-token ]
  (:data (get-organization-addresses-with-http-info access-token)))

(defn get-organization-contact-with-http-info
  "/contacts/{contact_id}
  Fetch a contact by its id."
  [access-token contact-id ]
  (check-required-params access-token contact-id)
  (call-api "/contacts/{contact_id}" :get
            {:path-params   {"contact_id" contact-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-organization-contact
  "/contacts/{contact_id}
  Fetch a contact by its id."
  [access-token contact-id ]
  (:data (get-organization-contact-with-http-info access-token contact-id)))

(defn get-vehicle-harsh-event-with-http-info
  "/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
  Fetch harsh event details for a vehicle."
  [vehicle-id access-token timestamp ]
  (check-required-params vehicle-id access-token timestamp)
  (call-api "/fleet/vehicles/{vehicleId}/safety/harsh_event" :get
            {:path-params   {"vehicleId" vehicle-id }
             :header-params {}
             :query-params  {"access_token" access-token "timestamp" timestamp }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-vehicle-harsh-event
  "/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
  Fetch harsh event details for a vehicle."
  [vehicle-id access-token timestamp ]
  (:data (get-vehicle-harsh-event-with-http-info vehicle-id access-token timestamp)))

(defn get-vehicle-locations-with-http-info
  "/fleet/vehicles/{vehicle_id:[0-9]+}/locations
  Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour."
  [access-token vehicle-id start-ms end-ms ]
  (check-required-params access-token vehicle-id start-ms end-ms)
  (call-api "/fleet/vehicles/{vehicle_id}/locations" :get
            {:path-params   {"vehicle_id" vehicle-id }
             :header-params {}
             :query-params  {"access_token" access-token "startMs" start-ms "endMs" end-ms }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-vehicle-locations
  "/fleet/vehicles/{vehicle_id:[0-9]+}/locations
  Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour."
  [access-token vehicle-id start-ms end-ms ]
  (:data (get-vehicle-locations-with-http-info access-token vehicle-id start-ms end-ms)))

(defn get-vehicle-safety-score-with-http-info
  "/fleet/vehicles/{vehicleId:[0-9]+}/safety/score
  Fetch the safety score for the vehicle."
  [vehicle-id access-token start-ms end-ms ]
  (check-required-params vehicle-id access-token start-ms end-ms)
  (call-api "/fleet/vehicles/{vehicleId}/safety/score" :get
            {:path-params   {"vehicleId" vehicle-id }
             :header-params {}
             :query-params  {"access_token" access-token "startMs" start-ms "endMs" end-ms }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-vehicle-safety-score
  "/fleet/vehicles/{vehicleId:[0-9]+}/safety/score
  Fetch the safety score for the vehicle."
  [vehicle-id access-token start-ms end-ms ]
  (:data (get-vehicle-safety-score-with-http-info vehicle-id access-token start-ms end-ms)))

(defn get-vehicle-stats-with-http-info
  "/fleet/vehicles/stats
  Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time."
  ([access-token start-ms end-ms ] (get-vehicle-stats-with-http-info access-token start-ms end-ms nil))
  ([access-token start-ms end-ms {:keys [series tag-ids starting-after ending-before limit ]}]
   (check-required-params access-token start-ms end-ms)
   (call-api "/fleet/vehicles/stats" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access-token "startMs" start-ms "endMs" end-ms "series" series "tagIds" tag-ids "startingAfter" starting-after "endingBefore" ending-before "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-vehicle-stats
  "/fleet/vehicles/stats
  Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time."
  ([access-token start-ms end-ms ] (get-vehicle-stats access-token start-ms end-ms nil))
  ([access-token start-ms end-ms optional-params]
   (:data (get-vehicle-stats-with-http-info access-token start-ms end-ms optional-params))))

(defn get-vehicles-locations-with-http-info
  "/fleet/vehicles/locations
  Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes."
  [access-token start-ms end-ms ]
  (check-required-params access-token start-ms end-ms)
  (call-api "/fleet/vehicles/locations" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token "startMs" start-ms "endMs" end-ms }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-vehicles-locations
  "/fleet/vehicles/locations
  Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes."
  [access-token start-ms end-ms ]
  (:data (get-vehicles-locations-with-http-info access-token start-ms end-ms)))

(defn list-contacts-with-http-info
  "/contacts
  Fetch all contacts for the organization."
  [access-token ]
  (check-required-params access-token)
  (call-api "/contacts" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn list-contacts
  "/contacts
  Fetch all contacts for the organization."
  [access-token ]
  (:data (list-contacts-with-http-info access-token)))

(defn list-fleet-with-http-info
  "/fleet/list
  Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them."
  ([access-token group-param ] (list-fleet-with-http-info access-token group-param nil))
  ([access-token group-param {:keys [starting-after ending-before limit ]}]
   (check-required-params access-token group-param)
   (call-api "/fleet/list" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access-token "startingAfter" starting-after "endingBefore" ending-before "limit" limit }
              :form-params   {}
              :body-param    group-param
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn list-fleet
  "/fleet/list
  Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them."
  ([access-token group-param ] (list-fleet access-token group-param nil))
  ([access-token group-param optional-params]
   (:data (list-fleet-with-http-info access-token group-param optional-params))))

(defn patch-fleet-vehicle-with-http-info
  "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396."
  [access-token vehicle-id-or-external-id data ]
  (check-required-params access-token vehicle-id-or-external-id data)
  (call-api "/fleet/vehicles/{vehicle_id_or_external_id}" :patch
            {:path-params   {"vehicle_id_or_external_id" vehicle-id-or-external-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    data
             :content-types ["application/json" "application/merge-patch+json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn patch-fleet-vehicle
  "/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396."
  [access-token vehicle-id-or-external-id data ]
  (:data (patch-fleet-vehicle-with-http-info access-token vehicle-id-or-external-id data)))

(defn reactivate-driver-by-id-with-http-info
  "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Reactivate the inactive driver having id."
  [access-token driver-id-or-external-id reactivate-driver-param ]
  (check-required-params access-token driver-id-or-external-id reactivate-driver-param)
  (call-api "/fleet/drivers/inactive/{driver_id_or_external_id}" :put
            {:path-params   {"driver_id_or_external_id" driver-id-or-external-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    reactivate-driver-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn reactivate-driver-by-id
  "/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  Reactivate the inactive driver having id."
  [access-token driver-id-or-external-id reactivate-driver-param ]
  (:data (reactivate-driver-by-id-with-http-info access-token driver-id-or-external-id reactivate-driver-param)))

(defn update-dispatch-route-by-id-with-http-info
  "/fleet/dispatch/routes/{route_id:[0-9]+}/
  Update a dispatch route and its associated jobs."
  [access-token route-id update-dispatch-route-params ]
  (check-required-params access-token route-id update-dispatch-route-params)
  (call-api "/fleet/dispatch/routes/{route_id}" :put
            {:path-params   {"route_id" route-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    update-dispatch-route-params
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-dispatch-route-by-id
  "/fleet/dispatch/routes/{route_id:[0-9]+}/
  Update a dispatch route and its associated jobs."
  [access-token route-id update-dispatch-route-params ]
  (:data (update-dispatch-route-by-id-with-http-info access-token route-id update-dispatch-route-params)))

(defn update-organization-address-with-http-info
  "/addresses/{addressId}
  Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string."
  [access-token address address-id ]
  (check-required-params access-token address address-id)
  (call-api "/addresses/{addressId}" :patch
            {:path-params   {"addressId" address-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    address
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-organization-address
  "/addresses/{addressId}
  Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string."
  [access-token address address-id ]
  (:data (update-organization-address-with-http-info access-token address address-id)))

(defn update-vehicles-with-http-info
  "/fleet/set_data
  This method enables the mutation of metadata for vehicles in the Samsara Cloud."
  [access-token vehicle-update-param ]
  (check-required-params access-token vehicle-update-param)
  (call-api "/fleet/set_data" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    vehicle-update-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-vehicles
  "/fleet/set_data
  This method enables the mutation of metadata for vehicles in the Samsara Cloud."
  [access-token vehicle-update-param ]
  (:data (update-vehicles-with-http-info access-token vehicle-update-param)))

