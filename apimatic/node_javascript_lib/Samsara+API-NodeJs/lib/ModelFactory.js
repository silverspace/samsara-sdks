/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

'use strict';

const Vibration = require('../lib/Models/Vibration');
const Vertex = require('../lib/Models/Vertex');
const VehicleUpdateParam = require('../lib/Models/VehicleUpdateParam');
const VehicleStat = require('../lib/Models/VehicleStat');
const TripsParam = require('../lib/Models/TripsParam');
const VehicleInfo = require('../lib/Models/VehicleInfo');
const VehicleDefect = require('../lib/Models/VehicleDefect');
const ReactivateDriverParam = require('../lib/Models/ReactivateDriverParam');
const Vehicle2 = require('../lib/Models/Vehicle2');
const Summary = require('../lib/Models/Summary');
const Sensor4 = require('../lib/Models/Sensor4');
const ReeferStats = require('../lib/Models/ReeferStats');
const NextDriverSignature = require('../lib/Models/NextDriverSignature');
const DriverForCreate = require('../lib/Models/DriverForCreate');
const DispatchRouteCreate = require('../lib/Models/DispatchRouteCreate');
const Trip = require('../lib/Models/Trip');
const DispatchRouteBase = require('../lib/Models/DispatchRouteBase');
const DispatchRoute = require('../lib/Models/DispatchRoute');
const DispatchJob = require('../lib/Models/DispatchJob');
const MechanicOrAgentSignature = require('../lib/Models/MechanicOrAgentSignature');
const HosLogsParam = require('../lib/Models/HosLogsParam');
const HosAuthenticationLogsParam = require('../lib/Models/HosAuthenticationLogsParam');
const TrailerDefect = require('../lib/Models/TrailerDefect');
const HistoryParam1 = require('../lib/Models/HistoryParam1');
const Tag1 = require('../lib/Models/Tag1');
const Log = require('../lib/Models/Log');
const Polygon = require('../lib/Models/Polygon');
const Driver = require('../lib/Models/Driver');
const PhotoValue = require('../lib/Models/PhotoValue');
const Passenger = require('../lib/Models/Passenger');
const Driver1 = require('../lib/Models/Driver1');
const NumberValueTypeMetadata = require('../lib/Models/NumberValueTypeMetadata');
const StartCoordinates = require('../lib/Models/StartCoordinates');
const DiagnosticTroubleCode = require('../lib/Models/DiagnosticTroubleCode');
const J1939 = require('../lib/Models/J1939');
const HosLogsParam2 = require('../lib/Models/HosLogsParam2');
const GroupParam = require('../lib/Models/GroupParam');
const SetPoint = require('../lib/Models/SetPoint');
const Series1 = require('../lib/Models/Series1');
const GroupDriversParam = require('../lib/Models/GroupDriversParam');
const Delete = require('../lib/Models/Delete');
const SensorParam = require('../lib/Models/SensorParam');
const GetVehicleStatsResponse = require('../lib/Models/GetVehicleStatsResponse');
const Day = require('../lib/Models/Day');
const AuthorSignature = require('../lib/Models/AuthorSignature');
const Sensor5 = require('../lib/Models/Sensor5');
const Sensor2 = require('../lib/Models/Sensor2');
const AuthenticationLog = require('../lib/Models/AuthenticationLog');
const Sensor1 = require('../lib/Models/Sensor1');
const GetAllTagsResponse = require('../lib/Models/GetAllTagsResponse');
const GetAllDataInputsResponse = require('../lib/Models/GetAllDataInputsResponse');
const ReturnAirTemp = require('../lib/Models/ReturnAirTemp');
const GetAllAssetsResponse = require('../lib/Models/GetAllAssetsResponse');
const Result = require('../lib/Models/Result');
const GetAllAssetCurrentLocationsResponse =
  require('../lib/Models/GetAllAssetCurrentLocationsResponse');
