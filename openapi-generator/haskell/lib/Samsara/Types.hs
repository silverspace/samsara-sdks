{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Samsara.Types (
  Address (..),
  AddressGeofence (..),
  AddressGeofenceCircle (..),
  AddressGeofencePolygon (..),
  AddressGeofencePolygonVertices (..),
  AddressesAddresses (..),
  AllRouteJobUpdates (..),
  Asset (..),
  AssetCable (..),
  AssetCurrentLocation (..),
  AssetCurrentLocationsResponse (..),
  AssetReeferResponse (..),
  AssetReeferResponseReeferStats (..),
  AssetReeferResponseReeferStatsAlarms (..),
  AssetReeferResponseReeferStatsAlarms1 (..),
  AssetReeferResponseReeferStatsEngineHours (..),
  AssetReeferResponseReeferStatsFuelPercentage (..),
  AssetReeferResponseReeferStatsPowerStatus (..),
  AssetReeferResponseReeferStatsReturnAirTemp (..),
  AssetReeferResponseReeferStatsSetPoint (..),
  AuxInput (..),
  AuxInputSeries (..),
  CargoResponse (..),
  CargoResponseSensors (..),
  Contact (..),
  CurrentDriver (..),
  DataInputHistoryResponse (..),
  DataInputHistoryResponsePoints (..),
  DispatchJob (..),
  DispatchJobCreate (..),
  DispatchRoute (..),
  DispatchRouteBase (..),
  DispatchRouteCreate (..),
  DispatchRouteHistoricalEntry (..),
  DispatchRouteHistory (..),
  Document (..),
  DocumentBase (..),
  DocumentCreate (..),
  DocumentField (..),
  DocumentFieldCreate (..),
  DocumentFieldCreatePhotoValue (..),
  DocumentFieldType (..),
  DocumentFieldTypeNumberValueTypeMetadata (..),
  DocumentType (..),
  DoorResponse (..),
  DoorResponseSensors (..),
  Driver (..),
  DriverBase (..),
  DriverDailyLogResponse (..),
  DriverDailyLogResponseDays (..),
  DriverForCreate (..),
  DriverSafetyScoreResponse (..),
  DriversResponse (..),
  DriversSummaryResponse (..),
  DriversSummaryResponseSummaries (..),
  DvirBase (..),
  DvirBaseAuthorSignature (..),
  DvirBaseMechanicOrAgentSignature (..),
  DvirBaseNextDriverSignature (..),
  DvirBaseTrailerDefects (..),
  DvirBaseVehicle (..),
  DvirListResponse (..),
  EngineState (..),
  FleetVehicleLocation (..),
  FleetVehicleResponse (..),
  FleetVehicleResponseVehicleInfo (..),
  HosAuthenticationLogsResponse (..),
  HosAuthenticationLogsResponseAuthenticationLogs (..),
  HosLogsResponse (..),
  HosLogsResponseLogs (..),
  HosLogsSummaryResponse (..),
  HosLogsSummaryResponseDrivers (..),
  HumidityResponse (..),
  HumidityResponseSensors (..),
  InlineObject (..),
  InlineObject1 (..),
  InlineObject10 (..),
  InlineObject11 (..),
  InlineObject12 (..),
  InlineObject13 (..),
  InlineObject14 (..),
  InlineObject15 (..),
  InlineObject16 (..),
  InlineObject17 (..),
  InlineObject18 (..),
  InlineObject19 (..),
  InlineObject2 (..),
  InlineObject20 (..),
  InlineObject21 (..),
  InlineObject22 (..),
  InlineObject23 (..),
  InlineObject24 (..),
  InlineObject3 (..),
  InlineObject4 (..),
  InlineObject5 (..),
  InlineObject6 (..),
  InlineObject7 (..),
  InlineObject8 (..),
  InlineObject9 (..),
  InlineResponse200 (..),
  InlineResponse2001 (..),
  InlineResponse2002 (..),
  InlineResponse2003 (..),
  InlineResponse2004 (..),
  InlineResponse2005 (..),
  InlineResponse2005VehicleStats (..),
  InlineResponse2006 (..),
  InlineResponse2007 (..),
  InlineResponse2008 (..),
  InlineResponse2009 (..),
  JobStatus (..),
  JobUpdateObject (..),
  Machine (..),
  MachineHistoryResponse (..),
  MachineHistoryResponseMachines (..),
  MachineHistoryResponseVibrations (..),
  Pagination (..),
  PrevJobStatus (..),
  SafetyReportHarshEvent (..),
  Sensor (..),
  SensorHistoryResponse (..),
  SensorHistoryResponseResults (..),
  SensorsHistorySeries (..),
  Tag (..),
  TagCreate (..),
  TagMetadata (..),
  TagModify (..),
  TagModifyAdd (..),
  TagModifyDelete (..),
  TagUpdate (..),
  TaggedAddress (..),
  TaggedAddressBase (..),
  TaggedAsset (..),
  TaggedAssetBase (..),
  TaggedDriver (..),
  TaggedDriverBase (..),
  TaggedMachine (..),
  TaggedMachineBase (..),
  TaggedSensor (..),
  TaggedSensorBase (..),
  TaggedVehicle (..),
  TaggedVehicleBase (..),
  TemperatureResponse (..),
  TemperatureResponseSensors (..),
  TripResponse (..),
  TripResponseEndCoordinates (..),
  TripResponseStartCoordinates (..),
  TripResponseTrips (..),
  User (..),
  UserBase (..),
  UserRole (..),
  UserTagRole (..),
  UserTagRoleTag (..),
  Vehicle (..),
  VehicleHarshEventResponse (..),
  VehicleHarshEventResponseLocation (..),
  VehicleLocation (..),
  VehicleMaintenance (..),
  VehicleMaintenanceJ1939 (..),
  VehicleMaintenanceJ1939CheckEngineLight (..),
  VehicleMaintenanceJ1939DiagnosticTroubleCodes (..),
  VehicleMaintenancePassenger (..),
  VehicleMaintenancePassengerCheckEngineLight (..),
  VehicleMaintenancePassengerDiagnosticTroubleCodes (..),
  VehicleSafetyScoreResponse (..),
  ) where

import Data.Data (Data)
import Data.UUID (UUID)
import Data.List (stripPrefix)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import Data.Text (Text)
import Data.Time
import Data.Swagger (ToSchema, declareNamedSchema)
import qualified Data.Swagger as Swagger
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)
import Data.Function ((&))


-- | Information about an address/geofence. Geofences are either a circle or a polygon.
data Address = Address
  { addressContacts :: Maybe [Contact] -- ^ 
  , addressFormattedAddress :: Maybe Text -- ^ The full address associated with this address/geofence, as it might be recognized by maps.google.com
  , addressGeofence :: Maybe AddressGeofence -- ^ 
  , addressId :: Maybe Integer -- ^ ID of the address
  , addressName :: Maybe Text -- ^ Name of the address or geofence
  , addressNotes :: Maybe Text -- ^ Notes associated with an address.
  , addressTags :: Maybe [TagMetadata] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Address where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "address")
instance ToJSON Address where
  toJSON = genericToJSON (removeFieldLabelPrefix False "address")


-- | The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
data AddressGeofence = AddressGeofence
  { addressGeofenceCircle :: Maybe AddressGeofenceCircle -- ^ 
  , addressGeofencePolygon :: Maybe AddressGeofencePolygon -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AddressGeofence where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "addressGeofence")
instance ToJSON AddressGeofence where
  toJSON = genericToJSON (removeFieldLabelPrefix False "addressGeofence")


-- | Information about a circular geofence. This field is only populated if the geofence is a circle.
data AddressGeofenceCircle = AddressGeofenceCircle
  { addressGeofenceCircleLatitude :: Maybe Double -- ^ The latitude of the center of the circular geofence
  , addressGeofenceCircleRadiusMeters :: Maybe Integer -- ^ The radius of the circular geofence
  , addressGeofenceCircleLongitude :: Maybe Double -- ^ The longitude of the center of the circular geofence
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AddressGeofenceCircle where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "addressGeofenceCircle")
instance ToJSON AddressGeofenceCircle where
  toJSON = genericToJSON (removeFieldLabelPrefix False "addressGeofenceCircle")


-- | Information about a polygon geofence. This field is only populated if the geofence is a polygon.
data AddressGeofencePolygon = AddressGeofencePolygon
  { addressGeofencePolygonVertices :: Maybe [AddressGeofencePolygonVertices] -- ^ The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AddressGeofencePolygon where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "addressGeofencePolygon")
instance ToJSON AddressGeofencePolygon where
  toJSON = genericToJSON (removeFieldLabelPrefix False "addressGeofencePolygon")


-- | 
data AddressGeofencePolygonVertices = AddressGeofencePolygonVertices
  { addressGeofencePolygonVerticesLatitude :: Maybe Double -- ^ The longitude of a geofence vertex
  , addressGeofencePolygonVerticesLongitude :: Maybe Double -- ^ The longitude of a geofence vertex
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AddressGeofencePolygonVertices where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "addressGeofencePolygonVertices")
instance ToJSON AddressGeofencePolygonVertices where
  toJSON = genericToJSON (removeFieldLabelPrefix False "addressGeofencePolygonVertices")


-- | 
data AddressesAddresses = AddressesAddresses
  { addressesAddressesNotes :: Maybe Text -- ^ Notes associated with an address.
  , addressesAddressesFormattedAddress :: Text -- ^ The full address associated with this address/geofence, as it might be recognized by maps.google.com
  , addressesAddressesGeofence :: AddressGeofence -- ^ 
  , addressesAddressesTagIds :: Maybe [Integer] -- ^ A list of tag IDs.
  , addressesAddressesName :: Text -- ^ The name of this address/geofence
  , addressesAddressesContactIds :: Maybe [Integer] -- ^ A list of IDs for contact book entries.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AddressesAddresses where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "addressesAddresses")
instance ToJSON AddressesAddresses where
  toJSON = genericToJSON (removeFieldLabelPrefix False "addressesAddresses")


-- | 
data AllRouteJobUpdates = AllRouteJobUpdates
  { allRouteJobUpdatesJobUnderscoreupdates :: Maybe [JobUpdateObject] -- ^ 
  , allRouteJobUpdatesSequenceUnderscoreid :: Maybe Text -- ^ Sequence ID of the last update returned in the response
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AllRouteJobUpdates where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "allRouteJobUpdates")
instance ToJSON AllRouteJobUpdates where
  toJSON = genericToJSON (removeFieldLabelPrefix False "allRouteJobUpdates")


-- | Basic information of an asset
data Asset = Asset
  { assetAssetSerialNumber :: Maybe Text -- ^ Serial number of the host asset
  , assetCable :: Maybe [AssetCable] -- ^ The cable connected to the asset
  , assetEngineHours :: Maybe Int -- ^ Engine hours
  , assetId :: Integer -- ^ Asset ID
  , assetName :: Maybe Text -- ^ Asset name
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Asset where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "asset")
instance ToJSON Asset where
  toJSON = genericToJSON (removeFieldLabelPrefix False "asset")


-- | 
data AssetCable = AssetCable
  { assetCableAssetType :: Maybe Text -- ^ Asset type
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssetCable where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "assetCable")
instance ToJSON AssetCable where
  toJSON = genericToJSON (removeFieldLabelPrefix False "assetCable")


-- | Current location of an asset
data AssetCurrentLocation = AssetCurrentLocation
  { assetCurrentLocationLatitude :: Maybe Double -- ^ The latitude of the location in degrees.
  , assetCurrentLocationLocation :: Maybe Text -- ^ The best effort (street,city,state) for the latitude and longitude.
  , assetCurrentLocationLongitude :: Maybe Double -- ^ The longitude of the location in degrees.
  , assetCurrentLocationSpeedMilesPerHour :: Maybe Double -- ^ The speed calculated from GPS that the asset was traveling at in miles per hour.
  , assetCurrentLocationTimeMs :: Maybe Integer -- ^ Time in Unix milliseconds since epoch when the asset was at the location.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssetCurrentLocation where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "assetCurrentLocation")
instance ToJSON AssetCurrentLocation where
  toJSON = genericToJSON (removeFieldLabelPrefix False "assetCurrentLocation")


-- | Basic information of an asset
data AssetCurrentLocationsResponse = AssetCurrentLocationsResponse
  { assetCurrentLocationsResponseCable :: Maybe [AssetCable] -- ^ The cable connected to the asset
  , assetCurrentLocationsResponseEngineHours :: Maybe Int -- ^ Engine hours
  , assetCurrentLocationsResponseId :: Integer -- ^ Asset ID
  , assetCurrentLocationsResponseLocation :: Maybe [AssetCurrentLocation] -- ^ Current location of an asset
  , assetCurrentLocationsResponseName :: Maybe Text -- ^ Asset name
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssetCurrentLocationsResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "assetCurrentLocationsResponse")
instance ToJSON AssetCurrentLocationsResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "assetCurrentLocationsResponse")


-- | Reefer-specific asset details
data AssetReeferResponse = AssetReeferResponse
  { assetReeferResponseAssetType :: Maybe Text -- ^ Asset type
  , assetReeferResponseId :: Maybe Int -- ^ Asset ID
  , assetReeferResponseName :: Maybe Text -- ^ Asset name
  , assetReeferResponseReeferStats :: Maybe AssetReeferResponseReeferStats -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssetReeferResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "assetReeferResponse")
instance ToJSON AssetReeferResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "assetReeferResponse")


-- | 
data AssetReeferResponseReeferStats = AssetReeferResponseReeferStats
  { assetReeferResponseReeferStatsFuelPercentage :: Maybe [AssetReeferResponseReeferStatsFuelPercentage] -- ^ Fuel percentage of the reefer
  , assetReeferResponseReeferStatsPowerStatus :: Maybe [AssetReeferResponseReeferStatsPowerStatus] -- ^ Power status of the reefer
  , assetReeferResponseReeferStatsEngineHours :: Maybe [AssetReeferResponseReeferStatsEngineHours] -- ^ Engine hours of the reefer
  , assetReeferResponseReeferStatsSetPoint :: Maybe [AssetReeferResponseReeferStatsSetPoint] -- ^ Set point temperature of the reefer
  , assetReeferResponseReeferStatsReturnAirTemp :: Maybe [AssetReeferResponseReeferStatsReturnAirTemp] -- ^ Return air temperature of the reefer
  , assetReeferResponseReeferStatsAlarms :: Maybe [AssetReeferResponseReeferStatsAlarms1] -- ^ Reefer alarms
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssetReeferResponseReeferStats where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "assetReeferResponseReeferStats")
instance ToJSON AssetReeferResponseReeferStats where
  toJSON = genericToJSON (removeFieldLabelPrefix False "assetReeferResponseReeferStats")


