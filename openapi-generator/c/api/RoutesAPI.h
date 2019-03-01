#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/all_route_job_updates.h"
#include "../model/dispatch_route.h"
#include "../model/dispatch_route_create.h"
#include "../model/dispatch_route_history.h"


// /fleet/dispatch/routes
//
// Create a new dispatch route.
//
dispatch_route_t*
RoutesAPI_createDispatchRoute(apiClient_t *apiClient,char* access_token ,dispatch_route_create_t* createDispatchRouteParams );



// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
//
// Create a new dispatch route for the driver with driver_id.
//
dispatch_route_t*
RoutesAPI_createDriverDispatchRoute(apiClient_t *apiClient,char* access_token ,long driver_id ,dispatch_route_create_t* createDispatchRouteParams );



// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
//
// Create a new dispatch route for the vehicle with vehicle_id.
//
dispatch_route_t*
RoutesAPI_createVehicleDispatchRoute(apiClient_t *apiClient,char* access_token ,long vehicle_id ,dispatch_route_create_t* createDispatchRouteParams );



// /fleet/dispatch/routes/{route_id:[0-9]+}/
//
// Delete a dispatch route and its associated jobs.
//
void
RoutesAPI_deleteDispatchRouteById(apiClient_t *apiClient,char* access_token ,long route_id );



// /fleet/dispatch/routes
//
// Fetch all of the dispatch routes for the group.
//
list_t*
RoutesAPI_fetchAllDispatchRoutes(apiClient_t *apiClient,char* access_token ,long group_id ,long end_time ,long duration );



// /fleet/dispatch/routes/job_updates
//
// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
//
all_route_job_updates_t*
RoutesAPI_fetchAllRouteJobUpdates(apiClient_t *apiClient,char* access_token ,long group_id ,char* sequence_id ,char* include );



// /fleet/dispatch/routes/{route_id:[0-9]+}
//
// Fetch a dispatch route by id.
//
dispatch_route_t*
RoutesAPI_getDispatchRouteById(apiClient_t *apiClient,char* access_token ,long route_id );



// /fleet/dispatch/routes/{route_id:[0-9]+}/history
//
// Fetch the history of a dispatch route.
//
dispatch_route_history_t*
RoutesAPI_getDispatchRouteHistory(apiClient_t *apiClient,char* access_token ,long route_id ,long start_time ,long end_time );



// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
//
// Fetch all of the dispatch routes for a given driver.
//
list_t*
RoutesAPI_getDispatchRoutesByDriverId(apiClient_t *apiClient,char* access_token ,long driver_id ,long end_time ,long duration );



// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
//
// Fetch all of the dispatch routes for a given vehicle.
//
list_t*
RoutesAPI_getDispatchRoutesByVehicleId(apiClient_t *apiClient,char* access_token ,long vehicle_id ,long end_time ,long duration );



// /fleet/dispatch/routes/{route_id:[0-9]+}/
//
// Update a dispatch route and its associated jobs.
//
dispatch_route_t*
RoutesAPI_updateDispatchRouteById(apiClient_t *apiClient,char* access_token ,long route_id ,dispatch_route_t* updateDispatchRouteParams );



