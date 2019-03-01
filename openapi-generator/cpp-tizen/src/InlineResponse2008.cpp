#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_response_200_8.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_response_200_8::Inline_response_200_8()
{
	//__init();
}

Inline_response_200_8::~Inline_response_200_8()
{
	//__cleanup();
}

void
Inline_response_200_8::__init()
{
	//new std::list()std::list> sensors;
}

void
Inline_response_200_8::__cleanup()
{
	//if(sensors != NULL) {
	//sensors.RemoveAll(true);
	//delete sensors;
	//sensors = NULL;
	//}
	//
}

void
Inline_response_200_8::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *sensorsKey = "sensors";
	node = json_object_get_member(pJsonObject, sensorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Sensor> new_list;
			Sensor inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Sensor")) {
					jsonToValue(&inst, temp_json, "Sensor", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			sensors = new_list;
		}
		
	}
}

Inline_response_200_8::Inline_response_200_8(char* json)
{
	this->fromJson(json);
}

char*
Inline_response_200_8::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Sensor")) {
		list<Sensor> new_list = static_cast<list <Sensor> > (getSensors());
		node = converttoJson(&new_list, "Sensor", "array");
	} else {
		node = json_node_alloc();
		list<Sensor> new_list = static_cast<list <Sensor> > (getSensors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Sensor>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Sensor obj = *it;
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

std::list<Sensor>
Inline_response_200_8::getSensors()
{
	return sensors;
}

void
Inline_response_200_8::setSensors(std::list <Sensor> sensors)
{
	this->sensors = sensors;
}


