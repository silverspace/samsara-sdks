#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object.h"



inline_object_t *inline_object_create(
    list_t *addresses
    ) {
	inline_object_t *inline_object = malloc(sizeof(inline_object_t));
	inline_object->addresses = addresses;

	return inline_object;
}


void inline_object_free(inline_object_t *inline_object) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, inline_object->addresses) {
		_addresses_addresses_free(listEntry->data);
	}
	list_free(inline_object->addresses);

	free(inline_object);
}

cJSON *inline_object_convertToJSON(inline_object_t *inline_object) {
	cJSON *item = cJSON_CreateObject();
	// inline_object->addresses
    cJSON *addresses = cJSON_AddArrayToObject(item, "addresses");
	if(addresses == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *addressesListEntry;
	list_ForEach(addressesListEntry, inline_object->addresses) {
		cJSON *item = _addresses_addresses_convertToJSON(addressesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(addresses, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_t *inline_object_parseFromJSON(char *jsonString){

    inline_object_t *inline_object = NULL;
    cJSON *inline_objectJSON = cJSON_Parse(jsonString);
    if(inline_objectJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object->addresses
    cJSON *addresses;
    cJSON *addressesJSON = cJSON_GetObjectItemCaseSensitive(inline_objectJSON,"addresses");
    if(!cJSON_IsArray(addressesJSON)){
        goto end; //nonprimitive container
    }

    list_t *addressesList = list_create();

    cJSON_ArrayForEach(addresses,addressesJSON )
    {
        if(!cJSON_IsObject(addresses)){
            goto end;
        }
		char *JSONData = cJSON_Print(addresses);
        _addresses_addresses_t *addressesItem = _addresses_addresses_parseFromJSON(JSONData);

        list_addElement(addressesList, addressesItem);
        free(JSONData);
    }


    inline_object = inline_object_create (
        addressesList
        );
 cJSON_Delete(inline_objectJSON);
    return inline_object;
end:
    cJSON_Delete(inline_objectJSON);
    return NULL;

}

