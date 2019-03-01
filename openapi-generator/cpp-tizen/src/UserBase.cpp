#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UserBase.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UserBase::UserBase()
{
	//__init();
}

UserBase::~UserBase()
{
	//__cleanup();
}

void
UserBase::__init()
{
	//authType = std::string();
	//email = std::string();
	//name = std::string();
	//organizationRoleId = std::string();
}

void
UserBase::__cleanup()
{
	//if(authType != NULL) {
	//
	//delete authType;
	//authType = NULL;
	//}
	//if(email != NULL) {
	//
	//delete email;
	//email = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(organizationRoleId != NULL) {
	//
	//delete organizationRoleId;
	//organizationRoleId = NULL;
	//}
	//
}

void
UserBase::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *authTypeKey = "authType";
	node = json_object_get_member(pJsonObject, authTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&authType, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *emailKey = "email";
	node = json_object_get_member(pJsonObject, emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&email, node, "std::string", "");
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
	const gchar *organizationRoleIdKey = "organizationRoleId";
	node = json_object_get_member(pJsonObject, organizationRoleIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&organizationRoleId, node, "std::string", "");
		} else {
			
		}
	}
}

UserBase::UserBase(char* json)
{
	this->fromJson(json);
}

char*
UserBase::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAuthType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *authTypeKey = "authType";
	json_object_set_member(pJsonObject, authTypeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *emailKey = "email";
	json_object_set_member(pJsonObject, emailKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOrganizationRoleId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *organizationRoleIdKey = "organizationRoleId";
	json_object_set_member(pJsonObject, organizationRoleIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UserBase::getAuthType()
{
	return authType;
}

void
UserBase::setAuthType(std::string  authType)
{
	this->authType = authType;
}

std::string
UserBase::getEmail()
{
	return email;
}

void
UserBase::setEmail(std::string  email)
{
	this->email = email;
}

std::string
UserBase::getName()
{
	return name;
}

void
UserBase::setName(std::string  name)
{
	this->name = name;
}

std::string
UserBase::getOrganizationRoleId()
{
	return organizationRoleId;
}

void
UserBase::setOrganizationRoleId(std::string  organizationRoleId)
{
	this->organizationRoleId = organizationRoleId;
}


