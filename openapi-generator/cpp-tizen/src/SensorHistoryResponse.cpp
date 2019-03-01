#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SensorHistoryResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SensorHistoryResponse::SensorHistoryResponse()
{
	//__init();
}

SensorHistoryResponse::~SensorHistoryResponse()
{
	//__cleanup();
}

void
SensorHistoryResponse::__init()
{
	//new std::list()std::list> results;
}

void
SensorHistoryResponse::__cleanup()
{
	//if(results != NULL) {
	//results.RemoveAll(true);
	//delete results;
	//results = NULL;
	//}
	//
}

void
SensorHistoryResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *resultsKey = "results";
	node = json_object_get_member(pJsonObject, resultsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<SensorHistoryResponse_results> new_list;
			SensorHistoryResponse_results inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("SensorHistoryResponse_results")) {
					jsonToValue(&inst, temp_json, "SensorHistoryResponse_results", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			results = new_list;
		}
		
	}
}

SensorHistoryResponse::SensorHistoryResponse(char* json)
{
	this->fromJson(json);
}

char*
SensorHistoryResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("SensorHistoryResponse_results")) {
		list<SensorHistoryResponse_results> new_list = static_cast<list <SensorHistoryResponse_results> > (getResults());
		node = converttoJson(&new_list, "SensorHistoryResponse_results", "array");
	} else {
		node = json_node_alloc();
		list<SensorHistoryResponse_results> new_list = static_cast<list <SensorHistoryResponse_results> > (getResults());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<SensorHistoryResponse_results>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			SensorHistoryResponse_results obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *resultsKey = "results";
	json_object_set_member(pJsonObject, resultsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<SensorHistoryResponse_results>
SensorHistoryResponse::getResults()
{
	return results;
}

void
SensorHistoryResponse::setResults(std::list <SensorHistoryResponse_results> results)
{
	this->results = results;
}


