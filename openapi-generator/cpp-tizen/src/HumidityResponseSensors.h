/*
 * HumidityResponse_sensors.h
 *
 * 
 */

#ifndef _HumidityResponse_sensors_H_
#define _HumidityResponse_sensors_H_


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

class HumidityResponse_sensors : public Object {
public:
	/*! \brief Constructor.
	 */
	HumidityResponse_sensors();
	HumidityResponse_sensors(char* str);

	/*! \brief Destructor.
	 */
	virtual ~HumidityResponse_sensors();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Name of the sensor.
	 */
	std::string getName();

	/*! \brief Set Name of the sensor.
	 */
	void setName(std::string  name);
	/*! \brief Get Currently reported relative humidity in percent, from 0-100.
	 */
	int getHumidity();

	/*! \brief Set Currently reported relative humidity in percent, from 0-100.
	 */
	void setHumidity(int  humidity);
	/*! \brief Get ID of the sensor.
	 */
	long long getId();

	/*! \brief Set ID of the sensor.
	 */
	void setId(long long  id);

private:
	std::string name;
	int humidity;
	long long id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _HumidityResponse_sensors_H_ */
