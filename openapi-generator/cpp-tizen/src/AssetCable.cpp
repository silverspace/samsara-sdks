#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Asset_cable.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Asset_cable::Asset_cable()
{
	//__init();
}

Asset_cable::~Asset_cable()
{
	//__cleanup();
}

void
Asset_cable::__init()
{
	//assetType = std::string();
}

void
Asset_cable::__cleanup()
{
	//if(assetType != NULL) {
	//
	//delete assetType;
	//assetType = NULL;
	//}
	//
}

void
Asset_cable::fromJson(char* jsonStr)
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
}

Asset_cable::Asset_cable(char* json)
{
	this->fromJson(json);
}

char*
Asset_cable::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Asset_cable::getAssetType()
{
	return assetType;
}

void
Asset_cable::setAssetType(std::string  assetType)
{
	this->assetType = assetType;
}


