/*
 * VehicleMaintenance_j1939_diagnosticTroubleCodes.h
 *
 * 
 */

#ifndef _VehicleMaintenance_j1939_diagnosticTroubleCodes_H_
#define _VehicleMaintenance_j1939_diagnosticTroubleCodes_H_


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

class VehicleMaintenance_j1939_diagnosticTroubleCodes : public Object {
public:
	/*! \brief Constructor.
	 */
	VehicleMaintenance_j1939_diagnosticTroubleCodes();
	VehicleMaintenance_j1939_diagnosticTroubleCodes(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VehicleMaintenance_j1939_diagnosticTroubleCodes();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getSpnDescription();

	/*! \brief Set 
	 */
	void setSpnDescription(std::string  spnDescription);
	/*! \brief Get 
	 */
	std::string getFmiText();

	/*! \brief Set 
	 */
	void setFmiText(std::string  fmiText);
	/*! \brief Get 
	 */
	int getSpnId();

	/*! \brief Set 
	 */
	void setSpnId(int  spnId);
	/*! \brief Get 
	 */
	int getOccurrenceCount();

	/*! \brief Set 
	 */
	void setOccurrenceCount(int  occurrenceCount);
	/*! \brief Get 
	 */
	int getTxId();

	/*! \brief Set 
	 */
	void setTxId(int  txId);
	/*! \brief Get 
	 */
	int getFmiId();

	/*! \brief Set 
	 */
	void setFmiId(int  fmiId);

private:
	std::string spnDescription;
	std::string fmiText;
	int spnId;
	int occurrenceCount;
	int txId;
	int fmiId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VehicleMaintenance_j1939_diagnosticTroubleCodes_H_ */
