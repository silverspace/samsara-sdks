#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TripResponse_trips.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TripResponse_trips::TripResponse_trips()
{
	//__init();
}

TripResponse_trips::~TripResponse_trips()
{
	//__cleanup();
}

void
TripResponse_trips::__init()
{
	//endOdometer = int(0);
	//distanceMeters = int(0);
	//endMs = int(0);
	//startMs = int(0);
	//fuelConsumedMl = int(0);
	//startAddress = std::string();
	//startCoordinates = new TripResponse_startCoordinates();
	//endCoordinates = new TripResponse_endCoordinates();
	//startOdometer = int(0);
	//driverId = int(0);
	//startLocation = std::string();
	//tollMeters = int(0);
	//endAddress = std::string();
	//endLocation = std::string();
}

void
TripResponse_trips::__cleanup()
{
	//if(endOdometer != NULL) {
	//
	//delete endOdometer;
	//endOdometer = NULL;
	//}
	//if(distanceMeters != NULL) {
	//
	//delete distanceMeters;
	//distanceMeters = NULL;
	//}
	//if(endMs != NULL) {
	//
	//delete endMs;
	//endMs = NULL;
	//}
	//if(startMs != NULL) {
	//
	//delete startMs;
	//startMs = NULL;
	//}
	//if(fuelConsumedMl != NULL) {
	//
	//delete fuelConsumedMl;
	//fuelConsumedMl = NULL;
	//}
	//if(startAddress != NULL) {
	//
	//delete startAddress;
	//startAddress = NULL;
	//}
	//if(startCoordinates != NULL) {
	//
	//delete startCoordinates;
	//startCoordinates = NULL;
	//}
	//if(endCoordinates != NULL) {
	//
	//delete endCoordinates;
	//endCoordinates = NULL;
	//}
	//if(startOdometer != NULL) {
	//
	//delete startOdometer;
	//startOdometer = NULL;
	//}
	//if(driverId != NULL) {
	//
	//delete driverId;
	//driverId = NULL;
	//}
	//if(startLocation != NULL) {
	//
	//delete startLocation;
	//startLocation = NULL;
	//}
	//if(tollMeters != NULL) {
	//
	//delete tollMeters;
	//tollMeters = NULL;
	//}
	//if(endAddress != NULL) {
	//
	//delete endAddress;
	//endAddress = NULL;
	//}
	//if(endLocation != NULL) {
	//
	//delete endLocation;
	//endLocation = NULL;
	//}
	//
}

void
TripResponse_trips::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *endOdometerKey = "endOdometer";
	node = json_object_get_member(pJsonObject, endOdometerKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&endOdometer, node, "int", "");
		} else {
			
		}
	}
	const gchar *distanceMetersKey = "distanceMeters";
	node = json_object_get_member(pJsonObject, distanceMetersKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&distanceMeters, node, "int", "");
		} else {
			
		}
	}
	const gchar *endMsKey = "endMs";
	node = json_object_get_member(pJsonObject, endMsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&endMs, node, "int", "");
		} else {
			
		}
	}
	const gchar *startMsKey = "startMs";
	node = json_object_get_member(pJsonObject, startMsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&startMs, node, "int", "");
		} else {
			
		}
	}
	const gchar *fuelConsumedMlKey = "fuelConsumedMl";
	node = json_object_get_member(pJsonObject, fuelConsumedMlKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&fuelConsumedMl, node, "int", "");
		} else {
			
		}
	}
	const gchar *startAddressKey = "startAddress";
	node = json_object_get_member(pJsonObject, startAddressKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&startAddress, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *startCoordinatesKey = "startCoordinates";
	node = json_object_get_member(pJsonObject, startCoordinatesKey);
	if (node !=NULL) {
	

		if (isprimitive("TripResponse_startCoordinates")) {
			jsonToValue(&startCoordinates, node, "TripResponse_startCoordinates", "TripResponse_startCoordinates");
		} else {
			
			TripResponse_startCoordinates* obj = static_cast<TripResponse_startCoordinates*> (&startCoordinates);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *endCoordinatesKey = "endCoordinates";
	node = json_object_get_member(pJsonObject, endCoordinatesKey);
	if (node !=NULL) {
	

		if (isprimitive("TripResponse_endCoordinates")) {
			jsonToValue(&endCoordinates, node, "TripResponse_endCoordinates", "TripResponse_endCoordinates");
		} else {
			
			TripResponse_endCoordinates* obj = static_cast<TripResponse_endCoordinates*> (&endCoordinates);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *startOdometerKey = "startOdometer";
	node = json_object_get_member(pJsonObject, startOdometerKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&startOdometer, node, "int", "");
		} else {
			
		}
	}
	const gchar *driverIdKey = "driverId";
	node = json_object_get_member(pJsonObject, driverIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&driverId, node, "int", "");
		} else {
			
		}
	}
	const gchar *startLocationKey = "startLocation";
	node = json_object_get_member(pJsonObject, startLocationKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&startLocation, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *tollMetersKey = "tollMeters";
	node = json_object_get_member(pJsonObject, tollMetersKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&tollMeters, node, "int", "");
		} else {
			
		}
	}
	const gchar *endAddressKey = "endAddress";
	node = json_object_get_member(pJsonObject, endAddressKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&endAddress, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *endLocationKey = "endLocation";
	node = json_object_get_member(pJsonObject, endLocationKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&endLocation, node, "std::string", "");
		} else {
			
		}
	}
}

TripResponse_trips::TripResponse_trips(char* json)
{
	this->fromJson(json);
}

