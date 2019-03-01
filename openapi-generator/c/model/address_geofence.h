/*
 * address_geofence.h
 *
 * The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
 */

#ifndef _address_geofence_H_
#define _address_geofence_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "address_geofence_circle.h"
#include "address_geofence_polygon.h"




typedef struct address_geofence_t {
        address_geofence_circle_t *circle; //nonprimitive
        address_geofence_polygon_t *polygon; //nonprimitive

} address_geofence_t;

address_geofence_t *address_geofence_create(
        address_geofence_circle_t *circle,
        address_geofence_polygon_t *polygon
);

void address_geofence_free(address_geofence_t *address_geofence);

address_geofence_t *address_geofence_parseFromJSON(char *jsonString);

cJSON *address_geofence_convertToJSON(address_geofence_t *address_geofence);

#endif /* _address_geofence_H_ */

