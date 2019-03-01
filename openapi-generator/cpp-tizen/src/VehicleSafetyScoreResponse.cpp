#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VehicleSafetyScoreResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VehicleSafetyScoreResponse::VehicleSafetyScoreResponse()
{
	//__init();
}

VehicleSafetyScoreResponse::~VehicleSafetyScoreResponse()
{
	//__cleanup();
}

void
VehicleSafetyScoreResponse::__init()
{
	//crashCount = int(0);
	//harshAccelCount = int(0);
	//harshBrakingCount = int(0);
	//new std::list()std::list> harshEvents;
	//harshTurningCount = int(0);
	//safetyScore = int(0);
	//safetyScoreRank = std::string();
	//timeOverSpeedLimitMs = int(0);
	//totalDistanceDrivenMeters = int(0);
	//totalHarshEventCount = int(0);
	//totalTimeDrivenMs = int(0);
	//vehicleId = int(0);
}

void
VehicleSafetyScoreResponse::__cleanup()
{
	//if(crashCount != NULL) {
	//
	//delete crashCount;
	//crashCount = NULL;
	//}
	//if(harshAccelCount != NULL) {
	//
	//delete harshAccelCount;
	//harshAccelCount = NULL;
	//}
	//if(harshBrakingCount != NULL) {
	//
	//delete harshBrakingCount;
	//harshBrakingCount = NULL;
	//}
	//if(harshEvents != NULL) {
	//harshEvents.RemoveAll(true);
	//delete harshEvents;
	//harshEvents = NULL;
	//}
	//if(harshTurningCount != NULL) {
	//
	//delete harshTurningCount;
	//harshTurningCount = NULL;
	//}
	//if(safetyScore != NULL) {
	//
	//delete safetyScore;
	//safetyScore = NULL;
	//}
	//if(safetyScoreRank != NULL) {
	//
	//delete safetyScoreRank;
	//safetyScoreRank = NULL;
	//}
	//if(timeOverSpeedLimitMs != NULL) {
	//
	//delete timeOverSpeedLimitMs;
	//timeOverSpeedLimitMs = NULL;
	//}
	//if(totalDistanceDrivenMeters != NULL) {
	//
	//delete totalDistanceDrivenMeters;
	//totalDistanceDrivenMeters = NULL;
	//}
	//if(totalHarshEventCount != NULL) {
	//
	//delete totalHarshEventCount;
	//totalHarshEventCount = NULL;
	//}
	//if(totalTimeDrivenMs != NULL) {
	//
	//delete totalTimeDrivenMs;
	//totalTimeDrivenMs = NULL;
	//}
	//if(vehicleId != NULL) {
	//
	//delete vehicleId;
	//vehicleId = NULL;
	//}
	//
}

