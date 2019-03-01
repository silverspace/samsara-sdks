#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssetReeferResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssetReeferResponse::AssetReeferResponse()
{
	//__init();
}

AssetReeferResponse::~AssetReeferResponse()
{
	//__cleanup();
}

void
AssetReeferResponse::__init()
{
	//assetType = std::string();
	//id = int(0);
	//name = std::string();
	//reeferStats = new AssetReeferResponse_reeferStats();
}

void
AssetReeferResponse::__cleanup()
{
	//if(assetType != NULL) {
	//
	//delete assetType;
	//assetType = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(reeferStats != NULL) {
	//
	//delete reeferStats;
	//reeferStats = NULL;
	//}
	//
}

void
AssetReeferResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *assetTypeKey = "assetType";
	node = json_object_get_member(pJsonObject, assetTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&assetType, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
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
	const gchar *reeferStatsKey = "reeferStats";
	node = json_object_get_member(pJsonObject, reeferStatsKey);
	if (node !=NULL) {
	

		if (isprimitive("AssetReeferResponse_reeferStats")) {
			jsonToValue(&reeferStats, node, "AssetReeferResponse_reeferStats", "AssetReeferResponse_reeferStats");
		} else {
			
			AssetReeferResponse_reeferStats* obj = static_cast<AssetReeferResponse_reeferStats*> (&reeferStats);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AssetReeferResponse::AssetReeferResponse(char* json)
{
	this->fromJson(json);
}

char*
AssetReeferResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAssetType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *assetTypeKey = "assetType";
	json_object_set_member(pJsonObject, assetTypeKey, node);
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("AssetReeferResponse_reeferStats")) {
		AssetReeferResponse_reeferStats obj = getReeferStats();
		node = converttoJson(&obj, "AssetReeferResponse_reeferStats", "");
	}
	else {
		
		AssetReeferResponse_reeferStats obj = static_cast<AssetReeferResponse_reeferStats> (getReeferStats());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reeferStatsKey = "reeferStats";
	json_object_set_member(pJsonObject, reeferStatsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AssetReeferResponse::getAssetType()
{
	return assetType;
}

void
AssetReeferResponse::setAssetType(std::string  assetType)
{
	this->assetType = assetType;
}

int
AssetReeferResponse::getId()
{
	return id;
}

void
AssetReeferResponse::setId(int  id)
{
	this->id = id;
}

std::string
AssetReeferResponse::getName()
{
	return name;
}

void
AssetReeferResponse::setName(std::string  name)
{
	this->name = name;
}

AssetReeferResponse_reeferStats
AssetReeferResponse::getReeferStats()
{
	return reeferStats;
}

void
AssetReeferResponse::setReeferStats(AssetReeferResponse_reeferStats  reeferStats)
{
	this->reeferStats = reeferStats;
}


