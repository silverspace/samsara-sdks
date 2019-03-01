/*
 * DataInputHistoryResponse_points.h
 *
 * 
 */

#ifndef _DataInputHistoryResponse_points_H_
#define _DataInputHistoryResponse_points_H_


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

class DataInputHistoryResponse_points : public Object {
public:
	/*! \brief Constructor.
	 */
	DataInputHistoryResponse_points();
	DataInputHistoryResponse_points(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DataInputHistoryResponse_points();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	double getValue();

	/*! \brief Set 
	 */
	void setValue(double  value);
	/*! \brief Get 
	 */
	long long getTimeMs();

	/*! \brief Set 
	 */
	void setTimeMs(long long  timeMs);

private:
	double value;
	long long timeMs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DataInputHistoryResponse_points_H_ */
