/*
 * dvir_base_mechanic_or_agent_signature.h
 *
 * The mechanic&#39;s or agent&#39;s signature for the DVIR.
 */

#ifndef _dvir_base_mechanic_or_agent_signature_H_
#define _dvir_base_mechanic_or_agent_signature_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct dvir_base_mechanic_or_agent_signature_t {
        long mechanicUserId; //numeric
        long driverId; //numeric
        char *name; //no enum string
        long signedAt; //numeric
        char *type; //no enum string
        char *email; //no enum string
        char *username; //no enum string

} dvir_base_mechanic_or_agent_signature_t;

dvir_base_mechanic_or_agent_signature_t *dvir_base_mechanic_or_agent_signature_create(
        long mechanicUserId,
        long driverId,
        char *name,
        long signedAt,
        char *type,
        char *email,
        char *username
);

void dvir_base_mechanic_or_agent_signature_free(dvir_base_mechanic_or_agent_signature_t *dvir_base_mechanic_or_agent_signature);

dvir_base_mechanic_or_agent_signature_t *dvir_base_mechanic_or_agent_signature_parseFromJSON(char *jsonString);

cJSON *dvir_base_mechanic_or_agent_signature_convertToJSON(dvir_base_mechanic_or_agent_signature_t *dvir_base_mechanic_or_agent_signature);

#endif /* _dvir_base_mechanic_or_agent_signature_H_ */