void
VehicleSafetyScoreResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *crashCountKey = "crashCount";
	node = json_object_get_member(pJsonObject, crashCountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&crashCount, node, "int", "");
		} else {
			
		}
	}
	const gchar *harshAccelCountKey = "harshAccelCount";
	node = json_object_get_member(pJsonObject, harshAccelCountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&harshAccelCount, node, "int", "");
		} else {
			
		}
	}
	const gchar *harshBrakingCountKey = "harshBrakingCount";
	node = json_object_get_member(pJsonObject, harshBrakingCountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&harshBrakingCount, node, "int", "");
		} else {
			
		}
	}
	const gchar *harshEventsKey = "harshEvents";
	node = json_object_get_member(pJsonObject, harshEventsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<SafetyReportHarshEvent> new_list;
			SafetyReportHarshEvent inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("SafetyReportHarshEvent")) {
					jsonToValue(&inst, temp_json, "SafetyReportHarshEvent", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			harshEvents = new_list;
		}
		
	}
	const gchar *harshTurningCountKey = "harshTurningCount";
	node = json_object_get_member(pJsonObject, harshTurningCountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&harshTurningCount, node, "int", "");
		} else {
			
		}
	}
	const gchar *safetyScoreKey = "safetyScore";
	node = json_object_get_member(pJsonObject, safetyScoreKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&safetyScore, node, "int", "");
		} else {
			
		}
	}
	const gchar *safetyScoreRankKey = "safetyScoreRank";
	node = json_object_get_member(pJsonObject, safetyScoreRankKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&safetyScoreRank, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *timeOverSpeedLimitMsKey = "timeOverSpeedLimitMs";
	node = json_object_get_member(pJsonObject, timeOverSpeedLimitMsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&timeOverSpeedLimitMs, node, "int", "");
		} else {
			
		}
	}
	const gchar *totalDistanceDrivenMetersKey = "totalDistanceDrivenMeters";
	node = json_object_get_member(pJsonObject, totalDistanceDrivenMetersKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&totalDistanceDrivenMeters, node, "int", "");
		} else {
			
		}
	}
	const gchar *totalHarshEventCountKey = "totalHarshEventCount";
	node = json_object_get_member(pJsonObject, totalHarshEventCountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&totalHarshEventCount, node, "int", "");
		} else {
			
		}
	}
	const gchar *totalTimeDrivenMsKey = "totalTimeDrivenMs";
	node = json_object_get_member(pJsonObject, totalTimeDrivenMsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&totalTimeDrivenMs, node, "int", "");
		} else {
			
		}
	}
	const gchar *vehicleIdKey = "vehicleId";
	node = json_object_get_member(pJsonObject, vehicleIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&vehicleId, node, "int", "");
		} else {
			
		}
	}
}

VehicleSafetyScoreResponse::VehicleSafetyScoreResponse(char* json)
{
	this->fromJson(json);
}

