#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Asset.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Asset::Asset()
{
	//__init();
}

Asset::~Asset()
{
	//__cleanup();
}

void
Asset::__init()
{
	//assetSerialNumber = std::string();
	//new std::list()std::list> cable;
	//engineHours = int(0);
	//id = long(0);
	//name = std::string();
}

void
Asset::__cleanup()
{
	//if(assetSerialNumber != NULL) {
	//
	//delete assetSerialNumber;
	//assetSerialNumber = NULL;
	//}
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
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
Asset::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *assetSerialNumberKey = "assetSerialNumber";
	node = json_object_get_member(pJsonObject, assetSerialNumberKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&assetSerialNumber, node, "std::string", "");
		} else {
			
		}
	}
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

Asset::Asset(char* json)
{
	this->fromJson(json);
}

char*
Asset::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAssetSerialNumber();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *assetSerialNumberKey = "assetSerialNumber";
	json_object_set_member(pJsonObject, assetSerialNumberKey, node);
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

std::string
Asset::getAssetSerialNumber()
{
	return assetSerialNumber;
}

void
Asset::setAssetSerialNumber(std::string  assetSerialNumber)
{
	this->assetSerialNumber = assetSerialNumber;
}

std::list<Asset_cable>
Asset::getCable()
{
	return cable;
}

void
Asset::setCable(std::list <Asset_cable> cable)
{
	this->cable = cable;
}

int
Asset::getEngineHours()
{
	return engineHours;
}

void
Asset::setEngineHours(int  engineHours)
{
	this->engineHours = engineHours;
}

long long
Asset::getId()
{
	return id;
}

void
Asset::setId(long long  id)
{
	this->id = id;
}

std::string
Asset::getName()
{
	return name;
}

void
Asset::setName(std::string  name)
{
	this->name = name;
}


