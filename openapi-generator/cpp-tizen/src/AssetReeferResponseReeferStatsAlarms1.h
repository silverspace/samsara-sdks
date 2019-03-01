/*
 * AssetReeferResponse_reeferStats_alarms_1.h
 *
 * 
 */

#ifndef _AssetReeferResponse_reeferStats_alarms_1_H_
#define _AssetReeferResponse_reeferStats_alarms_1_H_


#include <string>
#include "AssetReeferResponse_reeferStats_alarms.h"
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

class AssetReeferResponse_reeferStats_alarms_1 : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetReeferResponse_reeferStats_alarms_1();
	AssetReeferResponse_reeferStats_alarms_1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetReeferResponse_reeferStats_alarms_1();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AssetReeferResponse_reeferStats_alarms> getAlarms();

	/*! \brief Set 
	 */
	void setAlarms(std::list <AssetReeferResponse_reeferStats_alarms> alarms);
	/*! \brief Get Timestamp when the alarms were reported, in Unix milliseconds since epoch
	 */
	long long getChangedAtMs();

	/*! \brief Set Timestamp when the alarms were reported, in Unix milliseconds since epoch
	 */
	void setChangedAtMs(long long  changedAtMs);

private:
	std::list <AssetReeferResponse_reeferStats_alarms>alarms;
	long long changedAtMs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetReeferResponse_reeferStats_alarms_1_H_ */
