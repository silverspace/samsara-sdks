#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DispatchRouteHistory.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DispatchRouteHistory::DispatchRouteHistory()
{
	//__init();
}

DispatchRouteHistory::~DispatchRouteHistory()
{
	//__cleanup();
}

void
DispatchRouteHistory::__init()
{
	//new std::list()std::list> history;
}

void
DispatchRouteHistory::__cleanup()
{
	//if(history != NULL) {
	//history.RemoveAll(true);
	//delete history;
	//history = NULL;
	//}
	//
}

void
DispatchRouteHistory::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *historyKey = "history";
	node = json_object_get_member(pJsonObject, historyKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<DispatchRouteHistoricalEntry> new_list;
			DispatchRouteHistoricalEntry inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("DispatchRouteHistoricalEntry")) {
					jsonToValue(&inst, temp_json, "DispatchRouteHistoricalEntry", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			history = new_list;
		}
		
	}
}

DispatchRouteHistory::DispatchRouteHistory(char* json)
{
	this->fromJson(json);
}

char*
DispatchRouteHistory::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("DispatchRouteHistoricalEntry")) {
		list<DispatchRouteHistoricalEntry> new_list = static_cast<list <DispatchRouteHistoricalEntry> > (getHistory());
		node = converttoJson(&new_list, "DispatchRouteHistoricalEntry", "array");
	} else {
		node = json_node_alloc();
		list<DispatchRouteHistoricalEntry> new_list = static_cast<list <DispatchRouteHistoricalEntry> > (getHistory());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<DispatchRouteHistoricalEntry>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			DispatchRouteHistoricalEntry obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *historyKey = "history";
	json_object_set_member(pJsonObject, historyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<DispatchRouteHistoricalEntry>
DispatchRouteHistory::getHistory()
{
	return history;
}

void
DispatchRouteHistory::setHistory(std::list <DispatchRouteHistoricalEntry> history)
{
	this->history = history;
}


