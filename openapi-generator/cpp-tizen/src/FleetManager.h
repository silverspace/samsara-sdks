#ifndef _FleetManager_H_
#define _FleetManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Address.h"
#include "AllRouteJobUpdates.h"
#include "AssetReeferResponse.h"
#include "Contact.h"
#include "DispatchRoute.h"
#include "DispatchRouteCreate.h"
#include "DispatchRouteHistory.h"
#include "Document.h"
#include "DocumentCreate.h"
#include "DocumentType.h"
#include "Driver.h"
#include "DriverDailyLogResponse.h"
#include "DriverForCreate.h"
#include "DriverSafetyScoreResponse.h"
#include "DriversResponse.h"
#include "DriversSummaryResponse.h"
#include "DvirBase.h"
#include "DvirListResponse.h"
#include "FleetVehicleLocation.h"
#include "FleetVehicleResponse.h"
#include "HosAuthenticationLogsResponse.h"
#include "HosLogsResponse.h"
#include "HosLogsSummaryResponse.h"
#include "Inline_object.h"
#include "Inline_object_1.h"
#include "Inline_object_10.h"
#include "Inline_object_11.h"
#include "Inline_object_12.h"
#include "Inline_object_13.h"
#include "Inline_object_14.h"
#include "Inline_object_15.h"
#include "Inline_object_16.h"
#include "Inline_object_2.h"
#include "Inline_object_3.h"
#include "Inline_object_4.h"
#include "Inline_object_5.h"
#include "Inline_object_6.h"
#include "Inline_object_7.h"
#include "Inline_object_8.h"
#include "Inline_object_9.h"
#include "Inline_response_200.h"
#include "Inline_response_200_1.h"
#include "Inline_response_200_2.h"
#include "Inline_response_200_3.h"
#include "Inline_response_200_4.h"
#include "Inline_response_200_5.h"
#include "TripResponse.h"
#include "VehicleHarshEventResponse.h"
#include "VehicleSafetyScoreResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Fleet Fleet
 * \ingroup Operations
 *  @{
 */
class FleetManager {
public:
	FleetManager();
	virtual ~FleetManager();

/*! \brief /fleet/add_address. *Synchronous*
 *
 * This method adds an address book entry to the specified group.
 * \param accessToken Samsara API access token. *Required*
 * \param addressParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool addFleetAddressSync(char * accessToken,
	std::string accessToken, Inline_object_2 addressParam, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief /fleet/add_address. *Asynchronous*
 *
 * This method adds an address book entry to the specified group.
 * \param accessToken Samsara API access token. *Required*
 * \param addressParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool addFleetAddressAsync(char * accessToken,
	std::string accessToken, Inline_object_2 addressParam, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief /addresses. *Synchronous*
 *
 * Add one or more addresses to the organization
 * \param accessToken Samsara API access token. *Required*
 * \param addresses  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool addOrganizationAddressesSync(char * accessToken,
	std::string accessToken, Inline_object addresses, 
	void(* handler)(std::list<Address>, Error, void* )
	, void* userData);

/*! \brief /addresses. *Asynchronous*
 *
 * Add one or more addresses to the organization
 * \param accessToken Samsara API access token. *Required*
 * \param addresses  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool addOrganizationAddressesAsync(char * accessToken,
	std::string accessToken, Inline_object addresses, 
	void(* handler)(std::list<Address>, Error, void* )
	, void* userData);


/*! \brief /fleet/dispatch/routes. *Synchronous*
 *
 * Create a new dispatch route.
 * \param accessToken Samsara API access token. *Required*
 * \param createDispatchRouteParams  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createDispatchRouteSync(char * accessToken,
	std::string accessToken, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData);

/*! \brief /fleet/dispatch/routes. *Asynchronous*
 *
 * Create a new dispatch route.
 * \param accessToken Samsara API access token. *Required*
 * \param createDispatchRouteParams  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createDispatchRouteAsync(char * accessToken,
	std::string accessToken, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/create. *Synchronous*
 *
 * Create a new driver.
 * \param accessToken Samsara API access token. *Required*
 * \param createDriverParam Driver creation body *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createDriverSync(char * accessToken,
	std::string accessToken, DriverForCreate createDriverParam, 
	void(* handler)(Driver, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/create. *Asynchronous*
 *
 * Create a new driver.
 * \param accessToken Samsara API access token. *Required*
 * \param createDriverParam Driver creation body *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createDriverAsync(char * accessToken,
	std::string accessToken, DriverForCreate createDriverParam, 
	void(* handler)(Driver, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes. *Synchronous*
 *
 * Create a new dispatch route for the driver with driver_id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverId ID of the driver with the associated routes. *Required*
 * \param createDispatchRouteParams  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createDriverDispatchRouteSync(char * accessToken,
	std::string accessToken, long long driverId, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes. *Asynchronous*
 *
 * Create a new dispatch route for the driver with driver_id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverId ID of the driver with the associated routes. *Required*
 * \param createDispatchRouteParams  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createDriverDispatchRouteAsync(char * accessToken,
	std::string accessToken, long long driverId, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/{driver_id:[0-9]+}/documents. *Synchronous*
 *
 * Create a driver document for the given driver.
 * \param accessToken Samsara API access token. *Required*
 * \param driverId ID of the driver for whom the document is created. *Required*
 * \param createDocumentParams To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createDriverDocumentSync(char * accessToken,
	std::string accessToken, long long driverId, DocumentCreate createDocumentParams, 
	void(* handler)(Document, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/{driver_id:[0-9]+}/documents. *Asynchronous*
 *
 * Create a driver document for the given driver.
 * \param accessToken Samsara API access token. *Required*
 * \param driverId ID of the driver for whom the document is created. *Required*
 * \param createDocumentParams To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createDriverDocumentAsync(char * accessToken,
	std::string accessToken, long long driverId, DocumentCreate createDocumentParams, 
	void(* handler)(Document, Error, void* )
	, void* userData);


/*! \brief /fleet/maintenance/dvirs. *Synchronous*
 *
 * Create a new dvir, marking a vehicle or trailer safe or unsafe.
 * \param accessToken Samsara API access token. *Required*
 * \param createDvirParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createDvirSync(char * accessToken,
	std::string accessToken, Inline_object_12 createDvirParam, 
	void(* handler)(DvirBase, Error, void* )
	, void* userData);

/*! \brief /fleet/maintenance/dvirs. *Asynchronous*
 *
 * Create a new dvir, marking a vehicle or trailer safe or unsafe.
 * \param accessToken Samsara API access token. *Required*
 * \param createDvirParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createDvirAsync(char * accessToken,
	std::string accessToken, Inline_object_12 createDvirParam, 
	void(* handler)(DvirBase, Error, void* )
	, void* userData);


/*! \brief /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes. *Synchronous*
 *
 * Create a new dispatch route for the vehicle with vehicle_id.
 * \param accessToken Samsara API access token. *Required*
 * \param vehicleId ID of the vehicle with the associated routes. *Required*
 * \param createDispatchRouteParams  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createVehicleDispatchRouteSync(char * accessToken,
	std::string accessToken, long long vehicleId, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData);

/*! \brief /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes. *Asynchronous*
 *
 * Create a new dispatch route for the vehicle with vehicle_id.
 * \param accessToken Samsara API access token. *Required*
 * \param vehicleId ID of the vehicle with the associated routes. *Required*
 * \param createDispatchRouteParams  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createVehicleDispatchRouteAsync(char * accessToken,
	std::string accessToken, long long vehicleId, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Synchronous*
 *
 * Deactivate a driver with the given id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deactivateDriverSync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Asynchronous*
 *
 * Deactivate a driver with the given id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deactivateDriverAsync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief /fleet/dispatch/routes/{route_id:[0-9]+}/. *Synchronous*
 *
 * Delete a dispatch route and its associated jobs.
 * \param accessToken Samsara API access token. *Required*
 * \param routeId ID of the dispatch route. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteDispatchRouteByIdSync(char * accessToken,
	std::string accessToken, long long routeId, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief /fleet/dispatch/routes/{route_id:[0-9]+}/. *Asynchronous*
 *
 * Delete a dispatch route and its associated jobs.
 * \param accessToken Samsara API access token. *Required*
 * \param routeId ID of the dispatch route. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteDispatchRouteByIdAsync(char * accessToken,
	std::string accessToken, long long routeId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief /addresses/{addressId}. *Synchronous*
 *
 * Delete an address.
 * \param accessToken Samsara API access token. *Required*
 * \param addressId ID of the address/geofence *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteOrganizationAddressSync(char * accessToken,
	std::string accessToken, long long addressId, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief /addresses/{addressId}. *Asynchronous*
 *
 * Delete an address.
 * \param accessToken Samsara API access token. *Required*
 * \param addressId ID of the address/geofence *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteOrganizationAddressAsync(char * accessToken,
	std::string accessToken, long long addressId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief /fleet/dispatch/routes. *Synchronous*
 *
 * Fetch all of the dispatch routes for the group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
 * \param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool fetchAllDispatchRoutesSync(char * accessToken,
	std::string accessToken, long long groupId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData);

/*! \brief /fleet/dispatch/routes. *Asynchronous*
 *
 * Fetch all of the dispatch routes for the group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
 * \param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool fetchAllDispatchRoutesAsync(char * accessToken,
	std::string accessToken, long long groupId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData);


/*! \brief /fleet/dispatch/routes/job_updates. *Synchronous*
 *
 * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
 * \param include Optionally set include=route to include route object in response payload.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool fetchAllRouteJobUpdatesSync(char * accessToken,
	std::string accessToken, long long groupId, std::string sequenceId, std::string include, 
	void(* handler)(AllRouteJobUpdates, Error, void* )
	, void* userData);

/*! \brief /fleet/dispatch/routes/job_updates. *Asynchronous*
 *
 * Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.
 * \param include Optionally set include=route to include route object in response payload.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool fetchAllRouteJobUpdatesAsync(char * accessToken,
	std::string accessToken, long long groupId, std::string sequenceId, std::string include, 
	void(* handler)(AllRouteJobUpdates, Error, void* )
	, void* userData);


/*! \brief /fleet/assets/locations. *Synchronous*
 *
 * Fetch current locations of all assets for the group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAllAssetCurrentLocationsSync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200_1, Error, void* )
	, void* userData);

/*! \brief /fleet/assets/locations. *Asynchronous*
 *
 * Fetch current locations of all assets for the group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAllAssetCurrentLocationsAsync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200_1, Error, void* )
	, void* userData);


/*! \brief /fleet/assets. *Synchronous*
 *
 * Fetch all of the assets for the group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAllAssetsSync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200, Error, void* )
	, void* userData);

/*! \brief /fleet/assets. *Asynchronous*
 *
 * Fetch all of the assets for the group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAllAssetsAsync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/inactive. *Synchronous*
 *
 * Fetch all deactivated drivers for the group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAllDeactivatedDriversSync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(std::list<Driver>, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/inactive. *Asynchronous*
 *
 * Fetch all deactivated drivers for the group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAllDeactivatedDriversAsync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(std::list<Driver>, Error, void* )
	, void* userData);


/*! \brief /fleet/assets/{assetId:[0-9]+}/locations. *Synchronous*
 *
 * Fetch the historical locations for the asset.
 * \param accessToken Samsara API access token. *Required*
 * \param assetId ID of the asset *Required*
 * \param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. *Required*
 * \param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAssetLocationSync(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);

/*! \brief /fleet/assets/{assetId:[0-9]+}/locations. *Asynchronous*
 *
 * Fetch the historical locations for the asset.
 * \param accessToken Samsara API access token. *Required*
 * \param assetId ID of the asset *Required*
 * \param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. *Required*
 * \param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAssetLocationAsync(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);


/*! \brief /fleet/assets/{assetId:[0-9]+}/reefer. *Synchronous*
 *
 * Fetch the reefer-specific stats of an asset.
 * \param accessToken Samsara API access token. *Required*
 * \param assetId ID of the asset *Required*
 * \param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. *Required*
 * \param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAssetReeferSync(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(AssetReeferResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/assets/{assetId:[0-9]+}/reefer. *Asynchronous*
 *
 * Fetch the reefer-specific stats of an asset.
 * \param accessToken Samsara API access token. *Required*
 * \param assetId ID of the asset *Required*
 * \param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. *Required*
 * \param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAssetReeferAsync(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(AssetReeferResponse, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Synchronous*
 *
 * Fetch deactivated driver by id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDeactivatedDriverByIdSync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Asynchronous*
 *
 * Fetch deactivated driver by id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDeactivatedDriverByIdAsync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
	, void* userData);


/*! \brief /fleet/dispatch/routes/{route_id:[0-9]+}. *Synchronous*
 *
 * Fetch a dispatch route by id.
 * \param accessToken Samsara API access token. *Required*
 * \param routeId ID of the dispatch route. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDispatchRouteByIdSync(char * accessToken,
	std::string accessToken, long long routeId, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData);

/*! \brief /fleet/dispatch/routes/{route_id:[0-9]+}. *Asynchronous*
 *
 * Fetch a dispatch route by id.
 * \param accessToken Samsara API access token. *Required*
 * \param routeId ID of the dispatch route. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDispatchRouteByIdAsync(char * accessToken,
	std::string accessToken, long long routeId, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData);


/*! \brief /fleet/dispatch/routes/{route_id:[0-9]+}/history. *Synchronous*
 *
 * Fetch the history of a dispatch route.
 * \param accessToken Samsara API access token. *Required*
 * \param routeId ID of the route with history. *Required*
 * \param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
 * \param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDispatchRouteHistorySync(char * accessToken,
	std::string accessToken, long long routeId, long long startTime, long long endTime, 
	void(* handler)(DispatchRouteHistory, Error, void* )
	, void* userData);

/*! \brief /fleet/dispatch/routes/{route_id:[0-9]+}/history. *Asynchronous*
 *
 * Fetch the history of a dispatch route.
 * \param accessToken Samsara API access token. *Required*
 * \param routeId ID of the route with history. *Required*
 * \param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.
 * \param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDispatchRouteHistoryAsync(char * accessToken,
	std::string accessToken, long long routeId, long long startTime, long long endTime, 
	void(* handler)(DispatchRouteHistory, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes. *Synchronous*
 *
 * Fetch all of the dispatch routes for a given driver.
 * \param accessToken Samsara API access token. *Required*
 * \param driverId ID of the driver with the associated routes. *Required*
 * \param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
 * \param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDispatchRoutesByDriverIdSync(char * accessToken,
	std::string accessToken, long long driverId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes. *Asynchronous*
 *
 * Fetch all of the dispatch routes for a given driver.
 * \param accessToken Samsara API access token. *Required*
 * \param driverId ID of the driver with the associated routes. *Required*
 * \param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
 * \param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDispatchRoutesByDriverIdAsync(char * accessToken,
	std::string accessToken, long long driverId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData);


/*! \brief /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes. *Synchronous*
 *
 * Fetch all of the dispatch routes for a given vehicle.
 * \param accessToken Samsara API access token. *Required*
 * \param vehicleId ID of the vehicle with the associated routes. *Required*
 * \param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
 * \param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDispatchRoutesByVehicleIdSync(char * accessToken,
	std::string accessToken, long long vehicleId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData);

/*! \brief /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes. *Asynchronous*
 *
 * Fetch all of the dispatch routes for a given vehicle.
 * \param accessToken Samsara API access token. *Required*
 * \param vehicleId ID of the vehicle with the associated routes. *Required*
 * \param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.
 * \param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDispatchRoutesByVehicleIdAsync(char * accessToken,
	std::string accessToken, long long vehicleId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Synchronous*
 *
 * Fetch driver by id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDriverByIdSync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Asynchronous*
 *
 * Fetch driver by id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDriverByIdAsync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/document_types. *Synchronous*
 *
 * Fetch all of the document types.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDriverDocumentTypesByOrgIdSync(char * accessToken,
	
	void(* handler)(std::list<DocumentType>, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/document_types. *Asynchronous*
 *
 * Fetch all of the document types.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDriverDocumentTypesByOrgIdAsync(char * accessToken,
	
	void(* handler)(std::list<DocumentType>, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/documents. *Synchronous*
 *
 * Fetch all of the documents.
 * \param accessToken Samsara API access token. *Required*
 * \param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
 * \param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDriverDocumentsByOrgIdSync(char * accessToken,
	std::string accessToken, long long endMs, long long durationMs, 
	void(* handler)(std::list<Document>, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/documents. *Asynchronous*
 *
 * Fetch all of the documents.
 * \param accessToken Samsara API access token. *Required*
 * \param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.
 * \param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDriverDocumentsByOrgIdAsync(char * accessToken,
	std::string accessToken, long long endMs, long long durationMs, 
	void(* handler)(std::list<Document>, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/{driverId:[0-9]+}/safety/score. *Synchronous*
 *
 * Fetch the safety score for the driver.
 * \param driverId ID of the driver *Required*
 * \param accessToken Samsara API access token. *Required*
 * \param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. *Required*
 * \param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDriverSafetyScoreSync(char * accessToken,
	long long driverId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(DriverSafetyScoreResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/{driverId:[0-9]+}/safety/score. *Asynchronous*
 *
 * Fetch the safety score for the driver.
 * \param driverId ID of the driver *Required*
 * \param accessToken Samsara API access token. *Required*
 * \param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. *Required*
 * \param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDriverSafetyScoreAsync(char * accessToken,
	long long driverId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(DriverSafetyScoreResponse, Error, void* )
	, void* userData);


/*! \brief /fleet/maintenance/dvirs. *Synchronous*
 *
 * Get DVIRs for the org within provided time constraints
 * \param accessToken Samsara API access token. *Required*
 * \param endMs time in millis until the last dvir log. *Required*
 * \param durationMs time in millis which corresponds to the duration before the end_ms. *Required*
 * \param groupId Group ID to query.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDvirsSync(char * accessToken,
	std::string accessToken, int endMs, int durationMs, int groupId, 
	void(* handler)(DvirListResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/maintenance/dvirs. *Asynchronous*
 *
 * Get DVIRs for the org within provided time constraints
 * \param accessToken Samsara API access token. *Required*
 * \param endMs time in millis until the last dvir log. *Required*
 * \param durationMs time in millis which corresponds to the duration before the end_ms. *Required*
 * \param groupId Group ID to query.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDvirsAsync(char * accessToken,
	std::string accessToken, int endMs, int durationMs, int groupId, 
	void(* handler)(DvirListResponse, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers. *Synchronous*
 *
 * Get all the drivers for the specified group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupDriversParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetDriversSync(char * accessToken,
	std::string accessToken, Inline_object_3 groupDriversParam, 
	void(* handler)(DriversResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers. *Asynchronous*
 *
 * Get all the drivers for the specified group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupDriversParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetDriversAsync(char * accessToken,
	std::string accessToken, Inline_object_3 groupDriversParam, 
	void(* handler)(DriversResponse, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs. *Synchronous*
 *
 * Get summarized daily HOS charts for a specified driver.
 * \param accessToken Samsara API access token. *Required*
 * \param driverId ID of the driver with HOS logs. *Required*
 * \param hosLogsParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetDriversHosDailyLogsSync(char * accessToken,
	std::string accessToken, long long driverId, Inline_object_6 hosLogsParam, 
	void(* handler)(DriverDailyLogResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs. *Asynchronous*
 *
 * Get summarized daily HOS charts for a specified driver.
 * \param accessToken Samsara API access token. *Required*
 * \param driverId ID of the driver with HOS logs. *Required*
 * \param hosLogsParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetDriversHosDailyLogsAsync(char * accessToken,
	std::string accessToken, long long driverId, Inline_object_6 hosLogsParam, 
	void(* handler)(DriverDailyLogResponse, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/summary. *Synchronous*
 *
 * Get the distance and time each driver in an organization has driven in a given time period.
 * \param accessToken Samsara API access token. *Required*
 * \param driversSummaryParam  *Required*
 * \param snapToDayBounds Snap query result to HOS day boundaries.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetDriversSummarySync(char * accessToken,
	std::string accessToken, Inline_object_5 driversSummaryParam, bool snapToDayBounds, 
	void(* handler)(DriversSummaryResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/summary. *Asynchronous*
 *
 * Get the distance and time each driver in an organization has driven in a given time period.
 * \param accessToken Samsara API access token. *Required*
 * \param driversSummaryParam  *Required*
 * \param snapToDayBounds Snap query result to HOS day boundaries.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetDriversSummaryAsync(char * accessToken,
	std::string accessToken, Inline_object_5 driversSummaryParam, bool snapToDayBounds, 
	void(* handler)(DriversSummaryResponse, Error, void* )
	, void* userData);


/*! \brief /fleet/hos_authentication_logs. *Synchronous*
 *
 * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
 * \param accessToken Samsara API access token. *Required*
 * \param hosAuthenticationLogsParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetHosAuthenticationLogsSync(char * accessToken,
	std::string accessToken, Inline_object_7 hosAuthenticationLogsParam, 
	void(* handler)(HosAuthenticationLogsResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/hos_authentication_logs. *Asynchronous*
 *
 * Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
 * \param accessToken Samsara API access token. *Required*
 * \param hosAuthenticationLogsParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetHosAuthenticationLogsAsync(char * accessToken,
	std::string accessToken, Inline_object_7 hosAuthenticationLogsParam, 
	void(* handler)(HosAuthenticationLogsResponse, Error, void* )
	, void* userData);


/*! \brief /fleet/hos_logs. *Synchronous*
 *
 * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
 * \param accessToken Samsara API access token. *Required*
 * \param hosLogsParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetHosLogsSync(char * accessToken,
	std::string accessToken, Inline_object_8 hosLogsParam, 
	void(* handler)(HosLogsResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/hos_logs. *Asynchronous*
 *
 * Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
 * \param accessToken Samsara API access token. *Required*
 * \param hosLogsParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetHosLogsAsync(char * accessToken,
	std::string accessToken, Inline_object_8 hosLogsParam, 
	void(* handler)(HosLogsResponse, Error, void* )
	, void* userData);


/*! \brief /fleet/hos_logs_summary. *Synchronous*
 *
 * Get the current HOS status for all drivers in the group.
 * \param accessToken Samsara API access token. *Required*
 * \param hosLogsParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetHosLogsSummarySync(char * accessToken,
	std::string accessToken, Inline_object_9 hosLogsParam, 
	void(* handler)(HosLogsSummaryResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/hos_logs_summary. *Asynchronous*
 *
 * Get the current HOS status for all drivers in the group.
 * \param accessToken Samsara API access token. *Required*
 * \param hosLogsParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetHosLogsSummaryAsync(char * accessToken,
	std::string accessToken, Inline_object_9 hosLogsParam, 
	void(* handler)(HosLogsSummaryResponse, Error, void* )
	, void* userData);


/*! \brief /fleet/locations. *Synchronous*
 *
 * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetLocationsSync(char * accessToken,
	std::string accessToken, Inline_object_11 groupParam, 
	void(* handler)(Inline_response_200_3, Error, void* )
	, void* userData);

/*! \brief /fleet/locations. *Asynchronous*
 *
 * Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetLocationsAsync(char * accessToken,
	std::string accessToken, Inline_object_11 groupParam, 
	void(* handler)(Inline_response_200_3, Error, void* )
	, void* userData);


/*! \brief /fleet/maintenance/list. *Synchronous*
 *
 * Get list of the vehicles with any engine faults or check light data.
 * \param accessToken Samsara API access token. *Required*
 * \param groupParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetMaintenanceListSync(char * accessToken,
	std::string accessToken, Inline_object_13 groupParam, 
	void(* handler)(Inline_response_200_4, Error, void* )
	, void* userData);

/*! \brief /fleet/maintenance/list. *Asynchronous*
 *
 * Get list of the vehicles with any engine faults or check light data.
 * \param accessToken Samsara API access token. *Required*
 * \param groupParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetMaintenanceListAsync(char * accessToken,
	std::string accessToken, Inline_object_13 groupParam, 
	void(* handler)(Inline_response_200_4, Error, void* )
	, void* userData);


/*! \brief /fleet/trips. *Synchronous*
 *
 * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
 * \param accessToken Samsara API access token. *Required*
 * \param tripsParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetTripsSync(char * accessToken,
	std::string accessToken, Inline_object_15 tripsParam, 
	void(* handler)(TripResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/trips. *Asynchronous*
 *
 * Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
 * \param accessToken Samsara API access token. *Required*
 * \param tripsParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetTripsAsync(char * accessToken,
	std::string accessToken, Inline_object_15 tripsParam, 
	void(* handler)(TripResponse, Error, void* )
	, void* userData);


/*! \brief /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Synchronous*
 *
 * Gets a specific vehicle.
 * \param accessToken Samsara API access token. *Required*
 * \param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetVehicleSync(char * accessToken,
	std::string accessToken, std::string vehicleIdOrExternalId, 
	void(* handler)(FleetVehicleResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Asynchronous*
 *
 * Gets a specific vehicle.
 * \param accessToken Samsara API access token. *Required*
 * \param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getFleetVehicleAsync(char * accessToken,
	std::string accessToken, std::string vehicleIdOrExternalId, 
	void(* handler)(FleetVehicleResponse, Error, void* )
	, void* userData);


/*! \brief /addresses/{addressId}. *Synchronous*
 *
 * Fetch an address by its id.
 * \param accessToken Samsara API access token. *Required*
 * \param addressId ID of the address/geofence *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getOrganizationAddressSync(char * accessToken,
	std::string accessToken, long long addressId, 
	void(* handler)(Address, Error, void* )
	, void* userData);

/*! \brief /addresses/{addressId}. *Asynchronous*
 *
 * Fetch an address by its id.
 * \param accessToken Samsara API access token. *Required*
 * \param addressId ID of the address/geofence *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getOrganizationAddressAsync(char * accessToken,
	std::string accessToken, long long addressId, 
	void(* handler)(Address, Error, void* )
	, void* userData);


/*! \brief /addresses. *Synchronous*
 *
 * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
 * \param accessToken Samsara API access token. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getOrganizationAddressesSync(char * accessToken,
	std::string accessToken, 
	void(* handler)(std::list<Address>, Error, void* )
	, void* userData);

/*! \brief /addresses. *Asynchronous*
 *
 * Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
 * \param accessToken Samsara API access token. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getOrganizationAddressesAsync(char * accessToken,
	std::string accessToken, 
	void(* handler)(std::list<Address>, Error, void* )
	, void* userData);


/*! \brief /contacts/{contact_id}. *Synchronous*
 *
 * Fetch a contact by its id.
 * \param accessToken Samsara API access token. *Required*
 * \param contactId ID of the contact *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getOrganizationContactSync(char * accessToken,
	std::string accessToken, long long contactId, 
	void(* handler)(Contact, Error, void* )
	, void* userData);

/*! \brief /contacts/{contact_id}. *Asynchronous*
 *
 * Fetch a contact by its id.
 * \param accessToken Samsara API access token. *Required*
 * \param contactId ID of the contact *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getOrganizationContactAsync(char * accessToken,
	std::string accessToken, long long contactId, 
	void(* handler)(Contact, Error, void* )
	, void* userData);


/*! \brief /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event. *Synchronous*
 *
 * Fetch harsh event details for a vehicle.
 * \param vehicleId ID of the vehicle *Required*
 * \param accessToken Samsara API access token. *Required*
 * \param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVehicleHarshEventSync(char * accessToken,
	long long vehicleId, std::string accessToken, long long timestamp, 
	void(* handler)(VehicleHarshEventResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event. *Asynchronous*
 *
 * Fetch harsh event details for a vehicle.
 * \param vehicleId ID of the vehicle *Required*
 * \param accessToken Samsara API access token. *Required*
 * \param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVehicleHarshEventAsync(char * accessToken,
	long long vehicleId, std::string accessToken, long long timestamp, 
	void(* handler)(VehicleHarshEventResponse, Error, void* )
	, void* userData);


/*! \brief /fleet/vehicles/{vehicle_id:[0-9]+}/locations. *Synchronous*
 *
 * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
 * \param accessToken Samsara API access token. *Required*
 * \param vehicleId ID of the vehicle with the associated routes. *Required*
 * \param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) *Required*
 * \param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVehicleLocationsSync(char * accessToken,
	std::string accessToken, long long vehicleId, long long startMs, long long endMs, 
	void(* handler)(std::list<FleetVehicleLocation>, Error, void* )
	, void* userData);

/*! \brief /fleet/vehicles/{vehicle_id:[0-9]+}/locations. *Asynchronous*
 *
 * Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
 * \param accessToken Samsara API access token. *Required*
 * \param vehicleId ID of the vehicle with the associated routes. *Required*
 * \param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) *Required*
 * \param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVehicleLocationsAsync(char * accessToken,
	std::string accessToken, long long vehicleId, long long startMs, long long endMs, 
	void(* handler)(std::list<FleetVehicleLocation>, Error, void* )
	, void* userData);


/*! \brief /fleet/vehicles/{vehicleId:[0-9]+}/safety/score. *Synchronous*
 *
 * Fetch the safety score for the vehicle.
 * \param vehicleId ID of the vehicle *Required*
 * \param accessToken Samsara API access token. *Required*
 * \param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. *Required*
 * \param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVehicleSafetyScoreSync(char * accessToken,
	long long vehicleId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(VehicleSafetyScoreResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/vehicles/{vehicleId:[0-9]+}/safety/score. *Asynchronous*
 *
 * Fetch the safety score for the vehicle.
 * \param vehicleId ID of the vehicle *Required*
 * \param accessToken Samsara API access token. *Required*
 * \param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. *Required*
 * \param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVehicleSafetyScoreAsync(char * accessToken,
	long long vehicleId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(VehicleSafetyScoreResponse, Error, void* )
	, void* userData);


/*! \brief /fleet/vehicles/stats. *Synchronous*
 *
 * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
 * \param accessToken Samsara API access token. *Required*
 * \param startMs Time in Unix epoch milliseconds for the start of the query. *Required*
 * \param endMs Time in Unix epoch milliseconds for the end of the query. *Required*
 * \param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2
 * \param tagIds Comma-separated list of tag ids. Example: tagIds=1,2,3
 * \param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
 * \param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
 * \param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVehicleStatsSync(char * accessToken,
	std::string accessToken, int startMs, int endMs, std::string series, std::string tagIds, std::string startingAfter, std::string endingBefore, long long limit, 
	void(* handler)(Inline_response_200_5, Error, void* )
	, void* userData);

/*! \brief /fleet/vehicles/stats. *Asynchronous*
 *
 * Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
 * \param accessToken Samsara API access token. *Required*
 * \param startMs Time in Unix epoch milliseconds for the start of the query. *Required*
 * \param endMs Time in Unix epoch milliseconds for the end of the query. *Required*
 * \param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2
 * \param tagIds Comma-separated list of tag ids. Example: tagIds=1,2,3
 * \param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
 * \param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
 * \param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVehicleStatsAsync(char * accessToken,
	std::string accessToken, int startMs, int endMs, std::string series, std::string tagIds, std::string startingAfter, std::string endingBefore, long long limit, 
	void(* handler)(Inline_response_200_5, Error, void* )
	, void* userData);


/*! \brief /fleet/vehicles/locations. *Synchronous*
 *
 * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
 * \param accessToken Samsara API access token. *Required*
 * \param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) *Required*
 * \param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVehiclesLocationsSync(char * accessToken,
	std::string accessToken, int startMs, int endMs, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);

/*! \brief /fleet/vehicles/locations. *Asynchronous*
 *
 * Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
 * \param accessToken Samsara API access token. *Required*
 * \param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) *Required*
 * \param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVehiclesLocationsAsync(char * accessToken,
	std::string accessToken, int startMs, int endMs, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);


/*! \brief /contacts. *Synchronous*
 *
 * Fetch all contacts for the organization.
 * \param accessToken Samsara API access token. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listContactsSync(char * accessToken,
	std::string accessToken, 
	void(* handler)(std::list<Contact>, Error, void* )
	, void* userData);

/*! \brief /contacts. *Asynchronous*
 *
 * Fetch all contacts for the organization.
 * \param accessToken Samsara API access token. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listContactsAsync(char * accessToken,
	std::string accessToken, 
	void(* handler)(std::list<Contact>, Error, void* )
	, void* userData);


/*! \brief /fleet/list. *Synchronous*
 *
 * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
 * \param accessToken Samsara API access token. *Required*
 * \param groupParam  *Required*
 * \param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
 * \param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
 * \param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFleetSync(char * accessToken,
	std::string accessToken, Inline_object_10 groupParam, std::string startingAfter, std::string endingBefore, long long limit, 
	void(* handler)(Inline_response_200_2, Error, void* )
	, void* userData);

/*! \brief /fleet/list. *Asynchronous*
 *
 * Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
 * \param accessToken Samsara API access token. *Required*
 * \param groupParam  *Required*
 * \param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.
 * \param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.
 * \param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFleetAsync(char * accessToken,
	std::string accessToken, Inline_object_10 groupParam, std::string startingAfter, std::string endingBefore, long long limit, 
	void(* handler)(Inline_response_200_2, Error, void* )
	, void* userData);


/*! \brief /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Synchronous*
 *
 * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
 * \param accessToken Samsara API access token. *Required*
 * \param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. *Required*
 * \param data  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool patchFleetVehicleSync(char * accessToken,
	std::string accessToken, std::string vehicleIdOrExternalId, Inline_object_16 data, 
	void(* handler)(FleetVehicleResponse, Error, void* )
	, void* userData);

/*! \brief /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Asynchronous*
 *
 * Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
 * \param accessToken Samsara API access token. *Required*
 * \param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. *Required*
 * \param data  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool patchFleetVehicleAsync(char * accessToken,
	std::string accessToken, std::string vehicleIdOrExternalId, Inline_object_16 data, 
	void(* handler)(FleetVehicleResponse, Error, void* )
	, void* userData);


/*! \brief /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Synchronous*
 *
 * Reactivate the inactive driver having id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. *Required*
 * \param reactivateDriverParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool reactivateDriverByIdSync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, Inline_object_4 reactivateDriverParam, 
	void(* handler)(Driver, Error, void* )
	, void* userData);

/*! \brief /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}. *Asynchronous*
 *
 * Reactivate the inactive driver having id.
 * \param accessToken Samsara API access token. *Required*
 * \param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. *Required*
 * \param reactivateDriverParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool reactivateDriverByIdAsync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, Inline_object_4 reactivateDriverParam, 
	void(* handler)(Driver, Error, void* )
	, void* userData);


/*! \brief /fleet/dispatch/routes/{route_id:[0-9]+}/. *Synchronous*
 *
 * Update a dispatch route and its associated jobs.
 * \param accessToken Samsara API access token. *Required*
 * \param routeId ID of the dispatch route. *Required*
 * \param updateDispatchRouteParams  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateDispatchRouteByIdSync(char * accessToken,
	std::string accessToken, long long routeId, DispatchRoute updateDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData);

/*! \brief /fleet/dispatch/routes/{route_id:[0-9]+}/. *Asynchronous*
 *
 * Update a dispatch route and its associated jobs.
 * \param accessToken Samsara API access token. *Required*
 * \param routeId ID of the dispatch route. *Required*
 * \param updateDispatchRouteParams  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateDispatchRouteByIdAsync(char * accessToken,
	std::string accessToken, long long routeId, DispatchRoute updateDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData);


/*! \brief /addresses/{addressId}. *Synchronous*
 *
 * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
 * \param accessToken Samsara API access token. *Required*
 * \param addressId ID of the address/geofence *Required*
 * \param address  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateOrganizationAddressSync(char * accessToken,
	std::string accessToken, long long addressId, Inline_object_1 address, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief /addresses/{addressId}. *Asynchronous*
 *
 * Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
 * \param accessToken Samsara API access token. *Required*
 * \param addressId ID of the address/geofence *Required*
 * \param address  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateOrganizationAddressAsync(char * accessToken,
	std::string accessToken, long long addressId, Inline_object_1 address, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief /fleet/set_data. *Synchronous*
 *
 * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
 * \param accessToken Samsara API access token. *Required*
 * \param vehicleUpdateParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateVehiclesSync(char * accessToken,
	std::string accessToken, Inline_object_14 vehicleUpdateParam, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief /fleet/set_data. *Asynchronous*
 *
 * This method enables the mutation of metadata for vehicles in the Samsara Cloud.
 * \param accessToken Samsara API access token. *Required*
 * \param vehicleUpdateParam  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateVehiclesAsync(char * accessToken,
	std::string accessToken, Inline_object_14 vehicleUpdateParam, 
	
	void(* handler)(Error, void* ) , void* userData);



	static std::string getBasePath()
	{
		return "https://api.samsara.com/v1";
	}
};
/** @}*/

}
}
#endif /* FleetManager_H_ */
