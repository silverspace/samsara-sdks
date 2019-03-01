/*
 * UserTagRole_tag.h
 *
 * 
 */

#ifndef _UserTagRole_tag_H_
#define _UserTagRole_tag_H_


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

class UserTagRole_tag : public Object {
public:
	/*! \brief Constructor.
	 */
	UserTagRole_tag();
	UserTagRole_tag(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserTagRole_tag();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of this tag.
	 */
	long long getParentTagId();

	/*! \brief Set The ID of this tag.
	 */
	void setParentTagId(long long  parentTagId);
	/*! \brief Get Name of this tag.
	 */
	std::string getName();

	/*! \brief Set Name of this tag.
	 */
	void setName(std::string  name);
	/*! \brief Get The ID of this tag.
	 */
	long long getId();

	/*! \brief Set The ID of this tag.
	 */
	void setId(long long  id);

private:
	long long parentTagId;
	std::string name;
	long long id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UserTagRole_tag_H_ */
