#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DataInputHistoryResponse_points.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DataInputHistoryResponse_points::DataInputHistoryResponse_points()
{
	//__init();
}

DataInputHistoryResponse_points::~DataInputHistoryResponse_points()
{
	//__cleanup();
}

void
DataInputHistoryResponse_points::__init()
{
	//value = double(0);
	//timeMs = long(0);
}

void
DataInputHistoryResponse_points::__cleanup()
{
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(timeMs != NULL) {
	//
	//delete timeMs;
	//timeMs = NULL;
	//}
	//
}

void
DataInputHistoryResponse_points::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&value, node, "double", "");
		} else {
			
		}
	}
	const gchar *timeMsKey = "timeMs";
	node = json_object_get_member(pJsonObject, timeMsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&timeMs, node, "long long", "");
		} else {
			
		}
	}
}

DataInputHistoryResponse_points::DataInputHistoryResponse_points(char* json)
{
	this->fromJson(json);
}

char*
DataInputHistoryResponse_points::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("double")) {
		double obj = getValue();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	if (isprimitive("long long")) {
		long long obj = getTimeMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *timeMsKey = "timeMs";
	json_object_set_member(pJsonObject, timeMsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

double
DataInputHistoryResponse_points::getValue()
{
	return value;
}

void
DataInputHistoryResponse_points::setValue(double  value)
{
	this->value = value;
}

long long
DataInputHistoryResponse_points::getTimeMs()
{
	return timeMs;
}

void
DataInputHistoryResponse_points::setTimeMs(long long  timeMs)
{
	this->timeMs = timeMs;
}


