#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "contact.h"



contact_t *contact_create(
    char *email,
    char *firstName,
    long id,
    char *lastName,
    char *phone
    ) {
	contact_t *contact = malloc(sizeof(contact_t));
	contact->email = email;
	contact->firstName = firstName;
	contact->id = id;
	contact->lastName = lastName;
	contact->phone = phone;

	return contact;
}


void contact_free(contact_t *contact) {
    listEntry_t *listEntry;
    free(contact->email);
    free(contact->firstName);
    free(contact->lastName);
    free(contact->phone);

	free(contact);
}

cJSON *contact_convertToJSON(contact_t *contact) {
	cJSON *item = cJSON_CreateObject();
	// contact->email
    if(cJSON_AddStringToObject(item, "email", contact->email) == NULL) {
    goto fail; //String
    }

	// contact->firstName
    if(cJSON_AddStringToObject(item, "firstName", contact->firstName) == NULL) {
    goto fail; //String
    }

	// contact->id
    if(cJSON_AddNumberToObject(item, "id", contact->id) == NULL) {
    goto fail; //Numeric
    }

	// contact->lastName
    if(cJSON_AddStringToObject(item, "lastName", contact->lastName) == NULL) {
    goto fail; //String
    }

	// contact->phone
    if(cJSON_AddStringToObject(item, "phone", contact->phone) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

contact_t *contact_parseFromJSON(char *jsonString){

    contact_t *contact = NULL;
    cJSON *contactJSON = cJSON_Parse(jsonString);
    if(contactJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // contact->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(contactJSON, "email");
    if(!cJSON_IsString(email) || (email->valuestring == NULL)){
    goto end; //String
    }

    // contact->firstName
    cJSON *firstName = cJSON_GetObjectItemCaseSensitive(contactJSON, "firstName");
    if(!cJSON_IsString(firstName) || (firstName->valuestring == NULL)){
    goto end; //String
    }

    // contact->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(contactJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // contact->lastName
    cJSON *lastName = cJSON_GetObjectItemCaseSensitive(contactJSON, "lastName");
    if(!cJSON_IsString(lastName) || (lastName->valuestring == NULL)){
    goto end; //String
    }

    // contact->phone
    cJSON *phone = cJSON_GetObjectItemCaseSensitive(contactJSON, "phone");
    if(!cJSON_IsString(phone) || (phone->valuestring == NULL)){
    goto end; //String
    }


    contact = contact_create (
        strdup(email->valuestring),
        strdup(firstName->valuestring),
        id->valuedouble,
        strdup(lastName->valuestring),
        strdup(phone->valuestring)
        );
 cJSON_Delete(contactJSON);
    return contact;
end:
    cJSON_Delete(contactJSON);
    return NULL;

}

