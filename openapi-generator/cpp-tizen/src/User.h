/*
 * User.h
 *
 * 
 */

#ifndef _User_H_
#define _User_H_


#include <string>
#include "UserBase.h"
#include "UserTagRole.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class User : public Object {
public:
	/*! \brief Constructor.
	 */
	User();
	User(char* str);

	/*! \brief Destructor.
	 */
	virtual ~User();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
	 */
	std::string getAuthType();

	/*! \brief Set The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
	 */
	void setAuthType(std::string  authType);
	/*! \brief Get The email address of this user.
	 */
	std::string getEmail();

	/*! \brief Set The email address of this user.
	 */
	void setEmail(std::string  email);
	/*! \brief Get The first and last name of the user.
	 */
	std::string getName();

	/*! \brief Set The first and last name of the user.
	 */
	void setName(std::string  name);
	/*! \brief Get The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
	 */
	std::string getOrganizationRoleId();

	/*! \brief Set The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
	 */
	void setOrganizationRoleId(std::string  organizationRoleId);
	/*! \brief Get The ID of the User record.
	 */
	long long getId();

	/*! \brief Set The ID of the User record.
	 */
	void setId(long long  id);
	/*! \brief Get The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
	 */
	std::string getOrganizationRole();

	/*! \brief Set The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
	 */
	void setOrganizationRole(std::string  organizationRole);
	/*! \brief Get The specific tags this user has access to. This will be blank for users that have full access to the organization.
	 */
	std::list<UserTagRole> getTagRoles();

	/*! \brief Set The specific tags this user has access to. This will be blank for users that have full access to the organization.
	 */
	void setTagRoles(std::list <UserTagRole> tagRoles);

private:
	std::string authType;
	std::string email;
	std::string name;
	std::string organizationRoleId;
	long long id;
	std::string organizationRole;
	std::list <UserTagRole>tagRoles;
	void __init();
	void __cleanup();

};
}
}

#endif /* _User_H_ */
