{-# LANGUAGE DataKinds                  #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DeriveTraversable          #-}
{-# LANGUAGE FlexibleContexts           #-}
{-# LANGUAGE FlexibleInstances          #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE OverloadedStrings          #-}
{-# LANGUAGE RecordWildCards            #-}
{-# LANGUAGE TypeFamilies               #-}
{-# LANGUAGE TypeOperators              #-}
{-# LANGUAGE ViewPatterns               #-}
{-# OPTIONS_GHC
-fno-warn-unused-binds -fno-warn-unused-imports -freduction-depth=328 #-}

module Samsara.API
  -- * Client and Server
  ( Config(..)
  , SamsaraBackend(..)
  , createSamsaraClient
  , runSamsaraServer
  , runSamsaraClient
  , runSamsaraClientWithManager
  , callSamsara
  , SamsaraClient
  , SamsaraClientError(..)
  -- ** Servant
  , SamsaraAPI
  ) where

import           Samsara.Types

import           Control.Monad.Catch                (Exception, MonadThrow, throwM)
import           Control.Monad.Except               (ExceptT, runExceptT)
import           Control.Monad.IO.Class
import           Control.Monad.Trans.Reader         (ReaderT (..))
import           Data.Aeson                         (Value)
import           Data.Coerce                        (coerce)
import           Data.Data                          (Data)
import           Data.Function                      ((&))
import qualified Data.Map                           as Map
import           Data.Monoid                        ((<>))
import           Data.Proxy                         (Proxy (..))
import           Data.Text                          (Text)
import qualified Data.Text                          as T
import           Data.UUID                          (UUID)
import           GHC.Exts                           (IsString (..))
import           GHC.Generics                       (Generic)
import           Network.HTTP.Client                (Manager, newManager)
import           Network.HTTP.Client.TLS            (tlsManagerSettings)
import           Network.HTTP.Types.Method          (methodOptions)
import qualified Network.Wai.Handler.Warp           as Warp
import           Servant                            (ServantErr, serve)
import           Servant.API
import           Servant.API.Verbs                  (StdMethod (..), Verb)
import           Servant.Client                     (ClientEnv, Scheme (Http), ServantError, client,
                                                     mkClientEnv, parseBaseUrl)
import           Servant.Client.Core                (baseUrlPort, baseUrlHost)
import           Servant.Client.Internal.HttpClient (ClientM (..))
import           Servant.Server                     (Handler (..))
import           Web.FormUrlEncoded
import           Web.HttpApiData




-- | List of elements parsed from a query.
newtype QueryList (p :: CollectionFormat) a = QueryList
  { fromQueryList :: [a]
  } deriving (Functor, Applicative, Monad, Foldable, Traversable)

-- | Formats in which a list can be encoded into a HTTP path.
data CollectionFormat
  = CommaSeparated -- ^ CSV format for multiple parameters.
  | SpaceSeparated -- ^ Also called "SSV"
  | TabSeparated -- ^ Also called "TSV"
  | PipeSeparated -- ^ `value1|value2|value2`
  | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. Only for GET params.

instance FromHttpApiData a => FromHttpApiData (QueryList 'CommaSeparated a) where
  parseQueryParam = parseSeparatedQueryList ','

instance FromHttpApiData a => FromHttpApiData (QueryList 'TabSeparated a) where
  parseQueryParam = parseSeparatedQueryList '\t'

instance FromHttpApiData a => FromHttpApiData (QueryList 'SpaceSeparated a) where
  parseQueryParam = parseSeparatedQueryList ' '

instance FromHttpApiData a => FromHttpApiData (QueryList 'PipeSeparated a) where
  parseQueryParam = parseSeparatedQueryList '|'

instance FromHttpApiData a => FromHttpApiData (QueryList 'MultiParamArray a) where
  parseQueryParam = error "unimplemented FromHttpApiData for MultiParamArray collection format"

parseSeparatedQueryList :: FromHttpApiData a => Char -> Text -> Either Text (QueryList p a)
parseSeparatedQueryList char = fmap QueryList . mapM parseQueryParam . T.split (== char)

instance ToHttpApiData a => ToHttpApiData (QueryList 'CommaSeparated a) where
  toQueryParam = formatSeparatedQueryList ','

instance ToHttpApiData a => ToHttpApiData (QueryList 'TabSeparated a) where
  toQueryParam = formatSeparatedQueryList '\t'

instance ToHttpApiData a => ToHttpApiData (QueryList 'SpaceSeparated a) where
  toQueryParam = formatSeparatedQueryList ' '

instance ToHttpApiData a => ToHttpApiData (QueryList 'PipeSeparated a) where
  toQueryParam = formatSeparatedQueryList '|'

instance ToHttpApiData a => ToHttpApiData (QueryList 'MultiParamArray a) where
  toQueryParam = error "unimplemented ToHttpApiData for MultiParamArray collection format"

formatSeparatedQueryList :: ToHttpApiData a => Char ->  QueryList p a -> Text
formatSeparatedQueryList char = T.intercalate (T.singleton char) . map toQueryParam . fromQueryList


-- | Servant type-level API, generated from the OpenAPI spec for Samsara.
type SamsaraAPI
    =    "fleet" :> "assets" :> "locations" :> QueryParam "access_token" Text :> QueryParam "group_id" Integer :> Verb 'GET 200 '[JSON] InlineResponse2001 -- 'getAllAssetCurrentLocations' route
    :<|> "fleet" :> "assets" :> QueryParam "access_token" Text :> QueryParam "group_id" Integer :> Verb 'GET 200 '[JSON] InlineResponse200 -- 'getAllAssets' route
    :<|> "fleet" :> "assets" :> Capture "asset_id" Integer :> "locations" :> QueryParam "access_token" Text :> QueryParam "startMs" Integer :> QueryParam "endMs" Integer :> Verb 'GET 200 '[JSON] [Value] -- 'getAssetLocation' route
    :<|> "fleet" :> "assets" :> Capture "asset_id" Integer :> "reefer" :> QueryParam "access_token" Text :> QueryParam "startMs" Integer :> QueryParam "endMs" Integer :> Verb 'GET 200 '[JSON] AssetReeferResponse -- 'getAssetReefer' route
    :<|> "fleet" :> "drivers" :> "create" :> QueryParam "access_token" Text :> ReqBody '[JSON] DriverForCreate :> Verb 'POST 200 '[JSON] Driver -- 'createDriver' route
    :<|> "fleet" :> "drivers" :> Capture "driver_id_or_external_id" Text :> QueryParam "access_token" Text :> Verb 'DELETE 200 '[JSON] () -- 'deactivateDriver' route
    :<|> "fleet" :> "drivers" :> "inactive" :> QueryParam "access_token" Text :> QueryParam "group_id" Integer :> Verb 'GET 200 '[JSON] [Driver] -- 'getAllDeactivatedDrivers' route
    :<|> "fleet" :> "drivers" :> "inactive" :> Capture "driver_id_or_external_id" Text :> QueryParam "access_token" Text :> Verb 'GET 200 '[JSON] Driver -- 'getDeactivatedDriverById' route
    :<|> "fleet" :> "drivers" :> Capture "driver_id_or_external_id" Text :> QueryParam "access_token" Text :> Verb 'GET 200 '[JSON] Driver -- 'getDriverById' route
    :<|> "fleet" :> "drivers" :> "inactive" :> Capture "driver_id_or_external_id" Text :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject4 :> Verb 'PUT 200 '[JSON] Driver -- 'reactivateDriverById' route
    :<|> "fleet" :> "add_address" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject2 :> Verb 'POST 200 '[JSON] () -- 'addFleetAddress' route
    :<|> "addresses" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject :> Verb 'POST 200 '[JSON] [Address] -- 'addOrganizationAddresses' route
    :<|> "fleet" :> "dispatch" :> "routes" :> QueryParam "access_token" Text :> ReqBody '[JSON] DispatchRouteCreate :> Verb 'POST 200 '[JSON] DispatchRoute -- 'createDispatchRoute' route
    :<|> "fleet" :> "drivers" :> "create" :> QueryParam "access_token" Text :> ReqBody '[JSON] DriverForCreate :> Verb 'POST 200 '[JSON] Driver -- 'createDriver' route
    :<|> "fleet" :> "drivers" :> Capture "driver_id" Integer :> "dispatch" :> "routes" :> QueryParam "access_token" Text :> ReqBody '[JSON] DispatchRouteCreate :> Verb 'POST 200 '[JSON] DispatchRoute -- 'createDriverDispatchRoute' route
    :<|> "fleet" :> "drivers" :> Capture "driver_id" Integer :> "documents" :> QueryParam "access_token" Text :> ReqBody '[JSON] DocumentCreate :> Verb 'POST 200 '[JSON] Document -- 'createDriverDocument' route
    :<|> "fleet" :> "maintenance" :> "dvirs" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject12 :> Verb 'POST 200 '[JSON] DvirBase -- 'createDvir' route
    :<|> "fleet" :> "vehicles" :> Capture "vehicle_id" Integer :> "dispatch" :> "routes" :> QueryParam "access_token" Text :> ReqBody '[JSON] DispatchRouteCreate :> Verb 'POST 200 '[JSON] DispatchRoute -- 'createVehicleDispatchRoute' route
    :<|> "fleet" :> "drivers" :> Capture "driver_id_or_external_id" Text :> QueryParam "access_token" Text :> Verb 'DELETE 200 '[JSON] () -- 'deactivateDriver' route
    :<|> "fleet" :> "dispatch" :> "routes" :> Capture "route_id" Integer :> QueryParam "access_token" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteDispatchRouteById' route
    :<|> "addresses" :> Capture "addressId" Integer :> QueryParam "access_token" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteOrganizationAddress' route
    :<|> "fleet" :> "dispatch" :> "routes" :> QueryParam "access_token" Text :> QueryParam "group_id" Integer :> QueryParam "end_time" Integer :> QueryParam "duration" Integer :> Verb 'GET 200 '[JSON] [DispatchRoute] -- 'fetchAllDispatchRoutes' route
    :<|> "fleet" :> "dispatch" :> "routes" :> "job_updates" :> QueryParam "access_token" Text :> QueryParam "group_id" Integer :> QueryParam "sequence_id" Text :> QueryParam "include" Text :> Verb 'GET 200 '[JSON] AllRouteJobUpdates -- 'fetchAllRouteJobUpdates' route
    :<|> "fleet" :> "assets" :> "locations" :> QueryParam "access_token" Text :> QueryParam "group_id" Integer :> Verb 'GET 200 '[JSON] InlineResponse2001 -- 'getAllAssetCurrentLocations' route
    :<|> "fleet" :> "assets" :> QueryParam "access_token" Text :> QueryParam "group_id" Integer :> Verb 'GET 200 '[JSON] InlineResponse200 -- 'getAllAssets' route
    :<|> "fleet" :> "drivers" :> "inactive" :> QueryParam "access_token" Text :> QueryParam "group_id" Integer :> Verb 'GET 200 '[JSON] [Driver] -- 'getAllDeactivatedDrivers' route
    :<|> "fleet" :> "assets" :> Capture "asset_id" Integer :> "locations" :> QueryParam "access_token" Text :> QueryParam "startMs" Integer :> QueryParam "endMs" Integer :> Verb 'GET 200 '[JSON] [Value] -- 'getAssetLocation' route
    :<|> "fleet" :> "assets" :> Capture "asset_id" Integer :> "reefer" :> QueryParam "access_token" Text :> QueryParam "startMs" Integer :> QueryParam "endMs" Integer :> Verb 'GET 200 '[JSON] AssetReeferResponse -- 'getAssetReefer' route
    :<|> "fleet" :> "drivers" :> "inactive" :> Capture "driver_id_or_external_id" Text :> QueryParam "access_token" Text :> Verb 'GET 200 '[JSON] Driver -- 'getDeactivatedDriverById' route
    :<|> "fleet" :> "dispatch" :> "routes" :> Capture "route_id" Integer :> QueryParam "access_token" Text :> Verb 'GET 200 '[JSON] DispatchRoute -- 'getDispatchRouteById' route
    :<|> "fleet" :> "dispatch" :> "routes" :> Capture "route_id" Integer :> "history" :> QueryParam "access_token" Text :> QueryParam "start_time" Integer :> QueryParam "end_time" Integer :> Verb 'GET 200 '[JSON] DispatchRouteHistory -- 'getDispatchRouteHistory' route
    :<|> "fleet" :> "drivers" :> Capture "driver_id" Integer :> "dispatch" :> "routes" :> QueryParam "access_token" Text :> QueryParam "end_time" Integer :> QueryParam "duration" Integer :> Verb 'GET 200 '[JSON] [DispatchRoute] -- 'getDispatchRoutesByDriverId' route
    :<|> "fleet" :> "vehicles" :> Capture "vehicle_id" Integer :> "dispatch" :> "routes" :> QueryParam "access_token" Text :> QueryParam "end_time" Integer :> QueryParam "duration" Integer :> Verb 'GET 200 '[JSON] [DispatchRoute] -- 'getDispatchRoutesByVehicleId' route
    :<|> "fleet" :> "drivers" :> Capture "driver_id_or_external_id" Text :> QueryParam "access_token" Text :> Verb 'GET 200 '[JSON] Driver -- 'getDriverById' route
    :<|> "fleet" :> "drivers" :> "document_types" :> Verb 'GET 200 '[JSON] [DocumentType] -- 'getDriverDocumentTypesByOrgId' route
    :<|> "fleet" :> "drivers" :> "documents" :> QueryParam "access_token" Text :> QueryParam "endMs" Integer :> QueryParam "durationMs" Integer :> Verb 'GET 200 '[JSON] [Document] -- 'getDriverDocumentsByOrgId' route
    :<|> "fleet" :> "drivers" :> Capture "driverId" Integer :> "safety" :> "score" :> QueryParam "access_token" Text :> QueryParam "startMs" Integer :> QueryParam "endMs" Integer :> Verb 'GET 200 '[JSON] DriverSafetyScoreResponse -- 'getDriverSafetyScore' route
    :<|> "fleet" :> "maintenance" :> "dvirs" :> QueryParam "access_token" Text :> QueryParam "end_ms" Int :> QueryParam "duration_ms" Int :> QueryParam "group_id" Int :> Verb 'GET 200 '[JSON] DvirListResponse -- 'getDvirs' route
    :<|> "fleet" :> "drivers" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject3 :> Verb 'POST 200 '[JSON] DriversResponse -- 'getFleetDrivers' route
    :<|> "fleet" :> "drivers" :> Capture "driver_id" Integer :> "hos_daily_logs" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject6 :> Verb 'POST 200 '[JSON] DriverDailyLogResponse -- 'getFleetDriversHosDailyLogs' route
    :<|> "fleet" :> "drivers" :> "summary" :> QueryParam "access_token" Text :> QueryParam "snap_to_day_bounds" Bool :> ReqBody '[JSON] InlineObject5 :> Verb 'POST 200 '[JSON] DriversSummaryResponse -- 'getFleetDriversSummary' route
    :<|> "fleet" :> "hos_authentication_logs" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject7 :> Verb 'POST 200 '[JSON] HosAuthenticationLogsResponse -- 'getFleetHosAuthenticationLogs' route
    :<|> "fleet" :> "hos_logs" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject8 :> Verb 'POST 200 '[JSON] HosLogsResponse -- 'getFleetHosLogs' route
    :<|> "fleet" :> "hos_logs_summary" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject9 :> Verb 'POST 200 '[JSON] HosLogsSummaryResponse -- 'getFleetHosLogsSummary' route
    :<|> "fleet" :> "locations" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject11 :> Verb 'POST 200 '[JSON] InlineResponse2003 -- 'getFleetLocations' route
    :<|> "fleet" :> "maintenance" :> "list" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject13 :> Verb 'POST 200 '[JSON] InlineResponse2004 -- 'getFleetMaintenanceList' route
    :<|> "fleet" :> "trips" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject15 :> Verb 'POST 200 '[JSON] TripResponse -- 'getFleetTrips' route
    :<|> "fleet" :> "vehicles" :> Capture "vehicle_id_or_external_id" Text :> QueryParam "access_token" Text :> Verb 'GET 200 '[JSON] FleetVehicleResponse -- 'getFleetVehicle' route
    :<|> "addresses" :> Capture "addressId" Integer :> QueryParam "access_token" Text :> Verb 'GET 200 '[JSON] Address -- 'getOrganizationAddress' route
    :<|> "addresses" :> QueryParam "access_token" Text :> Verb 'GET 200 '[JSON] [Address] -- 'getOrganizationAddresses' route
    :<|> "contacts" :> Capture "contact_id" Integer :> QueryParam "access_token" Text :> Verb 'GET 200 '[JSON] Contact -- 'getOrganizationContact' route
    :<|> "fleet" :> "vehicles" :> Capture "vehicleId" Integer :> "safety" :> "harsh_event" :> QueryParam "access_token" Text :> QueryParam "timestamp" Integer :> Verb 'GET 200 '[JSON] VehicleHarshEventResponse -- 'getVehicleHarshEvent' route
    :<|> "fleet" :> "vehicles" :> Capture "vehicle_id" Integer :> "locations" :> QueryParam "access_token" Text :> QueryParam "startMs" Integer :> QueryParam "endMs" Integer :> Verb 'GET 200 '[JSON] [FleetVehicleLocation] -- 'getVehicleLocations' route
    :<|> "fleet" :> "vehicles" :> Capture "vehicleId" Integer :> "safety" :> "score" :> QueryParam "access_token" Text :> QueryParam "startMs" Integer :> QueryParam "endMs" Integer :> Verb 'GET 200 '[JSON] VehicleSafetyScoreResponse -- 'getVehicleSafetyScore' route
    :<|> "fleet" :> "vehicles" :> "stats" :> QueryParam "access_token" Text :> QueryParam "startMs" Int :> QueryParam "endMs" Int :> QueryParam "series" Text :> QueryParam "tagIds" Text :> QueryParam "startingAfter" Text :> QueryParam "endingBefore" Text :> QueryParam "limit" Integer :> Verb 'GET 200 '[JSON] InlineResponse2005 -- 'getVehicleStats' route
    :<|> "fleet" :> "vehicles" :> "locations" :> QueryParam "access_token" Text :> QueryParam "startMs" Int :> QueryParam "endMs" Int :> Verb 'GET 200 '[JSON] [Value] -- 'getVehiclesLocations' route
    :<|> "contacts" :> QueryParam "access_token" Text :> Verb 'GET 200 '[JSON] [Contact] -- 'listContacts' route
    :<|> "fleet" :> "list" :> QueryParam "access_token" Text :> QueryParam "startingAfter" Text :> QueryParam "endingBefore" Text :> QueryParam "limit" Integer :> ReqBody '[JSON] InlineObject10 :> Verb 'POST 200 '[JSON] InlineResponse2002 -- 'listFleet' route
    :<|> "fleet" :> "vehicles" :> Capture "vehicle_id_or_external_id" Text :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject16 :> Verb 'PATCH 200 '[JSON] FleetVehicleResponse -- 'patchFleetVehicle' route
    :<|> "fleet" :> "drivers" :> "inactive" :> Capture "driver_id_or_external_id" Text :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject4 :> Verb 'PUT 200 '[JSON] Driver -- 'reactivateDriverById' route
    :<|> "fleet" :> "dispatch" :> "routes" :> Capture "route_id" Integer :> QueryParam "access_token" Text :> ReqBody '[JSON] DispatchRoute :> Verb 'PUT 200 '[JSON] DispatchRoute -- 'updateDispatchRouteById' route
    :<|> "addresses" :> Capture "addressId" Integer :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject1 :> Verb 'PATCH 200 '[JSON] () -- 'updateOrganizationAddress' route
    :<|> "fleet" :> "set_data" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject14 :> Verb 'POST 200 '[JSON] () -- 'updateVehicles' route
    :<|> "industrial" :> "data" :> QueryParam "access_token" Text :> QueryParam "group_id" Integer :> QueryParam "startMs" Integer :> QueryParam "endMs" Integer :> Verb 'GET 200 '[JSON] InlineResponse2006 -- 'getAllDataInputs' route
    :<|> "industrial" :> "data" :> Capture "data_input_id" Integer :> QueryParam "access_token" Text :> QueryParam "startMs" Integer :> QueryParam "endMs" Integer :> Verb 'GET 200 '[JSON] DataInputHistoryResponse -- 'getDataInput' route
    :<|> "machines" :> "list" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject18 :> Verb 'POST 200 '[JSON] InlineResponse2007 -- 'getMachines' route
    :<|> "machines" :> "history" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject17 :> Verb 'POST 200 '[JSON] MachineHistoryResponse -- 'getMachinesHistory' route
    :<|> "fleet" :> "dispatch" :> "routes" :> QueryParam "access_token" Text :> ReqBody '[JSON] DispatchRouteCreate :> Verb 'POST 200 '[JSON] DispatchRoute -- 'createDispatchRoute' route
    :<|> "fleet" :> "drivers" :> Capture "driver_id" Integer :> "dispatch" :> "routes" :> QueryParam "access_token" Text :> ReqBody '[JSON] DispatchRouteCreate :> Verb 'POST 200 '[JSON] DispatchRoute -- 'createDriverDispatchRoute' route
    :<|> "fleet" :> "vehicles" :> Capture "vehicle_id" Integer :> "dispatch" :> "routes" :> QueryParam "access_token" Text :> ReqBody '[JSON] DispatchRouteCreate :> Verb 'POST 200 '[JSON] DispatchRoute -- 'createVehicleDispatchRoute' route
    :<|> "fleet" :> "dispatch" :> "routes" :> Capture "route_id" Integer :> QueryParam "access_token" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteDispatchRouteById' route
    :<|> "fleet" :> "dispatch" :> "routes" :> QueryParam "access_token" Text :> QueryParam "group_id" Integer :> QueryParam "end_time" Integer :> QueryParam "duration" Integer :> Verb 'GET 200 '[JSON] [DispatchRoute] -- 'fetchAllDispatchRoutes' route
    :<|> "fleet" :> "dispatch" :> "routes" :> "job_updates" :> QueryParam "access_token" Text :> QueryParam "group_id" Integer :> QueryParam "sequence_id" Text :> QueryParam "include" Text :> Verb 'GET 200 '[JSON] AllRouteJobUpdates -- 'fetchAllRouteJobUpdates' route
    :<|> "fleet" :> "dispatch" :> "routes" :> Capture "route_id" Integer :> QueryParam "access_token" Text :> Verb 'GET 200 '[JSON] DispatchRoute -- 'getDispatchRouteById' route
    :<|> "fleet" :> "dispatch" :> "routes" :> Capture "route_id" Integer :> "history" :> QueryParam "access_token" Text :> QueryParam "start_time" Integer :> QueryParam "end_time" Integer :> Verb 'GET 200 '[JSON] DispatchRouteHistory -- 'getDispatchRouteHistory' route
    :<|> "fleet" :> "drivers" :> Capture "driver_id" Integer :> "dispatch" :> "routes" :> QueryParam "access_token" Text :> QueryParam "end_time" Integer :> QueryParam "duration" Integer :> Verb 'GET 200 '[JSON] [DispatchRoute] -- 'getDispatchRoutesByDriverId' route
    :<|> "fleet" :> "vehicles" :> Capture "vehicle_id" Integer :> "dispatch" :> "routes" :> QueryParam "access_token" Text :> QueryParam "end_time" Integer :> QueryParam "duration" Integer :> Verb 'GET 200 '[JSON] [DispatchRoute] -- 'getDispatchRoutesByVehicleId' route
    :<|> "fleet" :> "dispatch" :> "routes" :> Capture "route_id" Integer :> QueryParam "access_token" Text :> ReqBody '[JSON] DispatchRoute :> Verb 'PUT 200 '[JSON] DispatchRoute -- 'updateDispatchRouteById' route
    :<|> "fleet" :> "drivers" :> Capture "driverId" Integer :> "safety" :> "score" :> QueryParam "access_token" Text :> QueryParam "startMs" Integer :> QueryParam "endMs" Integer :> Verb 'GET 200 '[JSON] DriverSafetyScoreResponse -- 'getDriverSafetyScore' route
    :<|> "fleet" :> "vehicles" :> Capture "vehicleId" Integer :> "safety" :> "harsh_event" :> QueryParam "access_token" Text :> QueryParam "timestamp" Integer :> Verb 'GET 200 '[JSON] VehicleHarshEventResponse -- 'getVehicleHarshEvent' route
    :<|> "fleet" :> "vehicles" :> Capture "vehicleId" Integer :> "safety" :> "score" :> QueryParam "access_token" Text :> QueryParam "startMs" Integer :> QueryParam "endMs" Integer :> Verb 'GET 200 '[JSON] VehicleSafetyScoreResponse -- 'getVehicleSafetyScore' route
    :<|> "sensors" :> "list" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject23 :> Verb 'POST 200 '[JSON] InlineResponse2008 -- 'getSensors' route
    :<|> "sensors" :> "cargo" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject19 :> Verb 'POST 200 '[JSON] CargoResponse -- 'getSensorsCargo' route
    :<|> "sensors" :> "door" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject20 :> Verb 'POST 200 '[JSON] DoorResponse -- 'getSensorsDoor' route
    :<|> "sensors" :> "history" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject21 :> Verb 'POST 200 '[JSON] SensorHistoryResponse -- 'getSensorsHistory' route
    :<|> "sensors" :> "humidity" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject22 :> Verb 'POST 200 '[JSON] HumidityResponse -- 'getSensorsHumidity' route
    :<|> "sensors" :> "temperature" :> QueryParam "access_token" Text :> ReqBody '[JSON] InlineObject24 :> Verb 'POST 200 '[JSON] TemperatureResponse -- 'getSensorsTemperature' route
    :<|> "tags" :> QueryParam "access_token" Text :> ReqBody '[JSON] TagCreate :> Verb 'POST 200 '[JSON] Tag -- 'createTag' route
    :<|> "tags" :> Capture "tag_id" Integer :> QueryParam "access_token" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteTagById' route
    :<|> "tags" :> QueryParam "access_token" Text :> QueryParam "group_id" Integer :> Verb 'GET 200 '[JSON] InlineResponse2009 -- 'getAllTags' route
    :<|> "tags" :> Capture "tag_id" Integer :> QueryParam "access_token" Text :> Verb 'GET 200 '[JSON] Tag -- 'getTagById' route
    :<|> "tags" :> Capture "tag_id" Integer :> QueryParam "access_token" Text :> ReqBody '[JSON] TagModify :> Verb 'PATCH 200 '[JSON] Tag -- 'modifyTagById' route
    :<|> "tags" :> Capture "tag_id" Integer :> QueryParam "access_token" Text :> ReqBody '[JSON] TagUpdate :> Verb 'PUT 200 '[JSON] Tag -- 'updateTagById' route
    :<|> "users" :> Capture "userId" Integer :> QueryParam "access_token" Text :> Verb 'DELETE 200 '[JSON] () -- 'deleteUserById' route
    :<|> "users" :> Capture "userId" Integer :> QueryParam "access_token" Text :> Verb 'GET 200 '[JSON] User -- 'getUserById' route
    :<|> "user_roles" :> QueryParam "access_token" Text :> Verb 'GET 200 '[JSON] [UserRole] -- 'listUserRoles' route
    :<|> "users" :> QueryParam "access_token" Text :> Verb 'GET 200 '[JSON] [User] -- 'listUsers' route


-- | Server or client configuration, specifying the host and port to query or serve on.
data Config = Config
  { configUrl :: String  -- ^ scheme://hostname:port/path, e.g. "http://localhost:8080/"
  } deriving (Eq, Ord, Show, Read)


-- | Custom exception type for our errors.
newtype SamsaraClientError = SamsaraClientError ServantError
  deriving (Show, Exception)
-- | Configuration, specifying the full url of the service.


-- | Backend for Samsara.
-- The backend can be used both for the client and the server. The client generated from the Samsara OpenAPI spec
-- is a backend that executes actions by sending HTTP requests (see @createSamsaraClient@). Alternatively, provided
-- a backend, the API can be served using @runSamsaraServer@.
data SamsaraBackend m = SamsaraBackend
  { getAllAssetCurrentLocations :: Maybe Text -> Maybe Integer -> m InlineResponse2001{- ^ Fetch current locations of all assets for the group. -}
  , getAllAssets :: Maybe Text -> Maybe Integer -> m InlineResponse200{- ^ Fetch all of the assets for the group. -}
  , getAssetLocation :: Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m [Value]{- ^ Fetch the historical locations for the asset. -}
  , getAssetReefer :: Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m AssetReeferResponse{- ^ Fetch the reefer-specific stats of an asset. -}
  , createDriver :: Maybe Text -> DriverForCreate -> m Driver{- ^ Create a new driver. -}
  , deactivateDriver :: Text -> Maybe Text -> m (){- ^ Deactivate a driver with the given id. -}
  , getAllDeactivatedDrivers :: Maybe Text -> Maybe Integer -> m [Driver]{- ^ Fetch all deactivated drivers for the group. -}
  , getDeactivatedDriverById :: Text -> Maybe Text -> m Driver{- ^ Fetch deactivated driver by id. -}
  , getDriverById :: Text -> Maybe Text -> m Driver{- ^ Fetch driver by id. -}
  , reactivateDriverById :: Text -> Maybe Text -> InlineObject4 -> m Driver{- ^ Reactivate the inactive driver having id. -}
  , addFleetAddress :: Maybe Text -> InlineObject2 -> m (){- ^ This method adds an address book entry to the specified group. -}
  , addOrganizationAddresses :: Maybe Text -> InlineObject -> m [Address]{- ^ Add one or more addresses to the organization -}
  , createDispatchRoute :: Maybe Text -> DispatchRouteCreate -> m DispatchRoute{- ^ Create a new dispatch route. -}
  , createDriver :: Maybe Text -> DriverForCreate -> m Driver{- ^ Create a new driver. -}
  , createDriverDispatchRoute :: Integer -> Maybe Text -> DispatchRouteCreate -> m DispatchRoute{- ^ Create a new dispatch route for the driver with driver_id. -}
  , createDriverDocument :: Integer -> Maybe Text -> DocumentCreate -> m Document{- ^ Create a driver document for the given driver. -}
  , createDvir :: Maybe Text -> InlineObject12 -> m DvirBase{- ^ Create a new dvir, marking a vehicle or trailer safe or unsafe. -}
  , createVehicleDispatchRoute :: Integer -> Maybe Text -> DispatchRouteCreate -> m DispatchRoute{- ^ Create a new dispatch route for the vehicle with vehicle_id. -}
  , deactivateDriver :: Text -> Maybe Text -> m (){- ^ Deactivate a driver with the given id. -}
  , deleteDispatchRouteById :: Integer -> Maybe Text -> m (){- ^ Delete a dispatch route and its associated jobs. -}
  , deleteOrganizationAddress :: Integer -> Maybe Text -> m (){- ^ Delete an address. -}
  , fetchAllDispatchRoutes :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> m [DispatchRoute]{- ^ Fetch all of the dispatch routes for the group. -}
  , fetchAllRouteJobUpdates :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> m AllRouteJobUpdates{- ^ Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID -}
  , getAllAssetCurrentLocations :: Maybe Text -> Maybe Integer -> m InlineResponse2001{- ^ Fetch current locations of all assets for the group. -}
  , getAllAssets :: Maybe Text -> Maybe Integer -> m InlineResponse200{- ^ Fetch all of the assets for the group. -}
  , getAllDeactivatedDrivers :: Maybe Text -> Maybe Integer -> m [Driver]{- ^ Fetch all deactivated drivers for the group. -}
  , getAssetLocation :: Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m [Value]{- ^ Fetch the historical locations for the asset. -}
  , getAssetReefer :: Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m AssetReeferResponse{- ^ Fetch the reefer-specific stats of an asset. -}
  , getDeactivatedDriverById :: Text -> Maybe Text -> m Driver{- ^ Fetch deactivated driver by id. -}
  , getDispatchRouteById :: Integer -> Maybe Text -> m DispatchRoute{- ^ Fetch a dispatch route by id. -}
  , getDispatchRouteHistory :: Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m DispatchRouteHistory{- ^ Fetch the history of a dispatch route. -}
  , getDispatchRoutesByDriverId :: Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m [DispatchRoute]{- ^ Fetch all of the dispatch routes for a given driver. -}
  , getDispatchRoutesByVehicleId :: Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m [DispatchRoute]{- ^ Fetch all of the dispatch routes for a given vehicle. -}
  , getDriverById :: Text -> Maybe Text -> m Driver{- ^ Fetch driver by id. -}
  , getDriverDocumentTypesByOrgId :: m [DocumentType]{- ^ Fetch all of the document types. -}
  , getDriverDocumentsByOrgId :: Maybe Text -> Maybe Integer -> Maybe Integer -> m [Document]{- ^ Fetch all of the documents. -}
  , getDriverSafetyScore :: Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m DriverSafetyScoreResponse{- ^ Fetch the safety score for the driver. -}
  , getDvirs :: Maybe Text -> Maybe Int -> Maybe Int -> Maybe Int -> m DvirListResponse{- ^ Get DVIRs for the org within provided time constraints -}
  , getFleetDrivers :: Maybe Text -> InlineObject3 -> m DriversResponse{- ^ Get all the drivers for the specified group. -}
  , getFleetDriversHosDailyLogs :: Integer -> Maybe Text -> InlineObject6 -> m DriverDailyLogResponse{- ^ Get summarized daily HOS charts for a specified driver. -}
  , getFleetDriversSummary :: Maybe Text -> Maybe Bool -> InlineObject5 -> m DriversSummaryResponse{- ^ Get the distance and time each driver in an organization has driven in a given time period. -}
  , getFleetHosAuthenticationLogs :: Maybe Text -> InlineObject7 -> m HosAuthenticationLogsResponse{- ^ Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information. -}
  , getFleetHosLogs :: Maybe Text -> InlineObject8 -> m HosLogsResponse{- ^ Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period. -}
  , getFleetHosLogsSummary :: Maybe Text -> InlineObject9 -> m HosLogsSummaryResponse{- ^ Get the current HOS status for all drivers in the group. -}
  , getFleetLocations :: Maybe Text -> InlineObject11 -> m InlineResponse2003{- ^ Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group. -}
  , getFleetMaintenanceList :: Maybe Text -> InlineObject13 -> m InlineResponse2004{- ^ Get list of the vehicles with any engine faults or check light data. -}
  , getFleetTrips :: Maybe Text -> InlineObject15 -> m TripResponse{- ^ Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range. -}
  , getFleetVehicle :: Text -> Maybe Text -> m FleetVehicleResponse{- ^ Gets a specific vehicle. -}
  , getOrganizationAddress :: Integer -> Maybe Text -> m Address{- ^ Fetch an address by its id. -}
  , getOrganizationAddresses :: Maybe Text -> m [Address]{- ^ Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries. -}
  , getOrganizationContact :: Integer -> Maybe Text -> m Contact{- ^ Fetch a contact by its id. -}
  , getVehicleHarshEvent :: Integer -> Maybe Text -> Maybe Integer -> m VehicleHarshEventResponse{- ^ Fetch harsh event details for a vehicle. -}
  , getVehicleLocations :: Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m [FleetVehicleLocation]{- ^ Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour. -}
  , getVehicleSafetyScore :: Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m VehicleSafetyScoreResponse{- ^ Fetch the safety score for the vehicle. -}
  , getVehicleStats :: Maybe Text -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> m InlineResponse2005{- ^ Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time. -}
  , getVehiclesLocations :: Maybe Text -> Maybe Int -> Maybe Int -> m [Value]{- ^ Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes. -}
  , listContacts :: Maybe Text -> m [Contact]{- ^ Fetch all contacts for the organization. -}
  , listFleet :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> InlineObject10 -> m InlineResponse2002{- ^ Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them. -}
  , patchFleetVehicle :: Text -> Maybe Text -> InlineObject16 -> m FleetVehicleResponse{- ^ Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396. -}
  , reactivateDriverById :: Text -> Maybe Text -> InlineObject4 -> m Driver{- ^ Reactivate the inactive driver having id. -}
  , updateDispatchRouteById :: Integer -> Maybe Text -> DispatchRoute -> m DispatchRoute{- ^ Update a dispatch route and its associated jobs. -}
  , updateOrganizationAddress :: Integer -> Maybe Text -> InlineObject1 -> m (){- ^ Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string. -}
  , updateVehicles :: Maybe Text -> InlineObject14 -> m (){- ^ This method enables the mutation of metadata for vehicles in the Samsara Cloud. -}
  , getAllDataInputs :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> m InlineResponse2006{- ^ Fetch all of the data inputs for a group. -}
  , getDataInput :: Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m DataInputHistoryResponse{- ^ Fetch datapoints from a given data input. -}
  , getMachines :: Maybe Text -> InlineObject18 -> m InlineResponse2007{- ^ Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them. -}
  , getMachinesHistory :: Maybe Text -> InlineObject17 -> m MachineHistoryResponse{- ^ Get historical data for machine objects. This method returns a set of historical data for all machines in a group -}
  , createDispatchRoute :: Maybe Text -> DispatchRouteCreate -> m DispatchRoute{- ^ Create a new dispatch route. -}
  , createDriverDispatchRoute :: Integer -> Maybe Text -> DispatchRouteCreate -> m DispatchRoute{- ^ Create a new dispatch route for the driver with driver_id. -}
  , createVehicleDispatchRoute :: Integer -> Maybe Text -> DispatchRouteCreate -> m DispatchRoute{- ^ Create a new dispatch route for the vehicle with vehicle_id. -}
  , deleteDispatchRouteById :: Integer -> Maybe Text -> m (){- ^ Delete a dispatch route and its associated jobs. -}
  , fetchAllDispatchRoutes :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> m [DispatchRoute]{- ^ Fetch all of the dispatch routes for the group. -}
  , fetchAllRouteJobUpdates :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> m AllRouteJobUpdates{- ^ Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID -}
  , getDispatchRouteById :: Integer -> Maybe Text -> m DispatchRoute{- ^ Fetch a dispatch route by id. -}
  , getDispatchRouteHistory :: Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m DispatchRouteHistory{- ^ Fetch the history of a dispatch route. -}
  , getDispatchRoutesByDriverId :: Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m [DispatchRoute]{- ^ Fetch all of the dispatch routes for a given driver. -}
  , getDispatchRoutesByVehicleId :: Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m [DispatchRoute]{- ^ Fetch all of the dispatch routes for a given vehicle. -}
  , updateDispatchRouteById :: Integer -> Maybe Text -> DispatchRoute -> m DispatchRoute{- ^ Update a dispatch route and its associated jobs. -}
  , getDriverSafetyScore :: Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m DriverSafetyScoreResponse{- ^ Fetch the safety score for the driver. -}
  , getVehicleHarshEvent :: Integer -> Maybe Text -> Maybe Integer -> m VehicleHarshEventResponse{- ^ Fetch harsh event details for a vehicle. -}
  , getVehicleSafetyScore :: Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m VehicleSafetyScoreResponse{- ^ Fetch the safety score for the vehicle. -}
  , getSensors :: Maybe Text -> InlineObject23 -> m InlineResponse2008{- ^ Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them. -}
  , getSensorsCargo :: Maybe Text -> InlineObject19 -> m CargoResponse{- ^ Get cargo monitor status (empty / full) for requested sensors. -}
  , getSensorsDoor :: Maybe Text -> InlineObject20 -> m DoorResponse{- ^ Get door monitor status (closed / open) for requested sensors. -}
  , getSensorsHistory :: Maybe Text -> InlineObject21 -> m SensorHistoryResponse{- ^ Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution. -}
  , getSensorsHumidity :: Maybe Text -> InlineObject22 -> m HumidityResponse{- ^ Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors. -}
  , getSensorsTemperature :: Maybe Text -> InlineObject24 -> m TemperatureResponse{- ^ Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors. -}
  , createTag :: Maybe Text -> TagCreate -> m Tag{- ^ Create a new tag for the group. -}
  , deleteTagById :: Integer -> Maybe Text -> m (){- ^ Permanently deletes a tag. -}
  , getAllTags :: Maybe Text -> Maybe Integer -> m InlineResponse2009{- ^ Fetch all of the tags for a group. -}
  , getTagById :: Integer -> Maybe Text -> m Tag{- ^ Fetch a tag by id. -}
  , modifyTagById :: Integer -> Maybe Text -> TagModify -> m Tag{- ^ Add or delete specific members from a tag, or modify the name of a tag. -}
  , updateTagById :: Integer -> Maybe Text -> TagUpdate -> m Tag{- ^ Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint. -}
  , deleteUserById :: Integer -> Maybe Text -> m (){- ^ Remove a user from the organization. -}
  , getUserById :: Integer -> Maybe Text -> m User{- ^ Get a user. -}
  , listUserRoles :: Maybe Text -> m [UserRole]{- ^ Get all roles in the organization. -}
  , listUsers :: Maybe Text -> m [User]{- ^ List all users in the organization. -}
  }

newtype SamsaraClient a = SamsaraClient
  { runClient :: ClientEnv -> ExceptT ServantError IO a
  } deriving Functor

instance Applicative SamsaraClient where
  pure x = SamsaraClient (\_ -> pure x)
  (SamsaraClient f) <*> (SamsaraClient x) =
    SamsaraClient (\env -> f env <*> x env)

instance Monad SamsaraClient where
  (SamsaraClient a) >>= f =
    SamsaraClient (\env -> do
      value <- a env
      runClient (f value) env)

instance MonadIO SamsaraClient where
  liftIO io = SamsaraClient (\_ -> liftIO io)

createSamsaraClient :: SamsaraBackend SamsaraClient
createSamsaraClient = SamsaraBackend{..}
  where
    ((coerce -> getAllAssetCurrentLocations) :<|>
     (coerce -> getAllAssets) :<|>
     (coerce -> getAssetLocation) :<|>
     (coerce -> getAssetReefer) :<|>
     (coerce -> createDriver) :<|>
     (coerce -> deactivateDriver) :<|>
     (coerce -> getAllDeactivatedDrivers) :<|>
     (coerce -> getDeactivatedDriverById) :<|>
     (coerce -> getDriverById) :<|>
     (coerce -> reactivateDriverById) :<|>
     (coerce -> addFleetAddress) :<|>
     (coerce -> addOrganizationAddresses) :<|>
     (coerce -> createDispatchRoute) :<|>
     (coerce -> createDriver) :<|>
     (coerce -> createDriverDispatchRoute) :<|>
     (coerce -> createDriverDocument) :<|>
     (coerce -> createDvir) :<|>
     (coerce -> createVehicleDispatchRoute) :<|>
     (coerce -> deactivateDriver) :<|>
     (coerce -> deleteDispatchRouteById) :<|>
     (coerce -> deleteOrganizationAddress) :<|>
     (coerce -> fetchAllDispatchRoutes) :<|>
     (coerce -> fetchAllRouteJobUpdates) :<|>
     (coerce -> getAllAssetCurrentLocations) :<|>
     (coerce -> getAllAssets) :<|>
     (coerce -> getAllDeactivatedDrivers) :<|>
     (coerce -> getAssetLocation) :<|>
     (coerce -> getAssetReefer) :<|>
     (coerce -> getDeactivatedDriverById) :<|>
     (coerce -> getDispatchRouteById) :<|>
     (coerce -> getDispatchRouteHistory) :<|>
     (coerce -> getDispatchRoutesByDriverId) :<|>
     (coerce -> getDispatchRoutesByVehicleId) :<|>
     (coerce -> getDriverById) :<|>
     (coerce -> getDriverDocumentTypesByOrgId) :<|>
     (coerce -> getDriverDocumentsByOrgId) :<|>
     (coerce -> getDriverSafetyScore) :<|>
     (coerce -> getDvirs) :<|>
     (coerce -> getFleetDrivers) :<|>
     (coerce -> getFleetDriversHosDailyLogs) :<|>
     (coerce -> getFleetDriversSummary) :<|>
     (coerce -> getFleetHosAuthenticationLogs) :<|>
     (coerce -> getFleetHosLogs) :<|>
     (coerce -> getFleetHosLogsSummary) :<|>
     (coerce -> getFleetLocations) :<|>
     (coerce -> getFleetMaintenanceList) :<|>
     (coerce -> getFleetTrips) :<|>
     (coerce -> getFleetVehicle) :<|>
     (coerce -> getOrganizationAddress) :<|>
     (coerce -> getOrganizationAddresses) :<|>
     (coerce -> getOrganizationContact) :<|>
     (coerce -> getVehicleHarshEvent) :<|>
     (coerce -> getVehicleLocations) :<|>
     (coerce -> getVehicleSafetyScore) :<|>
     (coerce -> getVehicleStats) :<|>
     (coerce -> getVehiclesLocations) :<|>
     (coerce -> listContacts) :<|>
     (coerce -> listFleet) :<|>
     (coerce -> patchFleetVehicle) :<|>
     (coerce -> reactivateDriverById) :<|>
     (coerce -> updateDispatchRouteById) :<|>
     (coerce -> updateOrganizationAddress) :<|>
     (coerce -> updateVehicles) :<|>
     (coerce -> getAllDataInputs) :<|>
     (coerce -> getDataInput) :<|>
     (coerce -> getMachines) :<|>
     (coerce -> getMachinesHistory) :<|>
     (coerce -> createDispatchRoute) :<|>
     (coerce -> createDriverDispatchRoute) :<|>
     (coerce -> createVehicleDispatchRoute) :<|>
     (coerce -> deleteDispatchRouteById) :<|>
     (coerce -> fetchAllDispatchRoutes) :<|>
     (coerce -> fetchAllRouteJobUpdates) :<|>
     (coerce -> getDispatchRouteById) :<|>
     (coerce -> getDispatchRouteHistory) :<|>
     (coerce -> getDispatchRoutesByDriverId) :<|>
     (coerce -> getDispatchRoutesByVehicleId) :<|>
     (coerce -> updateDispatchRouteById) :<|>
     (coerce -> getDriverSafetyScore) :<|>
     (coerce -> getVehicleHarshEvent) :<|>
     (coerce -> getVehicleSafetyScore) :<|>
     (coerce -> getSensors) :<|>
     (coerce -> getSensorsCargo) :<|>
     (coerce -> getSensorsDoor) :<|>
     (coerce -> getSensorsHistory) :<|>
     (coerce -> getSensorsHumidity) :<|>
     (coerce -> getSensorsTemperature) :<|>
     (coerce -> createTag) :<|>
     (coerce -> deleteTagById) :<|>
     (coerce -> getAllTags) :<|>
     (coerce -> getTagById) :<|>
     (coerce -> modifyTagById) :<|>
     (coerce -> updateTagById) :<|>
     (coerce -> deleteUserById) :<|>
     (coerce -> getUserById) :<|>
     (coerce -> listUserRoles) :<|>
     (coerce -> listUsers)) = client (Proxy :: Proxy SamsaraAPI)

-- | Run requests in the SamsaraClient monad.
runSamsaraClient :: Config -> SamsaraClient a -> ExceptT ServantError IO a
runSamsaraClient clientConfig cl = do
  manager <- liftIO $ newManager tlsManagerSettings
  runSamsaraClientWithManager manager clientConfig cl

-- | Run requests in the SamsaraClient monad using a custom manager.
runSamsaraClientWithManager :: Manager -> Config -> SamsaraClient a -> ExceptT ServantError IO a
runSamsaraClientWithManager manager Config{..} cl = do
  url <- parseBaseUrl configUrl
  runClient cl $ mkClientEnv manager url

-- | Like @runClient@, but returns the response or throws
--   a SamsaraClientError
callSamsara
  :: (MonadIO m, MonadThrow m)
  => ClientEnv -> SamsaraClient a -> m a
callSamsara env f = do
  res <- liftIO $ runExceptT $ runClient f env
  case res of
    Left err       -> throwM (SamsaraClientError err)
    Right response -> pure response

-- | Run the Samsara server at the provided host and port.
runSamsaraServer
  :: (MonadIO m, MonadThrow m)
  => Config -> SamsaraBackend (ExceptT ServantErr IO) -> m ()
runSamsaraServer Config{..} backend = do
  url <- parseBaseUrl configUrl
  let warpSettings = Warp.defaultSettings
        & Warp.setPort (baseUrlPort url)
        & Warp.setHost (fromString $ baseUrlHost url)
  liftIO $ Warp.runSettings warpSettings $ serve (Proxy :: Proxy SamsaraAPI) (serverFromBackend backend)
  where
    serverFromBackend SamsaraBackend{..} =
      (coerce getAllAssetCurrentLocations :<|>
       coerce getAllAssets :<|>
       coerce getAssetLocation :<|>
       coerce getAssetReefer :<|>
       coerce createDriver :<|>
       coerce deactivateDriver :<|>
       coerce getAllDeactivatedDrivers :<|>
       coerce getDeactivatedDriverById :<|>
       coerce getDriverById :<|>
       coerce reactivateDriverById :<|>
       coerce addFleetAddress :<|>
       coerce addOrganizationAddresses :<|>
       coerce createDispatchRoute :<|>
       coerce createDriver :<|>
       coerce createDriverDispatchRoute :<|>
       coerce createDriverDocument :<|>
       coerce createDvir :<|>
       coerce createVehicleDispatchRoute :<|>
       coerce deactivateDriver :<|>
       coerce deleteDispatchRouteById :<|>
       coerce deleteOrganizationAddress :<|>
       coerce fetchAllDispatchRoutes :<|>
       coerce fetchAllRouteJobUpdates :<|>
       coerce getAllAssetCurrentLocations :<|>
       coerce getAllAssets :<|>
       coerce getAllDeactivatedDrivers :<|>
       coerce getAssetLocation :<|>
       coerce getAssetReefer :<|>
       coerce getDeactivatedDriverById :<|>
       coerce getDispatchRouteById :<|>
       coerce getDispatchRouteHistory :<|>
       coerce getDispatchRoutesByDriverId :<|>
       coerce getDispatchRoutesByVehicleId :<|>
       coerce getDriverById :<|>
       coerce getDriverDocumentTypesByOrgId :<|>
       coerce getDriverDocumentsByOrgId :<|>
       coerce getDriverSafetyScore :<|>
       coerce getDvirs :<|>
       coerce getFleetDrivers :<|>
       coerce getFleetDriversHosDailyLogs :<|>
       coerce getFleetDriversSummary :<|>
       coerce getFleetHosAuthenticationLogs :<|>
       coerce getFleetHosLogs :<|>
       coerce getFleetHosLogsSummary :<|>
       coerce getFleetLocations :<|>
       coerce getFleetMaintenanceList :<|>
       coerce getFleetTrips :<|>
       coerce getFleetVehicle :<|>
       coerce getOrganizationAddress :<|>
       coerce getOrganizationAddresses :<|>
       coerce getOrganizationContact :<|>
       coerce getVehicleHarshEvent :<|>
       coerce getVehicleLocations :<|>
       coerce getVehicleSafetyScore :<|>
       coerce getVehicleStats :<|>
       coerce getVehiclesLocations :<|>
       coerce listContacts :<|>
       coerce listFleet :<|>
       coerce patchFleetVehicle :<|>
       coerce reactivateDriverById :<|>
       coerce updateDispatchRouteById :<|>
       coerce updateOrganizationAddress :<|>
       coerce updateVehicles :<|>
       coerce getAllDataInputs :<|>
       coerce getDataInput :<|>
       coerce getMachines :<|>
       coerce getMachinesHistory :<|>
       coerce createDispatchRoute :<|>
       coerce createDriverDispatchRoute :<|>
       coerce createVehicleDispatchRoute :<|>
       coerce deleteDispatchRouteById :<|>
       coerce fetchAllDispatchRoutes :<|>
       coerce fetchAllRouteJobUpdates :<|>
       coerce getDispatchRouteById :<|>
       coerce getDispatchRouteHistory :<|>
       coerce getDispatchRoutesByDriverId :<|>
       coerce getDispatchRoutesByVehicleId :<|>
       coerce updateDispatchRouteById :<|>
       coerce getDriverSafetyScore :<|>
       coerce getVehicleHarshEvent :<|>
       coerce getVehicleSafetyScore :<|>
       coerce getSensors :<|>
       coerce getSensorsCargo :<|>
       coerce getSensorsDoor :<|>
       coerce getSensorsHistory :<|>
       coerce getSensorsHumidity :<|>
       coerce getSensorsTemperature :<|>
       coerce createTag :<|>
       coerce deleteTagById :<|>
       coerce getAllTags :<|>
       coerce getTagById :<|>
       coerce modifyTagById :<|>
       coerce updateTagById :<|>
       coerce deleteUserById :<|>
       coerce getUserById :<|>
       coerce listUserRoles :<|>
       coerce listUsers)
