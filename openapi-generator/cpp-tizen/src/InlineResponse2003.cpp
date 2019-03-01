#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_response_200_3.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_response_200_3::Inline_response_200_3()
{
	//__init();
}

Inline_response_200_3::~Inline_response_200_3()
{
	//__cleanup();
}

void
Inline_response_200_3::__init()
{
	//groupId = long(0);
	//new std::list()std::list> vehicles;
}

void
Inline_response_200_3::__cleanup()
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
Inline_response_200_3::fromJson(char* jsonStr)
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
			list<VehicleLocation> new_list;
			VehicleLocation inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("VehicleLocation")) {
					jsonToValue(&inst, temp_json, "VehicleLocation", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			vehicles = new_list;
		}
		
	}
}

Inline_response_200_3::Inline_response_200_3(char* json)
{
	this->fromJson(json);
}

char*
Inline_response_200_3::toJson()
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
	if (isprimitive("VehicleLocation")) {
		list<VehicleLocation> new_list = static_cast<list <VehicleLocation> > (getVehicles());
		node = converttoJson(&new_list, "VehicleLocation", "array");
	} else {
		node = json_node_alloc();
		list<VehicleLocation> new_list = static_cast<list <VehicleLocation> > (getVehicles());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<VehicleLocation>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			VehicleLocation obj = *it;
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
Inline_response_200_3::getGroupId()
{
	return groupId;
}

void
Inline_response_200_3::setGroupId(long long  groupId)
{
	this->groupId = groupId;
}

std::list<VehicleLocation>
Inline_response_200_3::getVehicles()
{
	return vehicles;
}

void
Inline_response_200_3::setVehicles(std::list <VehicleLocation> vehicles)
{
	this->vehicles = vehicles;
}


