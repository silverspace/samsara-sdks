#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TemperatureResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TemperatureResponse::TemperatureResponse()
{
	//__init();
}

TemperatureResponse::~TemperatureResponse()
{
	//__cleanup();
}

void
TemperatureResponse::__init()
{
	//groupId = long(0);
	//new std::list()std::list> sensors;
}

void
TemperatureResponse::__cleanup()
{
	//if(groupId != NULL) {
	//
	//delete groupId;
	//groupId = NULL;
	//}
	//if(sensors != NULL) {
	//sensors.RemoveAll(true);
	//delete sensors;
	//sensors = NULL;
	//}
	//
}

void
TemperatureResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *groupIdKey = "groupId";
	node = json_object_get_member(pJsonObject, groupIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&groupId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *sensorsKey = "sensors";
	node = json_object_get_member(pJsonObject, sensorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TemperatureResponse_sensors> new_list;
			TemperatureResponse_sensors inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TemperatureResponse_sensors")) {
					jsonToValue(&inst, temp_json, "TemperatureResponse_sensors", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			sensors = new_list;
		}
		
	}
}

TemperatureResponse::TemperatureResponse(char* json)
{
	this->fromJson(json);
}

char*
TemperatureResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getGroupId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *groupIdKey = "groupId";
	json_object_set_member(pJsonObject, groupIdKey, node);
	if (isprimitive("TemperatureResponse_sensors")) {
		list<TemperatureResponse_sensors> new_list = static_cast<list <TemperatureResponse_sensors> > (getSensors());
		node = converttoJson(&new_list, "TemperatureResponse_sensors", "array");
	} else {
		node = json_node_alloc();
		list<TemperatureResponse_sensors> new_list = static_cast<list <TemperatureResponse_sensors> > (getSensors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TemperatureResponse_sensors>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TemperatureResponse_sensors obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *sensorsKey = "sensors";
	json_object_set_member(pJsonObject, sensorsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
TemperatureResponse::getGroupId()
{
	return groupId;
}

void
TemperatureResponse::setGroupId(long long  groupId)
{
	this->groupId = groupId;
}

std::list<TemperatureResponse_sensors>
TemperatureResponse::getSensors()
{
	return sensors;
}

void
TemperatureResponse::setSensors(std::list <TemperatureResponse_sensors> sensors)
{
	this->sensors = sensors;
}


