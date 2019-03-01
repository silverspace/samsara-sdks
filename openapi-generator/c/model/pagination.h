/*
 * pagination.h
 *
 * 
 */

#ifndef _pagination_H_
#define _pagination_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

typedef int bool;
#define true 1
#define false 0
typedef int bool;
#define true 1
#define false 0



typedef struct pagination_t {
        char *endCursor; //no enum string
        bool hasNextPage; //boolean
        bool hasPrevPage; //boolean
        char *startCursor; //no enum string

} pagination_t;

pagination_t *pagination_create(
        char *endCursor,
        bool hasNextPage,
        bool hasPrevPage,
        char *startCursor
);

void pagination_free(pagination_t *pagination);

pagination_t *pagination_parseFromJSON(char *jsonString);

cJSON *pagination_convertToJSON(pagination_t *pagination);

#endif /* _pagination_H_ */

