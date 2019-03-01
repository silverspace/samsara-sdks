#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "address_geofence_polygon_vertices.h"



address_geofence_polygon_vertices_t *address_geofence_polygon_vertices_create(
    double latitude,
    double longitude
    ) {
	address_geofence_polygon_vertices_t *address_geofence_polygon_vertices = malloc(sizeof(address_geofence_polygon_vertices_t));
	address_geofence_polygon_vertices->latitude = latitude;
	address_geofence_polygon_vertices->longitude = longitude;

	return address_geofence_polygon_vertices;
}


void address_geofence_polygon_vertices_free(address_geofence_polygon_vertices_t *address_geofence_polygon_vertices) {
    listEntry_t *listEntry;

	free(address_geofence_polygon_vertices);
}

cJSON *address_geofence_polygon_vertices_convertToJSON(address_geofence_polygon_vertices_t *address_geofence_polygon_vertices) {
	cJSON *item = cJSON_CreateObject();
	// address_geofence_polygon_vertices->latitude
    if(cJSON_AddNumberToObject(item, "latitude", address_geofence_polygon_vertices->latitude) == NULL) {
    goto fail; //Numeric
    }

	// address_geofence_polygon_vertices->longitude
    if(cJSON_AddNumberToObject(item, "longitude", address_geofence_polygon_vertices->longitude) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

address_geofence_polygon_vertices_t *address_geofence_polygon_vertices_parseFromJSON(char *jsonString){

    address_geofence_polygon_vertices_t *address_geofence_polygon_vertices = NULL;
    cJSON *address_geofence_polygon_verticesJSON = cJSON_Parse(jsonString);
    if(address_geofence_polygon_verticesJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // address_geofence_polygon_vertices->latitude
    cJSON *latitude = cJSON_GetObjectItemCaseSensitive(address_geofence_polygon_verticesJSON, "latitude");
    if(!cJSON_IsNumber(latitude))
    {
    goto end; //Numeric
    }

    // address_geofence_polygon_vertices->longitude
    cJSON *longitude = cJSON_GetObjectItemCaseSensitive(address_geofence_polygon_verticesJSON, "longitude");
    if(!cJSON_IsNumber(longitude))
    {
    goto end; //Numeric
    }


    address_geofence_polygon_vertices = address_geofence_polygon_vertices_create (
        latitude->valuedouble,
        longitude->valuedouble
        );
 cJSON_Delete(address_geofence_polygon_verticesJSON);
    return address_geofence_polygon_vertices;
end:
    cJSON_Delete(address_geofence_polygon_verticesJSON);
    return NULL;

}

