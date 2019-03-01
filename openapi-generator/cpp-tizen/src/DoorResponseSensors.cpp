#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DoorResponse_sensors.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DoorResponse_sensors::DoorResponse_sensors()
{
	//__init();
}

DoorResponse_sensors::~DoorResponse_sensors()
{
	//__cleanup();
}

void
DoorResponse_sensors::__init()
{
	//doorClosed = bool(false);
	//name = std::string();
	//id = long(0);
}

void
DoorResponse_sensors::__cleanup()
{
	//if(doorClosed != NULL) {
	//
	//delete doorClosed;
	//doorClosed = NULL;
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
DoorResponse_sensors::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *doorClosedKey = "doorClosed";
	node = json_object_get_member(pJsonObject, doorClosedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&doorClosed, node, "bool", "");
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

DoorResponse_sensors::DoorResponse_sensors(char* json)
{
	this->fromJson(json);
}

char*
DoorResponse_sensors::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getDoorClosed();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *doorClosedKey = "doorClosed";
	json_object_set_member(pJsonObject, doorClosedKey, node);
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
DoorResponse_sensors::getDoorClosed()
{
	return doorClosed;
}

void
DoorResponse_sensors::setDoorClosed(bool  doorClosed)
{
	this->doorClosed = doorClosed;
}

std::string
DoorResponse_sensors::getName()
{
	return name;
}

void
DoorResponse_sensors::setName(std::string  name)
{
	this->name = name;
}

long long
DoorResponse_sensors::getId()
{
	return id;
}

void
DoorResponse_sensors::setId(long long  id)
{
	this->id = id;
}


