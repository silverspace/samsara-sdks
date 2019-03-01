#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_object_22.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_object_22::Inline_object_22()
{
	//__init();
}

Inline_object_22::~Inline_object_22()
{
	//__cleanup();
}

void
Inline_object_22::__init()
{
	//groupId = long(0);
	//new std::list()std::list> sensors;
}

void
Inline_object_22::__cleanup()
{
	//if(groupId != NULL) {
	//
	//delete groupId;
	//groupId = NULL;
	//}
	//if(sensors != NULL) {
	//sensors.RemoveAll(true);
	//delete sensors;
	//sensors = NULL;
	//}
	//
}

void
Inline_object_22::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *groupIdKey = "groupId";
	node = json_object_get_member(pJsonObject, groupIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&groupId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *sensorsKey = "sensors";
	node = json_object_get_member(pJsonObject, sensorsKey);
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
			sensors = new_list;
		}
		
	}
}

Inline_object_22::Inline_object_22(char* json)
{
	this->fromJson(json);
}

char*
Inline_object_22::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getGroupId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *groupIdKey = "groupId";
	json_object_set_member(pJsonObject, groupIdKey, node);
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getSensors());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getSensors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *sensorsKey = "sensors";
	json_object_set_member(pJsonObject, sensorsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
Inline_object_22::getGroupId()
{
	return groupId;
}

void
Inline_object_22::setGroupId(long long  groupId)
{
	this->groupId = groupId;
}

std::list<long long>
Inline_object_22::getSensors()
{
	return sensors;
}

void
Inline_object_22::setSensors(std::list <long long> sensors)
{
	this->sensors = sensors;
}


