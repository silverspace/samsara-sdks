#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DvirBase_mechanicOrAgentSignature.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DvirBase_mechanicOrAgentSignature::DvirBase_mechanicOrAgentSignature()
{
	//__init();
}

DvirBase_mechanicOrAgentSignature::~DvirBase_mechanicOrAgentSignature()
{
	//__cleanup();
}

void
DvirBase_mechanicOrAgentSignature::__init()
{
	//mechanicUserId = long(0);
	//driverId = long(0);
	//name = std::string();
	//signedAt = long(0);
	//type = std::string();
	//email = std::string();
	//username = std::string();
}

void
DvirBase_mechanicOrAgentSignature::__cleanup()
{
	//if(mechanicUserId != NULL) {
	//
	//delete mechanicUserId;
	//mechanicUserId = NULL;
	//}
	//if(driverId != NULL) {
	//
	//delete driverId;
	//driverId = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(signedAt != NULL) {
	//
	//delete signedAt;
	//signedAt = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(email != NULL) {
	//
	//delete email;
	//email = NULL;
	//}
	//if(username != NULL) {
	//
	//delete username;
	//username = NULL;
	//}
	//
}

void
DvirBase_mechanicOrAgentSignature::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *mechanicUserIdKey = "mechanicUserId";
	node = json_object_get_member(pJsonObject, mechanicUserIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&mechanicUserId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *driverIdKey = "driverId";
	node = json_object_get_member(pJsonObject, driverIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&driverId, node, "long long", "");
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
	const gchar *signedAtKey = "signedAt";
	node = json_object_get_member(pJsonObject, signedAtKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&signedAt, node, "long long", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
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
	const gchar *usernameKey = "username";
	node = json_object_get_member(pJsonObject, usernameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&username, node, "std::string", "");
		} else {
			
		}
	}
}

DvirBase_mechanicOrAgentSignature::DvirBase_mechanicOrAgentSignature(char* json)
{
	this->fromJson(json);
}

char*
DvirBase_mechanicOrAgentSignature::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getMechanicUserId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *mechanicUserIdKey = "mechanicUserId";
	json_object_set_member(pJsonObject, mechanicUserIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getDriverId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *driverIdKey = "driverId";
	json_object_set_member(pJsonObject, driverIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getSignedAt();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *signedAtKey = "signedAt";
	json_object_set_member(pJsonObject, signedAtKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *emailKey = "email";
	json_object_set_member(pJsonObject, emailKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUsername();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *usernameKey = "username";
	json_object_set_member(pJsonObject, usernameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
DvirBase_mechanicOrAgentSignature::getMechanicUserId()
{
	return mechanicUserId;
}

void
DvirBase_mechanicOrAgentSignature::setMechanicUserId(long long  mechanicUserId)
{
	this->mechanicUserId = mechanicUserId;
}

long long
DvirBase_mechanicOrAgentSignature::getDriverId()
{
	return driverId;
}

void
DvirBase_mechanicOrAgentSignature::setDriverId(long long  driverId)
{
	this->driverId = driverId;
}

std::string
DvirBase_mechanicOrAgentSignature::getName()
{
	return name;
}

void
DvirBase_mechanicOrAgentSignature::setName(std::string  name)
{
	this->name = name;
}

long long
DvirBase_mechanicOrAgentSignature::getSignedAt()
{
	return signedAt;
}

void
DvirBase_mechanicOrAgentSignature::setSignedAt(long long  signedAt)
{
	this->signedAt = signedAt;
}

std::string
DvirBase_mechanicOrAgentSignature::getType()
{
	return type;
}

void
DvirBase_mechanicOrAgentSignature::setType(std::string  type)
{
	this->type = type;
}

std::string
DvirBase_mechanicOrAgentSignature::getEmail()
{
	return email;
}

void
DvirBase_mechanicOrAgentSignature::setEmail(std::string  email)
{
	this->email = email;
}

std::string
DvirBase_mechanicOrAgentSignature::getUsername()
{
	return username;
}

void
DvirBase_mechanicOrAgentSignature::setUsername(std::string  username)
{
	this->username = username;
}


