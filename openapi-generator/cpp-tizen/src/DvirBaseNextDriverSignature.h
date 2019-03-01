/*
 * DvirBase_nextDriverSignature.h
 *
 * The next driver signature for the DVIR.
 */

#ifndef _DvirBase_nextDriverSignature_H_
#define _DvirBase_nextDriverSignature_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The next driver signature for the DVIR.
 *
 *  \ingroup Models
 *
 */

class DvirBase_nextDriverSignature : public Object {
public:
	/*! \brief Constructor.
	 */
	DvirBase_nextDriverSignature();
	DvirBase_nextDriverSignature(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DvirBase_nextDriverSignature();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID of the driver who signed the DVIR
	 */
	long long getDriverId();

	/*! \brief Set ID of the driver who signed the DVIR
	 */
	void setDriverId(long long  driverId);
	/*! \brief Get The name of the driver who signed the next DVIR on this vehicle.
	 */
	std::string getName();

	/*! \brief Set The name of the driver who signed the next DVIR on this vehicle.
	 */
	void setName(std::string  name);
	/*! \brief Get The time in millis when the next driver signed the DVIR on this vehicle.
	 */
	long long getSignedAt();

	/*! \brief Set The time in millis when the next driver signed the DVIR on this vehicle.
	 */
	void setSignedAt(long long  signedAt);
	/*! \brief Get Type corresponds to driver.
	 */
	std::string getType();

	/*! \brief Set Type corresponds to driver.
	 */
	void setType(std::string  type);
	/*! \brief Get Email of the  driver who signed the next DVIR on this vehicle.
	 */
	std::string getEmail();

	/*! \brief Set Email of the  driver who signed the next DVIR on this vehicle.
	 */
	void setEmail(std::string  email);
	/*! \brief Get Username of the  driver who signed the next DVIR on this vehicle.
	 */
	std::string getUsername();

	/*! \brief Set Username of the  driver who signed the next DVIR on this vehicle.
	 */
	void setUsername(std::string  username);

private:
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

#endif /* _DvirBase_nextDriverSignature_H_ */
