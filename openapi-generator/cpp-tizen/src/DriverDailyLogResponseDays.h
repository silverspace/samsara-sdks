/*
 * DriverDailyLogResponse_days.h
 *
 * 
 */

#ifndef _DriverDailyLogResponse_days_H_
#define _DriverDailyLogResponse_days_H_


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

class DriverDailyLogResponse_days : public Object {
public:
	/*! \brief Constructor.
	 */
	DriverDailyLogResponse_days();
	DriverDailyLogResponse_days(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DriverDailyLogResponse_days();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
	 */
	long long getCertifiedAtMs();

	/*! \brief Set Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
	 */
	void setCertifiedAtMs(long long  certifiedAtMs);
	/*! \brief Get End of the HOS day, specified in milliseconds UNIX time.
	 */
	int getEndMs();

	/*! \brief Set End of the HOS day, specified in milliseconds UNIX time.
	 */
	void setEndMs(int  endMs);
	/*! \brief Get End of the HOS day, specified in milliseconds UNIX time.
	 */
	int getStartMs();

	/*! \brief Set End of the HOS day, specified in milliseconds UNIX time.
	 */
	void setStartMs(int  startMs);
	/*! \brief Get List of trailer ID's associated with the driver for the day.
	 */
	std::string getTrailerIds();

	/*! \brief Set List of trailer ID's associated with the driver for the day.
	 */
	void setTrailerIds(std::string  trailerIds);
	/*! \brief Get Hours spent on duty or driving, rounded to two decimal places.
	 */
	double getActiveHours();

	/*! \brief Set Hours spent on duty or driving, rounded to two decimal places.
	 */
	void setActiveHours(double  activeHours);
	/*! \brief Get Distance driven in miles, rounded to two decimal places.
	 */
	double getDistanceMiles();

	/*! \brief Set Distance driven in miles, rounded to two decimal places.
	 */
	void setDistanceMiles(double  distanceMiles);
	/*! \brief Get Milliseconds spent on duty or driving.
	 */
	long long getActiveMs();

	/*! \brief Set Milliseconds spent on duty or driving.
	 */
	void setActiveMs(long long  activeMs);
	/*! \brief Get Whether this HOS day chart was certified by the driver.
	 */
	bool getCertified();

	/*! \brief Set Whether this HOS day chart was certified by the driver.
	 */
	void setCertified(bool  certified);
	/*! \brief Get List of vehicle ID's associated with the driver for the day.
	 */
	std::string getVehicleIds();

	/*! \brief Set List of vehicle ID's associated with the driver for the day.
	 */
	void setVehicleIds(std::string  vehicleIds);

private:
	long long certifiedAtMs;
	int endMs;
	int startMs;
	std::string trailerIds;
	double activeHours;
	double distanceMiles;
	long long activeMs;
	bool certified;
	std::string vehicleIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DriverDailyLogResponse_days_H_ */
