#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tagged_sensor_base.h"



tagged_sensor_base_t *tagged_sensor_base_create(
    long id
    ) {
	tagged_sensor_base_t *tagged_sensor_base = malloc(sizeof(tagged_sensor_base_t));
	tagged_sensor_base->id = id;

	return tagged_sensor_base;
}


void tagged_sensor_base_free(tagged_sensor_base_t *tagged_sensor_base) {
    listEntry_t *listEntry;

	free(tagged_sensor_base);
}

cJSON *tagged_sensor_base_convertToJSON(tagged_sensor_base_t *tagged_sensor_base) {
	cJSON *item = cJSON_CreateObject();
	// tagged_sensor_base->id
    if(cJSON_AddNumberToObject(item, "id", tagged_sensor_base->id) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

tagged_sensor_base_t *tagged_sensor_base_parseFromJSON(char *jsonString){

    tagged_sensor_base_t *tagged_sensor_base = NULL;
    cJSON *tagged_sensor_baseJSON = cJSON_Parse(jsonString);
    if(tagged_sensor_baseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tagged_sensor_base->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(tagged_sensor_baseJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    tagged_sensor_base = tagged_sensor_base_create (
        id->valuedouble
        );
 cJSON_Delete(tagged_sensor_baseJSON);
    return tagged_sensor_base;
end:
    cJSON_Delete(tagged_sensor_baseJSON);
    return NULL;

}

