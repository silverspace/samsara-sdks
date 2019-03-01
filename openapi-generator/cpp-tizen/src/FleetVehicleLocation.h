/*
 * FleetVehicleLocation.h
 *
 * Contains the location and speed of a vehicle at a particular time
 */

#ifndef _FleetVehicleLocation_H_
#define _FleetVehicleLocation_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Contains the location and speed of a vehicle at a particular time
 *
 *  \ingroup Models
 *
 */

class FleetVehicleLocation : public Object {
public:
	/*! \brief Constructor.
	 */
	FleetVehicleLocation();
	FleetVehicleLocation(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FleetVehicleLocation();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The latitude of the location in degrees.
	 */
	double getLatitude();

	/*! \brief Set The latitude of the location in degrees.
	 */
	void setLatitude(double  latitude);
	/*! \brief Get The best effort (street,city,state) for the latitude and longitude.
	 */
	std::string getLocation();

	/*! \brief Set The best effort (street,city,state) for the latitude and longitude.
	 */
	void setLocation(std::string  location);
	/*! \brief Get The longitude of the location in degrees.
	 */
	double getLongitude();

	/*! \brief Set The longitude of the location in degrees.
	 */
	void setLongitude(double  longitude);
	/*! \brief Get The speed calculated from GPS that the asset was traveling at in miles per hour.
	 */
	double getSpeedMilesPerHour();

	/*! \brief Set The speed calculated from GPS that the asset was traveling at in miles per hour.
	 */
	void setSpeedMilesPerHour(double  speedMilesPerHour);
	/*! \brief Get Time in Unix milliseconds since epoch when the asset was at the location.
	 */
	long long getTimeMs();

	/*! \brief Set Time in Unix milliseconds since epoch when the asset was at the location.
	 */
	void setTimeMs(long long  timeMs);

private:
	double latitude;
	std::string location;
	double longitude;
	double speedMilesPerHour;
	long long timeMs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FleetVehicleLocation_H_ */
