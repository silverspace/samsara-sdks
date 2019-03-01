/*
 * fleet_vehicle_response_vehicle_info.h
 *
 * 
 */

#ifndef _fleet_vehicle_response_vehicle_info_H_
#define _fleet_vehicle_response_vehicle_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct fleet_vehicle_response_vehicle_info_t {
        long year; //numeric
        char *model; //no enum string
        char *vin; //no enum string
        char *make; //no enum string

} fleet_vehicle_response_vehicle_info_t;

fleet_vehicle_response_vehicle_info_t *fleet_vehicle_response_vehicle_info_create(
        long year,
        char *model,
        char *vin,
        char *make
);

void fleet_vehicle_response_vehicle_info_free(fleet_vehicle_response_vehicle_info_t *fleet_vehicle_response_vehicle_info);

fleet_vehicle_response_vehicle_info_t *fleet_vehicle_response_vehicle_info_parseFromJSON(char *jsonString);

cJSON *fleet_vehicle_response_vehicle_info_convertToJSON(fleet_vehicle_response_vehicle_info_t *fleet_vehicle_response_vehicle_info);

#endif /* _fleet_vehicle_response_vehicle_info_H_ */

