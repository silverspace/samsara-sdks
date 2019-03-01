#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TaggedSensorBase.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TaggedSensorBase::TaggedSensorBase()
{
	//__init();
}

TaggedSensorBase::~TaggedSensorBase()
{
	//__cleanup();
}

void
TaggedSensorBase::__init()
{
	//id = long(0);
}

void
TaggedSensorBase::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
TaggedSensorBase::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
		}
	}
}

TaggedSensorBase::TaggedSensorBase(char* json)
{
	this->fromJson(json);
}

char*
TaggedSensorBase::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
TaggedSensorBase::getId()
{
	return id;
}

void
TaggedSensorBase::setId(long long  id)
{
	this->id = id;
}


