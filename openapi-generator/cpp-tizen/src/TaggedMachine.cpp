#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TaggedMachine.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TaggedMachine::TaggedMachine()
{
	//__init();
}

TaggedMachine::~TaggedMachine()
{
	//__cleanup();
}

void
TaggedMachine::__init()
{
	//id = long(0);
	//name = std::string();
}

void
TaggedMachine::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
TaggedMachine::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
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
}

TaggedMachine::TaggedMachine(char* json)
{
	this->fromJson(json);
}

char*
TaggedMachine::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
TaggedMachine::getId()
{
	return id;
}

void
TaggedMachine::setId(long long  id)
{
	this->id = id;
}

std::string
TaggedMachine::getName()
{
	return name;
}

void
TaggedMachine::setName(std::string  name)
{
	this->name = name;
}


