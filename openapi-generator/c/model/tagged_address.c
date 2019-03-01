#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tagged_address.h"



tagged_address_t *tagged_address_create(
    long id,
    char *name
    ) {
	tagged_address_t *tagged_address = malloc(sizeof(tagged_address_t));
	tagged_address->id = id;
	tagged_address->name = name;

	return tagged_address;
}


void tagged_address_free(tagged_address_t *tagged_address) {
    listEntry_t *listEntry;
    free(tagged_address->name);

	free(tagged_address);
}

cJSON *tagged_address_convertToJSON(tagged_address_t *tagged_address) {
	cJSON *item = cJSON_CreateObject();
	// tagged_address->id
    if(cJSON_AddNumberToObject(item, "id", tagged_address->id) == NULL) {
    goto fail; //Numeric
    }

	// tagged_address->name
    if(cJSON_AddStringToObject(item, "name", tagged_address->name) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

tagged_address_t *tagged_address_parseFromJSON(char *jsonString){

    tagged_address_t *tagged_address = NULL;
    cJSON *tagged_addressJSON = cJSON_Parse(jsonString);
    if(tagged_addressJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tagged_address->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(tagged_addressJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // tagged_address->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(tagged_addressJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }


    tagged_address = tagged_address_create (
        id->valuedouble,
        strdup(name->valuestring)
        );
 cJSON_Delete(tagged_addressJSON);
    return tagged_address;
end:
    cJSON_Delete(tagged_addressJSON);
    return NULL;

}

