#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_object_16.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_object_16::Inline_object_16()
{
	//__init();
}

Inline_object_16::~Inline_object_16()
{
	//__cleanup();
}

void
Inline_object_16::__init()
{
	//new std::map()std::map> externalIds;
	//harsh_accel_setting = int(0);
	//name = std::string();
}

void
Inline_object_16::__cleanup()
{
	//if(externalIds != NULL) {
	//externalIds.RemoveAll(true);
	//delete externalIds;
	//externalIds = NULL;
	//}
	//if(harsh_accel_setting != NULL) {
	//
	//delete harsh_accel_setting;
	//harsh_accel_setting = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
Inline_object_16::fromJson(char* jsonStr)
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
	const gchar *harsh_accel_settingKey = "harsh_accel_setting";
	node = json_object_get_member(pJsonObject, harsh_accel_settingKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&harsh_accel_setting, node, "int", "");
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

Inline_object_16::Inline_object_16(char* json)
{
	this->fromJson(json);
}

char*
Inline_object_16::toJson()
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
	if (isprimitive("int")) {
		int obj = getHarshAccelSetting();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *harsh_accel_settingKey = "harsh_accel_setting";
	json_object_set_member(pJsonObject, harsh_accel_settingKey, node);
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

std::map<string, string>
Inline_object_16::getExternalIds()
{
	return externalIds;
}

void
Inline_object_16::setExternalIds(std::map <string, string> externalIds)
{
	this->externalIds = externalIds;
}

int
Inline_object_16::getHarshAccelSetting()
{
	return harsh_accel_setting;
}

void
Inline_object_16::setHarshAccelSetting(int  harsh_accel_setting)
{
	this->harsh_accel_setting = harsh_accel_setting;
}

std::string
Inline_object_16::getName()
{
	return name;
}

void
Inline_object_16::setName(std::string  name)
{
	this->name = name;
}


