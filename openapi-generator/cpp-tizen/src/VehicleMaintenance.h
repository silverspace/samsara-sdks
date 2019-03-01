/*
 * VehicleMaintenance.h
 *
 * Contains any J1939/Passenger engine light warnings and engine faults.
 */

#ifndef _VehicleMaintenance_H_
#define _VehicleMaintenance_H_


#include <string>
#include "VehicleMaintenance_j1939.h"
#include "VehicleMaintenance_passenger.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Contains any J1939/Passenger engine light warnings and engine faults.
 *
 *  \ingroup Models
 *
 */

class VehicleMaintenance : public Object {
public:
	/*! \brief Constructor.
	 */
	VehicleMaintenance();
	VehicleMaintenance(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VehicleMaintenance();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID of the vehicle.
	 */
	long long getId();

	/*! \brief Set ID of the vehicle.
	 */
	void setId(long long  id);
	/*! \brief Get 
	 */
	VehicleMaintenance_j1939 getJ1939();

	/*! \brief Set 
	 */
	void setJ1939(VehicleMaintenance_j1939  j1939);
	/*! \brief Get 
	 */
	VehicleMaintenance_passenger getPassenger();

	/*! \brief Set 
	 */
	void setPassenger(VehicleMaintenance_passenger  passenger);

private:
	long long id;
	VehicleMaintenance_j1939 j1939;
	VehicleMaintenance_passenger passenger;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VehicleMaintenance_H_ */
