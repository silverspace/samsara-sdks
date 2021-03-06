#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FleetVehicleLocation.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FleetVehicleLocation::FleetVehicleLocation()
{
	//__init();
}

FleetVehicleLocation::~FleetVehicleLocation()
{
	//__cleanup();
}

void
FleetVehicleLocation::__init()
{
	//latitude = double(0);
	//location = std::string();
	//longitude = double(0);
	//speedMilesPerHour = double(0);
	//timeMs = long(0);
}

void
FleetVehicleLocation::__cleanup()
{
	//if(latitude != NULL) {
	//
	//delete latitude;
	//latitude = NULL;
	//}
	//if(location != NULL) {
	//
	//delete location;
	//location = NULL;
	//}
	//if(longitude != NULL) {
	//
	//delete longitude;
	//longitude = NULL;
	//}
	//if(speedMilesPerHour != NULL) {
	//
	//delete speedMilesPerHour;
	//speedMilesPerHour = NULL;
	//}
	//if(timeMs != NULL) {
	//
	//delete timeMs;
	//timeMs = NULL;
	//}
	//
}

void
FleetVehicleLocation::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *latitudeKey = "latitude";
	node = json_object_get_member(pJsonObject, latitudeKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&latitude, node, "double", "");
		} else {
			
		}
	}
	const gchar *locationKey = "location";
	node = json_object_get_member(pJsonObject, locationKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&location, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *longitudeKey = "longitude";
	node = json_object_get_member(pJsonObject, longitudeKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&longitude, node, "double", "");
		} else {
			
		}
	}
	const gchar *speedMilesPerHourKey = "speedMilesPerHour";
	node = json_object_get_member(pJsonObject, speedMilesPerHourKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&speedMilesPerHour, node, "double", "");
		} else {
			
		}
	}
	const gchar *timeMsKey = "timeMs";
	node = json_object_get_member(pJsonObject, timeMsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&timeMs, node, "long long", "");
		} else {
			
		}
	}
}

FleetVehicleLocation::FleetVehicleLocation(char* json)
{
	this->fromJson(json);
}

char*
FleetVehicleLocation::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("double")) {
		double obj = getLatitude();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *latitudeKey = "latitude";
	json_object_set_member(pJsonObject, latitudeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLocation();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *locationKey = "location";
	json_object_set_member(pJsonObject, locationKey, node);
	if (isprimitive("double")) {
		double obj = getLongitude();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *longitudeKey = "longitude";
	json_object_set_member(pJsonObject, longitudeKey, node);
	if (isprimitive("double")) {
		double obj = getSpeedMilesPerHour();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *speedMilesPerHourKey = "speedMilesPerHour";
	json_object_set_member(pJsonObject, speedMilesPerHourKey, node);
	if (isprimitive("long long")) {
		long long obj = getTimeMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *timeMsKey = "timeMs";
	json_object_set_member(pJsonObject, timeMsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

double
FleetVehicleLocation::getLatitude()
{
	return latitude;
}

void
FleetVehicleLocation::setLatitude(double  latitude)
{
	this->latitude = latitude;
}

std::string
FleetVehicleLocation::getLocation()
{
	return location;
}

void
FleetVehicleLocation::setLocation(std::string  location)
{
	this->location = location;
}

double
FleetVehicleLocation::getLongitude()
{
	return longitude;
}

void
FleetVehicleLocation::setLongitude(double  longitude)
{
	this->longitude = longitude;
}

double
FleetVehicleLocation::getSpeedMilesPerHour()
{
	return speedMilesPerHour;
}

void
FleetVehicleLocation::setSpeedMilesPerHour(double  speedMilesPerHour)
{
	this->speedMilesPerHour = speedMilesPerHour;
}

long long
FleetVehicleLocation::getTimeMs()
{
	return timeMs;
}

void
FleetVehicleLocation::setTimeMs(long long  timeMs)
{
	this->timeMs = timeMs;
}


