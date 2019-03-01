(ns samsara-api.api.drivers
  (:require [samsara-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

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

