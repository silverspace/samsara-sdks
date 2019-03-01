#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "HosLogsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

HosLogsResponse::HosLogsResponse()
{
	//__init();
}

HosLogsResponse::~HosLogsResponse()
{
	//__cleanup();
}

void
HosLogsResponse::__init()
{
	//new std::list()std::list> logs;
}

void
HosLogsResponse::__cleanup()
{
	//if(logs != NULL) {
	//logs.RemoveAll(true);
	//delete logs;
	//logs = NULL;
	//}
	//
}

void
HosLogsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *logsKey = "logs";
	node = json_object_get_member(pJsonObject, logsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<HosLogsResponse_logs> new_list;
			HosLogsResponse_logs inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("HosLogsResponse_logs")) {
					jsonToValue(&inst, temp_json, "HosLogsResponse_logs", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			logs = new_list;
		}
		
	}
}

HosLogsResponse::HosLogsResponse(char* json)
{
	this->fromJson(json);
}

char*
HosLogsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("HosLogsResponse_logs")) {
		list<HosLogsResponse_logs> new_list = static_cast<list <HosLogsResponse_logs> > (getLogs());
		node = converttoJson(&new_list, "HosLogsResponse_logs", "array");
	} else {
		node = json_node_alloc();
		list<HosLogsResponse_logs> new_list = static_cast<list <HosLogsResponse_logs> > (getLogs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<HosLogsResponse_logs>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			HosLogsResponse_logs obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *logsKey = "logs";
	json_object_set_member(pJsonObject, logsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<HosLogsResponse_logs>
HosLogsResponse::getLogs()
{
	return logs;
}

void
HosLogsResponse::setLogs(std::list <HosLogsResponse_logs> logs)
{
	this->logs = logs;
}


