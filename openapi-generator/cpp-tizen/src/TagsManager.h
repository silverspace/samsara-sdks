#ifndef _TagsManager_H_
#define _TagsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Inline_response_200_9.h"
#include "Tag.h"
#include "TagCreate.h"
#include "TagModify.h"
#include "TagUpdate.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Tags Tags
 * \ingroup Operations
 *  @{
 */
class TagsManager {
public:
	TagsManager();
	virtual ~TagsManager();

/*! \brief /tags. *Synchronous*
 *
 * Create a new tag for the group.
 * \param accessToken Samsara API access token. *Required*
 * \param tagCreateParams  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createTagSync(char * accessToken,
	std::string accessToken, TagCreate tagCreateParams, 
	void(* handler)(Tag, Error, void* )
	, void* userData);

/*! \brief /tags. *Asynchronous*
 *
 * Create a new tag for the group.
 * \param accessToken Samsara API access token. *Required*
 * \param tagCreateParams  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createTagAsync(char * accessToken,
	std::string accessToken, TagCreate tagCreateParams, 
	void(* handler)(Tag, Error, void* )
	, void* userData);


/*! \brief /tags/{tag_id:[0-9]+}. *Synchronous*
 *
 * Permanently deletes a tag.
 * \param accessToken Samsara API access token. *Required*
 * \param tagId ID of the tag. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteTagByIdSync(char * accessToken,
	std::string accessToken, long long tagId, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief /tags/{tag_id:[0-9]+}. *Asynchronous*
 *
 * Permanently deletes a tag.
 * \param accessToken Samsara API access token. *Required*
 * \param tagId ID of the tag. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteTagByIdAsync(char * accessToken,
	std::string accessToken, long long tagId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief /tags. *Synchronous*
 *
 * Fetch all of the tags for a group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAllTagsSync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200_9, Error, void* )
	, void* userData);

/*! \brief /tags. *Asynchronous*
 *
 * Fetch all of the tags for a group.
 * \param accessToken Samsara API access token. *Required*
 * \param groupId Optional group ID if the organization has multiple groups (uncommon).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAllTagsAsync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200_9, Error, void* )
	, void* userData);


/*! \brief /tags/{tag_id:[0-9]+}. *Synchronous*
 *
 * Fetch a tag by id.
 * \param accessToken Samsara API access token. *Required*
 * \param tagId ID of the tag. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getTagByIdSync(char * accessToken,
	std::string accessToken, long long tagId, 
	void(* handler)(Tag, Error, void* )
	, void* userData);

/*! \brief /tags/{tag_id:[0-9]+}. *Asynchronous*
 *
 * Fetch a tag by id.
 * \param accessToken Samsara API access token. *Required*
 * \param tagId ID of the tag. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getTagByIdAsync(char * accessToken,
	std::string accessToken, long long tagId, 
	void(* handler)(Tag, Error, void* )
	, void* userData);


/*! \brief /tags/{tag_id:[0-9]+}. *Synchronous*
 *
 * Add or delete specific members from a tag, or modify the name of a tag.
 * \param accessToken Samsara API access token. *Required*
 * \param tagId ID of the tag. *Required*
 * \param tagModifyParams  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyTagByIdSync(char * accessToken,
	std::string accessToken, long long tagId, TagModify tagModifyParams, 
	void(* handler)(Tag, Error, void* )
	, void* userData);

/*! \brief /tags/{tag_id:[0-9]+}. *Asynchronous*
 *
 * Add or delete specific members from a tag, or modify the name of a tag.
 * \param accessToken Samsara API access token. *Required*
 * \param tagId ID of the tag. *Required*
 * \param tagModifyParams  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyTagByIdAsync(char * accessToken,
	std::string accessToken, long long tagId, TagModify tagModifyParams, 
	void(* handler)(Tag, Error, void* )
	, void* userData);


/*! \brief /tags/{tag_id:[0-9]+}. *Synchronous*
 *
 * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
 * \param accessToken Samsara API access token. *Required*
 * \param tagId ID of the tag. *Required*
 * \param updateTagParams  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateTagByIdSync(char * accessToken,
	std::string accessToken, long long tagId, TagUpdate updateTagParams, 
	void(* handler)(Tag, Error, void* )
	, void* userData);

/*! \brief /tags/{tag_id:[0-9]+}. *Asynchronous*
 *
 * Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
 * \param accessToken Samsara API access token. *Required*
 * \param tagId ID of the tag. *Required*
 * \param updateTagParams  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateTagByIdAsync(char * accessToken,
	std::string accessToken, long long tagId, TagUpdate updateTagParams, 
	void(* handler)(Tag, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.samsara.com/v1";
	}
};
/** @}*/

}
}
#endif /* TagsManager_H_ */
