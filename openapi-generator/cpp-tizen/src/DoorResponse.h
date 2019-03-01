/*
 * DoorResponse.h
 *
 * Contains the current door status of a sensor.
 */

#ifndef _DoorResponse_H_
#define _DoorResponse_H_


#include <string>
#include "DoorResponse_sensors.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Contains the current door status of a sensor.
 *
 *  \ingroup Models
 *
 */

class DoorResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DoorResponse();
	DoorResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DoorResponse();

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
	std::list<DoorResponse_sensors> getSensors();

	/*! \brief Set 
	 */
	void setSensors(std::list <DoorResponse_sensors> sensors);

private:
	long long groupId;
	std::list <DoorResponse_sensors>sensors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DoorResponse_H_ */
