/*
 * Inline_object_2.h
 *
 * 
 */

#ifndef _Inline_object_2_H_
#define _Inline_object_2_H_


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

class Inline_object_2 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_object_2();
	Inline_object_2(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_object_2();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The address of the entry to add, as it would be recognized if provided to maps.google.com.
	 */
	std::string getAddress();

	/*! \brief Set The address of the entry to add, as it would be recognized if provided to maps.google.com.
	 */
	void setAddress(std::string  address);
	/*! \brief Get Group ID to query.
	 */
	long long getGroupId();

	/*! \brief Set Group ID to query.
	 */
	void setGroupId(long long  groupId);
	/*! \brief Get Name of the location to add to the address book.
	 */
	std::string getName();

	/*! \brief Set Name of the location to add to the address book.
	 */
	void setName(std::string  name);
	/*! \brief Get Radius in meters of the address (used for matching vehicle trip stops to this location).
	 */
	int getRadius();

	/*! \brief Set Radius in meters of the address (used for matching vehicle trip stops to this location).
	 */
	void setRadius(int  radius);

private:
	std::string address;
	long long groupId;
	std::string name;
	int radius;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_object_2_H_ */
