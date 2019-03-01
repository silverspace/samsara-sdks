#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Contact.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Contact::Contact()
{
	//__init();
}

Contact::~Contact()
{
	//__cleanup();
}

void
Contact::__init()
{
	//email = std::string();
	//firstName = std::string();
	//id = long(0);
	//lastName = std::string();
	//phone = std::string();
}

void
Contact::__cleanup()
{
	//if(email != NULL) {
	//
	//delete email;
	//email = NULL;
	//}
	//if(firstName != NULL) {
	//
	//delete firstName;
	//firstName = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(lastName != NULL) {
	//
	//delete lastName;
	//lastName = NULL;
	//}
	//if(phone != NULL) {
	//
	//delete phone;
	//phone = NULL;
	//}
	//
}

void
Contact::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *emailKey = "email";
	node = json_object_get_member(pJsonObject, emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&email, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *firstNameKey = "firstName";
	node = json_object_get_member(pJsonObject, firstNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&firstName, node, "std::string", "");
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
	const gchar *lastNameKey = "lastName";
	node = json_object_get_member(pJsonObject, lastNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&lastName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *phoneKey = "phone";
	node = json_object_get_member(pJsonObject, phoneKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&phone, node, "std::string", "");
		} else {
			
		}
	}
}

Contact::Contact(char* json)
{
	this->fromJson(json);
}

char*
Contact::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *emailKey = "email";
	json_object_set_member(pJsonObject, emailKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFirstName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *firstNameKey = "firstName";
	json_object_set_member(pJsonObject, firstNameKey, node);
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLastName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *lastNameKey = "lastName";
	json_object_set_member(pJsonObject, lastNameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPhone();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *phoneKey = "phone";
	json_object_set_member(pJsonObject, phoneKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Contact::getEmail()
{
	return email;
}

void
Contact::setEmail(std::string  email)
{
	this->email = email;
}

std::string
Contact::getFirstName()
{
	return firstName;
}

void
Contact::setFirstName(std::string  firstName)
{
	this->firstName = firstName;
}

long long
Contact::getId()
{
	return id;
}

void
Contact::setId(long long  id)
{
	this->id = id;
}

std::string
Contact::getLastName()
{
	return lastName;
}

void
Contact::setLastName(std::string  lastName)
{
	this->lastName = lastName;
}

std::string
Contact::getPhone()
{
	return phone;
}

void
Contact::setPhone(std::string  phone)
{
	this->phone = phone;
}


