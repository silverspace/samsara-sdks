#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "address.h"



address_t *address_create(
    list_t *contacts,
    char *formattedAddress,
    address_geofence_t *geofence,
    long id,
    char *name,
    char *notes,
    list_t *tags
    ) {
	address_t *address = malloc(sizeof(address_t));
	address->contacts = contacts;
	address->formattedAddress = formattedAddress;
	address->geofence = geofence;
	address->id = id;
	address->name = name;
	address->notes = notes;
	address->tags = tags;

	return address;
}


void address_free(address_t *address) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, address->contacts) {
		contact_free(listEntry->data);
	}
	list_free(address->contacts);
    free(address->formattedAddress);
	address_geofence_free(address->geofence);
    free(address->name);
    free(address->notes);
		list_ForEach(listEntry, address->tags) {
		tag_metadata_free(listEntry->data);
	}
	list_free(address->tags);

	free(address);
}

cJSON *address_convertToJSON(address_t *address) {
	cJSON *item = cJSON_CreateObject();
	// address->contacts
    cJSON *contacts = cJSON_AddArrayToObject(item, "contacts");
	if(contacts == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *contactsListEntry;
	list_ForEach(contactsListEntry, address->contacts) {
		cJSON *item = contact_convertToJSON(contactsListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(contacts, item);
	}

	// address->formattedAddress
    if(cJSON_AddStringToObject(item, "formattedAddress", address->formattedAddress) == NULL) {
    goto fail; //String
    }

	// address->geofence
	cJSON *geofence = address_geofence_convertToJSON(address->geofence);
	if(geofence == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "geofence", geofence);
	if(item->child == NULL) {
		goto fail;
	}

	// address->id
    if(cJSON_AddNumberToObject(item, "id", address->id) == NULL) {
    goto fail; //Numeric
    }

	// address->name
    if(cJSON_AddStringToObject(item, "name", address->name) == NULL) {
    goto fail; //String
    }

	// address->notes
    if(cJSON_AddStringToObject(item, "notes", address->notes) == NULL) {
    goto fail; //String
    }

	// address->tags
    cJSON *tags = cJSON_AddArrayToObject(item, "tags");
	if(tags == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *tagsListEntry;
	list_ForEach(tagsListEntry, address->tags) {
		cJSON *item = tag_metadata_convertToJSON(tagsListEntry->data);
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

address_t *address_parseFromJSON(char *jsonString){

    address_t *address = NULL;
    cJSON *addressJSON = cJSON_Parse(jsonString);
    if(addressJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // address->contacts
    cJSON *contacts;
    cJSON *contactsJSON = cJSON_GetObjectItemCaseSensitive(addressJSON,"contacts");
    if(!cJSON_IsArray(contactsJSON)){
        goto end; //nonprimitive container
    }

    list_t *contactsList = list_create();

    cJSON_ArrayForEach(contacts,contactsJSON )
    {
        if(!cJSON_IsObject(contacts)){
            goto end;
        }
		char *JSONData = cJSON_Print(contacts);
        contact_t *contactsItem = contact_parseFromJSON(JSONData);

        list_addElement(contactsList, contactsItem);
        free(JSONData);
    }

    // address->formattedAddress
    cJSON *formattedAddress = cJSON_GetObjectItemCaseSensitive(addressJSON, "formattedAddress");
    if(!cJSON_IsString(formattedAddress) || (formattedAddress->valuestring == NULL)){
    goto end; //String
    }

    // address->geofence
    address_geofence_t *geofence;
    cJSON *geofenceJSON = cJSON_GetObjectItemCaseSensitive(addressJSON, "geofence");
    if(addressJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *geofenceJSONData = cJSON_Print(geofenceJSON);
    geofence = address_geofence_parseFromJSON(geofenceJSONData);

    // address->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(addressJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // address->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(addressJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // address->notes
    cJSON *notes = cJSON_GetObjectItemCaseSensitive(addressJSON, "notes");
    if(!cJSON_IsString(notes) || (notes->valuestring == NULL)){
    goto end; //String
    }

    // address->tags
    cJSON *tags;
    cJSON *tagsJSON = cJSON_GetObjectItemCaseSensitive(addressJSON,"tags");
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
        tag_metadata_t *tagsItem = tag_metadata_parseFromJSON(JSONData);

        list_addElement(tagsList, tagsItem);
        free(JSONData);
    }


    address = address_create (
        contactsList,
        strdup(formattedAddress->valuestring),
        geofence,
        id->valuedouble,
        strdup(name->valuestring),
        strdup(notes->valuestring),
        tagsList
        );
        free(geofenceJSONData);
 cJSON_Delete(addressJSON);
    return address;
end:
    cJSON_Delete(addressJSON);
    return NULL;

}

