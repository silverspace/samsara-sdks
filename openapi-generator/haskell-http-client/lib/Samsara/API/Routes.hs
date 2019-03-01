{-
   Samsara API

   # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

   OpenAPI Version: 3.0.1
   Samsara API API version: 1.0.0
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : Samsara.API.Routes
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Samsara.API.Routes where

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


-- ** Routes

-- *** createDispatchRoute0

-- | @POST \/fleet\/dispatch\/routes@
-- 
-- /fleet/dispatch/routes
-- 
-- Create a new dispatch route.
-- 
createDispatchRoute0 
  :: (Consumes CreateDispatchRoute0 MimeJSON, MimeRender MimeJSON DispatchRouteCreate)
  => DispatchRouteCreate -- ^ "createDispatchRouteParams"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest CreateDispatchRoute0 MimeJSON DispatchRoute MimeJSON
createDispatchRoute0 createDispatchRouteParams (AccessToken accessToken) =
  _mkRequest "POST" ["/fleet/dispatch/routes"]
    `setBodyParam` createDispatchRouteParams
    `setQuery` toQuery ("access_token", Just accessToken)

data CreateDispatchRoute0 
instance HasBodyParam CreateDispatchRoute0 DispatchRouteCreate 

-- | @application/json@
instance Consumes CreateDispatchRoute0 MimeJSON

-- | @application/json@
instance Produces CreateDispatchRoute0 MimeJSON


-- *** createDriverDispatchRoute0

-- | @POST \/fleet\/drivers\/{driver_id}\/dispatch\/routes@
-- 
-- /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
-- 
-- Create a new dispatch route for the driver with driver_id.
-- 
createDriverDispatchRoute0 
  :: (Consumes CreateDriverDispatchRoute0 MimeJSON, MimeRender MimeJSON DispatchRouteCreate)
  => DispatchRouteCreate -- ^ "createDispatchRouteParams"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> DriverId -- ^ "driverId" -  ID of the driver with the associated routes.
  -> SamsaraRequest CreateDriverDispatchRoute0 MimeJSON DispatchRoute MimeJSON
createDriverDispatchRoute0 createDispatchRouteParams (AccessToken accessToken) (DriverId driverId) =
  _mkRequest "POST" ["/fleet/drivers/",toPath driverId,"/dispatch/routes"]
    `setBodyParam` createDispatchRouteParams
    `setQuery` toQuery ("access_token", Just accessToken)

data CreateDriverDispatchRoute0 
instance HasBodyParam CreateDriverDispatchRoute0 DispatchRouteCreate 

-- | @application/json@
instance Consumes CreateDriverDispatchRoute0 MimeJSON

-- | @application/json@
instance Produces CreateDriverDispatchRoute0 MimeJSON


-- *** createVehicleDispatchRoute0

-- | @POST \/fleet\/vehicles\/{vehicle_id}\/dispatch\/routes@
-- 
-- /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
-- 
-- Create a new dispatch route for the vehicle with vehicle_id.
-- 
createVehicleDispatchRoute0 
  :: (Consumes CreateVehicleDispatchRoute0 MimeJSON, MimeRender MimeJSON DispatchRouteCreate)
  => DispatchRouteCreate -- ^ "createDispatchRouteParams"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> VehicleId -- ^ "vehicleId" -  ID of the vehicle with the associated routes.
  -> SamsaraRequest CreateVehicleDispatchRoute0 MimeJSON DispatchRoute MimeJSON
createVehicleDispatchRoute0 createDispatchRouteParams (AccessToken accessToken) (VehicleId vehicleId) =
  _mkRequest "POST" ["/fleet/vehicles/",toPath vehicleId,"/dispatch/routes"]
    `setBodyParam` createDispatchRouteParams
    `setQuery` toQuery ("access_token", Just accessToken)

data CreateVehicleDispatchRoute0 
instance HasBodyParam CreateVehicleDispatchRoute0 DispatchRouteCreate 

-- | @application/json@
instance Consumes CreateVehicleDispatchRoute0 MimeJSON

-- | @application/json@
instance Produces CreateVehicleDispatchRoute0 MimeJSON


-- *** deleteDispatchRouteById0

-- | @DELETE \/fleet\/dispatch\/routes\/{route_id}@
-- 
-- /fleet/dispatch/routes/{route_id:[0-9]+}/
-- 
-- Delete a dispatch route and its associated jobs.
-- 
-- Note: Has 'Produces' instances, but no response schema
-- 
deleteDispatchRouteById0 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> RouteId -- ^ "routeId" -  ID of the dispatch route.
  -> SamsaraRequest DeleteDispatchRouteById0 MimeNoContent res MimeJSON
deleteDispatchRouteById0 (AccessToken accessToken) (RouteId routeId) =
  _mkRequest "DELETE" ["/fleet/dispatch/routes/",toPath routeId]
    `setQuery` toQuery ("access_token", Just accessToken)

data DeleteDispatchRouteById0  
-- | @application/json@
instance Produces DeleteDispatchRouteById0 MimeJSON


-- *** fetchAllDispatchRoutes0

-- | @GET \/fleet\/dispatch\/routes@
-- 
-- /fleet/dispatch/routes
-- 
-- Fetch all of the dispatch routes for the group.
-- 
fetchAllDispatchRoutes0 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest FetchAllDispatchRoutes0 MimeNoContent [DispatchRoute] MimeJSON
fetchAllDispatchRoutes0 (AccessToken accessToken) =
  _mkRequest "GET" ["/fleet/dispatch/routes"]
    `setQuery` toQuery ("access_token", Just accessToken)

data FetchAllDispatchRoutes0  

-- | /Optional Param/ "group_id" - Optional group ID if the organization has multiple groups (uncommon).
instance HasOptionalParam FetchAllDispatchRoutes0 GroupId where
  applyOptionalParam req (GroupId xs) =
    req `setQuery` toQuery ("group_id", Just xs)

-- | /Optional Param/ "end_time" - Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
instance HasOptionalParam FetchAllDispatchRoutes0 EndTime where
  applyOptionalParam req (EndTime xs) =
    req `setQuery` toQuery ("end_time", Just xs)

-- | /Optional Param/ "duration" - Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
instance HasOptionalParam FetchAllDispatchRoutes0 Duration where
  applyOptionalParam req (Duration xs) =
    req `setQuery` toQuery ("duration", Just xs)
-- | @application/json@
instance Produces FetchAllDispatchRoutes0 MimeJSON


-- *** fetchAllRouteJobUpdates0

-- | @GET \/fleet\/dispatch\/routes\/job_updates@
-- 
-- /fleet/dispatch/routes/job_updates
-- 
-- Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
-- 
fetchAllRouteJobUpdates0 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> SamsaraRequest FetchAllRouteJobUpdates0 MimeNoContent AllRouteJobUpdates MimeJSON
fetchAllRouteJobUpdates0 (AccessToken accessToken) =
  _mkRequest "GET" ["/fleet/dispatch/routes/job_updates"]
    `setQuery` toQuery ("access_token", Just accessToken)

data FetchAllRouteJobUpdates0  

-- | /Optional Param/ "group_id" - Optional group ID if the organization has multiple groups (uncommon).
instance HasOptionalParam FetchAllRouteJobUpdates0 GroupId where
  applyOptionalParam req (GroupId xs) =
    req `setQuery` toQuery ("group_id", Just xs)

-- | /Optional Param/ "sequence_id" - Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
instance HasOptionalParam FetchAllRouteJobUpdates0 SequenceId where
  applyOptionalParam req (SequenceId xs) =
    req `setQuery` toQuery ("sequence_id", Just xs)

-- | /Optional Param/ "include" - Optionally set include=route to include route object in response payload.
instance HasOptionalParam FetchAllRouteJobUpdates0 Include where
  applyOptionalParam req (Include xs) =
    req `setQuery` toQuery ("include", Just xs)
-- | @application/json@
instance Produces FetchAllRouteJobUpdates0 MimeJSON


-- *** getDispatchRouteById0

-- | @GET \/fleet\/dispatch\/routes\/{route_id}@
-- 
-- /fleet/dispatch/routes/{route_id:[0-9]+}
-- 
-- Fetch a dispatch route by id.
-- 
getDispatchRouteById0 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> RouteId -- ^ "routeId" -  ID of the dispatch route.
  -> SamsaraRequest GetDispatchRouteById0 MimeNoContent DispatchRoute MimeJSON
getDispatchRouteById0 (AccessToken accessToken) (RouteId routeId) =
  _mkRequest "GET" ["/fleet/dispatch/routes/",toPath routeId]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetDispatchRouteById0  
-- | @application/json@
instance Produces GetDispatchRouteById0 MimeJSON


-- *** getDispatchRouteHistory0

-- | @GET \/fleet\/dispatch\/routes\/{route_id}\/history@
-- 
-- /fleet/dispatch/routes/{route_id:[0-9]+}/history
-- 
-- Fetch the history of a dispatch route.
-- 
getDispatchRouteHistory0 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> RouteId -- ^ "routeId" -  ID of the route with history.
  -> SamsaraRequest GetDispatchRouteHistory0 MimeNoContent DispatchRouteHistory MimeJSON
getDispatchRouteHistory0 (AccessToken accessToken) (RouteId routeId) =
  _mkRequest "GET" ["/fleet/dispatch/routes/",toPath routeId,"/history"]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetDispatchRouteHistory0  

-- | /Optional Param/ "start_time" - Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
instance HasOptionalParam GetDispatchRouteHistory0 StartTime where
  applyOptionalParam req (StartTime xs) =
    req `setQuery` toQuery ("start_time", Just xs)

-- | /Optional Param/ "end_time" - Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
instance HasOptionalParam GetDispatchRouteHistory0 EndTime where
  applyOptionalParam req (EndTime xs) =
    req `setQuery` toQuery ("end_time", Just xs)
-- | @application/json@
instance Produces GetDispatchRouteHistory0 MimeJSON


-- *** getDispatchRoutesByDriverId0

-- | @GET \/fleet\/drivers\/{driver_id}\/dispatch\/routes@
-- 
-- /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
-- 
-- Fetch all of the dispatch routes for a given driver.
-- 
getDispatchRoutesByDriverId0 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> DriverId -- ^ "driverId" -  ID of the driver with the associated routes.
  -> SamsaraRequest GetDispatchRoutesByDriverId0 MimeNoContent [DispatchRoute] MimeJSON
getDispatchRoutesByDriverId0 (AccessToken accessToken) (DriverId driverId) =
  _mkRequest "GET" ["/fleet/drivers/",toPath driverId,"/dispatch/routes"]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetDispatchRoutesByDriverId0  

-- | /Optional Param/ "end_time" - Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
instance HasOptionalParam GetDispatchRoutesByDriverId0 EndTime where
  applyOptionalParam req (EndTime xs) =
    req `setQuery` toQuery ("end_time", Just xs)

-- | /Optional Param/ "duration" - Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
instance HasOptionalParam GetDispatchRoutesByDriverId0 Duration where
  applyOptionalParam req (Duration xs) =
    req `setQuery` toQuery ("duration", Just xs)
-- | @application/json@
instance Produces GetDispatchRoutesByDriverId0 MimeJSON


-- *** getDispatchRoutesByVehicleId0

-- | @GET \/fleet\/vehicles\/{vehicle_id}\/dispatch\/routes@
-- 
-- /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
-- 
-- Fetch all of the dispatch routes for a given vehicle.
-- 
getDispatchRoutesByVehicleId0 
  :: AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> VehicleId -- ^ "vehicleId" -  ID of the vehicle with the associated routes.
  -> SamsaraRequest GetDispatchRoutesByVehicleId0 MimeNoContent [DispatchRoute] MimeJSON
getDispatchRoutesByVehicleId0 (AccessToken accessToken) (VehicleId vehicleId) =
  _mkRequest "GET" ["/fleet/vehicles/",toPath vehicleId,"/dispatch/routes"]
    `setQuery` toQuery ("access_token", Just accessToken)

data GetDispatchRoutesByVehicleId0  

-- | /Optional Param/ "end_time" - Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
instance HasOptionalParam GetDispatchRoutesByVehicleId0 EndTime where
  applyOptionalParam req (EndTime xs) =
    req `setQuery` toQuery ("end_time", Just xs)

-- | /Optional Param/ "duration" - Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
instance HasOptionalParam GetDispatchRoutesByVehicleId0 Duration where
  applyOptionalParam req (Duration xs) =
    req `setQuery` toQuery ("duration", Just xs)
-- | @application/json@
instance Produces GetDispatchRoutesByVehicleId0 MimeJSON


-- *** updateDispatchRouteById0

-- | @PUT \/fleet\/dispatch\/routes\/{route_id}@
-- 
-- /fleet/dispatch/routes/{route_id:[0-9]+}/
-- 
-- Update a dispatch route and its associated jobs.
-- 
updateDispatchRouteById0 
  :: (Consumes UpdateDispatchRouteById0 MimeJSON, MimeRender MimeJSON DispatchRoute)
  => DispatchRoute -- ^ "updateDispatchRouteParams"
  -> AccessToken -- ^ "accessToken" -  Samsara API access token.
  -> RouteId -- ^ "routeId" -  ID of the dispatch route.
  -> SamsaraRequest UpdateDispatchRouteById0 MimeJSON DispatchRoute MimeJSON
updateDispatchRouteById0 updateDispatchRouteParams (AccessToken accessToken) (RouteId routeId) =
  _mkRequest "PUT" ["/fleet/dispatch/routes/",toPath routeId]
    `setBodyParam` updateDispatchRouteParams
    `setQuery` toQuery ("access_token", Just accessToken)

data UpdateDispatchRouteById0 
instance HasBodyParam UpdateDispatchRouteById0 DispatchRoute 

-- | @application/json@
instance Consumes UpdateDispatchRouteById0 MimeJSON

-- | @application/json@
instance Produces UpdateDispatchRouteById0 MimeJSON

