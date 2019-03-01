#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trip_response_start_coordinates.h"



trip_response_start_coordinates_t *trip_response_start_coordinates_create(
    double latitude,
    double longitude
    ) {
	trip_response_start_coordinates_t *trip_response_start_coordinates = malloc(sizeof(trip_response_start_coordinates_t));
	trip_response_start_coordinates->latitude = latitude;
	trip_response_start_coordinates->longitude = longitude;

	return trip_response_start_coordinates;
}


void trip_response_start_coordinates_free(trip_response_start_coordinates_t *trip_response_start_coordinates) {
    listEntry_t *listEntry;

	free(trip_response_start_coordinates);
}

cJSON *trip_response_start_coordinates_convertToJSON(trip_response_start_coordinates_t *trip_response_start_coordinates) {
	cJSON *item = cJSON_CreateObject();
	// trip_response_start_coordinates->latitude
    if(cJSON_AddNumberToObject(item, "latitude", trip_response_start_coordinates->latitude) == NULL) {
    goto fail; //Numeric
    }

	// trip_response_start_coordinates->longitude
    if(cJSON_AddNumberToObject(item, "longitude", trip_response_start_coordinates->longitude) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

trip_response_start_coordinates_t *trip_response_start_coordinates_parseFromJSON(char *jsonString){

    trip_response_start_coordinates_t *trip_response_start_coordinates = NULL;
    cJSON *trip_response_start_coordinatesJSON = cJSON_Parse(jsonString);
    if(trip_response_start_coordinatesJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // trip_response_start_coordinates->latitude
    cJSON *latitude = cJSON_GetObjectItemCaseSensitive(trip_response_start_coordinatesJSON, "latitude");
    if(!cJSON_IsNumber(latitude))
    {
    goto end; //Numeric
    }

    // trip_response_start_coordinates->longitude
    cJSON *longitude = cJSON_GetObjectItemCaseSensitive(trip_response_start_coordinatesJSON, "longitude");
    if(!cJSON_IsNumber(longitude))
    {
    goto end; //Numeric
    }


    trip_response_start_coordinates = trip_response_start_coordinates_create (
        latitude->valuedouble,
        longitude->valuedouble
        );
 cJSON_Delete(trip_response_start_coordinatesJSON);
    return trip_response_start_coordinates;
end:
    cJSON_Delete(trip_response_start_coordinatesJSON);
    return NULL;

}

