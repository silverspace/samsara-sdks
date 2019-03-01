(ns samsara-api.api.users
  (:require [samsara-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn delete-user-by-id-with-http-info
  "/users/{userId:[0-9]+}
  Remove a user from the organization."
  [access-token user-id ]
  (check-required-params access-token user-id)
  (call-api "/users/{userId}" :delete
            {:path-params   {"userId" user-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-user-by-id
  "/users/{userId:[0-9]+}
  Remove a user from the organization."
  [access-token user-id ]
  (:data (delete-user-by-id-with-http-info access-token user-id)))

(defn get-user-by-id-with-http-info
  "/users/{userId:[0-9]+}
  Get a user."
  [access-token user-id ]
  (check-required-params access-token user-id)
  (call-api "/users/{userId}" :get
            {:path-params   {"userId" user-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-user-by-id
  "/users/{userId:[0-9]+}
  Get a user."
  [access-token user-id ]
  (:data (get-user-by-id-with-http-info access-token user-id)))

(defn list-user-roles-with-http-info
  "/user_roles
  Get all roles in the organization."
  [access-token ]
  (check-required-params access-token)
  (call-api "/user_roles" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn list-user-roles
  "/user_roles
  Get all roles in the organization."
  [access-token ]
  (:data (list-user-roles-with-http-info access-token)))

(defn list-users-with-http-info
  "/users
  List all users in the organization."
  [access-token ]
  (check-required-params access-token)
  (call-api "/users" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn list-users
  "/users
  List all users in the organization."
  [access-token ]
  (:data (list-users-with-http-info access-token)))

