/*
 * DataInputHistoryResponse.h
 *
 * 
 */

#ifndef _DataInputHistoryResponse_H_
#define _DataInputHistoryResponse_H_


#include <string>
#include "DataInputHistoryResponse_points.h"
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

class DataInputHistoryResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DataInputHistoryResponse();
	DataInputHistoryResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DataInputHistoryResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of this data input
	 */
	long long getId();

	/*! \brief Set The ID of this data input
	 */
	void setId(long long  id);
	/*! \brief Get Name of this data input
	 */
	std::string getName();

	/*! \brief Set Name of this data input
	 */
	void setName(std::string  name);
	/*! \brief Get Data points from this data input
	 */
	std::list<DataInputHistoryResponse_points> getPoints();

	/*! \brief Set Data points from this data input
	 */
	void setPoints(std::list <DataInputHistoryResponse_points> points);

private:
	long long id;
	std::string name;
	std::list <DataInputHistoryResponse_points>points;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DataInputHistoryResponse_H_ */
