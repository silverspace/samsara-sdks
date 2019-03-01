#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DispatchJob.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DispatchJob::DispatchJob()
{
	//__init();
}

DispatchJob::~DispatchJob()
{
	//__cleanup();
}

void
DispatchJob::__init()
{
	//destination_address = std::string();
	//destination_address_id = long(0);
	//destination_lat = double(0);
	//destination_lng = double(0);
	//destination_name = std::string();
	//notes = std::string();
	//scheduled_arrival_time_ms = long(0);
	//scheduled_departure_time_ms = long(0);
	//arrived_at_ms = long(0);
	//completed_at_ms = long(0);
	//dispatch_route_id = long(0);
	//driver_id = long(0);
	//en_route_at_ms = long(0);
	//estimated_arrival_ms = long(0);
	//fleet_viewer_url = std::string();
	//group_id = long(0);
	//id = long(0);
	//job_state = new JobStatus();
	//skipped_at_ms = long(0);
	//vehicle_id = long(0);
}

void
DispatchJob::__cleanup()
{
	//if(destination_address != NULL) {
	//
	//delete destination_address;
	//destination_address = NULL;
	//}
	//if(destination_address_id != NULL) {
	//
	//delete destination_address_id;
	//destination_address_id = NULL;
	//}
	//if(destination_lat != NULL) {
	//
	//delete destination_lat;
	//destination_lat = NULL;
	//}
	//if(destination_lng != NULL) {
	//
	//delete destination_lng;
	//destination_lng = NULL;
	//}
	//if(destination_name != NULL) {
	//
	//delete destination_name;
	//destination_name = NULL;
	//}
	//if(notes != NULL) {
	//
	//delete notes;
	//notes = NULL;
	//}
	//if(scheduled_arrival_time_ms != NULL) {
	//
	//delete scheduled_arrival_time_ms;
	//scheduled_arrival_time_ms = NULL;
	//}
	//if(scheduled_departure_time_ms != NULL) {
	//
	//delete scheduled_departure_time_ms;
	//scheduled_departure_time_ms = NULL;
	//}
	//if(arrived_at_ms != NULL) {
	//
	//delete arrived_at_ms;
	//arrived_at_ms = NULL;
	//}
	//if(completed_at_ms != NULL) {
	//
	//delete completed_at_ms;
	//completed_at_ms = NULL;
	//}
	//if(dispatch_route_id != NULL) {
	//
	//delete dispatch_route_id;
	//dispatch_route_id = NULL;
	//}
	//if(driver_id != NULL) {
	//
	//delete driver_id;
	//driver_id = NULL;
	//}
	//if(en_route_at_ms != NULL) {
	//
	//delete en_route_at_ms;
	//en_route_at_ms = NULL;
	//}
	//if(estimated_arrival_ms != NULL) {
	//
	//delete estimated_arrival_ms;
	//estimated_arrival_ms = NULL;
	//}
	//if(fleet_viewer_url != NULL) {
	//
	//delete fleet_viewer_url;
	//fleet_viewer_url = NULL;
	//}
	//if(group_id != NULL) {
	//
	//delete group_id;
	//group_id = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(job_state != NULL) {
	//
	//delete job_state;
	//job_state = NULL;
	//}
	//if(skipped_at_ms != NULL) {
	//
	//delete skipped_at_ms;
	//skipped_at_ms = NULL;
	//}
	//if(vehicle_id != NULL) {
	//
	//delete vehicle_id;
	//vehicle_id = NULL;
	//}
	//
}

