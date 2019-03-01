/*
 * VehicleMaintenance_passenger.h
 *
 * Passenger vehicle data. Null if no data is available.
 */

#ifndef _VehicleMaintenance_passenger_H_
#define _VehicleMaintenance_passenger_H_


#include <string>
#include "VehicleMaintenance_passenger_checkEngineLight.h"
#include "VehicleMaintenance_passenger_diagnosticTroubleCodes.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Passenger vehicle data. Null if no data is available.
 *
 *  \ingroup Models
 *
 */

class VehicleMaintenance_passenger : public Object {
public:
	/*! \brief Constructor.
	 */
	VehicleMaintenance_passenger();
	VehicleMaintenance_passenger(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VehicleMaintenance_passenger();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	VehicleMaintenance_passenger_checkEngineLight getCheckEngineLight();

	/*! \brief Set 
	 */
	void setCheckEngineLight(VehicleMaintenance_passenger_checkEngineLight  checkEngineLight);
	/*! \brief Get Passenger vehicle DTCs.
	 */
	std::list<VehicleMaintenance_passenger_diagnosticTroubleCodes> getDiagnosticTroubleCodes();

	/*! \brief Set Passenger vehicle DTCs.
	 */
	void setDiagnosticTroubleCodes(std::list <VehicleMaintenance_passenger_diagnosticTroubleCodes> diagnosticTroubleCodes);

private:
	VehicleMaintenance_passenger_checkEngineLight checkEngineLight;
	std::list <VehicleMaintenance_passenger_diagnosticTroubleCodes>diagnosticTroubleCodes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VehicleMaintenance_passenger_H_ */
