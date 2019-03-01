/*
 * AllRouteJobUpdates.h
 *
 * 
 */

#ifndef _AllRouteJobUpdates_H_
#define _AllRouteJobUpdates_H_


#include <string>
#include "JobUpdateObject.h"
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

class AllRouteJobUpdates : public Object {
public:
	/*! \brief Constructor.
	 */
	AllRouteJobUpdates();
	AllRouteJobUpdates(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AllRouteJobUpdates();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<JobUpdateObject> getJobUpdates();

	/*! \brief Set 
	 */
	void setJobUpdates(std::list <JobUpdateObject> job_updates);
	/*! \brief Get Sequence ID of the last update returned in the response
	 */
	std::string getSequenceId();

	/*! \brief Set Sequence ID of the last update returned in the response
	 */
	void setSequenceId(std::string  sequence_id);

private:
	std::list <JobUpdateObject>job_updates;
	std::string sequence_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AllRouteJobUpdates_H_ */
