/*
 * Inline_object_13.h
 *
 * 
 */

#ifndef _Inline_object_13_H_
#define _Inline_object_13_H_


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

class Inline_object_13 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_object_13();
	Inline_object_13(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_object_13();

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

private:
	long long groupId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_object_13_H_ */
