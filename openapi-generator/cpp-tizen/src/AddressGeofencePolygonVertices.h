/*
 * AddressGeofence_polygon_vertices.h
 *
 * 
 */

#ifndef _AddressGeofence_polygon_vertices_H_
#define _AddressGeofence_polygon_vertices_H_


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

class AddressGeofence_polygon_vertices : public Object {
public:
	/*! \brief Constructor.
	 */
	AddressGeofence_polygon_vertices();
	AddressGeofence_polygon_vertices(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AddressGeofence_polygon_vertices();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The longitude of a geofence vertex
	 */
	double getLatitude();

	/*! \brief Set The longitude of a geofence vertex
	 */
	void setLatitude(double  latitude);
	/*! \brief Get The longitude of a geofence vertex
	 */
	double getLongitude();

	/*! \brief Set The longitude of a geofence vertex
	 */
	void setLongitude(double  longitude);

private:
	double latitude;
	double longitude;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AddressGeofence_polygon_vertices_H_ */
