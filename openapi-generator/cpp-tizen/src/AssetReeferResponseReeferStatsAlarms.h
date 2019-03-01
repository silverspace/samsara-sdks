/*
 * AssetReeferResponse_reeferStats_alarms.h
 *
 * 
 */

#ifndef _AssetReeferResponse_reeferStats_alarms_H_
#define _AssetReeferResponse_reeferStats_alarms_H_


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

class AssetReeferResponse_reeferStats_alarms : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetReeferResponse_reeferStats_alarms();
	AssetReeferResponse_reeferStats_alarms(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetReeferResponse_reeferStats_alarms();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
	 */
	long long getSeverity();

	/*! \brief Set Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
	 */
	void setSeverity(long long  severity);
	/*! \brief Get Recommended operator action
	 */
	std::string getOperatorAction();

	/*! \brief Set Recommended operator action
	 */
	void setOperatorAction(std::string  operatorAction);
	/*! \brief Get Description of the alarm
	 */
	std::string getDescription();

	/*! \brief Set Description of the alarm
	 */
	void setDescription(std::string  description);
	/*! \brief Get ID of the alarm
	 */
	long long getAlarmCode();

	/*! \brief Set ID of the alarm
	 */
	void setAlarmCode(long long  alarmCode);

private:
	long long severity;
	std::string operatorAction;
	std::string description;
	long long alarmCode;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetReeferResponse_reeferStats_alarms_H_ */
