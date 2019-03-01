/*
 * Sensor.h
 *
 * Contains information about a sensor.
 */

#ifndef _Sensor_H_
#define _Sensor_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Contains information about a sensor.
 *
 *  \ingroup Models
 *
 */

class Sensor : public Object {
public:
	/*! \brief Constructor.
	 */
	Sensor();
	Sensor(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Sensor();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID of the sensor.
	 */
	long long getId();

	/*! \brief Set ID of the sensor.
	 */
	void setId(long long  id);
	/*! \brief Get MAC address of the sensor.
	 */
	std::string getMacAddress();

	/*! \brief Set MAC address of the sensor.
	 */
	void setMacAddress(std::string  macAddress);
	/*! \brief Get Name of the sensor.
	 */
	std::string getName();

	/*! \brief Set Name of the sensor.
	 */
	void setName(std::string  name);

private:
	long long id;
	std::string macAddress;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Sensor_H_ */
