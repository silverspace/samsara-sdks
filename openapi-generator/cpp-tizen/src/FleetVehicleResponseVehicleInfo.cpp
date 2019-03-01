#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FleetVehicleResponse_vehicleInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FleetVehicleResponse_vehicleInfo::FleetVehicleResponse_vehicleInfo()
{
	//__init();
}

FleetVehicleResponse_vehicleInfo::~FleetVehicleResponse_vehicleInfo()
{
	//__cleanup();
}

void
FleetVehicleResponse_vehicleInfo::__init()
{
	//year = long(0);
	//model = std::string();
	//vin = std::string();
	//make = std::string();
}

void
FleetVehicleResponse_vehicleInfo::__cleanup()
{
	//if(year != NULL) {
	//
	//delete year;
	//year = NULL;
	//}
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(vin != NULL) {
	//
	//delete vin;
	//vin = NULL;
	//}
	//if(make != NULL) {
	//
	//delete make;
	//make = NULL;
	//}
	//
}

void
FleetVehicleResponse_vehicleInfo::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *yearKey = "year";
	node = json_object_get_member(pJsonObject, yearKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&year, node, "long long", "");
		} else {
			
		}
	}
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&model, node, "std::string", "");
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
	const gchar *makeKey = "make";
	node = json_object_get_member(pJsonObject, makeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&make, node, "std::string", "");
		} else {
			
		}
	}
}

FleetVehicleResponse_vehicleInfo::FleetVehicleResponse_vehicleInfo(char* json)
{
	this->fromJson(json);
}

char*
FleetVehicleResponse_vehicleInfo::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getYear();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *yearKey = "year";
	json_object_set_member(pJsonObject, yearKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVin();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *vinKey = "vin";
	json_object_set_member(pJsonObject, vinKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMake();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *makeKey = "make";
	json_object_set_member(pJsonObject, makeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
FleetVehicleResponse_vehicleInfo::getYear()
{
	return year;
}

void
FleetVehicleResponse_vehicleInfo::setYear(long long  year)
{
	this->year = year;
}

std::string
FleetVehicleResponse_vehicleInfo::getModel()
{
	return model;
}

void
FleetVehicleResponse_vehicleInfo::setModel(std::string  model)
{
	this->model = model;
}

std::string
FleetVehicleResponse_vehicleInfo::getVin()
{
	return vin;
}

void
FleetVehicleResponse_vehicleInfo::setVin(std::string  vin)
{
	this->vin = vin;
}

std::string
FleetVehicleResponse_vehicleInfo::getMake()
{
	return make;
}

void
FleetVehicleResponse_vehicleInfo::setMake(std::string  make)
{
	this->make = make;
}


