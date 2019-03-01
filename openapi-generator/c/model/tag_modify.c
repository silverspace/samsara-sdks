#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tag_modify.h"



tag_modify_t *tag_modify_create(
    tag_modify_add_t *add,
    tag_modify_delete_t *delete,
    char *name,
    long parentTagId
    ) {
	tag_modify_t *tag_modify = malloc(sizeof(tag_modify_t));
	tag_modify->add = add;
	tag_modify->delete = delete;
	tag_modify->name = name;
	tag_modify->parentTagId = parentTagId;

	return tag_modify;
}


void tag_modify_free(tag_modify_t *tag_modify) {
    listEntry_t *listEntry;
	tag_modify_add_free(tag_modify->add);
	tag_modify_delete_free(tag_modify->delete);
    free(tag_modify->name);

	free(tag_modify);
}

cJSON *tag_modify_convertToJSON(tag_modify_t *tag_modify) {
	cJSON *item = cJSON_CreateObject();
	// tag_modify->add
	cJSON *add = tag_modify_add_convertToJSON(tag_modify->add);
	if(add == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "add", add);
	if(item->child == NULL) {
		goto fail;
	}

	// tag_modify->delete
	cJSON *delete = tag_modify_delete_convertToJSON(tag_modify->delete);
	if(delete == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "delete", delete);
	if(item->child == NULL) {
		goto fail;
	}

	// tag_modify->name
    if(cJSON_AddStringToObject(item, "name", tag_modify->name) == NULL) {
    goto fail; //String
    }

	// tag_modify->parentTagId
    if(cJSON_AddNumberToObject(item, "parentTagId", tag_modify->parentTagId) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

tag_modify_t *tag_modify_parseFromJSON(char *jsonString){

    tag_modify_t *tag_modify = NULL;
    cJSON *tag_modifyJSON = cJSON_Parse(jsonString);
    if(tag_modifyJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // tag_modify->add
    tag_modify_add_t *add;
    cJSON *addJSON = cJSON_GetObjectItemCaseSensitive(tag_modifyJSON, "add");
    if(tag_modifyJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *addJSONData = cJSON_Print(addJSON);
    add = tag_modify_add_parseFromJSON(addJSONData);

    // tag_modify->delete
    tag_modify_delete_t *delete;
    cJSON *deleteJSON = cJSON_GetObjectItemCaseSensitive(tag_modifyJSON, "delete");
    if(tag_modifyJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *deleteJSONData = cJSON_Print(deleteJSON);
    delete = tag_modify_delete_parseFromJSON(deleteJSONData);

    // tag_modify->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(tag_modifyJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // tag_modify->parentTagId
    cJSON *parentTagId = cJSON_GetObjectItemCaseSensitive(tag_modifyJSON, "parentTagId");
    if(!cJSON_IsNumber(parentTagId))
    {
    goto end; //Numeric
    }


    tag_modify = tag_modify_create (
        add,
        delete,
        strdup(name->valuestring),
        parentTagId->valuedouble
        );
        free(addJSONData);
        free(deleteJSONData);
 cJSON_Delete(tag_modifyJSON);
    return tag_modify;
end:
    cJSON_Delete(tag_modifyJSON);
    return NULL;

}

