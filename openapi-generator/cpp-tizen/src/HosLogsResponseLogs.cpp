#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "HosLogsResponse_logs.h"

using namespace std;
using namespace Tizen::ArtikCloud;

HosLogsResponse_logs::HosLogsResponse_logs()
{
	//__init();
}

HosLogsResponse_logs::~HosLogsResponse_logs()
{
	//__cleanup();
}

void
HosLogsResponse_logs::__init()
{
	//locLng = double(0);
	//logStartMs = long(0);
	//driverId = long(0);
	//statusType = std::string();
	//locCity = std::string();
	//groupId = long(0);
	//locName = std::string();
	//locLat = double(0);
	//remark = std::string();
	//locState = std::string();
	//vehicleId = long(0);
	//new std::list()std::list> codriverIds;
}

void
HosLogsResponse_logs::__cleanup()
{
	//if(locLng != NULL) {
	//
	//delete locLng;
	//locLng = NULL;
	//}
	//if(logStartMs != NULL) {
	//
	//delete logStartMs;
	//logStartMs = NULL;
	//}
	//if(driverId != NULL) {
	//
	//delete driverId;
	//driverId = NULL;
	//}
	//if(statusType != NULL) {
	//
	//delete statusType;
	//statusType = NULL;
	//}
	//if(locCity != NULL) {
	//
	//delete locCity;
	//locCity = NULL;
	//}
	//if(groupId != NULL) {
	//
	//delete groupId;
	//groupId = NULL;
	//}
	//if(locName != NULL) {
	//
	//delete locName;
	//locName = NULL;
	//}
	//if(locLat != NULL) {
	//
	//delete locLat;
	//locLat = NULL;
	//}
	//if(remark != NULL) {
	//
	//delete remark;
	//remark = NULL;
	//}
	//if(locState != NULL) {
	//
	//delete locState;
	//locState = NULL;
	//}
	//if(vehicleId != NULL) {
	//
	//delete vehicleId;
	//vehicleId = NULL;
	//}
	//if(codriverIds != NULL) {
	//codriverIds.RemoveAll(true);
	//delete codriverIds;
	//codriverIds = NULL;
	//}
	//
}

