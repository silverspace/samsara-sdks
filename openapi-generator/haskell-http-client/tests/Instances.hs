{-# OPTIONS_GHC -fno-warn-unused-imports #-}

module Instances where

import Samsara.Model
import Samsara.Core

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.HashMap.Strict as HM
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Time as TI
import qualified Data.Vector as V

import Control.Monad
import Data.Char (isSpace)
import Data.List (sort)
import Test.QuickCheck

import ApproxEq

instance Arbitrary T.Text where
  arbitrary = T.pack <$> arbitrary

instance Arbitrary TI.Day where
  arbitrary = TI.ModifiedJulianDay . (2000 +) <$> arbitrary
  shrink = (TI.ModifiedJulianDay <$>) . shrink . TI.toModifiedJulianDay

instance Arbitrary TI.UTCTime where
  arbitrary =
    TI.UTCTime <$> arbitrary <*> (TI.secondsToDiffTime <$> choose (0, 86401))

instance Arbitrary BL.ByteString where
    arbitrary = BL.pack <$> arbitrary
    shrink xs = BL.pack <$> shrink (BL.unpack xs)

instance Arbitrary ByteArray where
    arbitrary = ByteArray <$> arbitrary
    shrink (ByteArray xs) = ByteArray <$> shrink xs

instance Arbitrary Binary where
    arbitrary = Binary <$> arbitrary
    shrink (Binary xs) = Binary <$> shrink xs

instance Arbitrary DateTime where
    arbitrary = DateTime <$> arbitrary
    shrink (DateTime xs) = DateTime <$> shrink xs

instance Arbitrary Date where
    arbitrary = Date <$> arbitrary
    shrink (Date xs) = Date <$> shrink xs

-- | A naive Arbitrary instance for A.Value:
instance Arbitrary A.Value where
  arbitrary = frequency [(3, simpleTypes), (1, arrayTypes), (1, objectTypes)]
    where
      simpleTypes :: Gen A.Value
      simpleTypes =
        frequency
          [ (1, return A.Null)
          , (2, liftM A.Bool (arbitrary :: Gen Bool))
          , (2, liftM (A.Number . fromIntegral) (arbitrary :: Gen Int))
          , (2, liftM (A.String . T.pack) (arbitrary :: Gen String))
          ]
      mapF (k, v) = (T.pack k, v)
      simpleAndArrays = frequency [(1, sized sizedArray), (4, simpleTypes)]
      arrayTypes = sized sizedArray
      objectTypes = sized sizedObject
      sizedArray n = liftM (A.Array . V.fromList) $ replicateM n simpleTypes
      sizedObject n =
        liftM (A.object . map mapF) $
        replicateM n $ (,) <$> (arbitrary :: Gen String) <*> simpleAndArrays
    
-- | Checks if a given list has no duplicates in _O(n log n)_.
hasNoDups
  :: (Ord a)
  => [a] -> Bool
hasNoDups = go Set.empty
  where
    go _ [] = True
    go s (x:xs)
      | s' <- Set.insert x s
      , Set.size s' > Set.size s = go s' xs
      | otherwise = False

instance ApproxEq TI.Day where
  (=~) = (==)

-- * Models
 
instance Arbitrary Address where
  arbitrary =
    Address
      <$> arbitrary -- addressContacts :: Maybe [Contact]
      <*> arbitrary -- addressFormattedAddress :: Maybe Text
      <*> arbitrary -- addressGeofence :: Maybe AddressGeofence
      <*> arbitrary -- addressId :: Maybe Integer
      <*> arbitrary -- addressName :: Maybe Text
      <*> arbitrary -- addressNotes :: Maybe Text
      <*> arbitrary -- addressTags :: Maybe [TagMetadata]
    
instance Arbitrary AddressGeofence where
  arbitrary =
    AddressGeofence
      <$> arbitrary -- addressGeofenceCircle :: Maybe AddressGeofenceCircle
      <*> arbitrary -- addressGeofencePolygon :: Maybe AddressGeofencePolygon
    
instance Arbitrary AddressGeofenceCircle where
  arbitrary =
    AddressGeofenceCircle
      <$> arbitrary -- addressGeofenceCircleLatitude :: Maybe Double
      <*> arbitrary -- addressGeofenceCircleRadiusMeters :: Maybe Integer
      <*> arbitrary -- addressGeofenceCircleLongitude :: Maybe Double
    
instance Arbitrary AddressGeofencePolygon where
  arbitrary =
    AddressGeofencePolygon
      <$> arbitrary -- addressGeofencePolygonVertices :: Maybe [AddressGeofencePolygonVertices]
    
instance Arbitrary AddressGeofencePolygonVertices where
  arbitrary =
    AddressGeofencePolygonVertices
      <$> arbitrary -- addressGeofencePolygonVerticesLatitude :: Maybe Double
      <*> arbitrary -- addressGeofencePolygonVerticesLongitude :: Maybe Double
    
instance Arbitrary AddressesAddresses where
  arbitrary =
    AddressesAddresses
      <$> arbitrary -- addressesAddressesNotes :: Maybe Text
      <*> arbitrary -- addressesAddressesFormattedAddress :: Text
      <*> arbitrary -- addressesAddressesGeofence :: AddressGeofence
      <*> arbitrary -- addressesAddressesTagIds :: Maybe [Integer]
      <*> arbitrary -- addressesAddressesName :: Text
      <*> arbitrary -- addressesAddressesContactIds :: Maybe [Integer]
    
instance Arbitrary AllRouteJobUpdates where
  arbitrary =
    AllRouteJobUpdates
      <$> arbitrary -- allRouteJobUpdatesJobUpdates :: Maybe [JobUpdateObject]
      <*> arbitrary -- allRouteJobUpdatesSequenceId :: Maybe Text
    
instance Arbitrary Asset where
  arbitrary =
    Asset
      <$> arbitrary -- assetAssetSerialNumber :: Maybe Text
      <*> arbitrary -- assetCable :: Maybe [AssetCable]
      <*> arbitrary -- assetEngineHours :: Maybe Int
      <*> arbitrary -- assetId :: Integer
      <*> arbitrary -- assetName :: Maybe Text
    
instance Arbitrary AssetCable where
  arbitrary =
    AssetCable
      <$> arbitrary -- assetCableAssetType :: Maybe Text
    
instance Arbitrary AssetCurrentLocation where
  arbitrary =
    AssetCurrentLocation
      <$> arbitrary -- assetCurrentLocationLatitude :: Maybe Double
      <*> arbitrary -- assetCurrentLocationLocation :: Maybe Text
      <*> arbitrary -- assetCurrentLocationLongitude :: Maybe Double
      <*> arbitrary -- assetCurrentLocationSpeedMilesPerHour :: Maybe Double
      <*> arbitrary -- assetCurrentLocationTimeMs :: Maybe Integer
    
instance Arbitrary AssetCurrentLocationsResponse where
  arbitrary =
    AssetCurrentLocationsResponse
      <$> arbitrary -- assetCurrentLocationsResponseCable :: Maybe [AssetCable]
      <*> arbitrary -- assetCurrentLocationsResponseEngineHours :: Maybe Int
      <*> arbitrary -- assetCurrentLocationsResponseId :: Integer
      <*> arbitrary -- assetCurrentLocationsResponseLocation :: Maybe [AssetCurrentLocation]
      <*> arbitrary -- assetCurrentLocationsResponseName :: Maybe Text
    
instance Arbitrary AssetReeferResponse where
  arbitrary =
    AssetReeferResponse
      <$> arbitrary -- assetReeferResponseAssetType :: Maybe Text
      <*> arbitrary -- assetReeferResponseId :: Maybe Int
      <*> arbitrary -- assetReeferResponseName :: Maybe Text
      <*> arbitrary -- assetReeferResponseReeferStats :: Maybe AssetReeferResponseReeferStats
    
instance Arbitrary AssetReeferResponseReeferStats where
  arbitrary =
    AssetReeferResponseReeferStats
      <$> arbitrary -- assetReeferResponseReeferStatsFuelPercentage :: Maybe [AssetReeferResponseReeferStatsFuelPercentage]
      <*> arbitrary -- assetReeferResponseReeferStatsPowerStatus :: Maybe [AssetReeferResponseReeferStatsPowerStatus]
      <*> arbitrary -- assetReeferResponseReeferStatsEngineHours :: Maybe [AssetReeferResponseReeferStatsEngineHours]
      <*> arbitrary -- assetReeferResponseReeferStatsSetPoint :: Maybe [AssetReeferResponseReeferStatsSetPoint]
      <*> arbitrary -- assetReeferResponseReeferStatsReturnAirTemp :: Maybe [AssetReeferResponseReeferStatsReturnAirTemp]
      <*> arbitrary -- assetReeferResponseReeferStatsAlarms :: Maybe [AssetReeferResponseReeferStatsAlarms1]
    
instance Arbitrary AssetReeferResponseReeferStatsAlarms where
  arbitrary =
    AssetReeferResponseReeferStatsAlarms
      <$> arbitrary -- assetReeferResponseReeferStatsAlarmsSeverity :: Maybe Integer
      <*> arbitrary -- assetReeferResponseReeferStatsAlarmsOperatorAction :: Maybe Text
      <*> arbitrary -- assetReeferResponseReeferStatsAlarmsDescription :: Maybe Text
      <*> arbitrary -- assetReeferResponseReeferStatsAlarmsAlarmCode :: Maybe Integer
    
instance Arbitrary AssetReeferResponseReeferStatsAlarms1 where
  arbitrary =
    AssetReeferResponseReeferStatsAlarms1
      <$> arbitrary -- assetReeferResponseReeferStatsAlarms1Alarms :: Maybe [AssetReeferResponseReeferStatsAlarms]
      <*> arbitrary -- assetReeferResponseReeferStatsAlarms1ChangedAtMs :: Maybe Integer
    
instance Arbitrary AssetReeferResponseReeferStatsEngineHours where
  arbitrary =
    AssetReeferResponseReeferStatsEngineHours
      <$> arbitrary -- assetReeferResponseReeferStatsEngineHoursEngineHours :: Maybe Integer
      <*> arbitrary -- assetReeferResponseReeferStatsEngineHoursChangedAtMs :: Maybe Integer
    
instance Arbitrary AssetReeferResponseReeferStatsFuelPercentage where
  arbitrary =
    AssetReeferResponseReeferStatsFuelPercentage
      <$> arbitrary -- assetReeferResponseReeferStatsFuelPercentageFuelPercentage :: Maybe Integer
      <*> arbitrary -- assetReeferResponseReeferStatsFuelPercentageChangedAtMs :: Maybe Integer
    
instance Arbitrary AssetReeferResponseReeferStatsPowerStatus where
  arbitrary =
    AssetReeferResponseReeferStatsPowerStatus
      <$> arbitrary -- assetReeferResponseReeferStatsPowerStatusChangedAtMs :: Maybe Integer
      <*> arbitrary -- assetReeferResponseReeferStatsPowerStatusStatus :: Maybe Text
    
instance Arbitrary AssetReeferResponseReeferStatsReturnAirTemp where
  arbitrary =
    AssetReeferResponseReeferStatsReturnAirTemp
      <$> arbitrary -- assetReeferResponseReeferStatsReturnAirTempTempInMilliC :: Maybe Integer
      <*> arbitrary -- assetReeferResponseReeferStatsReturnAirTempChangedAtMs :: Maybe Integer
    
instance Arbitrary AssetReeferResponseReeferStatsSetPoint where
  arbitrary =
    AssetReeferResponseReeferStatsSetPoint
      <$> arbitrary -- assetReeferResponseReeferStatsSetPointTempInMilliC :: Maybe Integer
      <*> arbitrary -- assetReeferResponseReeferStatsSetPointChangedAtMs :: Maybe Integer
    
instance Arbitrary AuxInput where
  arbitrary =
    AuxInput
      <$> arbitrary -- auxInputTimeMs :: A.Value
      <*> arbitrary -- auxInputValue :: Bool
    
instance Arbitrary AuxInputSeries where
  arbitrary =
    AuxInputSeries
      <$> arbitrary -- auxInputSeriesName :: Text
      <*> arbitrary -- auxInputSeriesValues :: [AuxInput]
    
instance Arbitrary CargoResponse where
  arbitrary =
    CargoResponse
      <$> arbitrary -- cargoResponseGroupId :: Maybe Integer
      <*> arbitrary -- cargoResponseSensors :: Maybe [CargoResponseSensors]
    
instance Arbitrary CargoResponseSensors where
  arbitrary =
    CargoResponseSensors
      <$> arbitrary -- cargoResponseSensorsCargoEmpty :: Maybe Bool
      <*> arbitrary -- cargoResponseSensorsName :: Maybe Text
      <*> arbitrary -- cargoResponseSensorsId :: Maybe Integer
    
instance Arbitrary Contact where
  arbitrary =
    Contact
      <$> arbitrary -- contactEmail :: Maybe Text
      <*> arbitrary -- contactFirstName :: Maybe Text
      <*> arbitrary -- contactId :: Maybe Integer
      <*> arbitrary -- contactLastName :: Maybe Text
      <*> arbitrary -- contactPhone :: Maybe Text
    
instance Arbitrary CurrentDriver where
  arbitrary =
    
    pure CurrentDriver
     
instance Arbitrary DataInputHistoryResponse where
  arbitrary =
    DataInputHistoryResponse
      <$> arbitrary -- dataInputHistoryResponseId :: Maybe Integer
      <*> arbitrary -- dataInputHistoryResponseName :: Text
      <*> arbitrary -- dataInputHistoryResponsePoints :: Maybe [DataInputHistoryResponsePoints]
    
instance Arbitrary DataInputHistoryResponsePoints where
  arbitrary =
    DataInputHistoryResponsePoints
      <$> arbitrary -- dataInputHistoryResponsePointsValue :: Maybe Double
      <*> arbitrary -- dataInputHistoryResponsePointsTimeMs :: Maybe Integer
    
instance Arbitrary DispatchJob where
  arbitrary =
    DispatchJob
      <$> arbitrary -- dispatchJobDestinationAddress :: Maybe Text
      <*> arbitrary -- dispatchJobDestinationAddressId :: Maybe Integer
      <*> arbitrary -- dispatchJobDestinationLat :: Maybe Double
      <*> arbitrary -- dispatchJobDestinationLng :: Maybe Double
      <*> arbitrary -- dispatchJobDestinationName :: Maybe Text
      <*> arbitrary -- dispatchJobNotes :: Maybe Text
      <*> arbitrary -- dispatchJobScheduledArrivalTimeMs :: Integer
      <*> arbitrary -- dispatchJobScheduledDepartureTimeMs :: Maybe Integer
      <*> arbitrary -- dispatchJobArrivedAtMs :: Maybe Integer
      <*> arbitrary -- dispatchJobCompletedAtMs :: Maybe Integer
      <*> arbitrary -- dispatchJobDispatchRouteId :: Integer
      <*> arbitrary -- dispatchJobDriverId :: Maybe Integer
      <*> arbitrary -- dispatchJobEnRouteAtMs :: Maybe Integer
      <*> arbitrary -- dispatchJobEstimatedArrivalMs :: Maybe Integer
      <*> arbitrary -- dispatchJobFleetViewerUrl :: Maybe Text
      <*> arbitrary -- dispatchJobGroupId :: Integer
      <*> arbitrary -- dispatchJobId :: Integer
      <*> arbitrary -- dispatchJobJobState :: JobStatus
      <*> arbitrary -- dispatchJobSkippedAtMs :: Maybe Integer
      <*> arbitrary -- dispatchJobVehicleId :: Maybe Integer
    
instance Arbitrary DispatchJobCreate where
  arbitrary =
    DispatchJobCreate
      <$> arbitrary -- dispatchJobCreateDestinationAddress :: Maybe Text
      <*> arbitrary -- dispatchJobCreateDestinationAddressId :: Maybe Integer
      <*> arbitrary -- dispatchJobCreateDestinationLat :: Maybe Double
      <*> arbitrary -- dispatchJobCreateDestinationLng :: Maybe Double
      <*> arbitrary -- dispatchJobCreateDestinationName :: Maybe Text
      <*> arbitrary -- dispatchJobCreateNotes :: Maybe Text
      <*> arbitrary -- dispatchJobCreateScheduledArrivalTimeMs :: Integer
      <*> arbitrary -- dispatchJobCreateScheduledDepartureTimeMs :: Maybe Integer
    
instance Arbitrary DispatchRoute where
  arbitrary =
    DispatchRoute
      <$> arbitrary -- dispatchRouteActualEndMs :: Maybe Integer
      <*> arbitrary -- dispatchRouteActualStartMs :: Maybe Integer
      <*> arbitrary -- dispatchRouteDriverId :: Maybe Integer
      <*> arbitrary -- dispatchRouteGroupId :: Maybe Integer
      <*> arbitrary -- dispatchRouteName :: Text
      <*> arbitrary -- dispatchRouteScheduledEndMs :: Integer
      <*> arbitrary -- dispatchRouteScheduledMeters :: Maybe Integer
      <*> arbitrary -- dispatchRouteScheduledStartMs :: Integer
      <*> arbitrary -- dispatchRouteStartLocationAddress :: Maybe Text
      <*> arbitrary -- dispatchRouteStartLocationAddressId :: Maybe Integer
      <*> arbitrary -- dispatchRouteStartLocationLat :: Maybe Double
      <*> arbitrary -- dispatchRouteStartLocationLng :: Maybe Double
      <*> arbitrary -- dispatchRouteStartLocationName :: Maybe Text
      <*> arbitrary -- dispatchRouteTrailerId :: Maybe Integer
      <*> arbitrary -- dispatchRouteVehicleId :: Maybe Integer
      <*> arbitrary -- dispatchRouteDispatchJobs :: [DispatchJob]
      <*> arbitrary -- dispatchRouteId :: Integer
    
instance Arbitrary DispatchRouteBase where
  arbitrary =
    DispatchRouteBase
      <$> arbitrary -- dispatchRouteBaseActualEndMs :: Maybe Integer
      <*> arbitrary -- dispatchRouteBaseActualStartMs :: Maybe Integer
      <*> arbitrary -- dispatchRouteBaseDriverId :: Maybe Integer
      <*> arbitrary -- dispatchRouteBaseGroupId :: Maybe Integer
      <*> arbitrary -- dispatchRouteBaseName :: Text
      <*> arbitrary -- dispatchRouteBaseScheduledEndMs :: Integer
      <*> arbitrary -- dispatchRouteBaseScheduledMeters :: Maybe Integer
      <*> arbitrary -- dispatchRouteBaseScheduledStartMs :: Integer
      <*> arbitrary -- dispatchRouteBaseStartLocationAddress :: Maybe Text
      <*> arbitrary -- dispatchRouteBaseStartLocationAddressId :: Maybe Integer
      <*> arbitrary -- dispatchRouteBaseStartLocationLat :: Maybe Double
      <*> arbitrary -- dispatchRouteBaseStartLocationLng :: Maybe Double
      <*> arbitrary -- dispatchRouteBaseStartLocationName :: Maybe Text
      <*> arbitrary -- dispatchRouteBaseTrailerId :: Maybe Integer
      <*> arbitrary -- dispatchRouteBaseVehicleId :: Maybe Integer
    
instance Arbitrary DispatchRouteCreate where
  arbitrary =
    DispatchRouteCreate
      <$> arbitrary -- dispatchRouteCreateActualEndMs :: Maybe Integer
      <*> arbitrary -- dispatchRouteCreateActualStartMs :: Maybe Integer
      <*> arbitrary -- dispatchRouteCreateDriverId :: Maybe Integer
      <*> arbitrary -- dispatchRouteCreateGroupId :: Maybe Integer
      <*> arbitrary -- dispatchRouteCreateName :: Text
      <*> arbitrary -- dispatchRouteCreateScheduledEndMs :: Integer
      <*> arbitrary -- dispatchRouteCreateScheduledMeters :: Maybe Integer
      <*> arbitrary -- dispatchRouteCreateScheduledStartMs :: Integer
      <*> arbitrary -- dispatchRouteCreateStartLocationAddress :: Maybe Text
      <*> arbitrary -- dispatchRouteCreateStartLocationAddressId :: Maybe Integer
      <*> arbitrary -- dispatchRouteCreateStartLocationLat :: Maybe Double
      <*> arbitrary -- dispatchRouteCreateStartLocationLng :: Maybe Double
      <*> arbitrary -- dispatchRouteCreateStartLocationName :: Maybe Text
      <*> arbitrary -- dispatchRouteCreateTrailerId :: Maybe Integer
      <*> arbitrary -- dispatchRouteCreateVehicleId :: Maybe Integer
      <*> arbitrary -- dispatchRouteCreateDispatchJobs :: [DispatchJobCreate]
    
instance Arbitrary DispatchRouteHistoricalEntry where
  arbitrary =
    DispatchRouteHistoricalEntry
      <$> arbitrary -- dispatchRouteHistoricalEntryChangedAtMs :: Maybe Integer
      <*> arbitrary -- dispatchRouteHistoricalEntryRoute :: Maybe DispatchRoute
    
instance Arbitrary DispatchRouteHistory where
  arbitrary =
    DispatchRouteHistory
      <$> arbitrary -- dispatchRouteHistoryHistory :: Maybe [DispatchRouteHistoricalEntry]
    
instance Arbitrary Document where
  arbitrary =
    Document
      <$> arbitrary -- documentDispatchJobId :: Maybe Integer
      <*> arbitrary -- documentNotes :: Maybe Text
      <*> arbitrary -- documentDocumentType :: Text
      <*> arbitrary -- documentDriverCreatedAtMs :: Integer
      <*> arbitrary -- documentDriverId :: Integer
      <*> arbitrary -- documentFields :: [DocumentField]
      <*> arbitrary -- documentVehicleId :: Maybe Integer
    
instance Arbitrary DocumentBase where
  arbitrary =
    DocumentBase
      <$> arbitrary -- documentBaseDispatchJobId :: Maybe Integer
      <*> arbitrary -- documentBaseNotes :: Maybe Text
    
instance Arbitrary DocumentCreate where
  arbitrary =
    DocumentCreate
      <$> arbitrary -- documentCreateDispatchJobId :: Maybe Integer
      <*> arbitrary -- documentCreateNotes :: Maybe Text
      <*> arbitrary -- documentCreateDocumentTypeUuid :: Text
      <*> arbitrary -- documentCreateFields :: [DocumentField]
    
instance Arbitrary DocumentField where
  arbitrary =
    DocumentField
      <$> arbitrary -- documentFieldNumberValue :: Maybe Double
      <*> arbitrary -- documentFieldPhotoValue :: Maybe [DocumentFieldCreatePhotoValue]
      <*> arbitrary -- documentFieldStringValue :: Maybe Text
      <*> arbitrary -- documentFieldValueType :: Text
      <*> arbitrary -- documentFieldLabel :: Text
      <*> arbitrary -- documentFieldValue :: Maybe A.Value
    
instance Arbitrary DocumentFieldCreate where
  arbitrary =
    DocumentFieldCreate
      <$> arbitrary -- documentFieldCreateNumberValue :: Maybe Double
      <*> arbitrary -- documentFieldCreatePhotoValue :: Maybe [DocumentFieldCreatePhotoValue]
      <*> arbitrary -- documentFieldCreateStringValue :: Maybe Text
      <*> arbitrary -- documentFieldCreateValueType :: Text
    
instance Arbitrary DocumentFieldCreatePhotoValue where
  arbitrary =
    DocumentFieldCreatePhotoValue
      <$> arbitrary -- documentFieldCreatePhotoValueUrl :: Maybe Text
    
instance Arbitrary DocumentFieldType where
  arbitrary =
    DocumentFieldType
      <$> arbitrary -- documentFieldTypeLabel :: Text
      <*> arbitrary -- documentFieldTypeNumberValueTypeMetadata :: Maybe DocumentFieldTypeNumberValueTypeMetadata
      <*> arbitrary -- documentFieldTypeValueType :: Text
    
instance Arbitrary DocumentFieldTypeNumberValueTypeMetadata where
  arbitrary =
    DocumentFieldTypeNumberValueTypeMetadata
      <$> arbitrary -- documentFieldTypeNumberValueTypeMetadataNumDecimalPlaces :: Maybe Integer
    
instance Arbitrary DocumentType where
  arbitrary =
    DocumentType
      <$> arbitrary -- documentTypeFieldTypes :: Maybe [Array]
      <*> arbitrary -- documentTypeName :: Text
      <*> arbitrary -- documentTypeOrgId :: Integer
      <*> arbitrary -- documentTypeUuid :: Text
    
instance Arbitrary DoorResponse where
  arbitrary =
    DoorResponse
      <$> arbitrary -- doorResponseGroupId :: Maybe Integer
      <*> arbitrary -- doorResponseSensors :: Maybe [DoorResponseSensors]
    
instance Arbitrary DoorResponseSensors where
  arbitrary =
    DoorResponseSensors
      <$> arbitrary -- doorResponseSensorsDoorClosed :: Maybe Bool
      <*> arbitrary -- doorResponseSensorsName :: Maybe Text
      <*> arbitrary -- doorResponseSensorsId :: Maybe Integer
    
instance Arbitrary Driver where
  arbitrary =
    Driver
      <$> arbitrary -- driverEldAdverseWeatherExemptionEnabled :: Maybe Bool
      <*> arbitrary -- driverEldBigDayExemptionEnabled :: Maybe Bool
      <*> arbitrary -- driverEldDayStartHour :: Maybe Int
      <*> arbitrary -- driverEldExempt :: Maybe Bool
      <*> arbitrary -- driverEldExemptReason :: Maybe Text
      <*> arbitrary -- driverEldPcEnabled :: Maybe Bool
      <*> arbitrary -- driverEldYmEnabled :: Maybe Bool
      <*> arbitrary -- driverExternalIds :: Maybe (Map.Map String Text)
      <*> arbitrary -- driverGroupId :: Maybe Integer
      <*> arbitrary -- driverLicenseNumber :: Maybe Text
      <*> arbitrary -- driverLicenseState :: Maybe Text
      <*> arbitrary -- driverName :: Text
      <*> arbitrary -- driverNotes :: Maybe Text
      <*> arbitrary -- driverPhone :: Maybe Text
      <*> arbitrary -- driverUsername :: Maybe Text
      <*> arbitrary -- driverVehicleId :: Maybe Integer
      <*> arbitrary -- driverId :: Integer
      <*> arbitrary -- driverIsDeactivated :: Maybe Bool
      <*> arbitrary -- driverTags :: Maybe [TagMetadata]
    
instance Arbitrary DriverBase where
  arbitrary =
    DriverBase
      <$> arbitrary -- driverBaseEldAdverseWeatherExemptionEnabled :: Maybe Bool
      <*> arbitrary -- driverBaseEldBigDayExemptionEnabled :: Maybe Bool
      <*> arbitrary -- driverBaseEldDayStartHour :: Maybe Int
      <*> arbitrary -- driverBaseEldExempt :: Maybe Bool
      <*> arbitrary -- driverBaseEldExemptReason :: Maybe Text
      <*> arbitrary -- driverBaseEldPcEnabled :: Maybe Bool
      <*> arbitrary -- driverBaseEldYmEnabled :: Maybe Bool
      <*> arbitrary -- driverBaseExternalIds :: Maybe (Map.Map String Text)
      <*> arbitrary -- driverBaseGroupId :: Maybe Integer
      <*> arbitrary -- driverBaseLicenseNumber :: Maybe Text
      <*> arbitrary -- driverBaseLicenseState :: Maybe Text
      <*> arbitrary -- driverBaseName :: Text
      <*> arbitrary -- driverBaseNotes :: Maybe Text
      <*> arbitrary -- driverBasePhone :: Maybe Text
      <*> arbitrary -- driverBaseUsername :: Maybe Text
      <*> arbitrary -- driverBaseVehicleId :: Maybe Integer
    
instance Arbitrary DriverDailyLogResponse where
  arbitrary =
    DriverDailyLogResponse
      <$> arbitrary -- driverDailyLogResponseDays :: Maybe [DriverDailyLogResponseDays]
    
instance Arbitrary DriverDailyLogResponseDays where
  arbitrary =
    DriverDailyLogResponseDays
      <$> arbitrary -- driverDailyLogResponseDaysCertifiedAtMs :: Maybe Integer
      <*> arbitrary -- driverDailyLogResponseDaysEndMs :: Maybe Int
      <*> arbitrary -- driverDailyLogResponseDaysStartMs :: Maybe Int
      <*> arbitrary -- driverDailyLogResponseDaysTrailerIds :: Maybe A.Value
      <*> arbitrary -- driverDailyLogResponseDaysActiveHours :: Maybe Double
      <*> arbitrary -- driverDailyLogResponseDaysDistanceMiles :: Maybe Double
      <*> arbitrary -- driverDailyLogResponseDaysActiveMs :: Maybe Integer
      <*> arbitrary -- driverDailyLogResponseDaysCertified :: Maybe Bool
      <*> arbitrary -- driverDailyLogResponseDaysVehicleIds :: Maybe A.Value
    
instance Arbitrary DriverForCreate where
  arbitrary =
    DriverForCreate
      <$> arbitrary -- driverForCreateEldAdverseWeatherExemptionEnabled :: Maybe Bool
      <*> arbitrary -- driverForCreateEldBigDayExemptionEnabled :: Maybe Bool
      <*> arbitrary -- driverForCreateEldDayStartHour :: Maybe Int
      <*> arbitrary -- driverForCreateEldExempt :: Maybe Bool
      <*> arbitrary -- driverForCreateEldExemptReason :: Maybe Text
      <*> arbitrary -- driverForCreateEldPcEnabled :: Maybe Bool
      <*> arbitrary -- driverForCreateEldYmEnabled :: Maybe Bool
      <*> arbitrary -- driverForCreateExternalIds :: Maybe (Map.Map String Text)
      <*> arbitrary -- driverForCreateGroupId :: Maybe Integer
      <*> arbitrary -- driverForCreateLicenseNumber :: Maybe Text
      <*> arbitrary -- driverForCreateLicenseState :: Maybe Text
      <*> arbitrary -- driverForCreateName :: Text
      <*> arbitrary -- driverForCreateNotes :: Maybe Text
      <*> arbitrary -- driverForCreatePhone :: Maybe Text
      <*> arbitrary -- driverForCreateUsername :: Maybe Text
      <*> arbitrary -- driverForCreateVehicleId :: Maybe Integer
      <*> arbitrary -- driverForCreatePassword :: Text
      <*> arbitrary -- driverForCreateTagIds :: Maybe [Integer]
    
instance Arbitrary DriverSafetyScoreResponse where
  arbitrary =
    DriverSafetyScoreResponse
      <$> arbitrary -- driverSafetyScoreResponseCrashCount :: Maybe Int
      <*> arbitrary -- driverSafetyScoreResponseDriverId :: Maybe Int
      <*> arbitrary -- driverSafetyScoreResponseHarshAccelCount :: Maybe Int
      <*> arbitrary -- driverSafetyScoreResponseHarshBrakingCount :: Maybe Int
      <*> arbitrary -- driverSafetyScoreResponseHarshEvents :: Maybe [SafetyReportHarshEvent]
      <*> arbitrary -- driverSafetyScoreResponseHarshTurningCount :: Maybe Int
      <*> arbitrary -- driverSafetyScoreResponseSafetyScore :: Maybe Int
      <*> arbitrary -- driverSafetyScoreResponseSafetyScoreRank :: Maybe Text
      <*> arbitrary -- driverSafetyScoreResponseTimeOverSpeedLimitMs :: Maybe Int
      <*> arbitrary -- driverSafetyScoreResponseTotalDistanceDrivenMeters :: Maybe Int
      <*> arbitrary -- driverSafetyScoreResponseTotalHarshEventCount :: Maybe Int
      <*> arbitrary -- driverSafetyScoreResponseTotalTimeDrivenMs :: Maybe Int
    
instance Arbitrary DriversResponse where
  arbitrary =
    DriversResponse
      <$> arbitrary -- driversResponseDrivers :: Maybe [Driver]
    
instance Arbitrary DriversSummaryResponse where
  arbitrary =
    DriversSummaryResponse
      <$> arbitrary -- driversSummaryResponseSummaries :: Maybe [DriversSummaryResponseSummaries]
    
instance Arbitrary DriversSummaryResponseSummaries where
  arbitrary =
    DriversSummaryResponseSummaries
      <$> arbitrary -- driversSummaryResponseSummariesDriverId :: Maybe Integer
      <*> arbitrary -- driversSummaryResponseSummariesDistanceMiles :: Maybe Double
      <*> arbitrary -- driversSummaryResponseSummariesDriveMs :: Maybe Integer
      <*> arbitrary -- driversSummaryResponseSummariesActiveMs :: Maybe Integer
      <*> arbitrary -- driversSummaryResponseSummariesDriverUsername :: Maybe Text
      <*> arbitrary -- driversSummaryResponseSummariesGroupId :: Maybe Integer
      <*> arbitrary -- driversSummaryResponseSummariesDriverName :: Maybe Text
      <*> arbitrary -- driversSummaryResponseSummariesOnDutyMs :: Maybe Integer
    
instance Arbitrary DvirBase where
  arbitrary =
    DvirBase
      <$> arbitrary -- dvirBaseAuthorSignature :: Maybe DvirBaseAuthorSignature
      <*> arbitrary -- dvirBaseDefectsCorrected :: Maybe Bool
      <*> arbitrary -- dvirBaseDefectsNeedNotBeCorrected :: Maybe Bool
      <*> arbitrary -- dvirBaseId :: Maybe Integer
      <*> arbitrary -- dvirBaseInspectionType :: Maybe Text
      <*> arbitrary -- dvirBaseMechanicNotes :: Maybe Text
      <*> arbitrary -- dvirBaseMechanicOrAgentSignature :: Maybe DvirBaseMechanicOrAgentSignature
      <*> arbitrary -- dvirBaseNextDriverSignature :: Maybe DvirBaseNextDriverSignature
      <*> arbitrary -- dvirBaseOdometerMiles :: Maybe Integer
      <*> arbitrary -- dvirBaseTimeMs :: Maybe Integer
      <*> arbitrary -- dvirBaseTrailerDefects :: Maybe [DvirBaseTrailerDefects]
      <*> arbitrary -- dvirBaseTrailerId :: Maybe Int
      <*> arbitrary -- dvirBaseTrailerName :: Maybe Text
      <*> arbitrary -- dvirBaseVehicle :: Maybe DvirBaseVehicle
      <*> arbitrary -- dvirBaseVehicleCondition :: Maybe Text
      <*> arbitrary -- dvirBaseVehicleDefects :: Maybe [DvirBaseTrailerDefects]
    
instance Arbitrary DvirBaseAuthorSignature where
  arbitrary =
    DvirBaseAuthorSignature
      <$> arbitrary -- dvirBaseAuthorSignatureMechanicUserId :: Maybe Integer
      <*> arbitrary -- dvirBaseAuthorSignatureDriverId :: Maybe Integer
      <*> arbitrary -- dvirBaseAuthorSignatureName :: Maybe Text
      <*> arbitrary -- dvirBaseAuthorSignatureSignedAt :: Maybe Integer
      <*> arbitrary -- dvirBaseAuthorSignatureType :: Maybe Text
      <*> arbitrary -- dvirBaseAuthorSignatureEmail :: Maybe Text
      <*> arbitrary -- dvirBaseAuthorSignatureUsername :: Maybe Text
    
instance Arbitrary DvirBaseMechanicOrAgentSignature where
  arbitrary =
    DvirBaseMechanicOrAgentSignature
      <$> arbitrary -- dvirBaseMechanicOrAgentSignatureMechanicUserId :: Maybe Integer
      <*> arbitrary -- dvirBaseMechanicOrAgentSignatureDriverId :: Maybe Integer
      <*> arbitrary -- dvirBaseMechanicOrAgentSignatureName :: Maybe Text
      <*> arbitrary -- dvirBaseMechanicOrAgentSignatureSignedAt :: Maybe Integer
      <*> arbitrary -- dvirBaseMechanicOrAgentSignatureType :: Maybe Text
      <*> arbitrary -- dvirBaseMechanicOrAgentSignatureEmail :: Maybe Text
      <*> arbitrary -- dvirBaseMechanicOrAgentSignatureUsername :: Maybe Text
    
instance Arbitrary DvirBaseNextDriverSignature where
  arbitrary =
    DvirBaseNextDriverSignature
      <$> arbitrary -- dvirBaseNextDriverSignatureDriverId :: Maybe Integer
      <*> arbitrary -- dvirBaseNextDriverSignatureName :: Maybe Text
      <*> arbitrary -- dvirBaseNextDriverSignatureSignedAt :: Maybe Integer
      <*> arbitrary -- dvirBaseNextDriverSignatureType :: Maybe Text
      <*> arbitrary -- dvirBaseNextDriverSignatureEmail :: Maybe Text
      <*> arbitrary -- dvirBaseNextDriverSignatureUsername :: Maybe Text
    
instance Arbitrary DvirBaseTrailerDefects where
  arbitrary =
    DvirBaseTrailerDefects
      <$> arbitrary -- dvirBaseTrailerDefectsComment :: Maybe Text
      <*> arbitrary -- dvirBaseTrailerDefectsDefectType :: Maybe Text
    
instance Arbitrary DvirBaseVehicle where
  arbitrary =
    DvirBaseVehicle
      <$> arbitrary -- dvirBaseVehicleName :: Maybe Text
      <*> arbitrary -- dvirBaseVehicleId :: Maybe Integer
    
instance Arbitrary DvirListResponse where
  arbitrary =
    DvirListResponse
      <$> arbitrary -- dvirListResponseDvirs :: Maybe [DvirBase]
    
instance Arbitrary EngineState where
  arbitrary =
    EngineState
      <$> arbitrary -- engineStateTimeMs :: A.Value
      <*> arbitrary -- engineStateValue :: Text
    
instance Arbitrary FleetVehicleLocation where
  arbitrary =
    FleetVehicleLocation
      <$> arbitrary -- fleetVehicleLocationLatitude :: Maybe Double
      <*> arbitrary -- fleetVehicleLocationLocation :: Maybe Text
      <*> arbitrary -- fleetVehicleLocationLongitude :: Maybe Double
      <*> arbitrary -- fleetVehicleLocationSpeedMilesPerHour :: Maybe Double
      <*> arbitrary -- fleetVehicleLocationTimeMs :: Maybe Integer
    
instance Arbitrary FleetVehicleResponse where
  arbitrary =
    FleetVehicleResponse
      <$> arbitrary -- fleetVehicleResponseExternalIds :: Maybe (Map.Map String Text)
      <*> arbitrary -- fleetVehicleResponseHarshAccelSetting :: Maybe Text
      <*> arbitrary -- fleetVehicleResponseId :: Integer
      <*> arbitrary -- fleetVehicleResponseName :: Text
      <*> arbitrary -- fleetVehicleResponseVehicleInfo :: Maybe FleetVehicleResponseVehicleInfo
    
instance Arbitrary FleetVehicleResponseVehicleInfo where
  arbitrary =
    FleetVehicleResponseVehicleInfo
      <$> arbitrary -- fleetVehicleResponseVehicleInfoYear :: Maybe Integer
      <*> arbitrary -- fleetVehicleResponseVehicleInfoModel :: Maybe Text
      <*> arbitrary -- fleetVehicleResponseVehicleInfoVin :: Maybe Text
      <*> arbitrary -- fleetVehicleResponseVehicleInfoMake :: Maybe Text
    
instance Arbitrary HosAuthenticationLogsResponse where
  arbitrary =
    HosAuthenticationLogsResponse
      <$> arbitrary -- hosAuthenticationLogsResponseAuthenticationLogs :: Maybe [HosAuthenticationLogsResponseAuthenticationLogs]
    
instance Arbitrary HosAuthenticationLogsResponseAuthenticationLogs where
  arbitrary =
    HosAuthenticationLogsResponseAuthenticationLogs
      <$> arbitrary -- hosAuthenticationLogsResponseAuthenticationLogsActionType :: Maybe Text
      <*> arbitrary -- hosAuthenticationLogsResponseAuthenticationLogsAddress :: Maybe Text
      <*> arbitrary -- hosAuthenticationLogsResponseAuthenticationLogsCity :: Maybe Text
      <*> arbitrary -- hosAuthenticationLogsResponseAuthenticationLogsHappenedAtMs :: Maybe Integer
      <*> arbitrary -- hosAuthenticationLogsResponseAuthenticationLogsAddressName :: Maybe Text
      <*> arbitrary -- hosAuthenticationLogsResponseAuthenticationLogsState :: Maybe Text
    
instance Arbitrary HosLogsResponse where
  arbitrary =
    HosLogsResponse
      <$> arbitrary -- hosLogsResponseLogs :: Maybe [HosLogsResponseLogs]
    
instance Arbitrary HosLogsResponseLogs where
  arbitrary =
    HosLogsResponseLogs
      <$> arbitrary -- hosLogsResponseLogsLocLng :: Maybe Double
      <*> arbitrary -- hosLogsResponseLogsLogStartMs :: Maybe Integer
      <*> arbitrary -- hosLogsResponseLogsDriverId :: Maybe Integer
      <*> arbitrary -- hosLogsResponseLogsStatusType :: Maybe Text
      <*> arbitrary -- hosLogsResponseLogsLocCity :: Maybe Text
      <*> arbitrary -- hosLogsResponseLogsGroupId :: Maybe Integer
      <*> arbitrary -- hosLogsResponseLogsLocName :: Maybe Text
      <*> arbitrary -- hosLogsResponseLogsLocLat :: Maybe Double
      <*> arbitrary -- hosLogsResponseLogsRemark :: Maybe Text
      <*> arbitrary -- hosLogsResponseLogsLocState :: Maybe Text
      <*> arbitrary -- hosLogsResponseLogsVehicleId :: Maybe Integer
      <*> arbitrary -- hosLogsResponseLogsCodriverIds :: Maybe [Integer]
    
instance Arbitrary HosLogsSummaryResponse where
  arbitrary =
    HosLogsSummaryResponse
      <$> arbitrary -- hosLogsSummaryResponseDrivers :: Maybe [HosLogsSummaryResponseDrivers]
    
instance Arbitrary HosLogsSummaryResponseDrivers where
  arbitrary =
    HosLogsSummaryResponseDrivers
      <$> arbitrary -- hosLogsSummaryResponseDriversTimeUntilBreak :: Maybe Integer
      <*> arbitrary -- hosLogsSummaryResponseDriversVehicleName :: Maybe Text
      <*> arbitrary -- hosLogsSummaryResponseDriversDrivingInViolationToday :: Maybe Integer
      <*> arbitrary -- hosLogsSummaryResponseDriversDriverId :: Maybe Integer
      <*> arbitrary -- hosLogsSummaryResponseDriversCycleRemaining :: Maybe Integer
      <*> arbitrary -- hosLogsSummaryResponseDriversDriverName :: Maybe Text
      <*> arbitrary -- hosLogsSummaryResponseDriversDutyStatus :: Maybe Text
      <*> arbitrary -- hosLogsSummaryResponseDriversCycleTomorrow :: Maybe Integer
      <*> arbitrary -- hosLogsSummaryResponseDriversShiftDriveRemaining :: Maybe Integer
      <*> arbitrary -- hosLogsSummaryResponseDriversTimeInCurrentStatus :: Maybe Integer
      <*> arbitrary -- hosLogsSummaryResponseDriversDrivingInViolationCycle :: Maybe Integer
      <*> arbitrary -- hosLogsSummaryResponseDriversShiftRemaining :: Maybe Integer
    
instance Arbitrary HumidityResponse where
  arbitrary =
    HumidityResponse
      <$> arbitrary -- humidityResponseGroupId :: Maybe Integer
      <*> arbitrary -- humidityResponseSensors :: Maybe [HumidityResponseSensors]
    
instance Arbitrary HumidityResponseSensors where
  arbitrary =
    HumidityResponseSensors
      <$> arbitrary -- humidityResponseSensorsName :: Maybe Text
      <*> arbitrary -- humidityResponseSensorsHumidity :: Maybe Int
      <*> arbitrary -- humidityResponseSensorsId :: Maybe Integer
    
instance Arbitrary InlineObject where
  arbitrary =
    InlineObject
      <$> arbitrary -- inlineObjectAddresses :: [AddressesAddresses]
    
instance Arbitrary InlineObject1 where
  arbitrary =
    InlineObject1
      <$> arbitrary -- inlineObject1ContactIds :: Maybe [Integer]
      <*> arbitrary -- inlineObject1FormattedAddress :: Maybe Text
      <*> arbitrary -- inlineObject1Geofence :: Maybe AddressGeofence
      <*> arbitrary -- inlineObject1Name :: Maybe Text
      <*> arbitrary -- inlineObject1Notes :: Maybe Text
      <*> arbitrary -- inlineObject1TagIds :: Maybe [Integer]
    
instance Arbitrary InlineObject10 where
  arbitrary =
    InlineObject10
      <$> arbitrary -- inlineObject10GroupId :: Integer
    
instance Arbitrary InlineObject11 where
  arbitrary =
    InlineObject11
      <$> arbitrary -- inlineObject11GroupId :: Integer
    
instance Arbitrary InlineObject12 where
  arbitrary =
    InlineObject12
      <$> arbitrary -- inlineObject12InspectionType :: Text
      <*> arbitrary -- inlineObject12MechanicNotes :: Maybe Text
      <*> arbitrary -- inlineObject12OdometerMiles :: Maybe Int
      <*> arbitrary -- inlineObject12PreviousDefectsCorrected :: Maybe Bool
      <*> arbitrary -- inlineObject12PreviousDefectsIgnored :: Maybe Bool
      <*> arbitrary -- inlineObject12Safe :: Text
      <*> arbitrary -- inlineObject12TrailerId :: Maybe Int
      <*> arbitrary -- inlineObject12UserEmail :: Text
      <*> arbitrary -- inlineObject12VehicleId :: Maybe Int
    
instance Arbitrary InlineObject13 where
  arbitrary =
    InlineObject13
      <$> arbitrary -- inlineObject13GroupId :: Integer
    
instance Arbitrary InlineObject14 where
  arbitrary =
    InlineObject14
      <$> arbitrary -- inlineObject14GroupId :: Integer
      <*> arbitrary -- inlineObject14Vehicles :: [Vehicle]
    
instance Arbitrary InlineObject15 where
  arbitrary =
    InlineObject15
      <$> arbitrary -- inlineObject15EndMs :: Int
      <*> arbitrary -- inlineObject15GroupId :: Integer
      <*> arbitrary -- inlineObject15StartMs :: Int
      <*> arbitrary -- inlineObject15VehicleId :: Integer
    
instance Arbitrary InlineObject16 where
  arbitrary =
    InlineObject16
      <$> arbitrary -- inlineObject16ExternalIds :: Maybe (Map.Map String Text)
      <*> arbitrary -- inlineObject16HarshAccelSetting :: Maybe Int
      <*> arbitrary -- inlineObject16Name :: Maybe Text
    
instance Arbitrary InlineObject17 where
  arbitrary =
    InlineObject17
      <$> arbitrary -- inlineObject17EndMs :: Int
      <*> arbitrary -- inlineObject17GroupId :: Integer
      <*> arbitrary -- inlineObject17StartMs :: Int
    
instance Arbitrary InlineObject18 where
  arbitrary =
    InlineObject18
      <$> arbitrary -- inlineObject18GroupId :: Integer
    
instance Arbitrary InlineObject19 where
  arbitrary =
    InlineObject19
      <$> arbitrary -- inlineObject19GroupId :: Integer
      <*> arbitrary -- inlineObject19Sensors :: [Integer]
    
instance Arbitrary InlineObject2 where
  arbitrary =
    InlineObject2
      <$> arbitrary -- inlineObject2Address :: Text
      <*> arbitrary -- inlineObject2GroupId :: Integer
      <*> arbitrary -- inlineObject2Name :: Text
      <*> arbitrary -- inlineObject2Radius :: Int
    
instance Arbitrary InlineObject20 where
  arbitrary =
    InlineObject20
      <$> arbitrary -- inlineObject20GroupId :: Integer
      <*> arbitrary -- inlineObject20Sensors :: [Integer]
    
instance Arbitrary InlineObject21 where
  arbitrary =
    InlineObject21
      <$> arbitrary -- inlineObject21EndMs :: Int
      <*> arbitrary -- inlineObject21FillMissing :: Maybe Text
      <*> arbitrary -- inlineObject21GroupId :: Integer
      <*> arbitrary -- inlineObject21Series :: [SensorsHistorySeries]
      <*> arbitrary -- inlineObject21StartMs :: Int
      <*> arbitrary -- inlineObject21StepMs :: Int
    
instance Arbitrary InlineObject22 where
  arbitrary =
    InlineObject22
      <$> arbitrary -- inlineObject22GroupId :: Integer
      <*> arbitrary -- inlineObject22Sensors :: [Integer]
    
instance Arbitrary InlineObject23 where
  arbitrary =
    InlineObject23
      <$> arbitrary -- inlineObject23GroupId :: Integer
    
instance Arbitrary InlineObject24 where
  arbitrary =
    InlineObject24
      <$> arbitrary -- inlineObject24GroupId :: Integer
      <*> arbitrary -- inlineObject24Sensors :: [Integer]
    
instance Arbitrary InlineObject3 where
  arbitrary =
    InlineObject3
      <$> arbitrary -- inlineObject3GroupId :: Integer
    
instance Arbitrary InlineObject4 where
  arbitrary =
    InlineObject4
      <$> arbitrary -- inlineObject4Reactivate :: Bool
    
instance Arbitrary InlineObject5 where
  arbitrary =
    InlineObject5
      <$> arbitrary -- inlineObject5EndMs :: Integer
      <*> arbitrary -- inlineObject5OrgId :: Integer
      <*> arbitrary -- inlineObject5StartMs :: Integer
    
instance Arbitrary InlineObject6 where
  arbitrary =
    InlineObject6
      <$> arbitrary -- inlineObject6DriverId :: Integer
      <*> arbitrary -- inlineObject6EndMs :: Int
      <*> arbitrary -- inlineObject6GroupId :: Integer
      <*> arbitrary -- inlineObject6StartMs :: Int
    
instance Arbitrary InlineObject7 where
  arbitrary =
    InlineObject7
      <$> arbitrary -- inlineObject7DriverId :: Integer
      <*> arbitrary -- inlineObject7EndMs :: Int
      <*> arbitrary -- inlineObject7GroupId :: Integer
      <*> arbitrary -- inlineObject7StartMs :: Int
    
instance Arbitrary InlineObject8 where
  arbitrary =
    InlineObject8
      <$> arbitrary -- inlineObject8DriverId :: Integer
      <*> arbitrary -- inlineObject8EndMs :: Int
      <*> arbitrary -- inlineObject8GroupId :: Integer
      <*> arbitrary -- inlineObject8StartMs :: Int
    
instance Arbitrary InlineObject9 where
  arbitrary =
    InlineObject9
      <$> arbitrary -- inlineObject9GroupId :: Integer
    
instance Arbitrary InlineResponse200 where
  arbitrary =
    InlineResponse200
      <$> arbitrary -- inlineResponse200Assets :: Maybe [Asset]
    
instance Arbitrary InlineResponse2001 where
  arbitrary =
    InlineResponse2001
      <$> arbitrary -- inlineResponse2001Assets :: Maybe [AssetCurrentLocationsResponse]
    
instance Arbitrary InlineResponse2002 where
  arbitrary =
    InlineResponse2002
      <$> arbitrary -- inlineResponse2002Pagination :: Maybe Pagination
      <*> arbitrary -- inlineResponse2002GroupId :: Maybe Integer
      <*> arbitrary -- inlineResponse2002Vehicles :: Maybe [Vehicle]
    
instance Arbitrary InlineResponse2003 where
  arbitrary =
    InlineResponse2003
      <$> arbitrary -- inlineResponse2003GroupId :: Maybe Integer
      <*> arbitrary -- inlineResponse2003Vehicles :: Maybe [VehicleLocation]
    
instance Arbitrary InlineResponse2004 where
  arbitrary =
    InlineResponse2004
      <$> arbitrary -- inlineResponse2004Vehicles :: Maybe [VehicleMaintenance]
    
instance Arbitrary InlineResponse2005 where
  arbitrary =
    InlineResponse2005
      <$> arbitrary -- inlineResponse2005Pagination :: Maybe Pagination
      <*> arbitrary -- inlineResponse2005VehicleStats :: [InlineResponse2005VehicleStats]
    
instance Arbitrary InlineResponse2005VehicleStats where
  arbitrary =
    InlineResponse2005VehicleStats
      <$> arbitrary -- inlineResponse2005VehicleStatsEngineState :: Maybe [EngineState]
      <*> arbitrary -- inlineResponse2005VehicleStatsAuxInput2 :: Maybe AuxInputSeries
      <*> arbitrary -- inlineResponse2005VehicleStatsVehicleId :: Integer
      <*> arbitrary -- inlineResponse2005VehicleStatsAuxInput1 :: Maybe AuxInputSeries
    
instance Arbitrary InlineResponse2006 where
  arbitrary =
    InlineResponse2006
      <$> arbitrary -- inlineResponse2006DataInputs :: Maybe [DataInputHistoryResponse]
    
instance Arbitrary InlineResponse2007 where
  arbitrary =
    InlineResponse2007
      <$> arbitrary -- inlineResponse2007Machines :: Maybe [Machine]
    
instance Arbitrary InlineResponse2008 where
  arbitrary =
    InlineResponse2008
      <$> arbitrary -- inlineResponse2008Sensors :: Maybe [Sensor]
    
instance Arbitrary InlineResponse2009 where
  arbitrary =
    InlineResponse2009
      <$> arbitrary -- inlineResponse2009Tags :: Maybe [Tag]
    
instance Arbitrary JobUpdateObject where
  arbitrary =
    JobUpdateObject
      <$> arbitrary -- jobUpdateObjectChangedAtMs :: Maybe Integer
      <*> arbitrary -- jobUpdateObjectJobId :: Maybe Integer
      <*> arbitrary -- jobUpdateObjectJobState :: Maybe JobStatus
      <*> arbitrary -- jobUpdateObjectPrevJobState :: Maybe PrevJobStatus
      <*> arbitrary -- jobUpdateObjectRoute :: Maybe DispatchRoute
      <*> arbitrary -- jobUpdateObjectRouteId :: Maybe Integer
    
instance Arbitrary Machine where
  arbitrary =
    Machine
      <$> arbitrary -- machineId :: Integer
      <*> arbitrary -- machineName :: Maybe Text
      <*> arbitrary -- machineNotes :: Maybe Text
    
instance Arbitrary MachineHistoryResponse where
  arbitrary =
    MachineHistoryResponse
      <$> arbitrary -- machineHistoryResponseMachines :: Maybe [MachineHistoryResponseMachines]
    
instance Arbitrary MachineHistoryResponseMachines where
  arbitrary =
    MachineHistoryResponseMachines
      <$> arbitrary -- machineHistoryResponseMachinesName :: Maybe Text
      <*> arbitrary -- machineHistoryResponseMachinesId :: Maybe Int
      <*> arbitrary -- machineHistoryResponseMachinesVibrations :: Maybe [MachineHistoryResponseVibrations]
    
instance Arbitrary MachineHistoryResponseVibrations where
  arbitrary =
    MachineHistoryResponseVibrations
      <$> arbitrary -- machineHistoryResponseVibrationsX :: Maybe Double
      <*> arbitrary -- machineHistoryResponseVibrationsY :: Maybe Double
      <*> arbitrary -- machineHistoryResponseVibrationsZ :: Maybe Double
      <*> arbitrary -- machineHistoryResponseVibrationsTime :: Maybe Integer
    
instance Arbitrary Pagination where
  arbitrary =
    Pagination
      <$> arbitrary -- paginationEndCursor :: Text
      <*> arbitrary -- paginationHasNextPage :: Bool
      <*> arbitrary -- paginationHasPrevPage :: Bool
      <*> arbitrary -- paginationStartCursor :: Text
    
instance Arbitrary SafetyReportHarshEvent where
  arbitrary =
    SafetyReportHarshEvent
      <$> arbitrary -- safetyReportHarshEventHarshEventType :: Maybe Text
      <*> arbitrary -- safetyReportHarshEventTimestampMs :: Maybe Int
      <*> arbitrary -- safetyReportHarshEventVehicleId :: Maybe Int
    
instance Arbitrary Sensor where
  arbitrary =
    Sensor
      <$> arbitrary -- sensorId :: Integer
      <*> arbitrary -- sensorMacAddress :: Maybe Text
      <*> arbitrary -- sensorName :: Maybe Text
    
instance Arbitrary SensorHistoryResponse where
  arbitrary =
    SensorHistoryResponse
      <$> arbitrary -- sensorHistoryResponseResults :: Maybe [SensorHistoryResponseResults]
    
instance Arbitrary SensorHistoryResponseResults where
  arbitrary =
    SensorHistoryResponseResults
      <$> arbitrary -- sensorHistoryResponseResultsSeries :: Maybe [Integer]
      <*> arbitrary -- sensorHistoryResponseResultsTimeMs :: Maybe Int
    
instance Arbitrary SensorsHistorySeries where
  arbitrary =
    SensorsHistorySeries
      <$> arbitrary -- sensorsHistorySeriesField :: Text
      <*> arbitrary -- sensorsHistorySeriesWidgetId :: Integer
    
instance Arbitrary Tag where
  arbitrary =
    Tag
      <$> arbitrary -- tagAddresses :: Maybe [TaggedAddress]
      <*> arbitrary -- tagAssets :: Maybe [TaggedAsset]
      <*> arbitrary -- tagDrivers :: Maybe [TaggedDriver]
      <*> arbitrary -- tagGroupId :: Maybe Integer
      <*> arbitrary -- tagId :: Integer
      <*> arbitrary -- tagMachines :: Maybe [TaggedMachine]
      <*> arbitrary -- tagName :: Text
      <*> arbitrary -- tagParentTagId :: Maybe Integer
      <*> arbitrary -- tagSensors :: Maybe [TaggedSensor]
      <*> arbitrary -- tagVehicles :: Maybe [TaggedVehicle]
    
instance Arbitrary TagCreate where
  arbitrary =
    TagCreate
      <$> arbitrary -- tagCreateAssets :: Maybe [TaggedAssetBase]
      <*> arbitrary -- tagCreateDrivers :: Maybe [TaggedDriverBase]
      <*> arbitrary -- tagCreateMachines :: Maybe [TaggedMachineBase]
      <*> arbitrary -- tagCreateName :: Text
      <*> arbitrary -- tagCreateParentTagId :: Maybe Integer
      <*> arbitrary -- tagCreateSensors :: Maybe [TaggedSensorBase]
      <*> arbitrary -- tagCreateVehicles :: Maybe [TaggedVehicleBase]
    
instance Arbitrary TagMetadata where
  arbitrary =
    TagMetadata
      <$> arbitrary -- tagMetadataId :: Integer
      <*> arbitrary -- tagMetadataName :: Text
    
instance Arbitrary TagModify where
  arbitrary =
    TagModify
      <$> arbitrary -- tagModifyAdd :: Maybe TagModifyAdd
      <*> arbitrary -- tagModifyDelete :: Maybe TagModifyDelete
      <*> arbitrary -- tagModifyName :: Maybe Text
      <*> arbitrary -- tagModifyParentTagId :: Maybe Integer
    
instance Arbitrary TagModifyAdd where
  arbitrary =
    TagModifyAdd
      <$> arbitrary -- tagModifyAddAssets :: Maybe [TaggedAssetBase]
      <*> arbitrary -- tagModifyAddSensors :: Maybe [TaggedSensorBase]
      <*> arbitrary -- tagModifyAddVehicles :: Maybe [TaggedVehicleBase]
      <*> arbitrary -- tagModifyAddMachines :: Maybe [TaggedMachineBase]
      <*> arbitrary -- tagModifyAddDrivers :: Maybe [TaggedDriverBase]
    
instance Arbitrary TagModifyDelete where
  arbitrary =
    TagModifyDelete
      <$> arbitrary -- tagModifyDeleteAssets :: Maybe [TaggedAssetBase]
      <*> arbitrary -- tagModifyDeleteSensors :: Maybe [TaggedSensorBase]
      <*> arbitrary -- tagModifyDeleteVehicles :: Maybe [TaggedVehicleBase]
      <*> arbitrary -- tagModifyDeleteMachines :: Maybe [TaggedMachineBase]
      <*> arbitrary -- tagModifyDeleteDrivers :: Maybe [TaggedDriverBase]
    
instance Arbitrary TagUpdate where
  arbitrary =
    TagUpdate
      <$> arbitrary -- tagUpdateAssets :: Maybe [TaggedAssetBase]
      <*> arbitrary -- tagUpdateDrivers :: Maybe [TaggedDriverBase]
      <*> arbitrary -- tagUpdateMachines :: Maybe [TaggedMachineBase]
      <*> arbitrary -- tagUpdateName :: Maybe Text
      <*> arbitrary -- tagUpdateParentTagId :: Maybe Integer
      <*> arbitrary -- tagUpdateSensors :: Maybe [TaggedSensorBase]
      <*> arbitrary -- tagUpdateVehicles :: Maybe [TaggedVehicleBase]
    
instance Arbitrary TaggedAddress where
  arbitrary =
    TaggedAddress
      <$> arbitrary -- taggedAddressId :: Integer
      <*> arbitrary -- taggedAddressName :: Maybe Text
    
instance Arbitrary TaggedAddressBase where
  arbitrary =
    TaggedAddressBase
      <$> arbitrary -- taggedAddressBaseId :: Integer
    
instance Arbitrary TaggedAsset where
  arbitrary =
    TaggedAsset
      <$> arbitrary -- taggedAssetId :: Integer
      <*> arbitrary -- taggedAssetName :: Maybe Text
    
instance Arbitrary TaggedAssetBase where
  arbitrary =
    TaggedAssetBase
      <$> arbitrary -- taggedAssetBaseId :: Integer
    
instance Arbitrary TaggedDriver where
  arbitrary =
    TaggedDriver
      <$> arbitrary -- taggedDriverId :: Integer
      <*> arbitrary -- taggedDriverName :: Maybe Text
    
instance Arbitrary TaggedDriverBase where
  arbitrary =
    TaggedDriverBase
      <$> arbitrary -- taggedDriverBaseId :: Integer
    
instance Arbitrary TaggedMachine where
  arbitrary =
    TaggedMachine
      <$> arbitrary -- taggedMachineId :: Integer
      <*> arbitrary -- taggedMachineName :: Maybe Text
    
instance Arbitrary TaggedMachineBase where
  arbitrary =
    TaggedMachineBase
      <$> arbitrary -- taggedMachineBaseId :: Integer
    
instance Arbitrary TaggedSensor where
  arbitrary =
    TaggedSensor
      <$> arbitrary -- taggedSensorId :: Integer
      <*> arbitrary -- taggedSensorName :: Maybe Text
    
instance Arbitrary TaggedSensorBase where
  arbitrary =
    TaggedSensorBase
      <$> arbitrary -- taggedSensorBaseId :: Integer
    
instance Arbitrary TaggedVehicle where
  arbitrary =
    TaggedVehicle
      <$> arbitrary -- taggedVehicleId :: Integer
      <*> arbitrary -- taggedVehicleName :: Maybe Text
    
instance Arbitrary TaggedVehicleBase where
  arbitrary =
    TaggedVehicleBase
      <$> arbitrary -- taggedVehicleBaseId :: Integer
    
instance Arbitrary TemperatureResponse where
  arbitrary =
    TemperatureResponse
      <$> arbitrary -- temperatureResponseGroupId :: Maybe Integer
      <*> arbitrary -- temperatureResponseSensors :: Maybe [TemperatureResponseSensors]
    
instance Arbitrary TemperatureResponseSensors where
  arbitrary =
    TemperatureResponseSensors
      <$> arbitrary -- temperatureResponseSensorsProbeTemperature :: Maybe Int
      <*> arbitrary -- temperatureResponseSensorsName :: Maybe Text
      <*> arbitrary -- temperatureResponseSensorsId :: Maybe Integer
      <*> arbitrary -- temperatureResponseSensorsAmbientTemperature :: Maybe Int
    
instance Arbitrary TripResponse where
  arbitrary =
    TripResponse
      <$> arbitrary -- tripResponseTrips :: Maybe [TripResponseTrips]
    
instance Arbitrary TripResponseEndCoordinates where
  arbitrary =
    TripResponseEndCoordinates
      <$> arbitrary -- tripResponseEndCoordinatesLatitude :: Maybe Double
      <*> arbitrary -- tripResponseEndCoordinatesLongitude :: Maybe Double
    
instance Arbitrary TripResponseStartCoordinates where
  arbitrary =
    TripResponseStartCoordinates
      <$> arbitrary -- tripResponseStartCoordinatesLatitude :: Maybe Double
      <*> arbitrary -- tripResponseStartCoordinatesLongitude :: Maybe Double
    
instance Arbitrary TripResponseTrips where
  arbitrary =
    TripResponseTrips
      <$> arbitrary -- tripResponseTripsEndOdometer :: Maybe Int
      <*> arbitrary -- tripResponseTripsDistanceMeters :: Maybe Int
      <*> arbitrary -- tripResponseTripsEndMs :: Maybe Int
      <*> arbitrary -- tripResponseTripsStartMs :: Maybe Int
      <*> arbitrary -- tripResponseTripsFuelConsumedMl :: Maybe Int
      <*> arbitrary -- tripResponseTripsStartAddress :: Maybe Text
      <*> arbitrary -- tripResponseTripsStartCoordinates :: Maybe TripResponseStartCoordinates
      <*> arbitrary -- tripResponseTripsEndCoordinates :: Maybe TripResponseEndCoordinates
      <*> arbitrary -- tripResponseTripsStartOdometer :: Maybe Int
      <*> arbitrary -- tripResponseTripsDriverId :: Maybe Int
      <*> arbitrary -- tripResponseTripsStartLocation :: Maybe Text
      <*> arbitrary -- tripResponseTripsTollMeters :: Maybe Int
      <*> arbitrary -- tripResponseTripsEndAddress :: Maybe Text
      <*> arbitrary -- tripResponseTripsEndLocation :: Maybe Text
    
instance Arbitrary User where
  arbitrary =
    User
      <$> arbitrary -- userAuthType :: Text
      <*> arbitrary -- userEmail :: Text
      <*> arbitrary -- userName :: Maybe Text
      <*> arbitrary -- userOrganizationRoleId :: Maybe Text
      <*> arbitrary -- userId :: Maybe Integer
      <*> arbitrary -- userOrganizationRole :: Maybe Text
      <*> arbitrary -- userTagRoles :: Maybe [UserTagRole]
    
instance Arbitrary UserBase where
  arbitrary =
    UserBase
      <$> arbitrary -- userBaseAuthType :: Text
      <*> arbitrary -- userBaseEmail :: Text
      <*> arbitrary -- userBaseName :: Maybe Text
      <*> arbitrary -- userBaseOrganizationRoleId :: Maybe Text
    
instance Arbitrary UserRole where
  arbitrary =
    UserRole
      <$> arbitrary -- userRoleId :: Maybe Text
      <*> arbitrary -- userRoleName :: Maybe Text
    
instance Arbitrary UserTagRole where
  arbitrary =
    UserTagRole
      <$> arbitrary -- userTagRoleRole :: Maybe Text
      <*> arbitrary -- userTagRoleRoleId :: Text
      <*> arbitrary -- userTagRoleTag :: UserTagRoleTag
    
instance Arbitrary UserTagRoleTag where
  arbitrary =
    UserTagRoleTag
      <$> arbitrary -- userTagRoleTagParentTagId :: Maybe Integer
      <*> arbitrary -- userTagRoleTagName :: Text
      <*> arbitrary -- userTagRoleTagId :: Integer
    
instance Arbitrary Vehicle where
  arbitrary =
    Vehicle
      <$> arbitrary -- vehicleEngineHours :: Maybe Integer
      <*> arbitrary -- vehicleFuelLevelPercent :: Maybe Double
      <*> arbitrary -- vehicleId :: Integer
      <*> arbitrary -- vehicleName :: Maybe Text
      <*> arbitrary -- vehicleNote :: Maybe Text
      <*> arbitrary -- vehicleOdometerMeters :: Maybe Integer
      <*> arbitrary -- vehicleVin :: Maybe Text
    
instance Arbitrary VehicleHarshEventResponse where
  arbitrary =
    VehicleHarshEventResponse
      <$> arbitrary -- vehicleHarshEventResponseDownloadForwardVideoUrl :: Maybe Text
      <*> arbitrary -- vehicleHarshEventResponseDownloadInwardVideoUrl :: Maybe Text
      <*> arbitrary -- vehicleHarshEventResponseDownloadTrackedInwardVideoUrl :: Maybe Text
      <*> arbitrary -- vehicleHarshEventResponseHarshEventType :: Text
      <*> arbitrary -- vehicleHarshEventResponseIncidentReportUrl :: Text
      <*> arbitrary -- vehicleHarshEventResponseIsDistracted :: Maybe Bool
      <*> arbitrary -- vehicleHarshEventResponseLocation :: Maybe VehicleHarshEventResponseLocation
    
instance Arbitrary VehicleHarshEventResponseLocation where
  arbitrary =
    VehicleHarshEventResponseLocation
      <$> arbitrary -- vehicleHarshEventResponseLocationAddress :: Maybe Text
      <*> arbitrary -- vehicleHarshEventResponseLocationLatitude :: Maybe Text
      <*> arbitrary -- vehicleHarshEventResponseLocationLongitude :: Maybe Text
    
instance Arbitrary VehicleLocation where
  arbitrary =
    VehicleLocation
      <$> arbitrary -- vehicleLocationHeading :: Maybe Double
      <*> arbitrary -- vehicleLocationId :: Integer
      <*> arbitrary -- vehicleLocationLatitude :: Maybe Double
      <*> arbitrary -- vehicleLocationLocation :: Maybe Text
      <*> arbitrary -- vehicleLocationLongitude :: Maybe Double
      <*> arbitrary -- vehicleLocationName :: Maybe Text
      <*> arbitrary -- vehicleLocationOdometerMeters :: Maybe Integer
      <*> arbitrary -- vehicleLocationOnTrip :: Maybe Bool
      <*> arbitrary -- vehicleLocationSpeed :: Maybe Double
      <*> arbitrary -- vehicleLocationTime :: Maybe Int
      <*> arbitrary -- vehicleLocationVin :: Maybe Text
    
instance Arbitrary VehicleMaintenance where
  arbitrary =
    VehicleMaintenance
      <$> arbitrary -- vehicleMaintenanceId :: Integer
      <*> arbitrary -- vehicleMaintenanceJ1939 :: Maybe VehicleMaintenanceJ1939
      <*> arbitrary -- vehicleMaintenancePassenger :: Maybe VehicleMaintenancePassenger
    
instance Arbitrary VehicleMaintenanceJ1939 where
  arbitrary =
    VehicleMaintenanceJ1939
      <$> arbitrary -- vehicleMaintenanceJ1939CheckEngineLight :: Maybe VehicleMaintenanceJ1939CheckEngineLight
      <*> arbitrary -- vehicleMaintenanceJ1939DiagnosticTroubleCodes :: Maybe [VehicleMaintenanceJ1939DiagnosticTroubleCodes]
    
instance Arbitrary VehicleMaintenanceJ1939CheckEngineLight where
  arbitrary =
    VehicleMaintenanceJ1939CheckEngineLight
      <$> arbitrary -- vehicleMaintenanceJ1939CheckEngineLightProtectIsOn :: Maybe Bool
      <*> arbitrary -- vehicleMaintenanceJ1939CheckEngineLightStopIsOn :: Maybe Bool
      <*> arbitrary -- vehicleMaintenanceJ1939CheckEngineLightWarningIsOn :: Maybe Bool
      <*> arbitrary -- vehicleMaintenanceJ1939CheckEngineLightEmissionsIsOn :: Maybe Bool
    
instance Arbitrary VehicleMaintenanceJ1939DiagnosticTroubleCodes where
  arbitrary =
    VehicleMaintenanceJ1939DiagnosticTroubleCodes
      <$> arbitrary -- vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnDescription :: Maybe Text
      <*> arbitrary -- vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiText :: Maybe Text
      <*> arbitrary -- vehicleMaintenanceJ1939DiagnosticTroubleCodesSpnId :: Maybe Int
      <*> arbitrary -- vehicleMaintenanceJ1939DiagnosticTroubleCodesOccurrenceCount :: Maybe Int
      <*> arbitrary -- vehicleMaintenanceJ1939DiagnosticTroubleCodesTxId :: Maybe Int
      <*> arbitrary -- vehicleMaintenanceJ1939DiagnosticTroubleCodesFmiId :: Maybe Int
    
instance Arbitrary VehicleMaintenancePassenger where
  arbitrary =
    VehicleMaintenancePassenger
      <$> arbitrary -- vehicleMaintenancePassengerCheckEngineLight :: Maybe VehicleMaintenancePassengerCheckEngineLight
      <*> arbitrary -- vehicleMaintenancePassengerDiagnosticTroubleCodes :: Maybe [VehicleMaintenancePassengerDiagnosticTroubleCodes]
    
instance Arbitrary VehicleMaintenancePassengerCheckEngineLight where
  arbitrary =
    VehicleMaintenancePassengerCheckEngineLight
      <$> arbitrary -- vehicleMaintenancePassengerCheckEngineLightIsOn :: Maybe Bool
    
instance Arbitrary VehicleMaintenancePassengerDiagnosticTroubleCodes where
  arbitrary =
    VehicleMaintenancePassengerDiagnosticTroubleCodes
      <$> arbitrary -- vehicleMaintenancePassengerDiagnosticTroubleCodesDtcShortCode :: Maybe Text
      <*> arbitrary -- vehicleMaintenancePassengerDiagnosticTroubleCodesDtcId :: Maybe Int
      <*> arbitrary -- vehicleMaintenancePassengerDiagnosticTroubleCodesDtcDescription :: Maybe Text
    
instance Arbitrary VehicleSafetyScoreResponse where
  arbitrary =
    VehicleSafetyScoreResponse
      <$> arbitrary -- vehicleSafetyScoreResponseCrashCount :: Maybe Int
      <*> arbitrary -- vehicleSafetyScoreResponseHarshAccelCount :: Maybe Int
      <*> arbitrary -- vehicleSafetyScoreResponseHarshBrakingCount :: Maybe Int
      <*> arbitrary -- vehicleSafetyScoreResponseHarshEvents :: Maybe [SafetyReportHarshEvent]
      <*> arbitrary -- vehicleSafetyScoreResponseHarshTurningCount :: Maybe Int
      <*> arbitrary -- vehicleSafetyScoreResponseSafetyScore :: Maybe Int
      <*> arbitrary -- vehicleSafetyScoreResponseSafetyScoreRank :: Maybe Text
      <*> arbitrary -- vehicleSafetyScoreResponseTimeOverSpeedLimitMs :: Maybe Int
      <*> arbitrary -- vehicleSafetyScoreResponseTotalDistanceDrivenMeters :: Maybe Int
      <*> arbitrary -- vehicleSafetyScoreResponseTotalHarshEventCount :: Maybe Int
      <*> arbitrary -- vehicleSafetyScoreResponseTotalTimeDrivenMs :: Maybe Int
      <*> arbitrary -- vehicleSafetyScoreResponseVehicleId :: Maybe Int
    



instance Arbitrary E'AuthType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Field where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'FillMissing where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'InspectionType where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Name where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Safe where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Series where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Value where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary JobStatus where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary PrevJobStatus where
  arbitrary = arbitraryBoundedEnum
