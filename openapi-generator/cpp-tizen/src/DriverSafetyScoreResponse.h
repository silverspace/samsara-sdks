/*
 * DriverSafetyScoreResponse.h
 *
 * Safety score details for a driver
 */

#ifndef _DriverSafetyScoreResponse_H_
#define _DriverSafetyScoreResponse_H_


#include <string>
#include "SafetyReportHarshEvent.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Safety score details for a driver
 *
 *  \ingroup Models
 *
 */

class DriverSafetyScoreResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DriverSafetyScoreResponse();
	DriverSafetyScoreResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DriverSafetyScoreResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Crash event count
	 */
	int getCrashCount();

	/*! \brief Set Crash event count
	 */
	void setCrashCount(int  crashCount);
	/*! \brief Get Driver ID
	 */
	int getDriverId();

	/*! \brief Set Driver ID
	 */
	void setDriverId(int  driverId);
	/*! \brief Get Harsh acceleration event count
	 */
	int getHarshAccelCount();

	/*! \brief Set Harsh acceleration event count
	 */
	void setHarshAccelCount(int  harshAccelCount);
	/*! \brief Get Harsh braking event count
	 */
	int getHarshBrakingCount();

	/*! \brief Set Harsh braking event count
	 */
	void setHarshBrakingCount(int  harshBrakingCount);
	/*! \brief Get 
	 */
	std::list<SafetyReportHarshEvent> getHarshEvents();

	/*! \brief Set 
	 */
	void setHarshEvents(std::list <SafetyReportHarshEvent> harshEvents);
	/*! \brief Get Harsh turning event count
	 */
	int getHarshTurningCount();

	/*! \brief Set Harsh turning event count
	 */
	void setHarshTurningCount(int  harshTurningCount);
	/*! \brief Get Safety Score
	 */
	int getSafetyScore();

	/*! \brief Set Safety Score
	 */
	void setSafetyScore(int  safetyScore);
	/*! \brief Get Safety Score Rank
	 */
	std::string getSafetyScoreRank();

	/*! \brief Set Safety Score Rank
	 */
	void setSafetyScoreRank(std::string  safetyScoreRank);
	/*! \brief Get Amount of time driven over the speed limit in milliseconds
	 */
	int getTimeOverSpeedLimitMs();

	/*! \brief Set Amount of time driven over the speed limit in milliseconds
	 */
	void setTimeOverSpeedLimitMs(int  timeOverSpeedLimitMs);
	/*! \brief Get Total distance driven in meters
	 */
	int getTotalDistanceDrivenMeters();

	/*! \brief Set Total distance driven in meters
	 */
	void setTotalDistanceDrivenMeters(int  totalDistanceDrivenMeters);
	/*! \brief Get Total harsh event count
	 */
	int getTotalHarshEventCount();

	/*! \brief Set Total harsh event count
	 */
	void setTotalHarshEventCount(int  totalHarshEventCount);
	/*! \brief Get Amount of time driven in milliseconds
	 */
	int getTotalTimeDrivenMs();

	/*! \brief Set Amount of time driven in milliseconds
	 */
	void setTotalTimeDrivenMs(int  totalTimeDrivenMs);

private:
	int crashCount;
	int driverId;
	int harshAccelCount;
	int harshBrakingCount;
	std::list <SafetyReportHarshEvent>harshEvents;
	int harshTurningCount;
	int safetyScore;
	std::string safetyScoreRank;
	int timeOverSpeedLimitMs;
	int totalDistanceDrivenMeters;
	int totalHarshEventCount;
	int totalTimeDrivenMs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DriverSafetyScoreResponse_H_ */
