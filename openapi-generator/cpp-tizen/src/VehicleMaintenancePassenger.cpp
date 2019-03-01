#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VehicleMaintenance_passenger.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VehicleMaintenance_passenger::VehicleMaintenance_passenger()
{
	//__init();
}

VehicleMaintenance_passenger::~VehicleMaintenance_passenger()
{
	//__cleanup();
}

void
VehicleMaintenance_passenger::__init()
{
	//checkEngineLight = new VehicleMaintenance_passenger_checkEngineLight();
	//new std::list()std::list> diagnosticTroubleCodes;
}

void
VehicleMaintenance_passenger::__cleanup()
{
	//if(checkEngineLight != NULL) {
	//
	//delete checkEngineLight;
	//checkEngineLight = NULL;
	//}
	//if(diagnosticTroubleCodes != NULL) {
	//diagnosticTroubleCodes.RemoveAll(true);
	//delete diagnosticTroubleCodes;
	//diagnosticTroubleCodes = NULL;
	//}
	//
}

void
VehicleMaintenance_passenger::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *checkEngineLightKey = "checkEngineLight";
	node = json_object_get_member(pJsonObject, checkEngineLightKey);
	if (node !=NULL) {
	

		if (isprimitive("VehicleMaintenance_passenger_checkEngineLight")) {
			jsonToValue(&checkEngineLight, node, "VehicleMaintenance_passenger_checkEngineLight", "VehicleMaintenance_passenger_checkEngineLight");
		} else {
			
			VehicleMaintenance_passenger_checkEngineLight* obj = static_cast<VehicleMaintenance_passenger_checkEngineLight*> (&checkEngineLight);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *diagnosticTroubleCodesKey = "diagnosticTroubleCodes";
	node = json_object_get_member(pJsonObject, diagnosticTroubleCodesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<VehicleMaintenance_passenger_diagnosticTroubleCodes> new_list;
			VehicleMaintenance_passenger_diagnosticTroubleCodes inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("VehicleMaintenance_passenger_diagnosticTroubleCodes")) {
					jsonToValue(&inst, temp_json, "VehicleMaintenance_passenger_diagnosticTroubleCodes", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			diagnosticTroubleCodes = new_list;
		}
		
	}
}

VehicleMaintenance_passenger::VehicleMaintenance_passenger(char* json)
{
	this->fromJson(json);
}

char*
VehicleMaintenance_passenger::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("VehicleMaintenance_passenger_checkEngineLight")) {
		VehicleMaintenance_passenger_checkEngineLight obj = getCheckEngineLight();
		node = converttoJson(&obj, "VehicleMaintenance_passenger_checkEngineLight", "");
	}
	else {
		
		VehicleMaintenance_passenger_checkEngineLight obj = static_cast<VehicleMaintenance_passenger_checkEngineLight> (getCheckEngineLight());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *checkEngineLightKey = "checkEngineLight";
	json_object_set_member(pJsonObject, checkEngineLightKey, node);
	if (isprimitive("VehicleMaintenance_passenger_diagnosticTroubleCodes")) {
		list<VehicleMaintenance_passenger_diagnosticTroubleCodes> new_list = static_cast<list <VehicleMaintenance_passenger_diagnosticTroubleCodes> > (getDiagnosticTroubleCodes());
		node = converttoJson(&new_list, "VehicleMaintenance_passenger_diagnosticTroubleCodes", "array");
	} else {
		node = json_node_alloc();
		list<VehicleMaintenance_passenger_diagnosticTroubleCodes> new_list = static_cast<list <VehicleMaintenance_passenger_diagnosticTroubleCodes> > (getDiagnosticTroubleCodes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<VehicleMaintenance_passenger_diagnosticTroubleCodes>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			VehicleMaintenance_passenger_diagnosticTroubleCodes obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *diagnosticTroubleCodesKey = "diagnosticTroubleCodes";
	json_object_set_member(pJsonObject, diagnosticTroubleCodesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

VehicleMaintenance_passenger_checkEngineLight
VehicleMaintenance_passenger::getCheckEngineLight()
{
	return checkEngineLight;
}

void
VehicleMaintenance_passenger::setCheckEngineLight(VehicleMaintenance_passenger_checkEngineLight  checkEngineLight)
{
	this->checkEngineLight = checkEngineLight;
}

std::list<VehicleMaintenance_passenger_diagnosticTroubleCodes>
VehicleMaintenance_passenger::getDiagnosticTroubleCodes()
{
	return diagnosticTroubleCodes;
}

void
VehicleMaintenance_passenger::setDiagnosticTroubleCodes(std::list <VehicleMaintenance_passenger_diagnosticTroubleCodes> diagnosticTroubleCodes)
{
	this->diagnosticTroubleCodes = diagnosticTroubleCodes;
}


