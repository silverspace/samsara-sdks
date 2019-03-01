{-
   Samsara API

   # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

   OpenAPI Version: 3.0.1
   Samsara API API version: 1.0.0
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : Samsara.API.Fleet
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Samsara.API.Fleet where

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


-- ** Fleet

-- *** addFleetAddress

-- | @POST \/fleet\/add_address@
-- 
-- /fleet/add_address
-- 
-- This method adds an address book entry to the specified group.
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
addFleetAddress 
  :: (Consumes AddFleetAddress MimeJSON, MimeRender MimeJSON InlineObject2)
  => InlineObject2 -- ^ "addressParam"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest AddFleetAddress MimeJSON res MimeJSON
addFleetAddress addressParam (AccessToken accessToken) =
  _mkRequest "POST" ["/fleet/add_address"]
    `setBodyParam` addressParam
    `setQuery` toQuery ("access_token", Just accessToken)

data AddFleetAddress 
instance HasBodyParam AddFleetAddress InlineObject2 

-- | @application/json@
instance Consumes AddFleetAddress MimeJSON

-- | @application/json@
instance Produces AddFleetAddress MimeJSON


-- *** addOrganizationAddresses

-- | @POST \/addresses@
-- 
-- /addresses
-- 
-- Add one or more addresses to the organization
-- 
addOrganizationAddresses 
  :: (Consumes AddOrganizationAddresses MimeJSON, MimeRender MimeJSON InlineObject)
  => InlineObject -- ^ "addresses"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest AddOrganizationAddresses MimeJSON [Address] MimeJSON
addOrganizationAddresses addresses (AccessToken accessToken) =
  _mkRequest "POST" ["/addresses"]
    `setBodyParam` addresses
    `setQuery` toQuery ("access_token", Just accessToken)

data AddOrganizationAddresses 
instance HasBodyParam AddOrganizationAddresses InlineObject 

-- | @application/json@
instance Consumes AddOrganizationAddresses MimeJSON

-- | @application/json@
instance Produces AddOrganizationAddresses MimeJSON


-- *** createDispatchRoute

-- | @POST \/fleet\/dispatch\/routes@
-- 
-- /fleet/dispatch/routes
-- 
-- Create a new dispatch route.
-- 
createDispatchRoute 
  :: (Consumes CreateDispatchRoute MimeJSON, MimeRender MimeJSON DispatchRouteCreate)
  => DispatchRouteCreate -- ^ "createDispatchRouteParams"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest CreateDispatchRoute MimeJSON DispatchRoute MimeJSON
createDispatchRoute createDispatchRouteParams (AccessToken accessToken) =
  _mkRequest "POST" ["/fleet/dispatch/routes"]
    `setBodyParam` createDispatchRouteParams
    `setQuery` toQuery ("access_token", Just accessToken)

data CreateDispatchRoute 
instance HasBodyParam CreateDispatchRoute DispatchRouteCreate 

-- | @application/json@
instance Consumes CreateDispatchRoute MimeJSON

-- | @application/json@
instance Produces CreateDispatchRoute MimeJSON


-- *** createDriver

-- | @POST \/fleet\/drivers\/create@
-- 
-- /fleet/drivers/create
-- 
-- Create a new driver.
-- 
createDriver 
  :: (Consumes CreateDriver MimeJSON, MimeRender MimeJSON DriverForCreate)
  => DriverForCreate -- ^ "createDriverParam" -  Driver creation body
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest CreateDriver MimeJSON Driver MimeJSON
createDriver createDriverParam (AccessToken accessToken) =
  _mkRequest "POST" ["/fleet/drivers/create"]
    `setBodyParam` createDriverParam
    `setQuery` toQuery ("access_token", Just accessToken)

data CreateDriver 

-- | /Body Param/ "createDriverParam" - Driver creation body
instance HasBodyParam CreateDriver DriverForCreate 

-- | @application/json@
instance Consumes CreateDriver MimeJSON

-- | @application/json@
instance Produces CreateDriver MimeJSON


-- *** createDriverDispatchRoute

-- | @POST \/fleet\/drivers\/{driver_id}\/dispatch\/routes@
-- 
-- /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
-- 
-- Create a new dispatch route for the driver with driver_id.
-- 
createDriverDispatchRoute 
  :: (Consumes CreateDriverDispatchRoute MimeJSON, MimeRender MimeJSON DispatchRouteCreate)
  => DispatchRouteCreate -- ^ "createDispatchRouteParams"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> DriverId -- ^ "driverId" -  ID of the driver with the associated routes.
  -> SamsaraRequest CreateDriverDispatchRoute MimeJSON DispatchRoute MimeJSON
createDriverDispatchRoute createDispatchRouteParams (AccessToken accessToken) (DriverId driverId) =
  _mkRequest "POST" ["/fleet/drivers/",toPath driverId,"/dispatch/routes"]
    `setBodyParam` createDispatchRouteParams
    `setQuery` toQuery ("access_token", Just accessToken)

data CreateDriverDispatchRoute 
instance HasBodyParam CreateDriverDispatchRoute DispatchRouteCreate 

-- | @application/json@
instance Consumes CreateDriverDispatchRoute MimeJSON

-- | @application/json@
instance Produces CreateDriverDispatchRoute MimeJSON


-- *** createDriverDocument

-- | @POST \/fleet\/drivers\/{driver_id}\/documents@
-- 
-- /fleet/drivers/{driver_id:[0-9]+}/documents
-- 
-- Create a driver document for the given driver.
-- 
createDriverDocument 
  :: (Consumes CreateDriverDocument MimeJSON, MimeRender MimeJSON DocumentCreate)
  => DocumentCreate -- ^ "createDocumentParams" -  To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> DriverId -- ^ "driverId" -  ID of the driver for whom the document is created.
  -> SamsaraRequest CreateDriverDocument MimeJSON Document MimeJSON
createDriverDocument createDocumentParams (AccessToken accessToken) (DriverId driverId) =
  _mkRequest "POST" ["/fleet/drivers/",toPath driverId,"/documents"]
    `setBodyParam` createDocumentParams
    `setQuery` toQuery ("access_token", Just accessToken)

data CreateDriverDocument 

-- | /Body Param/ "createDocumentParams" - To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
instance HasBodyParam CreateDriverDocument DocumentCreate 

-- | @application/json@
instance Consumes CreateDriverDocument MimeJSON

-- | @application/json@
instance Produces CreateDriverDocument MimeJSON


-- *** createDvir

-- | @POST \/fleet\/maintenance\/dvirs@
-- 
-- /fleet/maintenance/dvirs
-- 
-- Create a new dvir, marking a vehicle or trailer safe or unsafe.
-- 
createDvir 
  :: (Consumes CreateDvir MimeJSON, MimeRender MimeJSON InlineObject12)
  => InlineObject12 -- ^ "createDvirParam"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest CreateDvir MimeJSON DvirBase MimeJSON
createDvir createDvirParam (AccessToken accessToken) =
  _mkRequest "POST" ["/fleet/maintenance/dvirs"]
    `setBodyParam` createDvirParam
    `setQuery` toQuery ("access_token", Just accessToken)

data CreateDvir 
instance HasBodyParam CreateDvir InlineObject12 

-- | @application/json@
instance Consumes CreateDvir MimeJSON

-- | @application/json@
instance Produces CreateDvir MimeJSON


-- *** createVehicleDispatchRoute

-- | @POST \/fleet\/vehicles\/{vehicle_id}\/dispatch\/routes@
-- 
-- /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
-- 
-- Create a new dispatch route for the vehicle with vehicle_id.
-- 
createVehicleDispatchRoute 
  :: (Consumes CreateVehicleDispatchRoute MimeJSON, MimeRender MimeJSON DispatchRouteCreate)
  => DispatchRouteCreate -- ^ "createDispatchRouteParams"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> VehicleId -- ^ "vehicleId" -  ID of the vehicle with the associated routes.
  -> SamsaraRequest CreateVehicleDispatchRoute MimeJSON DispatchRoute MimeJSON
createVehicleDispatchRoute createDispatchRouteParams (AccessToken accessToken) (VehicleId vehicleId) =
  _mkRequest "POST" ["/fleet/vehicles/",toPath vehicleId,"/dispatch/routes"]
    `setBodyParam` createDispatchRouteParams
    `setQuery` toQuery ("access_token", Just accessToken)

data CreateVehicleDispatchRoute 
instance HasBodyParam CreateVehicleDispatchRoute DispatchRouteCreate 

-- | @application/json@
instance Consumes CreateVehicleDispatchRoute MimeJSON

-- | @application/json@
instance Produces CreateVehicleDispatchRoute MimeJSON


-- *** deactivateDriver

-- | @DELETE \/fleet\/drivers\/{driver_id_or_external_id}@
-- 
-- /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
-- 
-- Deactivate a driver with the given id.
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
deactivateDriver 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> DriverIdOrExternalId -- ^ "driverIdOrExternalId" -  ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
  -> SamsaraRequest DeactivateDriver MimeNoContent res MimeJSON
deactivateDriver (AccessToken accessToken) (DriverIdOrExternalId driverIdOrExternalId) =
  _mkRequest "DELETE" ["/fleet/drivers/",toPath driverIdOrExternalId]
    `setQuery` toQuery ("access_token", Just accessToken)

data DeactivateDriver  
-- | @application/json@
instance Produces DeactivateDriver MimeJSON


-- *** deleteDispatchRouteById

-- | @DELETE \/fleet\/dispatch\/routes\/{route_id}@
-- 
-- /fleet/dispatch/routes/{route_id:[0-9]+}/
-- 
-- Delete a dispatch route and its associated jobs.
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
deleteDispatchRouteById 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> RouteId -- ^ "routeId" -  ID of the dispatch route.
  -> SamsaraRequest DeleteDispatchRouteById MimeNoContent res MimeJSON
deleteDispatchRouteById (AccessToken accessToken) (RouteId routeId) =
  _mkRequest "DELETE" ["/fleet/dispatch/routes/",toPath routeId]
    `setQuery` toQuery ("access_token", Just accessToken)

data DeleteDispatchRouteById  
-- | @application/json@
instance Produces DeleteDispatchRouteById MimeJSON


-- *** deleteOrganizationAddress

-- | @DELETE \/addresses\/{addressId}@
-- 
-- /addresses/{addressId}
-- 
-- Delete an address.
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
deleteOrganizationAddress 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> AddressId -- ^ "addressId" -  ID of the address/geofence
  -> SamsaraRequest DeleteOrganizationAddress MimeNoContent res MimeJSON
deleteOrganizationAddress (AccessToken accessToken) (AddressId addressId) =
  _mkRequest "DELETE" ["/addresses/",toPath addressId]
    `setQuery` toQuery ("access_token", Just accessToken)

data DeleteOrganizationAddress  
-- | @application/json@
instance Produces DeleteOrganizationAddress MimeJSON


-- *** fetchAllDispatchRoutes

-- | @GET \/fleet\/dispatch\/routes@
-- 
-- /fleet/dispatch/routes
-- 
-- Fetch all of the dispatch routes for the group.
-- 
fetchAllDispatchRoutes 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest FetchAllDispatchRoutes MimeNoContent [DispatchRoute] MimeJSON
fetchAllDispatchRoutes (AccessToken accessToken) =
  _mkRequest "GET" ["/fleet/dispatch/routes"]
    `setQuery` toQuery ("access_token", Just accessToken)

data FetchAllDispatchRoutes  

-- | /Optional Param/ "group_id" - Optional group ID if the organization has multiple groups (uncommon).
instance HasOptionalParam FetchAllDispatchRoutes GroupId where
  applyOptionalParam req (GroupId xs) =
    req `setQuery` toQuery ("group_id", Just xs)

-- | /Optional Param/ "end_time" - Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
instance HasOptionalParam FetchAllDispatchRoutes EndTime where
  applyOptionalParam req (EndTime xs) =
    req `setQuery` toQuery ("end_time", Just xs)

-- | /Optional Param/ "duration" - Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
instance HasOptionalParam FetchAllDispatchRoutes Duration where
  applyOptionalParam req (Duration xs) =
    req `setQuery` toQuery ("duration", Just xs)
-- | @application/json@
instance Produces FetchAllDispatchRoutes MimeJSON


-- *** fetchAllRouteJobUpdates

-- | @GET \/fleet\/dispatch\/routes\/job_updates@
-- 
-- /fleet/dispatch/routes/job_updates
-- 
-- Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
-- 
fetchAllRouteJobUpdates 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest FetchAllRouteJobUpdates MimeNoContent AllRouteJobUpdates MimeJSON
fetchAllRouteJobUpdates (AccessToken accessToken) =
  _mkRequest "GET" ["/fleet/dispatch/routes/job_updates"]
    `setQuery` toQuery ("access_token", Just accessToken)

data FetchAllRouteJobUpdates  

-- | /Optional Param/ "group_id" - Optional group ID if the organization has multiple groups (uncommon).
instance HasOptionalParam FetchAllRouteJobUpdates GroupId where
  applyOptionalParam req (GroupId xs) =
    req `setQuery` toQuery ("group_id", Just xs)

-- | /Optional Param/ "sequence_id" - Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
instance HasOptionalParam FetchAllRouteJobUpdates SequenceId where
  applyOptionalParam req (SequenceId xs) =
    req `setQuery` toQuery ("sequence_id", Just xs)

-- | /Optional Param/ "include" - Optionally set include=route to include route object in response payload.
instance HasOptionalParam FetchAllRouteJobUpdates Include where
  applyOptionalParam req (Include xs) =
    req `setQuery` toQuery ("include", Just xs)
-- | @application/json@
instance Produces FetchAllRouteJobUpdates MimeJSON


-- *** getAllAssetCurrentLocations

-- | @GET \/fleet\/assets\/locations@
-- 
-- /fleet/assets/locations
-- 
-- Fetch current locations of all assets for the group.
-- 
getAllAssetCurrentLocations 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest GetAllAssetCurrentLocations MimeNoContent InlineResponse2001 MimeJSON
getAllAssetCurrentLocations (AccessToken accessToken) =
  _mkRequest "GET" ["/fleet/assets/locations"]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetAllAssetCurrentLocations  

-- | /Optional Param/ "group_id" - Optional group ID if the organization has multiple groups (uncommon).
instance HasOptionalParam GetAllAssetCurrentLocations GroupId where
  applyOptionalParam req (GroupId xs) =
    req `setQuery` toQuery ("group_id", Just xs)
-- | @application/json@
instance Produces GetAllAssetCurrentLocations MimeJSON


-- *** getAllAssets

-- | @GET \/fleet\/assets@
-- 
-- /fleet/assets
-- 
-- Fetch all of the assets for the group.
-- 
getAllAssets 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest GetAllAssets MimeNoContent InlineResponse200 MimeJSON
getAllAssets (AccessToken accessToken) =
  _mkRequest "GET" ["/fleet/assets"]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetAllAssets  

-- | /Optional Param/ "group_id" - Optional group ID if the organization has multiple groups (uncommon).
instance HasOptionalParam GetAllAssets GroupId where
  applyOptionalParam req (GroupId xs) =
    req `setQuery` toQuery ("group_id", Just xs)
-- | @application/json@
instance Produces GetAllAssets MimeJSON


-- *** getAllDeactivatedDrivers

-- | @GET \/fleet\/drivers\/inactive@
-- 
-- /fleet/drivers/inactive
-- 
-- Fetch all deactivated drivers for the group.
-- 
getAllDeactivatedDrivers 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest GetAllDeactivatedDrivers MimeNoContent [Driver] MimeJSON
getAllDeactivatedDrivers (AccessToken accessToken) =
  _mkRequest "GET" ["/fleet/drivers/inactive"]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetAllDeactivatedDrivers  

-- | /Optional Param/ "group_id" - Optional group ID if the organization has multiple groups (uncommon).
instance HasOptionalParam GetAllDeactivatedDrivers GroupId where
  applyOptionalParam req (GroupId xs) =
    req `setQuery` toQuery ("group_id", Just xs)
-- | @application/json@
instance Produces GetAllDeactivatedDrivers MimeJSON


-- *** getAssetLocation

-- | @GET \/fleet\/assets\/{asset_id}\/locations@
-- 
-- /fleet/assets/{assetId:[0-9]+}/locations
-- 
-- Fetch the historical locations for the asset.
-- 
getAssetLocation 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> AssetId -- ^ "assetId" -  ID of the asset
  -> StartMs -- ^ "startMs" -  Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
  -> EndMs -- ^ "endMs" -  Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
  -> SamsaraRequest GetAssetLocation MimeNoContent [A.Value] MimeJSON
getAssetLocation (AccessToken accessToken) (AssetId assetId) (StartMs startMs) (EndMs endMs) =
  _mkRequest "GET" ["/fleet/assets/",toPath assetId,"/locations"]
    `setQuery` toQuery ("access_token", Just accessToken)
    `setQuery` toQuery ("startMs", Just startMs)
    `setQuery` toQuery ("endMs", Just endMs)

data GetAssetLocation  
-- | @application/json@
instance Produces GetAssetLocation MimeJSON


-- *** getAssetReefer

-- | @GET \/fleet\/assets\/{asset_id}\/reefer@
-- 
-- /fleet/assets/{assetId:[0-9]+}/reefer
-- 
-- Fetch the reefer-specific stats of an asset.
-- 
getAssetReefer 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> AssetId -- ^ "assetId" -  ID of the asset
  -> StartMs -- ^ "startMs" -  Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
  -> EndMs -- ^ "endMs" -  Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
  -> SamsaraRequest GetAssetReefer MimeNoContent AssetReeferResponse MimeJSON
getAssetReefer (AccessToken accessToken) (AssetId assetId) (StartMs startMs) (EndMs endMs) =
  _mkRequest "GET" ["/fleet/assets/",toPath assetId,"/reefer"]
    `setQuery` toQuery ("access_token", Just accessToken)
    `setQuery` toQuery ("startMs", Just startMs)
    `setQuery` toQuery ("endMs", Just endMs)

data GetAssetReefer  
-- | @application/json@
instance Produces GetAssetReefer MimeJSON


-- *** getDeactivatedDriverById

-- | @GET \/fleet\/drivers\/inactive\/{driver_id_or_external_id}@
-- 
-- /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
-- 
-- Fetch deactivated driver by id.
-- 
getDeactivatedDriverById 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> DriverIdOrExternalId -- ^ "driverIdOrExternalId" -  ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
  -> SamsaraRequest GetDeactivatedDriverById MimeNoContent Driver MimeJSON
getDeactivatedDriverById (AccessToken accessToken) (DriverIdOrExternalId driverIdOrExternalId) =
  _mkRequest "GET" ["/fleet/drivers/inactive/",toPath driverIdOrExternalId]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetDeactivatedDriverById  
-- | @application/json@
instance Produces GetDeactivatedDriverById MimeJSON


-- *** getDispatchRouteById

-- | @GET \/fleet\/dispatch\/routes\/{route_id}@
-- 
-- /fleet/dispatch/routes/{route_id:[0-9]+}
-- 
-- Fetch a dispatch route by id.
-- 
getDispatchRouteById 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> RouteId -- ^ "routeId" -  ID of the dispatch route.
  -> SamsaraRequest GetDispatchRouteById MimeNoContent DispatchRoute MimeJSON
getDispatchRouteById (AccessToken accessToken) (RouteId routeId) =
  _mkRequest "GET" ["/fleet/dispatch/routes/",toPath routeId]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetDispatchRouteById  
-- | @application/json@
instance Produces GetDispatchRouteById MimeJSON


-- *** getDispatchRouteHistory

-- | @GET \/fleet\/dispatch\/routes\/{route_id}\/history@
-- 
-- /fleet/dispatch/routes/{route_id:[0-9]+}/history
-- 
-- Fetch the history of a dispatch route.
-- 
getDispatchRouteHistory 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> RouteId -- ^ "routeId" -  ID of the route with history.
  -> SamsaraRequest GetDispatchRouteHistory MimeNoContent DispatchRouteHistory MimeJSON
getDispatchRouteHistory (AccessToken accessToken) (RouteId routeId) =
  _mkRequest "GET" ["/fleet/dispatch/routes/",toPath routeId,"/history"]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetDispatchRouteHistory  

-- | /Optional Param/ "start_time" - Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
instance HasOptionalParam GetDispatchRouteHistory StartTime where
  applyOptionalParam req (StartTime xs) =
    req `setQuery` toQuery ("start_time", Just xs)

-- | /Optional Param/ "end_time" - Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
instance HasOptionalParam GetDispatchRouteHistory EndTime where
  applyOptionalParam req (EndTime xs) =
    req `setQuery` toQuery ("end_time", Just xs)
-- | @application/json@
instance Produces GetDispatchRouteHistory MimeJSON


-- *** getDispatchRoutesByDriverId

-- | @GET \/fleet\/drivers\/{driver_id}\/dispatch\/routes@
-- 
-- /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
-- 
-- Fetch all of the dispatch routes for a given driver.
-- 
getDispatchRoutesByDriverId 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> DriverId -- ^ "driverId" -  ID of the driver with the associated routes.
  -> SamsaraRequest GetDispatchRoutesByDriverId MimeNoContent [DispatchRoute] MimeJSON
getDispatchRoutesByDriverId (AccessToken accessToken) (DriverId driverId) =
  _mkRequest "GET" ["/fleet/drivers/",toPath driverId,"/dispatch/routes"]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetDispatchRoutesByDriverId  

-- | /Optional Param/ "end_time" - Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
instance HasOptionalParam GetDispatchRoutesByDriverId EndTime where
  applyOptionalParam req (EndTime xs) =
    req `setQuery` toQuery ("end_time", Just xs)

-- | /Optional Param/ "duration" - Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
instance HasOptionalParam GetDispatchRoutesByDriverId Duration where
  applyOptionalParam req (Duration xs) =
    req `setQuery` toQuery ("duration", Just xs)
-- | @application/json@
instance Produces GetDispatchRoutesByDriverId MimeJSON


-- *** getDispatchRoutesByVehicleId

-- | @GET \/fleet\/vehicles\/{vehicle_id}\/dispatch\/routes@
-- 
-- /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
-- 
-- Fetch all of the dispatch routes for a given vehicle.
-- 
getDispatchRoutesByVehicleId 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> VehicleId -- ^ "vehicleId" -  ID of the vehicle with the associated routes.
  -> SamsaraRequest GetDispatchRoutesByVehicleId MimeNoContent [DispatchRoute] MimeJSON
getDispatchRoutesByVehicleId (AccessToken accessToken) (VehicleId vehicleId) =
  _mkRequest "GET" ["/fleet/vehicles/",toPath vehicleId,"/dispatch/routes"]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetDispatchRoutesByVehicleId  

-- | /Optional Param/ "end_time" - Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
instance HasOptionalParam GetDispatchRoutesByVehicleId EndTime where
  applyOptionalParam req (EndTime xs) =
    req `setQuery` toQuery ("end_time", Just xs)

-- | /Optional Param/ "duration" - Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
instance HasOptionalParam GetDispatchRoutesByVehicleId Duration where
  applyOptionalParam req (Duration xs) =
    req `setQuery` toQuery ("duration", Just xs)
-- | @application/json@
instance Produces GetDispatchRoutesByVehicleId MimeJSON


-- *** getDriverById

-- | @GET \/fleet\/drivers\/{driver_id_or_external_id}@
-- 
-- /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
-- 
-- Fetch driver by id.
-- 
getDriverById 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> DriverIdOrExternalId -- ^ "driverIdOrExternalId" -  ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
  -> SamsaraRequest GetDriverById MimeNoContent Driver MimeJSON
getDriverById (AccessToken accessToken) (DriverIdOrExternalId driverIdOrExternalId) =
  _mkRequest "GET" ["/fleet/drivers/",toPath driverIdOrExternalId]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetDriverById  
-- | @application/json@
instance Produces GetDriverById MimeJSON


-- *** getDriverDocumentTypesByOrgId

-- | @GET \/fleet\/drivers\/document_types@
-- 
-- /fleet/drivers/document_types
-- 
-- Fetch all of the document types.
-- 
getDriverDocumentTypesByOrgId 
  :: SamsaraRequest GetDriverDocumentTypesByOrgId MimeNoContent [DocumentType] MimeJSON
getDriverDocumentTypesByOrgId =
  _mkRequest "GET" ["/fleet/drivers/document_types"]

data GetDriverDocumentTypesByOrgId  
-- | @application/json@
instance Produces GetDriverDocumentTypesByOrgId MimeJSON


-- *** getDriverDocumentsByOrgId

-- | @GET \/fleet\/drivers\/documents@
-- 
-- /fleet/drivers/documents
-- 
-- Fetch all of the documents.
-- 
getDriverDocumentsByOrgId 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest GetDriverDocumentsByOrgId MimeNoContent [Document] MimeJSON
getDriverDocumentsByOrgId (AccessToken accessToken) =
  _mkRequest "GET" ["/fleet/drivers/documents"]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetDriverDocumentsByOrgId  

-- | /Optional Param/ "endMs" - Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
instance HasOptionalParam GetDriverDocumentsByOrgId EndMs where
  applyOptionalParam req (EndMs xs) =
    req `setQuery` toQuery ("endMs", Just xs)

-- | /Optional Param/ "durationMs" - Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
instance HasOptionalParam GetDriverDocumentsByOrgId DurationMs where
  applyOptionalParam req (DurationMs xs) =
    req `setQuery` toQuery ("durationMs", Just xs)
-- | @application/json@
instance Produces GetDriverDocumentsByOrgId MimeJSON


-- *** getDriverSafetyScore

-- | @GET \/fleet\/drivers\/{driverId}\/safety\/score@
-- 
-- /fleet/drivers/{driverId:[0-9]+}/safety/score
-- 
-- Fetch the safety score for the driver.
-- 
getDriverSafetyScore 
  :: DriverId -- ^ "driverId" -  ID of the driver
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> StartMs -- ^ "startMs" -  Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
  -> EndMs -- ^ "endMs" -  Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
  -> SamsaraRequest GetDriverSafetyScore MimeNoContent DriverSafetyScoreResponse MimeJSON
getDriverSafetyScore (DriverId driverId) (AccessToken accessToken) (StartMs startMs) (EndMs endMs) =
  _mkRequest "GET" ["/fleet/drivers/",toPath driverId,"/safety/score"]
    `setQuery` toQuery ("access_token", Just accessToken)
    `setQuery` toQuery ("startMs", Just startMs)
    `setQuery` toQuery ("endMs", Just endMs)

data GetDriverSafetyScore  
-- | @application/json@
instance Produces GetDriverSafetyScore MimeJSON


-- *** getDvirs

-- | @GET \/fleet\/maintenance\/dvirs@
-- 
-- /fleet/maintenance/dvirs
-- 
-- Get DVIRs for the org within provided time constraints
-- 
getDvirs 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> EndMsInt -- ^ "endMs" -  time in millis until the last dvir log.
  -> DurationMsInt -- ^ "durationMs" -  time in millis which corresponds to the duration before the end_ms.
  -> SamsaraRequest GetDvirs MimeNoContent DvirListResponse MimeJSON
getDvirs (AccessToken accessToken) (EndMsInt endMs) (DurationMsInt durationMs) =
  _mkRequest "GET" ["/fleet/maintenance/dvirs"]
    `setQuery` toQuery ("access_token", Just accessToken)
    `setQuery` toQuery ("end_ms", Just endMs)
    `setQuery` toQuery ("duration_ms", Just durationMs)

data GetDvirs  

-- | /Optional Param/ "group_id" - Group ID to query.
instance HasOptionalParam GetDvirs GroupIdInt where
  applyOptionalParam req (GroupIdInt xs) =
    req `setQuery` toQuery ("group_id", Just xs)
-- | @application/json@
instance Produces GetDvirs MimeJSON


-- *** getFleetDrivers

-- | @POST \/fleet\/drivers@
-- 
-- /fleet/drivers
-- 
-- Get all the drivers for the specified group.
-- 
getFleetDrivers 
  :: (Consumes GetFleetDrivers MimeJSON, MimeRender MimeJSON InlineObject3)
  => InlineObject3 -- ^ "groupDriversParam"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest GetFleetDrivers MimeJSON DriversResponse MimeJSON
getFleetDrivers groupDriversParam (AccessToken accessToken) =
  _mkRequest "POST" ["/fleet/drivers"]
    `setBodyParam` groupDriversParam
    `setQuery` toQuery ("access_token", Just accessToken)

data GetFleetDrivers 
instance HasBodyParam GetFleetDrivers InlineObject3 

-- | @application/json@
instance Consumes GetFleetDrivers MimeJSON

-- | @application/json@
instance Produces GetFleetDrivers MimeJSON


-- *** getFleetDriversHosDailyLogs

-- | @POST \/fleet\/drivers\/{driver_id}\/hos_daily_logs@
-- 
-- /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
-- 
-- Get summarized daily HOS charts for a specified driver.
-- 
getFleetDriversHosDailyLogs 
  :: (Consumes GetFleetDriversHosDailyLogs MimeJSON, MimeRender MimeJSON InlineObject6)
  => InlineObject6 -- ^ "hosLogsParam"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> DriverId -- ^ "driverId" -  ID of the driver with HOS logs.
  -> SamsaraRequest GetFleetDriversHosDailyLogs MimeJSON DriverDailyLogResponse MimeJSON
getFleetDriversHosDailyLogs hosLogsParam (AccessToken accessToken) (DriverId driverId) =
  _mkRequest "POST" ["/fleet/drivers/",toPath driverId,"/hos_daily_logs"]
    `setBodyParam` hosLogsParam
    `setQuery` toQuery ("access_token", Just accessToken)

data GetFleetDriversHosDailyLogs 
instance HasBodyParam GetFleetDriversHosDailyLogs InlineObject6 

-- | @application/json@
instance Consumes GetFleetDriversHosDailyLogs MimeJSON

-- | @application/json@
instance Produces GetFleetDriversHosDailyLogs MimeJSON


-- *** getFleetDriversSummary

-- | @POST \/fleet\/drivers\/summary@
-- 
-- /fleet/drivers/summary
-- 
-- Get the distance and time each driver in an organization has driven in a given time period.
-- 
getFleetDriversSummary 
  :: (Consumes GetFleetDriversSummary MimeJSON, MimeRender MimeJSON InlineObject5)
  => InlineObject5 -- ^ "driversSummaryParam"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest GetFleetDriversSummary MimeJSON DriversSummaryResponse MimeJSON
getFleetDriversSummary driversSummaryParam (AccessToken accessToken) =
  _mkRequest "POST" ["/fleet/drivers/summary"]
    `setBodyParam` driversSummaryParam
    `setQuery` toQuery ("access_token", Just accessToken)

data GetFleetDriversSummary 
instance HasBodyParam GetFleetDriversSummary InlineObject5 

-- | /Optional Param/ "snap_to_day_bounds" - Snap query result to HOS day boundaries.
instance HasOptionalParam GetFleetDriversSummary SnapToDayBounds where
  applyOptionalParam req (SnapToDayBounds xs) =
    req `setQuery` toQuery ("snap_to_day_bounds", Just xs)

-- | @application/json@
instance Consumes GetFleetDriversSummary MimeJSON

-- | @application/json@
instance Produces GetFleetDriversSummary MimeJSON


-- *** getFleetHosAuthenticationLogs

-- | @POST \/fleet\/hos_authentication_logs@
-- 
-- /fleet/hos_authentication_logs
-- 
-- Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
-- 
getFleetHosAuthenticationLogs 
  :: (Consumes GetFleetHosAuthenticationLogs MimeJSON, MimeRender MimeJSON InlineObject7)
  => InlineObject7 -- ^ "hosAuthenticationLogsParam"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest GetFleetHosAuthenticationLogs MimeJSON HosAuthenticationLogsResponse MimeJSON
getFleetHosAuthenticationLogs hosAuthenticationLogsParam (AccessToken accessToken) =
  _mkRequest "POST" ["/fleet/hos_authentication_logs"]
    `setBodyParam` hosAuthenticationLogsParam
    `setQuery` toQuery ("access_token", Just accessToken)

data GetFleetHosAuthenticationLogs 
instance HasBodyParam GetFleetHosAuthenticationLogs InlineObject7 

-- | @application/json@
instance Consumes GetFleetHosAuthenticationLogs MimeJSON

-- | @application/json@
instance Produces GetFleetHosAuthenticationLogs MimeJSON


-- *** getFleetHosLogs

-- | @POST \/fleet\/hos_logs@
-- 
-- /fleet/hos_logs
-- 
-- Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
-- 
getFleetHosLogs 
  :: (Consumes GetFleetHosLogs MimeJSON, MimeRender MimeJSON InlineObject8)
  => InlineObject8 -- ^ "hosLogsParam"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest GetFleetHosLogs MimeJSON HosLogsResponse MimeJSON
getFleetHosLogs hosLogsParam (AccessToken accessToken) =
  _mkRequest "POST" ["/fleet/hos_logs"]
    `setBodyParam` hosLogsParam
    `setQuery` toQuery ("access_token", Just accessToken)

data GetFleetHosLogs 
instance HasBodyParam GetFleetHosLogs InlineObject8 

-- | @application/json@
instance Consumes GetFleetHosLogs MimeJSON

-- | @application/json@
instance Produces GetFleetHosLogs MimeJSON


-- *** getFleetHosLogsSummary

-- | @POST \/fleet\/hos_logs_summary@
-- 
-- /fleet/hos_logs_summary
-- 
-- Get the current HOS status for all drivers in the group.
-- 
getFleetHosLogsSummary 
  :: (Consumes GetFleetHosLogsSummary MimeJSON, MimeRender MimeJSON InlineObject9)
  => InlineObject9 -- ^ "hosLogsParam"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest GetFleetHosLogsSummary MimeJSON HosLogsSummaryResponse MimeJSON
getFleetHosLogsSummary hosLogsParam (AccessToken accessToken) =
  _mkRequest "POST" ["/fleet/hos_logs_summary"]
    `setBodyParam` hosLogsParam
    `setQuery` toQuery ("access_token", Just accessToken)

data GetFleetHosLogsSummary 
instance HasBodyParam GetFleetHosLogsSummary InlineObject9 

-- | @application/json@
instance Consumes GetFleetHosLogsSummary MimeJSON

-- | @application/json@
instance Produces GetFleetHosLogsSummary MimeJSON


-- *** getFleetLocations

-- | @POST \/fleet\/locations@
-- 
-- /fleet/locations
-- 
-- Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
-- 
getFleetLocations 
  :: (Consumes GetFleetLocations MimeJSON, MimeRender MimeJSON InlineObject11)
  => InlineObject11 -- ^ "groupParam"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest GetFleetLocations MimeJSON InlineResponse2003 MimeJSON
getFleetLocations groupParam (AccessToken accessToken) =
  _mkRequest "POST" ["/fleet/locations"]
    `setBodyParam` groupParam
    `setQuery` toQuery ("access_token", Just accessToken)

data GetFleetLocations 
instance HasBodyParam GetFleetLocations InlineObject11 

-- | @application/json@
instance Consumes GetFleetLocations MimeJSON

-- | @application/json@
instance Produces GetFleetLocations MimeJSON


-- *** getFleetMaintenanceList

-- | @POST \/fleet\/maintenance\/list@
-- 
-- /fleet/maintenance/list
-- 
-- Get list of the vehicles with any engine faults or check light data.
-- 
getFleetMaintenanceList 
  :: (Consumes GetFleetMaintenanceList MimeJSON, MimeRender MimeJSON InlineObject13)
  => InlineObject13 -- ^ "groupParam"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest GetFleetMaintenanceList MimeJSON InlineResponse2004 MimeJSON
getFleetMaintenanceList groupParam (AccessToken accessToken) =
  _mkRequest "POST" ["/fleet/maintenance/list"]
    `setBodyParam` groupParam
    `setQuery` toQuery ("access_token", Just accessToken)

data GetFleetMaintenanceList 
instance HasBodyParam GetFleetMaintenanceList InlineObject13 

-- | @application/json@
instance Consumes GetFleetMaintenanceList MimeJSON

-- | @application/json@
instance Produces GetFleetMaintenanceList MimeJSON


-- *** getFleetTrips

-- | @POST \/fleet\/trips@
-- 
-- /fleet/trips
-- 
-- Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
-- 
getFleetTrips 
  :: (Consumes GetFleetTrips MimeJSON, MimeRender MimeJSON InlineObject15)
  => InlineObject15 -- ^ "tripsParam"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest GetFleetTrips MimeJSON TripResponse MimeJSON
getFleetTrips tripsParam (AccessToken accessToken) =
  _mkRequest "POST" ["/fleet/trips"]
    `setBodyParam` tripsParam
    `setQuery` toQuery ("access_token", Just accessToken)

data GetFleetTrips 
instance HasBodyParam GetFleetTrips InlineObject15 

-- | @application/json@
instance Consumes GetFleetTrips MimeJSON

-- | @application/json@
instance Produces GetFleetTrips MimeJSON


-- *** getFleetVehicle

-- | @GET \/fleet\/vehicles\/{vehicle_id_or_external_id}@
-- 
-- /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
-- 
-- Gets a specific vehicle.
-- 
getFleetVehicle 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> VehicleIdOrExternalId -- ^ "vehicleIdOrExternalId" -  ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
  -> SamsaraRequest GetFleetVehicle MimeNoContent FleetVehicleResponse MimeJSON
getFleetVehicle (AccessToken accessToken) (VehicleIdOrExternalId vehicleIdOrExternalId) =
  _mkRequest "GET" ["/fleet/vehicles/",toPath vehicleIdOrExternalId]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetFleetVehicle  
-- | @application/json@
instance Produces GetFleetVehicle MimeJSON


-- *** getOrganizationAddress

-- | @GET \/addresses\/{addressId}@
-- 
-- /addresses/{addressId}
-- 
-- Fetch an address by its id.
-- 
getOrganizationAddress 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> AddressId -- ^ "addressId" -  ID of the address/geofence
  -> SamsaraRequest GetOrganizationAddress MimeNoContent Address MimeJSON
getOrganizationAddress (AccessToken accessToken) (AddressId addressId) =
  _mkRequest "GET" ["/addresses/",toPath addressId]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetOrganizationAddress  
-- | @application/json@
instance Produces GetOrganizationAddress MimeJSON


-- *** getOrganizationAddresses

-- | @GET \/addresses@
-- 
-- /addresses
-- 
-- Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
-- 
getOrganizationAddresses 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest GetOrganizationAddresses MimeNoContent [Address] MimeJSON
getOrganizationAddresses (AccessToken accessToken) =
  _mkRequest "GET" ["/addresses"]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetOrganizationAddresses  
-- | @application/json@
instance Produces GetOrganizationAddresses MimeJSON


-- *** getOrganizationContact

-- | @GET \/contacts\/{contact_id}@
-- 
-- /contacts/{contact_id}
-- 
-- Fetch a contact by its id.
-- 
getOrganizationContact 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> ContactId -- ^ "contactId" -  ID of the contact
  -> SamsaraRequest GetOrganizationContact MimeNoContent Contact MimeJSON
getOrganizationContact (AccessToken accessToken) (ContactId contactId) =
  _mkRequest "GET" ["/contacts/",toPath contactId]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetOrganizationContact  
-- | @application/json@
instance Produces GetOrganizationContact MimeJSON


-- *** getVehicleHarshEvent

-- | @GET \/fleet\/vehicles\/{vehicleId}\/safety\/harsh_event@
-- 
-- /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
-- 
-- Fetch harsh event details for a vehicle.
-- 
getVehicleHarshEvent 
  :: VehicleId -- ^ "vehicleId" -  ID of the vehicle
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> Timestamp -- ^ "timestamp" -  Timestamp in milliseconds representing the timestamp of a harsh event.
  -> SamsaraRequest GetVehicleHarshEvent MimeNoContent VehicleHarshEventResponse MimeJSON
getVehicleHarshEvent (VehicleId vehicleId) (AccessToken accessToken) (Timestamp timestamp) =
  _mkRequest "GET" ["/fleet/vehicles/",toPath vehicleId,"/safety/harsh_event"]
    `setQuery` toQuery ("access_token", Just accessToken)
    `setQuery` toQuery ("timestamp", Just timestamp)

data GetVehicleHarshEvent  
-- | @application/json@
instance Produces GetVehicleHarshEvent MimeJSON


-- *** getVehicleLocations

-- | @GET \/fleet\/vehicles\/{vehicle_id}\/locations@
-- 
-- /fleet/vehicles/{vehicle_id:[0-9]+}/locations
-- 
-- Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
-- 
getVehicleLocations 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> VehicleId -- ^ "vehicleId" -  ID of the vehicle with the associated routes.
  -> StartMs -- ^ "startMs" -  Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)
  -> EndMs -- ^ "endMs" -  Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)
  -> SamsaraRequest GetVehicleLocations MimeNoContent [FleetVehicleLocation] MimeJSON
