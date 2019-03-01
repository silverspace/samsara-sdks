(ns samsara-api.api.safety
  (:require [samsara-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

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

