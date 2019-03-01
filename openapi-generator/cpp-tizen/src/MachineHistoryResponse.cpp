#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MachineHistoryResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MachineHistoryResponse::MachineHistoryResponse()
{
	//__init();
}

MachineHistoryResponse::~MachineHistoryResponse()
{
	//__cleanup();
}

void
MachineHistoryResponse::__init()
{
	//new std::list()std::list> machines;
}

void
MachineHistoryResponse::__cleanup()
{
	//if(machines != NULL) {
	//machines.RemoveAll(true);
	//delete machines;
	//machines = NULL;
	//}
	//
}

void
MachineHistoryResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *machinesKey = "machines";
	node = json_object_get_member(pJsonObject, machinesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MachineHistoryResponse_machines> new_list;
			MachineHistoryResponse_machines inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MachineHistoryResponse_machines")) {
					jsonToValue(&inst, temp_json, "MachineHistoryResponse_machines", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			machines = new_list;
		}
		
	}
}

MachineHistoryResponse::MachineHistoryResponse(char* json)
{
	this->fromJson(json);
}

char*
MachineHistoryResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("MachineHistoryResponse_machines")) {
		list<MachineHistoryResponse_machines> new_list = static_cast<list <MachineHistoryResponse_machines> > (getMachines());
		node = converttoJson(&new_list, "MachineHistoryResponse_machines", "array");
	} else {
		node = json_node_alloc();
		list<MachineHistoryResponse_machines> new_list = static_cast<list <MachineHistoryResponse_machines> > (getMachines());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MachineHistoryResponse_machines>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MachineHistoryResponse_machines obj = *it;
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

std::list<MachineHistoryResponse_machines>
MachineHistoryResponse::getMachines()
{
	return machines;
}

void
MachineHistoryResponse::setMachines(std::list <MachineHistoryResponse_machines> machines)
{
	this->machines = machines;
}


