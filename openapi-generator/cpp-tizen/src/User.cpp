#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "User.h"

using namespace std;
using namespace Tizen::ArtikCloud;

User::User()
{
	//__init();
}

User::~User()
{
	//__cleanup();
}

void
User::__init()
{
	//authType = std::string();
	//email = std::string();
	//name = std::string();
	//organizationRoleId = std::string();
	//id = long(0);
	//organizationRole = std::string();
	//new std::list()std::list> tagRoles;
}

void
User::__cleanup()
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
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(organizationRole != NULL) {
	//
	//delete organizationRole;
	//organizationRole = NULL;
	//}
	//if(tagRoles != NULL) {
	//tagRoles.RemoveAll(true);
	//delete tagRoles;
	//tagRoles = NULL;
	//}
	//
}

void
User::fromJson(char* jsonStr)
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *organizationRoleKey = "organizationRole";
	node = json_object_get_member(pJsonObject, organizationRoleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&organizationRole, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *tagRolesKey = "tagRoles";
	node = json_object_get_member(pJsonObject, tagRolesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UserTagRole> new_list;
			UserTagRole inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UserTagRole")) {
					jsonToValue(&inst, temp_json, "UserTagRole", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tagRoles = new_list;
		}
		
	}
}

User::User(char* json)
{
	this->fromJson(json);
}

char*
User::toJson()
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
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOrganizationRole();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *organizationRoleKey = "organizationRole";
	json_object_set_member(pJsonObject, organizationRoleKey, node);
	if (isprimitive("UserTagRole")) {
		list<UserTagRole> new_list = static_cast<list <UserTagRole> > (getTagRoles());
		node = converttoJson(&new_list, "UserTagRole", "array");
	} else {
		node = json_node_alloc();
		list<UserTagRole> new_list = static_cast<list <UserTagRole> > (getTagRoles());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UserTagRole>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UserTagRole obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *tagRolesKey = "tagRoles";
	json_object_set_member(pJsonObject, tagRolesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
User::getAuthType()
{
	return authType;
}

void
User::setAuthType(std::string  authType)
{
	this->authType = authType;
}

std::string
User::getEmail()
{
	return email;
}

void
User::setEmail(std::string  email)
{
	this->email = email;
}

std::string
User::getName()
{
	return name;
}

void
User::setName(std::string  name)
{
	this->name = name;
}

std::string
User::getOrganizationRoleId()
{
	return organizationRoleId;
}

void
User::setOrganizationRoleId(std::string  organizationRoleId)
{
	this->organizationRoleId = organizationRoleId;
}

long long
User::getId()
{
	return id;
}

void
User::setId(long long  id)
{
	this->id = id;
}

std::string
User::getOrganizationRole()
{
	return organizationRole;
}

void
User::setOrganizationRole(std::string  organizationRole)
{
	this->organizationRole = organizationRole;
}

std::list<UserTagRole>
User::getTagRoles()
{
	return tagRoles;
}

void
User::setTagRoles(std::list <UserTagRole> tagRoles)
{
	this->tagRoles = tagRoles;
}


