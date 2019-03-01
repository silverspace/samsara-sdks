#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EngineState.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EngineState::EngineState()
{
	//__init();
}

EngineState::~EngineState()
{
	//__cleanup();
}

void
EngineState::__init()
{
	//timeMs = double(0);
	//value = std::string();
}

void
EngineState::__cleanup()
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
EngineState::fromJson(char* jsonStr)
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
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
		}
	}
}

EngineState::EngineState(char* json)
{
	this->fromJson(json);
}

char*
EngineState::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
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
EngineState::getTimeMs()
{
	return timeMs;
}

void
EngineState::setTimeMs(std::string  timeMs)
{
	this->timeMs = timeMs;
}

std::string
EngineState::getValue()
{
	return value;
}

void
EngineState::setValue(std::string  value)
{
	this->value = value;
}