getVehicleLocations (AccessToken accessToken) (VehicleId vehicleId) (StartMs startMs) (EndMs endMs) =
  _mkRequest "GET" ["/fleet/vehicles/",toPath vehicleId,"/locations"]
    `setQuery` toQuery ("access_token", Just accessToken)
    `setQuery` toQuery ("startMs", Just startMs)
    `setQuery` toQuery ("endMs", Just endMs)

data GetVehicleLocations  
-- | @application/json@
instance Produces GetVehicleLocations MimeJSON


-- *** getVehicleSafetyScore

-- | @GET \/fleet\/vehicles\/{vehicleId}\/safety\/score@
-- 
-- /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
-- 
-- Fetch the safety score for the vehicle.
-- 
getVehicleSafetyScore 
  :: VehicleId -- ^ "vehicleId" -  ID of the vehicle
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> StartMs -- ^ "startMs" -  Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
  -> EndMs -- ^ "endMs" -  Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
  -> SamsaraRequest GetVehicleSafetyScore MimeNoContent VehicleSafetyScoreResponse MimeJSON
getVehicleSafetyScore (VehicleId vehicleId) (AccessToken accessToken) (StartMs startMs) (EndMs endMs) =
  _mkRequest "GET" ["/fleet/vehicles/",toPath vehicleId,"/safety/score"]
    `setQuery` toQuery ("access_token", Just accessToken)
    `setQuery` toQuery ("startMs", Just startMs)
    `setQuery` toQuery ("endMs", Just endMs)

