#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VehicleMaintenance.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VehicleMaintenance::VehicleMaintenance()
{
	//__init();
}

VehicleMaintenance::~VehicleMaintenance()
{
	//__cleanup();
}

void
VehicleMaintenance::__init()
{
	//id = long(0);
	//j1939 = new VehicleMaintenance_j1939();
	//passenger = new VehicleMaintenance_passenger();
}

void
VehicleMaintenance::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(j1939 != NULL) {
	//
	//delete j1939;
	//j1939 = NULL;
	//}
	//if(passenger != NULL) {
	//
	//delete passenger;
	//passenger = NULL;
	//}
	//
}

void
VehicleMaintenance::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *j1939Key = "j1939";
	node = json_object_get_member(pJsonObject, j1939Key);
	if (node !=NULL) {
	

		if (isprimitive("VehicleMaintenance_j1939")) {
			jsonToValue(&j1939, node, "VehicleMaintenance_j1939", "VehicleMaintenance_j1939");
		} else {
			
			VehicleMaintenance_j1939* obj = static_cast<VehicleMaintenance_j1939*> (&j1939);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *passengerKey = "passenger";
	node = json_object_get_member(pJsonObject, passengerKey);
	if (node !=NULL) {
	

		if (isprimitive("VehicleMaintenance_passenger")) {
			jsonToValue(&passenger, node, "VehicleMaintenance_passenger", "VehicleMaintenance_passenger");
		} else {
			
			VehicleMaintenance_passenger* obj = static_cast<VehicleMaintenance_passenger*> (&passenger);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

VehicleMaintenance::VehicleMaintenance(char* json)
{
	this->fromJson(json);
}

char*
VehicleMaintenance::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("VehicleMaintenance_j1939")) {
		VehicleMaintenance_j1939 obj = getJ1939();
		node = converttoJson(&obj, "VehicleMaintenance_j1939", "");
	}
	else {
		
		VehicleMaintenance_j1939 obj = static_cast<VehicleMaintenance_j1939> (getJ1939());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *j1939Key = "j1939";
	json_object_set_member(pJsonObject, j1939Key, node);
	if (isprimitive("VehicleMaintenance_passenger")) {
		VehicleMaintenance_passenger obj = getPassenger();
		node = converttoJson(&obj, "VehicleMaintenance_passenger", "");
	}
	else {
		
		VehicleMaintenance_passenger obj = static_cast<VehicleMaintenance_passenger> (getPassenger());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *passengerKey = "passenger";
	json_object_set_member(pJsonObject, passengerKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
VehicleMaintenance::getId()
{
	return id;
}

void
VehicleMaintenance::setId(long long  id)
{
	this->id = id;
}

VehicleMaintenance_j1939
VehicleMaintenance::getJ1939()
{
	return j1939;
}

void
VehicleMaintenance::setJ1939(VehicleMaintenance_j1939  j1939)
{
	this->j1939 = j1939;
}

VehicleMaintenance_passenger
VehicleMaintenance::getPassenger()
{
	return passenger;
}

void
VehicleMaintenance::setPassenger(VehicleMaintenance_passenger  passenger)
{
	this->passenger = passenger;
}


