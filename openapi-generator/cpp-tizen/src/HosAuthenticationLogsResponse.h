/*
 * HosAuthenticationLogsResponse.h
 *
 * 
 */

#ifndef _HosAuthenticationLogsResponse_H_
#define _HosAuthenticationLogsResponse_H_


#include <string>
#include "HosAuthenticationLogsResponse_authenticationLogs.h"
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

class HosAuthenticationLogsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	HosAuthenticationLogsResponse();
	HosAuthenticationLogsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~HosAuthenticationLogsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<HosAuthenticationLogsResponse_authenticationLogs> getAuthenticationLogs();

	/*! \brief Set 
	 */
	void setAuthenticationLogs(std::list <HosAuthenticationLogsResponse_authenticationLogs> authenticationLogs);

private:
	std::list <HosAuthenticationLogsResponse_authenticationLogs>authenticationLogs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _HosAuthenticationLogsResponse_H_ */
