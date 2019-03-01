#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_9.h"



inline_response_200_9_t *inline_response_200_9_create(
    list_t *tags
    ) {
	inline_response_200_9_t *inline_response_200_9 = malloc(sizeof(inline_response_200_9_t));
	inline_response_200_9->tags = tags;

	return inline_response_200_9;
}


void inline_response_200_9_free(inline_response_200_9_t *inline_response_200_9) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, inline_response_200_9->tags) {
		tag_free(listEntry->data);
	}
	list_free(inline_response_200_9->tags);

	free(inline_response_200_9);
}

cJSON *inline_response_200_9_convertToJSON(inline_response_200_9_t *inline_response_200_9) {
	cJSON *item = cJSON_CreateObject();
	// inline_response_200_9->tags
    cJSON *tags = cJSON_AddArrayToObject(item, "tags");
	if(tags == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *tagsListEntry;
	list_ForEach(tagsListEntry, inline_response_200_9->tags) {
		cJSON *item = tag_convertToJSON(tagsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(tags, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_response_200_9_t *inline_response_200_9_parseFromJSON(char *jsonString){

    inline_response_200_9_t *inline_response_200_9 = NULL;
    cJSON *inline_response_200_9JSON = cJSON_Parse(jsonString);
    if(inline_response_200_9JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_response_200_9->tags
    cJSON *tags;
    cJSON *tagsJSON = cJSON_GetObjectItemCaseSensitive(inline_response_200_9JSON,"tags");
    if(!cJSON_IsArray(tagsJSON)){
        goto end; //nonprimitive container
    }

    list_t *tagsList = list_create();

    cJSON_ArrayForEach(tags,tagsJSON )
    {
        if(!cJSON_IsObject(tags)){
            goto end;
        }
		char *JSONData = cJSON_Print(tags);
        tag_t *tagsItem = tag_parseFromJSON(JSONData);

        list_addElement(tagsList, tagsItem);
        free(JSONData);
    }


    inline_response_200_9 = inline_response_200_9_create (
        tagsList
        );
 cJSON_Delete(inline_response_200_9JSON);
    return inline_response_200_9;
end:
    cJSON_Delete(inline_response_200_9JSON);
    return NULL;

}

