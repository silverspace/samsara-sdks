#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VehicleMaintenance_passenger_diagnosticTroubleCodes.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VehicleMaintenance_passenger_diagnosticTroubleCodes::VehicleMaintenance_passenger_diagnosticTroubleCodes()
{
	//__init();
}

VehicleMaintenance_passenger_diagnosticTroubleCodes::~VehicleMaintenance_passenger_diagnosticTroubleCodes()
{
	//__cleanup();
}

void
VehicleMaintenance_passenger_diagnosticTroubleCodes::__init()
{
	//dtcShortCode = std::string();
	//dtcId = int(0);
	//dtcDescription = std::string();
}

void
VehicleMaintenance_passenger_diagnosticTroubleCodes::__cleanup()
{
	//if(dtcShortCode != NULL) {
	//
	//delete dtcShortCode;
	//dtcShortCode = NULL;
	//}
	//if(dtcId != NULL) {
	//
	//delete dtcId;
	//dtcId = NULL;
	//}
	//if(dtcDescription != NULL) {
	//
	//delete dtcDescription;
	//dtcDescription = NULL;
	//}
	//
}

void
VehicleMaintenance_passenger_diagnosticTroubleCodes::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dtcShortCodeKey = "dtcShortCode";
	node = json_object_get_member(pJsonObject, dtcShortCodeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&dtcShortCode, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dtcIdKey = "dtcId";
	node = json_object_get_member(pJsonObject, dtcIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&dtcId, node, "int", "");
		} else {
			
		}
	}
	const gchar *dtcDescriptionKey = "dtcDescription";
	node = json_object_get_member(pJsonObject, dtcDescriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&dtcDescription, node, "std::string", "");
		} else {
			
		}
	}
}

VehicleMaintenance_passenger_diagnosticTroubleCodes::VehicleMaintenance_passenger_diagnosticTroubleCodes(char* json)
{
	this->fromJson(json);
}

char*
VehicleMaintenance_passenger_diagnosticTroubleCodes::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDtcShortCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dtcShortCodeKey = "dtcShortCode";
	json_object_set_member(pJsonObject, dtcShortCodeKey, node);
	if (isprimitive("int")) {
		int obj = getDtcId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *dtcIdKey = "dtcId";
	json_object_set_member(pJsonObject, dtcIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDtcDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dtcDescriptionKey = "dtcDescription";
	json_object_set_member(pJsonObject, dtcDescriptionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
VehicleMaintenance_passenger_diagnosticTroubleCodes::getDtcShortCode()
{
	return dtcShortCode;
}

void
VehicleMaintenance_passenger_diagnosticTroubleCodes::setDtcShortCode(std::string  dtcShortCode)
{
	this->dtcShortCode = dtcShortCode;
}

int
VehicleMaintenance_passenger_diagnosticTroubleCodes::getDtcId()
{
	return dtcId;
}

void
VehicleMaintenance_passenger_diagnosticTroubleCodes::setDtcId(int  dtcId)
{
	this->dtcId = dtcId;
}

std::string
VehicleMaintenance_passenger_diagnosticTroubleCodes::getDtcDescription()
{
	return dtcDescription;
}

void
VehicleMaintenance_passenger_diagnosticTroubleCodes::setDtcDescription(std::string  dtcDescription)
{
	this->dtcDescription = dtcDescription;
}


