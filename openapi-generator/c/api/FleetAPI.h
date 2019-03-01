#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/address.h"
#include "../model/all_route_job_updates.h"
#include "../model/asset_reefer_response.h"
#include "../model/contact.h"
#include "../model/dispatch_route.h"
#include "../model/dispatch_route_create.h"
#include "../model/dispatch_route_history.h"
#include "../model/document.h"
#include "../model/document_create.h"
#include "../model/document_type.h"
#include "../model/driver.h"
#include "../model/driver_daily_log_response.h"
#include "../model/driver_for_create.h"
#include "../model/driver_safety_score_response.h"
#include "../model/drivers_response.h"
#include "../model/drivers_summary_response.h"
#include "../model/dvir_base.h"
#include "../model/dvir_list_response.h"
#include "../model/fleet_vehicle_location.h"
#include "../model/fleet_vehicle_response.h"
#include "../model/hos_authentication_logs_response.h"
#include "../model/hos_logs_response.h"
#include "../model/hos_logs_summary_response.h"
#include "../model/inline_object.h"
#include "../model/inline_object_1.h"
#include "../model/inline_object_10.h"
#include "../model/inline_object_11.h"
#include "../model/inline_object_12.h"
#include "../model/inline_object_13.h"
#include "../model/inline_object_14.h"
#include "../model/inline_object_15.h"
#include "../model/inline_object_16.h"
#include "../model/inline_object_2.h"
#include "../model/inline_object_3.h"
#include "../model/inline_object_4.h"
#include "../model/inline_object_5.h"
#include "../model/inline_object_6.h"
#include "../model/inline_object_7.h"
#include "../model/inline_object_8.h"
#include "../model/inline_object_9.h"
#include "../model/inline_response_200.h"
#include "../model/inline_response_200_1.h"
#include "../model/inline_response_200_2.h"
#include "../model/inline_response_200_3.h"
#include "../model/inline_response_200_4.h"
#include "../model/inline_response_200_5.h"
#include "../model/object.h"
#include "../model/trip_response.h"
#include "../model/vehicle_harsh_event_response.h"
#include "../model/vehicle_safety_score_response.h"


// /fleet/add_address
//
// This method adds an address book entry to the specified group.
//
void
FleetAPI_addFleetAddress(apiClient_t *apiClient,char* access_token ,inline_object_2_t* addressParam );



// /addresses
//
// Add one or more addresses to the organization
//
list_t*
FleetAPI_addOrganizationAddresses(apiClient_t *apiClient,char* access_token ,inline_object_t* addresses );



// /fleet/dispatch/routes
//
// Create a new dispatch route.
//
dispatch_route_t*
FleetAPI_createDispatchRoute(apiClient_t *apiClient,char* access_token ,dispatch_route_create_t* createDispatchRouteParams );



// /fleet/drivers/create
//
// Create a new driver.
//
driver_t*
FleetAPI_createDriver(apiClient_t *apiClient,char* access_token ,driver_for_create_t* createDriverParam );



// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
//
// Create a new dispatch route for the driver with driver_id.
//
dispatch_route_t*
FleetAPI_createDriverDispatchRoute(apiClient_t *apiClient,char* access_token ,long driver_id ,dispatch_route_create_t* createDispatchRouteParams );



// /fleet/drivers/{driver_id:[0-9]+}/documents
//
// Create a driver document for the given driver.
//
document_t*
FleetAPI_createDriverDocument(apiClient_t *apiClient,char* access_token ,long driver_id ,document_create_t* createDocumentParams );



// /fleet/maintenance/dvirs
//
// Create a new dvir, marking a vehicle or trailer safe or unsafe.
//
dvir_base_t*
FleetAPI_createDvir(apiClient_t *apiClient,char* access_token ,inline_object_12_t* createDvirParam );



// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
//
// Create a new dispatch route for the vehicle with vehicle_id.
//
dispatch_route_t*
FleetAPI_createVehicleDispatchRoute(apiClient_t *apiClient,char* access_token ,long vehicle_id ,dispatch_route_create_t* createDispatchRouteParams );



// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Deactivate a driver with the given id.
//
void
FleetAPI_deactivateDriver(apiClient_t *apiClient,char* access_token ,char* driver_id_or_external_id );



// /fleet/dispatch/routes/{route_id:[0-9]+}/
//
// Delete a dispatch route and its associated jobs.
//
void
FleetAPI_deleteDispatchRouteById(apiClient_t *apiClient,char* access_token ,long route_id );



// /addresses/{addressId}
//
// Delete an address.
//
void
FleetAPI_deleteOrganizationAddress(apiClient_t *apiClient,char* access_token ,long addressId );



