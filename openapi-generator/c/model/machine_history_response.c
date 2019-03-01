#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "machine_history_response.h"



machine_history_response_t *machine_history_response_create(
    list_t *machines
    ) {
	machine_history_response_t *machine_history_response = malloc(sizeof(machine_history_response_t));
	machine_history_response->machines = machines;

	return machine_history_response;
}


void machine_history_response_free(machine_history_response_t *machine_history_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, machine_history_response->machines) {
		machine_history_response_machines_free(listEntry->data);
	}
	list_free(machine_history_response->machines);

	free(machine_history_response);
}

cJSON *machine_history_response_convertToJSON(machine_history_response_t *machine_history_response) {
	cJSON *item = cJSON_CreateObject();
	// machine_history_response->machines
    cJSON *machines = cJSON_AddArrayToObject(item, "machines");
	if(machines == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *machinesListEntry;
	list_ForEach(machinesListEntry, machine_history_response->machines) {
		cJSON *item = machine_history_response_machines_convertToJSON(machinesListEntry->data);
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

machine_history_response_t *machine_history_response_parseFromJSON(char *jsonString){

    machine_history_response_t *machine_history_response = NULL;
    cJSON *machine_history_responseJSON = cJSON_Parse(jsonString);
    if(machine_history_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // machine_history_response->machines
    cJSON *machines;
    cJSON *machinesJSON = cJSON_GetObjectItemCaseSensitive(machine_history_responseJSON,"machines");
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
        machine_history_response_machines_t *machinesItem = machine_history_response_machines_parseFromJSON(JSONData);

        list_addElement(machinesList, machinesItem);
        free(JSONData);
    }


    machine_history_response = machine_history_response_create (
        machinesList
        );
 cJSON_Delete(machine_history_responseJSON);
    return machine_history_response;
end:
    cJSON_Delete(machine_history_responseJSON);
    return NULL;

}

