/*
 * VehicleHarshEventResponse_location.h
 *
 * 
 */

#ifndef _VehicleHarshEventResponse_location_H_
#define _VehicleHarshEventResponse_location_H_


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

class VehicleHarshEventResponse_location : public Object {
public:
	/*! \brief Constructor.
	 */
	VehicleHarshEventResponse_location();
	VehicleHarshEventResponse_location(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VehicleHarshEventResponse_location();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Address of location where the harsh event occurred
	 */
	std::string getAddress();

	/*! \brief Set Address of location where the harsh event occurred
	 */
	void setAddress(std::string  address);
	/*! \brief Get Latitude of location where the harsh event occurred
	 */
	std::string getLatitude();

	/*! \brief Set Latitude of location where the harsh event occurred
	 */
	void setLatitude(std::string  latitude);
	/*! \brief Get Longitude of location where the harsh event occurred
	 */
	std::string getLongitude();

	/*! \brief Set Longitude of location where the harsh event occurred
	 */
	void setLongitude(std::string  longitude);

private:
	std::string address;
	std::string latitude;
	std::string longitude;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VehicleHarshEventResponse_location_H_ */
