/*
 * address_geofence_polygon.h
 *
 * Information about a polygon geofence. This field is only populated if the geofence is a polygon.
 */

#ifndef _address_geofence_polygon_H_
#define _address_geofence_polygon_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "address_geofence_polygon_vertices.h"




typedef struct address_geofence_polygon_t {
        list_t *vertices; //nonprimitive container

} address_geofence_polygon_t;

address_geofence_polygon_t *address_geofence_polygon_create(
        list_t *vertices
);

void address_geofence_polygon_free(address_geofence_polygon_t *address_geofence_polygon);

address_geofence_polygon_t *address_geofence_polygon_parseFromJSON(char *jsonString);

cJSON *address_geofence_polygon_convertToJSON(address_geofence_polygon_t *address_geofence_polygon);

#endif /* _address_geofence_polygon_H_ */

