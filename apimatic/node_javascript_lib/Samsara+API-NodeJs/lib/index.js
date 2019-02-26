/**
  * @module SamsaraAPILib
  *
  * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you
  * can build powerful applications and custom solutions with sensor data. Samsara has endpoints
  * available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is
  * a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an
  * [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl,
  * or HTTP libraries of most modern programming languages including python, ruby, java. We use
  * built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-
  * the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web
  * application (though you should never expose your secret API key). [JSON](http://www.json.org/)
  * is returned by all API responses, including errors. If you’re familiar with what you can build
  * with a REST API, the following API reference guide will be your go-to resource.  API access to
  * the Samsara cloud is available to all Samsara administrators. To start developing with Samsara
  * APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API
  * requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:
  * support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs
  * like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are
  * [versioned](#section/Versioning). If we intend to make breaking changes to an API which either
  * changes the response format or request parameter, we will increment the version.  #
  * Authentication  To authenticate your API request you will need to include your secret token.
  * You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible
  * under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure
  * to keep them secure. Do not share your secret API tokens in publicly accessible areas such as
  * GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic
  * Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the
  * basic access_token value in the URL. You do not need to provide a password.  ```curl https:
  * //api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must
  * be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or
  * without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request
  * methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify
  * the desired operation to be performed. The documentation below specified request method
  * supported by each endpoint and the resulting action.  ## GET  GET requests are typically used
  * for fetching data (like data for a particular driver).  ## POST  POST requests are typically
  * used for creating or updating a record (like adding new tags to the system). With that being
  * said, a few of our POST requests can be used for fetching data (like current location data of
  * your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like
  * updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically
  * used for modifying an existing record (like modifying a few devices associated with a
  * particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a
  * tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP
  * status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should
  * handle each response class differently.  ## 2XX  These are successful responses and indicate
  * that the API request returned the expected response.  ## 4XX  These indicate that there was a
  * problem with the request like a missing parameter or invalid values. Check the response for
  * specific [error details](#section/Error-Responses). Requests that respond with a 4XX status
  * code, should be modified before retrying.  ## 5XX  These indicate server errors when the server
  * is unreachable or is misconfigured. In this case, you should retry the API request after some
  * delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain
  * information to briefly explain the error reported. To help debugging the error, you can refer
  * to the following table for understanding the error message.  | Status Code | Message |
  * Description | |-------------|----------------|--------------------------------------------------
  * -----------------| | 401 | Invalid token | The API token is invalid and could not be
  * authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 |
  * Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default
  * response for an invalid request. Please check the request to make sure it follows the format
  * specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API
  * version is `v1` and we are continuously working on improving it further and provide additional
  * endpoints. If we intend to make breaking changes to an API which either changes the response
  * format or request parameter, we will increment the version. Thus, you can use our current API
  * version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.
  * com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us
  * on [support@samsara.com](mailto:support@samsara.com).
  */

'use strict';

