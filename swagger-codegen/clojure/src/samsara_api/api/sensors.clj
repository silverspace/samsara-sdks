(ns samsara-api.api.sensors
  (:require [samsara-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-sensors-with-http-info
  "/sensors/list
  Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them."
  [access-token group-param ]
  (check-required-params access-token group-param)
  (call-api "/sensors/list" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    group-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-sensors
  "/sensors/list
  Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them."
  [access-token group-param ]
  (:data (get-sensors-with-http-info access-token group-param)))

(defn get-sensors-cargo-with-http-info
  "/sensors/cargo
  Get cargo monitor status (empty / full) for requested sensors."
  [access-token sensor-param ]
  (check-required-params access-token sensor-param)
  (call-api "/sensors/cargo" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    sensor-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-sensors-cargo
  "/sensors/cargo
  Get cargo monitor status (empty / full) for requested sensors."
  [access-token sensor-param ]
  (:data (get-sensors-cargo-with-http-info access-token sensor-param)))

(defn get-sensors-door-with-http-info
  "/sensors/door
  Get door monitor status (closed / open) for requested sensors."
  [access-token sensor-param ]
  (check-required-params access-token sensor-param)
  (call-api "/sensors/door" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    sensor-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-sensors-door
  "/sensors/door
  Get door monitor status (closed / open) for requested sensors."
  [access-token sensor-param ]
  (:data (get-sensors-door-with-http-info access-token sensor-param)))

(defn get-sensors-history-with-http-info
  "/sensors/history
  Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution."
  [access-token history-param ]
  (check-required-params access-token history-param)
  (call-api "/sensors/history" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    history-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-sensors-history
  "/sensors/history
  Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution."
  [access-token history-param ]
  (:data (get-sensors-history-with-http-info access-token history-param)))

(defn get-sensors-humidity-with-http-info
  "/sensors/humidity
  Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors."
  [access-token sensor-param ]
  (check-required-params access-token sensor-param)
  (call-api "/sensors/humidity" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    sensor-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-sensors-humidity
  "/sensors/humidity
  Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors."
  [access-token sensor-param ]
  (:data (get-sensors-humidity-with-http-info access-token sensor-param)))

(defn get-sensors-temperature-with-http-info
  "/sensors/temperature
  Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors."
  [access-token sensor-param ]
  (check-required-params access-token sensor-param)
  (call-api "/sensors/temperature" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    sensor-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-sensors-temperature
  "/sensors/temperature
  Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors."
  [access-token sensor-param ]
  (:data (get-sensors-temperature-with-http-info access-token sensor-param)))

