#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "HosLogsSummaryResponse_drivers.h"

using namespace std;
using namespace Tizen::ArtikCloud;

HosLogsSummaryResponse_drivers::HosLogsSummaryResponse_drivers()
{
	//__init();
}

HosLogsSummaryResponse_drivers::~HosLogsSummaryResponse_drivers()
{
	//__cleanup();
}

void
HosLogsSummaryResponse_drivers::__init()
{
	//timeUntilBreak = long(0);
	//vehicleName = std::string();
	//drivingInViolationToday = long(0);
	//driverId = long(0);
	//cycleRemaining = long(0);
	//driverName = std::string();
	//dutyStatus = std::string();
	//cycleTomorrow = long(0);
	//shiftDriveRemaining = long(0);
	//timeInCurrentStatus = long(0);
	//drivingInViolationCycle = long(0);
	//shiftRemaining = long(0);
}

void
HosLogsSummaryResponse_drivers::__cleanup()
{
	//if(timeUntilBreak != NULL) {
	//
	//delete timeUntilBreak;
	//timeUntilBreak = NULL;
	//}
	//if(vehicleName != NULL) {
	//
	//delete vehicleName;
	//vehicleName = NULL;
	//}
	//if(drivingInViolationToday != NULL) {
	//
	//delete drivingInViolationToday;
	//drivingInViolationToday = NULL;
	//}
	//if(driverId != NULL) {
	//
	//delete driverId;
	//driverId = NULL;
	//}
	//if(cycleRemaining != NULL) {
	//
	//delete cycleRemaining;
	//cycleRemaining = NULL;
	//}
	//if(driverName != NULL) {
	//
	//delete driverName;
	//driverName = NULL;
	//}
	//if(dutyStatus != NULL) {
	//
	//delete dutyStatus;
	//dutyStatus = NULL;
	//}
	//if(cycleTomorrow != NULL) {
	//
	//delete cycleTomorrow;
	//cycleTomorrow = NULL;
	//}
	//if(shiftDriveRemaining != NULL) {
	//
	//delete shiftDriveRemaining;
	//shiftDriveRemaining = NULL;
	//}
	//if(timeInCurrentStatus != NULL) {
	//
	//delete timeInCurrentStatus;
	//timeInCurrentStatus = NULL;
	//}
	//if(drivingInViolationCycle != NULL) {
	//
	//delete drivingInViolationCycle;
	//drivingInViolationCycle = NULL;
	//}
	//if(shiftRemaining != NULL) {
	//
	//delete shiftRemaining;
	//shiftRemaining = NULL;
	//}
	//
}

void
HosLogsSummaryResponse_drivers::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *timeUntilBreakKey = "timeUntilBreak";
	node = json_object_get_member(pJsonObject, timeUntilBreakKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&timeUntilBreak, node, "long long", "");
		} else {
			
		}
	}
	const gchar *vehicleNameKey = "vehicleName";
	node = json_object_get_member(pJsonObject, vehicleNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&vehicleName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *drivingInViolationTodayKey = "drivingInViolationToday";
	node = json_object_get_member(pJsonObject, drivingInViolationTodayKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&drivingInViolationToday, node, "long long", "");
		} else {
			
		}
	}
	const gchar *driverIdKey = "driverId";
	node = json_object_get_member(pJsonObject, driverIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&driverId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *cycleRemainingKey = "cycleRemaining";
	node = json_object_get_member(pJsonObject, cycleRemainingKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&cycleRemaining, node, "long long", "");
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
	const gchar *dutyStatusKey = "dutyStatus";
	node = json_object_get_member(pJsonObject, dutyStatusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&dutyStatus, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *cycleTomorrowKey = "cycleTomorrow";
	node = json_object_get_member(pJsonObject, cycleTomorrowKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&cycleTomorrow, node, "long long", "");
		} else {
			
		}
	}
	const gchar *shiftDriveRemainingKey = "shiftDriveRemaining";
	node = json_object_get_member(pJsonObject, shiftDriveRemainingKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&shiftDriveRemaining, node, "long long", "");
		} else {
			
		}
	}
	const gchar *timeInCurrentStatusKey = "timeInCurrentStatus";
	node = json_object_get_member(pJsonObject, timeInCurrentStatusKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&timeInCurrentStatus, node, "long long", "");
		} else {
			
		}
	}
	const gchar *drivingInViolationCycleKey = "drivingInViolationCycle";
	node = json_object_get_member(pJsonObject, drivingInViolationCycleKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&drivingInViolationCycle, node, "long long", "");
		} else {
			
		}
	}
	const gchar *shiftRemainingKey = "shiftRemaining";
	node = json_object_get_member(pJsonObject, shiftRemainingKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&shiftRemaining, node, "long long", "");
		} else {
			
		}
	}
}

HosLogsSummaryResponse_drivers::HosLogsSummaryResponse_drivers(char* json)
{
	this->fromJson(json);
}

