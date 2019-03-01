/*
 * Pagination.h
 *
 * 
 */

#ifndef _Pagination_H_
#define _Pagination_H_


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

class Pagination : public Object {
public:
	/*! \brief Constructor.
	 */
	Pagination();
	Pagination(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Pagination();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.
	 */
	std::string getEndCursor();

	/*! \brief Set Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter.
	 */
	void setEndCursor(std::string  endCursor);
	/*! \brief Get True if there are more pages of results after this response.
	 */
	bool getHasNextPage();

	/*! \brief Set True if there are more pages of results after this response.
	 */
	void setHasNextPage(bool  hasNextPage);
	/*! \brief Get True if there are more pages of results before this response.
	 */
	bool getHasPrevPage();

	/*! \brief Set True if there are more pages of results before this response.
	 */
	void setHasPrevPage(bool  hasPrevPage);
	/*! \brief Get Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.
	 */
	std::string getStartCursor();

	/*! \brief Set Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter.
	 */
	void setStartCursor(std::string  startCursor);

private:
	std::string endCursor;
	bool hasNextPage;
	bool hasPrevPage;
	std::string startCursor;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Pagination_H_ */
