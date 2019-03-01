/*
 * CargoResponse.h
 *
 * Contains the current cargo status of a sensor.
 */

#ifndef _CargoResponse_H_
#define _CargoResponse_H_


#include <string>
#include "CargoResponse_sensors.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Contains the current cargo status of a sensor.
 *
 *  \ingroup Models
 *
 */

class CargoResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CargoResponse();
	CargoResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CargoResponse();

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
	std::list<CargoResponse_sensors> getSensors();

	/*! \brief Set 
	 */
	void setSensors(std::list <CargoResponse_sensors> sensors);

private:
	long long groupId;
	std::list <CargoResponse_sensors>sensors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CargoResponse_H_ */
