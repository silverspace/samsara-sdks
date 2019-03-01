#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VehicleMaintenance_j1939_checkEngineLight.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VehicleMaintenance_j1939_checkEngineLight::VehicleMaintenance_j1939_checkEngineLight()
{
	//__init();
}

VehicleMaintenance_j1939_checkEngineLight::~VehicleMaintenance_j1939_checkEngineLight()
{
	//__cleanup();
}

void
VehicleMaintenance_j1939_checkEngineLight::__init()
{
	//protectIsOn = bool(false);
	//stopIsOn = bool(false);
	//warningIsOn = bool(false);
	//emissionsIsOn = bool(false);
}

void
VehicleMaintenance_j1939_checkEngineLight::__cleanup()
{
	//if(protectIsOn != NULL) {
	//
	//delete protectIsOn;
	//protectIsOn = NULL;
	//}
	//if(stopIsOn != NULL) {
	//
	//delete stopIsOn;
	//stopIsOn = NULL;
	//}
	//if(warningIsOn != NULL) {
	//
	//delete warningIsOn;
	//warningIsOn = NULL;
	//}
	//if(emissionsIsOn != NULL) {
	//
	//delete emissionsIsOn;
	//emissionsIsOn = NULL;
	//}
	//
}

void
VehicleMaintenance_j1939_checkEngineLight::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *protectIsOnKey = "protectIsOn";
	node = json_object_get_member(pJsonObject, protectIsOnKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&protectIsOn, node, "bool", "");
		} else {
			
		}
	}
	const gchar *stopIsOnKey = "stopIsOn";
	node = json_object_get_member(pJsonObject, stopIsOnKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&stopIsOn, node, "bool", "");
		} else {
			
		}
	}
	const gchar *warningIsOnKey = "warningIsOn";
	node = json_object_get_member(pJsonObject, warningIsOnKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&warningIsOn, node, "bool", "");
		} else {
			
		}
	}
	const gchar *emissionsIsOnKey = "emissionsIsOn";
	node = json_object_get_member(pJsonObject, emissionsIsOnKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&emissionsIsOn, node, "bool", "");
		} else {
			
		}
	}
}

VehicleMaintenance_j1939_checkEngineLight::VehicleMaintenance_j1939_checkEngineLight(char* json)
{
	this->fromJson(json);
}

char*
VehicleMaintenance_j1939_checkEngineLight::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getProtectIsOn();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *protectIsOnKey = "protectIsOn";
	json_object_set_member(pJsonObject, protectIsOnKey, node);
	if (isprimitive("bool")) {
		bool obj = getStopIsOn();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *stopIsOnKey = "stopIsOn";
	json_object_set_member(pJsonObject, stopIsOnKey, node);
	if (isprimitive("bool")) {
		bool obj = getWarningIsOn();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *warningIsOnKey = "warningIsOn";
	json_object_set_member(pJsonObject, warningIsOnKey, node);
	if (isprimitive("bool")) {
		bool obj = getEmissionsIsOn();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *emissionsIsOnKey = "emissionsIsOn";
	json_object_set_member(pJsonObject, emissionsIsOnKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
VehicleMaintenance_j1939_checkEngineLight::getProtectIsOn()
{
	return protectIsOn;
}

void
VehicleMaintenance_j1939_checkEngineLight::setProtectIsOn(bool  protectIsOn)
{
	this->protectIsOn = protectIsOn;
}

bool
VehicleMaintenance_j1939_checkEngineLight::getStopIsOn()
{
	return stopIsOn;
}

void
VehicleMaintenance_j1939_checkEngineLight::setStopIsOn(bool  stopIsOn)
{
	this->stopIsOn = stopIsOn;
}

bool
VehicleMaintenance_j1939_checkEngineLight::getWarningIsOn()
{
	return warningIsOn;
}

void
VehicleMaintenance_j1939_checkEngineLight::setWarningIsOn(bool  warningIsOn)
{
	this->warningIsOn = warningIsOn;
}

bool
VehicleMaintenance_j1939_checkEngineLight::getEmissionsIsOn()
{
	return emissionsIsOn;
}

void
VehicleMaintenance_j1939_checkEngineLight::setEmissionsIsOn(bool  emissionsIsOn)
{
	this->emissionsIsOn = emissionsIsOn;
}