data GetVehicleSafetyScore  
-- | @application/json@
instance Produces GetVehicleSafetyScore MimeJSON


-- *** getVehicleStats

-- | @GET \/fleet\/vehicles\/stats@
-- 
-- /fleet/vehicles/stats
-- 
-- Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
-- 
getVehicleStats 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> StartMsInt -- ^ "startMs" -  Time in Unix epoch milliseconds for the start of the query.
  -> EndMsInt -- ^ "endMs" -  Time in Unix epoch milliseconds for the end of the query.
  -> SamsaraRequest GetVehicleStats MimeNoContent InlineResponse2005 MimeJSON
getVehicleStats (AccessToken accessToken) (StartMsInt startMs) (EndMsInt endMs) =
  _mkRequest "GET" ["/fleet/vehicles/stats"]
    `setQuery` toQuery ("access_token", Just accessToken)
    `setQuery` toQuery ("startMs", Just startMs)
    `setQuery` toQuery ("endMs", Just endMs)

data GetVehicleStats  

-- | /Optional Param/ "series" - Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2
instance HasOptionalParam GetVehicleStats Series where
  applyOptionalParam req (Series xs) =
    req `setQuery` toQuery ("series", Just xs)

-- | /Optional Param/ "tagIds" - Comma-separated list of tag ids. Example: tagIds=1,2,3
instance HasOptionalParam GetVehicleStats TagIds where
  applyOptionalParam req (TagIds xs) =
    req `setQuery` toQuery ("tagIds", Just xs)

