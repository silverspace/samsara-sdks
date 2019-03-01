#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trip_response.h"



trip_response_t *trip_response_create(
    list_t *trips
    ) {
	trip_response_t *trip_response = malloc(sizeof(trip_response_t));
	trip_response->trips = trips;

	return trip_response;
}


void trip_response_free(trip_response_t *trip_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, trip_response->trips) {
		trip_response_trips_free(listEntry->data);
	}
	list_free(trip_response->trips);

	free(trip_response);
}

cJSON *trip_response_convertToJSON(trip_response_t *trip_response) {
	cJSON *item = cJSON_CreateObject();
	// trip_response->trips
    cJSON *trips = cJSON_AddArrayToObject(item, "trips");
	if(trips == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *tripsListEntry;
	list_ForEach(tripsListEntry, trip_response->trips) {
		cJSON *item = trip_response_trips_convertToJSON(tripsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(trips, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

trip_response_t *trip_response_parseFromJSON(char *jsonString){

    trip_response_t *trip_response = NULL;
    cJSON *trip_responseJSON = cJSON_Parse(jsonString);
    if(trip_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // trip_response->trips
    cJSON *trips;
    cJSON *tripsJSON = cJSON_GetObjectItemCaseSensitive(trip_responseJSON,"trips");
    if(!cJSON_IsArray(tripsJSON)){
        goto end; //nonprimitive container
    }

    list_t *tripsList = list_create();

    cJSON_ArrayForEach(trips,tripsJSON )
    {
        if(!cJSON_IsObject(trips)){
            goto end;
        }
		char *JSONData = cJSON_Print(trips);
        trip_response_trips_t *tripsItem = trip_response_trips_parseFromJSON(JSONData);

        list_addElement(tripsList, tripsItem);
        free(JSONData);
    }


    trip_response = trip_response_create (
        tripsList
        );
 cJSON_Delete(trip_responseJSON);
    return trip_response;
end:
    cJSON_Delete(trip_responseJSON);
    return NULL;

}

