#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssetReeferResponse_reeferStats.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssetReeferResponse_reeferStats::AssetReeferResponse_reeferStats()
{
	//__init();
}

AssetReeferResponse_reeferStats::~AssetReeferResponse_reeferStats()
{
	//__cleanup();
}

void
AssetReeferResponse_reeferStats::__init()
{
	//new std::list()std::list> fuelPercentage;
	//new std::list()std::list> powerStatus;
	//new std::list()std::list> engineHours;
	//new std::list()std::list> setPoint;
	//new std::list()std::list> returnAirTemp;
	//new std::list()std::list> alarms;
}

void
AssetReeferResponse_reeferStats::__cleanup()
{
	//if(fuelPercentage != NULL) {
	//fuelPercentage.RemoveAll(true);
	//delete fuelPercentage;
	//fuelPercentage = NULL;
	//}
	//if(powerStatus != NULL) {
	//powerStatus.RemoveAll(true);
	//delete powerStatus;
	//powerStatus = NULL;
	//}
	//if(engineHours != NULL) {
	//engineHours.RemoveAll(true);
	//delete engineHours;
	//engineHours = NULL;
	//}
	//if(setPoint != NULL) {
	//setPoint.RemoveAll(true);
	//delete setPoint;
	//setPoint = NULL;
	//}
	//if(returnAirTemp != NULL) {
	//returnAirTemp.RemoveAll(true);
	//delete returnAirTemp;
	//returnAirTemp = NULL;
	//}
	//if(alarms != NULL) {
	//alarms.RemoveAll(true);
	//delete alarms;
	//alarms = NULL;
	//}
	//
}

void
AssetReeferResponse_reeferStats::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fuelPercentageKey = "fuelPercentage";
	node = json_object_get_member(pJsonObject, fuelPercentageKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssetReeferResponse_reeferStats_fuelPercentage> new_list;
			AssetReeferResponse_reeferStats_fuelPercentage inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssetReeferResponse_reeferStats_fuelPercentage")) {
					jsonToValue(&inst, temp_json, "AssetReeferResponse_reeferStats_fuelPercentage", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			fuelPercentage = new_list;
		}
		
	}
	const gchar *powerStatusKey = "powerStatus";
	node = json_object_get_member(pJsonObject, powerStatusKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssetReeferResponse_reeferStats_powerStatus> new_list;
			AssetReeferResponse_reeferStats_powerStatus inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssetReeferResponse_reeferStats_powerStatus")) {
					jsonToValue(&inst, temp_json, "AssetReeferResponse_reeferStats_powerStatus", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			powerStatus = new_list;
		}
		
	}
	const gchar *engineHoursKey = "engineHours";
	node = json_object_get_member(pJsonObject, engineHoursKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssetReeferResponse_reeferStats_engineHours> new_list;
			AssetReeferResponse_reeferStats_engineHours inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssetReeferResponse_reeferStats_engineHours")) {
					jsonToValue(&inst, temp_json, "AssetReeferResponse_reeferStats_engineHours", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			engineHours = new_list;
		}
		
	}
	const gchar *setPointKey = "setPoint";
	node = json_object_get_member(pJsonObject, setPointKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssetReeferResponse_reeferStats_setPoint> new_list;
			AssetReeferResponse_reeferStats_setPoint inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssetReeferResponse_reeferStats_setPoint")) {
					jsonToValue(&inst, temp_json, "AssetReeferResponse_reeferStats_setPoint", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			setPoint = new_list;
		}
		
	}
	const gchar *returnAirTempKey = "returnAirTemp";
	node = json_object_get_member(pJsonObject, returnAirTempKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssetReeferResponse_reeferStats_returnAirTemp> new_list;
			AssetReeferResponse_reeferStats_returnAirTemp inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssetReeferResponse_reeferStats_returnAirTemp")) {
					jsonToValue(&inst, temp_json, "AssetReeferResponse_reeferStats_returnAirTemp", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			returnAirTemp = new_list;
		}
		
	}
	const gchar *alarmsKey = "alarms";
	node = json_object_get_member(pJsonObject, alarmsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssetReeferResponse_reeferStats_alarms_1> new_list;
			AssetReeferResponse_reeferStats_alarms_1 inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssetReeferResponse_reeferStats_alarms_1")) {
					jsonToValue(&inst, temp_json, "AssetReeferResponse_reeferStats_alarms_1", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			alarms = new_list;
		}
		
	}
}

AssetReeferResponse_reeferStats::AssetReeferResponse_reeferStats(char* json)
{
	this->fromJson(json);
}

