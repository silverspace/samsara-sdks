#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "address_geofence_polygon.h"



address_geofence_polygon_t *address_geofence_polygon_create(
    list_t *vertices
    ) {
	address_geofence_polygon_t *address_geofence_polygon = malloc(sizeof(address_geofence_polygon_t));
	address_geofence_polygon->vertices = vertices;

	return address_geofence_polygon;
}


void address_geofence_polygon_free(address_geofence_polygon_t *address_geofence_polygon) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, address_geofence_polygon->vertices) {
		address_geofence_polygon_vertices_free(listEntry->data);
	}
	list_free(address_geofence_polygon->vertices);

	free(address_geofence_polygon);
}

cJSON *address_geofence_polygon_convertToJSON(address_geofence_polygon_t *address_geofence_polygon) {
	cJSON *item = cJSON_CreateObject();
	// address_geofence_polygon->vertices
    cJSON *vertices = cJSON_AddArrayToObject(item, "vertices");
	if(vertices == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *verticesListEntry;
	list_ForEach(verticesListEntry, address_geofence_polygon->vertices) {
		cJSON *item = address_geofence_polygon_vertices_convertToJSON(verticesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(vertices, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

address_geofence_polygon_t *address_geofence_polygon_parseFromJSON(char *jsonString){

    address_geofence_polygon_t *address_geofence_polygon = NULL;
    cJSON *address_geofence_polygonJSON = cJSON_Parse(jsonString);
    if(address_geofence_polygonJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // address_geofence_polygon->vertices
    cJSON *vertices;
    cJSON *verticesJSON = cJSON_GetObjectItemCaseSensitive(address_geofence_polygonJSON,"vertices");
    if(!cJSON_IsArray(verticesJSON)){
        goto end; //nonprimitive container
    }

    list_t *verticesList = list_create();

    cJSON_ArrayForEach(vertices,verticesJSON )
    {
        if(!cJSON_IsObject(vertices)){
            goto end;
        }
		char *JSONData = cJSON_Print(vertices);
        address_geofence_polygon_vertices_t *verticesItem = address_geofence_polygon_vertices_parseFromJSON(JSONData);

        list_addElement(verticesList, verticesItem);
        free(JSONData);
    }


    address_geofence_polygon = address_geofence_polygon_create (
        verticesList
        );
 cJSON_Delete(address_geofence_polygonJSON);
    return address_geofence_polygon;
end:
    cJSON_Delete(address_geofence_polygonJSON);
    return NULL;

}

