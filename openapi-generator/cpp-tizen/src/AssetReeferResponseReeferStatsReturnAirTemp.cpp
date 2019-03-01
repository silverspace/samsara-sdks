#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssetReeferResponse_reeferStats_returnAirTemp.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssetReeferResponse_reeferStats_returnAirTemp::AssetReeferResponse_reeferStats_returnAirTemp()
{
	//__init();
}

AssetReeferResponse_reeferStats_returnAirTemp::~AssetReeferResponse_reeferStats_returnAirTemp()
{
	//__cleanup();
}

void
AssetReeferResponse_reeferStats_returnAirTemp::__init()
{
	//tempInMilliC = long(0);
	//changedAtMs = long(0);
}

void
AssetReeferResponse_reeferStats_returnAirTemp::__cleanup()
{
	//if(tempInMilliC != NULL) {
	//
	//delete tempInMilliC;
	//tempInMilliC = NULL;
	//}
	//if(changedAtMs != NULL) {
	//
	//delete changedAtMs;
	//changedAtMs = NULL;
	//}
	//
}

void
AssetReeferResponse_reeferStats_returnAirTemp::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *tempInMilliCKey = "tempInMilliC";
	node = json_object_get_member(pJsonObject, tempInMilliCKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&tempInMilliC, node, "long long", "");
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

AssetReeferResponse_reeferStats_returnAirTemp::AssetReeferResponse_reeferStats_returnAirTemp(char* json)
{
	this->fromJson(json);
}

char*
AssetReeferResponse_reeferStats_returnAirTemp::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getTempInMilliC();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *tempInMilliCKey = "tempInMilliC";
	json_object_set_member(pJsonObject, tempInMilliCKey, node);
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
AssetReeferResponse_reeferStats_returnAirTemp::getTempInMilliC()
{
	return tempInMilliC;
}

void
AssetReeferResponse_reeferStats_returnAirTemp::setTempInMilliC(long long  tempInMilliC)
{
	this->tempInMilliC = tempInMilliC;
}

long long
AssetReeferResponse_reeferStats_returnAirTemp::getChangedAtMs()
{
	return changedAtMs;
}

void
AssetReeferResponse_reeferStats_returnAirTemp::setChangedAtMs(long long  changedAtMs)
{
	this->changedAtMs = changedAtMs;
}


