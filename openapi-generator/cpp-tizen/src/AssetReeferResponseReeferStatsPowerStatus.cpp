#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssetReeferResponse_reeferStats_powerStatus.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssetReeferResponse_reeferStats_powerStatus::AssetReeferResponse_reeferStats_powerStatus()
{
	//__init();
}

AssetReeferResponse_reeferStats_powerStatus::~AssetReeferResponse_reeferStats_powerStatus()
{
	//__cleanup();
}

void
AssetReeferResponse_reeferStats_powerStatus::__init()
{
	//changedAtMs = long(0);
	//status = std::string();
}

void
AssetReeferResponse_reeferStats_powerStatus::__cleanup()
{
	//if(changedAtMs != NULL) {
	//
	//delete changedAtMs;
	//changedAtMs = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
AssetReeferResponse_reeferStats_powerStatus::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *changedAtMsKey = "changedAtMs";
	node = json_object_get_member(pJsonObject, changedAtMsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&changedAtMs, node, "long long", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
}

AssetReeferResponse_reeferStats_powerStatus::AssetReeferResponse_reeferStats_powerStatus(char* json)
{
	this->fromJson(json);
}

char*
AssetReeferResponse_reeferStats_powerStatus::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getChangedAtMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *changedAtMsKey = "changedAtMs";
	json_object_set_member(pJsonObject, changedAtMsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
AssetReeferResponse_reeferStats_powerStatus::getChangedAtMs()
{
	return changedAtMs;
}

void
AssetReeferResponse_reeferStats_powerStatus::setChangedAtMs(long long  changedAtMs)
{
	this->changedAtMs = changedAtMs;
}

std::string
AssetReeferResponse_reeferStats_powerStatus::getStatus()
{
	return status;
}

void
AssetReeferResponse_reeferStats_powerStatus::setStatus(std::string  status)
{
	this->status = status;
}