char*
VehicleSafetyScoreResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getCrashCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *crashCountKey = "crashCount";
	json_object_set_member(pJsonObject, crashCountKey, node);
	if (isprimitive("int")) {
		int obj = getHarshAccelCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *harshAccelCountKey = "harshAccelCount";
	json_object_set_member(pJsonObject, harshAccelCountKey, node);
	if (isprimitive("int")) {
		int obj = getHarshBrakingCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *harshBrakingCountKey = "harshBrakingCount";
	json_object_set_member(pJsonObject, harshBrakingCountKey, node);
	if (isprimitive("SafetyReportHarshEvent")) {
		list<SafetyReportHarshEvent> new_list = static_cast<list <SafetyReportHarshEvent> > (getHarshEvents());
		node = converttoJson(&new_list, "SafetyReportHarshEvent", "array");
	} else {
		node = json_node_alloc();
		list<SafetyReportHarshEvent> new_list = static_cast<list <SafetyReportHarshEvent> > (getHarshEvents());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<SafetyReportHarshEvent>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			SafetyReportHarshEvent obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *harshEventsKey = "harshEvents";
	json_object_set_member(pJsonObject, harshEventsKey, node);
	if (isprimitive("int")) {
		int obj = getHarshTurningCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *harshTurningCountKey = "harshTurningCount";
	json_object_set_member(pJsonObject, harshTurningCountKey, node);
	if (isprimitive("int")) {
		int obj = getSafetyScore();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *safetyScoreKey = "safetyScore";
	json_object_set_member(pJsonObject, safetyScoreKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSafetyScoreRank();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *safetyScoreRankKey = "safetyScoreRank";
	json_object_set_member(pJsonObject, safetyScoreRankKey, node);
	if (isprimitive("int")) {
		int obj = getTimeOverSpeedLimitMs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *timeOverSpeedLimitMsKey = "timeOverSpeedLimitMs";
	json_object_set_member(pJsonObject, timeOverSpeedLimitMsKey, node);
	if (isprimitive("int")) {
		int obj = getTotalDistanceDrivenMeters();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *totalDistanceDrivenMetersKey = "totalDistanceDrivenMeters";
	json_object_set_member(pJsonObject, totalDistanceDrivenMetersKey, node);
	if (isprimitive("int")) {
		int obj = getTotalHarshEventCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *totalHarshEventCountKey = "totalHarshEventCount";
	json_object_set_member(pJsonObject, totalHarshEventCountKey, node);
	if (isprimitive("int")) {
		int obj = getTotalTimeDrivenMs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *totalTimeDrivenMsKey = "totalTimeDrivenMs";
	json_object_set_member(pJsonObject, totalTimeDrivenMsKey, node);
	if (isprimitive("int")) {
		int obj = getVehicleId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *vehicleIdKey = "vehicleId";
	json_object_set_member(pJsonObject, vehicleIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
VehicleSafetyScoreResponse::getCrashCount()
{
	return crashCount;
}

void
VehicleSafetyScoreResponse::setCrashCount(int  crashCount)
{
	this->crashCount = crashCount;
}

int
VehicleSafetyScoreResponse::getHarshAccelCount()
{
	return harshAccelCount;
}

void
VehicleSafetyScoreResponse::setHarshAccelCount(int  harshAccelCount)
{
	this->harshAccelCount = harshAccelCount;
}

int
VehicleSafetyScoreResponse::getHarshBrakingCount()
{
	return harshBrakingCount;
}

void
VehicleSafetyScoreResponse::setHarshBrakingCount(int  harshBrakingCount)
{
	this->harshBrakingCount = harshBrakingCount;
}

std::list<SafetyReportHarshEvent>
VehicleSafetyScoreResponse::getHarshEvents()
{
	return harshEvents;
}

void
VehicleSafetyScoreResponse::setHarshEvents(std::list <SafetyReportHarshEvent> harshEvents)
{
	this->harshEvents = harshEvents;
}

int
VehicleSafetyScoreResponse::getHarshTurningCount()
{
	return harshTurningCount;
}

void
VehicleSafetyScoreResponse::setHarshTurningCount(int  harshTurningCount)
{
	this->harshTurningCount = harshTurningCount;
}

int
VehicleSafetyScoreResponse::getSafetyScore()
{
	return safetyScore;
}

void
VehicleSafetyScoreResponse::setSafetyScore(int  safetyScore)
{
	this->safetyScore = safetyScore;
}

std::string
VehicleSafetyScoreResponse::getSafetyScoreRank()
{
	return safetyScoreRank;
}

void
VehicleSafetyScoreResponse::setSafetyScoreRank(std::string  safetyScoreRank)
{
	this->safetyScoreRank = safetyScoreRank;
}

int
VehicleSafetyScoreResponse::getTimeOverSpeedLimitMs()
{
	return timeOverSpeedLimitMs;
}

void
VehicleSafetyScoreResponse::setTimeOverSpeedLimitMs(int  timeOverSpeedLimitMs)
{
	this->timeOverSpeedLimitMs = timeOverSpeedLimitMs;
}

int
VehicleSafetyScoreResponse::getTotalDistanceDrivenMeters()
{
	return totalDistanceDrivenMeters;
}

void
VehicleSafetyScoreResponse::setTotalDistanceDrivenMeters(int  totalDistanceDrivenMeters)
{
	this->totalDistanceDrivenMeters = totalDistanceDrivenMeters;
}

int
VehicleSafetyScoreResponse::getTotalHarshEventCount()
{
	return totalHarshEventCount;
}

void
VehicleSafetyScoreResponse::setTotalHarshEventCount(int  totalHarshEventCount)
{
	this->totalHarshEventCount = totalHarshEventCount;
}

int
VehicleSafetyScoreResponse::getTotalTimeDrivenMs()
{
	return totalTimeDrivenMs;
}

void
VehicleSafetyScoreResponse::setTotalTimeDrivenMs(int  totalTimeDrivenMs)
{
	this->totalTimeDrivenMs = totalTimeDrivenMs;
}

int
VehicleSafetyScoreResponse::getVehicleId()
{
	return vehicleId;
}

void
VehicleSafetyScoreResponse::setVehicleId(int  vehicleId)
{
	this->vehicleId = vehicleId;
}