char*
HosLogsSummaryResponse_drivers::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getTimeUntilBreak();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *timeUntilBreakKey = "timeUntilBreak";
	json_object_set_member(pJsonObject, timeUntilBreakKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVehicleName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *vehicleNameKey = "vehicleName";
	json_object_set_member(pJsonObject, vehicleNameKey, node);
	if (isprimitive("long long")) {
		long long obj = getDrivingInViolationToday();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *drivingInViolationTodayKey = "drivingInViolationToday";
	json_object_set_member(pJsonObject, drivingInViolationTodayKey, node);
	if (isprimitive("long long")) {
		long long obj = getDriverId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *driverIdKey = "driverId";
	json_object_set_member(pJsonObject, driverIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getCycleRemaining();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *cycleRemainingKey = "cycleRemaining";
	json_object_set_member(pJsonObject, cycleRemainingKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDriverName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *driverNameKey = "driverName";
	json_object_set_member(pJsonObject, driverNameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDutyStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dutyStatusKey = "dutyStatus";
	json_object_set_member(pJsonObject, dutyStatusKey, node);
	if (isprimitive("long long")) {
		long long obj = getCycleTomorrow();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *cycleTomorrowKey = "cycleTomorrow";
	json_object_set_member(pJsonObject, cycleTomorrowKey, node);
	if (isprimitive("long long")) {
		long long obj = getShiftDriveRemaining();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *shiftDriveRemainingKey = "shiftDriveRemaining";
	json_object_set_member(pJsonObject, shiftDriveRemainingKey, node);
	if (isprimitive("long long")) {
		long long obj = getTimeInCurrentStatus();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *timeInCurrentStatusKey = "timeInCurrentStatus";
	json_object_set_member(pJsonObject, timeInCurrentStatusKey, node);
	if (isprimitive("long long")) {
		long long obj = getDrivingInViolationCycle();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *drivingInViolationCycleKey = "drivingInViolationCycle";
	json_object_set_member(pJsonObject, drivingInViolationCycleKey, node);
	if (isprimitive("long long")) {
		long long obj = getShiftRemaining();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *shiftRemainingKey = "shiftRemaining";
	json_object_set_member(pJsonObject, shiftRemainingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
HosLogsSummaryResponse_drivers::getTimeUntilBreak()
{
	return timeUntilBreak;
}

void
HosLogsSummaryResponse_drivers::setTimeUntilBreak(long long  timeUntilBreak)
{
	this->timeUntilBreak = timeUntilBreak;
}

std::string
HosLogsSummaryResponse_drivers::getVehicleName()
{
	return vehicleName;
}

void
HosLogsSummaryResponse_drivers::setVehicleName(std::string  vehicleName)
{
	this->vehicleName = vehicleName;
}

long long
HosLogsSummaryResponse_drivers::getDrivingInViolationToday()
{
	return drivingInViolationToday;
}

void
HosLogsSummaryResponse_drivers::setDrivingInViolationToday(long long  drivingInViolationToday)
{
	this->drivingInViolationToday = drivingInViolationToday;
}

long long
HosLogsSummaryResponse_drivers::getDriverId()
{
	return driverId;
}

void
HosLogsSummaryResponse_drivers::setDriverId(long long  driverId)
{
	this->driverId = driverId;
}

long long
HosLogsSummaryResponse_drivers::getCycleRemaining()
{
	return cycleRemaining;
}

void
HosLogsSummaryResponse_drivers::setCycleRemaining(long long  cycleRemaining)
{
	this->cycleRemaining = cycleRemaining;
}

std::string
HosLogsSummaryResponse_drivers::getDriverName()
{
	return driverName;
}

void
HosLogsSummaryResponse_drivers::setDriverName(std::string  driverName)
{
	this->driverName = driverName;
}

std::string
HosLogsSummaryResponse_drivers::getDutyStatus()
{
	return dutyStatus;
}

void
HosLogsSummaryResponse_drivers::setDutyStatus(std::string  dutyStatus)
{
	this->dutyStatus = dutyStatus;
}

long long
HosLogsSummaryResponse_drivers::getCycleTomorrow()
{
	return cycleTomorrow;
}

void
HosLogsSummaryResponse_drivers::setCycleTomorrow(long long  cycleTomorrow)
{
	this->cycleTomorrow = cycleTomorrow;
}

long long
HosLogsSummaryResponse_drivers::getShiftDriveRemaining()
{
	return shiftDriveRemaining;
}

void
HosLogsSummaryResponse_drivers::setShiftDriveRemaining(long long  shiftDriveRemaining)
{
	this->shiftDriveRemaining = shiftDriveRemaining;
}

long long
HosLogsSummaryResponse_drivers::getTimeInCurrentStatus()
{
	return timeInCurrentStatus;
}

void
HosLogsSummaryResponse_drivers::setTimeInCurrentStatus(long long  timeInCurrentStatus)
{
	this->timeInCurrentStatus = timeInCurrentStatus;
}

long long
HosLogsSummaryResponse_drivers::getDrivingInViolationCycle()
{
	return drivingInViolationCycle;
}

void
HosLogsSummaryResponse_drivers::setDrivingInViolationCycle(long long  drivingInViolationCycle)
{
	this->drivingInViolationCycle = drivingInViolationCycle;
}

long long
HosLogsSummaryResponse_drivers::getShiftRemaining()
{
	return shiftRemaining;
}

void
HosLogsSummaryResponse_drivers::setShiftRemaining(long long  shiftRemaining)
{
	this->shiftRemaining = shiftRemaining;
}


