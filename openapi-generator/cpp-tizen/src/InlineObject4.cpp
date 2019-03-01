#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_object_4.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_object_4::Inline_object_4()
{
	//__init();
}

Inline_object_4::~Inline_object_4()
{
	//__cleanup();
}

void
Inline_object_4::__init()
{
	//reactivate = bool(false);
}

void
Inline_object_4::__cleanup()
{
	//if(reactivate != NULL) {
	//
	//delete reactivate;
	//reactivate = NULL;
	//}
	//
}

void
Inline_object_4::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *reactivateKey = "reactivate";
	node = json_object_get_member(pJsonObject, reactivateKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&reactivate, node, "bool", "");
		} else {
			
		}
	}
}

Inline_object_4::Inline_object_4(char* json)
{
	this->fromJson(json);
}

char*
Inline_object_4::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getReactivate();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *reactivateKey = "reactivate";
	json_object_set_member(pJsonObject, reactivateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
Inline_object_4::getReactivate()
{
	return reactivate;
}

void
Inline_object_4::setReactivate(bool  reactivate)
{
	this->reactivate = reactivate;
}


