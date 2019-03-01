/*
 * JobUpdateObject.h
 *
 * 
 */

#ifndef _JobUpdateObject_H_
#define _JobUpdateObject_H_


#include <string>
#include "DispatchRoute.h"
#include "JobStatus.h"
#include "PrevJobStatus.h"
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

class JobUpdateObject : public Object {
public:
	/*! \brief Constructor.
	 */
	JobUpdateObject();
	JobUpdateObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~JobUpdateObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Timestamp that this event was updated, represented as Unix milliseconds since epoch.
	 */
	long long getChangedAtMs();

	/*! \brief Set Timestamp that this event was updated, represented as Unix milliseconds since epoch.
	 */
	void setChangedAtMs(long long  changed_at_ms);
	/*! \brief Get ID of the Samsara job.
	 */
	long long getJobId();

	/*! \brief Set ID of the Samsara job.
	 */
	void setJobId(long long  job_id);
	/*! \brief Get 
	 */
	JobStatus getJobState();

	/*! \brief Set 
	 */
	void setJobState(JobStatus  job_state);
	/*! \brief Get 
	 */
	PrevJobStatus getPrevJobState();

	/*! \brief Set 
	 */
	void setPrevJobState(PrevJobStatus  prev_job_state);
	/*! \brief Get 
	 */
	DispatchRoute getRoute();

	/*! \brief Set 
	 */
	void setRoute(DispatchRoute  route);
	/*! \brief Get ID of the Samsara dispatch route.
	 */
	long long getRouteId();

	/*! \brief Set ID of the Samsara dispatch route.
	 */
	void setRouteId(long long  route_id);

private:
	long long changed_at_ms;
	long long job_id;
	JobStatus job_state;
	PrevJobStatus prev_job_state;
	DispatchRoute route;
	long long route_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _JobUpdateObject_H_ */
