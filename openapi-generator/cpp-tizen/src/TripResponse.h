/*
 * TripResponse.h
 *
 * Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
 */

#ifndef _TripResponse_H_
#define _TripResponse_H_


#include <string>
#include "TripResponse_trips.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
 *
 *  \ingroup Models
 *
 */

class TripResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	TripResponse();
	TripResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TripResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<TripResponse_trips> getTrips();

	/*! \brief Set 
	 */
	void setTrips(std::list <TripResponse_trips> trips);

private:
	std::list <TripResponse_trips>trips;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TripResponse_H_ */
