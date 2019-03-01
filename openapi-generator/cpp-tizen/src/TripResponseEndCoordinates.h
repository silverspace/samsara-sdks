/*
 * TripResponse_endCoordinates.h
 *
 * End (latitude, longitude) in decimal degrees.
 */

#ifndef _TripResponse_endCoordinates_H_
#define _TripResponse_endCoordinates_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief End (latitude, longitude) in decimal degrees.
 *
 *  \ingroup Models
 *
 */

class TripResponse_endCoordinates : public Object {
public:
	/*! \brief Constructor.
	 */
	TripResponse_endCoordinates();
	TripResponse_endCoordinates(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TripResponse_endCoordinates();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	double getLatitude();

	/*! \brief Set 
	 */
	void setLatitude(double  latitude);
	/*! \brief Get 
	 */
	double getLongitude();

	/*! \brief Set 
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

#endif /* _TripResponse_endCoordinates_H_ */
