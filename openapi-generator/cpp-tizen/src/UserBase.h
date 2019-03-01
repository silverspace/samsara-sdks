/*
 * UserBase.h
 *
 * 
 */

#ifndef _UserBase_H_
#define _UserBase_H_


#include <string>
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

class UserBase : public Object {
public:
	/*! \brief Constructor.
	 */
	UserBase();
	UserBase(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserBase();

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

private:
	std::string authType;
	std::string email;
	std::string name;
	std::string organizationRoleId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UserBase_H_ */
