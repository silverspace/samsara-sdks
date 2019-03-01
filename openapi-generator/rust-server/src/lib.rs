#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]
extern crate serde;
#[macro_use]
extern crate serde_derive;
extern crate serde_json;


extern crate futures;
extern crate chrono;
#[macro_use]
extern crate lazy_static;
#[macro_use]
extern crate log;

// Logically this should be in the client and server modules, but rust doesn't allow `macro_use` from a module.
#[cfg(any(feature = "client", feature = "server"))]
#[macro_use]
extern crate hyper;

extern crate swagger;

#[macro_use]
extern crate url;

use futures::Stream;
use std::io::Error;

#[allow(unused_imports)]
use std::collections::HashMap;

pub use futures::Future;

#[cfg(any(feature = "client", feature = "server"))]
mod mimetypes;

pub use swagger::{ApiError, ContextWrapper};

pub const BASE_PATH: &'static str = "/v1";
pub const API_VERSION: &'static str = "1.0.0";


#[derive(Debug, PartialEq)]
pub enum GetAllAssetCurrentLocationsResponse {
    /// List of assets and their current locations.
    ListOfAssetsAndTheirCurrentLocations ( models::InlineResponse2001 ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetAllAssetsResponse {
    /// List of assets.
    ListOfAssets ( models::InlineResponse200 ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetAssetLocationResponse {
    /// Asset location details.
    AssetLocationDetails ( Vec<object> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetAssetReeferResponse {
    /// Reefer-specific asset details.
    Reefer ( models::AssetReeferResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum CreateDriverResponse {
    /// Returns the successfully created the driver.
    ReturnsTheSuccessfullyCreatedTheDriver ( models::Driver ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum DeactivateDriverResponse {
    /// Successfully deactivated the driver, which is now referenced by /fleet/drivers/inactive/{driver_id}.
    SuccessfullyDeactivatedTheDriver ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetAllDeactivatedDriversResponse {
    /// Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}
    ReturnsAnArrayOfAllDeactivatedDriversForTheGroup ( Vec<models::Driver> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDeactivatedDriverByIdResponse {
    /// Returns the deactivated driver with the given driver_id.
    ReturnsTheDeactivatedDriverWithTheGivenDriver ( models::Driver ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDriverByIdResponse {
    /// Returns the driver for the given driver_id.
    ReturnsTheDriverForTheGivenDriver ( models::Driver ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum ReactivateDriverByIdResponse {
    /// Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.
    ReturnsTheReactivatedDriver ( models::Driver ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum AddFleetAddressResponse {
    /// Address was successfully added. No response body is returned.
    AddressWasSuccessfullyAdded ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum AddOrganizationAddressesResponse {
    /// List of added addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.
    ListOfAddedAddresses ( Vec<models::Address> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum CreateDispatchRouteResponse {
    /// Created route object including the new route ID.
    CreatedRouteObjectIncludingTheNewRouteID ( models::DispatchRoute ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum CreateDriverResponse {
    /// Returns the successfully created the driver.
    ReturnsTheSuccessfullyCreatedTheDriver ( models::Driver ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum CreateDriverDispatchRouteResponse {
    /// Created route object including the new route ID.
    CreatedRouteObjectIncludingTheNewRouteID ( models::DispatchRoute ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum CreateDriverDocumentResponse {
    /// Returns the created document.
    ReturnsTheCreatedDocument ( models::Document ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum CreateDvirResponse {
    /// Newly created DVIR.
    NewlyCreatedDVIR ( models::DvirBase ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum CreateVehicleDispatchRouteResponse {
    /// Created route object including the new route ID.
    CreatedRouteObjectIncludingTheNewRouteID ( models::DispatchRoute ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum DeactivateDriverResponse {
    /// Successfully deactivated the driver, which is now referenced by /fleet/drivers/inactive/{driver_id}.
    SuccessfullyDeactivatedTheDriver ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum DeleteDispatchRouteByIdResponse {
    /// Successfully deleted the dispatch route. No response body is returned.
    SuccessfullyDeletedTheDispatchRoute ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum DeleteOrganizationAddressResponse {
    /// Address was successfully deleted. No response body is returned.
    AddressWasSuccessfullyDeleted ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum FetchAllDispatchRoutesResponse {
    /// All dispatch route objects for the group.
    AllDispatchRouteObjectsForTheGroup ( Vec<models::DispatchRoute> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum FetchAllRouteJobUpdatesResponse {
    /// All job updates on routes.
    AllJobUpdatesOnRoutes ( models::AllRouteJobUpdates ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetAllAssetCurrentLocationsResponse {
    /// List of assets and their current locations.
    ListOfAssetsAndTheirCurrentLocations ( models::InlineResponse2001 ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetAllAssetsResponse {
    /// List of assets.
    ListOfAssets ( models::InlineResponse200 ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetAllDeactivatedDriversResponse {
    /// Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}
    ReturnsAnArrayOfAllDeactivatedDriversForTheGroup ( Vec<models::Driver> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetAssetLocationResponse {
    /// Asset location details.
    AssetLocationDetails ( Vec<object> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetAssetReeferResponse {
    /// Reefer-specific asset details.
    Reefer ( models::AssetReeferResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDeactivatedDriverByIdResponse {
    /// Returns the deactivated driver with the given driver_id.
    ReturnsTheDeactivatedDriverWithTheGivenDriver ( models::Driver ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDispatchRouteByIdResponse {
    /// The dispatch route corresponding to route_id.
    TheDispatchRouteCorrespondingToRoute ( models::DispatchRoute ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDispatchRouteHistoryResponse {
    /// The historical route state changes between start_time and end_time.
    TheHistoricalRouteStateChangesBetweenStart ( models::DispatchRouteHistory ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDispatchRoutesByDriverIdResponse {
    /// Returns the dispatch routes for the given driver_id.
    ReturnsTheDispatchRoutesForTheGivenDriver ( Vec<models::DispatchRoute> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDispatchRoutesByVehicleIdResponse {
    /// Returns all of the dispatch routes for the given vehicle_id.
    ReturnsAllOfTheDispatchRoutesForTheGivenVehicle ( Vec<models::DispatchRoute> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDriverByIdResponse {
    /// Returns the driver for the given driver_id.
    ReturnsTheDriverForTheGivenDriver ( models::Driver ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDriverDocumentTypesByOrgIdResponse {
    /// Returns all of the document types.
    ReturnsAllOfTheDocumentTypes ( Vec<models::DocumentType> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDriverDocumentsByOrgIdResponse {
    /// Returns all of the documents.
    ReturnsAllOfTheDocuments ( Vec<models::Document> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDriverSafetyScoreResponse {
    /// Safety score details.
    SafetyScoreDetails ( models::DriverSafetyScoreResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDvirsResponse {
    /// DVIRs for the specified duration.
    DVIRsForTheSpecifiedDuration ( models::DvirListResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetFleetDriversResponse {
    /// All drivers in the group.
    AllDriversInTheGroup ( models::DriversResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetFleetDriversHosDailyLogsResponse {
    /// Distance traveled and time active for each driver in the organization over the specified time period.
    DistanceTraveledAndTimeActiveForEachDriverInTheOrganizationOverTheSpecifiedTimePeriod ( models::DriverDailyLogResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetFleetDriversSummaryResponse {
    /// Distance traveled and time active for each driver in the organization over the specified time period.
    DistanceTraveledAndTimeActiveForEachDriverInTheOrganizationOverTheSpecifiedTimePeriod ( models::DriversSummaryResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetFleetHosAuthenticationLogsResponse {
    /// HOS authentication logs for the specified driver.
    HOSAuthenticationLogsForTheSpecifiedDriver ( models::HosAuthenticationLogsResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetFleetHosLogsResponse {
    /// HOS logs for the specified driver.
    HOSLogsForTheSpecifiedDriver ( models::HosLogsResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetFleetHosLogsSummaryResponse {
    /// HOS logs for the specified driver.
    HOSLogsForTheSpecifiedDriver ( models::HosLogsSummaryResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetFleetLocationsResponse {
    /// List of vehicle objects containing their location and the time at which that location was logged.
    ListOfVehicleObjectsContainingTheirLocationAndTheTimeAtWhichThatLocationWasLogged ( models::InlineResponse2003 ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetFleetMaintenanceListResponse {
    /// List of vehicles and maintenance information about each.
    ListOfVehiclesAndMaintenanceInformationAboutEach ( models::InlineResponse2004 ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetFleetTripsResponse {
    /// List of trips taken by the requested vehicle within the specified timeframe.
    ListOfTripsTakenByTheRequestedVehicleWithinTheSpecifiedTimeframe ( models::TripResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetFleetVehicleResponse {
    /// The specified vehicle.
    TheSpecifiedVehicle ( models::FleetVehicleResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetOrganizationAddressResponse {
    /// The address/geofence. The geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.
    TheAddress ( models::Address ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetOrganizationAddressesResponse {
    /// List of addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.
    ListOfAddresses ( Vec<models::Address> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetOrganizationContactResponse {
    /// The contact.
    TheContact ( models::Contact ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetVehicleHarshEventResponse {
    /// Harsh event details.
    HarshEventDetails ( models::VehicleHarshEventResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetVehicleLocationsResponse {
    /// Returns locations for a given vehicle between a start/end time, with a maximum query duration of one hour.
    ReturnsLocationsForAGivenVehicleBetweenAStart ( Vec<models::FleetVehicleLocation> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetVehicleSafetyScoreResponse {
    /// Safety score details.
    SafetyScoreDetails ( models::VehicleSafetyScoreResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetVehicleStatsResponse {
    /// Returns engine state and/or aux input data for all vehicles in the group between a start/end time.
    ReturnsEngineStateAnd ( models::InlineResponse2005 ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetVehiclesLocationsResponse {
    /// Returns locations for a given vehicle between a start/end time, with a maximum query duration of 30 minutes.
    ReturnsLocationsForAGivenVehicleBetweenAStart ( Vec<object> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum ListContactsResponse {
    /// List of contacts.
    ListOfContacts ( Vec<models::Contact> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum ListFleetResponse {
    /// List of vehicles and information about each.
    ListOfVehiclesAndInformationAboutEach ( models::InlineResponse2002 ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum PatchFleetVehicleResponse {
    /// The updated vehicle.
    TheUpdatedVehicle ( models::FleetVehicleResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum ReactivateDriverByIdResponse {
    /// Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.
    ReturnsTheReactivatedDriver ( models::Driver ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum UpdateDispatchRouteByIdResponse {
    /// Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.
    UpdateTheDispatchRoute ( models::DispatchRoute ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum UpdateOrganizationAddressResponse {
    /// Address was successfully updated. No response body is returned.
    AddressWasSuccessfullyUpdated ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum UpdateVehiclesResponse {
    /// Vehicles were successfully updated. No response body is returned.
    VehiclesWereSuccessfullyUpdated ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetAllDataInputsResponse {
    /// List of data inputs.
    ListOfDataInputs ( models::InlineResponse2006 ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDataInputResponse {
    /// Returns datapoints for the given data input
    ReturnsDatapointsForTheGivenDataInput ( models::DataInputHistoryResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetMachinesResponse {
    /// List of machine objects.
    ListOfMachineObjects ( models::InlineResponse2007 ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetMachinesHistoryResponse {
    /// List of machine results objects, each containing a time and a datapoint.
    ListOfMachineResultsObjects ( models::MachineHistoryResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum CreateDispatchRouteResponse {
    /// Created route object including the new route ID.
    CreatedRouteObjectIncludingTheNewRouteID ( models::DispatchRoute ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum CreateDriverDispatchRouteResponse {
    /// Created route object including the new route ID.
    CreatedRouteObjectIncludingTheNewRouteID ( models::DispatchRoute ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum CreateVehicleDispatchRouteResponse {
    /// Created route object including the new route ID.
    CreatedRouteObjectIncludingTheNewRouteID ( models::DispatchRoute ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum DeleteDispatchRouteByIdResponse {
    /// Successfully deleted the dispatch route. No response body is returned.
    SuccessfullyDeletedTheDispatchRoute ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum FetchAllDispatchRoutesResponse {
    /// All dispatch route objects for the group.
    AllDispatchRouteObjectsForTheGroup ( Vec<models::DispatchRoute> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum FetchAllRouteJobUpdatesResponse {
    /// All job updates on routes.
    AllJobUpdatesOnRoutes ( models::AllRouteJobUpdates ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDispatchRouteByIdResponse {
    /// The dispatch route corresponding to route_id.
    TheDispatchRouteCorrespondingToRoute ( models::DispatchRoute ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDispatchRouteHistoryResponse {
    /// The historical route state changes between start_time and end_time.
    TheHistoricalRouteStateChangesBetweenStart ( models::DispatchRouteHistory ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDispatchRoutesByDriverIdResponse {
    /// Returns the dispatch routes for the given driver_id.
    ReturnsTheDispatchRoutesForTheGivenDriver ( Vec<models::DispatchRoute> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDispatchRoutesByVehicleIdResponse {
    /// Returns all of the dispatch routes for the given vehicle_id.
    ReturnsAllOfTheDispatchRoutesForTheGivenVehicle ( Vec<models::DispatchRoute> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum UpdateDispatchRouteByIdResponse {
    /// Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.
    UpdateTheDispatchRoute ( models::DispatchRoute ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetDriverSafetyScoreResponse {
    /// Safety score details.
    SafetyScoreDetails ( models::DriverSafetyScoreResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetVehicleHarshEventResponse {
    /// Harsh event details.
    HarshEventDetails ( models::VehicleHarshEventResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetVehicleSafetyScoreResponse {
    /// Safety score details.
    SafetyScoreDetails ( models::VehicleSafetyScoreResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetSensorsResponse {
    /// List of sensor objects.
    ListOfSensorObjects ( models::InlineResponse2008 ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetSensorsCargoResponse {
    /// List of sensor objects containing the current cargo status reported by each sensor.
    ListOfSensorObjectsContainingTheCurrentCargoStatusReportedByEachSensor ( models::CargoResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetSensorsDoorResponse {
    /// List of sensor objects containing the current door status reported by each sensor.
    ListOfSensorObjectsContainingTheCurrentDoorStatusReportedByEachSensor ( models::DoorResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetSensorsHistoryResponse {
    /// List of results objects, each containing a time and a datapoint for each requested sensor/field pair.
    ListOfResultsObjects ( models::SensorHistoryResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetSensorsHumidityResponse {
    /// List of sensor objects containing the current humidity reported by each sensor.
    ListOfSensorObjectsContainingTheCurrentHumidityReportedByEachSensor ( models::HumidityResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetSensorsTemperatureResponse {
    /// List of sensor objects containing the current temperature reported by each sensor.
    ListOfSensorObjectsContainingTheCurrentTemperatureReportedByEachSensor ( models::TemperatureResponse ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum CreateTagResponse {
    /// Newly created tag object, including the new tag ID.
    NewlyCreatedTagObject ( models::Tag ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum DeleteTagByIdResponse {
    /// Successfully deleted the tag. No response body is returned.
    SuccessfullyDeletedTheTag ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetAllTagsResponse {
    /// List of tags.
    ListOfTags ( models::InlineResponse2009 ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetTagByIdResponse {
    /// The tag corresponding to tag_id.
    TheTagCorrespondingToTag ( models::Tag ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum ModifyTagByIdResponse {
    /// The updated tag data.
    TheUpdatedTagData ( models::Tag ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum UpdateTagByIdResponse {
    /// The updated tag data.
    TheUpdatedTagData ( models::Tag ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum DeleteUserByIdResponse {
    /// The user was successfully removed.
    TheUserWasSuccessfullyRemoved ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetUserByIdResponse {
    /// User record.
    UserRecord ( models::User ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum ListUserRolesResponse {
    /// List of user roles.
    ListOfUserRoles ( Vec<models::UserRole> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}

#[derive(Debug, PartialEq)]
pub enum ListUsersResponse {
    /// List of users.
    ListOfUsers ( Vec<models::User> ) ,
    /// Unexpected error.
    UnexpectedError ( String ) ,
}


/// API
pub trait Api<C> {

    /// /fleet/assets/locations
    fn get_all_asset_current_locations(&self, access_token: String, group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllAssetCurrentLocationsResponse, Error=ApiError>>;

    /// /fleet/assets
    fn get_all_assets(&self, access_token: String, group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllAssetsResponse, Error=ApiError>>;

    /// /fleet/assets/{assetId:[0-9]+}/locations
    fn get_asset_location(&self, access_token: String, asset_id: i64, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetAssetLocationResponse, Error=ApiError>>;

    /// /fleet/assets/{assetId:[0-9]+}/reefer
    fn get_asset_reefer(&self, access_token: String, asset_id: i64, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetAssetReeferResponse, Error=ApiError>>;

    /// /fleet/drivers/create
    fn create_driver(&self, access_token: String, create_driver_param: models::DriverForCreate, context: &C) -> Box<Future<Item=CreateDriverResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn deactivate_driver(&self, access_token: String, driver_id_or_external_id: String, context: &C) -> Box<Future<Item=DeactivateDriverResponse, Error=ApiError>>;

    /// /fleet/drivers/inactive
    fn get_all_deactivated_drivers(&self, access_token: String, group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllDeactivatedDriversResponse, Error=ApiError>>;

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_deactivated_driver_by_id(&self, access_token: String, driver_id_or_external_id: String, context: &C) -> Box<Future<Item=GetDeactivatedDriverByIdResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_driver_by_id(&self, access_token: String, driver_id_or_external_id: String, context: &C) -> Box<Future<Item=GetDriverByIdResponse, Error=ApiError>>;

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn reactivate_driver_by_id(&self, access_token: String, driver_id_or_external_id: String, reactivate_driver_param: models::InlineObject4, context: &C) -> Box<Future<Item=ReactivateDriverByIdResponse, Error=ApiError>>;

    /// /fleet/add_address
    fn add_fleet_address(&self, access_token: String, address_param: models::InlineObject2, context: &C) -> Box<Future<Item=AddFleetAddressResponse, Error=ApiError>>;

    /// /addresses
    fn add_organization_addresses(&self, access_token: String, addresses: models::InlineObject, context: &C) -> Box<Future<Item=AddOrganizationAddressesResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes
    fn create_dispatch_route(&self, access_token: String, create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateDispatchRouteResponse, Error=ApiError>>;

    /// /fleet/drivers/create
    fn create_driver(&self, access_token: String, create_driver_param: models::DriverForCreate, context: &C) -> Box<Future<Item=CreateDriverResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    fn create_driver_dispatch_route(&self, access_token: String, driver_id: i64, create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateDriverDispatchRouteResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+}/documents
    fn create_driver_document(&self, access_token: String, driver_id: i64, create_document_params: models::DocumentCreate, context: &C) -> Box<Future<Item=CreateDriverDocumentResponse, Error=ApiError>>;

    /// /fleet/maintenance/dvirs
    fn create_dvir(&self, access_token: String, create_dvir_param: models::InlineObject12, context: &C) -> Box<Future<Item=CreateDvirResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    fn create_vehicle_dispatch_route(&self, access_token: String, vehicle_id: i64, create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateVehicleDispatchRouteResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn deactivate_driver(&self, access_token: String, driver_id_or_external_id: String, context: &C) -> Box<Future<Item=DeactivateDriverResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    fn delete_dispatch_route_by_id(&self, access_token: String, route_id: i64, context: &C) -> Box<Future<Item=DeleteDispatchRouteByIdResponse, Error=ApiError>>;

    /// /addresses/{addressId}
    fn delete_organization_address(&self, access_token: String, address_id: i64, context: &C) -> Box<Future<Item=DeleteOrganizationAddressResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes
    fn fetch_all_dispatch_routes(&self, access_token: String, group_id: Option<i64>, end_time: Option<i64>, duration: Option<i64>, context: &C) -> Box<Future<Item=FetchAllDispatchRoutesResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/job_updates
    fn fetch_all_route_job_updates(&self, access_token: String, group_id: Option<i64>, sequence_id: Option<String>, include: Option<String>, context: &C) -> Box<Future<Item=FetchAllRouteJobUpdatesResponse, Error=ApiError>>;

    /// /fleet/assets/locations
    fn get_all_asset_current_locations(&self, access_token: String, group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllAssetCurrentLocationsResponse, Error=ApiError>>;

    /// /fleet/assets
    fn get_all_assets(&self, access_token: String, group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllAssetsResponse, Error=ApiError>>;

    /// /fleet/drivers/inactive
    fn get_all_deactivated_drivers(&self, access_token: String, group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllDeactivatedDriversResponse, Error=ApiError>>;

    /// /fleet/assets/{assetId:[0-9]+}/locations
    fn get_asset_location(&self, access_token: String, asset_id: i64, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetAssetLocationResponse, Error=ApiError>>;

    /// /fleet/assets/{assetId:[0-9]+}/reefer
    fn get_asset_reefer(&self, access_token: String, asset_id: i64, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetAssetReeferResponse, Error=ApiError>>;

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_deactivated_driver_by_id(&self, access_token: String, driver_id_or_external_id: String, context: &C) -> Box<Future<Item=GetDeactivatedDriverByIdResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/{route_id:[0-9]+}
    fn get_dispatch_route_by_id(&self, access_token: String, route_id: i64, context: &C) -> Box<Future<Item=GetDispatchRouteByIdResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
    fn get_dispatch_route_history(&self, access_token: String, route_id: i64, start_time: Option<i64>, end_time: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRouteHistoryResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    fn get_dispatch_routes_by_driver_id(&self, access_token: String, driver_id: i64, end_time: Option<i64>, duration: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRoutesByDriverIdResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    fn get_dispatch_routes_by_vehicle_id(&self, access_token: String, vehicle_id: i64, end_time: Option<i64>, duration: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRoutesByVehicleIdResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_driver_by_id(&self, access_token: String, driver_id_or_external_id: String, context: &C) -> Box<Future<Item=GetDriverByIdResponse, Error=ApiError>>;

    /// /fleet/drivers/document_types
    fn get_driver_document_types_by_org_id(&self, context: &C) -> Box<Future<Item=GetDriverDocumentTypesByOrgIdResponse, Error=ApiError>>;

    /// /fleet/drivers/documents
    fn get_driver_documents_by_org_id(&self, access_token: String, end_ms: Option<i64>, duration_ms: Option<i64>, context: &C) -> Box<Future<Item=GetDriverDocumentsByOrgIdResponse, Error=ApiError>>;

    /// /fleet/drivers/{driverId:[0-9]+}/safety/score
    fn get_driver_safety_score(&self, driver_id: i64, access_token: String, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetDriverSafetyScoreResponse, Error=ApiError>>;

    /// /fleet/maintenance/dvirs
    fn get_dvirs(&self, access_token: String, end_ms: i32, duration_ms: i32, group_id: Option<i32>, context: &C) -> Box<Future<Item=GetDvirsResponse, Error=ApiError>>;

    /// /fleet/drivers
    fn get_fleet_drivers(&self, access_token: String, group_drivers_param: models::InlineObject3, context: &C) -> Box<Future<Item=GetFleetDriversResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
    fn get_fleet_drivers_hos_daily_logs(&self, access_token: String, driver_id: i64, hos_logs_param: models::InlineObject6, context: &C) -> Box<Future<Item=GetFleetDriversHosDailyLogsResponse, Error=ApiError>>;

    /// /fleet/drivers/summary
    fn get_fleet_drivers_summary(&self, access_token: String, drivers_summary_param: models::InlineObject5, snap_to_day_bounds: Option<bool>, context: &C) -> Box<Future<Item=GetFleetDriversSummaryResponse, Error=ApiError>>;

    /// /fleet/hos_authentication_logs
    fn get_fleet_hos_authentication_logs(&self, access_token: String, hos_authentication_logs_param: models::InlineObject7, context: &C) -> Box<Future<Item=GetFleetHosAuthenticationLogsResponse, Error=ApiError>>;

    /// /fleet/hos_logs
    fn get_fleet_hos_logs(&self, access_token: String, hos_logs_param: models::InlineObject8, context: &C) -> Box<Future<Item=GetFleetHosLogsResponse, Error=ApiError>>;

    /// /fleet/hos_logs_summary
    fn get_fleet_hos_logs_summary(&self, access_token: String, hos_logs_param: models::InlineObject9, context: &C) -> Box<Future<Item=GetFleetHosLogsSummaryResponse, Error=ApiError>>;

    /// /fleet/locations
    fn get_fleet_locations(&self, access_token: String, group_param: models::InlineObject11, context: &C) -> Box<Future<Item=GetFleetLocationsResponse, Error=ApiError>>;

    /// /fleet/maintenance/list
    fn get_fleet_maintenance_list(&self, access_token: String, group_param: models::InlineObject13, context: &C) -> Box<Future<Item=GetFleetMaintenanceListResponse, Error=ApiError>>;

    /// /fleet/trips
    fn get_fleet_trips(&self, access_token: String, trips_param: models::InlineObject15, context: &C) -> Box<Future<Item=GetFleetTripsResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_fleet_vehicle(&self, access_token: String, vehicle_id_or_external_id: String, context: &C) -> Box<Future<Item=GetFleetVehicleResponse, Error=ApiError>>;

    /// /addresses/{addressId}
    fn get_organization_address(&self, access_token: String, address_id: i64, context: &C) -> Box<Future<Item=GetOrganizationAddressResponse, Error=ApiError>>;

    /// /addresses
    fn get_organization_addresses(&self, access_token: String, context: &C) -> Box<Future<Item=GetOrganizationAddressesResponse, Error=ApiError>>;

    /// /contacts/{contact_id}
    fn get_organization_contact(&self, access_token: String, contact_id: i64, context: &C) -> Box<Future<Item=GetOrganizationContactResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    fn get_vehicle_harsh_event(&self, vehicle_id: i64, access_token: String, timestamp: i64, context: &C) -> Box<Future<Item=GetVehicleHarshEventResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
    fn get_vehicle_locations(&self, access_token: String, vehicle_id: i64, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetVehicleLocationsResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    fn get_vehicle_safety_score(&self, vehicle_id: i64, access_token: String, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetVehicleSafetyScoreResponse, Error=ApiError>>;

    /// /fleet/vehicles/stats
    fn get_vehicle_stats(&self, access_token: String, start_ms: i32, end_ms: i32, series: Option<String>, tag_ids: Option<String>, starting_after: Option<String>, ending_before: Option<String>, limit: Option<i64>, context: &C) -> Box<Future<Item=GetVehicleStatsResponse, Error=ApiError>>;

    /// /fleet/vehicles/locations
    fn get_vehicles_locations(&self, access_token: String, start_ms: i32, end_ms: i32, context: &C) -> Box<Future<Item=GetVehiclesLocationsResponse, Error=ApiError>>;

    /// /contacts
    fn list_contacts(&self, access_token: String, context: &C) -> Box<Future<Item=ListContactsResponse, Error=ApiError>>;

    /// /fleet/list
    fn list_fleet(&self, access_token: String, group_param: models::InlineObject10, starting_after: Option<String>, ending_before: Option<String>, limit: Option<i64>, context: &C) -> Box<Future<Item=ListFleetResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn patch_fleet_vehicle(&self, access_token: String, vehicle_id_or_external_id: String, data: models::InlineObject16, context: &C) -> Box<Future<Item=PatchFleetVehicleResponse, Error=ApiError>>;

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn reactivate_driver_by_id(&self, access_token: String, driver_id_or_external_id: String, reactivate_driver_param: models::InlineObject4, context: &C) -> Box<Future<Item=ReactivateDriverByIdResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    fn update_dispatch_route_by_id(&self, access_token: String, route_id: i64, update_dispatch_route_params: models::DispatchRoute, context: &C) -> Box<Future<Item=UpdateDispatchRouteByIdResponse, Error=ApiError>>;

    /// /addresses/{addressId}
    fn update_organization_address(&self, access_token: String, address_id: i64, address: models::InlineObject1, context: &C) -> Box<Future<Item=UpdateOrganizationAddressResponse, Error=ApiError>>;

    /// /fleet/set_data
    fn update_vehicles(&self, access_token: String, vehicle_update_param: models::InlineObject14, context: &C) -> Box<Future<Item=UpdateVehiclesResponse, Error=ApiError>>;

    /// /industrial/data
    fn get_all_data_inputs(&self, access_token: String, group_id: Option<i64>, start_ms: Option<i64>, end_ms: Option<i64>, context: &C) -> Box<Future<Item=GetAllDataInputsResponse, Error=ApiError>>;

    /// /industrial/data/{data_input_id:[0-9]+}
    fn get_data_input(&self, access_token: String, data_input_id: i64, start_ms: Option<i64>, end_ms: Option<i64>, context: &C) -> Box<Future<Item=GetDataInputResponse, Error=ApiError>>;

    /// /machines/list
    fn get_machines(&self, access_token: String, group_param: models::InlineObject18, context: &C) -> Box<Future<Item=GetMachinesResponse, Error=ApiError>>;

    /// /machines/history
    fn get_machines_history(&self, access_token: String, history_param: models::InlineObject17, context: &C) -> Box<Future<Item=GetMachinesHistoryResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes
    fn create_dispatch_route(&self, access_token: String, create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateDispatchRouteResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    fn create_driver_dispatch_route(&self, access_token: String, driver_id: i64, create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateDriverDispatchRouteResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    fn create_vehicle_dispatch_route(&self, access_token: String, vehicle_id: i64, create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateVehicleDispatchRouteResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    fn delete_dispatch_route_by_id(&self, access_token: String, route_id: i64, context: &C) -> Box<Future<Item=DeleteDispatchRouteByIdResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes
    fn fetch_all_dispatch_routes(&self, access_token: String, group_id: Option<i64>, end_time: Option<i64>, duration: Option<i64>, context: &C) -> Box<Future<Item=FetchAllDispatchRoutesResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/job_updates
    fn fetch_all_route_job_updates(&self, access_token: String, group_id: Option<i64>, sequence_id: Option<String>, include: Option<String>, context: &C) -> Box<Future<Item=FetchAllRouteJobUpdatesResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/{route_id:[0-9]+}
    fn get_dispatch_route_by_id(&self, access_token: String, route_id: i64, context: &C) -> Box<Future<Item=GetDispatchRouteByIdResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
    fn get_dispatch_route_history(&self, access_token: String, route_id: i64, start_time: Option<i64>, end_time: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRouteHistoryResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    fn get_dispatch_routes_by_driver_id(&self, access_token: String, driver_id: i64, end_time: Option<i64>, duration: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRoutesByDriverIdResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    fn get_dispatch_routes_by_vehicle_id(&self, access_token: String, vehicle_id: i64, end_time: Option<i64>, duration: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRoutesByVehicleIdResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    fn update_dispatch_route_by_id(&self, access_token: String, route_id: i64, update_dispatch_route_params: models::DispatchRoute, context: &C) -> Box<Future<Item=UpdateDispatchRouteByIdResponse, Error=ApiError>>;

    /// /fleet/drivers/{driverId:[0-9]+}/safety/score
    fn get_driver_safety_score(&self, driver_id: i64, access_token: String, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetDriverSafetyScoreResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    fn get_vehicle_harsh_event(&self, vehicle_id: i64, access_token: String, timestamp: i64, context: &C) -> Box<Future<Item=GetVehicleHarshEventResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    fn get_vehicle_safety_score(&self, vehicle_id: i64, access_token: String, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetVehicleSafetyScoreResponse, Error=ApiError>>;

    /// /sensors/list
    fn get_sensors(&self, access_token: String, group_param: models::InlineObject23, context: &C) -> Box<Future<Item=GetSensorsResponse, Error=ApiError>>;

    /// /sensors/cargo
    fn get_sensors_cargo(&self, access_token: String, sensor_param: models::InlineObject19, context: &C) -> Box<Future<Item=GetSensorsCargoResponse, Error=ApiError>>;

    /// /sensors/door
    fn get_sensors_door(&self, access_token: String, sensor_param: models::InlineObject20, context: &C) -> Box<Future<Item=GetSensorsDoorResponse, Error=ApiError>>;

    /// /sensors/history
    fn get_sensors_history(&self, access_token: String, history_param: models::InlineObject21, context: &C) -> Box<Future<Item=GetSensorsHistoryResponse, Error=ApiError>>;

    /// /sensors/humidity
    fn get_sensors_humidity(&self, access_token: String, sensor_param: models::InlineObject22, context: &C) -> Box<Future<Item=GetSensorsHumidityResponse, Error=ApiError>>;

    /// /sensors/temperature
    fn get_sensors_temperature(&self, access_token: String, sensor_param: models::InlineObject24, context: &C) -> Box<Future<Item=GetSensorsTemperatureResponse, Error=ApiError>>;

    /// /tags
    fn create_tag(&self, access_token: String, tag_create_params: models::TagCreate, context: &C) -> Box<Future<Item=CreateTagResponse, Error=ApiError>>;

    /// /tags/{tag_id:[0-9]+}
    fn delete_tag_by_id(&self, access_token: String, tag_id: i64, context: &C) -> Box<Future<Item=DeleteTagByIdResponse, Error=ApiError>>;

    /// /tags
    fn get_all_tags(&self, access_token: String, group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllTagsResponse, Error=ApiError>>;

    /// /tags/{tag_id:[0-9]+}
    fn get_tag_by_id(&self, access_token: String, tag_id: i64, context: &C) -> Box<Future<Item=GetTagByIdResponse, Error=ApiError>>;

    /// /tags/{tag_id:[0-9]+}
    fn modify_tag_by_id(&self, access_token: String, tag_id: i64, tag_modify_params: models::TagModify, context: &C) -> Box<Future<Item=ModifyTagByIdResponse, Error=ApiError>>;

    /// /tags/{tag_id:[0-9]+}
    fn update_tag_by_id(&self, access_token: String, tag_id: i64, update_tag_params: models::TagUpdate, context: &C) -> Box<Future<Item=UpdateTagByIdResponse, Error=ApiError>>;

    /// /users/{userId:[0-9]+}
    fn delete_user_by_id(&self, access_token: String, user_id: i64, context: &C) -> Box<Future<Item=DeleteUserByIdResponse, Error=ApiError>>;

    /// /users/{userId:[0-9]+}
    fn get_user_by_id(&self, access_token: String, user_id: i64, context: &C) -> Box<Future<Item=GetUserByIdResponse, Error=ApiError>>;

    /// /user_roles
    fn list_user_roles(&self, access_token: String, context: &C) -> Box<Future<Item=ListUserRolesResponse, Error=ApiError>>;

    /// /users
    fn list_users(&self, access_token: String, context: &C) -> Box<Future<Item=ListUsersResponse, Error=ApiError>>;

}

/// API without a `Context`
pub trait ApiNoContext {

    /// /fleet/assets/locations
    fn get_all_asset_current_locations(&self, access_token: String, group_id: Option<i64>) -> Box<Future<Item=GetAllAssetCurrentLocationsResponse, Error=ApiError>>;

    /// /fleet/assets
    fn get_all_assets(&self, access_token: String, group_id: Option<i64>) -> Box<Future<Item=GetAllAssetsResponse, Error=ApiError>>;

    /// /fleet/assets/{assetId:[0-9]+}/locations
    fn get_asset_location(&self, access_token: String, asset_id: i64, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetAssetLocationResponse, Error=ApiError>>;

    /// /fleet/assets/{assetId:[0-9]+}/reefer
    fn get_asset_reefer(&self, access_token: String, asset_id: i64, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetAssetReeferResponse, Error=ApiError>>;

    /// /fleet/drivers/create
    fn create_driver(&self, access_token: String, create_driver_param: models::DriverForCreate) -> Box<Future<Item=CreateDriverResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn deactivate_driver(&self, access_token: String, driver_id_or_external_id: String) -> Box<Future<Item=DeactivateDriverResponse, Error=ApiError>>;

    /// /fleet/drivers/inactive
    fn get_all_deactivated_drivers(&self, access_token: String, group_id: Option<i64>) -> Box<Future<Item=GetAllDeactivatedDriversResponse, Error=ApiError>>;

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_deactivated_driver_by_id(&self, access_token: String, driver_id_or_external_id: String) -> Box<Future<Item=GetDeactivatedDriverByIdResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_driver_by_id(&self, access_token: String, driver_id_or_external_id: String) -> Box<Future<Item=GetDriverByIdResponse, Error=ApiError>>;

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn reactivate_driver_by_id(&self, access_token: String, driver_id_or_external_id: String, reactivate_driver_param: models::InlineObject4) -> Box<Future<Item=ReactivateDriverByIdResponse, Error=ApiError>>;

    /// /fleet/add_address
    fn add_fleet_address(&self, access_token: String, address_param: models::InlineObject2) -> Box<Future<Item=AddFleetAddressResponse, Error=ApiError>>;

    /// /addresses
    fn add_organization_addresses(&self, access_token: String, addresses: models::InlineObject) -> Box<Future<Item=AddOrganizationAddressesResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes
    fn create_dispatch_route(&self, access_token: String, create_dispatch_route_params: models::DispatchRouteCreate) -> Box<Future<Item=CreateDispatchRouteResponse, Error=ApiError>>;

    /// /fleet/drivers/create
    fn create_driver(&self, access_token: String, create_driver_param: models::DriverForCreate) -> Box<Future<Item=CreateDriverResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    fn create_driver_dispatch_route(&self, access_token: String, driver_id: i64, create_dispatch_route_params: models::DispatchRouteCreate) -> Box<Future<Item=CreateDriverDispatchRouteResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+}/documents
    fn create_driver_document(&self, access_token: String, driver_id: i64, create_document_params: models::DocumentCreate) -> Box<Future<Item=CreateDriverDocumentResponse, Error=ApiError>>;

    /// /fleet/maintenance/dvirs
    fn create_dvir(&self, access_token: String, create_dvir_param: models::InlineObject12) -> Box<Future<Item=CreateDvirResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    fn create_vehicle_dispatch_route(&self, access_token: String, vehicle_id: i64, create_dispatch_route_params: models::DispatchRouteCreate) -> Box<Future<Item=CreateVehicleDispatchRouteResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn deactivate_driver(&self, access_token: String, driver_id_or_external_id: String) -> Box<Future<Item=DeactivateDriverResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    fn delete_dispatch_route_by_id(&self, access_token: String, route_id: i64) -> Box<Future<Item=DeleteDispatchRouteByIdResponse, Error=ApiError>>;

    /// /addresses/{addressId}
    fn delete_organization_address(&self, access_token: String, address_id: i64) -> Box<Future<Item=DeleteOrganizationAddressResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes
    fn fetch_all_dispatch_routes(&self, access_token: String, group_id: Option<i64>, end_time: Option<i64>, duration: Option<i64>) -> Box<Future<Item=FetchAllDispatchRoutesResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/job_updates
    fn fetch_all_route_job_updates(&self, access_token: String, group_id: Option<i64>, sequence_id: Option<String>, include: Option<String>) -> Box<Future<Item=FetchAllRouteJobUpdatesResponse, Error=ApiError>>;

    /// /fleet/assets/locations
    fn get_all_asset_current_locations(&self, access_token: String, group_id: Option<i64>) -> Box<Future<Item=GetAllAssetCurrentLocationsResponse, Error=ApiError>>;

    /// /fleet/assets
    fn get_all_assets(&self, access_token: String, group_id: Option<i64>) -> Box<Future<Item=GetAllAssetsResponse, Error=ApiError>>;

    /// /fleet/drivers/inactive
    fn get_all_deactivated_drivers(&self, access_token: String, group_id: Option<i64>) -> Box<Future<Item=GetAllDeactivatedDriversResponse, Error=ApiError>>;

    /// /fleet/assets/{assetId:[0-9]+}/locations
    fn get_asset_location(&self, access_token: String, asset_id: i64, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetAssetLocationResponse, Error=ApiError>>;

    /// /fleet/assets/{assetId:[0-9]+}/reefer
    fn get_asset_reefer(&self, access_token: String, asset_id: i64, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetAssetReeferResponse, Error=ApiError>>;

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_deactivated_driver_by_id(&self, access_token: String, driver_id_or_external_id: String) -> Box<Future<Item=GetDeactivatedDriverByIdResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/{route_id:[0-9]+}
    fn get_dispatch_route_by_id(&self, access_token: String, route_id: i64) -> Box<Future<Item=GetDispatchRouteByIdResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
    fn get_dispatch_route_history(&self, access_token: String, route_id: i64, start_time: Option<i64>, end_time: Option<i64>) -> Box<Future<Item=GetDispatchRouteHistoryResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    fn get_dispatch_routes_by_driver_id(&self, access_token: String, driver_id: i64, end_time: Option<i64>, duration: Option<i64>) -> Box<Future<Item=GetDispatchRoutesByDriverIdResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    fn get_dispatch_routes_by_vehicle_id(&self, access_token: String, vehicle_id: i64, end_time: Option<i64>, duration: Option<i64>) -> Box<Future<Item=GetDispatchRoutesByVehicleIdResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_driver_by_id(&self, access_token: String, driver_id_or_external_id: String) -> Box<Future<Item=GetDriverByIdResponse, Error=ApiError>>;

    /// /fleet/drivers/document_types
    fn get_driver_document_types_by_org_id(&self) -> Box<Future<Item=GetDriverDocumentTypesByOrgIdResponse, Error=ApiError>>;

    /// /fleet/drivers/documents
    fn get_driver_documents_by_org_id(&self, access_token: String, end_ms: Option<i64>, duration_ms: Option<i64>) -> Box<Future<Item=GetDriverDocumentsByOrgIdResponse, Error=ApiError>>;

    /// /fleet/drivers/{driverId:[0-9]+}/safety/score
    fn get_driver_safety_score(&self, driver_id: i64, access_token: String, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetDriverSafetyScoreResponse, Error=ApiError>>;

    /// /fleet/maintenance/dvirs
    fn get_dvirs(&self, access_token: String, end_ms: i32, duration_ms: i32, group_id: Option<i32>) -> Box<Future<Item=GetDvirsResponse, Error=ApiError>>;

    /// /fleet/drivers
    fn get_fleet_drivers(&self, access_token: String, group_drivers_param: models::InlineObject3) -> Box<Future<Item=GetFleetDriversResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
    fn get_fleet_drivers_hos_daily_logs(&self, access_token: String, driver_id: i64, hos_logs_param: models::InlineObject6) -> Box<Future<Item=GetFleetDriversHosDailyLogsResponse, Error=ApiError>>;

    /// /fleet/drivers/summary
    fn get_fleet_drivers_summary(&self, access_token: String, drivers_summary_param: models::InlineObject5, snap_to_day_bounds: Option<bool>) -> Box<Future<Item=GetFleetDriversSummaryResponse, Error=ApiError>>;

    /// /fleet/hos_authentication_logs
    fn get_fleet_hos_authentication_logs(&self, access_token: String, hos_authentication_logs_param: models::InlineObject7) -> Box<Future<Item=GetFleetHosAuthenticationLogsResponse, Error=ApiError>>;

    /// /fleet/hos_logs
    fn get_fleet_hos_logs(&self, access_token: String, hos_logs_param: models::InlineObject8) -> Box<Future<Item=GetFleetHosLogsResponse, Error=ApiError>>;

    /// /fleet/hos_logs_summary
    fn get_fleet_hos_logs_summary(&self, access_token: String, hos_logs_param: models::InlineObject9) -> Box<Future<Item=GetFleetHosLogsSummaryResponse, Error=ApiError>>;

    /// /fleet/locations
    fn get_fleet_locations(&self, access_token: String, group_param: models::InlineObject11) -> Box<Future<Item=GetFleetLocationsResponse, Error=ApiError>>;

    /// /fleet/maintenance/list
    fn get_fleet_maintenance_list(&self, access_token: String, group_param: models::InlineObject13) -> Box<Future<Item=GetFleetMaintenanceListResponse, Error=ApiError>>;

    /// /fleet/trips
    fn get_fleet_trips(&self, access_token: String, trips_param: models::InlineObject15) -> Box<Future<Item=GetFleetTripsResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_fleet_vehicle(&self, access_token: String, vehicle_id_or_external_id: String) -> Box<Future<Item=GetFleetVehicleResponse, Error=ApiError>>;

    /// /addresses/{addressId}
    fn get_organization_address(&self, access_token: String, address_id: i64) -> Box<Future<Item=GetOrganizationAddressResponse, Error=ApiError>>;

    /// /addresses
    fn get_organization_addresses(&self, access_token: String) -> Box<Future<Item=GetOrganizationAddressesResponse, Error=ApiError>>;

    /// /contacts/{contact_id}
    fn get_organization_contact(&self, access_token: String, contact_id: i64) -> Box<Future<Item=GetOrganizationContactResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    fn get_vehicle_harsh_event(&self, vehicle_id: i64, access_token: String, timestamp: i64) -> Box<Future<Item=GetVehicleHarshEventResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
    fn get_vehicle_locations(&self, access_token: String, vehicle_id: i64, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetVehicleLocationsResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    fn get_vehicle_safety_score(&self, vehicle_id: i64, access_token: String, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetVehicleSafetyScoreResponse, Error=ApiError>>;

    /// /fleet/vehicles/stats
    fn get_vehicle_stats(&self, access_token: String, start_ms: i32, end_ms: i32, series: Option<String>, tag_ids: Option<String>, starting_after: Option<String>, ending_before: Option<String>, limit: Option<i64>) -> Box<Future<Item=GetVehicleStatsResponse, Error=ApiError>>;

    /// /fleet/vehicles/locations
    fn get_vehicles_locations(&self, access_token: String, start_ms: i32, end_ms: i32) -> Box<Future<Item=GetVehiclesLocationsResponse, Error=ApiError>>;

    /// /contacts
    fn list_contacts(&self, access_token: String) -> Box<Future<Item=ListContactsResponse, Error=ApiError>>;

    /// /fleet/list
    fn list_fleet(&self, access_token: String, group_param: models::InlineObject10, starting_after: Option<String>, ending_before: Option<String>, limit: Option<i64>) -> Box<Future<Item=ListFleetResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn patch_fleet_vehicle(&self, access_token: String, vehicle_id_or_external_id: String, data: models::InlineObject16) -> Box<Future<Item=PatchFleetVehicleResponse, Error=ApiError>>;

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn reactivate_driver_by_id(&self, access_token: String, driver_id_or_external_id: String, reactivate_driver_param: models::InlineObject4) -> Box<Future<Item=ReactivateDriverByIdResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    fn update_dispatch_route_by_id(&self, access_token: String, route_id: i64, update_dispatch_route_params: models::DispatchRoute) -> Box<Future<Item=UpdateDispatchRouteByIdResponse, Error=ApiError>>;

    /// /addresses/{addressId}
    fn update_organization_address(&self, access_token: String, address_id: i64, address: models::InlineObject1) -> Box<Future<Item=UpdateOrganizationAddressResponse, Error=ApiError>>;

    /// /fleet/set_data
    fn update_vehicles(&self, access_token: String, vehicle_update_param: models::InlineObject14) -> Box<Future<Item=UpdateVehiclesResponse, Error=ApiError>>;

    /// /industrial/data
    fn get_all_data_inputs(&self, access_token: String, group_id: Option<i64>, start_ms: Option<i64>, end_ms: Option<i64>) -> Box<Future<Item=GetAllDataInputsResponse, Error=ApiError>>;

    /// /industrial/data/{data_input_id:[0-9]+}
    fn get_data_input(&self, access_token: String, data_input_id: i64, start_ms: Option<i64>, end_ms: Option<i64>) -> Box<Future<Item=GetDataInputResponse, Error=ApiError>>;

    /// /machines/list
    fn get_machines(&self, access_token: String, group_param: models::InlineObject18) -> Box<Future<Item=GetMachinesResponse, Error=ApiError>>;

    /// /machines/history
    fn get_machines_history(&self, access_token: String, history_param: models::InlineObject17) -> Box<Future<Item=GetMachinesHistoryResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes
    fn create_dispatch_route(&self, access_token: String, create_dispatch_route_params: models::DispatchRouteCreate) -> Box<Future<Item=CreateDispatchRouteResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    fn create_driver_dispatch_route(&self, access_token: String, driver_id: i64, create_dispatch_route_params: models::DispatchRouteCreate) -> Box<Future<Item=CreateDriverDispatchRouteResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    fn create_vehicle_dispatch_route(&self, access_token: String, vehicle_id: i64, create_dispatch_route_params: models::DispatchRouteCreate) -> Box<Future<Item=CreateVehicleDispatchRouteResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    fn delete_dispatch_route_by_id(&self, access_token: String, route_id: i64) -> Box<Future<Item=DeleteDispatchRouteByIdResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes
    fn fetch_all_dispatch_routes(&self, access_token: String, group_id: Option<i64>, end_time: Option<i64>, duration: Option<i64>) -> Box<Future<Item=FetchAllDispatchRoutesResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/job_updates
    fn fetch_all_route_job_updates(&self, access_token: String, group_id: Option<i64>, sequence_id: Option<String>, include: Option<String>) -> Box<Future<Item=FetchAllRouteJobUpdatesResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/{route_id:[0-9]+}
    fn get_dispatch_route_by_id(&self, access_token: String, route_id: i64) -> Box<Future<Item=GetDispatchRouteByIdResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
    fn get_dispatch_route_history(&self, access_token: String, route_id: i64, start_time: Option<i64>, end_time: Option<i64>) -> Box<Future<Item=GetDispatchRouteHistoryResponse, Error=ApiError>>;

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    fn get_dispatch_routes_by_driver_id(&self, access_token: String, driver_id: i64, end_time: Option<i64>, duration: Option<i64>) -> Box<Future<Item=GetDispatchRoutesByDriverIdResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    fn get_dispatch_routes_by_vehicle_id(&self, access_token: String, vehicle_id: i64, end_time: Option<i64>, duration: Option<i64>) -> Box<Future<Item=GetDispatchRoutesByVehicleIdResponse, Error=ApiError>>;

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    fn update_dispatch_route_by_id(&self, access_token: String, route_id: i64, update_dispatch_route_params: models::DispatchRoute) -> Box<Future<Item=UpdateDispatchRouteByIdResponse, Error=ApiError>>;

    /// /fleet/drivers/{driverId:[0-9]+}/safety/score
    fn get_driver_safety_score(&self, driver_id: i64, access_token: String, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetDriverSafetyScoreResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    fn get_vehicle_harsh_event(&self, vehicle_id: i64, access_token: String, timestamp: i64) -> Box<Future<Item=GetVehicleHarshEventResponse, Error=ApiError>>;

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    fn get_vehicle_safety_score(&self, vehicle_id: i64, access_token: String, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetVehicleSafetyScoreResponse, Error=ApiError>>;

    /// /sensors/list
    fn get_sensors(&self, access_token: String, group_param: models::InlineObject23) -> Box<Future<Item=GetSensorsResponse, Error=ApiError>>;

    /// /sensors/cargo
    fn get_sensors_cargo(&self, access_token: String, sensor_param: models::InlineObject19) -> Box<Future<Item=GetSensorsCargoResponse, Error=ApiError>>;

    /// /sensors/door
    fn get_sensors_door(&self, access_token: String, sensor_param: models::InlineObject20) -> Box<Future<Item=GetSensorsDoorResponse, Error=ApiError>>;

    /// /sensors/history
    fn get_sensors_history(&self, access_token: String, history_param: models::InlineObject21) -> Box<Future<Item=GetSensorsHistoryResponse, Error=ApiError>>;

    /// /sensors/humidity
    fn get_sensors_humidity(&self, access_token: String, sensor_param: models::InlineObject22) -> Box<Future<Item=GetSensorsHumidityResponse, Error=ApiError>>;

    /// /sensors/temperature
    fn get_sensors_temperature(&self, access_token: String, sensor_param: models::InlineObject24) -> Box<Future<Item=GetSensorsTemperatureResponse, Error=ApiError>>;

    /// /tags
    fn create_tag(&self, access_token: String, tag_create_params: models::TagCreate) -> Box<Future<Item=CreateTagResponse, Error=ApiError>>;

    /// /tags/{tag_id:[0-9]+}
    fn delete_tag_by_id(&self, access_token: String, tag_id: i64) -> Box<Future<Item=DeleteTagByIdResponse, Error=ApiError>>;

    /// /tags
    fn get_all_tags(&self, access_token: String, group_id: Option<i64>) -> Box<Future<Item=GetAllTagsResponse, Error=ApiError>>;

    /// /tags/{tag_id:[0-9]+}
    fn get_tag_by_id(&self, access_token: String, tag_id: i64) -> Box<Future<Item=GetTagByIdResponse, Error=ApiError>>;

    /// /tags/{tag_id:[0-9]+}
    fn modify_tag_by_id(&self, access_token: String, tag_id: i64, tag_modify_params: models::TagModify) -> Box<Future<Item=ModifyTagByIdResponse, Error=ApiError>>;

    /// /tags/{tag_id:[0-9]+}
    fn update_tag_by_id(&self, access_token: String, tag_id: i64, update_tag_params: models::TagUpdate) -> Box<Future<Item=UpdateTagByIdResponse, Error=ApiError>>;

    /// /users/{userId:[0-9]+}
    fn delete_user_by_id(&self, access_token: String, user_id: i64) -> Box<Future<Item=DeleteUserByIdResponse, Error=ApiError>>;

    /// /users/{userId:[0-9]+}
    fn get_user_by_id(&self, access_token: String, user_id: i64) -> Box<Future<Item=GetUserByIdResponse, Error=ApiError>>;

    /// /user_roles
    fn list_user_roles(&self, access_token: String) -> Box<Future<Item=ListUserRolesResponse, Error=ApiError>>;

    /// /users
    fn list_users(&self, access_token: String) -> Box<Future<Item=ListUsersResponse, Error=ApiError>>;

}

/// Trait to extend an API to make it easy to bind it to a context.
pub trait ContextWrapperExt<'a, C> where Self: Sized {
    /// Binds this API to a context.
    fn with_context(self: &'a Self, context: C) -> ContextWrapper<'a, Self, C>;
}

impl<'a, T: Api<C> + Sized, C> ContextWrapperExt<'a, C> for T {
    fn with_context(self: &'a T, context: C) -> ContextWrapper<'a, T, C> {
         ContextWrapper::<T, C>::new(self, context)
    }
}

impl<'a, T: Api<C>, C> ApiNoContext for ContextWrapper<'a, T, C> {

    /// /fleet/assets/locations
    fn get_all_asset_current_locations(&self, access_token: String, group_id: Option<i64>) -> Box<Future<Item=GetAllAssetCurrentLocationsResponse, Error=ApiError>> {
        self.api().get_all_asset_current_locations(access_token, group_id, &self.context())
    }

    /// /fleet/assets
    fn get_all_assets(&self, access_token: String, group_id: Option<i64>) -> Box<Future<Item=GetAllAssetsResponse, Error=ApiError>> {
        self.api().get_all_assets(access_token, group_id, &self.context())
    }

    /// /fleet/assets/{assetId:[0-9]+}/locations
    fn get_asset_location(&self, access_token: String, asset_id: i64, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetAssetLocationResponse, Error=ApiError>> {
        self.api().get_asset_location(access_token, asset_id, start_ms, end_ms, &self.context())
    }

    /// /fleet/assets/{assetId:[0-9]+}/reefer
    fn get_asset_reefer(&self, access_token: String, asset_id: i64, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetAssetReeferResponse, Error=ApiError>> {
        self.api().get_asset_reefer(access_token, asset_id, start_ms, end_ms, &self.context())
    }

    /// /fleet/drivers/create
    fn create_driver(&self, access_token: String, create_driver_param: models::DriverForCreate) -> Box<Future<Item=CreateDriverResponse, Error=ApiError>> {
        self.api().create_driver(access_token, create_driver_param, &self.context())
    }

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn deactivate_driver(&self, access_token: String, driver_id_or_external_id: String) -> Box<Future<Item=DeactivateDriverResponse, Error=ApiError>> {
        self.api().deactivate_driver(access_token, driver_id_or_external_id, &self.context())
    }

    /// /fleet/drivers/inactive
    fn get_all_deactivated_drivers(&self, access_token: String, group_id: Option<i64>) -> Box<Future<Item=GetAllDeactivatedDriversResponse, Error=ApiError>> {
        self.api().get_all_deactivated_drivers(access_token, group_id, &self.context())
    }

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_deactivated_driver_by_id(&self, access_token: String, driver_id_or_external_id: String) -> Box<Future<Item=GetDeactivatedDriverByIdResponse, Error=ApiError>> {
        self.api().get_deactivated_driver_by_id(access_token, driver_id_or_external_id, &self.context())
    }

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_driver_by_id(&self, access_token: String, driver_id_or_external_id: String) -> Box<Future<Item=GetDriverByIdResponse, Error=ApiError>> {
        self.api().get_driver_by_id(access_token, driver_id_or_external_id, &self.context())
    }

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn reactivate_driver_by_id(&self, access_token: String, driver_id_or_external_id: String, reactivate_driver_param: models::InlineObject4) -> Box<Future<Item=ReactivateDriverByIdResponse, Error=ApiError>> {
        self.api().reactivate_driver_by_id(access_token, driver_id_or_external_id, reactivate_driver_param, &self.context())
    }

    /// /fleet/add_address
    fn add_fleet_address(&self, access_token: String, address_param: models::InlineObject2) -> Box<Future<Item=AddFleetAddressResponse, Error=ApiError>> {
        self.api().add_fleet_address(access_token, address_param, &self.context())
    }

    /// /addresses
    fn add_organization_addresses(&self, access_token: String, addresses: models::InlineObject) -> Box<Future<Item=AddOrganizationAddressesResponse, Error=ApiError>> {
        self.api().add_organization_addresses(access_token, addresses, &self.context())
    }

    /// /fleet/dispatch/routes
    fn create_dispatch_route(&self, access_token: String, create_dispatch_route_params: models::DispatchRouteCreate) -> Box<Future<Item=CreateDispatchRouteResponse, Error=ApiError>> {
        self.api().create_dispatch_route(access_token, create_dispatch_route_params, &self.context())
    }

    /// /fleet/drivers/create
    fn create_driver(&self, access_token: String, create_driver_param: models::DriverForCreate) -> Box<Future<Item=CreateDriverResponse, Error=ApiError>> {
        self.api().create_driver(access_token, create_driver_param, &self.context())
    }

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    fn create_driver_dispatch_route(&self, access_token: String, driver_id: i64, create_dispatch_route_params: models::DispatchRouteCreate) -> Box<Future<Item=CreateDriverDispatchRouteResponse, Error=ApiError>> {
        self.api().create_driver_dispatch_route(access_token, driver_id, create_dispatch_route_params, &self.context())
    }

    /// /fleet/drivers/{driver_id:[0-9]+}/documents
    fn create_driver_document(&self, access_token: String, driver_id: i64, create_document_params: models::DocumentCreate) -> Box<Future<Item=CreateDriverDocumentResponse, Error=ApiError>> {
        self.api().create_driver_document(access_token, driver_id, create_document_params, &self.context())
    }

    /// /fleet/maintenance/dvirs
    fn create_dvir(&self, access_token: String, create_dvir_param: models::InlineObject12) -> Box<Future<Item=CreateDvirResponse, Error=ApiError>> {
        self.api().create_dvir(access_token, create_dvir_param, &self.context())
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    fn create_vehicle_dispatch_route(&self, access_token: String, vehicle_id: i64, create_dispatch_route_params: models::DispatchRouteCreate) -> Box<Future<Item=CreateVehicleDispatchRouteResponse, Error=ApiError>> {
        self.api().create_vehicle_dispatch_route(access_token, vehicle_id, create_dispatch_route_params, &self.context())
    }

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn deactivate_driver(&self, access_token: String, driver_id_or_external_id: String) -> Box<Future<Item=DeactivateDriverResponse, Error=ApiError>> {
        self.api().deactivate_driver(access_token, driver_id_or_external_id, &self.context())
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    fn delete_dispatch_route_by_id(&self, access_token: String, route_id: i64) -> Box<Future<Item=DeleteDispatchRouteByIdResponse, Error=ApiError>> {
        self.api().delete_dispatch_route_by_id(access_token, route_id, &self.context())
    }

    /// /addresses/{addressId}
    fn delete_organization_address(&self, access_token: String, address_id: i64) -> Box<Future<Item=DeleteOrganizationAddressResponse, Error=ApiError>> {
        self.api().delete_organization_address(access_token, address_id, &self.context())
    }

    /// /fleet/dispatch/routes
    fn fetch_all_dispatch_routes(&self, access_token: String, group_id: Option<i64>, end_time: Option<i64>, duration: Option<i64>) -> Box<Future<Item=FetchAllDispatchRoutesResponse, Error=ApiError>> {
        self.api().fetch_all_dispatch_routes(access_token, group_id, end_time, duration, &self.context())
    }

    /// /fleet/dispatch/routes/job_updates
    fn fetch_all_route_job_updates(&self, access_token: String, group_id: Option<i64>, sequence_id: Option<String>, include: Option<String>) -> Box<Future<Item=FetchAllRouteJobUpdatesResponse, Error=ApiError>> {
        self.api().fetch_all_route_job_updates(access_token, group_id, sequence_id, include, &self.context())
    }

    /// /fleet/assets/locations
    fn get_all_asset_current_locations(&self, access_token: String, group_id: Option<i64>) -> Box<Future<Item=GetAllAssetCurrentLocationsResponse, Error=ApiError>> {
        self.api().get_all_asset_current_locations(access_token, group_id, &self.context())
    }

    /// /fleet/assets
    fn get_all_assets(&self, access_token: String, group_id: Option<i64>) -> Box<Future<Item=GetAllAssetsResponse, Error=ApiError>> {
        self.api().get_all_assets(access_token, group_id, &self.context())
    }

    /// /fleet/drivers/inactive
    fn get_all_deactivated_drivers(&self, access_token: String, group_id: Option<i64>) -> Box<Future<Item=GetAllDeactivatedDriversResponse, Error=ApiError>> {
        self.api().get_all_deactivated_drivers(access_token, group_id, &self.context())
    }

    /// /fleet/assets/{assetId:[0-9]+}/locations
    fn get_asset_location(&self, access_token: String, asset_id: i64, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetAssetLocationResponse, Error=ApiError>> {
        self.api().get_asset_location(access_token, asset_id, start_ms, end_ms, &self.context())
    }

    /// /fleet/assets/{assetId:[0-9]+}/reefer
    fn get_asset_reefer(&self, access_token: String, asset_id: i64, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetAssetReeferResponse, Error=ApiError>> {
        self.api().get_asset_reefer(access_token, asset_id, start_ms, end_ms, &self.context())
    }

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_deactivated_driver_by_id(&self, access_token: String, driver_id_or_external_id: String) -> Box<Future<Item=GetDeactivatedDriverByIdResponse, Error=ApiError>> {
        self.api().get_deactivated_driver_by_id(access_token, driver_id_or_external_id, &self.context())
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}
    fn get_dispatch_route_by_id(&self, access_token: String, route_id: i64) -> Box<Future<Item=GetDispatchRouteByIdResponse, Error=ApiError>> {
        self.api().get_dispatch_route_by_id(access_token, route_id, &self.context())
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
    fn get_dispatch_route_history(&self, access_token: String, route_id: i64, start_time: Option<i64>, end_time: Option<i64>) -> Box<Future<Item=GetDispatchRouteHistoryResponse, Error=ApiError>> {
        self.api().get_dispatch_route_history(access_token, route_id, start_time, end_time, &self.context())
    }

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    fn get_dispatch_routes_by_driver_id(&self, access_token: String, driver_id: i64, end_time: Option<i64>, duration: Option<i64>) -> Box<Future<Item=GetDispatchRoutesByDriverIdResponse, Error=ApiError>> {
        self.api().get_dispatch_routes_by_driver_id(access_token, driver_id, end_time, duration, &self.context())
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    fn get_dispatch_routes_by_vehicle_id(&self, access_token: String, vehicle_id: i64, end_time: Option<i64>, duration: Option<i64>) -> Box<Future<Item=GetDispatchRoutesByVehicleIdResponse, Error=ApiError>> {
        self.api().get_dispatch_routes_by_vehicle_id(access_token, vehicle_id, end_time, duration, &self.context())
    }

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_driver_by_id(&self, access_token: String, driver_id_or_external_id: String) -> Box<Future<Item=GetDriverByIdResponse, Error=ApiError>> {
        self.api().get_driver_by_id(access_token, driver_id_or_external_id, &self.context())
    }

    /// /fleet/drivers/document_types
    fn get_driver_document_types_by_org_id(&self) -> Box<Future<Item=GetDriverDocumentTypesByOrgIdResponse, Error=ApiError>> {
        self.api().get_driver_document_types_by_org_id(&self.context())
    }

    /// /fleet/drivers/documents
    fn get_driver_documents_by_org_id(&self, access_token: String, end_ms: Option<i64>, duration_ms: Option<i64>) -> Box<Future<Item=GetDriverDocumentsByOrgIdResponse, Error=ApiError>> {
        self.api().get_driver_documents_by_org_id(access_token, end_ms, duration_ms, &self.context())
    }

    /// /fleet/drivers/{driverId:[0-9]+}/safety/score
    fn get_driver_safety_score(&self, driver_id: i64, access_token: String, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetDriverSafetyScoreResponse, Error=ApiError>> {
        self.api().get_driver_safety_score(driver_id, access_token, start_ms, end_ms, &self.context())
    }

    /// /fleet/maintenance/dvirs
    fn get_dvirs(&self, access_token: String, end_ms: i32, duration_ms: i32, group_id: Option<i32>) -> Box<Future<Item=GetDvirsResponse, Error=ApiError>> {
        self.api().get_dvirs(access_token, end_ms, duration_ms, group_id, &self.context())
    }

    /// /fleet/drivers
    fn get_fleet_drivers(&self, access_token: String, group_drivers_param: models::InlineObject3) -> Box<Future<Item=GetFleetDriversResponse, Error=ApiError>> {
        self.api().get_fleet_drivers(access_token, group_drivers_param, &self.context())
    }

    /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
    fn get_fleet_drivers_hos_daily_logs(&self, access_token: String, driver_id: i64, hos_logs_param: models::InlineObject6) -> Box<Future<Item=GetFleetDriversHosDailyLogsResponse, Error=ApiError>> {
        self.api().get_fleet_drivers_hos_daily_logs(access_token, driver_id, hos_logs_param, &self.context())
    }

    /// /fleet/drivers/summary
    fn get_fleet_drivers_summary(&self, access_token: String, drivers_summary_param: models::InlineObject5, snap_to_day_bounds: Option<bool>) -> Box<Future<Item=GetFleetDriversSummaryResponse, Error=ApiError>> {
        self.api().get_fleet_drivers_summary(access_token, drivers_summary_param, snap_to_day_bounds, &self.context())
    }

    /// /fleet/hos_authentication_logs
    fn get_fleet_hos_authentication_logs(&self, access_token: String, hos_authentication_logs_param: models::InlineObject7) -> Box<Future<Item=GetFleetHosAuthenticationLogsResponse, Error=ApiError>> {
        self.api().get_fleet_hos_authentication_logs(access_token, hos_authentication_logs_param, &self.context())
    }

    /// /fleet/hos_logs
    fn get_fleet_hos_logs(&self, access_token: String, hos_logs_param: models::InlineObject8) -> Box<Future<Item=GetFleetHosLogsResponse, Error=ApiError>> {
        self.api().get_fleet_hos_logs(access_token, hos_logs_param, &self.context())
    }

    /// /fleet/hos_logs_summary
    fn get_fleet_hos_logs_summary(&self, access_token: String, hos_logs_param: models::InlineObject9) -> Box<Future<Item=GetFleetHosLogsSummaryResponse, Error=ApiError>> {
        self.api().get_fleet_hos_logs_summary(access_token, hos_logs_param, &self.context())
    }

    /// /fleet/locations
    fn get_fleet_locations(&self, access_token: String, group_param: models::InlineObject11) -> Box<Future<Item=GetFleetLocationsResponse, Error=ApiError>> {
        self.api().get_fleet_locations(access_token, group_param, &self.context())
    }

    /// /fleet/maintenance/list
    fn get_fleet_maintenance_list(&self, access_token: String, group_param: models::InlineObject13) -> Box<Future<Item=GetFleetMaintenanceListResponse, Error=ApiError>> {
        self.api().get_fleet_maintenance_list(access_token, group_param, &self.context())
    }

    /// /fleet/trips
    fn get_fleet_trips(&self, access_token: String, trips_param: models::InlineObject15) -> Box<Future<Item=GetFleetTripsResponse, Error=ApiError>> {
        self.api().get_fleet_trips(access_token, trips_param, &self.context())
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_fleet_vehicle(&self, access_token: String, vehicle_id_or_external_id: String) -> Box<Future<Item=GetFleetVehicleResponse, Error=ApiError>> {
        self.api().get_fleet_vehicle(access_token, vehicle_id_or_external_id, &self.context())
    }

    /// /addresses/{addressId}
    fn get_organization_address(&self, access_token: String, address_id: i64) -> Box<Future<Item=GetOrganizationAddressResponse, Error=ApiError>> {
        self.api().get_organization_address(access_token, address_id, &self.context())
    }

    /// /addresses
    fn get_organization_addresses(&self, access_token: String) -> Box<Future<Item=GetOrganizationAddressesResponse, Error=ApiError>> {
        self.api().get_organization_addresses(access_token, &self.context())
    }

    /// /contacts/{contact_id}
    fn get_organization_contact(&self, access_token: String, contact_id: i64) -> Box<Future<Item=GetOrganizationContactResponse, Error=ApiError>> {
        self.api().get_organization_contact(access_token, contact_id, &self.context())
    }

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    fn get_vehicle_harsh_event(&self, vehicle_id: i64, access_token: String, timestamp: i64) -> Box<Future<Item=GetVehicleHarshEventResponse, Error=ApiError>> {
        self.api().get_vehicle_harsh_event(vehicle_id, access_token, timestamp, &self.context())
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
    fn get_vehicle_locations(&self, access_token: String, vehicle_id: i64, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetVehicleLocationsResponse, Error=ApiError>> {
        self.api().get_vehicle_locations(access_token, vehicle_id, start_ms, end_ms, &self.context())
    }

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    fn get_vehicle_safety_score(&self, vehicle_id: i64, access_token: String, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetVehicleSafetyScoreResponse, Error=ApiError>> {
        self.api().get_vehicle_safety_score(vehicle_id, access_token, start_ms, end_ms, &self.context())
    }

    /// /fleet/vehicles/stats
    fn get_vehicle_stats(&self, access_token: String, start_ms: i32, end_ms: i32, series: Option<String>, tag_ids: Option<String>, starting_after: Option<String>, ending_before: Option<String>, limit: Option<i64>) -> Box<Future<Item=GetVehicleStatsResponse, Error=ApiError>> {
        self.api().get_vehicle_stats(access_token, start_ms, end_ms, series, tag_ids, starting_after, ending_before, limit, &self.context())
    }

    /// /fleet/vehicles/locations
    fn get_vehicles_locations(&self, access_token: String, start_ms: i32, end_ms: i32) -> Box<Future<Item=GetVehiclesLocationsResponse, Error=ApiError>> {
        self.api().get_vehicles_locations(access_token, start_ms, end_ms, &self.context())
    }

    /// /contacts
    fn list_contacts(&self, access_token: String) -> Box<Future<Item=ListContactsResponse, Error=ApiError>> {
        self.api().list_contacts(access_token, &self.context())
    }

    /// /fleet/list
    fn list_fleet(&self, access_token: String, group_param: models::InlineObject10, starting_after: Option<String>, ending_before: Option<String>, limit: Option<i64>) -> Box<Future<Item=ListFleetResponse, Error=ApiError>> {
        self.api().list_fleet(access_token, group_param, starting_after, ending_before, limit, &self.context())
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn patch_fleet_vehicle(&self, access_token: String, vehicle_id_or_external_id: String, data: models::InlineObject16) -> Box<Future<Item=PatchFleetVehicleResponse, Error=ApiError>> {
        self.api().patch_fleet_vehicle(access_token, vehicle_id_or_external_id, data, &self.context())
    }

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn reactivate_driver_by_id(&self, access_token: String, driver_id_or_external_id: String, reactivate_driver_param: models::InlineObject4) -> Box<Future<Item=ReactivateDriverByIdResponse, Error=ApiError>> {
        self.api().reactivate_driver_by_id(access_token, driver_id_or_external_id, reactivate_driver_param, &self.context())
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    fn update_dispatch_route_by_id(&self, access_token: String, route_id: i64, update_dispatch_route_params: models::DispatchRoute) -> Box<Future<Item=UpdateDispatchRouteByIdResponse, Error=ApiError>> {
        self.api().update_dispatch_route_by_id(access_token, route_id, update_dispatch_route_params, &self.context())
    }

    /// /addresses/{addressId}
    fn update_organization_address(&self, access_token: String, address_id: i64, address: models::InlineObject1) -> Box<Future<Item=UpdateOrganizationAddressResponse, Error=ApiError>> {
        self.api().update_organization_address(access_token, address_id, address, &self.context())
    }

    /// /fleet/set_data
    fn update_vehicles(&self, access_token: String, vehicle_update_param: models::InlineObject14) -> Box<Future<Item=UpdateVehiclesResponse, Error=ApiError>> {
        self.api().update_vehicles(access_token, vehicle_update_param, &self.context())
    }

    /// /industrial/data
    fn get_all_data_inputs(&self, access_token: String, group_id: Option<i64>, start_ms: Option<i64>, end_ms: Option<i64>) -> Box<Future<Item=GetAllDataInputsResponse, Error=ApiError>> {
        self.api().get_all_data_inputs(access_token, group_id, start_ms, end_ms, &self.context())
    }

    /// /industrial/data/{data_input_id:[0-9]+}
    fn get_data_input(&self, access_token: String, data_input_id: i64, start_ms: Option<i64>, end_ms: Option<i64>) -> Box<Future<Item=GetDataInputResponse, Error=ApiError>> {
        self.api().get_data_input(access_token, data_input_id, start_ms, end_ms, &self.context())
    }

    /// /machines/list
    fn get_machines(&self, access_token: String, group_param: models::InlineObject18) -> Box<Future<Item=GetMachinesResponse, Error=ApiError>> {
        self.api().get_machines(access_token, group_param, &self.context())
    }

    /// /machines/history
    fn get_machines_history(&self, access_token: String, history_param: models::InlineObject17) -> Box<Future<Item=GetMachinesHistoryResponse, Error=ApiError>> {
        self.api().get_machines_history(access_token, history_param, &self.context())
    }

    /// /fleet/dispatch/routes
    fn create_dispatch_route(&self, access_token: String, create_dispatch_route_params: models::DispatchRouteCreate) -> Box<Future<Item=CreateDispatchRouteResponse, Error=ApiError>> {
        self.api().create_dispatch_route(access_token, create_dispatch_route_params, &self.context())
    }

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    fn create_driver_dispatch_route(&self, access_token: String, driver_id: i64, create_dispatch_route_params: models::DispatchRouteCreate) -> Box<Future<Item=CreateDriverDispatchRouteResponse, Error=ApiError>> {
        self.api().create_driver_dispatch_route(access_token, driver_id, create_dispatch_route_params, &self.context())
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    fn create_vehicle_dispatch_route(&self, access_token: String, vehicle_id: i64, create_dispatch_route_params: models::DispatchRouteCreate) -> Box<Future<Item=CreateVehicleDispatchRouteResponse, Error=ApiError>> {
        self.api().create_vehicle_dispatch_route(access_token, vehicle_id, create_dispatch_route_params, &self.context())
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    fn delete_dispatch_route_by_id(&self, access_token: String, route_id: i64) -> Box<Future<Item=DeleteDispatchRouteByIdResponse, Error=ApiError>> {
        self.api().delete_dispatch_route_by_id(access_token, route_id, &self.context())
    }

    /// /fleet/dispatch/routes
    fn fetch_all_dispatch_routes(&self, access_token: String, group_id: Option<i64>, end_time: Option<i64>, duration: Option<i64>) -> Box<Future<Item=FetchAllDispatchRoutesResponse, Error=ApiError>> {
        self.api().fetch_all_dispatch_routes(access_token, group_id, end_time, duration, &self.context())
    }

    /// /fleet/dispatch/routes/job_updates
    fn fetch_all_route_job_updates(&self, access_token: String, group_id: Option<i64>, sequence_id: Option<String>, include: Option<String>) -> Box<Future<Item=FetchAllRouteJobUpdatesResponse, Error=ApiError>> {
        self.api().fetch_all_route_job_updates(access_token, group_id, sequence_id, include, &self.context())
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}
    fn get_dispatch_route_by_id(&self, access_token: String, route_id: i64) -> Box<Future<Item=GetDispatchRouteByIdResponse, Error=ApiError>> {
        self.api().get_dispatch_route_by_id(access_token, route_id, &self.context())
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
    fn get_dispatch_route_history(&self, access_token: String, route_id: i64, start_time: Option<i64>, end_time: Option<i64>) -> Box<Future<Item=GetDispatchRouteHistoryResponse, Error=ApiError>> {
        self.api().get_dispatch_route_history(access_token, route_id, start_time, end_time, &self.context())
    }

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    fn get_dispatch_routes_by_driver_id(&self, access_token: String, driver_id: i64, end_time: Option<i64>, duration: Option<i64>) -> Box<Future<Item=GetDispatchRoutesByDriverIdResponse, Error=ApiError>> {
        self.api().get_dispatch_routes_by_driver_id(access_token, driver_id, end_time, duration, &self.context())
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    fn get_dispatch_routes_by_vehicle_id(&self, access_token: String, vehicle_id: i64, end_time: Option<i64>, duration: Option<i64>) -> Box<Future<Item=GetDispatchRoutesByVehicleIdResponse, Error=ApiError>> {
        self.api().get_dispatch_routes_by_vehicle_id(access_token, vehicle_id, end_time, duration, &self.context())
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    fn update_dispatch_route_by_id(&self, access_token: String, route_id: i64, update_dispatch_route_params: models::DispatchRoute) -> Box<Future<Item=UpdateDispatchRouteByIdResponse, Error=ApiError>> {
        self.api().update_dispatch_route_by_id(access_token, route_id, update_dispatch_route_params, &self.context())
    }

    /// /fleet/drivers/{driverId:[0-9]+}/safety/score
    fn get_driver_safety_score(&self, driver_id: i64, access_token: String, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetDriverSafetyScoreResponse, Error=ApiError>> {
        self.api().get_driver_safety_score(driver_id, access_token, start_ms, end_ms, &self.context())
    }

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    fn get_vehicle_harsh_event(&self, vehicle_id: i64, access_token: String, timestamp: i64) -> Box<Future<Item=GetVehicleHarshEventResponse, Error=ApiError>> {
        self.api().get_vehicle_harsh_event(vehicle_id, access_token, timestamp, &self.context())
    }

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    fn get_vehicle_safety_score(&self, vehicle_id: i64, access_token: String, start_ms: i64, end_ms: i64) -> Box<Future<Item=GetVehicleSafetyScoreResponse, Error=ApiError>> {
        self.api().get_vehicle_safety_score(vehicle_id, access_token, start_ms, end_ms, &self.context())
    }

    /// /sensors/list
    fn get_sensors(&self, access_token: String, group_param: models::InlineObject23) -> Box<Future<Item=GetSensorsResponse, Error=ApiError>> {
        self.api().get_sensors(access_token, group_param, &self.context())
    }

    /// /sensors/cargo
    fn get_sensors_cargo(&self, access_token: String, sensor_param: models::InlineObject19) -> Box<Future<Item=GetSensorsCargoResponse, Error=ApiError>> {
        self.api().get_sensors_cargo(access_token, sensor_param, &self.context())
    }

    /// /sensors/door
    fn get_sensors_door(&self, access_token: String, sensor_param: models::InlineObject20) -> Box<Future<Item=GetSensorsDoorResponse, Error=ApiError>> {
        self.api().get_sensors_door(access_token, sensor_param, &self.context())
    }

    /// /sensors/history
    fn get_sensors_history(&self, access_token: String, history_param: models::InlineObject21) -> Box<Future<Item=GetSensorsHistoryResponse, Error=ApiError>> {
        self.api().get_sensors_history(access_token, history_param, &self.context())
    }

    /// /sensors/humidity
    fn get_sensors_humidity(&self, access_token: String, sensor_param: models::InlineObject22) -> Box<Future<Item=GetSensorsHumidityResponse, Error=ApiError>> {
        self.api().get_sensors_humidity(access_token, sensor_param, &self.context())
    }

    /// /sensors/temperature
    fn get_sensors_temperature(&self, access_token: String, sensor_param: models::InlineObject24) -> Box<Future<Item=GetSensorsTemperatureResponse, Error=ApiError>> {
        self.api().get_sensors_temperature(access_token, sensor_param, &self.context())
    }

    /// /tags
    fn create_tag(&self, access_token: String, tag_create_params: models::TagCreate) -> Box<Future<Item=CreateTagResponse, Error=ApiError>> {
        self.api().create_tag(access_token, tag_create_params, &self.context())
    }

    /// /tags/{tag_id:[0-9]+}
    fn delete_tag_by_id(&self, access_token: String, tag_id: i64) -> Box<Future<Item=DeleteTagByIdResponse, Error=ApiError>> {
        self.api().delete_tag_by_id(access_token, tag_id, &self.context())
    }

    /// /tags
    fn get_all_tags(&self, access_token: String, group_id: Option<i64>) -> Box<Future<Item=GetAllTagsResponse, Error=ApiError>> {
        self.api().get_all_tags(access_token, group_id, &self.context())
    }

    /// /tags/{tag_id:[0-9]+}
    fn get_tag_by_id(&self, access_token: String, tag_id: i64) -> Box<Future<Item=GetTagByIdResponse, Error=ApiError>> {
        self.api().get_tag_by_id(access_token, tag_id, &self.context())
    }

    /// /tags/{tag_id:[0-9]+}
    fn modify_tag_by_id(&self, access_token: String, tag_id: i64, tag_modify_params: models::TagModify) -> Box<Future<Item=ModifyTagByIdResponse, Error=ApiError>> {
        self.api().modify_tag_by_id(access_token, tag_id, tag_modify_params, &self.context())
    }

    /// /tags/{tag_id:[0-9]+}
    fn update_tag_by_id(&self, access_token: String, tag_id: i64, update_tag_params: models::TagUpdate) -> Box<Future<Item=UpdateTagByIdResponse, Error=ApiError>> {
        self.api().update_tag_by_id(access_token, tag_id, update_tag_params, &self.context())
    }

    /// /users/{userId:[0-9]+}
    fn delete_user_by_id(&self, access_token: String, user_id: i64) -> Box<Future<Item=DeleteUserByIdResponse, Error=ApiError>> {
        self.api().delete_user_by_id(access_token, user_id, &self.context())
    }

    /// /users/{userId:[0-9]+}
    fn get_user_by_id(&self, access_token: String, user_id: i64) -> Box<Future<Item=GetUserByIdResponse, Error=ApiError>> {
        self.api().get_user_by_id(access_token, user_id, &self.context())
    }

    /// /user_roles
    fn list_user_roles(&self, access_token: String) -> Box<Future<Item=ListUserRolesResponse, Error=ApiError>> {
        self.api().list_user_roles(access_token, &self.context())
    }

    /// /users
    fn list_users(&self, access_token: String) -> Box<Future<Item=ListUsersResponse, Error=ApiError>> {
        self.api().list_users(access_token, &self.context())
    }

}

#[cfg(feature = "client")]
pub mod client;

// Re-export Client as a top-level name
#[cfg(feature = "client")]
pub use self::client::Client;

#[cfg(feature = "server")]
pub mod server;

// Re-export router() as a top-level name
#[cfg(feature = "server")]
pub use self::server::Service;

pub mod models;
