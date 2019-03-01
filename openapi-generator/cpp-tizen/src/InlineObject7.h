/*
 * Inline_object_7.h
 *
 * 
 */

#ifndef _Inline_object_7_H_
#define _Inline_object_7_H_


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

class Inline_object_7 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_object_7();
	Inline_object_7(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_object_7();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Driver ID to query.
	 */
	long long getDriverId();

	/*! \brief Set Driver ID to query.
	 */
	void setDriverId(long long  driverId);
	/*! \brief Get End of the time range, specified in milliseconds UNIX time.
	 */
	int getEndMs();

	/*! \brief Set End of the time range, specified in milliseconds UNIX time.
	 */
	void setEndMs(int  endMs);
	/*! \brief Get Group ID to query.
	 */
	long long getGroupId();

	/*! \brief Set Group ID to query.
	 */
	void setGroupId(long long  groupId);
	/*! \brief Get Beginning of the time range, specified in milliseconds UNIX time.
	 */
	int getStartMs();

	/*! \brief Set Beginning of the time range, specified in milliseconds UNIX time.
	 */
	void setStartMs(int  startMs);

private:
	long long driverId;
	int endMs;
	long long groupId;
	int startMs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_object_7_H_ */
