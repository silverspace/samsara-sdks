/*
 * Inline_object_15.h
 *
 * 
 */

#ifndef _Inline_object_15_H_
#define _Inline_object_15_H_


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

class Inline_object_15 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_object_15();
	Inline_object_15(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_object_15();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
	 */
	int getStartMs();

	/*! \brief Set Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
	 */
	void setStartMs(int  startMs);
	/*! \brief Get Vehicle ID to query.
	 */
	long long getVehicleId();

	/*! \brief Set Vehicle ID to query.
	 */
	void setVehicleId(long long  vehicleId);

private:
	int endMs;
	long long groupId;
	int startMs;
	long long vehicleId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_object_15_H_ */
