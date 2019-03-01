#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "HumidityResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

HumidityResponse::HumidityResponse()
{
	//__init();
}

HumidityResponse::~HumidityResponse()
{
	//__cleanup();
}

void
HumidityResponse::__init()
{
	//groupId = long(0);
	//new std::list()std::list> sensors;
}

void
HumidityResponse::__cleanup()
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
HumidityResponse::fromJson(char* jsonStr)
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
			list<HumidityResponse_sensors> new_list;
			HumidityResponse_sensors inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("HumidityResponse_sensors")) {
					jsonToValue(&inst, temp_json, "HumidityResponse_sensors", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			sensors = new_list;
		}
		
	}
}

HumidityResponse::HumidityResponse(char* json)
{
	this->fromJson(json);
}

char*
HumidityResponse::toJson()
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
	if (isprimitive("HumidityResponse_sensors")) {
		list<HumidityResponse_sensors> new_list = static_cast<list <HumidityResponse_sensors> > (getSensors());
		node = converttoJson(&new_list, "HumidityResponse_sensors", "array");
	} else {
		node = json_node_alloc();
		list<HumidityResponse_sensors> new_list = static_cast<list <HumidityResponse_sensors> > (getSensors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<HumidityResponse_sensors>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			HumidityResponse_sensors obj = *it;
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
HumidityResponse::getGroupId()
{
	return groupId;
}

void
HumidityResponse::setGroupId(long long  groupId)
{
	this->groupId = groupId;
}

std::list<HumidityResponse_sensors>
HumidityResponse::getSensors()
{
	return sensors;
}

void
HumidityResponse::setSensors(std::list <HumidityResponse_sensors> sensors)
{
	this->sensors = sensors;
}


