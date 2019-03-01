#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "engine_state.h"


char* valueengine_state_ToString(value_e value){
    char *valueArray[] =  { "Running","Off","Idle" };
    return valueArray[value];

}

value_e valueengine_state_FromString(char* value){
    int stringToReturn = 0;
    char *valueArray[] =  { "Running","Off","Idle" };
    size_t sizeofArray = sizeof(valueArray) / sizeof(valueArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(value, valueArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
}

engine_state_t *engine_state_create(
    object_t *timeMs,
    value_e value
    ) {
	engine_state_t *engine_state = malloc(sizeof(engine_state_t));
	engine_state->timeMs = timeMs;
	engine_state->value = value;

	return engine_state;
}


void engine_state_free(engine_state_t *engine_state) {
    listEntry_t *listEntry;
	object_free(engine_state->timeMs);

	free(engine_state);
}

cJSON *engine_state_convertToJSON(engine_state_t *engine_state) {
	cJSON *item = cJSON_CreateObject();
	// engine_state->timeMs
	cJSON *timeMs = object_convertToJSON(engine_state->timeMs);
	if(timeMs == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "timeMs", timeMs);
	if(item->child == NULL) {
		goto fail;
	}

	// engine_state->value
    if(cJSON_AddStringToObject(item, "value", valueengine_state_ToString(engine_state->value)) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

engine_state_t *engine_state_parseFromJSON(char *jsonString){

    engine_state_t *engine_state = NULL;
    cJSON *engine_stateJSON = cJSON_Parse(jsonString);
    if(engine_stateJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // engine_state->timeMs
    object_t *timeMs;
    cJSON *timeMsJSON = cJSON_GetObjectItemCaseSensitive(engine_stateJSON, "timeMs");
    if(engine_stateJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *timeMsJSONData = cJSON_Print(timeMsJSON);
    timeMs = object_parseFromJSON(timeMsJSONData);

    // engine_state->value
    value_e valueVariable;
    cJSON *value = cJSON_GetObjectItemCaseSensitive(engine_stateJSON, "value");
    if(!cJSON_IsString(value) || (value->valuestring == NULL)){
    goto end; //String
    }

    valueVariable = valueengine_state_FromString(value->valuestring);


    engine_state = engine_state_create (
        timeMs,
        valueVariable
        );
        free(timeMsJSONData);
 cJSON_Delete(engine_stateJSON);
    return engine_state;
end:
    cJSON_Delete(engine_stateJSON);
    return NULL;

}

