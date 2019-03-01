/*
 * TemperatureResponse.h
 *
 * Contains the current temperatures of a sensor.
 */

#ifndef _TemperatureResponse_H_
#define _TemperatureResponse_H_


#include <string>
#include "TemperatureResponse_sensors.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Contains the current temperatures of a sensor.
 *
 *  \ingroup Models
 *
 */

class TemperatureResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	TemperatureResponse();
	TemperatureResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TemperatureResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	long long getGroupId();

	/*! \brief Set 
	 */
	void setGroupId(long long  groupId);
	/*! \brief Get 
	 */
	std::list<TemperatureResponse_sensors> getSensors();

	/*! \brief Set 
	 */
	void setSensors(std::list <TemperatureResponse_sensors> sensors);

private:
	long long groupId;
	std::list <TemperatureResponse_sensors>sensors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TemperatureResponse_H_ */
