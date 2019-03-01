/// mime types for requests and responses

pub mod responses {
    use hyper::mime::*;

    // The macro is called per-operation to beat the recursion limit
    /// Create Mime objects for the response content types for GetAllAssetCurrentLocations
    lazy_static! {
        pub static ref GET_ALL_ASSET_CURRENT_LOCATIONS_LIST_OF_ASSETS_AND_THEIR_CURRENT_LOCATIONS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAllAssetCurrentLocations
    lazy_static! {
        pub static ref GET_ALL_ASSET_CURRENT_LOCATIONS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAllAssets
    lazy_static! {
        pub static ref GET_ALL_ASSETS_LIST_OF_ASSETS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAllAssets
    lazy_static! {
        pub static ref GET_ALL_ASSETS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAssetLocation
    lazy_static! {
        pub static ref GET_ASSET_LOCATION_ASSET_LOCATION_DETAILS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAssetLocation
    lazy_static! {
        pub static ref GET_ASSET_LOCATION_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAssetReefer
    lazy_static! {
        pub static ref GET_ASSET_REEFER_REEFER: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAssetReefer
    lazy_static! {
        pub static ref GET_ASSET_REEFER_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateDriver
    lazy_static! {
        pub static ref CREATE_DRIVER_RETURNS_THE_SUCCESSFULLY_CREATED_THE_DRIVER: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateDriver
    lazy_static! {
        pub static ref CREATE_DRIVER_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for DeactivateDriver
    lazy_static! {
        pub static ref DEACTIVATE_DRIVER_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAllDeactivatedDrivers
    lazy_static! {
        pub static ref GET_ALL_DEACTIVATED_DRIVERS_RETURNS_AN_ARRAY_OF_ALL_DEACTIVATED_DRIVERS_FOR_THE_GROUP: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAllDeactivatedDrivers
    lazy_static! {
        pub static ref GET_ALL_DEACTIVATED_DRIVERS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDeactivatedDriverById
    lazy_static! {
        pub static ref GET_DEACTIVATED_DRIVER_BY_ID_RETURNS_THE_DEACTIVATED_DRIVER_WITH_THE_GIVEN_DRIVER: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDeactivatedDriverById
    lazy_static! {
        pub static ref GET_DEACTIVATED_DRIVER_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDriverById
    lazy_static! {
        pub static ref GET_DRIVER_BY_ID_RETURNS_THE_DRIVER_FOR_THE_GIVEN_DRIVER: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDriverById
    lazy_static! {
        pub static ref GET_DRIVER_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ReactivateDriverById
    lazy_static! {
        pub static ref REACTIVATE_DRIVER_BY_ID_RETURNS_THE_REACTIVATED_DRIVER: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ReactivateDriverById
    lazy_static! {
        pub static ref REACTIVATE_DRIVER_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for AddFleetAddress
    lazy_static! {
        pub static ref ADD_FLEET_ADDRESS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for AddOrganizationAddresses
    lazy_static! {
        pub static ref ADD_ORGANIZATION_ADDRESSES_LIST_OF_ADDED_ADDRESSES: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for AddOrganizationAddresses
    lazy_static! {
        pub static ref ADD_ORGANIZATION_ADDRESSES_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateDispatchRoute
    lazy_static! {
        pub static ref CREATE_DISPATCH_ROUTE_CREATED_ROUTE_OBJECT_INCLUDING_THE_NEW_ROUTE_ID: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateDispatchRoute
    lazy_static! {
        pub static ref CREATE_DISPATCH_ROUTE_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateDriver
    lazy_static! {
        pub static ref CREATE_DRIVER_RETURNS_THE_SUCCESSFULLY_CREATED_THE_DRIVER: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateDriver
    lazy_static! {
        pub static ref CREATE_DRIVER_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateDriverDispatchRoute
    lazy_static! {
        pub static ref CREATE_DRIVER_DISPATCH_ROUTE_CREATED_ROUTE_OBJECT_INCLUDING_THE_NEW_ROUTE_ID: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateDriverDispatchRoute
    lazy_static! {
        pub static ref CREATE_DRIVER_DISPATCH_ROUTE_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateDriverDocument
    lazy_static! {
        pub static ref CREATE_DRIVER_DOCUMENT_RETURNS_THE_CREATED_DOCUMENT: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateDriverDocument
    lazy_static! {
        pub static ref CREATE_DRIVER_DOCUMENT_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateDvir
    lazy_static! {
        pub static ref CREATE_DVIR_NEWLY_CREATED_DVIR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateDvir
    lazy_static! {
        pub static ref CREATE_DVIR_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateVehicleDispatchRoute
    lazy_static! {
        pub static ref CREATE_VEHICLE_DISPATCH_ROUTE_CREATED_ROUTE_OBJECT_INCLUDING_THE_NEW_ROUTE_ID: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateVehicleDispatchRoute
    lazy_static! {
        pub static ref CREATE_VEHICLE_DISPATCH_ROUTE_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for DeactivateDriver
    lazy_static! {
        pub static ref DEACTIVATE_DRIVER_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for DeleteDispatchRouteById
    lazy_static! {
        pub static ref DELETE_DISPATCH_ROUTE_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for DeleteOrganizationAddress
    lazy_static! {
        pub static ref DELETE_ORGANIZATION_ADDRESS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for FetchAllDispatchRoutes
    lazy_static! {
        pub static ref FETCH_ALL_DISPATCH_ROUTES_ALL_DISPATCH_ROUTE_OBJECTS_FOR_THE_GROUP: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for FetchAllDispatchRoutes
    lazy_static! {
        pub static ref FETCH_ALL_DISPATCH_ROUTES_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for FetchAllRouteJobUpdates
    lazy_static! {
        pub static ref FETCH_ALL_ROUTE_JOB_UPDATES_ALL_JOB_UPDATES_ON_ROUTES: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for FetchAllRouteJobUpdates
    lazy_static! {
        pub static ref FETCH_ALL_ROUTE_JOB_UPDATES_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAllAssetCurrentLocations
    lazy_static! {
        pub static ref GET_ALL_ASSET_CURRENT_LOCATIONS_LIST_OF_ASSETS_AND_THEIR_CURRENT_LOCATIONS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAllAssetCurrentLocations
    lazy_static! {
        pub static ref GET_ALL_ASSET_CURRENT_LOCATIONS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAllAssets
    lazy_static! {
        pub static ref GET_ALL_ASSETS_LIST_OF_ASSETS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAllAssets
    lazy_static! {
        pub static ref GET_ALL_ASSETS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAllDeactivatedDrivers
    lazy_static! {
        pub static ref GET_ALL_DEACTIVATED_DRIVERS_RETURNS_AN_ARRAY_OF_ALL_DEACTIVATED_DRIVERS_FOR_THE_GROUP: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAllDeactivatedDrivers
    lazy_static! {
        pub static ref GET_ALL_DEACTIVATED_DRIVERS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAssetLocation
    lazy_static! {
        pub static ref GET_ASSET_LOCATION_ASSET_LOCATION_DETAILS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAssetLocation
    lazy_static! {
        pub static ref GET_ASSET_LOCATION_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAssetReefer
    lazy_static! {
        pub static ref GET_ASSET_REEFER_REEFER: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAssetReefer
    lazy_static! {
        pub static ref GET_ASSET_REEFER_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDeactivatedDriverById
    lazy_static! {
        pub static ref GET_DEACTIVATED_DRIVER_BY_ID_RETURNS_THE_DEACTIVATED_DRIVER_WITH_THE_GIVEN_DRIVER: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDeactivatedDriverById
    lazy_static! {
        pub static ref GET_DEACTIVATED_DRIVER_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDispatchRouteById
    lazy_static! {
        pub static ref GET_DISPATCH_ROUTE_BY_ID_THE_DISPATCH_ROUTE_CORRESPONDING_TO_ROUTE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDispatchRouteById
    lazy_static! {
        pub static ref GET_DISPATCH_ROUTE_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDispatchRouteHistory
    lazy_static! {
        pub static ref GET_DISPATCH_ROUTE_HISTORY_THE_HISTORICAL_ROUTE_STATE_CHANGES_BETWEEN_START: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDispatchRouteHistory
    lazy_static! {
        pub static ref GET_DISPATCH_ROUTE_HISTORY_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDispatchRoutesByDriverId
    lazy_static! {
        pub static ref GET_DISPATCH_ROUTES_BY_DRIVER_ID_RETURNS_THE_DISPATCH_ROUTES_FOR_THE_GIVEN_DRIVER: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDispatchRoutesByDriverId
    lazy_static! {
        pub static ref GET_DISPATCH_ROUTES_BY_DRIVER_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDispatchRoutesByVehicleId
    lazy_static! {
        pub static ref GET_DISPATCH_ROUTES_BY_VEHICLE_ID_RETURNS_ALL_OF_THE_DISPATCH_ROUTES_FOR_THE_GIVEN_VEHICLE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDispatchRoutesByVehicleId
    lazy_static! {
        pub static ref GET_DISPATCH_ROUTES_BY_VEHICLE_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDriverById
    lazy_static! {
        pub static ref GET_DRIVER_BY_ID_RETURNS_THE_DRIVER_FOR_THE_GIVEN_DRIVER: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDriverById
    lazy_static! {
        pub static ref GET_DRIVER_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDriverDocumentTypesByOrgId
    lazy_static! {
        pub static ref GET_DRIVER_DOCUMENT_TYPES_BY_ORG_ID_RETURNS_ALL_OF_THE_DOCUMENT_TYPES: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDriverDocumentTypesByOrgId
    lazy_static! {
        pub static ref GET_DRIVER_DOCUMENT_TYPES_BY_ORG_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDriverDocumentsByOrgId
    lazy_static! {
        pub static ref GET_DRIVER_DOCUMENTS_BY_ORG_ID_RETURNS_ALL_OF_THE_DOCUMENTS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDriverDocumentsByOrgId
    lazy_static! {
        pub static ref GET_DRIVER_DOCUMENTS_BY_ORG_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDriverSafetyScore
    lazy_static! {
        pub static ref GET_DRIVER_SAFETY_SCORE_SAFETY_SCORE_DETAILS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDriverSafetyScore
    lazy_static! {
        pub static ref GET_DRIVER_SAFETY_SCORE_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDvirs
    lazy_static! {
        pub static ref GET_DVIRS_DVI_RS_FOR_THE_SPECIFIED_DURATION: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDvirs
    lazy_static! {
        pub static ref GET_DVIRS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetDrivers
    lazy_static! {
        pub static ref GET_FLEET_DRIVERS_ALL_DRIVERS_IN_THE_GROUP: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetDrivers
    lazy_static! {
        pub static ref GET_FLEET_DRIVERS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetDriversHosDailyLogs
    lazy_static! {
        pub static ref GET_FLEET_DRIVERS_HOS_DAILY_LOGS_DISTANCE_TRAVELED_AND_TIME_ACTIVE_FOR_EACH_DRIVER_IN_THE_ORGANIZATION_OVER_THE_SPECIFIED_TIME_PERIOD: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetDriversHosDailyLogs
    lazy_static! {
        pub static ref GET_FLEET_DRIVERS_HOS_DAILY_LOGS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetDriversSummary
    lazy_static! {
        pub static ref GET_FLEET_DRIVERS_SUMMARY_DISTANCE_TRAVELED_AND_TIME_ACTIVE_FOR_EACH_DRIVER_IN_THE_ORGANIZATION_OVER_THE_SPECIFIED_TIME_PERIOD: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetDriversSummary
    lazy_static! {
        pub static ref GET_FLEET_DRIVERS_SUMMARY_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetHosAuthenticationLogs
    lazy_static! {
        pub static ref GET_FLEET_HOS_AUTHENTICATION_LOGS_HOS_AUTHENTICATION_LOGS_FOR_THE_SPECIFIED_DRIVER: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetHosAuthenticationLogs
    lazy_static! {
        pub static ref GET_FLEET_HOS_AUTHENTICATION_LOGS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetHosLogs
    lazy_static! {
        pub static ref GET_FLEET_HOS_LOGS_HOS_LOGS_FOR_THE_SPECIFIED_DRIVER: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetHosLogs
    lazy_static! {
        pub static ref GET_FLEET_HOS_LOGS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetHosLogsSummary
    lazy_static! {
        pub static ref GET_FLEET_HOS_LOGS_SUMMARY_HOS_LOGS_FOR_THE_SPECIFIED_DRIVER: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetHosLogsSummary
    lazy_static! {
        pub static ref GET_FLEET_HOS_LOGS_SUMMARY_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetLocations
    lazy_static! {
        pub static ref GET_FLEET_LOCATIONS_LIST_OF_VEHICLE_OBJECTS_CONTAINING_THEIR_LOCATION_AND_THE_TIME_AT_WHICH_THAT_LOCATION_WAS_LOGGED: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetLocations
    lazy_static! {
        pub static ref GET_FLEET_LOCATIONS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetMaintenanceList
    lazy_static! {
        pub static ref GET_FLEET_MAINTENANCE_LIST_LIST_OF_VEHICLES_AND_MAINTENANCE_INFORMATION_ABOUT_EACH: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetMaintenanceList
    lazy_static! {
        pub static ref GET_FLEET_MAINTENANCE_LIST_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetTrips
    lazy_static! {
        pub static ref GET_FLEET_TRIPS_LIST_OF_TRIPS_TAKEN_BY_THE_REQUESTED_VEHICLE_WITHIN_THE_SPECIFIED_TIMEFRAME: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetTrips
    lazy_static! {
        pub static ref GET_FLEET_TRIPS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetVehicle
    lazy_static! {
        pub static ref GET_FLEET_VEHICLE_THE_SPECIFIED_VEHICLE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetFleetVehicle
    lazy_static! {
        pub static ref GET_FLEET_VEHICLE_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetOrganizationAddress
    lazy_static! {
        pub static ref GET_ORGANIZATION_ADDRESS_THE_ADDRESS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetOrganizationAddress
    lazy_static! {
        pub static ref GET_ORGANIZATION_ADDRESS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetOrganizationAddresses
    lazy_static! {
        pub static ref GET_ORGANIZATION_ADDRESSES_LIST_OF_ADDRESSES: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetOrganizationAddresses
    lazy_static! {
        pub static ref GET_ORGANIZATION_ADDRESSES_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetOrganizationContact
    lazy_static! {
        pub static ref GET_ORGANIZATION_CONTACT_THE_CONTACT: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetOrganizationContact
    lazy_static! {
        pub static ref GET_ORGANIZATION_CONTACT_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetVehicleHarshEvent
    lazy_static! {
        pub static ref GET_VEHICLE_HARSH_EVENT_HARSH_EVENT_DETAILS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetVehicleHarshEvent
    lazy_static! {
        pub static ref GET_VEHICLE_HARSH_EVENT_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetVehicleLocations
    lazy_static! {
        pub static ref GET_VEHICLE_LOCATIONS_RETURNS_LOCATIONS_FOR_A_GIVEN_VEHICLE_BETWEEN_A_START: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetVehicleLocations
    lazy_static! {
        pub static ref GET_VEHICLE_LOCATIONS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetVehicleSafetyScore
    lazy_static! {
        pub static ref GET_VEHICLE_SAFETY_SCORE_SAFETY_SCORE_DETAILS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetVehicleSafetyScore
    lazy_static! {
        pub static ref GET_VEHICLE_SAFETY_SCORE_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetVehicleStats
    lazy_static! {
        pub static ref GET_VEHICLE_STATS_RETURNS_ENGINE_STATE_AND: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetVehicleStats
    lazy_static! {
        pub static ref GET_VEHICLE_STATS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetVehiclesLocations
    lazy_static! {
        pub static ref GET_VEHICLES_LOCATIONS_RETURNS_LOCATIONS_FOR_A_GIVEN_VEHICLE_BETWEEN_A_START: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetVehiclesLocations
    lazy_static! {
        pub static ref GET_VEHICLES_LOCATIONS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ListContacts
    lazy_static! {
        pub static ref LIST_CONTACTS_LIST_OF_CONTACTS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ListContacts
    lazy_static! {
        pub static ref LIST_CONTACTS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ListFleet
    lazy_static! {
        pub static ref LIST_FLEET_LIST_OF_VEHICLES_AND_INFORMATION_ABOUT_EACH: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ListFleet
    lazy_static! {
        pub static ref LIST_FLEET_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for PatchFleetVehicle
    lazy_static! {
        pub static ref PATCH_FLEET_VEHICLE_THE_UPDATED_VEHICLE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for PatchFleetVehicle
    lazy_static! {
        pub static ref PATCH_FLEET_VEHICLE_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ReactivateDriverById
    lazy_static! {
        pub static ref REACTIVATE_DRIVER_BY_ID_RETURNS_THE_REACTIVATED_DRIVER: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ReactivateDriverById
    lazy_static! {
        pub static ref REACTIVATE_DRIVER_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for UpdateDispatchRouteById
    lazy_static! {
        pub static ref UPDATE_DISPATCH_ROUTE_BY_ID_UPDATE_THE_DISPATCH_ROUTE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for UpdateDispatchRouteById
    lazy_static! {
        pub static ref UPDATE_DISPATCH_ROUTE_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for UpdateOrganizationAddress
    lazy_static! {
        pub static ref UPDATE_ORGANIZATION_ADDRESS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for UpdateVehicles
    lazy_static! {
        pub static ref UPDATE_VEHICLES_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAllDataInputs
    lazy_static! {
        pub static ref GET_ALL_DATA_INPUTS_LIST_OF_DATA_INPUTS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAllDataInputs
    lazy_static! {
        pub static ref GET_ALL_DATA_INPUTS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDataInput
    lazy_static! {
        pub static ref GET_DATA_INPUT_RETURNS_DATAPOINTS_FOR_THE_GIVEN_DATA_INPUT: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDataInput
    lazy_static! {
        pub static ref GET_DATA_INPUT_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetMachines
    lazy_static! {
        pub static ref GET_MACHINES_LIST_OF_MACHINE_OBJECTS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetMachines
    lazy_static! {
        pub static ref GET_MACHINES_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetMachinesHistory
    lazy_static! {
        pub static ref GET_MACHINES_HISTORY_LIST_OF_MACHINE_RESULTS_OBJECTS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetMachinesHistory
    lazy_static! {
        pub static ref GET_MACHINES_HISTORY_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateDispatchRoute
    lazy_static! {
        pub static ref CREATE_DISPATCH_ROUTE_CREATED_ROUTE_OBJECT_INCLUDING_THE_NEW_ROUTE_ID: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateDispatchRoute
    lazy_static! {
        pub static ref CREATE_DISPATCH_ROUTE_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateDriverDispatchRoute
    lazy_static! {
        pub static ref CREATE_DRIVER_DISPATCH_ROUTE_CREATED_ROUTE_OBJECT_INCLUDING_THE_NEW_ROUTE_ID: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateDriverDispatchRoute
    lazy_static! {
        pub static ref CREATE_DRIVER_DISPATCH_ROUTE_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateVehicleDispatchRoute
    lazy_static! {
        pub static ref CREATE_VEHICLE_DISPATCH_ROUTE_CREATED_ROUTE_OBJECT_INCLUDING_THE_NEW_ROUTE_ID: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateVehicleDispatchRoute
    lazy_static! {
        pub static ref CREATE_VEHICLE_DISPATCH_ROUTE_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for DeleteDispatchRouteById
    lazy_static! {
        pub static ref DELETE_DISPATCH_ROUTE_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for FetchAllDispatchRoutes
    lazy_static! {
        pub static ref FETCH_ALL_DISPATCH_ROUTES_ALL_DISPATCH_ROUTE_OBJECTS_FOR_THE_GROUP: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for FetchAllDispatchRoutes
    lazy_static! {
        pub static ref FETCH_ALL_DISPATCH_ROUTES_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for FetchAllRouteJobUpdates
    lazy_static! {
        pub static ref FETCH_ALL_ROUTE_JOB_UPDATES_ALL_JOB_UPDATES_ON_ROUTES: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for FetchAllRouteJobUpdates
    lazy_static! {
        pub static ref FETCH_ALL_ROUTE_JOB_UPDATES_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDispatchRouteById
    lazy_static! {
        pub static ref GET_DISPATCH_ROUTE_BY_ID_THE_DISPATCH_ROUTE_CORRESPONDING_TO_ROUTE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDispatchRouteById
    lazy_static! {
        pub static ref GET_DISPATCH_ROUTE_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDispatchRouteHistory
    lazy_static! {
        pub static ref GET_DISPATCH_ROUTE_HISTORY_THE_HISTORICAL_ROUTE_STATE_CHANGES_BETWEEN_START: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDispatchRouteHistory
    lazy_static! {
        pub static ref GET_DISPATCH_ROUTE_HISTORY_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDispatchRoutesByDriverId
    lazy_static! {
        pub static ref GET_DISPATCH_ROUTES_BY_DRIVER_ID_RETURNS_THE_DISPATCH_ROUTES_FOR_THE_GIVEN_DRIVER: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDispatchRoutesByDriverId
    lazy_static! {
        pub static ref GET_DISPATCH_ROUTES_BY_DRIVER_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDispatchRoutesByVehicleId
    lazy_static! {
        pub static ref GET_DISPATCH_ROUTES_BY_VEHICLE_ID_RETURNS_ALL_OF_THE_DISPATCH_ROUTES_FOR_THE_GIVEN_VEHICLE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDispatchRoutesByVehicleId
    lazy_static! {
        pub static ref GET_DISPATCH_ROUTES_BY_VEHICLE_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for UpdateDispatchRouteById
    lazy_static! {
        pub static ref UPDATE_DISPATCH_ROUTE_BY_ID_UPDATE_THE_DISPATCH_ROUTE: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for UpdateDispatchRouteById
    lazy_static! {
        pub static ref UPDATE_DISPATCH_ROUTE_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDriverSafetyScore
    lazy_static! {
        pub static ref GET_DRIVER_SAFETY_SCORE_SAFETY_SCORE_DETAILS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetDriverSafetyScore
    lazy_static! {
        pub static ref GET_DRIVER_SAFETY_SCORE_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetVehicleHarshEvent
    lazy_static! {
        pub static ref GET_VEHICLE_HARSH_EVENT_HARSH_EVENT_DETAILS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetVehicleHarshEvent
    lazy_static! {
        pub static ref GET_VEHICLE_HARSH_EVENT_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetVehicleSafetyScore
    lazy_static! {
        pub static ref GET_VEHICLE_SAFETY_SCORE_SAFETY_SCORE_DETAILS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetVehicleSafetyScore
    lazy_static! {
        pub static ref GET_VEHICLE_SAFETY_SCORE_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetSensors
    lazy_static! {
        pub static ref GET_SENSORS_LIST_OF_SENSOR_OBJECTS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetSensors
    lazy_static! {
        pub static ref GET_SENSORS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetSensorsCargo
    lazy_static! {
        pub static ref GET_SENSORS_CARGO_LIST_OF_SENSOR_OBJECTS_CONTAINING_THE_CURRENT_CARGO_STATUS_REPORTED_BY_EACH_SENSOR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetSensorsCargo
    lazy_static! {
        pub static ref GET_SENSORS_CARGO_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetSensorsDoor
    lazy_static! {
        pub static ref GET_SENSORS_DOOR_LIST_OF_SENSOR_OBJECTS_CONTAINING_THE_CURRENT_DOOR_STATUS_REPORTED_BY_EACH_SENSOR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetSensorsDoor
    lazy_static! {
        pub static ref GET_SENSORS_DOOR_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetSensorsHistory
    lazy_static! {
        pub static ref GET_SENSORS_HISTORY_LIST_OF_RESULTS_OBJECTS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetSensorsHistory
    lazy_static! {
        pub static ref GET_SENSORS_HISTORY_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetSensorsHumidity
    lazy_static! {
        pub static ref GET_SENSORS_HUMIDITY_LIST_OF_SENSOR_OBJECTS_CONTAINING_THE_CURRENT_HUMIDITY_REPORTED_BY_EACH_SENSOR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetSensorsHumidity
    lazy_static! {
        pub static ref GET_SENSORS_HUMIDITY_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetSensorsTemperature
    lazy_static! {
        pub static ref GET_SENSORS_TEMPERATURE_LIST_OF_SENSOR_OBJECTS_CONTAINING_THE_CURRENT_TEMPERATURE_REPORTED_BY_EACH_SENSOR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetSensorsTemperature
    lazy_static! {
        pub static ref GET_SENSORS_TEMPERATURE_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateTag
    lazy_static! {
        pub static ref CREATE_TAG_NEWLY_CREATED_TAG_OBJECT: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for CreateTag
    lazy_static! {
        pub static ref CREATE_TAG_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for DeleteTagById
    lazy_static! {
        pub static ref DELETE_TAG_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAllTags
    lazy_static! {
        pub static ref GET_ALL_TAGS_LIST_OF_TAGS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetAllTags
    lazy_static! {
        pub static ref GET_ALL_TAGS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetTagById
    lazy_static! {
        pub static ref GET_TAG_BY_ID_THE_TAG_CORRESPONDING_TO_TAG: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetTagById
    lazy_static! {
        pub static ref GET_TAG_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ModifyTagById
    lazy_static! {
        pub static ref MODIFY_TAG_BY_ID_THE_UPDATED_TAG_DATA: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ModifyTagById
    lazy_static! {
        pub static ref MODIFY_TAG_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for UpdateTagById
    lazy_static! {
        pub static ref UPDATE_TAG_BY_ID_THE_UPDATED_TAG_DATA: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for UpdateTagById
    lazy_static! {
        pub static ref UPDATE_TAG_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for DeleteUserById
    lazy_static! {
        pub static ref DELETE_USER_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetUserById
    lazy_static! {
        pub static ref GET_USER_BY_ID_USER_RECORD: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetUserById
    lazy_static! {
        pub static ref GET_USER_BY_ID_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ListUserRoles
    lazy_static! {
        pub static ref LIST_USER_ROLES_LIST_OF_USER_ROLES: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ListUserRoles
    lazy_static! {
        pub static ref LIST_USER_ROLES_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ListUsers
    lazy_static! {
        pub static ref LIST_USERS_LIST_OF_USERS: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ListUsers
    lazy_static! {
        pub static ref LIST_USERS_UNEXPECTED_ERROR: Mime = "application/json".parse().unwrap();
    }

}

pub mod requests {
    use hyper::mime::*;
   /// Create Mime objects for the request content types for CreateDriver
    lazy_static! {
        pub static ref CREATE_DRIVER: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for ReactivateDriverById
    lazy_static! {
        pub static ref REACTIVATE_DRIVER_BY_ID: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for AddFleetAddress
    lazy_static! {
        pub static ref ADD_FLEET_ADDRESS: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for AddOrganizationAddresses
    lazy_static! {
        pub static ref ADD_ORGANIZATION_ADDRESSES: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for CreateDispatchRoute
    lazy_static! {
        pub static ref CREATE_DISPATCH_ROUTE: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for CreateDriver
    lazy_static! {
        pub static ref CREATE_DRIVER: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for CreateDriverDispatchRoute
    lazy_static! {
        pub static ref CREATE_DRIVER_DISPATCH_ROUTE: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for CreateDriverDocument
    lazy_static! {
        pub static ref CREATE_DRIVER_DOCUMENT: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for CreateDvir
    lazy_static! {
        pub static ref CREATE_DVIR: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for CreateVehicleDispatchRoute
    lazy_static! {
        pub static ref CREATE_VEHICLE_DISPATCH_ROUTE: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetFleetDrivers
    lazy_static! {
        pub static ref GET_FLEET_DRIVERS: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetFleetDriversHosDailyLogs
    lazy_static! {
        pub static ref GET_FLEET_DRIVERS_HOS_DAILY_LOGS: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetFleetDriversSummary
    lazy_static! {
        pub static ref GET_FLEET_DRIVERS_SUMMARY: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetFleetHosAuthenticationLogs
    lazy_static! {
        pub static ref GET_FLEET_HOS_AUTHENTICATION_LOGS: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetFleetHosLogs
    lazy_static! {
        pub static ref GET_FLEET_HOS_LOGS: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetFleetHosLogsSummary
    lazy_static! {
        pub static ref GET_FLEET_HOS_LOGS_SUMMARY: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetFleetLocations
    lazy_static! {
        pub static ref GET_FLEET_LOCATIONS: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetFleetMaintenanceList
    lazy_static! {
        pub static ref GET_FLEET_MAINTENANCE_LIST: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetFleetTrips
    lazy_static! {
        pub static ref GET_FLEET_TRIPS: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for ListFleet
    lazy_static! {
        pub static ref LIST_FLEET: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for PatchFleetVehicle
    lazy_static! {
        pub static ref PATCH_FLEET_VEHICLE: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for ReactivateDriverById
    lazy_static! {
        pub static ref REACTIVATE_DRIVER_BY_ID: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for UpdateDispatchRouteById
    lazy_static! {
        pub static ref UPDATE_DISPATCH_ROUTE_BY_ID: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for UpdateOrganizationAddress
    lazy_static! {
        pub static ref UPDATE_ORGANIZATION_ADDRESS: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for UpdateVehicles
    lazy_static! {
        pub static ref UPDATE_VEHICLES: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetMachines
    lazy_static! {
        pub static ref GET_MACHINES: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetMachinesHistory
    lazy_static! {
        pub static ref GET_MACHINES_HISTORY: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for CreateDispatchRoute
    lazy_static! {
        pub static ref CREATE_DISPATCH_ROUTE: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for CreateDriverDispatchRoute
    lazy_static! {
        pub static ref CREATE_DRIVER_DISPATCH_ROUTE: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for CreateVehicleDispatchRoute
    lazy_static! {
        pub static ref CREATE_VEHICLE_DISPATCH_ROUTE: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for UpdateDispatchRouteById
    lazy_static! {
        pub static ref UPDATE_DISPATCH_ROUTE_BY_ID: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetSensors
    lazy_static! {
        pub static ref GET_SENSORS: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetSensorsCargo
    lazy_static! {
        pub static ref GET_SENSORS_CARGO: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetSensorsDoor
    lazy_static! {
        pub static ref GET_SENSORS_DOOR: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetSensorsHistory
    lazy_static! {
        pub static ref GET_SENSORS_HISTORY: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetSensorsHumidity
    lazy_static! {
        pub static ref GET_SENSORS_HUMIDITY: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for GetSensorsTemperature
    lazy_static! {
        pub static ref GET_SENSORS_TEMPERATURE: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for CreateTag
    lazy_static! {
        pub static ref CREATE_TAG: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for ModifyTagById
    lazy_static! {
        pub static ref MODIFY_TAG_BY_ID: Mime = "application/json".parse().unwrap();
    }
   /// Create Mime objects for the request content types for UpdateTagById
    lazy_static! {
        pub static ref UPDATE_TAG_BY_ID: Mime = "application/json".parse().unwrap();
    }

}
