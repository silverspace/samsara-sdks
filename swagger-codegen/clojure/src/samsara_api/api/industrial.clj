(ns samsara-api.api.industrial
  (:require [samsara-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-all-data-inputs-with-http-info
  "/industrial/data
  Fetch all of the data inputs for a group."
  ([access-token ] (get-all-data-inputs-with-http-info access-token nil))
  ([access-token {:keys [group-id start-ms end-ms ]}]
   (check-required-params access-token)
   (call-api "/industrial/data" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access-token "group_id" group-id "startMs" start-ms "endMs" end-ms }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-all-data-inputs
  "/industrial/data
  Fetch all of the data inputs for a group."
  ([access-token ] (get-all-data-inputs access-token nil))
  ([access-token optional-params]
   (:data (get-all-data-inputs-with-http-info access-token optional-params))))

(defn get-data-input-with-http-info
  "/industrial/data/{data_input_id:[0-9]+}
  Fetch datapoints from a given data input."
  ([access-token data-input-id ] (get-data-input-with-http-info access-token data-input-id nil))
  ([access-token data-input-id {:keys [start-ms end-ms ]}]
   (check-required-params access-token data-input-id)
   (call-api "/industrial/data/{data_input_id}" :get
             {:path-params   {"data_input_id" data-input-id }
              :header-params {}
              :query-params  {"access_token" access-token "startMs" start-ms "endMs" end-ms }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-data-input
  "/industrial/data/{data_input_id:[0-9]+}
  Fetch datapoints from a given data input."
  ([access-token data-input-id ] (get-data-input access-token data-input-id nil))
  ([access-token data-input-id optional-params]
   (:data (get-data-input-with-http-info access-token data-input-id optional-params))))

(defn get-machines-with-http-info
  "/machines/list
  Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them."
  [access-token group-param ]
  (check-required-params access-token group-param)
  (call-api "/machines/list" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    group-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-machines
  "/machines/list
  Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them."
  [access-token group-param ]
  (:data (get-machines-with-http-info access-token group-param)))

(defn get-machines-history-with-http-info
  "/machines/history
  Get historical data for machine objects. This method returns a set of historical data for all machines in a group"
  [access-token history-param ]
  (check-required-params access-token history-param)
  (call-api "/machines/history" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    history-param
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-machines-history
  "/machines/history
  Get historical data for machine objects. This method returns a set of historical data for all machines in a group"
  [access-token history-param ]
  (:data (get-machines-history-with-http-info access-token history-param)))

