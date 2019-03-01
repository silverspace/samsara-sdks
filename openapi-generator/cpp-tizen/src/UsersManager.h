#ifndef _UsersManager_H_
#define _UsersManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "User.h"
#include "UserRole.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Users Users
 * \ingroup Operations
 *  @{
 */
class UsersManager {
public:
	UsersManager();
	virtual ~UsersManager();

/*! \brief /users/{userId:[0-9]+}. *Synchronous*
 *
 * Remove a user from the organization.
 * \param accessToken Samsara API access token. *Required*
 * \param userId ID of the user. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteUserByIdSync(char * accessToken,
	std::string accessToken, long long userId, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief /users/{userId:[0-9]+}. *Asynchronous*
 *
 * Remove a user from the organization.
 * \param accessToken Samsara API access token. *Required*
 * \param userId ID of the user. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteUserByIdAsync(char * accessToken,
	std::string accessToken, long long userId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief /users/{userId:[0-9]+}. *Synchronous*
 *
 * Get a user.
 * \param accessToken Samsara API access token. *Required*
 * \param userId ID of the user. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getUserByIdSync(char * accessToken,
	std::string accessToken, long long userId, 
	void(* handler)(User, Error, void* )
	, void* userData);

/*! \brief /users/{userId:[0-9]+}. *Asynchronous*
 *
 * Get a user.
 * \param accessToken Samsara API access token. *Required*
 * \param userId ID of the user. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getUserByIdAsync(char * accessToken,
	std::string accessToken, long long userId, 
	void(* handler)(User, Error, void* )
	, void* userData);


/*! \brief /user_roles. *Synchronous*
 *
 * Get all roles in the organization.
 * \param accessToken Samsara API access token. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listUserRolesSync(char * accessToken,
	std::string accessToken, 
	void(* handler)(std::list<UserRole>, Error, void* )
	, void* userData);

/*! \brief /user_roles. *Asynchronous*
 *
 * Get all roles in the organization.
 * \param accessToken Samsara API access token. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listUserRolesAsync(char * accessToken,
	std::string accessToken, 
	void(* handler)(std::list<UserRole>, Error, void* )
	, void* userData);


/*! \brief /users. *Synchronous*
 *
 * List all users in the organization.
 * \param accessToken Samsara API access token. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listUsersSync(char * accessToken,
	std::string accessToken, 
	void(* handler)(std::list<User>, Error, void* )
	, void* userData);

/*! \brief /users. *Asynchronous*
 *
 * List all users in the organization.
 * \param accessToken Samsara API access token. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listUsersAsync(char * accessToken,
	std::string accessToken, 
	void(* handler)(std::list<User>, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.samsara.com/v1";
	}
};
/** @}*/

}
}
#endif /* UsersManager_H_ */
