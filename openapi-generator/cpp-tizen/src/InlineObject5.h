/*
 * Inline_object_5.h
 *
 * 
 */

#ifndef _Inline_object_5_H_
#define _Inline_object_5_H_


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

class Inline_object_5 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_object_5();
	Inline_object_5(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_object_5();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get End time (ms) of queried time period.
	 */
	long long getEndMs();

	/*! \brief Set End time (ms) of queried time period.
	 */
	void setEndMs(long long  endMs);
	/*! \brief Get Org ID to query.
	 */
	long long getOrgId();

	/*! \brief Set Org ID to query.
	 */
	void setOrgId(long long  orgId);
	/*! \brief Get Start time (ms) of queried time period.
	 */
	long long getStartMs();

	/*! \brief Set Start time (ms) of queried time period.
	 */
	void setStartMs(long long  startMs);

private:
	long long endMs;
	long long orgId;
	long long startMs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_object_5_H_ */
