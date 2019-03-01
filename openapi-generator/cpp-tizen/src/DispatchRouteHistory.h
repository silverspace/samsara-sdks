/*
 * DispatchRouteHistory.h
 *
 * 
 */

#ifndef _DispatchRouteHistory_H_
#define _DispatchRouteHistory_H_


#include <string>
#include "DispatchRouteHistoricalEntry.h"
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

class DispatchRouteHistory : public Object {
public:
	/*! \brief Constructor.
	 */
	DispatchRouteHistory();
	DispatchRouteHistory(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DispatchRouteHistory();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get History of the route's state changes.
	 */
	std::list<DispatchRouteHistoricalEntry> getHistory();

	/*! \brief Set History of the route's state changes.
	 */
	void setHistory(std::list <DispatchRouteHistoricalEntry> history);

private:
	std::list <DispatchRouteHistoricalEntry>history;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DispatchRouteHistory_H_ */
