/*
 * AssetReeferResponse_reeferStats_fuelPercentage.h
 *
 * 
 */

#ifndef _AssetReeferResponse_reeferStats_fuelPercentage_H_
#define _AssetReeferResponse_reeferStats_fuelPercentage_H_


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

class AssetReeferResponse_reeferStats_fuelPercentage : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetReeferResponse_reeferStats_fuelPercentage();
	AssetReeferResponse_reeferStats_fuelPercentage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetReeferResponse_reeferStats_fuelPercentage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Fuel percentage of the reefer.
	 */
	long long getFuelPercentage();

	/*! \brief Set Fuel percentage of the reefer.
	 */
	void setFuelPercentage(long long  fuelPercentage);
	/*! \brief Get Timestamp in Unix milliseconds since epoch.
	 */
	long long getChangedAtMs();

	/*! \brief Set Timestamp in Unix milliseconds since epoch.
	 */
	void setChangedAtMs(long long  changedAtMs);

private:
	long long fuelPercentage;
	long long changedAtMs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetReeferResponse_reeferStats_fuelPercentage_H_ */
