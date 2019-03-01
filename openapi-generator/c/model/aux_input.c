#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "aux_input.h"



aux_input_t *aux_input_create(
    object_t *timeMs,
    bool value
    ) {
	aux_input_t *aux_input = malloc(sizeof(aux_input_t));
	aux_input->timeMs = timeMs;
	aux_input->value = value;

	return aux_input;
}


void aux_input_free(aux_input_t *aux_input) {
    listEntry_t *listEntry;
	object_free(aux_input->timeMs);

	free(aux_input);
}

cJSON *aux_input_convertToJSON(aux_input_t *aux_input) {
	cJSON *item = cJSON_CreateObject();
	// aux_input->timeMs
	cJSON *timeMs = object_convertToJSON(aux_input->timeMs);
	if(timeMs == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "timeMs", timeMs);
	if(item->child == NULL) {
		goto fail;
	}

	// aux_input->value
    if(cJSON_AddBoolToObject(item, "value", aux_input->value) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

aux_input_t *aux_input_parseFromJSON(char *jsonString){

    aux_input_t *aux_input = NULL;
    cJSON *aux_inputJSON = cJSON_Parse(jsonString);
    if(aux_inputJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // aux_input->timeMs
    object_t *timeMs;
    cJSON *timeMsJSON = cJSON_GetObjectItemCaseSensitive(aux_inputJSON, "timeMs");
    if(aux_inputJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *timeMsJSONData = cJSON_Print(timeMsJSON);
    timeMs = object_parseFromJSON(timeMsJSONData);

    // aux_input->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(aux_inputJSON, "value");
    if(!cJSON_IsBool(value))
    {
    goto end; //Numeric
    }


    aux_input = aux_input_create (
        timeMs,
        value->valueint
        );
        free(timeMsJSONData);
 cJSON_Delete(aux_inputJSON);
    return aux_input;
end:
    cJSON_Delete(aux_inputJSON);
    return NULL;

}

