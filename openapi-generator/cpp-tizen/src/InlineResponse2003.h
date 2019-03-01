/*
 * Inline_response_200_3.h
 *
 * 
 */

#ifndef _Inline_response_200_3_H_
#define _Inline_response_200_3_H_


#include <string>
#include "VehicleLocation.h"
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

class Inline_response_200_3 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_response_200_3();
	Inline_response_200_3(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_response_200_3();

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
	std::list<VehicleLocation> getVehicles();

	/*! \brief Set 
	 */
	void setVehicles(std::list <VehicleLocation> vehicles);

private:
	long long groupId;
	std::list <VehicleLocation>vehicles;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_response_200_3_H_ */
