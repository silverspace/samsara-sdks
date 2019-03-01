#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_response_200_7.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_response_200_7::Inline_response_200_7()
{
	//__init();
}

Inline_response_200_7::~Inline_response_200_7()
{
	//__cleanup();
}

void
Inline_response_200_7::__init()
{
	//new std::list()std::list> machines;
}

void
Inline_response_200_7::__cleanup()
{
	//if(machines != NULL) {
	//machines.RemoveAll(true);
	//delete machines;
	//machines = NULL;
	//}
	//
}

void
Inline_response_200_7::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *machinesKey = "machines";
	node = json_object_get_member(pJsonObject, machinesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Machine> new_list;
			Machine inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Machine")) {
					jsonToValue(&inst, temp_json, "Machine", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			machines = new_list;
		}
		
	}
}

Inline_response_200_7::Inline_response_200_7(char* json)
{
	this->fromJson(json);
}

char*
Inline_response_200_7::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Machine")) {
		list<Machine> new_list = static_cast<list <Machine> > (getMachines());
		node = converttoJson(&new_list, "Machine", "array");
	} else {
		node = json_node_alloc();
		list<Machine> new_list = static_cast<list <Machine> > (getMachines());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Machine>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Machine obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *machinesKey = "machines";
	json_object_set_member(pJsonObject, machinesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<Machine>
Inline_response_200_7::getMachines()
{
	return machines;
}

void
Inline_response_200_7::setMachines(std::list <Machine> machines)
{
	this->machines = machines;
}


