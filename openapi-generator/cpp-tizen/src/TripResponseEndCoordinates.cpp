#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TripResponse_endCoordinates.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TripResponse_endCoordinates::TripResponse_endCoordinates()
{
	//__init();
}

TripResponse_endCoordinates::~TripResponse_endCoordinates()
{
	//__cleanup();
}

void
TripResponse_endCoordinates::__init()
{
	//latitude = double(0);
	//longitude = double(0);
}

void
TripResponse_endCoordinates::__cleanup()
{
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
TripResponse_endCoordinates::fromJson(char* jsonStr)
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
	const gchar *longitudeKey = "longitude";
	node = json_object_get_member(pJsonObject, longitudeKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&longitude, node, "double", "");
		} else {
			
		}
	}
}

TripResponse_endCoordinates::TripResponse_endCoordinates(char* json)
{
	this->fromJson(json);
}

char*
TripResponse_endCoordinates::toJson()
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
TripResponse_endCoordinates::getLatitude()
{
	return latitude;
}

void
TripResponse_endCoordinates::setLatitude(double  latitude)
{
	this->latitude = latitude;
}

double
TripResponse_endCoordinates::getLongitude()
{
	return longitude;
}

void
TripResponse_endCoordinates::setLongitude(double  longitude)
{
	this->longitude = longitude;
}


