/*
 * SensorHistoryResponse_results.h
 *
 * 
 */

#ifndef _SensorHistoryResponse_results_H_
#define _SensorHistoryResponse_results_H_


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

class SensorHistoryResponse_results : public Object {
public:
	/*! \brief Constructor.
	 */
	SensorHistoryResponse_results();
	SensorHistoryResponse_results(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SensorHistoryResponse_results();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of datapoints, one for each requested (sensor, field) pair.
	 */
	std::list<long long> getSeries();

	/*! \brief Set List of datapoints, one for each requested (sensor, field) pair.
	 */
	void setSeries(std::list <long long> series);
	/*! \brief Get Timestamp in UNIX milliseconds.
	 */
	int getTimeMs();

	/*! \brief Set Timestamp in UNIX milliseconds.
	 */
	void setTimeMs(int  timeMs);

private:
	std::list <long long>series;
	int timeMs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SensorHistoryResponse_results_H_ */