void
DispatchJob::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *destination_addressKey = "destination_address";
	node = json_object_get_member(pJsonObject, destination_addressKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&destination_address, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *destination_address_idKey = "destination_address_id";
	node = json_object_get_member(pJsonObject, destination_address_idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&destination_address_id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *destination_latKey = "destination_lat";
	node = json_object_get_member(pJsonObject, destination_latKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&destination_lat, node, "double", "");
		} else {
			
		}
	}
	const gchar *destination_lngKey = "destination_lng";
	node = json_object_get_member(pJsonObject, destination_lngKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&destination_lng, node, "double", "");
		} else {
			
		}
	}
	const gchar *destination_nameKey = "destination_name";
	node = json_object_get_member(pJsonObject, destination_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&destination_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *notesKey = "notes";
	node = json_object_get_member(pJsonObject, notesKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&notes, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *scheduled_arrival_time_msKey = "scheduled_arrival_time_ms";
	node = json_object_get_member(pJsonObject, scheduled_arrival_time_msKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&scheduled_arrival_time_ms, node, "long long", "");
		} else {
			
		}
	}
	const gchar *scheduled_departure_time_msKey = "scheduled_departure_time_ms";
	node = json_object_get_member(pJsonObject, scheduled_departure_time_msKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&scheduled_departure_time_ms, node, "long long", "");
		} else {
			
		}
	}
	const gchar *arrived_at_msKey = "arrived_at_ms";
	node = json_object_get_member(pJsonObject, arrived_at_msKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&arrived_at_ms, node, "long long", "");
		} else {
			
		}
	}
	const gchar *completed_at_msKey = "completed_at_ms";
	node = json_object_get_member(pJsonObject, completed_at_msKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&completed_at_ms, node, "long long", "");
		} else {
			
		}
	}
	const gchar *dispatch_route_idKey = "dispatch_route_id";
	node = json_object_get_member(pJsonObject, dispatch_route_idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&dispatch_route_id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *driver_idKey = "driver_id";
	node = json_object_get_member(pJsonObject, driver_idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&driver_id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *en_route_at_msKey = "en_route_at_ms";
	node = json_object_get_member(pJsonObject, en_route_at_msKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&en_route_at_ms, node, "long long", "");
		} else {
			
		}
	}
	const gchar *estimated_arrival_msKey = "estimated_arrival_ms";
	node = json_object_get_member(pJsonObject, estimated_arrival_msKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&estimated_arrival_ms, node, "long long", "");
		} else {
			
		}
	}
	const gchar *fleet_viewer_urlKey = "fleet_viewer_url";
	node = json_object_get_member(pJsonObject, fleet_viewer_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&fleet_viewer_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *group_idKey = "group_id";
	node = json_object_get_member(pJsonObject, group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&group_id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
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
	const gchar *skipped_at_msKey = "skipped_at_ms";
	node = json_object_get_member(pJsonObject, skipped_at_msKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&skipped_at_ms, node, "long long", "");
		} else {
			
		}
	}
	const gchar *vehicle_idKey = "vehicle_id";
	node = json_object_get_member(pJsonObject, vehicle_idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&vehicle_id, node, "long long", "");
		} else {
			
		}
	}
}

DispatchJob::DispatchJob(char* json)
{
	this->fromJson(json);
}

