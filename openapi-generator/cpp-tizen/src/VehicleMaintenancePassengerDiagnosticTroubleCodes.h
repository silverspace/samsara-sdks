/*
 * VehicleMaintenance_passenger_diagnosticTroubleCodes.h
 *
 * 
 */

#ifndef _VehicleMaintenance_passenger_diagnosticTroubleCodes_H_
#define _VehicleMaintenance_passenger_diagnosticTroubleCodes_H_


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

class VehicleMaintenance_passenger_diagnosticTroubleCodes : public Object {
public:
	/*! \brief Constructor.
	 */
	VehicleMaintenance_passenger_diagnosticTroubleCodes();
	VehicleMaintenance_passenger_diagnosticTroubleCodes(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VehicleMaintenance_passenger_diagnosticTroubleCodes();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getDtcShortCode();

	/*! \brief Set 
	 */
	void setDtcShortCode(std::string  dtcShortCode);
	/*! \brief Get 
	 */
	int getDtcId();

	/*! \brief Set 
	 */
	void setDtcId(int  dtcId);
	/*! \brief Get 
	 */
	std::string getDtcDescription();

	/*! \brief Set 
	 */
	void setDtcDescription(std::string  dtcDescription);

private:
	std::string dtcShortCode;
	int dtcId;
	std::string dtcDescription;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VehicleMaintenance_passenger_diagnosticTroubleCodes_H_ */
