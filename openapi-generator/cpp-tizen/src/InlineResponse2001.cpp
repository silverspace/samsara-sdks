#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_response_200_1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_response_200_1::Inline_response_200_1()
{
	//__init();
}

Inline_response_200_1::~Inline_response_200_1()
{
	//__cleanup();
}

void
Inline_response_200_1::__init()
{
	//new std::list()std::list> assets;
}

void
Inline_response_200_1::__cleanup()
{
	//if(assets != NULL) {
	//assets.RemoveAll(true);
	//delete assets;
	//assets = NULL;
	//}
	//
}

void
Inline_response_200_1::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *assetsKey = "assets";
	node = json_object_get_member(pJsonObject, assetsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssetCurrentLocationsResponse> new_list;
			AssetCurrentLocationsResponse inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssetCurrentLocationsResponse")) {
					jsonToValue(&inst, temp_json, "AssetCurrentLocationsResponse", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			assets = new_list;
		}
		
	}
}

Inline_response_200_1::Inline_response_200_1(char* json)
{
	this->fromJson(json);
}

char*
Inline_response_200_1::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AssetCurrentLocationsResponse")) {
		list<AssetCurrentLocationsResponse> new_list = static_cast<list <AssetCurrentLocationsResponse> > (getAssets());
		node = converttoJson(&new_list, "AssetCurrentLocationsResponse", "array");
	} else {
		node = json_node_alloc();
		list<AssetCurrentLocationsResponse> new_list = static_cast<list <AssetCurrentLocationsResponse> > (getAssets());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssetCurrentLocationsResponse>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssetCurrentLocationsResponse obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *assetsKey = "assets";
	json_object_set_member(pJsonObject, assetsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<AssetCurrentLocationsResponse>
Inline_response_200_1::getAssets()
{
	return assets;
}

void
Inline_response_200_1::setAssets(std::list <AssetCurrentLocationsResponse> assets)
{
	this->assets = assets;
}


