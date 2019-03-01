#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VehicleHarshEventResponse_location.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VehicleHarshEventResponse_location::VehicleHarshEventResponse_location()
{
	//__init();
}

VehicleHarshEventResponse_location::~VehicleHarshEventResponse_location()
{
	//__cleanup();
}

void
VehicleHarshEventResponse_location::__init()
{
	//address = std::string();
	//latitude = std::string();
	//longitude = std::string();
}

void
VehicleHarshEventResponse_location::__cleanup()
{
	//if(address != NULL) {
	//
	//delete address;
	//address = NULL;
	//}
	//if(latitude != NULL) {
	//
	//delete latitude;
	//latitude = NULL;
	//}
	//if(longitude != NULL) {
	//
	//delete longitude;
	//longitude = NULL;
	//}
	//
}

void
VehicleHarshEventResponse_location::fromJson(char* jsonStr)
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
	const gchar *latitudeKey = "latitude";
	node = json_object_get_member(pJsonObject, latitudeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&latitude, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *longitudeKey = "longitude";
	node = json_object_get_member(pJsonObject, longitudeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&longitude, node, "std::string", "");
		} else {
			
		}
	}
}

VehicleHarshEventResponse_location::VehicleHarshEventResponse_location(char* json)
{
	this->fromJson(json);
}

char*
VehicleHarshEventResponse_location::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getLatitude();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *latitudeKey = "latitude";
	json_object_set_member(pJsonObject, latitudeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLongitude();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *longitudeKey = "longitude";
	json_object_set_member(pJsonObject, longitudeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
VehicleHarshEventResponse_location::getAddress()
{
	return address;
}

void
VehicleHarshEventResponse_location::setAddress(std::string  address)
{
	this->address = address;
}

std::string
VehicleHarshEventResponse_location::getLatitude()
{
	return latitude;
}

void
VehicleHarshEventResponse_location::setLatitude(std::string  latitude)
{
	this->latitude = latitude;
}

std::string
VehicleHarshEventResponse_location::getLongitude()
{
	return longitude;
}

void
VehicleHarshEventResponse_location::setLongitude(std::string  longitude)
{
	this->longitude = longitude;
}


