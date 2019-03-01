/*
 * Inline_object_21.h
 *
 * 
 */

#ifndef _Inline_object_21_H_
#define _Inline_object_21_H_


#include <string>
#include "_sensors_history_series.h"
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

class Inline_object_21 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_object_21();
	Inline_object_21(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_object_21();

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
	/*! \brief Get 
	 */
	std::string getFillMissing();

	/*! \brief Set 
	 */
	void setFillMissing(std::string  fillMissing);
	/*! \brief Get Group ID to query.
	 */
	long long getGroupId();

	/*! \brief Set Group ID to query.
	 */
	void setGroupId(long long  groupId);
	/*! \brief Get 
	 */
	std::list<_sensors_history_series> getSeries();

	/*! \brief Set 
	 */
	void setSeries(std::list <_sensors_history_series> series);
	/*! \brief Get Beginning of the time range, specified in milliseconds UNIX time.
	 */
	int getStartMs();

	/*! \brief Set Beginning of the time range, specified in milliseconds UNIX time.
	 */
	void setStartMs(int  startMs);
	/*! \brief Get Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
	 */
	int getStepMs();

	/*! \brief Set Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.
	 */
	void setStepMs(int  stepMs);

private:
	int endMs;
	std::string fillMissing;
	long long groupId;
	std::list <_sensors_history_series>series;
	int startMs;
	int stepMs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_object_21_H_ */
