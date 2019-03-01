{-
   Samsara API

   # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).

   OpenAPI Version: 3.0.1
   Samsara API API version: 1.0.0
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : Samsara.Lens
-}

{-# LANGUAGE KindSignatures #-}
{-# LANGUAGE NamedFieldPuns #-}
{-# LANGUAGE RankNTypes #-}
{-# LANGUAGE RecordWildCards #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-matches -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Samsara.ModelLens where

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Data, Typeable)
import qualified Data.Map as Map
import qualified Data.Set as Set
import qualified Data.Time as TI

import Data.Text (Text)

import Prelude (($), (.),(<$>),(<*>),(=<<),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

import Samsara.Model
import Samsara.Core


-- * Address

-- | 'addressContacts' Lens
addressContactsL :: Lens_' Address (Maybe [Contact])
addressContactsL f Address{..} = (\addressContacts -> Address { addressContacts, ..} ) <$> f addressContacts
{-# INLINE addressContactsL #-}

-- | 'addressFormattedAddress' Lens
addressFormattedAddressL :: Lens_' Address (Maybe Text)
addressFormattedAddressL f Address{..} = (\addressFormattedAddress -> Address { addressFormattedAddress, ..} ) <$> f addressFormattedAddress
{-# INLINE addressFormattedAddressL #-}

-- | 'addressGeofence' Lens
addressGeofenceL :: Lens_' Address (Maybe AddressGeofence)
addressGeofenceL f Address{..} = (\addressGeofence -> Address { addressGeofence, ..} ) <$> f addressGeofence
{-# INLINE addressGeofenceL #-}

-- | 'addressId' Lens
addressIdL :: Lens_' Address (Maybe Integer)
addressIdL f Address{..} = (\addressId -> Address { addressId, ..} ) <$> f addressId
{-# INLINE addressIdL #-}

-- | 'addressName' Lens
addressNameL :: Lens_' Address (Maybe Text)
addressNameL f Address{..} = (\addressName -> Address { addressName, ..} ) <$> f addressName
{-# INLINE addressNameL #-}

-- | 'addressNotes' Lens
addressNotesL :: Lens_' Address (Maybe Text)
addressNotesL f Address{..} = (\addressNotes -> Address { addressNotes, ..} ) <$> f addressNotes
{-# INLINE addressNotesL #-}

-- | 'addressTags' Lens
addressTagsL :: Lens_' Address (Maybe [TagMetadata])
addressTagsL f Address{..} = (\addressTags -> Address { addressTags, ..} ) <$> f addressTags
{-# INLINE addressTagsL #-}



-- * AddressGeofence

-- | 'addressGeofenceCircle' Lens
addressGeofenceCircleL :: Lens_' AddressGeofence (Maybe AddressGeofenceCircle)
addressGeofenceCircleL f AddressGeofence{..} = (\addressGeofenceCircle -> AddressGeofence { addressGeofenceCircle, ..} ) <$> f addressGeofenceCircle
{-# INLINE addressGeofenceCircleL #-}

-- | 'addressGeofencePolygon' Lens
addressGeofencePolygonL :: Lens_' AddressGeofence (Maybe AddressGeofencePolygon)
addressGeofencePolygonL f AddressGeofence{..} = (\addressGeofencePolygon -> AddressGeofence { addressGeofencePolygon, ..} ) <$> f addressGeofencePolygon
{-# INLINE addressGeofencePolygonL #-}



-- * AddressGeofenceCircle

-- | 'addressGeofenceCircleLatitude' Lens
addressGeofenceCircleLatitudeL :: Lens_' AddressGeofenceCircle (Maybe Double)
addressGeofenceCircleLatitudeL f AddressGeofenceCircle{..} = (\addressGeofenceCircleLatitude -> AddressGeofenceCircle { addressGeofenceCircleLatitude, ..} ) <$> f addressGeofenceCircleLatitude
{-# INLINE addressGeofenceCircleLatitudeL #-}

-- | 'addressGeofenceCircleRadiusMeters' Lens
addressGeofenceCircleRadiusMetersL :: Lens_' AddressGeofenceCircle (Maybe Integer)
addressGeofenceCircleRadiusMetersL f AddressGeofenceCircle{..} = (\addressGeofenceCircleRadiusMeters -> AddressGeofenceCircle { addressGeofenceCircleRadiusMeters, ..} ) <$> f addressGeofenceCircleRadiusMeters
{-# INLINE addressGeofenceCircleRadiusMetersL #-}

-- | 'addressGeofenceCircleLongitude' Lens
addressGeofenceCircleLongitudeL :: Lens_' AddressGeofenceCircle (Maybe Double)
addressGeofenceCircleLongitudeL f AddressGeofenceCircle{..} = (\addressGeofenceCircleLongitude -> AddressGeofenceCircle { addressGeofenceCircleLongitude, ..} ) <$> f addressGeofenceCircleLongitude
{-# INLINE addressGeofenceCircleLongitudeL #-}



-- * AddressGeofencePolygon

-- | 'addressGeofencePolygonVertices' Lens
addressGeofencePolygonVerticesL :: Lens_' AddressGeofencePolygon (Maybe [AddressGeofencePolygonVertices])
addressGeofencePolygonVerticesL f AddressGeofencePolygon{..} = (\addressGeofencePolygonVertices -> AddressGeofencePolygon { addressGeofencePolygonVertices, ..} ) <$> f addressGeofencePolygonVertices
{-# INLINE addressGeofencePolygonVerticesL #-}



-- * AddressGeofencePolygonVertices

-- | 'addressGeofencePolygonVerticesLatitude' Lens
addressGeofencePolygonVerticesLatitudeL :: Lens_' AddressGeofencePolygonVertices (Maybe Double)
addressGeofencePolygonVerticesLatitudeL f AddressGeofencePolygonVertices{..} = (\addressGeofencePolygonVerticesLatitude -> AddressGeofencePolygonVertices { addressGeofencePolygonVerticesLatitude, ..} ) <$> f addressGeofencePolygonVerticesLatitude
{-# INLINE addressGeofencePolygonVerticesLatitudeL #-}

-- | 'addressGeofencePolygonVerticesLongitude' Lens
addressGeofencePolygonVerticesLongitudeL :: Lens_' AddressGeofencePolygonVertices (Maybe Double)
addressGeofencePolygonVerticesLongitudeL f AddressGeofencePolygonVertices{..} = (\addressGeofencePolygonVerticesLongitude -> AddressGeofencePolygonVertices { addressGeofencePolygonVerticesLongitude, ..} ) <$> f addressGeofencePolygonVerticesLongitude
{-# INLINE addressGeofencePolygonVerticesLongitudeL #-}



-- * AddressesAddresses

-- | 'addressesAddressesNotes' Lens
addressesAddressesNotesL :: Lens_' AddressesAddresses (Maybe Text)
addressesAddressesNotesL f AddressesAddresses{..} = (\addressesAddressesNotes -> AddressesAddresses { addressesAddressesNotes, ..} ) <$> f addressesAddressesNotes
{-# INLINE addressesAddressesNotesL #-}

-- | 'addressesAddressesFormattedAddress' Lens
addressesAddressesFormattedAddressL :: Lens_' AddressesAddresses (Text)
addressesAddressesFormattedAddressL f AddressesAddresses{..} = (\addressesAddressesFormattedAddress -> AddressesAddresses { addressesAddressesFormattedAddress, ..} ) <$> f addressesAddressesFormattedAddress
{-# INLINE addressesAddressesFormattedAddressL #-}

-- | 'addressesAddressesGeofence' Lens
addressesAddressesGeofenceL :: Lens_' AddressesAddresses (AddressGeofence)
addressesAddressesGeofenceL f AddressesAddresses{..} = (\addressesAddressesGeofence -> AddressesAddresses { addressesAddressesGeofence, ..} ) <$> f addressesAddressesGeofence
{-# INLINE addressesAddressesGeofenceL #-}

-- | 'addressesAddressesTagIds' Lens
addressesAddressesTagIdsL :: Lens_' AddressesAddresses (Maybe [Integer])
addressesAddressesTagIdsL f AddressesAddresses{..} = (\addressesAddressesTagIds -> AddressesAddresses { addressesAddressesTagIds, ..} ) <$> f addressesAddressesTagIds
{-# INLINE addressesAddressesTagIdsL #-}

-- | 'addressesAddressesName' Lens
addressesAddressesNameL :: Lens_' AddressesAddresses (Text)
addressesAddressesNameL f AddressesAddresses{..} = (\addressesAddressesName -> AddressesAddresses { addressesAddressesName, ..} ) <$> f addressesAddressesName
{-# INLINE addressesAddressesNameL #-}

-- | 'addressesAddressesContactIds' Lens
addressesAddressesContactIdsL :: Lens_' AddressesAddresses (Maybe [Integer])
addressesAddressesContactIdsL f AddressesAddresses{..} = (\addressesAddressesContactIds -> AddressesAddresses { addressesAddressesContactIds, ..} ) <$> f addressesAddressesContactIds
{-# INLINE addressesAddressesContactIdsL #-}



-- * AllRouteJobUpdates

-- | 'allRouteJobUpdatesJobUpdates' Lens
allRouteJobUpdatesJobUpdatesL :: Lens_' AllRouteJobUpdates (Maybe [JobUpdateObject])
allRouteJobUpdatesJobUpdatesL f AllRouteJobUpdates{..} = (\allRouteJobUpdatesJobUpdates -> AllRouteJobUpdates { allRouteJobUpdatesJobUpdates, ..} ) <$> f allRouteJobUpdatesJobUpdates
{-# INLINE allRouteJobUpdatesJobUpdatesL #-}

-- | 'allRouteJobUpdatesSequenceId' Lens
allRouteJobUpdatesSequenceIdL :: Lens_' AllRouteJobUpdates (Maybe Text)
allRouteJobUpdatesSequenceIdL f AllRouteJobUpdates{..} = (\allRouteJobUpdatesSequenceId -> AllRouteJobUpdates { allRouteJobUpdatesSequenceId, ..} ) <$> f allRouteJobUpdatesSequenceId
{-# INLINE allRouteJobUpdatesSequenceIdL #-}



-- * Asset

-- | 'assetAssetSerialNumber' Lens
assetAssetSerialNumberL :: Lens_' Asset (Maybe Text)
assetAssetSerialNumberL f Asset{..} = (\assetAssetSerialNumber -> Asset { assetAssetSerialNumber, ..} ) <$> f assetAssetSerialNumber
{-# INLINE assetAssetSerialNumberL #-}

-- | 'assetCable' Lens
assetCableL :: Lens_' Asset (Maybe [AssetCable])
assetCableL f Asset{..} = (\assetCable -> Asset { assetCable, ..} ) <$> f assetCable
{-# INLINE assetCableL #-}

-- | 'assetEngineHours' Lens
assetEngineHoursL :: Lens_' Asset (Maybe Int)
assetEngineHoursL f Asset{..} = (\assetEngineHours -> Asset { assetEngineHours, ..} ) <$> f assetEngineHours
{-# INLINE assetEngineHoursL #-}

-- | 'assetId' Lens
assetIdL :: Lens_' Asset (Integer)
assetIdL f Asset{..} = (\assetId -> Asset { assetId, ..} ) <$> f assetId
{-# INLINE assetIdL #-}

-- | 'assetName' Lens
assetNameL :: Lens_' Asset (Maybe Text)
assetNameL f Asset{..} = (\assetName -> Asset { assetName, ..} ) <$> f assetName
{-# INLINE assetNameL #-}



-- * AssetCable

-- | 'assetCableAssetType' Lens
assetCableAssetTypeL :: Lens_' AssetCable (Maybe Text)
assetCableAssetTypeL f AssetCable{..} = (\assetCableAssetType -> AssetCable { assetCableAssetType, ..} ) <$> f assetCableAssetType
{-# INLINE assetCableAssetTypeL #-}



-- * AssetCurrentLocation

-- | 'assetCurrentLocationLatitude' Lens
assetCurrentLocationLatitudeL :: Lens_' AssetCurrentLocation (Maybe Double)
assetCurrentLocationLatitudeL f AssetCurrentLocation{..} = (\assetCurrentLocationLatitude -> AssetCurrentLocation { assetCurrentLocationLatitude, ..} ) <$> f assetCurrentLocationLatitude
{-# INLINE assetCurrentLocationLatitudeL #-}

-- | 'assetCurrentLocationLocation' Lens
assetCurrentLocationLocationL :: Lens_' AssetCurrentLocation (Maybe Text)
assetCurrentLocationLocationL f AssetCurrentLocation{..} = (\assetCurrentLocationLocation -> AssetCurrentLocation { assetCurrentLocationLocation, ..} ) <$> f assetCurrentLocationLocation
{-# INLINE assetCurrentLocationLocationL #-}

-- | 'assetCurrentLocationLongitude' Lens
assetCurrentLocationLongitudeL :: Lens_' AssetCurrentLocation (Maybe Double)
assetCurrentLocationLongitudeL f AssetCurrentLocation{..} = (\assetCurrentLocationLongitude -> AssetCurrentLocation { assetCurrentLocationLongitude, ..} ) <$> f assetCurrentLocationLongitude
{-# INLINE assetCurrentLocationLongitudeL #-}

-- | 'assetCurrentLocationSpeedMilesPerHour' Lens
assetCurrentLocationSpeedMilesPerHourL :: Lens_' AssetCurrentLocation (Maybe Double)
assetCurrentLocationSpeedMilesPerHourL f AssetCurrentLocation{..} = (\assetCurrentLocationSpeedMilesPerHour -> AssetCurrentLocation { assetCurrentLocationSpeedMilesPerHour, ..} ) <$> f assetCurrentLocationSpeedMilesPerHour
{-# INLINE assetCurrentLocationSpeedMilesPerHourL #-}

-- | 'assetCurrentLocationTimeMs' Lens
assetCurrentLocationTimeMsL :: Lens_' AssetCurrentLocation (Maybe Integer)
assetCurrentLocationTimeMsL f AssetCurrentLocation{..} = (\assetCurrentLocationTimeMs -> AssetCurrentLocation { assetCurrentLocationTimeMs, ..} ) <$> f assetCurrentLocationTimeMs
{-# INLINE assetCurrentLocationTimeMsL #-}



-- * AssetCurrentLocationsResponse

-- | 'assetCurrentLocationsResponseCable' Lens
assetCurrentLocationsResponseCableL :: Lens_' AssetCurrentLocationsResponse (Maybe [AssetCable])
assetCurrentLocationsResponseCableL f AssetCurrentLocationsResponse{..} = (\assetCurrentLocationsResponseCable -> AssetCurrentLocationsResponse { assetCurrentLocationsResponseCable, ..} ) <$> f assetCurrentLocationsResponseCable
{-# INLINE assetCurrentLocationsResponseCableL #-}

-- | 'assetCurrentLocationsResponseEngineHours' Lens
assetCurrentLocationsResponseEngineHoursL :: Lens_' AssetCurrentLocationsResponse (Maybe Int)
assetCurrentLocationsResponseEngineHoursL f AssetCurrentLocationsResponse{..} = (\assetCurrentLocationsResponseEngineHours -> AssetCurrentLocationsResponse { assetCurrentLocationsResponseEngineHours, ..} ) <$> f assetCurrentLocationsResponseEngineHours
{-# INLINE assetCurrentLocationsResponseEngineHoursL #-}

-- | 'assetCurrentLocationsResponseId' Lens
assetCurrentLocationsResponseIdL :: Lens_' AssetCurrentLocationsResponse (Integer)
assetCurrentLocationsResponseIdL f AssetCurrentLocationsResponse{..} = (\assetCurrentLocationsResponseId -> AssetCurrentLocationsResponse { assetCurrentLocationsResponseId, ..} ) <$> f assetCurrentLocationsResponseId
{-# INLINE assetCurrentLocationsResponseIdL #-}

-- | 'assetCurrentLocationsResponseLocation' Lens
assetCurrentLocationsResponseLocationL :: Lens_' AssetCurrentLocationsResponse (Maybe [AssetCurrentLocation])
assetCurrentLocationsResponseLocationL f AssetCurrentLocationsResponse{..} = (\assetCurrentLocationsResponseLocation -> AssetCurrentLocationsResponse { assetCurrentLocationsResponseLocation, ..} ) <$> f assetCurrentLocationsResponseLocation
{-# INLINE assetCurrentLocationsResponseLocationL #-}

-- | 'assetCurrentLocationsResponseName' Lens
assetCurrentLocationsResponseNameL :: Lens_' AssetCurrentLocationsResponse (Maybe Text)
assetCurrentLocationsResponseNameL f AssetCurrentLocationsResponse{..} = (\assetCurrentLocationsResponseName -> AssetCurrentLocationsResponse { assetCurrentLocationsResponseName, ..} ) <$> f assetCurrentLocationsResponseName
{-# INLINE assetCurrentLocationsResponseNameL #-}



-- * AssetReeferResponse

-- | 'assetReeferResponseAssetType' Lens
assetReeferResponseAssetTypeL :: Lens_' AssetReeferResponse (Maybe Text)
assetReeferResponseAssetTypeL f AssetReeferResponse{..} = (\assetReeferResponseAssetType -> AssetReeferResponse { assetReeferResponseAssetType, ..} ) <$> f assetReeferResponseAssetType
{-# INLINE assetReeferResponseAssetTypeL #-}

-- | 'assetReeferResponseId' Lens
assetReeferResponseIdL :: Lens_' AssetReeferResponse (Maybe Int)
assetReeferResponseIdL f AssetReeferResponse{..} = (\assetReeferResponseId -> AssetReeferResponse { assetReeferResponseId, ..} ) <$> f assetReeferResponseId
{-# INLINE assetReeferResponseIdL #-}

-- | 'assetReeferResponseName' Lens
assetReeferResponseNameL :: Lens_' AssetReeferResponse (Maybe Text)
assetReeferResponseNameL f AssetReeferResponse{..} = (\assetReeferResponseName -> AssetReeferResponse { assetReeferResponseName, ..} ) <$> f assetReeferResponseName
{-# INLINE assetReeferResponseNameL #-}

-- | 'assetReeferResponseReeferStats' Lens
assetReeferResponseReeferStatsL :: Lens_' AssetReeferResponse (Maybe AssetReeferResponseReeferStats)
assetReeferResponseReeferStatsL f AssetReeferResponse{..} = (\assetReeferResponseReeferStats -> AssetReeferResponse { assetReeferResponseReeferStats, ..} ) <$> f assetReeferResponseReeferStats
{-# INLINE assetReeferResponseReeferStatsL #-}



-- * AssetReeferResponseReeferStats

-- | 'assetReeferResponseReeferStatsFuelPercentage' Lens
assetReeferResponseReeferStatsFuelPercentageL :: Lens_' AssetReeferResponseReeferStats (Maybe [AssetReeferResponseReeferStatsFuelPercentage])
assetReeferResponseReeferStatsFuelPercentageL f AssetReeferResponseReeferStats{..} = (\assetReeferResponseReeferStatsFuelPercentage -> AssetReeferResponseReeferStats { assetReeferResponseReeferStatsFuelPercentage, ..} ) <$> f assetReeferResponseReeferStatsFuelPercentage
{-# INLINE assetReeferResponseReeferStatsFuelPercentageL #-}

-- | 'assetReeferResponseReeferStatsPowerStatus' Lens
assetReeferResponseReeferStatsPowerStatusL :: Lens_' AssetReeferResponseReeferStats (Maybe [AssetReeferResponseReeferStatsPowerStatus])
assetReeferResponseReeferStatsPowerStatusL f AssetReeferResponseReeferStats{..} = (\assetReeferResponseReeferStatsPowerStatus -> AssetReeferResponseReeferStats { assetReeferResponseReeferStatsPowerStatus, ..} ) <$> f assetReeferResponseReeferStatsPowerStatus
{-# INLINE assetReeferResponseReeferStatsPowerStatusL #-}

-- | 'assetReeferResponseReeferStatsEngineHours' Lens
assetReeferResponseReeferStatsEngineHoursL :: Lens_' AssetReeferResponseReeferStats (Maybe [AssetReeferResponseReeferStatsEngineHours])
assetReeferResponseReeferStatsEngineHoursL f AssetReeferResponseReeferStats{..} = (\assetReeferResponseReeferStatsEngineHours -> AssetReeferResponseReeferStats { assetReeferResponseReeferStatsEngineHours, ..} ) <$> f assetReeferResponseReeferStatsEngineHours
{-# INLINE assetReeferResponseReeferStatsEngineHoursL #-}

-- | 'assetReeferResponseReeferStatsSetPoint' Lens
assetReeferResponseReeferStatsSetPointL :: Lens_' AssetReeferResponseReeferStats (Maybe [AssetReeferResponseReeferStatsSetPoint])
assetReeferResponseReeferStatsSetPointL f AssetReeferResponseReeferStats{..} = (\assetReeferResponseReeferStatsSetPoint -> AssetReeferResponseReeferStats { assetReeferResponseReeferStatsSetPoint, ..} ) <$> f assetReeferResponseReeferStatsSetPoint
{-# INLINE assetReeferResponseReeferStatsSetPointL #-}

-- | 'assetReeferResponseReeferStatsReturnAirTemp' Lens
assetReeferResponseReeferStatsReturnAirTempL :: Lens_' AssetReeferResponseReeferStats (Maybe [AssetReeferResponseReeferStatsReturnAirTemp])
assetReeferResponseReeferStatsReturnAirTempL f AssetReeferResponseReeferStats{..} = (\assetReeferResponseReeferStatsReturnAirTemp -> AssetReeferResponseReeferStats { assetReeferResponseReeferStatsReturnAirTemp, ..} ) <$> f assetReeferResponseReeferStatsReturnAirTemp
{-# INLINE assetReeferResponseReeferStatsReturnAirTempL #-}

-- | 'assetReeferResponseReeferStatsAlarms' Lens
assetReeferResponseReeferStatsAlarmsL :: Lens_' AssetReeferResponseReeferStats (Maybe [AssetReeferResponseReeferStatsAlarms1])
assetReeferResponseReeferStatsAlarmsL f AssetReeferResponseReeferStats{..} = (\assetReeferResponseReeferStatsAlarms -> AssetReeferResponseReeferStats { assetReeferResponseReeferStatsAlarms, ..} ) <$> f assetReeferResponseReeferStatsAlarms
{-# INLINE assetReeferResponseReeferStatsAlarmsL #-}



-- * AssetReeferResponseReeferStatsAlarms

-- | 'assetReeferResponseReeferStatsAlarmsSeverity' Lens
assetReeferResponseReeferStatsAlarmsSeverityL :: Lens_' AssetReeferResponseReeferStatsAlarms (Maybe Integer)
assetReeferResponseReeferStatsAlarmsSeverityL f AssetReeferResponseReeferStatsAlarms{..} = (\assetReeferResponseReeferStatsAlarmsSeverity -> AssetReeferResponseReeferStatsAlarms { assetReeferResponseReeferStatsAlarmsSeverity, ..} ) <$> f assetReeferResponseReeferStatsAlarmsSeverity
{-# INLINE assetReeferResponseReeferStatsAlarmsSeverityL #-}

-- | 'assetReeferResponseReeferStatsAlarmsOperatorAction' Lens
assetReeferResponseReeferStatsAlarmsOperatorActionL :: Lens_' AssetReeferResponseReeferStatsAlarms (Maybe Text)
assetReeferResponseReeferStatsAlarmsOperatorActionL f AssetReeferResponseReeferStatsAlarms{..} = (\assetReeferResponseReeferStatsAlarmsOperatorAction -> AssetReeferResponseReeferStatsAlarms { assetReeferResponseReeferStatsAlarmsOperatorAction, ..} ) <$> f assetReeferResponseReeferStatsAlarmsOperatorAction
{-# INLINE assetReeferResponseReeferStatsAlarmsOperatorActionL #-}

-- | 'assetReeferResponseReeferStatsAlarmsDescription' Lens
assetReeferResponseReeferStatsAlarmsDescriptionL :: Lens_' AssetReeferResponseReeferStatsAlarms (Maybe Text)
assetReeferResponseReeferStatsAlarmsDescriptionL f AssetReeferResponseReeferStatsAlarms{..} = (\assetReeferResponseReeferStatsAlarmsDescription -> AssetReeferResponseReeferStatsAlarms { assetReeferResponseReeferStatsAlarmsDescription, ..} ) <$> f assetReeferResponseReeferStatsAlarmsDescription
{-# INLINE assetReeferResponseReeferStatsAlarmsDescriptionL #-}

-- | 'assetReeferResponseReeferStatsAlarmsAlarmCode' Lens
assetReeferResponseReeferStatsAlarmsAlarmCodeL :: Lens_' AssetReeferResponseReeferStatsAlarms (Maybe Integer)
assetReeferResponseReeferStatsAlarmsAlarmCodeL f AssetReeferResponseReeferStatsAlarms{..} = (\assetReeferResponseReeferStatsAlarmsAlarmCode -> AssetReeferResponseReeferStatsAlarms { assetReeferResponseReeferStatsAlarmsAlarmCode, ..} ) <$> f assetReeferResponseReeferStatsAlarmsAlarmCode
{-# INLINE assetReeferResponseReeferStatsAlarmsAlarmCodeL #-}



-- * AssetReeferResponseReeferStatsAlarms1

-- | 'assetReeferResponseReeferStatsAlarms1Alarms' Lens
assetReeferResponseReeferStatsAlarms1AlarmsL :: Lens_' AssetReeferResponseReeferStatsAlarms1 (Maybe [AssetReeferResponseReeferStatsAlarms])
assetReeferResponseReeferStatsAlarms1AlarmsL f AssetReeferResponseReeferStatsAlarms1{..} = (\assetReeferResponseReeferStatsAlarms1Alarms -> AssetReeferResponseReeferStatsAlarms1 { assetReeferResponseReeferStatsAlarms1Alarms, ..} ) <$> f assetReeferResponseReeferStatsAlarms1Alarms
{-# INLINE assetReeferResponseReeferStatsAlarms1AlarmsL #-}

-- | 'assetReeferResponseReeferStatsAlarms1ChangedAtMs' Lens
assetReeferResponseReeferStatsAlarms1ChangedAtMsL :: Lens_' AssetReeferResponseReeferStatsAlarms1 (Maybe Integer)
assetReeferResponseReeferStatsAlarms1ChangedAtMsL f AssetReeferResponseReeferStatsAlarms1{..} = (\assetReeferResponseReeferStatsAlarms1ChangedAtMs -> AssetReeferResponseReeferStatsAlarms1 { assetReeferResponseReeferStatsAlarms1ChangedAtMs, ..} ) <$> f assetReeferResponseReeferStatsAlarms1ChangedAtMs
{-# INLINE assetReeferResponseReeferStatsAlarms1ChangedAtMsL #-}



-- * AssetReeferResponseReeferStatsEngineHours

-- | 'assetReeferResponseReeferStatsEngineHoursEngineHours' Lens
assetReeferResponseReeferStatsEngineHoursEngineHoursL :: Lens_' AssetReeferResponseReeferStatsEngineHours (Maybe Integer)
assetReeferResponseReeferStatsEngineHoursEngineHoursL f AssetReeferResponseReeferStatsEngineHours{..} = (\assetReeferResponseReeferStatsEngineHoursEngineHours -> AssetReeferResponseReeferStatsEngineHours { assetReeferResponseReeferStatsEngineHoursEngineHours, ..} ) <$> f assetReeferResponseReeferStatsEngineHoursEngineHours
{-# INLINE assetReeferResponseReeferStatsEngineHoursEngineHoursL #-}

-- | 'assetReeferResponseReeferStatsEngineHoursChangedAtMs' Lens
assetReeferResponseReeferStatsEngineHoursChangedAtMsL :: Lens_' AssetReeferResponseReeferStatsEngineHours (Maybe Integer)
assetReeferResponseReeferStatsEngineHoursChangedAtMsL f AssetReeferResponseReeferStatsEngineHours{..} = (\assetReeferResponseReeferStatsEngineHoursChangedAtMs -> AssetReeferResponseReeferStatsEngineHours { assetReeferResponseReeferStatsEngineHoursChangedAtMs, ..} ) <$> f assetReeferResponseReeferStatsEngineHoursChangedAtMs
{-# INLINE assetReeferResponseReeferStatsEngineHoursChangedAtMsL #-}



-- * AssetReeferResponseReeferStatsFuelPercentage

-- | 'assetReeferResponseReeferStatsFuelPercentageFuelPercentage' Lens
assetReeferResponseReeferStatsFuelPercentageFuelPercentageL :: Lens_' AssetReeferResponseReeferStatsFuelPercentage (Maybe Integer)
assetReeferResponseReeferStatsFuelPercentageFuelPercentageL f AssetReeferResponseReeferStatsFuelPercentage{..} = (\assetReeferResponseReeferStatsFuelPercentageFuelPercentage -> AssetReeferResponseReeferStatsFuelPercentage { assetReeferResponseReeferStatsFuelPercentageFuelPercentage, ..} ) <$> f assetReeferResponseReeferStatsFuelPercentageFuelPercentage
{-# INLINE assetReeferResponseReeferStatsFuelPercentageFuelPercentageL #-}

-- | 'assetReeferResponseReeferStatsFuelPercentageChangedAtMs' Lens
assetReeferResponseReeferStatsFuelPercentageChangedAtMsL :: Lens_' AssetReeferResponseReeferStatsFuelPercentage (Maybe Integer)
assetReeferResponseReeferStatsFuelPercentageChangedAtMsL f AssetReeferResponseReeferStatsFuelPercentage{..} = (\assetReeferResponseReeferStatsFuelPercentageChangedAtMs -> AssetReeferResponseReeferStatsFuelPercentage { assetReeferResponseReeferStatsFuelPercentageChangedAtMs, ..} ) <$> f assetReeferResponseReeferStatsFuelPercentageChangedAtMs
{-# INLINE assetReeferResponseReeferStatsFuelPercentageChangedAtMsL #-}



-- * AssetReeferResponseReeferStatsPowerStatus

-- | 'assetReeferResponseReeferStatsPowerStatusChangedAtMs' Lens
assetReeferResponseReeferStatsPowerStatusChangedAtMsL :: Lens_' AssetReeferResponseReeferStatsPowerStatus (Maybe Integer)
assetReeferResponseReeferStatsPowerStatusChangedAtMsL f AssetReeferResponseReeferStatsPowerStatus{..} = (\assetReeferResponseReeferStatsPowerStatusChangedAtMs -> AssetReeferResponseReeferStatsPowerStatus { assetReeferResponseReeferStatsPowerStatusChangedAtMs, ..} ) <$> f assetReeferResponseReeferStatsPowerStatusChangedAtMs
{-# INLINE assetReeferResponseReeferStatsPowerStatusChangedAtMsL #-}

-- | 'assetReeferResponseReeferStatsPowerStatusStatus' Lens
assetReeferResponseReeferStatsPowerStatusStatusL :: Lens_' AssetReeferResponseReeferStatsPowerStatus (Maybe Text)
assetReeferResponseReeferStatsPowerStatusStatusL f AssetReeferResponseReeferStatsPowerStatus{..} = (\assetReeferResponseReeferStatsPowerStatusStatus -> AssetReeferResponseReeferStatsPowerStatus { assetReeferResponseReeferStatsPowerStatusStatus, ..} ) <$> f assetReeferResponseReeferStatsPowerStatusStatus
{-# INLINE assetReeferResponseReeferStatsPowerStatusStatusL #-}



-- * AssetReeferResponseReeferStatsReturnAirTemp

-- | 'assetReeferResponseReeferStatsReturnAirTempTempInMilliC' Lens
assetReeferResponseReeferStatsReturnAirTempTempInMilliCL :: Lens_' AssetReeferResponseReeferStatsReturnAirTemp (Maybe Integer)
assetReeferResponseReeferStatsReturnAirTempTempInMilliCL f AssetReeferResponseReeferStatsReturnAirTemp{..} = (\assetReeferResponseReeferStatsReturnAirTempTempInMilliC -> AssetReeferResponseReeferStatsReturnAirTemp { assetReeferResponseReeferStatsReturnAirTempTempInMilliC, ..} ) <$> f assetReeferResponseReeferStatsReturnAirTempTempInMilliC
{-# INLINE assetReeferResponseReeferStatsReturnAirTempTempInMilliCL #-}

-- | 'assetReeferResponseReeferStatsReturnAirTempChangedAtMs' Lens
assetReeferResponseReeferStatsReturnAirTempChangedAtMsL :: Lens_' AssetReeferResponseReeferStatsReturnAirTemp (Maybe Integer)
assetReeferResponseReeferStatsReturnAirTempChangedAtMsL f AssetReeferResponseReeferStatsReturnAirTemp{..} = (\assetReeferResponseReeferStatsReturnAirTempChangedAtMs -> AssetReeferResponseReeferStatsReturnAirTemp { assetReeferResponseReeferStatsReturnAirTempChangedAtMs, ..} ) <$> f assetReeferResponseReeferStatsReturnAirTempChangedAtMs
{-# INLINE assetReeferResponseReeferStatsReturnAirTempChangedAtMsL #-}



-- * AssetReeferResponseReeferStatsSetPoint

-- | 'assetReeferResponseReeferStatsSetPointTempInMilliC' Lens
assetReeferResponseReeferStatsSetPointTempInMilliCL :: Lens_' AssetReeferResponseReeferStatsSetPoint (Maybe Integer)
assetReeferResponseReeferStatsSetPointTempInMilliCL f AssetReeferResponseReeferStatsSetPoint{..} = (\assetReeferResponseReeferStatsSetPointTempInMilliC -> AssetReeferResponseReeferStatsSetPoint { assetReeferResponseReeferStatsSetPointTempInMilliC, ..} ) <$> f assetReeferResponseReeferStatsSetPointTempInMilliC
{-# INLINE assetReeferResponseReeferStatsSetPointTempInMilliCL #-}

-- | 'assetReeferResponseReeferStatsSetPointChangedAtMs' Lens
assetReeferResponseReeferStatsSetPointChangedAtMsL :: Lens_' AssetReeferResponseReeferStatsSetPoint (Maybe Integer)
assetReeferResponseReeferStatsSetPointChangedAtMsL f AssetReeferResponseReeferStatsSetPoint{..} = (\assetReeferResponseReeferStatsSetPointChangedAtMs -> AssetReeferResponseReeferStatsSetPoint { assetReeferResponseReeferStatsSetPointChangedAtMs, ..} ) <$> f assetReeferResponseReeferStatsSetPointChangedAtMs
{-# INLINE assetReeferResponseReeferStatsSetPointChangedAtMsL #-}



-- * AuxInput

-- | 'auxInputTimeMs' Lens
auxInputTimeMsL :: Lens_' AuxInput (A.Value)
auxInputTimeMsL f AuxInput{..} = (\auxInputTimeMs -> AuxInput { auxInputTimeMs, ..} ) <$> f auxInputTimeMs
{-# INLINE auxInputTimeMsL #-}

-- | 'auxInputValue' Lens
auxInputValueL :: Lens_' AuxInput (Bool)
auxInputValueL f AuxInput{..} = (\auxInputValue -> AuxInput { auxInputValue, ..} ) <$> f auxInputValue
{-# INLINE auxInputValueL #-}



-- * AuxInputSeries

-- | 'auxInputSeriesName' Lens
auxInputSeriesNameL :: Lens_' AuxInputSeries (E'Name)
auxInputSeriesNameL f AuxInputSeries{..} = (\auxInputSeriesName -> AuxInputSeries { auxInputSeriesName, ..} ) <$> f auxInputSeriesName
{-# INLINE auxInputSeriesNameL #-}

-- | 'auxInputSeriesValues' Lens
auxInputSeriesValuesL :: Lens_' AuxInputSeries ([AuxInput])
auxInputSeriesValuesL f AuxInputSeries{..} = (\auxInputSeriesValues -> AuxInputSeries { auxInputSeriesValues, ..} ) <$> f auxInputSeriesValues
{-# INLINE auxInputSeriesValuesL #-}



-- * CargoResponse

-- | 'cargoResponseGroupId' Lens
cargoResponseGroupIdL :: Lens_' CargoResponse (Maybe Integer)
cargoResponseGroupIdL f CargoResponse{..} = (\cargoResponseGroupId -> CargoResponse { cargoResponseGroupId, ..} ) <$> f cargoResponseGroupId
{-# INLINE cargoResponseGroupIdL #-}

-- | 'cargoResponseSensors' Lens
cargoResponseSensorsL :: Lens_' CargoResponse (Maybe [CargoResponseSensors])
cargoResponseSensorsL f CargoResponse{..} = (\cargoResponseSensors -> CargoResponse { cargoResponseSensors, ..} ) <$> f cargoResponseSensors
{-# INLINE cargoResponseSensorsL #-}



-- * CargoResponseSensors

-- | 'cargoResponseSensorsCargoEmpty' Lens
cargoResponseSensorsCargoEmptyL :: Lens_' CargoResponseSensors (Maybe Bool)
cargoResponseSensorsCargoEmptyL f CargoResponseSensors{..} = (\cargoResponseSensorsCargoEmpty -> CargoResponseSensors { cargoResponseSensorsCargoEmpty, ..} ) <$> f cargoResponseSensorsCargoEmpty
{-# INLINE cargoResponseSensorsCargoEmptyL #-}

-- | 'cargoResponseSensorsName' Lens
cargoResponseSensorsNameL :: Lens_' CargoResponseSensors (Maybe Text)
cargoResponseSensorsNameL f CargoResponseSensors{..} = (\cargoResponseSensorsName -> CargoResponseSensors { cargoResponseSensorsName, ..} ) <$> f cargoResponseSensorsName
{-# INLINE cargoResponseSensorsNameL #-}

-- | 'cargoResponseSensorsId' Lens
cargoResponseSensorsIdL :: Lens_' CargoResponseSensors (Maybe Integer)
cargoResponseSensorsIdL f CargoResponseSensors{..} = (\cargoResponseSensorsId -> CargoResponseSensors { cargoResponseSensorsId, ..} ) <$> f cargoResponseSensorsId
{-# INLINE cargoResponseSensorsIdL #-}



-- * Contact

-- | 'contactEmail' Lens
contactEmailL :: Lens_' Contact (Maybe Text)
contactEmailL f Contact{..} = (\contactEmail -> Contact { contactEmail, ..} ) <$> f contactEmail
{-# INLINE contactEmailL #-}

-- | 'contactFirstName' Lens
contactFirstNameL :: Lens_' Contact (Maybe Text)
contactFirstNameL f Contact{..} = (\contactFirstName -> Contact { contactFirstName, ..} ) <$> f contactFirstName
{-# INLINE contactFirstNameL #-}

-- | 'contactId' Lens
contactIdL :: Lens_' Contact (Maybe Integer)
contactIdL f Contact{..} = (\contactId -> Contact { contactId, ..} ) <$> f contactId
{-# INLINE contactIdL #-}

-- | 'contactLastName' Lens
contactLastNameL :: Lens_' Contact (Maybe Text)
contactLastNameL f Contact{..} = (\contactLastName -> Contact { contactLastName, ..} ) <$> f contactLastName
{-# INLINE contactLastNameL #-}

-- | 'contactPhone' Lens
contactPhoneL :: Lens_' Contact (Maybe Text)
contactPhoneL f Contact{..} = (\contactPhone -> Contact { contactPhone, ..} ) <$> f contactPhone
{-# INLINE contactPhoneL #-}



-- * CurrentDriver



-- * DataInputHistoryResponse

-- | 'dataInputHistoryResponseId' Lens
dataInputHistoryResponseIdL :: Lens_' DataInputHistoryResponse (Maybe Integer)
dataInputHistoryResponseIdL f DataInputHistoryResponse{..} = (\dataInputHistoryResponseId -> DataInputHistoryResponse { dataInputHistoryResponseId, ..} ) <$> f dataInputHistoryResponseId
{-# INLINE dataInputHistoryResponseIdL #-}

-- | 'dataInputHistoryResponseName' Lens
dataInputHistoryResponseNameL :: Lens_' DataInputHistoryResponse (Text)
dataInputHistoryResponseNameL f DataInputHistoryResponse{..} = (\dataInputHistoryResponseName -> DataInputHistoryResponse { dataInputHistoryResponseName, ..} ) <$> f dataInputHistoryResponseName
{-# INLINE dataInputHistoryResponseNameL #-}

-- | 'dataInputHistoryResponsePoints' Lens
dataInputHistoryResponsePointsL :: Lens_' DataInputHistoryResponse (Maybe [DataInputHistoryResponsePoints])
dataInputHistoryResponsePointsL f DataInputHistoryResponse{..} = (\dataInputHistoryResponsePoints -> DataInputHistoryResponse { dataInputHistoryResponsePoints, ..} ) <$> f dataInputHistoryResponsePoints
{-# INLINE dataInputHistoryResponsePointsL #-}



-- * DataInputHistoryResponsePoints

-- | 'dataInputHistoryResponsePointsValue' Lens
dataInputHistoryResponsePointsValueL :: Lens_' DataInputHistoryResponsePoints (Maybe Double)
dataInputHistoryResponsePointsValueL f DataInputHistoryResponsePoints{..} = (\dataInputHistoryResponsePointsValue -> DataInputHistoryResponsePoints { dataInputHistoryResponsePointsValue, ..} ) <$> f dataInputHistoryResponsePointsValue
{-# INLINE dataInputHistoryResponsePointsValueL #-}

-- | 'dataInputHistoryResponsePointsTimeMs' Lens
dataInputHistoryResponsePointsTimeMsL :: Lens_' DataInputHistoryResponsePoints (Maybe Integer)
dataInputHistoryResponsePointsTimeMsL f DataInputHistoryResponsePoints{..} = (\dataInputHistoryResponsePointsTimeMs -> DataInputHistoryResponsePoints { dataInputHistoryResponsePointsTimeMs, ..} ) <$> f dataInputHistoryResponsePointsTimeMs
{-# INLINE dataInputHistoryResponsePointsTimeMsL #-}



-- * DispatchJob

-- | 'dispatchJobDestinationAddress' Lens
dispatchJobDestinationAddressL :: Lens_' DispatchJob (Maybe Text)
dispatchJobDestinationAddressL f DispatchJob{..} = (\dispatchJobDestinationAddress -> DispatchJob { dispatchJobDestinationAddress, ..} ) <$> f dispatchJobDestinationAddress
{-# INLINE dispatchJobDestinationAddressL #-}

-- | 'dispatchJobDestinationAddressId' Lens
dispatchJobDestinationAddressIdL :: Lens_' DispatchJob (Maybe Integer)
dispatchJobDestinationAddressIdL f DispatchJob{..} = (\dispatchJobDestinationAddressId -> DispatchJob { dispatchJobDestinationAddressId, ..} ) <$> f dispatchJobDestinationAddressId
{-# INLINE dispatchJobDestinationAddressIdL #-}

-- | 'dispatchJobDestinationLat' Lens
dispatchJobDestinationLatL :: Lens_' DispatchJob (Maybe Double)
dispatchJobDestinationLatL f DispatchJob{..} = (\dispatchJobDestinationLat -> DispatchJob { dispatchJobDestinationLat, ..} ) <$> f dispatchJobDestinationLat
{-# INLINE dispatchJobDestinationLatL #-}

-- | 'dispatchJobDestinationLng' Lens
dispatchJobDestinationLngL :: Lens_' DispatchJob (Maybe Double)
dispatchJobDestinationLngL f DispatchJob{..} = (\dispatchJobDestinationLng -> DispatchJob { dispatchJobDestinationLng, ..} ) <$> f dispatchJobDestinationLng
{-# INLINE dispatchJobDestinationLngL #-}

-- | 'dispatchJobDestinationName' Lens
dispatchJobDestinationNameL :: Lens_' DispatchJob (Maybe Text)
dispatchJobDestinationNameL f DispatchJob{..} = (\dispatchJobDestinationName -> DispatchJob { dispatchJobDestinationName, ..} ) <$> f dispatchJobDestinationName
{-# INLINE dispatchJobDestinationNameL #-}

-- | 'dispatchJobNotes' Lens
dispatchJobNotesL :: Lens_' DispatchJob (Maybe Text)
dispatchJobNotesL f DispatchJob{..} = (\dispatchJobNotes -> DispatchJob { dispatchJobNotes, ..} ) <$> f dispatchJobNotes
{-# INLINE dispatchJobNotesL #-}

-- | 'dispatchJobScheduledArrivalTimeMs' Lens
dispatchJobScheduledArrivalTimeMsL :: Lens_' DispatchJob (Integer)
dispatchJobScheduledArrivalTimeMsL f DispatchJob{..} = (\dispatchJobScheduledArrivalTimeMs -> DispatchJob { dispatchJobScheduledArrivalTimeMs, ..} ) <$> f dispatchJobScheduledArrivalTimeMs
{-# INLINE dispatchJobScheduledArrivalTimeMsL #-}

-- | 'dispatchJobScheduledDepartureTimeMs' Lens
dispatchJobScheduledDepartureTimeMsL :: Lens_' DispatchJob (Maybe Integer)
dispatchJobScheduledDepartureTimeMsL f DispatchJob{..} = (\dispatchJobScheduledDepartureTimeMs -> DispatchJob { dispatchJobScheduledDepartureTimeMs, ..} ) <$> f dispatchJobScheduledDepartureTimeMs
{-# INLINE dispatchJobScheduledDepartureTimeMsL #-}

-- | 'dispatchJobArrivedAtMs' Lens
dispatchJobArrivedAtMsL :: Lens_' DispatchJob (Maybe Integer)
dispatchJobArrivedAtMsL f DispatchJob{..} = (\dispatchJobArrivedAtMs -> DispatchJob { dispatchJobArrivedAtMs, ..} ) <$> f dispatchJobArrivedAtMs
{-# INLINE dispatchJobArrivedAtMsL #-}

-- | 'dispatchJobCompletedAtMs' Lens
dispatchJobCompletedAtMsL :: Lens_' DispatchJob (Maybe Integer)
dispatchJobCompletedAtMsL f DispatchJob{..} = (\dispatchJobCompletedAtMs -> DispatchJob { dispatchJobCompletedAtMs, ..} ) <$> f dispatchJobCompletedAtMs
{-# INLINE dispatchJobCompletedAtMsL #-}

-- | 'dispatchJobDispatchRouteId' Lens
dispatchJobDispatchRouteIdL :: Lens_' DispatchJob (Integer)
dispatchJobDispatchRouteIdL f DispatchJob{..} = (\dispatchJobDispatchRouteId -> DispatchJob { dispatchJobDispatchRouteId, ..} ) <$> f dispatchJobDispatchRouteId
{-# INLINE dispatchJobDispatchRouteIdL #-}

-- | 'dispatchJobDriverId' Lens
dispatchJobDriverIdL :: Lens_' DispatchJob (Maybe Integer)
dispatchJobDriverIdL f DispatchJob{..} = (\dispatchJobDriverId -> DispatchJob { dispatchJobDriverId, ..} ) <$> f dispatchJobDriverId
{-# INLINE dispatchJobDriverIdL #-}

-- | 'dispatchJobEnRouteAtMs' Lens
dispatchJobEnRouteAtMsL :: Lens_' DispatchJob (Maybe Integer)
dispatchJobEnRouteAtMsL f DispatchJob{..} = (\dispatchJobEnRouteAtMs -> DispatchJob { dispatchJobEnRouteAtMs, ..} ) <$> f dispatchJobEnRouteAtMs
{-# INLINE dispatchJobEnRouteAtMsL #-}

-- | 'dispatchJobEstimatedArrivalMs' Lens
dispatchJobEstimatedArrivalMsL :: Lens_' DispatchJob (Maybe Integer)
dispatchJobEstimatedArrivalMsL f DispatchJob{..} = (\dispatchJobEstimatedArrivalMs -> DispatchJob { dispatchJobEstimatedArrivalMs, ..} ) <$> f dispatchJobEstimatedArrivalMs
{-# INLINE dispatchJobEstimatedArrivalMsL #-}

-- | 'dispatchJobFleetViewerUrl' Lens
dispatchJobFleetViewerUrlL :: Lens_' DispatchJob (Maybe Text)
dispatchJobFleetViewerUrlL f DispatchJob{..} = (\dispatchJobFleetViewerUrl -> DispatchJob { dispatchJobFleetViewerUrl, ..} ) <$> f dispatchJobFleetViewerUrl
{-# INLINE dispatchJobFleetViewerUrlL #-}

-- | 'dispatchJobGroupId' Lens
dispatchJobGroupIdL :: Lens_' DispatchJob (Integer)
dispatchJobGroupIdL f DispatchJob{..} = (\dispatchJobGroupId -> DispatchJob { dispatchJobGroupId, ..} ) <$> f dispatchJobGroupId
{-# INLINE dispatchJobGroupIdL #-}

-- | 'dispatchJobId' Lens
dispatchJobIdL :: Lens_' DispatchJob (Integer)
dispatchJobIdL f DispatchJob{..} = (\dispatchJobId -> DispatchJob { dispatchJobId, ..} ) <$> f dispatchJobId
{-# INLINE dispatchJobIdL #-}

-- | 'dispatchJobJobState' Lens
dispatchJobJobStateL :: Lens_' DispatchJob (JobStatus)
dispatchJobJobStateL f DispatchJob{..} = (\dispatchJobJobState -> DispatchJob { dispatchJobJobState, ..} ) <$> f dispatchJobJobState
{-# INLINE dispatchJobJobStateL #-}

-- | 'dispatchJobSkippedAtMs' Lens
dispatchJobSkippedAtMsL :: Lens_' DispatchJob (Maybe Integer)
dispatchJobSkippedAtMsL f DispatchJob{..} = (\dispatchJobSkippedAtMs -> DispatchJob { dispatchJobSkippedAtMs, ..} ) <$> f dispatchJobSkippedAtMs
{-# INLINE dispatchJobSkippedAtMsL #-}

-- | 'dispatchJobVehicleId' Lens
dispatchJobVehicleIdL :: Lens_' DispatchJob (Maybe Integer)
dispatchJobVehicleIdL f DispatchJob{..} = (\dispatchJobVehicleId -> DispatchJob { dispatchJobVehicleId, ..} ) <$> f dispatchJobVehicleId
{-# INLINE dispatchJobVehicleIdL #-}



-- * DispatchJobCreate

-- | 'dispatchJobCreateDestinationAddress' Lens
dispatchJobCreateDestinationAddressL :: Lens_' DispatchJobCreate (Maybe Text)
dispatchJobCreateDestinationAddressL f DispatchJobCreate{..} = (\dispatchJobCreateDestinationAddress -> DispatchJobCreate { dispatchJobCreateDestinationAddress, ..} ) <$> f dispatchJobCreateDestinationAddress
{-# INLINE dispatchJobCreateDestinationAddressL #-}

-- | 'dispatchJobCreateDestinationAddressId' Lens
dispatchJobCreateDestinationAddressIdL :: Lens_' DispatchJobCreate (Maybe Integer)
dispatchJobCreateDestinationAddressIdL f DispatchJobCreate{..} = (\dispatchJobCreateDestinationAddressId -> DispatchJobCreate { dispatchJobCreateDestinationAddressId, ..} ) <$> f dispatchJobCreateDestinationAddressId
{-# INLINE dispatchJobCreateDestinationAddressIdL #-}

-- | 'dispatchJobCreateDestinationLat' Lens
dispatchJobCreateDestinationLatL :: Lens_' DispatchJobCreate (Maybe Double)
dispatchJobCreateDestinationLatL f DispatchJobCreate{..} = (\dispatchJobCreateDestinationLat -> DispatchJobCreate { dispatchJobCreateDestinationLat, ..} ) <$> f dispatchJobCreateDestinationLat
{-# INLINE dispatchJobCreateDestinationLatL #-}

-- | 'dispatchJobCreateDestinationLng' Lens
dispatchJobCreateDestinationLngL :: Lens_' DispatchJobCreate (Maybe Double)
dispatchJobCreateDestinationLngL f DispatchJobCreate{..} = (\dispatchJobCreateDestinationLng -> DispatchJobCreate { dispatchJobCreateDestinationLng, ..} ) <$> f dispatchJobCreateDestinationLng
{-# INLINE dispatchJobCreateDestinationLngL #-}

-- | 'dispatchJobCreateDestinationName' Lens
dispatchJobCreateDestinationNameL :: Lens_' DispatchJobCreate (Maybe Text)
dispatchJobCreateDestinationNameL f DispatchJobCreate{..} = (\dispatchJobCreateDestinationName -> DispatchJobCreate { dispatchJobCreateDestinationName, ..} ) <$> f dispatchJobCreateDestinationName
{-# INLINE dispatchJobCreateDestinationNameL #-}

-- | 'dispatchJobCreateNotes' Lens
dispatchJobCreateNotesL :: Lens_' DispatchJobCreate (Maybe Text)
dispatchJobCreateNotesL f DispatchJobCreate{..} = (\dispatchJobCreateNotes -> DispatchJobCreate { dispatchJobCreateNotes, ..} ) <$> f dispatchJobCreateNotes
{-# INLINE dispatchJobCreateNotesL #-}

-- | 'dispatchJobCreateScheduledArrivalTimeMs' Lens
dispatchJobCreateScheduledArrivalTimeMsL :: Lens_' DispatchJobCreate (Integer)
dispatchJobCreateScheduledArrivalTimeMsL f DispatchJobCreate{..} = (\dispatchJobCreateScheduledArrivalTimeMs -> DispatchJobCreate { dispatchJobCreateScheduledArrivalTimeMs, ..} ) <$> f dispatchJobCreateScheduledArrivalTimeMs
{-# INLINE dispatchJobCreateScheduledArrivalTimeMsL #-}

-- | 'dispatchJobCreateScheduledDepartureTimeMs' Lens
dispatchJobCreateScheduledDepartureTimeMsL :: Lens_' DispatchJobCreate (Maybe Integer)
dispatchJobCreateScheduledDepartureTimeMsL f DispatchJobCreate{..} = (\dispatchJobCreateScheduledDepartureTimeMs -> DispatchJobCreate { dispatchJobCreateScheduledDepartureTimeMs, ..} ) <$> f dispatchJobCreateScheduledDepartureTimeMs
{-# INLINE dispatchJobCreateScheduledDepartureTimeMsL #-}



-- * DispatchRoute

-- | 'dispatchRouteActualEndMs' Lens
dispatchRouteActualEndMsL :: Lens_' DispatchRoute (Maybe Integer)
dispatchRouteActualEndMsL f DispatchRoute{..} = (\dispatchRouteActualEndMs -> DispatchRoute { dispatchRouteActualEndMs, ..} ) <$> f dispatchRouteActualEndMs
{-# INLINE dispatchRouteActualEndMsL #-}

-- | 'dispatchRouteActualStartMs' Lens
dispatchRouteActualStartMsL :: Lens_' DispatchRoute (Maybe Integer)
dispatchRouteActualStartMsL f DispatchRoute{..} = (\dispatchRouteActualStartMs -> DispatchRoute { dispatchRouteActualStartMs, ..} ) <$> f dispatchRouteActualStartMs
{-# INLINE dispatchRouteActualStartMsL #-}

-- | 'dispatchRouteDriverId' Lens
dispatchRouteDriverIdL :: Lens_' DispatchRoute (Maybe Integer)
dispatchRouteDriverIdL f DispatchRoute{..} = (\dispatchRouteDriverId -> DispatchRoute { dispatchRouteDriverId, ..} ) <$> f dispatchRouteDriverId
{-# INLINE dispatchRouteDriverIdL #-}

-- | 'dispatchRouteGroupId' Lens
dispatchRouteGroupIdL :: Lens_' DispatchRoute (Maybe Integer)
dispatchRouteGroupIdL f DispatchRoute{..} = (\dispatchRouteGroupId -> DispatchRoute { dispatchRouteGroupId, ..} ) <$> f dispatchRouteGroupId
{-# INLINE dispatchRouteGroupIdL #-}

-- | 'dispatchRouteName' Lens
dispatchRouteNameL :: Lens_' DispatchRoute (Text)
dispatchRouteNameL f DispatchRoute{..} = (\dispatchRouteName -> DispatchRoute { dispatchRouteName, ..} ) <$> f dispatchRouteName
{-# INLINE dispatchRouteNameL #-}

-- | 'dispatchRouteScheduledEndMs' Lens
dispatchRouteScheduledEndMsL :: Lens_' DispatchRoute (Integer)
dispatchRouteScheduledEndMsL f DispatchRoute{..} = (\dispatchRouteScheduledEndMs -> DispatchRoute { dispatchRouteScheduledEndMs, ..} ) <$> f dispatchRouteScheduledEndMs
{-# INLINE dispatchRouteScheduledEndMsL #-}

-- | 'dispatchRouteScheduledMeters' Lens
dispatchRouteScheduledMetersL :: Lens_' DispatchRoute (Maybe Integer)
dispatchRouteScheduledMetersL f DispatchRoute{..} = (\dispatchRouteScheduledMeters -> DispatchRoute { dispatchRouteScheduledMeters, ..} ) <$> f dispatchRouteScheduledMeters
{-# INLINE dispatchRouteScheduledMetersL #-}

-- | 'dispatchRouteScheduledStartMs' Lens
dispatchRouteScheduledStartMsL :: Lens_' DispatchRoute (Integer)
dispatchRouteScheduledStartMsL f DispatchRoute{..} = (\dispatchRouteScheduledStartMs -> DispatchRoute { dispatchRouteScheduledStartMs, ..} ) <$> f dispatchRouteScheduledStartMs
{-# INLINE dispatchRouteScheduledStartMsL #-}

-- | 'dispatchRouteStartLocationAddress' Lens
dispatchRouteStartLocationAddressL :: Lens_' DispatchRoute (Maybe Text)
dispatchRouteStartLocationAddressL f DispatchRoute{..} = (\dispatchRouteStartLocationAddress -> DispatchRoute { dispatchRouteStartLocationAddress, ..} ) <$> f dispatchRouteStartLocationAddress
{-# INLINE dispatchRouteStartLocationAddressL #-}

-- | 'dispatchRouteStartLocationAddressId' Lens
dispatchRouteStartLocationAddressIdL :: Lens_' DispatchRoute (Maybe Integer)
dispatchRouteStartLocationAddressIdL f DispatchRoute{..} = (\dispatchRouteStartLocationAddressId -> DispatchRoute { dispatchRouteStartLocationAddressId, ..} ) <$> f dispatchRouteStartLocationAddressId
{-# INLINE dispatchRouteStartLocationAddressIdL #-}

-- | 'dispatchRouteStartLocationLat' Lens
dispatchRouteStartLocationLatL :: Lens_' DispatchRoute (Maybe Double)
dispatchRouteStartLocationLatL f DispatchRoute{..} = (\dispatchRouteStartLocationLat -> DispatchRoute { dispatchRouteStartLocationLat, ..} ) <$> f dispatchRouteStartLocationLat
{-# INLINE dispatchRouteStartLocationLatL #-}

-- | 'dispatchRouteStartLocationLng' Lens
dispatchRouteStartLocationLngL :: Lens_' DispatchRoute (Maybe Double)
dispatchRouteStartLocationLngL f DispatchRoute{..} = (\dispatchRouteStartLocationLng -> DispatchRoute { dispatchRouteStartLocationLng, ..} ) <$> f dispatchRouteStartLocationLng
{-# INLINE dispatchRouteStartLocationLngL #-}

-- | 'dispatchRouteStartLocationName' Lens
dispatchRouteStartLocationNameL :: Lens_' DispatchRoute (Maybe Text)
dispatchRouteStartLocationNameL f DispatchRoute{..} = (\dispatchRouteStartLocationName -> DispatchRoute { dispatchRouteStartLocationName, ..} ) <$> f dispatchRouteStartLocationName
{-# INLINE dispatchRouteStartLocationNameL #-}

-- | 'dispatchRouteTrailerId' Lens
dispatchRouteTrailerIdL :: Lens_' DispatchRoute (Maybe Integer)
dispatchRouteTrailerIdL f DispatchRoute{..} = (\dispatchRouteTrailerId -> DispatchRoute { dispatchRouteTrailerId, ..} ) <$> f dispatchRouteTrailerId
{-# INLINE dispatchRouteTrailerIdL #-}

-- | 'dispatchRouteVehicleId' Lens
dispatchRouteVehicleIdL :: Lens_' DispatchRoute (Maybe Integer)
dispatchRouteVehicleIdL f DispatchRoute{..} = (\dispatchRouteVehicleId -> DispatchRoute { dispatchRouteVehicleId, ..} ) <$> f dispatchRouteVehicleId
{-# INLINE dispatchRouteVehicleIdL #-}

-- | 'dispatchRouteDispatchJobs' Lens
dispatchRouteDispatchJobsL :: Lens_' DispatchRoute ([DispatchJob])
dispatchRouteDispatchJobsL f DispatchRoute{..} = (\dispatchRouteDispatchJobs -> DispatchRoute { dispatchRouteDispatchJobs, ..} ) <$> f dispatchRouteDispatchJobs
{-# INLINE dispatchRouteDispatchJobsL #-}

-- | 'dispatchRouteId' Lens
dispatchRouteIdL :: Lens_' DispatchRoute (Integer)
dispatchRouteIdL f DispatchRoute{..} = (\dispatchRouteId -> DispatchRoute { dispatchRouteId, ..} ) <$> f dispatchRouteId
{-# INLINE dispatchRouteIdL #-}



-- * DispatchRouteBase

-- | 'dispatchRouteBaseActualEndMs' Lens
dispatchRouteBaseActualEndMsL :: Lens_' DispatchRouteBase (Maybe Integer)
dispatchRouteBaseActualEndMsL f DispatchRouteBase{..} = (\dispatchRouteBaseActualEndMs -> DispatchRouteBase { dispatchRouteBaseActualEndMs, ..} ) <$> f dispatchRouteBaseActualEndMs
{-# INLINE dispatchRouteBaseActualEndMsL #-}

-- | 'dispatchRouteBaseActualStartMs' Lens
dispatchRouteBaseActualStartMsL :: Lens_' DispatchRouteBase (Maybe Integer)
dispatchRouteBaseActualStartMsL f DispatchRouteBase{..} = (\dispatchRouteBaseActualStartMs -> DispatchRouteBase { dispatchRouteBaseActualStartMs, ..} ) <$> f dispatchRouteBaseActualStartMs
{-# INLINE dispatchRouteBaseActualStartMsL #-}

-- | 'dispatchRouteBaseDriverId' Lens
dispatchRouteBaseDriverIdL :: Lens_' DispatchRouteBase (Maybe Integer)
dispatchRouteBaseDriverIdL f DispatchRouteBase{..} = (\dispatchRouteBaseDriverId -> DispatchRouteBase { dispatchRouteBaseDriverId, ..} ) <$> f dispatchRouteBaseDriverId
{-# INLINE dispatchRouteBaseDriverIdL #-}

-- | 'dispatchRouteBaseGroupId' Lens
dispatchRouteBaseGroupIdL :: Lens_' DispatchRouteBase (Maybe Integer)
dispatchRouteBaseGroupIdL f DispatchRouteBase{..} = (\dispatchRouteBaseGroupId -> DispatchRouteBase { dispatchRouteBaseGroupId, ..} ) <$> f dispatchRouteBaseGroupId
{-# INLINE dispatchRouteBaseGroupIdL #-}

-- | 'dispatchRouteBaseName' Lens
dispatchRouteBaseNameL :: Lens_' DispatchRouteBase (Text)
dispatchRouteBaseNameL f DispatchRouteBase{..} = (\dispatchRouteBaseName -> DispatchRouteBase { dispatchRouteBaseName, ..} ) <$> f dispatchRouteBaseName
{-# INLINE dispatchRouteBaseNameL #-}

-- | 'dispatchRouteBaseScheduledEndMs' Lens
dispatchRouteBaseScheduledEndMsL :: Lens_' DispatchRouteBase (Integer)
dispatchRouteBaseScheduledEndMsL f DispatchRouteBase{..} = (\dispatchRouteBaseScheduledEndMs -> DispatchRouteBase { dispatchRouteBaseScheduledEndMs, ..} ) <$> f dispatchRouteBaseScheduledEndMs
{-# INLINE dispatchRouteBaseScheduledEndMsL #-}

-- | 'dispatchRouteBaseScheduledMeters' Lens
dispatchRouteBaseScheduledMetersL :: Lens_' DispatchRouteBase (Maybe Integer)
dispatchRouteBaseScheduledMetersL f DispatchRouteBase{..} = (\dispatchRouteBaseScheduledMeters -> DispatchRouteBase { dispatchRouteBaseScheduledMeters, ..} ) <$> f dispatchRouteBaseScheduledMeters
{-# INLINE dispatchRouteBaseScheduledMetersL #-}

-- | 'dispatchRouteBaseScheduledStartMs' Lens
dispatchRouteBaseScheduledStartMsL :: Lens_' DispatchRouteBase (Integer)
dispatchRouteBaseScheduledStartMsL f DispatchRouteBase{..} = (\dispatchRouteBaseScheduledStartMs -> DispatchRouteBase { dispatchRouteBaseScheduledStartMs, ..} ) <$> f dispatchRouteBaseScheduledStartMs
{-# INLINE dispatchRouteBaseScheduledStartMsL #-}

-- | 'dispatchRouteBaseStartLocationAddress' Lens
dispatchRouteBaseStartLocationAddressL :: Lens_' DispatchRouteBase (Maybe Text)
dispatchRouteBaseStartLocationAddressL f DispatchRouteBase{..} = (\dispatchRouteBaseStartLocationAddress -> DispatchRouteBase { dispatchRouteBaseStartLocationAddress, ..} ) <$> f dispatchRouteBaseStartLocationAddress
{-# INLINE dispatchRouteBaseStartLocationAddressL #-}

-- | 'dispatchRouteBaseStartLocationAddressId' Lens
dispatchRouteBaseStartLocationAddressIdL :: Lens_' DispatchRouteBase (Maybe Integer)
dispatchRouteBaseStartLocationAddressIdL f DispatchRouteBase{..} = (\dispatchRouteBaseStartLocationAddressId -> DispatchRouteBase { dispatchRouteBaseStartLocationAddressId, ..} ) <$> f dispatchRouteBaseStartLocationAddressId
{-# INLINE dispatchRouteBaseStartLocationAddressIdL #-}

-- | 'dispatchRouteBaseStartLocationLat' Lens
dispatchRouteBaseStartLocationLatL :: Lens_' DispatchRouteBase (Maybe Double)
dispatchRouteBaseStartLocationLatL f DispatchRouteBase{..} = (\dispatchRouteBaseStartLocationLat -> DispatchRouteBase { dispatchRouteBaseStartLocationLat, ..} ) <$> f dispatchRouteBaseStartLocationLat
{-# INLINE dispatchRouteBaseStartLocationLatL #-}

-- | 'dispatchRouteBaseStartLocationLng' Lens
dispatchRouteBaseStartLocationLngL :: Lens_' DispatchRouteBase (Maybe Double)
dispatchRouteBaseStartLocationLngL f DispatchRouteBase{..} = (\dispatchRouteBaseStartLocationLng -> DispatchRouteBase { dispatchRouteBaseStartLocationLng, ..} ) <$> f dispatchRouteBaseStartLocationLng
{-# INLINE dispatchRouteBaseStartLocationLngL #-}

-- | 'dispatchRouteBaseStartLocationName' Lens
dispatchRouteBaseStartLocationNameL :: Lens_' DispatchRouteBase (Maybe Text)
dispatchRouteBaseStartLocationNameL f DispatchRouteBase{..} = (\dispatchRouteBaseStartLocationName -> DispatchRouteBase { dispatchRouteBaseStartLocationName, ..} ) <$> f dispatchRouteBaseStartLocationName
{-# INLINE dispatchRouteBaseStartLocationNameL #-}

-- | 'dispatchRouteBaseTrailerId' Lens
dispatchRouteBaseTrailerIdL :: Lens_' DispatchRouteBase (Maybe Integer)
dispatchRouteBaseTrailerIdL f DispatchRouteBase{..} = (\dispatchRouteBaseTrailerId -> DispatchRouteBase { dispatchRouteBaseTrailerId, ..} ) <$> f dispatchRouteBaseTrailerId
{-# INLINE dispatchRouteBaseTrailerIdL #-}

-- | 'dispatchRouteBaseVehicleId' Lens
dispatchRouteBaseVehicleIdL :: Lens_' DispatchRouteBase (Maybe Integer)
dispatchRouteBaseVehicleIdL f DispatchRouteBase{..} = (\dispatchRouteBaseVehicleId -> DispatchRouteBase { dispatchRouteBaseVehicleId, ..} ) <$> f dispatchRouteBaseVehicleId
{-# INLINE dispatchRouteBaseVehicleIdL #-}



-- * DispatchRouteCreate

-- | 'dispatchRouteCreateActualEndMs' Lens
dispatchRouteCreateActualEndMsL :: Lens_' DispatchRouteCreate (Maybe Integer)
dispatchRouteCreateActualEndMsL f DispatchRouteCreate{..} = (\dispatchRouteCreateActualEndMs -> DispatchRouteCreate { dispatchRouteCreateActualEndMs, ..} ) <$> f dispatchRouteCreateActualEndMs
{-# INLINE dispatchRouteCreateActualEndMsL #-}

-- | 'dispatchRouteCreateActualStartMs' Lens
dispatchRouteCreateActualStartMsL :: Lens_' DispatchRouteCreate (Maybe Integer)
dispatchRouteCreateActualStartMsL f DispatchRouteCreate{..} = (\dispatchRouteCreateActualStartMs -> DispatchRouteCreate { dispatchRouteCreateActualStartMs, ..} ) <$> f dispatchRouteCreateActualStartMs
{-# INLINE dispatchRouteCreateActualStartMsL #-}

-- | 'dispatchRouteCreateDriverId' Lens
dispatchRouteCreateDriverIdL :: Lens_' DispatchRouteCreate (Maybe Integer)
dispatchRouteCreateDriverIdL f DispatchRouteCreate{..} = (\dispatchRouteCreateDriverId -> DispatchRouteCreate { dispatchRouteCreateDriverId, ..} ) <$> f dispatchRouteCreateDriverId
{-# INLINE dispatchRouteCreateDriverIdL #-}

-- | 'dispatchRouteCreateGroupId' Lens
dispatchRouteCreateGroupIdL :: Lens_' DispatchRouteCreate (Maybe Integer)
dispatchRouteCreateGroupIdL f DispatchRouteCreate{..} = (\dispatchRouteCreateGroupId -> DispatchRouteCreate { dispatchRouteCreateGroupId, ..} ) <$> f dispatchRouteCreateGroupId
{-# INLINE dispatchRouteCreateGroupIdL #-}

-- | 'dispatchRouteCreateName' Lens
dispatchRouteCreateNameL :: Lens_' DispatchRouteCreate (Text)
dispatchRouteCreateNameL f DispatchRouteCreate{..} = (\dispatchRouteCreateName -> DispatchRouteCreate { dispatchRouteCreateName, ..} ) <$> f dispatchRouteCreateName
{-# INLINE dispatchRouteCreateNameL #-}

-- | 'dispatchRouteCreateScheduledEndMs' Lens
dispatchRouteCreateScheduledEndMsL :: Lens_' DispatchRouteCreate (Integer)
dispatchRouteCreateScheduledEndMsL f DispatchRouteCreate{..} = (\dispatchRouteCreateScheduledEndMs -> DispatchRouteCreate { dispatchRouteCreateScheduledEndMs, ..} ) <$> f dispatchRouteCreateScheduledEndMs
{-# INLINE dispatchRouteCreateScheduledEndMsL #-}

-- | 'dispatchRouteCreateScheduledMeters' Lens
dispatchRouteCreateScheduledMetersL :: Lens_' DispatchRouteCreate (Maybe Integer)
dispatchRouteCreateScheduledMetersL f DispatchRouteCreate{..} = (\dispatchRouteCreateScheduledMeters -> DispatchRouteCreate { dispatchRouteCreateScheduledMeters, ..} ) <$> f dispatchRouteCreateScheduledMeters
{-# INLINE dispatchRouteCreateScheduledMetersL #-}

-- | 'dispatchRouteCreateScheduledStartMs' Lens
dispatchRouteCreateScheduledStartMsL :: Lens_' DispatchRouteCreate (Integer)
dispatchRouteCreateScheduledStartMsL f DispatchRouteCreate{..} = (\dispatchRouteCreateScheduledStartMs -> DispatchRouteCreate { dispatchRouteCreateScheduledStartMs, ..} ) <$> f dispatchRouteCreateScheduledStartMs
{-# INLINE dispatchRouteCreateScheduledStartMsL #-}

-- | 'dispatchRouteCreateStartLocationAddress' Lens
dispatchRouteCreateStartLocationAddressL :: Lens_' DispatchRouteCreate (Maybe Text)
dispatchRouteCreateStartLocationAddressL f DispatchRouteCreate{..} = (\dispatchRouteCreateStartLocationAddress -> DispatchRouteCreate { dispatchRouteCreateStartLocationAddress, ..} ) <$> f dispatchRouteCreateStartLocationAddress
{-# INLINE dispatchRouteCreateStartLocationAddressL #-}

-- | 'dispatchRouteCreateStartLocationAddressId' Lens
dispatchRouteCreateStartLocationAddressIdL :: Lens_' DispatchRouteCreate (Maybe Integer)
dispatchRouteCreateStartLocationAddressIdL f DispatchRouteCreate{..} = (\dispatchRouteCreateStartLocationAddressId -> DispatchRouteCreate { dispatchRouteCreateStartLocationAddressId, ..} ) <$> f dispatchRouteCreateStartLocationAddressId
{-# INLINE dispatchRouteCreateStartLocationAddressIdL #-}

-- | 'dispatchRouteCreateStartLocationLat' Lens
dispatchRouteCreateStartLocationLatL :: Lens_' DispatchRouteCreate (Maybe Double)
dispatchRouteCreateStartLocationLatL f DispatchRouteCreate{..} = (\dispatchRouteCreateStartLocationLat -> DispatchRouteCreate { dispatchRouteCreateStartLocationLat, ..} ) <$> f dispatchRouteCreateStartLocationLat
{-# INLINE dispatchRouteCreateStartLocationLatL #-}

-- | 'dispatchRouteCreateStartLocationLng' Lens
dispatchRouteCreateStartLocationLngL :: Lens_' DispatchRouteCreate (Maybe Double)
dispatchRouteCreateStartLocationLngL f DispatchRouteCreate{..} = (\dispatchRouteCreateStartLocationLng -> DispatchRouteCreate { dispatchRouteCreateStartLocationLng, ..} ) <$> f dispatchRouteCreateStartLocationLng
{-# INLINE dispatchRouteCreateStartLocationLngL #-}

-- | 'dispatchRouteCreateStartLocationName' Lens
dispatchRouteCreateStartLocationNameL :: Lens_' DispatchRouteCreate (Maybe Text)
dispatchRouteCreateStartLocationNameL f DispatchRouteCreate{..} = (\dispatchRouteCreateStartLocationName -> DispatchRouteCreate { dispatchRouteCreateStartLocationName, ..} ) <$> f dispatchRouteCreateStartLocationName
{-# INLINE dispatchRouteCreateStartLocationNameL #-}

-- | 'dispatchRouteCreateTrailerId' Lens
dispatchRouteCreateTrailerIdL :: Lens_' DispatchRouteCreate (Maybe Integer)
dispatchRouteCreateTrailerIdL f DispatchRouteCreate{..} = (\dispatchRouteCreateTrailerId -> DispatchRouteCreate { dispatchRouteCreateTrailerId, ..} ) <$> f dispatchRouteCreateTrailerId
{-# INLINE dispatchRouteCreateTrailerIdL #-}

-- | 'dispatchRouteCreateVehicleId' Lens
dispatchRouteCreateVehicleIdL :: Lens_' DispatchRouteCreate (Maybe Integer)
dispatchRouteCreateVehicleIdL f DispatchRouteCreate{..} = (\dispatchRouteCreateVehicleId -> DispatchRouteCreate { dispatchRouteCreateVehicleId, ..} ) <$> f dispatchRouteCreateVehicleId
{-# INLINE dispatchRouteCreateVehicleIdL #-}

-- | 'dispatchRouteCreateDispatchJobs' Lens
dispatchRouteCreateDispatchJobsL :: Lens_' DispatchRouteCreate ([DispatchJobCreate])
dispatchRouteCreateDispatchJobsL f DispatchRouteCreate{..} = (\dispatchRouteCreateDispatchJobs -> DispatchRouteCreate { dispatchRouteCreateDispatchJobs, ..} ) <$> f dispatchRouteCreateDispatchJobs
{-# INLINE dispatchRouteCreateDispatchJobsL #-}



-- * DispatchRouteHistoricalEntry

-- | 'dispatchRouteHistoricalEntryChangedAtMs' Lens
dispatchRouteHistoricalEntryChangedAtMsL :: Lens_' DispatchRouteHistoricalEntry (Maybe Integer)
dispatchRouteHistoricalEntryChangedAtMsL f DispatchRouteHistoricalEntry{..} = (\dispatchRouteHistoricalEntryChangedAtMs -> DispatchRouteHistoricalEntry { dispatchRouteHistoricalEntryChangedAtMs, ..} ) <$> f dispatchRouteHistoricalEntryChangedAtMs
{-# INLINE dispatchRouteHistoricalEntryChangedAtMsL #-}

-- | 'dispatchRouteHistoricalEntryRoute' Lens
dispatchRouteHistoricalEntryRouteL :: Lens_' DispatchRouteHistoricalEntry (Maybe DispatchRoute)
dispatchRouteHistoricalEntryRouteL f DispatchRouteHistoricalEntry{..} = (\dispatchRouteHistoricalEntryRoute -> DispatchRouteHistoricalEntry { dispatchRouteHistoricalEntryRoute, ..} ) <$> f dispatchRouteHistoricalEntryRoute
{-# INLINE dispatchRouteHistoricalEntryRouteL #-}



-- * DispatchRouteHistory

-- | 'dispatchRouteHistoryHistory' Lens
dispatchRouteHistoryHistoryL :: Lens_' DispatchRouteHistory (Maybe [DispatchRouteHistoricalEntry])
dispatchRouteHistoryHistoryL f DispatchRouteHistory{..} = (\dispatchRouteHistoryHistory -> DispatchRouteHistory { dispatchRouteHistoryHistory, ..} ) <$> f dispatchRouteHistoryHistory
{-# INLINE dispatchRouteHistoryHistoryL #-}



-- * Document

-- | 'documentDispatchJobId' Lens
documentDispatchJobIdL :: Lens_' Document (Maybe Integer)
documentDispatchJobIdL f Document{..} = (\documentDispatchJobId -> Document { documentDispatchJobId, ..} ) <$> f documentDispatchJobId
{-# INLINE documentDispatchJobIdL #-}

-- | 'documentNotes' Lens
documentNotesL :: Lens_' Document (Maybe Text)
documentNotesL f Document{..} = (\documentNotes -> Document { documentNotes, ..} ) <$> f documentNotes
{-# INLINE documentNotesL #-}

-- | 'documentDocumentType' Lens
documentDocumentTypeL :: Lens_' Document (Text)
documentDocumentTypeL f Document{..} = (\documentDocumentType -> Document { documentDocumentType, ..} ) <$> f documentDocumentType
{-# INLINE documentDocumentTypeL #-}

-- | 'documentDriverCreatedAtMs' Lens
documentDriverCreatedAtMsL :: Lens_' Document (Integer)
documentDriverCreatedAtMsL f Document{..} = (\documentDriverCreatedAtMs -> Document { documentDriverCreatedAtMs, ..} ) <$> f documentDriverCreatedAtMs
{-# INLINE documentDriverCreatedAtMsL #-}

-- | 'documentDriverId' Lens
documentDriverIdL :: Lens_' Document (Integer)
documentDriverIdL f Document{..} = (\documentDriverId -> Document { documentDriverId, ..} ) <$> f documentDriverId
{-# INLINE documentDriverIdL #-}

-- | 'documentFields' Lens
documentFieldsL :: Lens_' Document ([DocumentField])
documentFieldsL f Document{..} = (\documentFields -> Document { documentFields, ..} ) <$> f documentFields
{-# INLINE documentFieldsL #-}

-- | 'documentVehicleId' Lens
documentVehicleIdL :: Lens_' Document (Maybe Integer)
documentVehicleIdL f Document{..} = (\documentVehicleId -> Document { documentVehicleId, ..} ) <$> f documentVehicleId
{-# INLINE documentVehicleIdL #-}



-- * DocumentBase

-- | 'documentBaseDispatchJobId' Lens
documentBaseDispatchJobIdL :: Lens_' DocumentBase (Maybe Integer)
documentBaseDispatchJobIdL f DocumentBase{..} = (\documentBaseDispatchJobId -> DocumentBase { documentBaseDispatchJobId, ..} ) <$> f documentBaseDispatchJobId
{-# INLINE documentBaseDispatchJobIdL #-}

-- | 'documentBaseNotes' Lens
documentBaseNotesL :: Lens_' DocumentBase (Maybe Text)
documentBaseNotesL f DocumentBase{..} = (\documentBaseNotes -> DocumentBase { documentBaseNotes, ..} ) <$> f documentBaseNotes
{-# INLINE documentBaseNotesL #-}



-- * DocumentCreate

-- | 'documentCreateDispatchJobId' Lens
documentCreateDispatchJobIdL :: Lens_' DocumentCreate (Maybe Integer)
documentCreateDispatchJobIdL f DocumentCreate{..} = (\documentCreateDispatchJobId -> DocumentCreate { documentCreateDispatchJobId, ..} ) <$> f documentCreateDispatchJobId
{-# INLINE documentCreateDispatchJobIdL #-}

-- | 'documentCreateNotes' Lens
documentCreateNotesL :: Lens_' DocumentCreate (Maybe Text)
documentCreateNotesL f DocumentCreate{..} = (\documentCreateNotes -> DocumentCreate { documentCreateNotes, ..} ) <$> f documentCreateNotes
{-# INLINE documentCreateNotesL #-}

-- | 'documentCreateDocumentTypeUuid' Lens
documentCreateDocumentTypeUuidL :: Lens_' DocumentCreate (Text)
documentCreateDocumentTypeUuidL f DocumentCreate{..} = (\documentCreateDocumentTypeUuid -> DocumentCreate { documentCreateDocumentTypeUuid, ..} ) <$> f documentCreateDocumentTypeUuid
{-# INLINE documentCreateDocumentTypeUuidL #-}

-- | 'documentCreateFields' Lens
documentCreateFieldsL :: Lens_' DocumentCreate ([DocumentField])
documentCreateFieldsL f DocumentCreate{..} = (\documentCreateFields -> DocumentCreate { documentCreateFields, ..} ) <$> f documentCreateFields
{-# INLINE documentCreateFieldsL #-}



-- * DocumentField

-- | 'documentFieldNumberValue' Lens
documentFieldNumberValueL :: Lens_' DocumentField (Maybe Double)
documentFieldNumberValueL f DocumentField{..} = (\documentFieldNumberValue -> DocumentField { documentFieldNumberValue, ..} ) <$> f documentFieldNumberValue
{-# INLINE documentFieldNumberValueL #-}

-- | 'documentFieldPhotoValue' Lens
documentFieldPhotoValueL :: Lens_' DocumentField (Maybe [DocumentFieldCreatePhotoValue])
documentFieldPhotoValueL f DocumentField{..} = (\documentFieldPhotoValue -> DocumentField { documentFieldPhotoValue, ..} ) <$> f documentFieldPhotoValue
{-# INLINE documentFieldPhotoValueL #-}

-- | 'documentFieldStringValue' Lens
documentFieldStringValueL :: Lens_' DocumentField (Maybe Text)
documentFieldStringValueL f DocumentField{..} = (\documentFieldStringValue -> DocumentField { documentFieldStringValue, ..} ) <$> f documentFieldStringValue
{-# INLINE documentFieldStringValueL #-}

-- | 'documentFieldValueType' Lens
documentFieldValueTypeL :: Lens_' DocumentField (Text)
documentFieldValueTypeL f DocumentField{..} = (\documentFieldValueType -> DocumentField { documentFieldValueType, ..} ) <$> f documentFieldValueType
{-# INLINE documentFieldValueTypeL #-}

-- | 'documentFieldLabel' Lens
documentFieldLabelL :: Lens_' DocumentField (Text)
documentFieldLabelL f DocumentField{..} = (\documentFieldLabel -> DocumentField { documentFieldLabel, ..} ) <$> f documentFieldLabel
{-# INLINE documentFieldLabelL #-}

-- | 'documentFieldValue' Lens
documentFieldValueL :: Lens_' DocumentField (Maybe A.Value)
documentFieldValueL f DocumentField{..} = (\documentFieldValue -> DocumentField { documentFieldValue, ..} ) <$> f documentFieldValue
{-# INLINE documentFieldValueL #-}



-- * DocumentFieldCreate

-- | 'documentFieldCreateNumberValue' Lens
documentFieldCreateNumberValueL :: Lens_' DocumentFieldCreate (Maybe Double)
documentFieldCreateNumberValueL f DocumentFieldCreate{..} = (\documentFieldCreateNumberValue -> DocumentFieldCreate { documentFieldCreateNumberValue, ..} ) <$> f documentFieldCreateNumberValue
{-# INLINE documentFieldCreateNumberValueL #-}

-- | 'documentFieldCreatePhotoValue' Lens
documentFieldCreatePhotoValueL :: Lens_' DocumentFieldCreate (Maybe [DocumentFieldCreatePhotoValue])
documentFieldCreatePhotoValueL f DocumentFieldCreate{..} = (\documentFieldCreatePhotoValue -> DocumentFieldCreate { documentFieldCreatePhotoValue, ..} ) <$> f documentFieldCreatePhotoValue
{-# INLINE documentFieldCreatePhotoValueL #-}

-- | 'documentFieldCreateStringValue' Lens
documentFieldCreateStringValueL :: Lens_' DocumentFieldCreate (Maybe Text)
documentFieldCreateStringValueL f DocumentFieldCreate{..} = (\documentFieldCreateStringValue -> DocumentFieldCreate { documentFieldCreateStringValue, ..} ) <$> f documentFieldCreateStringValue
{-# INLINE documentFieldCreateStringValueL #-}

-- | 'documentFieldCreateValueType' Lens
documentFieldCreateValueTypeL :: Lens_' DocumentFieldCreate (Text)
documentFieldCreateValueTypeL f DocumentFieldCreate{..} = (\documentFieldCreateValueType -> DocumentFieldCreate { documentFieldCreateValueType, ..} ) <$> f documentFieldCreateValueType
{-# INLINE documentFieldCreateValueTypeL #-}



-- * DocumentFieldCreatePhotoValue

-- | 'documentFieldCreatePhotoValueUrl' Lens
documentFieldCreatePhotoValueUrlL :: Lens_' DocumentFieldCreatePhotoValue (Maybe Text)
documentFieldCreatePhotoValueUrlL f DocumentFieldCreatePhotoValue{..} = (\documentFieldCreatePhotoValueUrl -> DocumentFieldCreatePhotoValue { documentFieldCreatePhotoValueUrl, ..} ) <$> f documentFieldCreatePhotoValueUrl
{-# INLINE documentFieldCreatePhotoValueUrlL #-}



-- * DocumentFieldType

-- | 'documentFieldTypeLabel' Lens
documentFieldTypeLabelL :: Lens_' DocumentFieldType (Text)
documentFieldTypeLabelL f DocumentFieldType{..} = (\documentFieldTypeLabel -> DocumentFieldType { documentFieldTypeLabel, ..} ) <$> f documentFieldTypeLabel
{-# INLINE documentFieldTypeLabelL #-}

-- | 'documentFieldTypeNumberValueTypeMetadata' Lens
documentFieldTypeNumberValueTypeMetadataL :: Lens_' DocumentFieldType (Maybe DocumentFieldTypeNumberValueTypeMetadata)
documentFieldTypeNumberValueTypeMetadataL f DocumentFieldType{..} = (\documentFieldTypeNumberValueTypeMetadata -> DocumentFieldType { documentFieldTypeNumberValueTypeMetadata, ..} ) <$> f documentFieldTypeNumberValueTypeMetadata
{-# INLINE documentFieldTypeNumberValueTypeMetadataL #-}

-- | 'documentFieldTypeValueType' Lens
documentFieldTypeValueTypeL :: Lens_' DocumentFieldType (Text)
documentFieldTypeValueTypeL f DocumentFieldType{..} = (\documentFieldTypeValueType -> DocumentFieldType { documentFieldTypeValueType, ..} ) <$> f documentFieldTypeValueType
{-# INLINE documentFieldTypeValueTypeL #-}



-- * DocumentFieldTypeNumberValueTypeMetadata

-- | 'documentFieldTypeNumberValueTypeMetadataNumDecimalPlaces' Lens
documentFieldTypeNumberValueTypeMetadataNumDecimalPlacesL :: Lens_' DocumentFieldTypeNumberValueTypeMetadata (Maybe Integer)
documentFieldTypeNumberValueTypeMetadataNumDecimalPlacesL f DocumentFieldTypeNumberValueTypeMetadata{..} = (\documentFieldTypeNumberValueTypeMetadataNumDecimalPlaces -> DocumentFieldTypeNumberValueTypeMetadata { documentFieldTypeNumberValueTypeMetadataNumDecimalPlaces, ..} ) <$> f documentFieldTypeNumberValueTypeMetadataNumDecimalPlaces
{-# INLINE documentFieldTypeNumberValueTypeMetadataNumDecimalPlacesL #-}



-- * DocumentType

-- | 'documentTypeFieldTypes' Lens
documentTypeFieldTypesL :: Lens_' DocumentType (Maybe [Array])
documentTypeFieldTypesL f DocumentType{..} = (\documentTypeFieldTypes -> DocumentType { documentTypeFieldTypes, ..} ) <$> f documentTypeFieldTypes
{-# INLINE documentTypeFieldTypesL #-}

-- | 'documentTypeName' Lens
documentTypeNameL :: Lens_' DocumentType (Text)
documentTypeNameL f DocumentType{..} = (\documentTypeName -> DocumentType { documentTypeName, ..} ) <$> f documentTypeName
{-# INLINE documentTypeNameL #-}

-- | 'documentTypeOrgId' Lens
documentTypeOrgIdL :: Lens_' DocumentType (Integer)
documentTypeOrgIdL f DocumentType{..} = (\documentTypeOrgId -> DocumentType { documentTypeOrgId, ..} ) <$> f documentTypeOrgId
{-# INLINE documentTypeOrgIdL #-}

-- | 'documentTypeUuid' Lens
documentTypeUuidL :: Lens_' DocumentType (Text)
documentTypeUuidL f DocumentType{..} = (\documentTypeUuid -> DocumentType { documentTypeUuid, ..} ) <$> f documentTypeUuid
{-# INLINE documentTypeUuidL #-}



-- * DoorResponse

-- | 'doorResponseGroupId' Lens
doorResponseGroupIdL :: Lens_' DoorResponse (Maybe Integer)
doorResponseGroupIdL f DoorResponse{..} = (\doorResponseGroupId -> DoorResponse { doorResponseGroupId, ..} ) <$> f doorResponseGroupId
{-# INLINE doorResponseGroupIdL #-}

-- | 'doorResponseSensors' Lens
doorResponseSensorsL :: Lens_' DoorResponse (Maybe [DoorResponseSensors])
doorResponseSensorsL f DoorResponse{..} = (\doorResponseSensors -> DoorResponse { doorResponseSensors, ..} ) <$> f doorResponseSensors
{-# INLINE doorResponseSensorsL #-}



-- * DoorResponseSensors

-- | 'doorResponseSensorsDoorClosed' Lens
doorResponseSensorsDoorClosedL :: Lens_' DoorResponseSensors (Maybe Bool)
doorResponseSensorsDoorClosedL f DoorResponseSensors{..} = (\doorResponseSensorsDoorClosed -> DoorResponseSensors { doorResponseSensorsDoorClosed, ..} ) <$> f doorResponseSensorsDoorClosed
{-# INLINE doorResponseSensorsDoorClosedL #-}

-- | 'doorResponseSensorsName' Lens
doorResponseSensorsNameL :: Lens_' DoorResponseSensors (Maybe Text)
doorResponseSensorsNameL f DoorResponseSensors{..} = (\doorResponseSensorsName -> DoorResponseSensors { doorResponseSensorsName, ..} ) <$> f doorResponseSensorsName
{-# INLINE doorResponseSensorsNameL #-}

-- | 'doorResponseSensorsId' Lens
doorResponseSensorsIdL :: Lens_' DoorResponseSensors (Maybe Integer)
doorResponseSensorsIdL f DoorResponseSensors{..} = (\doorResponseSensorsId -> DoorResponseSensors { doorResponseSensorsId, ..} ) <$> f doorResponseSensorsId
{-# INLINE doorResponseSensorsIdL #-}



-- * Driver

-- | 'driverEldAdverseWeatherExemptionEnabled' Lens
driverEldAdverseWeatherExemptionEnabledL :: Lens_' Driver (Maybe Bool)
driverEldAdverseWeatherExemptionEnabledL f Driver{..} = (\driverEldAdverseWeatherExemptionEnabled -> Driver { driverEldAdverseWeatherExemptionEnabled, ..} ) <$> f driverEldAdverseWeatherExemptionEnabled
{-# INLINE driverEldAdverseWeatherExemptionEnabledL #-}

-- | 'driverEldBigDayExemptionEnabled' Lens
driverEldBigDayExemptionEnabledL :: Lens_' Driver (Maybe Bool)
driverEldBigDayExemptionEnabledL f Driver{..} = (\driverEldBigDayExemptionEnabled -> Driver { driverEldBigDayExemptionEnabled, ..} ) <$> f driverEldBigDayExemptionEnabled
{-# INLINE driverEldBigDayExemptionEnabledL #-}

-- | 'driverEldDayStartHour' Lens
driverEldDayStartHourL :: Lens_' Driver (Maybe Int)
driverEldDayStartHourL f Driver{..} = (\driverEldDayStartHour -> Driver { driverEldDayStartHour, ..} ) <$> f driverEldDayStartHour
{-# INLINE driverEldDayStartHourL #-}

-- | 'driverEldExempt' Lens
driverEldExemptL :: Lens_' Driver (Maybe Bool)
driverEldExemptL f Driver{..} = (\driverEldExempt -> Driver { driverEldExempt, ..} ) <$> f driverEldExempt
{-# INLINE driverEldExemptL #-}

-- | 'driverEldExemptReason' Lens
driverEldExemptReasonL :: Lens_' Driver (Maybe Text)
driverEldExemptReasonL f Driver{..} = (\driverEldExemptReason -> Driver { driverEldExemptReason, ..} ) <$> f driverEldExemptReason
{-# INLINE driverEldExemptReasonL #-}

-- | 'driverEldPcEnabled' Lens
driverEldPcEnabledL :: Lens_' Driver (Maybe Bool)
driverEldPcEnabledL f Driver{..} = (\driverEldPcEnabled -> Driver { driverEldPcEnabled, ..} ) <$> f driverEldPcEnabled
{-# INLINE driverEldPcEnabledL #-}

-- | 'driverEldYmEnabled' Lens
driverEldYmEnabledL :: Lens_' Driver (Maybe Bool)
driverEldYmEnabledL f Driver{..} = (\driverEldYmEnabled -> Driver { driverEldYmEnabled, ..} ) <$> f driverEldYmEnabled
{-# INLINE driverEldYmEnabledL #-}

-- | 'driverExternalIds' Lens
driverExternalIdsL :: Lens_' Driver (Maybe (Map.Map String Text))
driverExternalIdsL f Driver{..} = (\driverExternalIds -> Driver { driverExternalIds, ..} ) <$> f driverExternalIds
{-# INLINE driverExternalIdsL #-}

-- | 'driverGroupId' Lens
driverGroupIdL :: Lens_' Driver (Maybe Integer)
driverGroupIdL f Driver{..} = (\driverGroupId -> Driver { driverGroupId, ..} ) <$> f driverGroupId
{-# INLINE driverGroupIdL #-}

-- | 'driverLicenseNumber' Lens
driverLicenseNumberL :: Lens_' Driver (Maybe Text)
driverLicenseNumberL f Driver{..} = (\driverLicenseNumber -> Driver { driverLicenseNumber, ..} ) <$> f driverLicenseNumber
{-# INLINE driverLicenseNumberL #-}

-- | 'driverLicenseState' Lens
driverLicenseStateL :: Lens_' Driver (Maybe Text)
driverLicenseStateL f Driver{..} = (\driverLicenseState -> Driver { driverLicenseState, ..} ) <$> f driverLicenseState
{-# INLINE driverLicenseStateL #-}

-- | 'driverName' Lens
driverNameL :: Lens_' Driver (Text)
driverNameL f Driver{..} = (\driverName -> Driver { driverName, ..} ) <$> f driverName
{-# INLINE driverNameL #-}

-- | 'driverNotes' Lens
driverNotesL :: Lens_' Driver (Maybe Text)
driverNotesL f Driver{..} = (\driverNotes -> Driver { driverNotes, ..} ) <$> f driverNotes
{-# INLINE driverNotesL #-}

-- | 'driverPhone' Lens
driverPhoneL :: Lens_' Driver (Maybe Text)
driverPhoneL f Driver{..} = (\driverPhone -> Driver { driverPhone, ..} ) <$> f driverPhone
{-# INLINE driverPhoneL #-}

-- | 'driverUsername' Lens
driverUsernameL :: Lens_' Driver (Maybe Text)
driverUsernameL f Driver{..} = (\driverUsername -> Driver { driverUsername, ..} ) <$> f driverUsername
{-# INLINE driverUsernameL #-}

-- | 'driverVehicleId' Lens
driverVehicleIdL :: Lens_' Driver (Maybe Integer)
driverVehicleIdL f Driver{..} = (\driverVehicleId -> Driver { driverVehicleId, ..} ) <$> f driverVehicleId
{-# INLINE driverVehicleIdL #-}

-- | 'driverId' Lens
driverIdL :: Lens_' Driver (Integer)
driverIdL f Driver{..} = (\driverId -> Driver { driverId, ..} ) <$> f driverId
{-# INLINE driverIdL #-}

-- | 'driverIsDeactivated' Lens
driverIsDeactivatedL :: Lens_' Driver (Maybe Bool)
driverIsDeactivatedL f Driver{..} = (\driverIsDeactivated -> Driver { driverIsDeactivated, ..} ) <$> f driverIsDeactivated
{-# INLINE driverIsDeactivatedL #-}

-- | 'driverTags' Lens
driverTagsL :: Lens_' Driver (Maybe [TagMetadata])
driverTagsL f Driver{..} = (\driverTags -> Driver { driverTags, ..} ) <$> f driverTags
{-# INLINE driverTagsL #-}



-- * DriverBase

-- | 'driverBaseEldAdverseWeatherExemptionEnabled' Lens
driverBaseEldAdverseWeatherExemptionEnabledL :: Lens_' DriverBase (Maybe Bool)
driverBaseEldAdverseWeatherExemptionEnabledL f DriverBase{..} = (\driverBaseEldAdverseWeatherExemptionEnabled -> DriverBase { driverBaseEldAdverseWeatherExemptionEnabled, ..} ) <$> f driverBaseEldAdverseWeatherExemptionEnabled
{-# INLINE driverBaseEldAdverseWeatherExemptionEnabledL #-}

-- | 'driverBaseEldBigDayExemptionEnabled' Lens
driverBaseEldBigDayExemptionEnabledL :: Lens_' DriverBase (Maybe Bool)
driverBaseEldBigDayExemptionEnabledL f DriverBase{..} = (\driverBaseEldBigDayExemptionEnabled -> DriverBase { driverBaseEldBigDayExemptionEnabled, ..} ) <$> f driverBaseEldBigDayExemptionEnabled
{-# INLINE driverBaseEldBigDayExemptionEnabledL #-}

-- | 'driverBaseEldDayStartHour' Lens
driverBaseEldDayStartHourL :: Lens_' DriverBase (Maybe Int)
driverBaseEldDayStartHourL f DriverBase{..} = (\driverBaseEldDayStartHour -> DriverBase { driverBaseEldDayStartHour, ..} ) <$> f driverBaseEldDayStartHour
{-# INLINE driverBaseEldDayStartHourL #-}

-- | 'driverBaseEldExempt' Lens
driverBaseEldExemptL :: Lens_' DriverBase (Maybe Bool)
driverBaseEldExemptL f DriverBase{..} = (\driverBaseEldExempt -> DriverBase { driverBaseEldExempt, ..} ) <$> f driverBaseEldExempt
{-# INLINE driverBaseEldExemptL #-}

-- | 'driverBaseEldExemptReason' Lens
driverBaseEldExemptReasonL :: Lens_' DriverBase (Maybe Text)
driverBaseEldExemptReasonL f DriverBase{..} = (\driverBaseEldExemptReason -> DriverBase { driverBaseEldExemptReason, ..} ) <$> f driverBaseEldExemptReason
{-# INLINE driverBaseEldExemptReasonL #-}

-- | 'driverBaseEldPcEnabled' Lens
driverBaseEldPcEnabledL :: Lens_' DriverBase (Maybe Bool)
driverBaseEldPcEnabledL f DriverBase{..} = (\driverBaseEldPcEnabled -> DriverBase { driverBaseEldPcEnabled, ..} ) <$> f driverBaseEldPcEnabled
{-# INLINE driverBaseEldPcEnabledL #-}

-- | 'driverBaseEldYmEnabled' Lens
driverBaseEldYmEnabledL :: Lens_' DriverBase (Maybe Bool)
driverBaseEldYmEnabledL f DriverBase{..} = (\driverBaseEldYmEnabled -> DriverBase { driverBaseEldYmEnabled, ..} ) <$> f driverBaseEldYmEnabled
{-# INLINE driverBaseEldYmEnabledL #-}

-- | 'driverBaseExternalIds' Lens
driverBaseExternalIdsL :: Lens_' DriverBase (Maybe (Map.Map String Text))
driverBaseExternalIdsL f DriverBase{..} = (\driverBaseExternalIds -> DriverBase { driverBaseExternalIds, ..} ) <$> f driverBaseExternalIds
{-# INLINE driverBaseExternalIdsL #-}

-- | 'driverBaseGroupId' Lens
driverBaseGroupIdL :: Lens_' DriverBase (Maybe Integer)
driverBaseGroupIdL f DriverBase{..} = (\driverBaseGroupId -> DriverBase { driverBaseGroupId, ..} ) <$> f driverBaseGroupId
{-# INLINE driverBaseGroupIdL #-}

-- | 'driverBaseLicenseNumber' Lens
driverBaseLicenseNumberL :: Lens_' DriverBase (Maybe Text)
driverBaseLicenseNumberL f DriverBase{..} = (\driverBaseLicenseNumber -> DriverBase { driverBaseLicenseNumber, ..} ) <$> f driverBaseLicenseNumber
{-# INLINE driverBaseLicenseNumberL #-}

-- | 'driverBaseLicenseState' Lens
driverBaseLicenseStateL :: Lens_' DriverBase (Maybe Text)
driverBaseLicenseStateL f DriverBase{..} = (\driverBaseLicenseState -> DriverBase { driverBaseLicenseState, ..} ) <$> f driverBaseLicenseState
{-# INLINE driverBaseLicenseStateL #-}

-- | 'driverBaseName' Lens
driverBaseNameL :: Lens_' DriverBase (Text)
driverBaseNameL f DriverBase{..} = (\driverBaseName -> DriverBase { driverBaseName, ..} ) <$> f driverBaseName
{-# INLINE driverBaseNameL #-}

-- | 'driverBaseNotes' Lens
driverBaseNotesL :: Lens_' DriverBase (Maybe Text)
driverBaseNotesL f DriverBase{..} = (\driverBaseNotes -> DriverBase { driverBaseNotes, ..} ) <$> f driverBaseNotes
{-# INLINE driverBaseNotesL #-}

-- | 'driverBasePhone' Lens
driverBasePhoneL :: Lens_' DriverBase (Maybe Text)
driverBasePhoneL f DriverBase{..} = (\driverBasePhone -> DriverBase { driverBasePhone, ..} ) <$> f driverBasePhone
{-# INLINE driverBasePhoneL #-}

-- | 'driverBaseUsername' Lens
driverBaseUsernameL :: Lens_' DriverBase (Maybe Text)
driverBaseUsernameL f DriverBase{..} = (\driverBaseUsername -> DriverBase { driverBaseUsername, ..} ) <$> f driverBaseUsername
{-# INLINE driverBaseUsernameL #-}

-- | 'driverBaseVehicleId' Lens
driverBaseVehicleIdL :: Lens_' DriverBase (Maybe Integer)
driverBaseVehicleIdL f DriverBase{..} = (\driverBaseVehicleId -> DriverBase { driverBaseVehicleId, ..} ) <$> f driverBaseVehicleId
{-# INLINE driverBaseVehicleIdL #-}



-- * DriverDailyLogResponse

-- | 'driverDailyLogResponseDays' Lens
driverDailyLogResponseDaysL :: Lens_' DriverDailyLogResponse (Maybe [DriverDailyLogResponseDays])
driverDailyLogResponseDaysL f DriverDailyLogResponse{..} = (\driverDailyLogResponseDays -> DriverDailyLogResponse { driverDailyLogResponseDays, ..} ) <$> f driverDailyLogResponseDays
{-# INLINE driverDailyLogResponseDaysL #-}



-- * DriverDailyLogResponseDays

-- | 'driverDailyLogResponseDaysCertifiedAtMs' Lens
driverDailyLogResponseDaysCertifiedAtMsL :: Lens_' DriverDailyLogResponseDays (Maybe Integer)
driverDailyLogResponseDaysCertifiedAtMsL f DriverDailyLogResponseDays{..} = (\driverDailyLogResponseDaysCertifiedAtMs -> DriverDailyLogResponseDays { driverDailyLogResponseDaysCertifiedAtMs, ..} ) <$> f driverDailyLogResponseDaysCertifiedAtMs
{-# INLINE driverDailyLogResponseDaysCertifiedAtMsL #-}

-- | 'driverDailyLogResponseDaysEndMs' Lens
driverDailyLogResponseDaysEndMsL :: Lens_' DriverDailyLogResponseDays (Maybe Int)
driverDailyLogResponseDaysEndMsL f DriverDailyLogResponseDays{..} = (\driverDailyLogResponseDaysEndMs -> DriverDailyLogResponseDays { driverDailyLogResponseDaysEndMs, ..} ) <$> f driverDailyLogResponseDaysEndMs
{-# INLINE driverDailyLogResponseDaysEndMsL #-}

-- | 'driverDailyLogResponseDaysStartMs' Lens
driverDailyLogResponseDaysStartMsL :: Lens_' DriverDailyLogResponseDays (Maybe Int)
driverDailyLogResponseDaysStartMsL f DriverDailyLogResponseDays{..} = (\driverDailyLogResponseDaysStartMs -> DriverDailyLogResponseDays { driverDailyLogResponseDaysStartMs, ..} ) <$> f driverDailyLogResponseDaysStartMs
{-# INLINE driverDailyLogResponseDaysStartMsL #-}

-- | 'driverDailyLogResponseDaysTrailerIds' Lens
driverDailyLogResponseDaysTrailerIdsL :: Lens_' DriverDailyLogResponseDays (Maybe A.Value)
driverDailyLogResponseDaysTrailerIdsL f DriverDailyLogResponseDays{..} = (\driverDailyLogResponseDaysTrailerIds -> DriverDailyLogResponseDays { driverDailyLogResponseDaysTrailerIds, ..} ) <$> f driverDailyLogResponseDaysTrailerIds
{-# INLINE driverDailyLogResponseDaysTrailerIdsL #-}

-- | 'driverDailyLogResponseDaysActiveHours' Lens
driverDailyLogResponseDaysActiveHoursL :: Lens_' DriverDailyLogResponseDays (Maybe Double)
driverDailyLogResponseDaysActiveHoursL f DriverDailyLogResponseDays{..} = (\driverDailyLogResponseDaysActiveHours -> DriverDailyLogResponseDays { driverDailyLogResponseDaysActiveHours, ..} ) <$> f driverDailyLogResponseDaysActiveHours
{-# INLINE driverDailyLogResponseDaysActiveHoursL #-}

-- | 'driverDailyLogResponseDaysDistanceMiles' Lens
driverDailyLogResponseDaysDistanceMilesL :: Lens_' DriverDailyLogResponseDays (Maybe Double)
driverDailyLogResponseDaysDistanceMilesL f DriverDailyLogResponseDays{..} = (\driverDailyLogResponseDaysDistanceMiles -> DriverDailyLogResponseDays { driverDailyLogResponseDaysDistanceMiles, ..} ) <$> f driverDailyLogResponseDaysDistanceMiles
{-# INLINE driverDailyLogResponseDaysDistanceMilesL #-}

-- | 'driverDailyLogResponseDaysActiveMs' Lens
driverDailyLogResponseDaysActiveMsL :: Lens_' DriverDailyLogResponseDays (Maybe Integer)
driverDailyLogResponseDaysActiveMsL f DriverDailyLogResponseDays{..} = (\driverDailyLogResponseDaysActiveMs -> DriverDailyLogResponseDays { driverDailyLogResponseDaysActiveMs, ..} ) <$> f driverDailyLogResponseDaysActiveMs
{-# INLINE driverDailyLogResponseDaysActiveMsL #-}

-- | 'driverDailyLogResponseDaysCertified' Lens
driverDailyLogResponseDaysCertifiedL :: Lens_' DriverDailyLogResponseDays (Maybe Bool)
driverDailyLogResponseDaysCertifiedL f DriverDailyLogResponseDays{..} = (\driverDailyLogResponseDaysCertified -> DriverDailyLogResponseDays { driverDailyLogResponseDaysCertified, ..} ) <$> f driverDailyLogResponseDaysCertified
{-# INLINE driverDailyLogResponseDaysCertifiedL #-}

-- | 'driverDailyLogResponseDaysVehicleIds' Lens
driverDailyLogResponseDaysVehicleIdsL :: Lens_' DriverDailyLogResponseDays (Maybe A.Value)
driverDailyLogResponseDaysVehicleIdsL f DriverDailyLogResponseDays{..} = (\driverDailyLogResponseDaysVehicleIds -> DriverDailyLogResponseDays { driverDailyLogResponseDaysVehicleIds, ..} ) <$> f driverDailyLogResponseDaysVehicleIds
{-# INLINE driverDailyLogResponseDaysVehicleIdsL #-}



-- * DriverForCreate

-- | 'driverForCreateEldAdverseWeatherExemptionEnabled' Lens
driverForCreateEldAdverseWeatherExemptionEnabledL :: Lens_' DriverForCreate (Maybe Bool)
driverForCreateEldAdverseWeatherExemptionEnabledL f DriverForCreate{..} = (\driverForCreateEldAdverseWeatherExemptionEnabled -> DriverForCreate { driverForCreateEldAdverseWeatherExemptionEnabled, ..} ) <$> f driverForCreateEldAdverseWeatherExemptionEnabled
{-# INLINE driverForCreateEldAdverseWeatherExemptionEnabledL #-}

-- | 'driverForCreateEldBigDayExemptionEnabled' Lens
driverForCreateEldBigDayExemptionEnabledL :: Lens_' DriverForCreate (Maybe Bool)
driverForCreateEldBigDayExemptionEnabledL f DriverForCreate{..} = (\driverForCreateEldBigDayExemptionEnabled -> DriverForCreate { driverForCreateEldBigDayExemptionEnabled, ..} ) <$> f driverForCreateEldBigDayExemptionEnabled
{-# INLINE driverForCreateEldBigDayExemptionEnabledL #-}

-- | 'driverForCreateEldDayStartHour' Lens
driverForCreateEldDayStartHourL :: Lens_' DriverForCreate (Maybe Int)
driverForCreateEldDayStartHourL f DriverForCreate{..} = (\driverForCreateEldDayStartHour -> DriverForCreate { driverForCreateEldDayStartHour, ..} ) <$> f driverForCreateEldDayStartHour
{-# INLINE driverForCreateEldDayStartHourL #-}

-- | 'driverForCreateEldExempt' Lens
driverForCreateEldExemptL :: Lens_' DriverForCreate (Maybe Bool)
driverForCreateEldExemptL f DriverForCreate{..} = (\driverForCreateEldExempt -> DriverForCreate { driverForCreateEldExempt, ..} ) <$> f driverForCreateEldExempt
{-# INLINE driverForCreateEldExemptL #-}

-- | 'driverForCreateEldExemptReason' Lens
driverForCreateEldExemptReasonL :: Lens_' DriverForCreate (Maybe Text)
driverForCreateEldExemptReasonL f DriverForCreate{..} = (\driverForCreateEldExemptReason -> DriverForCreate { driverForCreateEldExemptReason, ..} ) <$> f driverForCreateEldExemptReason
{-# INLINE driverForCreateEldExemptReasonL #-}

-- | 'driverForCreateEldPcEnabled' Lens
driverForCreateEldPcEnabledL :: Lens_' DriverForCreate (Maybe Bool)
driverForCreateEldPcEnabledL f DriverForCreate{..} = (\driverForCreateEldPcEnabled -> DriverForCreate { driverForCreateEldPcEnabled, ..} ) <$> f driverForCreateEldPcEnabled
{-# INLINE driverForCreateEldPcEnabledL #-}

-- | 'driverForCreateEldYmEnabled' Lens
driverForCreateEldYmEnabledL :: Lens_' DriverForCreate (Maybe Bool)
driverForCreateEldYmEnabledL f DriverForCreate{..} = (\driverForCreateEldYmEnabled -> DriverForCreate { driverForCreateEldYmEnabled, ..} ) <$> f driverForCreateEldYmEnabled
{-# INLINE driverForCreateEldYmEnabledL #-}

-- | 'driverForCreateExternalIds' Lens
driverForCreateExternalIdsL :: Lens_' DriverForCreate (Maybe (Map.Map String Text))
driverForCreateExternalIdsL f DriverForCreate{..} = (\driverForCreateExternalIds -> DriverForCreate { driverForCreateExternalIds, ..} ) <$> f driverForCreateExternalIds
{-# INLINE driverForCreateExternalIdsL #-}

-- | 'driverForCreateGroupId' Lens
driverForCreateGroupIdL :: Lens_' DriverForCreate (Maybe Integer)
driverForCreateGroupIdL f DriverForCreate{..} = (\driverForCreateGroupId -> DriverForCreate { driverForCreateGroupId, ..} ) <$> f driverForCreateGroupId
{-# INLINE driverForCreateGroupIdL #-}

-- | 'driverForCreateLicenseNumber' Lens
driverForCreateLicenseNumberL :: Lens_' DriverForCreate (Maybe Text)
driverForCreateLicenseNumberL f DriverForCreate{..} = (\driverForCreateLicenseNumber -> DriverForCreate { driverForCreateLicenseNumber, ..} ) <$> f driverForCreateLicenseNumber
{-# INLINE driverForCreateLicenseNumberL #-}

-- | 'driverForCreateLicenseState' Lens
driverForCreateLicenseStateL :: Lens_' DriverForCreate (Maybe Text)
driverForCreateLicenseStateL f DriverForCreate{..} = (\driverForCreateLicenseState -> DriverForCreate { driverForCreateLicenseState, ..} ) <$> f driverForCreateLicenseState
{-# INLINE driverForCreateLicenseStateL #-}

-- | 'driverForCreateName' Lens
driverForCreateNameL :: Lens_' DriverForCreate (Text)
driverForCreateNameL f DriverForCreate{..} = (\driverForCreateName -> DriverForCreate { driverForCreateName, ..} ) <$> f driverForCreateName
{-# INLINE driverForCreateNameL #-}

-- | 'driverForCreateNotes' Lens
driverForCreateNotesL :: Lens_' DriverForCreate (Maybe Text)
driverForCreateNotesL f DriverForCreate{..} = (\driverForCreateNotes -> DriverForCreate { driverForCreateNotes, ..} ) <$> f driverForCreateNotes
{-# INLINE driverForCreateNotesL #-}

-- | 'driverForCreatePhone' Lens
driverForCreatePhoneL :: Lens_' DriverForCreate (Maybe Text)
driverForCreatePhoneL f DriverForCreate{..} = (\driverForCreatePhone -> DriverForCreate { driverForCreatePhone, ..} ) <$> f driverForCreatePhone
{-# INLINE driverForCreatePhoneL #-}

-- | 'driverForCreateUsername' Lens
driverForCreateUsernameL :: Lens_' DriverForCreate (Maybe Text)
driverForCreateUsernameL f DriverForCreate{..} = (\driverForCreateUsername -> DriverForCreate { driverForCreateUsername, ..} ) <$> f driverForCreateUsername
{-# INLINE driverForCreateUsernameL #-}

-- | 'driverForCreateVehicleId' Lens
driverForCreateVehicleIdL :: Lens_' DriverForCreate (Maybe Integer)
driverForCreateVehicleIdL f DriverForCreate{..} = (\driverForCreateVehicleId -> DriverForCreate { driverForCreateVehicleId, ..} ) <$> f driverForCreateVehicleId
{-# INLINE driverForCreateVehicleIdL #-}

-- | 'driverForCreatePassword' Lens
driverForCreatePasswordL :: Lens_' DriverForCreate (Text)
driverForCreatePasswordL f DriverForCreate{..} = (\driverForCreatePassword -> DriverForCreate { driverForCreatePassword, ..} ) <$> f driverForCreatePassword
{-# INLINE driverForCreatePasswordL #-}

-- | 'driverForCreateTagIds' Lens
driverForCreateTagIdsL :: Lens_' DriverForCreate (Maybe [Integer])
driverForCreateTagIdsL f DriverForCreate{..} = (\driverForCreateTagIds -> DriverForCreate { driverForCreateTagIds, ..} ) <$> f driverForCreateTagIds
{-# INLINE driverForCreateTagIdsL #-}



-- * DriverSafetyScoreResponse

-- | 'driverSafetyScoreResponseCrashCount' Lens
driverSafetyScoreResponseCrashCountL :: Lens_' DriverSafetyScoreResponse (Maybe Int)
driverSafetyScoreResponseCrashCountL f DriverSafetyScoreResponse{..} = (\driverSafetyScoreResponseCrashCount -> DriverSafetyScoreResponse { driverSafetyScoreResponseCrashCount, ..} ) <$> f driverSafetyScoreResponseCrashCount
{-# INLINE driverSafetyScoreResponseCrashCountL #-}

-- | 'driverSafetyScoreResponseDriverId' Lens
driverSafetyScoreResponseDriverIdL :: Lens_' DriverSafetyScoreResponse (Maybe Int)
driverSafetyScoreResponseDriverIdL f DriverSafetyScoreResponse{..} = (\driverSafetyScoreResponseDriverId -> DriverSafetyScoreResponse { driverSafetyScoreResponseDriverId, ..} ) <$> f driverSafetyScoreResponseDriverId
{-# INLINE driverSafetyScoreResponseDriverIdL #-}

-- | 'driverSafetyScoreResponseHarshAccelCount' Lens
driverSafetyScoreResponseHarshAccelCountL :: Lens_' DriverSafetyScoreResponse (Maybe Int)
driverSafetyScoreResponseHarshAccelCountL f DriverSafetyScoreResponse{..} = (\driverSafetyScoreResponseHarshAccelCount -> DriverSafetyScoreResponse { driverSafetyScoreResponseHarshAccelCount, ..} ) <$> f driverSafetyScoreResponseHarshAccelCount
{-# INLINE driverSafetyScoreResponseHarshAccelCountL #-}

-- | 'driverSafetyScoreResponseHarshBrakingCount' Lens
driverSafetyScoreResponseHarshBrakingCountL :: Lens_' DriverSafetyScoreResponse (Maybe Int)
driverSafetyScoreResponseHarshBrakingCountL f DriverSafetyScoreResponse{..} = (\driverSafetyScoreResponseHarshBrakingCount -> DriverSafetyScoreResponse { driverSafetyScoreResponseHarshBrakingCount, ..} ) <$> f driverSafetyScoreResponseHarshBrakingCount
{-# INLINE driverSafetyScoreResponseHarshBrakingCountL #-}

-- | 'driverSafetyScoreResponseHarshEvents' Lens
driverSafetyScoreResponseHarshEventsL :: Lens_' DriverSafetyScoreResponse (Maybe [SafetyReportHarshEvent])
driverSafetyScoreResponseHarshEventsL f DriverSafetyScoreResponse{..} = (\driverSafetyScoreResponseHarshEvents -> DriverSafetyScoreResponse { driverSafetyScoreResponseHarshEvents, ..} ) <$> f driverSafetyScoreResponseHarshEvents
{-# INLINE driverSafetyScoreResponseHarshEventsL #-}

-- | 'driverSafetyScoreResponseHarshTurningCount' Lens
driverSafetyScoreResponseHarshTurningCountL :: Lens_' DriverSafetyScoreResponse (Maybe Int)
driverSafetyScoreResponseHarshTurningCountL f DriverSafetyScoreResponse{..} = (\driverSafetyScoreResponseHarshTurningCount -> DriverSafetyScoreResponse { driverSafetyScoreResponseHarshTurningCount, ..} ) <$> f driverSafetyScoreResponseHarshTurningCount
{-# INLINE driverSafetyScoreResponseHarshTurningCountL #-}

-- | 'driverSafetyScoreResponseSafetyScore' Lens
driverSafetyScoreResponseSafetyScoreL :: Lens_' DriverSafetyScoreResponse (Maybe Int)
driverSafetyScoreResponseSafetyScoreL f DriverSafetyScoreResponse{..} = (\driverSafetyScoreResponseSafetyScore -> DriverSafetyScoreResponse { driverSafetyScoreResponseSafetyScore, ..} ) <$> f driverSafetyScoreResponseSafetyScore
{-# INLINE driverSafetyScoreResponseSafetyScoreL #-}

-- | 'driverSafetyScoreResponseSafetyScoreRank' Lens
driverSafetyScoreResponseSafetyScoreRankL :: Lens_' DriverSafetyScoreResponse (Maybe Text)
driverSafetyScoreResponseSafetyScoreRankL f DriverSafetyScoreResponse{..} = (\driverSafetyScoreResponseSafetyScoreRank -> DriverSafetyScoreResponse { driverSafetyScoreResponseSafetyScoreRank, ..} ) <$> f driverSafetyScoreResponseSafetyScoreRank
{-# INLINE driverSafetyScoreResponseSafetyScoreRankL #-}

-- | 'driverSafetyScoreResponseTimeOverSpeedLimitMs' Lens
driverSafetyScoreResponseTimeOverSpeedLimitMsL :: Lens_' DriverSafetyScoreResponse (Maybe Int)
driverSafetyScoreResponseTimeOverSpeedLimitMsL f DriverSafetyScoreResponse{..} = (\driverSafetyScoreResponseTimeOverSpeedLimitMs -> DriverSafetyScoreResponse { driverSafetyScoreResponseTimeOverSpeedLimitMs, ..} ) <$> f driverSafetyScoreResponseTimeOverSpeedLimitMs
{-# INLINE driverSafetyScoreResponseTimeOverSpeedLimitMsL #-}

-- | 'driverSafetyScoreResponseTotalDistanceDrivenMeters' Lens
driverSafetyScoreResponseTotalDistanceDrivenMetersL :: Lens_' DriverSafetyScoreResponse (Maybe Int)
driverSafetyScoreResponseTotalDistanceDrivenMetersL f DriverSafetyScoreResponse{..} = (\driverSafetyScoreResponseTotalDistanceDrivenMeters -> DriverSafetyScoreResponse { driverSafetyScoreResponseTotalDistanceDrivenMeters, ..} ) <$> f driverSafetyScoreResponseTotalDistanceDrivenMeters
{-# INLINE driverSafetyScoreResponseTotalDistanceDrivenMetersL #-}

-- | 'driverSafetyScoreResponseTotalHarshEventCount' Lens
driverSafetyScoreResponseTotalHarshEventCountL :: Lens_' DriverSafetyScoreResponse (Maybe Int)
driverSafetyScoreResponseTotalHarshEventCountL f DriverSafetyScoreResponse{..} = (\driverSafetyScoreResponseTotalHarshEventCount -> DriverSafetyScoreResponse { driverSafetyScoreResponseTotalHarshEventCount, ..} ) <$> f driverSafetyScoreResponseTotalHarshEventCount
{-# INLINE driverSafetyScoreResponseTotalHarshEventCountL #-}

-- | 'driverSafetyScoreResponseTotalTimeDrivenMs' Lens
driverSafetyScoreResponseTotalTimeDrivenMsL :: Lens_' DriverSafetyScoreResponse (Maybe Int)
driverSafetyScoreResponseTotalTimeDrivenMsL f DriverSafetyScoreResponse{..} = (\driverSafetyScoreResponseTotalTimeDrivenMs -> DriverSafetyScoreResponse { driverSafetyScoreResponseTotalTimeDrivenMs, ..} ) <$> f driverSafetyScoreResponseTotalTimeDrivenMs
{-# INLINE driverSafetyScoreResponseTotalTimeDrivenMsL #-}



-- * DriversResponse

-- | 'driversResponseDrivers' Lens
driversResponseDriversL :: Lens_' DriversResponse (Maybe [Driver])
driversResponseDriversL f DriversResponse{..} = (\driversResponseDrivers -> DriversResponse { driversResponseDrivers, ..} ) <$> f driversResponseDrivers
{-# INLINE driversResponseDriversL #-}



-- * DriversSummaryResponse

-- | 'driversSummaryResponseSummaries' Lens
driversSummaryResponseSummariesL :: Lens_' DriversSummaryResponse (Maybe [DriversSummaryResponseSummaries])
driversSummaryResponseSummariesL f DriversSummaryResponse{..} = (\driversSummaryResponseSummaries -> DriversSummaryResponse { driversSummaryResponseSummaries, ..} ) <$> f driversSummaryResponseSummaries
{-# INLINE driversSummaryResponseSummariesL #-}



-- * DriversSummaryResponseSummaries

-- | 'driversSummaryResponseSummariesDriverId' Lens
driversSummaryResponseSummariesDriverIdL :: Lens_' DriversSummaryResponseSummaries (Maybe Integer)
driversSummaryResponseSummariesDriverIdL f DriversSummaryResponseSummaries{..} = (\driversSummaryResponseSummariesDriverId -> DriversSummaryResponseSummaries { driversSummaryResponseSummariesDriverId, ..} ) <$> f driversSummaryResponseSummariesDriverId
{-# INLINE driversSummaryResponseSummariesDriverIdL #-}

-- | 'driversSummaryResponseSummariesDistanceMiles' Lens
driversSummaryResponseSummariesDistanceMilesL :: Lens_' DriversSummaryResponseSummaries (Maybe Double)
driversSummaryResponseSummariesDistanceMilesL f DriversSummaryResponseSummaries{..} = (\driversSummaryResponseSummariesDistanceMiles -> DriversSummaryResponseSummaries { driversSummaryResponseSummariesDistanceMiles, ..} ) <$> f driversSummaryResponseSummariesDistanceMiles
{-# INLINE driversSummaryResponseSummariesDistanceMilesL #-}

-- | 'driversSummaryResponseSummariesDriveMs' Lens
driversSummaryResponseSummariesDriveMsL :: Lens_' DriversSummaryResponseSummaries (Maybe Integer)
driversSummaryResponseSummariesDriveMsL f DriversSummaryResponseSummaries{..} = (\driversSummaryResponseSummariesDriveMs -> DriversSummaryResponseSummaries { driversSummaryResponseSummariesDriveMs, ..} ) <$> f driversSummaryResponseSummariesDriveMs
{-# INLINE driversSummaryResponseSummariesDriveMsL #-}

-- | 'driversSummaryResponseSummariesActiveMs' Lens
driversSummaryResponseSummariesActiveMsL :: Lens_' DriversSummaryResponseSummaries (Maybe Integer)
driversSummaryResponseSummariesActiveMsL f DriversSummaryResponseSummaries{..} = (\driversSummaryResponseSummariesActiveMs -> DriversSummaryResponseSummaries { driversSummaryResponseSummariesActiveMs, ..} ) <$> f driversSummaryResponseSummariesActiveMs
{-# INLINE driversSummaryResponseSummariesActiveMsL #-}

-- | 'driversSummaryResponseSummariesDriverUsername' Lens
driversSummaryResponseSummariesDriverUsernameL :: Lens_' DriversSummaryResponseSummaries (Maybe Text)
driversSummaryResponseSummariesDriverUsernameL f DriversSummaryResponseSummaries{..} = (\driversSummaryResponseSummariesDriverUsername -> DriversSummaryResponseSummaries { driversSummaryResponseSummariesDriverUsername, ..} ) <$> f driversSummaryResponseSummariesDriverUsername
{-# INLINE driversSummaryResponseSummariesDriverUsernameL #-}

-- | 'driversSummaryResponseSummariesGroupId' Lens
driversSummaryResponseSummariesGroupIdL :: Lens_' DriversSummaryResponseSummaries (Maybe Integer)
driversSummaryResponseSummariesGroupIdL f DriversSummaryResponseSummaries{..} = (\driversSummaryResponseSummariesGroupId -> DriversSummaryResponseSummaries { driversSummaryResponseSummariesGroupId, ..} ) <$> f driversSummaryResponseSummariesGroupId
{-# INLINE driversSummaryResponseSummariesGroupIdL #-}

-- | 'driversSummaryResponseSummariesDriverName' Lens
driversSummaryResponseSummariesDriverNameL :: Lens_' DriversSummaryResponseSummaries (Maybe Text)
driversSummaryResponseSummariesDriverNameL f DriversSummaryResponseSummaries{..} = (\driversSummaryResponseSummariesDriverName -> DriversSummaryResponseSummaries { driversSummaryResponseSummariesDriverName, ..} ) <$> f driversSummaryResponseSummariesDriverName
{-# INLINE driversSummaryResponseSummariesDriverNameL #-}

-- | 'driversSummaryResponseSummariesOnDutyMs' Lens
driversSummaryResponseSummariesOnDutyMsL :: Lens_' DriversSummaryResponseSummaries (Maybe Integer)
driversSummaryResponseSummariesOnDutyMsL f DriversSummaryResponseSummaries{..} = (\driversSummaryResponseSummariesOnDutyMs -> DriversSummaryResponseSummaries { driversSummaryResponseSummariesOnDutyMs, ..} ) <$> f driversSummaryResponseSummariesOnDutyMs
{-# INLINE driversSummaryResponseSummariesOnDutyMsL #-}



-- * DvirBase

-- | 'dvirBaseAuthorSignature' Lens
dvirBaseAuthorSignatureL :: Lens_' DvirBase (Maybe DvirBaseAuthorSignature)
dvirBaseAuthorSignatureL f DvirBase{..} = (\dvirBaseAuthorSignature -> DvirBase { dvirBaseAuthorSignature, ..} ) <$> f dvirBaseAuthorSignature
{-# INLINE dvirBaseAuthorSignatureL #-}

-- | 'dvirBaseDefectsCorrected' Lens
dvirBaseDefectsCorrectedL :: Lens_' DvirBase (Maybe Bool)
dvirBaseDefectsCorrectedL f DvirBase{..} = (\dvirBaseDefectsCorrected -> DvirBase { dvirBaseDefectsCorrected, ..} ) <$> f dvirBaseDefectsCorrected
{-# INLINE dvirBaseDefectsCorrectedL #-}

-- | 'dvirBaseDefectsNeedNotBeCorrected' Lens
dvirBaseDefectsNeedNotBeCorrectedL :: Lens_' DvirBase (Maybe Bool)
dvirBaseDefectsNeedNotBeCorrectedL f DvirBase{..} = (\dvirBaseDefectsNeedNotBeCorrected -> DvirBase { dvirBaseDefectsNeedNotBeCorrected, ..} ) <$> f dvirBaseDefectsNeedNotBeCorrected
{-# INLINE dvirBaseDefectsNeedNotBeCorrectedL #-}

-- | 'dvirBaseId' Lens
dvirBaseIdL :: Lens_' DvirBase (Maybe Integer)
dvirBaseIdL f DvirBase{..} = (\dvirBaseId -> DvirBase { dvirBaseId, ..} ) <$> f dvirBaseId
{-# INLINE dvirBaseIdL #-}

-- | 'dvirBaseInspectionType' Lens
dvirBaseInspectionTypeL :: Lens_' DvirBase (Maybe Text)
dvirBaseInspectionTypeL f DvirBase{..} = (\dvirBaseInspectionType -> DvirBase { dvirBaseInspectionType, ..} ) <$> f dvirBaseInspectionType
{-# INLINE dvirBaseInspectionTypeL #-}

-- | 'dvirBaseMechanicNotes' Lens
dvirBaseMechanicNotesL :: Lens_' DvirBase (Maybe Text)
dvirBaseMechanicNotesL f DvirBase{..} = (\dvirBaseMechanicNotes -> DvirBase { dvirBaseMechanicNotes, ..} ) <$> f dvirBaseMechanicNotes
{-# INLINE dvirBaseMechanicNotesL #-}

-- | 'dvirBaseMechanicOrAgentSignature' Lens
dvirBaseMechanicOrAgentSignatureL :: Lens_' DvirBase (Maybe DvirBaseMechanicOrAgentSignature)
dvirBaseMechanicOrAgentSignatureL f DvirBase{..} = (\dvirBaseMechanicOrAgentSignature -> DvirBase { dvirBaseMechanicOrAgentSignature, ..} ) <$> f dvirBaseMechanicOrAgentSignature
{-# INLINE dvirBaseMechanicOrAgentSignatureL #-}

-- | 'dvirBaseNextDriverSignature' Lens
dvirBaseNextDriverSignatureL :: Lens_' DvirBase (Maybe DvirBaseNextDriverSignature)
dvirBaseNextDriverSignatureL f DvirBase{..} = (\dvirBaseNextDriverSignature -> DvirBase { dvirBaseNextDriverSignature, ..} ) <$> f dvirBaseNextDriverSignature
{-# INLINE dvirBaseNextDriverSignatureL #-}

-- | 'dvirBaseOdometerMiles' Lens
dvirBaseOdometerMilesL :: Lens_' DvirBase (Maybe Integer)
dvirBaseOdometerMilesL f DvirBase{..} = (\dvirBaseOdometerMiles -> DvirBase { dvirBaseOdometerMiles, ..} ) <$> f dvirBaseOdometerMiles
{-# INLINE dvirBaseOdometerMilesL #-}

-- | 'dvirBaseTimeMs' Lens
dvirBaseTimeMsL :: Lens_' DvirBase (Maybe Integer)
dvirBaseTimeMsL f DvirBase{..} = (\dvirBaseTimeMs -> DvirBase { dvirBaseTimeMs, ..} ) <$> f dvirBaseTimeMs
{-# INLINE dvirBaseTimeMsL #-}

-- | 'dvirBaseTrailerDefects' Lens
dvirBaseTrailerDefectsL :: Lens_' DvirBase (Maybe [DvirBaseTrailerDefects])
dvirBaseTrailerDefectsL f DvirBase{..} = (\dvirBaseTrailerDefects -> DvirBase { dvirBaseTrailerDefects, ..} ) <$> f dvirBaseTrailerDefects
{-# INLINE dvirBaseTrailerDefectsL #-}

-- | 'dvirBaseTrailerId' Lens
dvirBaseTrailerIdL :: Lens_' DvirBase (Maybe Int)
dvirBaseTrailerIdL f DvirBase{..} = (\dvirBaseTrailerId -> DvirBase { dvirBaseTrailerId, ..} ) <$> f dvirBaseTrailerId
{-# INLINE dvirBaseTrailerIdL #-}

-- | 'dvirBaseTrailerName' Lens
dvirBaseTrailerNameL :: Lens_' DvirBase (Maybe Text)
dvirBaseTrailerNameL f DvirBase{..} = (\dvirBaseTrailerName -> DvirBase { dvirBaseTrailerName, ..} ) <$> f dvirBaseTrailerName
{-# INLINE dvirBaseTrailerNameL #-}

-- | 'dvirBaseVehicle' Lens
dvirBaseVehicleL :: Lens_' DvirBase (Maybe DvirBaseVehicle)
dvirBaseVehicleL f DvirBase{..} = (\dvirBaseVehicle -> DvirBase { dvirBaseVehicle, ..} ) <$> f dvirBaseVehicle
{-# INLINE dvirBaseVehicleL #-}

-- | 'dvirBaseVehicleCondition' Lens
dvirBaseVehicleConditionL :: Lens_' DvirBase (Maybe Text)
dvirBaseVehicleConditionL f DvirBase{..} = (\dvirBaseVehicleCondition -> DvirBase { dvirBaseVehicleCondition, ..} ) <$> f dvirBaseVehicleCondition
{-# INLINE dvirBaseVehicleConditionL #-}

-- | 'dvirBaseVehicleDefects' Lens
dvirBaseVehicleDefectsL :: Lens_' DvirBase (Maybe [DvirBaseTrailerDefects])
dvirBaseVehicleDefectsL f DvirBase{..} = (\dvirBaseVehicleDefects -> DvirBase { dvirBaseVehicleDefects, ..} ) <$> f dvirBaseVehicleDefects
{-# INLINE dvirBaseVehicleDefectsL #-}



-- * DvirBaseAuthorSignature

-- | 'dvirBaseAuthorSignatureMechanicUserId' Lens
dvirBaseAuthorSignatureMechanicUserIdL :: Lens_' DvirBaseAuthorSignature (Maybe Integer)
dvirBaseAuthorSignatureMechanicUserIdL f DvirBaseAuthorSignature{..} = (\dvirBaseAuthorSignatureMechanicUserId -> DvirBaseAuthorSignature { dvirBaseAuthorSignatureMechanicUserId, ..} ) <$> f dvirBaseAuthorSignatureMechanicUserId
{-# INLINE dvirBaseAuthorSignatureMechanicUserIdL #-}

-- | 'dvirBaseAuthorSignatureDriverId' Lens
dvirBaseAuthorSignatureDriverIdL :: Lens_' DvirBaseAuthorSignature (Maybe Integer)
dvirBaseAuthorSignatureDriverIdL f DvirBaseAuthorSignature{..} = (\dvirBaseAuthorSignatureDriverId -> DvirBaseAuthorSignature { dvirBaseAuthorSignatureDriverId, ..} ) <$> f dvirBaseAuthorSignatureDriverId
{-# INLINE dvirBaseAuthorSignatureDriverIdL #-}

-- | 'dvirBaseAuthorSignatureName' Lens
dvirBaseAuthorSignatureNameL :: Lens_' DvirBaseAuthorSignature (Maybe Text)
dvirBaseAuthorSignatureNameL f DvirBaseAuthorSignature{..} = (\dvirBaseAuthorSignatureName -> DvirBaseAuthorSignature { dvirBaseAuthorSignatureName, ..} ) <$> f dvirBaseAuthorSignatureName
{-# INLINE dvirBaseAuthorSignatureNameL #-}

-- | 'dvirBaseAuthorSignatureSignedAt' Lens
dvirBaseAuthorSignatureSignedAtL :: Lens_' DvirBaseAuthorSignature (Maybe Integer)
dvirBaseAuthorSignatureSignedAtL f DvirBaseAuthorSignature{..} = (\dvirBaseAuthorSignatureSignedAt -> DvirBaseAuthorSignature { dvirBaseAuthorSignatureSignedAt, ..} ) <$> f dvirBaseAuthorSignatureSignedAt
{-# INLINE dvirBaseAuthorSignatureSignedAtL #-}

-- | 'dvirBaseAuthorSignatureType' Lens
dvirBaseAuthorSignatureTypeL :: Lens_' DvirBaseAuthorSignature (Maybe Text)
dvirBaseAuthorSignatureTypeL f DvirBaseAuthorSignature{..} = (\dvirBaseAuthorSignatureType -> DvirBaseAuthorSignature { dvirBaseAuthorSignatureType, ..} ) <$> f dvirBaseAuthorSignatureType
{-# INLINE dvirBaseAuthorSignatureTypeL #-}

-- | 'dvirBaseAuthorSignatureEmail' Lens
dvirBaseAuthorSignatureEmailL :: Lens_' DvirBaseAuthorSignature (Maybe Text)
dvirBaseAuthorSignatureEmailL f DvirBaseAuthorSignature{..} = (\dvirBaseAuthorSignatureEmail -> DvirBaseAuthorSignature { dvirBaseAuthorSignatureEmail, ..} ) <$> f dvirBaseAuthorSignatureEmail
{-# INLINE dvirBaseAuthorSignatureEmailL #-}

-- | 'dvirBaseAuthorSignatureUsername' Lens
dvirBaseAuthorSignatureUsernameL :: Lens_' DvirBaseAuthorSignature (Maybe Text)
dvirBaseAuthorSignatureUsernameL f DvirBaseAuthorSignature{..} = (\dvirBaseAuthorSignatureUsername -> DvirBaseAuthorSignature { dvirBaseAuthorSignatureUsername, ..} ) <$> f dvirBaseAuthorSignatureUsername
{-# INLINE dvirBaseAuthorSignatureUsernameL #-}



-- * DvirBaseMechanicOrAgentSignature

-- | 'dvirBaseMechanicOrAgentSignatureMechanicUserId' Lens
dvirBaseMechanicOrAgentSignatureMechanicUserIdL :: Lens_' DvirBaseMechanicOrAgentSignature (Maybe Integer)
dvirBaseMechanicOrAgentSignatureMechanicUserIdL f DvirBaseMechanicOrAgentSignature{..} = (\dvirBaseMechanicOrAgentSignatureMechanicUserId -> DvirBaseMechanicOrAgentSignature { dvirBaseMechanicOrAgentSignatureMechanicUserId, ..} ) <$> f dvirBaseMechanicOrAgentSignatureMechanicUserId
{-# INLINE dvirBaseMechanicOrAgentSignatureMechanicUserIdL #-}

-- | 'dvirBaseMechanicOrAgentSignatureDriverId' Lens
dvirBaseMechanicOrAgentSignatureDriverIdL :: Lens_' DvirBaseMechanicOrAgentSignature (Maybe Integer)
dvirBaseMechanicOrAgentSignatureDriverIdL f DvirBaseMechanicOrAgentSignature{..} = (\dvirBaseMechanicOrAgentSignatureDriverId -> DvirBaseMechanicOrAgentSignature { dvirBaseMechanicOrAgentSignatureDriverId, ..} ) <$> f dvirBaseMechanicOrAgentSignatureDriverId
{-# INLINE dvirBaseMechanicOrAgentSignatureDriverIdL #-}

-- | 'dvirBaseMechanicOrAgentSignatureName' Lens
dvirBaseMechanicOrAgentSignatureNameL :: Lens_' DvirBaseMechanicOrAgentSignature (Maybe Text)
dvirBaseMechanicOrAgentSignatureNameL f DvirBaseMechanicOrAgentSignature{..} = (\dvirBaseMechanicOrAgentSignatureName -> DvirBaseMechanicOrAgentSignature { dvirBaseMechanicOrAgentSignatureName, ..} ) <$> f dvirBaseMechanicOrAgentSignatureName
{-# INLINE dvirBaseMechanicOrAgentSignatureNameL #-}

-- | 'dvirBaseMechanicOrAgentSignatureSignedAt' Lens
dvirBaseMechanicOrAgentSignatureSignedAtL :: Lens_' DvirBaseMechanicOrAgentSignature (Maybe Integer)
dvirBaseMechanicOrAgentSignatureSignedAtL f DvirBaseMechanicOrAgentSignature{..} = (\dvirBaseMechanicOrAgentSignatureSignedAt -> DvirBaseMechanicOrAgentSignature { dvirBaseMechanicOrAgentSignatureSignedAt, ..} ) <$> f dvirBaseMechanicOrAgentSignatureSignedAt
{-# INLINE dvirBaseMechanicOrAgentSignatureSignedAtL #-}

-- | 'dvirBaseMechanicOrAgentSignatureType' Lens
dvirBaseMechanicOrAgentSignatureTypeL :: Lens_' DvirBaseMechanicOrAgentSignature (Maybe Text)
dvirBaseMechanicOrAgentSignatureTypeL f DvirBaseMechanicOrAgentSignature{..} = (\dvirBaseMechanicOrAgentSignatureType -> DvirBaseMechanicOrAgentSignature { dvirBaseMechanicOrAgentSignatureType, ..} ) <$> f dvirBaseMechanicOrAgentSignatureType
{-# INLINE dvirBaseMechanicOrAgentSignatureTypeL #-}

-- | 'dvirBaseMechanicOrAgentSignatureEmail' Lens
dvirBaseMechanicOrAgentSignatureEmailL :: Lens_' DvirBaseMechanicOrAgentSignature (Maybe Text)
dvirBaseMechanicOrAgentSignatureEmailL f DvirBaseMechanicOrAgentSignature{..} = (\dvirBaseMechanicOrAgentSignatureEmail -> DvirBaseMechanicOrAgentSignature { dvirBaseMechanicOrAgentSignatureEmail, ..} ) <$> f dvirBaseMechanicOrAgentSignatureEmail
{-# INLINE dvirBaseMechanicOrAgentSignatureEmailL #-}

-- | 'dvirBaseMechanicOrAgentSignatureUsername' Lens
dvirBaseMechanicOrAgentSignatureUsernameL :: Lens_' DvirBaseMechanicOrAgentSignature (Maybe Text)
dvirBaseMechanicOrAgentSignatureUsernameL f DvirBaseMechanicOrAgentSignature{..} = (\dvirBaseMechanicOrAgentSignatureUsername -> DvirBaseMechanicOrAgentSignature { dvirBaseMechanicOrAgentSignatureUsername, ..} ) <$> f dvirBaseMechanicOrAgentSignatureUsername
{-# INLINE dvirBaseMechanicOrAgentSignatureUsernameL #-}



-- * DvirBaseNextDriverSignature

-- | 'dvirBaseNextDriverSignatureDriverId' Lens
dvirBaseNextDriverSignatureDriverIdL :: Lens_' DvirBaseNextDriverSignature (Maybe Integer)
dvirBaseNextDriverSignatureDriverIdL f DvirBaseNextDriverSignature{..} = (\dvirBaseNextDriverSignatureDriverId -> DvirBaseNextDriverSignature { dvirBaseNextDriverSignatureDriverId, ..} ) <$> f dvirBaseNextDriverSignatureDriverId
{-# INLINE dvirBaseNextDriverSignatureDriverIdL #-}

-- | 'dvirBaseNextDriverSignatureName' Lens
dvirBaseNextDriverSignatureNameL :: Lens_' DvirBaseNextDriverSignature (Maybe Text)
dvirBaseNextDriverSignatureNameL f DvirBaseNextDriverSignature{..} = (\dvirBaseNextDriverSignatureName -> DvirBaseNextDriverSignature { dvirBaseNextDriverSignatureName, ..} ) <$> f dvirBaseNextDriverSignatureName
{-# INLINE dvirBaseNextDriverSignatureNameL #-}

-- | 'dvirBaseNextDriverSignatureSignedAt' Lens
dvirBaseNextDriverSignatureSignedAtL :: Lens_' DvirBaseNextDriverSignature (Maybe Integer)
dvirBaseNextDriverSignatureSignedAtL f DvirBaseNextDriverSignature{..} = (\dvirBaseNextDriverSignatureSignedAt -> DvirBaseNextDriverSignature { dvirBaseNextDriverSignatureSignedAt, ..} ) <$> f dvirBaseNextDriverSignatureSignedAt
{-# INLINE dvirBaseNextDriverSignatureSignedAtL #-}

-- | 'dvirBaseNextDriverSignatureType' Lens
dvirBaseNextDriverSignatureTypeL :: Lens_' DvirBaseNextDriverSignature (Maybe Text)
dvirBaseNextDriverSignatureTypeL f DvirBaseNextDriverSignature{..} = (\dvirBaseNextDriverSignatureType -> DvirBaseNextDriverSignature { dvirBaseNextDriverSignatureType, ..} ) <$> f dvirBaseNextDriverSignatureType
{-# INLINE dvirBaseNextDriverSignatureTypeL #-}

-- | 'dvirBaseNextDriverSignatureEmail' Lens
dvirBaseNextDriverSignatureEmailL :: Lens_' DvirBaseNextDriverSignature (Maybe Text)
dvirBaseNextDriverSignatureEmailL f DvirBaseNextDriverSignature{..} = (\dvirBaseNextDriverSignatureEmail -> DvirBaseNextDriverSignature { dvirBaseNextDriverSignatureEmail, ..} ) <$> f dvirBaseNextDriverSignatureEmail
{-# INLINE dvirBaseNextDriverSignatureEmailL #-}

-- | 'dvirBaseNextDriverSignatureUsername' Lens
dvirBaseNextDriverSignatureUsernameL :: Lens_' DvirBaseNextDriverSignature (Maybe Text)
dvirBaseNextDriverSignatureUsernameL f DvirBaseNextDriverSignature{..} = (\dvirBaseNextDriverSignatureUsername -> DvirBaseNextDriverSignature { dvirBaseNextDriverSignatureUsername, ..} ) <$> f dvirBaseNextDriverSignatureUsername
{-# INLINE dvirBaseNextDriverSignatureUsernameL #-}



-- * DvirBaseTrailerDefects

-- | 'dvirBaseTrailerDefectsComment' Lens
dvirBaseTrailerDefectsCommentL :: Lens_' DvirBaseTrailerDefects (Maybe Text)
dvirBaseTrailerDefectsCommentL f DvirBaseTrailerDefects{..} = (\dvirBaseTrailerDefectsComment -> DvirBaseTrailerDefects { dvirBaseTrailerDefectsComment, ..} ) <$> f dvirBaseTrailerDefectsComment
{-# INLINE dvirBaseTrailerDefectsCommentL #-}

-- | 'dvirBaseTrailerDefectsDefectType' Lens
dvirBaseTrailerDefectsDefectTypeL :: Lens_' DvirBaseTrailerDefects (Maybe Text)
dvirBaseTrailerDefectsDefectTypeL f DvirBaseTrailerDefects{..} = (\dvirBaseTrailerDefectsDefectType -> DvirBaseTrailerDefects { dvirBaseTrailerDefectsDefectType, ..} ) <$> f dvirBaseTrailerDefectsDefectType
{-# INLINE dvirBaseTrailerDefectsDefectTypeL #-}



-- * DvirBaseVehicle

-- | 'dvirBaseVehicleName' Lens
dvirBaseVehicleNameL :: Lens_' DvirBaseVehicle (Maybe Text)
dvirBaseVehicleNameL f DvirBaseVehicle{..} = (\dvirBaseVehicleName -> DvirBaseVehicle { dvirBaseVehicleName, ..} ) <$> f dvirBaseVehicleName
{-# INLINE dvirBaseVehicleNameL #-}

-- | 'dvirBaseVehicleId' Lens
dvirBaseVehicleIdL :: Lens_' DvirBaseVehicle (Maybe Integer)
dvirBaseVehicleIdL f DvirBaseVehicle{..} = (\dvirBaseVehicleId -> DvirBaseVehicle { dvirBaseVehicleId, ..} ) <$> f dvirBaseVehicleId
{-# INLINE dvirBaseVehicleIdL #-}



-- * DvirListResponse

-- | 'dvirListResponseDvirs' Lens
dvirListResponseDvirsL :: Lens_' DvirListResponse (Maybe [DvirBase])
dvirListResponseDvirsL f DvirListResponse{..} = (\dvirListResponseDvirs -> DvirListResponse { dvirListResponseDvirs, ..} ) <$> f dvirListResponseDvirs
{-# INLINE dvirListResponseDvirsL #-}



-- * EngineState

-- | 'engineStateTimeMs' Lens
engineStateTimeMsL :: Lens_' EngineState (A.Value)
engineStateTimeMsL f EngineState{..} = (\engineStateTimeMs -> EngineState { engineStateTimeMs, ..} ) <$> f engineStateTimeMs
{-# INLINE engineStateTimeMsL #-}

-- | 'engineStateValue' Lens
engineStateValueL :: Lens_' EngineState (E'Value)
engineStateValueL f EngineState{..} = (\engineStateValue -> EngineState { engineStateValue, ..} ) <$> f engineStateValue
{-# INLINE engineStateValueL #-}



-- * FleetVehicleLocation

-- | 'fleetVehicleLocationLatitude' Lens
fleetVehicleLocationLatitudeL :: Lens_' FleetVehicleLocation (Maybe Double)
fleetVehicleLocationLatitudeL f FleetVehicleLocation{..} = (\fleetVehicleLocationLatitude -> FleetVehicleLocation { fleetVehicleLocationLatitude, ..} ) <$> f fleetVehicleLocationLatitude
{-# INLINE fleetVehicleLocationLatitudeL #-}

-- | 'fleetVehicleLocationLocation' Lens
fleetVehicleLocationLocationL :: Lens_' FleetVehicleLocation (Maybe Text)
fleetVehicleLocationLocationL f FleetVehicleLocation{..} = (\fleetVehicleLocationLocation -> FleetVehicleLocation { fleetVehicleLocationLocation, ..} ) <$> f fleetVehicleLocationLocation
{-# INLINE fleetVehicleLocationLocationL #-}

-- | 'fleetVehicleLocationLongitude' Lens
fleetVehicleLocationLongitudeL :: Lens_' FleetVehicleLocation (Maybe Double)
fleetVehicleLocationLongitudeL f FleetVehicleLocation{..} = (\fleetVehicleLocationLongitude -> FleetVehicleLocation { fleetVehicleLocationLongitude, ..} ) <$> f fleetVehicleLocationLongitude
{-# INLINE fleetVehicleLocationLongitudeL #-}

-- | 'fleetVehicleLocationSpeedMilesPerHour' Lens
fleetVehicleLocationSpeedMilesPerHourL :: Lens_' FleetVehicleLocation (Maybe Double)
fleetVehicleLocationSpeedMilesPerHourL f FleetVehicleLocation{..} = (\fleetVehicleLocationSpeedMilesPerHour -> FleetVehicleLocation { fleetVehicleLocationSpeedMilesPerHour, ..} ) <$> f fleetVehicleLocationSpeedMilesPerHour
{-# INLINE fleetVehicleLocationSpeedMilesPerHourL #-}

-- | 'fleetVehicleLocationTimeMs' Lens
fleetVehicleLocationTimeMsL :: Lens_' FleetVehicleLocation (Maybe Integer)
fleetVehicleLocationTimeMsL f FleetVehicleLocation{..} = (\fleetVehicleLocationTimeMs -> FleetVehicleLocation { fleetVehicleLocationTimeMs, ..} ) <$> f fleetVehicleLocationTimeMs
{-# INLINE fleetVehicleLocationTimeMsL #-}



-- * FleetVehicleResponse

-- | 'fleetVehicleResponseExternalIds' Lens
fleetVehicleResponseExternalIdsL :: Lens_' FleetVehicleResponse (Maybe (Map.Map String Text))
fleetVehicleResponseExternalIdsL f FleetVehicleResponse{..} = (\fleetVehicleResponseExternalIds -> FleetVehicleResponse { fleetVehicleResponseExternalIds, ..} ) <$> f fleetVehicleResponseExternalIds
{-# INLINE fleetVehicleResponseExternalIdsL #-}

-- | 'fleetVehicleResponseHarshAccelSetting' Lens
fleetVehicleResponseHarshAccelSettingL :: Lens_' FleetVehicleResponse (Maybe Text)
fleetVehicleResponseHarshAccelSettingL f FleetVehicleResponse{..} = (\fleetVehicleResponseHarshAccelSetting -> FleetVehicleResponse { fleetVehicleResponseHarshAccelSetting, ..} ) <$> f fleetVehicleResponseHarshAccelSetting
{-# INLINE fleetVehicleResponseHarshAccelSettingL #-}

-- | 'fleetVehicleResponseId' Lens
fleetVehicleResponseIdL :: Lens_' FleetVehicleResponse (Integer)
fleetVehicleResponseIdL f FleetVehicleResponse{..} = (\fleetVehicleResponseId -> FleetVehicleResponse { fleetVehicleResponseId, ..} ) <$> f fleetVehicleResponseId
{-# INLINE fleetVehicleResponseIdL #-}

-- | 'fleetVehicleResponseName' Lens
fleetVehicleResponseNameL :: Lens_' FleetVehicleResponse (Text)
fleetVehicleResponseNameL f FleetVehicleResponse{..} = (\fleetVehicleResponseName -> FleetVehicleResponse { fleetVehicleResponseName, ..} ) <$> f fleetVehicleResponseName
{-# INLINE fleetVehicleResponseNameL #-}

-- | 'fleetVehicleResponseVehicleInfo' Lens
fleetVehicleResponseVehicleInfoL :: Lens_' FleetVehicleResponse (Maybe FleetVehicleResponseVehicleInfo)
fleetVehicleResponseVehicleInfoL f FleetVehicleResponse{..} = (\fleetVehicleResponseVehicleInfo -> FleetVehicleResponse { fleetVehicleResponseVehicleInfo, ..} ) <$> f fleetVehicleResponseVehicleInfo
{-# INLINE fleetVehicleResponseVehicleInfoL #-}



-- * FleetVehicleResponseVehicleInfo

-- | 'fleetVehicleResponseVehicleInfoYear' Lens
fleetVehicleResponseVehicleInfoYearL :: Lens_' FleetVehicleResponseVehicleInfo (Maybe Integer)
fleetVehicleResponseVehicleInfoYearL f FleetVehicleResponseVehicleInfo{..} = (\fleetVehicleResponseVehicleInfoYear -> FleetVehicleResponseVehicleInfo { fleetVehicleResponseVehicleInfoYear, ..} ) <$> f fleetVehicleResponseVehicleInfoYear
{-# INLINE fleetVehicleResponseVehicleInfoYearL #-}

-- | 'fleetVehicleResponseVehicleInfoModel' Lens
fleetVehicleResponseVehicleInfoModelL :: Lens_' FleetVehicleResponseVehicleInfo (Maybe Text)
fleetVehicleResponseVehicleInfoModelL f FleetVehicleResponseVehicleInfo{..} = (\fleetVehicleResponseVehicleInfoModel -> FleetVehicleResponseVehicleInfo { fleetVehicleResponseVehicleInfoModel, ..} ) <$> f fleetVehicleResponseVehicleInfoModel
{-# INLINE fleetVehicleResponseVehicleInfoModelL #-}

-- | 'fleetVehicleResponseVehicleInfoVin' Lens
fleetVehicleResponseVehicleInfoVinL :: Lens_' FleetVehicleResponseVehicleInfo (Maybe Text)
fleetVehicleResponseVehicleInfoVinL f FleetVehicleResponseVehicleInfo{..} = (\fleetVehicleResponseVehicleInfoVin -> FleetVehicleResponseVehicleInfo { fleetVehicleResponseVehicleInfoVin, ..} ) <$> f fleetVehicleResponseVehicleInfoVin
{-# INLINE fleetVehicleResponseVehicleInfoVinL #-}

-- | 'fleetVehicleResponseVehicleInfoMake' Lens
fleetVehicleResponseVehicleInfoMakeL :: Lens_' FleetVehicleResponseVehicleInfo (Maybe Text)
fleetVehicleResponseVehicleInfoMakeL f FleetVehicleResponseVehicleInfo{..} = (\fleetVehicleResponseVehicleInfoMake -> FleetVehicleResponseVehicleInfo { fleetVehicleResponseVehicleInfoMake, ..} ) <$> f fleetVehicleResponseVehicleInfoMake
{-# INLINE fleetVehicleResponseVehicleInfoMakeL #-}



-- * HosAuthenticationLogsResponse

-- | 'hosAuthenticationLogsResponseAuthenticationLogs' Lens
hosAuthenticationLogsResponseAuthenticationLogsL :: Lens_' HosAuthenticationLogsResponse (Maybe [HosAuthenticationLogsResponseAuthenticationLogs])
hosAuthenticationLogsResponseAuthenticationLogsL f HosAuthenticationLogsResponse{..} = (\hosAuthenticationLogsResponseAuthenticationLogs -> HosAuthenticationLogsResponse { hosAuthenticationLogsResponseAuthenticationLogs, ..} ) <$> f hosAuthenticationLogsResponseAuthenticationLogs
{-# INLINE hosAuthenticationLogsResponseAuthenticationLogsL #-}



-- * HosAuthenticationLogsResponseAuthenticationLogs

-- | 'hosAuthenticationLogsResponseAuthenticationLogsActionType' Lens
hosAuthenticationLogsResponseAuthenticationLogsActionTypeL :: Lens_' HosAuthenticationLogsResponseAuthenticationLogs (Maybe Text)
hosAuthenticationLogsResponseAuthenticationLogsActionTypeL f HosAuthenticationLogsResponseAuthenticationLogs{..} = (\hosAuthenticationLogsResponseAuthenticationLogsActionType -> HosAuthenticationLogsResponseAuthenticationLogs { hosAuthenticationLogsResponseAuthenticationLogsActionType, ..} ) <$> f hosAuthenticationLogsResponseAuthenticationLogsActionType
{-# INLINE hosAuthenticationLogsResponseAuthenticationLogsActionTypeL #-}

-- | 'hosAuthenticationLogsResponseAuthenticationLogsAddress' Lens
hosAuthenticationLogsResponseAuthenticationLogsAddressL :: Lens_' HosAuthenticationLogsResponseAuthenticationLogs (Maybe Text)
hosAuthenticationLogsResponseAuthenticationLogsAddressL f HosAuthenticationLogsResponseAuthenticationLogs{..} = (\hosAuthenticationLogsResponseAuthenticationLogsAddress -> HosAuthenticationLogsResponseAuthenticationLogs { hosAuthenticationLogsResponseAuthenticationLogsAddress, ..} ) <$> f hosAuthenticationLogsResponseAuthenticationLogsAddress
{-# INLINE hosAuthenticationLogsResponseAuthenticationLogsAddressL #-}

-- | 'hosAuthenticationLogsResponseAuthenticationLogsCity' Lens
hosAuthenticationLogsResponseAuthenticationLogsCityL :: Lens_' HosAuthenticationLogsResponseAuthenticationLogs (Maybe Text)
hosAuthenticationLogsResponseAuthenticationLogsCityL f HosAuthenticationLogsResponseAuthenticationLogs{..} = (\hosAuthenticationLogsResponseAuthenticationLogsCity -> HosAuthenticationLogsResponseAuthenticationLogs { hosAuthenticationLogsResponseAuthenticationLogsCity, ..} ) <$> f hosAuthenticationLogsResponseAuthenticationLogsCity
{-# INLINE hosAuthenticationLogsResponseAuthenticationLogsCityL #-}

-- | 'hosAuthenticationLogsResponseAuthenticationLogsHappenedAtMs' Lens
hosAuthenticationLogsResponseAuthenticationLogsHappenedAtMsL :: Lens_' HosAuthenticationLogsResponseAuthenticationLogs (Maybe Integer)
hosAuthenticationLogsResponseAuthenticationLogsHappenedAtMsL f HosAuthenticationLogsResponseAuthenticationLogs{..} = (\hosAuthenticationLogsResponseAuthenticationLogsHappenedAtMs -> HosAuthenticationLogsResponseAuthenticationLogs { hosAuthenticationLogsResponseAuthenticationLogsHappenedAtMs, ..} ) <$> f hosAuthenticationLogsResponseAuthenticationLogsHappenedAtMs
{-# INLINE hosAuthenticationLogsResponseAuthenticationLogsHappenedAtMsL #-}

-- | 'hosAuthenticationLogsResponseAuthenticationLogsAddressName' Lens
hosAuthenticationLogsResponseAuthenticationLogsAddressNameL :: Lens_' HosAuthenticationLogsResponseAuthenticationLogs (Maybe Text)
hosAuthenticationLogsResponseAuthenticationLogsAddressNameL f HosAuthenticationLogsResponseAuthenticationLogs{..} = (\hosAuthenticationLogsResponseAuthenticationLogsAddressName -> HosAuthenticationLogsResponseAuthenticationLogs { hosAuthenticationLogsResponseAuthenticationLogsAddressName, ..} ) <$> f hosAuthenticationLogsResponseAuthenticationLogsAddressName
{-# INLINE hosAuthenticationLogsResponseAuthenticationLogsAddressNameL #-}

-- | 'hosAuthenticationLogsResponseAuthenticationLogsState' Lens
hosAuthenticationLogsResponseAuthenticationLogsStateL :: Lens_' HosAuthenticationLogsResponseAuthenticationLogs (Maybe Text)
hosAuthenticationLogsResponseAuthenticationLogsStateL f HosAuthenticationLogsResponseAuthenticationLogs{..} = (\hosAuthenticationLogsResponseAuthenticationLogsState -> HosAuthenticationLogsResponseAuthenticationLogs { hosAuthenticationLogsResponseAuthenticationLogsState, ..} ) <$> f hosAuthenticationLogsResponseAuthenticationLogsState
{-# INLINE hosAuthenticationLogsResponseAuthenticationLogsStateL #-}



-- * HosLogsResponse

-- | 'hosLogsResponseLogs' Lens
hosLogsResponseLogsL :: Lens_' HosLogsResponse (Maybe [HosLogsResponseLogs])
hosLogsResponseLogsL f HosLogsResponse{..} = (\hosLogsResponseLogs -> HosLogsResponse { hosLogsResponseLogs, ..} ) <$> f hosLogsResponseLogs
{-# INLINE hosLogsResponseLogsL #-}



-- * HosLogsResponseLogs

-- | 'hosLogsResponseLogsLocLng' Lens
hosLogsResponseLogsLocLngL :: Lens_' HosLogsResponseLogs (Maybe Double)
hosLogsResponseLogsLocLngL f HosLogsResponseLogs{..} = (\hosLogsResponseLogsLocLng -> HosLogsResponseLogs { hosLogsResponseLogsLocLng, ..} ) <$> f hosLogsResponseLogsLocLng
{-# INLINE hosLogsResponseLogsLocLngL #-}

-- | 'hosLogsResponseLogsLogStartMs' Lens
hosLogsResponseLogsLogStartMsL :: Lens_' HosLogsResponseLogs (Maybe Integer)
hosLogsResponseLogsLogStartMsL f HosLogsResponseLogs{..} = (\hosLogsResponseLogsLogStartMs -> HosLogsResponseLogs { hosLogsResponseLogsLogStartMs, ..} ) <$> f hosLogsResponseLogsLogStartMs
{-# INLINE hosLogsResponseLogsLogStartMsL #-}

-- | 'hosLogsResponseLogsDriverId' Lens
hosLogsResponseLogsDriverIdL :: Lens_' HosLogsResponseLogs (Maybe Integer)
hosLogsResponseLogsDriverIdL f HosLogsResponseLogs{..} = (\hosLogsResponseLogsDriverId -> HosLogsResponseLogs { hosLogsResponseLogsDriverId, ..} ) <$> f hosLogsResponseLogsDriverId
{-# INLINE hosLogsResponseLogsDriverIdL #-}

-- | 'hosLogsResponseLogsStatusType' Lens
hosLogsResponseLogsStatusTypeL :: Lens_' HosLogsResponseLogs (Maybe Text)
hosLogsResponseLogsStatusTypeL f HosLogsResponseLogs{..} = (\hosLogsResponseLogsStatusType -> HosLogsResponseLogs { hosLogsResponseLogsStatusType, ..} ) <$> f hosLogsResponseLogsStatusType
{-# INLINE hosLogsResponseLogsStatusTypeL #-}

-- | 'hosLogsResponseLogsLocCity' Lens
hosLogsResponseLogsLocCityL :: Lens_' HosLogsResponseLogs (Maybe Text)
hosLogsResponseLogsLocCityL f HosLogsResponseLogs{..} = (\hosLogsResponseLogsLocCity -> HosLogsResponseLogs { hosLogsResponseLogsLocCity, ..} ) <$> f hosLogsResponseLogsLocCity
{-# INLINE hosLogsResponseLogsLocCityL #-}

-- | 'hosLogsResponseLogsGroupId' Lens
hosLogsResponseLogsGroupIdL :: Lens_' HosLogsResponseLogs (Maybe Integer)
hosLogsResponseLogsGroupIdL f HosLogsResponseLogs{..} = (\hosLogsResponseLogsGroupId -> HosLogsResponseLogs { hosLogsResponseLogsGroupId, ..} ) <$> f hosLogsResponseLogsGroupId
{-# INLINE hosLogsResponseLogsGroupIdL #-}

-- | 'hosLogsResponseLogsLocName' Lens
hosLogsResponseLogsLocNameL :: Lens_' HosLogsResponseLogs (Maybe Text)
hosLogsResponseLogsLocNameL f HosLogsResponseLogs{..} = (\hosLogsResponseLogsLocName -> HosLogsResponseLogs { hosLogsResponseLogsLocName, ..} ) <$> f hosLogsResponseLogsLocName
{-# INLINE hosLogsResponseLogsLocNameL #-}

-- | 'hosLogsResponseLogsLocLat' Lens
hosLogsResponseLogsLocLatL :: Lens_' HosLogsResponseLogs (Maybe Double)
hosLogsResponseLogsLocLatL f HosLogsResponseLogs{..} = (\hosLogsResponseLogsLocLat -> HosLogsResponseLogs { hosLogsResponseLogsLocLat, ..} ) <$> f hosLogsResponseLogsLocLat
{-# INLINE hosLogsResponseLogsLocLatL #-}

-- | 'hosLogsResponseLogsRemark' Lens
hosLogsResponseLogsRemarkL :: Lens_' HosLogsResponseLogs (Maybe Text)
hosLogsResponseLogsRemarkL f HosLogsResponseLogs{..} = (\hosLogsResponseLogsRemark -> HosLogsResponseLogs { hosLogsResponseLogsRemark, ..} ) <$> f hosLogsResponseLogsRemark
{-# INLINE hosLogsResponseLogsRemarkL #-}

-- | 'hosLogsResponseLogsLocState' Lens
hosLogsResponseLogsLocStateL :: Lens_' HosLogsResponseLogs (Maybe Text)
hosLogsResponseLogsLocStateL f HosLogsResponseLogs{..} = (\hosLogsResponseLogsLocState -> HosLogsResponseLogs { hosLogsResponseLogsLocState, ..} ) <$> f hosLogsResponseLogsLocState
{-# INLINE hosLogsResponseLogsLocStateL #-}

-- | 'hosLogsResponseLogsVehicleId' Lens
hosLogsResponseLogsVehicleIdL :: Lens_' HosLogsResponseLogs (Maybe Integer)
hosLogsResponseLogsVehicleIdL f HosLogsResponseLogs{..} = (\hosLogsResponseLogsVehicleId -> HosLogsResponseLogs { hosLogsResponseLogsVehicleId, ..} ) <$> f hosLogsResponseLogsVehicleId
{-# INLINE hosLogsResponseLogsVehicleIdL #-}

-- | 'hosLogsResponseLogsCodriverIds' Lens
hosLogsResponseLogsCodriverIdsL :: Lens_' HosLogsResponseLogs (Maybe [Integer])
hosLogsResponseLogsCodriverIdsL f HosLogsResponseLogs{..} = (\hosLogsResponseLogsCodriverIds -> HosLogsResponseLogs { hosLogsResponseLogsCodriverIds, ..} ) <$> f hosLogsResponseLogsCodriverIds
{-# INLINE hosLogsResponseLogsCodriverIdsL #-}



-- * HosLogsSummaryResponse

-- | 'hosLogsSummaryResponseDrivers' Lens
hosLogsSummaryResponseDriversL :: Lens_' HosLogsSummaryResponse (Maybe [HosLogsSummaryResponseDrivers])
hosLogsSummaryResponseDriversL f HosLogsSummaryResponse{..} = (\hosLogsSummaryResponseDrivers -> HosLogsSummaryResponse { hosLogsSummaryResponseDrivers, ..} ) <$> f hosLogsSummaryResponseDrivers
{-# INLINE hosLogsSummaryResponseDriversL #-}



-- * HosLogsSummaryResponseDrivers

-- | 'hosLogsSummaryResponseDriversTimeUntilBreak' Lens
hosLogsSummaryResponseDriversTimeUntilBreakL :: Lens_' HosLogsSummaryResponseDrivers (Maybe Integer)
hosLogsSummaryResponseDriversTimeUntilBreakL f HosLogsSummaryResponseDrivers{..} = (\hosLogsSummaryResponseDriversTimeUntilBreak -> HosLogsSummaryResponseDrivers { hosLogsSummaryResponseDriversTimeUntilBreak, ..} ) <$> f hosLogsSummaryResponseDriversTimeUntilBreak
{-# INLINE hosLogsSummaryResponseDriversTimeUntilBreakL #-}

-- | 'hosLogsSummaryResponseDriversVehicleName' Lens
hosLogsSummaryResponseDriversVehicleNameL :: Lens_' HosLogsSummaryResponseDrivers (Maybe Text)
hosLogsSummaryResponseDriversVehicleNameL f HosLogsSummaryResponseDrivers{..} = (\hosLogsSummaryResponseDriversVehicleName -> HosLogsSummaryResponseDrivers { hosLogsSummaryResponseDriversVehicleName, ..} ) <$> f hosLogsSummaryResponseDriversVehicleName
{-# INLINE hosLogsSummaryResponseDriversVehicleNameL #-}

-- | 'hosLogsSummaryResponseDriversDrivingInViolationToday' Lens
hosLogsSummaryResponseDriversDrivingInViolationTodayL :: Lens_' HosLogsSummaryResponseDrivers (Maybe Integer)
hosLogsSummaryResponseDriversDrivingInViolationTodayL f HosLogsSummaryResponseDrivers{..} = (\hosLogsSummaryResponseDriversDrivingInViolationToday -> HosLogsSummaryResponseDrivers { hosLogsSummaryResponseDriversDrivingInViolationToday, ..} ) <$> f hosLogsSummaryResponseDriversDrivingInViolationToday
{-# INLINE hosLogsSummaryResponseDriversDrivingInViolationTodayL #-}

-- | 'hosLogsSummaryResponseDriversDriverId' Lens
hosLogsSummaryResponseDriversDriverIdL :: Lens_' HosLogsSummaryResponseDrivers (Maybe Integer)
hosLogsSummaryResponseDriversDriverIdL f HosLogsSummaryResponseDrivers{..} = (\hosLogsSummaryResponseDriversDriverId -> HosLogsSummaryResponseDrivers { hosLogsSummaryResponseDriversDriverId, ..} ) <$> f hosLogsSummaryResponseDriversDriverId
{-# INLINE hosLogsSummaryResponseDriversDriverIdL #-}

-- | 'hosLogsSummaryResponseDriversCycleRemaining' Lens
hosLogsSummaryResponseDriversCycleRemainingL :: Lens_' HosLogsSummaryResponseDrivers (Maybe Integer)
hosLogsSummaryResponseDriversCycleRemainingL f HosLogsSummaryResponseDrivers{..} = (\hosLogsSummaryResponseDriversCycleRemaining -> HosLogsSummaryResponseDrivers { hosLogsSummaryResponseDriversCycleRemaining, ..} ) <$> f hosLogsSummaryResponseDriversCycleRemaining
{-# INLINE hosLogsSummaryResponseDriversCycleRemainingL #-}

-- | 'hosLogsSummaryResponseDriversDriverName' Lens
hosLogsSummaryResponseDriversDriverNameL :: Lens_' HosLogsSummaryResponseDrivers (Maybe Text)
hosLogsSummaryResponseDriversDriverNameL f HosLogsSummaryResponseDrivers{..} = (\hosLogsSummaryResponseDriversDriverName -> HosLogsSummaryResponseDrivers { hosLogsSummaryResponseDriversDriverName, ..} ) <$> f hosLogsSummaryResponseDriversDriverName
{-# INLINE hosLogsSummaryResponseDriversDriverNameL #-}

-- | 'hosLogsSummaryResponseDriversDutyStatus' Lens
hosLogsSummaryResponseDriversDutyStatusL :: Lens_' HosLogsSummaryResponseDrivers (Maybe Text)
hosLogsSummaryResponseDriversDutyStatusL f HosLogsSummaryResponseDrivers{..} = (\hosLogsSummaryResponseDriversDutyStatus -> HosLogsSummaryResponseDrivers { hosLogsSummaryResponseDriversDutyStatus, ..} ) <$> f hosLogsSummaryResponseDriversDutyStatus
{-# INLINE hosLogsSummaryResponseDriversDutyStatusL #-}

-- | 'hosLogsSummaryResponseDriversCycleTomorrow' Lens
hosLogsSummaryResponseDriversCycleTomorrowL :: Lens_' HosLogsSummaryResponseDrivers (Maybe Integer)
hosLogsSummaryResponseDriversCycleTomorrowL f HosLogsSummaryResponseDrivers{..} = (\hosLogsSummaryResponseDriversCycleTomorrow -> HosLogsSummaryResponseDrivers { hosLogsSummaryResponseDriversCycleTomorrow, ..} ) <$> f hosLogsSummaryResponseDriversCycleTomorrow
{-# INLINE hosLogsSummaryResponseDriversCycleTomorrowL #-}

-- | 'hosLogsSummaryResponseDriversShiftDriveRemaining' Lens
hosLogsSummaryResponseDriversShiftDriveRemainingL :: Lens_' HosLogsSummaryResponseDrivers (Maybe Integer)
hosLogsSummaryResponseDriversShiftDriveRemainingL f HosLogsSummaryResponseDrivers{..} = (\hosLogsSummaryResponseDriversShiftDriveRemaining -> HosLogsSummaryResponseDrivers { hosLogsSummaryResponseDriversShiftDriveRemaining, ..} ) <$> f hosLogsSummaryResponseDriversShiftDriveRemaining
{-# INLINE hosLogsSummaryResponseDriversShiftDriveRemainingL #-}

-- | 'hosLogsSummaryResponseDriversTimeInCurrentStatus' Lens
hosLogsSummaryResponseDriversTimeInCurrentStatusL :: Lens_' HosLogsSummaryResponseDrivers (Maybe Integer)
hosLogsSummaryResponseDriversTimeInCurrentStatusL f HosLogsSummaryResponseDrivers{..} = (\hosLogsSummaryResponseDriversTimeInCurrentStatus -> HosLogsSummaryResponseDrivers { hosLogsSummaryResponseDriversTimeInCurrentStatus, ..} ) <$> f hosLogsSummaryResponseDriversTimeInCurrentStatus
{-# INLINE hosLogsSummaryResponseDriversTimeInCurrentStatusL #-}

-- | 'hosLogsSummaryResponseDriversDrivingInViolationCycle' Lens
hosLogsSummaryResponseDriversDrivingInViolationCycleL :: Lens_' HosLogsSummaryResponseDrivers (Maybe Integer)
hosLogsSummaryResponseDriversDrivingInViolationCycleL f HosLogsSummaryResponseDrivers{..} = (\hosLogsSummaryResponseDriversDrivingInViolationCycle -> HosLogsSummaryResponseDrivers { hosLogsSummaryResponseDriversDrivingInViolationCycle, ..} ) <$> f hosLogsSummaryResponseDriversDrivingInViolationCycle
{-# INLINE hosLogsSummaryResponseDriversDrivingInViolationCycleL #-}

-- | 'hosLogsSummaryResponseDriversShiftRemaining' Lens
hosLogsSummaryResponseDriversShiftRemainingL :: Lens_' HosLogsSummaryResponseDrivers (Maybe Integer)
hosLogsSummaryResponseDriversShiftRemainingL f HosLogsSummaryResponseDrivers{..} = (\hosLogsSummaryResponseDriversShiftRemaining -> HosLogsSummaryResponseDrivers { hosLogsSummaryResponseDriversShiftRemaining, ..} ) <$> f hosLogsSummaryResponseDriversShiftRemaining
{-# INLINE hosLogsSummaryResponseDriversShiftRemainingL #-}



-- * HumidityResponse

-- | 'humidityResponseGroupId' Lens
humidityResponseGroupIdL :: Lens_' HumidityResponse (Maybe Integer)
humidityResponseGroupIdL f HumidityResponse{..} = (\humidityResponseGroupId -> HumidityResponse { humidityResponseGroupId, ..} ) <$> f humidityResponseGroupId
{-# INLINE humidityResponseGroupIdL #-}

-- | 'humidityResponseSensors' Lens
humidityResponseSensorsL :: Lens_' HumidityResponse (Maybe [HumidityResponseSensors])
humidityResponseSensorsL f HumidityResponse{..} = (\humidityResponseSensors -> HumidityResponse { humidityResponseSensors, ..} ) <$> f humidityResponseSensors
{-# INLINE humidityResponseSensorsL #-}



-- * HumidityResponseSensors

-- | 'humidityResponseSensorsName' Lens
humidityResponseSensorsNameL :: Lens_' HumidityResponseSensors (Maybe Text)
humidityResponseSensorsNameL f HumidityResponseSensors{..} = (\humidityResponseSensorsName -> HumidityResponseSensors { humidityResponseSensorsName, ..} ) <$> f humidityResponseSensorsName
{-# INLINE humidityResponseSensorsNameL #-}

-- | 'humidityResponseSensorsHumidity' Lens
humidityResponseSensorsHumidityL :: Lens_' HumidityResponseSensors (Maybe Int)
humidityResponseSensorsHumidityL f HumidityResponseSensors{..} = (\humidityResponseSensorsHumidity -> HumidityResponseSensors { humidityResponseSensorsHumidity, ..} ) <$> f humidityResponseSensorsHumidity
{-# INLINE humidityResponseSensorsHumidityL #-}

-- | 'humidityResponseSensorsId' Lens
humidityResponseSensorsIdL :: Lens_' HumidityResponseSensors (Maybe Integer)
humidityResponseSensorsIdL f HumidityResponseSensors{..} = (\humidityResponseSensorsId -> HumidityResponseSensors { humidityResponseSensorsId, ..} ) <$> f humidityResponseSensorsId
{-# INLINE humidityResponseSensorsIdL #-}



-- * InlineObject

-- | 'inlineObjectAddresses' Lens
inlineObjectAddressesL :: Lens_' InlineObject ([AddressesAddresses])
inlineObjectAddressesL f InlineObject{..} = (\inlineObjectAddresses -> InlineObject { inlineObjectAddresses, ..} ) <$> f inlineObjectAddresses
{-# INLINE inlineObjectAddressesL #-}



-- * InlineObject1

-- | 'inlineObject1ContactIds' Lens
inlineObject1ContactIdsL :: Lens_' InlineObject1 (Maybe [Integer])
inlineObject1ContactIdsL f InlineObject1{..} = (\inlineObject1ContactIds -> InlineObject1 { inlineObject1ContactIds, ..} ) <$> f inlineObject1ContactIds
{-# INLINE inlineObject1ContactIdsL #-}

-- | 'inlineObject1FormattedAddress' Lens
inlineObject1FormattedAddressL :: Lens_' InlineObject1 (Maybe Text)
inlineObject1FormattedAddressL f InlineObject1{..} = (\inlineObject1FormattedAddress -> InlineObject1 { inlineObject1FormattedAddress, ..} ) <$> f inlineObject1FormattedAddress
{-# INLINE inlineObject1FormattedAddressL #-}

-- | 'inlineObject1Geofence' Lens
inlineObject1GeofenceL :: Lens_' InlineObject1 (Maybe AddressGeofence)
inlineObject1GeofenceL f InlineObject1{..} = (\inlineObject1Geofence -> InlineObject1 { inlineObject1Geofence, ..} ) <$> f inlineObject1Geofence
{-# INLINE inlineObject1GeofenceL #-}

-- | 'inlineObject1Name' Lens
inlineObject1NameL :: Lens_' InlineObject1 (Maybe Text)
inlineObject1NameL f InlineObject1{..} = (\inlineObject1Name -> InlineObject1 { inlineObject1Name, ..} ) <$> f inlineObject1Name
{-# INLINE inlineObject1NameL #-}

-- | 'inlineObject1Notes' Lens
inlineObject1NotesL :: Lens_' InlineObject1 (Maybe Text)
inlineObject1NotesL f InlineObject1{..} = (\inlineObject1Notes -> InlineObject1 { inlineObject1Notes, ..} ) <$> f inlineObject1Notes
{-# INLINE inlineObject1NotesL #-}

-- | 'inlineObject1TagIds' Lens
inlineObject1TagIdsL :: Lens_' InlineObject1 (Maybe [Integer])
inlineObject1TagIdsL f InlineObject1{..} = (\inlineObject1TagIds -> InlineObject1 { inlineObject1TagIds, ..} ) <$> f inlineObject1TagIds
{-# INLINE inlineObject1TagIdsL #-}



-- * InlineObject10

-- | 'inlineObject10GroupId' Lens
inlineObject10GroupIdL :: Lens_' InlineObject10 (Integer)
inlineObject10GroupIdL f InlineObject10{..} = (\inlineObject10GroupId -> InlineObject10 { inlineObject10GroupId, ..} ) <$> f inlineObject10GroupId
{-# INLINE inlineObject10GroupIdL #-}



-- * InlineObject11

-- | 'inlineObject11GroupId' Lens
inlineObject11GroupIdL :: Lens_' InlineObject11 (Integer)
inlineObject11GroupIdL f InlineObject11{..} = (\inlineObject11GroupId -> InlineObject11 { inlineObject11GroupId, ..} ) <$> f inlineObject11GroupId
{-# INLINE inlineObject11GroupIdL #-}



-- * InlineObject12

-- | 'inlineObject12InspectionType' Lens
inlineObject12InspectionTypeL :: Lens_' InlineObject12 (E'InspectionType)
inlineObject12InspectionTypeL f InlineObject12{..} = (\inlineObject12InspectionType -> InlineObject12 { inlineObject12InspectionType, ..} ) <$> f inlineObject12InspectionType
{-# INLINE inlineObject12InspectionTypeL #-}

-- | 'inlineObject12MechanicNotes' Lens
inlineObject12MechanicNotesL :: Lens_' InlineObject12 (Maybe Text)
inlineObject12MechanicNotesL f InlineObject12{..} = (\inlineObject12MechanicNotes -> InlineObject12 { inlineObject12MechanicNotes, ..} ) <$> f inlineObject12MechanicNotes
{-# INLINE inlineObject12MechanicNotesL #-}

-- | 'inlineObject12OdometerMiles' Lens
inlineObject12OdometerMilesL :: Lens_' InlineObject12 (Maybe Int)
inlineObject12OdometerMilesL f InlineObject12{..} = (\inlineObject12OdometerMiles -> InlineObject12 { inlineObject12OdometerMiles, ..} ) <$> f inlineObject12OdometerMiles
{-# INLINE inlineObject12OdometerMilesL #-}

-- | 'inlineObject12PreviousDefectsCorrected' Lens
inlineObject12PreviousDefectsCorrectedL :: Lens_' InlineObject12 (Maybe Bool)
inlineObject12PreviousDefectsCorrectedL f InlineObject12{..} = (\inlineObject12PreviousDefectsCorrected -> InlineObject12 { inlineObject12PreviousDefectsCorrected, ..} ) <$> f inlineObject12PreviousDefectsCorrected
{-# INLINE inlineObject12PreviousDefectsCorrectedL #-}

-- | 'inlineObject12PreviousDefectsIgnored' Lens
inlineObject12PreviousDefectsIgnoredL :: Lens_' InlineObject12 (Maybe Bool)
inlineObject12PreviousDefectsIgnoredL f InlineObject12{..} = (\inlineObject12PreviousDefectsIgnored -> InlineObject12 { inlineObject12PreviousDefectsIgnored, ..} ) <$> f inlineObject12PreviousDefectsIgnored
{-# INLINE inlineObject12PreviousDefectsIgnoredL #-}

-- | 'inlineObject12Safe' Lens
inlineObject12SafeL :: Lens_' InlineObject12 (E'Safe)
inlineObject12SafeL f InlineObject12{..} = (\inlineObject12Safe -> InlineObject12 { inlineObject12Safe, ..} ) <$> f inlineObject12Safe
{-# INLINE inlineObject12SafeL #-}

-- | 'inlineObject12TrailerId' Lens
inlineObject12TrailerIdL :: Lens_' InlineObject12 (Maybe Int)
inlineObject12TrailerIdL f InlineObject12{..} = (\inlineObject12TrailerId -> InlineObject12 { inlineObject12TrailerId, ..} ) <$> f inlineObject12TrailerId
{-# INLINE inlineObject12TrailerIdL #-}

-- | 'inlineObject12UserEmail' Lens
inlineObject12UserEmailL :: Lens_' InlineObject12 (Text)
inlineObject12UserEmailL f InlineObject12{..} = (\inlineObject12UserEmail -> InlineObject12 { inlineObject12UserEmail, ..} ) <$> f inlineObject12UserEmail
{-# INLINE inlineObject12UserEmailL #-}

-- | 'inlineObject12VehicleId' Lens
inlineObject12VehicleIdL :: Lens_' InlineObject12 (Maybe Int)
inlineObject12VehicleIdL f InlineObject12{..} = (\inlineObject12VehicleId -> InlineObject12 { inlineObject12VehicleId, ..} ) <$> f inlineObject12VehicleId
{-# INLINE inlineObject12VehicleIdL #-}



-- * InlineObject13

-- | 'inlineObject13GroupId' Lens
inlineObject13GroupIdL :: Lens_' InlineObject13 (Integer)
inlineObject13GroupIdL f InlineObject13{..} = (\inlineObject13GroupId -> InlineObject13 { inlineObject13GroupId, ..} ) <$> f inlineObject13GroupId
{-# INLINE inlineObject13GroupIdL #-}



-- * InlineObject14

-- | 'inlineObject14GroupId' Lens
inlineObject14GroupIdL :: Lens_' InlineObject14 (Integer)
inlineObject14GroupIdL f InlineObject14{..} = (\inlineObject14GroupId -> InlineObject14 { inlineObject14GroupId, ..} ) <$> f inlineObject14GroupId
{-# INLINE inlineObject14GroupIdL #-}

-- | 'inlineObject14Vehicles' Lens
inlineObject14VehiclesL :: Lens_' InlineObject14 ([Vehicle])
inlineObject14VehiclesL f InlineObject14{..} = (\inlineObject14Vehicles -> InlineObject14 { inlineObject14Vehicles, ..} ) <$> f inlineObject14Vehicles
{-# INLINE inlineObject14VehiclesL #-}



-- * InlineObject15

-- | 'inlineObject15EndMs' Lens
inlineObject15EndMsL :: Lens_' InlineObject15 (Int)
inlineObject15EndMsL f InlineObject15{..} = (\inlineObject15EndMs -> InlineObject15 { inlineObject15EndMs, ..} ) <$> f inlineObject15EndMs
{-# INLINE inlineObject15EndMsL #-}

-- | 'inlineObject15GroupId' Lens
inlineObject15GroupIdL :: Lens_' InlineObject15 (Integer)
inlineObject15GroupIdL f InlineObject15{..} = (\inlineObject15GroupId -> InlineObject15 { inlineObject15GroupId, ..} ) <$> f inlineObject15GroupId
{-# INLINE inlineObject15GroupIdL #-}

-- | 'inlineObject15StartMs' Lens
inlineObject15StartMsL :: Lens_' InlineObject15 (Int)
inlineObject15StartMsL f InlineObject15{..} = (\inlineObject15StartMs -> InlineObject15 { inlineObject15StartMs, ..} ) <$> f inlineObject15StartMs
{-# INLINE inlineObject15StartMsL #-}

-- | 'inlineObject15VehicleId' Lens
inlineObject15VehicleIdL :: Lens_' InlineObject15 (Integer)
inlineObject15VehicleIdL f InlineObject15{..} = (\inlineObject15VehicleId -> InlineObject15 { inlineObject15VehicleId, ..} ) <$> f inlineObject15VehicleId
{-# INLINE inlineObject15VehicleIdL #-}



-- * InlineObject16

-- | 'inlineObject16ExternalIds' Lens
inlineObject16ExternalIdsL :: Lens_' InlineObject16 (Maybe (Map.Map String Text))
inlineObject16ExternalIdsL f InlineObject16{..} = (\inlineObject16ExternalIds -> InlineObject16 { inlineObject16ExternalIds, ..} ) <$> f inlineObject16ExternalIds
{-# INLINE inlineObject16ExternalIdsL #-}

-- | 'inlineObject16HarshAccelSetting' Lens
inlineObject16HarshAccelSettingL :: Lens_' InlineObject16 (Maybe Int)
inlineObject16HarshAccelSettingL f InlineObject16{..} = (\inlineObject16HarshAccelSetting -> InlineObject16 { inlineObject16HarshAccelSetting, ..} ) <$> f inlineObject16HarshAccelSetting
{-# INLINE inlineObject16HarshAccelSettingL #-}

-- | 'inlineObject16Name' Lens
inlineObject16NameL :: Lens_' InlineObject16 (Maybe Text)
inlineObject16NameL f InlineObject16{..} = (\inlineObject16Name -> InlineObject16 { inlineObject16Name, ..} ) <$> f inlineObject16Name
{-# INLINE inlineObject16NameL #-}



-- * InlineObject17

-- | 'inlineObject17EndMs' Lens
inlineObject17EndMsL :: Lens_' InlineObject17 (Int)
inlineObject17EndMsL f InlineObject17{..} = (\inlineObject17EndMs -> InlineObject17 { inlineObject17EndMs, ..} ) <$> f inlineObject17EndMs
{-# INLINE inlineObject17EndMsL #-}

-- | 'inlineObject17GroupId' Lens
inlineObject17GroupIdL :: Lens_' InlineObject17 (Integer)
inlineObject17GroupIdL f InlineObject17{..} = (\inlineObject17GroupId -> InlineObject17 { inlineObject17GroupId, ..} ) <$> f inlineObject17GroupId
{-# INLINE inlineObject17GroupIdL #-}

-- | 'inlineObject17StartMs' Lens
inlineObject17StartMsL :: Lens_' InlineObject17 (Int)
inlineObject17StartMsL f InlineObject17{..} = (\inlineObject17StartMs -> InlineObject17 { inlineObject17StartMs, ..} ) <$> f inlineObject17StartMs
{-# INLINE inlineObject17StartMsL #-}



-- * InlineObject18

-- | 'inlineObject18GroupId' Lens
inlineObject18GroupIdL :: Lens_' InlineObject18 (Integer)
inlineObject18GroupIdL f InlineObject18{..} = (\inlineObject18GroupId -> InlineObject18 { inlineObject18GroupId, ..} ) <$> f inlineObject18GroupId
{-# INLINE inlineObject18GroupIdL #-}



-- * InlineObject19

-- | 'inlineObject19GroupId' Lens
inlineObject19GroupIdL :: Lens_' InlineObject19 (Integer)
inlineObject19GroupIdL f InlineObject19{..} = (\inlineObject19GroupId -> InlineObject19 { inlineObject19GroupId, ..} ) <$> f inlineObject19GroupId
{-# INLINE inlineObject19GroupIdL #-}

-- | 'inlineObject19Sensors' Lens
inlineObject19SensorsL :: Lens_' InlineObject19 ([Integer])
inlineObject19SensorsL f InlineObject19{..} = (\inlineObject19Sensors -> InlineObject19 { inlineObject19Sensors, ..} ) <$> f inlineObject19Sensors
{-# INLINE inlineObject19SensorsL #-}



-- * InlineObject2

-- | 'inlineObject2Address' Lens
inlineObject2AddressL :: Lens_' InlineObject2 (Text)
inlineObject2AddressL f InlineObject2{..} = (\inlineObject2Address -> InlineObject2 { inlineObject2Address, ..} ) <$> f inlineObject2Address
{-# INLINE inlineObject2AddressL #-}

-- | 'inlineObject2GroupId' Lens
inlineObject2GroupIdL :: Lens_' InlineObject2 (Integer)
inlineObject2GroupIdL f InlineObject2{..} = (\inlineObject2GroupId -> InlineObject2 { inlineObject2GroupId, ..} ) <$> f inlineObject2GroupId
{-# INLINE inlineObject2GroupIdL #-}

-- | 'inlineObject2Name' Lens
inlineObject2NameL :: Lens_' InlineObject2 (Text)
inlineObject2NameL f InlineObject2{..} = (\inlineObject2Name -> InlineObject2 { inlineObject2Name, ..} ) <$> f inlineObject2Name
{-# INLINE inlineObject2NameL #-}

-- | 'inlineObject2Radius' Lens
inlineObject2RadiusL :: Lens_' InlineObject2 (Int)
inlineObject2RadiusL f InlineObject2{..} = (\inlineObject2Radius -> InlineObject2 { inlineObject2Radius, ..} ) <$> f inlineObject2Radius
{-# INLINE inlineObject2RadiusL #-}



-- * InlineObject20

-- | 'inlineObject20GroupId' Lens
inlineObject20GroupIdL :: Lens_' InlineObject20 (Integer)
inlineObject20GroupIdL f InlineObject20{..} = (\inlineObject20GroupId -> InlineObject20 { inlineObject20GroupId, ..} ) <$> f inlineObject20GroupId
{-# INLINE inlineObject20GroupIdL #-}

-- | 'inlineObject20Sensors' Lens
inlineObject20SensorsL :: Lens_' InlineObject20 ([Integer])
inlineObject20SensorsL f InlineObject20{..} = (\inlineObject20Sensors -> InlineObject20 { inlineObject20Sensors, ..} ) <$> f inlineObject20Sensors
{-# INLINE inlineObject20SensorsL #-}



-- * InlineObject21

-- | 'inlineObject21EndMs' Lens
inlineObject21EndMsL :: Lens_' InlineObject21 (Int)
inlineObject21EndMsL f InlineObject21{..} = (\inlineObject21EndMs -> InlineObject21 { inlineObject21EndMs, ..} ) <$> f inlineObject21EndMs
{-# INLINE inlineObject21EndMsL #-}

-- | 'inlineObject21FillMissing' Lens
inlineObject21FillMissingL :: Lens_' InlineObject21 (Maybe E'FillMissing)
inlineObject21FillMissingL f InlineObject21{..} = (\inlineObject21FillMissing -> InlineObject21 { inlineObject21FillMissing, ..} ) <$> f inlineObject21FillMissing
{-# INLINE inlineObject21FillMissingL #-}

-- | 'inlineObject21GroupId' Lens
inlineObject21GroupIdL :: Lens_' InlineObject21 (Integer)
inlineObject21GroupIdL f InlineObject21{..} = (\inlineObject21GroupId -> InlineObject21 { inlineObject21GroupId, ..} ) <$> f inlineObject21GroupId
{-# INLINE inlineObject21GroupIdL #-}

-- | 'inlineObject21Series' Lens
inlineObject21SeriesL :: Lens_' InlineObject21 ([SensorsHistorySeries])
inlineObject21SeriesL f InlineObject21{..} = (\inlineObject21Series -> InlineObject21 { inlineObject21Series, ..} ) <$> f inlineObject21Series
{-# INLINE inlineObject21SeriesL #-}

-- | 'inlineObject21StartMs' Lens
inlineObject21StartMsL :: Lens_' InlineObject21 (Int)
inlineObject21StartMsL f InlineObject21{..} = (\inlineObject21StartMs -> InlineObject21 { inlineObject21StartMs, ..} ) <$> f inlineObject21StartMs
{-# INLINE inlineObject21StartMsL #-}

-- | 'inlineObject21StepMs' Lens
inlineObject21StepMsL :: Lens_' InlineObject21 (Int)
inlineObject21StepMsL f InlineObject21{..} = (\inlineObject21StepMs -> InlineObject21 { inlineObject21StepMs, ..} ) <$> f inlineObject21StepMs
{-# INLINE inlineObject21StepMsL #-}



-- * InlineObject22

-- | 'inlineObject22GroupId' Lens
inlineObject22GroupIdL :: Lens_' InlineObject22 (Integer)
inlineObject22GroupIdL f InlineObject22{..} = (\inlineObject22GroupId -> InlineObject22 { inlineObject22GroupId, ..} ) <$> f inlineObject22GroupId
{-# INLINE inlineObject22GroupIdL #-}

-- | 'inlineObject22Sensors' Lens
inlineObject22SensorsL :: Lens_' InlineObject22 ([Integer])
inlineObject22SensorsL f InlineObject22{..} = (\inlineObject22Sensors -> InlineObject22 { inlineObject22Sensors, ..} ) <$> f inlineObject22Sensors
{-# INLINE inlineObject22SensorsL #-}



-- * InlineObject23

-- | 'inlineObject23GroupId' Lens
inlineObject23GroupIdL :: Lens_' InlineObject23 (Integer)
inlineObject23GroupIdL f InlineObject23{..} = (\inlineObject23GroupId -> InlineObject23 { inlineObject23GroupId, ..} ) <$> f inlineObject23GroupId
{-# INLINE inlineObject23GroupIdL #-}



-- * InlineObject24

-- | 'inlineObject24GroupId' Lens
inlineObject24GroupIdL :: Lens_' InlineObject24 (Integer)
inlineObject24GroupIdL f InlineObject24{..} = (\inlineObject24GroupId -> InlineObject24 { inlineObject24GroupId, ..} ) <$> f inlineObject24GroupId
{-# INLINE inlineObject24GroupIdL #-}

-- | 'inlineObject24Sensors' Lens
inlineObject24SensorsL :: Lens_' InlineObject24 ([Integer])
inlineObject24SensorsL f InlineObject24{..} = (\inlineObject24Sensors -> InlineObject24 { inlineObject24Sensors, ..} ) <$> f inlineObject24Sensors
{-# INLINE inlineObject24SensorsL #-}



-- * InlineObject3

-- | 'inlineObject3GroupId' Lens
inlineObject3GroupIdL :: Lens_' InlineObject3 (Integer)
inlineObject3GroupIdL f InlineObject3{..} = (\inlineObject3GroupId -> InlineObject3 { inlineObject3GroupId, ..} ) <$> f inlineObject3GroupId
{-# INLINE inlineObject3GroupIdL #-}



-- * InlineObject4

-- | 'inlineObject4Reactivate' Lens
inlineObject4ReactivateL :: Lens_' InlineObject4 (Bool)
inlineObject4ReactivateL f InlineObject4{..} = (\inlineObject4Reactivate -> InlineObject4 { inlineObject4Reactivate, ..} ) <$> f inlineObject4Reactivate
{-# INLINE inlineObject4ReactivateL #-}



-- * InlineObject5

-- | 'inlineObject5EndMs' Lens
inlineObject5EndMsL :: Lens_' InlineObject5 (Integer)
inlineObject5EndMsL f InlineObject5{..} = (\inlineObject5EndMs -> InlineObject5 { inlineObject5EndMs, ..} ) <$> f inlineObject5EndMs
{-# INLINE inlineObject5EndMsL #-}

-- | 'inlineObject5OrgId' Lens
inlineObject5OrgIdL :: Lens_' InlineObject5 (Integer)
inlineObject5OrgIdL f InlineObject5{..} = (\inlineObject5OrgId -> InlineObject5 { inlineObject5OrgId, ..} ) <$> f inlineObject5OrgId
{-# INLINE inlineObject5OrgIdL #-}

-- | 'inlineObject5StartMs' Lens
inlineObject5StartMsL :: Lens_' InlineObject5 (Integer)
inlineObject5StartMsL f InlineObject5{..} = (\inlineObject5StartMs -> InlineObject5 { inlineObject5StartMs, ..} ) <$> f inlineObject5StartMs
{-# INLINE inlineObject5StartMsL #-}



-- * InlineObject6

-- | 'inlineObject6DriverId' Lens
inlineObject6DriverIdL :: Lens_' InlineObject6 (Integer)
inlineObject6DriverIdL f InlineObject6{..} = (\inlineObject6DriverId -> InlineObject6 { inlineObject6DriverId, ..} ) <$> f inlineObject6DriverId
{-# INLINE inlineObject6DriverIdL #-}

-- | 'inlineObject6EndMs' Lens
inlineObject6EndMsL :: Lens_' InlineObject6 (Int)
inlineObject6EndMsL f InlineObject6{..} = (\inlineObject6EndMs -> InlineObject6 { inlineObject6EndMs, ..} ) <$> f inlineObject6EndMs
{-# INLINE inlineObject6EndMsL #-}

-- | 'inlineObject6GroupId' Lens
inlineObject6GroupIdL :: Lens_' InlineObject6 (Integer)
inlineObject6GroupIdL f InlineObject6{..} = (\inlineObject6GroupId -> InlineObject6 { inlineObject6GroupId, ..} ) <$> f inlineObject6GroupId
{-# INLINE inlineObject6GroupIdL #-}

-- | 'inlineObject6StartMs' Lens
inlineObject6StartMsL :: Lens_' InlineObject6 (Int)
inlineObject6StartMsL f InlineObject6{..} = (\inlineObject6StartMs -> InlineObject6 { inlineObject6StartMs, ..} ) <$> f inlineObject6StartMs
{-# INLINE inlineObject6StartMsL #-}



-- * InlineObject7

-- | 'inlineObject7DriverId' Lens
inlineObject7DriverIdL :: Lens_' InlineObject7 (Integer)
inlineObject7DriverIdL f InlineObject7{..} = (\inlineObject7DriverId -> InlineObject7 { inlineObject7DriverId, ..} ) <$> f inlineObject7DriverId
{-# INLINE inlineObject7DriverIdL #-}

-- | 'inlineObject7EndMs' Lens
inlineObject7EndMsL :: Lens_' InlineObject7 (Int)
inlineObject7EndMsL f InlineObject7{..} = (\inlineObject7EndMs -> InlineObject7 { inlineObject7EndMs, ..} ) <$> f inlineObject7EndMs
{-# INLINE inlineObject7EndMsL #-}

-- | 'inlineObject7GroupId' Lens
inlineObject7GroupIdL :: Lens_' InlineObject7 (Integer)
inlineObject7GroupIdL f InlineObject7{..} = (\inlineObject7GroupId -> InlineObject7 { inlineObject7GroupId, ..} ) <$> f inlineObject7GroupId
{-# INLINE inlineObject7GroupIdL #-}

-- | 'inlineObject7StartMs' Lens
inlineObject7StartMsL :: Lens_' InlineObject7 (Int)
inlineObject7StartMsL f InlineObject7{..} = (\inlineObject7StartMs -> InlineObject7 { inlineObject7StartMs, ..} ) <$> f inlineObject7StartMs
{-# INLINE inlineObject7StartMsL #-}



-- * InlineObject8

-- | 'inlineObject8DriverId' Lens
inlineObject8DriverIdL :: Lens_' InlineObject8 (Integer)
inlineObject8DriverIdL f InlineObject8{..} = (\inlineObject8DriverId -> InlineObject8 { inlineObject8DriverId, ..} ) <$> f inlineObject8DriverId
{-# INLINE inlineObject8DriverIdL #-}

-- | 'inlineObject8EndMs' Lens
inlineObject8EndMsL :: Lens_' InlineObject8 (Int)
inlineObject8EndMsL f InlineObject8{..} = (\inlineObject8EndMs -> InlineObject8 { inlineObject8EndMs, ..} ) <$> f inlineObject8EndMs
{-# INLINE inlineObject8EndMsL #-}

-- | 'inlineObject8GroupId' Lens
inlineObject8GroupIdL :: Lens_' InlineObject8 (Integer)
inlineObject8GroupIdL f InlineObject8{..} = (\inlineObject8GroupId -> InlineObject8 { inlineObject8GroupId, ..} ) <$> f inlineObject8GroupId
{-# INLINE inlineObject8GroupIdL #-}

-- | 'inlineObject8StartMs' Lens
inlineObject8StartMsL :: Lens_' InlineObject8 (Int)
inlineObject8StartMsL f InlineObject8{..} = (\inlineObject8StartMs -> InlineObject8 { inlineObject8StartMs, ..} ) <$> f inlineObject8StartMs
{-# INLINE inlineObject8StartMsL #-}



-- * InlineObject9

-- | 'inlineObject9GroupId' Lens
inlineObject9GroupIdL :: Lens_' InlineObject9 (Integer)
inlineObject9GroupIdL f InlineObject9{..} = (\inlineObject9GroupId -> InlineObject9 { inlineObject9GroupId, ..} ) <$> f inlineObject9GroupId
{-# INLINE inlineObject9GroupIdL #-}



-- * InlineResponse200

-- | 'inlineResponse200Assets' Lens
inlineResponse200AssetsL :: Lens_' InlineResponse200 (Maybe [Asset])
inlineResponse200AssetsL f InlineResponse200{..} = (\inlineResponse200Assets -> InlineResponse200 { inlineResponse200Assets, ..} ) <$> f inlineResponse200Assets
{-# INLINE inlineResponse200AssetsL #-}



-- * InlineResponse2001

-- | 'inlineResponse2001Assets' Lens
inlineResponse2001AssetsL :: Lens_' InlineResponse2001 (Maybe [AssetCurrentLocationsResponse])
inlineResponse2001AssetsL f InlineResponse2001{..} = (\inlineResponse2001Assets -> InlineResponse2001 { inlineResponse2001Assets, ..} ) <$> f inlineResponse2001Assets
{-# INLINE inlineResponse2001AssetsL #-}



-- * InlineResponse2002

-- | 'inlineResponse2002Pagination' Lens
inlineResponse2002PaginationL :: Lens_' InlineResponse2002 (Maybe Pagination)
inlineResponse2002PaginationL f InlineResponse2002{..} = (\inlineResponse2002Pagination -> InlineResponse2002 { inlineResponse2002Pagination, ..} ) <$> f inlineResponse2002Pagination
{-# INLINE inlineResponse2002PaginationL #-}

-- | 'inlineResponse2002GroupId' Lens
inlineResponse2002GroupIdL :: Lens_' InlineResponse2002 (Maybe Integer)
inlineResponse2002GroupIdL f InlineResponse2002{..} = (\inlineResponse2002GroupId -> InlineResponse2002 { inlineResponse2002GroupId, ..} ) <$> f inlineResponse2002GroupId
{-# INLINE inlineResponse2002GroupIdL #-}

-- | 'inlineResponse2002Vehicles' Lens
inlineResponse2002VehiclesL :: Lens_' InlineResponse2002 (Maybe [Vehicle])
inlineResponse2002VehiclesL f InlineResponse2002{..} = (\inlineResponse2002Vehicles -> InlineResponse2002 { inlineResponse2002Vehicles, ..} ) <$> f inlineResponse2002Vehicles
{-# INLINE inlineResponse2002VehiclesL #-}



-- * InlineResponse2003

-- | 'inlineResponse2003GroupId' Lens
inlineResponse2003GroupIdL :: Lens_' InlineResponse2003 (Maybe Integer)
inlineResponse2003GroupIdL f InlineResponse2003{..} = (\inlineResponse2003GroupId -> InlineResponse2003 { inlineResponse2003GroupId, ..} ) <$> f inlineResponse2003GroupId
{-# INLINE inlineResponse2003GroupIdL #-}

-- | 'inlineResponse2003Vehicles' Lens
inlineResponse2003VehiclesL :: Lens_' InlineResponse2003 (Maybe [VehicleLocation])
inlineResponse2003VehiclesL f InlineResponse2003{..} = (\inlineResponse2003Vehicles -> InlineResponse2003 { inlineResponse2003Vehicles, ..} ) <$> f inlineResponse2003Vehicles
{-# INLINE inlineResponse2003VehiclesL #-}



-- * InlineResponse2004

-- | 'inlineResponse2004Vehicles' Lens
inlineResponse2004VehiclesL :: Lens_' InlineResponse2004 (Maybe [VehicleMaintenance])
inlineResponse2004VehiclesL f InlineResponse2004{..} = (\inlineResponse2004Vehicles -> InlineResponse2004 { inlineResponse2004Vehicles, ..} ) <$> f inlineResponse2004Vehicles
{-# INLINE inlineResponse2004VehiclesL #-}



-- * InlineResponse2005

-- | 'inlineResponse2005Pagination' Lens
inlineResponse2005PaginationL :: Lens_' InlineResponse2005 (Maybe Pagination)
inlineResponse2005PaginationL f InlineResponse2005{..} = (\inlineResponse2005Pagination -> InlineResponse2005 { inlineResponse2005Pagination, ..} ) <$> f inlineResponse2005Pagination
{-# INLINE inlineResponse2005PaginationL #-}

-- | 'inlineResponse2005VehicleStats' Lens
inlineResponse2005VehicleStatsL :: Lens_' InlineResponse2005 ([InlineResponse2005VehicleStats])
inlineResponse2005VehicleStatsL f InlineResponse2005{..} = (\inlineResponse2005VehicleStats -> InlineResponse2005 { inlineResponse2005VehicleStats, ..} ) <$> f inlineResponse2005VehicleStats
{-# INLINE inlineResponse2005VehicleStatsL #-}



-- * InlineResponse2005VehicleStats

-- | 'inlineResponse2005VehicleStatsEngineState' Lens
inlineResponse2005VehicleStatsEngineStateL :: Lens_' InlineResponse2005VehicleStats (Maybe [EngineState])
inlineResponse2005VehicleStatsEngineStateL f InlineResponse2005VehicleStats{..} = (\inlineResponse2005VehicleStatsEngineState -> InlineResponse2005VehicleStats { inlineResponse2005VehicleStatsEngineState, ..} ) <$> f inlineResponse2005VehicleStatsEngineState
{-# INLINE inlineResponse2005VehicleStatsEngineStateL #-}

-- | 'inlineResponse2005VehicleStatsAuxInput2' Lens
inlineResponse2005VehicleStatsAuxInput2L :: Lens_' InlineResponse2005VehicleStats (Maybe AuxInputSeries)
inlineResponse2005VehicleStatsAuxInput2L f InlineResponse2005VehicleStats{..} = (\inlineResponse2005VehicleStatsAuxInput2 -> InlineResponse2005VehicleStats { inlineResponse2005VehicleStatsAuxInput2, ..} ) <$> f inlineResponse2005VehicleStatsAuxInput2
{-# INLINE inlineResponse2005VehicleStatsAuxInput2L #-}

-- | 'inlineResponse2005VehicleStatsVehicleId' Lens
inlineResponse2005VehicleStatsVehicleIdL :: Lens_' InlineResponse2005VehicleStats (Integer)
inlineResponse2005VehicleStatsVehicleIdL f InlineResponse2005VehicleStats{..} = (\inlineResponse2005VehicleStatsVehicleId -> InlineResponse2005VehicleStats { inlineResponse2005VehicleStatsVehicleId, ..} ) <$> f inlineResponse2005VehicleStatsVehicleId
{-# INLINE inlineResponse2005VehicleStatsVehicleIdL #-}

-- | 'inlineResponse2005VehicleStatsAuxInput1' Lens
inlineResponse2005VehicleStatsAuxInput1L :: Lens_' InlineResponse2005VehicleStats (Maybe AuxInputSeries)
inlineResponse2005VehicleStatsAuxInput1L f InlineResponse2005VehicleStats{..} = (\inlineResponse2005VehicleStatsAuxInput1 -> InlineResponse2005VehicleStats { inlineResponse2005VehicleStatsAuxInput1, ..} ) <$> f inlineResponse2005VehicleStatsAuxInput1
{-# INLINE inlineResponse2005VehicleStatsAuxInput1L #-}



-- * InlineResponse2006

-- | 'inlineResponse2006DataInputs' Lens
inlineResponse2006DataInputsL :: Lens_' InlineResponse2006 (Maybe [DataInputHistoryResponse])
inlineResponse2006DataInputsL f InlineResponse2006{..} = (\inlineResponse2006DataInputs -> InlineResponse2006 { inlineResponse2006DataInputs, ..} ) <$> f inlineResponse2006DataInputs
{-# INLINE inlineResponse2006DataInputsL #-}



-- * InlineResponse2007

-- | 'inlineResponse2007Machines' Lens
inlineResponse2007MachinesL :: Lens_' InlineResponse2007 (Maybe [Machine])
inlineResponse2007MachinesL f InlineResponse2007{..} = (\inlineResponse2007Machines -> InlineResponse2007 { inlineResponse2007Machines, ..} ) <$> f inlineResponse2007Machines
{-# INLINE inlineResponse2007MachinesL #-}



-- * InlineResponse2008

-- | 'inlineResponse2008Sensors' Lens
inlineResponse2008SensorsL :: Lens_' InlineResponse2008 (Maybe [Sensor])
inlineResponse2008SensorsL f InlineResponse2008{..} = (\inlineResponse2008Sensors -> InlineResponse2008 { inlineResponse2008Sensors, ..} ) <$> f inlineResponse2008Sensors
{-# INLINE inlineResponse2008SensorsL #-}



-- * InlineResponse2009

-- | 'inlineResponse2009Tags' Lens
inlineResponse2009TagsL :: Lens_' InlineResponse2009 (Maybe [Tag])
inlineResponse2009TagsL f InlineResponse2009{..} = (\inlineResponse2009Tags -> InlineResponse2009 { inlineResponse2009Tags, ..} ) <$> f inlineResponse2009Tags
{-# INLINE inlineResponse2009TagsL #-}



-- * JobStatus



-- * JobUpdateObject

-- | 'jobUpdateObjectChangedAtMs' Lens
jobUpdateObjectChangedAtMsL :: Lens_' JobUpdateObject (Maybe Integer)
jobUpdateObjectChangedAtMsL f JobUpdateObject{..} = (\jobUpdateObjectChangedAtMs -> JobUpdateObject { jobUpdateObjectChangedAtMs, ..} ) <$> f jobUpdateObjectChangedAtMs
{-# INLINE jobUpdateObjectChangedAtMsL #-}

-- | 'jobUpdateObjectJobId' Lens
jobUpdateObjectJobIdL :: Lens_' JobUpdateObject (Maybe Integer)
jobUpdateObjectJobIdL f JobUpdateObject{..} = (\jobUpdateObjectJobId -> JobUpdateObject { jobUpdateObjectJobId, ..} ) <$> f jobUpdateObjectJobId
{-# INLINE jobUpdateObjectJobIdL #-}

-- | 'jobUpdateObjectJobState' Lens
jobUpdateObjectJobStateL :: Lens_' JobUpdateObject (Maybe JobStatus)
jobUpdateObjectJobStateL f JobUpdateObject{..} = (\jobUpdateObjectJobState -> JobUpdateObject { jobUpdateObjectJobState, ..} ) <$> f jobUpdateObjectJobState
{-# INLINE jobUpdateObjectJobStateL #-}

-- | 'jobUpdateObjectPrevJobState' Lens
jobUpdateObjectPrevJobStateL :: Lens_' JobUpdateObject (Maybe PrevJobStatus)
jobUpdateObjectPrevJobStateL f JobUpdateObject{..} = (\jobUpdateObjectPrevJobState -> JobUpdateObject { jobUpdateObjectPrevJobState, ..} ) <$> f jobUpdateObjectPrevJobState
{-# INLINE jobUpdateObjectPrevJobStateL #-}

-- | 'jobUpdateObjectRoute' Lens
jobUpdateObjectRouteL :: Lens_' JobUpdateObject (Maybe DispatchRoute)
jobUpdateObjectRouteL f JobUpdateObject{..} = (\jobUpdateObjectRoute -> JobUpdateObject { jobUpdateObjectRoute, ..} ) <$> f jobUpdateObjectRoute
{-# INLINE jobUpdateObjectRouteL #-}

-- | 'jobUpdateObjectRouteId' Lens
jobUpdateObjectRouteIdL :: Lens_' JobUpdateObject (Maybe Integer)
jobUpdateObjectRouteIdL f JobUpdateObject{..} = (\jobUpdateObjectRouteId -> JobUpdateObject { jobUpdateObjectRouteId, ..} ) <$> f jobUpdateObjectRouteId
{-# INLINE jobUpdateObjectRouteIdL #-}



-- * Machine

-- | 'machineId' Lens
machineIdL :: Lens_' Machine (Integer)
machineIdL f Machine{..} = (\machineId -> Machine { machineId, ..} ) <$> f machineId
{-# INLINE machineIdL #-}

-- | 'machineName' Lens
machineNameL :: Lens_' Machine (Maybe Text)
machineNameL f Machine{..} = (\machineName -> Machine { machineName, ..} ) <$> f machineName
{-# INLINE machineNameL #-}

-- | 'machineNotes' Lens
machineNotesL :: Lens_' Machine (Maybe Text)
machineNotesL f Machine{..} = (\machineNotes -> Machine { machineNotes, ..} ) <$> f machineNotes
{-# INLINE machineNotesL #-}



-- * MachineHistoryResponse

-- | 'machineHistoryResponseMachines' Lens
machineHistoryResponseMachinesL :: Lens_' MachineHistoryResponse (Maybe [MachineHistoryResponseMachines])
machineHistoryResponseMachinesL f MachineHistoryResponse{..} = (\machineHistoryResponseMachines -> MachineHistoryResponse { machineHistoryResponseMachines, ..} ) <$> f machineHistoryResponseMachines
{-# INLINE machineHistoryResponseMachinesL #-}



-- * MachineHistoryResponseMachines

-- | 'machineHistoryResponseMachinesName' Lens
machineHistoryResponseMachinesNameL :: Lens_' MachineHistoryResponseMachines (Maybe Text)
machineHistoryResponseMachinesNameL f MachineHistoryResponseMachines{..} = (\machineHistoryResponseMachinesName -> MachineHistoryResponseMachines { machineHistoryResponseMachinesName, ..} ) <$> f machineHistoryResponseMachinesName
{-# INLINE machineHistoryResponseMachinesNameL #-}

-- | 'machineHistoryResponseMachinesId' Lens
machineHistoryResponseMachinesIdL :: Lens_' MachineHistoryResponseMachines (Maybe Int)
machineHistoryResponseMachinesIdL f MachineHistoryResponseMachines{..} = (\machineHistoryResponseMachinesId -> MachineHistoryResponseMachines { machineHistoryResponseMachinesId, ..} ) <$> f machineHistoryResponseMachinesId
{-# INLINE machineHistoryResponseMachinesIdL #-}

-- | 'machineHistoryResponseMachinesVibrations' Lens
machineHistoryResponseMachinesVibrationsL :: Lens_' MachineHistoryResponseMachines (Maybe [MachineHistoryResponseVibrations])
machineHistoryResponseMachinesVibrationsL f MachineHistoryResponseMachines{..} = (\machineHistoryResponseMachinesVibrations -> MachineHistoryResponseMachines { machineHistoryResponseMachinesVibrations, ..} ) <$> f machineHistoryResponseMachinesVibrations
{-# INLINE machineHistoryResponseMachinesVibrationsL #-}



-- * MachineHistoryResponseVibrations

-- | 'machineHistoryResponseVibrationsX' Lens
machineHistoryResponseVibrationsXL :: Lens_' MachineHistoryResponseVibrations (Maybe Double)
machineHistoryResponseVibrationsXL f MachineHistoryResponseVibrations{..} = (\machineHistoryResponseVibrationsX -> MachineHistoryResponseVibrations { machineHistoryResponseVibrationsX, ..} ) <$> f machineHistoryResponseVibrationsX
{-# INLINE machineHistoryResponseVibrationsXL #-}

-- | 'machineHistoryResponseVibrationsY' Lens
machineHistoryResponseVibrationsYL :: Lens_' MachineHistoryResponseVibrations (Maybe Double)
machineHistoryResponseVibrationsYL f MachineHistoryResponseVibrations{..} = (\machineHistoryResponseVibrationsY -> MachineHistoryResponseVibrations { machineHistoryResponseVibrationsY, ..} ) <$> f machineHistoryResponseVibrationsY
{-# INLINE machineHistoryResponseVibrationsYL #-}

-- | 'machineHistoryResponseVibrationsZ' Lens
machineHistoryResponseVibrationsZL :: Lens_' MachineHistoryResponseVibrations (Maybe Double)
machineHistoryResponseVibrationsZL f MachineHistoryResponseVibrations{..} = (\machineHistoryResponseVibrationsZ -> MachineHistoryResponseVibrations { machineHistoryResponseVibrationsZ, ..} ) <$> f machineHistoryResponseVibrationsZ
{-# INLINE machineHistoryResponseVibrationsZL #-}

-- | 'machineHistoryResponseVibrationsTime' Lens
machineHistoryResponseVibrationsTimeL :: Lens_' MachineHistoryResponseVibrations (Maybe Integer)
machineHistoryResponseVibrationsTimeL f MachineHistoryResponseVibrations{..} = (\machineHistoryResponseVibrationsTime -> MachineHistoryResponseVibrations { machineHistoryResponseVibrationsTime, ..} ) <$> f machineHistoryResponseVibrationsTime
{-# INLINE machineHistoryResponseVibrationsTimeL #-}



-- * Pagination

-- | 'paginationEndCursor' Lens
paginationEndCursorL :: Lens_' Pagination (Text)
paginationEndCursorL f Pagination{..} = (\paginationEndCursor -> Pagination { paginationEndCursor, ..} ) <$> f paginationEndCursor
{-# INLINE paginationEndCursorL #-}

-- | 'paginationHasNextPage' Lens
paginationHasNextPageL :: Lens_' Pagination (Bool)
paginationHasNextPageL f Pagination{..} = (\paginationHasNextPage -> Pagination { paginationHasNextPage, ..} ) <$> f paginationHasNextPage
{-# INLINE paginationHasNextPageL #-}

-- | 'paginationHasPrevPage' Lens
paginationHasPrevPageL :: Lens_' Pagination (Bool)
paginationHasPrevPageL f Pagination{..} = (\paginationHasPrevPage -> Pagination { paginationHasPrevPage, ..} ) <$> f paginationHasPrevPage
{-# INLINE paginationHasPrevPageL #-}

-- | 'paginationStartCursor' Lens
paginationStartCursorL :: Lens_' Pagination (Text)
paginationStartCursorL f Pagination{..} = (\paginationStartCursor -> Pagination { paginationStartCursor, ..} ) <$> f paginationStartCursor
{-# INLINE paginationStartCursorL #-}



-- * PrevJobStatus



-- * SafetyReportHarshEvent

-- | 'safetyReportHarshEventHarshEventType' Lens
safetyReportHarshEventHarshEventTypeL :: Lens_' SafetyReportHarshEvent (Maybe Text)
safetyReportHarshEventHarshEventTypeL f SafetyReportHarshEvent{..} = (\safetyReportHarshEventHarshEventType -> SafetyReportHarshEvent { safetyReportHarshEventHarshEventType, ..} ) <$> f safetyReportHarshEventHarshEventType
{-# INLINE safetyReportHarshEventHarshEventTypeL #-}

-- | 'safetyReportHarshEventTimestampMs' Lens
safetyReportHarshEventTimestampMsL :: Lens_' SafetyReportHarshEvent (Maybe Int)
safetyReportHarshEventTimestampMsL f SafetyReportHarshEvent{..} = (\safetyReportHarshEventTimestampMs -> SafetyReportHarshEvent { safetyReportHarshEventTimestampMs, ..} ) <$> f safetyReportHarshEventTimestampMs
{-# INLINE safetyReportHarshEventTimestampMsL #-}

-- | 'safetyReportHarshEventVehicleId' Lens
safetyReportHarshEventVehicleIdL :: Lens_' SafetyReportHarshEvent (Maybe Int)
safetyReportHarshEventVehicleIdL f SafetyReportHarshEvent{..} = (\safetyReportHarshEventVehicleId -> SafetyReportHarshEvent { safetyReportHarshEventVehicleId, ..} ) <$> f safetyReportHarshEventVehicleId
{-# INLINE safetyReportHarshEventVehicleIdL #-}



-- * Sensor

-- | 'sensorId' Lens
sensorIdL :: Lens_' Sensor (Integer)
sensorIdL f Sensor{..} = (\sensorId -> Sensor { sensorId, ..} ) <$> f sensorId
{-# INLINE sensorIdL #-}

-- | 'sensorMacAddress' Lens
sensorMacAddressL :: Lens_' Sensor (Maybe Text)
sensorMacAddressL f Sensor{..} = (\sensorMacAddress -> Sensor { sensorMacAddress, ..} ) <$> f sensorMacAddress
{-# INLINE sensorMacAddressL #-}

-- | 'sensorName' Lens
sensorNameL :: Lens_' Sensor (Maybe Text)
sensorNameL f Sensor{..} = (\sensorName -> Sensor { sensorName, ..} ) <$> f sensorName
{-# INLINE sensorNameL #-}



-- * SensorHistoryResponse

-- | 'sensorHistoryResponseResults' Lens
sensorHistoryResponseResultsL :: Lens_' SensorHistoryResponse (Maybe [SensorHistoryResponseResults])
sensorHistoryResponseResultsL f SensorHistoryResponse{..} = (\sensorHistoryResponseResults -> SensorHistoryResponse { sensorHistoryResponseResults, ..} ) <$> f sensorHistoryResponseResults
{-# INLINE sensorHistoryResponseResultsL #-}



-- * SensorHistoryResponseResults

-- | 'sensorHistoryResponseResultsSeries' Lens
sensorHistoryResponseResultsSeriesL :: Lens_' SensorHistoryResponseResults (Maybe [Integer])
sensorHistoryResponseResultsSeriesL f SensorHistoryResponseResults{..} = (\sensorHistoryResponseResultsSeries -> SensorHistoryResponseResults { sensorHistoryResponseResultsSeries, ..} ) <$> f sensorHistoryResponseResultsSeries
{-# INLINE sensorHistoryResponseResultsSeriesL #-}

-- | 'sensorHistoryResponseResultsTimeMs' Lens
sensorHistoryResponseResultsTimeMsL :: Lens_' SensorHistoryResponseResults (Maybe Int)
sensorHistoryResponseResultsTimeMsL f SensorHistoryResponseResults{..} = (\sensorHistoryResponseResultsTimeMs -> SensorHistoryResponseResults { sensorHistoryResponseResultsTimeMs, ..} ) <$> f sensorHistoryResponseResultsTimeMs
{-# INLINE sensorHistoryResponseResultsTimeMsL #-}



-- * SensorsHistorySeries

-- | 'sensorsHistorySeriesField' Lens
sensorsHistorySeriesFieldL :: Lens_' SensorsHistorySeries (E'Field)
sensorsHistorySeriesFieldL f SensorsHistorySeries{..} = (\sensorsHistorySeriesField -> SensorsHistorySeries { sensorsHistorySeriesField, ..} ) <$> f sensorsHistorySeriesField
{-# INLINE sensorsHistorySeriesFieldL #-}

-- | 'sensorsHistorySeriesWidgetId' Lens
sensorsHistorySeriesWidgetIdL :: Lens_' SensorsHistorySeries (Integer)
sensorsHistorySeriesWidgetIdL f SensorsHistorySeries{..} = (\sensorsHistorySeriesWidgetId -> SensorsHistorySeries { sensorsHistorySeriesWidgetId, ..} ) <$> f sensorsHistorySeriesWidgetId
{-# INLINE sensorsHistorySeriesWidgetIdL #-}



-- * Tag

-- | 'tagAddresses' Lens
tagAddressesL :: Lens_' Tag (Maybe [TaggedAddress])
tagAddressesL f Tag{..} = (\tagAddresses -> Tag { tagAddresses, ..} ) <$> f tagAddresses
{-# INLINE tagAddressesL #-}

-- | 'tagAssets' Lens
tagAssetsL :: Lens_' Tag (Maybe [TaggedAsset])
tagAssetsL f Tag{..} = (\tagAssets -> Tag { tagAssets, ..} ) <$> f tagAssets
{-# INLINE tagAssetsL #-}

-- | 'tagDrivers' Lens
tagDriversL :: Lens_' Tag (Maybe [TaggedDriver])
tagDriversL f Tag{..} = (\tagDrivers -> Tag { tagDrivers, ..} ) <$> f tagDrivers
{-# INLINE tagDriversL #-}

-- | 'tagGroupId' Lens
tagGroupIdL :: Lens_' Tag (Maybe Integer)
tagGroupIdL f Tag{..} = (\tagGroupId -> Tag { tagGroupId, ..} ) <$> f tagGroupId
{-# INLINE tagGroupIdL #-}

-- | 'tagId' Lens
tagIdL :: Lens_' Tag (Integer)
tagIdL f Tag{..} = (\tagId -> Tag { tagId, ..} ) <$> f tagId
{-# INLINE tagIdL #-}

-- | 'tagMachines' Lens
tagMachinesL :: Lens_' Tag (Maybe [TaggedMachine])
tagMachinesL f Tag{..} = (\tagMachines -> Tag { tagMachines, ..} ) <$> f tagMachines
{-# INLINE tagMachinesL #-}

-- | 'tagName' Lens
tagNameL :: Lens_' Tag (Text)
tagNameL f Tag{..} = (\tagName -> Tag { tagName, ..} ) <$> f tagName
{-# INLINE tagNameL #-}

-- | 'tagParentTagId' Lens
tagParentTagIdL :: Lens_' Tag (Maybe Integer)
tagParentTagIdL f Tag{..} = (\tagParentTagId -> Tag { tagParentTagId, ..} ) <$> f tagParentTagId
{-# INLINE tagParentTagIdL #-}

-- | 'tagSensors' Lens
tagSensorsL :: Lens_' Tag (Maybe [TaggedSensor])
tagSensorsL f Tag{..} = (\tagSensors -> Tag { tagSensors, ..} ) <$> f tagSensors
{-# INLINE tagSensorsL #-}

-- | 'tagVehicles' Lens
tagVehiclesL :: Lens_' Tag (Maybe [TaggedVehicle])
tagVehiclesL f Tag{..} = (\tagVehicles -> Tag { tagVehicles, ..} ) <$> f tagVehicles
{-# INLINE tagVehiclesL #-}



-- * TagCreate

-- | 'tagCreateAssets' Lens
tagCreateAssetsL :: Lens_' TagCreate (Maybe [TaggedAssetBase])
tagCreateAssetsL f TagCreate{..} = (\tagCreateAssets -> TagCreate { tagCreateAssets, ..} ) <$> f tagCreateAssets
{-# INLINE tagCreateAssetsL #-}

-- | 'tagCreateDrivers' Lens
tagCreateDriversL :: Lens_' TagCreate (Maybe [TaggedDriverBase])
tagCreateDriversL f TagCreate{..} = (\tagCreateDrivers -> TagCreate { tagCreateDrivers, ..} ) <$> f tagCreateDrivers
{-# INLINE tagCreateDriversL #-}

-- | 'tagCreateMachines' Lens
tagCreateMachinesL :: Lens_' TagCreate (Maybe [TaggedMachineBase])
tagCreateMachinesL f TagCreate{..} = (\tagCreateMachines -> TagCreate { tagCreateMachines, ..} ) <$> f tagCreateMachines
{-# INLINE tagCreateMachinesL #-}

-- | 'tagCreateName' Lens
tagCreateNameL :: Lens_' TagCreate (Text)
tagCreateNameL f TagCreate{..} = (\tagCreateName -> TagCreate { tagCreateName, ..} ) <$> f tagCreateName
{-# INLINE tagCreateNameL #-}

-- | 'tagCreateParentTagId' Lens
tagCreateParentTagIdL :: Lens_' TagCreate (Maybe Integer)
tagCreateParentTagIdL f TagCreate{..} = (\tagCreateParentTagId -> TagCreate { tagCreateParentTagId, ..} ) <$> f tagCreateParentTagId
{-# INLINE tagCreateParentTagIdL #-}

-- | 'tagCreateSensors' Lens
tagCreateSensorsL :: Lens_' TagCreate (Maybe [TaggedSensorBase])
tagCreateSensorsL f TagCreate{..} = (\tagCreateSensors -> TagCreate { tagCreateSensors, ..} ) <$> f tagCreateSensors
{-# INLINE tagCreateSensorsL #-}

-- | 'tagCreateVehicles' Lens
tagCreateVehiclesL :: Lens_' TagCreate (Maybe [TaggedVehicleBase])
tagCreateVehiclesL f TagCreate{..} = (\tagCreateVehicles -> TagCreate { tagCreateVehicles, ..} ) <$> f tagCreateVehicles
{-# INLINE tagCreateVehiclesL #-}



-- * TagMetadata

-- | 'tagMetadataId' Lens
tagMetadataIdL :: Lens_' TagMetadata (Integer)
tagMetadataIdL f TagMetadata{..} = (\tagMetadataId -> TagMetadata { tagMetadataId, ..} ) <$> f tagMetadataId
{-# INLINE tagMetadataIdL #-}

-- | 'tagMetadataName' Lens
tagMetadataNameL :: Lens_' TagMetadata (Text)
tagMetadataNameL f TagMetadata{..} = (\tagMetadataName -> TagMetadata { tagMetadataName, ..} ) <$> f tagMetadataName
{-# INLINE tagMetadataNameL #-}



-- * TagModify

-- | 'tagModifyAdd' Lens
tagModifyAddL :: Lens_' TagModify (Maybe TagModifyAdd)
tagModifyAddL f TagModify{..} = (\tagModifyAdd -> TagModify { tagModifyAdd, ..} ) <$> f tagModifyAdd
{-# INLINE tagModifyAddL #-}

-- | 'tagModifyDelete' Lens
tagModifyDeleteL :: Lens_' TagModify (Maybe TagModifyDelete)
tagModifyDeleteL f TagModify{..} = (\tagModifyDelete -> TagModify { tagModifyDelete, ..} ) <$> f tagModifyDelete
{-# INLINE tagModifyDeleteL #-}

-- | 'tagModifyName' Lens
tagModifyNameL :: Lens_' TagModify (Maybe Text)
tagModifyNameL f TagModify{..} = (\tagModifyName -> TagModify { tagModifyName, ..} ) <$> f tagModifyName
{-# INLINE tagModifyNameL #-}

-- | 'tagModifyParentTagId' Lens
tagModifyParentTagIdL :: Lens_' TagModify (Maybe Integer)
tagModifyParentTagIdL f TagModify{..} = (\tagModifyParentTagId -> TagModify { tagModifyParentTagId, ..} ) <$> f tagModifyParentTagId
{-# INLINE tagModifyParentTagIdL #-}



-- * TagModifyAdd

-- | 'tagModifyAddAssets' Lens
tagModifyAddAssetsL :: Lens_' TagModifyAdd (Maybe [TaggedAssetBase])
tagModifyAddAssetsL f TagModifyAdd{..} = (\tagModifyAddAssets -> TagModifyAdd { tagModifyAddAssets, ..} ) <$> f tagModifyAddAssets
{-# INLINE tagModifyAddAssetsL #-}

-- | 'tagModifyAddSensors' Lens
tagModifyAddSensorsL :: Lens_' TagModifyAdd (Maybe [TaggedSensorBase])
tagModifyAddSensorsL f TagModifyAdd{..} = (\tagModifyAddSensors -> TagModifyAdd { tagModifyAddSensors, ..} ) <$> f tagModifyAddSensors
{-# INLINE tagModifyAddSensorsL #-}

-- | 'tagModifyAddVehicles' Lens
tagModifyAddVehiclesL :: Lens_' TagModifyAdd (Maybe [TaggedVehicleBase])
tagModifyAddVehiclesL f TagModifyAdd{..} = (\tagModifyAddVehicles -> TagModifyAdd { tagModifyAddVehicles, ..} ) <$> f tagModifyAddVehicles
{-# INLINE tagModifyAddVehiclesL #-}

-- | 'tagModifyAddMachines' Lens
tagModifyAddMachinesL :: Lens_' TagModifyAdd (Maybe [TaggedMachineBase])
tagModifyAddMachinesL f TagModifyAdd{..} = (\tagModifyAddMachines -> TagModifyAdd { tagModifyAddMachines, ..} ) <$> f tagModifyAddMachines
{-# INLINE tagModifyAddMachinesL #-}

-- | 'tagModifyAddDrivers' Lens
tagModifyAddDriversL :: Lens_' TagModifyAdd (Maybe [TaggedDriverBase])
tagModifyAddDriversL f TagModifyAdd{..} = (\tagModifyAddDrivers -> TagModifyAdd { tagModifyAddDrivers, ..} ) <$> f tagModifyAddDrivers
{-# INLINE tagModifyAddDriversL #-}



-- * TagModifyDelete

-- | 'tagModifyDeleteAssets' Lens
tagModifyDeleteAssetsL :: Lens_' TagModifyDelete (Maybe [TaggedAssetBase])
tagModifyDeleteAssetsL f TagModifyDelete{..} = (\tagModifyDeleteAssets -> TagModifyDelete { tagModifyDeleteAssets, ..} ) <$> f tagModifyDeleteAssets
{-# INLINE tagModifyDeleteAssetsL #-}

-- | 'tagModifyDeleteSensors' Lens
tagModifyDeleteSensorsL :: Lens_' TagModifyDelete (Maybe [TaggedSensorBase])
tagModifyDeleteSensorsL f TagModifyDelete{..} = (\tagModifyDeleteSensors -> TagModifyDelete { tagModifyDeleteSensors, ..} ) <$> f tagModifyDeleteSensors
{-# INLINE tagModifyDeleteSensorsL #-}

-- | 'tagModifyDeleteVehicles' Lens
tagModifyDeleteVehiclesL :: Lens_' TagModifyDelete (Maybe [TaggedVehicleBase])
tagModifyDeleteVehiclesL f TagModifyDelete{..} = (\tagModifyDeleteVehicles -> TagModifyDelete { tagModifyDeleteVehicles, ..} ) <$> f tagModifyDeleteVehicles
{-# INLINE tagModifyDeleteVehiclesL #-}

-- | 'tagModifyDeleteMachines' Lens
tagModifyDeleteMachinesL :: Lens_' TagModifyDelete (Maybe [TaggedMachineBase])
tagModifyDeleteMachinesL f TagModifyDelete{..} = (\tagModifyDeleteMachines -> TagModifyDelete { tagModifyDeleteMachines, ..} ) <$> f tagModifyDeleteMachines
{-# INLINE tagModifyDeleteMachinesL #-}

-- | 'tagModifyDeleteDrivers' Lens
tagModifyDeleteDriversL :: Lens_' TagModifyDelete (Maybe [TaggedDriverBase])
tagModifyDeleteDriversL f TagModifyDelete{..} = (\tagModifyDeleteDrivers -> TagModifyDelete { tagModifyDeleteDrivers, ..} ) <$> f tagModifyDeleteDrivers
{-# INLINE tagModifyDeleteDriversL #-}



-- * TagUpdate

-- | 'tagUpdateAssets' Lens
tagUpdateAssetsL :: Lens_' TagUpdate (Maybe [TaggedAssetBase])
tagUpdateAssetsL f TagUpdate{..} = (\tagUpdateAssets -> TagUpdate { tagUpdateAssets, ..} ) <$> f tagUpdateAssets
{-# INLINE tagUpdateAssetsL #-}

-- | 'tagUpdateDrivers' Lens
tagUpdateDriversL :: Lens_' TagUpdate (Maybe [TaggedDriverBase])
tagUpdateDriversL f TagUpdate{..} = (\tagUpdateDrivers -> TagUpdate { tagUpdateDrivers, ..} ) <$> f tagUpdateDrivers
{-# INLINE tagUpdateDriversL #-}

-- | 'tagUpdateMachines' Lens
tagUpdateMachinesL :: Lens_' TagUpdate (Maybe [TaggedMachineBase])
tagUpdateMachinesL f TagUpdate{..} = (\tagUpdateMachines -> TagUpdate { tagUpdateMachines, ..} ) <$> f tagUpdateMachines
{-# INLINE tagUpdateMachinesL #-}

-- | 'tagUpdateName' Lens
tagUpdateNameL :: Lens_' TagUpdate (Maybe Text)
tagUpdateNameL f TagUpdate{..} = (\tagUpdateName -> TagUpdate { tagUpdateName, ..} ) <$> f tagUpdateName
{-# INLINE tagUpdateNameL #-}

-- | 'tagUpdateParentTagId' Lens
tagUpdateParentTagIdL :: Lens_' TagUpdate (Maybe Integer)
tagUpdateParentTagIdL f TagUpdate{..} = (\tagUpdateParentTagId -> TagUpdate { tagUpdateParentTagId, ..} ) <$> f tagUpdateParentTagId
{-# INLINE tagUpdateParentTagIdL #-}

-- | 'tagUpdateSensors' Lens
tagUpdateSensorsL :: Lens_' TagUpdate (Maybe [TaggedSensorBase])
tagUpdateSensorsL f TagUpdate{..} = (\tagUpdateSensors -> TagUpdate { tagUpdateSensors, ..} ) <$> f tagUpdateSensors
{-# INLINE tagUpdateSensorsL #-}

-- | 'tagUpdateVehicles' Lens
tagUpdateVehiclesL :: Lens_' TagUpdate (Maybe [TaggedVehicleBase])
tagUpdateVehiclesL f TagUpdate{..} = (\tagUpdateVehicles -> TagUpdate { tagUpdateVehicles, ..} ) <$> f tagUpdateVehicles
{-# INLINE tagUpdateVehiclesL #-}



-- * TaggedAddress

-- | 'taggedAddressId' Lens
taggedAddressIdL :: Lens_' TaggedAddress (Integer)
taggedAddressIdL f TaggedAddress{..} = (\taggedAddressId -> TaggedAddress { taggedAddressId, ..} ) <$> f taggedAddressId
{-# INLINE taggedAddressIdL #-}

-- | 'taggedAddressName' Lens
taggedAddressNameL :: Lens_' TaggedAddress (Maybe Text)
taggedAddressNameL f TaggedAddress{..} = (\taggedAddressName -> TaggedAddress { taggedAddressName, ..} ) <$> f taggedAddressName
{-# INLINE taggedAddressNameL #-}



-- * TaggedAddressBase

-- | 'taggedAddressBaseId' Lens
taggedAddressBaseIdL :: Lens_' TaggedAddressBase (Integer)
taggedAddressBaseIdL f TaggedAddressBase{..} = (\taggedAddressBaseId -> TaggedAddressBase { taggedAddressBaseId, ..} ) <$> f taggedAddressBaseId
{-# INLINE taggedAddressBaseIdL #-}



-- * TaggedAsset

-- | 'taggedAssetId' Lens
taggedAssetIdL :: Lens_' TaggedAsset (Integer)
taggedAssetIdL f TaggedAsset{..} = (\taggedAssetId -> TaggedAsset { taggedAssetId, ..} ) <$> f taggedAssetId
{-# INLINE taggedAssetIdL #-}

-- | 'taggedAssetName' Lens
taggedAssetNameL :: Lens_' TaggedAsset (Maybe Text)
taggedAssetNameL f TaggedAsset{..} = (\taggedAssetName -> TaggedAsset { taggedAssetName, ..} ) <$> f taggedAssetName
{-# INLINE taggedAssetNameL #-}



-- * TaggedAssetBase

-- | 'taggedAssetBaseId' Lens
taggedAssetBaseIdL :: Lens_' TaggedAssetBase (Integer)
taggedAssetBaseIdL f TaggedAssetBase{..} = (\taggedAssetBaseId -> TaggedAssetBase { taggedAssetBaseId, ..} ) <$> f taggedAssetBaseId
{-# INLINE taggedAssetBaseIdL #-}



-- * TaggedDriver

-- | 'taggedDriverId' Lens
taggedDriverIdL :: Lens_' TaggedDriver (Integer)
taggedDriverIdL f TaggedDriver{..} = (\taggedDriverId -> TaggedDriver { taggedDriverId, ..} ) <$> f taggedDriverId
{-# INLINE taggedDriverIdL #-}

-- | 'taggedDriverName' Lens
taggedDriverNameL :: Lens_' TaggedDriver (Maybe Text)
taggedDriverNameL f TaggedDriver{..} = (\taggedDriverName -> TaggedDriver { taggedDriverName, ..} ) <$> f taggedDriverName
{-# INLINE taggedDriverNameL #-}



-- * TaggedDriverBase

-- | 'taggedDriverBaseId' Lens
taggedDriverBaseIdL :: Lens_' TaggedDriverBase (Integer)
taggedDriverBaseIdL f TaggedDriverBase{..} = (\taggedDriverBaseId -> TaggedDriverBase { taggedDriverBaseId, ..} ) <$> f taggedDriverBaseId
{-# INLINE taggedDriverBaseIdL #-}



-- * TaggedMachine

-- | 'taggedMachineId' Lens
taggedMachineIdL :: Lens_' TaggedMachine (Integer)
taggedMachineIdL f TaggedMachine{..} = (\taggedMachineId -> TaggedMachine { taggedMachineId, ..} ) <$> f taggedMachineId
{-# INLINE taggedMachineIdL #-}

-- | 'taggedMachineName' Lens
taggedMachineNameL :: Lens_' TaggedMachine (Maybe Text)
taggedMachineNameL f TaggedMachine{..} = (\taggedMachineName -> TaggedMachine { taggedMachineName, ..} ) <$> f taggedMachineName
{-# INLINE taggedMachineNameL #-}



-- * TaggedMachineBase

-- | 'taggedMachineBaseId' Lens
taggedMachineBaseIdL :: Lens_' TaggedMachineBase (Integer)
taggedMachineBaseIdL f TaggedMachineBase{..} = (\taggedMachineBaseId -> TaggedMachineBase { taggedMachineBaseId, ..} ) <$> f taggedMachineBaseId
{-# INLINE taggedMachineBaseIdL #-}



-- * TaggedSensor

-- | 'taggedSensorId' Lens
taggedSensorIdL :: Lens_' TaggedSensor (Integer)
taggedSensorIdL f TaggedSensor{..} = (\taggedSensorId -> TaggedSensor { taggedSensorId, ..} ) <$> f taggedSensorId
{-# INLINE taggedSensorIdL #-}

-- | 'taggedSensorName' Lens
taggedSensorNameL :: Lens_' TaggedSensor (Maybe Text)
taggedSensorNameL f TaggedSensor{..} = (\taggedSensorName -> TaggedSensor { taggedSensorName, ..} ) <$> f taggedSensorName
{-# INLINE taggedSensorNameL #-}



-- * TaggedSensorBase

-- | 'taggedSensorBaseId' Lens
taggedSensorBaseIdL :: Lens_' TaggedSensorBase (Integer)
taggedSensorBaseIdL f TaggedSensorBase{..} = (\taggedSensorBaseId -> TaggedSensorBase { taggedSensorBaseId, ..} ) <$> f taggedSensorBaseId
{-# INLINE taggedSensorBaseIdL #-}



-- * TaggedVehicle

-- | 'taggedVehicleId' Lens
taggedVehicleIdL :: Lens_' TaggedVehicle (Integer)
taggedVehicleIdL f TaggedVehicle{..} = (\taggedVehicleId -> TaggedVehicle { taggedVehicleId, ..} ) <$> f taggedVehicleId
{-# INLINE taggedVehicleIdL #-}

-- | 'taggedVehicleName' Lens
taggedVehicleNameL :: Lens_' TaggedVehicle (Maybe Text)
taggedVehicleNameL f TaggedVehicle{..} = (\taggedVehicleName -> TaggedVehicle { taggedVehicleName, ..} ) <$> f taggedVehicleName
{-# INLINE taggedVehicleNameL #-}



-- * TaggedVehicleBase

-- | 'taggedVehicleBaseId' Lens
taggedVehicleBaseIdL :: Lens_' TaggedVehicleBase (Integer)
taggedVehicleBaseIdL f TaggedVehicleBase{..} = (\taggedVehicleBaseId -> TaggedVehicleBase { taggedVehicleBaseId, ..} ) <$> f taggedVehicleBaseId
{-# INLINE taggedVehicleBaseIdL #-}



-- * TemperatureResponse

-- | 'temperatureResponseGroupId' Lens
temperatureResponseGroupIdL :: Lens_' TemperatureResponse (Maybe Integer)
temperatureResponseGroupIdL f TemperatureResponse{..} = (\temperatureResponseGroupId -> TemperatureResponse { temperatureResponseGroupId, ..} ) <$> f temperatureResponseGroupId
{-# INLINE temperatureResponseGroupIdL #-}

-- | 'temperatureResponseSensors' Lens
temperatureResponseSensorsL :: Lens_' TemperatureResponse (Maybe [TemperatureResponseSensors])
temperatureResponseSensorsL f TemperatureResponse{..} = (\temperatureResponseSensors -> TemperatureResponse { temperatureResponseSensors, ..} ) <$> f temperatureResponseSensors
{-# INLINE temperatureResponseSensorsL #-}



-- * TemperatureResponseSensors

-- | 'temperatureResponseSensorsProbeTemperature' Lens
temperatureResponseSensorsProbeTemperatureL :: Lens_' TemperatureResponseSensors (Maybe Int)
temperatureResponseSensorsProbeTemperatureL f TemperatureResponseSensors{..} = (\temperatureResponseSensorsProbeTemperature -> TemperatureResponseSensors { temperatureResponseSensorsProbeTemperature, ..} ) <$> f temperatureResponseSensorsProbeTemperature
{-# INLINE temperatureResponseSensorsProbeTemperatureL #-}

-- | 'temperatureResponseSensorsName' Lens
temperatureResponseSensorsNameL :: Lens_' TemperatureResponseSensors (Maybe Text)
temperatureResponseSensorsNameL f TemperatureResponseSensors{..} = (\temperatureResponseSensorsName -> TemperatureResponseSensors { temperatureResponseSensorsName, ..} ) <$> f temperatureResponseSensorsName
{-# INLINE temperatureResponseSensorsNameL #-}

-- | 'temperatureResponseSensorsId' Lens
temperatureResponseSensorsIdL :: Lens_' TemperatureResponseSensors (Maybe Integer)
temperatureResponseSensorsIdL f TemperatureResponseSensors{..} = (\temperatureResponseSensorsId -> TemperatureResponseSensors { temperatureResponseSensorsId, ..} ) <$> f temperatureResponseSensorsId
{-# INLINE temperatureResponseSensorsIdL #-}

-- | 'temperatureResponseSensorsAmbientTemperature' Lens
temperatureResponseSensorsAmbientTemperatureL :: Lens_' TemperatureResponseSensors (Maybe Int)
temperatureResponseSensorsAmbientTemperatureL f TemperatureResponseSensors{..} = (\temperatureResponseSensorsAmbientTemperature -> TemperatureResponseSensors { temperatureResponseSensorsAmbientTemperature, ..} ) <$> f temperatureResponseSensorsAmbientTemperature
{-# INLINE temperatureResponseSensorsAmbientTemperatureL #-}



-- * TripResponse

-- | 'tripResponseTrips' Lens
tripResponseTripsL :: Lens_' TripResponse (Maybe [TripResponseTrips])
tripResponseTripsL f TripResponse{..} = (\tripResponseTrips -> TripResponse { tripResponseTrips, ..} ) <$> f tripResponseTrips
{-# INLINE tripResponseTripsL #-}



-- * TripResponseEndCoordinates

-- | 'tripResponseEndCoordinatesLatitude' Lens
tripResponseEndCoordinatesLatitudeL :: Lens_' TripResponseEndCoordinates (Maybe Double)
tripResponseEndCoordinatesLatitudeL f TripResponseEndCoordinates{..} = (\tripResponseEndCoordinatesLatitude -> TripResponseEndCoordinates { tripResponseEndCoordinatesLatitude, ..} ) <$> f tripResponseEndCoordinatesLatitude
{-# INLINE tripResponseEndCoordinatesLatitudeL #-}

-- | 'tripResponseEndCoordinatesLongitude' Lens
tripResponseEndCoordinatesLongitudeL :: Lens_' TripResponseEndCoordinates (Maybe Double)
tripResponseEndCoordinatesLongitudeL f TripResponseEndCoordinates{..} = (\tripResponseEndCoordinatesLongitude -> TripResponseEndCoordinates { tripResponseEndCoordinatesLongitude, ..} ) <$> f tripResponseEndCoordinatesLongitude
{-# INLINE tripResponseEndCoordinatesLongitudeL #-}



-- * TripResponseStartCoordinates

-- | 'tripResponseStartCoordinatesLatitude' Lens
tripResponseStartCoordinatesLatitudeL :: Lens_' TripResponseStartCoordinates (Maybe Double)
tripResponseStartCoordinatesLatitudeL f TripResponseStartCoordinates{..} = (\tripResponseStartCoordinatesLatitude -> TripResponseStartCoordinates { tripResponseStartCoordinatesLatitude, ..} ) <$> f tripResponseStartCoordinatesLatitude
{-# INLINE tripResponseStartCoordinatesLatitudeL #-}

-- | 'tripResponseStartCoordinatesLongitude' Lens
tripResponseStartCoordinatesLongitudeL :: Lens_' TripResponseStartCoordinates (Maybe Double)
tripResponseStartCoordinatesLongitudeL f TripResponseStartCoordinates{..} = (\tripResponseStartCoordinatesLongitude -> TripResponseStartCoordinates { tripResponseStartCoordinatesLongitude, ..} ) <$> f tripResponseStartCoordinatesLongitude
{-# INLINE tripResponseStartCoordinatesLongitudeL #-}



-- * TripResponseTrips

-- | 'tripResponseTripsEndOdometer' Lens
tripResponseTripsEndOdometerL :: Lens_' TripResponseTrips (Maybe Int)
tripResponseTripsEndOdometerL f TripResponseTrips{..} = (\tripResponseTripsEndOdometer -> TripResponseTrips { tripResponseTripsEndOdometer, ..} ) <$> f tripResponseTripsEndOdometer
{-# INLINE tripResponseTripsEndOdometerL #-}

-- | 'tripResponseTripsDistanceMeters' Lens
tripResponseTripsDistanceMetersL :: Lens_' TripResponseTrips (Maybe Int)
tripResponseTripsDistanceMetersL f TripResponseTrips{..} = (\tripResponseTripsDistanceMeters -> TripResponseTrips { tripResponseTripsDistanceMeters, ..} ) <$> f tripResponseTripsDistanceMeters
{-# INLINE tripResponseTripsDistanceMetersL #-}

-- | 'tripResponseTripsEndMs' Lens
tripResponseTripsEndMsL :: Lens_' TripResponseTrips (Maybe Int)
tripResponseTripsEndMsL f TripResponseTrips{..} = (\tripResponseTripsEndMs -> TripResponseTrips { tripResponseTripsEndMs, ..} ) <$> f tripResponseTripsEndMs
{-# INLINE tripResponseTripsEndMsL #-}

-- | 'tripResponseTripsStartMs' Lens
tripResponseTripsStartMsL :: Lens_' TripResponseTrips (Maybe Int)
tripResponseTripsStartMsL f TripResponseTrips{..} = (\tripResponseTripsStartMs -> TripResponseTrips { tripResponseTripsStartMs, ..} ) <$> f tripResponseTripsStartMs
{-# INLINE tripResponseTripsStartMsL #-}

-- | 'tripResponseTripsFuelConsumedMl' Lens
tripResponseTripsFuelConsumedMlL :: Lens_' TripResponseTrips (Maybe Int)
tripResponseTripsFuelConsumedMlL f TripResponseTrips{..} = (\tripResponseTripsFuelConsumedMl -> TripResponseTrips { tripResponseTripsFuelConsumedMl, ..} ) <$> f tripResponseTripsFuelConsumedMl
{-# INLINE tripResponseTripsFuelConsumedMlL #-}

-- | 'tripResponseTripsStartAddress' Lens
tripResponseTripsStartAddressL :: Lens_' TripResponseTrips (Maybe Text)
tripResponseTripsStartAddressL f TripResponseTrips{..} = (\tripResponseTripsStartAddress -> TripResponseTrips { tripResponseTripsStartAddress, ..} ) <$> f tripResponseTripsStartAddress
{-# INLINE tripResponseTripsStartAddressL #-}

-- | 'tripResponseTripsStartCoordinates' Lens
tripResponseTripsStartCoordinatesL :: Lens_' TripResponseTrips (Maybe TripResponseStartCoordinates)
tripResponseTripsStartCoordinatesL f TripResponseTrips{..} = (\tripResponseTripsStartCoordinates -> TripResponseTrips { tripResponseTripsStartCoordinates, ..} ) <$> f tripResponseTripsStartCoordinates
{-# INLINE tripResponseTripsStartCoordinatesL #-}

-- | 'tripResponseTripsEndCoordinates' Lens
tripResponseTripsEndCoordinatesL :: Lens_' TripResponseTrips (Maybe TripResponseEndCoordinates)
tripResponseTripsEndCoordinatesL f TripResponseTrips{..} = (\tripResponseTripsEndCoordinates -> TripResponseTrips { tripResponseTripsEndCoordinates, ..} ) <$> f tripResponseTripsEndCoordinates
{-# INLINE tripResponseTripsEndCoordinatesL #-}

-- | 'tripResponseTripsStartOdometer' Lens
tripResponseTripsStartOdometerL :: Lens_' TripResponseTrips (Maybe Int)
tripResponseTripsStartOdometerL f TripResponseTrips{..} = (\tripResponseTripsStartOdometer -> TripResponseTrips { tripResponseTripsStartOdometer, ..} ) <$> f tripResponseTripsStartOdometer
{-# INLINE tripResponseTripsStartOdometerL #-}

-- | 'tripResponseTripsDriverId' Lens
tripResponseTripsDriverIdL :: Lens_' TripResponseTrips (Maybe Int)
tripResponseTripsDriverIdL f TripResponseTrips{..} = (\tripResponseTripsDriverId -> TripResponseTrips { tripResponseTripsDriverId, ..} ) <$> f tripResponseTripsDriverId
{-# INLINE tripResponseTripsDriverIdL #-}

-- | 'tripResponseTripsStartLocation' Lens
tripResponseTripsStartLocationL :: Lens_' TripResponseTrips (Maybe Text)
tripResponseTripsStartLocationL f TripResponseTrips{..} = (\tripResponseTripsStartLocation -> TripResponseTrips { tripResponseTripsStartLocation, ..} ) <$> f tripResponseTripsStartLocation
{-# INLINE tripResponseTripsStartLocationL #-}

-- | 'tripResponseTripsTollMeters' Lens
tripResponseTripsTollMetersL :: Lens_' TripResponseTrips (Maybe Int)
tripResponseTripsTollMetersL f TripResponseTrips{..} = (\tripResponseTripsTollMeters -> TripResponseTrips { tripResponseTripsTollMeters, ..} ) <$> f tripResponseTripsTollMeters
{-# INLINE tripResponseTripsTollMetersL #-}

-- | 'tripResponseTripsEndAddress' Lens
tripResponseTripsEndAddressL :: Lens_' TripResponseTrips (Maybe Text)
tripResponseTripsEndAddressL f TripResponseTrips{..} = (\tripResponseTripsEndAddress -> TripResponseTrips { tripResponseTripsEndAddress, ..} ) <$> f tripResponseTripsEndAddress
{-# INLINE tripResponseTripsEndAddressL #-}

-- | 'tripResponseTripsEndLocation' Lens
tripResponseTripsEndLocationL :: Lens_' TripResponseTrips (Maybe Text)
tripResponseTripsEndLocationL f TripResponseTrips{..} = (\tripResponseTripsEndLocation -> TripResponseTrips { tripResponseTripsEndLocation, ..} ) <$> f tripResponseTripsEndLocation
{-# INLINE tripResponseTripsEndLocationL #-}



-- * User

-- | 'userAuthType' Lens
userAuthTypeL :: Lens_' User (E'AuthType)
userAuthTypeL f User{..} = (\userAuthType -> User { userAuthType, ..} ) <$> f userAuthType
{-# INLINE userAuthTypeL #-}

-- | 'userEmail' Lens
userEmailL :: Lens_' User (Text)
userEmailL f User{..} = (\userEmail -> User { userEmail, ..} ) <$> f userEmail
{-# INLINE userEmailL #-}

-- | 'userName' Lens
userNameL :: Lens_' User (Maybe Text)
userNameL f User{..} = (\userName -> User { userName, ..} ) <$> f userName
{-# INLINE userNameL #-}

-- | 'userOrganizationRoleId' Lens
userOrganizationRoleIdL :: Lens_' User (Maybe Text)
userOrganizationRoleIdL f User{..} = (\userOrganizationRoleId -> User { userOrganizationRoleId, ..} ) <$> f userOrganizationRoleId
{-# INLINE userOrganizationRoleIdL #-}

-- | 'userId' Lens
userIdL :: Lens_' User (Maybe Integer)
userIdL f User{..} = (\userId -> User { userId, ..} ) <$> f userId
{-# INLINE userIdL #-}

-- | 'userOrganizationRole' Lens
userOrganizationRoleL :: Lens_' User (Maybe Text)
userOrganizationRoleL f User{..} = (\userOrganizationRole -> User { userOrganizationRole, ..} ) <$> f userOrganizationRole
{-# INLINE userOrganizationRoleL #-}

-- | 'userTagRoles' Lens
userTagRolesL :: Lens_' User (Maybe [UserTagRole])
userTagRolesL f User{..} = (\userTagRoles -> User { userTagRoles, ..} ) <$> f userTagRoles
{-# INLINE userTagRolesL #-}



-- * UserBase

-- | 'userBaseAuthType' Lens
userBaseAuthTypeL :: Lens_' UserBase (E'AuthType)
userBaseAuthTypeL f UserBase{..} = (\userBaseAuthType -> UserBase { userBaseAuthType, ..} ) <$> f userBaseAuthType
{-# INLINE userBaseAuthTypeL #-}

-- | 'userBaseEmail' Lens
userBaseEmailL :: Lens_' UserBase (Text)
userBaseEmailL f UserBase{..} = (\userBaseEmail -> UserBase { userBaseEmail, ..} ) <$> f userBaseEmail
{-# INLINE userBaseEmailL #-}

-- | 'userBaseName' Lens
userBaseNameL :: Lens_' UserBase (Maybe Text)
userBaseNameL f UserBase{..} = (\userBaseName -> UserBase { userBaseName, ..} ) <$> f userBaseName
{-# INLINE userBaseNameL #-}

-- | 'userBaseOrganizationRoleId' Lens
userBaseOrganizationRoleIdL :: Lens_' UserBase (Maybe Text)
userBaseOrganizationRoleIdL f UserBase{..} = (\userBaseOrganizationRoleId -> UserBase { userBaseOrganizationRoleId, ..} ) <$> f userBaseOrganizationRoleId
{-# INLINE userBaseOrganizationRoleIdL #-}



-- * UserRole

-- | 'userRoleId' Lens
userRoleIdL :: Lens_' UserRole (Maybe Text)
userRoleIdL f UserRole{..} = (\userRoleId -> UserRole { userRoleId, ..} ) <$> f userRoleId
{-# INLINE userRoleIdL #-}

-- | 'userRoleName' Lens
userRoleNameL :: Lens_' UserRole (Maybe Text)
userRoleNameL f UserRole{..} = (\userRoleName -> UserRole { userRoleName, ..} ) <$> f userRoleName
{-# INLINE userRoleNameL #-}



-- * UserTagRole

-- | 'userTagRoleRole' Lens
userTagRoleRoleL :: Lens_' UserTagRole (Maybe Text)
userTagRoleRoleL f UserTagRole{..} = (\userTagRoleRole -> UserTagRole { userTagRoleRole, ..} ) <$> f userTagRoleRole
{-# INLINE userTagRoleRoleL #-}

-- | 'userTagRoleRoleId' Lens
userTagRoleRoleIdL :: Lens_' UserTagRole (Text)
userTagRoleRoleIdL f UserTagRole{..} = (\userTagRoleRoleId -> UserTagRole { userTagRoleRoleId, ..} ) <$> f userTagRoleRoleId
{-# INLINE userTagRoleRoleIdL #-}

-- | 'userTagRoleTag' Lens
userTagRoleTagL :: Lens_' UserTagRole (UserTagRoleTag)
userTagRoleTagL f UserTagRole{..} = (\userTagRoleTag -> UserTagRole { userTagRoleTag, ..} ) <$> f userTagRoleTag
{-# INLINE userTagRoleTagL #-}



-- * UserTagRoleTag

-- | 'userTagRoleTagParentTagId' Lens
userTagRoleTagParentTagIdL :: Lens_' UserTagRoleTag (Maybe Integer)
userTagRoleTagParentTagIdL f UserTagRoleTag{..} = (\userTagRoleTagParentTagId -> UserTagRoleTag { userTagRoleTagParentTagId, ..} ) <$> f userTagRoleTagParentTagId
{-# INLINE userTagRoleTagParentTagIdL #-}

-- | 'userTagRoleTagName' Lens
userTagRoleTagNameL :: Lens_' UserTagRoleTag (Text)
userTagRoleTagNameL f UserTagRoleTag{..} = (\userTagRoleTagName -> UserTagRoleTag { userTagRoleTagName, ..} ) <$> f userTagRoleTagName
{-# INLINE userTagRoleTagNameL #-}

-- | 'userTagRoleTagId' Lens
userTagRoleTagIdL :: Lens_' UserTagRoleTag (Integer)
userTagRoleTagIdL f UserTagRoleTag{..} = (\userTagRoleTagId -> UserTagRoleTag { userTagRoleTagId, ..} ) <$> f userTagRoleTagId
{-# INLINE userTagRoleTagIdL #-}



-- * Vehicle

-- | 'vehicleEngineHours' Lens
vehicleEngineHoursL :: Lens_' Vehicle (Maybe Integer)
vehicleEngineHoursL f Vehicle{..} = (\vehicleEngineHours -> Vehicle { vehicleEngineHours, ..} ) <$> f vehicleEngineHours
{-# INLINE vehicleEngineHoursL #-}

-- | 'vehicleFuelLevelPercent' Lens
vehicleFuelLevelPercentL :: Lens_' Vehicle (Maybe Double)
vehicleFuelLevelPercentL f Vehicle{..} = (\vehicleFuelLevelPercent -> Vehicle { vehicleFuelLevelPercent, ..} ) <$> f vehicleFuelLevelPercent
{-# INLINE vehicleFuelLevelPercentL #-}

-- | 'vehicleId' Lens
vehicleIdL :: Lens_' Vehicle (Integer)
vehicleIdL f Vehicle{..} = (\vehicleId -> Vehicle { vehicleId, ..} ) <$> f vehicleId
{-# INLINE vehicleIdL #-}

-- | 'vehicleName' Lens
vehicleNameL :: Lens_' Vehicle (Maybe Text)
vehicleNameL f Vehicle{..} = (\vehicleName -> Vehicle { vehicleName, ..} ) <$> f vehicleName
{-# INLINE vehicleNameL #-}

-- | 'vehicleNote' Lens
vehicleNoteL :: Lens_' Vehicle (Maybe Text)
vehicleNoteL f Vehicle{..} = (\vehicleNote -> Vehicle { vehicleNote, ..} ) <$> f vehicleNote
{-# INLINE vehicleNoteL #-}

-- | 'vehicleOdometerMeters' Lens
vehicleOdometerMetersL :: Lens_' Vehicle (Maybe Integer)
vehicleOdometerMetersL f Vehicle{..} = (\vehicleOdometerMeters -> Vehicle { vehicleOdometerMeters, ..} ) <$> f vehicleOdometerMeters
{-# INLINE vehicleOdometerMetersL #-}

-- | 'vehicleVin' Lens
vehicleVinL :: Lens_' Vehicle (Maybe Text)
vehicleVinL f Vehicle{..} = (\vehicleVin -> Vehicle { vehicleVin, ..} ) <$> f vehicleVin
{-# INLINE vehicleVinL #-}



-- * VehicleHarshEventResponse

-- | 'vehicleHarshEventResponseDownloadForwardVideoUrl' Lens
vehicleHarshEventResponseDownloadForwardVideoUrlL :: Lens_' VehicleHarshEventResponse (Maybe Text)
vehicleHarshEventResponseDownloadForwardVideoUrlL f VehicleHarshEventResponse{..} = (\vehicleHarshEventResponseDownloadForwardVideoUrl -> VehicleHarshEventResponse { vehicleHarshEventResponseDownloadForwardVideoUrl, ..} ) <$> f vehicleHarshEventResponseDownloadForwardVideoUrl
{-# INLINE vehicleHarshEventResponseDownloadForwardVideoUrlL #-}

-- | 'vehicleHarshEventResponseDownloadInwardVideoUrl' Lens
vehicleHarshEventResponseDownloadInwardVideoUrlL :: Lens_' VehicleHarshEventResponse (Maybe Text)
vehicleHarshEventResponseDownloadInwardVideoUrlL f VehicleHarshEventResponse{..} = (\vehicleHarshEventResponseDownloadInwardVideoUrl -> VehicleHarshEventResponse { vehicleHarshEventResponseDownloadInwardVideoUrl, ..} ) <$> f vehicleHarshEventResponseDownloadInwardVideoUrl
{-# INLINE vehicleHarshEventResponseDownloadInwardVideoUrlL #-}

-- | 'vehicleHarshEventResponseDownloadTrackedInwardVideoUrl' Lens
vehicleHarshEventResponseDownloadTrackedInwardVideoUrlL :: Lens_' VehicleHarshEventResponse (Maybe Text)
vehicleHarshEventResponseDownloadTrackedInwardVideoUrlL f VehicleHarshEventResponse{..} = (\vehicleHarshEventResponseDownloadTrackedInwardVideoUrl -> VehicleHarshEventResponse { vehicleHarshEventResponseDownloadTrackedInwardVideoUrl, ..} ) <$> f vehicleHarshEventResponseDownloadTrackedInwardVideoUrl
{-# INLINE vehicleHarshEventResponseDownloadTrackedInwardVideoUrlL #-}

-- | 'vehicleHarshEventResponseHarshEventType' Lens
vehicleHarshEventResponseHarshEventTypeL :: Lens_' VehicleHarshEventResponse (Text)
vehicleHarshEventResponseHarshEventTypeL f VehicleHarshEventResponse{..} = (\vehicleHarshEventResponseHarshEventType -> VehicleHarshEventResponse { vehicleHarshEventResponseHarshEventType, ..} ) <$> f vehicleHarshEventResponseHarshEventType
{-# INLINE vehicleHarshEventResponseHarshEventTypeL #-}

-- | 'vehicleHarshEventResponseIncidentReportUrl' Lens
vehicleHarshEventResponseIncidentReportUrlL :: Lens_' VehicleHarshEventResponse (Text)
vehicleHarshEventResponseIncidentReportUrlL f VehicleHarshEventResponse{..} = (\vehicleHarshEventResponseIncidentReportUrl -> VehicleHarshEventResponse { vehicleHarshEventResponseIncidentReportUrl, ..} ) <$> f vehicleHarshEventResponseIncidentReportUrl
{-# INLINE vehicleHarshEventResponseIncidentReportUrlL #-}

-- | 'vehicleHarshEventResponseIsDistracted' Lens
vehicleHarshEventResponseIsDistractedL :: Lens_' VehicleHarshEventResponse (Maybe Bool)
vehicleHarshEventResponseIsDistractedL f VehicleHarshEventResponse{..} = (\vehicleHarshEventResponseIsDistracted -> VehicleHarshEventResponse { vehicleHarshEventResponseIsDistracted, ..} ) <$> f vehicleHarshEventResponseIsDistracted
{-# INLINE vehicleHarshEventResponseIsDistractedL #-}

-- | 'vehicleHarshEventResponseLocation' Lens
vehicleHarshEventResponseLocationL :: Lens_' VehicleHarshEventResponse (Maybe VehicleHarshEventResponseLocation)
vehicleHarshEventResponseLocationL f VehicleHarshEventResponse{..} = (\vehicleHarshEventResponseLocation -> VehicleHarshEventResponse { vehicleHarshEventResponseLocation, ..} ) <$> f vehicleHarshEventResponseLocation
{-# INLINE vehicleHarshEventResponseLocationL #-}



-- * VehicleHarshEventResponseLocation

-- | 'vehicleHarshEventResponseLocationAddress' Lens
vehicleHarshEventResponseLocationAddressL :: Lens_' VehicleHarshEventResponseLocation (Maybe Text)
vehicleHarshEventResponseLocationAddressL f VehicleHarshEventResponseLocation{..} = (\vehicleHarshEventResponseLocationAddress -> VehicleHarshEventResponseLocation { vehicleHarshEventResponseLocationAddress, ..} ) <$> f vehicleHarshEventResponseLocationAddress
{-# INLINE vehicleHarshEventResponseLocationAddressL #-}

-- | 'vehicleHarshEventResponseLocationLatitude' Lens
vehicleHarshEventResponseLocationLatitudeL :: Lens_' VehicleHarshEventResponseLocation (Maybe Text)
vehicleHarshEventResponseLocationLatitudeL f VehicleHarshEventResponseLocation{..} = (\vehicleHarshEventResponseLocationLatitude -> VehicleHarshEventResponseLocation { vehicleHarshEventResponseLocationLatitude, ..} ) <$> f vehicleHarshEventResponseLocationLatitude
{-# INLINE vehicleHarshEventResponseLocationLatitudeL #-}

-- | 'vehicleHarshEventResponseLocationLongitude' Lens
vehicleHarshEventResponseLocationLongitudeL :: Lens_' VehicleHarshEventResponseLocation (Maybe Text)
vehicleHarshEventResponseLocationLongitudeL f VehicleHarshEventResponseLocation{..} = (\vehicleHarshEventResponseLocationLongitude -> VehicleHarshEventResponseLocation { vehicleHarshEventResponseLocationLongitude, ..} ) <$> f vehicleHarshEventResponseLocationLongitude
{-# INLINE vehicleHarshEventResponseLocationLongitudeL #-}



-- * VehicleLocation

-- | 'vehicleLocationHeading' Lens
vehicleLocationHeadingL :: Lens_' VehicleLocation (Maybe Double)
vehicleLocationHeadingL f VehicleLocation{..} = (\vehicleLocationHeading -> VehicleLocation { vehicleLocationHeading, ..} ) <$> f vehicleLocationHeading
{-# INLINE vehicleLocationHeadingL #-}

-- | 'vehicleLocationId' Lens
vehicleLocationIdL :: Lens_' VehicleLocation (Integer)
vehicleLocationIdL f VehicleLocation{..} = (\vehicleLocationId -> VehicleLocation { vehicleLocationId, ..} ) <$> f vehicleLocationId
{-# INLINE vehicleLocationIdL #-}

-- | 'vehicleLocationLatitude' Lens
vehicleLocationLatitudeL :: Lens_' VehicleLocation (Maybe Double)
vehicleLocationLatitudeL f VehicleLocation{..} = (\vehicleLocationLatitude -> VehicleLocation { vehicleLocationLatitude, ..} ) <$> f vehicleLocationLatitude
{-# INLINE vehicleLocationLatitudeL #-}

-- | 'vehicleLocationLocation' Lens
vehicleLocationLocationL :: Lens_' VehicleLocation (Maybe Text)
vehicleLocationLocationL f VehicleLocation{..} = (\vehicleLocationLocation -> VehicleLocation { vehicleLocationLocation, ..} ) <$> f vehicleLocationLocation
{-# INLINE vehicleLocationLocationL #-}

-- | 'vehicleLocationLongitude' Lens
vehicleLocationLongitudeL :: Lens_' VehicleLocation (Maybe Double)
vehicleLocationLongitudeL f VehicleLocation{..} = (\vehicleLocationLongitude -> VehicleLocation { vehicleLocationLongitude, ..} ) <$> f vehicleLocationLongitude
{-# INLINE vehicleLocationLongitudeL #-}

-- | 'vehicleLocationName' Lens
vehicleLocationNameL :: Lens_' VehicleLocation (Maybe Text)
vehicleLocationNameL f VehicleLocation{..} = (\vehicleLocationName -> VehicleLocation { vehicleLocationName, ..} ) <$> f vehicleLocationName
{-# INLINE vehicleLocationNameL #-}

-- | 'vehicleLocationOdometerMeters' Lens
vehicleLocationOdometerMetersL :: Lens_' VehicleLocation (Maybe Integer)
vehicleLocationOdometerMetersL f VehicleLocation{..} = (\vehicleLocationOdometerMeters -> VehicleLocation { vehicleLocationOdometerMeters, ..} ) <$> f vehicleLocationOdometerMeters
{-# INLINE vehicleLocationOdometerMetersL #-}

-- | 'vehicleLocationOnTrip' Lens
vehicleLocationOnTripL :: Lens_' VehicleLocation (Maybe Bool)
vehicleLocationOnTripL f VehicleLocation{..} = (\vehicleLocationOnTrip -> VehicleLocation { vehicleLocationOnTrip, ..} ) <$> f vehicleLocationOnTrip
{-# INLINE vehicleLocationOnTripL #-}

-- | 'vehicleLocationSpeed' Lens
vehicleLocationSpeedL :: Lens_' VehicleLocation (Maybe Double)
vehicleLocationSpeedL f VehicleLocation{..} = (\vehicleLocationSpeed -> VehicleLocation { vehicleLocationSpeed, ..} ) <$> f vehicleLocationSpeed
{-# INLINE vehicleLocationSpeedL #-}

-- | 'vehicleLocationTime' Lens
vehicleLocationTimeL :: Lens_' VehicleLocation (Maybe Int)
vehicleLocationTimeL f VehicleLocation{..} = (\vehicleLocationTime -> VehicleLocation { vehicleLocationTime, ..} ) <$> f vehicleLocationTime
{-# INLINE vehicleLocationTimeL #-}

-- | 'vehicleLocationVin' Lens
vehicleLocationVinL :: Lens_' VehicleLocation (Maybe Text)
vehicleLocationVinL f VehicleLocation{..} = (\vehicleLocationVin -> VehicleLocation { vehicleLocationVin, ..} ) <$> f vehicleLocationVin
{-# INLINE vehicleLocationVinL #-}



-- * VehicleMaintenance

-- | 'vehicleMaintenanceId' Lens
vehicleMaintenanceIdL :: Lens_' VehicleMaintenance (Integer)
vehicleMaintenanceIdL f VehicleMaintenance{..} = (\vehicleMaintenanceId -> VehicleMaintenance { vehicleMaintenanceId, ..} ) <$> f vehicleMaintenanceId
{-# INLINE vehicleMaintenanceIdL #-}

-- | 'vehicleMaintenanceJ1939' Lens
vehicleMaintenanceJ1939L :: Lens_' VehicleMaintenance (Maybe VehicleMaintenanceJ1939)
vehicleMaintenanceJ1939L f VehicleMaintenance{..} = (\vehicleMaintenanceJ1939 -> VehicleMaintenance { vehicleMaintenanceJ1939, ..} ) <$> f vehicleMaintenanceJ1939
{-# INLINE vehicleMaintenanceJ1939L #-}

-- | 'vehicleMaintenancePassenger' Lens
vehicleMaintenancePassengerL :: Lens_' VehicleMaintenance (Maybe VehicleMaintenancePassenger)
vehicleMaintenancePassengerL f VehicleMaintenance{..} = (\vehicleMaintenancePassenger -> VehicleMaintenance { vehicleMaintenancePassenger, ..} ) <$> f vehicleMaintenancePassenger
{-# INLINE vehicleMaintenancePassengerL #-}



-- * VehicleMaintenanceJ1939

-- | 'vehicleMaintenanceJ1939CheckEngineLight' Lens
vehicleMaintenanceJ1939CheckEngineLightL :: Lens_' VehicleMaintenanceJ1939 (Maybe VehicleMaintenanceJ1939CheckEngineLight)
vehicleMaintenanceJ1939CheckEngineLightL f VehicleMaintenanceJ1939{..} = (\vehicleMaintenanceJ1939CheckEngineLight -> VehicleMaintenanceJ1939 { vehicleMaintenanceJ1939CheckEngineLight, ..} ) <$> f vehicleMaintenanceJ1939CheckEngineLight
{-# INLINE vehicleMaintenanceJ1939CheckEngineLightL #-}

-- | 'vehicleMaintenanceJ1939DiagnosticTroubleCodes' Lens
vehicleMaintenanceJ1939DiagnosticTroubleCodesL :: Lens_' VehicleMaintenanceJ1939 (Maybe [VehicleMaintenanceJ1939DiagnosticTroubleCodes])
vehicleMaintenanceJ1939DiagnosticTroubleCodesL f VehicleMaintenanceJ1939{..} = (\vehicleMaintenanceJ1939DiagnosticTroubleCodes -> VehicleMaintenanceJ1939 { vehicleMaintenanceJ1939DiagnosticTroubleCodes, ..} ) <$> f vehicleMaintenanceJ1939DiagnosticTroubleCodes
{-# INLINE vehicleMaintenanceJ1939DiagnosticTroubleCodesL #-}



-- * VehicleMaintenanceJ1939CheckEngineLight

-- | 'vehicleMaintenanceJ1939CheckEngineLightProtectIsOn' Lens
vehicleMaintenanceJ1939CheckEngineLightProtectIsOnL :: Lens_' VehicleMaintenanceJ1939CheckEngineLight (Maybe Bool)
vehicleMaintenanceJ1939CheckEngineLightProtectIsOnL f VehicleMaintenanceJ1939CheckEngineLight{..} = (\vehicleMaintenanceJ1939CheckEngineLightProtectIsOn -> VehicleMaintenanceJ1939CheckEngineLight { vehicleMaintenanceJ1939CheckEngineLightProtectIsOn, ..} ) <$> f vehicleMaintenanceJ1939CheckEngineLightProtectIsOn
{-# INLINE vehicleMaintenanceJ1939CheckEngineLightProtectIsOnL #-}

-- | 'vehicleMaintenanceJ1939CheckEngineLightStopIsOn' Lens
vehicleMaintenanceJ1939CheckEngineLightStopIsOnL :: Lens_' VehicleMaintenanceJ1939CheckEngineLight (Maybe Bool)
vehicleMaintenanceJ1939CheckEngineLightStopIsOnL f VehicleMaintenanceJ1939CheckEngineLight{..} = (\vehicleMaintenanceJ1939CheckEngineLightStopIsOn -> VehicleMaintenanceJ1939CheckEngineLight { vehicleMaintenanceJ1939CheckEngineLightStopIsOn, ..} ) <$> f vehicleMaintenanceJ1939CheckEngineLightStopIsOn
{-# INLINE vehicleMaintenanceJ1939CheckEngineLightStopIsOnL #-}

-- | 'vehicleMaintenanceJ1939CheckEngineLightWarningIsOn' Lens
vehicleMaintenanceJ1939CheckEngineLightWarningIsOnL :: Lens_' VehicleMaintenanceJ1939CheckEngineLight (Maybe Bool)
vehicleMaintenanceJ1939CheckEngineLightWarningIsOnL f VehicleMaintenanceJ1939CheckEngineLight{..} = (\vehicleMaintenanceJ1939CheckEngineLightWarningIsOn -> VehicleMaintenanceJ1939CheckEngineLight { vehicleMaintenanceJ1939CheckEngineLightWarningIsOn, ..} ) <$> f vehicleMaintenanceJ1939CheckEngineLightWarningIsOn
{-# INLINE vehicleMaintenanceJ1939CheckEngineLightWarningIsOnL #-}

-- | 'vehicleMaintenanceJ1939CheckEngineLightEmissionsIsOn' Lens
vehicleMaintenanceJ1939CheckEngineLightEmissionsIsOnL :: Lens_' VehicleMaintenanceJ1939CheckEngineLight (Maybe Bool)
vehicleMaintenanceJ1939CheckEngineLightEmissionsIsOnL f VehicleMaintenanceJ1939CheckEngineLight{..} = (\vehicleMaintenanceJ1939CheckEngineLightEmissionsIsOn -> VehicleMaintenanceJ1939CheckEngineLight { vehicleMaintenanceJ1939CheckEngineLightEmissionsIsOn, ..} ) <$> f vehicleMaintenanceJ1939CheckEngineLightEmissionsIsOn
{-# INLINE vehicleMaintenanceJ1939CheckEngineLightEmissionsIsOnL #-}



-- * VehicleMaintenanceJ1939DiagnosticTroubleCodes

-- | 'vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnDescription' Lens
vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnDescriptionL :: Lens_' VehicleMaintenanceJ1939DiagnosticTroubleCodes (Maybe Text)
vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnDescriptionL f VehicleMaintenanceJ1939DiagnosticTroubleCodes{..} = (\vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnDescription -> VehicleMaintenanceJ1939DiagnosticTroubleCodes { vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnDescription, ..} ) <$> f vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnDescription
{-# INLINE vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnDescriptionL #-}

-- | 'vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiText' Lens
vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiTextL :: Lens_' VehicleMaintenanceJ1939DiagnosticTroubleCodes (Maybe Text)
vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiTextL f VehicleMaintenanceJ1939DiagnosticTroubleCodes{..} = (\vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiText -> VehicleMaintenanceJ1939DiagnosticTroubleCodes { vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiText, ..} ) <$> f vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiText
{-# INLINE vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiTextL #-}

-- | 'vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnId' Lens
vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnIdL :: Lens_' VehicleMaintenanceJ1939DiagnosticTroubleCodes (Maybe Int)
vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnIdL f VehicleMaintenanceJ1939DiagnosticTroubleCodes{..} = (\vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnId -> VehicleMaintenanceJ1939DiagnosticTroubleCodes { vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnId, ..} ) <$> f vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnId
{-# INLINE vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnIdL #-}

-- | 'vehicleMaintenanceJ1939DiagnosticTroubleCodesOccurrenceCount' Lens
vehicleMaintenanceJ1939DiagnosticTroubleCodesOccurrenceCountL :: Lens_' VehicleMaintenanceJ1939DiagnosticTroubleCodes (Maybe Int)
vehicleMaintenanceJ1939DiagnosticTroubleCodesOccurrenceCountL f VehicleMaintenanceJ1939DiagnosticTroubleCodes{..} = (\vehicleMaintenanceJ1939DiagnosticTroubleCodesOccurrenceCount -> VehicleMaintenanceJ1939DiagnosticTroubleCodes { vehicleMaintenanceJ1939DiagnosticTroubleCodesOccurrenceCount, ..} ) <$> f vehicleMaintenanceJ1939DiagnosticTroubleCodesOccurrenceCount
{-# INLINE vehicleMaintenanceJ1939DiagnosticTroubleCodesOccurrenceCountL #-}

-- | 'vehicleMaintenanceJ1939DiagnosticTroubleCodesTxId' Lens
vehicleMaintenanceJ1939DiagnosticTroubleCodesTxIdL :: Lens_' VehicleMaintenanceJ1939DiagnosticTroubleCodes (Maybe Int)
vehicleMaintenanceJ1939DiagnosticTroubleCodesTxIdL f VehicleMaintenanceJ1939DiagnosticTroubleCodes{..} = (\vehicleMaintenanceJ1939DiagnosticTroubleCodesTxId -> VehicleMaintenanceJ1939DiagnosticTroubleCodes { vehicleMaintenanceJ1939DiagnosticTroubleCodesTxId, ..} ) <$> f vehicleMaintenanceJ1939DiagnosticTroubleCodesTxId
{-# INLINE vehicleMaintenanceJ1939DiagnosticTroubleCodesTxIdL #-}

-- | 'vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiId' Lens
vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiIdL :: Lens_' VehicleMaintenanceJ1939DiagnosticTroubleCodes (Maybe Int)
vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiIdL f VehicleMaintenanceJ1939DiagnosticTroubleCodes{..} = (\vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiId -> VehicleMaintenanceJ1939DiagnosticTroubleCodes { vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiId, ..} ) <$> f vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiId
{-# INLINE vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiIdL #-}



-- * VehicleMaintenancePassenger

-- | 'vehicleMaintenancePassengerCheckEngineLight' Lens
vehicleMaintenancePassengerCheckEngineLightL :: Lens_' VehicleMaintenancePassenger (Maybe VehicleMaintenancePassengerCheckEngineLight)
vehicleMaintenancePassengerCheckEngineLightL f VehicleMaintenancePassenger{..} = (\vehicleMaintenancePassengerCheckEngineLight -> VehicleMaintenancePassenger { vehicleMaintenancePassengerCheckEngineLight, ..} ) <$> f vehicleMaintenancePassengerCheckEngineLight
{-# INLINE vehicleMaintenancePassengerCheckEngineLightL #-}

-- | 'vehicleMaintenancePassengerDiagnosticTroubleCodes' Lens
vehicleMaintenancePassengerDiagnosticTroubleCodesL :: Lens_' VehicleMaintenancePassenger (Maybe [VehicleMaintenancePassengerDiagnosticTroubleCodes])
vehicleMaintenancePassengerDiagnosticTroubleCodesL f VehicleMaintenancePassenger{..} = (\vehicleMaintenancePassengerDiagnosticTroubleCodes -> VehicleMaintenancePassenger { vehicleMaintenancePassengerDiagnosticTroubleCodes, ..} ) <$> f vehicleMaintenancePassengerDiagnosticTroubleCodes
{-# INLINE vehicleMaintenancePassengerDiagnosticTroubleCodesL #-}



-- * VehicleMaintenancePassengerCheckEngineLight

-- | 'vehicleMaintenancePassengerCheckEngineLightIsOn' Lens
vehicleMaintenancePassengerCheckEngineLightIsOnL :: Lens_' VehicleMaintenancePassengerCheckEngineLight (Maybe Bool)
vehicleMaintenancePassengerCheckEngineLightIsOnL f VehicleMaintenancePassengerCheckEngineLight{..} = (\vehicleMaintenancePassengerCheckEngineLightIsOn -> VehicleMaintenancePassengerCheckEngineLight { vehicleMaintenancePassengerCheckEngineLightIsOn, ..} ) <$> f vehicleMaintenancePassengerCheckEngineLightIsOn
{-# INLINE vehicleMaintenancePassengerCheckEngineLightIsOnL #-}



-- * VehicleMaintenancePassengerDiagnosticTroubleCodes

-- | 'vehicleMaintenancePassengerDiagnosticTroubleCodesDtcShortCode' Lens
vehicleMaintenancePassengerDiagnosticTroubleCodesDtcShortCodeL :: Lens_' VehicleMaintenancePassengerDiagnosticTroubleCodes (Maybe Text)
vehicleMaintenancePassengerDiagnosticTroubleCodesDtcShortCodeL f VehicleMaintenancePassengerDiagnosticTroubleCodes{..} = (\vehicleMaintenancePassengerDiagnosticTroubleCodesDtcShortCode -> VehicleMaintenancePassengerDiagnosticTroubleCodes { vehicleMaintenancePassengerDiagnosticTroubleCodesDtcShortCode, ..} ) <$> f vehicleMaintenancePassengerDiagnosticTroubleCodesDtcShortCode
{-# INLINE vehicleMaintenancePassengerDiagnosticTroubleCodesDtcShortCodeL #-}

-- | 'vehicleMaintenancePassengerDiagnosticTroubleCodesDtcId' Lens
vehicleMaintenancePassengerDiagnosticTroubleCodesDtcIdL :: Lens_' VehicleMaintenancePassengerDiagnosticTroubleCodes (Maybe Int)
vehicleMaintenancePassengerDiagnosticTroubleCodesDtcIdL f VehicleMaintenancePassengerDiagnosticTroubleCodes{..} = (\vehicleMaintenancePassengerDiagnosticTroubleCodesDtcId -> VehicleMaintenancePassengerDiagnosticTroubleCodes { vehicleMaintenancePassengerDiagnosticTroubleCodesDtcId, ..} ) <$> f vehicleMaintenancePassengerDiagnosticTroubleCodesDtcId
{-# INLINE vehicleMaintenancePassengerDiagnosticTroubleCodesDtcIdL #-}

-- | 'vehicleMaintenancePassengerDiagnosticTroubleCodesDtcDescription' Lens
vehicleMaintenancePassengerDiagnosticTroubleCodesDtcDescriptionL :: Lens_' VehicleMaintenancePassengerDiagnosticTroubleCodes (Maybe Text)
vehicleMaintenancePassengerDiagnosticTroubleCodesDtcDescriptionL f VehicleMaintenancePassengerDiagnosticTroubleCodes{..} = (\vehicleMaintenancePassengerDiagnosticTroubleCodesDtcDescription -> VehicleMaintenancePassengerDiagnosticTroubleCodes { vehicleMaintenancePassengerDiagnosticTroubleCodesDtcDescription, ..} ) <$> f vehicleMaintenancePassengerDiagnosticTroubleCodesDtcDescription
{-# INLINE vehicleMaintenancePassengerDiagnosticTroubleCodesDtcDescriptionL #-}



-- * VehicleSafetyScoreResponse

-- | 'vehicleSafetyScoreResponseCrashCount' Lens
vehicleSafetyScoreResponseCrashCountL :: Lens_' VehicleSafetyScoreResponse (Maybe Int)
vehicleSafetyScoreResponseCrashCountL f VehicleSafetyScoreResponse{..} = (\vehicleSafetyScoreResponseCrashCount -> VehicleSafetyScoreResponse { vehicleSafetyScoreResponseCrashCount, ..} ) <$> f vehicleSafetyScoreResponseCrashCount
{-# INLINE vehicleSafetyScoreResponseCrashCountL #-}

-- | 'vehicleSafetyScoreResponseHarshAccelCount' Lens
vehicleSafetyScoreResponseHarshAccelCountL :: Lens_' VehicleSafetyScoreResponse (Maybe Int)
vehicleSafetyScoreResponseHarshAccelCountL f VehicleSafetyScoreResponse{..} = (\vehicleSafetyScoreResponseHarshAccelCount -> VehicleSafetyScoreResponse { vehicleSafetyScoreResponseHarshAccelCount, ..} ) <$> f vehicleSafetyScoreResponseHarshAccelCount
{-# INLINE vehicleSafetyScoreResponseHarshAccelCountL #-}

-- | 'vehicleSafetyScoreResponseHarshBrakingCount' Lens
vehicleSafetyScoreResponseHarshBrakingCountL :: Lens_' VehicleSafetyScoreResponse (Maybe Int)
vehicleSafetyScoreResponseHarshBrakingCountL f VehicleSafetyScoreResponse{..} = (\vehicleSafetyScoreResponseHarshBrakingCount -> VehicleSafetyScoreResponse { vehicleSafetyScoreResponseHarshBrakingCount, ..} ) <$> f vehicleSafetyScoreResponseHarshBrakingCount
{-# INLINE vehicleSafetyScoreResponseHarshBrakingCountL #-}

-- | 'vehicleSafetyScoreResponseHarshEvents' Lens
vehicleSafetyScoreResponseHarshEventsL :: Lens_' VehicleSafetyScoreResponse (Maybe [SafetyReportHarshEvent])
vehicleSafetyScoreResponseHarshEventsL f VehicleSafetyScoreResponse{..} = (\vehicleSafetyScoreResponseHarshEvents -> VehicleSafetyScoreResponse { vehicleSafetyScoreResponseHarshEvents, ..} ) <$> f vehicleSafetyScoreResponseHarshEvents
{-# INLINE vehicleSafetyScoreResponseHarshEventsL #-}

-- | 'vehicleSafetyScoreResponseHarshTurningCount' Lens
vehicleSafetyScoreResponseHarshTurningCountL :: Lens_' VehicleSafetyScoreResponse (Maybe Int)
vehicleSafetyScoreResponseHarshTurningCountL f VehicleSafetyScoreResponse{..} = (\vehicleSafetyScoreResponseHarshTurningCount -> VehicleSafetyScoreResponse { vehicleSafetyScoreResponseHarshTurningCount, ..} ) <$> f vehicleSafetyScoreResponseHarshTurningCount
{-# INLINE vehicleSafetyScoreResponseHarshTurningCountL #-}

-- | 'vehicleSafetyScoreResponseSafetyScore' Lens
vehicleSafetyScoreResponseSafetyScoreL :: Lens_' VehicleSafetyScoreResponse (Maybe Int)
vehicleSafetyScoreResponseSafetyScoreL f VehicleSafetyScoreResponse{..} = (\vehicleSafetyScoreResponseSafetyScore -> VehicleSafetyScoreResponse { vehicleSafetyScoreResponseSafetyScore, ..} ) <$> f vehicleSafetyScoreResponseSafetyScore
{-# INLINE vehicleSafetyScoreResponseSafetyScoreL #-}

-- | 'vehicleSafetyScoreResponseSafetyScoreRank' Lens
vehicleSafetyScoreResponseSafetyScoreRankL :: Lens_' VehicleSafetyScoreResponse (Maybe Text)
vehicleSafetyScoreResponseSafetyScoreRankL f VehicleSafetyScoreResponse{..} = (\vehicleSafetyScoreResponseSafetyScoreRank -> VehicleSafetyScoreResponse { vehicleSafetyScoreResponseSafetyScoreRank, ..} ) <$> f vehicleSafetyScoreResponseSafetyScoreRank
{-# INLINE vehicleSafetyScoreResponseSafetyScoreRankL #-}

-- | 'vehicleSafetyScoreResponseTimeOverSpeedLimitMs' Lens
vehicleSafetyScoreResponseTimeOverSpeedLimitMsL :: Lens_' VehicleSafetyScoreResponse (Maybe Int)
vehicleSafetyScoreResponseTimeOverSpeedLimitMsL f VehicleSafetyScoreResponse{..} = (\vehicleSafetyScoreResponseTimeOverSpeedLimitMs -> VehicleSafetyScoreResponse { vehicleSafetyScoreResponseTimeOverSpeedLimitMs, ..} ) <$> f vehicleSafetyScoreResponseTimeOverSpeedLimitMs
{-# INLINE vehicleSafetyScoreResponseTimeOverSpeedLimitMsL #-}

-- | 'vehicleSafetyScoreResponseTotalDistanceDrivenMeters' Lens
vehicleSafetyScoreResponseTotalDistanceDrivenMetersL :: Lens_' VehicleSafetyScoreResponse (Maybe Int)
vehicleSafetyScoreResponseTotalDistanceDrivenMetersL f VehicleSafetyScoreResponse{..} = (\vehicleSafetyScoreResponseTotalDistanceDrivenMeters -> VehicleSafetyScoreResponse { vehicleSafetyScoreResponseTotalDistanceDrivenMeters, ..} ) <$> f vehicleSafetyScoreResponseTotalDistanceDrivenMeters
{-# INLINE vehicleSafetyScoreResponseTotalDistanceDrivenMetersL #-}

-- | 'vehicleSafetyScoreResponseTotalHarshEventCount' Lens
vehicleSafetyScoreResponseTotalHarshEventCountL :: Lens_' VehicleSafetyScoreResponse (Maybe Int)
vehicleSafetyScoreResponseTotalHarshEventCountL f VehicleSafetyScoreResponse{..} = (\vehicleSafetyScoreResponseTotalHarshEventCount -> VehicleSafetyScoreResponse { vehicleSafetyScoreResponseTotalHarshEventCount, ..} ) <$> f vehicleSafetyScoreResponseTotalHarshEventCount
{-# INLINE vehicleSafetyScoreResponseTotalHarshEventCountL #-}

-- | 'vehicleSafetyScoreResponseTotalTimeDrivenMs' Lens
vehicleSafetyScoreResponseTotalTimeDrivenMsL :: Lens_' VehicleSafetyScoreResponse (Maybe Int)
vehicleSafetyScoreResponseTotalTimeDrivenMsL f VehicleSafetyScoreResponse{..} = (\vehicleSafetyScoreResponseTotalTimeDrivenMs -> VehicleSafetyScoreResponse { vehicleSafetyScoreResponseTotalTimeDrivenMs, ..} ) <$> f vehicleSafetyScoreResponseTotalTimeDrivenMs
{-# INLINE vehicleSafetyScoreResponseTotalTimeDrivenMsL #-}

-- | 'vehicleSafetyScoreResponseVehicleId' Lens
vehicleSafetyScoreResponseVehicleIdL :: Lens_' VehicleSafetyScoreResponse (Maybe Int)
vehicleSafetyScoreResponseVehicleIdL f VehicleSafetyScoreResponse{..} = (\vehicleSafetyScoreResponseVehicleId -> VehicleSafetyScoreResponse { vehicleSafetyScoreResponseVehicleId, ..} ) <$> f vehicleSafetyScoreResponseVehicleId
{-# INLINE vehicleSafetyScoreResponseVehicleIdL #-}


