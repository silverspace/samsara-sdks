#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DriverDailyLogResponse_days.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DriverDailyLogResponse_days::DriverDailyLogResponse_days()
{
	//__init();
}

DriverDailyLogResponse_days::~DriverDailyLogResponse_days()
{
	//__cleanup();
}

void
DriverDailyLogResponse_days::__init()
{
	//certifiedAtMs = long(0);
	//endMs = int(0);
	//startMs = int(0);
	//trailerIds = null;
	//activeHours = double(0);
	//distanceMiles = double(0);
	//activeMs = long(0);
	//certified = bool(false);
	//vehicleIds = null;
}

void
DriverDailyLogResponse_days::__cleanup()
{
	//if(certifiedAtMs != NULL) {
	//
	//delete certifiedAtMs;
	//certifiedAtMs = NULL;
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
	//if(trailerIds != NULL) {
	//
	//delete trailerIds;
	//trailerIds = NULL;
	//}
	//if(activeHours != NULL) {
	//
	//delete activeHours;
	//activeHours = NULL;
	//}
	//if(distanceMiles != NULL) {
	//
	//delete distanceMiles;
	//distanceMiles = NULL;
	//}
	//if(activeMs != NULL) {
	//
	//delete activeMs;
	//activeMs = NULL;
	//}
	//if(certified != NULL) {
	//
	//delete certified;
	//certified = NULL;
	//}
	//if(vehicleIds != NULL) {
	//
	//delete vehicleIds;
	//vehicleIds = NULL;
	//}
	//
}

void
DriverDailyLogResponse_days::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *certifiedAtMsKey = "certifiedAtMs";
	node = json_object_get_member(pJsonObject, certifiedAtMsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&certifiedAtMs, node, "long long", "");
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
	const gchar *trailerIdsKey = "trailerIds";
	node = json_object_get_member(pJsonObject, trailerIdsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&trailerIds, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&trailerIds);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *activeHoursKey = "activeHours";
	node = json_object_get_member(pJsonObject, activeHoursKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&activeHours, node, "double", "");
		} else {
			
		}
	}
	const gchar *distanceMilesKey = "distanceMiles";
	node = json_object_get_member(pJsonObject, distanceMilesKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&distanceMiles, node, "double", "");
		} else {
			
		}
	}
	const gchar *activeMsKey = "activeMs";
	node = json_object_get_member(pJsonObject, activeMsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&activeMs, node, "long long", "");
		} else {
			
		}
	}
	const gchar *certifiedKey = "certified";
	node = json_object_get_member(pJsonObject, certifiedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&certified, node, "bool", "");
		} else {
			
		}
	}
	const gchar *vehicleIdsKey = "vehicleIds";
	node = json_object_get_member(pJsonObject, vehicleIdsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&vehicleIds, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&vehicleIds);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

DriverDailyLogResponse_days::DriverDailyLogResponse_days(char* json)
{
	this->fromJson(json);
}

char*
DriverDailyLogResponse_days::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getCertifiedAtMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *certifiedAtMsKey = "certifiedAtMs";
	json_object_set_member(pJsonObject, certifiedAtMsKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getTrailerIds();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getTrailerIds());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *trailerIdsKey = "trailerIds";
	json_object_set_member(pJsonObject, trailerIdsKey, node);
	if (isprimitive("double")) {
		double obj = getActiveHours();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *activeHoursKey = "activeHours";
	json_object_set_member(pJsonObject, activeHoursKey, node);
	if (isprimitive("double")) {
		double obj = getDistanceMiles();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *distanceMilesKey = "distanceMiles";
	json_object_set_member(pJsonObject, distanceMilesKey, node);
	if (isprimitive("long long")) {
		long long obj = getActiveMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *activeMsKey = "activeMs";
	json_object_set_member(pJsonObject, activeMsKey, node);
	if (isprimitive("bool")) {
		bool obj = getCertified();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *certifiedKey = "certified";
	json_object_set_member(pJsonObject, certifiedKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVehicleIds();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getVehicleIds());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *vehicleIdsKey = "vehicleIds";
	json_object_set_member(pJsonObject, vehicleIdsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
DriverDailyLogResponse_days::getCertifiedAtMs()
{
	return certifiedAtMs;
}

void
DriverDailyLogResponse_days::setCertifiedAtMs(long long  certifiedAtMs)
{
	this->certifiedAtMs = certifiedAtMs;
}

int
DriverDailyLogResponse_days::getEndMs()
{
	return endMs;
}

void
DriverDailyLogResponse_days::setEndMs(int  endMs)
{
	this->endMs = endMs;
}

int
DriverDailyLogResponse_days::getStartMs()
{
	return startMs;
}

void
DriverDailyLogResponse_days::setStartMs(int  startMs)
{
	this->startMs = startMs;
}

std::string
DriverDailyLogResponse_days::getTrailerIds()
{
	return trailerIds;
}

void
DriverDailyLogResponse_days::setTrailerIds(std::string  trailerIds)
{
	this->trailerIds = trailerIds;
}

double
DriverDailyLogResponse_days::getActiveHours()
{
	return activeHours;
}

void
DriverDailyLogResponse_days::setActiveHours(double  activeHours)
{
	this->activeHours = activeHours;
}

double
DriverDailyLogResponse_days::getDistanceMiles()
{
	return distanceMiles;
}

void
DriverDailyLogResponse_days::setDistanceMiles(double  distanceMiles)
{
	this->distanceMiles = distanceMiles;
}

long long
DriverDailyLogResponse_days::getActiveMs()
{
	return activeMs;
}

void
DriverDailyLogResponse_days::setActiveMs(long long  activeMs)
{
	this->activeMs = activeMs;
}

bool
DriverDailyLogResponse_days::getCertified()
{
	return certified;
}

void
DriverDailyLogResponse_days::setCertified(bool  certified)
{
	this->certified = certified;
}

std::string
DriverDailyLogResponse_days::getVehicleIds()
{
	return vehicleIds;
}

void
DriverDailyLogResponse_days::setVehicleIds(std::string  vehicleIds)
{
	this->vehicleIds = vehicleIds;
}


