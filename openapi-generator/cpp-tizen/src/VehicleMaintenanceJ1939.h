/*
 * VehicleMaintenance_j1939.h
 *
 * J1939 based data. Null if no data is available.
 */

#ifndef _VehicleMaintenance_j1939_H_
#define _VehicleMaintenance_j1939_H_


#include <string>
#include "VehicleMaintenance_j1939_checkEngineLight.h"
#include "VehicleMaintenance_j1939_diagnosticTroubleCodes.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief J1939 based data. Null if no data is available.
 *
 *  \ingroup Models
 *
 */

class VehicleMaintenance_j1939 : public Object {
public:
	/*! \brief Constructor.
	 */
	VehicleMaintenance_j1939();
	VehicleMaintenance_j1939(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VehicleMaintenance_j1939();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	VehicleMaintenance_j1939_checkEngineLight getCheckEngineLight();

	/*! \brief Set 
	 */
	void setCheckEngineLight(VehicleMaintenance_j1939_checkEngineLight  checkEngineLight);
	/*! \brief Get J1939 DTCs.
	 */
	std::list<VehicleMaintenance_j1939_diagnosticTroubleCodes> getDiagnosticTroubleCodes();

	/*! \brief Set J1939 DTCs.
	 */
	void setDiagnosticTroubleCodes(std::list <VehicleMaintenance_j1939_diagnosticTroubleCodes> diagnosticTroubleCodes);

private:
	VehicleMaintenance_j1939_checkEngineLight checkEngineLight;
	std::list <VehicleMaintenance_j1939_diagnosticTroubleCodes>diagnosticTroubleCodes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VehicleMaintenance_j1939_H_ */
