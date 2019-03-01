#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "machine_history_response_machines.h"



machine_history_response_machines_t *machine_history_response_machines_create(
    char *name,
    int id,
    list_t *vibrations
    ) {
	machine_history_response_machines_t *machine_history_response_machines = malloc(sizeof(machine_history_response_machines_t));
	machine_history_response_machines->name = name;
	machine_history_response_machines->id = id;
	machine_history_response_machines->vibrations = vibrations;

	return machine_history_response_machines;
}


void machine_history_response_machines_free(machine_history_response_machines_t *machine_history_response_machines) {
    listEntry_t *listEntry;
    free(machine_history_response_machines->name);
		list_ForEach(listEntry, machine_history_response_machines->vibrations) {
		machine_history_response_vibrations_free(listEntry->data);
	}
	list_free(machine_history_response_machines->vibrations);

	free(machine_history_response_machines);
}

cJSON *machine_history_response_machines_convertToJSON(machine_history_response_machines_t *machine_history_response_machines) {
	cJSON *item = cJSON_CreateObject();
	// machine_history_response_machines->name
    if(cJSON_AddStringToObject(item, "name", machine_history_response_machines->name) == NULL) {
    goto fail; //String
    }

	// machine_history_response_machines->id
    if(cJSON_AddNumberToObject(item, "id", machine_history_response_machines->id) == NULL) {
    goto fail; //Numeric
    }

	// machine_history_response_machines->vibrations
    cJSON *vibrations = cJSON_AddArrayToObject(item, "vibrations");
	if(vibrations == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *vibrationsListEntry;
	list_ForEach(vibrationsListEntry, machine_history_response_machines->vibrations) {
		cJSON *item = machine_history_response_vibrations_convertToJSON(vibrationsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(vibrations, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

machine_history_response_machines_t *machine_history_response_machines_parseFromJSON(char *jsonString){

    machine_history_response_machines_t *machine_history_response_machines = NULL;
    cJSON *machine_history_response_machinesJSON = cJSON_Parse(jsonString);
    if(machine_history_response_machinesJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // machine_history_response_machines->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(machine_history_response_machinesJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // machine_history_response_machines->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(machine_history_response_machinesJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // machine_history_response_machines->vibrations
    cJSON *vibrations;
    cJSON *vibrationsJSON = cJSON_GetObjectItemCaseSensitive(machine_history_response_machinesJSON,"vibrations");
    if(!cJSON_IsArray(vibrationsJSON)){
        goto end; //nonprimitive container
    }

    list_t *vibrationsList = list_create();

    cJSON_ArrayForEach(vibrations,vibrationsJSON )
    {
        if(!cJSON_IsObject(vibrations)){
            goto end;
        }
		char *JSONData = cJSON_Print(vibrations);
        machine_history_response_vibrations_t *vibrationsItem = machine_history_response_vibrations_parseFromJSON(JSONData);

        list_addElement(vibrationsList, vibrationsItem);
        free(JSONData);
    }


    machine_history_response_machines = machine_history_response_machines_create (
        strdup(name->valuestring),
        id->valuedouble,
        vibrationsList
        );
 cJSON_Delete(machine_history_response_machinesJSON);
    return machine_history_response_machines;
end:
    cJSON_Delete(machine_history_response_machinesJSON);
    return NULL;

}

