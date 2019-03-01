/*
 * DispatchRouteHistoricalEntry.h
 *
 * 
 */

#ifndef _DispatchRouteHistoricalEntry_H_
#define _DispatchRouteHistoricalEntry_H_


#include <string>
#include "DispatchRoute.h"
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

class DispatchRouteHistoricalEntry : public Object {
public:
	/*! \brief Constructor.
	 */
	DispatchRouteHistoricalEntry();
	DispatchRouteHistoricalEntry(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DispatchRouteHistoricalEntry();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Timestamp that the route was updated, represented as Unix milliseconds since epoch.
	 */
	long long getChangedAtMs();

	/*! \brief Set Timestamp that the route was updated, represented as Unix milliseconds since epoch.
	 */
	void setChangedAtMs(long long  changed_at_ms);
	/*! \brief Get 
	 */
	DispatchRoute getRoute();

	/*! \brief Set 
	 */
	void setRoute(DispatchRoute  route);

private:
	long long changed_at_ms;
	DispatchRoute route;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DispatchRouteHistoricalEntry_H_ */
