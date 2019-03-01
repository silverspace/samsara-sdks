/*
 * contact.h
 *
 * Information about a notification contact for alerts.
 */

#ifndef _contact_H_
#define _contact_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct contact_t {
        char *email; //no enum string
        char *firstName; //no enum string
        long id; //numeric
        char *lastName; //no enum string
        char *phone; //no enum string

} contact_t;

contact_t *contact_create(
        char *email,
        char *firstName,
        long id,
        char *lastName,
        char *phone
);

void contact_free(contact_t *contact);

contact_t *contact_parseFromJSON(char *jsonString);

cJSON *contact_convertToJSON(contact_t *contact);

#endif /* _contact_H_ */

