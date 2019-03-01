#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_6.h"



inline_response_200_6_t *inline_response_200_6_create(
    list_t *dataInputs
    ) {
	inline_response_200_6_t *inline_response_200_6 = malloc(sizeof(inline_response_200_6_t));
	inline_response_200_6->dataInputs = dataInputs;

	return inline_response_200_6;
}


void inline_response_200_6_free(inline_response_200_6_t *inline_response_200_6) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, inline_response_200_6->dataInputs) {
		data_input_history_response_free(listEntry->data);
	}
	list_free(inline_response_200_6->dataInputs);

	free(inline_response_200_6);
}

cJSON *inline_response_200_6_convertToJSON(inline_response_200_6_t *inline_response_200_6) {
	cJSON *item = cJSON_CreateObject();
	// inline_response_200_6->dataInputs
    cJSON *dataInputs = cJSON_AddArrayToObject(item, "dataInputs");
	if(dataInputs == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *dataInputsListEntry;
	list_ForEach(dataInputsListEntry, inline_response_200_6->dataInputs) {
		cJSON *item = data_input_history_response_convertToJSON(dataInputsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(dataInputs, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_response_200_6_t *inline_response_200_6_parseFromJSON(char *jsonString){

    inline_response_200_6_t *inline_response_200_6 = NULL;
    cJSON *inline_response_200_6JSON = cJSON_Parse(jsonString);
    if(inline_response_200_6JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_response_200_6->dataInputs
    cJSON *dataInputs;
    cJSON *dataInputsJSON = cJSON_GetObjectItemCaseSensitive(inline_response_200_6JSON,"dataInputs");
    if(!cJSON_IsArray(dataInputsJSON)){
        goto end; //nonprimitive container
    }

    list_t *dataInputsList = list_create();

    cJSON_ArrayForEach(dataInputs,dataInputsJSON )
    {
        if(!cJSON_IsObject(dataInputs)){
            goto end;
        }
		char *JSONData = cJSON_Print(dataInputs);
        data_input_history_response_t *dataInputsItem = data_input_history_response_parseFromJSON(JSONData);

        list_addElement(dataInputsList, dataInputsItem);
        free(JSONData);
    }


    inline_response_200_6 = inline_response_200_6_create (
        dataInputsList
        );
 cJSON_Delete(inline_response_200_6JSON);
    return inline_response_200_6;
end:
    cJSON_Delete(inline_response_200_6JSON);
    return NULL;

}

