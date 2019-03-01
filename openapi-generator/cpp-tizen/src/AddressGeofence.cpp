#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AddressGeofence.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AddressGeofence::AddressGeofence()
{
	//__init();
}

AddressGeofence::~AddressGeofence()
{
	//__cleanup();
}

void
AddressGeofence::__init()
{
	//circle = new AddressGeofence_circle();
	//polygon = new AddressGeofence_polygon();
}

void
AddressGeofence::__cleanup()
{
	//if(circle != NULL) {
	//
	//delete circle;
	//circle = NULL;
	//}
	//if(polygon != NULL) {
	//
	//delete polygon;
	//polygon = NULL;
	//}
	//
}

void
AddressGeofence::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *circleKey = "circle";
	node = json_object_get_member(pJsonObject, circleKey);
	if (node !=NULL) {
	

		if (isprimitive("AddressGeofence_circle")) {
			jsonToValue(&circle, node, "AddressGeofence_circle", "AddressGeofence_circle");
		} else {
			
			AddressGeofence_circle* obj = static_cast<AddressGeofence_circle*> (&circle);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *polygonKey = "polygon";
	node = json_object_get_member(pJsonObject, polygonKey);
	if (node !=NULL) {
	

		if (isprimitive("AddressGeofence_polygon")) {
			jsonToValue(&polygon, node, "AddressGeofence_polygon", "AddressGeofence_polygon");
		} else {
			
			AddressGeofence_polygon* obj = static_cast<AddressGeofence_polygon*> (&polygon);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AddressGeofence::AddressGeofence(char* json)
{
	this->fromJson(json);
}

char*
AddressGeofence::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AddressGeofence_circle")) {
		AddressGeofence_circle obj = getCircle();
		node = converttoJson(&obj, "AddressGeofence_circle", "");
	}
	else {
		
		AddressGeofence_circle obj = static_cast<AddressGeofence_circle> (getCircle());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *circleKey = "circle";
	json_object_set_member(pJsonObject, circleKey, node);
	if (isprimitive("AddressGeofence_polygon")) {
		AddressGeofence_polygon obj = getPolygon();
		node = converttoJson(&obj, "AddressGeofence_polygon", "");
	}
	else {
		
		AddressGeofence_polygon obj = static_cast<AddressGeofence_polygon> (getPolygon());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *polygonKey = "polygon";
	json_object_set_member(pJsonObject, polygonKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AddressGeofence_circle
AddressGeofence::getCircle()
{
	return circle;
}

void
AddressGeofence::setCircle(AddressGeofence_circle  circle)
{
	this->circle = circle;
}

AddressGeofence_polygon
AddressGeofence::getPolygon()
{
	return polygon;
}

void
AddressGeofence::setPolygon(AddressGeofence_polygon  polygon)
{
	this->polygon = polygon;
}


