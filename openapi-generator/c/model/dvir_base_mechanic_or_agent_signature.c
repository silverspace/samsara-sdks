#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dvir_base_mechanic_or_agent_signature.h"



dvir_base_mechanic_or_agent_signature_t *dvir_base_mechanic_or_agent_signature_create(
    long mechanicUserId,
    long driverId,
    char *name,
    long signedAt,
    char *type,
    char *email,
    char *username
    ) {
	dvir_base_mechanic_or_agent_signature_t *dvir_base_mechanic_or_agent_signature = malloc(sizeof(dvir_base_mechanic_or_agent_signature_t));
	dvir_base_mechanic_or_agent_signature->mechanicUserId = mechanicUserId;
	dvir_base_mechanic_or_agent_signature->driverId = driverId;
	dvir_base_mechanic_or_agent_signature->name = name;
	dvir_base_mechanic_or_agent_signature->signedAt = signedAt;
	dvir_base_mechanic_or_agent_signature->type = type;
	dvir_base_mechanic_or_agent_signature->email = email;
	dvir_base_mechanic_or_agent_signature->username = username;

	return dvir_base_mechanic_or_agent_signature;
}


void dvir_base_mechanic_or_agent_signature_free(dvir_base_mechanic_or_agent_signature_t *dvir_base_mechanic_or_agent_signature) {
    listEntry_t *listEntry;
    free(dvir_base_mechanic_or_agent_signature->name);
    free(dvir_base_mechanic_or_agent_signature->type);
    free(dvir_base_mechanic_or_agent_signature->email);
    free(dvir_base_mechanic_or_agent_signature->username);

	free(dvir_base_mechanic_or_agent_signature);
}

cJSON *dvir_base_mechanic_or_agent_signature_convertToJSON(dvir_base_mechanic_or_agent_signature_t *dvir_base_mechanic_or_agent_signature) {
	cJSON *item = cJSON_CreateObject();
	// dvir_base_mechanic_or_agent_signature->mechanicUserId
    if(cJSON_AddNumberToObject(item, "mechanicUserId", dvir_base_mechanic_or_agent_signature->mechanicUserId) == NULL) {
    goto fail; //Numeric
    }

	// dvir_base_mechanic_or_agent_signature->driverId
    if(cJSON_AddNumberToObject(item, "driverId", dvir_base_mechanic_or_agent_signature->driverId) == NULL) {
    goto fail; //Numeric
    }

	// dvir_base_mechanic_or_agent_signature->name
    if(cJSON_AddStringToObject(item, "name", dvir_base_mechanic_or_agent_signature->name) == NULL) {
    goto fail; //String
    }

	// dvir_base_mechanic_or_agent_signature->signedAt
    if(cJSON_AddNumberToObject(item, "signedAt", dvir_base_mechanic_or_agent_signature->signedAt) == NULL) {
    goto fail; //Numeric
    }

	// dvir_base_mechanic_or_agent_signature->type
    if(cJSON_AddStringToObject(item, "type", dvir_base_mechanic_or_agent_signature->type) == NULL) {
    goto fail; //String
    }

	// dvir_base_mechanic_or_agent_signature->email
    if(cJSON_AddStringToObject(item, "email", dvir_base_mechanic_or_agent_signature->email) == NULL) {
    goto fail; //String
    }

	// dvir_base_mechanic_or_agent_signature->username
    if(cJSON_AddStringToObject(item, "username", dvir_base_mechanic_or_agent_signature->username) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

dvir_base_mechanic_or_agent_signature_t *dvir_base_mechanic_or_agent_signature_parseFromJSON(char *jsonString){

    dvir_base_mechanic_or_agent_signature_t *dvir_base_mechanic_or_agent_signature = NULL;
    cJSON *dvir_base_mechanic_or_agent_signatureJSON = cJSON_Parse(jsonString);
    if(dvir_base_mechanic_or_agent_signatureJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // dvir_base_mechanic_or_agent_signature->mechanicUserId
    cJSON *mechanicUserId = cJSON_GetObjectItemCaseSensitive(dvir_base_mechanic_or_agent_signatureJSON, "mechanicUserId");
    if(!cJSON_IsNumber(mechanicUserId))
    {
    goto end; //Numeric
    }

    // dvir_base_mechanic_or_agent_signature->driverId
    cJSON *driverId = cJSON_GetObjectItemCaseSensitive(dvir_base_mechanic_or_agent_signatureJSON, "driverId");
    if(!cJSON_IsNumber(driverId))
    {
    goto end; //Numeric
    }

    // dvir_base_mechanic_or_agent_signature->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(dvir_base_mechanic_or_agent_signatureJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // dvir_base_mechanic_or_agent_signature->signedAt
    cJSON *signedAt = cJSON_GetObjectItemCaseSensitive(dvir_base_mechanic_or_agent_signatureJSON, "signedAt");
    if(!cJSON_IsNumber(signedAt))
    {
    goto end; //Numeric
    }

    // dvir_base_mechanic_or_agent_signature->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(dvir_base_mechanic_or_agent_signatureJSON, "type");
    if(!cJSON_IsString(type) || (type->valuestring == NULL)){
    goto end; //String
    }

    // dvir_base_mechanic_or_agent_signature->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(dvir_base_mechanic_or_agent_signatureJSON, "email");
    if(!cJSON_IsString(email) || (email->valuestring == NULL)){
    goto end; //String
    }

    // dvir_base_mechanic_or_agent_signature->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(dvir_base_mechanic_or_agent_signatureJSON, "username");
    if(!cJSON_IsString(username) || (username->valuestring == NULL)){
    goto end; //String
    }


    dvir_base_mechanic_or_agent_signature = dvir_base_mechanic_or_agent_signature_create (
        mechanicUserId->valuedouble,
        driverId->valuedouble,
        strdup(name->valuestring),
        signedAt->valuedouble,
        strdup(type->valuestring),
        strdup(email->valuestring),
        strdup(username->valuestring)
        );
 cJSON_Delete(dvir_base_mechanic_or_agent_signatureJSON);
    return dvir_base_mechanic_or_agent_signature;
end:
    cJSON_Delete(dvir_base_mechanic_or_agent_signatureJSON);
    return NULL;

}