const Configuration = require('./configuration');
const TagsController = require('./Controllers/TagsController');
const FleetController = require('./Controllers/FleetController');
const UsersController = require('./Controllers/UsersController');
const IndustrialController = require('./Controllers/IndustrialController');
const SensorsController = require('./Controllers/SensorsController');
const Vibration = require('./Models/Vibration');
const Vertex = require('./Models/Vertex');
const VehicleUpdateParam = require('./Models/VehicleUpdateParam');
const VehicleStat = require('./Models/VehicleStat');
const TripsParam = require('./Models/TripsParam');
const VehicleInfo = require('./Models/VehicleInfo');
const VehicleDefect = require('./Models/VehicleDefect');
const ReactivateDriverParam = require('./Models/ReactivateDriverParam');
const Vehicle2 = require('./Models/Vehicle2');
const Summary = require('./Models/Summary');
const Sensor4 = require('./Models/Sensor4');
const ReeferStats = require('./Models/ReeferStats');
const NextDriverSignature = require('./Models/NextDriverSignature');
const DriverForCreate = require('./Models/DriverForCreate');
const DispatchRouteCreate = require('./Models/DispatchRouteCreate');
const Trip = require('./Models/Trip');
const DispatchRouteBase = require('./Models/DispatchRouteBase');
const DispatchRoute = require('./Models/DispatchRoute');
const DispatchJob = require('./Models/DispatchJob');
const NameEnum = require('./Models/NameEnum');
const ValueEnum = require('./Models/ValueEnum');
const MechanicOrAgentSignature = require('./Models/MechanicOrAgentSignature');
const HosLogsParam = require('./Models/HosLogsParam');
const HosAuthenticationLogsParam = require('./Models/HosAuthenticationLogsParam');
const TrailerDefect = require('./Models/TrailerDefect');
const HistoryParam1 = require('./Models/HistoryParam1');
const Tag1 = require('./Models/Tag1');
const Log = require('./Models/Log');
const Polygon = require('./Models/Polygon');
const Driver = require('./Models/Driver');
const FieldEnum = require('./Models/FieldEnum');
const PhotoValue = require('./Models/PhotoValue');
const Passenger = require('./Models/Passenger');
const Driver1 = require('./Models/Driver1');
const NumberValueTypeMetadata = require('./Models/NumberValueTypeMetadata');
const StartCoordinates = require('./Models/StartCoordinates');
const HarshAccelSettingEnum = require('./Models/HarshAccelSettingEnum');
const DiagnosticTroubleCode = require('./Models/DiagnosticTroubleCode');
const J1939 = require('./Models/J1939');
const HosLogsParam2 = require('./Models/HosLogsParam2');
const GroupParam = require('./Models/GroupParam');
const SetPoint = require('./Models/SetPoint');
const Series1 = require('./Models/Series1');
const GroupDriversParam = require('./Models/GroupDriversParam');
const Delete = require('./Models/Delete');
const SeriesEnum = require('./Models/SeriesEnum');
const SensorParam = require('./Models/SensorParam');
const GetVehicleStatsResponse = require('./Models/GetVehicleStatsResponse');
const Day = require('./Models/Day');
const AuthorSignature = require('./Models/AuthorSignature');
const Sensor5 = require('./Models/Sensor5');
const Sensor2 = require('./Models/Sensor2');
const AuthenticationLog = require('./Models/AuthenticationLog');
const Sensor1 = require('./Models/Sensor1');
const GetAllTagsResponse = require('./Models/GetAllTagsResponse');
const SafeEnum = require('./Models/SafeEnum');
const GetAllDataInputsResponse = require('./Models/GetAllDataInputsResponse');
const ReturnAirTemp = require('./Models/ReturnAirTemp');
const GetAllAssetsResponse = require('./Models/GetAllAssetsResponse');
const Result = require('./Models/Result');
const GetAllAssetCurrentLocationsResponse = require('./Models/GetAllAssetCurrentLocationsResponse');
const PowerStatus = require('./Models/PowerStatus');
const GetSensorsResponse = require('./Models/GetSensorsResponse');
const Point = require('./Models/Point');
const GetMachinesResponse = require('./Models/GetMachinesResponse');
const Machine1 = require('./Models/Machine1');
const GetFleetMaintenanceListResponse = require('./Models/GetFleetMaintenanceListResponse');
const AssetLocationResponse = require('./Models/AssetLocationResponse');
const Alarm1 = require('./Models/Alarm1');
const Location = require('./Models/Location');
const ListFleetResponse = require('./Models/ListFleetResponse');
const AddressParam = require('./Models/AddressParam');
const Addresses1 = require('./Models/Addresses1');
const CreateDvirParam = require('./Models/CreateDvirParam');
const HistoryParam = require('./Models/HistoryParam');
const VehicleSafetyScoreResponse = require('./Models/VehicleSafetyScoreResponse');
const GetFleetLocationsResponse = require('./Models/GetFleetLocationsResponse');
const Address1 = require('./Models/Address1');
const Add = require('./Models/Add');
const PrevJobStatusEnum = require('./Models/PrevJobStatusEnum');
const JobUpdateObject = require('./Models/JobUpdateObject');
const JobStatusEnum = require('./Models/JobStatusEnum');
const FillMissingEnum = require('./Models/FillMissingEnum');
const VehicleHarshEventResponse = require('./Models/VehicleHarshEventResponse');
const Vehicle = require('./Models/Vehicle');
const FuelPercentage = require('./Models/FuelPercentage');
const UserBase = require('./Models/UserBase');
const User = require('./Models/User');
const TagUpdate = require('./Models/TagUpdate');
const TagCreate = require('./Models/TagCreate');
const FleetVehiclesLocation = require('./Models/FleetVehiclesLocation');
const CheckEngineLight1 = require('./Models/CheckEngineLight1');
const EngineHour = require('./Models/EngineHour');
const Cable = require('./Models/Cable');
const EndCoordinates = require('./Models/EndCoordinates');
const VehicleLocation = require('./Models/VehicleLocation');
const DriversSummaryParam = require('./Models/DriversSummaryParam');
const Tag = require('./Models/Tag');
const Pagination = require('./Models/Pagination');
const FleetVehicleResponse = require('./Models/FleetVehicleResponse');
const DiagnosticTroubleCode1 = require('./Models/DiagnosticTroubleCode1');
const DvirBase = require('./Models/DvirBase');
const Data = require('./Models/Data');
const Circle = require('./Models/Circle');
const CheckEngineLight = require('./Models/CheckEngineLight');
const DriverSafetyScoreResponse = require('./Models/DriverSafetyScoreResponse');
const Addresses = require('./Models/Addresses');
const AuthTypeEnum = require('./Models/AuthTypeEnum');
const Alarm = require('./Models/Alarm');
const AllRouteJobUpdates = require('./Models/AllRouteJobUpdates');
const TripResponse = require('./Models/TripResponse');
const TaggedVehicleBase = require('./Models/TaggedVehicleBase');
const TaggedSensorBase = require('./Models/TaggedSensorBase');
const TaggedMachineBase = require('./Models/TaggedMachineBase');
const TaggedDriverBase = require('./Models/TaggedDriverBase');
const TaggedAssetBase = require('./Models/TaggedAssetBase');
const TaggedAddressBase = require('./Models/TaggedAddressBase');
const SensorHistoryResponse = require('./Models/SensorHistoryResponse');
const MachineHistoryResponse = require('./Models/MachineHistoryResponse');
const HosLogsSummaryResponse = require('./Models/HosLogsSummaryResponse');
const FleetVehicleLocation = require('./Models/FleetVehicleLocation');
const VehicleMaintenance = require('./Models/VehicleMaintenance');
const DocumentType = require('./Models/DocumentType');
const DocumentFieldCreate = require('./Models/DocumentFieldCreate');
const DocumentField = require('./Models/DocumentField');
const HosLogsResponse = require('./Models/HosLogsResponse');
const HosAuthenticationLogsResponse = require('./Models/HosAuthenticationLogsResponse');
const UserTagRole = require('./Models/UserTagRole');
const UserRole = require('./Models/UserRole');
const DriverBase = require('./Models/DriverBase');
const TemperatureResponse = require('./Models/TemperatureResponse');
const DocumentCreate = require('./Models/DocumentCreate');
const Document = require('./Models/Document');
const Contact = require('./Models/Contact');
const DvirListResponse = require('./Models/DvirListResponse');
const DriversSummaryResponse = require('./Models/DriversSummaryResponse');
const DriversResponse = require('./Models/DriversResponse');
const TaggedVehicle = require('./Models/TaggedVehicle');
const DriverDailyLogResponse = require('./Models/DriverDailyLogResponse');
const TaggedSensor = require('./Models/TaggedSensor');
const DispatchRouteHistory = require('./Models/DispatchRouteHistory');
const AssetCurrentLocationsResponse = require('./Models/AssetCurrentLocationsResponse');
const TaggedMachine = require('./Models/TaggedMachine');
const TaggedDriver = require('./Models/TaggedDriver');
const TaggedAsset = require('./Models/TaggedAsset');
const TaggedAddress = require('./Models/TaggedAddress');
const TagModify = require('./Models/TagModify');
const AssetCurrentLocation = require('./Models/AssetCurrentLocation');
const TagMetadata = require('./Models/TagMetadata');
const Sensor = require('./Models/Sensor');
const SafetyReportHarshEvent = require('./Models/SafetyReportHarshEvent');
const Machine = require('./Models/Machine');
const HumidityResponse = require('./Models/HumidityResponse');
const EngineState = require('./Models/EngineState');
const Asset = require('./Models/Asset');
const DoorResponse = require('./Models/DoorResponse');
const DocumentFieldType = require('./Models/DocumentFieldType');
const DispatchJobCreate = require('./Models/DispatchJobCreate');
const Address = require('./Models/Address');
const DocumentBase = require('./Models/DocumentBase');
const DispatchRouteHistoricalEntry = require('./Models/DispatchRouteHistoricalEntry');
const DataInputHistoryResponse = require('./Models/DataInputHistoryResponse');
const CargoResponse = require('./Models/CargoResponse');
const AuxInput = require('./Models/AuxInput');
const AuxInputSeries = require('./Models/AuxInputSeries');
const AssetReeferResponse = require('./Models/AssetReeferResponse');
const AddressGeofence = require('./Models/AddressGeofence');
const APIException = require('./Exceptions/APIException');


