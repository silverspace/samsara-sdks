/*
 * PrevJobStatus.h
 *
 * The previous state of the dispatch job.
 */

#ifndef _PrevJobStatus_H_
#define _PrevJobStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The previous state of the dispatch job.
 *
 *  \ingroup Models
 *
 */

class PrevJobStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	PrevJobStatus();
	PrevJobStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PrevJobStatus();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _PrevJobStatus_H_ */
