/*
 * DriversSummaryResponse.h
 *
 * 
 */

#ifndef _DriversSummaryResponse_H_
#define _DriversSummaryResponse_H_


#include <string>
#include "DriversSummaryResponse_Summaries.h"
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

class DriversSummaryResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DriversSummaryResponse();
	DriversSummaryResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DriversSummaryResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<DriversSummaryResponse_Summaries> getSummaries();

	/*! \brief Set 
	 */
	void setSummaries(std::list <DriversSummaryResponse_Summaries> summaries);

private:
	std::list <DriversSummaryResponse_Summaries>summaries;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DriversSummaryResponse_H_ */
