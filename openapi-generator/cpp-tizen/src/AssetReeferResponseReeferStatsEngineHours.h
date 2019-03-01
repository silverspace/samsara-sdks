/*
 * AssetReeferResponse_reeferStats_engineHours.h
 *
 * 
 */

#ifndef _AssetReeferResponse_reeferStats_engineHours_H_
#define _AssetReeferResponse_reeferStats_engineHours_H_


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

class AssetReeferResponse_reeferStats_engineHours : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetReeferResponse_reeferStats_engineHours();
	AssetReeferResponse_reeferStats_engineHours(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetReeferResponse_reeferStats_engineHours();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Engine hours of the reefer.
	 */
	long long getEngineHours();

	/*! \brief Set Engine hours of the reefer.
	 */
	void setEngineHours(long long  engineHours);
	/*! \brief Get Timestamp in Unix milliseconds since epoch.
	 */
	long long getChangedAtMs();

	/*! \brief Set Timestamp in Unix milliseconds since epoch.
	 */
	void setChangedAtMs(long long  changedAtMs);

private:
	long long engineHours;
	long long changedAtMs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetReeferResponse_reeferStats_engineHours_H_ */
