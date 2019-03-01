#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "JobUpdateObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

JobUpdateObject::JobUpdateObject()
{
	//__init();
}

JobUpdateObject::~JobUpdateObject()
{
	//__cleanup();
}

void
JobUpdateObject::__init()
{
	//changed_at_ms = long(0);
	//job_id = long(0);
	//job_state = new JobStatus();
	//prev_job_state = new PrevJobStatus();
	//route = new DispatchRoute();
	//route_id = long(0);
}

void
JobUpdateObject::__cleanup()
{
	//if(changed_at_ms != NULL) {
	//
	//delete changed_at_ms;
	//changed_at_ms = NULL;
	//}
	//if(job_id != NULL) {
	//
	//delete job_id;
	//job_id = NULL;
	//}
	//if(job_state != NULL) {
	//
	//delete job_state;
	//job_state = NULL;
	//}
	//if(prev_job_state != NULL) {
	//
	//delete prev_job_state;
	//prev_job_state = NULL;
	//}
	//if(route != NULL) {
	//
	//delete route;
	//route = NULL;
	//}
	//if(route_id != NULL) {
	//
	//delete route_id;
	//route_id = NULL;
	//}
	//
}

void
JobUpdateObject::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *changed_at_msKey = "changed_at_ms";
	node = json_object_get_member(pJsonObject, changed_at_msKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&changed_at_ms, node, "long long", "");
		} else {
			
		}
	}
	const gchar *job_idKey = "job_id";
	node = json_object_get_member(pJsonObject, job_idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&job_id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *job_stateKey = "job_state";
	node = json_object_get_member(pJsonObject, job_stateKey);
	if (node !=NULL) {
	

		if (isprimitive("JobStatus")) {
			jsonToValue(&job_state, node, "JobStatus", "JobStatus");
		} else {
			
			JobStatus* obj = static_cast<JobStatus*> (&job_state);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *prev_job_stateKey = "prev_job_state";
	node = json_object_get_member(pJsonObject, prev_job_stateKey);
	if (node !=NULL) {
	

		if (isprimitive("PrevJobStatus")) {
			jsonToValue(&prev_job_state, node, "PrevJobStatus", "PrevJobStatus");
		} else {
			
			PrevJobStatus* obj = static_cast<PrevJobStatus*> (&prev_job_state);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *routeKey = "route";
	node = json_object_get_member(pJsonObject, routeKey);
	if (node !=NULL) {
	

		if (isprimitive("DispatchRoute")) {
			jsonToValue(&route, node, "DispatchRoute", "DispatchRoute");
		} else {
			
			DispatchRoute* obj = static_cast<DispatchRoute*> (&route);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *route_idKey = "route_id";
	node = json_object_get_member(pJsonObject, route_idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&route_id, node, "long long", "");
		} else {
			
		}
	}
}

JobUpdateObject::JobUpdateObject(char* json)
{
	this->fromJson(json);
}

char*
JobUpdateObject::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getChangedAtMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *changed_at_msKey = "changed_at_ms";
	json_object_set_member(pJsonObject, changed_at_msKey, node);
	if (isprimitive("long long")) {
		long long obj = getJobId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *job_idKey = "job_id";
	json_object_set_member(pJsonObject, job_idKey, node);
	if (isprimitive("JobStatus")) {
		JobStatus obj = getJobState();
		node = converttoJson(&obj, "JobStatus", "");
	}
	else {
		
		JobStatus obj = static_cast<JobStatus> (getJobState());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *job_stateKey = "job_state";
	json_object_set_member(pJsonObject, job_stateKey, node);
	if (isprimitive("PrevJobStatus")) {
		PrevJobStatus obj = getPrevJobState();
		node = converttoJson(&obj, "PrevJobStatus", "");
	}
	else {
		
		PrevJobStatus obj = static_cast<PrevJobStatus> (getPrevJobState());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *prev_job_stateKey = "prev_job_state";
	json_object_set_member(pJsonObject, prev_job_stateKey, node);
	if (isprimitive("DispatchRoute")) {
		DispatchRoute obj = getRoute();
		node = converttoJson(&obj, "DispatchRoute", "");
	}
	else {
		
		DispatchRoute obj = static_cast<DispatchRoute> (getRoute());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *routeKey = "route";
	json_object_set_member(pJsonObject, routeKey, node);
	if (isprimitive("long long")) {
		long long obj = getRouteId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *route_idKey = "route_id";
	json_object_set_member(pJsonObject, route_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
JobUpdateObject::getChangedAtMs()
{
	return changed_at_ms;
}

void
JobUpdateObject::setChangedAtMs(long long  changed_at_ms)
{
	this->changed_at_ms = changed_at_ms;
}

long long
JobUpdateObject::getJobId()
{
	return job_id;
}

void
JobUpdateObject::setJobId(long long  job_id)
{
	this->job_id = job_id;
}

JobStatus
JobUpdateObject::getJobState()
{
	return job_state;
}

void
JobUpdateObject::setJobState(JobStatus  job_state)
{
	this->job_state = job_state;
}

PrevJobStatus
JobUpdateObject::getPrevJobState()
{
	return prev_job_state;
}

void
JobUpdateObject::setPrevJobState(PrevJobStatus  prev_job_state)
{
	this->prev_job_state = prev_job_state;
}

DispatchRoute
JobUpdateObject::getRoute()
{
	return route;
}

void
JobUpdateObject::setRoute(DispatchRoute  route)
{
	this->route = route;
}

long long
JobUpdateObject::getRouteId()
{
	return route_id;
}

void
JobUpdateObject::setRouteId(long long  route_id)
{
	this->route_id = route_id;
}