char*
DispatchJob::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDestinationAddress();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *destination_addressKey = "destination_address";
	json_object_set_member(pJsonObject, destination_addressKey, node);
	if (isprimitive("long long")) {
		long long obj = getDestinationAddressId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *destination_address_idKey = "destination_address_id";
	json_object_set_member(pJsonObject, destination_address_idKey, node);
	if (isprimitive("double")) {
		double obj = getDestinationLat();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *destination_latKey = "destination_lat";
	json_object_set_member(pJsonObject, destination_latKey, node);
	if (isprimitive("double")) {
		double obj = getDestinationLng();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *destination_lngKey = "destination_lng";
	json_object_set_member(pJsonObject, destination_lngKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDestinationName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *destination_nameKey = "destination_name";
	json_object_set_member(pJsonObject, destination_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNotes();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *notesKey = "notes";
	json_object_set_member(pJsonObject, notesKey, node);
	if (isprimitive("long long")) {
		long long obj = getScheduledArrivalTimeMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *scheduled_arrival_time_msKey = "scheduled_arrival_time_ms";
	json_object_set_member(pJsonObject, scheduled_arrival_time_msKey, node);
	if (isprimitive("long long")) {
		long long obj = getScheduledDepartureTimeMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *scheduled_departure_time_msKey = "scheduled_departure_time_ms";
	json_object_set_member(pJsonObject, scheduled_departure_time_msKey, node);
	if (isprimitive("long long")) {
		long long obj = getArrivedAtMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *arrived_at_msKey = "arrived_at_ms";
	json_object_set_member(pJsonObject, arrived_at_msKey, node);
	if (isprimitive("long long")) {
		long long obj = getCompletedAtMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *completed_at_msKey = "completed_at_ms";
	json_object_set_member(pJsonObject, completed_at_msKey, node);
	if (isprimitive("long long")) {
		long long obj = getDispatchRouteId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *dispatch_route_idKey = "dispatch_route_id";
	json_object_set_member(pJsonObject, dispatch_route_idKey, node);
	if (isprimitive("long long")) {
		long long obj = getDriverId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *driver_idKey = "driver_id";
	json_object_set_member(pJsonObject, driver_idKey, node);
	if (isprimitive("long long")) {
		long long obj = getEnRouteAtMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *en_route_at_msKey = "en_route_at_ms";
	json_object_set_member(pJsonObject, en_route_at_msKey, node);
	if (isprimitive("long long")) {
		long long obj = getEstimatedArrivalMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *estimated_arrival_msKey = "estimated_arrival_ms";
	json_object_set_member(pJsonObject, estimated_arrival_msKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFleetViewerUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fleet_viewer_urlKey = "fleet_viewer_url";
	json_object_set_member(pJsonObject, fleet_viewer_urlKey, node);
	if (isprimitive("long long")) {
		long long obj = getGroupId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *group_idKey = "group_id";
	json_object_set_member(pJsonObject, group_idKey, node);
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
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
	if (isprimitive("long long")) {
		long long obj = getSkippedAtMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *skipped_at_msKey = "skipped_at_ms";
	json_object_set_member(pJsonObject, skipped_at_msKey, node);
	if (isprimitive("long long")) {
		long long obj = getVehicleId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *vehicle_idKey = "vehicle_id";
	json_object_set_member(pJsonObject, vehicle_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
DispatchJob::getDestinationAddress()
{
	return destination_address;
}

void
DispatchJob::setDestinationAddress(std::string  destination_address)
{
	this->destination_address = destination_address;
}

long long
DispatchJob::getDestinationAddressId()
{
	return destination_address_id;
}

void
DispatchJob::setDestinationAddressId(long long  destination_address_id)
{
	this->destination_address_id = destination_address_id;
}

double
DispatchJob::getDestinationLat()
{
	return destination_lat;
}

void
DispatchJob::setDestinationLat(double  destination_lat)
{
	this->destination_lat = destination_lat;
}

double
DispatchJob::getDestinationLng()
{
	return destination_lng;
}

void
DispatchJob::setDestinationLng(double  destination_lng)
{
	this->destination_lng = destination_lng;
}

std::string
DispatchJob::getDestinationName()
{
	return destination_name;
}

void
DispatchJob::setDestinationName(std::string  destination_name)
{
	this->destination_name = destination_name;
}

std::string
DispatchJob::getNotes()
{
	return notes;
}

void
DispatchJob::setNotes(std::string  notes)
{
	this->notes = notes;
}

long long
DispatchJob::getScheduledArrivalTimeMs()
{
	return scheduled_arrival_time_ms;
}

void
DispatchJob::setScheduledArrivalTimeMs(long long  scheduled_arrival_time_ms)
{
	this->scheduled_arrival_time_ms = scheduled_arrival_time_ms;
}

long long
DispatchJob::getScheduledDepartureTimeMs()
{
	return scheduled_departure_time_ms;
}

void
DispatchJob::setScheduledDepartureTimeMs(long long  scheduled_departure_time_ms)
{
	this->scheduled_departure_time_ms = scheduled_departure_time_ms;
}

long long
DispatchJob::getArrivedAtMs()
{
	return arrived_at_ms;
}

void
DispatchJob::setArrivedAtMs(long long  arrived_at_ms)
{
	this->arrived_at_ms = arrived_at_ms;
}

long long
DispatchJob::getCompletedAtMs()
{
	return completed_at_ms;
}

void
DispatchJob::setCompletedAtMs(long long  completed_at_ms)
{
	this->completed_at_ms = completed_at_ms;
}

long long
DispatchJob::getDispatchRouteId()
{
	return dispatch_route_id;
}

void
DispatchJob::setDispatchRouteId(long long  dispatch_route_id)
{
	this->dispatch_route_id = dispatch_route_id;
}

long long
DispatchJob::getDriverId()
{
	return driver_id;
}

void
DispatchJob::setDriverId(long long  driver_id)
{
	this->driver_id = driver_id;
}

long long
DispatchJob::getEnRouteAtMs()
{
	return en_route_at_ms;
}

void
DispatchJob::setEnRouteAtMs(long long  en_route_at_ms)
{
	this->en_route_at_ms = en_route_at_ms;
}

long long
DispatchJob::getEstimatedArrivalMs()
{
	return estimated_arrival_ms;
}

void
DispatchJob::setEstimatedArrivalMs(long long  estimated_arrival_ms)
{
	this->estimated_arrival_ms = estimated_arrival_ms;
}

std::string
DispatchJob::getFleetViewerUrl()
{
	return fleet_viewer_url;
}

void
DispatchJob::setFleetViewerUrl(std::string  fleet_viewer_url)
{
	this->fleet_viewer_url = fleet_viewer_url;
}

long long
DispatchJob::getGroupId()
{
	return group_id;
}

void
DispatchJob::setGroupId(long long  group_id)
{
	this->group_id = group_id;
}

long long
DispatchJob::getId()
{
	return id;
}

void
DispatchJob::setId(long long  id)
{
	this->id = id;
}

JobStatus
DispatchJob::getJobState()
{
	return job_state;
}

void
DispatchJob::setJobState(JobStatus  job_state)
{
	this->job_state = job_state;
}

long long
DispatchJob::getSkippedAtMs()
{
	return skipped_at_ms;
}

void
DispatchJob::setSkippedAtMs(long long  skipped_at_ms)
{
	this->skipped_at_ms = skipped_at_ms;
}

long long
DispatchJob::getVehicleId()
{
	return vehicle_id;
}

void
DispatchJob::setVehicleId(long long  vehicle_id)
{
	this->vehicle_id = vehicle_id;
}


