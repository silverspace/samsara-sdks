#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_4.h"



inline_object_4_t *inline_object_4_create(
    bool reactivate
    ) {
	inline_object_4_t *inline_object_4 = malloc(sizeof(inline_object_4_t));
	inline_object_4->reactivate = reactivate;

	return inline_object_4;
}


void inline_object_4_free(inline_object_4_t *inline_object_4) {
    listEntry_t *listEntry;

	free(inline_object_4);
}

cJSON *inline_object_4_convertToJSON(inline_object_4_t *inline_object_4) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_4->reactivate
    if(cJSON_AddBoolToObject(item, "reactivate", inline_object_4->reactivate) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_4_t *inline_object_4_parseFromJSON(char *jsonString){

    inline_object_4_t *inline_object_4 = NULL;
    cJSON *inline_object_4JSON = cJSON_Parse(jsonString);
    if(inline_object_4JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_4->reactivate
    cJSON *reactivate = cJSON_GetObjectItemCaseSensitive(inline_object_4JSON, "reactivate");
    if(!cJSON_IsBool(reactivate))
    {
    goto end; //Numeric
    }


    inline_object_4 = inline_object_4_create (
        reactivate->valueint
        );
 cJSON_Delete(inline_object_4JSON);
    return inline_object_4;
end:
    cJSON_Delete(inline_object_4JSON);
    return NULL;

}