void
HosLogsResponse_logs::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *locLngKey = "locLng";
	node = json_object_get_member(pJsonObject, locLngKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&locLng, node, "double", "");
		} else {
			
		}
	}
	const gchar *logStartMsKey = "logStartMs";
	node = json_object_get_member(pJsonObject, logStartMsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&logStartMs, node, "long long", "");
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
	const gchar *statusTypeKey = "statusType";
	node = json_object_get_member(pJsonObject, statusTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&statusType, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *locCityKey = "locCity";
	node = json_object_get_member(pJsonObject, locCityKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&locCity, node, "std::string", "");
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
	const gchar *locNameKey = "locName";
	node = json_object_get_member(pJsonObject, locNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&locName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *locLatKey = "locLat";
	node = json_object_get_member(pJsonObject, locLatKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&locLat, node, "double", "");
		} else {
			
		}
	}
	const gchar *remarkKey = "remark";
	node = json_object_get_member(pJsonObject, remarkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&remark, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *locStateKey = "locState";
	node = json_object_get_member(pJsonObject, locStateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&locState, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *vehicleIdKey = "vehicleId";
	node = json_object_get_member(pJsonObject, vehicleIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&vehicleId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *codriverIdsKey = "codriverIds";
	node = json_object_get_member(pJsonObject, codriverIdsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<long long> new_list;
			long long inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("long long")) {
					jsonToValue(&inst, temp_json, "long long", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			codriverIds = new_list;
		}
		
	}
}

HosLogsResponse_logs::HosLogsResponse_logs(char* json)
{
	this->fromJson(json);
}

char*
HosLogsResponse_logs::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("double")) {
		double obj = getLocLng();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *locLngKey = "locLng";
	json_object_set_member(pJsonObject, locLngKey, node);
	if (isprimitive("long long")) {
		long long obj = getLogStartMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *logStartMsKey = "logStartMs";
	json_object_set_member(pJsonObject, logStartMsKey, node);
	if (isprimitive("long long")) {
		long long obj = getDriverId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *driverIdKey = "driverId";
	json_object_set_member(pJsonObject, driverIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatusType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusTypeKey = "statusType";
	json_object_set_member(pJsonObject, statusTypeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLocCity();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *locCityKey = "locCity";
	json_object_set_member(pJsonObject, locCityKey, node);
	if (isprimitive("long long")) {
		long long obj = getGroupId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *groupIdKey = "groupId";
	json_object_set_member(pJsonObject, groupIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLocName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *locNameKey = "locName";
	json_object_set_member(pJsonObject, locNameKey, node);
	if (isprimitive("double")) {
		double obj = getLocLat();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *locLatKey = "locLat";
	json_object_set_member(pJsonObject, locLatKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRemark();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *remarkKey = "remark";
	json_object_set_member(pJsonObject, remarkKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLocState();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *locStateKey = "locState";
	json_object_set_member(pJsonObject, locStateKey, node);
	if (isprimitive("long long")) {
		long long obj = getVehicleId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *vehicleIdKey = "vehicleId";
	json_object_set_member(pJsonObject, vehicleIdKey, node);
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getCodriverIds());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getCodriverIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *codriverIdsKey = "codriverIds";
	json_object_set_member(pJsonObject, codriverIdsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

double
HosLogsResponse_logs::getLocLng()
{
	return locLng;
}

void
HosLogsResponse_logs::setLocLng(double  locLng)
{
	this->locLng = locLng;
}

long long
HosLogsResponse_logs::getLogStartMs()
{
	return logStartMs;
}

void
HosLogsResponse_logs::setLogStartMs(long long  logStartMs)
{
	this->logStartMs = logStartMs;
}

long long
HosLogsResponse_logs::getDriverId()
{
	return driverId;
}

void
HosLogsResponse_logs::setDriverId(long long  driverId)
{
	this->driverId = driverId;
}

std::string
HosLogsResponse_logs::getStatusType()
{
	return statusType;
}

void
HosLogsResponse_logs::setStatusType(std::string  statusType)
{
	this->statusType = statusType;
}

std::string
HosLogsResponse_logs::getLocCity()
{
	return locCity;
}

void
HosLogsResponse_logs::setLocCity(std::string  locCity)
{
	this->locCity = locCity;
}

long long
HosLogsResponse_logs::getGroupId()
{
	return groupId;
}

void
HosLogsResponse_logs::setGroupId(long long  groupId)
{
	this->groupId = groupId;
}

std::string
HosLogsResponse_logs::getLocName()
{
	return locName;
}

void
HosLogsResponse_logs::setLocName(std::string  locName)
{
	this->locName = locName;
}

double
HosLogsResponse_logs::getLocLat()
{
	return locLat;
}

void
HosLogsResponse_logs::setLocLat(double  locLat)
{
	this->locLat = locLat;
}

std::string
HosLogsResponse_logs::getRemark()
{
	return remark;
}

void
HosLogsResponse_logs::setRemark(std::string  remark)
{
	this->remark = remark;
}

std::string
HosLogsResponse_logs::getLocState()
{
	return locState;
}

void
HosLogsResponse_logs::setLocState(std::string  locState)
{
	this->locState = locState;
}

long long
HosLogsResponse_logs::getVehicleId()
{
	return vehicleId;
}

void
HosLogsResponse_logs::setVehicleId(long long  vehicleId)
{
	this->vehicleId = vehicleId;
}

std::list<long long>
HosLogsResponse_logs::getCodriverIds()
{
	return codriverIds;
}

void
HosLogsResponse_logs::setCodriverIds(std::list <long long> codriverIds)
{
	this->codriverIds = codriverIds;
}


