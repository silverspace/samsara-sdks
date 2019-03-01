#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssetCurrentLocationsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssetCurrentLocationsResponse::AssetCurrentLocationsResponse()
{
	//__init();
}

AssetCurrentLocationsResponse::~AssetCurrentLocationsResponse()
{
	//__cleanup();
}

void
AssetCurrentLocationsResponse::__init()
{
	//new std::list()std::list> cable;
	//engineHours = int(0);
	//id = long(0);
	//new std::list()std::list> location;
	//name = std::string();
}

void
AssetCurrentLocationsResponse::__cleanup()
{
	//if(cable != NULL) {
	//cable.RemoveAll(true);
	//delete cable;
	//cable = NULL;
	//}
	//if(engineHours != NULL) {
	//
	//delete engineHours;
	//engineHours = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(location != NULL) {
	//location.RemoveAll(true);
	//delete location;
	//location = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
AssetCurrentLocationsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cableKey = "cable";
	node = json_object_get_member(pJsonObject, cableKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Asset_cable> new_list;
			Asset_cable inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Asset_cable")) {
					jsonToValue(&inst, temp_json, "Asset_cable", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			cable = new_list;
		}
		
	}
	const gchar *engineHoursKey = "engineHours";
	node = json_object_get_member(pJsonObject, engineHoursKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&engineHours, node, "int", "");
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
	const gchar *locationKey = "location";
	node = json_object_get_member(pJsonObject, locationKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssetCurrentLocation> new_list;
			AssetCurrentLocation inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssetCurrentLocation")) {
					jsonToValue(&inst, temp_json, "AssetCurrentLocation", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			location = new_list;
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
}

AssetCurrentLocationsResponse::AssetCurrentLocationsResponse(char* json)
{
	this->fromJson(json);
}

char*
AssetCurrentLocationsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Asset_cable")) {
		list<Asset_cable> new_list = static_cast<list <Asset_cable> > (getCable());
		node = converttoJson(&new_list, "Asset_cable", "array");
	} else {
		node = json_node_alloc();
		list<Asset_cable> new_list = static_cast<list <Asset_cable> > (getCable());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Asset_cable>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Asset_cable obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *cableKey = "cable";
	json_object_set_member(pJsonObject, cableKey, node);
	if (isprimitive("int")) {
		int obj = getEngineHours();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *engineHoursKey = "engineHours";
	json_object_set_member(pJsonObject, engineHoursKey, node);
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("AssetCurrentLocation")) {
		list<AssetCurrentLocation> new_list = static_cast<list <AssetCurrentLocation> > (getLocation());
		node = converttoJson(&new_list, "AssetCurrentLocation", "array");
	} else {
		node = json_node_alloc();
		list<AssetCurrentLocation> new_list = static_cast<list <AssetCurrentLocation> > (getLocation());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssetCurrentLocation>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssetCurrentLocation obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *locationKey = "location";
	json_object_set_member(pJsonObject, locationKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<Asset_cable>
AssetCurrentLocationsResponse::getCable()
{
	return cable;
}

void
AssetCurrentLocationsResponse::setCable(std::list <Asset_cable> cable)
{
	this->cable = cable;
}

int
AssetCurrentLocationsResponse::getEngineHours()
{
	return engineHours;
}

void
AssetCurrentLocationsResponse::setEngineHours(int  engineHours)
{
	this->engineHours = engineHours;
}

long long
AssetCurrentLocationsResponse::getId()
{
	return id;
}

void
AssetCurrentLocationsResponse::setId(long long  id)
{
	this->id = id;
}

std::list<AssetCurrentLocation>
AssetCurrentLocationsResponse::getLocation()
{
	return location;
}

void
AssetCurrentLocationsResponse::setLocation(std::list <AssetCurrentLocation> location)
{
	this->location = location;
}

std::string
AssetCurrentLocationsResponse::getName()
{
	return name;
}

void
AssetCurrentLocationsResponse::setName(std::string  name)
{
	this->name = name;
}


