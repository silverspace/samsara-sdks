/*
 * VehicleMaintenance_passenger_checkEngineLight.h
 *
 * Passenger vehicle check engine light.
 */

#ifndef _VehicleMaintenance_passenger_checkEngineLight_H_
#define _VehicleMaintenance_passenger_checkEngineLight_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Passenger vehicle check engine light.
 *
 *  \ingroup Models
 *
 */

class VehicleMaintenance_passenger_checkEngineLight : public Object {
public:
	/*! \brief Constructor.
	 */
	VehicleMaintenance_passenger_checkEngineLight();
	VehicleMaintenance_passenger_checkEngineLight(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VehicleMaintenance_passenger_checkEngineLight();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	bool getIsOn();

	/*! \brief Set 
	 */
	void setIsOn(bool  isOn);

private:
	bool isOn;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VehicleMaintenance_passenger_checkEngineLight_H_ */