const PowerStatus = require('../lib/Models/PowerStatus');
const GetSensorsResponse = require('../lib/Models/GetSensorsResponse');
const Point = require('../lib/Models/Point');
const GetMachinesResponse = require('../lib/Models/GetMachinesResponse');
const Machine1 = require('../lib/Models/Machine1');
const GetFleetMaintenanceListResponse = require('../lib/Models/GetFleetMaintenanceListResponse');
const AssetLocationResponse = require('../lib/Models/AssetLocationResponse');
const Alarm1 = require('../lib/Models/Alarm1');
const Location = require('../lib/Models/Location');
const ListFleetResponse = require('../lib/Models/ListFleetResponse');
const AddressParam = require('../lib/Models/AddressParam');
const Addresses1 = require('../lib/Models/Addresses1');
const CreateDvirParam = require('../lib/Models/CreateDvirParam');
const HistoryParam = require('../lib/Models/HistoryParam');
const VehicleSafetyScoreResponse = require('../lib/Models/VehicleSafetyScoreResponse');
const GetFleetLocationsResponse = require('../lib/Models/GetFleetLocationsResponse');
const Address1 = require('../lib/Models/Address1');
const Add = require('../lib/Models/Add');
const JobUpdateObject = require('../lib/Models/JobUpdateObject');
const VehicleHarshEventResponse = require('../lib/Models/VehicleHarshEventResponse');
const Vehicle = require('../lib/Models/Vehicle');
const FuelPercentage = require('../lib/Models/FuelPercentage');
const UserBase = require('../lib/Models/UserBase');
const User = require('../lib/Models/User');
const TagUpdate = require('../lib/Models/TagUpdate');
const TagCreate = require('../lib/Models/TagCreate');
const FleetVehiclesLocation = require('../lib/Models/FleetVehiclesLocation');
const CheckEngineLight1 = require('../lib/Models/CheckEngineLight1');
const EngineHour = require('../lib/Models/EngineHour');
const Cable = require('../lib/Models/Cable');
const EndCoordinates = require('../lib/Models/EndCoordinates');
const VehicleLocation = require('../lib/Models/VehicleLocation');
const DriversSummaryParam = require('../lib/Models/DriversSummaryParam');
const Tag = require('../lib/Models/Tag');
const Pagination = require('../lib/Models/Pagination');
const FleetVehicleResponse = require('../lib/Models/FleetVehicleResponse');
const DiagnosticTroubleCode1 = require('../lib/Models/DiagnosticTroubleCode1');
const DvirBase = require('../lib/Models/DvirBase');
const Data = require('../lib/Models/Data');
const Circle = require('../lib/Models/Circle');
const CheckEngineLight = require('../lib/Models/CheckEngineLight');
const DriverSafetyScoreResponse = require('../lib/Models/DriverSafetyScoreResponse');
const Addresses = require('../lib/Models/Addresses');
const Alarm = require('../lib/Models/Alarm');
const AllRouteJobUpdates = require('../lib/Models/AllRouteJobUpdates');
const TripResponse = require('../lib/Models/TripResponse');
const TaggedVehicleBase = require('../lib/Models/TaggedVehicleBase');
const TaggedSensorBase = require('../lib/Models/TaggedSensorBase');
const TaggedMachineBase = require('../lib/Models/TaggedMachineBase');
const TaggedDriverBase = require('../lib/Models/TaggedDriverBase');
const TaggedAssetBase = require('../lib/Models/TaggedAssetBase');
const TaggedAddressBase = require('../lib/Models/TaggedAddressBase');
const SensorHistoryResponse = require('../lib/Models/SensorHistoryResponse');
const MachineHistoryResponse = require('../lib/Models/MachineHistoryResponse');
const HosLogsSummaryResponse = require('../lib/Models/HosLogsSummaryResponse');
const FleetVehicleLocation = require('../lib/Models/FleetVehicleLocation');
const VehicleMaintenance = require('../lib/Models/VehicleMaintenance');
const DocumentType = require('../lib/Models/DocumentType');
const DocumentFieldCreate = require('../lib/Models/DocumentFieldCreate');
const DocumentField = require('../lib/Models/DocumentField');
const HosLogsResponse = require('../lib/Models/HosLogsResponse');
const HosAuthenticationLogsResponse = require('../lib/Models/HosAuthenticationLogsResponse');
const UserTagRole = require('../lib/Models/UserTagRole');
const UserRole = require('../lib/Models/UserRole');
const DriverBase = require('../lib/Models/DriverBase');
const TemperatureResponse = require('../lib/Models/TemperatureResponse');
const DocumentCreate = require('../lib/Models/DocumentCreate');
const Document = require('../lib/Models/Document');
const Contact = require('../lib/Models/Contact');
const DvirListResponse = require('../lib/Models/DvirListResponse');
const DriversSummaryResponse = require('../lib/Models/DriversSummaryResponse');
const DriversResponse = require('../lib/Models/DriversResponse');
const TaggedVehicle = require('../lib/Models/TaggedVehicle');
const DriverDailyLogResponse = require('../lib/Models/DriverDailyLogResponse');
const TaggedSensor = require('../lib/Models/TaggedSensor');
const DispatchRouteHistory = require('../lib/Models/DispatchRouteHistory');
const AssetCurrentLocationsResponse = require('../lib/Models/AssetCurrentLocationsResponse');
const TaggedMachine = require('../lib/Models/TaggedMachine');
const TaggedDriver = require('../lib/Models/TaggedDriver');
const TaggedAsset = require('../lib/Models/TaggedAsset');
const TaggedAddress = require('../lib/Models/TaggedAddress');
const TagModify = require('../lib/Models/TagModify');
const AssetCurrentLocation = require('../lib/Models/AssetCurrentLocation');
const TagMetadata = require('../lib/Models/TagMetadata');
const Sensor = require('../lib/Models/Sensor');
const SafetyReportHarshEvent = require('../lib/Models/SafetyReportHarshEvent');
const Machine = require('../lib/Models/Machine');
const HumidityResponse = require('../lib/Models/HumidityResponse');
const EngineState = require('../lib/Models/EngineState');
const Asset = require('../lib/Models/Asset');
const DoorResponse = require('../lib/Models/DoorResponse');
const DocumentFieldType = require('../lib/Models/DocumentFieldType');
const DispatchJobCreate = require('../lib/Models/DispatchJobCreate');
const Address = require('../lib/Models/Address');
const DocumentBase = require('../lib/Models/DocumentBase');
const DispatchRouteHistoricalEntry = require('../lib/Models/DispatchRouteHistoricalEntry');
const DataInputHistoryResponse = require('../lib/Models/DataInputHistoryResponse');
const CargoResponse = require('../lib/Models/CargoResponse');
const AuxInput = require('../lib/Models/AuxInput');
const AuxInputSeries = require('../lib/Models/AuxInputSeries');
const AssetReeferResponse = require('../lib/Models/AssetReeferResponse');
const AddressGeofence = require('../lib/Models/AddressGeofence');

