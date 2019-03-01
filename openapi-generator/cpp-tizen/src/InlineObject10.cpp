#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_object_10.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_object_10::Inline_object_10()
{
	//__init();
}

Inline_object_10::~Inline_object_10()
{
	//__cleanup();
}

void
Inline_object_10::__init()
{
	//groupId = long(0);
}

void
Inline_object_10::__cleanup()
{
	//if(groupId != NULL) {
	//
	//delete groupId;
	//groupId = NULL;
	//}
	//
}

void
Inline_object_10::fromJson(char* jsonStr)
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
}

Inline_object_10::Inline_object_10(char* json)
{
	this->fromJson(json);
}

char*
Inline_object_10::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
Inline_object_10::getGroupId()
{
	return groupId;
}

void
Inline_object_10::setGroupId(long long  groupId)
{
	this->groupId = groupId;
}


