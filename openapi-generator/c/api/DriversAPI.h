#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/driver.h"
#include "../model/driver_for_create.h"
#include "../model/inline_object_4.h"


// /fleet/drivers/create
//
// Create a new driver.
//
driver_t*
DriversAPI_createDriver(apiClient_t *apiClient,char* access_token ,driver_for_create_t* createDriverParam );



// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Deactivate a driver with the given id.
//
void
DriversAPI_deactivateDriver(apiClient_t *apiClient,char* access_token ,char* driver_id_or_external_id );



// /fleet/drivers/inactive
//
// Fetch all deactivated drivers for the group.
//
list_t*
DriversAPI_getAllDeactivatedDrivers(apiClient_t *apiClient,char* access_token ,long group_id );



// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Fetch deactivated driver by id.
//
driver_t*
DriversAPI_getDeactivatedDriverById(apiClient_t *apiClient,char* access_token ,char* driver_id_or_external_id );



// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Fetch driver by id.
//
driver_t*
DriversAPI_getDriverById(apiClient_t *apiClient,char* access_token ,char* driver_id_or_external_id );



// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
//
// Reactivate the inactive driver having id.
//
driver_t*
DriversAPI_reactivateDriverById(apiClient_t *apiClient,char* access_token ,char* driver_id_or_external_id ,inline_object_4_t* reactivateDriverParam );