-- | /Optional Param/ "startingAfter" - Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
instance HasOptionalParam GetVehicleStats StartingAfter where
  applyOptionalParam req (StartingAfter xs) =
    req `setQuery` toQuery ("startingAfter", Just xs)

-- | /Optional Param/ "endingBefore" - Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
instance HasOptionalParam GetVehicleStats EndingBefore where
  applyOptionalParam req (EndingBefore xs) =
    req `setQuery` toQuery ("endingBefore", Just xs)

-- | /Optional Param/ "limit" - Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
instance HasOptionalParam GetVehicleStats Limit where
  applyOptionalParam req (Limit xs) =
    req `setQuery` toQuery ("limit", Just xs)
-- | @application/json@
instance Produces GetVehicleStats MimeJSON


-- *** getVehiclesLocations

-- | @GET \/fleet\/vehicles\/locations@
-- 
-- /fleet/vehicles/locations
-- 
-- Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
-- 
getVehiclesLocations 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> StartMsInt -- ^ "startMs" -  Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)
  -> EndMsInt -- ^ "endMs" -  Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)
  -> SamsaraRequest GetVehiclesLocations MimeNoContent [A.Value] MimeJSON
getVehiclesLocations (AccessToken accessToken) (StartMsInt startMs) (EndMsInt endMs) =
  _mkRequest "GET" ["/fleet/vehicles/locations"]
    `setQuery` toQuery ("access_token", Just accessToken)
    `setQuery` toQuery ("startMs", Just startMs)
    `setQuery` toQuery ("endMs", Just endMs)

