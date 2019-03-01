#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_object_14.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_object_14::Inline_object_14()
{
	//__init();
}

Inline_object_14::~Inline_object_14()
{
	//__cleanup();
}

void
Inline_object_14::__init()
{
	//groupId = long(0);
	//new std::list()std::list> vehicles;
}

void
Inline_object_14::__cleanup()
{
	//if(groupId != NULL) {
	//
	//delete groupId;
	//groupId = NULL;
	//}
	//if(vehicles != NULL) {
	//vehicles.RemoveAll(true);
	//delete vehicles;
	//vehicles = NULL;
	//}
	//
}

void
Inline_object_14::fromJson(char* jsonStr)
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
	const gchar *vehiclesKey = "vehicles";
	node = json_object_get_member(pJsonObject, vehiclesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Vehicle> new_list;
			Vehicle inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Vehicle")) {
					jsonToValue(&inst, temp_json, "Vehicle", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			vehicles = new_list;
		}
		
	}
}

Inline_object_14::Inline_object_14(char* json)
{
	this->fromJson(json);
}

char*
Inline_object_14::toJson()
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
	if (isprimitive("Vehicle")) {
		list<Vehicle> new_list = static_cast<list <Vehicle> > (getVehicles());
		node = converttoJson(&new_list, "Vehicle", "array");
	} else {
		node = json_node_alloc();
		list<Vehicle> new_list = static_cast<list <Vehicle> > (getVehicles());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Vehicle>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Vehicle obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *vehiclesKey = "vehicles";
	json_object_set_member(pJsonObject, vehiclesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
Inline_object_14::getGroupId()
{
	return groupId;
}

void
Inline_object_14::setGroupId(long long  groupId)
{
	this->groupId = groupId;
}

std::list<Vehicle>
Inline_object_14::getVehicles()
{
	return vehicles;
}

void
Inline_object_14::setVehicles(std::list <Vehicle> vehicles)
{
	this->vehicles = vehicles;
}


