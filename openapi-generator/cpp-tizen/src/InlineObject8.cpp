#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_object_8.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_object_8::Inline_object_8()
{
	//__init();
}

Inline_object_8::~Inline_object_8()
{
	//__cleanup();
}

void
Inline_object_8::__init()
{
	//driverId = long(0);
	//endMs = int(0);
	//groupId = long(0);
	//startMs = int(0);
}

void
Inline_object_8::__cleanup()
{
	//if(driverId != NULL) {
	//
	//delete driverId;
	//driverId = NULL;
	//}
	//if(endMs != NULL) {
	//
	//delete endMs;
	//endMs = NULL;
	//}
	//if(groupId != NULL) {
	//
	//delete groupId;
	//groupId = NULL;
	//}
	//if(startMs != NULL) {
	//
	//delete startMs;
	//startMs = NULL;
	//}
	//
}

void
Inline_object_8::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *driverIdKey = "driverId";
	node = json_object_get_member(pJsonObject, driverIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&driverId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *endMsKey = "endMs";
	node = json_object_get_member(pJsonObject, endMsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&endMs, node, "int", "");
		} else {
			
		}
	}
	const gchar *groupIdKey = "groupId";
	node = json_object_get_member(pJsonObject, groupIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&groupId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *startMsKey = "startMs";
	node = json_object_get_member(pJsonObject, startMsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&startMs, node, "int", "");
		} else {
			
		}
	}
}

Inline_object_8::Inline_object_8(char* json)
{
	this->fromJson(json);
}

char*
Inline_object_8::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getDriverId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *driverIdKey = "driverId";
	json_object_set_member(pJsonObject, driverIdKey, node);
	if (isprimitive("int")) {
		int obj = getEndMs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *endMsKey = "endMs";
	json_object_set_member(pJsonObject, endMsKey, node);
	if (isprimitive("long long")) {
		long long obj = getGroupId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *groupIdKey = "groupId";
	json_object_set_member(pJsonObject, groupIdKey, node);
	if (isprimitive("int")) {
		int obj = getStartMs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *startMsKey = "startMs";
	json_object_set_member(pJsonObject, startMsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
Inline_object_8::getDriverId()
{
	return driverId;
}

void
Inline_object_8::setDriverId(long long  driverId)
{
	this->driverId = driverId;
}

int
Inline_object_8::getEndMs()
{
	return endMs;
}

void
Inline_object_8::setEndMs(int  endMs)
{
	this->endMs = endMs;
}

long long
Inline_object_8::getGroupId()
{
	return groupId;
}

void
Inline_object_8::setGroupId(long long  groupId)
{
	this->groupId = groupId;
}

int
Inline_object_8::getStartMs()
{
	return startMs;
}

void
Inline_object_8::setStartMs(int  startMs)
{
	this->startMs = startMs;
}


