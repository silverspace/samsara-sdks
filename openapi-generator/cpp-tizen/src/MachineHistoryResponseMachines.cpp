#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MachineHistoryResponse_machines.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MachineHistoryResponse_machines::MachineHistoryResponse_machines()
{
	//__init();
}

MachineHistoryResponse_machines::~MachineHistoryResponse_machines()
{
	//__cleanup();
}

void
MachineHistoryResponse_machines::__init()
{
	//name = std::string();
	//id = int(0);
	//new std::list()std::list> vibrations;
}

void
MachineHistoryResponse_machines::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(vibrations != NULL) {
	//vibrations.RemoveAll(true);
	//delete vibrations;
	//vibrations = NULL;
	//}
	//
}

void
MachineHistoryResponse_machines::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
		} else {
			
		}
	}
	const gchar *vibrationsKey = "vibrations";
	node = json_object_get_member(pJsonObject, vibrationsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MachineHistoryResponse_vibrations> new_list;
			MachineHistoryResponse_vibrations inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MachineHistoryResponse_vibrations")) {
					jsonToValue(&inst, temp_json, "MachineHistoryResponse_vibrations", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			vibrations = new_list;
		}
		
	}
}

MachineHistoryResponse_machines::MachineHistoryResponse_machines(char* json)
{
	this->fromJson(json);
}

char*
MachineHistoryResponse_machines::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("MachineHistoryResponse_vibrations")) {
		list<MachineHistoryResponse_vibrations> new_list = static_cast<list <MachineHistoryResponse_vibrations> > (getVibrations());
		node = converttoJson(&new_list, "MachineHistoryResponse_vibrations", "array");
	} else {
		node = json_node_alloc();
		list<MachineHistoryResponse_vibrations> new_list = static_cast<list <MachineHistoryResponse_vibrations> > (getVibrations());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MachineHistoryResponse_vibrations>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MachineHistoryResponse_vibrations obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *vibrationsKey = "vibrations";
	json_object_set_member(pJsonObject, vibrationsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MachineHistoryResponse_machines::getName()
{
	return name;
}

void
MachineHistoryResponse_machines::setName(std::string  name)
{
	this->name = name;
}

int
MachineHistoryResponse_machines::getId()
{
	return id;
}

void
MachineHistoryResponse_machines::setId(int  id)
{
	this->id = id;
}

std::list<MachineHistoryResponse_vibrations>
MachineHistoryResponse_machines::getVibrations()
{
	return vibrations;
}

void
MachineHistoryResponse_machines::setVibrations(std::list <MachineHistoryResponse_vibrations> vibrations)
{
	this->vibrations = vibrations;
}