data GetVehiclesLocations  
-- | @application/json@
instance Produces GetVehiclesLocations MimeJSON


-- *** listContacts

-- | @GET \/contacts@
-- 
-- /contacts
-- 
-- Fetch all contacts for the organization.
-- 
listContacts 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest ListContacts MimeNoContent [Contact] MimeJSON
listContacts (AccessToken accessToken) =
  _mkRequest "GET" ["/contacts"]
    `setQuery` toQuery ("access_token", Just accessToken)

data ListContacts  
-- | @application/json@
instance Produces ListContacts MimeJSON


-- *** listFleet

-- | @POST \/fleet\/list@
-- 
-- /fleet/list
-- 
-- Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
-- 
listFleet 
  :: (Consumes ListFleet MimeJSON, MimeRender MimeJSON InlineObject10)
  => InlineObject10 -- ^ "groupParam"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest ListFleet MimeJSON InlineResponse2002 MimeJSON
listFleet groupParam (AccessToken accessToken) =
  _mkRequest "POST" ["/fleet/list"]
    `setBodyParam` groupParam
    `setQuery` toQuery ("access_token", Just accessToken)

data ListFleet 
instance HasBodyParam ListFleet InlineObject10 

-- | /Optional Param/ "startingAfter" - Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
instance HasOptionalParam ListFleet StartingAfter where
  applyOptionalParam req (StartingAfter xs) =
    req `setQuery` toQuery ("startingAfter", Just xs)

