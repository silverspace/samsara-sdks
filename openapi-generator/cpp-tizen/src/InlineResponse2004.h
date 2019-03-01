/*
 * Inline_response_200_4.h
 *
 * 
 */

#ifndef _Inline_response_200_4_H_
#define _Inline_response_200_4_H_


#include <string>
#include "VehicleMaintenance.h"
#include <list>
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

class Inline_response_200_4 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_response_200_4();
	Inline_response_200_4(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_response_200_4();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<VehicleMaintenance> getVehicles();

	/*! \brief Set 
	 */
	void setVehicles(std::list <VehicleMaintenance> vehicles);

private:
	std::list <VehicleMaintenance>vehicles;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_response_200_4_H_ */
