/*
 * TemperatureResponse_sensors.h
 *
 * 
 */

#ifndef _TemperatureResponse_sensors_H_
#define _TemperatureResponse_sensors_H_


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

class TemperatureResponse_sensors : public Object {
public:
	/*! \brief Constructor.
	 */
	TemperatureResponse_sensors();
	TemperatureResponse_sensors(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TemperatureResponse_sensors();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
	 */
	int getProbeTemperature();

	/*! \brief Set Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
	 */
	void setProbeTemperature(int  probeTemperature);
	/*! \brief Get Name of the sensor.
	 */
	std::string getName();

	/*! \brief Set Name of the sensor.
	 */
	void setName(std::string  name);
	/*! \brief Get ID of the sensor.
	 */
	long long getId();

	/*! \brief Set ID of the sensor.
	 */
	void setId(long long  id);
	/*! \brief Get Currently reported ambient temperature in millidegrees celsius.
	 */
	int getAmbientTemperature();

	/*! \brief Set Currently reported ambient temperature in millidegrees celsius.
	 */
	void setAmbientTemperature(int  ambientTemperature);

private:
	int probeTemperature;
	std::string name;
	long long id;
	int ambientTemperature;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TemperatureResponse_sensors_H_ */
