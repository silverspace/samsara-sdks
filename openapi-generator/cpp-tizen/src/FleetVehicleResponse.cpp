#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FleetVehicleResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FleetVehicleResponse::FleetVehicleResponse()
{
	//__init();
}

FleetVehicleResponse::~FleetVehicleResponse()
{
	//__cleanup();
}

void
FleetVehicleResponse::__init()
{
	//new std::map()std::map> externalIds;
	//harshAccelSetting = std::string();
	//id = long(0);
	//name = std::string();
	//vehicleInfo = new FleetVehicleResponse_vehicleInfo();
}

void
FleetVehicleResponse::__cleanup()
{
	//if(externalIds != NULL) {
	//externalIds.RemoveAll(true);
	//delete externalIds;
	//externalIds = NULL;
	//}
	//if(harshAccelSetting != NULL) {
	//
	//delete harshAccelSetting;
	//harshAccelSetting = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(vehicleInfo != NULL) {
	//
	//delete vehicleInfo;
	//vehicleInfo = NULL;
	//}
	//
}

void
FleetVehicleResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *externalIdsKey = "externalIds";
	node = json_object_get_member(pJsonObject, externalIdsKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			externalIds = new_map;
		}
		
	}
	const gchar *harshAccelSettingKey = "harshAccelSetting";
	node = json_object_get_member(pJsonObject, harshAccelSettingKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&harshAccelSetting, node, "std::string", "");
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *vehicleInfoKey = "vehicleInfo";
	node = json_object_get_member(pJsonObject, vehicleInfoKey);
	if (node !=NULL) {
	

		if (isprimitive("FleetVehicleResponse_vehicleInfo")) {
			jsonToValue(&vehicleInfo, node, "FleetVehicleResponse_vehicleInfo", "FleetVehicleResponse_vehicleInfo");
		} else {
			
			FleetVehicleResponse_vehicleInfo* obj = static_cast<FleetVehicleResponse_vehicleInfo*> (&vehicleInfo);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FleetVehicleResponse::FleetVehicleResponse(char* json)
{
	this->fromJson(json);
}

char*
FleetVehicleResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getExternalIds());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *externalIdsKey = "externalIds";
	json_object_set_member(pJsonObject, externalIdsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getHarshAccelSetting();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *harshAccelSettingKey = "harshAccelSetting";
	json_object_set_member(pJsonObject, harshAccelSettingKey, node);
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("FleetVehicleResponse_vehicleInfo")) {
		FleetVehicleResponse_vehicleInfo obj = getVehicleInfo();
		node = converttoJson(&obj, "FleetVehicleResponse_vehicleInfo", "");
	}
	else {
		
		FleetVehicleResponse_vehicleInfo obj = static_cast<FleetVehicleResponse_vehicleInfo> (getVehicleInfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *vehicleInfoKey = "vehicleInfo";
	json_object_set_member(pJsonObject, vehicleInfoKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::map<string, string>
FleetVehicleResponse::getExternalIds()
{
	return externalIds;
}

void
FleetVehicleResponse::setExternalIds(std::map <string, string> externalIds)
{
	this->externalIds = externalIds;
}

std::string
FleetVehicleResponse::getHarshAccelSetting()
{
	return harshAccelSetting;
}

void
FleetVehicleResponse::setHarshAccelSetting(std::string  harshAccelSetting)
{
	this->harshAccelSetting = harshAccelSetting;
}

long long
FleetVehicleResponse::getId()
{
	return id;
}

void
FleetVehicleResponse::setId(long long  id)
{
	this->id = id;
}

std::string
FleetVehicleResponse::getName()
{
	return name;
}

void
FleetVehicleResponse::setName(std::string  name)
{
	this->name = name;
}

FleetVehicleResponse_vehicleInfo
FleetVehicleResponse::getVehicleInfo()
{
	return vehicleInfo;
}

void
FleetVehicleResponse::setVehicleInfo(FleetVehicleResponse_vehicleInfo  vehicleInfo)
{
	this->vehicleInfo = vehicleInfo;
}


