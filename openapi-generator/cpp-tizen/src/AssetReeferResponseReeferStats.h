/*
 * AssetReeferResponse_reeferStats.h
 *
 * 
 */

#ifndef _AssetReeferResponse_reeferStats_H_
#define _AssetReeferResponse_reeferStats_H_


#include <string>
#include "AssetReeferResponse_reeferStats_alarms_1.h"
#include "AssetReeferResponse_reeferStats_engineHours.h"
#include "AssetReeferResponse_reeferStats_fuelPercentage.h"
#include "AssetReeferResponse_reeferStats_powerStatus.h"
#include "AssetReeferResponse_reeferStats_returnAirTemp.h"
#include "AssetReeferResponse_reeferStats_setPoint.h"
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

class AssetReeferResponse_reeferStats : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetReeferResponse_reeferStats();
	AssetReeferResponse_reeferStats(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetReeferResponse_reeferStats();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Fuel percentage of the reefer
	 */
	std::list<AssetReeferResponse_reeferStats_fuelPercentage> getFuelPercentage();

	/*! \brief Set Fuel percentage of the reefer
	 */
	void setFuelPercentage(std::list <AssetReeferResponse_reeferStats_fuelPercentage> fuelPercentage);
	/*! \brief Get Power status of the reefer
	 */
	std::list<AssetReeferResponse_reeferStats_powerStatus> getPowerStatus();

	/*! \brief Set Power status of the reefer
	 */
	void setPowerStatus(std::list <AssetReeferResponse_reeferStats_powerStatus> powerStatus);
	/*! \brief Get Engine hours of the reefer
	 */
	std::list<AssetReeferResponse_reeferStats_engineHours> getEngineHours();

	/*! \brief Set Engine hours of the reefer
	 */
	void setEngineHours(std::list <AssetReeferResponse_reeferStats_engineHours> engineHours);
	/*! \brief Get Set point temperature of the reefer
	 */
	std::list<AssetReeferResponse_reeferStats_setPoint> getSetPoint();

	/*! \brief Set Set point temperature of the reefer
	 */
	void setSetPoint(std::list <AssetReeferResponse_reeferStats_setPoint> setPoint);
	/*! \brief Get Return air temperature of the reefer
	 */
	std::list<AssetReeferResponse_reeferStats_returnAirTemp> getReturnAirTemp();

	/*! \brief Set Return air temperature of the reefer
	 */
	void setReturnAirTemp(std::list <AssetReeferResponse_reeferStats_returnAirTemp> returnAirTemp);
	/*! \brief Get Reefer alarms
	 */
	std::list<AssetReeferResponse_reeferStats_alarms_1> getAlarms();

	/*! \brief Set Reefer alarms
	 */
	void setAlarms(std::list <AssetReeferResponse_reeferStats_alarms_1> alarms);

private:
	std::list <AssetReeferResponse_reeferStats_fuelPercentage>fuelPercentage;
	std::list <AssetReeferResponse_reeferStats_powerStatus>powerStatus;
	std::list <AssetReeferResponse_reeferStats_engineHours>engineHours;
	std::list <AssetReeferResponse_reeferStats_setPoint>setPoint;
	std::list <AssetReeferResponse_reeferStats_returnAirTemp>returnAirTemp;
	std::list <AssetReeferResponse_reeferStats_alarms_1>alarms;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetReeferResponse_reeferStats_H_ */
