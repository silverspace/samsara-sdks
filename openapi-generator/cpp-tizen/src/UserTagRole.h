/*
 * UserTagRole.h
 *
 * 
 */

#ifndef _UserTagRole_H_
#define _UserTagRole_H_


#include <string>
#include "UserTagRole_tag.h"
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

class UserTagRole : public Object {
public:
	/*! \brief Constructor.
	 */
	UserTagRole();
	UserTagRole(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserTagRole();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the role the user has been granted on this tag.
	 */
	std::string getRole();

	/*! \brief Set The name of the role the user has been granted on this tag.
	 */
	void setRole(std::string  role);
	/*! \brief Get The id of the role the user has been granted on this tag.
	 */
	std::string getRoleId();

	/*! \brief Set The id of the role the user has been granted on this tag.
	 */
	void setRoleId(std::string  roleId);
	/*! \brief Get 
	 */
	UserTagRole_tag getTag();

	/*! \brief Set 
	 */
	void setTag(UserTagRole_tag  tag);

private:
	std::string role;
	std::string roleId;
	UserTagRole_tag tag;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UserTagRole_H_ */
