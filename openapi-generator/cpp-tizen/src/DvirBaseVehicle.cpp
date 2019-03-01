#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DvirBase_vehicle.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DvirBase_vehicle::DvirBase_vehicle()
{
	//__init();
}

DvirBase_vehicle::~DvirBase_vehicle()
{
	//__cleanup();
}

void
DvirBase_vehicle::__init()
{
	//name = std::string();
	//id = long(0);
}

void
DvirBase_vehicle::__cleanup()
{
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
DvirBase_vehicle::fromJson(char* jsonStr)
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
}

DvirBase_vehicle::DvirBase_vehicle(char* json)
{
	this->fromJson(json);
}

char*
DvirBase_vehicle::toJson()
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
DvirBase_vehicle::getName()
{
	return name;
}

void
DvirBase_vehicle::setName(std::string  name)
{
	this->name = name;
}

long long
DvirBase_vehicle::getId()
{
	return id;
}

void
DvirBase_vehicle::setId(long long  id)
{
	this->id = id;
}