-- | /Optional Param/ "endingBefore" - Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
instance HasOptionalParam ListFleet EndingBefore where
  applyOptionalParam req (EndingBefore xs) =
    req `setQuery` toQuery ("endingBefore", Just xs)

-- | /Optional Param/ "limit" - Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
instance HasOptionalParam ListFleet Limit where
  applyOptionalParam req (Limit xs) =
    req `setQuery` toQuery ("limit", Just xs)

-- | @application/json@
instance Consumes ListFleet MimeJSON

-- | @application/json@
instance Produces ListFleet MimeJSON


-- *** patchFleetVehicle

-- | @PATCH \/fleet\/vehicles\/{vehicle_id_or_external_id}@
-- 
-- /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
-- 
-- Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
-- 
patchFleetVehicle 
  :: (Consumes PatchFleetVehicle contentType, MimeRender contentType InlineObject16)
  => ContentType contentType -- ^ request content-type ('MimeType')
  -> InlineObject16 -- ^ "_data"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> VehicleIdOrExternalId -- ^ "vehicleIdOrExternalId" -  ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs.
  -> SamsaraRequest PatchFleetVehicle contentType FleetVehicleResponse MimeJSON
patchFleetVehicle _ _data (AccessToken accessToken) (VehicleIdOrExternalId vehicleIdOrExternalId) =
  _mkRequest "PATCH" ["/fleet/vehicles/",toPath vehicleIdOrExternalId]
    `setBodyParam` _data
    `setQuery` toQuery ("access_token", Just accessToken)

