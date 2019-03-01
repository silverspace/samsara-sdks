#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_object_5.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_object_5::Inline_object_5()
{
	//__init();
}

Inline_object_5::~Inline_object_5()
{
	//__cleanup();
}

void
Inline_object_5::__init()
{
	//endMs = long(0);
	//orgId = long(0);
	//startMs = long(0);
}

void
Inline_object_5::__cleanup()
{
	//if(endMs != NULL) {
	//
	//delete endMs;
	//endMs = NULL;
	//}
	//if(orgId != NULL) {
	//
	//delete orgId;
	//orgId = NULL;
	//}
	//if(startMs != NULL) {
	//
	//delete startMs;
	//startMs = NULL;
	//}
	//
}

void
Inline_object_5::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *endMsKey = "endMs";
	node = json_object_get_member(pJsonObject, endMsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&endMs, node, "long long", "");
		} else {
			
		}
	}
	const gchar *orgIdKey = "orgId";
	node = json_object_get_member(pJsonObject, orgIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&orgId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *startMsKey = "startMs";
	node = json_object_get_member(pJsonObject, startMsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&startMs, node, "long long", "");
		} else {
			
		}
	}
}

Inline_object_5::Inline_object_5(char* json)
{
	this->fromJson(json);
}

char*
Inline_object_5::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getEndMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *endMsKey = "endMs";
	json_object_set_member(pJsonObject, endMsKey, node);
	if (isprimitive("long long")) {
		long long obj = getOrgId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *orgIdKey = "orgId";
	json_object_set_member(pJsonObject, orgIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getStartMs();
		node = converttoJson(&obj, "long long", "");
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
Inline_object_5::getEndMs()
{
	return endMs;
}

void
Inline_object_5::setEndMs(long long  endMs)
{
	this->endMs = endMs;
}

long long
Inline_object_5::getOrgId()
{
	return orgId;
}

void
Inline_object_5::setOrgId(long long  orgId)
{
	this->orgId = orgId;
}

long long
Inline_object_5::getStartMs()
{
	return startMs;
}

void
Inline_object_5::setStartMs(long long  startMs)
{
	this->startMs = startMs;
}


