#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DriversSummaryResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DriversSummaryResponse::DriversSummaryResponse()
{
	//__init();
}

DriversSummaryResponse::~DriversSummaryResponse()
{
	//__cleanup();
}

void
DriversSummaryResponse::__init()
{
	//new std::list()std::list> summaries;
}

void
DriversSummaryResponse::__cleanup()
{
	//if(summaries != NULL) {
	//summaries.RemoveAll(true);
	//delete summaries;
	//summaries = NULL;
	//}
	//
}

void
DriversSummaryResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *summariesKey = "Summaries";
	node = json_object_get_member(pJsonObject, summariesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<DriversSummaryResponse_Summaries> new_list;
			DriversSummaryResponse_Summaries inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("DriversSummaryResponse_Summaries")) {
					jsonToValue(&inst, temp_json, "DriversSummaryResponse_Summaries", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			summaries = new_list;
		}
		
	}
}

DriversSummaryResponse::DriversSummaryResponse(char* json)
{
	this->fromJson(json);
}

char*
DriversSummaryResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("DriversSummaryResponse_Summaries")) {
		list<DriversSummaryResponse_Summaries> new_list = static_cast<list <DriversSummaryResponse_Summaries> > (getSummaries());
		node = converttoJson(&new_list, "DriversSummaryResponse_Summaries", "array");
	} else {
		node = json_node_alloc();
		list<DriversSummaryResponse_Summaries> new_list = static_cast<list <DriversSummaryResponse_Summaries> > (getSummaries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<DriversSummaryResponse_Summaries>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			DriversSummaryResponse_Summaries obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *summariesKey = "Summaries";
	json_object_set_member(pJsonObject, summariesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<DriversSummaryResponse_Summaries>
DriversSummaryResponse::getSummaries()
{
	return summaries;
}

void
DriversSummaryResponse::setSummaries(std::list <DriversSummaryResponse_Summaries> summaries)
{
	this->summaries = summaries;
}


