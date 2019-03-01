/*
 * AssetReeferResponse_reeferStats_setPoint.h
 *
 * 
 */

#ifndef _AssetReeferResponse_reeferStats_setPoint_H_
#define _AssetReeferResponse_reeferStats_setPoint_H_


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

class AssetReeferResponse_reeferStats_setPoint : public Object {
public:
	/*! \brief Constructor.
	 */
	AssetReeferResponse_reeferStats_setPoint();
	AssetReeferResponse_reeferStats_setPoint(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssetReeferResponse_reeferStats_setPoint();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Set point temperature in millidegree Celsius.
	 */
	long long getTempInMilliC();

	/*! \brief Set Set point temperature in millidegree Celsius.
	 */
	void setTempInMilliC(long long  tempInMilliC);
	/*! \brief Get Timestamp in Unix milliseconds since epoch.
	 */
	long long getChangedAtMs();

	/*! \brief Set Timestamp in Unix milliseconds since epoch.
	 */
	void setChangedAtMs(long long  changedAtMs);

private:
	long long tempInMilliC;
	long long changedAtMs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssetReeferResponse_reeferStats_setPoint_H_ */
