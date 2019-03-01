#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DispatchJobCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DispatchJobCreate::DispatchJobCreate()
{
	//__init();
}

DispatchJobCreate::~DispatchJobCreate()
{
	//__cleanup();
}

void
DispatchJobCreate::__init()
{
	//destination_address = std::string();
	//destination_address_id = long(0);
	//destination_lat = double(0);
	//destination_lng = double(0);
	//destination_name = std::string();
	//notes = std::string();
	//scheduled_arrival_time_ms = long(0);
	//scheduled_departure_time_ms = long(0);
}

void
DispatchJobCreate::__cleanup()
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
	//
}

void
DispatchJobCreate::fromJson(char* jsonStr)
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
}

DispatchJobCreate::DispatchJobCreate(char* json)
{
	this->fromJson(json);
}

char*
DispatchJobCreate::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
DispatchJobCreate::getDestinationAddress()
{
	return destination_address;
}

void
DispatchJobCreate::setDestinationAddress(std::string  destination_address)
{
	this->destination_address = destination_address;
}

long long
DispatchJobCreate::getDestinationAddressId()
{
	return destination_address_id;
}

void
DispatchJobCreate::setDestinationAddressId(long long  destination_address_id)
{
	this->destination_address_id = destination_address_id;
}

double
DispatchJobCreate::getDestinationLat()
{
	return destination_lat;
}

void
DispatchJobCreate::setDestinationLat(double  destination_lat)
{
	this->destination_lat = destination_lat;
}

double
DispatchJobCreate::getDestinationLng()
{
	return destination_lng;
}

void
DispatchJobCreate::setDestinationLng(double  destination_lng)
{
	this->destination_lng = destination_lng;
}

std::string
DispatchJobCreate::getDestinationName()
{
	return destination_name;
}

void
DispatchJobCreate::setDestinationName(std::string  destination_name)
{
	this->destination_name = destination_name;
}

std::string
DispatchJobCreate::getNotes()
{
	return notes;
}

void
DispatchJobCreate::setNotes(std::string  notes)
{
	this->notes = notes;
}

long long
DispatchJobCreate::getScheduledArrivalTimeMs()
{
	return scheduled_arrival_time_ms;
}

void
DispatchJobCreate::setScheduledArrivalTimeMs(long long  scheduled_arrival_time_ms)
{
	this->scheduled_arrival_time_ms = scheduled_arrival_time_ms;
}

long long
DispatchJobCreate::getScheduledDepartureTimeMs()
{
	return scheduled_departure_time_ms;
}

void
DispatchJobCreate::setScheduledDepartureTimeMs(long long  scheduled_departure_time_ms)
{
	this->scheduled_departure_time_ms = scheduled_departure_time_ms;
}


