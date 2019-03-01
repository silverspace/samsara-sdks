#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "document_type.h"



document_type_t *document_type_create(
    list_t *fieldTypes,
    char *name,
    long orgId,
    char *uuid
    ) {
	document_type_t *document_type = malloc(sizeof(document_type_t));
	document_type->fieldTypes = fieldTypes;
	document_type->name = name;
	document_type->orgId = orgId;
	document_type->uuid = uuid;

	return document_type;
}


void document_type_free(document_type_t *document_type) {
    listEntry_t *listEntry;
	list_ForEach(listEntry, document_type->fieldTypes) {
		free(listEntry->data);
	}
	list_free(document_type->fieldTypes);
    free(document_type->name);
    free(document_type->uuid);

	free(document_type);
}

cJSON *document_type_convertToJSON(document_type_t *document_type) {
	cJSON *item = cJSON_CreateObject();
	// document_type->fieldTypes
	cJSON *field_types = cJSON_AddArrayToObject(item, "fieldTypes");
	if(field_types == NULL) {
		goto fail; //primitive container
	}

	listEntry_t *field_typesListEntry;
    list_ForEach(field_typesListEntry, document_type->fieldTypes) {
        if(cJSON_AddNumberToObject(field_types, "", *(double *)field_typesListEntry->data) == NULL)
        {
            goto fail;
        }
    }

	// document_type->name
    if(cJSON_AddStringToObject(item, "name", document_type->name) == NULL) {
    goto fail; //String
    }

	// document_type->orgId
    if(cJSON_AddNumberToObject(item, "orgId", document_type->orgId) == NULL) {
    goto fail; //Numeric
    }

	// document_type->uuid
    if(cJSON_AddStringToObject(item, "uuid", document_type->uuid) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

document_type_t *document_type_parseFromJSON(char *jsonString){

    document_type_t *document_type = NULL;
    cJSON *document_typeJSON = cJSON_Parse(jsonString);
    if(document_typeJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // document_type->fieldTypes
    cJSON *field_types;
    cJSON *fieldTypesJSON = cJSON_GetObjectItemCaseSensitive(document_typeJSON, "fieldTypes");
    if(!cJSON_IsArray(fieldTypesJSON)) {
        goto end;//primitive container
    }
    list_t *field_typesList = list_create();

    cJSON_ArrayForEach(field_types, fieldTypesJSON)
    {
        if(!cJSON_IsNumber(field_types))
        {
            goto end;
        }
        list_addElement(field_typesList , &field_types->valuedouble);

    }

    // document_type->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(document_typeJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // document_type->orgId
    cJSON *orgId = cJSON_GetObjectItemCaseSensitive(document_typeJSON, "orgId");
    if(!cJSON_IsNumber(orgId))
    {
    goto end; //Numeric
    }

    // document_type->uuid
    cJSON *uuid = cJSON_GetObjectItemCaseSensitive(document_typeJSON, "uuid");
    if(!cJSON_IsString(uuid) || (uuid->valuestring == NULL)){
    goto end; //String
    }


    document_type = document_type_create (
        field_typesList,
        strdup(name->valuestring),
        orgId->valuedouble,
        strdup(uuid->valuestring)
        );
 cJSON_Delete(document_typeJSON);
    return document_type;
end:
    cJSON_Delete(document_typeJSON);
    return NULL;

}

