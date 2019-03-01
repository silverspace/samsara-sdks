#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DispatchRouteBase.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DispatchRouteBase::DispatchRouteBase()
{
	//__init();
}

DispatchRouteBase::~DispatchRouteBase()
{
	//__cleanup();
}

void
DispatchRouteBase::__init()
{
	//actual_end_ms = long(0);
	//actual_start_ms = long(0);
	//driver_id = long(0);
	//group_id = long(0);
	//name = std::string();
	//scheduled_end_ms = long(0);
	//scheduled_meters = long(0);
	//scheduled_start_ms = long(0);
	//start_location_address = std::string();
	//start_location_address_id = long(0);
	//start_location_lat = double(0);
	//start_location_lng = double(0);
	//start_location_name = std::string();
	//trailer_id = long(0);
	//vehicle_id = long(0);
}

void
DispatchRouteBase::__cleanup()
{
	//if(actual_end_ms != NULL) {
	//
	//delete actual_end_ms;
	//actual_end_ms = NULL;
	//}
	//if(actual_start_ms != NULL) {
	//
	//delete actual_start_ms;
	//actual_start_ms = NULL;
	//}
	//if(driver_id != NULL) {
	//
	//delete driver_id;
	//driver_id = NULL;
	//}
	//if(group_id != NULL) {
	//
	//delete group_id;
	//group_id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(scheduled_end_ms != NULL) {
	//
	//delete scheduled_end_ms;
	//scheduled_end_ms = NULL;
	//}
	//if(scheduled_meters != NULL) {
	//
	//delete scheduled_meters;
	//scheduled_meters = NULL;
	//}
	//if(scheduled_start_ms != NULL) {
	//
	//delete scheduled_start_ms;
	//scheduled_start_ms = NULL;
	//}
	//if(start_location_address != NULL) {
	//
	//delete start_location_address;
	//start_location_address = NULL;
	//}
	//if(start_location_address_id != NULL) {
	//
	//delete start_location_address_id;
	//start_location_address_id = NULL;
	//}
	//if(start_location_lat != NULL) {
	//
	//delete start_location_lat;
	//start_location_lat = NULL;
	//}
	//if(start_location_lng != NULL) {
	//
	//delete start_location_lng;
	//start_location_lng = NULL;
	//}
	//if(start_location_name != NULL) {
	//
	//delete start_location_name;
	//start_location_name = NULL;
	//}
	//if(trailer_id != NULL) {
	//
	//delete trailer_id;
	//trailer_id = NULL;
	//}
	//if(vehicle_id != NULL) {
	//
	//delete vehicle_id;
	//vehicle_id = NULL;
	//}
	//
}

