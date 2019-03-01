#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssetReeferResponse_reeferStats_fuelPercentage.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssetReeferResponse_reeferStats_fuelPercentage::AssetReeferResponse_reeferStats_fuelPercentage()
{
	//__init();
}

AssetReeferResponse_reeferStats_fuelPercentage::~AssetReeferResponse_reeferStats_fuelPercentage()
{
	//__cleanup();
}

void
AssetReeferResponse_reeferStats_fuelPercentage::__init()
{
	//fuelPercentage = long(0);
	//changedAtMs = long(0);
}

void
AssetReeferResponse_reeferStats_fuelPercentage::__cleanup()
{
	//if(fuelPercentage != NULL) {
	//
	//delete fuelPercentage;
	//fuelPercentage = NULL;
	//}
	//if(changedAtMs != NULL) {
	//
	//delete changedAtMs;
	//changedAtMs = NULL;
	//}
	//
}

void
AssetReeferResponse_reeferStats_fuelPercentage::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fuelPercentageKey = "fuelPercentage";
	node = json_object_get_member(pJsonObject, fuelPercentageKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&fuelPercentage, node, "long long", "");
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

AssetReeferResponse_reeferStats_fuelPercentage::AssetReeferResponse_reeferStats_fuelPercentage(char* json)
{
	this->fromJson(json);
}

char*
AssetReeferResponse_reeferStats_fuelPercentage::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getFuelPercentage();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *fuelPercentageKey = "fuelPercentage";
	json_object_set_member(pJsonObject, fuelPercentageKey, node);
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
AssetReeferResponse_reeferStats_fuelPercentage::getFuelPercentage()
{
	return fuelPercentage;
}

void
AssetReeferResponse_reeferStats_fuelPercentage::setFuelPercentage(long long  fuelPercentage)
{
	this->fuelPercentage = fuelPercentage;
}

long long
AssetReeferResponse_reeferStats_fuelPercentage::getChangedAtMs()
{
	return changedAtMs;
}

void
AssetReeferResponse_reeferStats_fuelPercentage::setChangedAtMs(long long  changedAtMs)
{
	this->changedAtMs = changedAtMs;
}


