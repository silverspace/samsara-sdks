#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DriversSummaryResponse_Summaries.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DriversSummaryResponse_Summaries::DriversSummaryResponse_Summaries()
{
	//__init();
}

DriversSummaryResponse_Summaries::~DriversSummaryResponse_Summaries()
{
	//__cleanup();
}

void
DriversSummaryResponse_Summaries::__init()
{
	//driverId = long(0);
	//distanceMiles = double(0);
	//driveMs = long(0);
	//activeMs = long(0);
	//driverUsername = std::string();
	//groupId = long(0);
	//driverName = std::string();
	//onDutyMs = long(0);
}

void
DriversSummaryResponse_Summaries::__cleanup()
{
	//if(driverId != NULL) {
	//
	//delete driverId;
	//driverId = NULL;
	//}
	//if(distanceMiles != NULL) {
	//
	//delete distanceMiles;
	//distanceMiles = NULL;
	//}
	//if(driveMs != NULL) {
	//
	//delete driveMs;
	//driveMs = NULL;
	//}
	//if(activeMs != NULL) {
	//
	//delete activeMs;
	//activeMs = NULL;
	//}
	//if(driverUsername != NULL) {
	//
	//delete driverUsername;
	//driverUsername = NULL;
	//}
	//if(groupId != NULL) {
	//
	//delete groupId;
	//groupId = NULL;
	//}
	//if(driverName != NULL) {
	//
	//delete driverName;
	//driverName = NULL;
	//}
	//if(onDutyMs != NULL) {
	//
	//delete onDutyMs;
	//onDutyMs = NULL;
	//}
	//
}

void
DriversSummaryResponse_Summaries::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *driverIdKey = "driverId";
	node = json_object_get_member(pJsonObject, driverIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&driverId, node, "long long", "");
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
	const gchar *driveMsKey = "driveMs";
	node = json_object_get_member(pJsonObject, driveMsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&driveMs, node, "long long", "");
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
	const gchar *driverUsernameKey = "driverUsername";
	node = json_object_get_member(pJsonObject, driverUsernameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&driverUsername, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *groupIdKey = "groupId";
	node = json_object_get_member(pJsonObject, groupIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&groupId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *driverNameKey = "driverName";
	node = json_object_get_member(pJsonObject, driverNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&driverName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *onDutyMsKey = "onDutyMs";
	node = json_object_get_member(pJsonObject, onDutyMsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&onDutyMs, node, "long long", "");
		} else {
			
		}
	}
}

DriversSummaryResponse_Summaries::DriversSummaryResponse_Summaries(char* json)
{
	this->fromJson(json);
}

char*
DriversSummaryResponse_Summaries::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getDriverId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *driverIdKey = "driverId";
	json_object_set_member(pJsonObject, driverIdKey, node);
	if (isprimitive("double")) {
		double obj = getDistanceMiles();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *distanceMilesKey = "distanceMiles";
	json_object_set_member(pJsonObject, distanceMilesKey, node);
	if (isprimitive("long long")) {
		long long obj = getDriveMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *driveMsKey = "driveMs";
	json_object_set_member(pJsonObject, driveMsKey, node);
	if (isprimitive("long long")) {
		long long obj = getActiveMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *activeMsKey = "activeMs";
	json_object_set_member(pJsonObject, activeMsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDriverUsername();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *driverUsernameKey = "driverUsername";
	json_object_set_member(pJsonObject, driverUsernameKey, node);
	if (isprimitive("long long")) {
		long long obj = getGroupId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *groupIdKey = "groupId";
	json_object_set_member(pJsonObject, groupIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDriverName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *driverNameKey = "driverName";
	json_object_set_member(pJsonObject, driverNameKey, node);
	if (isprimitive("long long")) {
		long long obj = getOnDutyMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *onDutyMsKey = "onDutyMs";
	json_object_set_member(pJsonObject, onDutyMsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
DriversSummaryResponse_Summaries::getDriverId()
{
	return driverId;
}

void
DriversSummaryResponse_Summaries::setDriverId(long long  driverId)
{
	this->driverId = driverId;
}

double
DriversSummaryResponse_Summaries::getDistanceMiles()
{
	return distanceMiles;
}

void
DriversSummaryResponse_Summaries::setDistanceMiles(double  distanceMiles)
{
	this->distanceMiles = distanceMiles;
}

long long
DriversSummaryResponse_Summaries::getDriveMs()
{
	return driveMs;
}

void
DriversSummaryResponse_Summaries::setDriveMs(long long  driveMs)
{
	this->driveMs = driveMs;
}

long long
DriversSummaryResponse_Summaries::getActiveMs()
{
	return activeMs;
}

void
DriversSummaryResponse_Summaries::setActiveMs(long long  activeMs)
{
	this->activeMs = activeMs;
}

std::string
DriversSummaryResponse_Summaries::getDriverUsername()
{
	return driverUsername;
}

void
DriversSummaryResponse_Summaries::setDriverUsername(std::string  driverUsername)
{
	this->driverUsername = driverUsername;
}

long long
DriversSummaryResponse_Summaries::getGroupId()
{
	return groupId;
}

void
DriversSummaryResponse_Summaries::setGroupId(long long  groupId)
{
	this->groupId = groupId;
}

std::string
DriversSummaryResponse_Summaries::getDriverName()
{
	return driverName;
}

void
DriversSummaryResponse_Summaries::setDriverName(std::string  driverName)
{
	this->driverName = driverName;
}

long long
DriversSummaryResponse_Summaries::getOnDutyMs()
{
	return onDutyMs;
}

void
DriversSummaryResponse_Summaries::setOnDutyMs(long long  onDutyMs)
{
	this->onDutyMs = onDutyMs;
}


