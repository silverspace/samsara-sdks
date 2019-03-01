/*
 * HosLogsSummaryResponse.h
 *
 * 
 */

#ifndef _HosLogsSummaryResponse_H_
#define _HosLogsSummaryResponse_H_


#include <string>
#include "HosLogsSummaryResponse_drivers.h"
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

class HosLogsSummaryResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	HosLogsSummaryResponse();
	HosLogsSummaryResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~HosLogsSummaryResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<HosLogsSummaryResponse_drivers> getDrivers();

	/*! \brief Set 
	 */
	void setDrivers(std::list <HosLogsSummaryResponse_drivers> drivers);

private:
	std::list <HosLogsSummaryResponse_drivers>drivers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _HosLogsSummaryResponse_H_ */
