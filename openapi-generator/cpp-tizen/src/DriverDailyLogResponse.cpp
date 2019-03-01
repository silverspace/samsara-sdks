#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DriverDailyLogResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DriverDailyLogResponse::DriverDailyLogResponse()
{
	//__init();
}

DriverDailyLogResponse::~DriverDailyLogResponse()
{
	//__cleanup();
}

void
DriverDailyLogResponse::__init()
{
	//new std::list()std::list> days;
}

void
DriverDailyLogResponse::__cleanup()
{
	//if(days != NULL) {
	//days.RemoveAll(true);
	//delete days;
	//days = NULL;
	//}
	//
}

void
DriverDailyLogResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *daysKey = "days";
	node = json_object_get_member(pJsonObject, daysKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<DriverDailyLogResponse_days> new_list;
			DriverDailyLogResponse_days inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("DriverDailyLogResponse_days")) {
					jsonToValue(&inst, temp_json, "DriverDailyLogResponse_days", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			days = new_list;
		}
		
	}
}

DriverDailyLogResponse::DriverDailyLogResponse(char* json)
{
	this->fromJson(json);
}

char*
DriverDailyLogResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("DriverDailyLogResponse_days")) {
		list<DriverDailyLogResponse_days> new_list = static_cast<list <DriverDailyLogResponse_days> > (getDays());
		node = converttoJson(&new_list, "DriverDailyLogResponse_days", "array");
	} else {
		node = json_node_alloc();
		list<DriverDailyLogResponse_days> new_list = static_cast<list <DriverDailyLogResponse_days> > (getDays());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<DriverDailyLogResponse_days>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			DriverDailyLogResponse_days obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *daysKey = "days";
	json_object_set_member(pJsonObject, daysKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<DriverDailyLogResponse_days>
DriverDailyLogResponse::getDays()
{
	return days;
}

void
DriverDailyLogResponse::setDays(std::list <DriverDailyLogResponse_days> days)
{
	this->days = days;
}


