#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/driver_safety_score_response.h"
#include "../model/vehicle_harsh_event_response.h"
#include "../model/vehicle_safety_score_response.h"


// /fleet/drivers/{driverId:[0-9]+}/safety/score
//
// Fetch the safety score for the driver.
//
driver_safety_score_response_t*
SafetyAPI_getDriverSafetyScore(apiClient_t *apiClient,long driverId ,char* access_token ,long startMs ,long endMs );



// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
//
// Fetch harsh event details for a vehicle.
//
vehicle_harsh_event_response_t*
SafetyAPI_getVehicleHarshEvent(apiClient_t *apiClient,long vehicleId ,char* access_token ,long timestamp );



// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
//
// Fetch the safety score for the vehicle.
//
vehicle_safety_score_response_t*
SafetyAPI_getVehicleSafetyScore(apiClient_t *apiClient,long vehicleId ,char* access_token ,long startMs ,long endMs );



