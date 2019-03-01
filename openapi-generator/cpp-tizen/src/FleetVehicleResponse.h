/*
 * FleetVehicleResponse.h
 *
 * A vehicle object as returned for fleet/vehicle
 */

#ifndef _FleetVehicleResponse_H_
#define _FleetVehicleResponse_H_


#include <string>
#include "FleetVehicleResponse_vehicleInfo.h"
#include <list>
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A vehicle object as returned for fleet/vehicle
 *
 *  \ingroup Models
 *
 */

class FleetVehicleResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	FleetVehicleResponse();
	FleetVehicleResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FleetVehicleResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::map<std::string, std::string> getExternalIds();

	/*! \brief Set 
	 */
	void setExternalIds(std::map <std::string, std::string> externalIds);
	/*! \brief Get Harsh event detection setting.
	 */
	std::string getHarshAccelSetting();

	/*! \brief Set Harsh event detection setting.
	 */
	void setHarshAccelSetting(std::string  harshAccelSetting);
	/*! \brief Get ID of the vehicle.
	 */
	long long getId();

	/*! \brief Set ID of the vehicle.
	 */
	void setId(long long  id);
	/*! \brief Get Name of the vehicle.
	 */
	std::string getName();

	/*! \brief Set Name of the vehicle.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	FleetVehicleResponse_vehicleInfo getVehicleInfo();

	/*! \brief Set 
	 */
	void setVehicleInfo(FleetVehicleResponse_vehicleInfo  vehicleInfo);

private:
	std::map <std::string, std::string>externalIds;
	std::string harshAccelSetting;
	long long id;
	std::string name;
	FleetVehicleResponse_vehicleInfo vehicleInfo;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FleetVehicleResponse_H_ */
