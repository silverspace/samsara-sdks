#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "_sensors_history_series.h"

using namespace std;
using namespace Tizen::ArtikCloud;

_sensors_history_series::_sensors_history_series()
{
	//__init();
}

_sensors_history_series::~_sensors_history_series()
{
	//__cleanup();
}

void
_sensors_history_series::__init()
{
	//field = std::string();
	//widgetId = long(0);
}

void
_sensors_history_series::__cleanup()
{
	//if(field != NULL) {
	//
	//delete field;
	//field = NULL;
	//}
	//if(widgetId != NULL) {
	//
	//delete widgetId;
	//widgetId = NULL;
	//}
	//
}

void
_sensors_history_series::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fieldKey = "field";
	node = json_object_get_member(pJsonObject, fieldKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&field, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *widgetIdKey = "widgetId";
	node = json_object_get_member(pJsonObject, widgetIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&widgetId, node, "long long", "");
		} else {
			
		}
	}
}

_sensors_history_series::_sensors_history_series(char* json)
{
	this->fromJson(json);
}

char*
_sensors_history_series::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getField();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fieldKey = "field";
	json_object_set_member(pJsonObject, fieldKey, node);
	if (isprimitive("long long")) {
		long long obj = getWidgetId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *widgetIdKey = "widgetId";
	json_object_set_member(pJsonObject, widgetIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
_sensors_history_series::getField()
{
	return field;
}

void
_sensors_history_series::setField(std::string  field)
{
	this->field = field;
}

long long
_sensors_history_series::getWidgetId()
{
	return widgetId;
}

void
_sensors_history_series::setWidgetId(long long  widgetId)
{
	this->widgetId = widgetId;
}


