#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_object_2.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_object_2::Inline_object_2()
{
	//__init();
}

Inline_object_2::~Inline_object_2()
{
	//__cleanup();
}

void
Inline_object_2::__init()
{
	//address = std::string();
	//groupId = long(0);
	//name = std::string();
	//radius = int(0);
}

void
Inline_object_2::__cleanup()
{
	//if(address != NULL) {
	//
	//delete address;
	//address = NULL;
	//}
	//if(groupId != NULL) {
	//
	//delete groupId;
	//groupId = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(radius != NULL) {
	//
	//delete radius;
	//radius = NULL;
	//}
	//
}

void
Inline_object_2::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *addressKey = "address";
	node = json_object_get_member(pJsonObject, addressKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&address, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *groupIdKey = "groupId";
	node = json_object_get_member(pJsonObject, groupIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&groupId, node, "long long", "");
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
	const gchar *radiusKey = "radius";
	node = json_object_get_member(pJsonObject, radiusKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&radius, node, "int", "");
		} else {
			
		}
	}
}

Inline_object_2::Inline_object_2(char* json)
{
	this->fromJson(json);
}

char*
Inline_object_2::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAddress();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *addressKey = "address";
	json_object_set_member(pJsonObject, addressKey, node);
	if (isprimitive("long long")) {
		long long obj = getGroupId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *groupIdKey = "groupId";
	json_object_set_member(pJsonObject, groupIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("int")) {
		int obj = getRadius();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *radiusKey = "radius";
	json_object_set_member(pJsonObject, radiusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Inline_object_2::getAddress()
{
	return address;
}

void
Inline_object_2::setAddress(std::string  address)
{
	this->address = address;
}

long long
Inline_object_2::getGroupId()
{
	return groupId;
}

void
Inline_object_2::setGroupId(long long  groupId)
{
	this->groupId = groupId;
}

std::string
Inline_object_2::getName()
{
	return name;
}

void
Inline_object_2::setName(std::string  name)
{
	this->name = name;
}

int
Inline_object_2::getRadius()
{
	return radius;
}

void
Inline_object_2::setRadius(int  radius)
{
	this->radius = radius;
}