char*
AssetReeferResponse_reeferStats::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AssetReeferResponse_reeferStats_fuelPercentage")) {
		list<AssetReeferResponse_reeferStats_fuelPercentage> new_list = static_cast<list <AssetReeferResponse_reeferStats_fuelPercentage> > (getFuelPercentage());
		node = converttoJson(&new_list, "AssetReeferResponse_reeferStats_fuelPercentage", "array");
	} else {
		node = json_node_alloc();
		list<AssetReeferResponse_reeferStats_fuelPercentage> new_list = static_cast<list <AssetReeferResponse_reeferStats_fuelPercentage> > (getFuelPercentage());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssetReeferResponse_reeferStats_fuelPercentage>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssetReeferResponse_reeferStats_fuelPercentage obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *fuelPercentageKey = "fuelPercentage";
	json_object_set_member(pJsonObject, fuelPercentageKey, node);
	if (isprimitive("AssetReeferResponse_reeferStats_powerStatus")) {
		list<AssetReeferResponse_reeferStats_powerStatus> new_list = static_cast<list <AssetReeferResponse_reeferStats_powerStatus> > (getPowerStatus());
		node = converttoJson(&new_list, "AssetReeferResponse_reeferStats_powerStatus", "array");
	} else {
		node = json_node_alloc();
		list<AssetReeferResponse_reeferStats_powerStatus> new_list = static_cast<list <AssetReeferResponse_reeferStats_powerStatus> > (getPowerStatus());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssetReeferResponse_reeferStats_powerStatus>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssetReeferResponse_reeferStats_powerStatus obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *powerStatusKey = "powerStatus";
	json_object_set_member(pJsonObject, powerStatusKey, node);
	if (isprimitive("AssetReeferResponse_reeferStats_engineHours")) {
		list<AssetReeferResponse_reeferStats_engineHours> new_list = static_cast<list <AssetReeferResponse_reeferStats_engineHours> > (getEngineHours());
		node = converttoJson(&new_list, "AssetReeferResponse_reeferStats_engineHours", "array");
	} else {
		node = json_node_alloc();
		list<AssetReeferResponse_reeferStats_engineHours> new_list = static_cast<list <AssetReeferResponse_reeferStats_engineHours> > (getEngineHours());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssetReeferResponse_reeferStats_engineHours>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssetReeferResponse_reeferStats_engineHours obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *engineHoursKey = "engineHours";
	json_object_set_member(pJsonObject, engineHoursKey, node);
	if (isprimitive("AssetReeferResponse_reeferStats_setPoint")) {
		list<AssetReeferResponse_reeferStats_setPoint> new_list = static_cast<list <AssetReeferResponse_reeferStats_setPoint> > (getSetPoint());
		node = converttoJson(&new_list, "AssetReeferResponse_reeferStats_setPoint", "array");
	} else {
		node = json_node_alloc();
		list<AssetReeferResponse_reeferStats_setPoint> new_list = static_cast<list <AssetReeferResponse_reeferStats_setPoint> > (getSetPoint());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssetReeferResponse_reeferStats_setPoint>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssetReeferResponse_reeferStats_setPoint obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *setPointKey = "setPoint";
	json_object_set_member(pJsonObject, setPointKey, node);
	if (isprimitive("AssetReeferResponse_reeferStats_returnAirTemp")) {
		list<AssetReeferResponse_reeferStats_returnAirTemp> new_list = static_cast<list <AssetReeferResponse_reeferStats_returnAirTemp> > (getReturnAirTemp());
		node = converttoJson(&new_list, "AssetReeferResponse_reeferStats_returnAirTemp", "array");
	} else {
		node = json_node_alloc();
		list<AssetReeferResponse_reeferStats_returnAirTemp> new_list = static_cast<list <AssetReeferResponse_reeferStats_returnAirTemp> > (getReturnAirTemp());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssetReeferResponse_reeferStats_returnAirTemp>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssetReeferResponse_reeferStats_returnAirTemp obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *returnAirTempKey = "returnAirTemp";
	json_object_set_member(pJsonObject, returnAirTempKey, node);
	if (isprimitive("AssetReeferResponse_reeferStats_alarms_1")) {
		list<AssetReeferResponse_reeferStats_alarms_1> new_list = static_cast<list <AssetReeferResponse_reeferStats_alarms_1> > (getAlarms());
		node = converttoJson(&new_list, "AssetReeferResponse_reeferStats_alarms_1", "array");
	} else {
		node = json_node_alloc();
		list<AssetReeferResponse_reeferStats_alarms_1> new_list = static_cast<list <AssetReeferResponse_reeferStats_alarms_1> > (getAlarms());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssetReeferResponse_reeferStats_alarms_1>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssetReeferResponse_reeferStats_alarms_1 obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *alarmsKey = "alarms";
	json_object_set_member(pJsonObject, alarmsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<AssetReeferResponse_reeferStats_fuelPercentage>
AssetReeferResponse_reeferStats::getFuelPercentage()
{
	return fuelPercentage;
}

void
AssetReeferResponse_reeferStats::setFuelPercentage(std::list <AssetReeferResponse_reeferStats_fuelPercentage> fuelPercentage)
{
	this->fuelPercentage = fuelPercentage;
}

std::list<AssetReeferResponse_reeferStats_powerStatus>
AssetReeferResponse_reeferStats::getPowerStatus()
{
	return powerStatus;
}

void
AssetReeferResponse_reeferStats::setPowerStatus(std::list <AssetReeferResponse_reeferStats_powerStatus> powerStatus)
{
	this->powerStatus = powerStatus;
}

std::list<AssetReeferResponse_reeferStats_engineHours>
AssetReeferResponse_reeferStats::getEngineHours()
{
	return engineHours;
}

void
AssetReeferResponse_reeferStats::setEngineHours(std::list <AssetReeferResponse_reeferStats_engineHours> engineHours)
{
	this->engineHours = engineHours;
}

std::list<AssetReeferResponse_reeferStats_setPoint>
AssetReeferResponse_reeferStats::getSetPoint()
{
	return setPoint;
}

void
AssetReeferResponse_reeferStats::setSetPoint(std::list <AssetReeferResponse_reeferStats_setPoint> setPoint)
{
	this->setPoint = setPoint;
}

std::list<AssetReeferResponse_reeferStats_returnAirTemp>
AssetReeferResponse_reeferStats::getReturnAirTemp()
{
	return returnAirTemp;
}

void
AssetReeferResponse_reeferStats::setReturnAirTemp(std::list <AssetReeferResponse_reeferStats_returnAirTemp> returnAirTemp)
{
	this->returnAirTemp = returnAirTemp;
}

std::list<AssetReeferResponse_reeferStats_alarms_1>
AssetReeferResponse_reeferStats::getAlarms()
{
	return alarms;
}

void
AssetReeferResponse_reeferStats::setAlarms(std::list <AssetReeferResponse_reeferStats_alarms_1> alarms)
{
	this->alarms = alarms;
}


