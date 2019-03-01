#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UserTagRole.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UserTagRole::UserTagRole()
{
	//__init();
}

UserTagRole::~UserTagRole()
{
	//__cleanup();
}

void
UserTagRole::__init()
{
	//role = std::string();
	//roleId = std::string();
	//tag = new UserTagRole_tag();
}

void
UserTagRole::__cleanup()
{
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//if(roleId != NULL) {
	//
	//delete roleId;
	//roleId = NULL;
	//}
	//if(tag != NULL) {
	//
	//delete tag;
	//tag = NULL;
	//}
	//
}

void
UserTagRole::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *roleKey = "role";
	node = json_object_get_member(pJsonObject, roleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&role, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *roleIdKey = "roleId";
	node = json_object_get_member(pJsonObject, roleIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&roleId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *tagKey = "tag";
	node = json_object_get_member(pJsonObject, tagKey);
	if (node !=NULL) {
	

		if (isprimitive("UserTagRole_tag")) {
			jsonToValue(&tag, node, "UserTagRole_tag", "UserTagRole_tag");
		} else {
			
			UserTagRole_tag* obj = static_cast<UserTagRole_tag*> (&tag);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

UserTagRole::UserTagRole(char* json)
{
	this->fromJson(json);
}

char*
UserTagRole::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getRole();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *roleKey = "role";
	json_object_set_member(pJsonObject, roleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRoleId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *roleIdKey = "roleId";
	json_object_set_member(pJsonObject, roleIdKey, node);
	if (isprimitive("UserTagRole_tag")) {
		UserTagRole_tag obj = getTag();
		node = converttoJson(&obj, "UserTagRole_tag", "");
	}
	else {
		
		UserTagRole_tag obj = static_cast<UserTagRole_tag> (getTag());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tagKey = "tag";
	json_object_set_member(pJsonObject, tagKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UserTagRole::getRole()
{
	return role;
}

void
UserTagRole::setRole(std::string  role)
{
	this->role = role;
}

std::string
UserTagRole::getRoleId()
{
	return roleId;
}

void
UserTagRole::setRoleId(std::string  roleId)
{
	this->roleId = roleId;
}

UserTagRole_tag
UserTagRole::getTag()
{
	return tag;
}

void
UserTagRole::setTag(UserTagRole_tag  tag)
{
	this->tag = tag;
}


