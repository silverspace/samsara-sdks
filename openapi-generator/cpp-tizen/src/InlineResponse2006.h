/*
 * Inline_response_200_6.h
 *
 * 
 */

#ifndef _Inline_response_200_6_H_
#define _Inline_response_200_6_H_


#include <string>
#include "DataInputHistoryResponse.h"
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

class Inline_response_200_6 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_response_200_6();
	Inline_response_200_6(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_response_200_6();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<DataInputHistoryResponse> getDataInputs();

	/*! \brief Set 
	 */
	void setDataInputs(std::list <DataInputHistoryResponse> dataInputs);

private:
	std::list <DataInputHistoryResponse>dataInputs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_response_200_6_H_ */