void
DispatchRouteBase::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *actual_end_msKey = "actual_end_ms";
	node = json_object_get_member(pJsonObject, actual_end_msKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&actual_end_ms, node, "long long", "");
		} else {
			
		}
	}
	const gchar *actual_start_msKey = "actual_start_ms";
	node = json_object_get_member(pJsonObject, actual_start_msKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&actual_start_ms, node, "long long", "");
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
	const gchar *group_idKey = "group_id";
	node = json_object_get_member(pJsonObject, group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&group_id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *scheduled_end_msKey = "scheduled_end_ms";
	node = json_object_get_member(pJsonObject, scheduled_end_msKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&scheduled_end_ms, node, "long long", "");
		} else {
			
		}
	}
	const gchar *scheduled_metersKey = "scheduled_meters";
	node = json_object_get_member(pJsonObject, scheduled_metersKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&scheduled_meters, node, "long long", "");
		} else {
			
		}
	}
	const gchar *scheduled_start_msKey = "scheduled_start_ms";
	node = json_object_get_member(pJsonObject, scheduled_start_msKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&scheduled_start_ms, node, "long long", "");
		} else {
			
		}
	}
	const gchar *start_location_addressKey = "start_location_address";
	node = json_object_get_member(pJsonObject, start_location_addressKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&start_location_address, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *start_location_address_idKey = "start_location_address_id";
	node = json_object_get_member(pJsonObject, start_location_address_idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&start_location_address_id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *start_location_latKey = "start_location_lat";
	node = json_object_get_member(pJsonObject, start_location_latKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&start_location_lat, node, "double", "");
		} else {
			
		}
	}
	const gchar *start_location_lngKey = "start_location_lng";
	node = json_object_get_member(pJsonObject, start_location_lngKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&start_location_lng, node, "double", "");
		} else {
			
		}
	}
	const gchar *start_location_nameKey = "start_location_name";
	node = json_object_get_member(pJsonObject, start_location_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&start_location_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *trailer_idKey = "trailer_id";
	node = json_object_get_member(pJsonObject, trailer_idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&trailer_id, node, "long long", "");
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

DispatchRouteBase::DispatchRouteBase(char* json)
{
	this->fromJson(json);
}

char*
DispatchRouteBase::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getActualEndMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *actual_end_msKey = "actual_end_ms";
	json_object_set_member(pJsonObject, actual_end_msKey, node);
	if (isprimitive("long long")) {
		long long obj = getActualStartMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *actual_start_msKey = "actual_start_ms";
	json_object_set_member(pJsonObject, actual_start_msKey, node);
	if (isprimitive("long long")) {
		long long obj = getDriverId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *driver_idKey = "driver_id";
	json_object_set_member(pJsonObject, driver_idKey, node);
	if (isprimitive("long long")) {
		long long obj = getGroupId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *group_idKey = "group_id";
	json_object_set_member(pJsonObject, group_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getScheduledEndMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *scheduled_end_msKey = "scheduled_end_ms";
	json_object_set_member(pJsonObject, scheduled_end_msKey, node);
	if (isprimitive("long long")) {
		long long obj = getScheduledMeters();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *scheduled_metersKey = "scheduled_meters";
	json_object_set_member(pJsonObject, scheduled_metersKey, node);
	if (isprimitive("long long")) {
		long long obj = getScheduledStartMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *scheduled_start_msKey = "scheduled_start_ms";
	json_object_set_member(pJsonObject, scheduled_start_msKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStartLocationAddress();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *start_location_addressKey = "start_location_address";
	json_object_set_member(pJsonObject, start_location_addressKey, node);
	if (isprimitive("long long")) {
		long long obj = getStartLocationAddressId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *start_location_address_idKey = "start_location_address_id";
	json_object_set_member(pJsonObject, start_location_address_idKey, node);
	if (isprimitive("double")) {
		double obj = getStartLocationLat();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *start_location_latKey = "start_location_lat";
	json_object_set_member(pJsonObject, start_location_latKey, node);
	if (isprimitive("double")) {
		double obj = getStartLocationLng();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *start_location_lngKey = "start_location_lng";
	json_object_set_member(pJsonObject, start_location_lngKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStartLocationName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *start_location_nameKey = "start_location_name";
	json_object_set_member(pJsonObject, start_location_nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getTrailerId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *trailer_idKey = "trailer_id";
	json_object_set_member(pJsonObject, trailer_idKey, node);
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

long long
DispatchRouteBase::getActualEndMs()
{
	return actual_end_ms;
}

void
DispatchRouteBase::setActualEndMs(long long  actual_end_ms)
{
	this->actual_end_ms = actual_end_ms;
}

long long
DispatchRouteBase::getActualStartMs()
{
	return actual_start_ms;
}

void
DispatchRouteBase::setActualStartMs(long long  actual_start_ms)
{
	this->actual_start_ms = actual_start_ms;
}

long long
DispatchRouteBase::getDriverId()
{
	return driver_id;
}

void
DispatchRouteBase::setDriverId(long long  driver_id)
{
	this->driver_id = driver_id;
}

long long
DispatchRouteBase::getGroupId()
{
	return group_id;
}

void
DispatchRouteBase::setGroupId(long long  group_id)
{
	this->group_id = group_id;
}

std::string
DispatchRouteBase::getName()
{
	return name;
}

void
DispatchRouteBase::setName(std::string  name)
{
	this->name = name;
}

long long
DispatchRouteBase::getScheduledEndMs()
{
	return scheduled_end_ms;
}

void
DispatchRouteBase::setScheduledEndMs(long long  scheduled_end_ms)
{
	this->scheduled_end_ms = scheduled_end_ms;
}

long long
DispatchRouteBase::getScheduledMeters()
{
	return scheduled_meters;
}

void
DispatchRouteBase::setScheduledMeters(long long  scheduled_meters)
{
	this->scheduled_meters = scheduled_meters;
}

long long
DispatchRouteBase::getScheduledStartMs()
{
	return scheduled_start_ms;
}

void
DispatchRouteBase::setScheduledStartMs(long long  scheduled_start_ms)
{
	this->scheduled_start_ms = scheduled_start_ms;
}

std::string
DispatchRouteBase::getStartLocationAddress()
{
	return start_location_address;
}

void
DispatchRouteBase::setStartLocationAddress(std::string  start_location_address)
{
	this->start_location_address = start_location_address;
}

long long
DispatchRouteBase::getStartLocationAddressId()
{
	return start_location_address_id;
}

void
DispatchRouteBase::setStartLocationAddressId(long long  start_location_address_id)
{
	this->start_location_address_id = start_location_address_id;
}

double
DispatchRouteBase::getStartLocationLat()
{
	return start_location_lat;
}

void
DispatchRouteBase::setStartLocationLat(double  start_location_lat)
{
	this->start_location_lat = start_location_lat;
}

double
DispatchRouteBase::getStartLocationLng()
{
	return start_location_lng;
}

void
DispatchRouteBase::setStartLocationLng(double  start_location_lng)
{
	this->start_location_lng = start_location_lng;
}

std::string
DispatchRouteBase::getStartLocationName()
{
	return start_location_name;
}

void
DispatchRouteBase::setStartLocationName(std::string  start_location_name)
{
	this->start_location_name = start_location_name;
}

long long
DispatchRouteBase::getTrailerId()
{
	return trailer_id;
}

void
DispatchRouteBase::setTrailerId(long long  trailer_id)
{
	this->trailer_id = trailer_id;
}

long long
DispatchRouteBase::getVehicleId()
{
	return vehicle_id;
}

void
DispatchRouteBase::setVehicleId(long long  vehicle_id)
{
	this->vehicle_id = vehicle_id;
}


