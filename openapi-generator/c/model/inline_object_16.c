#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_16.h"



inline_object_16_t *inline_object_16_create(
    list_t* externalIds,
    // TODO map/hash not supported at the moment
    int harsh_accel_setting,
    char *name
    ) {
	inline_object_16_t *inline_object_16 = malloc(sizeof(inline_object_16_t));
	inline_object_16->externalIds = externalIds;
	inline_object_16->harsh_accel_setting = harsh_accel_setting;
	inline_object_16->name = name;

	return inline_object_16;
}


void inline_object_16_free(inline_object_16_t *inline_object_16) {
    listEntry_t *listEntry;
	// TODO map/hash not supported at the moment
    free(inline_object_16->name);

	free(inline_object_16);
}

cJSON *inline_object_16_convertToJSON(inline_object_16_t *inline_object_16) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_16->externalIds
	// map Container
	cJSON *externalIds = cJSON_AddObjectToObject(item, "externalIds");
	if(externalIds == NULL) {
		goto fail; //primitive map container
	}
    cJSON *localMapObject = cJSON_CreateObject(); //Memory free to be implemented in user code
	listEntry_t *externalIdsListEntry;
    list_ForEach(externalIdsListEntry, inline_object_16->externalIds) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)externalIdsListEntry->data;
        if(cJSON_AddStringToObject(localMapObject, localKeyValue->key, (char*)localKeyValue->value) == NULL)
        {
            goto fail;
        }
        cJSON_AddItemToObject(externalIds,"", localMapObject);
    }

	// inline_object_16->harsh_accel_setting
    if(cJSON_AddNumberToObject(item, "harsh_accel_setting", inline_object_16->harsh_accel_setting) == NULL) {
    goto fail; //Numeric
    }

	// inline_object_16->name
    if(cJSON_AddStringToObject(item, "name", inline_object_16->name) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_16_t *inline_object_16_parseFromJSON(char *jsonString){

    inline_object_16_t *inline_object_16 = NULL;
    cJSON *inline_object_16JSON = cJSON_Parse(jsonString);
    if(inline_object_16JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_16->externalIds
    // map
    cJSON *;
    cJSON *externalIdsJSON = cJSON_GetObjectItemCaseSensitive(inline_object_16JSON, "externalIds");
    if(!cJSON_IsObject(externalIdsJSON)) {
        goto end;//primitive map container
    }
    list_t *List = list_create();
    keyValuePair_t *localMapKeyPair;
    cJSON_ArrayForEach(, externalIdsJSON)
    {
        if(!cJSON_IsString())
        {
            goto end;
        }
        localMapKeyPair = keyValuePair_create(strdup(->string),strdup(->valuestring))
        list_addElement(List , localMapKeyPair);

    }

    // inline_object_16->harsh_accel_setting
    cJSON *harsh_accel_setting = cJSON_GetObjectItemCaseSensitive(inline_object_16JSON, "harsh_accel_setting");
    if(!cJSON_IsNumber(harsh_accel_setting))
    {
    goto end; //Numeric
    }

    // inline_object_16->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(inline_object_16JSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }


    inline_object_16 = inline_object_16_create (
        List,
        harsh_accel_setting->valuedouble,
        strdup(name->valuestring)
        );
 cJSON_Delete(inline_object_16JSON);
    return inline_object_16;
end:
    cJSON_Delete(inline_object_16JSON);
    return NULL;

}