-- | 
data AssetReeferResponseReeferStatsAlarms = AssetReeferResponseReeferStatsAlarms
  { assetReeferResponseReeferStatsAlarmsSeverity :: Maybe Integer -- ^ Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
  , assetReeferResponseReeferStatsAlarmsOperatorAction :: Maybe Text -- ^ Recommended operator action
  , assetReeferResponseReeferStatsAlarmsDescription :: Maybe Text -- ^ Description of the alarm
  , assetReeferResponseReeferStatsAlarmsAlarmCode :: Maybe Integer -- ^ ID of the alarm
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssetReeferResponseReeferStatsAlarms where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "assetReeferResponseReeferStatsAlarms")
instance ToJSON AssetReeferResponseReeferStatsAlarms where
  toJSON = genericToJSON (removeFieldLabelPrefix False "assetReeferResponseReeferStatsAlarms")


-- | 
data AssetReeferResponseReeferStatsAlarms1 = AssetReeferResponseReeferStatsAlarms1
  { assetReeferResponseReeferStatsAlarms1Alarms :: Maybe [AssetReeferResponseReeferStatsAlarms] -- ^ 
  , assetReeferResponseReeferStatsAlarms1ChangedAtMs :: Maybe Integer -- ^ Timestamp when the alarms were reported, in Unix milliseconds since epoch
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssetReeferResponseReeferStatsAlarms1 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "assetReeferResponseReeferStatsAlarms1")
instance ToJSON AssetReeferResponseReeferStatsAlarms1 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "assetReeferResponseReeferStatsAlarms1")


-- | 
data AssetReeferResponseReeferStatsEngineHours = AssetReeferResponseReeferStatsEngineHours
  { assetReeferResponseReeferStatsEngineHoursEngineHours :: Maybe Integer -- ^ Engine hours of the reefer.
  , assetReeferResponseReeferStatsEngineHoursChangedAtMs :: Maybe Integer -- ^ Timestamp in Unix milliseconds since epoch.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssetReeferResponseReeferStatsEngineHours where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "assetReeferResponseReeferStatsEngineHours")
instance ToJSON AssetReeferResponseReeferStatsEngineHours where
  toJSON = genericToJSON (removeFieldLabelPrefix False "assetReeferResponseReeferStatsEngineHours")


-- | 
data AssetReeferResponseReeferStatsFuelPercentage = AssetReeferResponseReeferStatsFuelPercentage
  { assetReeferResponseReeferStatsFuelPercentageFuelPercentage :: Maybe Integer -- ^ Fuel percentage of the reefer.
  , assetReeferResponseReeferStatsFuelPercentageChangedAtMs :: Maybe Integer -- ^ Timestamp in Unix milliseconds since epoch.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssetReeferResponseReeferStatsFuelPercentage where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "assetReeferResponseReeferStatsFuelPercentage")
instance ToJSON AssetReeferResponseReeferStatsFuelPercentage where
  toJSON = genericToJSON (removeFieldLabelPrefix False "assetReeferResponseReeferStatsFuelPercentage")


-- | 
data AssetReeferResponseReeferStatsPowerStatus = AssetReeferResponseReeferStatsPowerStatus
  { assetReeferResponseReeferStatsPowerStatusChangedAtMs :: Maybe Integer -- ^ Timestamp in Unix milliseconds since epoch.
  , assetReeferResponseReeferStatsPowerStatusStatus :: Maybe Text -- ^ Power status of the reefer.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssetReeferResponseReeferStatsPowerStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "assetReeferResponseReeferStatsPowerStatus")
instance ToJSON AssetReeferResponseReeferStatsPowerStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "assetReeferResponseReeferStatsPowerStatus")


-- | 
data AssetReeferResponseReeferStatsReturnAirTemp = AssetReeferResponseReeferStatsReturnAirTemp
  { assetReeferResponseReeferStatsReturnAirTempTempInMilliC :: Maybe Integer -- ^ Return air temperature in millidegree Celsius.
  , assetReeferResponseReeferStatsReturnAirTempChangedAtMs :: Maybe Integer -- ^ Timestamp in Unix milliseconds since epoch.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssetReeferResponseReeferStatsReturnAirTemp where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "assetReeferResponseReeferStatsReturnAirTemp")
instance ToJSON AssetReeferResponseReeferStatsReturnAirTemp where
  toJSON = genericToJSON (removeFieldLabelPrefix False "assetReeferResponseReeferStatsReturnAirTemp")


-- | 
data AssetReeferResponseReeferStatsSetPoint = AssetReeferResponseReeferStatsSetPoint
  { assetReeferResponseReeferStatsSetPointTempInMilliC :: Maybe Integer -- ^ Set point temperature in millidegree Celsius.
  , assetReeferResponseReeferStatsSetPointChangedAtMs :: Maybe Integer -- ^ Timestamp in Unix milliseconds since epoch.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssetReeferResponseReeferStatsSetPoint where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "assetReeferResponseReeferStatsSetPoint")
instance ToJSON AssetReeferResponseReeferStatsSetPoint where
  toJSON = genericToJSON (removeFieldLabelPrefix False "assetReeferResponseReeferStatsSetPoint")


-- | Digital value of an aux input.
data AuxInput = AuxInput
  { auxInputTimeMs :: Value -- ^ Timestamp in Unix epoch milliseconds.
  , auxInputValue :: Bool -- ^ Boolean representing the digital value of the aux input.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AuxInput where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "auxInput")
instance ToJSON AuxInput where
  toJSON = genericToJSON (removeFieldLabelPrefix False "auxInput")


-- | A list of aux input values over a timerange.
data AuxInputSeries = AuxInputSeries
  { auxInputSeriesName :: Text -- ^ The name of the aux input.
  , auxInputSeriesValues :: [AuxInput] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AuxInputSeries where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "auxInputSeries")
instance ToJSON AuxInputSeries where
  toJSON = genericToJSON (removeFieldLabelPrefix False "auxInputSeries")


-- | Contains the current cargo status of a sensor.
data CargoResponse = CargoResponse
  { cargoResponseGroupId :: Maybe Integer -- ^ 
  , cargoResponseSensors :: Maybe [CargoResponseSensors] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CargoResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "cargoResponse")
instance ToJSON CargoResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "cargoResponse")


-- | 
data CargoResponseSensors = CargoResponseSensors
  { cargoResponseSensorsCargoEmpty :: Maybe Bool -- ^ Flag indicating whether the current cargo is empty or loaded.
  , cargoResponseSensorsName :: Maybe Text -- ^ Name of the sensor.
  , cargoResponseSensorsId :: Maybe Integer -- ^ ID of the sensor.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CargoResponseSensors where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "cargoResponseSensors")
instance ToJSON CargoResponseSensors where
  toJSON = genericToJSON (removeFieldLabelPrefix False "cargoResponseSensors")


-- | Information about a notification contact for alerts.
data Contact = Contact
  { contactEmail :: Maybe Text -- ^ Email address of the contact
  , contactFirstName :: Maybe Text -- ^ First name of the contact
  , contactId :: Maybe Integer -- ^ ID of the contact
  , contactLastName :: Maybe Text -- ^ Last name of the contact
  , contactPhone :: Maybe Text -- ^ Phone number of the contact
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Contact where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "contact")
instance ToJSON Contact where
  toJSON = genericToJSON (removeFieldLabelPrefix False "contact")


-- | 
data CurrentDriver = CurrentDriver
  { 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CurrentDriver where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "currentDriver")
instance ToJSON CurrentDriver where
  toJSON = genericToJSON (removeFieldLabelPrefix False "currentDriver")


