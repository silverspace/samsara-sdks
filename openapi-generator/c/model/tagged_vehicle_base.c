#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tagged_vehicle_base.h"



tagged_vehicle_base_t *tagged_vehicle_base_create(
    long id
    ) {
	tagged_vehicle_base_t *tagged_vehicle_base = malloc(sizeof(tagged_vehicle_base_t));
	tagged_vehicle_base->id = id;

	return tagged_vehicle_base;
}


void tagged_vehicle_base_free(tagged_vehicle_base_t *tagged_vehicle_base) {
    listEntry_t *listEntry;

	free(tagged_vehicle_base);
}

cJSON *tagged_vehicle_base_convertToJSON(tagged_vehicle_base_t *tagged_vehicle_base) {
	cJSON *item = cJSON_CreateObject();
	// tagged_vehicle_base->id
    if(cJSON_AddNumberToObject(item, "id", tagged_vehicle_base->id) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

tagged_vehicle_base_t *tagged_vehicle_base_parseFromJSON(char *jsonString){

    tagged_vehicle_base_t *tagged_vehicle_base = NULL;
    cJSON *tagged_vehicle_baseJSON = cJSON_Parse(jsonString);
    if(tagged_vehicle_baseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tagged_vehicle_base->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(tagged_vehicle_baseJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    tagged_vehicle_base = tagged_vehicle_base_create (
        id->valuedouble
        );
 cJSON_Delete(tagged_vehicle_baseJSON);
    return tagged_vehicle_base;
end:
    cJSON_Delete(tagged_vehicle_baseJSON);
    return NULL;

}

