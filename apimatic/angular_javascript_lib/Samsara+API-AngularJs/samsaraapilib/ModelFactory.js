/**
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

;(function (angular) {
'use strict';
angular.module('SamsaraAPILib')
    .factory('ModelFactory', ['Vibration',
        'Vertex',
        'VehicleUpdateParam',
        'VehicleStat',
        'TripsParam',
        'VehicleInfo',
        'VehicleDefect',
        'ReactivateDriverParam',
        'Vehicle2',
        'Summary',
        'Sensor4',
        'ReeferStats',
        'NextDriverSignature',
        'DriverForCreate',
        'DispatchRouteCreate',
        'Trip',
        'DispatchRouteBase',
        'DispatchRoute',
        'DispatchJob',
        'MechanicOrAgentSignature',
        'HosLogsParam',
        'HosAuthenticationLogsParam',
        'TrailerDefect',
        'HistoryParam1',
        'Tag1',
        'Log',
        'Polygon',
        'Driver',
        'PhotoValue',
        'Passenger',
        'Driver1',
        'NumberValueTypeMetadata',
        'StartCoordinates',
        'DiagnosticTroubleCode',
        'J1939',
        'HosLogsParam2',
        'GroupParam',
        'SetPoint',
        'Series1',
        'GroupDriversParam',
        'Delete',
        'SensorParam',
        'GetVehicleStatsResponse',
        'Day',
        'AuthorSignature',
        'Sensor5',
        'Sensor2',
        'AuthenticationLog',
        'Sensor1',
        'GetAllTagsResponse',
        'GetAllDataInputsResponse',
        'ReturnAirTemp',
        'GetAllAssetsResponse',
        'Result',
        'GetAllAssetCurrentLocationsResponse',
        'PowerStatus',
        'GetSensorsResponse',
        'Point',
        'GetMachinesResponse',
        'Machine1',
        'GetFleetMaintenanceListResponse',
        'AssetLocationResponse',
        'Alarm1',
        'Location',
        'ListFleetResponse',
        'AddressParam',
        'Addresses1',
        'CreateDvirParam',
        'HistoryParam',
        'VehicleSafetyScoreResponse',
        'GetFleetLocationsResponse',
        'Address1',
        'Add',
        'JobUpdateObject',
        'VehicleHarshEventResponse',
        'Vehicle',
        'FuelPercentage',
        'UserBase',
        'User',
        'TagUpdate',
        'TagCreate',
        'FleetVehiclesLocation',
        'CheckEngineLight1',
        'EngineHour',
        'Cable',
        'EndCoordinates',
        'VehicleLocation',
        'DriversSummaryParam',
        'Tag',
        'Pagination',
        'FleetVehicleResponse',
        'DiagnosticTroubleCode1',
        'DvirBase',
        'Data',
        'Circle',
        'CheckEngineLight',
        'DriverSafetyScoreResponse',
        'Addresses',
        'Alarm',
        'AllRouteJobUpdates',
        'TripResponse',
        'TaggedVehicleBase',
        'TaggedSensorBase',
        'TaggedMachineBase',
        'TaggedDriverBase',
        'TaggedAssetBase',
        'TaggedAddressBase',
        'SensorHistoryResponse',
        'MachineHistoryResponse',
        'HosLogsSummaryResponse',
        'FleetVehicleLocation',
        'VehicleMaintenance',
        'DocumentType',
        'DocumentFieldCreate',
        'DocumentField',
        'HosLogsResponse',
        'HosAuthenticationLogsResponse',
        'UserTagRole',
        'UserRole',
        'DriverBase',
        'TemperatureResponse',
        'DocumentCreate',
        'Document',
        'Contact',
        'DvirListResponse',
        'DriversSummaryResponse',
        'DriversResponse',
        'TaggedVehicle',
        'DriverDailyLogResponse',
        'TaggedSensor',
        'DispatchRouteHistory',
        'AssetCurrentLocationsResponse',
        'TaggedMachine',
        'TaggedDriver',
        'TaggedAsset',
        'TaggedAddress',
        'TagModify',
        'AssetCurrentLocation',
        'TagMetadata',
        'Sensor',
        'SafetyReportHarshEvent',
        'Machine',
        'HumidityResponse',
        'EngineState',
        'Asset',
        'DoorResponse',
        'DocumentFieldType',
        'DispatchJobCreate',
        'Address',
        'DocumentBase',
        'DispatchRouteHistoricalEntry',
        'DataInputHistoryResponse',
        'CargoResponse',
        'AuxInput',
        'AuxInputSeries',
        'AssetReeferResponse',
        'AddressGeofence',
        ModelFactory]);

	/**
	 * Factory service to create instances of models and exception classes
	 */
    function ModelFactory(Vibration,
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
        AddressGeofence) {

		var classMap = {
            Vibration: Vibration,
            Vertex: Vertex,
            VehicleUpdateParam: VehicleUpdateParam,
            VehicleStat: VehicleStat,
            TripsParam: TripsParam,
            VehicleInfo: VehicleInfo,
            VehicleDefect: VehicleDefect,
            ReactivateDriverParam: ReactivateDriverParam,
            Vehicle2: Vehicle2,
            Summary: Summary,
            Sensor4: Sensor4,
            ReeferStats: ReeferStats,
            NextDriverSignature: NextDriverSignature,
            DriverForCreate: DriverForCreate,
            DispatchRouteCreate: DispatchRouteCreate,
            Trip: Trip,
            DispatchRouteBase: DispatchRouteBase,
            DispatchRoute: DispatchRoute,
            DispatchJob: DispatchJob,
            MechanicOrAgentSignature: MechanicOrAgentSignature,
            HosLogsParam: HosLogsParam,
            HosAuthenticationLogsParam: HosAuthenticationLogsParam,
            TrailerDefect: TrailerDefect,
            HistoryParam1: HistoryParam1,
            Tag1: Tag1,
            Log: Log,
            Polygon: Polygon,
            Driver: Driver,
            PhotoValue: PhotoValue,
            Passenger: Passenger,
            Driver1: Driver1,
            NumberValueTypeMetadata: NumberValueTypeMetadata,
            StartCoordinates: StartCoordinates,
            DiagnosticTroubleCode: DiagnosticTroubleCode,
            J1939: J1939,
            HosLogsParam2: HosLogsParam2,
            GroupParam: GroupParam,
            SetPoint: SetPoint,
            Series1: Series1,
            GroupDriversParam: GroupDriversParam,
            Delete: Delete,
            SensorParam: SensorParam,
            GetVehicleStatsResponse: GetVehicleStatsResponse,
            Day: Day,
            AuthorSignature: AuthorSignature,
            Sensor5: Sensor5,
            Sensor2: Sensor2,
            AuthenticationLog: AuthenticationLog,
            Sensor1: Sensor1,
            GetAllTagsResponse: GetAllTagsResponse,
            GetAllDataInputsResponse: GetAllDataInputsResponse,
            ReturnAirTemp: ReturnAirTemp,
            GetAllAssetsResponse: GetAllAssetsResponse,
            Result: Result,
            GetAllAssetCurrentLocationsResponse: GetAllAssetCurrentLocationsResponse,
            PowerStatus: PowerStatus,
            GetSensorsResponse: GetSensorsResponse,
            Point: Point,
            GetMachinesResponse: GetMachinesResponse,
            Machine1: Machine1,
            GetFleetMaintenanceListResponse: GetFleetMaintenanceListResponse,
            AssetLocationResponse: AssetLocationResponse,
            Alarm1: Alarm1,
            Location: Location,
            ListFleetResponse: ListFleetResponse,
            AddressParam: AddressParam,
            Addresses1: Addresses1,
            CreateDvirParam: CreateDvirParam,
            HistoryParam: HistoryParam,
            VehicleSafetyScoreResponse: VehicleSafetyScoreResponse,
            GetFleetLocationsResponse: GetFleetLocationsResponse,
            Address1: Address1,
            Add: Add,
            JobUpdateObject: JobUpdateObject,
            VehicleHarshEventResponse: VehicleHarshEventResponse,
            Vehicle: Vehicle,
            FuelPercentage: FuelPercentage,
            UserBase: UserBase,
            User: User,
            TagUpdate: TagUpdate,
            TagCreate: TagCreate,
            FleetVehiclesLocation: FleetVehiclesLocation,
            CheckEngineLight1: CheckEngineLight1,
            EngineHour: EngineHour,
            Cable: Cable,
            EndCoordinates: EndCoordinates,
            VehicleLocation: VehicleLocation,
            DriversSummaryParam: DriversSummaryParam,
            Tag: Tag,
            Pagination: Pagination,
            FleetVehicleResponse: FleetVehicleResponse,
            DiagnosticTroubleCode1: DiagnosticTroubleCode1,
            DvirBase: DvirBase,
            Data: Data,
            Circle: Circle,
            CheckEngineLight: CheckEngineLight,
            DriverSafetyScoreResponse: DriverSafetyScoreResponse,
            Addresses: Addresses,
            Alarm: Alarm,
            AllRouteJobUpdates: AllRouteJobUpdates,
            TripResponse: TripResponse,
            TaggedVehicleBase: TaggedVehicleBase,
            TaggedSensorBase: TaggedSensorBase,
            TaggedMachineBase: TaggedMachineBase,
            TaggedDriverBase: TaggedDriverBase,
            TaggedAssetBase: TaggedAssetBase,
            TaggedAddressBase: TaggedAddressBase,
            SensorHistoryResponse: SensorHistoryResponse,
            MachineHistoryResponse: MachineHistoryResponse,
            HosLogsSummaryResponse: HosLogsSummaryResponse,
            FleetVehicleLocation: FleetVehicleLocation,
            VehicleMaintenance: VehicleMaintenance,
            DocumentType: DocumentType,
            DocumentFieldCreate: DocumentFieldCreate,
            DocumentField: DocumentField,
            HosLogsResponse: HosLogsResponse,
            HosAuthenticationLogsResponse: HosAuthenticationLogsResponse,
            UserTagRole: UserTagRole,
            UserRole: UserRole,
            DriverBase: DriverBase,
            TemperatureResponse: TemperatureResponse,
            DocumentCreate: DocumentCreate,
            Document: Document,
            Contact: Contact,
            DvirListResponse: DvirListResponse,
            DriversSummaryResponse: DriversSummaryResponse,
            DriversResponse: DriversResponse,
            TaggedVehicle: TaggedVehicle,
            DriverDailyLogResponse: DriverDailyLogResponse,
            TaggedSensor: TaggedSensor,
            DispatchRouteHistory: DispatchRouteHistory,
            AssetCurrentLocationsResponse: AssetCurrentLocationsResponse,
            TaggedMachine: TaggedMachine,
            TaggedDriver: TaggedDriver,
            TaggedAsset: TaggedAsset,
            TaggedAddress: TaggedAddress,
            TagModify: TagModify,
            AssetCurrentLocation: AssetCurrentLocation,
            TagMetadata: TagMetadata,
            Sensor: Sensor,
            SafetyReportHarshEvent: SafetyReportHarshEvent,
            Machine: Machine,
            HumidityResponse: HumidityResponse,
            EngineState: EngineState,
            Asset: Asset,
            DoorResponse: DoorResponse,
            DocumentFieldType: DocumentFieldType,
            DispatchJobCreate: DispatchJobCreate,
            Address: Address,
            DocumentBase: DocumentBase,
            DispatchRouteHistoricalEntry: DispatchRouteHistoricalEntry,
            DataInputHistoryResponse: DataInputHistoryResponse,
            CargoResponse: CargoResponse,
            AuxInput: AuxInput,
            AuxInputSeries: AuxInputSeries,
            AssetReeferResponse: AssetReeferResponse,
            AddressGeofence: AddressGeofence
		};

		return {
		    /**
		     * Creates instance of a model class
		     * @param  modelName  {string}  Name of class to instantiate
		     * @returns  {object} Instance of the model class
		     */
			getInstance: function(modelName) {
        		return new classMap[modelName]();
			}
		};
	}

}(angular));