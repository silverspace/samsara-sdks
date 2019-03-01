(ns samsara-api.api.tags
  (:require [samsara-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-tag-with-http-info
  "/tags
  Create a new tag for the group."
  [access-token tag-create-params ]
  (check-required-params access-token tag-create-params)
  (call-api "/tags" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    tag-create-params
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-tag
  "/tags
  Create a new tag for the group."
  [access-token tag-create-params ]
  (:data (create-tag-with-http-info access-token tag-create-params)))

(defn delete-tag-by-id-with-http-info
  "/tags/{tag_id:[0-9]+}
  Permanently deletes a tag."
  [access-token tag-id ]
  (check-required-params access-token tag-id)
  (call-api "/tags/{tag_id}" :delete
            {:path-params   {"tag_id" tag-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-tag-by-id
  "/tags/{tag_id:[0-9]+}
  Permanently deletes a tag."
  [access-token tag-id ]
  (:data (delete-tag-by-id-with-http-info access-token tag-id)))

(defn get-all-tags-with-http-info
  "/tags
  Fetch all of the tags for a group."
  ([access-token ] (get-all-tags-with-http-info access-token nil))
  ([access-token {:keys [group-id ]}]
   (check-required-params access-token)
   (call-api "/tags" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"access_token" access-token "group_id" group-id }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-all-tags
  "/tags
  Fetch all of the tags for a group."
  ([access-token ] (get-all-tags access-token nil))
  ([access-token optional-params]
   (:data (get-all-tags-with-http-info access-token optional-params))))

(defn get-tag-by-id-with-http-info
  "/tags/{tag_id:[0-9]+}
  Fetch a tag by id."
  [access-token tag-id ]
  (check-required-params access-token tag-id)
  (call-api "/tags/{tag_id}" :get
            {:path-params   {"tag_id" tag-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-tag-by-id
  "/tags/{tag_id:[0-9]+}
  Fetch a tag by id."
  [access-token tag-id ]
  (:data (get-tag-by-id-with-http-info access-token tag-id)))

(defn modify-tag-by-id-with-http-info
  "/tags/{tag_id:[0-9]+}
  Add or delete specific members from a tag, or modify the name of a tag."
  [access-token tag-id tag-modify-params ]
  (check-required-params access-token tag-id tag-modify-params)
  (call-api "/tags/{tag_id}" :patch
            {:path-params   {"tag_id" tag-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    tag-modify-params
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn modify-tag-by-id
  "/tags/{tag_id:[0-9]+}
  Add or delete specific members from a tag, or modify the name of a tag."
  [access-token tag-id tag-modify-params ]
  (:data (modify-tag-by-id-with-http-info access-token tag-id tag-modify-params)))

(defn update-tag-by-id-with-http-info
  "/tags/{tag_id:[0-9]+}
  Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint."
  [access-token tag-id update-tag-params ]
  (check-required-params access-token tag-id update-tag-params)
  (call-api "/tags/{tag_id}" :put
            {:path-params   {"tag_id" tag-id }
             :header-params {}
             :query-params  {"access_token" access-token }
             :form-params   {}
             :body-param    update-tag-params
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-tag-by-id
  "/tags/{tag_id:[0-9]+}
  Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint."
  [access-token tag-id update-tag-params ]
  (:data (update-tag-by-id-with-http-info access-token tag-id update-tag-params)))

