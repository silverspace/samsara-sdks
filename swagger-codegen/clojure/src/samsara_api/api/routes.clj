(ns samsara-api.api.routes
  (:require [samsara-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

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

