#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_2.h"



inline_object_2_t *inline_object_2_create(
    char *address,
    long groupId,
    char *name,
    int radius
    ) {
	inline_object_2_t *inline_object_2 = malloc(sizeof(inline_object_2_t));
	inline_object_2->address = address;
	inline_object_2->groupId = groupId;
	inline_object_2->name = name;
	inline_object_2->radius = radius;

	return inline_object_2;
}


void inline_object_2_free(inline_object_2_t *inline_object_2) {
    listEntry_t *listEntry;
    free(inline_object_2->address);
    free(inline_object_2->name);

	free(inline_object_2);
}

cJSON *inline_object_2_convertToJSON(inline_object_2_t *inline_object_2) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_2->address
    if(cJSON_AddStringToObject(item, "address", inline_object_2->address) == NULL) {
    goto fail; //String
    }

	// inline_object_2->groupId
    if(cJSON_AddNumberToObject(item, "groupId", inline_object_2->groupId) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_2->name
    if(cJSON_AddStringToObject(item, "name", inline_object_2->name) == NULL) {
    goto fail; //String
    }

	// inline_object_2->radius
    if(cJSON_AddNumberToObject(item, "radius", inline_object_2->radius) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_2_t *inline_object_2_parseFromJSON(char *jsonString){

    inline_object_2_t *inline_object_2 = NULL;
    cJSON *inline_object_2JSON = cJSON_Parse(jsonString);
    if(inline_object_2JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_2->address
    cJSON *address = cJSON_GetObjectItemCaseSensitive(inline_object_2JSON, "address");
    if(!cJSON_IsString(address) || (address->valuestring == NULL)){
    goto end; //String
    }

    // inline_object_2->groupId
    cJSON *groupId = cJSON_GetObjectItemCaseSensitive(inline_object_2JSON, "groupId");
    if(!cJSON_IsNumber(groupId))
    {
    goto end; //Numeric
    }

    // inline_object_2->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(inline_object_2JSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // inline_object_2->radius
    cJSON *radius = cJSON_GetObjectItemCaseSensitive(inline_object_2JSON, "radius");
    if(!cJSON_IsNumber(radius))
    {
    goto end; //Numeric
    }


    inline_object_2 = inline_object_2_create (
        strdup(address->valuestring),
        groupId->valuedouble,
        strdup(name->valuestring),
        radius->valuedouble
        );
 cJSON_Delete(inline_object_2JSON);
    return inline_object_2;
end:
    cJSON_Delete(inline_object_2JSON);
    return NULL;

}

