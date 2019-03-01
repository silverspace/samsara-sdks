/*
 * AddressGeofence_polygon.h
 *
 * Information about a polygon geofence. This field is only populated if the geofence is a polygon.
 */

#ifndef _AddressGeofence_polygon_H_
#define _AddressGeofence_polygon_H_


#include <string>
#include "AddressGeofence_polygon_vertices.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Information about a polygon geofence. This field is only populated if the geofence is a polygon.
 *
 *  \ingroup Models
 *
 */

class AddressGeofence_polygon : public Object {
public:
	/*! \brief Constructor.
	 */
	AddressGeofence_polygon();
	AddressGeofence_polygon(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AddressGeofence_polygon();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
	 */
	std::list<AddressGeofence_polygon_vertices> getVertices();

	/*! \brief Set The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
	 */
	void setVertices(std::list <AddressGeofence_polygon_vertices> vertices);

private:
	std::list <AddressGeofence_polygon_vertices>vertices;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AddressGeofence_polygon_H_ */
