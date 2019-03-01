#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VehicleMaintenance_passenger_checkEngineLight.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VehicleMaintenance_passenger_checkEngineLight::VehicleMaintenance_passenger_checkEngineLight()
{
	//__init();
}

VehicleMaintenance_passenger_checkEngineLight::~VehicleMaintenance_passenger_checkEngineLight()
{
	//__cleanup();
}

void
VehicleMaintenance_passenger_checkEngineLight::__init()
{
	//isOn = bool(false);
}

void
VehicleMaintenance_passenger_checkEngineLight::__cleanup()
{
	//if(isOn != NULL) {
	//
	//delete isOn;
	//isOn = NULL;
	//}
	//
}

void
VehicleMaintenance_passenger_checkEngineLight::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *isOnKey = "isOn";
	node = json_object_get_member(pJsonObject, isOnKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&isOn, node, "bool", "");
		} else {
			
		}
	}
}

VehicleMaintenance_passenger_checkEngineLight::VehicleMaintenance_passenger_checkEngineLight(char* json)
{
	this->fromJson(json);
}

char*
VehicleMaintenance_passenger_checkEngineLight::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getIsOn();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *isOnKey = "isOn";
	json_object_set_member(pJsonObject, isOnKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
VehicleMaintenance_passenger_checkEngineLight::getIsOn()
{
	return isOn;
}

void
VehicleMaintenance_passenger_checkEngineLight::setIsOn(bool  isOn)
{
	this->isOn = isOn;
}


