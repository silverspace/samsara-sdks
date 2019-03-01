/*
 * tag_metadata.h
 *
 * 
 */

#ifndef _tag_metadata_H_
#define _tag_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"




typedef struct tag_metadata_t {
        long id; //numeric
        char *name; //no enum string

} tag_metadata_t;

tag_metadata_t *tag_metadata_create(
        long id,
        char *name
);

void tag_metadata_free(tag_metadata_t *tag_metadata);

tag_metadata_t *tag_metadata_parseFromJSON(char *jsonString);

cJSON *tag_metadata_convertToJSON(tag_metadata_t *tag_metadata);

#endif /* _tag_metadata_H_ */

