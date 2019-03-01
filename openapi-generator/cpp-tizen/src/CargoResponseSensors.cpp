#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CargoResponse_sensors.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CargoResponse_sensors::CargoResponse_sensors()
{
	//__init();
}

CargoResponse_sensors::~CargoResponse_sensors()
{
	//__cleanup();
}

void
CargoResponse_sensors::__init()
{
	//cargoEmpty = bool(false);
	//name = std::string();
	//id = long(0);
}

void
CargoResponse_sensors::__cleanup()
{
	//if(cargoEmpty != NULL) {
	//
	//delete cargoEmpty;
	//cargoEmpty = NULL;
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
	//
}

void
CargoResponse_sensors::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cargoEmptyKey = "cargoEmpty";
	node = json_object_get_member(pJsonObject, cargoEmptyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&cargoEmpty, node, "bool", "");
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
}

CargoResponse_sensors::CargoResponse_sensors(char* json)
{
	this->fromJson(json);
}

char*
CargoResponse_sensors::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getCargoEmpty();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *cargoEmptyKey = "cargoEmpty";
	json_object_set_member(pJsonObject, cargoEmptyKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
CargoResponse_sensors::getCargoEmpty()
{
	return cargoEmpty;
}

void
CargoResponse_sensors::setCargoEmpty(bool  cargoEmpty)
{
	this->cargoEmpty = cargoEmpty;
}

std::string
CargoResponse_sensors::getName()
{
	return name;
}

void
CargoResponse_sensors::setName(std::string  name)
{
	this->name = name;
}

long long
CargoResponse_sensors::getId()
{
	return id;
}

void
CargoResponse_sensors::setId(long long  id)
{
	this->id = id;
}


