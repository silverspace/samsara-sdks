/*
 * HosLogsResponse_logs.h
 *
 * 
 */

#ifndef _HosLogsResponse_logs_H_
#define _HosLogsResponse_logs_H_


#include <string>
#include <list>
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

class HosLogsResponse_logs : public Object {
public:
	/*! \brief Constructor.
	 */
	HosLogsResponse_logs();
	HosLogsResponse_logs(char* str);

	/*! \brief Destructor.
	 */
	virtual ~HosLogsResponse_logs();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Longitude at which the log was recorded.
	 */
	double getLocLng();

	/*! \brief Set Longitude at which the log was recorded.
	 */
	void setLocLng(double  locLng);
	/*! \brief Get The time at which the log/HOS status started in UNIX milliseconds.
	 */
	long long getLogStartMs();

	/*! \brief Set The time at which the log/HOS status started in UNIX milliseconds.
	 */
	void setLogStartMs(long long  logStartMs);
	/*! \brief Get ID of the driver.
	 */
	long long getDriverId();

	/*! \brief Set ID of the driver.
	 */
	void setDriverId(long long  driverId);
	/*! \brief Get The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
	 */
	std::string getStatusType();

	/*! \brief Set The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`.
	 */
	void setStatusType(std::string  statusType);
	/*! \brief Get City in which the log was recorded.
	 */
	std::string getLocCity();

	/*! \brief Set City in which the log was recorded.
	 */
	void setLocCity(std::string  locCity);
	/*! \brief Get ID of the group.
	 */
	long long getGroupId();

	/*! \brief Set ID of the group.
	 */
	void setGroupId(long long  groupId);
	/*! \brief Get Name of location at which the log was recorded.
	 */
	std::string getLocName();

	/*! \brief Set Name of location at which the log was recorded.
	 */
	void setLocName(std::string  locName);
	/*! \brief Get Latitude at which the log was recorded.
	 */
	double getLocLat();

	/*! \brief Set Latitude at which the log was recorded.
	 */
	void setLocLat(double  locLat);
	/*! \brief Get Remark associated with the log entry.
	 */
	std::string getRemark();

	/*! \brief Set Remark associated with the log entry.
	 */
	void setRemark(std::string  remark);
	/*! \brief Get State in which the log was recorded.
	 */
	std::string getLocState();

	/*! \brief Set State in which the log was recorded.
	 */
	void setLocState(std::string  locState);
	/*! \brief Get ID of the vehicle.
	 */
	long long getVehicleId();

	/*! \brief Set ID of the vehicle.
	 */
	void setVehicleId(long long  vehicleId);
	/*! \brief Get 
	 */
	std::list<long long> getCodriverIds();

	/*! \brief Set 
	 */
	void setCodriverIds(std::list <long long> codriverIds);

private:
	double locLng;
	long long logStartMs;
	long long driverId;
	std::string statusType;
	std::string locCity;
	long long groupId;
	std::string locName;
	double locLat;
	std::string remark;
	std::string locState;
	long long vehicleId;
	std::list <long long>codriverIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _HosLogsResponse_logs_H_ */
