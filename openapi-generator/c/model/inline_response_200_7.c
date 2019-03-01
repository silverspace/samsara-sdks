#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_7.h"



inline_response_200_7_t *inline_response_200_7_create(
    list_t *machines
    ) {
	inline_response_200_7_t *inline_response_200_7 = malloc(sizeof(inline_response_200_7_t));
	inline_response_200_7->machines = machines;

	return inline_response_200_7;
}


void inline_response_200_7_free(inline_response_200_7_t *inline_response_200_7) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, inline_response_200_7->machines) {
		machine_free(listEntry->data);
	}
	list_free(inline_response_200_7->machines);

	free(inline_response_200_7);
}

cJSON *inline_response_200_7_convertToJSON(inline_response_200_7_t *inline_response_200_7) {
	cJSON *item = cJSON_CreateObject();
	// inline_response_200_7->machines
    cJSON *machines = cJSON_AddArrayToObject(item, "machines");
	if(machines == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *machinesListEntry;
	list_ForEach(machinesListEntry, inline_response_200_7->machines) {
		cJSON *item = machine_convertToJSON(machinesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(machines, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_response_200_7_t *inline_response_200_7_parseFromJSON(char *jsonString){

    inline_response_200_7_t *inline_response_200_7 = NULL;
    cJSON *inline_response_200_7JSON = cJSON_Parse(jsonString);
    if(inline_response_200_7JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_response_200_7->machines
    cJSON *machines;
    cJSON *machinesJSON = cJSON_GetObjectItemCaseSensitive(inline_response_200_7JSON,"machines");
    if(!cJSON_IsArray(machinesJSON)){
        goto end; //nonprimitive container
    }

    list_t *machinesList = list_create();

    cJSON_ArrayForEach(machines,machinesJSON )
    {
        if(!cJSON_IsObject(machines)){
            goto end;
        }
		char *JSONData = cJSON_Print(machines);
        machine_t *machinesItem = machine_parseFromJSON(JSONData);

        list_addElement(machinesList, machinesItem);
        free(JSONData);
    }


    inline_response_200_7 = inline_response_200_7_create (
        machinesList
        );
 cJSON_Delete(inline_response_200_7JSON);
    return inline_response_200_7;
end:
    cJSON_Delete(inline_response_200_7JSON);
    return NULL;

}

