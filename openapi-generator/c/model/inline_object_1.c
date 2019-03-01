#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_object_1.h"



inline_object_1_t *inline_object_1_create(
    list_t *contactIds,
    char *formattedAddress,
    address_geofence_t *geofence,
    char *name,
    char *notes,
    list_t *tagIds
    ) {
	inline_object_1_t *inline_object_1 = malloc(sizeof(inline_object_1_t));
	inline_object_1->contactIds = contactIds;
	inline_object_1->formattedAddress = formattedAddress;
	inline_object_1->geofence = geofence;
	inline_object_1->name = name;
	inline_object_1->notes = notes;
	inline_object_1->tagIds = tagIds;

	return inline_object_1;
}


void inline_object_1_free(inline_object_1_t *inline_object_1) {
    listEntry_t *listEntry;
	list_ForEach(listEntry, inline_object_1->contactIds) {
		free(listEntry->data);
	}
	list_free(inline_object_1->contactIds);
    free(inline_object_1->formattedAddress);
	address_geofence_free(inline_object_1->geofence);
    free(inline_object_1->name);
    free(inline_object_1->notes);
	list_ForEach(listEntry, inline_object_1->tagIds) {
		free(listEntry->data);
	}
	list_free(inline_object_1->tagIds);

	free(inline_object_1);
}

cJSON *inline_object_1_convertToJSON(inline_object_1_t *inline_object_1) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_1->contactIds
	cJSON *contact_ids = cJSON_AddArrayToObject(item, "contactIds");
	if(contact_ids == NULL) {
		goto fail; //primitive container
	}

	listEntry_t *contact_idsListEntry;
    list_ForEach(contact_idsListEntry, inline_object_1->contactIds) {
        if(cJSON_AddNumberToObject(contact_ids, "", *(double *)contact_idsListEntry->data) == NULL)
        {
            goto fail;
        }
    }

	// inline_object_1->formattedAddress
    if(cJSON_AddStringToObject(item, "formattedAddress", inline_object_1->formattedAddress) == NULL) {
    goto fail; //String
    }

	// inline_object_1->geofence
	cJSON *geofence = address_geofence_convertToJSON(inline_object_1->geofence);
	if(geofence == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "geofence", geofence);
	if(item->child == NULL) {
		goto fail;
	}

	// inline_object_1->name
    if(cJSON_AddStringToObject(item, "name", inline_object_1->name) == NULL) {
    goto fail; //String
    }

	// inline_object_1->notes
    if(cJSON_AddStringToObject(item, "notes", inline_object_1->notes) == NULL) {
    goto fail; //String
    }

	// inline_object_1->tagIds
	cJSON *tag_ids = cJSON_AddArrayToObject(item, "tagIds");
	if(tag_ids == NULL) {
		goto fail; //primitive container
	}

	listEntry_t *tag_idsListEntry;
    list_ForEach(tag_idsListEntry, inline_object_1->tagIds) {
        if(cJSON_AddNumberToObject(tag_ids, "", *(double *)tag_idsListEntry->data) == NULL)
        {
            goto fail;
        }
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_1_t *inline_object_1_parseFromJSON(char *jsonString){

    inline_object_1_t *inline_object_1 = NULL;
    cJSON *inline_object_1JSON = cJSON_Parse(jsonString);
    if(inline_object_1JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_1->contactIds
    cJSON *contact_ids;
    cJSON *contactIdsJSON = cJSON_GetObjectItemCaseSensitive(inline_object_1JSON, "contactIds");
    if(!cJSON_IsArray(contactIdsJSON)) {
        goto end;//primitive container
    }
    list_t *contact_idsList = list_create();

    cJSON_ArrayForEach(contact_ids, contactIdsJSON)
    {
        if(!cJSON_IsNumber(contact_ids))
        {
            goto end;
        }
        list_addElement(contact_idsList , &contact_ids->valuedouble);

    }

    // inline_object_1->formattedAddress
    cJSON *formattedAddress = cJSON_GetObjectItemCaseSensitive(inline_object_1JSON, "formattedAddress");
    if(!cJSON_IsString(formattedAddress) || (formattedAddress->valuestring == NULL)){
    goto end; //String
    }

    // inline_object_1->geofence
    address_geofence_t *geofence;
    cJSON *geofenceJSON = cJSON_GetObjectItemCaseSensitive(inline_object_1JSON, "geofence");
    if(inline_object_1JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *geofenceJSONData = cJSON_Print(geofenceJSON);
    geofence = address_geofence_parseFromJSON(geofenceJSONData);

    // inline_object_1->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(inline_object_1JSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // inline_object_1->notes
    cJSON *notes = cJSON_GetObjectItemCaseSensitive(inline_object_1JSON, "notes");
    if(!cJSON_IsString(notes) || (notes->valuestring == NULL)){
    goto end; //String
    }

    // inline_object_1->tagIds
    cJSON *tag_ids;
    cJSON *tagIdsJSON = cJSON_GetObjectItemCaseSensitive(inline_object_1JSON, "tagIds");
    if(!cJSON_IsArray(tagIdsJSON)) {
        goto end;//primitive container
    }
    list_t *tag_idsList = list_create();

    cJSON_ArrayForEach(tag_ids, tagIdsJSON)
    {
        if(!cJSON_IsNumber(tag_ids))
        {
            goto end;
        }
        list_addElement(tag_idsList , &tag_ids->valuedouble);

    }


    inline_object_1 = inline_object_1_create (
        contact_idsList,
        strdup(formattedAddress->valuestring),
        geofence,
        strdup(name->valuestring),
        strdup(notes->valuestring),
        tag_idsList
        );
        free(geofenceJSONData);
 cJSON_Delete(inline_object_1JSON);
    return inline_object_1;
end:
    cJSON_Delete(inline_object_1JSON);
    return NULL;

}