// /fleet/dispatch/routes
//
// Fetch all of the dispatch routes for the group.
//
list_t*
FleetAPI_fetchAllDispatchRoutes(apiClient_t *apiClient,char* access_token ,long group_id ,long end_time ,long duration );



// /fleet/dispatch/routes/job_updates
//
// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
//
all_route_job_updates_t*
FleetAPI_fetchAllRouteJobUpdates(apiClient_t *apiClient,char* access_token ,long group_id ,char* sequence_id ,char* include );



// /fleet/assets/locations
//
// Fetch current locations of all assets for the group.
//
inline_response_200_1_t*
FleetAPI_getAllAssetCurrentLocations(apiClient_t *apiClient,char* access_token ,long group_id );



// /fleet/assets
//
// Fetch all of the assets for the group.
//
inline_response_200_t*
FleetAPI_getAllAssets(apiClient_t *apiClient,char* access_token ,long group_id );



// /fleet/drivers/inactive
//
// Fetch all deactivated drivers for the group.
//
list_t*
FleetAPI_getAllDeactivatedDrivers(apiClient_t *apiClient,char* access_token ,long group_id );



// /fleet/assets/{assetId:[0-9]+}/locations
//
// Fetch the historical locations for the asset.
//
list_t*
FleetAPI_getAssetLocation(apiClient_t *apiClient,char* access_token ,long asset_id ,long startMs ,long endMs );



// /fleet/assets/{assetId:[0-9]+}/reefer
//
// Fetch the reefer-specific stats of an asset.
//
asset_reefer_response_t*
FleetAPI_getAssetReefer(apiClient_t *apiClient,char* access_token ,long asset_id ,long startMs ,long endMs );



// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Fetch deactivated driver by id.
//
driver_t*
FleetAPI_getDeactivatedDriverById(apiClient_t *apiClient,char* access_token ,char* driver_id_or_external_id );



// /fleet/dispatch/routes/{route_id:[0-9]+}
//
// Fetch a dispatch route by id.
//
dispatch_route_t*
FleetAPI_getDispatchRouteById(apiClient_t *apiClient,char* access_token ,long route_id );



// /fleet/dispatch/routes/{route_id:[0-9]+}/history
//
// Fetch the history of a dispatch route.
//
dispatch_route_history_t*
FleetAPI_getDispatchRouteHistory(apiClient_t *apiClient,char* access_token ,long route_id ,long start_time ,long end_time );



// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
//
// Fetch all of the dispatch routes for a given driver.
//
list_t*
FleetAPI_getDispatchRoutesByDriverId(apiClient_t *apiClient,char* access_token ,long driver_id ,long end_time ,long duration );



// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
//
// Fetch all of the dispatch routes for a given vehicle.
//
list_t*
FleetAPI_getDispatchRoutesByVehicleId(apiClient_t *apiClient,char* access_token ,long vehicle_id ,long end_time ,long duration );



// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Fetch driver by id.
//
driver_t*
FleetAPI_getDriverById(apiClient_t *apiClient,char* access_token ,char* driver_id_or_external_id );



// /fleet/drivers/document_types
//
// Fetch all of the document types.
//
list_t*
FleetAPI_getDriverDocumentTypesByOrgId(apiClient_t *apiClient);



// /fleet/drivers/documents
//
// Fetch all of the documents.
//
list_t*
FleetAPI_getDriverDocumentsByOrgId(apiClient_t *apiClient,char* access_token ,long endMs ,long durationMs );



// /fleet/drivers/{driverId:[0-9]+}/safety/score
//
// Fetch the safety score for the driver.
//
driver_safety_score_response_t*
FleetAPI_getDriverSafetyScore(apiClient_t *apiClient,long driverId ,char* access_token ,long startMs ,long endMs );



// /fleet/maintenance/dvirs
//
// Get DVIRs for the org within provided time constraints
//
dvir_list_response_t*
FleetAPI_getDvirs(apiClient_t *apiClient,char* access_token ,int end_ms ,int duration_ms ,int group_id );



// /fleet/drivers
//
// Get all the drivers for the specified group.
//
drivers_response_t*
FleetAPI_getFleetDrivers(apiClient_t *apiClient,char* access_token ,inline_object_3_t* groupDriversParam );



// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
//
// Get summarized daily HOS charts for a specified driver.
//
driver_daily_log_response_t*
FleetAPI_getFleetDriversHosDailyLogs(apiClient_t *apiClient,char* access_token ,long driver_id ,inline_object_6_t* hosLogsParam );



// /fleet/drivers/summary
//
// Get the distance and time each driver in an organization has driven in a given time period.
//
drivers_summary_response_t*
FleetAPI_getFleetDriversSummary(apiClient_t *apiClient,char* access_token ,inline_object_5_t* driversSummaryParam ,int snap_to_day_bounds );



