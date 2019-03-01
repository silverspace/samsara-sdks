#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssetReeferResponse_reeferStats_engineHours.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssetReeferResponse_reeferStats_engineHours::AssetReeferResponse_reeferStats_engineHours()
{
	//__init();
}

AssetReeferResponse_reeferStats_engineHours::~AssetReeferResponse_reeferStats_engineHours()
{
	//__cleanup();
}

void
AssetReeferResponse_reeferStats_engineHours::__init()
{
	//engineHours = long(0);
	//changedAtMs = long(0);
}

void
AssetReeferResponse_reeferStats_engineHours::__cleanup()
{
	//if(engineHours != NULL) {
	//
	//delete engineHours;
	//engineHours = NULL;
	//}
	//if(changedAtMs != NULL) {
	//
	//delete changedAtMs;
	//changedAtMs = NULL;
	//}
	//
}

void
AssetReeferResponse_reeferStats_engineHours::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *engineHoursKey = "engineHours";
	node = json_object_get_member(pJsonObject, engineHoursKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&engineHours, node, "long long", "");
		} else {
			
		}
	}
	const gchar *changedAtMsKey = "changedAtMs";
	node = json_object_get_member(pJsonObject, changedAtMsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&changedAtMs, node, "long long", "");
		} else {
			
		}
	}
}

AssetReeferResponse_reeferStats_engineHours::AssetReeferResponse_reeferStats_engineHours(char* json)
{
	this->fromJson(json);
}

char*
AssetReeferResponse_reeferStats_engineHours::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getEngineHours();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *engineHoursKey = "engineHours";
	json_object_set_member(pJsonObject, engineHoursKey, node);
	if (isprimitive("long long")) {
		long long obj = getChangedAtMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *changedAtMsKey = "changedAtMs";
	json_object_set_member(pJsonObject, changedAtMsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
AssetReeferResponse_reeferStats_engineHours::getEngineHours()
{
	return engineHours;
}

void
AssetReeferResponse_reeferStats_engineHours::setEngineHours(long long  engineHours)
{
	this->engineHours = engineHours;
}

long long
AssetReeferResponse_reeferStats_engineHours::getChangedAtMs()
{
	return changedAtMs;
}

void
AssetReeferResponse_reeferStats_engineHours::setChangedAtMs(long long  changedAtMs)
{
	this->changedAtMs = changedAtMs;
}


