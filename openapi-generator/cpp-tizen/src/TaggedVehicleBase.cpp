#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TaggedVehicleBase.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TaggedVehicleBase::TaggedVehicleBase()
{
	//__init();
}

TaggedVehicleBase::~TaggedVehicleBase()
{
	//__cleanup();
}

void
TaggedVehicleBase::__init()
{
	//id = long(0);
}

void
TaggedVehicleBase::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
TaggedVehicleBase::fromJson(char* jsonStr)
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

TaggedVehicleBase::TaggedVehicleBase(char* json)
{
	this->fromJson(json);
}

char*
TaggedVehicleBase::toJson()
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
TaggedVehicleBase::getId()
{
	return id;
}

void
TaggedVehicleBase::setId(long long  id)
{
	this->id = id;
}


