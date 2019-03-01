/*
 * VehicleMaintenance_j1939_checkEngineLight.h
 *
 * J1939 check engine lights.
 */

#ifndef _VehicleMaintenance_j1939_checkEngineLight_H_
#define _VehicleMaintenance_j1939_checkEngineLight_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief J1939 check engine lights.
 *
 *  \ingroup Models
 *
 */

class VehicleMaintenance_j1939_checkEngineLight : public Object {
public:
	/*! \brief Constructor.
	 */
	VehicleMaintenance_j1939_checkEngineLight();
	VehicleMaintenance_j1939_checkEngineLight(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VehicleMaintenance_j1939_checkEngineLight();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	bool getProtectIsOn();

	/*! \brief Set 
	 */
	void setProtectIsOn(bool  protectIsOn);
	/*! \brief Get 
	 */
	bool getStopIsOn();

	/*! \brief Set 
	 */
	void setStopIsOn(bool  stopIsOn);
	/*! \brief Get 
	 */
	bool getWarningIsOn();

	/*! \brief Set 
	 */
	void setWarningIsOn(bool  warningIsOn);
	/*! \brief Get 
	 */
	bool getEmissionsIsOn();

	/*! \brief Set 
	 */
	void setEmissionsIsOn(bool  emissionsIsOn);

private:
	bool protectIsOn;
	bool stopIsOn;
	bool warningIsOn;
	bool emissionsIsOn;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VehicleMaintenance_j1939_checkEngineLight_H_ */
