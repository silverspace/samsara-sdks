#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200.h"



inline_response_200_t *inline_response_200_create(
    list_t *assets
    ) {
	inline_response_200_t *inline_response_200 = malloc(sizeof(inline_response_200_t));
	inline_response_200->assets = assets;

	return inline_response_200;
}


void inline_response_200_free(inline_response_200_t *inline_response_200) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, inline_response_200->assets) {
		asset_free(listEntry->data);
	}
	list_free(inline_response_200->assets);

	free(inline_response_200);
}

cJSON *inline_response_200_convertToJSON(inline_response_200_t *inline_response_200) {
	cJSON *item = cJSON_CreateObject();
	// inline_response_200->assets
    cJSON *assets = cJSON_AddArrayToObject(item, "assets");
	if(assets == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *assetsListEntry;
	list_ForEach(assetsListEntry, inline_response_200->assets) {
		cJSON *item = asset_convertToJSON(assetsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(assets, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_response_200_t *inline_response_200_parseFromJSON(char *jsonString){

    inline_response_200_t *inline_response_200 = NULL;
    cJSON *inline_response_200JSON = cJSON_Parse(jsonString);
    if(inline_response_200JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_response_200->assets
    cJSON *assets;
    cJSON *assetsJSON = cJSON_GetObjectItemCaseSensitive(inline_response_200JSON,"assets");
    if(!cJSON_IsArray(assetsJSON)){
        goto end; //nonprimitive container
    }

    list_t *assetsList = list_create();

    cJSON_ArrayForEach(assets,assetsJSON )
    {
        if(!cJSON_IsObject(assets)){
            goto end;
        }
		char *JSONData = cJSON_Print(assets);
        asset_t *assetsItem = asset_parseFromJSON(JSONData);

        list_addElement(assetsList, assetsItem);
        free(JSONData);
    }


    inline_response_200 = inline_response_200_create (
        assetsList
        );
 cJSON_Delete(inline_response_200JSON);
    return inline_response_200;
end:
    cJSON_Delete(inline_response_200JSON);
    return NULL;

}

