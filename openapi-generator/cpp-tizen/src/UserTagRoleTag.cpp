#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UserTagRole_tag.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UserTagRole_tag::UserTagRole_tag()
{
	//__init();
}

UserTagRole_tag::~UserTagRole_tag()
{
	//__cleanup();
}

void
UserTagRole_tag::__init()
{
	//parentTagId = long(0);
	//name = std::string();
	//id = long(0);
}

void
UserTagRole_tag::__cleanup()
{
	//if(parentTagId != NULL) {
	//
	//delete parentTagId;
	//parentTagId = NULL;
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
UserTagRole_tag::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *parentTagIdKey = "parentTagId";
	node = json_object_get_member(pJsonObject, parentTagIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&parentTagId, node, "long long", "");
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

UserTagRole_tag::UserTagRole_tag(char* json)
{
	this->fromJson(json);
}

char*
UserTagRole_tag::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getParentTagId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *parentTagIdKey = "parentTagId";
	json_object_set_member(pJsonObject, parentTagIdKey, node);
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

long long
UserTagRole_tag::getParentTagId()
{
	return parentTagId;
}

void
UserTagRole_tag::setParentTagId(long long  parentTagId)
{
	this->parentTagId = parentTagId;
}

std::string
UserTagRole_tag::getName()
{
	return name;
}

void
UserTagRole_tag::setName(std::string  name)
{
	this->name = name;
}

long long
UserTagRole_tag::getId()
{
	return id;
}

void
UserTagRole_tag::setId(long long  id)
{
	this->id = id;
}


