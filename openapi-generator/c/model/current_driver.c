#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "current_driver.h"



current_driver_t *current_driver_create(
    ) {
	current_driver_t *current_driver = malloc(sizeof(current_driver_t));

	return current_driver;
}


void current_driver_free(current_driver_t *current_driver) {
    listEntry_t *listEntry;

	free(current_driver);
}

cJSON *current_driver_convertToJSON(current_driver_t *current_driver) {
	cJSON *item = cJSON_CreateObject();
	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

current_driver_t *current_driver_parseFromJSON(char *jsonString){

    current_driver_t *current_driver = NULL;
    cJSON *current_driverJSON = cJSON_Parse(jsonString);
    if(current_driverJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }


    current_driver = current_driver_create (
        );
 cJSON_Delete(current_driverJSON);
    return current_driver;
end:
    cJSON_Delete(current_driverJSON);
    return NULL;

}

