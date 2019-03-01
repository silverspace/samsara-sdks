#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssetReeferResponse_reeferStats_alarms.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssetReeferResponse_reeferStats_alarms::AssetReeferResponse_reeferStats_alarms()
{
	//__init();
}

AssetReeferResponse_reeferStats_alarms::~AssetReeferResponse_reeferStats_alarms()
{
	//__cleanup();
}

void
AssetReeferResponse_reeferStats_alarms::__init()
{
	//severity = long(0);
	//operatorAction = std::string();
	//description = std::string();
	//alarmCode = long(0);
}

void
AssetReeferResponse_reeferStats_alarms::__cleanup()
{
	//if(severity != NULL) {
	//
	//delete severity;
	//severity = NULL;
	//}
	//if(operatorAction != NULL) {
	//
	//delete operatorAction;
	//operatorAction = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(alarmCode != NULL) {
	//
	//delete alarmCode;
	//alarmCode = NULL;
	//}
	//
}

void
AssetReeferResponse_reeferStats_alarms::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *severityKey = "severity";
	node = json_object_get_member(pJsonObject, severityKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&severity, node, "long long", "");
		} else {
			
		}
	}
	const gchar *operatorActionKey = "operatorAction";
	node = json_object_get_member(pJsonObject, operatorActionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&operatorAction, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *alarmCodeKey = "alarmCode";
	node = json_object_get_member(pJsonObject, alarmCodeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&alarmCode, node, "long long", "");
		} else {
			
		}
	}
}

AssetReeferResponse_reeferStats_alarms::AssetReeferResponse_reeferStats_alarms(char* json)
{
	this->fromJson(json);
}

char*
AssetReeferResponse_reeferStats_alarms::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getSeverity();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *severityKey = "severity";
	json_object_set_member(pJsonObject, severityKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOperatorAction();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *operatorActionKey = "operatorAction";
	json_object_set_member(pJsonObject, operatorActionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("long long")) {
		long long obj = getAlarmCode();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *alarmCodeKey = "alarmCode";
	json_object_set_member(pJsonObject, alarmCodeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
AssetReeferResponse_reeferStats_alarms::getSeverity()
{
	return severity;
}

void
AssetReeferResponse_reeferStats_alarms::setSeverity(long long  severity)
{
	this->severity = severity;
}

std::string
AssetReeferResponse_reeferStats_alarms::getOperatorAction()
{
	return operatorAction;
}

void
AssetReeferResponse_reeferStats_alarms::setOperatorAction(std::string  operatorAction)
{
	this->operatorAction = operatorAction;
}

std::string
AssetReeferResponse_reeferStats_alarms::getDescription()
{
	return description;
}

void
AssetReeferResponse_reeferStats_alarms::setDescription(std::string  description)
{
	this->description = description;
}

long long
AssetReeferResponse_reeferStats_alarms::getAlarmCode()
{
	return alarmCode;
}

void
AssetReeferResponse_reeferStats_alarms::setAlarmCode(long long  alarmCode)
{
	this->alarmCode = alarmCode;
}


