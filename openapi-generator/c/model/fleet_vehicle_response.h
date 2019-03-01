/*
 * fleet_vehicle_response.h
 *
 * A vehicle object as returned for fleet/vehicle
 */

#ifndef _fleet_vehicle_response_H_
#define _fleet_vehicle_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "fleet_vehicle_response_vehicle_info.h"




typedef struct fleet_vehicle_response_t {
        list_t* externalIds;
        // TODO map/hash not supported at the moment
        char *harshAccelSetting; //no enum string
        long id; //numeric
        char *name; //no enum string
        fleet_vehicle_response_vehicle_info_t *vehicleInfo; //nonprimitive

} fleet_vehicle_response_t;

fleet_vehicle_response_t *fleet_vehicle_response_create(
        list_t* externalIds,
        // TODO map/hash not supported at the moment
        char *harshAccelSetting,
        long id,
        char *name,
        fleet_vehicle_response_vehicle_info_t *vehicleInfo
);

void fleet_vehicle_response_free(fleet_vehicle_response_t *fleet_vehicle_response);

fleet_vehicle_response_t *fleet_vehicle_response_parseFromJSON(char *jsonString);

cJSON *fleet_vehicle_response_convertToJSON(fleet_vehicle_response_t *fleet_vehicle_response);

#endif /* _fleet_vehicle_response_H_ */

