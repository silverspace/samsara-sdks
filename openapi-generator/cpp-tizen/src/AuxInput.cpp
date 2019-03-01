#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuxInput.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuxInput::AuxInput()
{
	//__init();
}

AuxInput::~AuxInput()
{
	//__cleanup();
}

void
AuxInput::__init()
{
	//timeMs = double(0);
	//value = bool(false);
}

void
AuxInput::__cleanup()
{
	//if(timeMs != NULL) {
	//
	//delete timeMs;
	//timeMs = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
AuxInput::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *timeMsKey = "timeMs";
	node = json_object_get_member(pJsonObject, timeMsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&timeMs, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&timeMs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&value, node, "bool", "");
		} else {
			
		}
	}
}

AuxInput::AuxInput(char* json)
{
	this->fromJson(json);
}

char*
AuxInput::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getTimeMs();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getTimeMs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *timeMsKey = "timeMs";
	json_object_set_member(pJsonObject, timeMsKey, node);
	if (isprimitive("bool")) {
		bool obj = getValue();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AuxInput::getTimeMs()
{
	return timeMs;
}

void
AuxInput::setTimeMs(std::string  timeMs)
{
	this->timeMs = timeMs;
}

bool
AuxInput::getValue()
{
	return value;
}

void
AuxInput::setValue(bool  value)
{
	this->value = value;
}


