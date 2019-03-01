#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "_addresses_addresses.h"



_addresses_addresses_t *_addresses_addresses_create(
    char *notes,
    char *formattedAddress,
    address_geofence_t *geofence,
    list_t *tagIds,
    char *name,
    list_t *contactIds
    ) {
	_addresses_addresses_t *_addresses_addresses = malloc(sizeof(_addresses_addresses_t));
	_addresses_addresses->notes = notes;
	_addresses_addresses->formattedAddress = formattedAddress;
	_addresses_addresses->geofence = geofence;
	_addresses_addresses->tagIds = tagIds;
	_addresses_addresses->name = name;
	_addresses_addresses->contactIds = contactIds;

	return _addresses_addresses;
}


void _addresses_addresses_free(_addresses_addresses_t *_addresses_addresses) {
    listEntry_t *listEntry;
    free(_addresses_addresses->notes);
    free(_addresses_addresses->formattedAddress);
	address_geofence_free(_addresses_addresses->geofence);
	list_ForEach(listEntry, _addresses_addresses->tagIds) {
		free(listEntry->data);
	}
	list_free(_addresses_addresses->tagIds);
    free(_addresses_addresses->name);
	list_ForEach(listEntry, _addresses_addresses->contactIds) {
		free(listEntry->data);
	}
	list_free(_addresses_addresses->contactIds);

	free(_addresses_addresses);
}

cJSON *_addresses_addresses_convertToJSON(_addresses_addresses_t *_addresses_addresses) {
	cJSON *item = cJSON_CreateObject();
	// _addresses_addresses->notes
    if(cJSON_AddStringToObject(item, "notes", _addresses_addresses->notes) == NULL) {
    goto fail; //String
    }

	// _addresses_addresses->formattedAddress
    if(cJSON_AddStringToObject(item, "formattedAddress", _addresses_addresses->formattedAddress) == NULL) {
    goto fail; //String
    }

	// _addresses_addresses->geofence
	cJSON *geofence = address_geofence_convertToJSON(_addresses_addresses->geofence);
	if(geofence == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "geofence", geofence);
	if(item->child == NULL) {
		goto fail;
	}

	// _addresses_addresses->tagIds
	cJSON *tag_ids = cJSON_AddArrayToObject(item, "tagIds");
	if(tag_ids == NULL) {
		goto fail; //primitive container
	}

	listEntry_t *tag_idsListEntry;
    list_ForEach(tag_idsListEntry, _addresses_addresses->tagIds) {
        if(cJSON_AddNumberToObject(tag_ids, "", *(double *)tag_idsListEntry->data) == NULL)
        {
            goto fail;
        }
    }

	// _addresses_addresses->name
    if(cJSON_AddStringToObject(item, "name", _addresses_addresses->name) == NULL) {
    goto fail; //String
    }

	// _addresses_addresses->contactIds
	cJSON *contact_ids = cJSON_AddArrayToObject(item, "contactIds");
	if(contact_ids == NULL) {
		goto fail; //primitive container
	}

	listEntry_t *contact_idsListEntry;
    list_ForEach(contact_idsListEntry, _addresses_addresses->contactIds) {
        if(cJSON_AddNumberToObject(contact_ids, "", *(double *)contact_idsListEntry->data) == NULL)
        {
            goto fail;
        }
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

_addresses_addresses_t *_addresses_addresses_parseFromJSON(char *jsonString){

    _addresses_addresses_t *_addresses_addresses = NULL;
    cJSON *_addresses_addressesJSON = cJSON_Parse(jsonString);
    if(_addresses_addressesJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // _addresses_addresses->notes
    cJSON *notes = cJSON_GetObjectItemCaseSensitive(_addresses_addressesJSON, "notes");
    if(!cJSON_IsString(notes) || (notes->valuestring == NULL)){
    goto end; //String
    }

    // _addresses_addresses->formattedAddress
    cJSON *formattedAddress = cJSON_GetObjectItemCaseSensitive(_addresses_addressesJSON, "formattedAddress");
    if(!cJSON_IsString(formattedAddress) || (formattedAddress->valuestring == NULL)){
    goto end; //String
    }

    // _addresses_addresses->geofence
    address_geofence_t *geofence;
    cJSON *geofenceJSON = cJSON_GetObjectItemCaseSensitive(_addresses_addressesJSON, "geofence");
    if(_addresses_addressesJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *geofenceJSONData = cJSON_Print(geofenceJSON);
    geofence = address_geofence_parseFromJSON(geofenceJSONData);

    // _addresses_addresses->tagIds
    cJSON *tag_ids;
    cJSON *tagIdsJSON = cJSON_GetObjectItemCaseSensitive(_addresses_addressesJSON, "tagIds");
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

    // _addresses_addresses->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(_addresses_addressesJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // _addresses_addresses->contactIds
    cJSON *contact_ids;
    cJSON *contactIdsJSON = cJSON_GetObjectItemCaseSensitive(_addresses_addressesJSON, "contactIds");
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


    _addresses_addresses = _addresses_addresses_create (
        strdup(notes->valuestring),
        strdup(formattedAddress->valuestring),
        geofence,
        tag_idsList,
        strdup(name->valuestring),
        contact_idsList
        );
        free(geofenceJSONData);
 cJSON_Delete(_addresses_addressesJSON);
    return _addresses_addresses;
end:
    cJSON_Delete(_addresses_addressesJSON);
    return NULL;

}

