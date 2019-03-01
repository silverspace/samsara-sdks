/*
 * address_geofence_circle.h
 *
 * Information about a circular geofence. This field is only populated if the geofence is a circle.
 */

#ifndef _address_geofence_circle_H_
#define _address_geofence_circle_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct address_geofence_circle_t {
        double latitude; //numeric
        long radiusMeters; //numeric
        double longitude; //numeric

} address_geofence_circle_t;

address_geofence_circle_t *address_geofence_circle_create(
        double latitude,
        long radiusMeters,
        double longitude
);

void address_geofence_circle_free(address_geofence_circle_t *address_geofence_circle);

address_geofence_circle_t *address_geofence_circle_parseFromJSON(char *jsonString);

cJSON *address_geofence_circle_convertToJSON(address_geofence_circle_t *address_geofence_circle);

#endif /* _address_geofence_circle_H_ */

