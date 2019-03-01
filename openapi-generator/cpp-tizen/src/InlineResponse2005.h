/*
 * Inline_response_200_5.h
 *
 * 
 */

#ifndef _Inline_response_200_5_H_
#define _Inline_response_200_5_H_


#include <string>
#include "Inline_response_200_5_vehicleStats.h"
#include "Pagination.h"
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

class Inline_response_200_5 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_response_200_5();
	Inline_response_200_5(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_response_200_5();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Pagination getPagination();

	/*! \brief Set 
	 */
	void setPagination(Pagination  pagination);
	/*! \brief Get 
	 */
	std::list<Inline_response_200_5_vehicleStats> getVehicleStats();

	/*! \brief Set 
	 */
	void setVehicleStats(std::list <Inline_response_200_5_vehicleStats> vehicleStats);

private:
	Pagination pagination;
	std::list <Inline_response_200_5_vehicleStats>vehicleStats;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_response_200_5_H_ */