// /fleet/hos_authentication_logs
//
// Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
//
hos_authentication_logs_response_t*
FleetAPI_getFleetHosAuthenticationLogs(apiClient_t *apiClient,char* access_token ,inline_object_7_t* hosAuthenticationLogsParam );



// /fleet/hos_logs
//
// Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
//
hos_logs_response_t*
FleetAPI_getFleetHosLogs(apiClient_t *apiClient,char* access_token ,inline_object_8_t* hosLogsParam );



// /fleet/hos_logs_summary
//
// Get the current HOS status for all drivers in the group.
//
hos_logs_summary_response_t*
FleetAPI_getFleetHosLogsSummary(apiClient_t *apiClient,char* access_token ,inline_object_9_t* hosLogsParam );



// /fleet/locations
//
// Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
//
inline_response_200_3_t*
FleetAPI_getFleetLocations(apiClient_t *apiClient,char* access_token ,inline_object_11_t* groupParam );



// /fleet/maintenance/list
//
// Get list of the vehicles with any engine faults or check light data.
//
inline_response_200_4_t*
FleetAPI_getFleetMaintenanceList(apiClient_t *apiClient,char* access_token ,inline_object_13_t* groupParam );



// /fleet/trips
//
// Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
//
trip_response_t*
FleetAPI_getFleetTrips(apiClient_t *apiClient,char* access_token ,inline_object_15_t* tripsParam );



// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Gets a specific vehicle.
//
fleet_vehicle_response_t*
FleetAPI_getFleetVehicle(apiClient_t *apiClient,char* access_token ,char* vehicle_id_or_external_id );



// /addresses/{addressId}
//
// Fetch an address by its id.
//
address_t*
FleetAPI_getOrganizationAddress(apiClient_t *apiClient,char* access_token ,long addressId );



// /addresses
//
// Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
//
list_t*
FleetAPI_getOrganizationAddresses(apiClient_t *apiClient,char* access_token );



// /contacts/{contact_id}
//
// Fetch a contact by its id.
//
contact_t*
FleetAPI_getOrganizationContact(apiClient_t *apiClient,char* access_token ,long contact_id );



// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
//
// Fetch harsh event details for a vehicle.
//
vehicle_harsh_event_response_t*
FleetAPI_getVehicleHarshEvent(apiClient_t *apiClient,long vehicleId ,char* access_token ,long timestamp );



// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
//
// Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
//
list_t*
FleetAPI_getVehicleLocations(apiClient_t *apiClient,char* access_token ,long vehicle_id ,long startMs ,long endMs );



// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
//
// Fetch the safety score for the vehicle.
//
vehicle_safety_score_response_t*
FleetAPI_getVehicleSafetyScore(apiClient_t *apiClient,long vehicleId ,char* access_token ,long startMs ,long endMs );



// /fleet/vehicles/stats
//
// Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
//
inline_response_200_5_t*
FleetAPI_getVehicleStats(apiClient_t *apiClient,char* access_token ,int startMs ,int endMs ,char* series ,char* tagIds ,char* startingAfter ,char* endingBefore ,long limit );



// /fleet/vehicles/locations
//
// Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
//
list_t*
FleetAPI_getVehiclesLocations(apiClient_t *apiClient,char* access_token ,int startMs ,int endMs );



// /contacts
//
// Fetch all contacts for the organization.
//
list_t*
FleetAPI_listContacts(apiClient_t *apiClient,char* access_token );



// /fleet/list
//
// Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
//
inline_response_200_2_t*
FleetAPI_listFleet(apiClient_t *apiClient,char* access_token ,inline_object_10_t* groupParam ,char* startingAfter ,char* endingBefore ,long limit );



// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
//
fleet_vehicle_response_t*
FleetAPI_patchFleetVehicle(apiClient_t *apiClient,char* access_token ,char* vehicle_id_or_external_id ,inline_object_16_t* data );



// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Reactivate the inactive driver having id.
//
driver_t*
FleetAPI_reactivateDriverById(apiClient_t *apiClient,char* access_token ,char* driver_id_or_external_id ,inline_object_4_t* reactivateDriverParam );



// /fleet/dispatch/routes/{route_id:[0-9]+}/
//
// Update a dispatch route and its associated jobs.
//
dispatch_route_t*
FleetAPI_updateDispatchRouteById(apiClient_t *apiClient,char* access_token ,long route_id ,dispatch_route_t* updateDispatchRouteParams );



// /addresses/{addressId}
//
// Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
//
void
FleetAPI_updateOrganizationAddress(apiClient_t *apiClient,char* access_token ,long addressId ,inline_object_1_t* address );



// /fleet/set_data
//
// This method enables the mutation of metadata for vehicles in the Samsara Cloud.
//
void
FleetAPI_updateVehicles(apiClient_t *apiClient,char* access_token ,inline_object_14_t* vehicleUpdateParam );



