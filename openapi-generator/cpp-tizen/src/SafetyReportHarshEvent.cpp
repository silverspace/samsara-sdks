#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SafetyReportHarshEvent.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SafetyReportHarshEvent::SafetyReportHarshEvent()
{
	//__init();
}

SafetyReportHarshEvent::~SafetyReportHarshEvent()
{
	//__cleanup();
}

void
SafetyReportHarshEvent::__init()
{
	//harshEventType = std::string();
	//timestampMs = int(0);
	//vehicleId = int(0);
}

void
SafetyReportHarshEvent::__cleanup()
{
	//if(harshEventType != NULL) {
	//
	//delete harshEventType;
	//harshEventType = NULL;
	//}
	//if(timestampMs != NULL) {
	//
	//delete timestampMs;
	//timestampMs = NULL;
	//}
	//if(vehicleId != NULL) {
	//
	//delete vehicleId;
	//vehicleId = NULL;
	//}
	//
}

void
SafetyReportHarshEvent::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *harshEventTypeKey = "harshEventType";
	node = json_object_get_member(pJsonObject, harshEventTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&harshEventType, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *timestampMsKey = "timestampMs";
	node = json_object_get_member(pJsonObject, timestampMsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&timestampMs, node, "int", "");
		} else {
			
		}
	}
	const gchar *vehicleIdKey = "vehicleId";
	node = json_object_get_member(pJsonObject, vehicleIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&vehicleId, node, "int", "");
		} else {
			
		}
	}
}

SafetyReportHarshEvent::SafetyReportHarshEvent(char* json)
{
	this->fromJson(json);
}

char*
SafetyReportHarshEvent::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getHarshEventType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *harshEventTypeKey = "harshEventType";
	json_object_set_member(pJsonObject, harshEventTypeKey, node);
	if (isprimitive("int")) {
		int obj = getTimestampMs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *timestampMsKey = "timestampMs";
	json_object_set_member(pJsonObject, timestampMsKey, node);
	if (isprimitive("int")) {
		int obj = getVehicleId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *vehicleIdKey = "vehicleId";
	json_object_set_member(pJsonObject, vehicleIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SafetyReportHarshEvent::getHarshEventType()
{
	return harshEventType;
}

void
SafetyReportHarshEvent::setHarshEventType(std::string  harshEventType)
{
	this->harshEventType = harshEventType;
}

int
SafetyReportHarshEvent::getTimestampMs()
{
	return timestampMs;
}

void
SafetyReportHarshEvent::setTimestampMs(int  timestampMs)
{
	this->timestampMs = timestampMs;
}

int
SafetyReportHarshEvent::getVehicleId()
{
	return vehicleId;
}

void
SafetyReportHarshEvent::setVehicleId(int  vehicleId)
{
	this->vehicleId = vehicleId;
}


