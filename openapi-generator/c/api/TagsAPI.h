#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/inline_response_200_9.h"
#include "../model/tag.h"
#include "../model/tag_create.h"
#include "../model/tag_modify.h"
#include "../model/tag_update.h"


// /tags
//
// Create a new tag for the group.
//
tag_t*
TagsAPI_createTag(apiClient_t *apiClient,char* access_token ,tag_create_t* tagCreateParams );



// /tags/{tag_id:[0-9]+}
//
// Permanently deletes a tag.
//
void
TagsAPI_deleteTagById(apiClient_t *apiClient,char* access_token ,long tag_id );



// /tags
//
// Fetch all of the tags for a group.
//
inline_response_200_9_t*
TagsAPI_getAllTags(apiClient_t *apiClient,char* access_token ,long group_id );



// /tags/{tag_id:[0-9]+}
//
// Fetch a tag by id.
//
tag_t*
TagsAPI_getTagById(apiClient_t *apiClient,char* access_token ,long tag_id );



// /tags/{tag_id:[0-9]+}
//
// Add or delete specific members from a tag, or modify the name of a tag.
//
tag_t*
TagsAPI_modifyTagById(apiClient_t *apiClient,char* access_token ,long tag_id ,tag_modify_t* tagModifyParams );



// /tags/{tag_id:[0-9]+}
//
// Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
//
tag_t*
TagsAPI_updateTagById(apiClient_t *apiClient,char* access_token ,long tag_id ,tag_update_t* updateTagParams );



