#ifndef _RoutesManager_H_
#define _RoutesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AllRouteJobUpdates.h"
#include "DispatchRoute.h"
#include "DispatchRouteCreate.h"
#include "DispatchRouteHistory.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Routes Routes
 * \ingroup Operations
 *  @{
 */
class RoutesManager {
public:
	RoutesManager();
	virtual ~RoutesManager();

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



	static std::string getBasePath()
	{
		return "https://api.samsara.com/v1";
	}
};
/** @}*/

}
}
#endif /* RoutesManager_H_ */
