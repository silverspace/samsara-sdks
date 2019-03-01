/*
 * Inline_object_24.h
 *
 * 
 */

#ifndef _Inline_object_24_H_
#define _Inline_object_24_H_


#include <string>
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

class Inline_object_24 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_object_24();
	Inline_object_24(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_object_24();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Group ID to query.
	 */
	long long getGroupId();

	/*! \brief Set Group ID to query.
	 */
	void setGroupId(long long  groupId);
	/*! \brief Get List of sensor IDs to query.
	 */
	std::list<long long> getSensors();

	/*! \brief Set List of sensor IDs to query.
	 */
	void setSensors(std::list <long long> sensors);

private:
	long long groupId;
	std::list <long long>sensors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_object_24_H_ */
