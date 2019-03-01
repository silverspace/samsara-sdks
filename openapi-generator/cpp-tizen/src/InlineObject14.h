/*
 * Inline_object_14.h
 *
 * 
 */

#ifndef _Inline_object_14_H_
#define _Inline_object_14_H_


#include <string>
#include "Vehicle.h"
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

class Inline_object_14 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_object_14();
	Inline_object_14(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_object_14();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Group ID to query.
	 */
	long long getGroupId();

	/*! \brief Set Group ID to query.
	 */
	void setGroupId(long long  groupId);
	/*! \brief Get 
	 */
	std::list<Vehicle> getVehicles();

	/*! \brief Set 
	 */
	void setVehicles(std::list <Vehicle> vehicles);

private:
	long long groupId;
	std::list <Vehicle>vehicles;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_object_14_H_ */
