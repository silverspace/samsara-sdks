/*
 * Vehicle.h
 *
 * A vehicle object.
 */

#ifndef _Vehicle_H_
#define _Vehicle_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A vehicle object.
 *
 *  \ingroup Models
 *
 */

class Vehicle : public Object {
public:
	/*! \brief Constructor.
	 */
	Vehicle();
	Vehicle(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Vehicle();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Total engine hours for the vehicle.
	 */
	long long getEngineHours();

	/*! \brief Set Total engine hours for the vehicle.
	 */
	void setEngineHours(long long  engineHours);
	/*! \brief Get The fuel level of the vehicle as a percentage. (0.0 to 1.0)
	 */
	double getFuelLevelPercent();

	/*! \brief Set The fuel level of the vehicle as a percentage. (0.0 to 1.0)
	 */
	void setFuelLevelPercent(double  fuelLevelPercent);
	/*! \brief Get ID of the vehicle.
	 */
	long long getId();

	/*! \brief Set ID of the vehicle.
	 */
	void setId(long long  id);
	/*! \brief Get Name of the vehicle.
	 */
	std::string getName();

	/*! \brief Set Name of the vehicle.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getNote();

	/*! \brief Set 
	 */
	void setNote(std::string  note);
	/*! \brief Get The number of meters reported by the odometer.
	 */
	long long getOdometerMeters();

	/*! \brief Set The number of meters reported by the odometer.
	 */
	void setOdometerMeters(long long  odometerMeters);
	/*! \brief Get Vehicle Identification Number.
	 */
	std::string getVin();

	/*! \brief Set Vehicle Identification Number.
	 */
	void setVin(std::string  vin);

private:
	long long engineHours;
	double fuelLevelPercent;
	long long id;
	std::string name;
	std::string note;
	long long odometerMeters;
	std::string vin;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Vehicle_H_ */
