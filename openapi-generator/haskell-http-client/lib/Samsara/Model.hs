{-
   Samsara API

   # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

   OpenAPI Version: 3.0.1
   Samsara API API version: 1.0.0
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : Samsara.Model
-}

{-# LANGUAGE DeriveDataTypeable #-}
{-# LANGUAGE DeriveFoldable #-}
{-# LANGUAGE DeriveGeneric #-}
{-# LANGUAGE DeriveTraversable #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE LambdaCase #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE NamedFieldPuns #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE TupleSections #-}
{-# LANGUAGE TypeFamilies #-}
{-# OPTIONS_GHC -fno-warn-unused-matches -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Samsara.Model where

import Samsara.Core
import Samsara.MimeTypes

import Data.Aeson ((.:),(.:!),(.:?),(.=))

import qualified Control.Arrow as P (left)
import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Base64 as B64
import qualified Data.ByteString.Char8 as BC
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Typeable, TypeRep, typeOf, typeRep)
import qualified Data.Foldable as P
import qualified Data.HashMap.Lazy as HM
import qualified Data.Map as Map
import qualified Data.Maybe as P
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Time as TI
import qualified Lens.Micro as L
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Control.Applicative ((<|>))
import Control.Applicative (Alternative)
import Data.Function ((&))
import Data.Monoid ((<>))
import Data.Text (Text)
import Prelude (($),(/=),(.),(<$>),(<*>),(>>=),(=<<),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)

import qualified Prelude as P



-- * Parameter newtypes


-- ** AccessToken
newtype AccessToken = AccessToken { unAccessToken :: Text } deriving (P.Eq, P.Show)

-- ** AddressId
newtype AddressId = AddressId { unAddressId :: Integer } deriving (P.Eq, P.Show)

-- ** AssetId
newtype AssetId = AssetId { unAssetId :: Integer } deriving (P.Eq, P.Show)

-- ** ContactId
newtype ContactId = ContactId { unContactId :: Integer } deriving (P.Eq, P.Show)

-- ** DataInputId
newtype DataInputId = DataInputId { unDataInputId :: Integer } deriving (P.Eq, P.Show)

-- ** DriverId
newtype DriverId = DriverId { unDriverId :: Integer } deriving (P.Eq, P.Show)

-- ** DriverIdOrExternalId
newtype DriverIdOrExternalId = DriverIdOrExternalId { unDriverIdOrExternalId :: Text } deriving (P.Eq, P.Show)

-- ** Duration
newtype Duration = Duration { unDuration :: Integer } deriving (P.Eq, P.Show)

-- ** DurationMs
newtype DurationMs = DurationMs { unDurationMs :: Integer } deriving (P.Eq, P.Show)

-- ** DurationMsInt
newtype DurationMsInt = DurationMsInt { unDurationMsInt :: Int } deriving (P.Eq, P.Show)

-- ** EndMs
newtype EndMs = EndMs { unEndMs :: Integer } deriving (P.Eq, P.Show)

-- ** EndMsInt
newtype EndMsInt = EndMsInt { unEndMsInt :: Int } deriving (P.Eq, P.Show)

-- ** EndTime
newtype EndTime = EndTime { unEndTime :: Integer } deriving (P.Eq, P.Show)

-- ** EndingBefore
newtype EndingBefore = EndingBefore { unEndingBefore :: Text } deriving (P.Eq, P.Show)

-- ** GroupId
newtype GroupId = GroupId { unGroupId :: Integer } deriving (P.Eq, P.Show)

-- ** GroupIdInt
newtype GroupIdInt = GroupIdInt { unGroupIdInt :: Int } deriving (P.Eq, P.Show)

-- ** Include
newtype Include = Include { unInclude :: Text } deriving (P.Eq, P.Show)

-- ** Limit
newtype Limit = Limit { unLimit :: Integer } deriving (P.Eq, P.Show)

-- ** RouteId
newtype RouteId = RouteId { unRouteId :: Integer } deriving (P.Eq, P.Show)

-- ** SequenceId
newtype SequenceId = SequenceId { unSequenceId :: Text } deriving (P.Eq, P.Show)

-- ** Series
newtype Series = Series { unSeries :: E'Series } deriving (P.Eq, P.Show)

-- ** SnapToDayBounds
newtype SnapToDayBounds = SnapToDayBounds { unSnapToDayBounds :: Bool } deriving (P.Eq, P.Show)

-- ** StartMs
newtype StartMs = StartMs { unStartMs :: Integer } deriving (P.Eq, P.Show)

-- ** StartMsInt
newtype StartMsInt = StartMsInt { unStartMsInt :: Int } deriving (P.Eq, P.Show)

-- ** StartTime
newtype StartTime = StartTime { unStartTime :: Integer } deriving (P.Eq, P.Show)

-- ** StartingAfter
newtype StartingAfter = StartingAfter { unStartingAfter :: Text } deriving (P.Eq, P.Show)

-- ** TagId
newtype TagId = TagId { unTagId :: Integer } deriving (P.Eq, P.Show)

-- ** TagIds
newtype TagIds = TagIds { unTagIds :: Text } deriving (P.Eq, P.Show)

-- ** Timestamp
newtype Timestamp = Timestamp { unTimestamp :: Integer } deriving (P.Eq, P.Show)

-- ** UserId
newtype UserId = UserId { unUserId :: Integer } deriving (P.Eq, P.Show)

-- ** VehicleId
newtype VehicleId = VehicleId { unVehicleId :: Integer } deriving (P.Eq, P.Show)

-- ** VehicleIdOrExternalId
newtype VehicleIdOrExternalId = VehicleIdOrExternalId { unVehicleIdOrExternalId :: Text } deriving (P.Eq, P.Show)

-- * Models


-- ** Address
-- | Address
-- Information about an address/geofence. Geofences are either a circle or a polygon.
data Address = Address
  { addressContacts :: !(Maybe [Contact]) -- ^ "contacts"
  , addressFormattedAddress :: !(Maybe Text) -- ^ "formattedAddress" - The full address associated with this address/geofence, as it might be recognized by maps.google.com
  , addressGeofence :: !(Maybe AddressGeofence) -- ^ "geofence"
  , addressId :: !(Maybe Integer) -- ^ "id" - ID of the address
  , addressName :: !(Maybe Text) -- ^ "name" - Name of the address or geofence
  , addressNotes :: !(Maybe Text) -- ^ "notes" - Notes associated with an address.
  , addressTags :: !(Maybe [TagMetadata]) -- ^ "tags"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON Address
instance A.FromJSON Address where
  parseJSON = A.withObject "Address" $ \o ->
    Address
      <$> (o .:? "contacts")
      <*> (o .:? "formattedAddress")
      <*> (o .:? "geofence")
      <*> (o .:? "id")
      <*> (o .:? "name")
      <*> (o .:? "notes")
      <*> (o .:? "tags")

-- | ToJSON Address
instance A.ToJSON Address where
  toJSON Address {..} =
   _omitNulls
      [ "contacts" .= addressContacts
      , "formattedAddress" .= addressFormattedAddress
      , "geofence" .= addressGeofence
      , "id" .= addressId
      , "name" .= addressName
      , "notes" .= addressNotes
      , "tags" .= addressTags
      ]


-- | Construct a value of type 'Address' (by applying it's required fields, if any)
mkAddress
  :: Address
mkAddress =
  Address
  { addressContacts = Nothing
  , addressFormattedAddress = Nothing
  , addressGeofence = Nothing
  , addressId = Nothing
  , addressName = Nothing
  , addressNotes = Nothing
  , addressTags = Nothing
  }

-- ** AddressGeofence
-- | AddressGeofence
-- The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
data AddressGeofence = AddressGeofence
  { addressGeofenceCircle :: !(Maybe AddressGeofenceCircle) -- ^ "circle"
  , addressGeofencePolygon :: !(Maybe AddressGeofencePolygon) -- ^ "polygon"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AddressGeofence
instance A.FromJSON AddressGeofence where
  parseJSON = A.withObject "AddressGeofence" $ \o ->
    AddressGeofence
      <$> (o .:? "circle")
      <*> (o .:? "polygon")

-- | ToJSON AddressGeofence
instance A.ToJSON AddressGeofence where
  toJSON AddressGeofence {..} =
   _omitNulls
      [ "circle" .= addressGeofenceCircle
      , "polygon" .= addressGeofencePolygon
      ]


-- | Construct a value of type 'AddressGeofence' (by applying it's required fields, if any)
mkAddressGeofence
  :: AddressGeofence
mkAddressGeofence =
  AddressGeofence
  { addressGeofenceCircle = Nothing
  , addressGeofencePolygon = Nothing
  }

-- ** AddressGeofenceCircle
-- | AddressGeofenceCircle
-- Information about a circular geofence. This field is only populated if the geofence is a circle.
data AddressGeofenceCircle = AddressGeofenceCircle
  { addressGeofenceCircleLatitude :: !(Maybe Double) -- ^ "latitude" - The latitude of the center of the circular geofence
  , addressGeofenceCircleRadiusMeters :: !(Maybe Integer) -- ^ "radiusMeters" - The radius of the circular geofence
  , addressGeofenceCircleLongitude :: !(Maybe Double) -- ^ "longitude" - The longitude of the center of the circular geofence
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AddressGeofenceCircle
instance A.FromJSON AddressGeofenceCircle where
  parseJSON = A.withObject "AddressGeofenceCircle" $ \o ->
    AddressGeofenceCircle
      <$> (o .:? "latitude")
      <*> (o .:? "radiusMeters")
      <*> (o .:? "longitude")

-- | ToJSON AddressGeofenceCircle
instance A.ToJSON AddressGeofenceCircle where
  toJSON AddressGeofenceCircle {..} =
   _omitNulls
      [ "latitude" .= addressGeofenceCircleLatitude
      , "radiusMeters" .= addressGeofenceCircleRadiusMeters
      , "longitude" .= addressGeofenceCircleLongitude
      ]


-- | Construct a value of type 'AddressGeofenceCircle' (by applying it's required fields, if any)
mkAddressGeofenceCircle
  :: AddressGeofenceCircle
mkAddressGeofenceCircle =
  AddressGeofenceCircle
  { addressGeofenceCircleLatitude = Nothing
  , addressGeofenceCircleRadiusMeters = Nothing
  , addressGeofenceCircleLongitude = Nothing
  }

-- ** AddressGeofencePolygon
-- | AddressGeofencePolygon
-- Information about a polygon geofence. This field is only populated if the geofence is a polygon.
data AddressGeofencePolygon = AddressGeofencePolygon
  { addressGeofencePolygonVertices :: !(Maybe [AddressGeofencePolygonVertices]) -- ^ "vertices" - The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AddressGeofencePolygon
instance A.FromJSON AddressGeofencePolygon where
  parseJSON = A.withObject "AddressGeofencePolygon" $ \o ->
    AddressGeofencePolygon
      <$> (o .:? "vertices")

-- | ToJSON AddressGeofencePolygon
instance A.ToJSON AddressGeofencePolygon where
  toJSON AddressGeofencePolygon {..} =
   _omitNulls
      [ "vertices" .= addressGeofencePolygonVertices
      ]


-- | Construct a value of type 'AddressGeofencePolygon' (by applying it's required fields, if any)
mkAddressGeofencePolygon
  :: AddressGeofencePolygon
mkAddressGeofencePolygon =
  AddressGeofencePolygon
  { addressGeofencePolygonVertices = Nothing
  }

-- ** AddressGeofencePolygonVertices
-- | AddressGeofencePolygonVertices
data AddressGeofencePolygonVertices = AddressGeofencePolygonVertices
  { addressGeofencePolygonVerticesLatitude :: !(Maybe Double) -- ^ "latitude" - The longitude of a geofence vertex
  , addressGeofencePolygonVerticesLongitude :: !(Maybe Double) -- ^ "longitude" - The longitude of a geofence vertex
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AddressGeofencePolygonVertices
instance A.FromJSON AddressGeofencePolygonVertices where
  parseJSON = A.withObject "AddressGeofencePolygonVertices" $ \o ->
    AddressGeofencePolygonVertices
      <$> (o .:? "latitude")
      <*> (o .:? "longitude")

-- | ToJSON AddressGeofencePolygonVertices
instance A.ToJSON AddressGeofencePolygonVertices where
  toJSON AddressGeofencePolygonVertices {..} =
   _omitNulls
      [ "latitude" .= addressGeofencePolygonVerticesLatitude
      , "longitude" .= addressGeofencePolygonVerticesLongitude
      ]


-- | Construct a value of type 'AddressGeofencePolygonVertices' (by applying it's required fields, if any)
mkAddressGeofencePolygonVertices
  :: AddressGeofencePolygonVertices
mkAddressGeofencePolygonVertices =
  AddressGeofencePolygonVertices
  { addressGeofencePolygonVerticesLatitude = Nothing
  , addressGeofencePolygonVerticesLongitude = Nothing
  }

-- ** AddressesAddresses
-- | AddressesAddresses
data AddressesAddresses = AddressesAddresses
  { addressesAddressesNotes :: !(Maybe Text) -- ^ "notes" - Notes associated with an address.
  , addressesAddressesFormattedAddress :: !(Text) -- ^ /Required/ "formattedAddress" - The full address associated with this address/geofence, as it might be recognized by maps.google.com
  , addressesAddressesGeofence :: !(AddressGeofence) -- ^ /Required/ "geofence"
  , addressesAddressesTagIds :: !(Maybe [Integer]) -- ^ "tagIds" - A list of tag IDs.
  , addressesAddressesName :: !(Text) -- ^ /Required/ "name" - The name of this address/geofence
  , addressesAddressesContactIds :: !(Maybe [Integer]) -- ^ "contactIds" - A list of IDs for contact book entries.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AddressesAddresses
instance A.FromJSON AddressesAddresses where
  parseJSON = A.withObject "AddressesAddresses" $ \o ->
    AddressesAddresses
      <$> (o .:? "notes")
      <*> (o .:  "formattedAddress")
      <*> (o .:  "geofence")
      <*> (o .:? "tagIds")
      <*> (o .:  "name")
      <*> (o .:? "contactIds")

-- | ToJSON AddressesAddresses
instance A.ToJSON AddressesAddresses where
  toJSON AddressesAddresses {..} =
   _omitNulls
      [ "notes" .= addressesAddressesNotes
      , "formattedAddress" .= addressesAddressesFormattedAddress
      , "geofence" .= addressesAddressesGeofence
      , "tagIds" .= addressesAddressesTagIds
      , "name" .= addressesAddressesName
      , "contactIds" .= addressesAddressesContactIds
      ]


-- | Construct a value of type 'AddressesAddresses' (by applying it's required fields, if any)
mkAddressesAddresses
  :: Text -- ^ 'addressesAddressesFormattedAddress': The full address associated with this address/geofence, as it might be recognized by maps.google.com
  -> AddressGeofence -- ^ 'addressesAddressesGeofence' 
  -> Text -- ^ 'addressesAddressesName': The name of this address/geofence
  -> AddressesAddresses
mkAddressesAddresses addressesAddressesFormattedAddress addressesAddressesGeofence addressesAddressesName =
  AddressesAddresses
  { addressesAddressesNotes = Nothing
  , addressesAddressesFormattedAddress
  , addressesAddressesGeofence
  , addressesAddressesTagIds = Nothing
  , addressesAddressesName
  , addressesAddressesContactIds = Nothing
  }

-- ** AllRouteJobUpdates
-- | AllRouteJobUpdates
data AllRouteJobUpdates = AllRouteJobUpdates
  { allRouteJobUpdatesJobUpdates :: !(Maybe [JobUpdateObject]) -- ^ "job_updates"
  , allRouteJobUpdatesSequenceId :: !(Maybe Text) -- ^ "sequence_id" - Sequence ID of the last update returned in the response
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AllRouteJobUpdates
instance A.FromJSON AllRouteJobUpdates where
  parseJSON = A.withObject "AllRouteJobUpdates" $ \o ->
    AllRouteJobUpdates
      <$> (o .:? "job_updates")
      <*> (o .:? "sequence_id")

-- | ToJSON AllRouteJobUpdates
instance A.ToJSON AllRouteJobUpdates where
  toJSON AllRouteJobUpdates {..} =
   _omitNulls
      [ "job_updates" .= allRouteJobUpdatesJobUpdates
      , "sequence_id" .= allRouteJobUpdatesSequenceId
      ]


-- | Construct a value of type 'AllRouteJobUpdates' (by applying it's required fields, if any)
mkAllRouteJobUpdates
  :: AllRouteJobUpdates
mkAllRouteJobUpdates =
  AllRouteJobUpdates
  { allRouteJobUpdatesJobUpdates = Nothing
  , allRouteJobUpdatesSequenceId = Nothing
  }

-- ** Asset
-- | Asset
-- Basic information of an asset
data Asset = Asset
  { assetAssetSerialNumber :: !(Maybe Text) -- ^ "assetSerialNumber" - Serial number of the host asset
  , assetCable :: !(Maybe [AssetCable]) -- ^ "cable" - The cable connected to the asset
  , assetEngineHours :: !(Maybe Int) -- ^ "engineHours" - Engine hours
  , assetId :: !(Integer) -- ^ /Required/ "id" - Asset ID
  , assetName :: !(Maybe Text) -- ^ "name" - Asset name
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON Asset
instance A.FromJSON Asset where
  parseJSON = A.withObject "Asset" $ \o ->
    Asset
      <$> (o .:? "assetSerialNumber")
      <*> (o .:? "cable")
      <*> (o .:? "engineHours")
      <*> (o .:  "id")
      <*> (o .:? "name")

-- | ToJSON Asset
instance A.ToJSON Asset where
  toJSON Asset {..} =
   _omitNulls
      [ "assetSerialNumber" .= assetAssetSerialNumber
      , "cable" .= assetCable
      , "engineHours" .= assetEngineHours
      , "id" .= assetId
      , "name" .= assetName
      ]


-- | Construct a value of type 'Asset' (by applying it's required fields, if any)
mkAsset
  :: Integer -- ^ 'assetId': Asset ID
  -> Asset
mkAsset assetId =
  Asset
  { assetAssetSerialNumber = Nothing
  , assetCable = Nothing
  , assetEngineHours = Nothing
  , assetId
  , assetName = Nothing
  }

-- ** AssetCable
-- | AssetCable
data AssetCable = AssetCable
  { assetCableAssetType :: !(Maybe Text) -- ^ "assetType" - Asset type
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AssetCable
instance A.FromJSON AssetCable where
  parseJSON = A.withObject "AssetCable" $ \o ->
    AssetCable
      <$> (o .:? "assetType")

-- | ToJSON AssetCable
instance A.ToJSON AssetCable where
  toJSON AssetCable {..} =
   _omitNulls
      [ "assetType" .= assetCableAssetType
      ]


-- | Construct a value of type 'AssetCable' (by applying it's required fields, if any)
mkAssetCable
  :: AssetCable
mkAssetCable =
  AssetCable
  { assetCableAssetType = Nothing
  }

-- ** AssetCurrentLocation
-- | AssetCurrentLocation
-- Current location of an asset
data AssetCurrentLocation = AssetCurrentLocation
  { assetCurrentLocationLatitude :: !(Maybe Double) -- ^ "latitude" - The latitude of the location in degrees.
  , assetCurrentLocationLocation :: !(Maybe Text) -- ^ "location" - The best effort (street,city,state) for the latitude and longitude.
  , assetCurrentLocationLongitude :: !(Maybe Double) -- ^ "longitude" - The longitude of the location in degrees.
  , assetCurrentLocationSpeedMilesPerHour :: !(Maybe Double) -- ^ "speedMilesPerHour" - The speed calculated from GPS that the asset was traveling at in miles per hour.
  , assetCurrentLocationTimeMs :: !(Maybe Integer) -- ^ "timeMs" - Time in Unix milliseconds since epoch when the asset was at the location.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AssetCurrentLocation
instance A.FromJSON AssetCurrentLocation where
  parseJSON = A.withObject "AssetCurrentLocation" $ \o ->
    AssetCurrentLocation
      <$> (o .:? "latitude")
      <*> (o .:? "location")
      <*> (o .:? "longitude")
      <*> (o .:? "speedMilesPerHour")
      <*> (o .:? "timeMs")

-- | ToJSON AssetCurrentLocation
instance A.ToJSON AssetCurrentLocation where
  toJSON AssetCurrentLocation {..} =
   _omitNulls
      [ "latitude" .= assetCurrentLocationLatitude
      , "location" .= assetCurrentLocationLocation
      , "longitude" .= assetCurrentLocationLongitude
      , "speedMilesPerHour" .= assetCurrentLocationSpeedMilesPerHour
      , "timeMs" .= assetCurrentLocationTimeMs
      ]


-- | Construct a value of type 'AssetCurrentLocation' (by applying it's required fields, if any)
mkAssetCurrentLocation
  :: AssetCurrentLocation
mkAssetCurrentLocation =
  AssetCurrentLocation
  { assetCurrentLocationLatitude = Nothing
  , assetCurrentLocationLocation = Nothing
  , assetCurrentLocationLongitude = Nothing
  , assetCurrentLocationSpeedMilesPerHour = Nothing
  , assetCurrentLocationTimeMs = Nothing
  }

-- ** AssetCurrentLocationsResponse
-- | AssetCurrentLocationsResponse
-- Basic information of an asset
data AssetCurrentLocationsResponse = AssetCurrentLocationsResponse
  { assetCurrentLocationsResponseCable :: !(Maybe [AssetCable]) -- ^ "cable" - The cable connected to the asset
  , assetCurrentLocationsResponseEngineHours :: !(Maybe Int) -- ^ "engineHours" - Engine hours
  , assetCurrentLocationsResponseId :: !(Integer) -- ^ /Required/ "id" - Asset ID
  , assetCurrentLocationsResponseLocation :: !(Maybe [AssetCurrentLocation]) -- ^ "location" - Current location of an asset
  , assetCurrentLocationsResponseName :: !(Maybe Text) -- ^ "name" - Asset name
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AssetCurrentLocationsResponse
instance A.FromJSON AssetCurrentLocationsResponse where
  parseJSON = A.withObject "AssetCurrentLocationsResponse" $ \o ->
    AssetCurrentLocationsResponse
      <$> (o .:? "cable")
      <*> (o .:? "engineHours")
      <*> (o .:  "id")
      <*> (o .:? "location")
      <*> (o .:? "name")

-- | ToJSON AssetCurrentLocationsResponse
instance A.ToJSON AssetCurrentLocationsResponse where
  toJSON AssetCurrentLocationsResponse {..} =
   _omitNulls
      [ "cable" .= assetCurrentLocationsResponseCable
      , "engineHours" .= assetCurrentLocationsResponseEngineHours
      , "id" .= assetCurrentLocationsResponseId
      , "location" .= assetCurrentLocationsResponseLocation
      , "name" .= assetCurrentLocationsResponseName
      ]


-- | Construct a value of type 'AssetCurrentLocationsResponse' (by applying it's required fields, if any)
mkAssetCurrentLocationsResponse
  :: Integer -- ^ 'assetCurrentLocationsResponseId': Asset ID
  -> AssetCurrentLocationsResponse
mkAssetCurrentLocationsResponse assetCurrentLocationsResponseId =
  AssetCurrentLocationsResponse
  { assetCurrentLocationsResponseCable = Nothing
  , assetCurrentLocationsResponseEngineHours = Nothing
  , assetCurrentLocationsResponseId
  , assetCurrentLocationsResponseLocation = Nothing
  , assetCurrentLocationsResponseName = Nothing
  }

-- ** AssetReeferResponse
-- | AssetReeferResponse
-- Reefer-specific asset details
data AssetReeferResponse = AssetReeferResponse
  { assetReeferResponseAssetType :: !(Maybe Text) -- ^ "assetType" - Asset type
  , assetReeferResponseId :: !(Maybe Int) -- ^ "id" - Asset ID
  , assetReeferResponseName :: !(Maybe Text) -- ^ "name" - Asset name
  , assetReeferResponseReeferStats :: !(Maybe AssetReeferResponseReeferStats) -- ^ "reeferStats"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AssetReeferResponse
instance A.FromJSON AssetReeferResponse where
  parseJSON = A.withObject "AssetReeferResponse" $ \o ->
    AssetReeferResponse
      <$> (o .:? "assetType")
      <*> (o .:? "id")
      <*> (o .:? "name")
      <*> (o .:? "reeferStats")

-- | ToJSON AssetReeferResponse
instance A.ToJSON AssetReeferResponse where
  toJSON AssetReeferResponse {..} =
   _omitNulls
      [ "assetType" .= assetReeferResponseAssetType
      , "id" .= assetReeferResponseId
      , "name" .= assetReeferResponseName
      , "reeferStats" .= assetReeferResponseReeferStats
      ]


-- | Construct a value of type 'AssetReeferResponse' (by applying it's required fields, if any)
mkAssetReeferResponse
  :: AssetReeferResponse
mkAssetReeferResponse =
  AssetReeferResponse
  { assetReeferResponseAssetType = Nothing
  , assetReeferResponseId = Nothing
  , assetReeferResponseName = Nothing
  , assetReeferResponseReeferStats = Nothing
  }

-- ** AssetReeferResponseReeferStats
-- | AssetReeferResponseReeferStats
data AssetReeferResponseReeferStats = AssetReeferResponseReeferStats
  { assetReeferResponseReeferStatsFuelPercentage :: !(Maybe [AssetReeferResponseReeferStatsFuelPercentage]) -- ^ "fuelPercentage" - Fuel percentage of the reefer
  , assetReeferResponseReeferStatsPowerStatus :: !(Maybe [AssetReeferResponseReeferStatsPowerStatus]) -- ^ "powerStatus" - Power status of the reefer
  , assetReeferResponseReeferStatsEngineHours :: !(Maybe [AssetReeferResponseReeferStatsEngineHours]) -- ^ "engineHours" - Engine hours of the reefer
  , assetReeferResponseReeferStatsSetPoint :: !(Maybe [AssetReeferResponseReeferStatsSetPoint]) -- ^ "setPoint" - Set point temperature of the reefer
  , assetReeferResponseReeferStatsReturnAirTemp :: !(Maybe [AssetReeferResponseReeferStatsReturnAirTemp]) -- ^ "returnAirTemp" - Return air temperature of the reefer
  , assetReeferResponseReeferStatsAlarms :: !(Maybe [AssetReeferResponseReeferStatsAlarms1]) -- ^ "alarms" - Reefer alarms
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AssetReeferResponseReeferStats
instance A.FromJSON AssetReeferResponseReeferStats where
  parseJSON = A.withObject "AssetReeferResponseReeferStats" $ \o ->
    AssetReeferResponseReeferStats
      <$> (o .:? "fuelPercentage")
      <*> (o .:? "powerStatus")
      <*> (o .:? "engineHours")
      <*> (o .:? "setPoint")
      <*> (o .:? "returnAirTemp")
      <*> (o .:? "alarms")

-- | ToJSON AssetReeferResponseReeferStats
instance A.ToJSON AssetReeferResponseReeferStats where
  toJSON AssetReeferResponseReeferStats {..} =
   _omitNulls
      [ "fuelPercentage" .= assetReeferResponseReeferStatsFuelPercentage
      , "powerStatus" .= assetReeferResponseReeferStatsPowerStatus
      , "engineHours" .= assetReeferResponseReeferStatsEngineHours
      , "setPoint" .= assetReeferResponseReeferStatsSetPoint
      , "returnAirTemp" .= assetReeferResponseReeferStatsReturnAirTemp
      , "alarms" .= assetReeferResponseReeferStatsAlarms
      ]


-- | Construct a value of type 'AssetReeferResponseReeferStats' (by applying it's required fields, if any)
mkAssetReeferResponseReeferStats
  :: AssetReeferResponseReeferStats
mkAssetReeferResponseReeferStats =
  AssetReeferResponseReeferStats
  { assetReeferResponseReeferStatsFuelPercentage = Nothing
  , assetReeferResponseReeferStatsPowerStatus = Nothing
  , assetReeferResponseReeferStatsEngineHours = Nothing
  , assetReeferResponseReeferStatsSetPoint = Nothing
  , assetReeferResponseReeferStatsReturnAirTemp = Nothing
  , assetReeferResponseReeferStatsAlarms = Nothing
  }

-- ** AssetReeferResponseReeferStatsAlarms
-- | AssetReeferResponseReeferStatsAlarms
data AssetReeferResponseReeferStatsAlarms = AssetReeferResponseReeferStatsAlarms
  { assetReeferResponseReeferStatsAlarmsSeverity :: !(Maybe Integer) -- ^ "severity" - Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
  , assetReeferResponseReeferStatsAlarmsOperatorAction :: !(Maybe Text) -- ^ "operatorAction" - Recommended operator action
  , assetReeferResponseReeferStatsAlarmsDescription :: !(Maybe Text) -- ^ "description" - Description of the alarm
  , assetReeferResponseReeferStatsAlarmsAlarmCode :: !(Maybe Integer) -- ^ "alarmCode" - ID of the alarm
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AssetReeferResponseReeferStatsAlarms
instance A.FromJSON AssetReeferResponseReeferStatsAlarms where
  parseJSON = A.withObject "AssetReeferResponseReeferStatsAlarms" $ \o ->
    AssetReeferResponseReeferStatsAlarms
      <$> (o .:? "severity")
      <*> (o .:? "operatorAction")
      <*> (o .:? "description")
      <*> (o .:? "alarmCode")

-- | ToJSON AssetReeferResponseReeferStatsAlarms
instance A.ToJSON AssetReeferResponseReeferStatsAlarms where
  toJSON AssetReeferResponseReeferStatsAlarms {..} =
   _omitNulls
      [ "severity" .= assetReeferResponseReeferStatsAlarmsSeverity
      , "operatorAction" .= assetReeferResponseReeferStatsAlarmsOperatorAction
      , "description" .= assetReeferResponseReeferStatsAlarmsDescription
      , "alarmCode" .= assetReeferResponseReeferStatsAlarmsAlarmCode
      ]


-- | Construct a value of type 'AssetReeferResponseReeferStatsAlarms' (by applying it's required fields, if any)
mkAssetReeferResponseReeferStatsAlarms
  :: AssetReeferResponseReeferStatsAlarms
mkAssetReeferResponseReeferStatsAlarms =
  AssetReeferResponseReeferStatsAlarms
  { assetReeferResponseReeferStatsAlarmsSeverity = Nothing
  , assetReeferResponseReeferStatsAlarmsOperatorAction = Nothing
  , assetReeferResponseReeferStatsAlarmsDescription = Nothing
  , assetReeferResponseReeferStatsAlarmsAlarmCode = Nothing
  }

-- ** AssetReeferResponseReeferStatsAlarms1
-- | AssetReeferResponseReeferStatsAlarms1
data AssetReeferResponseReeferStatsAlarms1 = AssetReeferResponseReeferStatsAlarms1
  { assetReeferResponseReeferStatsAlarms1Alarms :: !(Maybe [AssetReeferResponseReeferStatsAlarms]) -- ^ "alarms"
  , assetReeferResponseReeferStatsAlarms1ChangedAtMs :: !(Maybe Integer) -- ^ "changedAtMs" - Timestamp when the alarms were reported, in Unix milliseconds since epoch
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AssetReeferResponseReeferStatsAlarms1
instance A.FromJSON AssetReeferResponseReeferStatsAlarms1 where
  parseJSON = A.withObject "AssetReeferResponseReeferStatsAlarms1" $ \o ->
    AssetReeferResponseReeferStatsAlarms1
      <$> (o .:? "alarms")
      <*> (o .:? "changedAtMs")

-- | ToJSON AssetReeferResponseReeferStatsAlarms1
instance A.ToJSON AssetReeferResponseReeferStatsAlarms1 where
  toJSON AssetReeferResponseReeferStatsAlarms1 {..} =
   _omitNulls
      [ "alarms" .= assetReeferResponseReeferStatsAlarms1Alarms
      , "changedAtMs" .= assetReeferResponseReeferStatsAlarms1ChangedAtMs
      ]


-- | Construct a value of type 'AssetReeferResponseReeferStatsAlarms1' (by applying it's required fields, if any)
mkAssetReeferResponseReeferStatsAlarms1
  :: AssetReeferResponseReeferStatsAlarms1
mkAssetReeferResponseReeferStatsAlarms1 =
  AssetReeferResponseReeferStatsAlarms1
  { assetReeferResponseReeferStatsAlarms1Alarms = Nothing
  , assetReeferResponseReeferStatsAlarms1ChangedAtMs = Nothing
  }

-- ** AssetReeferResponseReeferStatsEngineHours
-- | AssetReeferResponseReeferStatsEngineHours
data AssetReeferResponseReeferStatsEngineHours = AssetReeferResponseReeferStatsEngineHours
  { assetReeferResponseReeferStatsEngineHoursEngineHours :: !(Maybe Integer) -- ^ "engineHours" - Engine hours of the reefer.
  , assetReeferResponseReeferStatsEngineHoursChangedAtMs :: !(Maybe Integer) -- ^ "changedAtMs" - Timestamp in Unix milliseconds since epoch.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AssetReeferResponseReeferStatsEngineHours
instance A.FromJSON AssetReeferResponseReeferStatsEngineHours where
  parseJSON = A.withObject "AssetReeferResponseReeferStatsEngineHours" $ \o ->
    AssetReeferResponseReeferStatsEngineHours
      <$> (o .:? "engineHours")
      <*> (o .:? "changedAtMs")

-- | ToJSON AssetReeferResponseReeferStatsEngineHours
instance A.ToJSON AssetReeferResponseReeferStatsEngineHours where
  toJSON AssetReeferResponseReeferStatsEngineHours {..} =
   _omitNulls
      [ "engineHours" .= assetReeferResponseReeferStatsEngineHoursEngineHours
      , "changedAtMs" .= assetReeferResponseReeferStatsEngineHoursChangedAtMs
      ]


-- | Construct a value of type 'AssetReeferResponseReeferStatsEngineHours' (by applying it's required fields, if any)
mkAssetReeferResponseReeferStatsEngineHours
  :: AssetReeferResponseReeferStatsEngineHours
mkAssetReeferResponseReeferStatsEngineHours =
  AssetReeferResponseReeferStatsEngineHours
  { assetReeferResponseReeferStatsEngineHoursEngineHours = Nothing
  , assetReeferResponseReeferStatsEngineHoursChangedAtMs = Nothing
  }

-- ** AssetReeferResponseReeferStatsFuelPercentage
-- | AssetReeferResponseReeferStatsFuelPercentage
data AssetReeferResponseReeferStatsFuelPercentage = AssetReeferResponseReeferStatsFuelPercentage
  { assetReeferResponseReeferStatsFuelPercentageFuelPercentage :: !(Maybe Integer) -- ^ "fuelPercentage" - Fuel percentage of the reefer.
  , assetReeferResponseReeferStatsFuelPercentageChangedAtMs :: !(Maybe Integer) -- ^ "changedAtMs" - Timestamp in Unix milliseconds since epoch.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AssetReeferResponseReeferStatsFuelPercentage
instance A.FromJSON AssetReeferResponseReeferStatsFuelPercentage where
  parseJSON = A.withObject "AssetReeferResponseReeferStatsFuelPercentage" $ \o ->
    AssetReeferResponseReeferStatsFuelPercentage
      <$> (o .:? "fuelPercentage")
      <*> (o .:? "changedAtMs")

-- | ToJSON AssetReeferResponseReeferStatsFuelPercentage
instance A.ToJSON AssetReeferResponseReeferStatsFuelPercentage where
  toJSON AssetReeferResponseReeferStatsFuelPercentage {..} =
   _omitNulls
      [ "fuelPercentage" .= assetReeferResponseReeferStatsFuelPercentageFuelPercentage
      , "changedAtMs" .= assetReeferResponseReeferStatsFuelPercentageChangedAtMs
      ]


-- | Construct a value of type 'AssetReeferResponseReeferStatsFuelPercentage' (by applying it's required fields, if any)
mkAssetReeferResponseReeferStatsFuelPercentage
  :: AssetReeferResponseReeferStatsFuelPercentage
mkAssetReeferResponseReeferStatsFuelPercentage =
  AssetReeferResponseReeferStatsFuelPercentage
  { assetReeferResponseReeferStatsFuelPercentageFuelPercentage = Nothing
  , assetReeferResponseReeferStatsFuelPercentageChangedAtMs = Nothing
  }

-- ** AssetReeferResponseReeferStatsPowerStatus
-- | AssetReeferResponseReeferStatsPowerStatus
data AssetReeferResponseReeferStatsPowerStatus = AssetReeferResponseReeferStatsPowerStatus
  { assetReeferResponseReeferStatsPowerStatusChangedAtMs :: !(Maybe Integer) -- ^ "changedAtMs" - Timestamp in Unix milliseconds since epoch.
  , assetReeferResponseReeferStatsPowerStatusStatus :: !(Maybe Text) -- ^ "status" - Power status of the reefer.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AssetReeferResponseReeferStatsPowerStatus
instance A.FromJSON AssetReeferResponseReeferStatsPowerStatus where
  parseJSON = A.withObject "AssetReeferResponseReeferStatsPowerStatus" $ \o ->
    AssetReeferResponseReeferStatsPowerStatus
      <$> (o .:? "changedAtMs")
      <*> (o .:? "status")

-- | ToJSON AssetReeferResponseReeferStatsPowerStatus
instance A.ToJSON AssetReeferResponseReeferStatsPowerStatus where
  toJSON AssetReeferResponseReeferStatsPowerStatus {..} =
   _omitNulls
      [ "changedAtMs" .= assetReeferResponseReeferStatsPowerStatusChangedAtMs
      , "status" .= assetReeferResponseReeferStatsPowerStatusStatus
      ]


-- | Construct a value of type 'AssetReeferResponseReeferStatsPowerStatus' (by applying it's required fields, if any)
mkAssetReeferResponseReeferStatsPowerStatus
  :: AssetReeferResponseReeferStatsPowerStatus
mkAssetReeferResponseReeferStatsPowerStatus =
  AssetReeferResponseReeferStatsPowerStatus
  { assetReeferResponseReeferStatsPowerStatusChangedAtMs = Nothing
  , assetReeferResponseReeferStatsPowerStatusStatus = Nothing
  }

-- ** AssetReeferResponseReeferStatsReturnAirTemp
-- | AssetReeferResponseReeferStatsReturnAirTemp
data AssetReeferResponseReeferStatsReturnAirTemp = AssetReeferResponseReeferStatsReturnAirTemp
  { assetReeferResponseReeferStatsReturnAirTempTempInMilliC :: !(Maybe Integer) -- ^ "tempInMilliC" - Return air temperature in millidegree Celsius.
  , assetReeferResponseReeferStatsReturnAirTempChangedAtMs :: !(Maybe Integer) -- ^ "changedAtMs" - Timestamp in Unix milliseconds since epoch.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AssetReeferResponseReeferStatsReturnAirTemp
instance A.FromJSON AssetReeferResponseReeferStatsReturnAirTemp where
  parseJSON = A.withObject "AssetReeferResponseReeferStatsReturnAirTemp" $ \o ->
    AssetReeferResponseReeferStatsReturnAirTemp
      <$> (o .:? "tempInMilliC")
      <*> (o .:? "changedAtMs")

-- | ToJSON AssetReeferResponseReeferStatsReturnAirTemp
instance A.ToJSON AssetReeferResponseReeferStatsReturnAirTemp where
  toJSON AssetReeferResponseReeferStatsReturnAirTemp {..} =
   _omitNulls
      [ "tempInMilliC" .= assetReeferResponseReeferStatsReturnAirTempTempInMilliC
      , "changedAtMs" .= assetReeferResponseReeferStatsReturnAirTempChangedAtMs
      ]


-- | Construct a value of type 'AssetReeferResponseReeferStatsReturnAirTemp' (by applying it's required fields, if any)
mkAssetReeferResponseReeferStatsReturnAirTemp
  :: AssetReeferResponseReeferStatsReturnAirTemp
mkAssetReeferResponseReeferStatsReturnAirTemp =
  AssetReeferResponseReeferStatsReturnAirTemp
  { assetReeferResponseReeferStatsReturnAirTempTempInMilliC = Nothing
  , assetReeferResponseReeferStatsReturnAirTempChangedAtMs = Nothing
  }

-- ** AssetReeferResponseReeferStatsSetPoint
-- | AssetReeferResponseReeferStatsSetPoint
data AssetReeferResponseReeferStatsSetPoint = AssetReeferResponseReeferStatsSetPoint
  { assetReeferResponseReeferStatsSetPointTempInMilliC :: !(Maybe Integer) -- ^ "tempInMilliC" - Set point temperature in millidegree Celsius.
  , assetReeferResponseReeferStatsSetPointChangedAtMs :: !(Maybe Integer) -- ^ "changedAtMs" - Timestamp in Unix milliseconds since epoch.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AssetReeferResponseReeferStatsSetPoint
instance A.FromJSON AssetReeferResponseReeferStatsSetPoint where
  parseJSON = A.withObject "AssetReeferResponseReeferStatsSetPoint" $ \o ->
    AssetReeferResponseReeferStatsSetPoint
      <$> (o .:? "tempInMilliC")
      <*> (o .:? "changedAtMs")

-- | ToJSON AssetReeferResponseReeferStatsSetPoint
instance A.ToJSON AssetReeferResponseReeferStatsSetPoint where
  toJSON AssetReeferResponseReeferStatsSetPoint {..} =
   _omitNulls
      [ "tempInMilliC" .= assetReeferResponseReeferStatsSetPointTempInMilliC
      , "changedAtMs" .= assetReeferResponseReeferStatsSetPointChangedAtMs
      ]


-- | Construct a value of type 'AssetReeferResponseReeferStatsSetPoint' (by applying it's required fields, if any)
mkAssetReeferResponseReeferStatsSetPoint
  :: AssetReeferResponseReeferStatsSetPoint
mkAssetReeferResponseReeferStatsSetPoint =
  AssetReeferResponseReeferStatsSetPoint
  { assetReeferResponseReeferStatsSetPointTempInMilliC = Nothing
  , assetReeferResponseReeferStatsSetPointChangedAtMs = Nothing
  }

-- ** AuxInput
-- | AuxInput
-- Digital value of an aux input.
data AuxInput = AuxInput
  { auxInputTimeMs :: !(A.Value) -- ^ /Required/ "timeMs" - Timestamp in Unix epoch milliseconds.
  , auxInputValue :: !(Bool) -- ^ /Required/ "value" - Boolean representing the digital value of the aux input.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AuxInput
instance A.FromJSON AuxInput where
  parseJSON = A.withObject "AuxInput" $ \o ->
    AuxInput
      <$> (o .:  "timeMs")
      <*> (o .:  "value")

-- | ToJSON AuxInput
instance A.ToJSON AuxInput where
  toJSON AuxInput {..} =
   _omitNulls
      [ "timeMs" .= auxInputTimeMs
      , "value" .= auxInputValue
      ]


-- | Construct a value of type 'AuxInput' (by applying it's required fields, if any)
mkAuxInput
  :: A.Value -- ^ 'auxInputTimeMs': Timestamp in Unix epoch milliseconds.
  -> Bool -- ^ 'auxInputValue': Boolean representing the digital value of the aux input.
  -> AuxInput
mkAuxInput auxInputTimeMs auxInputValue =
  AuxInput
  { auxInputTimeMs
  , auxInputValue
  }

-- ** AuxInputSeries
-- | AuxInputSeries
-- A list of aux input values over a timerange.
data AuxInputSeries = AuxInputSeries
  { auxInputSeriesName :: !(E'Name) -- ^ /Required/ "name" - The name of the aux input.
  , auxInputSeriesValues :: !([AuxInput]) -- ^ /Required/ "values"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON AuxInputSeries
instance A.FromJSON AuxInputSeries where
  parseJSON = A.withObject "AuxInputSeries" $ \o ->
    AuxInputSeries
      <$> (o .:  "name")
      <*> (o .:  "values")

-- | ToJSON AuxInputSeries
instance A.ToJSON AuxInputSeries where
  toJSON AuxInputSeries {..} =
   _omitNulls
      [ "name" .= auxInputSeriesName
      , "values" .= auxInputSeriesValues
      ]


-- | Construct a value of type 'AuxInputSeries' (by applying it's required fields, if any)
mkAuxInputSeries
  :: E'Name -- ^ 'auxInputSeriesName': The name of the aux input.
  -> [AuxInput] -- ^ 'auxInputSeriesValues' 
  -> AuxInputSeries
mkAuxInputSeries auxInputSeriesName auxInputSeriesValues =
  AuxInputSeries
  { auxInputSeriesName
  , auxInputSeriesValues
  }

-- ** CargoResponse
-- | CargoResponse
-- Contains the current cargo status of a sensor.
data CargoResponse = CargoResponse
  { cargoResponseGroupId :: !(Maybe Integer) -- ^ "groupId"
  , cargoResponseSensors :: !(Maybe [CargoResponseSensors]) -- ^ "sensors"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON CargoResponse
instance A.FromJSON CargoResponse where
  parseJSON = A.withObject "CargoResponse" $ \o ->
    CargoResponse
      <$> (o .:? "groupId")
      <*> (o .:? "sensors")

-- | ToJSON CargoResponse
instance A.ToJSON CargoResponse where
  toJSON CargoResponse {..} =
   _omitNulls
      [ "groupId" .= cargoResponseGroupId
      , "sensors" .= cargoResponseSensors
      ]


-- | Construct a value of type 'CargoResponse' (by applying it's required fields, if any)
mkCargoResponse
  :: CargoResponse
mkCargoResponse =
  CargoResponse
  { cargoResponseGroupId = Nothing
  , cargoResponseSensors = Nothing
  }

-- ** CargoResponseSensors
-- | CargoResponseSensors
data CargoResponseSensors = CargoResponseSensors
  { cargoResponseSensorsCargoEmpty :: !(Maybe Bool) -- ^ "cargoEmpty" - Flag indicating whether the current cargo is empty or loaded.
  , cargoResponseSensorsName :: !(Maybe Text) -- ^ "name" - Name of the sensor.
  , cargoResponseSensorsId :: !(Maybe Integer) -- ^ "id" - ID of the sensor.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON CargoResponseSensors
instance A.FromJSON CargoResponseSensors where
  parseJSON = A.withObject "CargoResponseSensors" $ \o ->
    CargoResponseSensors
      <$> (o .:? "cargoEmpty")
      <*> (o .:? "name")
      <*> (o .:? "id")

-- | ToJSON CargoResponseSensors
instance A.ToJSON CargoResponseSensors where
  toJSON CargoResponseSensors {..} =
   _omitNulls
      [ "cargoEmpty" .= cargoResponseSensorsCargoEmpty
      , "name" .= cargoResponseSensorsName
      , "id" .= cargoResponseSensorsId
      ]


-- | Construct a value of type 'CargoResponseSensors' (by applying it's required fields, if any)
mkCargoResponseSensors
  :: CargoResponseSensors
mkCargoResponseSensors =
  CargoResponseSensors
  { cargoResponseSensorsCargoEmpty = Nothing
  , cargoResponseSensorsName = Nothing
  , cargoResponseSensorsId = Nothing
  }

-- ** Contact
-- | Contact
-- Information about a notification contact for alerts.
data Contact = Contact
  { contactEmail :: !(Maybe Text) -- ^ "email" - Email address of the contact
  , contactFirstName :: !(Maybe Text) -- ^ "firstName" - First name of the contact
  , contactId :: !(Maybe Integer) -- ^ "id" - ID of the contact
  , contactLastName :: !(Maybe Text) -- ^ "lastName" - Last name of the contact
  , contactPhone :: !(Maybe Text) -- ^ "phone" - Phone number of the contact
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON Contact
instance A.FromJSON Contact where
  parseJSON = A.withObject "Contact" $ \o ->
    Contact
      <$> (o .:? "email")
      <*> (o .:? "firstName")
      <*> (o .:? "id")
      <*> (o .:? "lastName")
      <*> (o .:? "phone")

-- | ToJSON Contact
instance A.ToJSON Contact where
  toJSON Contact {..} =
   _omitNulls
      [ "email" .= contactEmail
      , "firstName" .= contactFirstName
      , "id" .= contactId
      , "lastName" .= contactLastName
      , "phone" .= contactPhone
      ]


-- | Construct a value of type 'Contact' (by applying it's required fields, if any)
mkContact
  :: Contact
mkContact =
  Contact
  { contactEmail = Nothing
  , contactFirstName = Nothing
  , contactId = Nothing
  , contactLastName = Nothing
  , contactPhone = Nothing
  }

-- ** CurrentDriver
-- | CurrentDriver
data CurrentDriver = CurrentDriver
  { 
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON CurrentDriver
instance A.FromJSON CurrentDriver where
  parseJSON = A.withObject "CurrentDriver" $ \o ->
    pure CurrentDriver
      

-- | ToJSON CurrentDriver
instance A.ToJSON CurrentDriver where
  toJSON CurrentDriver  =
   _omitNulls
      [ 
      ]


-- | Construct a value of type 'CurrentDriver' (by applying it's required fields, if any)
mkCurrentDriver
  :: CurrentDriver
mkCurrentDriver =
  CurrentDriver
  { 
  }

-- ** DataInputHistoryResponse
-- | DataInputHistoryResponse
data DataInputHistoryResponse = DataInputHistoryResponse
  { dataInputHistoryResponseId :: !(Maybe Integer) -- ^ "id" - The ID of this data input
  , dataInputHistoryResponseName :: !(Text) -- ^ /Required/ "name" - Name of this data input
  , dataInputHistoryResponsePoints :: !(Maybe [DataInputHistoryResponsePoints]) -- ^ "points" - Data points from this data input
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DataInputHistoryResponse
instance A.FromJSON DataInputHistoryResponse where
  parseJSON = A.withObject "DataInputHistoryResponse" $ \o ->
    DataInputHistoryResponse
      <$> (o .:? "id")
      <*> (o .:  "name")
      <*> (o .:? "points")

-- | ToJSON DataInputHistoryResponse
instance A.ToJSON DataInputHistoryResponse where
  toJSON DataInputHistoryResponse {..} =
   _omitNulls
      [ "id" .= dataInputHistoryResponseId
      , "name" .= dataInputHistoryResponseName
      , "points" .= dataInputHistoryResponsePoints
      ]


-- | Construct a value of type 'DataInputHistoryResponse' (by applying it's required fields, if any)
mkDataInputHistoryResponse
  :: Text -- ^ 'dataInputHistoryResponseName': Name of this data input
  -> DataInputHistoryResponse
mkDataInputHistoryResponse dataInputHistoryResponseName =
  DataInputHistoryResponse
  { dataInputHistoryResponseId = Nothing
  , dataInputHistoryResponseName
  , dataInputHistoryResponsePoints = Nothing
  }

-- ** DataInputHistoryResponsePoints
-- | DataInputHistoryResponsePoints
data DataInputHistoryResponsePoints = DataInputHistoryResponsePoints
  { dataInputHistoryResponsePointsValue :: !(Maybe Double) -- ^ "value"
  , dataInputHistoryResponsePointsTimeMs :: !(Maybe Integer) -- ^ "timeMs"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DataInputHistoryResponsePoints
instance A.FromJSON DataInputHistoryResponsePoints where
  parseJSON = A.withObject "DataInputHistoryResponsePoints" $ \o ->
    DataInputHistoryResponsePoints
      <$> (o .:? "value")
      <*> (o .:? "timeMs")

-- | ToJSON DataInputHistoryResponsePoints
instance A.ToJSON DataInputHistoryResponsePoints where
  toJSON DataInputHistoryResponsePoints {..} =
   _omitNulls
      [ "value" .= dataInputHistoryResponsePointsValue
      , "timeMs" .= dataInputHistoryResponsePointsTimeMs
      ]


-- | Construct a value of type 'DataInputHistoryResponsePoints' (by applying it's required fields, if any)
mkDataInputHistoryResponsePoints
  :: DataInputHistoryResponsePoints
mkDataInputHistoryResponsePoints =
  DataInputHistoryResponsePoints
  { dataInputHistoryResponsePointsValue = Nothing
  , dataInputHistoryResponsePointsTimeMs = Nothing
  }

-- ** DispatchJob
-- | DispatchJob
data DispatchJob = DispatchJob
  { dispatchJobDestinationAddress :: !(Maybe Text) -- ^ "destination_address" - The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
  , dispatchJobDestinationAddressId :: !(Maybe Integer) -- ^ "destination_address_id" - ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
  , dispatchJobDestinationLat :: !(Maybe Double) -- ^ "destination_lat" - Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
  , dispatchJobDestinationLng :: !(Maybe Double) -- ^ "destination_lng" - Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
  , dispatchJobDestinationName :: !(Maybe Text) -- ^ "destination_name" - The name of the job destination. If provided, it will take precedence over the name of the address book entry.
  , dispatchJobNotes :: !(Maybe Text) -- ^ "notes" - Notes regarding the details of this job.
  , dispatchJobScheduledArrivalTimeMs :: !(Integer) -- ^ /Required/ "scheduled_arrival_time_ms" - The time at which the assigned driver is scheduled to arrive at the job destination.
  , dispatchJobScheduledDepartureTimeMs :: !(Maybe Integer) -- ^ "scheduled_departure_time_ms" - The time at which the assigned driver is scheduled to depart from the job destination.
  , dispatchJobArrivedAtMs :: !(Maybe Integer) -- ^ "arrived_at_ms" - The time at which the driver arrived at the job destination.
  , dispatchJobCompletedAtMs :: !(Maybe Integer) -- ^ "completed_at_ms" - The time at which the job was marked complete (e.g. started driving to the next destination).
  , dispatchJobDispatchRouteId :: !(Integer) -- ^ /Required/ "dispatch_route_id" - ID of the route that this job belongs to.
  , dispatchJobDriverId :: !(Maybe Integer) -- ^ "driver_id" - ID of the driver assigned to the dispatch job.
  , dispatchJobEnRouteAtMs :: !(Maybe Integer) -- ^ "en_route_at_ms" - The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
  , dispatchJobEstimatedArrivalMs :: !(Maybe Integer) -- ^ "estimated_arrival_ms" - The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
  , dispatchJobFleetViewerUrl :: !(Maybe Text) -- ^ "fleet_viewer_url" - Fleet viewer url of the dispatch job.
  , dispatchJobGroupId :: !(Integer) -- ^ /Required/ "group_id"
  , dispatchJobId :: !(Integer) -- ^ /Required/ "id" - ID of the Samsara dispatch job.
  , dispatchJobJobState :: !(JobStatus) -- ^ /Required/ "job_state"
  , dispatchJobSkippedAtMs :: !(Maybe Integer) -- ^ "skipped_at_ms" - The time at which the job was marked skipped.
  , dispatchJobVehicleId :: !(Maybe Integer) -- ^ "vehicle_id" - ID of the vehicle used for the dispatch job.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DispatchJob
instance A.FromJSON DispatchJob where
  parseJSON = A.withObject "DispatchJob" $ \o ->
    DispatchJob
      <$> (o .:? "destination_address")
      <*> (o .:? "destination_address_id")
      <*> (o .:? "destination_lat")
      <*> (o .:? "destination_lng")
      <*> (o .:? "destination_name")
      <*> (o .:? "notes")
      <*> (o .:  "scheduled_arrival_time_ms")
      <*> (o .:? "scheduled_departure_time_ms")
      <*> (o .:? "arrived_at_ms")
      <*> (o .:? "completed_at_ms")
      <*> (o .:  "dispatch_route_id")
      <*> (o .:? "driver_id")
      <*> (o .:? "en_route_at_ms")
      <*> (o .:? "estimated_arrival_ms")
      <*> (o .:? "fleet_viewer_url")
      <*> (o .:  "group_id")
      <*> (o .:  "id")
      <*> (o .:  "job_state")
      <*> (o .:? "skipped_at_ms")
      <*> (o .:? "vehicle_id")

-- | ToJSON DispatchJob
instance A.ToJSON DispatchJob where
  toJSON DispatchJob {..} =
   _omitNulls
      [ "destination_address" .= dispatchJobDestinationAddress
      , "destination_address_id" .= dispatchJobDestinationAddressId
      , "destination_lat" .= dispatchJobDestinationLat
      , "destination_lng" .= dispatchJobDestinationLng
      , "destination_name" .= dispatchJobDestinationName
      , "notes" .= dispatchJobNotes
      , "scheduled_arrival_time_ms" .= dispatchJobScheduledArrivalTimeMs
      , "scheduled_departure_time_ms" .= dispatchJobScheduledDepartureTimeMs
      , "arrived_at_ms" .= dispatchJobArrivedAtMs
      , "completed_at_ms" .= dispatchJobCompletedAtMs
      , "dispatch_route_id" .= dispatchJobDispatchRouteId
      , "driver_id" .= dispatchJobDriverId
      , "en_route_at_ms" .= dispatchJobEnRouteAtMs
      , "estimated_arrival_ms" .= dispatchJobEstimatedArrivalMs
      , "fleet_viewer_url" .= dispatchJobFleetViewerUrl
      , "group_id" .= dispatchJobGroupId
      , "id" .= dispatchJobId
      , "job_state" .= dispatchJobJobState
      , "skipped_at_ms" .= dispatchJobSkippedAtMs
      , "vehicle_id" .= dispatchJobVehicleId
      ]


-- | Construct a value of type 'DispatchJob' (by applying it's required fields, if any)
mkDispatchJob
  :: Integer -- ^ 'dispatchJobScheduledArrivalTimeMs': The time at which the assigned driver is scheduled to arrive at the job destination.
  -> Integer -- ^ 'dispatchJobDispatchRouteId': ID of the route that this job belongs to.
  -> Integer -- ^ 'dispatchJobGroupId' 
  -> Integer -- ^ 'dispatchJobId': ID of the Samsara dispatch job.
  -> JobStatus -- ^ 'dispatchJobJobState' 
  -> DispatchJob
mkDispatchJob dispatchJobScheduledArrivalTimeMs dispatchJobDispatchRouteId dispatchJobGroupId dispatchJobId dispatchJobJobState =
  DispatchJob
  { dispatchJobDestinationAddress = Nothing
  , dispatchJobDestinationAddressId = Nothing
  , dispatchJobDestinationLat = Nothing
  , dispatchJobDestinationLng = Nothing
  , dispatchJobDestinationName = Nothing
  , dispatchJobNotes = Nothing
  , dispatchJobScheduledArrivalTimeMs
  , dispatchJobScheduledDepartureTimeMs = Nothing
  , dispatchJobArrivedAtMs = Nothing
  , dispatchJobCompletedAtMs = Nothing
  , dispatchJobDispatchRouteId
  , dispatchJobDriverId = Nothing
  , dispatchJobEnRouteAtMs = Nothing
  , dispatchJobEstimatedArrivalMs = Nothing
  , dispatchJobFleetViewerUrl = Nothing
  , dispatchJobGroupId
  , dispatchJobId
  , dispatchJobJobState
  , dispatchJobSkippedAtMs = Nothing
  , dispatchJobVehicleId = Nothing
  }

-- ** DispatchJobCreate
-- | DispatchJobCreate
data DispatchJobCreate = DispatchJobCreate
  { dispatchJobCreateDestinationAddress :: !(Maybe Text) -- ^ "destination_address" - The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
  , dispatchJobCreateDestinationAddressId :: !(Maybe Integer) -- ^ "destination_address_id" - ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
  , dispatchJobCreateDestinationLat :: !(Maybe Double) -- ^ "destination_lat" - Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
  , dispatchJobCreateDestinationLng :: !(Maybe Double) -- ^ "destination_lng" - Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
  , dispatchJobCreateDestinationName :: !(Maybe Text) -- ^ "destination_name" - The name of the job destination. If provided, it will take precedence over the name of the address book entry.
  , dispatchJobCreateNotes :: !(Maybe Text) -- ^ "notes" - Notes regarding the details of this job.
  , dispatchJobCreateScheduledArrivalTimeMs :: !(Integer) -- ^ /Required/ "scheduled_arrival_time_ms" - The time at which the assigned driver is scheduled to arrive at the job destination.
  , dispatchJobCreateScheduledDepartureTimeMs :: !(Maybe Integer) -- ^ "scheduled_departure_time_ms" - The time at which the assigned driver is scheduled to depart from the job destination.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DispatchJobCreate
instance A.FromJSON DispatchJobCreate where
  parseJSON = A.withObject "DispatchJobCreate" $ \o ->
    DispatchJobCreate
      <$> (o .:? "destination_address")
      <*> (o .:? "destination_address_id")
      <*> (o .:? "destination_lat")
      <*> (o .:? "destination_lng")
      <*> (o .:? "destination_name")
      <*> (o .:? "notes")
      <*> (o .:  "scheduled_arrival_time_ms")
      <*> (o .:? "scheduled_departure_time_ms")

-- | ToJSON DispatchJobCreate
instance A.ToJSON DispatchJobCreate where
  toJSON DispatchJobCreate {..} =
   _omitNulls
      [ "destination_address" .= dispatchJobCreateDestinationAddress
      , "destination_address_id" .= dispatchJobCreateDestinationAddressId
      , "destination_lat" .= dispatchJobCreateDestinationLat
      , "destination_lng" .= dispatchJobCreateDestinationLng
      , "destination_name" .= dispatchJobCreateDestinationName
      , "notes" .= dispatchJobCreateNotes
      , "scheduled_arrival_time_ms" .= dispatchJobCreateScheduledArrivalTimeMs
      , "scheduled_departure_time_ms" .= dispatchJobCreateScheduledDepartureTimeMs
      ]


-- | Construct a value of type 'DispatchJobCreate' (by applying it's required fields, if any)
mkDispatchJobCreate
  :: Integer -- ^ 'dispatchJobCreateScheduledArrivalTimeMs': The time at which the assigned driver is scheduled to arrive at the job destination.
  -> DispatchJobCreate
mkDispatchJobCreate dispatchJobCreateScheduledArrivalTimeMs =
  DispatchJobCreate
  { dispatchJobCreateDestinationAddress = Nothing
  , dispatchJobCreateDestinationAddressId = Nothing
  , dispatchJobCreateDestinationLat = Nothing
  , dispatchJobCreateDestinationLng = Nothing
  , dispatchJobCreateDestinationName = Nothing
  , dispatchJobCreateNotes = Nothing
  , dispatchJobCreateScheduledArrivalTimeMs
  , dispatchJobCreateScheduledDepartureTimeMs = Nothing
  }

-- ** DispatchRoute
-- | DispatchRoute
data DispatchRoute = DispatchRoute
  { dispatchRouteActualEndMs :: !(Maybe Integer) -- ^ "actual_end_ms" - The time in Unix epoch milliseconds that the route actually ended.
  , dispatchRouteActualStartMs :: !(Maybe Integer) -- ^ "actual_start_ms" - The time in Unix epoch milliseconds that the route actually started.
  , dispatchRouteDriverId :: !(Maybe Integer) -- ^ "driver_id" - ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
  , dispatchRouteGroupId :: !(Maybe Integer) -- ^ "group_id" - ID of the group if the organization has multiple groups (optional).
  , dispatchRouteName :: !(Text) -- ^ /Required/ "name" - Descriptive name of this route.
  , dispatchRouteScheduledEndMs :: !(Integer) -- ^ /Required/ "scheduled_end_ms" - The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
  , dispatchRouteScheduledMeters :: !(Maybe Integer) -- ^ "scheduled_meters" - The distance expected to be traveled for this route in meters.
  , dispatchRouteScheduledStartMs :: !(Integer) -- ^ /Required/ "scheduled_start_ms" - The time in Unix epoch milliseconds that the route is scheduled to start.
  , dispatchRouteStartLocationAddress :: !(Maybe Text) -- ^ "start_location_address" - The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
  , dispatchRouteStartLocationAddressId :: !(Maybe Integer) -- ^ "start_location_address_id" - ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
  , dispatchRouteStartLocationLat :: !(Maybe Double) -- ^ "start_location_lat" - Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
  , dispatchRouteStartLocationLng :: !(Maybe Double) -- ^ "start_location_lng" - Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
  , dispatchRouteStartLocationName :: !(Maybe Text) -- ^ "start_location_name" - The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.
  , dispatchRouteTrailerId :: !(Maybe Integer) -- ^ "trailer_id" - ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
  , dispatchRouteVehicleId :: !(Maybe Integer) -- ^ "vehicle_id" - ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
  , dispatchRouteDispatchJobs :: !([DispatchJob]) -- ^ /Required/ "dispatch_jobs" - The dispatch jobs associated with this route.
  , dispatchRouteId :: !(Integer) -- ^ /Required/ "id" - ID of the Samsara dispatch route.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DispatchRoute
instance A.FromJSON DispatchRoute where
  parseJSON = A.withObject "DispatchRoute" $ \o ->
    DispatchRoute
      <$> (o .:? "actual_end_ms")
      <*> (o .:? "actual_start_ms")
      <*> (o .:? "driver_id")
      <*> (o .:? "group_id")
      <*> (o .:  "name")
      <*> (o .:  "scheduled_end_ms")
      <*> (o .:? "scheduled_meters")
      <*> (o .:  "scheduled_start_ms")
      <*> (o .:? "start_location_address")
      <*> (o .:? "start_location_address_id")
      <*> (o .:? "start_location_lat")
      <*> (o .:? "start_location_lng")
      <*> (o .:? "start_location_name")
      <*> (o .:? "trailer_id")
      <*> (o .:? "vehicle_id")
      <*> (o .:  "dispatch_jobs")
      <*> (o .:  "id")

-- | ToJSON DispatchRoute
instance A.ToJSON DispatchRoute where
  toJSON DispatchRoute {..} =
   _omitNulls
      [ "actual_end_ms" .= dispatchRouteActualEndMs
      , "actual_start_ms" .= dispatchRouteActualStartMs
      , "driver_id" .= dispatchRouteDriverId
      , "group_id" .= dispatchRouteGroupId
      , "name" .= dispatchRouteName
      , "scheduled_end_ms" .= dispatchRouteScheduledEndMs
      , "scheduled_meters" .= dispatchRouteScheduledMeters
      , "scheduled_start_ms" .= dispatchRouteScheduledStartMs
      , "start_location_address" .= dispatchRouteStartLocationAddress
      , "start_location_address_id" .= dispatchRouteStartLocationAddressId
      , "start_location_lat" .= dispatchRouteStartLocationLat
      , "start_location_lng" .= dispatchRouteStartLocationLng
      , "start_location_name" .= dispatchRouteStartLocationName
      , "trailer_id" .= dispatchRouteTrailerId
      , "vehicle_id" .= dispatchRouteVehicleId
      , "dispatch_jobs" .= dispatchRouteDispatchJobs
      , "id" .= dispatchRouteId
      ]


-- | Construct a value of type 'DispatchRoute' (by applying it's required fields, if any)
mkDispatchRoute
  :: Text -- ^ 'dispatchRouteName': Descriptive name of this route.
  -> Integer -- ^ 'dispatchRouteScheduledEndMs': The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
  -> Integer -- ^ 'dispatchRouteScheduledStartMs': The time in Unix epoch milliseconds that the route is scheduled to start.
  -> [DispatchJob] -- ^ 'dispatchRouteDispatchJobs': The dispatch jobs associated with this route.
  -> Integer -- ^ 'dispatchRouteId': ID of the Samsara dispatch route.
  -> DispatchRoute
mkDispatchRoute dispatchRouteName dispatchRouteScheduledEndMs dispatchRouteScheduledStartMs dispatchRouteDispatchJobs dispatchRouteId =
  DispatchRoute
  { dispatchRouteActualEndMs = Nothing
  , dispatchRouteActualStartMs = Nothing
  , dispatchRouteDriverId = Nothing
  , dispatchRouteGroupId = Nothing
  , dispatchRouteName
  , dispatchRouteScheduledEndMs
  , dispatchRouteScheduledMeters = Nothing
  , dispatchRouteScheduledStartMs
  , dispatchRouteStartLocationAddress = Nothing
  , dispatchRouteStartLocationAddressId = Nothing
  , dispatchRouteStartLocationLat = Nothing
  , dispatchRouteStartLocationLng = Nothing
  , dispatchRouteStartLocationName = Nothing
  , dispatchRouteTrailerId = Nothing
  , dispatchRouteVehicleId = Nothing
  , dispatchRouteDispatchJobs
  , dispatchRouteId
  }

-- ** DispatchRouteBase
-- | DispatchRouteBase
data DispatchRouteBase = DispatchRouteBase
  { dispatchRouteBaseActualEndMs :: !(Maybe Integer) -- ^ "actual_end_ms" - The time in Unix epoch milliseconds that the route actually ended.
  , dispatchRouteBaseActualStartMs :: !(Maybe Integer) -- ^ "actual_start_ms" - The time in Unix epoch milliseconds that the route actually started.
  , dispatchRouteBaseDriverId :: !(Maybe Integer) -- ^ "driver_id" - ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
  , dispatchRouteBaseGroupId :: !(Maybe Integer) -- ^ "group_id" - ID of the group if the organization has multiple groups (optional).
  , dispatchRouteBaseName :: !(Text) -- ^ /Required/ "name" - Descriptive name of this route.
  , dispatchRouteBaseScheduledEndMs :: !(Integer) -- ^ /Required/ "scheduled_end_ms" - The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
  , dispatchRouteBaseScheduledMeters :: !(Maybe Integer) -- ^ "scheduled_meters" - The distance expected to be traveled for this route in meters.
  , dispatchRouteBaseScheduledStartMs :: !(Integer) -- ^ /Required/ "scheduled_start_ms" - The time in Unix epoch milliseconds that the route is scheduled to start.
  , dispatchRouteBaseStartLocationAddress :: !(Maybe Text) -- ^ "start_location_address" - The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
  , dispatchRouteBaseStartLocationAddressId :: !(Maybe Integer) -- ^ "start_location_address_id" - ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
  , dispatchRouteBaseStartLocationLat :: !(Maybe Double) -- ^ "start_location_lat" - Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
  , dispatchRouteBaseStartLocationLng :: !(Maybe Double) -- ^ "start_location_lng" - Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
  , dispatchRouteBaseStartLocationName :: !(Maybe Text) -- ^ "start_location_name" - The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.
  , dispatchRouteBaseTrailerId :: !(Maybe Integer) -- ^ "trailer_id" - ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
  , dispatchRouteBaseVehicleId :: !(Maybe Integer) -- ^ "vehicle_id" - ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DispatchRouteBase
instance A.FromJSON DispatchRouteBase where
  parseJSON = A.withObject "DispatchRouteBase" $ \o ->
    DispatchRouteBase
      <$> (o .:? "actual_end_ms")
      <*> (o .:? "actual_start_ms")
      <*> (o .:? "driver_id")
      <*> (o .:? "group_id")
      <*> (o .:  "name")
      <*> (o .:  "scheduled_end_ms")
      <*> (o .:? "scheduled_meters")
      <*> (o .:  "scheduled_start_ms")
      <*> (o .:? "start_location_address")
      <*> (o .:? "start_location_address_id")
      <*> (o .:? "start_location_lat")
      <*> (o .:? "start_location_lng")
      <*> (o .:? "start_location_name")
      <*> (o .:? "trailer_id")
      <*> (o .:? "vehicle_id")

-- | ToJSON DispatchRouteBase
instance A.ToJSON DispatchRouteBase where
  toJSON DispatchRouteBase {..} =
   _omitNulls
      [ "actual_end_ms" .= dispatchRouteBaseActualEndMs
      , "actual_start_ms" .= dispatchRouteBaseActualStartMs
      , "driver_id" .= dispatchRouteBaseDriverId
      , "group_id" .= dispatchRouteBaseGroupId
      , "name" .= dispatchRouteBaseName
      , "scheduled_end_ms" .= dispatchRouteBaseScheduledEndMs
      , "scheduled_meters" .= dispatchRouteBaseScheduledMeters
      , "scheduled_start_ms" .= dispatchRouteBaseScheduledStartMs
      , "start_location_address" .= dispatchRouteBaseStartLocationAddress
      , "start_location_address_id" .= dispatchRouteBaseStartLocationAddressId
      , "start_location_lat" .= dispatchRouteBaseStartLocationLat
      , "start_location_lng" .= dispatchRouteBaseStartLocationLng
      , "start_location_name" .= dispatchRouteBaseStartLocationName
      , "trailer_id" .= dispatchRouteBaseTrailerId
      , "vehicle_id" .= dispatchRouteBaseVehicleId
      ]


-- | Construct a value of type 'DispatchRouteBase' (by applying it's required fields, if any)
mkDispatchRouteBase
  :: Text -- ^ 'dispatchRouteBaseName': Descriptive name of this route.
  -> Integer -- ^ 'dispatchRouteBaseScheduledEndMs': The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
  -> Integer -- ^ 'dispatchRouteBaseScheduledStartMs': The time in Unix epoch milliseconds that the route is scheduled to start.
  -> DispatchRouteBase
mkDispatchRouteBase dispatchRouteBaseName dispatchRouteBaseScheduledEndMs dispatchRouteBaseScheduledStartMs =
  DispatchRouteBase
  { dispatchRouteBaseActualEndMs = Nothing
  , dispatchRouteBaseActualStartMs = Nothing
  , dispatchRouteBaseDriverId = Nothing
  , dispatchRouteBaseGroupId = Nothing
  , dispatchRouteBaseName
  , dispatchRouteBaseScheduledEndMs
  , dispatchRouteBaseScheduledMeters = Nothing
  , dispatchRouteBaseScheduledStartMs
  , dispatchRouteBaseStartLocationAddress = Nothing
  , dispatchRouteBaseStartLocationAddressId = Nothing
  , dispatchRouteBaseStartLocationLat = Nothing
  , dispatchRouteBaseStartLocationLng = Nothing
  , dispatchRouteBaseStartLocationName = Nothing
  , dispatchRouteBaseTrailerId = Nothing
  , dispatchRouteBaseVehicleId = Nothing
  }

-- ** DispatchRouteCreate
-- | DispatchRouteCreate
data DispatchRouteCreate = DispatchRouteCreate
  { dispatchRouteCreateActualEndMs :: !(Maybe Integer) -- ^ "actual_end_ms" - The time in Unix epoch milliseconds that the route actually ended.
  , dispatchRouteCreateActualStartMs :: !(Maybe Integer) -- ^ "actual_start_ms" - The time in Unix epoch milliseconds that the route actually started.
  , dispatchRouteCreateDriverId :: !(Maybe Integer) -- ^ "driver_id" - ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
  , dispatchRouteCreateGroupId :: !(Maybe Integer) -- ^ "group_id" - ID of the group if the organization has multiple groups (optional).
  , dispatchRouteCreateName :: !(Text) -- ^ /Required/ "name" - Descriptive name of this route.
  , dispatchRouteCreateScheduledEndMs :: !(Integer) -- ^ /Required/ "scheduled_end_ms" - The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
  , dispatchRouteCreateScheduledMeters :: !(Maybe Integer) -- ^ "scheduled_meters" - The distance expected to be traveled for this route in meters.
  , dispatchRouteCreateScheduledStartMs :: !(Integer) -- ^ /Required/ "scheduled_start_ms" - The time in Unix epoch milliseconds that the route is scheduled to start.
  , dispatchRouteCreateStartLocationAddress :: !(Maybe Text) -- ^ "start_location_address" - The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
  , dispatchRouteCreateStartLocationAddressId :: !(Maybe Integer) -- ^ "start_location_address_id" - ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
  , dispatchRouteCreateStartLocationLat :: !(Maybe Double) -- ^ "start_location_lat" - Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
  , dispatchRouteCreateStartLocationLng :: !(Maybe Double) -- ^ "start_location_lng" - Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
  , dispatchRouteCreateStartLocationName :: !(Maybe Text) -- ^ "start_location_name" - The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.
  , dispatchRouteCreateTrailerId :: !(Maybe Integer) -- ^ "trailer_id" - ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
  , dispatchRouteCreateVehicleId :: !(Maybe Integer) -- ^ "vehicle_id" - ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
  , dispatchRouteCreateDispatchJobs :: !([DispatchJobCreate]) -- ^ /Required/ "dispatch_jobs" - The dispatch jobs to create for this route.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DispatchRouteCreate
instance A.FromJSON DispatchRouteCreate where
  parseJSON = A.withObject "DispatchRouteCreate" $ \o ->
    DispatchRouteCreate
      <$> (o .:? "actual_end_ms")
      <*> (o .:? "actual_start_ms")
      <*> (o .:? "driver_id")
      <*> (o .:? "group_id")
      <*> (o .:  "name")
      <*> (o .:  "scheduled_end_ms")
      <*> (o .:? "scheduled_meters")
      <*> (o .:  "scheduled_start_ms")
      <*> (o .:? "start_location_address")
      <*> (o .:? "start_location_address_id")
      <*> (o .:? "start_location_lat")
      <*> (o .:? "start_location_lng")
      <*> (o .:? "start_location_name")
      <*> (o .:? "trailer_id")
      <*> (o .:? "vehicle_id")
      <*> (o .:  "dispatch_jobs")

-- | ToJSON DispatchRouteCreate
instance A.ToJSON DispatchRouteCreate where
  toJSON DispatchRouteCreate {..} =
   _omitNulls
      [ "actual_end_ms" .= dispatchRouteCreateActualEndMs
      , "actual_start_ms" .= dispatchRouteCreateActualStartMs
      , "driver_id" .= dispatchRouteCreateDriverId
      , "group_id" .= dispatchRouteCreateGroupId
      , "name" .= dispatchRouteCreateName
      , "scheduled_end_ms" .= dispatchRouteCreateScheduledEndMs
      , "scheduled_meters" .= dispatchRouteCreateScheduledMeters
      , "scheduled_start_ms" .= dispatchRouteCreateScheduledStartMs
      , "start_location_address" .= dispatchRouteCreateStartLocationAddress
      , "start_location_address_id" .= dispatchRouteCreateStartLocationAddressId
      , "start_location_lat" .= dispatchRouteCreateStartLocationLat
      , "start_location_lng" .= dispatchRouteCreateStartLocationLng
      , "start_location_name" .= dispatchRouteCreateStartLocationName
      , "trailer_id" .= dispatchRouteCreateTrailerId
      , "vehicle_id" .= dispatchRouteCreateVehicleId
      , "dispatch_jobs" .= dispatchRouteCreateDispatchJobs
      ]


-- | Construct a value of type 'DispatchRouteCreate' (by applying it's required fields, if any)
mkDispatchRouteCreate
  :: Text -- ^ 'dispatchRouteCreateName': Descriptive name of this route.
  -> Integer -- ^ 'dispatchRouteCreateScheduledEndMs': The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
  -> Integer -- ^ 'dispatchRouteCreateScheduledStartMs': The time in Unix epoch milliseconds that the route is scheduled to start.
  -> [DispatchJobCreate] -- ^ 'dispatchRouteCreateDispatchJobs': The dispatch jobs to create for this route.
  -> DispatchRouteCreate
mkDispatchRouteCreate dispatchRouteCreateName dispatchRouteCreateScheduledEndMs dispatchRouteCreateScheduledStartMs dispatchRouteCreateDispatchJobs =
  DispatchRouteCreate
  { dispatchRouteCreateActualEndMs = Nothing
  , dispatchRouteCreateActualStartMs = Nothing
  , dispatchRouteCreateDriverId = Nothing
  , dispatchRouteCreateGroupId = Nothing
  , dispatchRouteCreateName
  , dispatchRouteCreateScheduledEndMs
  , dispatchRouteCreateScheduledMeters = Nothing
  , dispatchRouteCreateScheduledStartMs
  , dispatchRouteCreateStartLocationAddress = Nothing
  , dispatchRouteCreateStartLocationAddressId = Nothing
  , dispatchRouteCreateStartLocationLat = Nothing
  , dispatchRouteCreateStartLocationLng = Nothing
  , dispatchRouteCreateStartLocationName = Nothing
  , dispatchRouteCreateTrailerId = Nothing
  , dispatchRouteCreateVehicleId = Nothing
  , dispatchRouteCreateDispatchJobs
  }

-- ** DispatchRouteHistoricalEntry
-- | DispatchRouteHistoricalEntry
data DispatchRouteHistoricalEntry = DispatchRouteHistoricalEntry
  { dispatchRouteHistoricalEntryChangedAtMs :: !(Maybe Integer) -- ^ "changed_at_ms" - Timestamp that the route was updated, represented as Unix milliseconds since epoch.
  , dispatchRouteHistoricalEntryRoute :: !(Maybe DispatchRoute) -- ^ "route"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DispatchRouteHistoricalEntry
instance A.FromJSON DispatchRouteHistoricalEntry where
  parseJSON = A.withObject "DispatchRouteHistoricalEntry" $ \o ->
    DispatchRouteHistoricalEntry
      <$> (o .:? "changed_at_ms")
      <*> (o .:? "route")

-- | ToJSON DispatchRouteHistoricalEntry
instance A.ToJSON DispatchRouteHistoricalEntry where
  toJSON DispatchRouteHistoricalEntry {..} =
   _omitNulls
      [ "changed_at_ms" .= dispatchRouteHistoricalEntryChangedAtMs
      , "route" .= dispatchRouteHistoricalEntryRoute
      ]


-- | Construct a value of type 'DispatchRouteHistoricalEntry' (by applying it's required fields, if any)
mkDispatchRouteHistoricalEntry
  :: DispatchRouteHistoricalEntry
mkDispatchRouteHistoricalEntry =
  DispatchRouteHistoricalEntry
  { dispatchRouteHistoricalEntryChangedAtMs = Nothing
  , dispatchRouteHistoricalEntryRoute = Nothing
  }

-- ** DispatchRouteHistory
-- | DispatchRouteHistory
data DispatchRouteHistory = DispatchRouteHistory
  { dispatchRouteHistoryHistory :: !(Maybe [DispatchRouteHistoricalEntry]) -- ^ "history" - History of the route&#39;s state changes.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DispatchRouteHistory
instance A.FromJSON DispatchRouteHistory where
  parseJSON = A.withObject "DispatchRouteHistory" $ \o ->
    DispatchRouteHistory
      <$> (o .:? "history")

-- | ToJSON DispatchRouteHistory
instance A.ToJSON DispatchRouteHistory where
  toJSON DispatchRouteHistory {..} =
   _omitNulls
      [ "history" .= dispatchRouteHistoryHistory
      ]


-- | Construct a value of type 'DispatchRouteHistory' (by applying it's required fields, if any)
mkDispatchRouteHistory
  :: DispatchRouteHistory
mkDispatchRouteHistory =
  DispatchRouteHistory
  { dispatchRouteHistoryHistory = Nothing
  }

-- ** Document
-- | Document
data Document = Document
  { documentDispatchJobId :: !(Maybe Integer) -- ^ "dispatchJobId" - ID of the Samsara dispatch job for which the document is submitted
  , documentNotes :: !(Maybe Text) -- ^ "notes" - Notes submitted with this document.
  , documentDocumentType :: !(Text) -- ^ /Required/ "documentType" - Descriptive name of this type of document.
  , documentDriverCreatedAtMs :: !(Integer) -- ^ /Required/ "driverCreatedAtMs" - The time in Unix epoch milliseconds that the document is created.
  , documentDriverId :: !(Integer) -- ^ /Required/ "driverId" - ID of the driver for whom the document is submitted
  , documentFields :: !([DocumentField]) -- ^ /Required/ "fields" - The fields associated with this document.
  , documentVehicleId :: !(Maybe Integer) -- ^ "vehicleId" - VehicleID of the driver at document creation.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON Document
instance A.FromJSON Document where
  parseJSON = A.withObject "Document" $ \o ->
    Document
      <$> (o .:? "dispatchJobId")
      <*> (o .:? "notes")
      <*> (o .:  "documentType")
      <*> (o .:  "driverCreatedAtMs")
      <*> (o .:  "driverId")
      <*> (o .:  "fields")
      <*> (o .:? "vehicleId")

-- | ToJSON Document
instance A.ToJSON Document where
  toJSON Document {..} =
   _omitNulls
      [ "dispatchJobId" .= documentDispatchJobId
      , "notes" .= documentNotes
      , "documentType" .= documentDocumentType
      , "driverCreatedAtMs" .= documentDriverCreatedAtMs
      , "driverId" .= documentDriverId
      , "fields" .= documentFields
      , "vehicleId" .= documentVehicleId
      ]


-- | Construct a value of type 'Document' (by applying it's required fields, if any)
mkDocument
  :: Text -- ^ 'documentDocumentType': Descriptive name of this type of document.
  -> Integer -- ^ 'documentDriverCreatedAtMs': The time in Unix epoch milliseconds that the document is created.
  -> Integer -- ^ 'documentDriverId': ID of the driver for whom the document is submitted
  -> [DocumentField] -- ^ 'documentFields': The fields associated with this document.
  -> Document
mkDocument documentDocumentType documentDriverCreatedAtMs documentDriverId documentFields =
  Document
  { documentDispatchJobId = Nothing
  , documentNotes = Nothing
  , documentDocumentType
  , documentDriverCreatedAtMs
  , documentDriverId
  , documentFields
  , documentVehicleId = Nothing
  }

-- ** DocumentBase
-- | DocumentBase
data DocumentBase = DocumentBase
  { documentBaseDispatchJobId :: !(Maybe Integer) -- ^ "dispatchJobId" - ID of the Samsara dispatch job for which the document is submitted
  , documentBaseNotes :: !(Maybe Text) -- ^ "notes" - Notes submitted with this document.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DocumentBase
instance A.FromJSON DocumentBase where
  parseJSON = A.withObject "DocumentBase" $ \o ->
    DocumentBase
      <$> (o .:? "dispatchJobId")
      <*> (o .:? "notes")

-- | ToJSON DocumentBase
instance A.ToJSON DocumentBase where
  toJSON DocumentBase {..} =
   _omitNulls
      [ "dispatchJobId" .= documentBaseDispatchJobId
      , "notes" .= documentBaseNotes
      ]


-- | Construct a value of type 'DocumentBase' (by applying it's required fields, if any)
mkDocumentBase
  :: DocumentBase
mkDocumentBase =
  DocumentBase
  { documentBaseDispatchJobId = Nothing
  , documentBaseNotes = Nothing
  }

-- ** DocumentCreate
-- | DocumentCreate
data DocumentCreate = DocumentCreate
  { documentCreateDispatchJobId :: !(Maybe Integer) -- ^ "dispatchJobId" - ID of the Samsara dispatch job for which the document is submitted
  , documentCreateNotes :: !(Maybe Text) -- ^ "notes" - Notes submitted with this document.
  , documentCreateDocumentTypeUuid :: !(Text) -- ^ /Required/ "documentTypeUuid" - Universally unique identifier for the document type this document is being created for.
  , documentCreateFields :: !([DocumentField]) -- ^ /Required/ "fields" - List of fields should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DocumentCreate
instance A.FromJSON DocumentCreate where
  parseJSON = A.withObject "DocumentCreate" $ \o ->
    DocumentCreate
      <$> (o .:? "dispatchJobId")
      <*> (o .:? "notes")
      <*> (o .:  "documentTypeUuid")
      <*> (o .:  "fields")

-- | ToJSON DocumentCreate
instance A.ToJSON DocumentCreate where
  toJSON DocumentCreate {..} =
   _omitNulls
      [ "dispatchJobId" .= documentCreateDispatchJobId
      , "notes" .= documentCreateNotes
      , "documentTypeUuid" .= documentCreateDocumentTypeUuid
      , "fields" .= documentCreateFields
      ]


-- | Construct a value of type 'DocumentCreate' (by applying it's required fields, if any)
mkDocumentCreate
  :: Text -- ^ 'documentCreateDocumentTypeUuid': Universally unique identifier for the document type this document is being created for.
  -> [DocumentField] -- ^ 'documentCreateFields': List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
  -> DocumentCreate
mkDocumentCreate documentCreateDocumentTypeUuid documentCreateFields =
  DocumentCreate
  { documentCreateDispatchJobId = Nothing
  , documentCreateNotes = Nothing
  , documentCreateDocumentTypeUuid
  , documentCreateFields
  }

-- ** DocumentField
-- | DocumentField
data DocumentField = DocumentField
  { documentFieldNumberValue :: !(Maybe Double) -- ^ "numberValue" - Value of this field if this document field has valueType: ValueType_Number.
  , documentFieldPhotoValue :: !(Maybe [DocumentFieldCreatePhotoValue]) -- ^ "photoValue" - Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
  , documentFieldStringValue :: !(Maybe Text) -- ^ "stringValue" - Value of this field if this document field has valueType: ValueType_String.
  , documentFieldValueType :: !(Text) -- ^ /Required/ "valueType" - Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
  , documentFieldLabel :: !(Text) -- ^ /Required/ "label" - Descriptive name of this field.
  , documentFieldValue :: !(Maybe A.Value) -- ^ "value" - DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DocumentField
instance A.FromJSON DocumentField where
  parseJSON = A.withObject "DocumentField" $ \o ->
    DocumentField
      <$> (o .:? "numberValue")
      <*> (o .:? "photoValue")
      <*> (o .:? "stringValue")
      <*> (o .:  "valueType")
      <*> (o .:  "label")
      <*> (o .:? "value")

-- | ToJSON DocumentField
instance A.ToJSON DocumentField where
  toJSON DocumentField {..} =
   _omitNulls
      [ "numberValue" .= documentFieldNumberValue
      , "photoValue" .= documentFieldPhotoValue
      , "stringValue" .= documentFieldStringValue
      , "valueType" .= documentFieldValueType
      , "label" .= documentFieldLabel
      , "value" .= documentFieldValue
      ]


-- | Construct a value of type 'DocumentField' (by applying it's required fields, if any)
mkDocumentField
  :: Text -- ^ 'documentFieldValueType': Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
  -> Text -- ^ 'documentFieldLabel': Descriptive name of this field.
  -> DocumentField
mkDocumentField documentFieldValueType documentFieldLabel =
  DocumentField
  { documentFieldNumberValue = Nothing
  , documentFieldPhotoValue = Nothing
  , documentFieldStringValue = Nothing
  , documentFieldValueType
  , documentFieldLabel
  , documentFieldValue = Nothing
  }

-- ** DocumentFieldCreate
-- | DocumentFieldCreate
data DocumentFieldCreate = DocumentFieldCreate
  { documentFieldCreateNumberValue :: !(Maybe Double) -- ^ "numberValue" - Value of this field if this document field has valueType: ValueType_Number.
  , documentFieldCreatePhotoValue :: !(Maybe [DocumentFieldCreatePhotoValue]) -- ^ "photoValue" - Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
  , documentFieldCreateStringValue :: !(Maybe Text) -- ^ "stringValue" - Value of this field if this document field has valueType: ValueType_String.
  , documentFieldCreateValueType :: !(Text) -- ^ /Required/ "valueType" - Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DocumentFieldCreate
instance A.FromJSON DocumentFieldCreate where
  parseJSON = A.withObject "DocumentFieldCreate" $ \o ->
    DocumentFieldCreate
      <$> (o .:? "numberValue")
      <*> (o .:? "photoValue")
      <*> (o .:? "stringValue")
      <*> (o .:  "valueType")

-- | ToJSON DocumentFieldCreate
instance A.ToJSON DocumentFieldCreate where
  toJSON DocumentFieldCreate {..} =
   _omitNulls
      [ "numberValue" .= documentFieldCreateNumberValue
      , "photoValue" .= documentFieldCreatePhotoValue
      , "stringValue" .= documentFieldCreateStringValue
      , "valueType" .= documentFieldCreateValueType
      ]


-- | Construct a value of type 'DocumentFieldCreate' (by applying it's required fields, if any)
mkDocumentFieldCreate
  :: Text -- ^ 'documentFieldCreateValueType': Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
  -> DocumentFieldCreate
mkDocumentFieldCreate documentFieldCreateValueType =
  DocumentFieldCreate
  { documentFieldCreateNumberValue = Nothing
  , documentFieldCreatePhotoValue = Nothing
  , documentFieldCreateStringValue = Nothing
  , documentFieldCreateValueType
  }

-- ** DocumentFieldCreatePhotoValue
-- | DocumentFieldCreatePhotoValue
data DocumentFieldCreatePhotoValue = DocumentFieldCreatePhotoValue
  { documentFieldCreatePhotoValueUrl :: !(Maybe Text) -- ^ "url" - Photo URL for a JPG image
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DocumentFieldCreatePhotoValue
instance A.FromJSON DocumentFieldCreatePhotoValue where
  parseJSON = A.withObject "DocumentFieldCreatePhotoValue" $ \o ->
    DocumentFieldCreatePhotoValue
      <$> (o .:? "url")

-- | ToJSON DocumentFieldCreatePhotoValue
instance A.ToJSON DocumentFieldCreatePhotoValue where
  toJSON DocumentFieldCreatePhotoValue {..} =
   _omitNulls
      [ "url" .= documentFieldCreatePhotoValueUrl
      ]


-- | Construct a value of type 'DocumentFieldCreatePhotoValue' (by applying it's required fields, if any)
mkDocumentFieldCreatePhotoValue
  :: DocumentFieldCreatePhotoValue
mkDocumentFieldCreatePhotoValue =
  DocumentFieldCreatePhotoValue
  { documentFieldCreatePhotoValueUrl = Nothing
  }

-- ** DocumentFieldType
-- | DocumentFieldType
data DocumentFieldType = DocumentFieldType
  { documentFieldTypeLabel :: !(Text) -- ^ /Required/ "label" - Descriptive name of this field type.
  , documentFieldTypeNumberValueTypeMetadata :: !(Maybe DocumentFieldTypeNumberValueTypeMetadata) -- ^ "numberValueTypeMetadata"
  , documentFieldTypeValueType :: !(Text) -- ^ /Required/ "valueType" - The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DocumentFieldType
instance A.FromJSON DocumentFieldType where
  parseJSON = A.withObject "DocumentFieldType" $ \o ->
    DocumentFieldType
      <$> (o .:  "label")
      <*> (o .:? "numberValueTypeMetadata")
      <*> (o .:  "valueType")

-- | ToJSON DocumentFieldType
instance A.ToJSON DocumentFieldType where
  toJSON DocumentFieldType {..} =
   _omitNulls
      [ "label" .= documentFieldTypeLabel
      , "numberValueTypeMetadata" .= documentFieldTypeNumberValueTypeMetadata
      , "valueType" .= documentFieldTypeValueType
      ]


-- | Construct a value of type 'DocumentFieldType' (by applying it's required fields, if any)
mkDocumentFieldType
  :: Text -- ^ 'documentFieldTypeLabel': Descriptive name of this field type.
  -> Text -- ^ 'documentFieldTypeValueType': The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
  -> DocumentFieldType
mkDocumentFieldType documentFieldTypeLabel documentFieldTypeValueType =
  DocumentFieldType
  { documentFieldTypeLabel
  , documentFieldTypeNumberValueTypeMetadata = Nothing
  , documentFieldTypeValueType
  }

-- ** DocumentFieldTypeNumberValueTypeMetadata
-- | DocumentFieldTypeNumberValueTypeMetadata
-- Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
data DocumentFieldTypeNumberValueTypeMetadata = DocumentFieldTypeNumberValueTypeMetadata
  { documentFieldTypeNumberValueTypeMetadataNumDecimalPlaces :: !(Maybe Integer) -- ^ "numDecimalPlaces" - Number of decimal places that values for this field type can have.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DocumentFieldTypeNumberValueTypeMetadata
instance A.FromJSON DocumentFieldTypeNumberValueTypeMetadata where
  parseJSON = A.withObject "DocumentFieldTypeNumberValueTypeMetadata" $ \o ->
    DocumentFieldTypeNumberValueTypeMetadata
      <$> (o .:? "numDecimalPlaces")

-- | ToJSON DocumentFieldTypeNumberValueTypeMetadata
instance A.ToJSON DocumentFieldTypeNumberValueTypeMetadata where
  toJSON DocumentFieldTypeNumberValueTypeMetadata {..} =
   _omitNulls
      [ "numDecimalPlaces" .= documentFieldTypeNumberValueTypeMetadataNumDecimalPlaces
      ]


-- | Construct a value of type 'DocumentFieldTypeNumberValueTypeMetadata' (by applying it's required fields, if any)
mkDocumentFieldTypeNumberValueTypeMetadata
  :: DocumentFieldTypeNumberValueTypeMetadata
mkDocumentFieldTypeNumberValueTypeMetadata =
  DocumentFieldTypeNumberValueTypeMetadata
  { documentFieldTypeNumberValueTypeMetadataNumDecimalPlaces = Nothing
  }

-- ** DocumentType
-- | DocumentType
data DocumentType = DocumentType
  { documentTypeFieldTypes :: !(Maybe [Array]) -- ^ "fieldTypes" - The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
  , documentTypeName :: !(Text) -- ^ /Required/ "name" - Name of the document type.
  , documentTypeOrgId :: !(Integer) -- ^ /Required/ "orgId" - ID for the organization this document belongs to.
  , documentTypeUuid :: !(Text) -- ^ /Required/ "uuid" - Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DocumentType
instance A.FromJSON DocumentType where
  parseJSON = A.withObject "DocumentType" $ \o ->
    DocumentType
      <$> (o .:? "fieldTypes")
      <*> (o .:  "name")
      <*> (o .:  "orgId")
      <*> (o .:  "uuid")

-- | ToJSON DocumentType
instance A.ToJSON DocumentType where
  toJSON DocumentType {..} =
   _omitNulls
      [ "fieldTypes" .= documentTypeFieldTypes
      , "name" .= documentTypeName
      , "orgId" .= documentTypeOrgId
      , "uuid" .= documentTypeUuid
      ]


-- | Construct a value of type 'DocumentType' (by applying it's required fields, if any)
mkDocumentType
  :: Text -- ^ 'documentTypeName': Name of the document type.
  -> Integer -- ^ 'documentTypeOrgId': ID for the organization this document belongs to.
  -> Text -- ^ 'documentTypeUuid': Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
  -> DocumentType
mkDocumentType documentTypeName documentTypeOrgId documentTypeUuid =
  DocumentType
  { documentTypeFieldTypes = Nothing
  , documentTypeName
  , documentTypeOrgId
  , documentTypeUuid
  }

-- ** DoorResponse
-- | DoorResponse
-- Contains the current door status of a sensor.
data DoorResponse = DoorResponse
  { doorResponseGroupId :: !(Maybe Integer) -- ^ "groupId"
  , doorResponseSensors :: !(Maybe [DoorResponseSensors]) -- ^ "sensors"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DoorResponse
instance A.FromJSON DoorResponse where
  parseJSON = A.withObject "DoorResponse" $ \o ->
    DoorResponse
      <$> (o .:? "groupId")
      <*> (o .:? "sensors")

-- | ToJSON DoorResponse
instance A.ToJSON DoorResponse where
  toJSON DoorResponse {..} =
   _omitNulls
      [ "groupId" .= doorResponseGroupId
      , "sensors" .= doorResponseSensors
      ]


-- | Construct a value of type 'DoorResponse' (by applying it's required fields, if any)
mkDoorResponse
  :: DoorResponse
mkDoorResponse =
  DoorResponse
  { doorResponseGroupId = Nothing
  , doorResponseSensors = Nothing
  }

-- ** DoorResponseSensors
-- | DoorResponseSensors
data DoorResponseSensors = DoorResponseSensors
  { doorResponseSensorsDoorClosed :: !(Maybe Bool) -- ^ "doorClosed" - Flag indicating whether the current door is closed or open.
  , doorResponseSensorsName :: !(Maybe Text) -- ^ "name" - Name of the sensor.
  , doorResponseSensorsId :: !(Maybe Integer) -- ^ "id" - ID of the sensor.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DoorResponseSensors
instance A.FromJSON DoorResponseSensors where
  parseJSON = A.withObject "DoorResponseSensors" $ \o ->
    DoorResponseSensors
      <$> (o .:? "doorClosed")
      <*> (o .:? "name")
      <*> (o .:? "id")

-- | ToJSON DoorResponseSensors
instance A.ToJSON DoorResponseSensors where
  toJSON DoorResponseSensors {..} =
   _omitNulls
      [ "doorClosed" .= doorResponseSensorsDoorClosed
      , "name" .= doorResponseSensorsName
      , "id" .= doorResponseSensorsId
      ]


-- | Construct a value of type 'DoorResponseSensors' (by applying it's required fields, if any)
mkDoorResponseSensors
  :: DoorResponseSensors
mkDoorResponseSensors =
  DoorResponseSensors
  { doorResponseSensorsDoorClosed = Nothing
  , doorResponseSensorsName = Nothing
  , doorResponseSensorsId = Nothing
  }

-- ** Driver
-- | Driver
data Driver = Driver
  { driverEldAdverseWeatherExemptionEnabled :: !(Maybe Bool) -- ^ "eldAdverseWeatherExemptionEnabled" - Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
  , driverEldBigDayExemptionEnabled :: !(Maybe Bool) -- ^ "eldBigDayExemptionEnabled" - Flag indicating this driver may use Big Day excemptions in ELD logs.
  , driverEldDayStartHour :: !(Maybe Int) -- ^ "eldDayStartHour" - 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
  , driverEldExempt :: !(Maybe Bool) -- ^ "eldExempt" - Flag indicating this driver is exempt from the Electronic Logging Mandate.
  , driverEldExemptReason :: !(Maybe Text) -- ^ "eldExemptReason" - Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
  , driverEldPcEnabled :: !(Maybe Bool) -- ^ "eldPcEnabled" - Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
  , driverEldYmEnabled :: !(Maybe Bool) -- ^ "eldYmEnabled" - Flag indicating this driver may select the Yard Move duty status in ELD logs.
  , driverExternalIds :: !(Maybe (Map.Map String Text)) -- ^ "externalIds" - Dictionary of external IDs (string key-value pairs)
  , driverGroupId :: !(Maybe Integer) -- ^ "groupId" - ID of the group if the organization has multiple groups (uncommon).
  , driverLicenseNumber :: !(Maybe Text) -- ^ "licenseNumber" - Driver&#39;s state issued license number.
  , driverLicenseState :: !(Maybe Text) -- ^ "licenseState" - Abbreviation of state that issued driver&#39;s license.
  , driverName :: !(Text) -- ^ /Required/ "name" - Driver&#39;s name.
  , driverNotes :: !(Maybe Text) -- ^ "notes" - Notes about the driver.
  , driverPhone :: !(Maybe Text) -- ^ "phone" - Driver&#39;s phone number. Please include only digits, ex. 4157771234
  , driverUsername :: !(Maybe Text) -- ^ "username" - Driver&#39;s login username into the driver app.
  , driverVehicleId :: !(Maybe Integer) -- ^ "vehicleId" - ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
  , driverId :: !(Integer) -- ^ /Required/ "id" - ID of the driver.
  , driverIsDeactivated :: !(Maybe Bool) -- ^ "isDeactivated" - True if the driver account has been deactivated.
  , driverTags :: !(Maybe [TagMetadata]) -- ^ "tags"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON Driver
instance A.FromJSON Driver where
  parseJSON = A.withObject "Driver" $ \o ->
    Driver
      <$> (o .:? "eldAdverseWeatherExemptionEnabled")
      <*> (o .:? "eldBigDayExemptionEnabled")
      <*> (o .:? "eldDayStartHour")
      <*> (o .:? "eldExempt")
      <*> (o .:? "eldExemptReason")
      <*> (o .:? "eldPcEnabled")
      <*> (o .:? "eldYmEnabled")
      <*> (o .:? "externalIds")
      <*> (o .:? "groupId")
      <*> (o .:? "licenseNumber")
      <*> (o .:? "licenseState")
      <*> (o .:  "name")
      <*> (o .:? "notes")
      <*> (o .:? "phone")
      <*> (o .:? "username")
      <*> (o .:? "vehicleId")
      <*> (o .:  "id")
      <*> (o .:? "isDeactivated")
      <*> (o .:? "tags")

-- | ToJSON Driver
instance A.ToJSON Driver where
  toJSON Driver {..} =
   _omitNulls
      [ "eldAdverseWeatherExemptionEnabled" .= driverEldAdverseWeatherExemptionEnabled
      , "eldBigDayExemptionEnabled" .= driverEldBigDayExemptionEnabled
      , "eldDayStartHour" .= driverEldDayStartHour
      , "eldExempt" .= driverEldExempt
      , "eldExemptReason" .= driverEldExemptReason
      , "eldPcEnabled" .= driverEldPcEnabled
      , "eldYmEnabled" .= driverEldYmEnabled
      , "externalIds" .= driverExternalIds
      , "groupId" .= driverGroupId
      , "licenseNumber" .= driverLicenseNumber
      , "licenseState" .= driverLicenseState
      , "name" .= driverName
      , "notes" .= driverNotes
      , "phone" .= driverPhone
      , "username" .= driverUsername
      , "vehicleId" .= driverVehicleId
      , "id" .= driverId
      , "isDeactivated" .= driverIsDeactivated
      , "tags" .= driverTags
      ]


-- | Construct a value of type 'Driver' (by applying it's required fields, if any)
mkDriver
  :: Text -- ^ 'driverName': Driver's name.
  -> Integer -- ^ 'driverId': ID of the driver.
  -> Driver
mkDriver driverName driverId =
  Driver
  { driverEldAdverseWeatherExemptionEnabled = Nothing
  , driverEldBigDayExemptionEnabled = Nothing
  , driverEldDayStartHour = Nothing
  , driverEldExempt = Nothing
  , driverEldExemptReason = Nothing
  , driverEldPcEnabled = Nothing
  , driverEldYmEnabled = Nothing
  , driverExternalIds = Nothing
  , driverGroupId = Nothing
  , driverLicenseNumber = Nothing
  , driverLicenseState = Nothing
  , driverName
  , driverNotes = Nothing
  , driverPhone = Nothing
  , driverUsername = Nothing
  , driverVehicleId = Nothing
  , driverId
  , driverIsDeactivated = Nothing
  , driverTags = Nothing
  }

-- ** DriverBase
-- | DriverBase
data DriverBase = DriverBase
  { driverBaseEldAdverseWeatherExemptionEnabled :: !(Maybe Bool) -- ^ "eldAdverseWeatherExemptionEnabled" - Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
  , driverBaseEldBigDayExemptionEnabled :: !(Maybe Bool) -- ^ "eldBigDayExemptionEnabled" - Flag indicating this driver may use Big Day excemptions in ELD logs.
  , driverBaseEldDayStartHour :: !(Maybe Int) -- ^ "eldDayStartHour" - 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
  , driverBaseEldExempt :: !(Maybe Bool) -- ^ "eldExempt" - Flag indicating this driver is exempt from the Electronic Logging Mandate.
  , driverBaseEldExemptReason :: !(Maybe Text) -- ^ "eldExemptReason" - Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
  , driverBaseEldPcEnabled :: !(Maybe Bool) -- ^ "eldPcEnabled" - Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
  , driverBaseEldYmEnabled :: !(Maybe Bool) -- ^ "eldYmEnabled" - Flag indicating this driver may select the Yard Move duty status in ELD logs.
  , driverBaseExternalIds :: !(Maybe (Map.Map String Text)) -- ^ "externalIds" - Dictionary of external IDs (string key-value pairs)
  , driverBaseGroupId :: !(Maybe Integer) -- ^ "groupId" - ID of the group if the organization has multiple groups (uncommon).
  , driverBaseLicenseNumber :: !(Maybe Text) -- ^ "licenseNumber" - Driver&#39;s state issued license number.
  , driverBaseLicenseState :: !(Maybe Text) -- ^ "licenseState" - Abbreviation of state that issued driver&#39;s license.
  , driverBaseName :: !(Text) -- ^ /Required/ "name" - Driver&#39;s name.
  , driverBaseNotes :: !(Maybe Text) -- ^ "notes" - Notes about the driver.
  , driverBasePhone :: !(Maybe Text) -- ^ "phone" - Driver&#39;s phone number. Please include only digits, ex. 4157771234
  , driverBaseUsername :: !(Maybe Text) -- ^ "username" - Driver&#39;s login username into the driver app.
  , driverBaseVehicleId :: !(Maybe Integer) -- ^ "vehicleId" - ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DriverBase
instance A.FromJSON DriverBase where
  parseJSON = A.withObject "DriverBase" $ \o ->
    DriverBase
      <$> (o .:? "eldAdverseWeatherExemptionEnabled")
      <*> (o .:? "eldBigDayExemptionEnabled")
      <*> (o .:? "eldDayStartHour")
      <*> (o .:? "eldExempt")
      <*> (o .:? "eldExemptReason")
      <*> (o .:? "eldPcEnabled")
      <*> (o .:? "eldYmEnabled")
      <*> (o .:? "externalIds")
      <*> (o .:? "groupId")
      <*> (o .:? "licenseNumber")
      <*> (o .:? "licenseState")
      <*> (o .:  "name")
      <*> (o .:? "notes")
      <*> (o .:? "phone")
      <*> (o .:? "username")
      <*> (o .:? "vehicleId")

-- | ToJSON DriverBase
instance A.ToJSON DriverBase where
  toJSON DriverBase {..} =
   _omitNulls
      [ "eldAdverseWeatherExemptionEnabled" .= driverBaseEldAdverseWeatherExemptionEnabled
      , "eldBigDayExemptionEnabled" .= driverBaseEldBigDayExemptionEnabled
      , "eldDayStartHour" .= driverBaseEldDayStartHour
      , "eldExempt" .= driverBaseEldExempt
      , "eldExemptReason" .= driverBaseEldExemptReason
      , "eldPcEnabled" .= driverBaseEldPcEnabled
      , "eldYmEnabled" .= driverBaseEldYmEnabled
      , "externalIds" .= driverBaseExternalIds
      , "groupId" .= driverBaseGroupId
      , "licenseNumber" .= driverBaseLicenseNumber
      , "licenseState" .= driverBaseLicenseState
      , "name" .= driverBaseName
      , "notes" .= driverBaseNotes
      , "phone" .= driverBasePhone
      , "username" .= driverBaseUsername
      , "vehicleId" .= driverBaseVehicleId
      ]


-- | Construct a value of type 'DriverBase' (by applying it's required fields, if any)
mkDriverBase
  :: Text -- ^ 'driverBaseName': Driver's name.
  -> DriverBase
mkDriverBase driverBaseName =
  DriverBase
  { driverBaseEldAdverseWeatherExemptionEnabled = Nothing
  , driverBaseEldBigDayExemptionEnabled = Nothing
  , driverBaseEldDayStartHour = Nothing
  , driverBaseEldExempt = Nothing
  , driverBaseEldExemptReason = Nothing
  , driverBaseEldPcEnabled = Nothing
  , driverBaseEldYmEnabled = Nothing
  , driverBaseExternalIds = Nothing
  , driverBaseGroupId = Nothing
  , driverBaseLicenseNumber = Nothing
  , driverBaseLicenseState = Nothing
  , driverBaseName
  , driverBaseNotes = Nothing
  , driverBasePhone = Nothing
  , driverBaseUsername = Nothing
  , driverBaseVehicleId = Nothing
  }

-- ** DriverDailyLogResponse
-- | DriverDailyLogResponse
data DriverDailyLogResponse = DriverDailyLogResponse
  { driverDailyLogResponseDays :: !(Maybe [DriverDailyLogResponseDays]) -- ^ "days"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DriverDailyLogResponse
instance A.FromJSON DriverDailyLogResponse where
  parseJSON = A.withObject "DriverDailyLogResponse" $ \o ->
    DriverDailyLogResponse
      <$> (o .:? "days")

-- | ToJSON DriverDailyLogResponse
instance A.ToJSON DriverDailyLogResponse where
  toJSON DriverDailyLogResponse {..} =
   _omitNulls
      [ "days" .= driverDailyLogResponseDays
      ]


-- | Construct a value of type 'DriverDailyLogResponse' (by applying it's required fields, if any)
mkDriverDailyLogResponse
  :: DriverDailyLogResponse
mkDriverDailyLogResponse =
  DriverDailyLogResponse
  { driverDailyLogResponseDays = Nothing
  }

-- ** DriverDailyLogResponseDays
-- | DriverDailyLogResponseDays
data DriverDailyLogResponseDays = DriverDailyLogResponseDays
  { driverDailyLogResponseDaysCertifiedAtMs :: !(Maybe Integer) -- ^ "certifiedAtMs" - Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
  , driverDailyLogResponseDaysEndMs :: !(Maybe Int) -- ^ "endMs" - End of the HOS day, specified in milliseconds UNIX time.
  , driverDailyLogResponseDaysStartMs :: !(Maybe Int) -- ^ "startMs" - End of the HOS day, specified in milliseconds UNIX time.
  , driverDailyLogResponseDaysTrailerIds :: !(Maybe A.Value) -- ^ "trailerIds" - List of trailer ID&#39;s associated with the driver for the day.
  , driverDailyLogResponseDaysActiveHours :: !(Maybe Double) -- ^ "activeHours" - Hours spent on duty or driving, rounded to two decimal places.
  , driverDailyLogResponseDaysDistanceMiles :: !(Maybe Double) -- ^ "distanceMiles" - Distance driven in miles, rounded to two decimal places.
  , driverDailyLogResponseDaysActiveMs :: !(Maybe Integer) -- ^ "activeMs" - Milliseconds spent on duty or driving.
  , driverDailyLogResponseDaysCertified :: !(Maybe Bool) -- ^ "certified" - Whether this HOS day chart was certified by the driver.
  , driverDailyLogResponseDaysVehicleIds :: !(Maybe A.Value) -- ^ "vehicleIds" - List of vehicle ID&#39;s associated with the driver for the day.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DriverDailyLogResponseDays
instance A.FromJSON DriverDailyLogResponseDays where
  parseJSON = A.withObject "DriverDailyLogResponseDays" $ \o ->
    DriverDailyLogResponseDays
      <$> (o .:? "certifiedAtMs")
      <*> (o .:? "endMs")
      <*> (o .:? "startMs")
      <*> (o .:? "trailerIds")
      <*> (o .:? "activeHours")
      <*> (o .:? "distanceMiles")
      <*> (o .:? "activeMs")
      <*> (o .:? "certified")
      <*> (o .:? "vehicleIds")

-- | ToJSON DriverDailyLogResponseDays
instance A.ToJSON DriverDailyLogResponseDays where
  toJSON DriverDailyLogResponseDays {..} =
   _omitNulls
      [ "certifiedAtMs" .= driverDailyLogResponseDaysCertifiedAtMs
      , "endMs" .= driverDailyLogResponseDaysEndMs
      , "startMs" .= driverDailyLogResponseDaysStartMs
      , "trailerIds" .= driverDailyLogResponseDaysTrailerIds
      , "activeHours" .= driverDailyLogResponseDaysActiveHours
      , "distanceMiles" .= driverDailyLogResponseDaysDistanceMiles
      , "activeMs" .= driverDailyLogResponseDaysActiveMs
      , "certified" .= driverDailyLogResponseDaysCertified
      , "vehicleIds" .= driverDailyLogResponseDaysVehicleIds
      ]


-- | Construct a value of type 'DriverDailyLogResponseDays' (by applying it's required fields, if any)
mkDriverDailyLogResponseDays
  :: DriverDailyLogResponseDays
mkDriverDailyLogResponseDays =
  DriverDailyLogResponseDays
  { driverDailyLogResponseDaysCertifiedAtMs = Nothing
  , driverDailyLogResponseDaysEndMs = Nothing
  , driverDailyLogResponseDaysStartMs = Nothing
  , driverDailyLogResponseDaysTrailerIds = Nothing
  , driverDailyLogResponseDaysActiveHours = Nothing
  , driverDailyLogResponseDaysDistanceMiles = Nothing
  , driverDailyLogResponseDaysActiveMs = Nothing
  , driverDailyLogResponseDaysCertified = Nothing
  , driverDailyLogResponseDaysVehicleIds = Nothing
  }

-- ** DriverForCreate
-- | DriverForCreate
data DriverForCreate = DriverForCreate
  { driverForCreateEldAdverseWeatherExemptionEnabled :: !(Maybe Bool) -- ^ "eldAdverseWeatherExemptionEnabled" - Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
  , driverForCreateEldBigDayExemptionEnabled :: !(Maybe Bool) -- ^ "eldBigDayExemptionEnabled" - Flag indicating this driver may use Big Day excemptions in ELD logs.
  , driverForCreateEldDayStartHour :: !(Maybe Int) -- ^ "eldDayStartHour" - 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
  , driverForCreateEldExempt :: !(Maybe Bool) -- ^ "eldExempt" - Flag indicating this driver is exempt from the Electronic Logging Mandate.
  , driverForCreateEldExemptReason :: !(Maybe Text) -- ^ "eldExemptReason" - Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
  , driverForCreateEldPcEnabled :: !(Maybe Bool) -- ^ "eldPcEnabled" - Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
  , driverForCreateEldYmEnabled :: !(Maybe Bool) -- ^ "eldYmEnabled" - Flag indicating this driver may select the Yard Move duty status in ELD logs.
  , driverForCreateExternalIds :: !(Maybe (Map.Map String Text)) -- ^ "externalIds" - Dictionary of external IDs (string key-value pairs)
  , driverForCreateGroupId :: !(Maybe Integer) -- ^ "groupId" - ID of the group if the organization has multiple groups (uncommon).
  , driverForCreateLicenseNumber :: !(Maybe Text) -- ^ "licenseNumber" - Driver&#39;s state issued license number.
  , driverForCreateLicenseState :: !(Maybe Text) -- ^ "licenseState" - Abbreviation of state that issued driver&#39;s license.
  , driverForCreateName :: !(Text) -- ^ /Required/ "name" - Driver&#39;s name.
  , driverForCreateNotes :: !(Maybe Text) -- ^ "notes" - Notes about the driver.
  , driverForCreatePhone :: !(Maybe Text) -- ^ "phone" - Driver&#39;s phone number. Please include only digits, ex. 4157771234
  , driverForCreateUsername :: !(Maybe Text) -- ^ "username" - Driver&#39;s login username into the driver app.
  , driverForCreateVehicleId :: !(Maybe Integer) -- ^ "vehicleId" - ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
  , driverForCreatePassword :: !(Text) -- ^ /Required/ "password" - Driver&#39;s password for the driver app.
  , driverForCreateTagIds :: !(Maybe [Integer]) -- ^ "tagIds" - A list of tag IDs.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DriverForCreate
instance A.FromJSON DriverForCreate where
  parseJSON = A.withObject "DriverForCreate" $ \o ->
    DriverForCreate
      <$> (o .:? "eldAdverseWeatherExemptionEnabled")
      <*> (o .:? "eldBigDayExemptionEnabled")
      <*> (o .:? "eldDayStartHour")
      <*> (o .:? "eldExempt")
      <*> (o .:? "eldExemptReason")
      <*> (o .:? "eldPcEnabled")
      <*> (o .:? "eldYmEnabled")
      <*> (o .:? "externalIds")
      <*> (o .:? "groupId")
      <*> (o .:? "licenseNumber")
      <*> (o .:? "licenseState")
      <*> (o .:  "name")
      <*> (o .:? "notes")
      <*> (o .:? "phone")
      <*> (o .:? "username")
      <*> (o .:? "vehicleId")
      <*> (o .:  "password")
      <*> (o .:? "tagIds")

-- | ToJSON DriverForCreate
instance A.ToJSON DriverForCreate where
  toJSON DriverForCreate {..} =
   _omitNulls
      [ "eldAdverseWeatherExemptionEnabled" .= driverForCreateEldAdverseWeatherExemptionEnabled
      , "eldBigDayExemptionEnabled" .= driverForCreateEldBigDayExemptionEnabled
      , "eldDayStartHour" .= driverForCreateEldDayStartHour
      , "eldExempt" .= driverForCreateEldExempt
      , "eldExemptReason" .= driverForCreateEldExemptReason
      , "eldPcEnabled" .= driverForCreateEldPcEnabled
      , "eldYmEnabled" .= driverForCreateEldYmEnabled
      , "externalIds" .= driverForCreateExternalIds
      , "groupId" .= driverForCreateGroupId
      , "licenseNumber" .= driverForCreateLicenseNumber
      , "licenseState" .= driverForCreateLicenseState
      , "name" .= driverForCreateName
      , "notes" .= driverForCreateNotes
      , "phone" .= driverForCreatePhone
      , "username" .= driverForCreateUsername
      , "vehicleId" .= driverForCreateVehicleId
      , "password" .= driverForCreatePassword
      , "tagIds" .= driverForCreateTagIds
      ]


-- | Construct a value of type 'DriverForCreate' (by applying it's required fields, if any)
mkDriverForCreate
  :: Text -- ^ 'driverForCreateName': Driver's name.
  -> Text -- ^ 'driverForCreatePassword': Driver's password for the driver app.
  -> DriverForCreate
mkDriverForCreate driverForCreateName driverForCreatePassword =
  DriverForCreate
  { driverForCreateEldAdverseWeatherExemptionEnabled = Nothing
  , driverForCreateEldBigDayExemptionEnabled = Nothing
  , driverForCreateEldDayStartHour = Nothing
  , driverForCreateEldExempt = Nothing
  , driverForCreateEldExemptReason = Nothing
  , driverForCreateEldPcEnabled = Nothing
  , driverForCreateEldYmEnabled = Nothing
  , driverForCreateExternalIds = Nothing
  , driverForCreateGroupId = Nothing
  , driverForCreateLicenseNumber = Nothing
  , driverForCreateLicenseState = Nothing
  , driverForCreateName
  , driverForCreateNotes = Nothing
  , driverForCreatePhone = Nothing
  , driverForCreateUsername = Nothing
  , driverForCreateVehicleId = Nothing
  , driverForCreatePassword
  , driverForCreateTagIds = Nothing
  }

-- ** DriverSafetyScoreResponse
-- | DriverSafetyScoreResponse
-- Safety score details for a driver
data DriverSafetyScoreResponse = DriverSafetyScoreResponse
  { driverSafetyScoreResponseCrashCount :: !(Maybe Int) -- ^ "crashCount" - Crash event count
  , driverSafetyScoreResponseDriverId :: !(Maybe Int) -- ^ "driverId" - Driver ID
  , driverSafetyScoreResponseHarshAccelCount :: !(Maybe Int) -- ^ "harshAccelCount" - Harsh acceleration event count
  , driverSafetyScoreResponseHarshBrakingCount :: !(Maybe Int) -- ^ "harshBrakingCount" - Harsh braking event count
  , driverSafetyScoreResponseHarshEvents :: !(Maybe [SafetyReportHarshEvent]) -- ^ "harshEvents"
  , driverSafetyScoreResponseHarshTurningCount :: !(Maybe Int) -- ^ "harshTurningCount" - Harsh turning event count
  , driverSafetyScoreResponseSafetyScore :: !(Maybe Int) -- ^ "safetyScore" - Safety Score
  , driverSafetyScoreResponseSafetyScoreRank :: !(Maybe Text) -- ^ "safetyScoreRank" - Safety Score Rank
  , driverSafetyScoreResponseTimeOverSpeedLimitMs :: !(Maybe Int) -- ^ "timeOverSpeedLimitMs" - Amount of time driven over the speed limit in milliseconds
  , driverSafetyScoreResponseTotalDistanceDrivenMeters :: !(Maybe Int) -- ^ "totalDistanceDrivenMeters" - Total distance driven in meters
  , driverSafetyScoreResponseTotalHarshEventCount :: !(Maybe Int) -- ^ "totalHarshEventCount" - Total harsh event count
  , driverSafetyScoreResponseTotalTimeDrivenMs :: !(Maybe Int) -- ^ "totalTimeDrivenMs" - Amount of time driven in milliseconds
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DriverSafetyScoreResponse
instance A.FromJSON DriverSafetyScoreResponse where
  parseJSON = A.withObject "DriverSafetyScoreResponse" $ \o ->
    DriverSafetyScoreResponse
      <$> (o .:? "crashCount")
      <*> (o .:? "driverId")
      <*> (o .:? "harshAccelCount")
      <*> (o .:? "harshBrakingCount")
      <*> (o .:? "harshEvents")
      <*> (o .:? "harshTurningCount")
      <*> (o .:? "safetyScore")
      <*> (o .:? "safetyScoreRank")
      <*> (o .:? "timeOverSpeedLimitMs")
      <*> (o .:? "totalDistanceDrivenMeters")
      <*> (o .:? "totalHarshEventCount")
      <*> (o .:? "totalTimeDrivenMs")

-- | ToJSON DriverSafetyScoreResponse
instance A.ToJSON DriverSafetyScoreResponse where
  toJSON DriverSafetyScoreResponse {..} =
   _omitNulls
      [ "crashCount" .= driverSafetyScoreResponseCrashCount
      , "driverId" .= driverSafetyScoreResponseDriverId
      , "harshAccelCount" .= driverSafetyScoreResponseHarshAccelCount
      , "harshBrakingCount" .= driverSafetyScoreResponseHarshBrakingCount
      , "harshEvents" .= driverSafetyScoreResponseHarshEvents
      , "harshTurningCount" .= driverSafetyScoreResponseHarshTurningCount
      , "safetyScore" .= driverSafetyScoreResponseSafetyScore
      , "safetyScoreRank" .= driverSafetyScoreResponseSafetyScoreRank
      , "timeOverSpeedLimitMs" .= driverSafetyScoreResponseTimeOverSpeedLimitMs
      , "totalDistanceDrivenMeters" .= driverSafetyScoreResponseTotalDistanceDrivenMeters
      , "totalHarshEventCount" .= driverSafetyScoreResponseTotalHarshEventCount
      , "totalTimeDrivenMs" .= driverSafetyScoreResponseTotalTimeDrivenMs
      ]


-- | Construct a value of type 'DriverSafetyScoreResponse' (by applying it's required fields, if any)
mkDriverSafetyScoreResponse
  :: DriverSafetyScoreResponse
mkDriverSafetyScoreResponse =
  DriverSafetyScoreResponse
  { driverSafetyScoreResponseCrashCount = Nothing
  , driverSafetyScoreResponseDriverId = Nothing
  , driverSafetyScoreResponseHarshAccelCount = Nothing
  , driverSafetyScoreResponseHarshBrakingCount = Nothing
  , driverSafetyScoreResponseHarshEvents = Nothing
  , driverSafetyScoreResponseHarshTurningCount = Nothing
  , driverSafetyScoreResponseSafetyScore = Nothing
  , driverSafetyScoreResponseSafetyScoreRank = Nothing
  , driverSafetyScoreResponseTimeOverSpeedLimitMs = Nothing
  , driverSafetyScoreResponseTotalDistanceDrivenMeters = Nothing
  , driverSafetyScoreResponseTotalHarshEventCount = Nothing
  , driverSafetyScoreResponseTotalTimeDrivenMs = Nothing
  }

-- ** DriversResponse
-- | DriversResponse
data DriversResponse = DriversResponse
  { driversResponseDrivers :: !(Maybe [Driver]) -- ^ "drivers"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DriversResponse
instance A.FromJSON DriversResponse where
  parseJSON = A.withObject "DriversResponse" $ \o ->
    DriversResponse
      <$> (o .:? "drivers")

-- | ToJSON DriversResponse
instance A.ToJSON DriversResponse where
  toJSON DriversResponse {..} =
   _omitNulls
      [ "drivers" .= driversResponseDrivers
      ]


-- | Construct a value of type 'DriversResponse' (by applying it's required fields, if any)
mkDriversResponse
  :: DriversResponse
mkDriversResponse =
  DriversResponse
  { driversResponseDrivers = Nothing
  }

-- ** DriversSummaryResponse
-- | DriversSummaryResponse
data DriversSummaryResponse = DriversSummaryResponse
  { driversSummaryResponseSummaries :: !(Maybe [DriversSummaryResponseSummaries]) -- ^ "Summaries"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DriversSummaryResponse
instance A.FromJSON DriversSummaryResponse where
  parseJSON = A.withObject "DriversSummaryResponse" $ \o ->
    DriversSummaryResponse
      <$> (o .:? "Summaries")

-- | ToJSON DriversSummaryResponse
instance A.ToJSON DriversSummaryResponse where
  toJSON DriversSummaryResponse {..} =
   _omitNulls
      [ "Summaries" .= driversSummaryResponseSummaries
      ]


-- | Construct a value of type 'DriversSummaryResponse' (by applying it's required fields, if any)
mkDriversSummaryResponse
  :: DriversSummaryResponse
mkDriversSummaryResponse =
  DriversSummaryResponse
  { driversSummaryResponseSummaries = Nothing
  }

-- ** DriversSummaryResponseSummaries
-- | DriversSummaryResponseSummaries
data DriversSummaryResponseSummaries = DriversSummaryResponseSummaries
  { driversSummaryResponseSummariesDriverId :: !(Maybe Integer) -- ^ "driverId" - ID of the driver.
  , driversSummaryResponseSummariesDistanceMiles :: !(Maybe Double) -- ^ "distanceMiles" - Distance driven in miles, rounded to two decimal places.
  , driversSummaryResponseSummariesDriveMs :: !(Maybe Integer) -- ^ "driveMs" - Duration in milliseconds that driver was driving during the requested time range
  , driversSummaryResponseSummariesActiveMs :: !(Maybe Integer) -- ^ "activeMs" - Duration in milliseconds that driver was on duty or driving during the requested time range
  , driversSummaryResponseSummariesDriverUsername :: !(Maybe Text) -- ^ "driverUsername" - Username of the driver.
  , driversSummaryResponseSummariesGroupId :: !(Maybe Integer) -- ^ "groupId" - Group of the driver.
  , driversSummaryResponseSummariesDriverName :: !(Maybe Text) -- ^ "driverName" - Name of the driver.
  , driversSummaryResponseSummariesOnDutyMs :: !(Maybe Integer) -- ^ "onDutyMs" - Duration in milliseconds that driver was on duty during the requested time range
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DriversSummaryResponseSummaries
instance A.FromJSON DriversSummaryResponseSummaries where
  parseJSON = A.withObject "DriversSummaryResponseSummaries" $ \o ->
    DriversSummaryResponseSummaries
      <$> (o .:? "driverId")
      <*> (o .:? "distanceMiles")
      <*> (o .:? "driveMs")
      <*> (o .:? "activeMs")
      <*> (o .:? "driverUsername")
      <*> (o .:? "groupId")
      <*> (o .:? "driverName")
      <*> (o .:? "onDutyMs")

-- | ToJSON DriversSummaryResponseSummaries
instance A.ToJSON DriversSummaryResponseSummaries where
  toJSON DriversSummaryResponseSummaries {..} =
   _omitNulls
      [ "driverId" .= driversSummaryResponseSummariesDriverId
      , "distanceMiles" .= driversSummaryResponseSummariesDistanceMiles
      , "driveMs" .= driversSummaryResponseSummariesDriveMs
      , "activeMs" .= driversSummaryResponseSummariesActiveMs
      , "driverUsername" .= driversSummaryResponseSummariesDriverUsername
      , "groupId" .= driversSummaryResponseSummariesGroupId
      , "driverName" .= driversSummaryResponseSummariesDriverName
      , "onDutyMs" .= driversSummaryResponseSummariesOnDutyMs
      ]


-- | Construct a value of type 'DriversSummaryResponseSummaries' (by applying it's required fields, if any)
mkDriversSummaryResponseSummaries
  :: DriversSummaryResponseSummaries
mkDriversSummaryResponseSummaries =
  DriversSummaryResponseSummaries
  { driversSummaryResponseSummariesDriverId = Nothing
  , driversSummaryResponseSummariesDistanceMiles = Nothing
  , driversSummaryResponseSummariesDriveMs = Nothing
  , driversSummaryResponseSummariesActiveMs = Nothing
  , driversSummaryResponseSummariesDriverUsername = Nothing
  , driversSummaryResponseSummariesGroupId = Nothing
  , driversSummaryResponseSummariesDriverName = Nothing
  , driversSummaryResponseSummariesOnDutyMs = Nothing
  }

-- ** DvirBase
-- | DvirBase
data DvirBase = DvirBase
  { dvirBaseAuthorSignature :: !(Maybe DvirBaseAuthorSignature) -- ^ "authorSignature"
  , dvirBaseDefectsCorrected :: !(Maybe Bool) -- ^ "defectsCorrected" - Signifies if the defects on the vehicle corrected after the DVIR is done.
  , dvirBaseDefectsNeedNotBeCorrected :: !(Maybe Bool) -- ^ "defectsNeedNotBeCorrected" - Signifies if the defects on this vehicle can be ignored.
  , dvirBaseId :: !(Maybe Integer) -- ^ "id" - The id of this DVIR record.
  , dvirBaseInspectionType :: !(Maybe Text) -- ^ "inspectionType" - Inspection type of the DVIR.
  , dvirBaseMechanicNotes :: !(Maybe Text) -- ^ "mechanicNotes" - The mechanics notes on the DVIR.
  , dvirBaseMechanicOrAgentSignature :: !(Maybe DvirBaseMechanicOrAgentSignature) -- ^ "mechanicOrAgentSignature"
  , dvirBaseNextDriverSignature :: !(Maybe DvirBaseNextDriverSignature) -- ^ "nextDriverSignature"
  , dvirBaseOdometerMiles :: !(Maybe Integer) -- ^ "odometerMiles" - The odometer reading in miles for the vehicle when the DVIR was done.
  , dvirBaseTimeMs :: !(Maybe Integer) -- ^ "timeMs" - Timestamp of this DVIR in UNIX milliseconds.
  , dvirBaseTrailerDefects :: !(Maybe [DvirBaseTrailerDefects]) -- ^ "trailerDefects" - Defects registered for the trailer which was part of the DVIR.
  , dvirBaseTrailerId :: !(Maybe Int) -- ^ "trailerId" - The id of the trailer which was part of the DVIR.
  , dvirBaseTrailerName :: !(Maybe Text) -- ^ "trailerName" - The name of the trailer which was part of the DVIR.
  , dvirBaseVehicle :: !(Maybe DvirBaseVehicle) -- ^ "vehicle"
  , dvirBaseVehicleCondition :: !(Maybe Text) -- ^ "vehicleCondition" - The condition of vechile on which DVIR was done.
  , dvirBaseVehicleDefects :: !(Maybe [DvirBaseTrailerDefects]) -- ^ "vehicleDefects" - Defects registered for the vehicle which was part of the DVIR.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DvirBase
instance A.FromJSON DvirBase where
  parseJSON = A.withObject "DvirBase" $ \o ->
    DvirBase
      <$> (o .:? "authorSignature")
      <*> (o .:? "defectsCorrected")
      <*> (o .:? "defectsNeedNotBeCorrected")
      <*> (o .:? "id")
      <*> (o .:? "inspectionType")
      <*> (o .:? "mechanicNotes")
      <*> (o .:? "mechanicOrAgentSignature")
      <*> (o .:? "nextDriverSignature")
      <*> (o .:? "odometerMiles")
      <*> (o .:? "timeMs")
      <*> (o .:? "trailerDefects")
      <*> (o .:? "trailerId")
      <*> (o .:? "trailerName")
      <*> (o .:? "vehicle")
      <*> (o .:? "vehicleCondition")
      <*> (o .:? "vehicleDefects")

-- | ToJSON DvirBase
instance A.ToJSON DvirBase where
  toJSON DvirBase {..} =
   _omitNulls
      [ "authorSignature" .= dvirBaseAuthorSignature
      , "defectsCorrected" .= dvirBaseDefectsCorrected
      , "defectsNeedNotBeCorrected" .= dvirBaseDefectsNeedNotBeCorrected
      , "id" .= dvirBaseId
      , "inspectionType" .= dvirBaseInspectionType
      , "mechanicNotes" .= dvirBaseMechanicNotes
      , "mechanicOrAgentSignature" .= dvirBaseMechanicOrAgentSignature
      , "nextDriverSignature" .= dvirBaseNextDriverSignature
      , "odometerMiles" .= dvirBaseOdometerMiles
      , "timeMs" .= dvirBaseTimeMs
      , "trailerDefects" .= dvirBaseTrailerDefects
      , "trailerId" .= dvirBaseTrailerId
      , "trailerName" .= dvirBaseTrailerName
      , "vehicle" .= dvirBaseVehicle
      , "vehicleCondition" .= dvirBaseVehicleCondition
      , "vehicleDefects" .= dvirBaseVehicleDefects
      ]


-- | Construct a value of type 'DvirBase' (by applying it's required fields, if any)
mkDvirBase
  :: DvirBase
mkDvirBase =
  DvirBase
  { dvirBaseAuthorSignature = Nothing
  , dvirBaseDefectsCorrected = Nothing
  , dvirBaseDefectsNeedNotBeCorrected = Nothing
  , dvirBaseId = Nothing
  , dvirBaseInspectionType = Nothing
  , dvirBaseMechanicNotes = Nothing
  , dvirBaseMechanicOrAgentSignature = Nothing
  , dvirBaseNextDriverSignature = Nothing
  , dvirBaseOdometerMiles = Nothing
  , dvirBaseTimeMs = Nothing
  , dvirBaseTrailerDefects = Nothing
  , dvirBaseTrailerId = Nothing
  , dvirBaseTrailerName = Nothing
  , dvirBaseVehicle = Nothing
  , dvirBaseVehicleCondition = Nothing
  , dvirBaseVehicleDefects = Nothing
  }

-- ** DvirBaseAuthorSignature
-- | DvirBaseAuthorSignature
-- The authors signature for the DVIR.
data DvirBaseAuthorSignature = DvirBaseAuthorSignature
  { dvirBaseAuthorSignatureMechanicUserId :: !(Maybe Integer) -- ^ "mechanicUserId" - ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
  , dvirBaseAuthorSignatureDriverId :: !(Maybe Integer) -- ^ "driverId" - ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
  , dvirBaseAuthorSignatureName :: !(Maybe Text) -- ^ "name" - The name of the driver or mechanic who signed the DVIR.
  , dvirBaseAuthorSignatureSignedAt :: !(Maybe Integer) -- ^ "signedAt" - The time in millis when the DVIR was signed
  , dvirBaseAuthorSignatureType :: !(Maybe Text) -- ^ "type" - Type corresponds to whether the signature corresponds to driver|mechanic.
  , dvirBaseAuthorSignatureEmail :: !(Maybe Text) -- ^ "email" - Email of the  driver|mechanic who signed the DVIR.
  , dvirBaseAuthorSignatureUsername :: !(Maybe Text) -- ^ "username" - Username of the  driver|mechanic who signed the DVIR.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DvirBaseAuthorSignature
instance A.FromJSON DvirBaseAuthorSignature where
  parseJSON = A.withObject "DvirBaseAuthorSignature" $ \o ->
    DvirBaseAuthorSignature
      <$> (o .:? "mechanicUserId")
      <*> (o .:? "driverId")
      <*> (o .:? "name")
      <*> (o .:? "signedAt")
      <*> (o .:? "type")
      <*> (o .:? "email")
      <*> (o .:? "username")

-- | ToJSON DvirBaseAuthorSignature
instance A.ToJSON DvirBaseAuthorSignature where
  toJSON DvirBaseAuthorSignature {..} =
   _omitNulls
      [ "mechanicUserId" .= dvirBaseAuthorSignatureMechanicUserId
      , "driverId" .= dvirBaseAuthorSignatureDriverId
      , "name" .= dvirBaseAuthorSignatureName
      , "signedAt" .= dvirBaseAuthorSignatureSignedAt
      , "type" .= dvirBaseAuthorSignatureType
      , "email" .= dvirBaseAuthorSignatureEmail
      , "username" .= dvirBaseAuthorSignatureUsername
      ]


-- | Construct a value of type 'DvirBaseAuthorSignature' (by applying it's required fields, if any)
mkDvirBaseAuthorSignature
  :: DvirBaseAuthorSignature
mkDvirBaseAuthorSignature =
  DvirBaseAuthorSignature
  { dvirBaseAuthorSignatureMechanicUserId = Nothing
  , dvirBaseAuthorSignatureDriverId = Nothing
  , dvirBaseAuthorSignatureName = Nothing
  , dvirBaseAuthorSignatureSignedAt = Nothing
  , dvirBaseAuthorSignatureType = Nothing
  , dvirBaseAuthorSignatureEmail = Nothing
  , dvirBaseAuthorSignatureUsername = Nothing
  }

-- ** DvirBaseMechanicOrAgentSignature
-- | DvirBaseMechanicOrAgentSignature
-- The mechanic's or agent's signature for the DVIR.
data DvirBaseMechanicOrAgentSignature = DvirBaseMechanicOrAgentSignature
  { dvirBaseMechanicOrAgentSignatureMechanicUserId :: !(Maybe Integer) -- ^ "mechanicUserId" - ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
  , dvirBaseMechanicOrAgentSignatureDriverId :: !(Maybe Integer) -- ^ "driverId" - ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
  , dvirBaseMechanicOrAgentSignatureName :: !(Maybe Text) -- ^ "name" - The name of the agent or mechanic who signed the DVIR.
  , dvirBaseMechanicOrAgentSignatureSignedAt :: !(Maybe Integer) -- ^ "signedAt" - The time in millis when the DVIR was signed
  , dvirBaseMechanicOrAgentSignatureType :: !(Maybe Text) -- ^ "type" - Type corresponds to whether the signature corresponds to driver|mechanic.
  , dvirBaseMechanicOrAgentSignatureEmail :: !(Maybe Text) -- ^ "email" - Email of the  agent|mechanic who signed the DVIR.
  , dvirBaseMechanicOrAgentSignatureUsername :: !(Maybe Text) -- ^ "username" - Username of the  agent|mechanic who signed the DVIR.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DvirBaseMechanicOrAgentSignature
instance A.FromJSON DvirBaseMechanicOrAgentSignature where
  parseJSON = A.withObject "DvirBaseMechanicOrAgentSignature" $ \o ->
    DvirBaseMechanicOrAgentSignature
      <$> (o .:? "mechanicUserId")
      <*> (o .:? "driverId")
      <*> (o .:? "name")
      <*> (o .:? "signedAt")
      <*> (o .:? "type")
      <*> (o .:? "email")
      <*> (o .:? "username")

-- | ToJSON DvirBaseMechanicOrAgentSignature
instance A.ToJSON DvirBaseMechanicOrAgentSignature where
  toJSON DvirBaseMechanicOrAgentSignature {..} =
   _omitNulls
      [ "mechanicUserId" .= dvirBaseMechanicOrAgentSignatureMechanicUserId
      , "driverId" .= dvirBaseMechanicOrAgentSignatureDriverId
      , "name" .= dvirBaseMechanicOrAgentSignatureName
      , "signedAt" .= dvirBaseMechanicOrAgentSignatureSignedAt
      , "type" .= dvirBaseMechanicOrAgentSignatureType
      , "email" .= dvirBaseMechanicOrAgentSignatureEmail
      , "username" .= dvirBaseMechanicOrAgentSignatureUsername
      ]


-- | Construct a value of type 'DvirBaseMechanicOrAgentSignature' (by applying it's required fields, if any)
mkDvirBaseMechanicOrAgentSignature
  :: DvirBaseMechanicOrAgentSignature
mkDvirBaseMechanicOrAgentSignature =
  DvirBaseMechanicOrAgentSignature
  { dvirBaseMechanicOrAgentSignatureMechanicUserId = Nothing
  , dvirBaseMechanicOrAgentSignatureDriverId = Nothing
  , dvirBaseMechanicOrAgentSignatureName = Nothing
  , dvirBaseMechanicOrAgentSignatureSignedAt = Nothing
  , dvirBaseMechanicOrAgentSignatureType = Nothing
  , dvirBaseMechanicOrAgentSignatureEmail = Nothing
  , dvirBaseMechanicOrAgentSignatureUsername = Nothing
  }

-- ** DvirBaseNextDriverSignature
-- | DvirBaseNextDriverSignature
-- The next driver signature for the DVIR.
data DvirBaseNextDriverSignature = DvirBaseNextDriverSignature
  { dvirBaseNextDriverSignatureDriverId :: !(Maybe Integer) -- ^ "driverId" - ID of the driver who signed the DVIR
  , dvirBaseNextDriverSignatureName :: !(Maybe Text) -- ^ "name" - The name of the driver who signed the next DVIR on this vehicle.
  , dvirBaseNextDriverSignatureSignedAt :: !(Maybe Integer) -- ^ "signedAt" - The time in millis when the next driver signed the DVIR on this vehicle.
  , dvirBaseNextDriverSignatureType :: !(Maybe Text) -- ^ "type" - Type corresponds to driver.
  , dvirBaseNextDriverSignatureEmail :: !(Maybe Text) -- ^ "email" - Email of the  driver who signed the next DVIR on this vehicle.
  , dvirBaseNextDriverSignatureUsername :: !(Maybe Text) -- ^ "username" - Username of the  driver who signed the next DVIR on this vehicle.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DvirBaseNextDriverSignature
instance A.FromJSON DvirBaseNextDriverSignature where
  parseJSON = A.withObject "DvirBaseNextDriverSignature" $ \o ->
    DvirBaseNextDriverSignature
      <$> (o .:? "driverId")
      <*> (o .:? "name")
      <*> (o .:? "signedAt")
      <*> (o .:? "type")
      <*> (o .:? "email")
      <*> (o .:? "username")

-- | ToJSON DvirBaseNextDriverSignature
instance A.ToJSON DvirBaseNextDriverSignature where
  toJSON DvirBaseNextDriverSignature {..} =
   _omitNulls
      [ "driverId" .= dvirBaseNextDriverSignatureDriverId
      , "name" .= dvirBaseNextDriverSignatureName
      , "signedAt" .= dvirBaseNextDriverSignatureSignedAt
      , "type" .= dvirBaseNextDriverSignatureType
      , "email" .= dvirBaseNextDriverSignatureEmail
      , "username" .= dvirBaseNextDriverSignatureUsername
      ]


-- | Construct a value of type 'DvirBaseNextDriverSignature' (by applying it's required fields, if any)
mkDvirBaseNextDriverSignature
  :: DvirBaseNextDriverSignature
mkDvirBaseNextDriverSignature =
  DvirBaseNextDriverSignature
  { dvirBaseNextDriverSignatureDriverId = Nothing
  , dvirBaseNextDriverSignatureName = Nothing
  , dvirBaseNextDriverSignatureSignedAt = Nothing
  , dvirBaseNextDriverSignatureType = Nothing
  , dvirBaseNextDriverSignatureEmail = Nothing
  , dvirBaseNextDriverSignatureUsername = Nothing
  }

-- ** DvirBaseTrailerDefects
-- | DvirBaseTrailerDefects
data DvirBaseTrailerDefects = DvirBaseTrailerDefects
  { dvirBaseTrailerDefectsComment :: !(Maybe Text) -- ^ "comment" - The comment describing the type of DVIR defect
  , dvirBaseTrailerDefectsDefectType :: !(Maybe Text) -- ^ "defectType" - The type of DVIR defect
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DvirBaseTrailerDefects
instance A.FromJSON DvirBaseTrailerDefects where
  parseJSON = A.withObject "DvirBaseTrailerDefects" $ \o ->
    DvirBaseTrailerDefects
      <$> (o .:? "comment")
      <*> (o .:? "defectType")

-- | ToJSON DvirBaseTrailerDefects
instance A.ToJSON DvirBaseTrailerDefects where
  toJSON DvirBaseTrailerDefects {..} =
   _omitNulls
      [ "comment" .= dvirBaseTrailerDefectsComment
      , "defectType" .= dvirBaseTrailerDefectsDefectType
      ]


-- | Construct a value of type 'DvirBaseTrailerDefects' (by applying it's required fields, if any)
mkDvirBaseTrailerDefects
  :: DvirBaseTrailerDefects
mkDvirBaseTrailerDefects =
  DvirBaseTrailerDefects
  { dvirBaseTrailerDefectsComment = Nothing
  , dvirBaseTrailerDefectsDefectType = Nothing
  }

-- ** DvirBaseVehicle
-- | DvirBaseVehicle
-- The vehicle on which DVIR was done.
data DvirBaseVehicle = DvirBaseVehicle
  { dvirBaseVehicleName :: !(Maybe Text) -- ^ "name" - The vehicle on which DVIR was done.
  , dvirBaseVehicleId :: !(Maybe Integer) -- ^ "id" - The vehicle id on which DVIR was done.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DvirBaseVehicle
instance A.FromJSON DvirBaseVehicle where
  parseJSON = A.withObject "DvirBaseVehicle" $ \o ->
    DvirBaseVehicle
      <$> (o .:? "name")
      <*> (o .:? "id")

-- | ToJSON DvirBaseVehicle
instance A.ToJSON DvirBaseVehicle where
  toJSON DvirBaseVehicle {..} =
   _omitNulls
      [ "name" .= dvirBaseVehicleName
      , "id" .= dvirBaseVehicleId
      ]


-- | Construct a value of type 'DvirBaseVehicle' (by applying it's required fields, if any)
mkDvirBaseVehicle
  :: DvirBaseVehicle
mkDvirBaseVehicle =
  DvirBaseVehicle
  { dvirBaseVehicleName = Nothing
  , dvirBaseVehicleId = Nothing
  }

-- ** DvirListResponse
-- | DvirListResponse
data DvirListResponse = DvirListResponse
  { dvirListResponseDvirs :: !(Maybe [DvirBase]) -- ^ "dvirs"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON DvirListResponse
instance A.FromJSON DvirListResponse where
  parseJSON = A.withObject "DvirListResponse" $ \o ->
    DvirListResponse
      <$> (o .:? "dvirs")

-- | ToJSON DvirListResponse
instance A.ToJSON DvirListResponse where
  toJSON DvirListResponse {..} =
   _omitNulls
      [ "dvirs" .= dvirListResponseDvirs
      ]


-- | Construct a value of type 'DvirListResponse' (by applying it's required fields, if any)
mkDvirListResponse
  :: DvirListResponse
mkDvirListResponse =
  DvirListResponse
  { dvirListResponseDvirs = Nothing
  }

-- ** EngineState
-- | EngineState
-- The state of the vehicle over time. State can be Running, Off, or Idle.
data EngineState = EngineState
  { engineStateTimeMs :: !(A.Value) -- ^ /Required/ "timeMs" - Timestamp in Unix epoch milliseconds.
  , engineStateValue :: !(E'Value) -- ^ /Required/ "value"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON EngineState
instance A.FromJSON EngineState where
  parseJSON = A.withObject "EngineState" $ \o ->
    EngineState
      <$> (o .:  "timeMs")
      <*> (o .:  "value")

-- | ToJSON EngineState
instance A.ToJSON EngineState where
  toJSON EngineState {..} =
   _omitNulls
      [ "timeMs" .= engineStateTimeMs
      , "value" .= engineStateValue
      ]


-- | Construct a value of type 'EngineState' (by applying it's required fields, if any)
mkEngineState
  :: A.Value -- ^ 'engineStateTimeMs': Timestamp in Unix epoch milliseconds.
  -> E'Value -- ^ 'engineStateValue' 
  -> EngineState
mkEngineState engineStateTimeMs engineStateValue =
  EngineState
  { engineStateTimeMs
  , engineStateValue
  }

-- ** FleetVehicleLocation
-- | FleetVehicleLocation
-- Contains the location and speed of a vehicle at a particular time
data FleetVehicleLocation = FleetVehicleLocation
  { fleetVehicleLocationLatitude :: !(Maybe Double) -- ^ "latitude" - The latitude of the location in degrees.
  , fleetVehicleLocationLocation :: !(Maybe Text) -- ^ "location" - The best effort (street,city,state) for the latitude and longitude.
  , fleetVehicleLocationLongitude :: !(Maybe Double) -- ^ "longitude" - The longitude of the location in degrees.
  , fleetVehicleLocationSpeedMilesPerHour :: !(Maybe Double) -- ^ "speedMilesPerHour" - The speed calculated from GPS that the asset was traveling at in miles per hour.
  , fleetVehicleLocationTimeMs :: !(Maybe Integer) -- ^ "timeMs" - Time in Unix milliseconds since epoch when the asset was at the location.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON FleetVehicleLocation
instance A.FromJSON FleetVehicleLocation where
  parseJSON = A.withObject "FleetVehicleLocation" $ \o ->
    FleetVehicleLocation
      <$> (o .:? "latitude")
      <*> (o .:? "location")
      <*> (o .:? "longitude")
      <*> (o .:? "speedMilesPerHour")
      <*> (o .:? "timeMs")

-- | ToJSON FleetVehicleLocation
instance A.ToJSON FleetVehicleLocation where
  toJSON FleetVehicleLocation {..} =
   _omitNulls
      [ "latitude" .= fleetVehicleLocationLatitude
      , "location" .= fleetVehicleLocationLocation
      , "longitude" .= fleetVehicleLocationLongitude
      , "speedMilesPerHour" .= fleetVehicleLocationSpeedMilesPerHour
      , "timeMs" .= fleetVehicleLocationTimeMs
      ]


-- | Construct a value of type 'FleetVehicleLocation' (by applying it's required fields, if any)
mkFleetVehicleLocation
  :: FleetVehicleLocation
mkFleetVehicleLocation =
  FleetVehicleLocation
  { fleetVehicleLocationLatitude = Nothing
  , fleetVehicleLocationLocation = Nothing
  , fleetVehicleLocationLongitude = Nothing
  , fleetVehicleLocationSpeedMilesPerHour = Nothing
  , fleetVehicleLocationTimeMs = Nothing
  }

-- ** FleetVehicleResponse
-- | FleetVehicleResponse
-- A vehicle object as returned for fleet/vehicle
data FleetVehicleResponse = FleetVehicleResponse
  { fleetVehicleResponseExternalIds :: !(Maybe (Map.Map String Text)) -- ^ "externalIds"
  , fleetVehicleResponseHarshAccelSetting :: !(Maybe Text) -- ^ "harshAccelSetting" - Harsh event detection setting.
  , fleetVehicleResponseId :: !(Integer) -- ^ /Required/ "id" - ID of the vehicle.
  , fleetVehicleResponseName :: !(Text) -- ^ /Required/ "name" - Name of the vehicle.
  , fleetVehicleResponseVehicleInfo :: !(Maybe FleetVehicleResponseVehicleInfo) -- ^ "vehicleInfo"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON FleetVehicleResponse
instance A.FromJSON FleetVehicleResponse where
  parseJSON = A.withObject "FleetVehicleResponse" $ \o ->
    FleetVehicleResponse
      <$> (o .:? "externalIds")
      <*> (o .:? "harshAccelSetting")
      <*> (o .:  "id")
      <*> (o .:  "name")
      <*> (o .:? "vehicleInfo")

-- | ToJSON FleetVehicleResponse
instance A.ToJSON FleetVehicleResponse where
  toJSON FleetVehicleResponse {..} =
   _omitNulls
      [ "externalIds" .= fleetVehicleResponseExternalIds
      , "harshAccelSetting" .= fleetVehicleResponseHarshAccelSetting
      , "id" .= fleetVehicleResponseId
      , "name" .= fleetVehicleResponseName
      , "vehicleInfo" .= fleetVehicleResponseVehicleInfo
      ]


-- | Construct a value of type 'FleetVehicleResponse' (by applying it's required fields, if any)
mkFleetVehicleResponse
  :: Integer -- ^ 'fleetVehicleResponseId': ID of the vehicle.
  -> Text -- ^ 'fleetVehicleResponseName': Name of the vehicle.
  -> FleetVehicleResponse
mkFleetVehicleResponse fleetVehicleResponseId fleetVehicleResponseName =
  FleetVehicleResponse
  { fleetVehicleResponseExternalIds = Nothing
  , fleetVehicleResponseHarshAccelSetting = Nothing
  , fleetVehicleResponseId
  , fleetVehicleResponseName
  , fleetVehicleResponseVehicleInfo = Nothing
  }

-- ** FleetVehicleResponseVehicleInfo
-- | FleetVehicleResponseVehicleInfo
data FleetVehicleResponseVehicleInfo = FleetVehicleResponseVehicleInfo
  { fleetVehicleResponseVehicleInfoYear :: !(Maybe Integer) -- ^ "year" - Year of the vehicle.
  , fleetVehicleResponseVehicleInfoModel :: !(Maybe Text) -- ^ "model" - Model of the Vehicle.
  , fleetVehicleResponseVehicleInfoVin :: !(Maybe Text) -- ^ "vin" - Vehicle Identification Number.
  , fleetVehicleResponseVehicleInfoMake :: !(Maybe Text) -- ^ "make" - Make of the vehicle.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON FleetVehicleResponseVehicleInfo
instance A.FromJSON FleetVehicleResponseVehicleInfo where
  parseJSON = A.withObject "FleetVehicleResponseVehicleInfo" $ \o ->
    FleetVehicleResponseVehicleInfo
      <$> (o .:? "year")
      <*> (o .:? "model")
      <*> (o .:? "vin")
      <*> (o .:? "make")

-- | ToJSON FleetVehicleResponseVehicleInfo
instance A.ToJSON FleetVehicleResponseVehicleInfo where
  toJSON FleetVehicleResponseVehicleInfo {..} =
   _omitNulls
      [ "year" .= fleetVehicleResponseVehicleInfoYear
      , "model" .= fleetVehicleResponseVehicleInfoModel
      , "vin" .= fleetVehicleResponseVehicleInfoVin
      , "make" .= fleetVehicleResponseVehicleInfoMake
      ]


-- | Construct a value of type 'FleetVehicleResponseVehicleInfo' (by applying it's required fields, if any)
mkFleetVehicleResponseVehicleInfo
  :: FleetVehicleResponseVehicleInfo
mkFleetVehicleResponseVehicleInfo =
  FleetVehicleResponseVehicleInfo
  { fleetVehicleResponseVehicleInfoYear = Nothing
  , fleetVehicleResponseVehicleInfoModel = Nothing
  , fleetVehicleResponseVehicleInfoVin = Nothing
  , fleetVehicleResponseVehicleInfoMake = Nothing
  }

-- ** HosAuthenticationLogsResponse
-- | HosAuthenticationLogsResponse
data HosAuthenticationLogsResponse = HosAuthenticationLogsResponse
  { hosAuthenticationLogsResponseAuthenticationLogs :: !(Maybe [HosAuthenticationLogsResponseAuthenticationLogs]) -- ^ "authenticationLogs"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON HosAuthenticationLogsResponse
instance A.FromJSON HosAuthenticationLogsResponse where
  parseJSON = A.withObject "HosAuthenticationLogsResponse" $ \o ->
    HosAuthenticationLogsResponse
      <$> (o .:? "authenticationLogs")

-- | ToJSON HosAuthenticationLogsResponse
instance A.ToJSON HosAuthenticationLogsResponse where
  toJSON HosAuthenticationLogsResponse {..} =
   _omitNulls
      [ "authenticationLogs" .= hosAuthenticationLogsResponseAuthenticationLogs
      ]


-- | Construct a value of type 'HosAuthenticationLogsResponse' (by applying it's required fields, if any)
mkHosAuthenticationLogsResponse
  :: HosAuthenticationLogsResponse
mkHosAuthenticationLogsResponse =
  HosAuthenticationLogsResponse
  { hosAuthenticationLogsResponseAuthenticationLogs = Nothing
  }

-- ** HosAuthenticationLogsResponseAuthenticationLogs
-- | HosAuthenticationLogsResponseAuthenticationLogs
data HosAuthenticationLogsResponseAuthenticationLogs = HosAuthenticationLogsResponseAuthenticationLogs
  { hosAuthenticationLogsResponseAuthenticationLogsActionType :: !(Maybe Text) -- ^ "actionType" - The log type - one of &#39;signin&#39; or &#39;signout&#39;
  , hosAuthenticationLogsResponseAuthenticationLogsAddress :: !(Maybe Text) -- ^ "address" - Address at which the log was recorded, if applicable.
  , hosAuthenticationLogsResponseAuthenticationLogsCity :: !(Maybe Text) -- ^ "city" - City in which the log was recorded, if applicable.
  , hosAuthenticationLogsResponseAuthenticationLogsHappenedAtMs :: !(Maybe Integer) -- ^ "happenedAtMs" - The time at which the event was recorded in UNIX milliseconds.
  , hosAuthenticationLogsResponseAuthenticationLogsAddressName :: !(Maybe Text) -- ^ "addressName" - Address name from the group address book at which the log was recorded, if applicable.
  , hosAuthenticationLogsResponseAuthenticationLogsState :: !(Maybe Text) -- ^ "state" - State in which the log was recorded, if applicable.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON HosAuthenticationLogsResponseAuthenticationLogs
instance A.FromJSON HosAuthenticationLogsResponseAuthenticationLogs where
  parseJSON = A.withObject "HosAuthenticationLogsResponseAuthenticationLogs" $ \o ->
    HosAuthenticationLogsResponseAuthenticationLogs
      <$> (o .:? "actionType")
      <*> (o .:? "address")
      <*> (o .:? "city")
      <*> (o .:? "happenedAtMs")
      <*> (o .:? "addressName")
      <*> (o .:? "state")

-- | ToJSON HosAuthenticationLogsResponseAuthenticationLogs
instance A.ToJSON HosAuthenticationLogsResponseAuthenticationLogs where
  toJSON HosAuthenticationLogsResponseAuthenticationLogs {..} =
   _omitNulls
      [ "actionType" .= hosAuthenticationLogsResponseAuthenticationLogsActionType
      , "address" .= hosAuthenticationLogsResponseAuthenticationLogsAddress
      , "city" .= hosAuthenticationLogsResponseAuthenticationLogsCity
      , "happenedAtMs" .= hosAuthenticationLogsResponseAuthenticationLogsHappenedAtMs
      , "addressName" .= hosAuthenticationLogsResponseAuthenticationLogsAddressName
      , "state" .= hosAuthenticationLogsResponseAuthenticationLogsState
      ]


-- | Construct a value of type 'HosAuthenticationLogsResponseAuthenticationLogs' (by applying it's required fields, if any)
mkHosAuthenticationLogsResponseAuthenticationLogs
  :: HosAuthenticationLogsResponseAuthenticationLogs
mkHosAuthenticationLogsResponseAuthenticationLogs =
  HosAuthenticationLogsResponseAuthenticationLogs
  { hosAuthenticationLogsResponseAuthenticationLogsActionType = Nothing
  , hosAuthenticationLogsResponseAuthenticationLogsAddress = Nothing
  , hosAuthenticationLogsResponseAuthenticationLogsCity = Nothing
  , hosAuthenticationLogsResponseAuthenticationLogsHappenedAtMs = Nothing
  , hosAuthenticationLogsResponseAuthenticationLogsAddressName = Nothing
  , hosAuthenticationLogsResponseAuthenticationLogsState = Nothing
  }

-- ** HosLogsResponse
-- | HosLogsResponse
data HosLogsResponse = HosLogsResponse
  { hosLogsResponseLogs :: !(Maybe [HosLogsResponseLogs]) -- ^ "logs"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON HosLogsResponse
instance A.FromJSON HosLogsResponse where
  parseJSON = A.withObject "HosLogsResponse" $ \o ->
    HosLogsResponse
      <$> (o .:? "logs")

-- | ToJSON HosLogsResponse
instance A.ToJSON HosLogsResponse where
  toJSON HosLogsResponse {..} =
   _omitNulls
      [ "logs" .= hosLogsResponseLogs
      ]


-- | Construct a value of type 'HosLogsResponse' (by applying it's required fields, if any)
mkHosLogsResponse
  :: HosLogsResponse
mkHosLogsResponse =
  HosLogsResponse
  { hosLogsResponseLogs = Nothing
  }

-- ** HosLogsResponseLogs
-- | HosLogsResponseLogs
data HosLogsResponseLogs = HosLogsResponseLogs
  { hosLogsResponseLogsLocLng :: !(Maybe Double) -- ^ "locLng" - Longitude at which the log was recorded.
  , hosLogsResponseLogsLogStartMs :: !(Maybe Integer) -- ^ "logStartMs" - The time at which the log/HOS status started in UNIX milliseconds.
  , hosLogsResponseLogsDriverId :: !(Maybe Integer) -- ^ "driverId" - ID of the driver.
  , hosLogsResponseLogsStatusType :: !(Maybe Text) -- ^ "statusType" - The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
  , hosLogsResponseLogsLocCity :: !(Maybe Text) -- ^ "locCity" - City in which the log was recorded.
  , hosLogsResponseLogsGroupId :: !(Maybe Integer) -- ^ "groupId" - ID of the group.
  , hosLogsResponseLogsLocName :: !(Maybe Text) -- ^ "locName" - Name of location at which the log was recorded.
  , hosLogsResponseLogsLocLat :: !(Maybe Double) -- ^ "locLat" - Latitude at which the log was recorded.
  , hosLogsResponseLogsRemark :: !(Maybe Text) -- ^ "remark" - Remark associated with the log entry.
  , hosLogsResponseLogsLocState :: !(Maybe Text) -- ^ "locState" - State in which the log was recorded.
  , hosLogsResponseLogsVehicleId :: !(Maybe Integer) -- ^ "vehicleId" - ID of the vehicle.
  , hosLogsResponseLogsCodriverIds :: !(Maybe [Integer]) -- ^ "codriverIds"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON HosLogsResponseLogs
instance A.FromJSON HosLogsResponseLogs where
  parseJSON = A.withObject "HosLogsResponseLogs" $ \o ->
    HosLogsResponseLogs
      <$> (o .:? "locLng")
      <*> (o .:? "logStartMs")
      <*> (o .:? "driverId")
      <*> (o .:? "statusType")
      <*> (o .:? "locCity")
      <*> (o .:? "groupId")
      <*> (o .:? "locName")
      <*> (o .:? "locLat")
      <*> (o .:? "remark")
      <*> (o .:? "locState")
      <*> (o .:? "vehicleId")
      <*> (o .:? "codriverIds")

-- | ToJSON HosLogsResponseLogs
instance A.ToJSON HosLogsResponseLogs where
  toJSON HosLogsResponseLogs {..} =
   _omitNulls
      [ "locLng" .= hosLogsResponseLogsLocLng
      , "logStartMs" .= hosLogsResponseLogsLogStartMs
      , "driverId" .= hosLogsResponseLogsDriverId
      , "statusType" .= hosLogsResponseLogsStatusType
      , "locCity" .= hosLogsResponseLogsLocCity
      , "groupId" .= hosLogsResponseLogsGroupId
      , "locName" .= hosLogsResponseLogsLocName
      , "locLat" .= hosLogsResponseLogsLocLat
      , "remark" .= hosLogsResponseLogsRemark
      , "locState" .= hosLogsResponseLogsLocState
      , "vehicleId" .= hosLogsResponseLogsVehicleId
      , "codriverIds" .= hosLogsResponseLogsCodriverIds
      ]


-- | Construct a value of type 'HosLogsResponseLogs' (by applying it's required fields, if any)
mkHosLogsResponseLogs
  :: HosLogsResponseLogs
mkHosLogsResponseLogs =
  HosLogsResponseLogs
  { hosLogsResponseLogsLocLng = Nothing
  , hosLogsResponseLogsLogStartMs = Nothing
  , hosLogsResponseLogsDriverId = Nothing
  , hosLogsResponseLogsStatusType = Nothing
  , hosLogsResponseLogsLocCity = Nothing
  , hosLogsResponseLogsGroupId = Nothing
  , hosLogsResponseLogsLocName = Nothing
  , hosLogsResponseLogsLocLat = Nothing
  , hosLogsResponseLogsRemark = Nothing
  , hosLogsResponseLogsLocState = Nothing
  , hosLogsResponseLogsVehicleId = Nothing
  , hosLogsResponseLogsCodriverIds = Nothing
  }

-- ** HosLogsSummaryResponse
-- | HosLogsSummaryResponse
data HosLogsSummaryResponse = HosLogsSummaryResponse
  { hosLogsSummaryResponseDrivers :: !(Maybe [HosLogsSummaryResponseDrivers]) -- ^ "drivers"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON HosLogsSummaryResponse
instance A.FromJSON HosLogsSummaryResponse where
  parseJSON = A.withObject "HosLogsSummaryResponse" $ \o ->
    HosLogsSummaryResponse
      <$> (o .:? "drivers")

-- | ToJSON HosLogsSummaryResponse
instance A.ToJSON HosLogsSummaryResponse where
  toJSON HosLogsSummaryResponse {..} =
   _omitNulls
      [ "drivers" .= hosLogsSummaryResponseDrivers
      ]


-- | Construct a value of type 'HosLogsSummaryResponse' (by applying it's required fields, if any)
mkHosLogsSummaryResponse
  :: HosLogsSummaryResponse
mkHosLogsSummaryResponse =
  HosLogsSummaryResponse
  { hosLogsSummaryResponseDrivers = Nothing
  }

-- ** HosLogsSummaryResponseDrivers
-- | HosLogsSummaryResponseDrivers
data HosLogsSummaryResponseDrivers = HosLogsSummaryResponseDrivers
  { hosLogsSummaryResponseDriversTimeUntilBreak :: !(Maybe Integer) -- ^ "timeUntilBreak" - The amount of time (in ms) remaining until the driver cannot drive without a rest break.
  , hosLogsSummaryResponseDriversVehicleName :: !(Maybe Text) -- ^ "vehicleName" - Name of the vehicle.
  , hosLogsSummaryResponseDriversDrivingInViolationToday :: !(Maybe Integer) -- ^ "drivingInViolationToday" - The amount of driving time in violation today (in ms).
  , hosLogsSummaryResponseDriversDriverId :: !(Maybe Integer) -- ^ "driverId" - ID of the driver.
  , hosLogsSummaryResponseDriversCycleRemaining :: !(Maybe Integer) -- ^ "cycleRemaining" - The amount of remaining cycle time (in ms).
  , hosLogsSummaryResponseDriversDriverName :: !(Maybe Text) -- ^ "driverName" - Name of the driver.
  , hosLogsSummaryResponseDriversDutyStatus :: !(Maybe Text) -- ^ "dutyStatus" - The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
  , hosLogsSummaryResponseDriversCycleTomorrow :: !(Maybe Integer) -- ^ "cycleTomorrow" - The amount of cycle time (in ms) available tomorrow.
  , hosLogsSummaryResponseDriversShiftDriveRemaining :: !(Maybe Integer) -- ^ "shiftDriveRemaining" - The amount of remaining shift drive time (in ms).
  , hosLogsSummaryResponseDriversTimeInCurrentStatus :: !(Maybe Integer) -- ^ "timeInCurrentStatus" - The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;.
  , hosLogsSummaryResponseDriversDrivingInViolationCycle :: !(Maybe Integer) -- ^ "drivingInViolationCycle" - The amount of driving time in violation in this cycle (in ms).
  , hosLogsSummaryResponseDriversShiftRemaining :: !(Maybe Integer) -- ^ "shiftRemaining" - The amount of remaining shift time (in ms).
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON HosLogsSummaryResponseDrivers
instance A.FromJSON HosLogsSummaryResponseDrivers where
  parseJSON = A.withObject "HosLogsSummaryResponseDrivers" $ \o ->
    HosLogsSummaryResponseDrivers
      <$> (o .:? "timeUntilBreak")
      <*> (o .:? "vehicleName")
      <*> (o .:? "drivingInViolationToday")
      <*> (o .:? "driverId")
      <*> (o .:? "cycleRemaining")
      <*> (o .:? "driverName")
      <*> (o .:? "dutyStatus")
      <*> (o .:? "cycleTomorrow")
      <*> (o .:? "shiftDriveRemaining")
      <*> (o .:? "timeInCurrentStatus")
      <*> (o .:? "drivingInViolationCycle")
      <*> (o .:? "shiftRemaining")

-- | ToJSON HosLogsSummaryResponseDrivers
instance A.ToJSON HosLogsSummaryResponseDrivers where
  toJSON HosLogsSummaryResponseDrivers {..} =
   _omitNulls
      [ "timeUntilBreak" .= hosLogsSummaryResponseDriversTimeUntilBreak
      , "vehicleName" .= hosLogsSummaryResponseDriversVehicleName
      , "drivingInViolationToday" .= hosLogsSummaryResponseDriversDrivingInViolationToday
      , "driverId" .= hosLogsSummaryResponseDriversDriverId
      , "cycleRemaining" .= hosLogsSummaryResponseDriversCycleRemaining
      , "driverName" .= hosLogsSummaryResponseDriversDriverName
      , "dutyStatus" .= hosLogsSummaryResponseDriversDutyStatus
      , "cycleTomorrow" .= hosLogsSummaryResponseDriversCycleTomorrow
      , "shiftDriveRemaining" .= hosLogsSummaryResponseDriversShiftDriveRemaining
      , "timeInCurrentStatus" .= hosLogsSummaryResponseDriversTimeInCurrentStatus
      , "drivingInViolationCycle" .= hosLogsSummaryResponseDriversDrivingInViolationCycle
      , "shiftRemaining" .= hosLogsSummaryResponseDriversShiftRemaining
      ]


-- | Construct a value of type 'HosLogsSummaryResponseDrivers' (by applying it's required fields, if any)
mkHosLogsSummaryResponseDrivers
  :: HosLogsSummaryResponseDrivers
mkHosLogsSummaryResponseDrivers =
  HosLogsSummaryResponseDrivers
  { hosLogsSummaryResponseDriversTimeUntilBreak = Nothing
  , hosLogsSummaryResponseDriversVehicleName = Nothing
  , hosLogsSummaryResponseDriversDrivingInViolationToday = Nothing
  , hosLogsSummaryResponseDriversDriverId = Nothing
  , hosLogsSummaryResponseDriversCycleRemaining = Nothing
  , hosLogsSummaryResponseDriversDriverName = Nothing
  , hosLogsSummaryResponseDriversDutyStatus = Nothing
  , hosLogsSummaryResponseDriversCycleTomorrow = Nothing
  , hosLogsSummaryResponseDriversShiftDriveRemaining = Nothing
  , hosLogsSummaryResponseDriversTimeInCurrentStatus = Nothing
  , hosLogsSummaryResponseDriversDrivingInViolationCycle = Nothing
  , hosLogsSummaryResponseDriversShiftRemaining = Nothing
  }

-- ** HumidityResponse
-- | HumidityResponse
-- Contains the current humidity of a sensor.
data HumidityResponse = HumidityResponse
  { humidityResponseGroupId :: !(Maybe Integer) -- ^ "groupId"
  , humidityResponseSensors :: !(Maybe [HumidityResponseSensors]) -- ^ "sensors"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON HumidityResponse
instance A.FromJSON HumidityResponse where
  parseJSON = A.withObject "HumidityResponse" $ \o ->
    HumidityResponse
      <$> (o .:? "groupId")
      <*> (o .:? "sensors")

-- | ToJSON HumidityResponse
instance A.ToJSON HumidityResponse where
  toJSON HumidityResponse {..} =
   _omitNulls
      [ "groupId" .= humidityResponseGroupId
      , "sensors" .= humidityResponseSensors
      ]


-- | Construct a value of type 'HumidityResponse' (by applying it's required fields, if any)
mkHumidityResponse
  :: HumidityResponse
mkHumidityResponse =
  HumidityResponse
  { humidityResponseGroupId = Nothing
  , humidityResponseSensors = Nothing
  }

-- ** HumidityResponseSensors
-- | HumidityResponseSensors
data HumidityResponseSensors = HumidityResponseSensors
  { humidityResponseSensorsName :: !(Maybe Text) -- ^ "name" - Name of the sensor.
  , humidityResponseSensorsHumidity :: !(Maybe Int) -- ^ "humidity" - Currently reported relative humidity in percent, from 0-100.
  , humidityResponseSensorsId :: !(Maybe Integer) -- ^ "id" - ID of the sensor.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON HumidityResponseSensors
instance A.FromJSON HumidityResponseSensors where
  parseJSON = A.withObject "HumidityResponseSensors" $ \o ->
    HumidityResponseSensors
      <$> (o .:? "name")
      <*> (o .:? "humidity")
      <*> (o .:? "id")

-- | ToJSON HumidityResponseSensors
instance A.ToJSON HumidityResponseSensors where
  toJSON HumidityResponseSensors {..} =
   _omitNulls
      [ "name" .= humidityResponseSensorsName
      , "humidity" .= humidityResponseSensorsHumidity
      , "id" .= humidityResponseSensorsId
      ]


-- | Construct a value of type 'HumidityResponseSensors' (by applying it's required fields, if any)
mkHumidityResponseSensors
  :: HumidityResponseSensors
mkHumidityResponseSensors =
  HumidityResponseSensors
  { humidityResponseSensorsName = Nothing
  , humidityResponseSensorsHumidity = Nothing
  , humidityResponseSensorsId = Nothing
  }

-- ** InlineObject
-- | InlineObject
data InlineObject = InlineObject
  { inlineObjectAddresses :: !([AddressesAddresses]) -- ^ /Required/ "addresses"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject
instance A.FromJSON InlineObject where
  parseJSON = A.withObject "InlineObject" $ \o ->
    InlineObject
      <$> (o .:  "addresses")

-- | ToJSON InlineObject
instance A.ToJSON InlineObject where
  toJSON InlineObject {..} =
   _omitNulls
      [ "addresses" .= inlineObjectAddresses
      ]


-- | Construct a value of type 'InlineObject' (by applying it's required fields, if any)
mkInlineObject
  :: [AddressesAddresses] -- ^ 'inlineObjectAddresses' 
  -> InlineObject
mkInlineObject inlineObjectAddresses =
  InlineObject
  { inlineObjectAddresses
  }

-- ** InlineObject1
-- | InlineObject1
data InlineObject1 = InlineObject1
  { inlineObject1ContactIds :: !(Maybe [Integer]) -- ^ "contactIds" - A list of IDs for contact book entries.
  , inlineObject1FormattedAddress :: !(Maybe Text) -- ^ "formattedAddress" - The full address associated with this address/geofence, as it might be recognized by maps.google.com
  , inlineObject1Geofence :: !(Maybe AddressGeofence) -- ^ "geofence"
  , inlineObject1Name :: !(Maybe Text) -- ^ "name" - The name of this address/geofence
  , inlineObject1Notes :: !(Maybe Text) -- ^ "notes" - Notes associated with an address.
  , inlineObject1TagIds :: !(Maybe [Integer]) -- ^ "tagIds" - A list of tag IDs.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject1
instance A.FromJSON InlineObject1 where
  parseJSON = A.withObject "InlineObject1" $ \o ->
    InlineObject1
      <$> (o .:? "contactIds")
      <*> (o .:? "formattedAddress")
      <*> (o .:? "geofence")
      <*> (o .:? "name")
      <*> (o .:? "notes")
      <*> (o .:? "tagIds")

-- | ToJSON InlineObject1
instance A.ToJSON InlineObject1 where
  toJSON InlineObject1 {..} =
   _omitNulls
      [ "contactIds" .= inlineObject1ContactIds
      , "formattedAddress" .= inlineObject1FormattedAddress
      , "geofence" .= inlineObject1Geofence
      , "name" .= inlineObject1Name
      , "notes" .= inlineObject1Notes
      , "tagIds" .= inlineObject1TagIds
      ]


-- | Construct a value of type 'InlineObject1' (by applying it's required fields, if any)
mkInlineObject1
  :: InlineObject1
mkInlineObject1 =
  InlineObject1
  { inlineObject1ContactIds = Nothing
  , inlineObject1FormattedAddress = Nothing
  , inlineObject1Geofence = Nothing
  , inlineObject1Name = Nothing
  , inlineObject1Notes = Nothing
  , inlineObject1TagIds = Nothing
  }

-- ** InlineObject10
-- | InlineObject10
data InlineObject10 = InlineObject10
  { inlineObject10GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject10
instance A.FromJSON InlineObject10 where
  parseJSON = A.withObject "InlineObject10" $ \o ->
    InlineObject10
      <$> (o .:  "groupId")

-- | ToJSON InlineObject10
instance A.ToJSON InlineObject10 where
  toJSON InlineObject10 {..} =
   _omitNulls
      [ "groupId" .= inlineObject10GroupId
      ]


-- | Construct a value of type 'InlineObject10' (by applying it's required fields, if any)
mkInlineObject10
  :: Integer -- ^ 'inlineObject10GroupId': Group ID to query.
  -> InlineObject10
mkInlineObject10 inlineObject10GroupId =
  InlineObject10
  { inlineObject10GroupId
  }

-- ** InlineObject11
-- | InlineObject11
data InlineObject11 = InlineObject11
  { inlineObject11GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject11
instance A.FromJSON InlineObject11 where
  parseJSON = A.withObject "InlineObject11" $ \o ->
    InlineObject11
      <$> (o .:  "groupId")

-- | ToJSON InlineObject11
instance A.ToJSON InlineObject11 where
  toJSON InlineObject11 {..} =
   _omitNulls
      [ "groupId" .= inlineObject11GroupId
      ]


-- | Construct a value of type 'InlineObject11' (by applying it's required fields, if any)
mkInlineObject11
  :: Integer -- ^ 'inlineObject11GroupId': Group ID to query.
  -> InlineObject11
mkInlineObject11 inlineObject11GroupId =
  InlineObject11
  { inlineObject11GroupId
  }

-- ** InlineObject12
-- | InlineObject12
data InlineObject12 = InlineObject12
  { inlineObject12InspectionType :: !(E'InspectionType) -- ^ /Required/ "inspectionType" - Only type &#39;mechanic&#39; is currently accepted.
  , inlineObject12MechanicNotes :: !(Maybe Text) -- ^ "mechanicNotes" - Any notes from the mechanic.
  , inlineObject12OdometerMiles :: !(Maybe Int) -- ^ "odometerMiles" - The current odometer of the vehicle.
  , inlineObject12PreviousDefectsCorrected :: !(Maybe Bool) -- ^ "previousDefectsCorrected" - Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
  , inlineObject12PreviousDefectsIgnored :: !(Maybe Bool) -- ^ "previousDefectsIgnored" - Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
  , inlineObject12Safe :: !(E'Safe) -- ^ /Required/ "safe" - Whether or not this vehicle or trailer is safe to drive.
  , inlineObject12TrailerId :: !(Maybe Int) -- ^ "trailerId" - Id of trailer being inspected. Either vehicleId or trailerId must be provided.
  , inlineObject12UserEmail :: !(Text) -- ^ /Required/ "userEmail" - The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email.
  , inlineObject12VehicleId :: !(Maybe Int) -- ^ "vehicleId" - Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject12
instance A.FromJSON InlineObject12 where
  parseJSON = A.withObject "InlineObject12" $ \o ->
    InlineObject12
      <$> (o .:  "inspectionType")
      <*> (o .:? "mechanicNotes")
      <*> (o .:? "odometerMiles")
      <*> (o .:? "previousDefectsCorrected")
      <*> (o .:? "previousDefectsIgnored")
      <*> (o .:  "safe")
      <*> (o .:? "trailerId")
      <*> (o .:  "userEmail")
      <*> (o .:? "vehicleId")

-- | ToJSON InlineObject12
instance A.ToJSON InlineObject12 where
  toJSON InlineObject12 {..} =
   _omitNulls
      [ "inspectionType" .= inlineObject12InspectionType
      , "mechanicNotes" .= inlineObject12MechanicNotes
      , "odometerMiles" .= inlineObject12OdometerMiles
      , "previousDefectsCorrected" .= inlineObject12PreviousDefectsCorrected
      , "previousDefectsIgnored" .= inlineObject12PreviousDefectsIgnored
      , "safe" .= inlineObject12Safe
      , "trailerId" .= inlineObject12TrailerId
      , "userEmail" .= inlineObject12UserEmail
      , "vehicleId" .= inlineObject12VehicleId
      ]


-- | Construct a value of type 'InlineObject12' (by applying it's required fields, if any)
mkInlineObject12
  :: E'InspectionType -- ^ 'inlineObject12InspectionType': Only type 'mechanic' is currently accepted.
  -> E'Safe -- ^ 'inlineObject12Safe': Whether or not this vehicle or trailer is safe to drive.
  -> Text -- ^ 'inlineObject12UserEmail': The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
  -> InlineObject12
mkInlineObject12 inlineObject12InspectionType inlineObject12Safe inlineObject12UserEmail =
  InlineObject12
  { inlineObject12InspectionType
  , inlineObject12MechanicNotes = Nothing
  , inlineObject12OdometerMiles = Nothing
  , inlineObject12PreviousDefectsCorrected = Nothing
  , inlineObject12PreviousDefectsIgnored = Nothing
  , inlineObject12Safe
  , inlineObject12TrailerId = Nothing
  , inlineObject12UserEmail
  , inlineObject12VehicleId = Nothing
  }

-- ** InlineObject13
-- | InlineObject13
data InlineObject13 = InlineObject13
  { inlineObject13GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject13
instance A.FromJSON InlineObject13 where
  parseJSON = A.withObject "InlineObject13" $ \o ->
    InlineObject13
      <$> (o .:  "groupId")

-- | ToJSON InlineObject13
instance A.ToJSON InlineObject13 where
  toJSON InlineObject13 {..} =
   _omitNulls
      [ "groupId" .= inlineObject13GroupId
      ]


-- | Construct a value of type 'InlineObject13' (by applying it's required fields, if any)
mkInlineObject13
  :: Integer -- ^ 'inlineObject13GroupId': Group ID to query.
  -> InlineObject13
mkInlineObject13 inlineObject13GroupId =
  InlineObject13
  { inlineObject13GroupId
  }

-- ** InlineObject14
-- | InlineObject14
data InlineObject14 = InlineObject14
  { inlineObject14GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  , inlineObject14Vehicles :: !([Vehicle]) -- ^ /Required/ "vehicles"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject14
instance A.FromJSON InlineObject14 where
  parseJSON = A.withObject "InlineObject14" $ \o ->
    InlineObject14
      <$> (o .:  "groupId")
      <*> (o .:  "vehicles")

-- | ToJSON InlineObject14
instance A.ToJSON InlineObject14 where
  toJSON InlineObject14 {..} =
   _omitNulls
      [ "groupId" .= inlineObject14GroupId
      , "vehicles" .= inlineObject14Vehicles
      ]


-- | Construct a value of type 'InlineObject14' (by applying it's required fields, if any)
mkInlineObject14
  :: Integer -- ^ 'inlineObject14GroupId': Group ID to query.
  -> [Vehicle] -- ^ 'inlineObject14Vehicles' 
  -> InlineObject14
mkInlineObject14 inlineObject14GroupId inlineObject14Vehicles =
  InlineObject14
  { inlineObject14GroupId
  , inlineObject14Vehicles
  }

-- ** InlineObject15
-- | InlineObject15
data InlineObject15 = InlineObject15
  { inlineObject15EndMs :: !(Int) -- ^ /Required/ "endMs" - End of the time range, specified in milliseconds UNIX time.
  , inlineObject15GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  , inlineObject15StartMs :: !(Int) -- ^ /Required/ "startMs" - Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
  , inlineObject15VehicleId :: !(Integer) -- ^ /Required/ "vehicleId" - Vehicle ID to query.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject15
instance A.FromJSON InlineObject15 where
  parseJSON = A.withObject "InlineObject15" $ \o ->
    InlineObject15
      <$> (o .:  "endMs")
      <*> (o .:  "groupId")
      <*> (o .:  "startMs")
      <*> (o .:  "vehicleId")

-- | ToJSON InlineObject15
instance A.ToJSON InlineObject15 where
  toJSON InlineObject15 {..} =
   _omitNulls
      [ "endMs" .= inlineObject15EndMs
      , "groupId" .= inlineObject15GroupId
      , "startMs" .= inlineObject15StartMs
      , "vehicleId" .= inlineObject15VehicleId
      ]


-- | Construct a value of type 'InlineObject15' (by applying it's required fields, if any)
mkInlineObject15
  :: Int -- ^ 'inlineObject15EndMs': End of the time range, specified in milliseconds UNIX time.
  -> Integer -- ^ 'inlineObject15GroupId': Group ID to query.
  -> Int -- ^ 'inlineObject15StartMs': Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
  -> Integer -- ^ 'inlineObject15VehicleId': Vehicle ID to query.
  -> InlineObject15
mkInlineObject15 inlineObject15EndMs inlineObject15GroupId inlineObject15StartMs inlineObject15VehicleId =
  InlineObject15
  { inlineObject15EndMs
  , inlineObject15GroupId
  , inlineObject15StartMs
  , inlineObject15VehicleId
  }

-- ** InlineObject16
-- | InlineObject16
data InlineObject16 = InlineObject16
  { inlineObject16ExternalIds :: !(Maybe (Map.Map String Text)) -- ^ "externalIds"
  , inlineObject16HarshAccelSetting :: !(Maybe Int) -- ^ "harsh_accel_setting" - Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
  , inlineObject16Name :: !(Maybe Text) -- ^ "name" - Name
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject16
instance A.FromJSON InlineObject16 where
  parseJSON = A.withObject "InlineObject16" $ \o ->
    InlineObject16
      <$> (o .:? "externalIds")
      <*> (o .:? "harsh_accel_setting")
      <*> (o .:? "name")

-- | ToJSON InlineObject16
instance A.ToJSON InlineObject16 where
  toJSON InlineObject16 {..} =
   _omitNulls
      [ "externalIds" .= inlineObject16ExternalIds
      , "harsh_accel_setting" .= inlineObject16HarshAccelSetting
      , "name" .= inlineObject16Name
      ]


-- | Construct a value of type 'InlineObject16' (by applying it's required fields, if any)
mkInlineObject16
  :: InlineObject16
mkInlineObject16 =
  InlineObject16
  { inlineObject16ExternalIds = Nothing
  , inlineObject16HarshAccelSetting = Nothing
  , inlineObject16Name = Nothing
  }

-- ** InlineObject17
-- | InlineObject17
data InlineObject17 = InlineObject17
  { inlineObject17EndMs :: !(Int) -- ^ /Required/ "endMs" - End of the time range, specified in milliseconds UNIX time.
  , inlineObject17GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  , inlineObject17StartMs :: !(Int) -- ^ /Required/ "startMs" - Beginning of the time range, specified in milliseconds UNIX time.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject17
instance A.FromJSON InlineObject17 where
  parseJSON = A.withObject "InlineObject17" $ \o ->
    InlineObject17
      <$> (o .:  "endMs")
      <*> (o .:  "groupId")
      <*> (o .:  "startMs")

-- | ToJSON InlineObject17
instance A.ToJSON InlineObject17 where
  toJSON InlineObject17 {..} =
   _omitNulls
      [ "endMs" .= inlineObject17EndMs
      , "groupId" .= inlineObject17GroupId
      , "startMs" .= inlineObject17StartMs
      ]


-- | Construct a value of type 'InlineObject17' (by applying it's required fields, if any)
mkInlineObject17
  :: Int -- ^ 'inlineObject17EndMs': End of the time range, specified in milliseconds UNIX time.
  -> Integer -- ^ 'inlineObject17GroupId': Group ID to query.
  -> Int -- ^ 'inlineObject17StartMs': Beginning of the time range, specified in milliseconds UNIX time.
  -> InlineObject17
mkInlineObject17 inlineObject17EndMs inlineObject17GroupId inlineObject17StartMs =
  InlineObject17
  { inlineObject17EndMs
  , inlineObject17GroupId
  , inlineObject17StartMs
  }

-- ** InlineObject18
-- | InlineObject18
data InlineObject18 = InlineObject18
  { inlineObject18GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject18
instance A.FromJSON InlineObject18 where
  parseJSON = A.withObject "InlineObject18" $ \o ->
    InlineObject18
      <$> (o .:  "groupId")

-- | ToJSON InlineObject18
instance A.ToJSON InlineObject18 where
  toJSON InlineObject18 {..} =
   _omitNulls
      [ "groupId" .= inlineObject18GroupId
      ]


-- | Construct a value of type 'InlineObject18' (by applying it's required fields, if any)
mkInlineObject18
  :: Integer -- ^ 'inlineObject18GroupId': Group ID to query.
  -> InlineObject18
mkInlineObject18 inlineObject18GroupId =
  InlineObject18
  { inlineObject18GroupId
  }

-- ** InlineObject19
-- | InlineObject19
data InlineObject19 = InlineObject19
  { inlineObject19GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  , inlineObject19Sensors :: !([Integer]) -- ^ /Required/ "sensors" - List of sensor IDs to query.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject19
instance A.FromJSON InlineObject19 where
  parseJSON = A.withObject "InlineObject19" $ \o ->
    InlineObject19
      <$> (o .:  "groupId")
      <*> (o .:  "sensors")

-- | ToJSON InlineObject19
instance A.ToJSON InlineObject19 where
  toJSON InlineObject19 {..} =
   _omitNulls
      [ "groupId" .= inlineObject19GroupId
      , "sensors" .= inlineObject19Sensors
      ]


-- | Construct a value of type 'InlineObject19' (by applying it's required fields, if any)
mkInlineObject19
  :: Integer -- ^ 'inlineObject19GroupId': Group ID to query.
  -> [Integer] -- ^ 'inlineObject19Sensors': List of sensor IDs to query.
  -> InlineObject19
mkInlineObject19 inlineObject19GroupId inlineObject19Sensors =
  InlineObject19
  { inlineObject19GroupId
  , inlineObject19Sensors
  }

-- ** InlineObject2
-- | InlineObject2
data InlineObject2 = InlineObject2
  { inlineObject2Address :: !(Text) -- ^ /Required/ "address" - The address of the entry to add, as it would be recognized if provided to maps.google.com.
  , inlineObject2GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  , inlineObject2Name :: !(Text) -- ^ /Required/ "name" - Name of the location to add to the address book.
  , inlineObject2Radius :: !(Int) -- ^ /Required/ "radius" - Radius in meters of the address (used for matching vehicle trip stops to this location).
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject2
instance A.FromJSON InlineObject2 where
  parseJSON = A.withObject "InlineObject2" $ \o ->
    InlineObject2
      <$> (o .:  "address")
      <*> (o .:  "groupId")
      <*> (o .:  "name")
      <*> (o .:  "radius")

-- | ToJSON InlineObject2
instance A.ToJSON InlineObject2 where
  toJSON InlineObject2 {..} =
   _omitNulls
      [ "address" .= inlineObject2Address
      , "groupId" .= inlineObject2GroupId
      , "name" .= inlineObject2Name
      , "radius" .= inlineObject2Radius
      ]


-- | Construct a value of type 'InlineObject2' (by applying it's required fields, if any)
mkInlineObject2
  :: Text -- ^ 'inlineObject2Address': The address of the entry to add, as it would be recognized if provided to maps.google.com.
  -> Integer -- ^ 'inlineObject2GroupId': Group ID to query.
  -> Text -- ^ 'inlineObject2Name': Name of the location to add to the address book.
  -> Int -- ^ 'inlineObject2Radius': Radius in meters of the address (used for matching vehicle trip stops to this location).
  -> InlineObject2
mkInlineObject2 inlineObject2Address inlineObject2GroupId inlineObject2Name inlineObject2Radius =
  InlineObject2
  { inlineObject2Address
  , inlineObject2GroupId
  , inlineObject2Name
  , inlineObject2Radius
  }

-- ** InlineObject20
-- | InlineObject20
data InlineObject20 = InlineObject20
  { inlineObject20GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  , inlineObject20Sensors :: !([Integer]) -- ^ /Required/ "sensors" - List of sensor IDs to query.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject20
instance A.FromJSON InlineObject20 where
  parseJSON = A.withObject "InlineObject20" $ \o ->
    InlineObject20
      <$> (o .:  "groupId")
      <*> (o .:  "sensors")

-- | ToJSON InlineObject20
instance A.ToJSON InlineObject20 where
  toJSON InlineObject20 {..} =
   _omitNulls
      [ "groupId" .= inlineObject20GroupId
      , "sensors" .= inlineObject20Sensors
      ]


-- | Construct a value of type 'InlineObject20' (by applying it's required fields, if any)
mkInlineObject20
  :: Integer -- ^ 'inlineObject20GroupId': Group ID to query.
  -> [Integer] -- ^ 'inlineObject20Sensors': List of sensor IDs to query.
  -> InlineObject20
mkInlineObject20 inlineObject20GroupId inlineObject20Sensors =
  InlineObject20
  { inlineObject20GroupId
  , inlineObject20Sensors
  }

-- ** InlineObject21
-- | InlineObject21
data InlineObject21 = InlineObject21
  { inlineObject21EndMs :: !(Int) -- ^ /Required/ "endMs" - End of the time range, specified in milliseconds UNIX time.
  , inlineObject21FillMissing :: !(Maybe E'FillMissing) -- ^ "fillMissing"
  , inlineObject21GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  , inlineObject21Series :: !([SensorsHistorySeries]) -- ^ /Required/ "series"
  , inlineObject21StartMs :: !(Int) -- ^ /Required/ "startMs" - Beginning of the time range, specified in milliseconds UNIX time.
  , inlineObject21StepMs :: !(Int) -- ^ /Required/ "stepMs" - Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject21
instance A.FromJSON InlineObject21 where
  parseJSON = A.withObject "InlineObject21" $ \o ->
    InlineObject21
      <$> (o .:  "endMs")
      <*> (o .:? "fillMissing")
      <*> (o .:  "groupId")
      <*> (o .:  "series")
      <*> (o .:  "startMs")
      <*> (o .:  "stepMs")

-- | ToJSON InlineObject21
instance A.ToJSON InlineObject21 where
  toJSON InlineObject21 {..} =
   _omitNulls
      [ "endMs" .= inlineObject21EndMs
      , "fillMissing" .= inlineObject21FillMissing
      , "groupId" .= inlineObject21GroupId
      , "series" .= inlineObject21Series
      , "startMs" .= inlineObject21StartMs
      , "stepMs" .= inlineObject21StepMs
      ]


-- | Construct a value of type 'InlineObject21' (by applying it's required fields, if any)
mkInlineObject21
  :: Int -- ^ 'inlineObject21EndMs': End of the time range, specified in milliseconds UNIX time.
  -> Integer -- ^ 'inlineObject21GroupId': Group ID to query.
  -> [SensorsHistorySeries] -- ^ 'inlineObject21Series' 
  -> Int -- ^ 'inlineObject21StartMs': Beginning of the time range, specified in milliseconds UNIX time.
  -> Int -- ^ 'inlineObject21StepMs': Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
  -> InlineObject21
mkInlineObject21 inlineObject21EndMs inlineObject21GroupId inlineObject21Series inlineObject21StartMs inlineObject21StepMs =
  InlineObject21
  { inlineObject21EndMs
  , inlineObject21FillMissing = Nothing
  , inlineObject21GroupId
  , inlineObject21Series
  , inlineObject21StartMs
  , inlineObject21StepMs
  }

-- ** InlineObject22
-- | InlineObject22
data InlineObject22 = InlineObject22
  { inlineObject22GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  , inlineObject22Sensors :: !([Integer]) -- ^ /Required/ "sensors" - List of sensor IDs to query.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject22
instance A.FromJSON InlineObject22 where
  parseJSON = A.withObject "InlineObject22" $ \o ->
    InlineObject22
      <$> (o .:  "groupId")
      <*> (o .:  "sensors")

-- | ToJSON InlineObject22
instance A.ToJSON InlineObject22 where
  toJSON InlineObject22 {..} =
   _omitNulls
      [ "groupId" .= inlineObject22GroupId
      , "sensors" .= inlineObject22Sensors
      ]


-- | Construct a value of type 'InlineObject22' (by applying it's required fields, if any)
mkInlineObject22
  :: Integer -- ^ 'inlineObject22GroupId': Group ID to query.
  -> [Integer] -- ^ 'inlineObject22Sensors': List of sensor IDs to query.
  -> InlineObject22
mkInlineObject22 inlineObject22GroupId inlineObject22Sensors =
  InlineObject22
  { inlineObject22GroupId
  , inlineObject22Sensors
  }

-- ** InlineObject23
-- | InlineObject23
data InlineObject23 = InlineObject23
  { inlineObject23GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject23
instance A.FromJSON InlineObject23 where
  parseJSON = A.withObject "InlineObject23" $ \o ->
    InlineObject23
      <$> (o .:  "groupId")

-- | ToJSON InlineObject23
instance A.ToJSON InlineObject23 where
  toJSON InlineObject23 {..} =
   _omitNulls
      [ "groupId" .= inlineObject23GroupId
      ]


-- | Construct a value of type 'InlineObject23' (by applying it's required fields, if any)
mkInlineObject23
  :: Integer -- ^ 'inlineObject23GroupId': Group ID to query.
  -> InlineObject23
mkInlineObject23 inlineObject23GroupId =
  InlineObject23
  { inlineObject23GroupId
  }

-- ** InlineObject24
-- | InlineObject24
data InlineObject24 = InlineObject24
  { inlineObject24GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  , inlineObject24Sensors :: !([Integer]) -- ^ /Required/ "sensors" - List of sensor IDs to query.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject24
instance A.FromJSON InlineObject24 where
  parseJSON = A.withObject "InlineObject24" $ \o ->
    InlineObject24
      <$> (o .:  "groupId")
      <*> (o .:  "sensors")

-- | ToJSON InlineObject24
instance A.ToJSON InlineObject24 where
  toJSON InlineObject24 {..} =
   _omitNulls
      [ "groupId" .= inlineObject24GroupId
      , "sensors" .= inlineObject24Sensors
      ]


-- | Construct a value of type 'InlineObject24' (by applying it's required fields, if any)
mkInlineObject24
  :: Integer -- ^ 'inlineObject24GroupId': Group ID to query.
  -> [Integer] -- ^ 'inlineObject24Sensors': List of sensor IDs to query.
  -> InlineObject24
mkInlineObject24 inlineObject24GroupId inlineObject24Sensors =
  InlineObject24
  { inlineObject24GroupId
  , inlineObject24Sensors
  }

-- ** InlineObject3
-- | InlineObject3
data InlineObject3 = InlineObject3
  { inlineObject3GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject3
instance A.FromJSON InlineObject3 where
  parseJSON = A.withObject "InlineObject3" $ \o ->
    InlineObject3
      <$> (o .:  "groupId")

-- | ToJSON InlineObject3
instance A.ToJSON InlineObject3 where
  toJSON InlineObject3 {..} =
   _omitNulls
      [ "groupId" .= inlineObject3GroupId
      ]


-- | Construct a value of type 'InlineObject3' (by applying it's required fields, if any)
mkInlineObject3
  :: Integer -- ^ 'inlineObject3GroupId': Group ID to query.
  -> InlineObject3
mkInlineObject3 inlineObject3GroupId =
  InlineObject3
  { inlineObject3GroupId
  }

-- ** InlineObject4
-- | InlineObject4
data InlineObject4 = InlineObject4
  { inlineObject4Reactivate :: !(Bool) -- ^ /Required/ "reactivate" - True indicates that this driver should be reactivated.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject4
instance A.FromJSON InlineObject4 where
  parseJSON = A.withObject "InlineObject4" $ \o ->
    InlineObject4
      <$> (o .:  "reactivate")

-- | ToJSON InlineObject4
instance A.ToJSON InlineObject4 where
  toJSON InlineObject4 {..} =
   _omitNulls
      [ "reactivate" .= inlineObject4Reactivate
      ]


-- | Construct a value of type 'InlineObject4' (by applying it's required fields, if any)
mkInlineObject4
  :: Bool -- ^ 'inlineObject4Reactivate': True indicates that this driver should be reactivated.
  -> InlineObject4
mkInlineObject4 inlineObject4Reactivate =
  InlineObject4
  { inlineObject4Reactivate
  }

-- ** InlineObject5
-- | InlineObject5
data InlineObject5 = InlineObject5
  { inlineObject5EndMs :: !(Integer) -- ^ /Required/ "endMs" - End time (ms) of queried time period.
  , inlineObject5OrgId :: !(Integer) -- ^ /Required/ "orgId" - Org ID to query.
  , inlineObject5StartMs :: !(Integer) -- ^ /Required/ "startMs" - Start time (ms) of queried time period.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject5
instance A.FromJSON InlineObject5 where
  parseJSON = A.withObject "InlineObject5" $ \o ->
    InlineObject5
      <$> (o .:  "endMs")
      <*> (o .:  "orgId")
      <*> (o .:  "startMs")

-- | ToJSON InlineObject5
instance A.ToJSON InlineObject5 where
  toJSON InlineObject5 {..} =
   _omitNulls
      [ "endMs" .= inlineObject5EndMs
      , "orgId" .= inlineObject5OrgId
      , "startMs" .= inlineObject5StartMs
      ]


-- | Construct a value of type 'InlineObject5' (by applying it's required fields, if any)
mkInlineObject5
  :: Integer -- ^ 'inlineObject5EndMs': End time (ms) of queried time period.
  -> Integer -- ^ 'inlineObject5OrgId': Org ID to query.
  -> Integer -- ^ 'inlineObject5StartMs': Start time (ms) of queried time period.
  -> InlineObject5
mkInlineObject5 inlineObject5EndMs inlineObject5OrgId inlineObject5StartMs =
  InlineObject5
  { inlineObject5EndMs
  , inlineObject5OrgId
  , inlineObject5StartMs
  }

-- ** InlineObject6
-- | InlineObject6
data InlineObject6 = InlineObject6
  { inlineObject6DriverId :: !(Integer) -- ^ /Required/ "driverId" - Driver ID to query.
  , inlineObject6EndMs :: !(Int) -- ^ /Required/ "endMs" - End of the time range, specified in milliseconds UNIX time.
  , inlineObject6GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  , inlineObject6StartMs :: !(Int) -- ^ /Required/ "startMs" - Beginning of the time range, specified in milliseconds UNIX time.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject6
instance A.FromJSON InlineObject6 where
  parseJSON = A.withObject "InlineObject6" $ \o ->
    InlineObject6
      <$> (o .:  "driverId")
      <*> (o .:  "endMs")
      <*> (o .:  "groupId")
      <*> (o .:  "startMs")

-- | ToJSON InlineObject6
instance A.ToJSON InlineObject6 where
  toJSON InlineObject6 {..} =
   _omitNulls
      [ "driverId" .= inlineObject6DriverId
      , "endMs" .= inlineObject6EndMs
      , "groupId" .= inlineObject6GroupId
      , "startMs" .= inlineObject6StartMs
      ]


-- | Construct a value of type 'InlineObject6' (by applying it's required fields, if any)
mkInlineObject6
  :: Integer -- ^ 'inlineObject6DriverId': Driver ID to query.
  -> Int -- ^ 'inlineObject6EndMs': End of the time range, specified in milliseconds UNIX time.
  -> Integer -- ^ 'inlineObject6GroupId': Group ID to query.
  -> Int -- ^ 'inlineObject6StartMs': Beginning of the time range, specified in milliseconds UNIX time.
  -> InlineObject6
mkInlineObject6 inlineObject6DriverId inlineObject6EndMs inlineObject6GroupId inlineObject6StartMs =
  InlineObject6
  { inlineObject6DriverId
  , inlineObject6EndMs
  , inlineObject6GroupId
  , inlineObject6StartMs
  }

-- ** InlineObject7
-- | InlineObject7
data InlineObject7 = InlineObject7
  { inlineObject7DriverId :: !(Integer) -- ^ /Required/ "driverId" - Driver ID to query.
  , inlineObject7EndMs :: !(Int) -- ^ /Required/ "endMs" - End of the time range, specified in milliseconds UNIX time.
  , inlineObject7GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  , inlineObject7StartMs :: !(Int) -- ^ /Required/ "startMs" - Beginning of the time range, specified in milliseconds UNIX time.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject7
instance A.FromJSON InlineObject7 where
  parseJSON = A.withObject "InlineObject7" $ \o ->
    InlineObject7
      <$> (o .:  "driverId")
      <*> (o .:  "endMs")
      <*> (o .:  "groupId")
      <*> (o .:  "startMs")

-- | ToJSON InlineObject7
instance A.ToJSON InlineObject7 where
  toJSON InlineObject7 {..} =
   _omitNulls
      [ "driverId" .= inlineObject7DriverId
      , "endMs" .= inlineObject7EndMs
      , "groupId" .= inlineObject7GroupId
      , "startMs" .= inlineObject7StartMs
      ]


-- | Construct a value of type 'InlineObject7' (by applying it's required fields, if any)
mkInlineObject7
  :: Integer -- ^ 'inlineObject7DriverId': Driver ID to query.
  -> Int -- ^ 'inlineObject7EndMs': End of the time range, specified in milliseconds UNIX time.
  -> Integer -- ^ 'inlineObject7GroupId': Group ID to query.
  -> Int -- ^ 'inlineObject7StartMs': Beginning of the time range, specified in milliseconds UNIX time.
  -> InlineObject7
mkInlineObject7 inlineObject7DriverId inlineObject7EndMs inlineObject7GroupId inlineObject7StartMs =
  InlineObject7
  { inlineObject7DriverId
  , inlineObject7EndMs
  , inlineObject7GroupId
  , inlineObject7StartMs
  }

-- ** InlineObject8
-- | InlineObject8
data InlineObject8 = InlineObject8
  { inlineObject8DriverId :: !(Integer) -- ^ /Required/ "driverId" - Driver ID to query.
  , inlineObject8EndMs :: !(Int) -- ^ /Required/ "endMs" - End of the time range, specified in milliseconds UNIX time.
  , inlineObject8GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  , inlineObject8StartMs :: !(Int) -- ^ /Required/ "startMs" - Beginning of the time range, specified in milliseconds UNIX time.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject8
instance A.FromJSON InlineObject8 where
  parseJSON = A.withObject "InlineObject8" $ \o ->
    InlineObject8
      <$> (o .:  "driverId")
      <*> (o .:  "endMs")
      <*> (o .:  "groupId")
      <*> (o .:  "startMs")

-- | ToJSON InlineObject8
instance A.ToJSON InlineObject8 where
  toJSON InlineObject8 {..} =
   _omitNulls
      [ "driverId" .= inlineObject8DriverId
      , "endMs" .= inlineObject8EndMs
      , "groupId" .= inlineObject8GroupId
      , "startMs" .= inlineObject8StartMs
      ]


-- | Construct a value of type 'InlineObject8' (by applying it's required fields, if any)
mkInlineObject8
  :: Integer -- ^ 'inlineObject8DriverId': Driver ID to query.
  -> Int -- ^ 'inlineObject8EndMs': End of the time range, specified in milliseconds UNIX time.
  -> Integer -- ^ 'inlineObject8GroupId': Group ID to query.
  -> Int -- ^ 'inlineObject8StartMs': Beginning of the time range, specified in milliseconds UNIX time.
  -> InlineObject8
mkInlineObject8 inlineObject8DriverId inlineObject8EndMs inlineObject8GroupId inlineObject8StartMs =
  InlineObject8
  { inlineObject8DriverId
  , inlineObject8EndMs
  , inlineObject8GroupId
  , inlineObject8StartMs
  }

-- ** InlineObject9
-- | InlineObject9
data InlineObject9 = InlineObject9
  { inlineObject9GroupId :: !(Integer) -- ^ /Required/ "groupId" - Group ID to query.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineObject9
instance A.FromJSON InlineObject9 where
  parseJSON = A.withObject "InlineObject9" $ \o ->
    InlineObject9
      <$> (o .:  "groupId")

-- | ToJSON InlineObject9
instance A.ToJSON InlineObject9 where
  toJSON InlineObject9 {..} =
   _omitNulls
      [ "groupId" .= inlineObject9GroupId
      ]


-- | Construct a value of type 'InlineObject9' (by applying it's required fields, if any)
mkInlineObject9
  :: Integer -- ^ 'inlineObject9GroupId': Group ID to query.
  -> InlineObject9
mkInlineObject9 inlineObject9GroupId =
  InlineObject9
  { inlineObject9GroupId
  }

-- ** InlineResponse200
-- | InlineResponse200
data InlineResponse200 = InlineResponse200
  { inlineResponse200Assets :: !(Maybe [Asset]) -- ^ "assets"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineResponse200
instance A.FromJSON InlineResponse200 where
  parseJSON = A.withObject "InlineResponse200" $ \o ->
    InlineResponse200
      <$> (o .:? "assets")

-- | ToJSON InlineResponse200
instance A.ToJSON InlineResponse200 where
  toJSON InlineResponse200 {..} =
   _omitNulls
      [ "assets" .= inlineResponse200Assets
      ]


-- | Construct a value of type 'InlineResponse200' (by applying it's required fields, if any)
mkInlineResponse200
  :: InlineResponse200
mkInlineResponse200 =
  InlineResponse200
  { inlineResponse200Assets = Nothing
  }

-- ** InlineResponse2001
-- | InlineResponse2001
data InlineResponse2001 = InlineResponse2001
  { inlineResponse2001Assets :: !(Maybe [AssetCurrentLocationsResponse]) -- ^ "assets"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineResponse2001
instance A.FromJSON InlineResponse2001 where
  parseJSON = A.withObject "InlineResponse2001" $ \o ->
    InlineResponse2001
      <$> (o .:? "assets")

-- | ToJSON InlineResponse2001
instance A.ToJSON InlineResponse2001 where
  toJSON InlineResponse2001 {..} =
   _omitNulls
      [ "assets" .= inlineResponse2001Assets
      ]


-- | Construct a value of type 'InlineResponse2001' (by applying it's required fields, if any)
mkInlineResponse2001
  :: InlineResponse2001
mkInlineResponse2001 =
  InlineResponse2001
  { inlineResponse2001Assets = Nothing
  }

-- ** InlineResponse2002
-- | InlineResponse2002
data InlineResponse2002 = InlineResponse2002
  { inlineResponse2002Pagination :: !(Maybe Pagination) -- ^ "pagination"
  , inlineResponse2002GroupId :: !(Maybe Integer) -- ^ "groupId" - Group ID to query.
  , inlineResponse2002Vehicles :: !(Maybe [Vehicle]) -- ^ "vehicles"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineResponse2002
instance A.FromJSON InlineResponse2002 where
  parseJSON = A.withObject "InlineResponse2002" $ \o ->
    InlineResponse2002
      <$> (o .:? "pagination")
      <*> (o .:? "groupId")
      <*> (o .:? "vehicles")

-- | ToJSON InlineResponse2002
instance A.ToJSON InlineResponse2002 where
  toJSON InlineResponse2002 {..} =
   _omitNulls
      [ "pagination" .= inlineResponse2002Pagination
      , "groupId" .= inlineResponse2002GroupId
      , "vehicles" .= inlineResponse2002Vehicles
      ]


-- | Construct a value of type 'InlineResponse2002' (by applying it's required fields, if any)
mkInlineResponse2002
  :: InlineResponse2002
mkInlineResponse2002 =
  InlineResponse2002
  { inlineResponse2002Pagination = Nothing
  , inlineResponse2002GroupId = Nothing
  , inlineResponse2002Vehicles = Nothing
  }

-- ** InlineResponse2003
-- | InlineResponse2003
data InlineResponse2003 = InlineResponse2003
  { inlineResponse2003GroupId :: !(Maybe Integer) -- ^ "groupId" - Group ID to query.
  , inlineResponse2003Vehicles :: !(Maybe [VehicleLocation]) -- ^ "vehicles"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineResponse2003
instance A.FromJSON InlineResponse2003 where
  parseJSON = A.withObject "InlineResponse2003" $ \o ->
    InlineResponse2003
      <$> (o .:? "groupId")
      <*> (o .:? "vehicles")

-- | ToJSON InlineResponse2003
instance A.ToJSON InlineResponse2003 where
  toJSON InlineResponse2003 {..} =
   _omitNulls
      [ "groupId" .= inlineResponse2003GroupId
      , "vehicles" .= inlineResponse2003Vehicles
      ]


-- | Construct a value of type 'InlineResponse2003' (by applying it's required fields, if any)
mkInlineResponse2003
  :: InlineResponse2003
mkInlineResponse2003 =
  InlineResponse2003
  { inlineResponse2003GroupId = Nothing
  , inlineResponse2003Vehicles = Nothing
  }

-- ** InlineResponse2004
-- | InlineResponse2004
data InlineResponse2004 = InlineResponse2004
  { inlineResponse2004Vehicles :: !(Maybe [VehicleMaintenance]) -- ^ "vehicles"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineResponse2004
instance A.FromJSON InlineResponse2004 where
  parseJSON = A.withObject "InlineResponse2004" $ \o ->
    InlineResponse2004
      <$> (o .:? "vehicles")

-- | ToJSON InlineResponse2004
instance A.ToJSON InlineResponse2004 where
  toJSON InlineResponse2004 {..} =
   _omitNulls
      [ "vehicles" .= inlineResponse2004Vehicles
      ]


-- | Construct a value of type 'InlineResponse2004' (by applying it's required fields, if any)
mkInlineResponse2004
  :: InlineResponse2004
mkInlineResponse2004 =
  InlineResponse2004
  { inlineResponse2004Vehicles = Nothing
  }

-- ** InlineResponse2005
-- | InlineResponse2005
data InlineResponse2005 = InlineResponse2005
  { inlineResponse2005Pagination :: !(Maybe Pagination) -- ^ "pagination"
  , inlineResponse2005VehicleStats :: !([InlineResponse2005VehicleStats]) -- ^ /Required/ "vehicleStats"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineResponse2005
instance A.FromJSON InlineResponse2005 where
  parseJSON = A.withObject "InlineResponse2005" $ \o ->
    InlineResponse2005
      <$> (o .:? "pagination")
      <*> (o .:  "vehicleStats")

-- | ToJSON InlineResponse2005
instance A.ToJSON InlineResponse2005 where
  toJSON InlineResponse2005 {..} =
   _omitNulls
      [ "pagination" .= inlineResponse2005Pagination
      , "vehicleStats" .= inlineResponse2005VehicleStats
      ]


-- | Construct a value of type 'InlineResponse2005' (by applying it's required fields, if any)
mkInlineResponse2005
  :: [InlineResponse2005VehicleStats] -- ^ 'inlineResponse2005VehicleStats' 
  -> InlineResponse2005
mkInlineResponse2005 inlineResponse2005VehicleStats =
  InlineResponse2005
  { inlineResponse2005Pagination = Nothing
  , inlineResponse2005VehicleStats
  }

-- ** InlineResponse2005VehicleStats
-- | InlineResponse2005VehicleStats
data InlineResponse2005VehicleStats = InlineResponse2005VehicleStats
  { inlineResponse2005VehicleStatsEngineState :: !(Maybe [EngineState]) -- ^ "engineState"
  , inlineResponse2005VehicleStatsAuxInput2 :: !(Maybe AuxInputSeries) -- ^ "auxInput2"
  , inlineResponse2005VehicleStatsVehicleId :: !(Integer) -- ^ /Required/ "vehicleId" - ID of the vehicle.
  , inlineResponse2005VehicleStatsAuxInput1 :: !(Maybe AuxInputSeries) -- ^ "auxInput1"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineResponse2005VehicleStats
instance A.FromJSON InlineResponse2005VehicleStats where
  parseJSON = A.withObject "InlineResponse2005VehicleStats" $ \o ->
    InlineResponse2005VehicleStats
      <$> (o .:? "engineState")
      <*> (o .:? "auxInput2")
      <*> (o .:  "vehicleId")
      <*> (o .:? "auxInput1")

-- | ToJSON InlineResponse2005VehicleStats
instance A.ToJSON InlineResponse2005VehicleStats where
  toJSON InlineResponse2005VehicleStats {..} =
   _omitNulls
      [ "engineState" .= inlineResponse2005VehicleStatsEngineState
      , "auxInput2" .= inlineResponse2005VehicleStatsAuxInput2
      , "vehicleId" .= inlineResponse2005VehicleStatsVehicleId
      , "auxInput1" .= inlineResponse2005VehicleStatsAuxInput1
      ]


-- | Construct a value of type 'InlineResponse2005VehicleStats' (by applying it's required fields, if any)
mkInlineResponse2005VehicleStats
  :: Integer -- ^ 'inlineResponse2005VehicleStatsVehicleId': ID of the vehicle.
  -> InlineResponse2005VehicleStats
mkInlineResponse2005VehicleStats inlineResponse2005VehicleStatsVehicleId =
  InlineResponse2005VehicleStats
  { inlineResponse2005VehicleStatsEngineState = Nothing
  , inlineResponse2005VehicleStatsAuxInput2 = Nothing
  , inlineResponse2005VehicleStatsVehicleId
  , inlineResponse2005VehicleStatsAuxInput1 = Nothing
  }

-- ** InlineResponse2006
-- | InlineResponse2006
data InlineResponse2006 = InlineResponse2006
  { inlineResponse2006DataInputs :: !(Maybe [DataInputHistoryResponse]) -- ^ "dataInputs"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineResponse2006
instance A.FromJSON InlineResponse2006 where
  parseJSON = A.withObject "InlineResponse2006" $ \o ->
    InlineResponse2006
      <$> (o .:? "dataInputs")

-- | ToJSON InlineResponse2006
instance A.ToJSON InlineResponse2006 where
  toJSON InlineResponse2006 {..} =
   _omitNulls
      [ "dataInputs" .= inlineResponse2006DataInputs
      ]


-- | Construct a value of type 'InlineResponse2006' (by applying it's required fields, if any)
mkInlineResponse2006
  :: InlineResponse2006
mkInlineResponse2006 =
  InlineResponse2006
  { inlineResponse2006DataInputs = Nothing
  }

-- ** InlineResponse2007
-- | InlineResponse2007
data InlineResponse2007 = InlineResponse2007
  { inlineResponse2007Machines :: !(Maybe [Machine]) -- ^ "machines"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineResponse2007
instance A.FromJSON InlineResponse2007 where
  parseJSON = A.withObject "InlineResponse2007" $ \o ->
    InlineResponse2007
      <$> (o .:? "machines")

-- | ToJSON InlineResponse2007
instance A.ToJSON InlineResponse2007 where
  toJSON InlineResponse2007 {..} =
   _omitNulls
      [ "machines" .= inlineResponse2007Machines
      ]


-- | Construct a value of type 'InlineResponse2007' (by applying it's required fields, if any)
mkInlineResponse2007
  :: InlineResponse2007
mkInlineResponse2007 =
  InlineResponse2007
  { inlineResponse2007Machines = Nothing
  }

-- ** InlineResponse2008
-- | InlineResponse2008
data InlineResponse2008 = InlineResponse2008
  { inlineResponse2008Sensors :: !(Maybe [Sensor]) -- ^ "sensors"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineResponse2008
instance A.FromJSON InlineResponse2008 where
  parseJSON = A.withObject "InlineResponse2008" $ \o ->
    InlineResponse2008
      <$> (o .:? "sensors")

-- | ToJSON InlineResponse2008
instance A.ToJSON InlineResponse2008 where
  toJSON InlineResponse2008 {..} =
   _omitNulls
      [ "sensors" .= inlineResponse2008Sensors
      ]


-- | Construct a value of type 'InlineResponse2008' (by applying it's required fields, if any)
mkInlineResponse2008
  :: InlineResponse2008
mkInlineResponse2008 =
  InlineResponse2008
  { inlineResponse2008Sensors = Nothing
  }

-- ** InlineResponse2009
-- | InlineResponse2009
data InlineResponse2009 = InlineResponse2009
  { inlineResponse2009Tags :: !(Maybe [Tag]) -- ^ "tags"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON InlineResponse2009
instance A.FromJSON InlineResponse2009 where
  parseJSON = A.withObject "InlineResponse2009" $ \o ->
    InlineResponse2009
      <$> (o .:? "tags")

-- | ToJSON InlineResponse2009
instance A.ToJSON InlineResponse2009 where
  toJSON InlineResponse2009 {..} =
   _omitNulls
      [ "tags" .= inlineResponse2009Tags
      ]


-- | Construct a value of type 'InlineResponse2009' (by applying it's required fields, if any)
mkInlineResponse2009
  :: InlineResponse2009
mkInlineResponse2009 =
  InlineResponse2009
  { inlineResponse2009Tags = Nothing
  }

-- ** JobUpdateObject
-- | JobUpdateObject
data JobUpdateObject = JobUpdateObject
  { jobUpdateObjectChangedAtMs :: !(Maybe Integer) -- ^ "changed_at_ms" - Timestamp that this event was updated, represented as Unix milliseconds since epoch.
  , jobUpdateObjectJobId :: !(Maybe Integer) -- ^ "job_id" - ID of the Samsara job.
  , jobUpdateObjectJobState :: !(Maybe JobStatus) -- ^ "job_state"
  , jobUpdateObjectPrevJobState :: !(Maybe PrevJobStatus) -- ^ "prev_job_state"
  , jobUpdateObjectRoute :: !(Maybe DispatchRoute) -- ^ "route"
  , jobUpdateObjectRouteId :: !(Maybe Integer) -- ^ "route_id" - ID of the Samsara dispatch route.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON JobUpdateObject
instance A.FromJSON JobUpdateObject where
  parseJSON = A.withObject "JobUpdateObject" $ \o ->
    JobUpdateObject
      <$> (o .:? "changed_at_ms")
      <*> (o .:? "job_id")
      <*> (o .:? "job_state")
      <*> (o .:? "prev_job_state")
      <*> (o .:? "route")
      <*> (o .:? "route_id")

-- | ToJSON JobUpdateObject
instance A.ToJSON JobUpdateObject where
  toJSON JobUpdateObject {..} =
   _omitNulls
      [ "changed_at_ms" .= jobUpdateObjectChangedAtMs
      , "job_id" .= jobUpdateObjectJobId
      , "job_state" .= jobUpdateObjectJobState
      , "prev_job_state" .= jobUpdateObjectPrevJobState
      , "route" .= jobUpdateObjectRoute
      , "route_id" .= jobUpdateObjectRouteId
      ]


-- | Construct a value of type 'JobUpdateObject' (by applying it's required fields, if any)
mkJobUpdateObject
  :: JobUpdateObject
mkJobUpdateObject =
  JobUpdateObject
  { jobUpdateObjectChangedAtMs = Nothing
  , jobUpdateObjectJobId = Nothing
  , jobUpdateObjectJobState = Nothing
  , jobUpdateObjectPrevJobState = Nothing
  , jobUpdateObjectRoute = Nothing
  , jobUpdateObjectRouteId = Nothing
  }

-- ** Machine
-- | Machine
-- Contains information about a machine.
data Machine = Machine
  { machineId :: !(Integer) -- ^ /Required/ "id" - ID of the machine.
  , machineName :: !(Maybe Text) -- ^ "name" - Name of the machine.
  , machineNotes :: !(Maybe Text) -- ^ "notes" - Notes about the machine
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON Machine
instance A.FromJSON Machine where
  parseJSON = A.withObject "Machine" $ \o ->
    Machine
      <$> (o .:  "id")
      <*> (o .:? "name")
      <*> (o .:? "notes")

-- | ToJSON Machine
instance A.ToJSON Machine where
  toJSON Machine {..} =
   _omitNulls
      [ "id" .= machineId
      , "name" .= machineName
      , "notes" .= machineNotes
      ]


-- | Construct a value of type 'Machine' (by applying it's required fields, if any)
mkMachine
  :: Integer -- ^ 'machineId': ID of the machine.
  -> Machine
mkMachine machineId =
  Machine
  { machineId
  , machineName = Nothing
  , machineNotes = Nothing
  }

-- ** MachineHistoryResponse
-- | MachineHistoryResponse
-- Contains the results for a machine history request
data MachineHistoryResponse = MachineHistoryResponse
  { machineHistoryResponseMachines :: !(Maybe [MachineHistoryResponseMachines]) -- ^ "machines"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON MachineHistoryResponse
instance A.FromJSON MachineHistoryResponse where
  parseJSON = A.withObject "MachineHistoryResponse" $ \o ->
    MachineHistoryResponse
      <$> (o .:? "machines")

-- | ToJSON MachineHistoryResponse
instance A.ToJSON MachineHistoryResponse where
  toJSON MachineHistoryResponse {..} =
   _omitNulls
      [ "machines" .= machineHistoryResponseMachines
      ]


-- | Construct a value of type 'MachineHistoryResponse' (by applying it's required fields, if any)
mkMachineHistoryResponse
  :: MachineHistoryResponse
mkMachineHistoryResponse =
  MachineHistoryResponse
  { machineHistoryResponseMachines = Nothing
  }

-- ** MachineHistoryResponseMachines
-- | MachineHistoryResponseMachines
data MachineHistoryResponseMachines = MachineHistoryResponseMachines
  { machineHistoryResponseMachinesName :: !(Maybe Text) -- ^ "name" - Machine name
  , machineHistoryResponseMachinesId :: !(Maybe Int) -- ^ "id" - Machine ID
  , machineHistoryResponseMachinesVibrations :: !(Maybe [MachineHistoryResponseVibrations]) -- ^ "vibrations" - List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON MachineHistoryResponseMachines
instance A.FromJSON MachineHistoryResponseMachines where
  parseJSON = A.withObject "MachineHistoryResponseMachines" $ \o ->
    MachineHistoryResponseMachines
      <$> (o .:? "name")
      <*> (o .:? "id")
      <*> (o .:? "vibrations")

-- | ToJSON MachineHistoryResponseMachines
instance A.ToJSON MachineHistoryResponseMachines where
  toJSON MachineHistoryResponseMachines {..} =
   _omitNulls
      [ "name" .= machineHistoryResponseMachinesName
      , "id" .= machineHistoryResponseMachinesId
      , "vibrations" .= machineHistoryResponseMachinesVibrations
      ]


-- | Construct a value of type 'MachineHistoryResponseMachines' (by applying it's required fields, if any)
mkMachineHistoryResponseMachines
  :: MachineHistoryResponseMachines
mkMachineHistoryResponseMachines =
  MachineHistoryResponseMachines
  { machineHistoryResponseMachinesName = Nothing
  , machineHistoryResponseMachinesId = Nothing
  , machineHistoryResponseMachinesVibrations = Nothing
  }

-- ** MachineHistoryResponseVibrations
-- | MachineHistoryResponseVibrations
data MachineHistoryResponseVibrations = MachineHistoryResponseVibrations
  { machineHistoryResponseVibrationsX :: !(Maybe Double) -- ^ "X"
  , machineHistoryResponseVibrationsY :: !(Maybe Double) -- ^ "Y"
  , machineHistoryResponseVibrationsZ :: !(Maybe Double) -- ^ "Z"
  , machineHistoryResponseVibrationsTime :: !(Maybe Integer) -- ^ "time"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON MachineHistoryResponseVibrations
instance A.FromJSON MachineHistoryResponseVibrations where
  parseJSON = A.withObject "MachineHistoryResponseVibrations" $ \o ->
    MachineHistoryResponseVibrations
      <$> (o .:? "X")
      <*> (o .:? "Y")
      <*> (o .:? "Z")
      <*> (o .:? "time")

-- | ToJSON MachineHistoryResponseVibrations
instance A.ToJSON MachineHistoryResponseVibrations where
  toJSON MachineHistoryResponseVibrations {..} =
   _omitNulls
      [ "X" .= machineHistoryResponseVibrationsX
      , "Y" .= machineHistoryResponseVibrationsY
      , "Z" .= machineHistoryResponseVibrationsZ
      , "time" .= machineHistoryResponseVibrationsTime
      ]


-- | Construct a value of type 'MachineHistoryResponseVibrations' (by applying it's required fields, if any)
mkMachineHistoryResponseVibrations
  :: MachineHistoryResponseVibrations
mkMachineHistoryResponseVibrations =
  MachineHistoryResponseVibrations
  { machineHistoryResponseVibrationsX = Nothing
  , machineHistoryResponseVibrationsY = Nothing
  , machineHistoryResponseVibrationsZ = Nothing
  , machineHistoryResponseVibrationsTime = Nothing
  }

-- ** Pagination
-- | Pagination
data Pagination = Pagination
  { paginationEndCursor :: !(Text) -- ^ /Required/ "endCursor" - Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;starting_after&#39; query parameter.
  , paginationHasNextPage :: !(Bool) -- ^ /Required/ "hasNextPage" - True if there are more pages of results after this response.
  , paginationHasPrevPage :: !(Bool) -- ^ /Required/ "hasPrevPage" - True if there are more pages of results before this response.
  , paginationStartCursor :: !(Text) -- ^ /Required/ "startCursor" - Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;ending_before&#39; query parameter.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON Pagination
instance A.FromJSON Pagination where
  parseJSON = A.withObject "Pagination" $ \o ->
    Pagination
      <$> (o .:  "endCursor")
      <*> (o .:  "hasNextPage")
      <*> (o .:  "hasPrevPage")
      <*> (o .:  "startCursor")

-- | ToJSON Pagination
instance A.ToJSON Pagination where
  toJSON Pagination {..} =
   _omitNulls
      [ "endCursor" .= paginationEndCursor
      , "hasNextPage" .= paginationHasNextPage
      , "hasPrevPage" .= paginationHasPrevPage
      , "startCursor" .= paginationStartCursor
      ]


-- | Construct a value of type 'Pagination' (by applying it's required fields, if any)
mkPagination
  :: Text -- ^ 'paginationEndCursor': Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.
  -> Bool -- ^ 'paginationHasNextPage': True if there are more pages of results after this response.
  -> Bool -- ^ 'paginationHasPrevPage': True if there are more pages of results before this response.
  -> Text -- ^ 'paginationStartCursor': Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.
  -> Pagination
mkPagination paginationEndCursor paginationHasNextPage paginationHasPrevPage paginationStartCursor =
  Pagination
  { paginationEndCursor
  , paginationHasNextPage
  , paginationHasPrevPage
  , paginationStartCursor
  }

-- ** SafetyReportHarshEvent
-- | SafetyReportHarshEvent
-- List of harsh events
data SafetyReportHarshEvent = SafetyReportHarshEvent
  { safetyReportHarshEventHarshEventType :: !(Maybe Text) -- ^ "harshEventType" - Type of the harsh event
  , safetyReportHarshEventTimestampMs :: !(Maybe Int) -- ^ "timestampMs" - Timestamp that the harsh event occurred in Unix milliseconds since epoch
  , safetyReportHarshEventVehicleId :: !(Maybe Int) -- ^ "vehicleId" - Vehicle associated with the harsh event
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON SafetyReportHarshEvent
instance A.FromJSON SafetyReportHarshEvent where
  parseJSON = A.withObject "SafetyReportHarshEvent" $ \o ->
    SafetyReportHarshEvent
      <$> (o .:? "harshEventType")
      <*> (o .:? "timestampMs")
      <*> (o .:? "vehicleId")

-- | ToJSON SafetyReportHarshEvent
instance A.ToJSON SafetyReportHarshEvent where
  toJSON SafetyReportHarshEvent {..} =
   _omitNulls
      [ "harshEventType" .= safetyReportHarshEventHarshEventType
      , "timestampMs" .= safetyReportHarshEventTimestampMs
      , "vehicleId" .= safetyReportHarshEventVehicleId
      ]


-- | Construct a value of type 'SafetyReportHarshEvent' (by applying it's required fields, if any)
mkSafetyReportHarshEvent
  :: SafetyReportHarshEvent
mkSafetyReportHarshEvent =
  SafetyReportHarshEvent
  { safetyReportHarshEventHarshEventType = Nothing
  , safetyReportHarshEventTimestampMs = Nothing
  , safetyReportHarshEventVehicleId = Nothing
  }

-- ** Sensor
-- | Sensor
-- Contains information about a sensor.
data Sensor = Sensor
  { sensorId :: !(Integer) -- ^ /Required/ "id" - ID of the sensor.
  , sensorMacAddress :: !(Maybe Text) -- ^ "macAddress" - MAC address of the sensor.
  , sensorName :: !(Maybe Text) -- ^ "name" - Name of the sensor.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON Sensor
instance A.FromJSON Sensor where
  parseJSON = A.withObject "Sensor" $ \o ->
    Sensor
      <$> (o .:  "id")
      <*> (o .:? "macAddress")
      <*> (o .:? "name")

-- | ToJSON Sensor
instance A.ToJSON Sensor where
  toJSON Sensor {..} =
   _omitNulls
      [ "id" .= sensorId
      , "macAddress" .= sensorMacAddress
      , "name" .= sensorName
      ]


-- | Construct a value of type 'Sensor' (by applying it's required fields, if any)
mkSensor
  :: Integer -- ^ 'sensorId': ID of the sensor.
  -> Sensor
mkSensor sensorId =
  Sensor
  { sensorId
  , sensorMacAddress = Nothing
  , sensorName = Nothing
  }

-- ** SensorHistoryResponse
-- | SensorHistoryResponse
-- Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
data SensorHistoryResponse = SensorHistoryResponse
  { sensorHistoryResponseResults :: !(Maybe [SensorHistoryResponseResults]) -- ^ "results"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON SensorHistoryResponse
instance A.FromJSON SensorHistoryResponse where
  parseJSON = A.withObject "SensorHistoryResponse" $ \o ->
    SensorHistoryResponse
      <$> (o .:? "results")

-- | ToJSON SensorHistoryResponse
instance A.ToJSON SensorHistoryResponse where
  toJSON SensorHistoryResponse {..} =
   _omitNulls
      [ "results" .= sensorHistoryResponseResults
      ]


-- | Construct a value of type 'SensorHistoryResponse' (by applying it's required fields, if any)
mkSensorHistoryResponse
  :: SensorHistoryResponse
mkSensorHistoryResponse =
  SensorHistoryResponse
  { sensorHistoryResponseResults = Nothing
  }

-- ** SensorHistoryResponseResults
-- | SensorHistoryResponseResults
data SensorHistoryResponseResults = SensorHistoryResponseResults
  { sensorHistoryResponseResultsSeries :: !(Maybe [Integer]) -- ^ "series" - List of datapoints, one for each requested (sensor, field) pair.
  , sensorHistoryResponseResultsTimeMs :: !(Maybe Int) -- ^ "timeMs" - Timestamp in UNIX milliseconds.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON SensorHistoryResponseResults
instance A.FromJSON SensorHistoryResponseResults where
  parseJSON = A.withObject "SensorHistoryResponseResults" $ \o ->
    SensorHistoryResponseResults
      <$> (o .:? "series")
      <*> (o .:? "timeMs")

-- | ToJSON SensorHistoryResponseResults
instance A.ToJSON SensorHistoryResponseResults where
  toJSON SensorHistoryResponseResults {..} =
   _omitNulls
      [ "series" .= sensorHistoryResponseResultsSeries
      , "timeMs" .= sensorHistoryResponseResultsTimeMs
      ]


-- | Construct a value of type 'SensorHistoryResponseResults' (by applying it's required fields, if any)
mkSensorHistoryResponseResults
  :: SensorHistoryResponseResults
mkSensorHistoryResponseResults =
  SensorHistoryResponseResults
  { sensorHistoryResponseResultsSeries = Nothing
  , sensorHistoryResponseResultsTimeMs = Nothing
  }

-- ** SensorsHistorySeries
-- | SensorsHistorySeries
-- Sensor ID and field to query.
data SensorsHistorySeries = SensorsHistorySeries
  { sensorsHistorySeriesField :: !(E'Field) -- ^ /Required/ "field" - Field to query.
  , sensorsHistorySeriesWidgetId :: !(Integer) -- ^ /Required/ "widgetId" - Sensor ID to query.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON SensorsHistorySeries
instance A.FromJSON SensorsHistorySeries where
  parseJSON = A.withObject "SensorsHistorySeries" $ \o ->
    SensorsHistorySeries
      <$> (o .:  "field")
      <*> (o .:  "widgetId")

-- | ToJSON SensorsHistorySeries
instance A.ToJSON SensorsHistorySeries where
  toJSON SensorsHistorySeries {..} =
   _omitNulls
      [ "field" .= sensorsHistorySeriesField
      , "widgetId" .= sensorsHistorySeriesWidgetId
      ]


-- | Construct a value of type 'SensorsHistorySeries' (by applying it's required fields, if any)
mkSensorsHistorySeries
  :: E'Field -- ^ 'sensorsHistorySeriesField': Field to query.
  -> Integer -- ^ 'sensorsHistorySeriesWidgetId': Sensor ID to query.
  -> SensorsHistorySeries
mkSensorsHistorySeries sensorsHistorySeriesField sensorsHistorySeriesWidgetId =
  SensorsHistorySeries
  { sensorsHistorySeriesField
  , sensorsHistorySeriesWidgetId
  }

-- ** Tag
-- | Tag
data Tag = Tag
  { tagAddresses :: !(Maybe [TaggedAddress]) -- ^ "addresses" - The addresses that belong to this tag.
  , tagAssets :: !(Maybe [TaggedAsset]) -- ^ "assets" - The assets that belong to this tag.
  , tagDrivers :: !(Maybe [TaggedDriver]) -- ^ "drivers" - The drivers that belong to this tag.
  , tagGroupId :: !(Maybe Integer) -- ^ "groupId" - The GroupID that this tag belongs to.
  , tagId :: !(Integer) -- ^ /Required/ "id" - The ID of this tag.
  , tagMachines :: !(Maybe [TaggedMachine]) -- ^ "machines" - The machines that belong to this tag.
  , tagName :: !(Text) -- ^ /Required/ "name" - Name of this tag.
  , tagParentTagId :: !(Maybe Integer) -- ^ "parentTagId" - If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.
  , tagSensors :: !(Maybe [TaggedSensor]) -- ^ "sensors" - The sensors that belong to this tag.
  , tagVehicles :: !(Maybe [TaggedVehicle]) -- ^ "vehicles" - The vehicles that belong to this tag.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON Tag
instance A.FromJSON Tag where
  parseJSON = A.withObject "Tag" $ \o ->
    Tag
      <$> (o .:? "addresses")
      <*> (o .:? "assets")
      <*> (o .:? "drivers")
      <*> (o .:? "groupId")
      <*> (o .:  "id")
      <*> (o .:? "machines")
      <*> (o .:  "name")
      <*> (o .:? "parentTagId")
      <*> (o .:? "sensors")
      <*> (o .:? "vehicles")

-- | ToJSON Tag
instance A.ToJSON Tag where
  toJSON Tag {..} =
   _omitNulls
      [ "addresses" .= tagAddresses
      , "assets" .= tagAssets
      , "drivers" .= tagDrivers
      , "groupId" .= tagGroupId
      , "id" .= tagId
      , "machines" .= tagMachines
      , "name" .= tagName
      , "parentTagId" .= tagParentTagId
      , "sensors" .= tagSensors
      , "vehicles" .= tagVehicles
      ]


-- | Construct a value of type 'Tag' (by applying it's required fields, if any)
mkTag
  :: Integer -- ^ 'tagId': The ID of this tag.
  -> Text -- ^ 'tagName': Name of this tag.
  -> Tag
mkTag tagId tagName =
  Tag
  { tagAddresses = Nothing
  , tagAssets = Nothing
  , tagDrivers = Nothing
  , tagGroupId = Nothing
  , tagId
  , tagMachines = Nothing
  , tagName
  , tagParentTagId = Nothing
  , tagSensors = Nothing
  , tagVehicles = Nothing
  }

-- ** TagCreate
-- | TagCreate
data TagCreate = TagCreate
  { tagCreateAssets :: !(Maybe [TaggedAssetBase]) -- ^ "assets" - The assets that belong to this tag.
  , tagCreateDrivers :: !(Maybe [TaggedDriverBase]) -- ^ "drivers" - The drivers that belong to this tag.
  , tagCreateMachines :: !(Maybe [TaggedMachineBase]) -- ^ "machines" - The machines that belong to this tag.
  , tagCreateName :: !(Text) -- ^ /Required/ "name" - Name of this tag.
  , tagCreateParentTagId :: !(Maybe Integer) -- ^ "parentTagId" - If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.
  , tagCreateSensors :: !(Maybe [TaggedSensorBase]) -- ^ "sensors" - The sensors that belong to this tag.
  , tagCreateVehicles :: !(Maybe [TaggedVehicleBase]) -- ^ "vehicles" - The vehicles that belong to this tag.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TagCreate
instance A.FromJSON TagCreate where
  parseJSON = A.withObject "TagCreate" $ \o ->
    TagCreate
      <$> (o .:? "assets")
      <*> (o .:? "drivers")
      <*> (o .:? "machines")
      <*> (o .:  "name")
      <*> (o .:? "parentTagId")
      <*> (o .:? "sensors")
      <*> (o .:? "vehicles")

-- | ToJSON TagCreate
instance A.ToJSON TagCreate where
  toJSON TagCreate {..} =
   _omitNulls
      [ "assets" .= tagCreateAssets
      , "drivers" .= tagCreateDrivers
      , "machines" .= tagCreateMachines
      , "name" .= tagCreateName
      , "parentTagId" .= tagCreateParentTagId
      , "sensors" .= tagCreateSensors
      , "vehicles" .= tagCreateVehicles
      ]


-- | Construct a value of type 'TagCreate' (by applying it's required fields, if any)
mkTagCreate
  :: Text -- ^ 'tagCreateName': Name of this tag.
  -> TagCreate
mkTagCreate tagCreateName =
  TagCreate
  { tagCreateAssets = Nothing
  , tagCreateDrivers = Nothing
  , tagCreateMachines = Nothing
  , tagCreateName
  , tagCreateParentTagId = Nothing
  , tagCreateSensors = Nothing
  , tagCreateVehicles = Nothing
  }

-- ** TagMetadata
-- | TagMetadata
data TagMetadata = TagMetadata
  { tagMetadataId :: !(Integer) -- ^ /Required/ "id" - The ID of this tag.
  , tagMetadataName :: !(Text) -- ^ /Required/ "name" - Name of this tag.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TagMetadata
instance A.FromJSON TagMetadata where
  parseJSON = A.withObject "TagMetadata" $ \o ->
    TagMetadata
      <$> (o .:  "id")
      <*> (o .:  "name")

-- | ToJSON TagMetadata
instance A.ToJSON TagMetadata where
  toJSON TagMetadata {..} =
   _omitNulls
      [ "id" .= tagMetadataId
      , "name" .= tagMetadataName
      ]


-- | Construct a value of type 'TagMetadata' (by applying it's required fields, if any)
mkTagMetadata
  :: Integer -- ^ 'tagMetadataId': The ID of this tag.
  -> Text -- ^ 'tagMetadataName': Name of this tag.
  -> TagMetadata
mkTagMetadata tagMetadataId tagMetadataName =
  TagMetadata
  { tagMetadataId
  , tagMetadataName
  }

-- ** TagModify
-- | TagModify
data TagModify = TagModify
  { tagModifyAdd :: !(Maybe TagModifyAdd) -- ^ "add"
  , tagModifyDelete :: !(Maybe TagModifyDelete) -- ^ "delete"
  , tagModifyName :: !(Maybe Text) -- ^ "name" - Updated name of this tag.
  , tagModifyParentTagId :: !(Maybe Integer) -- ^ "parentTagId" - If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TagModify
instance A.FromJSON TagModify where
  parseJSON = A.withObject "TagModify" $ \o ->
    TagModify
      <$> (o .:? "add")
      <*> (o .:? "delete")
      <*> (o .:? "name")
      <*> (o .:? "parentTagId")

-- | ToJSON TagModify
instance A.ToJSON TagModify where
  toJSON TagModify {..} =
   _omitNulls
      [ "add" .= tagModifyAdd
      , "delete" .= tagModifyDelete
      , "name" .= tagModifyName
      , "parentTagId" .= tagModifyParentTagId
      ]


-- | Construct a value of type 'TagModify' (by applying it's required fields, if any)
mkTagModify
  :: TagModify
mkTagModify =
  TagModify
  { tagModifyAdd = Nothing
  , tagModifyDelete = Nothing
  , tagModifyName = Nothing
  , tagModifyParentTagId = Nothing
  }

-- ** TagModifyAdd
-- | TagModifyAdd
-- Specify devices, etc. that should be added to the tag.
data TagModifyAdd = TagModifyAdd
  { tagModifyAddAssets :: !(Maybe [TaggedAssetBase]) -- ^ "assets" - The assets to be added to this tag.
  , tagModifyAddSensors :: !(Maybe [TaggedSensorBase]) -- ^ "sensors" - The sensors to be added to this tag.
  , tagModifyAddVehicles :: !(Maybe [TaggedVehicleBase]) -- ^ "vehicles" - The vehicles to be added to this tag.
  , tagModifyAddMachines :: !(Maybe [TaggedMachineBase]) -- ^ "machines" - The machines to be added to this tag.
  , tagModifyAddDrivers :: !(Maybe [TaggedDriverBase]) -- ^ "drivers" - The drivers to be added to this tag.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TagModifyAdd
instance A.FromJSON TagModifyAdd where
  parseJSON = A.withObject "TagModifyAdd" $ \o ->
    TagModifyAdd
      <$> (o .:? "assets")
      <*> (o .:? "sensors")
      <*> (o .:? "vehicles")
      <*> (o .:? "machines")
      <*> (o .:? "drivers")

-- | ToJSON TagModifyAdd
instance A.ToJSON TagModifyAdd where
  toJSON TagModifyAdd {..} =
   _omitNulls
      [ "assets" .= tagModifyAddAssets
      , "sensors" .= tagModifyAddSensors
      , "vehicles" .= tagModifyAddVehicles
      , "machines" .= tagModifyAddMachines
      , "drivers" .= tagModifyAddDrivers
      ]


-- | Construct a value of type 'TagModifyAdd' (by applying it's required fields, if any)
mkTagModifyAdd
  :: TagModifyAdd
mkTagModifyAdd =
  TagModifyAdd
  { tagModifyAddAssets = Nothing
  , tagModifyAddSensors = Nothing
  , tagModifyAddVehicles = Nothing
  , tagModifyAddMachines = Nothing
  , tagModifyAddDrivers = Nothing
  }

-- ** TagModifyDelete
-- | TagModifyDelete
-- Specify devices, etc. that should be removed from the tag.
data TagModifyDelete = TagModifyDelete
  { tagModifyDeleteAssets :: !(Maybe [TaggedAssetBase]) -- ^ "assets" - The assets to be removed from this tag.
  , tagModifyDeleteSensors :: !(Maybe [TaggedSensorBase]) -- ^ "sensors" - The sensors to be removed from this tag.
  , tagModifyDeleteVehicles :: !(Maybe [TaggedVehicleBase]) -- ^ "vehicles" - The vehicles to be removed from this tag.
  , tagModifyDeleteMachines :: !(Maybe [TaggedMachineBase]) -- ^ "machines" - The machines to be removed from this tag.
  , tagModifyDeleteDrivers :: !(Maybe [TaggedDriverBase]) -- ^ "drivers" - The drivers to be removed from this tag.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TagModifyDelete
instance A.FromJSON TagModifyDelete where
  parseJSON = A.withObject "TagModifyDelete" $ \o ->
    TagModifyDelete
      <$> (o .:? "assets")
      <*> (o .:? "sensors")
      <*> (o .:? "vehicles")
      <*> (o .:? "machines")
      <*> (o .:? "drivers")

-- | ToJSON TagModifyDelete
instance A.ToJSON TagModifyDelete where
  toJSON TagModifyDelete {..} =
   _omitNulls
      [ "assets" .= tagModifyDeleteAssets
      , "sensors" .= tagModifyDeleteSensors
      , "vehicles" .= tagModifyDeleteVehicles
      , "machines" .= tagModifyDeleteMachines
      , "drivers" .= tagModifyDeleteDrivers
      ]


-- | Construct a value of type 'TagModifyDelete' (by applying it's required fields, if any)
mkTagModifyDelete
  :: TagModifyDelete
mkTagModifyDelete =
  TagModifyDelete
  { tagModifyDeleteAssets = Nothing
  , tagModifyDeleteSensors = Nothing
  , tagModifyDeleteVehicles = Nothing
  , tagModifyDeleteMachines = Nothing
  , tagModifyDeleteDrivers = Nothing
  }

-- ** TagUpdate
-- | TagUpdate
data TagUpdate = TagUpdate
  { tagUpdateAssets :: !(Maybe [TaggedAssetBase]) -- ^ "assets" - The assets that belong to this tag.
  , tagUpdateDrivers :: !(Maybe [TaggedDriverBase]) -- ^ "drivers" - The drivers that belong to this tag.
  , tagUpdateMachines :: !(Maybe [TaggedMachineBase]) -- ^ "machines" - The machines that belong to this tag.
  , tagUpdateName :: !(Maybe Text) -- ^ "name" - Updated name of this tag.
  , tagUpdateParentTagId :: !(Maybe Integer) -- ^ "parentTagId" - If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.
  , tagUpdateSensors :: !(Maybe [TaggedSensorBase]) -- ^ "sensors" - The sensors that belong to this tag.
  , tagUpdateVehicles :: !(Maybe [TaggedVehicleBase]) -- ^ "vehicles" - The vehicles that belong to this tag.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TagUpdate
instance A.FromJSON TagUpdate where
  parseJSON = A.withObject "TagUpdate" $ \o ->
    TagUpdate
      <$> (o .:? "assets")
      <*> (o .:? "drivers")
      <*> (o .:? "machines")
      <*> (o .:? "name")
      <*> (o .:? "parentTagId")
      <*> (o .:? "sensors")
      <*> (o .:? "vehicles")

-- | ToJSON TagUpdate
instance A.ToJSON TagUpdate where
  toJSON TagUpdate {..} =
   _omitNulls
      [ "assets" .= tagUpdateAssets
      , "drivers" .= tagUpdateDrivers
      , "machines" .= tagUpdateMachines
      , "name" .= tagUpdateName
      , "parentTagId" .= tagUpdateParentTagId
      , "sensors" .= tagUpdateSensors
      , "vehicles" .= tagUpdateVehicles
      ]


-- | Construct a value of type 'TagUpdate' (by applying it's required fields, if any)
mkTagUpdate
  :: TagUpdate
mkTagUpdate =
  TagUpdate
  { tagUpdateAssets = Nothing
  , tagUpdateDrivers = Nothing
  , tagUpdateMachines = Nothing
  , tagUpdateName = Nothing
  , tagUpdateParentTagId = Nothing
  , tagUpdateSensors = Nothing
  , tagUpdateVehicles = Nothing
  }

-- ** TaggedAddress
-- | TaggedAddress
data TaggedAddress = TaggedAddress
  { taggedAddressId :: !(Integer) -- ^ /Required/ "id" - The ID of the address being tagged.
  , taggedAddressName :: !(Maybe Text) -- ^ "name" - Name of the address being tagged.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TaggedAddress
instance A.FromJSON TaggedAddress where
  parseJSON = A.withObject "TaggedAddress" $ \o ->
    TaggedAddress
      <$> (o .:  "id")
      <*> (o .:? "name")

-- | ToJSON TaggedAddress
instance A.ToJSON TaggedAddress where
  toJSON TaggedAddress {..} =
   _omitNulls
      [ "id" .= taggedAddressId
      , "name" .= taggedAddressName
      ]


-- | Construct a value of type 'TaggedAddress' (by applying it's required fields, if any)
mkTaggedAddress
  :: Integer -- ^ 'taggedAddressId': The ID of the address being tagged.
  -> TaggedAddress
mkTaggedAddress taggedAddressId =
  TaggedAddress
  { taggedAddressId
  , taggedAddressName = Nothing
  }

-- ** TaggedAddressBase
-- | TaggedAddressBase
data TaggedAddressBase = TaggedAddressBase
  { taggedAddressBaseId :: !(Integer) -- ^ /Required/ "id" - The ID of the address being tagged.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TaggedAddressBase
instance A.FromJSON TaggedAddressBase where
  parseJSON = A.withObject "TaggedAddressBase" $ \o ->
    TaggedAddressBase
      <$> (o .:  "id")

-- | ToJSON TaggedAddressBase
instance A.ToJSON TaggedAddressBase where
  toJSON TaggedAddressBase {..} =
   _omitNulls
      [ "id" .= taggedAddressBaseId
      ]


-- | Construct a value of type 'TaggedAddressBase' (by applying it's required fields, if any)
mkTaggedAddressBase
  :: Integer -- ^ 'taggedAddressBaseId': The ID of the address being tagged.
  -> TaggedAddressBase
mkTaggedAddressBase taggedAddressBaseId =
  TaggedAddressBase
  { taggedAddressBaseId
  }

-- ** TaggedAsset
-- | TaggedAsset
data TaggedAsset = TaggedAsset
  { taggedAssetId :: !(Integer) -- ^ /Required/ "id" - The ID of the Asset being tagged.
  , taggedAssetName :: !(Maybe Text) -- ^ "name" - Name of the Asset being tagged.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TaggedAsset
instance A.FromJSON TaggedAsset where
  parseJSON = A.withObject "TaggedAsset" $ \o ->
    TaggedAsset
      <$> (o .:  "id")
      <*> (o .:? "name")

-- | ToJSON TaggedAsset
instance A.ToJSON TaggedAsset where
  toJSON TaggedAsset {..} =
   _omitNulls
      [ "id" .= taggedAssetId
      , "name" .= taggedAssetName
      ]


-- | Construct a value of type 'TaggedAsset' (by applying it's required fields, if any)
mkTaggedAsset
  :: Integer -- ^ 'taggedAssetId': The ID of the Asset being tagged.
  -> TaggedAsset
mkTaggedAsset taggedAssetId =
  TaggedAsset
  { taggedAssetId
  , taggedAssetName = Nothing
  }

-- ** TaggedAssetBase
-- | TaggedAssetBase
data TaggedAssetBase = TaggedAssetBase
  { taggedAssetBaseId :: !(Integer) -- ^ /Required/ "id" - The ID of the Asset being tagged.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TaggedAssetBase
instance A.FromJSON TaggedAssetBase where
  parseJSON = A.withObject "TaggedAssetBase" $ \o ->
    TaggedAssetBase
      <$> (o .:  "id")

-- | ToJSON TaggedAssetBase
instance A.ToJSON TaggedAssetBase where
  toJSON TaggedAssetBase {..} =
   _omitNulls
      [ "id" .= taggedAssetBaseId
      ]


-- | Construct a value of type 'TaggedAssetBase' (by applying it's required fields, if any)
mkTaggedAssetBase
  :: Integer -- ^ 'taggedAssetBaseId': The ID of the Asset being tagged.
  -> TaggedAssetBase
mkTaggedAssetBase taggedAssetBaseId =
  TaggedAssetBase
  { taggedAssetBaseId
  }

-- ** TaggedDriver
-- | TaggedDriver
data TaggedDriver = TaggedDriver
  { taggedDriverId :: !(Integer) -- ^ /Required/ "id" - The ID of the Driver being tagged.
  , taggedDriverName :: !(Maybe Text) -- ^ "name" - Name of the Driver being tagged.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TaggedDriver
instance A.FromJSON TaggedDriver where
  parseJSON = A.withObject "TaggedDriver" $ \o ->
    TaggedDriver
      <$> (o .:  "id")
      <*> (o .:? "name")

-- | ToJSON TaggedDriver
instance A.ToJSON TaggedDriver where
  toJSON TaggedDriver {..} =
   _omitNulls
      [ "id" .= taggedDriverId
      , "name" .= taggedDriverName
      ]


-- | Construct a value of type 'TaggedDriver' (by applying it's required fields, if any)
mkTaggedDriver
  :: Integer -- ^ 'taggedDriverId': The ID of the Driver being tagged.
  -> TaggedDriver
mkTaggedDriver taggedDriverId =
  TaggedDriver
  { taggedDriverId
  , taggedDriverName = Nothing
  }

-- ** TaggedDriverBase
-- | TaggedDriverBase
data TaggedDriverBase = TaggedDriverBase
  { taggedDriverBaseId :: !(Integer) -- ^ /Required/ "id" - The ID of the Driver being tagged.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TaggedDriverBase
instance A.FromJSON TaggedDriverBase where
  parseJSON = A.withObject "TaggedDriverBase" $ \o ->
    TaggedDriverBase
      <$> (o .:  "id")

-- | ToJSON TaggedDriverBase
instance A.ToJSON TaggedDriverBase where
  toJSON TaggedDriverBase {..} =
   _omitNulls
      [ "id" .= taggedDriverBaseId
      ]


-- | Construct a value of type 'TaggedDriverBase' (by applying it's required fields, if any)
mkTaggedDriverBase
  :: Integer -- ^ 'taggedDriverBaseId': The ID of the Driver being tagged.
  -> TaggedDriverBase
mkTaggedDriverBase taggedDriverBaseId =
  TaggedDriverBase
  { taggedDriverBaseId
  }

-- ** TaggedMachine
-- | TaggedMachine
data TaggedMachine = TaggedMachine
  { taggedMachineId :: !(Integer) -- ^ /Required/ "id" - The ID of the Machine being tagged.
  , taggedMachineName :: !(Maybe Text) -- ^ "name" - Name of the Machine being tagged.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TaggedMachine
instance A.FromJSON TaggedMachine where
  parseJSON = A.withObject "TaggedMachine" $ \o ->
    TaggedMachine
      <$> (o .:  "id")
      <*> (o .:? "name")

-- | ToJSON TaggedMachine
instance A.ToJSON TaggedMachine where
  toJSON TaggedMachine {..} =
   _omitNulls
      [ "id" .= taggedMachineId
      , "name" .= taggedMachineName
      ]


-- | Construct a value of type 'TaggedMachine' (by applying it's required fields, if any)
mkTaggedMachine
  :: Integer -- ^ 'taggedMachineId': The ID of the Machine being tagged.
  -> TaggedMachine
mkTaggedMachine taggedMachineId =
  TaggedMachine
  { taggedMachineId
  , taggedMachineName = Nothing
  }

-- ** TaggedMachineBase
-- | TaggedMachineBase
data TaggedMachineBase = TaggedMachineBase
  { taggedMachineBaseId :: !(Integer) -- ^ /Required/ "id" - The ID of the Machine being tagged.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TaggedMachineBase
instance A.FromJSON TaggedMachineBase where
  parseJSON = A.withObject "TaggedMachineBase" $ \o ->
    TaggedMachineBase
      <$> (o .:  "id")

-- | ToJSON TaggedMachineBase
instance A.ToJSON TaggedMachineBase where
  toJSON TaggedMachineBase {..} =
   _omitNulls
      [ "id" .= taggedMachineBaseId
      ]


-- | Construct a value of type 'TaggedMachineBase' (by applying it's required fields, if any)
mkTaggedMachineBase
  :: Integer -- ^ 'taggedMachineBaseId': The ID of the Machine being tagged.
  -> TaggedMachineBase
mkTaggedMachineBase taggedMachineBaseId =
  TaggedMachineBase
  { taggedMachineBaseId
  }

-- ** TaggedSensor
-- | TaggedSensor
data TaggedSensor = TaggedSensor
  { taggedSensorId :: !(Integer) -- ^ /Required/ "id" - The ID of the Sensor being tagged.
  , taggedSensorName :: !(Maybe Text) -- ^ "name" - Name of the Sensor being tagged.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TaggedSensor
instance A.FromJSON TaggedSensor where
  parseJSON = A.withObject "TaggedSensor" $ \o ->
    TaggedSensor
      <$> (o .:  "id")
      <*> (o .:? "name")

-- | ToJSON TaggedSensor
instance A.ToJSON TaggedSensor where
  toJSON TaggedSensor {..} =
   _omitNulls
      [ "id" .= taggedSensorId
      , "name" .= taggedSensorName
      ]


-- | Construct a value of type 'TaggedSensor' (by applying it's required fields, if any)
mkTaggedSensor
  :: Integer -- ^ 'taggedSensorId': The ID of the Sensor being tagged.
  -> TaggedSensor
mkTaggedSensor taggedSensorId =
  TaggedSensor
  { taggedSensorId
  , taggedSensorName = Nothing
  }

-- ** TaggedSensorBase
-- | TaggedSensorBase
data TaggedSensorBase = TaggedSensorBase
  { taggedSensorBaseId :: !(Integer) -- ^ /Required/ "id" - The ID of the Sensor being tagged.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TaggedSensorBase
instance A.FromJSON TaggedSensorBase where
  parseJSON = A.withObject "TaggedSensorBase" $ \o ->
    TaggedSensorBase
      <$> (o .:  "id")

-- | ToJSON TaggedSensorBase
instance A.ToJSON TaggedSensorBase where
  toJSON TaggedSensorBase {..} =
   _omitNulls
      [ "id" .= taggedSensorBaseId
      ]


-- | Construct a value of type 'TaggedSensorBase' (by applying it's required fields, if any)
mkTaggedSensorBase
  :: Integer -- ^ 'taggedSensorBaseId': The ID of the Sensor being tagged.
  -> TaggedSensorBase
mkTaggedSensorBase taggedSensorBaseId =
  TaggedSensorBase
  { taggedSensorBaseId
  }

-- ** TaggedVehicle
-- | TaggedVehicle
data TaggedVehicle = TaggedVehicle
  { taggedVehicleId :: !(Integer) -- ^ /Required/ "id" - The ID of the Vehicle being tagged.
  , taggedVehicleName :: !(Maybe Text) -- ^ "name" - Name of the Vehicle being tagged.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TaggedVehicle
instance A.FromJSON TaggedVehicle where
  parseJSON = A.withObject "TaggedVehicle" $ \o ->
    TaggedVehicle
      <$> (o .:  "id")
      <*> (o .:? "name")

-- | ToJSON TaggedVehicle
instance A.ToJSON TaggedVehicle where
  toJSON TaggedVehicle {..} =
   _omitNulls
      [ "id" .= taggedVehicleId
      , "name" .= taggedVehicleName
      ]


-- | Construct a value of type 'TaggedVehicle' (by applying it's required fields, if any)
mkTaggedVehicle
  :: Integer -- ^ 'taggedVehicleId': The ID of the Vehicle being tagged.
  -> TaggedVehicle
mkTaggedVehicle taggedVehicleId =
  TaggedVehicle
  { taggedVehicleId
  , taggedVehicleName = Nothing
  }

-- ** TaggedVehicleBase
-- | TaggedVehicleBase
data TaggedVehicleBase = TaggedVehicleBase
  { taggedVehicleBaseId :: !(Integer) -- ^ /Required/ "id" - The ID of the Vehicle being tagged.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TaggedVehicleBase
instance A.FromJSON TaggedVehicleBase where
  parseJSON = A.withObject "TaggedVehicleBase" $ \o ->
    TaggedVehicleBase
      <$> (o .:  "id")

-- | ToJSON TaggedVehicleBase
instance A.ToJSON TaggedVehicleBase where
  toJSON TaggedVehicleBase {..} =
   _omitNulls
      [ "id" .= taggedVehicleBaseId
      ]


-- | Construct a value of type 'TaggedVehicleBase' (by applying it's required fields, if any)
mkTaggedVehicleBase
  :: Integer -- ^ 'taggedVehicleBaseId': The ID of the Vehicle being tagged.
  -> TaggedVehicleBase
mkTaggedVehicleBase taggedVehicleBaseId =
  TaggedVehicleBase
  { taggedVehicleBaseId
  }

-- ** TemperatureResponse
-- | TemperatureResponse
-- Contains the current temperatures of a sensor.
data TemperatureResponse = TemperatureResponse
  { temperatureResponseGroupId :: !(Maybe Integer) -- ^ "groupId"
  , temperatureResponseSensors :: !(Maybe [TemperatureResponseSensors]) -- ^ "sensors"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TemperatureResponse
instance A.FromJSON TemperatureResponse where
  parseJSON = A.withObject "TemperatureResponse" $ \o ->
    TemperatureResponse
      <$> (o .:? "groupId")
      <*> (o .:? "sensors")

-- | ToJSON TemperatureResponse
instance A.ToJSON TemperatureResponse where
  toJSON TemperatureResponse {..} =
   _omitNulls
      [ "groupId" .= temperatureResponseGroupId
      , "sensors" .= temperatureResponseSensors
      ]


-- | Construct a value of type 'TemperatureResponse' (by applying it's required fields, if any)
mkTemperatureResponse
  :: TemperatureResponse
mkTemperatureResponse =
  TemperatureResponse
  { temperatureResponseGroupId = Nothing
  , temperatureResponseSensors = Nothing
  }

-- ** TemperatureResponseSensors
-- | TemperatureResponseSensors
data TemperatureResponseSensors = TemperatureResponseSensors
  { temperatureResponseSensorsProbeTemperature :: !(Maybe Int) -- ^ "probeTemperature" - Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
  , temperatureResponseSensorsName :: !(Maybe Text) -- ^ "name" - Name of the sensor.
  , temperatureResponseSensorsId :: !(Maybe Integer) -- ^ "id" - ID of the sensor.
  , temperatureResponseSensorsAmbientTemperature :: !(Maybe Int) -- ^ "ambientTemperature" - Currently reported ambient temperature in millidegrees celsius.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TemperatureResponseSensors
instance A.FromJSON TemperatureResponseSensors where
  parseJSON = A.withObject "TemperatureResponseSensors" $ \o ->
    TemperatureResponseSensors
      <$> (o .:? "probeTemperature")
      <*> (o .:? "name")
      <*> (o .:? "id")
      <*> (o .:? "ambientTemperature")

-- | ToJSON TemperatureResponseSensors
instance A.ToJSON TemperatureResponseSensors where
  toJSON TemperatureResponseSensors {..} =
   _omitNulls
      [ "probeTemperature" .= temperatureResponseSensorsProbeTemperature
      , "name" .= temperatureResponseSensorsName
      , "id" .= temperatureResponseSensorsId
      , "ambientTemperature" .= temperatureResponseSensorsAmbientTemperature
      ]


-- | Construct a value of type 'TemperatureResponseSensors' (by applying it's required fields, if any)
mkTemperatureResponseSensors
  :: TemperatureResponseSensors
mkTemperatureResponseSensors =
  TemperatureResponseSensors
  { temperatureResponseSensorsProbeTemperature = Nothing
  , temperatureResponseSensorsName = Nothing
  , temperatureResponseSensorsId = Nothing
  , temperatureResponseSensorsAmbientTemperature = Nothing
  }

-- ** TripResponse
-- | TripResponse
-- Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
data TripResponse = TripResponse
  { tripResponseTrips :: !(Maybe [TripResponseTrips]) -- ^ "trips"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TripResponse
instance A.FromJSON TripResponse where
  parseJSON = A.withObject "TripResponse" $ \o ->
    TripResponse
      <$> (o .:? "trips")

-- | ToJSON TripResponse
instance A.ToJSON TripResponse where
  toJSON TripResponse {..} =
   _omitNulls
      [ "trips" .= tripResponseTrips
      ]


-- | Construct a value of type 'TripResponse' (by applying it's required fields, if any)
mkTripResponse
  :: TripResponse
mkTripResponse =
  TripResponse
  { tripResponseTrips = Nothing
  }

-- ** TripResponseEndCoordinates
-- | TripResponseEndCoordinates
-- End (latitude, longitude) in decimal degrees.
data TripResponseEndCoordinates = TripResponseEndCoordinates
  { tripResponseEndCoordinatesLatitude :: !(Maybe Double) -- ^ "latitude"
  , tripResponseEndCoordinatesLongitude :: !(Maybe Double) -- ^ "longitude"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TripResponseEndCoordinates
instance A.FromJSON TripResponseEndCoordinates where
  parseJSON = A.withObject "TripResponseEndCoordinates" $ \o ->
    TripResponseEndCoordinates
      <$> (o .:? "latitude")
      <*> (o .:? "longitude")

-- | ToJSON TripResponseEndCoordinates
instance A.ToJSON TripResponseEndCoordinates where
  toJSON TripResponseEndCoordinates {..} =
   _omitNulls
      [ "latitude" .= tripResponseEndCoordinatesLatitude
      , "longitude" .= tripResponseEndCoordinatesLongitude
      ]


-- | Construct a value of type 'TripResponseEndCoordinates' (by applying it's required fields, if any)
mkTripResponseEndCoordinates
  :: TripResponseEndCoordinates
mkTripResponseEndCoordinates =
  TripResponseEndCoordinates
  { tripResponseEndCoordinatesLatitude = Nothing
  , tripResponseEndCoordinatesLongitude = Nothing
  }

-- ** TripResponseStartCoordinates
-- | TripResponseStartCoordinates
-- Start (latitude, longitude) in decimal degrees.
data TripResponseStartCoordinates = TripResponseStartCoordinates
  { tripResponseStartCoordinatesLatitude :: !(Maybe Double) -- ^ "latitude"
  , tripResponseStartCoordinatesLongitude :: !(Maybe Double) -- ^ "longitude"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TripResponseStartCoordinates
instance A.FromJSON TripResponseStartCoordinates where
  parseJSON = A.withObject "TripResponseStartCoordinates" $ \o ->
    TripResponseStartCoordinates
      <$> (o .:? "latitude")
      <*> (o .:? "longitude")

-- | ToJSON TripResponseStartCoordinates
instance A.ToJSON TripResponseStartCoordinates where
  toJSON TripResponseStartCoordinates {..} =
   _omitNulls
      [ "latitude" .= tripResponseStartCoordinatesLatitude
      , "longitude" .= tripResponseStartCoordinatesLongitude
      ]


-- | Construct a value of type 'TripResponseStartCoordinates' (by applying it's required fields, if any)
mkTripResponseStartCoordinates
  :: TripResponseStartCoordinates
mkTripResponseStartCoordinates =
  TripResponseStartCoordinates
  { tripResponseStartCoordinatesLatitude = Nothing
  , tripResponseStartCoordinatesLongitude = Nothing
  }

-- ** TripResponseTrips
-- | TripResponseTrips
data TripResponseTrips = TripResponseTrips
  { tripResponseTripsEndOdometer :: !(Maybe Int) -- ^ "endOdometer" - Odometer reading at the end of the trip.
  , tripResponseTripsDistanceMeters :: !(Maybe Int) -- ^ "distanceMeters" - Length of the trip in meters.
  , tripResponseTripsEndMs :: !(Maybe Int) -- ^ "endMs" - End of the trip in UNIX milliseconds.
  , tripResponseTripsStartMs :: !(Maybe Int) -- ^ "startMs" - Beginning of the trip in UNIX milliseconds.
  , tripResponseTripsFuelConsumedMl :: !(Maybe Int) -- ^ "fuelConsumedMl" - Amount in milliliters of fuel consumed on this trip.
  , tripResponseTripsStartAddress :: !(Maybe Text) -- ^ "startAddress" - Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
  , tripResponseTripsStartCoordinates :: !(Maybe TripResponseStartCoordinates) -- ^ "startCoordinates"
  , tripResponseTripsEndCoordinates :: !(Maybe TripResponseEndCoordinates) -- ^ "endCoordinates"
  , tripResponseTripsStartOdometer :: !(Maybe Int) -- ^ "startOdometer" - Odometer reading at the beginning of the trip.
  , tripResponseTripsDriverId :: !(Maybe Int) -- ^ "driverId" - ID of the driver.
  , tripResponseTripsStartLocation :: !(Maybe Text) -- ^ "startLocation" - Geocoded street address of start (latitude, longitude) coordinates.
  , tripResponseTripsTollMeters :: !(Maybe Int) -- ^ "tollMeters" - Length in meters trip spent on toll roads.
  , tripResponseTripsEndAddress :: !(Maybe Text) -- ^ "endAddress" - Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
  , tripResponseTripsEndLocation :: !(Maybe Text) -- ^ "endLocation" - Geocoded street address of start (latitude, longitude) coordinates.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON TripResponseTrips
instance A.FromJSON TripResponseTrips where
  parseJSON = A.withObject "TripResponseTrips" $ \o ->
    TripResponseTrips
      <$> (o .:? "endOdometer")
      <*> (o .:? "distanceMeters")
      <*> (o .:? "endMs")
      <*> (o .:? "startMs")
      <*> (o .:? "fuelConsumedMl")
      <*> (o .:? "startAddress")
      <*> (o .:? "startCoordinates")
      <*> (o .:? "endCoordinates")
      <*> (o .:? "startOdometer")
      <*> (o .:? "driverId")
      <*> (o .:? "startLocation")
      <*> (o .:? "tollMeters")
      <*> (o .:? "endAddress")
      <*> (o .:? "endLocation")

-- | ToJSON TripResponseTrips
instance A.ToJSON TripResponseTrips where
  toJSON TripResponseTrips {..} =
   _omitNulls
      [ "endOdometer" .= tripResponseTripsEndOdometer
      , "distanceMeters" .= tripResponseTripsDistanceMeters
      , "endMs" .= tripResponseTripsEndMs
      , "startMs" .= tripResponseTripsStartMs
      , "fuelConsumedMl" .= tripResponseTripsFuelConsumedMl
      , "startAddress" .= tripResponseTripsStartAddress
      , "startCoordinates" .= tripResponseTripsStartCoordinates
      , "endCoordinates" .= tripResponseTripsEndCoordinates
      , "startOdometer" .= tripResponseTripsStartOdometer
      , "driverId" .= tripResponseTripsDriverId
      , "startLocation" .= tripResponseTripsStartLocation
      , "tollMeters" .= tripResponseTripsTollMeters
      , "endAddress" .= tripResponseTripsEndAddress
      , "endLocation" .= tripResponseTripsEndLocation
      ]


-- | Construct a value of type 'TripResponseTrips' (by applying it's required fields, if any)
mkTripResponseTrips
  :: TripResponseTrips
mkTripResponseTrips =
  TripResponseTrips
  { tripResponseTripsEndOdometer = Nothing
  , tripResponseTripsDistanceMeters = Nothing
  , tripResponseTripsEndMs = Nothing
  , tripResponseTripsStartMs = Nothing
  , tripResponseTripsFuelConsumedMl = Nothing
  , tripResponseTripsStartAddress = Nothing
  , tripResponseTripsStartCoordinates = Nothing
  , tripResponseTripsEndCoordinates = Nothing
  , tripResponseTripsStartOdometer = Nothing
  , tripResponseTripsDriverId = Nothing
  , tripResponseTripsStartLocation = Nothing
  , tripResponseTripsTollMeters = Nothing
  , tripResponseTripsEndAddress = Nothing
  , tripResponseTripsEndLocation = Nothing
  }

-- ** User
-- | User
data User = User
  { userAuthType :: !(E'AuthType) -- ^ /Required/ "authType" - The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
  , userEmail :: !(Text) -- ^ /Required/ "email" - The email address of this user.
  , userName :: !(Maybe Text) -- ^ "name" - The first and last name of the user.
  , userOrganizationRoleId :: !(Maybe Text) -- ^ "organizationRoleId" - The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
  , userId :: !(Maybe Integer) -- ^ "id" - The ID of the User record.
  , userOrganizationRole :: !(Maybe Text) -- ^ "organizationRole" - The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
  , userTagRoles :: !(Maybe [UserTagRole]) -- ^ "tagRoles" - The specific tags this user has access to. This will be blank for users that have full access to the organization.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON User
instance A.FromJSON User where
  parseJSON = A.withObject "User" $ \o ->
    User
      <$> (o .:  "authType")
      <*> (o .:  "email")
      <*> (o .:? "name")
      <*> (o .:? "organizationRoleId")
      <*> (o .:? "id")
      <*> (o .:? "organizationRole")
      <*> (o .:? "tagRoles")

-- | ToJSON User
instance A.ToJSON User where
  toJSON User {..} =
   _omitNulls
      [ "authType" .= userAuthType
      , "email" .= userEmail
      , "name" .= userName
      , "organizationRoleId" .= userOrganizationRoleId
      , "id" .= userId
      , "organizationRole" .= userOrganizationRole
      , "tagRoles" .= userTagRoles
      ]


-- | Construct a value of type 'User' (by applying it's required fields, if any)
mkUser
  :: E'AuthType -- ^ 'userAuthType': The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
  -> Text -- ^ 'userEmail': The email address of this user.
  -> User
mkUser userAuthType userEmail =
  User
  { userAuthType
  , userEmail
  , userName = Nothing
  , userOrganizationRoleId = Nothing
  , userId = Nothing
  , userOrganizationRole = Nothing
  , userTagRoles = Nothing
  }

-- ** UserBase
-- | UserBase
data UserBase = UserBase
  { userBaseAuthType :: !(E'AuthType) -- ^ /Required/ "authType" - The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
  , userBaseEmail :: !(Text) -- ^ /Required/ "email" - The email address of this user.
  , userBaseName :: !(Maybe Text) -- ^ "name" - The first and last name of the user.
  , userBaseOrganizationRoleId :: !(Maybe Text) -- ^ "organizationRoleId" - The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON UserBase
instance A.FromJSON UserBase where
  parseJSON = A.withObject "UserBase" $ \o ->
    UserBase
      <$> (o .:  "authType")
      <*> (o .:  "email")
      <*> (o .:? "name")
      <*> (o .:? "organizationRoleId")

-- | ToJSON UserBase
instance A.ToJSON UserBase where
  toJSON UserBase {..} =
   _omitNulls
      [ "authType" .= userBaseAuthType
      , "email" .= userBaseEmail
      , "name" .= userBaseName
      , "organizationRoleId" .= userBaseOrganizationRoleId
      ]


-- | Construct a value of type 'UserBase' (by applying it's required fields, if any)
mkUserBase
  :: E'AuthType -- ^ 'userBaseAuthType': The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
  -> Text -- ^ 'userBaseEmail': The email address of this user.
  -> UserBase
mkUserBase userBaseAuthType userBaseEmail =
  UserBase
  { userBaseAuthType
  , userBaseEmail
  , userBaseName = Nothing
  , userBaseOrganizationRoleId = Nothing
  }

-- ** UserRole
-- | UserRole
data UserRole = UserRole
  { userRoleId :: !(Maybe Text) -- ^ "id"
  , userRoleName :: !(Maybe Text) -- ^ "name"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON UserRole
instance A.FromJSON UserRole where
  parseJSON = A.withObject "UserRole" $ \o ->
    UserRole
      <$> (o .:? "id")
      <*> (o .:? "name")

-- | ToJSON UserRole
instance A.ToJSON UserRole where
  toJSON UserRole {..} =
   _omitNulls
      [ "id" .= userRoleId
      , "name" .= userRoleName
      ]


-- | Construct a value of type 'UserRole' (by applying it's required fields, if any)
mkUserRole
  :: UserRole
mkUserRole =
  UserRole
  { userRoleId = Nothing
  , userRoleName = Nothing
  }

-- ** UserTagRole
-- | UserTagRole
data UserTagRole = UserTagRole
  { userTagRoleRole :: !(Maybe Text) -- ^ "role" - The name of the role the user has been granted on this tag.
  , userTagRoleRoleId :: !(Text) -- ^ /Required/ "roleId" - The id of the role the user has been granted on this tag.
  , userTagRoleTag :: !(UserTagRoleTag) -- ^ /Required/ "tag"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON UserTagRole
instance A.FromJSON UserTagRole where
  parseJSON = A.withObject "UserTagRole" $ \o ->
    UserTagRole
      <$> (o .:? "role")
      <*> (o .:  "roleId")
      <*> (o .:  "tag")

-- | ToJSON UserTagRole
instance A.ToJSON UserTagRole where
  toJSON UserTagRole {..} =
   _omitNulls
      [ "role" .= userTagRoleRole
      , "roleId" .= userTagRoleRoleId
      , "tag" .= userTagRoleTag
      ]


-- | Construct a value of type 'UserTagRole' (by applying it's required fields, if any)
mkUserTagRole
  :: Text -- ^ 'userTagRoleRoleId': The id of the role the user has been granted on this tag.
  -> UserTagRoleTag -- ^ 'userTagRoleTag' 
  -> UserTagRole
mkUserTagRole userTagRoleRoleId userTagRoleTag =
  UserTagRole
  { userTagRoleRole = Nothing
  , userTagRoleRoleId
  , userTagRoleTag
  }

-- ** UserTagRoleTag
-- | UserTagRoleTag
data UserTagRoleTag = UserTagRoleTag
  { userTagRoleTagParentTagId :: !(Maybe Integer) -- ^ "parentTagId" - The ID of this tag.
  , userTagRoleTagName :: !(Text) -- ^ /Required/ "name" - Name of this tag.
  , userTagRoleTagId :: !(Integer) -- ^ /Required/ "id" - The ID of this tag.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON UserTagRoleTag
instance A.FromJSON UserTagRoleTag where
  parseJSON = A.withObject "UserTagRoleTag" $ \o ->
    UserTagRoleTag
      <$> (o .:? "parentTagId")
      <*> (o .:  "name")
      <*> (o .:  "id")

-- | ToJSON UserTagRoleTag
instance A.ToJSON UserTagRoleTag where
  toJSON UserTagRoleTag {..} =
   _omitNulls
      [ "parentTagId" .= userTagRoleTagParentTagId
      , "name" .= userTagRoleTagName
      , "id" .= userTagRoleTagId
      ]


-- | Construct a value of type 'UserTagRoleTag' (by applying it's required fields, if any)
mkUserTagRoleTag
  :: Text -- ^ 'userTagRoleTagName': Name of this tag.
  -> Integer -- ^ 'userTagRoleTagId': The ID of this tag.
  -> UserTagRoleTag
mkUserTagRoleTag userTagRoleTagName userTagRoleTagId =
  UserTagRoleTag
  { userTagRoleTagParentTagId = Nothing
  , userTagRoleTagName
  , userTagRoleTagId
  }

-- ** Vehicle
-- | Vehicle
-- A vehicle object.
data Vehicle = Vehicle
  { vehicleEngineHours :: !(Maybe Integer) -- ^ "engineHours" - Total engine hours for the vehicle.
  , vehicleFuelLevelPercent :: !(Maybe Double) -- ^ "fuelLevelPercent" - The fuel level of the vehicle as a percentage. (0.0 to 1.0)
  , vehicleId :: !(Integer) -- ^ /Required/ "id" - ID of the vehicle.
  , vehicleName :: !(Maybe Text) -- ^ "name" - Name of the vehicle.
  , vehicleNote :: !(Maybe Text) -- ^ "note"
  , vehicleOdometerMeters :: !(Maybe Integer) -- ^ "odometerMeters" - The number of meters reported by the odometer.
  , vehicleVin :: !(Maybe Text) -- ^ "vin" - Vehicle Identification Number.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON Vehicle
instance A.FromJSON Vehicle where
  parseJSON = A.withObject "Vehicle" $ \o ->
    Vehicle
      <$> (o .:? "engineHours")
      <*> (o .:? "fuelLevelPercent")
      <*> (o .:  "id")
      <*> (o .:? "name")
      <*> (o .:? "note")
      <*> (o .:? "odometerMeters")
      <*> (o .:? "vin")

-- | ToJSON Vehicle
instance A.ToJSON Vehicle where
  toJSON Vehicle {..} =
   _omitNulls
      [ "engineHours" .= vehicleEngineHours
      , "fuelLevelPercent" .= vehicleFuelLevelPercent
      , "id" .= vehicleId
      , "name" .= vehicleName
      , "note" .= vehicleNote
      , "odometerMeters" .= vehicleOdometerMeters
      , "vin" .= vehicleVin
      ]


-- | Construct a value of type 'Vehicle' (by applying it's required fields, if any)
mkVehicle
  :: Integer -- ^ 'vehicleId': ID of the vehicle.
  -> Vehicle
mkVehicle vehicleId =
  Vehicle
  { vehicleEngineHours = Nothing
  , vehicleFuelLevelPercent = Nothing
  , vehicleId
  , vehicleName = Nothing
  , vehicleNote = Nothing
  , vehicleOdometerMeters = Nothing
  , vehicleVin = Nothing
  }

-- ** VehicleHarshEventResponse
-- | VehicleHarshEventResponse
-- Harsh event details for a vehicle
data VehicleHarshEventResponse = VehicleHarshEventResponse
  { vehicleHarshEventResponseDownloadForwardVideoUrl :: !(Maybe Text) -- ^ "downloadForwardVideoUrl" - URL for downloading the forward facing video
  , vehicleHarshEventResponseDownloadInwardVideoUrl :: !(Maybe Text) -- ^ "downloadInwardVideoUrl" - URL for downloading the inward facing video
  , vehicleHarshEventResponseDownloadTrackedInwardVideoUrl :: !(Maybe Text) -- ^ "downloadTrackedInwardVideoUrl" - URL for downloading the tracked inward facing video
  , vehicleHarshEventResponseHarshEventType :: !(Text) -- ^ /Required/ "harshEventType" - Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
  , vehicleHarshEventResponseIncidentReportUrl :: !(Text) -- ^ /Required/ "incidentReportUrl" - URL of the associated incident report page
  , vehicleHarshEventResponseIsDistracted :: !(Maybe Bool) -- ^ "isDistracted" - Whether the driver was deemed distracted during this harsh event
  , vehicleHarshEventResponseLocation :: !(Maybe VehicleHarshEventResponseLocation) -- ^ "location"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON VehicleHarshEventResponse
instance A.FromJSON VehicleHarshEventResponse where
  parseJSON = A.withObject "VehicleHarshEventResponse" $ \o ->
    VehicleHarshEventResponse
      <$> (o .:? "downloadForwardVideoUrl")
      <*> (o .:? "downloadInwardVideoUrl")
      <*> (o .:? "downloadTrackedInwardVideoUrl")
      <*> (o .:  "harshEventType")
      <*> (o .:  "incidentReportUrl")
      <*> (o .:? "isDistracted")
      <*> (o .:? "location")

-- | ToJSON VehicleHarshEventResponse
instance A.ToJSON VehicleHarshEventResponse where
  toJSON VehicleHarshEventResponse {..} =
   _omitNulls
      [ "downloadForwardVideoUrl" .= vehicleHarshEventResponseDownloadForwardVideoUrl
      , "downloadInwardVideoUrl" .= vehicleHarshEventResponseDownloadInwardVideoUrl
      , "downloadTrackedInwardVideoUrl" .= vehicleHarshEventResponseDownloadTrackedInwardVideoUrl
      , "harshEventType" .= vehicleHarshEventResponseHarshEventType
      , "incidentReportUrl" .= vehicleHarshEventResponseIncidentReportUrl
      , "isDistracted" .= vehicleHarshEventResponseIsDistracted
      , "location" .= vehicleHarshEventResponseLocation
      ]


-- | Construct a value of type 'VehicleHarshEventResponse' (by applying it's required fields, if any)
mkVehicleHarshEventResponse
  :: Text -- ^ 'vehicleHarshEventResponseHarshEventType': Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
  -> Text -- ^ 'vehicleHarshEventResponseIncidentReportUrl': URL of the associated incident report page
  -> VehicleHarshEventResponse
mkVehicleHarshEventResponse vehicleHarshEventResponseHarshEventType vehicleHarshEventResponseIncidentReportUrl =
  VehicleHarshEventResponse
  { vehicleHarshEventResponseDownloadForwardVideoUrl = Nothing
  , vehicleHarshEventResponseDownloadInwardVideoUrl = Nothing
  , vehicleHarshEventResponseDownloadTrackedInwardVideoUrl = Nothing
  , vehicleHarshEventResponseHarshEventType
  , vehicleHarshEventResponseIncidentReportUrl
  , vehicleHarshEventResponseIsDistracted = Nothing
  , vehicleHarshEventResponseLocation = Nothing
  }

-- ** VehicleHarshEventResponseLocation
-- | VehicleHarshEventResponseLocation
data VehicleHarshEventResponseLocation = VehicleHarshEventResponseLocation
  { vehicleHarshEventResponseLocationAddress :: !(Maybe Text) -- ^ "address" - Address of location where the harsh event occurred
  , vehicleHarshEventResponseLocationLatitude :: !(Maybe Text) -- ^ "latitude" - Latitude of location where the harsh event occurred
  , vehicleHarshEventResponseLocationLongitude :: !(Maybe Text) -- ^ "longitude" - Longitude of location where the harsh event occurred
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON VehicleHarshEventResponseLocation
instance A.FromJSON VehicleHarshEventResponseLocation where
  parseJSON = A.withObject "VehicleHarshEventResponseLocation" $ \o ->
    VehicleHarshEventResponseLocation
      <$> (o .:? "address")
      <*> (o .:? "latitude")
      <*> (o .:? "longitude")

-- | ToJSON VehicleHarshEventResponseLocation
instance A.ToJSON VehicleHarshEventResponseLocation where
  toJSON VehicleHarshEventResponseLocation {..} =
   _omitNulls
      [ "address" .= vehicleHarshEventResponseLocationAddress
      , "latitude" .= vehicleHarshEventResponseLocationLatitude
      , "longitude" .= vehicleHarshEventResponseLocationLongitude
      ]


-- | Construct a value of type 'VehicleHarshEventResponseLocation' (by applying it's required fields, if any)
mkVehicleHarshEventResponseLocation
  :: VehicleHarshEventResponseLocation
mkVehicleHarshEventResponseLocation =
  VehicleHarshEventResponseLocation
  { vehicleHarshEventResponseLocationAddress = Nothing
  , vehicleHarshEventResponseLocationLatitude = Nothing
  , vehicleHarshEventResponseLocationLongitude = Nothing
  }

-- ** VehicleLocation
-- | VehicleLocation
-- Contains the location, in latitude and longitude, of a vehicle.
data VehicleLocation = VehicleLocation
  { vehicleLocationHeading :: !(Maybe Double) -- ^ "heading" - Heading in degrees.
  , vehicleLocationId :: !(Integer) -- ^ /Required/ "id" - ID of the vehicle.
  , vehicleLocationLatitude :: !(Maybe Double) -- ^ "latitude" - Latitude in decimal degrees.
  , vehicleLocationLocation :: !(Maybe Text) -- ^ "location" - Text representation of nearest identifiable location to (latitude, longitude) coordinates.
  , vehicleLocationLongitude :: !(Maybe Double) -- ^ "longitude" - Longitude in decimal degrees.
  , vehicleLocationName :: !(Maybe Text) -- ^ "name" - Name of the vehicle.
  , vehicleLocationOdometerMeters :: !(Maybe Integer) -- ^ "odometerMeters" - The number of meters reported by the odometer.
  , vehicleLocationOnTrip :: !(Maybe Bool) -- ^ "onTrip" - Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
  , vehicleLocationSpeed :: !(Maybe Double) -- ^ "speed" - Speed in miles per hour.
  , vehicleLocationTime :: !(Maybe Int) -- ^ "time" - The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
  , vehicleLocationVin :: !(Maybe Text) -- ^ "vin" - Vehicle Identification Number (VIN) of the vehicle.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON VehicleLocation
instance A.FromJSON VehicleLocation where
  parseJSON = A.withObject "VehicleLocation" $ \o ->
    VehicleLocation
      <$> (o .:? "heading")
      <*> (o .:  "id")
      <*> (o .:? "latitude")
      <*> (o .:? "location")
      <*> (o .:? "longitude")
      <*> (o .:? "name")
      <*> (o .:? "odometerMeters")
      <*> (o .:? "onTrip")
      <*> (o .:? "speed")
      <*> (o .:? "time")
      <*> (o .:? "vin")

-- | ToJSON VehicleLocation
instance A.ToJSON VehicleLocation where
  toJSON VehicleLocation {..} =
   _omitNulls
      [ "heading" .= vehicleLocationHeading
      , "id" .= vehicleLocationId
      , "latitude" .= vehicleLocationLatitude
      , "location" .= vehicleLocationLocation
      , "longitude" .= vehicleLocationLongitude
      , "name" .= vehicleLocationName
      , "odometerMeters" .= vehicleLocationOdometerMeters
      , "onTrip" .= vehicleLocationOnTrip
      , "speed" .= vehicleLocationSpeed
      , "time" .= vehicleLocationTime
      , "vin" .= vehicleLocationVin
      ]


-- | Construct a value of type 'VehicleLocation' (by applying it's required fields, if any)
mkVehicleLocation
  :: Integer -- ^ 'vehicleLocationId': ID of the vehicle.
  -> VehicleLocation
mkVehicleLocation vehicleLocationId =
  VehicleLocation
  { vehicleLocationHeading = Nothing
  , vehicleLocationId
  , vehicleLocationLatitude = Nothing
  , vehicleLocationLocation = Nothing
  , vehicleLocationLongitude = Nothing
  , vehicleLocationName = Nothing
  , vehicleLocationOdometerMeters = Nothing
  , vehicleLocationOnTrip = Nothing
  , vehicleLocationSpeed = Nothing
  , vehicleLocationTime = Nothing
  , vehicleLocationVin = Nothing
  }

-- ** VehicleMaintenance
-- | VehicleMaintenance
-- Contains any J1939/Passenger engine light warnings and engine faults.
data VehicleMaintenance = VehicleMaintenance
  { vehicleMaintenanceId :: !(Integer) -- ^ /Required/ "id" - ID of the vehicle.
  , vehicleMaintenanceJ1939 :: !(Maybe VehicleMaintenanceJ1939) -- ^ "j1939"
  , vehicleMaintenancePassenger :: !(Maybe VehicleMaintenancePassenger) -- ^ "passenger"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON VehicleMaintenance
instance A.FromJSON VehicleMaintenance where
  parseJSON = A.withObject "VehicleMaintenance" $ \o ->
    VehicleMaintenance
      <$> (o .:  "id")
      <*> (o .:? "j1939")
      <*> (o .:? "passenger")

-- | ToJSON VehicleMaintenance
instance A.ToJSON VehicleMaintenance where
  toJSON VehicleMaintenance {..} =
   _omitNulls
      [ "id" .= vehicleMaintenanceId
      , "j1939" .= vehicleMaintenanceJ1939
      , "passenger" .= vehicleMaintenancePassenger
      ]


-- | Construct a value of type 'VehicleMaintenance' (by applying it's required fields, if any)
mkVehicleMaintenance
  :: Integer -- ^ 'vehicleMaintenanceId': ID of the vehicle.
  -> VehicleMaintenance
mkVehicleMaintenance vehicleMaintenanceId =
  VehicleMaintenance
  { vehicleMaintenanceId
  , vehicleMaintenanceJ1939 = Nothing
  , vehicleMaintenancePassenger = Nothing
  }

-- ** VehicleMaintenanceJ1939
-- | VehicleMaintenanceJ1939
-- J1939 based data. Null if no data is available.
data VehicleMaintenanceJ1939 = VehicleMaintenanceJ1939
  { vehicleMaintenanceJ1939CheckEngineLight :: !(Maybe VehicleMaintenanceJ1939CheckEngineLight) -- ^ "checkEngineLight"
  , vehicleMaintenanceJ1939DiagnosticTroubleCodes :: !(Maybe [VehicleMaintenanceJ1939DiagnosticTroubleCodes]) -- ^ "diagnosticTroubleCodes" - J1939 DTCs.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON VehicleMaintenanceJ1939
instance A.FromJSON VehicleMaintenanceJ1939 where
  parseJSON = A.withObject "VehicleMaintenanceJ1939" $ \o ->
    VehicleMaintenanceJ1939
      <$> (o .:? "checkEngineLight")
      <*> (o .:? "diagnosticTroubleCodes")

-- | ToJSON VehicleMaintenanceJ1939
instance A.ToJSON VehicleMaintenanceJ1939 where
  toJSON VehicleMaintenanceJ1939 {..} =
   _omitNulls
      [ "checkEngineLight" .= vehicleMaintenanceJ1939CheckEngineLight
      , "diagnosticTroubleCodes" .= vehicleMaintenanceJ1939DiagnosticTroubleCodes
      ]


-- | Construct a value of type 'VehicleMaintenanceJ1939' (by applying it's required fields, if any)
mkVehicleMaintenanceJ1939
  :: VehicleMaintenanceJ1939
mkVehicleMaintenanceJ1939 =
  VehicleMaintenanceJ1939
  { vehicleMaintenanceJ1939CheckEngineLight = Nothing
  , vehicleMaintenanceJ1939DiagnosticTroubleCodes = Nothing
  }

-- ** VehicleMaintenanceJ1939CheckEngineLight
-- | VehicleMaintenanceJ1939CheckEngineLight
-- J1939 check engine lights.
data VehicleMaintenanceJ1939CheckEngineLight = VehicleMaintenanceJ1939CheckEngineLight
  { vehicleMaintenanceJ1939CheckEngineLightProtectIsOn :: !(Maybe Bool) -- ^ "protectIsOn"
  , vehicleMaintenanceJ1939CheckEngineLightStopIsOn :: !(Maybe Bool) -- ^ "stopIsOn"
  , vehicleMaintenanceJ1939CheckEngineLightWarningIsOn :: !(Maybe Bool) -- ^ "warningIsOn"
  , vehicleMaintenanceJ1939CheckEngineLightEmissionsIsOn :: !(Maybe Bool) -- ^ "emissionsIsOn"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON VehicleMaintenanceJ1939CheckEngineLight
instance A.FromJSON VehicleMaintenanceJ1939CheckEngineLight where
  parseJSON = A.withObject "VehicleMaintenanceJ1939CheckEngineLight" $ \o ->
    VehicleMaintenanceJ1939CheckEngineLight
      <$> (o .:? "protectIsOn")
      <*> (o .:? "stopIsOn")
      <*> (o .:? "warningIsOn")
      <*> (o .:? "emissionsIsOn")

-- | ToJSON VehicleMaintenanceJ1939CheckEngineLight
instance A.ToJSON VehicleMaintenanceJ1939CheckEngineLight where
  toJSON VehicleMaintenanceJ1939CheckEngineLight {..} =
   _omitNulls
      [ "protectIsOn" .= vehicleMaintenanceJ1939CheckEngineLightProtectIsOn
      , "stopIsOn" .= vehicleMaintenanceJ1939CheckEngineLightStopIsOn
      , "warningIsOn" .= vehicleMaintenanceJ1939CheckEngineLightWarningIsOn
      , "emissionsIsOn" .= vehicleMaintenanceJ1939CheckEngineLightEmissionsIsOn
      ]


-- | Construct a value of type 'VehicleMaintenanceJ1939CheckEngineLight' (by applying it's required fields, if any)
mkVehicleMaintenanceJ1939CheckEngineLight
  :: VehicleMaintenanceJ1939CheckEngineLight
mkVehicleMaintenanceJ1939CheckEngineLight =
  VehicleMaintenanceJ1939CheckEngineLight
  { vehicleMaintenanceJ1939CheckEngineLightProtectIsOn = Nothing
  , vehicleMaintenanceJ1939CheckEngineLightStopIsOn = Nothing
  , vehicleMaintenanceJ1939CheckEngineLightWarningIsOn = Nothing
  , vehicleMaintenanceJ1939CheckEngineLightEmissionsIsOn = Nothing
  }

-- ** VehicleMaintenanceJ1939DiagnosticTroubleCodes
-- | VehicleMaintenanceJ1939DiagnosticTroubleCodes
data VehicleMaintenanceJ1939DiagnosticTroubleCodes = VehicleMaintenanceJ1939DiagnosticTroubleCodes
  { vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnDescription :: !(Maybe Text) -- ^ "spnDescription"
  , vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiText :: !(Maybe Text) -- ^ "fmiText"
  , vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnId :: !(Maybe Int) -- ^ "spnId"
  , vehicleMaintenanceJ1939DiagnosticTroubleCodesOccurrenceCount :: !(Maybe Int) -- ^ "occurrenceCount"
  , vehicleMaintenanceJ1939DiagnosticTroubleCodesTxId :: !(Maybe Int) -- ^ "txId"
  , vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiId :: !(Maybe Int) -- ^ "fmiId"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON VehicleMaintenanceJ1939DiagnosticTroubleCodes
instance A.FromJSON VehicleMaintenanceJ1939DiagnosticTroubleCodes where
  parseJSON = A.withObject "VehicleMaintenanceJ1939DiagnosticTroubleCodes" $ \o ->
    VehicleMaintenanceJ1939DiagnosticTroubleCodes
      <$> (o .:? "spnDescription")
      <*> (o .:? "fmiText")
      <*> (o .:? "spnId")
      <*> (o .:? "occurrenceCount")
      <*> (o .:? "txId")
      <*> (o .:? "fmiId")

-- | ToJSON VehicleMaintenanceJ1939DiagnosticTroubleCodes
instance A.ToJSON VehicleMaintenanceJ1939DiagnosticTroubleCodes where
  toJSON VehicleMaintenanceJ1939DiagnosticTroubleCodes {..} =
   _omitNulls
      [ "spnDescription" .= vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnDescription
      , "fmiText" .= vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiText
      , "spnId" .= vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnId
      , "occurrenceCount" .= vehicleMaintenanceJ1939DiagnosticTroubleCodesOccurrenceCount
      , "txId" .= vehicleMaintenanceJ1939DiagnosticTroubleCodesTxId
      , "fmiId" .= vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiId
      ]


-- | Construct a value of type 'VehicleMaintenanceJ1939DiagnosticTroubleCodes' (by applying it's required fields, if any)
mkVehicleMaintenanceJ1939DiagnosticTroubleCodes
  :: VehicleMaintenanceJ1939DiagnosticTroubleCodes
mkVehicleMaintenanceJ1939DiagnosticTroubleCodes =
  VehicleMaintenanceJ1939DiagnosticTroubleCodes
  { vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnDescription = Nothing
  , vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiText = Nothing
  , vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnId = Nothing
  , vehicleMaintenanceJ1939DiagnosticTroubleCodesOccurrenceCount = Nothing
  , vehicleMaintenanceJ1939DiagnosticTroubleCodesTxId = Nothing
  , vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiId = Nothing
  }

-- ** VehicleMaintenancePassenger
-- | VehicleMaintenancePassenger
-- Passenger vehicle data. Null if no data is available.
data VehicleMaintenancePassenger = VehicleMaintenancePassenger
  { vehicleMaintenancePassengerCheckEngineLight :: !(Maybe VehicleMaintenancePassengerCheckEngineLight) -- ^ "checkEngineLight"
  , vehicleMaintenancePassengerDiagnosticTroubleCodes :: !(Maybe [VehicleMaintenancePassengerDiagnosticTroubleCodes]) -- ^ "diagnosticTroubleCodes" - Passenger vehicle DTCs.
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON VehicleMaintenancePassenger
instance A.FromJSON VehicleMaintenancePassenger where
  parseJSON = A.withObject "VehicleMaintenancePassenger" $ \o ->
    VehicleMaintenancePassenger
      <$> (o .:? "checkEngineLight")
      <*> (o .:? "diagnosticTroubleCodes")

-- | ToJSON VehicleMaintenancePassenger
instance A.ToJSON VehicleMaintenancePassenger where
  toJSON VehicleMaintenancePassenger {..} =
   _omitNulls
      [ "checkEngineLight" .= vehicleMaintenancePassengerCheckEngineLight
      , "diagnosticTroubleCodes" .= vehicleMaintenancePassengerDiagnosticTroubleCodes
      ]


-- | Construct a value of type 'VehicleMaintenancePassenger' (by applying it's required fields, if any)
mkVehicleMaintenancePassenger
  :: VehicleMaintenancePassenger
mkVehicleMaintenancePassenger =
  VehicleMaintenancePassenger
  { vehicleMaintenancePassengerCheckEngineLight = Nothing
  , vehicleMaintenancePassengerDiagnosticTroubleCodes = Nothing
  }

-- ** VehicleMaintenancePassengerCheckEngineLight
-- | VehicleMaintenancePassengerCheckEngineLight
-- Passenger vehicle check engine light.
data VehicleMaintenancePassengerCheckEngineLight = VehicleMaintenancePassengerCheckEngineLight
  { vehicleMaintenancePassengerCheckEngineLightIsOn :: !(Maybe Bool) -- ^ "isOn"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON VehicleMaintenancePassengerCheckEngineLight
instance A.FromJSON VehicleMaintenancePassengerCheckEngineLight where
  parseJSON = A.withObject "VehicleMaintenancePassengerCheckEngineLight" $ \o ->
    VehicleMaintenancePassengerCheckEngineLight
      <$> (o .:? "isOn")

-- | ToJSON VehicleMaintenancePassengerCheckEngineLight
instance A.ToJSON VehicleMaintenancePassengerCheckEngineLight where
  toJSON VehicleMaintenancePassengerCheckEngineLight {..} =
   _omitNulls
      [ "isOn" .= vehicleMaintenancePassengerCheckEngineLightIsOn
      ]


-- | Construct a value of type 'VehicleMaintenancePassengerCheckEngineLight' (by applying it's required fields, if any)
mkVehicleMaintenancePassengerCheckEngineLight
  :: VehicleMaintenancePassengerCheckEngineLight
mkVehicleMaintenancePassengerCheckEngineLight =
  VehicleMaintenancePassengerCheckEngineLight
  { vehicleMaintenancePassengerCheckEngineLightIsOn = Nothing
  }

-- ** VehicleMaintenancePassengerDiagnosticTroubleCodes
-- | VehicleMaintenancePassengerDiagnosticTroubleCodes
data VehicleMaintenancePassengerDiagnosticTroubleCodes = VehicleMaintenancePassengerDiagnosticTroubleCodes
  { vehicleMaintenancePassengerDiagnosticTroubleCodesDtcShortCode :: !(Maybe Text) -- ^ "dtcShortCode"
  , vehicleMaintenancePassengerDiagnosticTroubleCodesDtcId :: !(Maybe Int) -- ^ "dtcId"
  , vehicleMaintenancePassengerDiagnosticTroubleCodesDtcDescription :: !(Maybe Text) -- ^ "dtcDescription"
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON VehicleMaintenancePassengerDiagnosticTroubleCodes
instance A.FromJSON VehicleMaintenancePassengerDiagnosticTroubleCodes where
  parseJSON = A.withObject "VehicleMaintenancePassengerDiagnosticTroubleCodes" $ \o ->
    VehicleMaintenancePassengerDiagnosticTroubleCodes
      <$> (o .:? "dtcShortCode")
      <*> (o .:? "dtcId")
      <*> (o .:? "dtcDescription")

-- | ToJSON VehicleMaintenancePassengerDiagnosticTroubleCodes
instance A.ToJSON VehicleMaintenancePassengerDiagnosticTroubleCodes where
  toJSON VehicleMaintenancePassengerDiagnosticTroubleCodes {..} =
   _omitNulls
      [ "dtcShortCode" .= vehicleMaintenancePassengerDiagnosticTroubleCodesDtcShortCode
      , "dtcId" .= vehicleMaintenancePassengerDiagnosticTroubleCodesDtcId
      , "dtcDescription" .= vehicleMaintenancePassengerDiagnosticTroubleCodesDtcDescription
      ]


-- | Construct a value of type 'VehicleMaintenancePassengerDiagnosticTroubleCodes' (by applying it's required fields, if any)
mkVehicleMaintenancePassengerDiagnosticTroubleCodes
  :: VehicleMaintenancePassengerDiagnosticTroubleCodes
mkVehicleMaintenancePassengerDiagnosticTroubleCodes =
  VehicleMaintenancePassengerDiagnosticTroubleCodes
  { vehicleMaintenancePassengerDiagnosticTroubleCodesDtcShortCode = Nothing
  , vehicleMaintenancePassengerDiagnosticTroubleCodesDtcId = Nothing
  , vehicleMaintenancePassengerDiagnosticTroubleCodesDtcDescription = Nothing
  }

-- ** VehicleSafetyScoreResponse
-- | VehicleSafetyScoreResponse
-- Safety score details for a vehicle
data VehicleSafetyScoreResponse = VehicleSafetyScoreResponse
  { vehicleSafetyScoreResponseCrashCount :: !(Maybe Int) -- ^ "crashCount" - Crash event count
  , vehicleSafetyScoreResponseHarshAccelCount :: !(Maybe Int) -- ^ "harshAccelCount" - Harsh acceleration event count
  , vehicleSafetyScoreResponseHarshBrakingCount :: !(Maybe Int) -- ^ "harshBrakingCount" - Harsh braking event count
  , vehicleSafetyScoreResponseHarshEvents :: !(Maybe [SafetyReportHarshEvent]) -- ^ "harshEvents"
  , vehicleSafetyScoreResponseHarshTurningCount :: !(Maybe Int) -- ^ "harshTurningCount" - Harsh turning event count
  , vehicleSafetyScoreResponseSafetyScore :: !(Maybe Int) -- ^ "safetyScore" - Safety Score
  , vehicleSafetyScoreResponseSafetyScoreRank :: !(Maybe Text) -- ^ "safetyScoreRank" - Safety Score Rank
  , vehicleSafetyScoreResponseTimeOverSpeedLimitMs :: !(Maybe Int) -- ^ "timeOverSpeedLimitMs" - Amount of time driven over the speed limit in milliseconds
  , vehicleSafetyScoreResponseTotalDistanceDrivenMeters :: !(Maybe Int) -- ^ "totalDistanceDrivenMeters" - Total distance driven in meters
  , vehicleSafetyScoreResponseTotalHarshEventCount :: !(Maybe Int) -- ^ "totalHarshEventCount" - Total harsh event count
  , vehicleSafetyScoreResponseTotalTimeDrivenMs :: !(Maybe Int) -- ^ "totalTimeDrivenMs" - Amount of time driven in milliseconds
  , vehicleSafetyScoreResponseVehicleId :: !(Maybe Int) -- ^ "vehicleId" - Vehicle ID
  } deriving (P.Show, P.Eq, P.Typeable)

-- | FromJSON VehicleSafetyScoreResponse
instance A.FromJSON VehicleSafetyScoreResponse where
  parseJSON = A.withObject "VehicleSafetyScoreResponse" $ \o ->
    VehicleSafetyScoreResponse
      <$> (o .:? "crashCount")
      <*> (o .:? "harshAccelCount")
      <*> (o .:? "harshBrakingCount")
      <*> (o .:? "harshEvents")
      <*> (o .:? "harshTurningCount")
      <*> (o .:? "safetyScore")
      <*> (o .:? "safetyScoreRank")
      <*> (o .:? "timeOverSpeedLimitMs")
      <*> (o .:? "totalDistanceDrivenMeters")
      <*> (o .:? "totalHarshEventCount")
      <*> (o .:? "totalTimeDrivenMs")
      <*> (o .:? "vehicleId")

-- | ToJSON VehicleSafetyScoreResponse
instance A.ToJSON VehicleSafetyScoreResponse where
  toJSON VehicleSafetyScoreResponse {..} =
   _omitNulls
      [ "crashCount" .= vehicleSafetyScoreResponseCrashCount
      , "harshAccelCount" .= vehicleSafetyScoreResponseHarshAccelCount
      , "harshBrakingCount" .= vehicleSafetyScoreResponseHarshBrakingCount
      , "harshEvents" .= vehicleSafetyScoreResponseHarshEvents
      , "harshTurningCount" .= vehicleSafetyScoreResponseHarshTurningCount
      , "safetyScore" .= vehicleSafetyScoreResponseSafetyScore
      , "safetyScoreRank" .= vehicleSafetyScoreResponseSafetyScoreRank
      , "timeOverSpeedLimitMs" .= vehicleSafetyScoreResponseTimeOverSpeedLimitMs
      , "totalDistanceDrivenMeters" .= vehicleSafetyScoreResponseTotalDistanceDrivenMeters
      , "totalHarshEventCount" .= vehicleSafetyScoreResponseTotalHarshEventCount
      , "totalTimeDrivenMs" .= vehicleSafetyScoreResponseTotalTimeDrivenMs
      , "vehicleId" .= vehicleSafetyScoreResponseVehicleId
      ]


-- | Construct a value of type 'VehicleSafetyScoreResponse' (by applying it's required fields, if any)
mkVehicleSafetyScoreResponse
  :: VehicleSafetyScoreResponse
mkVehicleSafetyScoreResponse =
  VehicleSafetyScoreResponse
  { vehicleSafetyScoreResponseCrashCount = Nothing
  , vehicleSafetyScoreResponseHarshAccelCount = Nothing
  , vehicleSafetyScoreResponseHarshBrakingCount = Nothing
  , vehicleSafetyScoreResponseHarshEvents = Nothing
  , vehicleSafetyScoreResponseHarshTurningCount = Nothing
  , vehicleSafetyScoreResponseSafetyScore = Nothing
  , vehicleSafetyScoreResponseSafetyScoreRank = Nothing
  , vehicleSafetyScoreResponseTimeOverSpeedLimitMs = Nothing
  , vehicleSafetyScoreResponseTotalDistanceDrivenMeters = Nothing
  , vehicleSafetyScoreResponseTotalHarshEventCount = Nothing
  , vehicleSafetyScoreResponseTotalTimeDrivenMs = Nothing
  , vehicleSafetyScoreResponseVehicleId = Nothing
  }


-- * Enums


-- ** E'AuthType

-- | Enum of 'Text' . 
-- The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
data E'AuthType
  = E'AuthType'Default -- ^ @"default"@
  | E'AuthType'Saml -- ^ @"saml"@
  deriving (P.Show, P.Eq, P.Typeable, P.Ord, P.Bounded, P.Enum)

instance A.ToJSON E'AuthType where toJSON = A.toJSON . fromE'AuthType
instance A.FromJSON E'AuthType where parseJSON o = P.either P.fail (pure . P.id) . toE'AuthType =<< A.parseJSON o
instance WH.ToHttpApiData E'AuthType where toQueryParam = WH.toQueryParam . fromE'AuthType
instance WH.FromHttpApiData E'AuthType where parseQueryParam o = WH.parseQueryParam o >>= P.left T.pack . toE'AuthType
instance MimeRender MimeMultipartFormData E'AuthType where mimeRender _ = mimeRenderDefaultMultipartFormData

-- | unwrap 'E'AuthType' enum
fromE'AuthType :: E'AuthType -> Text
fromE'AuthType = \case
  E'AuthType'Default -> "default"
  E'AuthType'Saml -> "saml"

-- | parse 'E'AuthType' enum
toE'AuthType :: Text -> P.Either String E'AuthType
toE'AuthType = \case
  "default" -> P.Right E'AuthType'Default
  "saml" -> P.Right E'AuthType'Saml
  s -> P.Left $ "toE'AuthType: enum parse failure: " P.++ P.show s


-- ** E'Field

-- | Enum of 'Text' . 
-- Field to query.
data E'Field
  = E'Field'AmbientTemperature -- ^ @"ambientTemperature"@
  | E'Field'ProbeTemperature -- ^ @"probeTemperature"@
  | E'Field'CurrentLoop1Raw -- ^ @"currentLoop1Raw"@
  | E'Field'CurrentLoop1Mapped -- ^ @"currentLoop1Mapped"@
  | E'Field'CurrentLoop2Raw -- ^ @"currentLoop2Raw"@
  | E'Field'CurrentLoop2Mapped -- ^ @"currentLoop2Mapped"@
  | E'Field'PmPowerTotal -- ^ @"pmPowerTotal"@
  | E'Field'PmPhase1Power -- ^ @"pmPhase1Power"@
  | E'Field'PmPhase2Power -- ^ @"pmPhase2Power"@
  | E'Field'PmPhase3Power -- ^ @"pmPhase3Power"@
  | E'Field'PmPhase1PowerFactor -- ^ @"pmPhase1PowerFactor"@
  | E'Field'PmPhase2PowerFactor -- ^ @"pmPhase2PowerFactor"@
  | E'Field'PmPhase3PowerFactor -- ^ @"pmPhase3PowerFactor"@
  deriving (P.Show, P.Eq, P.Typeable, P.Ord, P.Bounded, P.Enum)

instance A.ToJSON E'Field where toJSON = A.toJSON . fromE'Field
instance A.FromJSON E'Field where parseJSON o = P.either P.fail (pure . P.id) . toE'Field =<< A.parseJSON o
instance WH.ToHttpApiData E'Field where toQueryParam = WH.toQueryParam . fromE'Field
instance WH.FromHttpApiData E'Field where parseQueryParam o = WH.parseQueryParam o >>= P.left T.pack . toE'Field
instance MimeRender MimeMultipartFormData E'Field where mimeRender _ = mimeRenderDefaultMultipartFormData

-- | unwrap 'E'Field' enum
fromE'Field :: E'Field -> Text
fromE'Field = \case
  E'Field'AmbientTemperature -> "ambientTemperature"
  E'Field'ProbeTemperature -> "probeTemperature"
  E'Field'CurrentLoop1Raw -> "currentLoop1Raw"
  E'Field'CurrentLoop1Mapped -> "currentLoop1Mapped"
  E'Field'CurrentLoop2Raw -> "currentLoop2Raw"
  E'Field'CurrentLoop2Mapped -> "currentLoop2Mapped"
  E'Field'PmPowerTotal -> "pmPowerTotal"
  E'Field'PmPhase1Power -> "pmPhase1Power"
  E'Field'PmPhase2Power -> "pmPhase2Power"
  E'Field'PmPhase3Power -> "pmPhase3Power"
  E'Field'PmPhase1PowerFactor -> "pmPhase1PowerFactor"
  E'Field'PmPhase2PowerFactor -> "pmPhase2PowerFactor"
  E'Field'PmPhase3PowerFactor -> "pmPhase3PowerFactor"

-- | parse 'E'Field' enum
toE'Field :: Text -> P.Either String E'Field
toE'Field = \case
  "ambientTemperature" -> P.Right E'Field'AmbientTemperature
  "probeTemperature" -> P.Right E'Field'ProbeTemperature
  "currentLoop1Raw" -> P.Right E'Field'CurrentLoop1Raw
  "currentLoop1Mapped" -> P.Right E'Field'CurrentLoop1Mapped
  "currentLoop2Raw" -> P.Right E'Field'CurrentLoop2Raw
  "currentLoop2Mapped" -> P.Right E'Field'CurrentLoop2Mapped
  "pmPowerTotal" -> P.Right E'Field'PmPowerTotal
  "pmPhase1Power" -> P.Right E'Field'PmPhase1Power
  "pmPhase2Power" -> P.Right E'Field'PmPhase2Power
  "pmPhase3Power" -> P.Right E'Field'PmPhase3Power
  "pmPhase1PowerFactor" -> P.Right E'Field'PmPhase1PowerFactor
  "pmPhase2PowerFactor" -> P.Right E'Field'PmPhase2PowerFactor
  "pmPhase3PowerFactor" -> P.Right E'Field'PmPhase3PowerFactor
  s -> P.Left $ "toE'Field: enum parse failure: " P.++ P.show s


-- ** E'FillMissing

-- | Enum of 'Text'
data E'FillMissing
  = E'FillMissing'WithNull -- ^ @"withNull"@
  | E'FillMissing'WithPrevious -- ^ @"withPrevious"@
  deriving (P.Show, P.Eq, P.Typeable, P.Ord, P.Bounded, P.Enum)

instance A.ToJSON E'FillMissing where toJSON = A.toJSON . fromE'FillMissing
instance A.FromJSON E'FillMissing where parseJSON o = P.either P.fail (pure . P.id) . toE'FillMissing =<< A.parseJSON o
instance WH.ToHttpApiData E'FillMissing where toQueryParam = WH.toQueryParam . fromE'FillMissing
instance WH.FromHttpApiData E'FillMissing where parseQueryParam o = WH.parseQueryParam o >>= P.left T.pack . toE'FillMissing
instance MimeRender MimeMultipartFormData E'FillMissing where mimeRender _ = mimeRenderDefaultMultipartFormData

-- | unwrap 'E'FillMissing' enum
fromE'FillMissing :: E'FillMissing -> Text
fromE'FillMissing = \case
  E'FillMissing'WithNull -> "withNull"
  E'FillMissing'WithPrevious -> "withPrevious"

-- | parse 'E'FillMissing' enum
toE'FillMissing :: Text -> P.Either String E'FillMissing
toE'FillMissing = \case
  "withNull" -> P.Right E'FillMissing'WithNull
  "withPrevious" -> P.Right E'FillMissing'WithPrevious
  s -> P.Left $ "toE'FillMissing: enum parse failure: " P.++ P.show s


-- ** E'InspectionType

-- | Enum of 'Text' . 
-- Only type 'mechanic' is currently accepted.
data E'InspectionType
  = E'InspectionType'Mechanic -- ^ @"mechanic"@
  deriving (P.Show, P.Eq, P.Typeable, P.Ord, P.Bounded, P.Enum)

instance A.ToJSON E'InspectionType where toJSON = A.toJSON . fromE'InspectionType
instance A.FromJSON E'InspectionType where parseJSON o = P.either P.fail (pure . P.id) . toE'InspectionType =<< A.parseJSON o
instance WH.ToHttpApiData E'InspectionType where toQueryParam = WH.toQueryParam . fromE'InspectionType
instance WH.FromHttpApiData E'InspectionType where parseQueryParam o = WH.parseQueryParam o >>= P.left T.pack . toE'InspectionType
instance MimeRender MimeMultipartFormData E'InspectionType where mimeRender _ = mimeRenderDefaultMultipartFormData

-- | unwrap 'E'InspectionType' enum
fromE'InspectionType :: E'InspectionType -> Text
fromE'InspectionType = \case
  E'InspectionType'Mechanic -> "mechanic"

-- | parse 'E'InspectionType' enum
toE'InspectionType :: Text -> P.Either String E'InspectionType
toE'InspectionType = \case
  "mechanic" -> P.Right E'InspectionType'Mechanic
  s -> P.Left $ "toE'InspectionType: enum parse failure: " P.++ P.show s


-- ** E'Name

-- | Enum of 'Text' . 
-- The name of the aux input.
data E'Name
  = E'Name'Emergency_Lights -- ^ @"Emergency Lights"@
  | E'Name'Emergency_Alarm -- ^ @"Emergency Alarm"@
  | E'Name'Stop_Paddle -- ^ @"Stop Paddle"@
  | E'Name'Power_Take_Off -- ^ @"Power Take-Off"@
  | E'Name'Plow -- ^ @"Plow"@
  | E'Name'Sweeper -- ^ @"Sweeper"@
  | E'Name'Salter -- ^ @"Salter"@
  | E'Name'Boom -- ^ @"Boom"@
  deriving (P.Show, P.Eq, P.Typeable, P.Ord, P.Bounded, P.Enum)

instance A.ToJSON E'Name where toJSON = A.toJSON . fromE'Name
instance A.FromJSON E'Name where parseJSON o = P.either P.fail (pure . P.id) . toE'Name =<< A.parseJSON o
instance WH.ToHttpApiData E'Name where toQueryParam = WH.toQueryParam . fromE'Name
instance WH.FromHttpApiData E'Name where parseQueryParam o = WH.parseQueryParam o >>= P.left T.pack . toE'Name
instance MimeRender MimeMultipartFormData E'Name where mimeRender _ = mimeRenderDefaultMultipartFormData

-- | unwrap 'E'Name' enum
fromE'Name :: E'Name -> Text
fromE'Name = \case
  E'Name'Emergency_Lights -> "Emergency Lights"
  E'Name'Emergency_Alarm -> "Emergency Alarm"
  E'Name'Stop_Paddle -> "Stop Paddle"
  E'Name'Power_Take_Off -> "Power Take-Off"
  E'Name'Plow -> "Plow"
  E'Name'Sweeper -> "Sweeper"
  E'Name'Salter -> "Salter"
  E'Name'Boom -> "Boom"

-- | parse 'E'Name' enum
toE'Name :: Text -> P.Either String E'Name
toE'Name = \case
  "Emergency Lights" -> P.Right E'Name'Emergency_Lights
  "Emergency Alarm" -> P.Right E'Name'Emergency_Alarm
  "Stop Paddle" -> P.Right E'Name'Stop_Paddle
  "Power Take-Off" -> P.Right E'Name'Power_Take_Off
  "Plow" -> P.Right E'Name'Plow
  "Sweeper" -> P.Right E'Name'Sweeper
  "Salter" -> P.Right E'Name'Salter
  "Boom" -> P.Right E'Name'Boom
  s -> P.Left $ "toE'Name: enum parse failure: " P.++ P.show s


-- ** E'Safe

-- | Enum of 'Text' . 
-- Whether or not this vehicle or trailer is safe to drive.
data E'Safe
  = E'Safe'Safe -- ^ @"safe"@
  | E'Safe'Unsafe -- ^ @"unsafe"@
  deriving (P.Show, P.Eq, P.Typeable, P.Ord, P.Bounded, P.Enum)

instance A.ToJSON E'Safe where toJSON = A.toJSON . fromE'Safe
instance A.FromJSON E'Safe where parseJSON o = P.either P.fail (pure . P.id) . toE'Safe =<< A.parseJSON o
instance WH.ToHttpApiData E'Safe where toQueryParam = WH.toQueryParam . fromE'Safe
instance WH.FromHttpApiData E'Safe where parseQueryParam o = WH.parseQueryParam o >>= P.left T.pack . toE'Safe
instance MimeRender MimeMultipartFormData E'Safe where mimeRender _ = mimeRenderDefaultMultipartFormData

-- | unwrap 'E'Safe' enum
fromE'Safe :: E'Safe -> Text
fromE'Safe = \case
  E'Safe'Safe -> "safe"
  E'Safe'Unsafe -> "unsafe"

-- | parse 'E'Safe' enum
toE'Safe :: Text -> P.Either String E'Safe
toE'Safe = \case
  "safe" -> P.Right E'Safe'Safe
  "unsafe" -> P.Right E'Safe'Unsafe
  s -> P.Left $ "toE'Safe: enum parse failure: " P.++ P.show s


-- ** E'Series

-- | Enum of 'Text'
data E'Series
  = E'Series'EngineState -- ^ @"engineState"@
  | E'Series'AuxInput1 -- ^ @"auxInput1"@
  | E'Series'AuxInput2 -- ^ @"auxInput2"@
  deriving (P.Show, P.Eq, P.Typeable, P.Ord, P.Bounded, P.Enum)

instance A.ToJSON E'Series where toJSON = A.toJSON . fromE'Series
instance A.FromJSON E'Series where parseJSON o = P.either P.fail (pure . P.id) . toE'Series =<< A.parseJSON o
instance WH.ToHttpApiData E'Series where toQueryParam = WH.toQueryParam . fromE'Series
instance WH.FromHttpApiData E'Series where parseQueryParam o = WH.parseQueryParam o >>= P.left T.pack . toE'Series
instance MimeRender MimeMultipartFormData E'Series where mimeRender _ = mimeRenderDefaultMultipartFormData

-- | unwrap 'E'Series' enum
fromE'Series :: E'Series -> Text
fromE'Series = \case
  E'Series'EngineState -> "engineState"
  E'Series'AuxInput1 -> "auxInput1"
  E'Series'AuxInput2 -> "auxInput2"

-- | parse 'E'Series' enum
toE'Series :: Text -> P.Either String E'Series
toE'Series = \case
  "engineState" -> P.Right E'Series'EngineState
  "auxInput1" -> P.Right E'Series'AuxInput1
  "auxInput2" -> P.Right E'Series'AuxInput2
  s -> P.Left $ "toE'Series: enum parse failure: " P.++ P.show s


-- ** E'Value

-- | Enum of 'Text'
data E'Value
  = E'Value'Running -- ^ @"Running"@
  | E'Value'Off -- ^ @"Off"@
  | E'Value'Idle -- ^ @"Idle"@
  deriving (P.Show, P.Eq, P.Typeable, P.Ord, P.Bounded, P.Enum)

instance A.ToJSON E'Value where toJSON = A.toJSON . fromE'Value
instance A.FromJSON E'Value where parseJSON o = P.either P.fail (pure . P.id) . toE'Value =<< A.parseJSON o
instance WH.ToHttpApiData E'Value where toQueryParam = WH.toQueryParam . fromE'Value
instance WH.FromHttpApiData E'Value where parseQueryParam o = WH.parseQueryParam o >>= P.left T.pack . toE'Value
instance MimeRender MimeMultipartFormData E'Value where mimeRender _ = mimeRenderDefaultMultipartFormData

-- | unwrap 'E'Value' enum
fromE'Value :: E'Value -> Text
fromE'Value = \case
  E'Value'Running -> "Running"
  E'Value'Off -> "Off"
  E'Value'Idle -> "Idle"

-- | parse 'E'Value' enum
toE'Value :: Text -> P.Either String E'Value
toE'Value = \case
  "Running" -> P.Right E'Value'Running
  "Off" -> P.Right E'Value'Off
  "Idle" -> P.Right E'Value'Idle
  s -> P.Left $ "toE'Value: enum parse failure: " P.++ P.show s


-- ** JobStatus

-- | Enum of 'Text' . 
-- The current state of the dispatch job.
data JobStatus
  = JobStatus'Unassigned -- ^ @"JobState_Unassigned"@
  | JobStatus'Scheduled -- ^ @"JobState_Scheduled"@
  | JobStatus'EnRoute -- ^ @"JobState_EnRoute"@
  | JobStatus'Arrived -- ^ @"JobState_Arrived"@
  | JobStatus'Completed -- ^ @"JobState_Completed"@
  | JobStatus'Skipped -- ^ @"JobState_Skipped"@
  deriving (P.Show, P.Eq, P.Typeable, P.Ord, P.Bounded, P.Enum)

instance A.ToJSON JobStatus where toJSON = A.toJSON . fromJobStatus
instance A.FromJSON JobStatus where parseJSON o = P.either P.fail (pure . P.id) . toJobStatus =<< A.parseJSON o
instance WH.ToHttpApiData JobStatus where toQueryParam = WH.toQueryParam . fromJobStatus
instance WH.FromHttpApiData JobStatus where parseQueryParam o = WH.parseQueryParam o >>= P.left T.pack . toJobStatus
instance MimeRender MimeMultipartFormData JobStatus where mimeRender _ = mimeRenderDefaultMultipartFormData

-- | unwrap 'JobStatus' enum
fromJobStatus :: JobStatus -> Text
fromJobStatus = \case
  JobStatus'Unassigned -> "JobState_Unassigned"
  JobStatus'Scheduled -> "JobState_Scheduled"
  JobStatus'EnRoute -> "JobState_EnRoute"
  JobStatus'Arrived -> "JobState_Arrived"
  JobStatus'Completed -> "JobState_Completed"
  JobStatus'Skipped -> "JobState_Skipped"

-- | parse 'JobStatus' enum
toJobStatus :: Text -> P.Either String JobStatus
toJobStatus = \case
  "JobState_Unassigned" -> P.Right JobStatus'Unassigned
  "JobState_Scheduled" -> P.Right JobStatus'Scheduled
  "JobState_EnRoute" -> P.Right JobStatus'EnRoute
  "JobState_Arrived" -> P.Right JobStatus'Arrived
  "JobState_Completed" -> P.Right JobStatus'Completed
  "JobState_Skipped" -> P.Right JobStatus'Skipped
  s -> P.Left $ "toJobStatus: enum parse failure: " P.++ P.show s


-- ** PrevJobStatus

-- | Enum of 'Text' . 
-- The previous state of the dispatch job.
data PrevJobStatus
  = PrevJobStatus'Unassigned -- ^ @"JobState_Unassigned"@
  | PrevJobStatus'Scheduled -- ^ @"JobState_Scheduled"@
  | PrevJobStatus'EnRoute -- ^ @"JobState_EnRoute"@
  | PrevJobStatus'Arrived -- ^ @"JobState_Arrived"@
  | PrevJobStatus'Completed -- ^ @"JobState_Completed"@
  | PrevJobStatus'Skipped -- ^ @"JobState_Skipped"@
  deriving (P.Show, P.Eq, P.Typeable, P.Ord, P.Bounded, P.Enum)

instance A.ToJSON PrevJobStatus where toJSON = A.toJSON . fromPrevJobStatus
instance A.FromJSON PrevJobStatus where parseJSON o = P.either P.fail (pure . P.id) . toPrevJobStatus =<< A.parseJSON o
instance WH.ToHttpApiData PrevJobStatus where toQueryParam = WH.toQueryParam . fromPrevJobStatus
instance WH.FromHttpApiData PrevJobStatus where parseQueryParam o = WH.parseQueryParam o >>= P.left T.pack . toPrevJobStatus
instance MimeRender MimeMultipartFormData PrevJobStatus where mimeRender _ = mimeRenderDefaultMultipartFormData

-- | unwrap 'PrevJobStatus' enum
fromPrevJobStatus :: PrevJobStatus -> Text
fromPrevJobStatus = \case
  PrevJobStatus'Unassigned -> "JobState_Unassigned"
  PrevJobStatus'Scheduled -> "JobState_Scheduled"
  PrevJobStatus'EnRoute -> "JobState_EnRoute"
  PrevJobStatus'Arrived -> "JobState_Arrived"
  PrevJobStatus'Completed -> "JobState_Completed"
  PrevJobStatus'Skipped -> "JobState_Skipped"

-- | parse 'PrevJobStatus' enum
toPrevJobStatus :: Text -> P.Either String PrevJobStatus
toPrevJobStatus = \case
  "JobState_Unassigned" -> P.Right PrevJobStatus'Unassigned
  "JobState_Scheduled" -> P.Right PrevJobStatus'Scheduled
  "JobState_EnRoute" -> P.Right PrevJobStatus'EnRoute
  "JobState_Arrived" -> P.Right PrevJobStatus'Arrived
  "JobState_Completed" -> P.Right PrevJobStatus'Completed
  "JobState_Skipped" -> P.Right PrevJobStatus'Skipped
  s -> P.Left $ "toPrevJobStatus: enum parse failure: " P.++ P.show s



