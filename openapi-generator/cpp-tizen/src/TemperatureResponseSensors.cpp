#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TemperatureResponse_sensors.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TemperatureResponse_sensors::TemperatureResponse_sensors()
{
	//__init();
}

TemperatureResponse_sensors::~TemperatureResponse_sensors()
{
	//__cleanup();
}

void
TemperatureResponse_sensors::__init()
{
	//probeTemperature = int(0);
	//name = std::string();
	//id = long(0);
	//ambientTemperature = int(0);
}

void
TemperatureResponse_sensors::__cleanup()
{
	//if(probeTemperature != NULL) {
	//
	//delete probeTemperature;
	//probeTemperature = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(ambientTemperature != NULL) {
	//
	//delete ambientTemperature;
	//ambientTemperature = NULL;
	//}
	//
}

void
TemperatureResponse_sensors::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *probeTemperatureKey = "probeTemperature";
	node = json_object_get_member(pJsonObject, probeTemperatureKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&probeTemperature, node, "int", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
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
	const gchar *ambientTemperatureKey = "ambientTemperature";
	node = json_object_get_member(pJsonObject, ambientTemperatureKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&ambientTemperature, node, "int", "");
		} else {
			
		}
	}
}

TemperatureResponse_sensors::TemperatureResponse_sensors(char* json)
{
	this->fromJson(json);
}

char*
TemperatureResponse_sensors::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getProbeTemperature();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *probeTemperatureKey = "probeTemperature";
	json_object_set_member(pJsonObject, probeTemperatureKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("int")) {
		int obj = getAmbientTemperature();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *ambientTemperatureKey = "ambientTemperature";
	json_object_set_member(pJsonObject, ambientTemperatureKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
TemperatureResponse_sensors::getProbeTemperature()
{
	return probeTemperature;
}

void
TemperatureResponse_sensors::setProbeTemperature(int  probeTemperature)
{
	this->probeTemperature = probeTemperature;
}

std::string
TemperatureResponse_sensors::getName()
{
	return name;
}

void
TemperatureResponse_sensors::setName(std::string  name)
{
	this->name = name;
}

long long
TemperatureResponse_sensors::getId()
{
	return id;
}

void
TemperatureResponse_sensors::setId(long long  id)
{
	this->id = id;
}

int
TemperatureResponse_sensors::getAmbientTemperature()
{
	return ambientTemperature;
}

void
TemperatureResponse_sensors::setAmbientTemperature(int  ambientTemperature)
{
	this->ambientTemperature = ambientTemperature;
}