-- | 
data DataInputHistoryResponse = DataInputHistoryResponse
  { dataInputHistoryResponseId :: Maybe Integer -- ^ The ID of this data input
  , dataInputHistoryResponseName :: Text -- ^ Name of this data input
  , dataInputHistoryResponsePoints :: Maybe [DataInputHistoryResponsePoints] -- ^ Data points from this data input
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DataInputHistoryResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dataInputHistoryResponse")
instance ToJSON DataInputHistoryResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dataInputHistoryResponse")


-- | 
data DataInputHistoryResponsePoints = DataInputHistoryResponsePoints
  { dataInputHistoryResponsePointsValue :: Maybe Double -- ^ 
  , dataInputHistoryResponsePointsTimeMs :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DataInputHistoryResponsePoints where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dataInputHistoryResponsePoints")
instance ToJSON DataInputHistoryResponsePoints where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dataInputHistoryResponsePoints")


-- | 
data DispatchJob = DispatchJob
  { dispatchJobDestinationUnderscoreaddress :: Maybe Text -- ^ The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
  , dispatchJobDestinationUnderscoreaddressUnderscoreid :: Maybe Integer -- ^ ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
  , dispatchJobDestinationUnderscorelat :: Maybe Double -- ^ Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
  , dispatchJobDestinationUnderscorelng :: Maybe Double -- ^ Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
  , dispatchJobDestinationUnderscorename :: Maybe Text -- ^ The name of the job destination. If provided, it will take precedence over the name of the address book entry.
  , dispatchJobNotes :: Maybe Text -- ^ Notes regarding the details of this job.
  , dispatchJobScheduledUnderscorearrivalUnderscoretimeUnderscorems :: Integer -- ^ The time at which the assigned driver is scheduled to arrive at the job destination.
  , dispatchJobScheduledUnderscoredepartureUnderscoretimeUnderscorems :: Maybe Integer -- ^ The time at which the assigned driver is scheduled to depart from the job destination.
  , dispatchJobArrivedUnderscoreatUnderscorems :: Maybe Integer -- ^ The time at which the driver arrived at the job destination.
  , dispatchJobCompletedUnderscoreatUnderscorems :: Maybe Integer -- ^ The time at which the job was marked complete (e.g. started driving to the next destination).
  , dispatchJobDispatchUnderscorerouteUnderscoreid :: Integer -- ^ ID of the route that this job belongs to.
  , dispatchJobDriverUnderscoreid :: Maybe Integer -- ^ ID of the driver assigned to the dispatch job.
  , dispatchJobEnUnderscorerouteUnderscoreatUnderscorems :: Maybe Integer -- ^ The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
  , dispatchJobEstimatedUnderscorearrivalUnderscorems :: Maybe Integer -- ^ The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
  , dispatchJobFleetUnderscoreviewerUnderscoreurl :: Maybe Text -- ^ Fleet viewer url of the dispatch job.
  , dispatchJobGroupUnderscoreid :: Integer -- ^ 
  , dispatchJobId :: Integer -- ^ ID of the Samsara dispatch job.
  , dispatchJobJobUnderscorestate :: JobStatus -- ^ 
  , dispatchJobSkippedUnderscoreatUnderscorems :: Maybe Integer -- ^ The time at which the job was marked skipped.
  , dispatchJobVehicleUnderscoreid :: Maybe Integer -- ^ ID of the vehicle used for the dispatch job.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DispatchJob where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dispatchJob")
instance ToJSON DispatchJob where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dispatchJob")


-- | 
data DispatchJobCreate = DispatchJobCreate
  { dispatchJobCreateDestinationUnderscoreaddress :: Maybe Text -- ^ The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
  , dispatchJobCreateDestinationUnderscoreaddressUnderscoreid :: Maybe Integer -- ^ ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
  , dispatchJobCreateDestinationUnderscorelat :: Maybe Double -- ^ Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
  , dispatchJobCreateDestinationUnderscorelng :: Maybe Double -- ^ Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
  , dispatchJobCreateDestinationUnderscorename :: Maybe Text -- ^ The name of the job destination. If provided, it will take precedence over the name of the address book entry.
  , dispatchJobCreateNotes :: Maybe Text -- ^ Notes regarding the details of this job.
  , dispatchJobCreateScheduledUnderscorearrivalUnderscoretimeUnderscorems :: Integer -- ^ The time at which the assigned driver is scheduled to arrive at the job destination.
  , dispatchJobCreateScheduledUnderscoredepartureUnderscoretimeUnderscorems :: Maybe Integer -- ^ The time at which the assigned driver is scheduled to depart from the job destination.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DispatchJobCreate where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dispatchJobCreate")
instance ToJSON DispatchJobCreate where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dispatchJobCreate")


-- | 
data DispatchRoute = DispatchRoute
  { dispatchRouteActualUnderscoreendUnderscorems :: Maybe Integer -- ^ The time in Unix epoch milliseconds that the route actually ended.
  , dispatchRouteActualUnderscorestartUnderscorems :: Maybe Integer -- ^ The time in Unix epoch milliseconds that the route actually started.
  , dispatchRouteDriverUnderscoreid :: Maybe Integer -- ^ ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
  , dispatchRouteGroupUnderscoreid :: Maybe Integer -- ^ ID of the group if the organization has multiple groups (optional).
  , dispatchRouteName :: Text -- ^ Descriptive name of this route.
  , dispatchRouteScheduledUnderscoreendUnderscorems :: Integer -- ^ The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
  , dispatchRouteScheduledUnderscoremeters :: Maybe Integer -- ^ The distance expected to be traveled for this route in meters.
  , dispatchRouteScheduledUnderscorestartUnderscorems :: Integer -- ^ The time in Unix epoch milliseconds that the route is scheduled to start.
  , dispatchRouteStartUnderscorelocationUnderscoreaddress :: Maybe Text -- ^ The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
  , dispatchRouteStartUnderscorelocationUnderscoreaddressUnderscoreid :: Maybe Integer -- ^ ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
  , dispatchRouteStartUnderscorelocationUnderscorelat :: Maybe Double -- ^ Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
  , dispatchRouteStartUnderscorelocationUnderscorelng :: Maybe Double -- ^ Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
  , dispatchRouteStartUnderscorelocationUnderscorename :: Maybe Text -- ^ The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
  , dispatchRouteTrailerUnderscoreid :: Maybe Integer -- ^ ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
  , dispatchRouteVehicleUnderscoreid :: Maybe Integer -- ^ ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
  , dispatchRouteDispatchUnderscorejobs :: [DispatchJob] -- ^ The dispatch jobs associated with this route.
  , dispatchRouteId :: Integer -- ^ ID of the Samsara dispatch route.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DispatchRoute where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dispatchRoute")
instance ToJSON DispatchRoute where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dispatchRoute")


-- | 
data DispatchRouteBase = DispatchRouteBase
  { dispatchRouteBaseActualUnderscoreendUnderscorems :: Maybe Integer -- ^ The time in Unix epoch milliseconds that the route actually ended.
  , dispatchRouteBaseActualUnderscorestartUnderscorems :: Maybe Integer -- ^ The time in Unix epoch milliseconds that the route actually started.
  , dispatchRouteBaseDriverUnderscoreid :: Maybe Integer -- ^ ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
  , dispatchRouteBaseGroupUnderscoreid :: Maybe Integer -- ^ ID of the group if the organization has multiple groups (optional).
  , dispatchRouteBaseName :: Text -- ^ Descriptive name of this route.
  , dispatchRouteBaseScheduledUnderscoreendUnderscorems :: Integer -- ^ The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
  , dispatchRouteBaseScheduledUnderscoremeters :: Maybe Integer -- ^ The distance expected to be traveled for this route in meters.
  , dispatchRouteBaseScheduledUnderscorestartUnderscorems :: Integer -- ^ The time in Unix epoch milliseconds that the route is scheduled to start.
  , dispatchRouteBaseStartUnderscorelocationUnderscoreaddress :: Maybe Text -- ^ The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
  , dispatchRouteBaseStartUnderscorelocationUnderscoreaddressUnderscoreid :: Maybe Integer -- ^ ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
  , dispatchRouteBaseStartUnderscorelocationUnderscorelat :: Maybe Double -- ^ Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
  , dispatchRouteBaseStartUnderscorelocationUnderscorelng :: Maybe Double -- ^ Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
  , dispatchRouteBaseStartUnderscorelocationUnderscorename :: Maybe Text -- ^ The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
  , dispatchRouteBaseTrailerUnderscoreid :: Maybe Integer -- ^ ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
  , dispatchRouteBaseVehicleUnderscoreid :: Maybe Integer -- ^ ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DispatchRouteBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dispatchRouteBase")
instance ToJSON DispatchRouteBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dispatchRouteBase")


-- | 
data DispatchRouteCreate = DispatchRouteCreate
  { dispatchRouteCreateActualUnderscoreendUnderscorems :: Maybe Integer -- ^ The time in Unix epoch milliseconds that the route actually ended.
  , dispatchRouteCreateActualUnderscorestartUnderscorems :: Maybe Integer -- ^ The time in Unix epoch milliseconds that the route actually started.
  , dispatchRouteCreateDriverUnderscoreid :: Maybe Integer -- ^ ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
  , dispatchRouteCreateGroupUnderscoreid :: Maybe Integer -- ^ ID of the group if the organization has multiple groups (optional).
  , dispatchRouteCreateName :: Text -- ^ Descriptive name of this route.
  , dispatchRouteCreateScheduledUnderscoreendUnderscorems :: Integer -- ^ The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
  , dispatchRouteCreateScheduledUnderscoremeters :: Maybe Integer -- ^ The distance expected to be traveled for this route in meters.
  , dispatchRouteCreateScheduledUnderscorestartUnderscorems :: Integer -- ^ The time in Unix epoch milliseconds that the route is scheduled to start.
  , dispatchRouteCreateStartUnderscorelocationUnderscoreaddress :: Maybe Text -- ^ The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
  , dispatchRouteCreateStartUnderscorelocationUnderscoreaddressUnderscoreid :: Maybe Integer -- ^ ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
  , dispatchRouteCreateStartUnderscorelocationUnderscorelat :: Maybe Double -- ^ Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
  , dispatchRouteCreateStartUnderscorelocationUnderscorelng :: Maybe Double -- ^ Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
  , dispatchRouteCreateStartUnderscorelocationUnderscorename :: Maybe Text -- ^ The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
  , dispatchRouteCreateTrailerUnderscoreid :: Maybe Integer -- ^ ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
  , dispatchRouteCreateVehicleUnderscoreid :: Maybe Integer -- ^ ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
  , dispatchRouteCreateDispatchUnderscorejobs :: [DispatchJobCreate] -- ^ The dispatch jobs to create for this route.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DispatchRouteCreate where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dispatchRouteCreate")
instance ToJSON DispatchRouteCreate where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dispatchRouteCreate")


-- | 
data DispatchRouteHistoricalEntry = DispatchRouteHistoricalEntry
  { dispatchRouteHistoricalEntryChangedUnderscoreatUnderscorems :: Maybe Integer -- ^ Timestamp that the route was updated, represented as Unix milliseconds since epoch.
  , dispatchRouteHistoricalEntryRoute :: Maybe DispatchRoute -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DispatchRouteHistoricalEntry where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dispatchRouteHistoricalEntry")
instance ToJSON DispatchRouteHistoricalEntry where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dispatchRouteHistoricalEntry")


-- | 
data DispatchRouteHistory = DispatchRouteHistory
  { dispatchRouteHistoryHistory :: Maybe [DispatchRouteHistoricalEntry] -- ^ History of the route's state changes.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DispatchRouteHistory where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dispatchRouteHistory")
instance ToJSON DispatchRouteHistory where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dispatchRouteHistory")


-- | 
data Document = Document
  { documentDispatchJobId :: Maybe Integer -- ^ ID of the Samsara dispatch job for which the document is submitted
  , documentNotes :: Maybe Text -- ^ Notes submitted with this document.
  , documentDocumentType :: Text -- ^ Descriptive name of this type of document.
  , documentDriverCreatedAtMs :: Integer -- ^ The time in Unix epoch milliseconds that the document is created.
  , documentDriverId :: Integer -- ^ ID of the driver for whom the document is submitted
  , documentFields :: [DocumentField] -- ^ The fields associated with this document.
  , documentVehicleId :: Maybe Integer -- ^ VehicleID of the driver at document creation.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Document where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "document")
instance ToJSON Document where
  toJSON = genericToJSON (removeFieldLabelPrefix False "document")


-- | 
data DocumentBase = DocumentBase
  { documentBaseDispatchJobId :: Maybe Integer -- ^ ID of the Samsara dispatch job for which the document is submitted
  , documentBaseNotes :: Maybe Text -- ^ Notes submitted with this document.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DocumentBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "documentBase")
instance ToJSON DocumentBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "documentBase")


-- | 
data DocumentCreate = DocumentCreate
  { documentCreateDispatchJobId :: Maybe Integer -- ^ ID of the Samsara dispatch job for which the document is submitted
  , documentCreateNotes :: Maybe Text -- ^ Notes submitted with this document.
  , documentCreateDocumentTypeUuid :: Text -- ^ Universally unique identifier for the document type this document is being created for.
  , documentCreateFields :: [DocumentField] -- ^ List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DocumentCreate where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "documentCreate")
instance ToJSON DocumentCreate where
  toJSON = genericToJSON (removeFieldLabelPrefix False "documentCreate")


-- | 
data DocumentField = DocumentField
  { documentFieldNumberValue :: Maybe Double -- ^ Value of this field if this document field has valueType: ValueType_Number.
  , documentFieldPhotoValue :: Maybe [DocumentFieldCreatePhotoValue] -- ^ Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
  , documentFieldStringValue :: Maybe Text -- ^ Value of this field if this document field has valueType: ValueType_String.
  , documentFieldValueType :: Text -- ^ Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
  , documentFieldLabel :: Text -- ^ Descriptive name of this field.
  , documentFieldValue :: Maybe Value -- ^ DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DocumentField where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "documentField")
instance ToJSON DocumentField where
  toJSON = genericToJSON (removeFieldLabelPrefix False "documentField")


-- | 
data DocumentFieldCreate = DocumentFieldCreate
  { documentFieldCreateNumberValue :: Maybe Double -- ^ Value of this field if this document field has valueType: ValueType_Number.
  , documentFieldCreatePhotoValue :: Maybe [DocumentFieldCreatePhotoValue] -- ^ Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
  , documentFieldCreateStringValue :: Maybe Text -- ^ Value of this field if this document field has valueType: ValueType_String.
  , documentFieldCreateValueType :: Text -- ^ Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DocumentFieldCreate where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "documentFieldCreate")
instance ToJSON DocumentFieldCreate where
  toJSON = genericToJSON (removeFieldLabelPrefix False "documentFieldCreate")


-- | 
data DocumentFieldCreatePhotoValue = DocumentFieldCreatePhotoValue
  { documentFieldCreatePhotoValueUrl :: Maybe Text -- ^ Photo URL for a JPG image
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DocumentFieldCreatePhotoValue where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "documentFieldCreatePhotoValue")
instance ToJSON DocumentFieldCreatePhotoValue where
  toJSON = genericToJSON (removeFieldLabelPrefix False "documentFieldCreatePhotoValue")


-- | 
data DocumentFieldType = DocumentFieldType
  { documentFieldTypeLabel :: Text -- ^ Descriptive name of this field type.
  , documentFieldTypeNumberValueTypeMetadata :: Maybe DocumentFieldTypeNumberValueTypeMetadata -- ^ 
  , documentFieldTypeValueType :: Text -- ^ The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DocumentFieldType where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "documentFieldType")
instance ToJSON DocumentFieldType where
  toJSON = genericToJSON (removeFieldLabelPrefix False "documentFieldType")


-- | Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
data DocumentFieldTypeNumberValueTypeMetadata = DocumentFieldTypeNumberValueTypeMetadata
  { documentFieldTypeNumberValueTypeMetadataNumDecimalPlaces :: Maybe Integer -- ^ Number of decimal places that values for this field type can have.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DocumentFieldTypeNumberValueTypeMetadata where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "documentFieldTypeNumberValueTypeMetadata")
instance ToJSON DocumentFieldTypeNumberValueTypeMetadata where
  toJSON = genericToJSON (removeFieldLabelPrefix False "documentFieldTypeNumberValueTypeMetadata")


-- | 
data DocumentType = DocumentType
  { documentTypeFieldTypes :: Maybe [List] -- ^ The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
  , documentTypeName :: Text -- ^ Name of the document type.
  , documentTypeOrgId :: Integer -- ^ ID for the organization this document belongs to.
  , documentTypeUuid :: Text -- ^ Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DocumentType where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "documentType")
instance ToJSON DocumentType where
  toJSON = genericToJSON (removeFieldLabelPrefix False "documentType")


-- | Contains the current door status of a sensor.
data DoorResponse = DoorResponse
  { doorResponseGroupId :: Maybe Integer -- ^ 
  , doorResponseSensors :: Maybe [DoorResponseSensors] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DoorResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "doorResponse")
instance ToJSON DoorResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "doorResponse")


-- | 
data DoorResponseSensors = DoorResponseSensors
  { doorResponseSensorsDoorClosed :: Maybe Bool -- ^ Flag indicating whether the current door is closed or open.
  , doorResponseSensorsName :: Maybe Text -- ^ Name of the sensor.
  , doorResponseSensorsId :: Maybe Integer -- ^ ID of the sensor.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DoorResponseSensors where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "doorResponseSensors")
instance ToJSON DoorResponseSensors where
  toJSON = genericToJSON (removeFieldLabelPrefix False "doorResponseSensors")


-- | 
data Driver = Driver
  { driverEldAdverseWeatherExemptionEnabled :: Maybe Bool -- ^ Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
  , driverEldBigDayExemptionEnabled :: Maybe Bool -- ^ Flag indicating this driver may use Big Day excemptions in ELD logs.
  , driverEldDayStartHour :: Maybe Int -- ^ 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
  , driverEldExempt :: Maybe Bool -- ^ Flag indicating this driver is exempt from the Electronic Logging Mandate.
  , driverEldExemptReason :: Maybe Text -- ^ Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
  , driverEldPcEnabled :: Maybe Bool -- ^ Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
  , driverEldYmEnabled :: Maybe Bool -- ^ Flag indicating this driver may select the Yard Move duty status in ELD logs.
  , driverExternalIds :: Maybe (Map.Map String Text) -- ^ Dictionary of external IDs (string key-value pairs)
  , driverGroupId :: Maybe Integer -- ^ ID of the group if the organization has multiple groups (uncommon).
  , driverLicenseNumber :: Maybe Text -- ^ Driver's state issued license number.
  , driverLicenseState :: Maybe Text -- ^ Abbreviation of state that issued driver's license.
  , driverName :: Text -- ^ Driver's name.
  , driverNotes :: Maybe Text -- ^ Notes about the driver.
  , driverPhone :: Maybe Text -- ^ Driver's phone number. Please include only digits, ex. 4157771234
  , driverUsername :: Maybe Text -- ^ Driver's login username into the driver app.
  , driverVehicleId :: Maybe Integer -- ^ ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
  , driverId :: Integer -- ^ ID of the driver.
  , driverIsDeactivated :: Maybe Bool -- ^ True if the driver account has been deactivated.
  , driverTags :: Maybe [TagMetadata] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Driver where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "driver")
instance ToJSON Driver where
  toJSON = genericToJSON (removeFieldLabelPrefix False "driver")


-- | 
data DriverBase = DriverBase
  { driverBaseEldAdverseWeatherExemptionEnabled :: Maybe Bool -- ^ Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
  , driverBaseEldBigDayExemptionEnabled :: Maybe Bool -- ^ Flag indicating this driver may use Big Day excemptions in ELD logs.
  , driverBaseEldDayStartHour :: Maybe Int -- ^ 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
  , driverBaseEldExempt :: Maybe Bool -- ^ Flag indicating this driver is exempt from the Electronic Logging Mandate.
  , driverBaseEldExemptReason :: Maybe Text -- ^ Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
  , driverBaseEldPcEnabled :: Maybe Bool -- ^ Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
  , driverBaseEldYmEnabled :: Maybe Bool -- ^ Flag indicating this driver may select the Yard Move duty status in ELD logs.
  , driverBaseExternalIds :: Maybe (Map.Map String Text) -- ^ Dictionary of external IDs (string key-value pairs)
  , driverBaseGroupId :: Maybe Integer -- ^ ID of the group if the organization has multiple groups (uncommon).
  , driverBaseLicenseNumber :: Maybe Text -- ^ Driver's state issued license number.
  , driverBaseLicenseState :: Maybe Text -- ^ Abbreviation of state that issued driver's license.
  , driverBaseName :: Text -- ^ Driver's name.
  , driverBaseNotes :: Maybe Text -- ^ Notes about the driver.
  , driverBasePhone :: Maybe Text -- ^ Driver's phone number. Please include only digits, ex. 4157771234
  , driverBaseUsername :: Maybe Text -- ^ Driver's login username into the driver app.
  , driverBaseVehicleId :: Maybe Integer -- ^ ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DriverBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "driverBase")
instance ToJSON DriverBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "driverBase")


-- | 
data DriverDailyLogResponse = DriverDailyLogResponse
  { driverDailyLogResponseDays :: Maybe [DriverDailyLogResponseDays] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DriverDailyLogResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "driverDailyLogResponse")
instance ToJSON DriverDailyLogResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "driverDailyLogResponse")


-- | 
data DriverDailyLogResponseDays = DriverDailyLogResponseDays
  { driverDailyLogResponseDaysCertifiedAtMs :: Maybe Integer -- ^ Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
  , driverDailyLogResponseDaysEndMs :: Maybe Int -- ^ End of the HOS day, specified in milliseconds UNIX time.
  , driverDailyLogResponseDaysStartMs :: Maybe Int -- ^ End of the HOS day, specified in milliseconds UNIX time.
  , driverDailyLogResponseDaysTrailerIds :: Maybe Value -- ^ List of trailer ID's associated with the driver for the day.
  , driverDailyLogResponseDaysActiveHours :: Maybe Double -- ^ Hours spent on duty or driving, rounded to two decimal places.
  , driverDailyLogResponseDaysDistanceMiles :: Maybe Double -- ^ Distance driven in miles, rounded to two decimal places.
  , driverDailyLogResponseDaysActiveMs :: Maybe Integer -- ^ Milliseconds spent on duty or driving.
  , driverDailyLogResponseDaysCertified :: Maybe Bool -- ^ Whether this HOS day chart was certified by the driver.
  , driverDailyLogResponseDaysVehicleIds :: Maybe Value -- ^ List of vehicle ID's associated with the driver for the day.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DriverDailyLogResponseDays where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "driverDailyLogResponseDays")
instance ToJSON DriverDailyLogResponseDays where
  toJSON = genericToJSON (removeFieldLabelPrefix False "driverDailyLogResponseDays")


-- | 
data DriverForCreate = DriverForCreate
  { driverForCreateEldAdverseWeatherExemptionEnabled :: Maybe Bool -- ^ Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
  , driverForCreateEldBigDayExemptionEnabled :: Maybe Bool -- ^ Flag indicating this driver may use Big Day excemptions in ELD logs.
  , driverForCreateEldDayStartHour :: Maybe Int -- ^ 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
  , driverForCreateEldExempt :: Maybe Bool -- ^ Flag indicating this driver is exempt from the Electronic Logging Mandate.
  , driverForCreateEldExemptReason :: Maybe Text -- ^ Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
  , driverForCreateEldPcEnabled :: Maybe Bool -- ^ Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
  , driverForCreateEldYmEnabled :: Maybe Bool -- ^ Flag indicating this driver may select the Yard Move duty status in ELD logs.
  , driverForCreateExternalIds :: Maybe (Map.Map String Text) -- ^ Dictionary of external IDs (string key-value pairs)
  , driverForCreateGroupId :: Maybe Integer -- ^ ID of the group if the organization has multiple groups (uncommon).
  , driverForCreateLicenseNumber :: Maybe Text -- ^ Driver's state issued license number.
  , driverForCreateLicenseState :: Maybe Text -- ^ Abbreviation of state that issued driver's license.
  , driverForCreateName :: Text -- ^ Driver's name.
  , driverForCreateNotes :: Maybe Text -- ^ Notes about the driver.
  , driverForCreatePhone :: Maybe Text -- ^ Driver's phone number. Please include only digits, ex. 4157771234
  , driverForCreateUsername :: Maybe Text -- ^ Driver's login username into the driver app.
  , driverForCreateVehicleId :: Maybe Integer -- ^ ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
  , driverForCreatePassword :: Text -- ^ Driver's password for the driver app.
  , driverForCreateTagIds :: Maybe [Integer] -- ^ A list of tag IDs.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DriverForCreate where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "driverForCreate")
instance ToJSON DriverForCreate where
  toJSON = genericToJSON (removeFieldLabelPrefix False "driverForCreate")


-- | Safety score details for a driver
data DriverSafetyScoreResponse = DriverSafetyScoreResponse
  { driverSafetyScoreResponseCrashCount :: Maybe Int -- ^ Crash event count
  , driverSafetyScoreResponseDriverId :: Maybe Int -- ^ Driver ID
  , driverSafetyScoreResponseHarshAccelCount :: Maybe Int -- ^ Harsh acceleration event count
  , driverSafetyScoreResponseHarshBrakingCount :: Maybe Int -- ^ Harsh braking event count
  , driverSafetyScoreResponseHarshEvents :: Maybe [SafetyReportHarshEvent] -- ^ 
  , driverSafetyScoreResponseHarshTurningCount :: Maybe Int -- ^ Harsh turning event count
  , driverSafetyScoreResponseSafetyScore :: Maybe Int -- ^ Safety Score
  , driverSafetyScoreResponseSafetyScoreRank :: Maybe Text -- ^ Safety Score Rank
  , driverSafetyScoreResponseTimeOverSpeedLimitMs :: Maybe Int -- ^ Amount of time driven over the speed limit in milliseconds
  , driverSafetyScoreResponseTotalDistanceDrivenMeters :: Maybe Int -- ^ Total distance driven in meters
  , driverSafetyScoreResponseTotalHarshEventCount :: Maybe Int -- ^ Total harsh event count
  , driverSafetyScoreResponseTotalTimeDrivenMs :: Maybe Int -- ^ Amount of time driven in milliseconds
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DriverSafetyScoreResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "driverSafetyScoreResponse")
instance ToJSON DriverSafetyScoreResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "driverSafetyScoreResponse")


-- | 
data DriversResponse = DriversResponse
  { driversResponseDrivers :: Maybe [Driver] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DriversResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "driversResponse")
instance ToJSON DriversResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "driversResponse")


-- | 
data DriversSummaryResponse = DriversSummaryResponse
  { driversSummaryResponseSummaries :: Maybe [DriversSummaryResponseSummaries] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DriversSummaryResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "driversSummaryResponse")
instance ToJSON DriversSummaryResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "driversSummaryResponse")


-- | 
data DriversSummaryResponseSummaries = DriversSummaryResponseSummaries
  { driversSummaryResponseSummariesDriverId :: Maybe Integer -- ^ ID of the driver.
  , driversSummaryResponseSummariesDistanceMiles :: Maybe Double -- ^ Distance driven in miles, rounded to two decimal places.
  , driversSummaryResponseSummariesDriveMs :: Maybe Integer -- ^ Duration in milliseconds that driver was driving during the requested time range
  , driversSummaryResponseSummariesActiveMs :: Maybe Integer -- ^ Duration in milliseconds that driver was on duty or driving during the requested time range
  , driversSummaryResponseSummariesDriverUsername :: Maybe Text -- ^ Username of the driver.
  , driversSummaryResponseSummariesGroupId :: Maybe Integer -- ^ Group of the driver.
  , driversSummaryResponseSummariesDriverName :: Maybe Text -- ^ Name of the driver.
  , driversSummaryResponseSummariesOnDutyMs :: Maybe Integer -- ^ Duration in milliseconds that driver was on duty during the requested time range
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DriversSummaryResponseSummaries where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "driversSummaryResponseSummaries")
instance ToJSON DriversSummaryResponseSummaries where
  toJSON = genericToJSON (removeFieldLabelPrefix False "driversSummaryResponseSummaries")


-- | 
data DvirBase = DvirBase
  { dvirBaseAuthorSignature :: Maybe DvirBaseAuthorSignature -- ^ 
  , dvirBaseDefectsCorrected :: Maybe Bool -- ^ Signifies if the defects on the vehicle corrected after the DVIR is done.
  , dvirBaseDefectsNeedNotBeCorrected :: Maybe Bool -- ^ Signifies if the defects on this vehicle can be ignored.
  , dvirBaseId :: Maybe Integer -- ^ The id of this DVIR record.
  , dvirBaseInspectionType :: Maybe Text -- ^ Inspection type of the DVIR.
  , dvirBaseMechanicNotes :: Maybe Text -- ^ The mechanics notes on the DVIR.
  , dvirBaseMechanicOrAgentSignature :: Maybe DvirBaseMechanicOrAgentSignature -- ^ 
  , dvirBaseNextDriverSignature :: Maybe DvirBaseNextDriverSignature -- ^ 
  , dvirBaseOdometerMiles :: Maybe Integer -- ^ The odometer reading in miles for the vehicle when the DVIR was done.
  , dvirBaseTimeMs :: Maybe Integer -- ^ Timestamp of this DVIR in UNIX milliseconds.
  , dvirBaseTrailerDefects :: Maybe [DvirBaseTrailerDefects] -- ^ Defects registered for the trailer which was part of the DVIR.
  , dvirBaseTrailerId :: Maybe Int -- ^ The id of the trailer which was part of the DVIR.
  , dvirBaseTrailerName :: Maybe Text -- ^ The name of the trailer which was part of the DVIR.
  , dvirBaseVehicle :: Maybe DvirBaseVehicle -- ^ 
  , dvirBaseVehicleCondition :: Maybe Text -- ^ The condition of vechile on which DVIR was done.
  , dvirBaseVehicleDefects :: Maybe [DvirBaseTrailerDefects] -- ^ Defects registered for the vehicle which was part of the DVIR.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DvirBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dvirBase")
instance ToJSON DvirBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dvirBase")


-- | The authors signature for the DVIR.
data DvirBaseAuthorSignature = DvirBaseAuthorSignature
  { dvirBaseAuthorSignatureMechanicUserId :: Maybe Integer -- ^ ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
  , dvirBaseAuthorSignatureDriverId :: Maybe Integer -- ^ ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
  , dvirBaseAuthorSignatureName :: Maybe Text -- ^ The name of the driver or mechanic who signed the DVIR.
  , dvirBaseAuthorSignatureSignedAt :: Maybe Integer -- ^ The time in millis when the DVIR was signed
  , dvirBaseAuthorSignatureType :: Maybe Text -- ^ Type corresponds to whether the signature corresponds to driver|mechanic.
  , dvirBaseAuthorSignatureEmail :: Maybe Text -- ^ Email of the  driver|mechanic who signed the DVIR.
  , dvirBaseAuthorSignatureUsername :: Maybe Text -- ^ Username of the  driver|mechanic who signed the DVIR.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DvirBaseAuthorSignature where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dvirBaseAuthorSignature")
instance ToJSON DvirBaseAuthorSignature where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dvirBaseAuthorSignature")


-- | The mechanic&#39;s or agent&#39;s signature for the DVIR.
data DvirBaseMechanicOrAgentSignature = DvirBaseMechanicOrAgentSignature
  { dvirBaseMechanicOrAgentSignatureMechanicUserId :: Maybe Integer -- ^ ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
  , dvirBaseMechanicOrAgentSignatureDriverId :: Maybe Integer -- ^ ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
  , dvirBaseMechanicOrAgentSignatureName :: Maybe Text -- ^ The name of the agent or mechanic who signed the DVIR.
  , dvirBaseMechanicOrAgentSignatureSignedAt :: Maybe Integer -- ^ The time in millis when the DVIR was signed
  , dvirBaseMechanicOrAgentSignatureType :: Maybe Text -- ^ Type corresponds to whether the signature corresponds to driver|mechanic.
  , dvirBaseMechanicOrAgentSignatureEmail :: Maybe Text -- ^ Email of the  agent|mechanic who signed the DVIR.
  , dvirBaseMechanicOrAgentSignatureUsername :: Maybe Text -- ^ Username of the  agent|mechanic who signed the DVIR.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DvirBaseMechanicOrAgentSignature where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dvirBaseMechanicOrAgentSignature")
instance ToJSON DvirBaseMechanicOrAgentSignature where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dvirBaseMechanicOrAgentSignature")


-- | The next driver signature for the DVIR.
data DvirBaseNextDriverSignature = DvirBaseNextDriverSignature
  { dvirBaseNextDriverSignatureDriverId :: Maybe Integer -- ^ ID of the driver who signed the DVIR
  , dvirBaseNextDriverSignatureName :: Maybe Text -- ^ The name of the driver who signed the next DVIR on this vehicle.
  , dvirBaseNextDriverSignatureSignedAt :: Maybe Integer -- ^ The time in millis when the next driver signed the DVIR on this vehicle.
  , dvirBaseNextDriverSignatureType :: Maybe Text -- ^ Type corresponds to driver.
  , dvirBaseNextDriverSignatureEmail :: Maybe Text -- ^ Email of the  driver who signed the next DVIR on this vehicle.
  , dvirBaseNextDriverSignatureUsername :: Maybe Text -- ^ Username of the  driver who signed the next DVIR on this vehicle.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DvirBaseNextDriverSignature where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dvirBaseNextDriverSignature")
instance ToJSON DvirBaseNextDriverSignature where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dvirBaseNextDriverSignature")


-- | 
data DvirBaseTrailerDefects = DvirBaseTrailerDefects
  { dvirBaseTrailerDefectsComment :: Maybe Text -- ^ The comment describing the type of DVIR defect
  , dvirBaseTrailerDefectsDefectType :: Maybe Text -- ^ The type of DVIR defect
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DvirBaseTrailerDefects where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dvirBaseTrailerDefects")
instance ToJSON DvirBaseTrailerDefects where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dvirBaseTrailerDefects")


-- | The vehicle on which DVIR was done.
data DvirBaseVehicle = DvirBaseVehicle
  { dvirBaseVehicleName :: Maybe Text -- ^ The vehicle on which DVIR was done.
  , dvirBaseVehicleId :: Maybe Integer -- ^ The vehicle id on which DVIR was done.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DvirBaseVehicle where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dvirBaseVehicle")
instance ToJSON DvirBaseVehicle where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dvirBaseVehicle")


-- | 
data DvirListResponse = DvirListResponse
  { dvirListResponseDvirs :: Maybe [DvirBase] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DvirListResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "dvirListResponse")
instance ToJSON DvirListResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "dvirListResponse")


-- | The state of the vehicle over time. State can be Running, Off, or Idle.
data EngineState = EngineState
  { engineStateTimeMs :: Value -- ^ Timestamp in Unix epoch milliseconds.
  , engineStateValue :: Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EngineState where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "engineState")
instance ToJSON EngineState where
  toJSON = genericToJSON (removeFieldLabelPrefix False "engineState")


-- | Contains the location and speed of a vehicle at a particular time
data FleetVehicleLocation = FleetVehicleLocation
  { fleetVehicleLocationLatitude :: Maybe Double -- ^ The latitude of the location in degrees.
  , fleetVehicleLocationLocation :: Maybe Text -- ^ The best effort (street,city,state) for the latitude and longitude.
  , fleetVehicleLocationLongitude :: Maybe Double -- ^ The longitude of the location in degrees.
  , fleetVehicleLocationSpeedMilesPerHour :: Maybe Double -- ^ The speed calculated from GPS that the asset was traveling at in miles per hour.
  , fleetVehicleLocationTimeMs :: Maybe Integer -- ^ Time in Unix milliseconds since epoch when the asset was at the location.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON FleetVehicleLocation where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "fleetVehicleLocation")
instance ToJSON FleetVehicleLocation where
  toJSON = genericToJSON (removeFieldLabelPrefix False "fleetVehicleLocation")


-- | A vehicle object as returned for fleet/vehicle
data FleetVehicleResponse = FleetVehicleResponse
  { fleetVehicleResponseExternalIds :: Maybe (Map.Map String Text) -- ^ 
  , fleetVehicleResponseHarshAccelSetting :: Maybe Text -- ^ Harsh event detection setting.
  , fleetVehicleResponseId :: Integer -- ^ ID of the vehicle.
  , fleetVehicleResponseName :: Text -- ^ Name of the vehicle.
  , fleetVehicleResponseVehicleInfo :: Maybe FleetVehicleResponseVehicleInfo -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON FleetVehicleResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "fleetVehicleResponse")
instance ToJSON FleetVehicleResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "fleetVehicleResponse")


-- | 
data FleetVehicleResponseVehicleInfo = FleetVehicleResponseVehicleInfo
  { fleetVehicleResponseVehicleInfoYear :: Maybe Integer -- ^ Year of the vehicle.
  , fleetVehicleResponseVehicleInfoModel :: Maybe Text -- ^ Model of the Vehicle.
  , fleetVehicleResponseVehicleInfoVin :: Maybe Text -- ^ Vehicle Identification Number.
  , fleetVehicleResponseVehicleInfoMake :: Maybe Text -- ^ Make of the vehicle.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON FleetVehicleResponseVehicleInfo where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "fleetVehicleResponseVehicleInfo")
instance ToJSON FleetVehicleResponseVehicleInfo where
  toJSON = genericToJSON (removeFieldLabelPrefix False "fleetVehicleResponseVehicleInfo")


-- | 
data HosAuthenticationLogsResponse = HosAuthenticationLogsResponse
  { hosAuthenticationLogsResponseAuthenticationLogs :: Maybe [HosAuthenticationLogsResponseAuthenticationLogs] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON HosAuthenticationLogsResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "hosAuthenticationLogsResponse")
instance ToJSON HosAuthenticationLogsResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "hosAuthenticationLogsResponse")


-- | 
data HosAuthenticationLogsResponseAuthenticationLogs = HosAuthenticationLogsResponseAuthenticationLogs
  { hosAuthenticationLogsResponseAuthenticationLogsActionType :: Maybe Text -- ^ The log type - one of 'signin' or 'signout'
  , hosAuthenticationLogsResponseAuthenticationLogsAddress :: Maybe Text -- ^ Address at which the log was recorded, if applicable.
  , hosAuthenticationLogsResponseAuthenticationLogsCity :: Maybe Text -- ^ City in which the log was recorded, if applicable.
  , hosAuthenticationLogsResponseAuthenticationLogsHappenedAtMs :: Maybe Integer -- ^ The time at which the event was recorded in UNIX milliseconds.
  , hosAuthenticationLogsResponseAuthenticationLogsAddressName :: Maybe Text -- ^ Address name from the group address book at which the log was recorded, if applicable.
  , hosAuthenticationLogsResponseAuthenticationLogsState :: Maybe Text -- ^ State in which the log was recorded, if applicable.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON HosAuthenticationLogsResponseAuthenticationLogs where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "hosAuthenticationLogsResponseAuthenticationLogs")
instance ToJSON HosAuthenticationLogsResponseAuthenticationLogs where
  toJSON = genericToJSON (removeFieldLabelPrefix False "hosAuthenticationLogsResponseAuthenticationLogs")


-- | 
data HosLogsResponse = HosLogsResponse
  { hosLogsResponseLogs :: Maybe [HosLogsResponseLogs] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON HosLogsResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "hosLogsResponse")
instance ToJSON HosLogsResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "hosLogsResponse")


-- | 
data HosLogsResponseLogs = HosLogsResponseLogs
  { hosLogsResponseLogsLocLng :: Maybe Double -- ^ Longitude at which the log was recorded.
  , hosLogsResponseLogsLogStartMs :: Maybe Integer -- ^ The time at which the log/HOS status started in UNIX milliseconds.
  , hosLogsResponseLogsDriverId :: Maybe Integer -- ^ ID of the driver.
  , hosLogsResponseLogsStatusType :: Maybe Text -- ^ The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
  , hosLogsResponseLogsLocCity :: Maybe Text -- ^ City in which the log was recorded.
  , hosLogsResponseLogsGroupId :: Maybe Integer -- ^ ID of the group.
  , hosLogsResponseLogsLocName :: Maybe Text -- ^ Name of location at which the log was recorded.
  , hosLogsResponseLogsLocLat :: Maybe Double -- ^ Latitude at which the log was recorded.
  , hosLogsResponseLogsRemark :: Maybe Text -- ^ Remark associated with the log entry.
  , hosLogsResponseLogsLocState :: Maybe Text -- ^ State in which the log was recorded.
  , hosLogsResponseLogsVehicleId :: Maybe Integer -- ^ ID of the vehicle.
  , hosLogsResponseLogsCodriverIds :: Maybe [Integer] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON HosLogsResponseLogs where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "hosLogsResponseLogs")
instance ToJSON HosLogsResponseLogs where
  toJSON = genericToJSON (removeFieldLabelPrefix False "hosLogsResponseLogs")


-- | 
data HosLogsSummaryResponse = HosLogsSummaryResponse
  { hosLogsSummaryResponseDrivers :: Maybe [HosLogsSummaryResponseDrivers] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON HosLogsSummaryResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "hosLogsSummaryResponse")
instance ToJSON HosLogsSummaryResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "hosLogsSummaryResponse")


-- | 
data HosLogsSummaryResponseDrivers = HosLogsSummaryResponseDrivers
  { hosLogsSummaryResponseDriversTimeUntilBreak :: Maybe Integer -- ^ The amount of time (in ms) remaining until the driver cannot drive without a rest break.
  , hosLogsSummaryResponseDriversVehicleName :: Maybe Text -- ^ Name of the vehicle.
  , hosLogsSummaryResponseDriversDrivingInViolationToday :: Maybe Integer -- ^ The amount of driving time in violation today (in ms).
  , hosLogsSummaryResponseDriversDriverId :: Maybe Integer -- ^ ID of the driver.
  , hosLogsSummaryResponseDriversCycleRemaining :: Maybe Integer -- ^ The amount of remaining cycle time (in ms).
  , hosLogsSummaryResponseDriversDriverName :: Maybe Text -- ^ Name of the driver.
  , hosLogsSummaryResponseDriversDutyStatus :: Maybe Text -- ^ The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
  , hosLogsSummaryResponseDriversCycleTomorrow :: Maybe Integer -- ^ The amount of cycle time (in ms) available tomorrow.
  , hosLogsSummaryResponseDriversShiftDriveRemaining :: Maybe Integer -- ^ The amount of remaining shift drive time (in ms).
  , hosLogsSummaryResponseDriversTimeInCurrentStatus :: Maybe Integer -- ^ The amount of time (in ms) that the driver has been in the current `dutyStatus`.
  , hosLogsSummaryResponseDriversDrivingInViolationCycle :: Maybe Integer -- ^ The amount of driving time in violation in this cycle (in ms).
  , hosLogsSummaryResponseDriversShiftRemaining :: Maybe Integer -- ^ The amount of remaining shift time (in ms).
  } deriving (Show, Eq, Generic, Data)

instance FromJSON HosLogsSummaryResponseDrivers where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "hosLogsSummaryResponseDrivers")
instance ToJSON HosLogsSummaryResponseDrivers where
  toJSON = genericToJSON (removeFieldLabelPrefix False "hosLogsSummaryResponseDrivers")


-- | Contains the current humidity of a sensor.
data HumidityResponse = HumidityResponse
  { humidityResponseGroupId :: Maybe Integer -- ^ 
  , humidityResponseSensors :: Maybe [HumidityResponseSensors] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON HumidityResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "humidityResponse")
instance ToJSON HumidityResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "humidityResponse")


-- | 
data HumidityResponseSensors = HumidityResponseSensors
  { humidityResponseSensorsName :: Maybe Text -- ^ Name of the sensor.
  , humidityResponseSensorsHumidity :: Maybe Int -- ^ Currently reported relative humidity in percent, from 0-100.
  , humidityResponseSensorsId :: Maybe Integer -- ^ ID of the sensor.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON HumidityResponseSensors where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "humidityResponseSensors")
instance ToJSON HumidityResponseSensors where
  toJSON = genericToJSON (removeFieldLabelPrefix False "humidityResponseSensors")


-- | 
data InlineObject = InlineObject
  { inlineObjectAddresses :: [AddressesAddresses] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject")
instance ToJSON InlineObject where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject")


-- | 
data InlineObject1 = InlineObject1
  { inlineObject1ContactIds :: Maybe [Integer] -- ^ A list of IDs for contact book entries.
  , inlineObject1FormattedAddress :: Maybe Text -- ^ The full address associated with this address/geofence, as it might be recognized by maps.google.com
  , inlineObject1Geofence :: Maybe AddressGeofence -- ^ 
  , inlineObject1Name :: Maybe Text -- ^ The name of this address/geofence
  , inlineObject1Notes :: Maybe Text -- ^ Notes associated with an address.
  , inlineObject1TagIds :: Maybe [Integer] -- ^ A list of tag IDs.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject1 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject1")
instance ToJSON InlineObject1 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject1")


-- | 
data InlineObject10 = InlineObject10
  { inlineObject10GroupId :: Integer -- ^ Group ID to query.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject10 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject10")
instance ToJSON InlineObject10 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject10")


-- | 
data InlineObject11 = InlineObject11
  { inlineObject11GroupId :: Integer -- ^ Group ID to query.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject11 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject11")
instance ToJSON InlineObject11 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject11")


-- | 
data InlineObject12 = InlineObject12
  { inlineObject12InspectionType :: Text -- ^ Only type 'mechanic' is currently accepted.
  , inlineObject12MechanicNotes :: Maybe Text -- ^ Any notes from the mechanic.
  , inlineObject12OdometerMiles :: Maybe Int -- ^ The current odometer of the vehicle.
  , inlineObject12PreviousDefectsCorrected :: Maybe Bool -- ^ Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
  , inlineObject12PreviousDefectsIgnored :: Maybe Bool -- ^ Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.
  , inlineObject12Safe :: Text -- ^ Whether or not this vehicle or trailer is safe to drive.
  , inlineObject12TrailerId :: Maybe Int -- ^ Id of trailer being inspected. Either vehicleId or trailerId must be provided.
  , inlineObject12UserEmail :: Text -- ^ The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email.
  , inlineObject12VehicleId :: Maybe Int -- ^ Id of vehicle being inspected. Either vehicleId or trailerId must be provided.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject12 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject12")
instance ToJSON InlineObject12 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject12")


-- | 
data InlineObject13 = InlineObject13
  { inlineObject13GroupId :: Integer -- ^ Group ID to query.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject13 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject13")
instance ToJSON InlineObject13 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject13")


-- | 
data InlineObject14 = InlineObject14
  { inlineObject14GroupId :: Integer -- ^ Group ID to query.
  , inlineObject14Vehicles :: [Vehicle] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject14 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject14")
instance ToJSON InlineObject14 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject14")


-- | 
data InlineObject15 = InlineObject15
  { inlineObject15EndMs :: Int -- ^ End of the time range, specified in milliseconds UNIX time.
  , inlineObject15GroupId :: Integer -- ^ Group ID to query.
  , inlineObject15StartMs :: Int -- ^ Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
  , inlineObject15VehicleId :: Integer -- ^ Vehicle ID to query.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject15 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject15")
instance ToJSON InlineObject15 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject15")


-- | 
data InlineObject16 = InlineObject16
  { inlineObject16ExternalIds :: Maybe (Map.Map String Text) -- ^ 
  , inlineObject16HarshUnderscoreaccelUnderscoresetting :: Maybe Int -- ^ Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
  , inlineObject16Name :: Maybe Text -- ^ Name
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject16 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject16")
instance ToJSON InlineObject16 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject16")


-- | 
data InlineObject17 = InlineObject17
  { inlineObject17EndMs :: Int -- ^ End of the time range, specified in milliseconds UNIX time.
  , inlineObject17GroupId :: Integer -- ^ Group ID to query.
  , inlineObject17StartMs :: Int -- ^ Beginning of the time range, specified in milliseconds UNIX time.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject17 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject17")
instance ToJSON InlineObject17 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject17")


-- | 
data InlineObject18 = InlineObject18
  { inlineObject18GroupId :: Integer -- ^ Group ID to query.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject18 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject18")
instance ToJSON InlineObject18 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject18")


-- | 
data InlineObject19 = InlineObject19
  { inlineObject19GroupId :: Integer -- ^ Group ID to query.
  , inlineObject19Sensors :: [Integer] -- ^ List of sensor IDs to query.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject19 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject19")
instance ToJSON InlineObject19 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject19")


-- | 
data InlineObject2 = InlineObject2
  { inlineObject2Address :: Text -- ^ The address of the entry to add, as it would be recognized if provided to maps.google.com.
  , inlineObject2GroupId :: Integer -- ^ Group ID to query.
  , inlineObject2Name :: Text -- ^ Name of the location to add to the address book.
  , inlineObject2Radius :: Int -- ^ Radius in meters of the address (used for matching vehicle trip stops to this location).
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject2 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject2")
instance ToJSON InlineObject2 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject2")


-- | 
data InlineObject20 = InlineObject20
  { inlineObject20GroupId :: Integer -- ^ Group ID to query.
  , inlineObject20Sensors :: [Integer] -- ^ List of sensor IDs to query.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject20 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject20")
instance ToJSON InlineObject20 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject20")


-- | 
data InlineObject21 = InlineObject21
  { inlineObject21EndMs :: Int -- ^ End of the time range, specified in milliseconds UNIX time.
  , inlineObject21FillMissing :: Maybe Text -- ^ 
  , inlineObject21GroupId :: Integer -- ^ Group ID to query.
  , inlineObject21Series :: [SensorsHistorySeries] -- ^ 
  , inlineObject21StartMs :: Int -- ^ Beginning of the time range, specified in milliseconds UNIX time.
  , inlineObject21StepMs :: Int -- ^ Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject21 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject21")
instance ToJSON InlineObject21 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject21")


-- | 
data InlineObject22 = InlineObject22
  { inlineObject22GroupId :: Integer -- ^ Group ID to query.
  , inlineObject22Sensors :: [Integer] -- ^ List of sensor IDs to query.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject22 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject22")
instance ToJSON InlineObject22 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject22")


-- | 
data InlineObject23 = InlineObject23
  { inlineObject23GroupId :: Integer -- ^ Group ID to query.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject23 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject23")
instance ToJSON InlineObject23 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject23")


-- | 
data InlineObject24 = InlineObject24
  { inlineObject24GroupId :: Integer -- ^ Group ID to query.
  , inlineObject24Sensors :: [Integer] -- ^ List of sensor IDs to query.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject24 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject24")
instance ToJSON InlineObject24 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject24")


-- | 
data InlineObject3 = InlineObject3
  { inlineObject3GroupId :: Integer -- ^ Group ID to query.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject3 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject3")
instance ToJSON InlineObject3 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject3")


-- | 
data InlineObject4 = InlineObject4
  { inlineObject4Reactivate :: Bool -- ^ True indicates that this driver should be reactivated.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject4 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject4")
instance ToJSON InlineObject4 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject4")


-- | 
data InlineObject5 = InlineObject5
  { inlineObject5EndMs :: Integer -- ^ End time (ms) of queried time period.
  , inlineObject5OrgId :: Integer -- ^ Org ID to query.
  , inlineObject5StartMs :: Integer -- ^ Start time (ms) of queried time period.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject5 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject5")
instance ToJSON InlineObject5 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject5")


-- | 
data InlineObject6 = InlineObject6
  { inlineObject6DriverId :: Integer -- ^ Driver ID to query.
  , inlineObject6EndMs :: Int -- ^ End of the time range, specified in milliseconds UNIX time.
  , inlineObject6GroupId :: Integer -- ^ Group ID to query.
  , inlineObject6StartMs :: Int -- ^ Beginning of the time range, specified in milliseconds UNIX time.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject6 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject6")
instance ToJSON InlineObject6 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject6")


-- | 
data InlineObject7 = InlineObject7
  { inlineObject7DriverId :: Integer -- ^ Driver ID to query.
  , inlineObject7EndMs :: Int -- ^ End of the time range, specified in milliseconds UNIX time.
  , inlineObject7GroupId :: Integer -- ^ Group ID to query.
  , inlineObject7StartMs :: Int -- ^ Beginning of the time range, specified in milliseconds UNIX time.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject7 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject7")
instance ToJSON InlineObject7 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject7")


-- | 
data InlineObject8 = InlineObject8
  { inlineObject8DriverId :: Integer -- ^ Driver ID to query.
  , inlineObject8EndMs :: Int -- ^ End of the time range, specified in milliseconds UNIX time.
  , inlineObject8GroupId :: Integer -- ^ Group ID to query.
  , inlineObject8StartMs :: Int -- ^ Beginning of the time range, specified in milliseconds UNIX time.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject8 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject8")
instance ToJSON InlineObject8 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject8")


-- | 
data InlineObject9 = InlineObject9
  { inlineObject9GroupId :: Integer -- ^ Group ID to query.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineObject9 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineObject9")
instance ToJSON InlineObject9 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineObject9")


-- | 
data InlineResponse200 = InlineResponse200
  { inlineResponse200Assets :: Maybe [Asset] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineResponse200 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineResponse200")
instance ToJSON InlineResponse200 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineResponse200")


-- | 
data InlineResponse2001 = InlineResponse2001
  { inlineResponse2001Assets :: Maybe [AssetCurrentLocationsResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineResponse2001 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineResponse2001")
instance ToJSON InlineResponse2001 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineResponse2001")


-- | 
data InlineResponse2002 = InlineResponse2002
  { inlineResponse2002Pagination :: Maybe Pagination -- ^ 
  , inlineResponse2002GroupId :: Maybe Integer -- ^ Group ID to query.
  , inlineResponse2002Vehicles :: Maybe [Vehicle] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineResponse2002 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineResponse2002")
instance ToJSON InlineResponse2002 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineResponse2002")


-- | 
data InlineResponse2003 = InlineResponse2003
  { inlineResponse2003GroupId :: Maybe Integer -- ^ Group ID to query.
  , inlineResponse2003Vehicles :: Maybe [VehicleLocation] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineResponse2003 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineResponse2003")
instance ToJSON InlineResponse2003 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineResponse2003")


-- | 
data InlineResponse2004 = InlineResponse2004
  { inlineResponse2004Vehicles :: Maybe [VehicleMaintenance] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineResponse2004 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineResponse2004")
instance ToJSON InlineResponse2004 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineResponse2004")


-- | 
data InlineResponse2005 = InlineResponse2005
  { inlineResponse2005Pagination :: Maybe Pagination -- ^ 
  , inlineResponse2005VehicleStats :: [InlineResponse2005VehicleStats] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineResponse2005 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineResponse2005")
instance ToJSON InlineResponse2005 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineResponse2005")


-- | 
data InlineResponse2005VehicleStats = InlineResponse2005VehicleStats
  { inlineResponse2005VehicleStatsEngineState :: Maybe [EngineState] -- ^ 
  , inlineResponse2005VehicleStatsAuxInput2 :: Maybe AuxInputSeries -- ^ 
  , inlineResponse2005VehicleStatsVehicleId :: Integer -- ^ ID of the vehicle.
  , inlineResponse2005VehicleStatsAuxInput1 :: Maybe AuxInputSeries -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineResponse2005VehicleStats where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineResponse2005VehicleStats")
instance ToJSON InlineResponse2005VehicleStats where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineResponse2005VehicleStats")


-- | 
data InlineResponse2006 = InlineResponse2006
  { inlineResponse2006DataInputs :: Maybe [DataInputHistoryResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineResponse2006 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineResponse2006")
instance ToJSON InlineResponse2006 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineResponse2006")


-- | 
data InlineResponse2007 = InlineResponse2007
  { inlineResponse2007Machines :: Maybe [Machine] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineResponse2007 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineResponse2007")
instance ToJSON InlineResponse2007 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineResponse2007")


-- | 
data InlineResponse2008 = InlineResponse2008
  { inlineResponse2008Sensors :: Maybe [Sensor] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineResponse2008 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineResponse2008")
instance ToJSON InlineResponse2008 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineResponse2008")


-- | 
data InlineResponse2009 = InlineResponse2009
  { inlineResponse2009Tags :: Maybe [Tag] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineResponse2009 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineResponse2009")
instance ToJSON InlineResponse2009 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineResponse2009")


-- | The current state of the dispatch job.
data JobStatus = JobStatus
  { 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON JobStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "jobStatus")
instance ToJSON JobStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "jobStatus")


-- | 
data JobUpdateObject = JobUpdateObject
  { jobUpdateObjectChangedUnderscoreatUnderscorems :: Maybe Integer -- ^ Timestamp that this event was updated, represented as Unix milliseconds since epoch.
  , jobUpdateObjectJobUnderscoreid :: Maybe Integer -- ^ ID of the Samsara job.
  , jobUpdateObjectJobUnderscorestate :: Maybe JobStatus -- ^ 
  , jobUpdateObjectPrevUnderscorejobUnderscorestate :: Maybe PrevJobStatus -- ^ 
  , jobUpdateObjectRoute :: Maybe DispatchRoute -- ^ 
  , jobUpdateObjectRouteUnderscoreid :: Maybe Integer -- ^ ID of the Samsara dispatch route.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON JobUpdateObject where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "jobUpdateObject")
instance ToJSON JobUpdateObject where
  toJSON = genericToJSON (removeFieldLabelPrefix False "jobUpdateObject")


-- | Contains information about a machine.
data Machine = Machine
  { machineId :: Integer -- ^ ID of the machine.
  , machineName :: Maybe Text -- ^ Name of the machine.
  , machineNotes :: Maybe Text -- ^ Notes about the machine
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Machine where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "machine")
instance ToJSON Machine where
  toJSON = genericToJSON (removeFieldLabelPrefix False "machine")


-- | Contains the results for a machine history request
data MachineHistoryResponse = MachineHistoryResponse
  { machineHistoryResponseMachines :: Maybe [MachineHistoryResponseMachines] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MachineHistoryResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "machineHistoryResponse")
instance ToJSON MachineHistoryResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "machineHistoryResponse")


-- | 
data MachineHistoryResponseMachines = MachineHistoryResponseMachines
  { machineHistoryResponseMachinesName :: Maybe Text -- ^ Machine name
  , machineHistoryResponseMachinesId :: Maybe Int -- ^ Machine ID
  , machineHistoryResponseMachinesVibrations :: Maybe [MachineHistoryResponseVibrations] -- ^ List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MachineHistoryResponseMachines where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "machineHistoryResponseMachines")
instance ToJSON MachineHistoryResponseMachines where
  toJSON = genericToJSON (removeFieldLabelPrefix False "machineHistoryResponseMachines")


-- | 
data MachineHistoryResponseVibrations = MachineHistoryResponseVibrations
  { machineHistoryResponseVibrationsX :: Maybe Double -- ^ 
  , machineHistoryResponseVibrationsY :: Maybe Double -- ^ 
  , machineHistoryResponseVibrationsZ :: Maybe Double -- ^ 
  , machineHistoryResponseVibrationsTime :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MachineHistoryResponseVibrations where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "machineHistoryResponseVibrations")
instance ToJSON MachineHistoryResponseVibrations where
  toJSON = genericToJSON (removeFieldLabelPrefix False "machineHistoryResponseVibrations")


-- | 
data Pagination = Pagination
  { paginationEndCursor :: Text -- ^ Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.
  , paginationHasNextPage :: Bool -- ^ True if there are more pages of results after this response.
  , paginationHasPrevPage :: Bool -- ^ True if there are more pages of results before this response.
  , paginationStartCursor :: Text -- ^ Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Pagination where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "pagination")
instance ToJSON Pagination where
  toJSON = genericToJSON (removeFieldLabelPrefix False "pagination")


-- | The previous state of the dispatch job.
data PrevJobStatus = PrevJobStatus
  { 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PrevJobStatus where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "prevJobStatus")
instance ToJSON PrevJobStatus where
  toJSON = genericToJSON (removeFieldLabelPrefix False "prevJobStatus")


-- | List of harsh events
data SafetyReportHarshEvent = SafetyReportHarshEvent
  { safetyReportHarshEventHarshEventType :: Maybe Text -- ^ Type of the harsh event
  , safetyReportHarshEventTimestampMs :: Maybe Int -- ^ Timestamp that the harsh event occurred in Unix milliseconds since epoch
  , safetyReportHarshEventVehicleId :: Maybe Int -- ^ Vehicle associated with the harsh event
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SafetyReportHarshEvent where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "safetyReportHarshEvent")
instance ToJSON SafetyReportHarshEvent where
  toJSON = genericToJSON (removeFieldLabelPrefix False "safetyReportHarshEvent")


-- | Contains information about a sensor.
data Sensor = Sensor
  { sensorId :: Integer -- ^ ID of the sensor.
  , sensorMacAddress :: Maybe Text -- ^ MAC address of the sensor.
  , sensorName :: Maybe Text -- ^ Name of the sensor.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Sensor where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "sensor")
instance ToJSON Sensor where
  toJSON = genericToJSON (removeFieldLabelPrefix False "sensor")


-- | Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
data SensorHistoryResponse = SensorHistoryResponse
  { sensorHistoryResponseResults :: Maybe [SensorHistoryResponseResults] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SensorHistoryResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "sensorHistoryResponse")
instance ToJSON SensorHistoryResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "sensorHistoryResponse")


-- | 
data SensorHistoryResponseResults = SensorHistoryResponseResults
  { sensorHistoryResponseResultsSeries :: Maybe [Integer] -- ^ List of datapoints, one for each requested (sensor, field) pair.
  , sensorHistoryResponseResultsTimeMs :: Maybe Int -- ^ Timestamp in UNIX milliseconds.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SensorHistoryResponseResults where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "sensorHistoryResponseResults")
instance ToJSON SensorHistoryResponseResults where
  toJSON = genericToJSON (removeFieldLabelPrefix False "sensorHistoryResponseResults")


-- | Sensor ID and field to query.
data SensorsHistorySeries = SensorsHistorySeries
  { sensorsHistorySeriesField :: Text -- ^ Field to query.
  , sensorsHistorySeriesWidgetId :: Integer -- ^ Sensor ID to query.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SensorsHistorySeries where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "sensorsHistorySeries")
instance ToJSON SensorsHistorySeries where
  toJSON = genericToJSON (removeFieldLabelPrefix False "sensorsHistorySeries")


-- | 
data Tag = Tag
  { tagAddresses :: Maybe [TaggedAddress] -- ^ The addresses that belong to this tag.
  , tagAssets :: Maybe [TaggedAsset] -- ^ The assets that belong to this tag.
  , tagDrivers :: Maybe [TaggedDriver] -- ^ The drivers that belong to this tag.
  , tagGroupId :: Maybe Integer -- ^ The GroupID that this tag belongs to.
  , tagId :: Integer -- ^ The ID of this tag.
  , tagMachines :: Maybe [TaggedMachine] -- ^ The machines that belong to this tag.
  , tagName :: Text -- ^ Name of this tag.
  , tagParentTagId :: Maybe Integer -- ^ If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
  , tagSensors :: Maybe [TaggedSensor] -- ^ The sensors that belong to this tag.
  , tagVehicles :: Maybe [TaggedVehicle] -- ^ The vehicles that belong to this tag.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Tag where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "tag")
instance ToJSON Tag where
  toJSON = genericToJSON (removeFieldLabelPrefix False "tag")


-- | 
data TagCreate = TagCreate
  { tagCreateAssets :: Maybe [TaggedAssetBase] -- ^ The assets that belong to this tag.
  , tagCreateDrivers :: Maybe [TaggedDriverBase] -- ^ The drivers that belong to this tag.
  , tagCreateMachines :: Maybe [TaggedMachineBase] -- ^ The machines that belong to this tag.
  , tagCreateName :: Text -- ^ Name of this tag.
  , tagCreateParentTagId :: Maybe Integer -- ^ If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
  , tagCreateSensors :: Maybe [TaggedSensorBase] -- ^ The sensors that belong to this tag.
  , tagCreateVehicles :: Maybe [TaggedVehicleBase] -- ^ The vehicles that belong to this tag.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TagCreate where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "tagCreate")
instance ToJSON TagCreate where
  toJSON = genericToJSON (removeFieldLabelPrefix False "tagCreate")


-- | 
data TagMetadata = TagMetadata
  { tagMetadataId :: Integer -- ^ The ID of this tag.
  , tagMetadataName :: Text -- ^ Name of this tag.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TagMetadata where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "tagMetadata")
instance ToJSON TagMetadata where
  toJSON = genericToJSON (removeFieldLabelPrefix False "tagMetadata")


-- | 
data TagModify = TagModify
  { tagModifyAdd :: Maybe TagModifyAdd -- ^ 
  , tagModifyDelete :: Maybe TagModifyDelete -- ^ 
  , tagModifyName :: Maybe Text -- ^ Updated name of this tag.
  , tagModifyParentTagId :: Maybe Integer -- ^ If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TagModify where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "tagModify")
instance ToJSON TagModify where
  toJSON = genericToJSON (removeFieldLabelPrefix False "tagModify")


-- | Specify devices, etc. that should be added to the tag.
data TagModifyAdd = TagModifyAdd
  { tagModifyAddAssets :: Maybe [TaggedAssetBase] -- ^ The assets to be added to this tag.
  , tagModifyAddSensors :: Maybe [TaggedSensorBase] -- ^ The sensors to be added to this tag.
  , tagModifyAddVehicles :: Maybe [TaggedVehicleBase] -- ^ The vehicles to be added to this tag.
  , tagModifyAddMachines :: Maybe [TaggedMachineBase] -- ^ The machines to be added to this tag.
  , tagModifyAddDrivers :: Maybe [TaggedDriverBase] -- ^ The drivers to be added to this tag.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TagModifyAdd where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "tagModifyAdd")
instance ToJSON TagModifyAdd where
  toJSON = genericToJSON (removeFieldLabelPrefix False "tagModifyAdd")


-- | Specify devices, etc. that should be removed from the tag.
data TagModifyDelete = TagModifyDelete
  { tagModifyDeleteAssets :: Maybe [TaggedAssetBase] -- ^ The assets to be removed from this tag.
  , tagModifyDeleteSensors :: Maybe [TaggedSensorBase] -- ^ The sensors to be removed from this tag.
  , tagModifyDeleteVehicles :: Maybe [TaggedVehicleBase] -- ^ The vehicles to be removed from this tag.
  , tagModifyDeleteMachines :: Maybe [TaggedMachineBase] -- ^ The machines to be removed from this tag.
  , tagModifyDeleteDrivers :: Maybe [TaggedDriverBase] -- ^ The drivers to be removed from this tag.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TagModifyDelete where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "tagModifyDelete")
instance ToJSON TagModifyDelete where
  toJSON = genericToJSON (removeFieldLabelPrefix False "tagModifyDelete")


-- | 
data TagUpdate = TagUpdate
  { tagUpdateAssets :: Maybe [TaggedAssetBase] -- ^ The assets that belong to this tag.
  , tagUpdateDrivers :: Maybe [TaggedDriverBase] -- ^ The drivers that belong to this tag.
  , tagUpdateMachines :: Maybe [TaggedMachineBase] -- ^ The machines that belong to this tag.
  , tagUpdateName :: Maybe Text -- ^ Updated name of this tag.
  , tagUpdateParentTagId :: Maybe Integer -- ^ If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
  , tagUpdateSensors :: Maybe [TaggedSensorBase] -- ^ The sensors that belong to this tag.
  , tagUpdateVehicles :: Maybe [TaggedVehicleBase] -- ^ The vehicles that belong to this tag.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TagUpdate where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "tagUpdate")
instance ToJSON TagUpdate where
  toJSON = genericToJSON (removeFieldLabelPrefix False "tagUpdate")


-- | 
data TaggedAddress = TaggedAddress
  { taggedAddressId :: Integer -- ^ The ID of the address being tagged.
  , taggedAddressName :: Maybe Text -- ^ Name of the address being tagged.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TaggedAddress where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "taggedAddress")
instance ToJSON TaggedAddress where
  toJSON = genericToJSON (removeFieldLabelPrefix False "taggedAddress")


-- | 
data TaggedAddressBase = TaggedAddressBase
  { taggedAddressBaseId :: Integer -- ^ The ID of the address being tagged.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TaggedAddressBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "taggedAddressBase")
instance ToJSON TaggedAddressBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "taggedAddressBase")


-- | 
data TaggedAsset = TaggedAsset
  { taggedAssetId :: Integer -- ^ The ID of the Asset being tagged.
  , taggedAssetName :: Maybe Text -- ^ Name of the Asset being tagged.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TaggedAsset where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "taggedAsset")
instance ToJSON TaggedAsset where
  toJSON = genericToJSON (removeFieldLabelPrefix False "taggedAsset")


-- | 
data TaggedAssetBase = TaggedAssetBase
  { taggedAssetBaseId :: Integer -- ^ The ID of the Asset being tagged.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TaggedAssetBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "taggedAssetBase")
instance ToJSON TaggedAssetBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "taggedAssetBase")


-- | 
data TaggedDriver = TaggedDriver
  { taggedDriverId :: Integer -- ^ The ID of the Driver being tagged.
  , taggedDriverName :: Maybe Text -- ^ Name of the Driver being tagged.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TaggedDriver where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "taggedDriver")
instance ToJSON TaggedDriver where
  toJSON = genericToJSON (removeFieldLabelPrefix False "taggedDriver")


-- | 
data TaggedDriverBase = TaggedDriverBase
  { taggedDriverBaseId :: Integer -- ^ The ID of the Driver being tagged.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TaggedDriverBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "taggedDriverBase")
instance ToJSON TaggedDriverBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "taggedDriverBase")


-- | 
data TaggedMachine = TaggedMachine
  { taggedMachineId :: Integer -- ^ The ID of the Machine being tagged.
  , taggedMachineName :: Maybe Text -- ^ Name of the Machine being tagged.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TaggedMachine where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "taggedMachine")
instance ToJSON TaggedMachine where
  toJSON = genericToJSON (removeFieldLabelPrefix False "taggedMachine")


-- | 
data TaggedMachineBase = TaggedMachineBase
  { taggedMachineBaseId :: Integer -- ^ The ID of the Machine being tagged.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TaggedMachineBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "taggedMachineBase")
instance ToJSON TaggedMachineBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "taggedMachineBase")


-- | 
data TaggedSensor = TaggedSensor
  { taggedSensorId :: Integer -- ^ The ID of the Sensor being tagged.
  , taggedSensorName :: Maybe Text -- ^ Name of the Sensor being tagged.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TaggedSensor where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "taggedSensor")
instance ToJSON TaggedSensor where
  toJSON = genericToJSON (removeFieldLabelPrefix False "taggedSensor")


-- | 
data TaggedSensorBase = TaggedSensorBase
  { taggedSensorBaseId :: Integer -- ^ The ID of the Sensor being tagged.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TaggedSensorBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "taggedSensorBase")
instance ToJSON TaggedSensorBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "taggedSensorBase")


-- | 
data TaggedVehicle = TaggedVehicle
  { taggedVehicleId :: Integer -- ^ The ID of the Vehicle being tagged.
  , taggedVehicleName :: Maybe Text -- ^ Name of the Vehicle being tagged.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TaggedVehicle where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "taggedVehicle")
instance ToJSON TaggedVehicle where
  toJSON = genericToJSON (removeFieldLabelPrefix False "taggedVehicle")


-- | 
data TaggedVehicleBase = TaggedVehicleBase
  { taggedVehicleBaseId :: Integer -- ^ The ID of the Vehicle being tagged.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TaggedVehicleBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "taggedVehicleBase")
instance ToJSON TaggedVehicleBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "taggedVehicleBase")


-- | Contains the current temperatures of a sensor.
data TemperatureResponse = TemperatureResponse
  { temperatureResponseGroupId :: Maybe Integer -- ^ 
  , temperatureResponseSensors :: Maybe [TemperatureResponseSensors] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TemperatureResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "temperatureResponse")
instance ToJSON TemperatureResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "temperatureResponse")


-- | 
data TemperatureResponseSensors = TemperatureResponseSensors
  { temperatureResponseSensorsProbeTemperature :: Maybe Int -- ^ Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
  , temperatureResponseSensorsName :: Maybe Text -- ^ Name of the sensor.
  , temperatureResponseSensorsId :: Maybe Integer -- ^ ID of the sensor.
  , temperatureResponseSensorsAmbientTemperature :: Maybe Int -- ^ Currently reported ambient temperature in millidegrees celsius.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TemperatureResponseSensors where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "temperatureResponseSensors")
instance ToJSON TemperatureResponseSensors where
  toJSON = genericToJSON (removeFieldLabelPrefix False "temperatureResponseSensors")


-- | Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
data TripResponse = TripResponse
  { tripResponseTrips :: Maybe [TripResponseTrips] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TripResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "tripResponse")
instance ToJSON TripResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "tripResponse")


-- | End (latitude, longitude) in decimal degrees.
data TripResponseEndCoordinates = TripResponseEndCoordinates
  { tripResponseEndCoordinatesLatitude :: Maybe Double -- ^ 
  , tripResponseEndCoordinatesLongitude :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TripResponseEndCoordinates where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "tripResponseEndCoordinates")
instance ToJSON TripResponseEndCoordinates where
  toJSON = genericToJSON (removeFieldLabelPrefix False "tripResponseEndCoordinates")


-- | Start (latitude, longitude) in decimal degrees.
data TripResponseStartCoordinates = TripResponseStartCoordinates
  { tripResponseStartCoordinatesLatitude :: Maybe Double -- ^ 
  , tripResponseStartCoordinatesLongitude :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TripResponseStartCoordinates where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "tripResponseStartCoordinates")
instance ToJSON TripResponseStartCoordinates where
  toJSON = genericToJSON (removeFieldLabelPrefix False "tripResponseStartCoordinates")


-- | 
data TripResponseTrips = TripResponseTrips
  { tripResponseTripsEndOdometer :: Maybe Int -- ^ Odometer reading at the end of the trip.
  , tripResponseTripsDistanceMeters :: Maybe Int -- ^ Length of the trip in meters.
  , tripResponseTripsEndMs :: Maybe Int -- ^ End of the trip in UNIX milliseconds.
  , tripResponseTripsStartMs :: Maybe Int -- ^ Beginning of the trip in UNIX milliseconds.
  , tripResponseTripsFuelConsumedMl :: Maybe Int -- ^ Amount in milliliters of fuel consumed on this trip.
  , tripResponseTripsStartAddress :: Maybe Text -- ^ Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
  , tripResponseTripsStartCoordinates :: Maybe TripResponseStartCoordinates -- ^ 
  , tripResponseTripsEndCoordinates :: Maybe TripResponseEndCoordinates -- ^ 
  , tripResponseTripsStartOdometer :: Maybe Int -- ^ Odometer reading at the beginning of the trip.
  , tripResponseTripsDriverId :: Maybe Int -- ^ ID of the driver.
  , tripResponseTripsStartLocation :: Maybe Text -- ^ Geocoded street address of start (latitude, longitude) coordinates.
  , tripResponseTripsTollMeters :: Maybe Int -- ^ Length in meters trip spent on toll roads.
  , tripResponseTripsEndAddress :: Maybe Text -- ^ Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
  , tripResponseTripsEndLocation :: Maybe Text -- ^ Geocoded street address of start (latitude, longitude) coordinates.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TripResponseTrips where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "tripResponseTrips")
instance ToJSON TripResponseTrips where
  toJSON = genericToJSON (removeFieldLabelPrefix False "tripResponseTrips")


-- | 
data User = User
  { userAuthType :: Text -- ^ The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
  , userEmail :: Text -- ^ The email address of this user.
  , userName :: Maybe Text -- ^ The first and last name of the user.
  , userOrganizationRoleId :: Maybe Text -- ^ The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
  , userId :: Maybe Integer -- ^ The ID of the User record.
  , userOrganizationRole :: Maybe Text -- ^ The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
  , userTagRoles :: Maybe [UserTagRole] -- ^ The specific tags this user has access to. This will be blank for users that have full access to the organization.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON User where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "user")
instance ToJSON User where
  toJSON = genericToJSON (removeFieldLabelPrefix False "user")


-- | 
data UserBase = UserBase
  { userBaseAuthType :: Text -- ^ The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
  , userBaseEmail :: Text -- ^ The email address of this user.
  , userBaseName :: Maybe Text -- ^ The first and last name of the user.
  , userBaseOrganizationRoleId :: Maybe Text -- ^ The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserBase where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "userBase")
instance ToJSON UserBase where
  toJSON = genericToJSON (removeFieldLabelPrefix False "userBase")


-- | 
data UserRole = UserRole
  { userRoleId :: Maybe Text -- ^ 
  , userRoleName :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserRole where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "userRole")
instance ToJSON UserRole where
  toJSON = genericToJSON (removeFieldLabelPrefix False "userRole")


-- | 
data UserTagRole = UserTagRole
  { userTagRoleRole :: Maybe Text -- ^ The name of the role the user has been granted on this tag.
  , userTagRoleRoleId :: Text -- ^ The id of the role the user has been granted on this tag.
  , userTagRoleTag :: UserTagRoleTag -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserTagRole where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "userTagRole")
instance ToJSON UserTagRole where
  toJSON = genericToJSON (removeFieldLabelPrefix False "userTagRole")


-- | 
data UserTagRoleTag = UserTagRoleTag
  { userTagRoleTagParentTagId :: Maybe Integer -- ^ The ID of this tag.
  , userTagRoleTagName :: Text -- ^ Name of this tag.
  , userTagRoleTagId :: Integer -- ^ The ID of this tag.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserTagRoleTag where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "userTagRoleTag")
instance ToJSON UserTagRoleTag where
  toJSON = genericToJSON (removeFieldLabelPrefix False "userTagRoleTag")


-- | A vehicle object.
data Vehicle = Vehicle
  { vehicleEngineHours :: Maybe Integer -- ^ Total engine hours for the vehicle.
  , vehicleFuelLevelPercent :: Maybe Double -- ^ The fuel level of the vehicle as a percentage. (0.0 to 1.0)
  , vehicleId :: Integer -- ^ ID of the vehicle.
  , vehicleName :: Maybe Text -- ^ Name of the vehicle.
  , vehicleNote :: Maybe Text -- ^ 
  , vehicleOdometerMeters :: Maybe Integer -- ^ The number of meters reported by the odometer.
  , vehicleVin :: Maybe Text -- ^ Vehicle Identification Number.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Vehicle where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "vehicle")
instance ToJSON Vehicle where
  toJSON = genericToJSON (removeFieldLabelPrefix False "vehicle")


-- | Harsh event details for a vehicle
data VehicleHarshEventResponse = VehicleHarshEventResponse
  { vehicleHarshEventResponseDownloadForwardVideoUrl :: Maybe Text -- ^ URL for downloading the forward facing video
  , vehicleHarshEventResponseDownloadInwardVideoUrl :: Maybe Text -- ^ URL for downloading the inward facing video
  , vehicleHarshEventResponseDownloadTrackedInwardVideoUrl :: Maybe Text -- ^ URL for downloading the tracked inward facing video
  , vehicleHarshEventResponseHarshEventType :: Text -- ^ Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
  , vehicleHarshEventResponseIncidentReportUrl :: Text -- ^ URL of the associated incident report page
  , vehicleHarshEventResponseIsDistracted :: Maybe Bool -- ^ Whether the driver was deemed distracted during this harsh event
  , vehicleHarshEventResponseLocation :: Maybe VehicleHarshEventResponseLocation -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VehicleHarshEventResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "vehicleHarshEventResponse")
instance ToJSON VehicleHarshEventResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "vehicleHarshEventResponse")


-- | 
data VehicleHarshEventResponseLocation = VehicleHarshEventResponseLocation
  { vehicleHarshEventResponseLocationAddress :: Maybe Text -- ^ Address of location where the harsh event occurred
  , vehicleHarshEventResponseLocationLatitude :: Maybe Text -- ^ Latitude of location where the harsh event occurred
  , vehicleHarshEventResponseLocationLongitude :: Maybe Text -- ^ Longitude of location where the harsh event occurred
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VehicleHarshEventResponseLocation where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "vehicleHarshEventResponseLocation")
instance ToJSON VehicleHarshEventResponseLocation where
  toJSON = genericToJSON (removeFieldLabelPrefix False "vehicleHarshEventResponseLocation")


-- | Contains the location, in latitude and longitude, of a vehicle.
data VehicleLocation = VehicleLocation
  { vehicleLocationHeading :: Maybe Double -- ^ Heading in degrees.
  , vehicleLocationId :: Integer -- ^ ID of the vehicle.
  , vehicleLocationLatitude :: Maybe Double -- ^ Latitude in decimal degrees.
  , vehicleLocationLocation :: Maybe Text -- ^ Text representation of nearest identifiable location to (latitude, longitude) coordinates.
  , vehicleLocationLongitude :: Maybe Double -- ^ Longitude in decimal degrees.
  , vehicleLocationName :: Maybe Text -- ^ Name of the vehicle.
  , vehicleLocationOdometerMeters :: Maybe Integer -- ^ The number of meters reported by the odometer.
  , vehicleLocationOnTrip :: Maybe Bool -- ^ Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
  , vehicleLocationSpeed :: Maybe Double -- ^ Speed in miles per hour.
  , vehicleLocationTime :: Maybe Int -- ^ The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
  , vehicleLocationVin :: Maybe Text -- ^ Vehicle Identification Number (VIN) of the vehicle.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VehicleLocation where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "vehicleLocation")
instance ToJSON VehicleLocation where
  toJSON = genericToJSON (removeFieldLabelPrefix False "vehicleLocation")


-- | Contains any J1939/Passenger engine light warnings and engine faults.
data VehicleMaintenance = VehicleMaintenance
  { vehicleMaintenanceId :: Integer -- ^ ID of the vehicle.
  , vehicleMaintenanceJ1939 :: Maybe VehicleMaintenanceJ1939 -- ^ 
  , vehicleMaintenancePassenger :: Maybe VehicleMaintenancePassenger -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VehicleMaintenance where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "vehicleMaintenance")
instance ToJSON VehicleMaintenance where
  toJSON = genericToJSON (removeFieldLabelPrefix False "vehicleMaintenance")


-- | J1939 based data. Null if no data is available.
data VehicleMaintenanceJ1939 = VehicleMaintenanceJ1939
  { vehicleMaintenanceJ1939CheckEngineLight :: Maybe VehicleMaintenanceJ1939CheckEngineLight -- ^ 
  , vehicleMaintenanceJ1939DiagnosticTroubleCodes :: Maybe [VehicleMaintenanceJ1939DiagnosticTroubleCodes] -- ^ J1939 DTCs.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VehicleMaintenanceJ1939 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "vehicleMaintenanceJ1939")
instance ToJSON VehicleMaintenanceJ1939 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "vehicleMaintenanceJ1939")


-- | J1939 check engine lights.
data VehicleMaintenanceJ1939CheckEngineLight = VehicleMaintenanceJ1939CheckEngineLight
  { vehicleMaintenanceJ1939CheckEngineLightProtectIsOn :: Maybe Bool -- ^ 
  , vehicleMaintenanceJ1939CheckEngineLightStopIsOn :: Maybe Bool -- ^ 
  , vehicleMaintenanceJ1939CheckEngineLightWarningIsOn :: Maybe Bool -- ^ 
  , vehicleMaintenanceJ1939CheckEngineLightEmissionsIsOn :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VehicleMaintenanceJ1939CheckEngineLight where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "vehicleMaintenanceJ1939CheckEngineLight")
instance ToJSON VehicleMaintenanceJ1939CheckEngineLight where
  toJSON = genericToJSON (removeFieldLabelPrefix False "vehicleMaintenanceJ1939CheckEngineLight")


-- | 
data VehicleMaintenanceJ1939DiagnosticTroubleCodes = VehicleMaintenanceJ1939DiagnosticTroubleCodes
  { vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnDescription :: Maybe Text -- ^ 
  , vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiText :: Maybe Text -- ^ 
  , vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnId :: Maybe Int -- ^ 
  , vehicleMaintenanceJ1939DiagnosticTroubleCodesOccurrenceCount :: Maybe Int -- ^ 
  , vehicleMaintenanceJ1939DiagnosticTroubleCodesTxId :: Maybe Int -- ^ 
  , vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiId :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VehicleMaintenanceJ1939DiagnosticTroubleCodes where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "vehicleMaintenanceJ1939DiagnosticTroubleCodes")
instance ToJSON VehicleMaintenanceJ1939DiagnosticTroubleCodes where
  toJSON = genericToJSON (removeFieldLabelPrefix False "vehicleMaintenanceJ1939DiagnosticTroubleCodes")


-- | Passenger vehicle data. Null if no data is available.
data VehicleMaintenancePassenger = VehicleMaintenancePassenger
  { vehicleMaintenancePassengerCheckEngineLight :: Maybe VehicleMaintenancePassengerCheckEngineLight -- ^ 
  , vehicleMaintenancePassengerDiagnosticTroubleCodes :: Maybe [VehicleMaintenancePassengerDiagnosticTroubleCodes] -- ^ Passenger vehicle DTCs.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VehicleMaintenancePassenger where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "vehicleMaintenancePassenger")
instance ToJSON VehicleMaintenancePassenger where
  toJSON = genericToJSON (removeFieldLabelPrefix False "vehicleMaintenancePassenger")


-- | Passenger vehicle check engine light.
data VehicleMaintenancePassengerCheckEngineLight = VehicleMaintenancePassengerCheckEngineLight
  { vehicleMaintenancePassengerCheckEngineLightIsOn :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VehicleMaintenancePassengerCheckEngineLight where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "vehicleMaintenancePassengerCheckEngineLight")
instance ToJSON VehicleMaintenancePassengerCheckEngineLight where
  toJSON = genericToJSON (removeFieldLabelPrefix False "vehicleMaintenancePassengerCheckEngineLight")


-- | 
data VehicleMaintenancePassengerDiagnosticTroubleCodes = VehicleMaintenancePassengerDiagnosticTroubleCodes
  { vehicleMaintenancePassengerDiagnosticTroubleCodesDtcShortCode :: Maybe Text -- ^ 
  , vehicleMaintenancePassengerDiagnosticTroubleCodesDtcId :: Maybe Int -- ^ 
  , vehicleMaintenancePassengerDiagnosticTroubleCodesDtcDescription :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VehicleMaintenancePassengerDiagnosticTroubleCodes where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "vehicleMaintenancePassengerDiagnosticTroubleCodes")
instance ToJSON VehicleMaintenancePassengerDiagnosticTroubleCodes where
  toJSON = genericToJSON (removeFieldLabelPrefix False "vehicleMaintenancePassengerDiagnosticTroubleCodes")


-- | Safety score details for a vehicle
data VehicleSafetyScoreResponse = VehicleSafetyScoreResponse
  { vehicleSafetyScoreResponseCrashCount :: Maybe Int -- ^ Crash event count
  , vehicleSafetyScoreResponseHarshAccelCount :: Maybe Int -- ^ Harsh acceleration event count
  , vehicleSafetyScoreResponseHarshBrakingCount :: Maybe Int -- ^ Harsh braking event count
  , vehicleSafetyScoreResponseHarshEvents :: Maybe [SafetyReportHarshEvent] -- ^ 
  , vehicleSafetyScoreResponseHarshTurningCount :: Maybe Int -- ^ Harsh turning event count
  , vehicleSafetyScoreResponseSafetyScore :: Maybe Int -- ^ Safety Score
  , vehicleSafetyScoreResponseSafetyScoreRank :: Maybe Text -- ^ Safety Score Rank
  , vehicleSafetyScoreResponseTimeOverSpeedLimitMs :: Maybe Int -- ^ Amount of time driven over the speed limit in milliseconds
  , vehicleSafetyScoreResponseTotalDistanceDrivenMeters :: Maybe Int -- ^ Total distance driven in meters
  , vehicleSafetyScoreResponseTotalHarshEventCount :: Maybe Int -- ^ Total harsh event count
  , vehicleSafetyScoreResponseTotalTimeDrivenMs :: Maybe Int -- ^ Amount of time driven in milliseconds
  , vehicleSafetyScoreResponseVehicleId :: Maybe Int -- ^ Vehicle ID
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VehicleSafetyScoreResponse where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "vehicleSafetyScoreResponse")
instance ToJSON VehicleSafetyScoreResponse where
  toJSON = genericToJSON (removeFieldLabelPrefix False "vehicleSafetyScoreResponse")


uncapitalize :: String -> String
uncapitalize (first:rest) = Char.toLower first : rest
uncapitalize [] = []

-- Remove a field label prefix during JSON parsing.
-- Also perform any replacements for special characters.
removeFieldLabelPrefix :: Bool -> String -> Options
removeFieldLabelPrefix _ prefix =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = uncapitalize . fromMaybe (error ("did not find prefix " ++ prefix)) . stripPrefix prefix . replaceSpecialChars
    }
  where
    replaceSpecialChars field = foldl (&) field (map mkCharReplacement specialChars)
    specialChars =
      [ ("@", "'At")
      , ("\\", "'Back_Slash")
      , ("<=", "'Less_Than_Or_Equal_To")
      , ("\"", "'Double_Quote")
      , ("[", "'Left_Square_Bracket")
      , ("]", "'Right_Square_Bracket")
      , ("^", "'Caret")
      , ("_", "'Underscore")
      , ("`", "'Backtick")
      , ("!", "'Exclamation")
      , ("#", "'Hash")
      , ("$", "'Dollar")
      , ("%", "'Percent")
      , ("&", "'Ampersand")
      , ("'", "'Quote")
      , ("(", "'Left_Parenthesis")
      , (")", "'Right_Parenthesis")
      , ("*", "'Star")
      , ("+", "'Plus")
      , (",", "'Comma")
      , ("-", "'Dash")
      , (".", "'Period")
      , ("/", "'Slash")
      , (":", "'Colon")
      , ("{", "'Left_Curly_Bracket")
      , ("|", "'Pipe")
      , ("<", "'LessThan")
      , ("!=", "'Not_Equal")
      , ("=", "'Equal")
      , ("}", "'Right_Curly_Bracket")
      , (">", "'GreaterThan")
      , ("~", "'Tilde")
      , ("?", "'Question_Mark")
      , (">=", "'Greater_Than_Or_Equal_To")
      ]
    mkCharReplacement (replaceStr, searchStr) = T.unpack . T.replace (T.tail $ T.pack searchStr) (T.pack replaceStr) . T.pack
