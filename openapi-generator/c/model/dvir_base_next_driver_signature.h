/*
 * dvir_base_next_driver_signature.h
 *
 * The next driver signature for the DVIR.
 */

#ifndef _dvir_base_next_driver_signature_H_
#define _dvir_base_next_driver_signature_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct dvir_base_next_driver_signature_t {
        long driverId; //numeric
        char *name; //no enum string
        long signedAt; //numeric
        char *type; //no enum string
        char *email; //no enum string
        char *username; //no enum string

} dvir_base_next_driver_signature_t;

dvir_base_next_driver_signature_t *dvir_base_next_driver_signature_create(
        long driverId,
        char *name,
        long signedAt,
        char *type,
        char *email,
        char *username
);

void dvir_base_next_driver_signature_free(dvir_base_next_driver_signature_t *dvir_base_next_driver_signature);

dvir_base_next_driver_signature_t *dvir_base_next_driver_signature_parseFromJSON(char *jsonString);

cJSON *dvir_base_next_driver_signature_convertToJSON(dvir_base_next_driver_signature_t *dvir_base_next_driver_signature);

#endif /* _dvir_base_next_driver_signature_H_ */

