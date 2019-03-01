/*
 * DriversResponse.h
 *
 * 
 */

#ifndef _DriversResponse_H_
#define _DriversResponse_H_


#include <string>
#include "Driver.h"
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

class DriversResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DriversResponse();
	DriversResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DriversResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<Driver> getDrivers();

	/*! \brief Set 
	 */
	void setDrivers(std::list <Driver> drivers);

private:
	std::list <Driver>drivers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DriversResponse_H_ */
