#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "address_geofence.h"



address_geofence_t *address_geofence_create(
    address_geofence_circle_t *circle,
    address_geofence_polygon_t *polygon
    ) {
	address_geofence_t *address_geofence = malloc(sizeof(address_geofence_t));
	address_geofence->circle = circle;
	address_geofence->polygon = polygon;

	return address_geofence;
}


void address_geofence_free(address_geofence_t *address_geofence) {
    listEntry_t *listEntry;
	address_geofence_circle_free(address_geofence->circle);
	address_geofence_polygon_free(address_geofence->polygon);

	free(address_geofence);
}

cJSON *address_geofence_convertToJSON(address_geofence_t *address_geofence) {
	cJSON *item = cJSON_CreateObject();
	// address_geofence->circle
	cJSON *circle = address_geofence_circle_convertToJSON(address_geofence->circle);
	if(circle == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "circle", circle);
	if(item->child == NULL) {
		goto fail;
	}

	// address_geofence->polygon
	cJSON *polygon = address_geofence_polygon_convertToJSON(address_geofence->polygon);
	if(polygon == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "polygon", polygon);
	if(item->child == NULL) {
		goto fail;
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

address_geofence_t *address_geofence_parseFromJSON(char *jsonString){

    address_geofence_t *address_geofence = NULL;
    cJSON *address_geofenceJSON = cJSON_Parse(jsonString);
    if(address_geofenceJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // address_geofence->circle
    address_geofence_circle_t *circle;
    cJSON *circleJSON = cJSON_GetObjectItemCaseSensitive(address_geofenceJSON, "circle");
    if(address_geofenceJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *circleJSONData = cJSON_Print(circleJSON);
    circle = address_geofence_circle_parseFromJSON(circleJSONData);

    // address_geofence->polygon
    address_geofence_polygon_t *polygon;
    cJSON *polygonJSON = cJSON_GetObjectItemCaseSensitive(address_geofenceJSON, "polygon");
    if(address_geofenceJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *polygonJSONData = cJSON_Print(polygonJSON);
    polygon = address_geofence_polygon_parseFromJSON(polygonJSONData);


    address_geofence = address_geofence_create (
        circle,
        polygon
        );
        free(circleJSONData);
        free(polygonJSONData);
 cJSON_Delete(address_geofenceJSON);
    return address_geofence;
end:
    cJSON_Delete(address_geofenceJSON);
    return NULL;

}

