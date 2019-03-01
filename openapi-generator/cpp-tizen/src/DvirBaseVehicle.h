/*
 * DvirBase_vehicle.h
 *
 * The vehicle on which DVIR was done.
 */

#ifndef _DvirBase_vehicle_H_
#define _DvirBase_vehicle_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The vehicle on which DVIR was done.
 *
 *  \ingroup Models
 *
 */

class DvirBase_vehicle : public Object {
public:
	/*! \brief Constructor.
	 */
	DvirBase_vehicle();
	DvirBase_vehicle(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DvirBase_vehicle();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The vehicle on which DVIR was done.
	 */
	std::string getName();

	/*! \brief Set The vehicle on which DVIR was done.
	 */
	void setName(std::string  name);
	/*! \brief Get The vehicle id on which DVIR was done.
	 */
	long long getId();

	/*! \brief Set The vehicle id on which DVIR was done.
	 */
	void setId(long long  id);

private:
	std::string name;
	long long id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DvirBase_vehicle_H_ */
