/*
 * DvirListResponse.h
 *
 * 
 */

#ifndef _DvirListResponse_H_
#define _DvirListResponse_H_


#include <string>
#include "DvirBase.h"
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

class DvirListResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DvirListResponse();
	DvirListResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DvirListResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<DvirBase> getDvirs();

	/*! \brief Set 
	 */
	void setDvirs(std::list <DvirBase> dvirs);

private:
	std::list <DvirBase>dvirs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DvirListResponse_H_ */
