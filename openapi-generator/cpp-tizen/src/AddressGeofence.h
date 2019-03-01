/*
 * AddressGeofence.h
 *
 * The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
 */

#ifndef _AddressGeofence_H_
#define _AddressGeofence_H_


#include <string>
#include "AddressGeofence_circle.h"
#include "AddressGeofence_polygon.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
 *
 *  \ingroup Models
 *
 */

class AddressGeofence : public Object {
public:
	/*! \brief Constructor.
	 */
	AddressGeofence();
	AddressGeofence(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AddressGeofence();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AddressGeofence_circle getCircle();

	/*! \brief Set 
	 */
	void setCircle(AddressGeofence_circle  circle);
	/*! \brief Get 
	 */
	AddressGeofence_polygon getPolygon();

	/*! \brief Set 
	 */
	void setPolygon(AddressGeofence_polygon  polygon);

private:
	AddressGeofence_circle circle;
	AddressGeofence_polygon polygon;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AddressGeofence_H_ */
