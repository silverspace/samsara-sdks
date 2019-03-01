#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "HosAuthenticationLogsResponse_authenticationLogs.h"

using namespace std;
using namespace Tizen::ArtikCloud;

HosAuthenticationLogsResponse_authenticationLogs::HosAuthenticationLogsResponse_authenticationLogs()
{
	//__init();
}

HosAuthenticationLogsResponse_authenticationLogs::~HosAuthenticationLogsResponse_authenticationLogs()
{
	//__cleanup();
}

void
HosAuthenticationLogsResponse_authenticationLogs::__init()
{
	//actionType = std::string();
	//address = std::string();
	//city = std::string();
	//happenedAtMs = long(0);
	//addressName = std::string();
	//state = std::string();
}

void
HosAuthenticationLogsResponse_authenticationLogs::__cleanup()
{
	//if(actionType != NULL) {
	//
	//delete actionType;
	//actionType = NULL;
	//}
	//if(address != NULL) {
	//
	//delete address;
	//address = NULL;
	//}
	//if(city != NULL) {
	//
	//delete city;
	//city = NULL;
	//}
	//if(happenedAtMs != NULL) {
	//
	//delete happenedAtMs;
	//happenedAtMs = NULL;
	//}
	//if(addressName != NULL) {
	//
	//delete addressName;
	//addressName = NULL;
	//}
	//if(state != NULL) {
	//
	//delete state;
	//state = NULL;
	//}
	//
}

void
HosAuthenticationLogsResponse_authenticationLogs::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *actionTypeKey = "actionType";
	node = json_object_get_member(pJsonObject, actionTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&actionType, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *addressKey = "address";
	node = json_object_get_member(pJsonObject, addressKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&address, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *cityKey = "city";
	node = json_object_get_member(pJsonObject, cityKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&city, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *happenedAtMsKey = "happenedAtMs";
	node = json_object_get_member(pJsonObject, happenedAtMsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&happenedAtMs, node, "long long", "");
		} else {
			
		}
	}
	const gchar *addressNameKey = "addressName";
	node = json_object_get_member(pJsonObject, addressNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&addressName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *stateKey = "state";
	node = json_object_get_member(pJsonObject, stateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&state, node, "std::string", "");
		} else {
			
		}
	}
}

HosAuthenticationLogsResponse_authenticationLogs::HosAuthenticationLogsResponse_authenticationLogs(char* json)
{
	this->fromJson(json);
}

char*
HosAuthenticationLogsResponse_authenticationLogs::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getActionType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *actionTypeKey = "actionType";
	json_object_set_member(pJsonObject, actionTypeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAddress();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *addressKey = "address";
	json_object_set_member(pJsonObject, addressKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCity();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cityKey = "city";
	json_object_set_member(pJsonObject, cityKey, node);
	if (isprimitive("long long")) {
		long long obj = getHappenedAtMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *happenedAtMsKey = "happenedAtMs";
	json_object_set_member(pJsonObject, happenedAtMsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAddressName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *addressNameKey = "addressName";
	json_object_set_member(pJsonObject, addressNameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getState();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *stateKey = "state";
	json_object_set_member(pJsonObject, stateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
HosAuthenticationLogsResponse_authenticationLogs::getActionType()
{
	return actionType;
}

void
HosAuthenticationLogsResponse_authenticationLogs::setActionType(std::string  actionType)
{
	this->actionType = actionType;
}

std::string
HosAuthenticationLogsResponse_authenticationLogs::getAddress()
{
	return address;
}

void
HosAuthenticationLogsResponse_authenticationLogs::setAddress(std::string  address)
{
	this->address = address;
}

std::string
HosAuthenticationLogsResponse_authenticationLogs::getCity()
{
	return city;
}

void
HosAuthenticationLogsResponse_authenticationLogs::setCity(std::string  city)
{
	this->city = city;
}

long long
HosAuthenticationLogsResponse_authenticationLogs::getHappenedAtMs()
{
	return happenedAtMs;
}

void
HosAuthenticationLogsResponse_authenticationLogs::setHappenedAtMs(long long  happenedAtMs)
{
	this->happenedAtMs = happenedAtMs;
}

std::string
HosAuthenticationLogsResponse_authenticationLogs::getAddressName()
{
	return addressName;
}

void
HosAuthenticationLogsResponse_authenticationLogs::setAddressName(std::string  addressName)
{
	this->addressName = addressName;
}

std::string
HosAuthenticationLogsResponse_authenticationLogs::getState()
{
	return state;
}

void
HosAuthenticationLogsResponse_authenticationLogs::setState(std::string  state)
{
	this->state = state;
}


