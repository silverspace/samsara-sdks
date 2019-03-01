{-
   Samsara API

   # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

   OpenAPI Version: 3.0.1
   Samsara API API version: 1.0.0
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : Samsara.API.Assets
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Samsara.API.Assets where

import Samsara.Core
import Samsara.MimeTypes
import Samsara.Model as M

import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Typeable, TypeRep, typeOf, typeRep)
import qualified Data.Foldable as P
import qualified Data.Map as Map
import qualified Data.Maybe as P
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.Set as Set
import qualified Data.String as P
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Text.Lazy as TL
import qualified Data.Text.Lazy.Encoding as TL
import qualified Data.Time as TI
import qualified Network.HTTP.Client.MultipartFormData as NH
import qualified Network.HTTP.Media as ME
import qualified Network.HTTP.Types as NH
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Data.Text (Text)
import GHC.Base ((<|>))

import Prelude ((==),(/=),($), (.),(<$>),(<*>),(>>=),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

-- * Operations


-- ** Assets

-- *** getAllAssetCurrentLocations0

-- | @GET \/fleet\/assets\/locations@
-- 
-- /fleet/assets/locations
-- 
-- Fetch current locations of all assets for the group.
-- 
getAllAssetCurrentLocations0 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest GetAllAssetCurrentLocations0 MimeNoContent InlineResponse2001 MimeJSON
getAllAssetCurrentLocations0 (AccessToken accessToken) =
  _mkRequest "GET" ["/fleet/assets/locations"]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetAllAssetCurrentLocations0  

-- | /Optional Param/ "group_id" - Optional group ID if the organization has multiple groups (uncommon).
instance HasOptionalParam GetAllAssetCurrentLocations0 GroupId where
  applyOptionalParam req (GroupId xs) =
    req `setQuery` toQuery ("group_id", Just xs)
-- | @application/json@
instance Produces GetAllAssetCurrentLocations0 MimeJSON


-- *** getAllAssets0

-- | @GET \/fleet\/assets@
-- 
-- /fleet/assets
-- 
-- Fetch all of the assets for the group.
-- 
getAllAssets0 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest GetAllAssets0 MimeNoContent InlineResponse200 MimeJSON
getAllAssets0 (AccessToken accessToken) =
  _mkRequest "GET" ["/fleet/assets"]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetAllAssets0  

-- | /Optional Param/ "group_id" - Optional group ID if the organization has multiple groups (uncommon).
instance HasOptionalParam GetAllAssets0 GroupId where
  applyOptionalParam req (GroupId xs) =
    req `setQuery` toQuery ("group_id", Just xs)
-- | @application/json@
instance Produces GetAllAssets0 MimeJSON


-- *** getAssetLocation0

-- | @GET \/fleet\/assets\/{asset_id}\/locations@
-- 
-- /fleet/assets/{assetId:[0-9]+}/locations
-- 
-- Fetch the historical locations for the asset.
-- 
getAssetLocation0 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> AssetId -- ^ "assetId" -  ID of the asset
  -> StartMs -- ^ "startMs" -  Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
  -> EndMs -- ^ "endMs" -  Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
  -> SamsaraRequest GetAssetLocation0 MimeNoContent [A.Value] MimeJSON
getAssetLocation0 (AccessToken accessToken) (AssetId assetId) (StartMs startMs) (EndMs endMs) =
  _mkRequest "GET" ["/fleet/assets/",toPath assetId,"/locations"]
    `setQuery` toQuery ("access_token", Just accessToken)
    `setQuery` toQuery ("startMs", Just startMs)
    `setQuery` toQuery ("endMs", Just endMs)

data GetAssetLocation0  
-- | @application/json@
instance Produces GetAssetLocation0 MimeJSON


-- *** getAssetReefer0

-- | @GET \/fleet\/assets\/{asset_id}\/reefer@
-- 
-- /fleet/assets/{assetId:[0-9]+}/reefer
-- 
-- Fetch the reefer-specific stats of an asset.
-- 
getAssetReefer0 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> AssetId -- ^ "assetId" -  ID of the asset
  -> StartMs -- ^ "startMs" -  Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
  -> EndMs -- ^ "endMs" -  Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
  -> SamsaraRequest GetAssetReefer0 MimeNoContent AssetReeferResponse MimeJSON
getAssetReefer0 (AccessToken accessToken) (AssetId assetId) (StartMs startMs) (EndMs endMs) =
  _mkRequest "GET" ["/fleet/assets/",toPath assetId,"/reefer"]
    `setQuery` toQuery ("access_token", Just accessToken)
    `setQuery` toQuery ("startMs", Just startMs)
    `setQuery` toQuery ("endMs", Just endMs)

data GetAssetReefer0  
-- | @application/json@
instance Produces GetAssetReefer0 MimeJSON

