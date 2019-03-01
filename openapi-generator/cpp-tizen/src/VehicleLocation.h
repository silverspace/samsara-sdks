/*
 * VehicleLocation.h
 *
 * Contains the location, in latitude and longitude, of a vehicle.
 */

#ifndef _VehicleLocation_H_
#define _VehicleLocation_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Contains the location, in latitude and longitude, of a vehicle.
 *
 *  \ingroup Models
 *
 */

class VehicleLocation : public Object {
public:
	/*! \brief Constructor.
	 */
	VehicleLocation();
	VehicleLocation(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VehicleLocation();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Heading in degrees.
	 */
	double getHeading();

	/*! \brief Set Heading in degrees.
	 */
	void setHeading(double  heading);
	/*! \brief Get ID of the vehicle.
	 */
	long long getId();

	/*! \brief Set ID of the vehicle.
	 */
	void setId(long long  id);
	/*! \brief Get Latitude in decimal degrees.
	 */
	double getLatitude();

	/*! \brief Set Latitude in decimal degrees.
	 */
	void setLatitude(double  latitude);
	/*! \brief Get Text representation of nearest identifiable location to (latitude, longitude) coordinates.
	 */
	std::string getLocation();

	/*! \brief Set Text representation of nearest identifiable location to (latitude, longitude) coordinates.
	 */
	void setLocation(std::string  location);
	/*! \brief Get Longitude in decimal degrees.
	 */
	double getLongitude();

	/*! \brief Set Longitude in decimal degrees.
	 */
	void setLongitude(double  longitude);
	/*! \brief Get Name of the vehicle.
	 */
	std::string getName();

	/*! \brief Set Name of the vehicle.
	 */
	void setName(std::string  name);
	/*! \brief Get The number of meters reported by the odometer.
	 */
	long long getOdometerMeters();

	/*! \brief Set The number of meters reported by the odometer.
	 */
	void setOdometerMeters(long long  odometerMeters);
	/*! \brief Get Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
	 */
	bool getOnTrip();

	/*! \brief Set Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
	 */
	void setOnTrip(bool  onTrip);
	/*! \brief Get Speed in miles per hour.
	 */
	double getSpeed();

	/*! \brief Set Speed in miles per hour.
	 */
	void setSpeed(double  speed);
	/*! \brief Get The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
	 */
	int getTime();

	/*! \brief Set The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
	 */
	void setTime(int  time);
	/*! \brief Get Vehicle Identification Number (VIN) of the vehicle.
	 */
	std::string getVin();

	/*! \brief Set Vehicle Identification Number (VIN) of the vehicle.
	 */
	void setVin(std::string  vin);

private:
	double heading;
	long long id;
	double latitude;
	std::string location;
	double longitude;
	std::string name;
	long long odometerMeters;
	bool onTrip;
	double speed;
	int time;
	std::string vin;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VehicleLocation_H_ */
