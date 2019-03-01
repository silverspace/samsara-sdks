#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "address_geofence_circle.h"



address_geofence_circle_t *address_geofence_circle_create(
    double latitude,
    long radiusMeters,
    double longitude
    ) {
	address_geofence_circle_t *address_geofence_circle = malloc(sizeof(address_geofence_circle_t));
	address_geofence_circle->latitude = latitude;
	address_geofence_circle->radiusMeters = radiusMeters;
	address_geofence_circle->longitude = longitude;

	return address_geofence_circle;
}


void address_geofence_circle_free(address_geofence_circle_t *address_geofence_circle) {
    listEntry_t *listEntry;

	free(address_geofence_circle);
}

cJSON *address_geofence_circle_convertToJSON(address_geofence_circle_t *address_geofence_circle) {
	cJSON *item = cJSON_CreateObject();
	// address_geofence_circle->latitude
    if(cJSON_AddNumberToObject(item, "latitude", address_geofence_circle->latitude) == NULL) {
    goto fail; //Numeric
    }

	// address_geofence_circle->radiusMeters
    if(cJSON_AddNumberToObject(item, "radiusMeters", address_geofence_circle->radiusMeters) == NULL) {
    goto fail; //Numeric
    }

	// address_geofence_circle->longitude
    if(cJSON_AddNumberToObject(item, "longitude", address_geofence_circle->longitude) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

address_geofence_circle_t *address_geofence_circle_parseFromJSON(char *jsonString){

    address_geofence_circle_t *address_geofence_circle = NULL;
    cJSON *address_geofence_circleJSON = cJSON_Parse(jsonString);
    if(address_geofence_circleJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // address_geofence_circle->latitude
    cJSON *latitude = cJSON_GetObjectItemCaseSensitive(address_geofence_circleJSON, "latitude");
    if(!cJSON_IsNumber(latitude))
    {
    goto end; //Numeric
    }

    // address_geofence_circle->radiusMeters
    cJSON *radiusMeters = cJSON_GetObjectItemCaseSensitive(address_geofence_circleJSON, "radiusMeters");
    if(!cJSON_IsNumber(radiusMeters))
    {
    goto end; //Numeric
    }

    // address_geofence_circle->longitude
    cJSON *longitude = cJSON_GetObjectItemCaseSensitive(address_geofence_circleJSON, "longitude");
    if(!cJSON_IsNumber(longitude))
    {
    goto end; //Numeric
    }


    address_geofence_circle = address_geofence_circle_create (
        latitude->valuedouble,
        radiusMeters->valuedouble,
        longitude->valuedouble
        );
 cJSON_Delete(address_geofence_circleJSON);
    return address_geofence_circle;
end:
    cJSON_Delete(address_geofence_circleJSON);
    return NULL;

}

