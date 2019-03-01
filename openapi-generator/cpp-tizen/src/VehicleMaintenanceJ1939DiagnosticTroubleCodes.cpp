#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VehicleMaintenance_j1939_diagnosticTroubleCodes.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VehicleMaintenance_j1939_diagnosticTroubleCodes::VehicleMaintenance_j1939_diagnosticTroubleCodes()
{
	//__init();
}

VehicleMaintenance_j1939_diagnosticTroubleCodes::~VehicleMaintenance_j1939_diagnosticTroubleCodes()
{
	//__cleanup();
}

void
VehicleMaintenance_j1939_diagnosticTroubleCodes::__init()
{
	//spnDescription = std::string();
	//fmiText = std::string();
	//spnId = int(0);
	//occurrenceCount = int(0);
	//txId = int(0);
	//fmiId = int(0);
}

void
VehicleMaintenance_j1939_diagnosticTroubleCodes::__cleanup()
{
	//if(spnDescription != NULL) {
	//
	//delete spnDescription;
	//spnDescription = NULL;
	//}
	//if(fmiText != NULL) {
	//
	//delete fmiText;
	//fmiText = NULL;
	//}
	//if(spnId != NULL) {
	//
	//delete spnId;
	//spnId = NULL;
	//}
	//if(occurrenceCount != NULL) {
	//
	//delete occurrenceCount;
	//occurrenceCount = NULL;
	//}
	//if(txId != NULL) {
	//
	//delete txId;
	//txId = NULL;
	//}
	//if(fmiId != NULL) {
	//
	//delete fmiId;
	//fmiId = NULL;
	//}
	//
}

void
VehicleMaintenance_j1939_diagnosticTroubleCodes::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *spnDescriptionKey = "spnDescription";
	node = json_object_get_member(pJsonObject, spnDescriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&spnDescription, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *fmiTextKey = "fmiText";
	node = json_object_get_member(pJsonObject, fmiTextKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&fmiText, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *spnIdKey = "spnId";
	node = json_object_get_member(pJsonObject, spnIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&spnId, node, "int", "");
		} else {
			
		}
	}
	const gchar *occurrenceCountKey = "occurrenceCount";
	node = json_object_get_member(pJsonObject, occurrenceCountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&occurrenceCount, node, "int", "");
		} else {
			
		}
	}
	const gchar *txIdKey = "txId";
	node = json_object_get_member(pJsonObject, txIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&txId, node, "int", "");
		} else {
			
		}
	}
	const gchar *fmiIdKey = "fmiId";
	node = json_object_get_member(pJsonObject, fmiIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&fmiId, node, "int", "");
		} else {
			
		}
	}
}

VehicleMaintenance_j1939_diagnosticTroubleCodes::VehicleMaintenance_j1939_diagnosticTroubleCodes(char* json)
{
	this->fromJson(json);
}

char*
VehicleMaintenance_j1939_diagnosticTroubleCodes::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getSpnDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *spnDescriptionKey = "spnDescription";
	json_object_set_member(pJsonObject, spnDescriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFmiText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fmiTextKey = "fmiText";
	json_object_set_member(pJsonObject, fmiTextKey, node);
	if (isprimitive("int")) {
		int obj = getSpnId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *spnIdKey = "spnId";
	json_object_set_member(pJsonObject, spnIdKey, node);
	if (isprimitive("int")) {
		int obj = getOccurrenceCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *occurrenceCountKey = "occurrenceCount";
	json_object_set_member(pJsonObject, occurrenceCountKey, node);
	if (isprimitive("int")) {
		int obj = getTxId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *txIdKey = "txId";
	json_object_set_member(pJsonObject, txIdKey, node);
	if (isprimitive("int")) {
		int obj = getFmiId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *fmiIdKey = "fmiId";
	json_object_set_member(pJsonObject, fmiIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
VehicleMaintenance_j1939_diagnosticTroubleCodes::getSpnDescription()
{
	return spnDescription;
}

void
VehicleMaintenance_j1939_diagnosticTroubleCodes::setSpnDescription(std::string  spnDescription)
{
	this->spnDescription = spnDescription;
}

std::string
VehicleMaintenance_j1939_diagnosticTroubleCodes::getFmiText()
{
	return fmiText;
}

void
VehicleMaintenance_j1939_diagnosticTroubleCodes::setFmiText(std::string  fmiText)
{
	this->fmiText = fmiText;
}

int
VehicleMaintenance_j1939_diagnosticTroubleCodes::getSpnId()
{
	return spnId;
}

void
VehicleMaintenance_j1939_diagnosticTroubleCodes::setSpnId(int  spnId)
{
	this->spnId = spnId;
}

int
VehicleMaintenance_j1939_diagnosticTroubleCodes::getOccurrenceCount()
{
	return occurrenceCount;
}

void
VehicleMaintenance_j1939_diagnosticTroubleCodes::setOccurrenceCount(int  occurrenceCount)
{
	this->occurrenceCount = occurrenceCount;
}

int
VehicleMaintenance_j1939_diagnosticTroubleCodes::getTxId()
{
	return txId;
}

void
VehicleMaintenance_j1939_diagnosticTroubleCodes::setTxId(int  txId)
{
	this->txId = txId;
}

int
VehicleMaintenance_j1939_diagnosticTroubleCodes::getFmiId()
{
	return fmiId;
}

void
VehicleMaintenance_j1939_diagnosticTroubleCodes::setFmiId(int  fmiId)
{
	this->fmiId = fmiId;
}


