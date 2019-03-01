#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DriversResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DriversResponse::DriversResponse()
{
	//__init();
}

DriversResponse::~DriversResponse()
{
	//__cleanup();
}

void
DriversResponse::__init()
{
	//new std::list()std::list> drivers;
}

void
DriversResponse::__cleanup()
{
	//if(drivers != NULL) {
	//drivers.RemoveAll(true);
	//delete drivers;
	//drivers = NULL;
	//}
	//
}

void
DriversResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *driversKey = "drivers";
	node = json_object_get_member(pJsonObject, driversKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Driver> new_list;
			Driver inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Driver")) {
					jsonToValue(&inst, temp_json, "Driver", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			drivers = new_list;
		}
		
	}
}

DriversResponse::DriversResponse(char* json)
{
	this->fromJson(json);
}

char*
DriversResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Driver")) {
		list<Driver> new_list = static_cast<list <Driver> > (getDrivers());
		node = converttoJson(&new_list, "Driver", "array");
	} else {
		node = json_node_alloc();
		list<Driver> new_list = static_cast<list <Driver> > (getDrivers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Driver>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Driver obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *driversKey = "drivers";
	json_object_set_member(pJsonObject, driversKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<Driver>
DriversResponse::getDrivers()
{
	return drivers;
}

void
DriversResponse::setDrivers(std::list <Driver> drivers)
{
	this->drivers = drivers;
}


