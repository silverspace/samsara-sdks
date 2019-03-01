#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "data_input_history_response.h"



data_input_history_response_t *data_input_history_response_create(
    long id,
    char *name,
    list_t *points
    ) {
	data_input_history_response_t *data_input_history_response = malloc(sizeof(data_input_history_response_t));
	data_input_history_response->id = id;
	data_input_history_response->name = name;
	data_input_history_response->points = points;

	return data_input_history_response;
}


void data_input_history_response_free(data_input_history_response_t *data_input_history_response) {
    listEntry_t *listEntry;
    free(data_input_history_response->name);
		list_ForEach(listEntry, data_input_history_response->points) {
		data_input_history_response_points_free(listEntry->data);
	}
	list_free(data_input_history_response->points);

	free(data_input_history_response);
}

cJSON *data_input_history_response_convertToJSON(data_input_history_response_t *data_input_history_response) {
	cJSON *item = cJSON_CreateObject();
	// data_input_history_response->id
    if(cJSON_AddNumberToObject(item, "id", data_input_history_response->id) == NULL) {
    goto fail; //Numeric
    }

	// data_input_history_response->name
    if(cJSON_AddStringToObject(item, "name", data_input_history_response->name) == NULL) {
    goto fail; //String
    }

	// data_input_history_response->points
    cJSON *points = cJSON_AddArrayToObject(item, "points");
	if(points == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *pointsListEntry;
	list_ForEach(pointsListEntry, data_input_history_response->points) {
		cJSON *item = data_input_history_response_points_convertToJSON(pointsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(points, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

data_input_history_response_t *data_input_history_response_parseFromJSON(char *jsonString){

    data_input_history_response_t *data_input_history_response = NULL;
    cJSON *data_input_history_responseJSON = cJSON_Parse(jsonString);
    if(data_input_history_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // data_input_history_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(data_input_history_responseJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // data_input_history_response->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(data_input_history_responseJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // data_input_history_response->points
    cJSON *points;
    cJSON *pointsJSON = cJSON_GetObjectItemCaseSensitive(data_input_history_responseJSON,"points");
    if(!cJSON_IsArray(pointsJSON)){
        goto end; //nonprimitive container
    }

    list_t *pointsList = list_create();

    cJSON_ArrayForEach(points,pointsJSON )
    {
        if(!cJSON_IsObject(points)){
            goto end;
        }
		char *JSONData = cJSON_Print(points);
        data_input_history_response_points_t *pointsItem = data_input_history_response_points_parseFromJSON(JSONData);

        list_addElement(pointsList, pointsItem);
        free(JSONData);
    }


    data_input_history_response = data_input_history_response_create (
        id->valuedouble,
        strdup(name->valuestring),
        pointsList
        );
 cJSON_Delete(data_input_history_responseJSON);
    return data_input_history_response;
end:
    cJSON_Delete(data_input_history_responseJSON);
    return NULL;

}

