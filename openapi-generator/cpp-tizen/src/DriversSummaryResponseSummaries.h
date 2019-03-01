/*
 * DriversSummaryResponse_Summaries.h
 *
 * 
 */

#ifndef _DriversSummaryResponse_Summaries_H_
#define _DriversSummaryResponse_Summaries_H_


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

class DriversSummaryResponse_Summaries : public Object {
public:
	/*! \brief Constructor.
	 */
	DriversSummaryResponse_Summaries();
	DriversSummaryResponse_Summaries(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DriversSummaryResponse_Summaries();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID of the driver.
	 */
	long long getDriverId();

	/*! \brief Set ID of the driver.
	 */
	void setDriverId(long long  driverId);
	/*! \brief Get Distance driven in miles, rounded to two decimal places.
	 */
	double getDistanceMiles();

	/*! \brief Set Distance driven in miles, rounded to two decimal places.
	 */
	void setDistanceMiles(double  distanceMiles);
	/*! \brief Get Duration in milliseconds that driver was driving during the requested time range
	 */
	long long getDriveMs();

	/*! \brief Set Duration in milliseconds that driver was driving during the requested time range
	 */
	void setDriveMs(long long  driveMs);
	/*! \brief Get Duration in milliseconds that driver was on duty or driving during the requested time range
	 */
	long long getActiveMs();

	/*! \brief Set Duration in milliseconds that driver was on duty or driving during the requested time range
	 */
	void setActiveMs(long long  activeMs);
	/*! \brief Get Username of the driver.
	 */
	std::string getDriverUsername();

	/*! \brief Set Username of the driver.
	 */
	void setDriverUsername(std::string  driverUsername);
	/*! \brief Get Group of the driver.
	 */
	long long getGroupId();

	/*! \brief Set Group of the driver.
	 */
	void setGroupId(long long  groupId);
	/*! \brief Get Name of the driver.
	 */
	std::string getDriverName();

	/*! \brief Set Name of the driver.
	 */
	void setDriverName(std::string  driverName);
	/*! \brief Get Duration in milliseconds that driver was on duty during the requested time range
	 */
	long long getOnDutyMs();

	/*! \brief Set Duration in milliseconds that driver was on duty during the requested time range
	 */
	void setOnDutyMs(long long  onDutyMs);

private:
	long long driverId;
	double distanceMiles;
	long long driveMs;
	long long activeMs;
	std::string driverUsername;
	long long groupId;
	std::string driverName;
	long long onDutyMs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DriversSummaryResponse_Summaries_H_ */
