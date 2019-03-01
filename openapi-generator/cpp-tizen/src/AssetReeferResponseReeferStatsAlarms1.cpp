#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssetReeferResponse_reeferStats_alarms_1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssetReeferResponse_reeferStats_alarms_1::AssetReeferResponse_reeferStats_alarms_1()
{
	//__init();
}

AssetReeferResponse_reeferStats_alarms_1::~AssetReeferResponse_reeferStats_alarms_1()
{
	//__cleanup();
}

void
AssetReeferResponse_reeferStats_alarms_1::__init()
{
	//new std::list()std::list> alarms;
	//changedAtMs = long(0);
}

void
AssetReeferResponse_reeferStats_alarms_1::__cleanup()
{
	//if(alarms != NULL) {
	//alarms.RemoveAll(true);
	//delete alarms;
	//alarms = NULL;
	//}
	//if(changedAtMs != NULL) {
	//
	//delete changedAtMs;
	//changedAtMs = NULL;
	//}
	//
}

void
AssetReeferResponse_reeferStats_alarms_1::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *alarmsKey = "alarms";
	node = json_object_get_member(pJsonObject, alarmsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssetReeferResponse_reeferStats_alarms> new_list;
			AssetReeferResponse_reeferStats_alarms inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssetReeferResponse_reeferStats_alarms")) {
					jsonToValue(&inst, temp_json, "AssetReeferResponse_reeferStats_alarms", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			alarms = new_list;
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

AssetReeferResponse_reeferStats_alarms_1::AssetReeferResponse_reeferStats_alarms_1(char* json)
{
	this->fromJson(json);
}

char*
AssetReeferResponse_reeferStats_alarms_1::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AssetReeferResponse_reeferStats_alarms")) {
		list<AssetReeferResponse_reeferStats_alarms> new_list = static_cast<list <AssetReeferResponse_reeferStats_alarms> > (getAlarms());
		node = converttoJson(&new_list, "AssetReeferResponse_reeferStats_alarms", "array");
	} else {
		node = json_node_alloc();
		list<AssetReeferResponse_reeferStats_alarms> new_list = static_cast<list <AssetReeferResponse_reeferStats_alarms> > (getAlarms());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssetReeferResponse_reeferStats_alarms>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssetReeferResponse_reeferStats_alarms obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *alarmsKey = "alarms";
	json_object_set_member(pJsonObject, alarmsKey, node);
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

std::list<AssetReeferResponse_reeferStats_alarms>
AssetReeferResponse_reeferStats_alarms_1::getAlarms()
{
	return alarms;
}

void
AssetReeferResponse_reeferStats_alarms_1::setAlarms(std::list <AssetReeferResponse_reeferStats_alarms> alarms)
{
	this->alarms = alarms;
}

long long
AssetReeferResponse_reeferStats_alarms_1::getChangedAtMs()
{
	return changedAtMs;
}

void
AssetReeferResponse_reeferStats_alarms_1::setChangedAtMs(long long  changedAtMs)
{
	this->changedAtMs = changedAtMs;
}


