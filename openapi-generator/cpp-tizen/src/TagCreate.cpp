#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TagCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TagCreate::TagCreate()
{
	//__init();
}

TagCreate::~TagCreate()
{
	//__cleanup();
}

void
TagCreate::__init()
{
	//new std::list()std::list> assets;
	//new std::list()std::list> drivers;
	//new std::list()std::list> machines;
	//name = std::string();
	//parentTagId = long(0);
	//new std::list()std::list> sensors;
	//new std::list()std::list> vehicles;
}

void
TagCreate::__cleanup()
{
	//if(assets != NULL) {
	//assets.RemoveAll(true);
	//delete assets;
	//assets = NULL;
	//}
	//if(drivers != NULL) {
	//drivers.RemoveAll(true);
	//delete drivers;
	//drivers = NULL;
	//}
	//if(machines != NULL) {
	//machines.RemoveAll(true);
	//delete machines;
	//machines = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(parentTagId != NULL) {
	//
	//delete parentTagId;
	//parentTagId = NULL;
	//}
	//if(sensors != NULL) {
	//sensors.RemoveAll(true);
	//delete sensors;
	//sensors = NULL;
	//}
	//if(vehicles != NULL) {
	//vehicles.RemoveAll(true);
	//delete vehicles;
	//vehicles = NULL;
	//}
	//
}

void
TagCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *assetsKey = "assets";
	node = json_object_get_member(pJsonObject, assetsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TaggedAssetBase> new_list;
			TaggedAssetBase inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TaggedAssetBase")) {
					jsonToValue(&inst, temp_json, "TaggedAssetBase", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			assets = new_list;
		}
		
	}
	const gchar *driversKey = "drivers";
	node = json_object_get_member(pJsonObject, driversKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TaggedDriverBase> new_list;
			TaggedDriverBase inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TaggedDriverBase")) {
					jsonToValue(&inst, temp_json, "TaggedDriverBase", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			drivers = new_list;
		}
		
	}
	const gchar *machinesKey = "machines";
	node = json_object_get_member(pJsonObject, machinesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TaggedMachineBase> new_list;
			TaggedMachineBase inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TaggedMachineBase")) {
					jsonToValue(&inst, temp_json, "TaggedMachineBase", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			machines = new_list;
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
	const gchar *parentTagIdKey = "parentTagId";
	node = json_object_get_member(pJsonObject, parentTagIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&parentTagId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *sensorsKey = "sensors";
	node = json_object_get_member(pJsonObject, sensorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TaggedSensorBase> new_list;
			TaggedSensorBase inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TaggedSensorBase")) {
					jsonToValue(&inst, temp_json, "TaggedSensorBase", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			sensors = new_list;
		}
		
	}
	const gchar *vehiclesKey = "vehicles";
	node = json_object_get_member(pJsonObject, vehiclesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TaggedVehicleBase> new_list;
			TaggedVehicleBase inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TaggedVehicleBase")) {
					jsonToValue(&inst, temp_json, "TaggedVehicleBase", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			vehicles = new_list;
		}
		
	}
}

TagCreate::TagCreate(char* json)
{
	this->fromJson(json);
}

char*
TagCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TaggedAssetBase")) {
		list<TaggedAssetBase> new_list = static_cast<list <TaggedAssetBase> > (getAssets());
		node = converttoJson(&new_list, "TaggedAssetBase", "array");
	} else {
		node = json_node_alloc();
		list<TaggedAssetBase> new_list = static_cast<list <TaggedAssetBase> > (getAssets());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TaggedAssetBase>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TaggedAssetBase obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *assetsKey = "assets";
	json_object_set_member(pJsonObject, assetsKey, node);
	if (isprimitive("TaggedDriverBase")) {
		list<TaggedDriverBase> new_list = static_cast<list <TaggedDriverBase> > (getDrivers());
		node = converttoJson(&new_list, "TaggedDriverBase", "array");
	} else {
		node = json_node_alloc();
		list<TaggedDriverBase> new_list = static_cast<list <TaggedDriverBase> > (getDrivers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TaggedDriverBase>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TaggedDriverBase obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *driversKey = "drivers";
	json_object_set_member(pJsonObject, driversKey, node);
	if (isprimitive("TaggedMachineBase")) {
		list<TaggedMachineBase> new_list = static_cast<list <TaggedMachineBase> > (getMachines());
		node = converttoJson(&new_list, "TaggedMachineBase", "array");
	} else {
		node = json_node_alloc();
		list<TaggedMachineBase> new_list = static_cast<list <TaggedMachineBase> > (getMachines());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TaggedMachineBase>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TaggedMachineBase obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *machinesKey = "machines";
	json_object_set_member(pJsonObject, machinesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getParentTagId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *parentTagIdKey = "parentTagId";
	json_object_set_member(pJsonObject, parentTagIdKey, node);
	if (isprimitive("TaggedSensorBase")) {
		list<TaggedSensorBase> new_list = static_cast<list <TaggedSensorBase> > (getSensors());
		node = converttoJson(&new_list, "TaggedSensorBase", "array");
	} else {
		node = json_node_alloc();
		list<TaggedSensorBase> new_list = static_cast<list <TaggedSensorBase> > (getSensors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TaggedSensorBase>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TaggedSensorBase obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *sensorsKey = "sensors";
	json_object_set_member(pJsonObject, sensorsKey, node);
	if (isprimitive("TaggedVehicleBase")) {
		list<TaggedVehicleBase> new_list = static_cast<list <TaggedVehicleBase> > (getVehicles());
		node = converttoJson(&new_list, "TaggedVehicleBase", "array");
	} else {
		node = json_node_alloc();
		list<TaggedVehicleBase> new_list = static_cast<list <TaggedVehicleBase> > (getVehicles());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TaggedVehicleBase>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TaggedVehicleBase obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *vehiclesKey = "vehicles";
	json_object_set_member(pJsonObject, vehiclesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<TaggedAssetBase>
TagCreate::getAssets()
{
	return assets;
}

void
TagCreate::setAssets(std::list <TaggedAssetBase> assets)
{
	this->assets = assets;
}

std::list<TaggedDriverBase>
TagCreate::getDrivers()
{
	return drivers;
}

void
TagCreate::setDrivers(std::list <TaggedDriverBase> drivers)
{
	this->drivers = drivers;
}

std::list<TaggedMachineBase>
TagCreate::getMachines()
{
	return machines;
}

void
TagCreate::setMachines(std::list <TaggedMachineBase> machines)
{
	this->machines = machines;
}

std::string
TagCreate::getName()
{
	return name;
}

void
TagCreate::setName(std::string  name)
{
	this->name = name;
}

long long
TagCreate::getParentTagId()
{
	return parentTagId;
}

void
TagCreate::setParentTagId(long long  parentTagId)
{
	this->parentTagId = parentTagId;
}

std::list<TaggedSensorBase>
TagCreate::getSensors()
{
	return sensors;
}

void
TagCreate::setSensors(std::list <TaggedSensorBase> sensors)
{
	this->sensors = sensors;
}

std::list<TaggedVehicleBase>
TagCreate::getVehicles()
{
	return vehicles;
}

void
TagCreate::setVehicles(std::list <TaggedVehicleBase> vehicles)
{
	this->vehicles = vehicles;
}


