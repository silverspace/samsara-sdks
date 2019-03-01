#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VehicleLocation.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VehicleLocation::VehicleLocation()
{
	//__init();
}

VehicleLocation::~VehicleLocation()
{
	//__cleanup();
}

void
VehicleLocation::__init()
{
	//heading = double(0);
	//id = long(0);
	//latitude = double(0);
	//location = std::string();
	//longitude = double(0);
	//name = std::string();
	//odometerMeters = long(0);
	//onTrip = bool(false);
	//speed = double(0);
	//time = int(0);
	//vin = std::string();
}

void
VehicleLocation::__cleanup()
{
	//if(heading != NULL) {
	//
	//delete heading;
	//heading = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
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
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(odometerMeters != NULL) {
	//
	//delete odometerMeters;
	//odometerMeters = NULL;
	//}
	//if(onTrip != NULL) {
	//
	//delete onTrip;
	//onTrip = NULL;
	//}
	//if(speed != NULL) {
	//
	//delete speed;
	//speed = NULL;
	//}
	//if(time != NULL) {
	//
	//delete time;
	//time = NULL;
	//}
	//if(vin != NULL) {
	//
	//delete vin;
	//vin = NULL;
	//}
	//
}

void
VehicleLocation::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *headingKey = "heading";
	node = json_object_get_member(pJsonObject, headingKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&heading, node, "double", "");
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *odometerMetersKey = "odometerMeters";
	node = json_object_get_member(pJsonObject, odometerMetersKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&odometerMeters, node, "long long", "");
		} else {
			
		}
	}
	const gchar *onTripKey = "onTrip";
	node = json_object_get_member(pJsonObject, onTripKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&onTrip, node, "bool", "");
		} else {
			
		}
	}
	const gchar *speedKey = "speed";
	node = json_object_get_member(pJsonObject, speedKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&speed, node, "double", "");
		} else {
			
		}
	}
	const gchar *timeKey = "time";
	node = json_object_get_member(pJsonObject, timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&time, node, "int", "");
		} else {
			
		}
	}
	const gchar *vinKey = "vin";
	node = json_object_get_member(pJsonObject, vinKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&vin, node, "std::string", "");
		} else {
			
		}
	}
}

VehicleLocation::VehicleLocation(char* json)
{
	this->fromJson(json);
}

char*
VehicleLocation::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("double")) {
		double obj = getHeading();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *headingKey = "heading";
	json_object_set_member(pJsonObject, headingKey, node);
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getOdometerMeters();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *odometerMetersKey = "odometerMeters";
	json_object_set_member(pJsonObject, odometerMetersKey, node);
	if (isprimitive("bool")) {
		bool obj = getOnTrip();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *onTripKey = "onTrip";
	json_object_set_member(pJsonObject, onTripKey, node);
	if (isprimitive("double")) {
		double obj = getSpeed();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *speedKey = "speed";
	json_object_set_member(pJsonObject, speedKey, node);
	if (isprimitive("int")) {
		int obj = getTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *timeKey = "time";
	json_object_set_member(pJsonObject, timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVin();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *vinKey = "vin";
	json_object_set_member(pJsonObject, vinKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

double
VehicleLocation::getHeading()
{
	return heading;
}

void
VehicleLocation::setHeading(double  heading)
{
	this->heading = heading;
}

long long
VehicleLocation::getId()
{
	return id;
}

void
VehicleLocation::setId(long long  id)
{
	this->id = id;
}

double
VehicleLocation::getLatitude()
{
	return latitude;
}

void
VehicleLocation::setLatitude(double  latitude)
{
	this->latitude = latitude;
}

std::string
VehicleLocation::getLocation()
{
	return location;
}

void
VehicleLocation::setLocation(std::string  location)
{
	this->location = location;
}

double
VehicleLocation::getLongitude()
{
	return longitude;
}

void
VehicleLocation::setLongitude(double  longitude)
{
	this->longitude = longitude;
}

std::string
VehicleLocation::getName()
{
	return name;
}

void
VehicleLocation::setName(std::string  name)
{
	this->name = name;
}

long long
VehicleLocation::getOdometerMeters()
{
	return odometerMeters;
}

void
VehicleLocation::setOdometerMeters(long long  odometerMeters)
{
	this->odometerMeters = odometerMeters;
}

bool
VehicleLocation::getOnTrip()
{
	return onTrip;
}

void
VehicleLocation::setOnTrip(bool  onTrip)
{
	this->onTrip = onTrip;
}

double
VehicleLocation::getSpeed()
{
	return speed;
}

void
VehicleLocation::setSpeed(double  speed)
{
	this->speed = speed;
}

int
VehicleLocation::getTime()
{
	return time;
}

void
VehicleLocation::setTime(int  time)
{
	this->time = time;
}

std::string
VehicleLocation::getVin()
{
	return vin;
}

void
VehicleLocation::setVin(std::string  vin)
{
	this->vin = vin;
}


