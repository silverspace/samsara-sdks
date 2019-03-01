#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_response_200_5_vehicleStats.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_response_200_5_vehicleStats::Inline_response_200_5_vehicleStats()
{
	//__init();
}

Inline_response_200_5_vehicleStats::~Inline_response_200_5_vehicleStats()
{
	//__cleanup();
}

void
Inline_response_200_5_vehicleStats::__init()
{
	//new std::list()std::list> engineState;
	//auxInput2 = new AuxInputSeries();
	//vehicleId = long(0);
	//auxInput1 = new AuxInputSeries();
}

void
Inline_response_200_5_vehicleStats::__cleanup()
{
	//if(engineState != NULL) {
	//engineState.RemoveAll(true);
	//delete engineState;
	//engineState = NULL;
	//}
	//if(auxInput2 != NULL) {
	//
	//delete auxInput2;
	//auxInput2 = NULL;
	//}
	//if(vehicleId != NULL) {
	//
	//delete vehicleId;
	//vehicleId = NULL;
	//}
	//if(auxInput1 != NULL) {
	//
	//delete auxInput1;
	//auxInput1 = NULL;
	//}
	//
}

void
Inline_response_200_5_vehicleStats::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *engineStateKey = "engineState";
	node = json_object_get_member(pJsonObject, engineStateKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EngineState> new_list;
			EngineState inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EngineState")) {
					jsonToValue(&inst, temp_json, "EngineState", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			engineState = new_list;
		}
		
	}
	const gchar *auxInput2Key = "auxInput2";
	node = json_object_get_member(pJsonObject, auxInput2Key);
	if (node !=NULL) {
	

		if (isprimitive("AuxInputSeries")) {
			jsonToValue(&auxInput2, node, "AuxInputSeries", "AuxInputSeries");
		} else {
			
			AuxInputSeries* obj = static_cast<AuxInputSeries*> (&auxInput2);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *vehicleIdKey = "vehicleId";
	node = json_object_get_member(pJsonObject, vehicleIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&vehicleId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *auxInput1Key = "auxInput1";
	node = json_object_get_member(pJsonObject, auxInput1Key);
	if (node !=NULL) {
	

		if (isprimitive("AuxInputSeries")) {
			jsonToValue(&auxInput1, node, "AuxInputSeries", "AuxInputSeries");
		} else {
			
			AuxInputSeries* obj = static_cast<AuxInputSeries*> (&auxInput1);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Inline_response_200_5_vehicleStats::Inline_response_200_5_vehicleStats(char* json)
{
	this->fromJson(json);
}

char*
Inline_response_200_5_vehicleStats::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("EngineState")) {
		list<EngineState> new_list = static_cast<list <EngineState> > (getEngineState());
		node = converttoJson(&new_list, "EngineState", "array");
	} else {
		node = json_node_alloc();
		list<EngineState> new_list = static_cast<list <EngineState> > (getEngineState());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EngineState>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EngineState obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *engineStateKey = "engineState";
	json_object_set_member(pJsonObject, engineStateKey, node);
	if (isprimitive("AuxInputSeries")) {
		AuxInputSeries obj = getAuxInput2();
		node = converttoJson(&obj, "AuxInputSeries", "");
	}
	else {
		
		AuxInputSeries obj = static_cast<AuxInputSeries> (getAuxInput2());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *auxInput2Key = "auxInput2";
	json_object_set_member(pJsonObject, auxInput2Key, node);
	if (isprimitive("long long")) {
		long long obj = getVehicleId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *vehicleIdKey = "vehicleId";
	json_object_set_member(pJsonObject, vehicleIdKey, node);
	if (isprimitive("AuxInputSeries")) {
		AuxInputSeries obj = getAuxInput1();
		node = converttoJson(&obj, "AuxInputSeries", "");
	}
	else {
		
		AuxInputSeries obj = static_cast<AuxInputSeries> (getAuxInput1());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *auxInput1Key = "auxInput1";
	json_object_set_member(pJsonObject, auxInput1Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<EngineState>
Inline_response_200_5_vehicleStats::getEngineState()
{
	return engineState;
}

void
Inline_response_200_5_vehicleStats::setEngineState(std::list <EngineState> engineState)
{
	this->engineState = engineState;
}

AuxInputSeries
Inline_response_200_5_vehicleStats::getAuxInput2()
{
	return auxInput2;
}

void
Inline_response_200_5_vehicleStats::setAuxInput2(AuxInputSeries  auxInput2)
{
	this->auxInput2 = auxInput2;
}

long long
Inline_response_200_5_vehicleStats::getVehicleId()
{
	return vehicleId;
}

void
Inline_response_200_5_vehicleStats::setVehicleId(long long  vehicleId)
{
	this->vehicleId = vehicleId;
}

AuxInputSeries
Inline_response_200_5_vehicleStats::getAuxInput1()
{
	return auxInput1;
}

void
Inline_response_200_5_vehicleStats::setAuxInput1(AuxInputSeries  auxInput1)
{
	this->auxInput1 = auxInput1;
}