data PatchFleetVehicle 
instance HasBodyParam PatchFleetVehicle InlineObject16 

-- | @application/json@
instance Consumes PatchFleetVehicle MimeJSON
-- | @application/merge-patch+json@
instance Consumes PatchFleetVehicle MimeMergePatchjson

-- | @application/json@
instance Produces PatchFleetVehicle MimeJSON


-- *** reactivateDriverById

-- | @PUT \/fleet\/drivers\/inactive\/{driver_id_or_external_id}@
-- 
-- /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
-- 
-- Reactivate the inactive driver having id.
-- 
reactivateDriverById 
  :: (Consumes ReactivateDriverById MimeJSON, MimeRender MimeJSON InlineObject4)
  => InlineObject4 -- ^ "reactivateDriverParam"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> DriverIdOrExternalId -- ^ "driverIdOrExternalId" -  ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs.
  -> SamsaraRequest ReactivateDriverById MimeJSON Driver MimeJSON
reactivateDriverById reactivateDriverParam (AccessToken accessToken) (DriverIdOrExternalId driverIdOrExternalId) =
  _mkRequest "PUT" ["/fleet/drivers/inactive/",toPath driverIdOrExternalId]
    `setBodyParam` reactivateDriverParam
    `setQuery` toQuery ("access_token", Just accessToken)

