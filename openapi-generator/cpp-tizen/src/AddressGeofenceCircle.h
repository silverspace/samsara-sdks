/*
 * AddressGeofence_circle.h
 *
 * Information about a circular geofence. This field is only populated if the geofence is a circle.
 */

#ifndef _AddressGeofence_circle_H_
#define _AddressGeofence_circle_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Information about a circular geofence. This field is only populated if the geofence is a circle.
 *
 *  \ingroup Models
 *
 */

class AddressGeofence_circle : public Object {
public:
	/*! \brief Constructor.
	 */
	AddressGeofence_circle();
	AddressGeofence_circle(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AddressGeofence_circle();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The latitude of the center of the circular geofence
	 */
	double getLatitude();

	/*! \brief Set The latitude of the center of the circular geofence
	 */
	void setLatitude(double  latitude);
	/*! \brief Get The radius of the circular geofence
	 */
	long long getRadiusMeters();

	/*! \brief Set The radius of the circular geofence
	 */
	void setRadiusMeters(long long  radiusMeters);
	/*! \brief Get The longitude of the center of the circular geofence
	 */
	double getLongitude();

	/*! \brief Set The longitude of the center of the circular geofence
	 */
	void setLongitude(double  longitude);

private:
	double latitude;
	long long radiusMeters;
	double longitude;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AddressGeofence_circle_H_ */
