/*
 * AssetReeferResponse_reeferStats_powerStatus.h
 *
 * 
 */

#ifndef _AssetReeferResponse_reeferStats_powerStatus_H_
#define _AssetReeferResponse_reeferStats_powerStatus_H_


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

class AssetReeferResponse_reeferStats_powerStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetReeferResponse_reeferStats_powerStatus();
	AssetReeferResponse_reeferStats_powerStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetReeferResponse_reeferStats_powerStatus();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Timestamp in Unix milliseconds since epoch.
	 */
	long long getChangedAtMs();

	/*! \brief Set Timestamp in Unix milliseconds since epoch.
	 */
	void setChangedAtMs(long long  changedAtMs);
	/*! \brief Get Power status of the reefer.
	 */
	std::string getStatus();

	/*! \brief Set Power status of the reefer.
	 */
	void setStatus(std::string  status);

private:
	long long changedAtMs;
	std::string status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetReeferResponse_reeferStats_powerStatus_H_ */
