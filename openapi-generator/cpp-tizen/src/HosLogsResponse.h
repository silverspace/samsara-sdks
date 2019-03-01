/*
 * HosLogsResponse.h
 *
 * 
 */

#ifndef _HosLogsResponse_H_
#define _HosLogsResponse_H_


#include <string>
#include "HosLogsResponse_logs.h"
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

class HosLogsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	HosLogsResponse();
	HosLogsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~HosLogsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<HosLogsResponse_logs> getLogs();

	/*! \brief Set 
	 */
	void setLogs(std::list <HosLogsResponse_logs> logs);

private:
	std::list <HosLogsResponse_logs>logs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _HosLogsResponse_H_ */
