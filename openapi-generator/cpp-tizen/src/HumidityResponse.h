/*
 * HumidityResponse.h
 *
 * Contains the current humidity of a sensor.
 */

#ifndef _HumidityResponse_H_
#define _HumidityResponse_H_


#include <string>
#include "HumidityResponse_sensors.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Contains the current humidity of a sensor.
 *
 *  \ingroup Models
 *
 */

class HumidityResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	HumidityResponse();
	HumidityResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~HumidityResponse();

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
	std::list<HumidityResponse_sensors> getSensors();

	/*! \brief Set 
	 */
	void setSensors(std::list <HumidityResponse_sensors> sensors);

private:
	long long groupId;
	std::list <HumidityResponse_sensors>sensors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _HumidityResponse_H_ */
