/*
 * HosAuthenticationLogsResponse_authenticationLogs.h
 *
 * 
 */

#ifndef _HosAuthenticationLogsResponse_authenticationLogs_H_
#define _HosAuthenticationLogsResponse_authenticationLogs_H_


#include <string>
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

class HosAuthenticationLogsResponse_authenticationLogs : public Object {
public:
	/*! \brief Constructor.
	 */
	HosAuthenticationLogsResponse_authenticationLogs();
	HosAuthenticationLogsResponse_authenticationLogs(char* str);

	/*! \brief Destructor.
	 */
	virtual ~HosAuthenticationLogsResponse_authenticationLogs();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The log type - one of 'signin' or 'signout'
	 */
	std::string getActionType();

	/*! \brief Set The log type - one of 'signin' or 'signout'
	 */
	void setActionType(std::string  actionType);
	/*! \brief Get Address at which the log was recorded, if applicable.
	 */
	std::string getAddress();

	/*! \brief Set Address at which the log was recorded, if applicable.
	 */
	void setAddress(std::string  address);
	/*! \brief Get City in which the log was recorded, if applicable.
	 */
	std::string getCity();

	/*! \brief Set City in which the log was recorded, if applicable.
	 */
	void setCity(std::string  city);
	/*! \brief Get The time at which the event was recorded in UNIX milliseconds.
	 */
	long long getHappenedAtMs();

	/*! \brief Set The time at which the event was recorded in UNIX milliseconds.
	 */
	void setHappenedAtMs(long long  happenedAtMs);
	/*! \brief Get Address name from the group address book at which the log was recorded, if applicable.
	 */
	std::string getAddressName();

	/*! \brief Set Address name from the group address book at which the log was recorded, if applicable.
	 */
	void setAddressName(std::string  addressName);
	/*! \brief Get State in which the log was recorded, if applicable.
	 */
	std::string getState();

	/*! \brief Set State in which the log was recorded, if applicable.
	 */
	void setState(std::string  state);

private:
	std::string actionType;
	std::string address;
	std::string city;
	long long happenedAtMs;
	std::string addressName;
	std::string state;
	void __init();
	void __cleanup();

};
}
}

#endif /* _HosAuthenticationLogsResponse_authenticationLogs_H_ */
