/*
 * SafetyReportHarshEvent.h
 *
 * List of harsh events
 */

#ifndef _SafetyReportHarshEvent_H_
#define _SafetyReportHarshEvent_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief List of harsh events
 *
 *  \ingroup Models
 *
 */

class SafetyReportHarshEvent : public Object {
public:
	/*! \brief Constructor.
	 */
	SafetyReportHarshEvent();
	SafetyReportHarshEvent(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SafetyReportHarshEvent();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Type of the harsh event
	 */
	std::string getHarshEventType();

	/*! \brief Set Type of the harsh event
	 */
	void setHarshEventType(std::string  harshEventType);
	/*! \brief Get Timestamp that the harsh event occurred in Unix milliseconds since epoch
	 */
	int getTimestampMs();

	/*! \brief Set Timestamp that the harsh event occurred in Unix milliseconds since epoch
	 */
	void setTimestampMs(int  timestampMs);
	/*! \brief Get Vehicle associated with the harsh event
	 */
	int getVehicleId();

	/*! \brief Set Vehicle associated with the harsh event
	 */
	void setVehicleId(int  vehicleId);

private:
	std::string harshEventType;
	int timestampMs;
	int vehicleId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SafetyReportHarshEvent_H_ */