const classMap = {
    Vibration,
    Vertex,
    VehicleUpdateParam,
    VehicleStat,
    TripsParam,
    VehicleInfo,
    VehicleDefect,
    ReactivateDriverParam,
    Vehicle2,
    Summary,
    Sensor4,
    ReeferStats,
    NextDriverSignature,
    DriverForCreate,
    DispatchRouteCreate,
    Trip,
    DispatchRouteBase,
    DispatchRoute,
    DispatchJob,
    MechanicOrAgentSignature,
    HosLogsParam,
    HosAuthenticationLogsParam,
    TrailerDefect,
    HistoryParam1,
    Tag1,
    Log,
    Polygon,
    Driver,
    PhotoValue,
    Passenger,
    Driver1,
    NumberValueTypeMetadata,
    StartCoordinates,
    DiagnosticTroubleCode,
    J1939,
    HosLogsParam2,
    GroupParam,
    SetPoint,
    Series1,
    GroupDriversParam,
    Delete,
    SensorParam,
    GetVehicleStatsResponse,
    Day,
    AuthorSignature,
    Sensor5,
    Sensor2,
    AuthenticationLog,
    Sensor1,
    GetAllTagsResponse,
    GetAllDataInputsResponse,
    ReturnAirTemp,
    GetAllAssetsResponse,
    Result,
    GetAllAssetCurrentLocationsResponse,
    PowerStatus,
    GetSensorsResponse,
    Point,
    GetMachinesResponse,
    Machine1,
    GetFleetMaintenanceListResponse,
    AssetLocationResponse,
    Alarm1,
    Location,
    ListFleetResponse,
    AddressParam,
    Addresses1,
    CreateDvirParam,
    HistoryParam,
    VehicleSafetyScoreResponse,
    GetFleetLocationsResponse,
    Address1,
    Add,
    JobUpdateObject,
    VehicleHarshEventResponse,
    Vehicle,
    FuelPercentage,
    UserBase,
    User,
    TagUpdate,
    TagCreate,
    FleetVehiclesLocation,
    CheckEngineLight1,
    EngineHour,
    Cable,
    EndCoordinates,
    VehicleLocation,
    DriversSummaryParam,
    Tag,
    Pagination,
    FleetVehicleResponse,
    DiagnosticTroubleCode1,
    DvirBase,
    Data,
    Circle,
    CheckEngineLight,
    DriverSafetyScoreResponse,
    Addresses,
    Alarm,
    AllRouteJobUpdates,
    TripResponse,
    TaggedVehicleBase,
    TaggedSensorBase,
    TaggedMachineBase,
    TaggedDriverBase,
    TaggedAssetBase,
    TaggedAddressBase,
    SensorHistoryResponse,
    MachineHistoryResponse,
    HosLogsSummaryResponse,
    FleetVehicleLocation,
    VehicleMaintenance,
    DocumentType,
    DocumentFieldCreate,
    DocumentField,
    HosLogsResponse,
    HosAuthenticationLogsResponse,
    UserTagRole,
    UserRole,
    DriverBase,
    TemperatureResponse,
    DocumentCreate,
    Document,
    Contact,
    DvirListResponse,
    DriversSummaryResponse,
    DriversResponse,
    TaggedVehicle,
    DriverDailyLogResponse,
    TaggedSensor,
    DispatchRouteHistory,
    AssetCurrentLocationsResponse,
    TaggedMachine,
    TaggedDriver,
    TaggedAsset,
    TaggedAddress,
    TagModify,
    AssetCurrentLocation,
    TagMetadata,
    Sensor,
    SafetyReportHarshEvent,
    Machine,
    HumidityResponse,
    EngineState,
    Asset,
    DoorResponse,
    DocumentFieldType,
    DispatchJobCreate,
    Address,
    DocumentBase,
    DispatchRouteHistoricalEntry,
    DataInputHistoryResponse,
    CargoResponse,
    AuxInput,
    AuxInputSeries,
    AssetReeferResponse,
    AddressGeofence,
};

/**
 * Factory class to create instances of models and exception classes
 */
class ModelFactory {
    /**
     * Creates instance of a model class
     * @param  modelName  {string}  Name of class to instantiate
     * @returns  {object} Instance of the model class
     */
    static getInstance(modelName) {
        return new classMap[modelName]();
    }
}

module.exports = ModelFactory;
