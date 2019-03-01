#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "machine_history_response_vibrations.h"



machine_history_response_vibrations_t *machine_history_response_vibrations_create(
    double X,
    double Y,
    double Z,
    long time
    ) {
	machine_history_response_vibrations_t *machine_history_response_vibrations = malloc(sizeof(machine_history_response_vibrations_t));
	machine_history_response_vibrations->X = X;
	machine_history_response_vibrations->Y = Y;
	machine_history_response_vibrations->Z = Z;
	machine_history_response_vibrations->time = time;

	return machine_history_response_vibrations;
}


void machine_history_response_vibrations_free(machine_history_response_vibrations_t *machine_history_response_vibrations) {
    listEntry_t *listEntry;

	free(machine_history_response_vibrations);
}

cJSON *machine_history_response_vibrations_convertToJSON(machine_history_response_vibrations_t *machine_history_response_vibrations) {
	cJSON *item = cJSON_CreateObject();
	// machine_history_response_vibrations->X
    if(cJSON_AddNumberToObject(item, "X", machine_history_response_vibrations->X) == NULL) {
    goto fail; //Numeric
    }

	// machine_history_response_vibrations->Y
    if(cJSON_AddNumberToObject(item, "Y", machine_history_response_vibrations->Y) == NULL) {
    goto fail; //Numeric
    }

	// machine_history_response_vibrations->Z
    if(cJSON_AddNumberToObject(item, "Z", machine_history_response_vibrations->Z) == NULL) {
    goto fail; //Numeric
    }

	// machine_history_response_vibrations->time
    if(cJSON_AddNumberToObject(item, "time", machine_history_response_vibrations->time) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

machine_history_response_vibrations_t *machine_history_response_vibrations_parseFromJSON(char *jsonString){

    machine_history_response_vibrations_t *machine_history_response_vibrations = NULL;
    cJSON *machine_history_response_vibrationsJSON = cJSON_Parse(jsonString);
    if(machine_history_response_vibrationsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // machine_history_response_vibrations->X
    cJSON *X = cJSON_GetObjectItemCaseSensitive(machine_history_response_vibrationsJSON, "X");
    if(!cJSON_IsNumber(X))
    {
    goto end; //Numeric
    }

    // machine_history_response_vibrations->Y
    cJSON *Y = cJSON_GetObjectItemCaseSensitive(machine_history_response_vibrationsJSON, "Y");
    if(!cJSON_IsNumber(Y))
    {
    goto end; //Numeric
    }

    // machine_history_response_vibrations->Z
    cJSON *Z = cJSON_GetObjectItemCaseSensitive(machine_history_response_vibrationsJSON, "Z");
    if(!cJSON_IsNumber(Z))
    {
    goto end; //Numeric
    }

    // machine_history_response_vibrations->time
    cJSON *time = cJSON_GetObjectItemCaseSensitive(machine_history_response_vibrationsJSON, "time");
    if(!cJSON_IsNumber(time))
    {
    goto end; //Numeric
    }


    machine_history_response_vibrations = machine_history_response_vibrations_create (
        X->valuedouble,
        Y->valuedouble,
        Z->valuedouble,
        time->valuedouble
        );
 cJSON_Delete(machine_history_response_vibrationsJSON);
    return machine_history_response_vibrations;
end:
    cJSON_Delete(machine_history_response_vibrationsJSON);
    return NULL;

}

