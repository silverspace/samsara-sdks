#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tagged_driver.h"



tagged_driver_t *tagged_driver_create(
    long id,
    char *name
    ) {
	tagged_driver_t *tagged_driver = malloc(sizeof(tagged_driver_t));
	tagged_driver->id = id;
	tagged_driver->name = name;

	return tagged_driver;
}


void tagged_driver_free(tagged_driver_t *tagged_driver) {
    listEntry_t *listEntry;
    free(tagged_driver->name);

	free(tagged_driver);
}

cJSON *tagged_driver_convertToJSON(tagged_driver_t *tagged_driver) {
	cJSON *item = cJSON_CreateObject();
	// tagged_driver->id
    if(cJSON_AddNumberToObject(item, "id", tagged_driver->id) == NULL) {
    goto fail; //Numeric
    }

	// tagged_driver->name
    if(cJSON_AddStringToObject(item, "name", tagged_driver->name) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

tagged_driver_t *tagged_driver_parseFromJSON(char *jsonString){

    tagged_driver_t *tagged_driver = NULL;
    cJSON *tagged_driverJSON = cJSON_Parse(jsonString);
    if(tagged_driverJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tagged_driver->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(tagged_driverJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // tagged_driver->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(tagged_driverJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }


    tagged_driver = tagged_driver_create (
        id->valuedouble,
        strdup(name->valuestring)
        );
 cJSON_Delete(tagged_driverJSON);
    return tagged_driver;
end:
    cJSON_Delete(tagged_driverJSON);
    return NULL;

}

