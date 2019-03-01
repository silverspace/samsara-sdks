/*
 * DvirBase_mechanicOrAgentSignature.h
 *
 * The mechanic&#39;s or agent&#39;s signature for the DVIR.
 */

#ifndef _DvirBase_mechanicOrAgentSignature_H_
#define _DvirBase_mechanicOrAgentSignature_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The mechanic's or agent's signature for the DVIR.
 *
 *  \ingroup Models
 *
 */

class DvirBase_mechanicOrAgentSignature : public Object {
public:
	/*! \brief Constructor.
	 */
	DvirBase_mechanicOrAgentSignature();
	DvirBase_mechanicOrAgentSignature(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DvirBase_mechanicOrAgentSignature();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
	 */
	long long getMechanicUserId();

	/*! \brief Set ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.
	 */
	void setMechanicUserId(long long  mechanicUserId);
	/*! \brief Get ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
	 */
	long long getDriverId();

	/*! \brief Set ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.
	 */
	void setDriverId(long long  driverId);
	/*! \brief Get The name of the agent or mechanic who signed the DVIR.
	 */
	std::string getName();

	/*! \brief Set The name of the agent or mechanic who signed the DVIR.
	 */
	void setName(std::string  name);
	/*! \brief Get The time in millis when the DVIR was signed
	 */
	long long getSignedAt();

	/*! \brief Set The time in millis when the DVIR was signed
	 */
	void setSignedAt(long long  signedAt);
	/*! \brief Get Type corresponds to whether the signature corresponds to driver|mechanic.
	 */
	std::string getType();

	/*! \brief Set Type corresponds to whether the signature corresponds to driver|mechanic.
	 */
	void setType(std::string  type);
	/*! \brief Get Email of the  agent|mechanic who signed the DVIR.
	 */
	std::string getEmail();

	/*! \brief Set Email of the  agent|mechanic who signed the DVIR.
	 */
	void setEmail(std::string  email);
	/*! \brief Get Username of the  agent|mechanic who signed the DVIR.
	 */
	std::string getUsername();

	/*! \brief Set Username of the  agent|mechanic who signed the DVIR.
	 */
	void setUsername(std::string  username);

private:
	long long mechanicUserId;
	long long driverId;
	std::string name;
	long long signedAt;
	std::string type;
	std::string email;
	std::string username;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DvirBase_mechanicOrAgentSignature_H_ */
