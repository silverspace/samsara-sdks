#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Vehicle.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Vehicle::Vehicle()
{
	//__init();
}

Vehicle::~Vehicle()
{
	//__cleanup();
}

void
Vehicle::__init()
{
	//engineHours = long(0);
	//fuelLevelPercent = double(0);
	//id = long(0);
	//name = std::string();
	//note = std::string();
	//odometerMeters = long(0);
	//vin = std::string();
}

void
Vehicle::__cleanup()
{
	//if(engineHours != NULL) {
	//
	//delete engineHours;
	//engineHours = NULL;
	//}
	//if(fuelLevelPercent != NULL) {
	//
	//delete fuelLevelPercent;
	//fuelLevelPercent = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(note != NULL) {
	//
	//delete note;
	//note = NULL;
	//}
	//if(odometerMeters != NULL) {
	//
	//delete odometerMeters;
	//odometerMeters = NULL;
	//}
	//if(vin != NULL) {
	//
	//delete vin;
	//vin = NULL;
	//}
	//
}

void
Vehicle::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *engineHoursKey = "engineHours";
	node = json_object_get_member(pJsonObject, engineHoursKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&engineHours, node, "long long", "");
		} else {
			
		}
	}
	const gchar *fuelLevelPercentKey = "fuelLevelPercent";
	node = json_object_get_member(pJsonObject, fuelLevelPercentKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&fuelLevelPercent, node, "double", "");
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *noteKey = "note";
	node = json_object_get_member(pJsonObject, noteKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&note, node, "std::string", "");
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
	const gchar *vinKey = "vin";
	node = json_object_get_member(pJsonObject, vinKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&vin, node, "std::string", "");
		} else {
			
		}
	}
}

Vehicle::Vehicle(char* json)
{
	this->fromJson(json);
}

char*
Vehicle::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getEngineHours();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *engineHoursKey = "engineHours";
	json_object_set_member(pJsonObject, engineHoursKey, node);
	if (isprimitive("double")) {
		double obj = getFuelLevelPercent();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *fuelLevelPercentKey = "fuelLevelPercent";
	json_object_set_member(pJsonObject, fuelLevelPercentKey, node);
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNote();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *noteKey = "note";
	json_object_set_member(pJsonObject, noteKey, node);
	if (isprimitive("long long")) {
		long long obj = getOdometerMeters();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *odometerMetersKey = "odometerMeters";
	json_object_set_member(pJsonObject, odometerMetersKey, node);
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

long long
Vehicle::getEngineHours()
{
	return engineHours;
}

void
Vehicle::setEngineHours(long long  engineHours)
{
	this->engineHours = engineHours;
}

double
Vehicle::getFuelLevelPercent()
{
	return fuelLevelPercent;
}

void
Vehicle::setFuelLevelPercent(double  fuelLevelPercent)
{
	this->fuelLevelPercent = fuelLevelPercent;
}

long long
Vehicle::getId()
{
	return id;
}

void
Vehicle::setId(long long  id)
{
	this->id = id;
}

std::string
Vehicle::getName()
{
	return name;
}

void
Vehicle::setName(std::string  name)
{
	this->name = name;
}

std::string
Vehicle::getNote()
{
	return note;
}

void
Vehicle::setNote(std::string  note)
{
	this->note = note;
}

long long
Vehicle::getOdometerMeters()
{
	return odometerMeters;
}

void
Vehicle::setOdometerMeters(long long  odometerMeters)
{
	this->odometerMeters = odometerMeters;
}

std::string
Vehicle::getVin()
{
	return vin;
}

void
Vehicle::setVin(std::string  vin)
{
	this->vin = vin;
}