const initializer = {
    // functional components of SamsaraAPILib
    Configuration,
    // controllers of SamsaraAPILib
    TagsController,
    FleetController,
    UsersController,
    IndustrialController,
    SensorsController,
    // models of SamsaraAPILib
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
    NameEnum,
    ValueEnum,
    MechanicOrAgentSignature,
    HosLogsParam,
    HosAuthenticationLogsParam,
    TrailerDefect,
    HistoryParam1,
    Tag1,
    Log,
    Polygon,
    Driver,
    FieldEnum,
    PhotoValue,
    Passenger,
    Driver1,
    NumberValueTypeMetadata,
    StartCoordinates,
    HarshAccelSettingEnum,
    DiagnosticTroubleCode,
    J1939,
    HosLogsParam2,
    GroupParam,
    SetPoint,
    Series1,
    GroupDriversParam,
    Delete,
    SeriesEnum,
    SensorParam,
    GetVehicleStatsResponse,
    Day,
    AuthorSignature,
    Sensor5,
    Sensor2,
    AuthenticationLog,
    Sensor1,
    GetAllTagsResponse,
    SafeEnum,
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
    PrevJobStatusEnum,
    JobUpdateObject,
    JobStatusEnum,
    FillMissingEnum,
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
    AuthTypeEnum,
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
    // exceptions of SamsaraAPILib
    APIException,
};

module.exports = initializer;
