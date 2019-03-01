#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Tag.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Tag::Tag()
{
	//__init();
}

Tag::~Tag()
{
	//__cleanup();
}

void
Tag::__init()
{
	//new std::list()std::list> addresses;
	//new std::list()std::list> assets;
	//new std::list()std::list> drivers;
	//groupId = long(0);
	//id = long(0);
	//new std::list()std::list> machines;
	//name = std::string();
	//parentTagId = long(0);
	//new std::list()std::list> sensors;
	//new std::list()std::list> vehicles;
}

void
Tag::__cleanup()
{
	//if(addresses != NULL) {
	//addresses.RemoveAll(true);
	//delete addresses;
	//addresses = NULL;
	//}
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
	//if(groupId != NULL) {
	//
	//delete groupId;
	//groupId = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
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
Tag::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *addressesKey = "addresses";
	node = json_object_get_member(pJsonObject, addressesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TaggedAddress> new_list;
			TaggedAddress inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TaggedAddress")) {
					jsonToValue(&inst, temp_json, "TaggedAddress", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			addresses = new_list;
		}
		
	}
	const gchar *assetsKey = "assets";
	node = json_object_get_member(pJsonObject, assetsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TaggedAsset> new_list;
			TaggedAsset inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TaggedAsset")) {
					jsonToValue(&inst, temp_json, "TaggedAsset", "");
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
			list<TaggedDriver> new_list;
			TaggedDriver inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TaggedDriver")) {
					jsonToValue(&inst, temp_json, "TaggedDriver", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			drivers = new_list;
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
	const gchar *machinesKey = "machines";
	node = json_object_get_member(pJsonObject, machinesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TaggedMachine> new_list;
			TaggedMachine inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TaggedMachine")) {
					jsonToValue(&inst, temp_json, "TaggedMachine", "");
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
			list<TaggedSensor> new_list;
			TaggedSensor inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TaggedSensor")) {
					jsonToValue(&inst, temp_json, "TaggedSensor", "");
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
			list<TaggedVehicle> new_list;
			TaggedVehicle inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TaggedVehicle")) {
					jsonToValue(&inst, temp_json, "TaggedVehicle", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			vehicles = new_list;
		}
		
	}
}

Tag::Tag(char* json)
{
	this->fromJson(json);
}

char*
Tag::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TaggedAddress")) {
		list<TaggedAddress> new_list = static_cast<list <TaggedAddress> > (getAddresses());
		node = converttoJson(&new_list, "TaggedAddress", "array");
	} else {
		node = json_node_alloc();
		list<TaggedAddress> new_list = static_cast<list <TaggedAddress> > (getAddresses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TaggedAddress>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TaggedAddress obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *addressesKey = "addresses";
	json_object_set_member(pJsonObject, addressesKey, node);
	if (isprimitive("TaggedAsset")) {
		list<TaggedAsset> new_list = static_cast<list <TaggedAsset> > (getAssets());
		node = converttoJson(&new_list, "TaggedAsset", "array");
	} else {
		node = json_node_alloc();
		list<TaggedAsset> new_list = static_cast<list <TaggedAsset> > (getAssets());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TaggedAsset>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TaggedAsset obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *assetsKey = "assets";
	json_object_set_member(pJsonObject, assetsKey, node);
	if (isprimitive("TaggedDriver")) {
		list<TaggedDriver> new_list = static_cast<list <TaggedDriver> > (getDrivers());
		node = converttoJson(&new_list, "TaggedDriver", "array");
	} else {
		node = json_node_alloc();
		list<TaggedDriver> new_list = static_cast<list <TaggedDriver> > (getDrivers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TaggedDriver>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TaggedDriver obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *driversKey = "drivers";
	json_object_set_member(pJsonObject, driversKey, node);
	if (isprimitive("long long")) {
		long long obj = getGroupId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *groupIdKey = "groupId";
	json_object_set_member(pJsonObject, groupIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("TaggedMachine")) {
		list<TaggedMachine> new_list = static_cast<list <TaggedMachine> > (getMachines());
		node = converttoJson(&new_list, "TaggedMachine", "array");
	} else {
		node = json_node_alloc();
		list<TaggedMachine> new_list = static_cast<list <TaggedMachine> > (getMachines());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TaggedMachine>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TaggedMachine obj = *it;
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
	if (isprimitive("TaggedSensor")) {
		list<TaggedSensor> new_list = static_cast<list <TaggedSensor> > (getSensors());
		node = converttoJson(&new_list, "TaggedSensor", "array");
	} else {
		node = json_node_alloc();
		list<TaggedSensor> new_list = static_cast<list <TaggedSensor> > (getSensors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TaggedSensor>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TaggedSensor obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *sensorsKey = "sensors";
	json_object_set_member(pJsonObject, sensorsKey, node);
	if (isprimitive("TaggedVehicle")) {
		list<TaggedVehicle> new_list = static_cast<list <TaggedVehicle> > (getVehicles());
		node = converttoJson(&new_list, "TaggedVehicle", "array");
	} else {
		node = json_node_alloc();
		list<TaggedVehicle> new_list = static_cast<list <TaggedVehicle> > (getVehicles());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TaggedVehicle>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TaggedVehicle obj = *it;
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

std::list<TaggedAddress>
Tag::getAddresses()
{
	return addresses;
}

void
Tag::setAddresses(std::list <TaggedAddress> addresses)
{
	this->addresses = addresses;
}

std::list<TaggedAsset>
Tag::getAssets()
{
	return assets;
}

void
Tag::setAssets(std::list <TaggedAsset> assets)
{
	this->assets = assets;
}

std::list<TaggedDriver>
Tag::getDrivers()
{
	return drivers;
}

void
Tag::setDrivers(std::list <TaggedDriver> drivers)
{
	this->drivers = drivers;
}

long long
Tag::getGroupId()
{
	return groupId;
}

void
Tag::setGroupId(long long  groupId)
{
	this->groupId = groupId;
}

long long
Tag::getId()
{
	return id;
}

void
Tag::setId(long long  id)
{
	this->id = id;
}

std::list<TaggedMachine>
Tag::getMachines()
{
	return machines;
}

void
Tag::setMachines(std::list <TaggedMachine> machines)
{
	this->machines = machines;
}

std::string
Tag::getName()
{
	return name;
}

void
Tag::setName(std::string  name)
{
	this->name = name;
}

long long
Tag::getParentTagId()
{
	return parentTagId;
}

void
Tag::setParentTagId(long long  parentTagId)
{
	this->parentTagId = parentTagId;
}

std::list<TaggedSensor>
Tag::getSensors()
{
	return sensors;
}

void
Tag::setSensors(std::list <TaggedSensor> sensors)
{
	this->sensors = sensors;
}

std::list<TaggedVehicle>
Tag::getVehicles()
{
	return vehicles;
}

void
Tag::setVehicles(std::list <TaggedVehicle> vehicles)
{
	this->vehicles = vehicles;
}