char*
TripResponse_trips::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getEndOdometer();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *endOdometerKey = "endOdometer";
	json_object_set_member(pJsonObject, endOdometerKey, node);
	if (isprimitive("int")) {
		int obj = getDistanceMeters();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *distanceMetersKey = "distanceMeters";
	json_object_set_member(pJsonObject, distanceMetersKey, node);
	if (isprimitive("int")) {
		int obj = getEndMs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *endMsKey = "endMs";
	json_object_set_member(pJsonObject, endMsKey, node);
	if (isprimitive("int")) {
		int obj = getStartMs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *startMsKey = "startMs";
	json_object_set_member(pJsonObject, startMsKey, node);
	if (isprimitive("int")) {
		int obj = getFuelConsumedMl();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *fuelConsumedMlKey = "fuelConsumedMl";
	json_object_set_member(pJsonObject, fuelConsumedMlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStartAddress();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *startAddressKey = "startAddress";
	json_object_set_member(pJsonObject, startAddressKey, node);
	if (isprimitive("TripResponse_startCoordinates")) {
		TripResponse_startCoordinates obj = getStartCoordinates();
		node = converttoJson(&obj, "TripResponse_startCoordinates", "");
	}
	else {
		
		TripResponse_startCoordinates obj = static_cast<TripResponse_startCoordinates> (getStartCoordinates());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *startCoordinatesKey = "startCoordinates";
	json_object_set_member(pJsonObject, startCoordinatesKey, node);
	if (isprimitive("TripResponse_endCoordinates")) {
		TripResponse_endCoordinates obj = getEndCoordinates();
		node = converttoJson(&obj, "TripResponse_endCoordinates", "");
	}
	else {
		
		TripResponse_endCoordinates obj = static_cast<TripResponse_endCoordinates> (getEndCoordinates());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *endCoordinatesKey = "endCoordinates";
	json_object_set_member(pJsonObject, endCoordinatesKey, node);
	if (isprimitive("int")) {
		int obj = getStartOdometer();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *startOdometerKey = "startOdometer";
	json_object_set_member(pJsonObject, startOdometerKey, node);
	if (isprimitive("int")) {
		int obj = getDriverId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *driverIdKey = "driverId";
	json_object_set_member(pJsonObject, driverIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStartLocation();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *startLocationKey = "startLocation";
	json_object_set_member(pJsonObject, startLocationKey, node);
	if (isprimitive("int")) {
		int obj = getTollMeters();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *tollMetersKey = "tollMeters";
	json_object_set_member(pJsonObject, tollMetersKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEndAddress();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *endAddressKey = "endAddress";
	json_object_set_member(pJsonObject, endAddressKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEndLocation();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *endLocationKey = "endLocation";
	json_object_set_member(pJsonObject, endLocationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
TripResponse_trips::getEndOdometer()
{
	return endOdometer;
}

void
TripResponse_trips::setEndOdometer(int  endOdometer)
{
	this->endOdometer = endOdometer;
}

int
TripResponse_trips::getDistanceMeters()
{
	return distanceMeters;
}

void
TripResponse_trips::setDistanceMeters(int  distanceMeters)
{
	this->distanceMeters = distanceMeters;
}

int
TripResponse_trips::getEndMs()
{
	return endMs;
}

void
TripResponse_trips::setEndMs(int  endMs)
{
	this->endMs = endMs;
}

int
TripResponse_trips::getStartMs()
{
	return startMs;
}

void
TripResponse_trips::setStartMs(int  startMs)
{
	this->startMs = startMs;
}

int
TripResponse_trips::getFuelConsumedMl()
{
	return fuelConsumedMl;
}

void
TripResponse_trips::setFuelConsumedMl(int  fuelConsumedMl)
{
	this->fuelConsumedMl = fuelConsumedMl;
}

std::string
TripResponse_trips::getStartAddress()
{
	return startAddress;
}

void
TripResponse_trips::setStartAddress(std::string  startAddress)
{
	this->startAddress = startAddress;
}

TripResponse_startCoordinates
TripResponse_trips::getStartCoordinates()
{
	return startCoordinates;
}

void
TripResponse_trips::setStartCoordinates(TripResponse_startCoordinates  startCoordinates)
{
	this->startCoordinates = startCoordinates;
}

TripResponse_endCoordinates
TripResponse_trips::getEndCoordinates()
{
	return endCoordinates;
}

void
TripResponse_trips::setEndCoordinates(TripResponse_endCoordinates  endCoordinates)
{
	this->endCoordinates = endCoordinates;
}

int
TripResponse_trips::getStartOdometer()
{
	return startOdometer;
}

void
TripResponse_trips::setStartOdometer(int  startOdometer)
{
	this->startOdometer = startOdometer;
}

int
TripResponse_trips::getDriverId()
{
	return driverId;
}

void
TripResponse_trips::setDriverId(int  driverId)
{
	this->driverId = driverId;
}

std::string
TripResponse_trips::getStartLocation()
{
	return startLocation;
}

void
TripResponse_trips::setStartLocation(std::string  startLocation)
{
	this->startLocation = startLocation;
}

int
TripResponse_trips::getTollMeters()
{
	return tollMeters;
}

void
TripResponse_trips::setTollMeters(int  tollMeters)
{
	this->tollMeters = tollMeters;
}

std::string
TripResponse_trips::getEndAddress()
{
	return endAddress;
}

void
TripResponse_trips::setEndAddress(std::string  endAddress)
{
	this->endAddress = endAddress;
}

std::string
TripResponse_trips::getEndLocation()
{
	return endLocation;
}

void
TripResponse_trips::setEndLocation(std::string  endLocation)
{
	this->endLocation = endLocation;
}


