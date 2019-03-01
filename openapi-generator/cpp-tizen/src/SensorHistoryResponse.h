/*
 * SensorHistoryResponse.h
 *
 * Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
 */

#ifndef _SensorHistoryResponse_H_
#define _SensorHistoryResponse_H_


#include <string>
#include "SensorHistoryResponse_results.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
 *
 *  \ingroup Models
 *
 */

class SensorHistoryResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	SensorHistoryResponse();
	SensorHistoryResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SensorHistoryResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<SensorHistoryResponse_results> getResults();

	/*! \brief Set 
	 */
	void setResults(std::list <SensorHistoryResponse_results> results);

private:
	std::list <SensorHistoryResponse_results>results;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SensorHistoryResponse_H_ */
