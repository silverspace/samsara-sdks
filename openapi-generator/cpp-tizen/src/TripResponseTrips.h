/*
 * TripResponse_trips.h
 *
 * 
 */

#ifndef _TripResponse_trips_H_
#define _TripResponse_trips_H_


#include <string>
#include "TripResponse_endCoordinates.h"
#include "TripResponse_startCoordinates.h"
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

class TripResponse_trips : public Object {
public:
	/*! \brief Constructor.
	 */
	TripResponse_trips();
	TripResponse_trips(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TripResponse_trips();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Odometer reading at the end of the trip.
	 */
	int getEndOdometer();

	/*! \brief Set Odometer reading at the end of the trip.
	 */
	void setEndOdometer(int  endOdometer);
	/*! \brief Get Length of the trip in meters.
	 */
	int getDistanceMeters();

	/*! \brief Set Length of the trip in meters.
	 */
	void setDistanceMeters(int  distanceMeters);
	/*! \brief Get End of the trip in UNIX milliseconds.
	 */
	int getEndMs();

	/*! \brief Set End of the trip in UNIX milliseconds.
	 */
	void setEndMs(int  endMs);
	/*! \brief Get Beginning of the trip in UNIX milliseconds.
	 */
	int getStartMs();

	/*! \brief Set Beginning of the trip in UNIX milliseconds.
	 */
	void setStartMs(int  startMs);
	/*! \brief Get Amount in milliliters of fuel consumed on this trip.
	 */
	int getFuelConsumedMl();

	/*! \brief Set Amount in milliliters of fuel consumed on this trip.
	 */
	void setFuelConsumedMl(int  fuelConsumedMl);
	/*! \brief Get Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
	 */
	std::string getStartAddress();

	/*! \brief Set Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
	 */
	void setStartAddress(std::string  startAddress);
	/*! \brief Get 
	 */
	TripResponse_startCoordinates getStartCoordinates();

	/*! \brief Set 
	 */
	void setStartCoordinates(TripResponse_startCoordinates  startCoordinates);
	/*! \brief Get 
	 */
	TripResponse_endCoordinates getEndCoordinates();

	/*! \brief Set 
	 */
	void setEndCoordinates(TripResponse_endCoordinates  endCoordinates);
	/*! \brief Get Odometer reading at the beginning of the trip.
	 */
	int getStartOdometer();

	/*! \brief Set Odometer reading at the beginning of the trip.
	 */
	void setStartOdometer(int  startOdometer);
	/*! \brief Get ID of the driver.
	 */
	int getDriverId();

	/*! \brief Set ID of the driver.
	 */
	void setDriverId(int  driverId);
	/*! \brief Get Geocoded street address of start (latitude, longitude) coordinates.
	 */
	std::string getStartLocation();

	/*! \brief Set Geocoded street address of start (latitude, longitude) coordinates.
	 */
	void setStartLocation(std::string  startLocation);
	/*! \brief Get Length in meters trip spent on toll roads.
	 */
	int getTollMeters();

	/*! \brief Set Length in meters trip spent on toll roads.
	 */
	void setTollMeters(int  tollMeters);
	/*! \brief Get Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
	 */
	std::string getEndAddress();

	/*! \brief Set Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
	 */
	void setEndAddress(std::string  endAddress);
	/*! \brief Get Geocoded street address of start (latitude, longitude) coordinates.
	 */
	std::string getEndLocation();

	/*! \brief Set Geocoded street address of start (latitude, longitude) coordinates.
	 */
	void setEndLocation(std::string  endLocation);

private:
	int endOdometer;
	int distanceMeters;
	int endMs;
	int startMs;
	int fuelConsumedMl;
	std::string startAddress;
	TripResponse_startCoordinates startCoordinates;
	TripResponse_endCoordinates endCoordinates;
	int startOdometer;
	int driverId;
	std::string startLocation;
	int tollMeters;
	std::string endAddress;
	std::string endLocation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TripResponse_trips_H_ */