data ReactivateDriverById 
instance HasBodyParam ReactivateDriverById InlineObject4 

-- | @application/json@
instance Consumes ReactivateDriverById MimeJSON

-- | @application/json@
instance Produces ReactivateDriverById MimeJSON


-- *** updateDispatchRouteById

-- | @PUT \/fleet\/dispatch\/routes\/{route_id}@
-- 
-- /fleet/dispatch/routes/{route_id:[0-9]+}/
-- 
-- Update a dispatch route and its associated jobs.
-- 
updateDispatchRouteById 
  :: (Consumes UpdateDispatchRouteById MimeJSON, MimeRender MimeJSON DispatchRoute)
  => DispatchRoute -- ^ "updateDispatchRouteParams"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> RouteId -- ^ "routeId" -  ID of the dispatch route.
  -> SamsaraRequest UpdateDispatchRouteById MimeJSON DispatchRoute MimeJSON
updateDispatchRouteById updateDispatchRouteParams (AccessToken accessToken) (RouteId routeId) =
  _mkRequest "PUT" ["/fleet/dispatch/routes/",toPath routeId]
    `setBodyParam` updateDispatchRouteParams
    `setQuery` toQuery ("access_token", Just accessToken)

data UpdateDispatchRouteById 
instance HasBodyParam UpdateDispatchRouteById DispatchRoute 

-- | @application/json@
instance Consumes UpdateDispatchRouteById MimeJSON

-- | @application/json@
instance Produces UpdateDispatchRouteById MimeJSON


-- *** updateOrganizationAddress

-- | @PATCH \/addresses\/{addressId}@
-- 
-- /addresses/{addressId}
-- 
-- Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
updateOrganizationAddress 
  :: (Consumes UpdateOrganizationAddress MimeJSON, MimeRender MimeJSON InlineObject1)
  => InlineObject1 -- ^ "address"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> AddressId -- ^ "addressId" -  ID of the address/geofence
  -> SamsaraRequest UpdateOrganizationAddress MimeJSON res MimeJSON
updateOrganizationAddress address (AccessToken accessToken) (AddressId addressId) =
  _mkRequest "PATCH" ["/addresses/",toPath addressId]
    `setBodyParam` address
    `setQuery` toQuery ("access_token", Just accessToken)

data UpdateOrganizationAddress 
instance HasBodyParam UpdateOrganizationAddress InlineObject1 

-- | @application/json@
instance Consumes UpdateOrganizationAddress MimeJSON

-- | @application/json@
instance Produces UpdateOrganizationAddress MimeJSON


-- *** updateVehicles

-- | @POST \/fleet\/set_data@
-- 
-- /fleet/set_data
-- 
-- This method enables the mutation of metadata for vehicles in the Samsara Cloud.
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
updateVehicles 
  :: (Consumes UpdateVehicles MimeJSON, MimeRender MimeJSON InlineObject14)
  => InlineObject14 -- ^ "vehicleUpdateParam"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest UpdateVehicles MimeJSON res MimeJSON
updateVehicles vehicleUpdateParam (AccessToken accessToken) =
  _mkRequest "POST" ["/fleet/set_data"]
    `setBodyParam` vehicleUpdateParam
    `setQuery` toQuery ("access_token", Just accessToken)

data UpdateVehicles 
instance HasBodyParam UpdateVehicles InlineObject14 

-- | @application/json@
instance Consumes UpdateVehicles MimeJSON

-- | @application/json@
instance Produces UpdateVehicles MimeJSON

