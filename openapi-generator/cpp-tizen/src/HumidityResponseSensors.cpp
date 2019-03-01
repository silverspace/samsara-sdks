#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "HumidityResponse_sensors.h"

using namespace std;
using namespace Tizen::ArtikCloud;

HumidityResponse_sensors::HumidityResponse_sensors()
{
	//__init();
}

HumidityResponse_sensors::~HumidityResponse_sensors()
{
	//__cleanup();
}

void
HumidityResponse_sensors::__init()
{
	//name = std::string();
	//humidity = int(0);
	//id = long(0);
}

void
HumidityResponse_sensors::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(humidity != NULL) {
	//
	//delete humidity;
	//humidity = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
HumidityResponse_sensors::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *humidityKey = "humidity";
	node = json_object_get_member(pJsonObject, humidityKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&humidity, node, "int", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
}

HumidityResponse_sensors::HumidityResponse_sensors(char* json)
{
	this->fromJson(json);
}

char*
HumidityResponse_sensors::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("int")) {
		int obj = getHumidity();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *humidityKey = "humidity";
	json_object_set_member(pJsonObject, humidityKey, node);
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
HumidityResponse_sensors::getName()
{
	return name;
}

void
HumidityResponse_sensors::setName(std::string  name)
{
	this->name = name;
}

int
HumidityResponse_sensors::getHumidity()
{
	return humidity;
}

void
HumidityResponse_sensors::setHumidity(int  humidity)
{
	this->humidity = humidity;
}

long long
HumidityResponse_sensors::getId()
{
	return id;
}

void
HumidityResponse_sensors::setId(long long  id)
{
	this->id = id;
}


