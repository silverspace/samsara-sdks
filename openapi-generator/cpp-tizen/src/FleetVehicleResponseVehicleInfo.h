/*
 * FleetVehicleResponse_vehicleInfo.h
 *
 * 
 */

#ifndef _FleetVehicleResponse_vehicleInfo_H_
#define _FleetVehicleResponse_vehicleInfo_H_


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

class FleetVehicleResponse_vehicleInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	FleetVehicleResponse_vehicleInfo();
	FleetVehicleResponse_vehicleInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FleetVehicleResponse_vehicleInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Year of the vehicle.
	 */
	long long getYear();

	/*! \brief Set Year of the vehicle.
	 */
	void setYear(long long  year);
	/*! \brief Get Model of the Vehicle.
	 */
	std::string getModel();

	/*! \brief Set Model of the Vehicle.
	 */
	void setModel(std::string  model);
	/*! \brief Get Vehicle Identification Number.
	 */
	std::string getVin();

	/*! \brief Set Vehicle Identification Number.
	 */
	void setVin(std::string  vin);
	/*! \brief Get Make of the vehicle.
	 */
	std::string getMake();

	/*! \brief Set Make of the vehicle.
	 */
	void setMake(std::string  make);

private:
	long long year;
	std::string model;
	std::string vin;
	std::string make;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FleetVehicleResponse_vehicleInfo_H_ */
