#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dvir_list_response.h"



dvir_list_response_t *dvir_list_response_create(
    list_t *dvirs
    ) {
	dvir_list_response_t *dvir_list_response = malloc(sizeof(dvir_list_response_t));
	dvir_list_response->dvirs = dvirs;

	return dvir_list_response;
}


void dvir_list_response_free(dvir_list_response_t *dvir_list_response) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, dvir_list_response->dvirs) {
		dvir_base_free(listEntry->data);
	}
	list_free(dvir_list_response->dvirs);

	free(dvir_list_response);
}

cJSON *dvir_list_response_convertToJSON(dvir_list_response_t *dvir_list_response) {
	cJSON *item = cJSON_CreateObject();
	// dvir_list_response->dvirs
    cJSON *dvirs = cJSON_AddArrayToObject(item, "dvirs");
	if(dvirs == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *dvirsListEntry;
	list_ForEach(dvirsListEntry, dvir_list_response->dvirs) {
		cJSON *item = dvir_base_convertToJSON(dvirsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(dvirs, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

dvir_list_response_t *dvir_list_response_parseFromJSON(char *jsonString){

    dvir_list_response_t *dvir_list_response = NULL;
    cJSON *dvir_list_responseJSON = cJSON_Parse(jsonString);
    if(dvir_list_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // dvir_list_response->dvirs
    cJSON *dvirs;
    cJSON *dvirsJSON = cJSON_GetObjectItemCaseSensitive(dvir_list_responseJSON,"dvirs");
    if(!cJSON_IsArray(dvirsJSON)){
        goto end; //nonprimitive container
    }

    list_t *dvirsList = list_create();

    cJSON_ArrayForEach(dvirs,dvirsJSON )
    {
        if(!cJSON_IsObject(dvirs)){
            goto end;
        }
		char *JSONData = cJSON_Print(dvirs);
        dvir_base_t *dvirsItem = dvir_base_parseFromJSON(JSONData);

        list_addElement(dvirsList, dvirsItem);
        free(JSONData);
    }


    dvir_list_response = dvir_list_response_create (
        dvirsList
        );
 cJSON_Delete(dvir_list_responseJSON);
    return dvir_list_response;
end:
    cJSON_Delete(dvir_list_responseJSON);
    return NULL;

}

