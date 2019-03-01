/*
 * HosLogsSummaryResponse_drivers.h
 *
 * 
 */

#ifndef _HosLogsSummaryResponse_drivers_H_
#define _HosLogsSummaryResponse_drivers_H_


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

class HosLogsSummaryResponse_drivers : public Object {
public:
	/*! \brief Constructor.
	 */
	HosLogsSummaryResponse_drivers();
	HosLogsSummaryResponse_drivers(char* str);

	/*! \brief Destructor.
	 */
	virtual ~HosLogsSummaryResponse_drivers();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The amount of time (in ms) remaining until the driver cannot drive without a rest break.
	 */
	long long getTimeUntilBreak();

	/*! \brief Set The amount of time (in ms) remaining until the driver cannot drive without a rest break.
	 */
	void setTimeUntilBreak(long long  timeUntilBreak);
	/*! \brief Get Name of the vehicle.
	 */
	std::string getVehicleName();

	/*! \brief Set Name of the vehicle.
	 */
	void setVehicleName(std::string  vehicleName);
	/*! \brief Get The amount of driving time in violation today (in ms).
	 */
	long long getDrivingInViolationToday();

	/*! \brief Set The amount of driving time in violation today (in ms).
	 */
	void setDrivingInViolationToday(long long  drivingInViolationToday);
	/*! \brief Get ID of the driver.
	 */
	long long getDriverId();

	/*! \brief Set ID of the driver.
	 */
	void setDriverId(long long  driverId);
	/*! \brief Get The amount of remaining cycle time (in ms).
	 */
	long long getCycleRemaining();

	/*! \brief Set The amount of remaining cycle time (in ms).
	 */
	void setCycleRemaining(long long  cycleRemaining);
	/*! \brief Get Name of the driver.
	 */
	std::string getDriverName();

	/*! \brief Set Name of the driver.
	 */
	void setDriverName(std::string  driverName);
	/*! \brief Get The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
	 */
	std::string getDutyStatus();

	/*! \brief Set The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
	 */
	void setDutyStatus(std::string  dutyStatus);
	/*! \brief Get The amount of cycle time (in ms) available tomorrow.
	 */
	long long getCycleTomorrow();

	/*! \brief Set The amount of cycle time (in ms) available tomorrow.
	 */
	void setCycleTomorrow(long long  cycleTomorrow);
	/*! \brief Get The amount of remaining shift drive time (in ms).
	 */
	long long getShiftDriveRemaining();

	/*! \brief Set The amount of remaining shift drive time (in ms).
	 */
	void setShiftDriveRemaining(long long  shiftDriveRemaining);
	/*! \brief Get The amount of time (in ms) that the driver has been in the current `dutyStatus`.
	 */
	long long getTimeInCurrentStatus();

	/*! \brief Set The amount of time (in ms) that the driver has been in the current `dutyStatus`.
	 */
	void setTimeInCurrentStatus(long long  timeInCurrentStatus);
	/*! \brief Get The amount of driving time in violation in this cycle (in ms).
	 */
	long long getDrivingInViolationCycle();

	/*! \brief Set The amount of driving time in violation in this cycle (in ms).
	 */
	void setDrivingInViolationCycle(long long  drivingInViolationCycle);
	/*! \brief Get The amount of remaining shift time (in ms).
	 */
	long long getShiftRemaining();

	/*! \brief Set The amount of remaining shift time (in ms).
	 */
	void setShiftRemaining(long long  shiftRemaining);

private:
	long long timeUntilBreak;
	std::string vehicleName;
	long long drivingInViolationToday;
	long long driverId;
	long long cycleRemaining;
	std::string driverName;
	std::string dutyStatus;
	long long cycleTomorrow;
	long long shiftDriveRemaining;
	long long timeInCurrentStatus;
	long long drivingInViolationCycle;
	long long shiftRemaining;
	void __init();
	void __cleanup();

};
}
}

#endif /* _HosLogsSummaryResponse_drivers_H_ */
