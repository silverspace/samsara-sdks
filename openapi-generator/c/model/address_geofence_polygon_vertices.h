/*
 * address_geofence_polygon_vertices.h
 *
 * 
 */

#ifndef _address_geofence_polygon_vertices_H_
#define _address_geofence_polygon_vertices_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct address_geofence_polygon_vertices_t {
        double latitude; //numeric
        double longitude; //numeric

} address_geofence_polygon_vertices_t;

address_geofence_polygon_vertices_t *address_geofence_polygon_vertices_create(
        double latitude,
        double longitude
);

void address_geofence_polygon_vertices_free(address_geofence_polygon_vertices_t *address_geofence_polygon_vertices);

address_geofence_polygon_vertices_t *address_geofence_polygon_vertices_parseFromJSON(char *jsonString);

cJSON *address_geofence_polygon_vertices_convertToJSON(address_geofence_polygon_vertices_t *address_geofence_polygon_vertices);

#endif /* _address_geofence_polygon_vertices_H_ */

