/*
 * JobStatus.h
 *
 * The current state of the dispatch job.
 */

#ifndef _JobStatus_H_
#define _JobStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The current state of the dispatch job.
 *
 *  \ingroup Models
 *
 */

class JobStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	JobStatus();
	JobStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~JobStatus();

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

#endif /* _JobStatus_H_ */
