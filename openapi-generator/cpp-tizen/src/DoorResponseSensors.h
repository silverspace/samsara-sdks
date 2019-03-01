/*
 * DoorResponse_sensors.h
 *
 * 
 */

#ifndef _DoorResponse_sensors_H_
#define _DoorResponse_sensors_H_


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

class DoorResponse_sensors : public Object {
public:
	/*! \brief Constructor.
	 */
	DoorResponse_sensors();
	DoorResponse_sensors(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DoorResponse_sensors();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Flag indicating whether the current door is closed or open.
	 */
	bool getDoorClosed();

	/*! \brief Set Flag indicating whether the current door is closed or open.
	 */
	void setDoorClosed(bool  doorClosed);
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

private:
	bool doorClosed;
	std::string name;
	long long id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DoorResponse_sensors_H_ */
