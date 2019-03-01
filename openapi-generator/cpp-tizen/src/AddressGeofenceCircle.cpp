#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AddressGeofence_circle.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AddressGeofence_circle::AddressGeofence_circle()
{
	//__init();
}

AddressGeofence_circle::~AddressGeofence_circle()
{
	//__cleanup();
}

void
AddressGeofence_circle::__init()
{
	//latitude = double(0);
	//radiusMeters = long(0);
	//longitude = double(0);
}

void
AddressGeofence_circle::__cleanup()
{
	//if(latitude != NULL) {
	//
	//delete latitude;
	//latitude = NULL;
	//}
	//if(radiusMeters != NULL) {
	//
	//delete radiusMeters;
	//radiusMeters = NULL;
	//}
	//if(longitude != NULL) {
	//
	//delete longitude;
	//longitude = NULL;
	//}
	//
}

void
AddressGeofence_circle::fromJson(char* jsonStr)
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
	const gchar *radiusMetersKey = "radiusMeters";
	node = json_object_get_member(pJsonObject, radiusMetersKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&radiusMeters, node, "long long", "");
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
}

AddressGeofence_circle::AddressGeofence_circle(char* json)
{
	this->fromJson(json);
}

char*
AddressGeofence_circle::toJson()
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
	if (isprimitive("long long")) {
		long long obj = getRadiusMeters();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *radiusMetersKey = "radiusMeters";
	json_object_set_member(pJsonObject, radiusMetersKey, node);
	if (isprimitive("double")) {
		double obj = getLongitude();
		node = converttoJson(&obj, "double", "");
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

double
AddressGeofence_circle::getLatitude()
{
	return latitude;
}

void
AddressGeofence_circle::setLatitude(double  latitude)
{
	this->latitude = latitude;
}

long long
AddressGeofence_circle::getRadiusMeters()
{
	return radiusMeters;
}

void
AddressGeofence_circle::setRadiusMeters(long long  radiusMeters)
{
	this->radiusMeters = radiusMeters;
}

double
AddressGeofence_circle::getLongitude()
{
	return longitude;
}

void
AddressGeofence_circle::setLongitude(double  longitude)
{
	this->longitude = longitude;
}


