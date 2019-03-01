#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DocumentFieldType_numberValueTypeMetadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DocumentFieldType_numberValueTypeMetadata::DocumentFieldType_numberValueTypeMetadata()
{
	//__init();
}

DocumentFieldType_numberValueTypeMetadata::~DocumentFieldType_numberValueTypeMetadata()
{
	//__cleanup();
}

void
DocumentFieldType_numberValueTypeMetadata::__init()
{
	//numDecimalPlaces = long(0);
}

void
DocumentFieldType_numberValueTypeMetadata::__cleanup()
{
	//if(numDecimalPlaces != NULL) {
	//
	//delete numDecimalPlaces;
	//numDecimalPlaces = NULL;
	//}
	//
}

void
DocumentFieldType_numberValueTypeMetadata::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *numDecimalPlacesKey = "numDecimalPlaces";
	node = json_object_get_member(pJsonObject, numDecimalPlacesKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&numDecimalPlaces, node, "long long", "");
		} else {
			
		}
	}
}

DocumentFieldType_numberValueTypeMetadata::DocumentFieldType_numberValueTypeMetadata(char* json)
{
	this->fromJson(json);
}

char*
DocumentFieldType_numberValueTypeMetadata::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getNumDecimalPlaces();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *numDecimalPlacesKey = "numDecimalPlaces";
	json_object_set_member(pJsonObject, numDecimalPlacesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
DocumentFieldType_numberValueTypeMetadata::getNumDecimalPlaces()
{
	return numDecimalPlaces;
}

void
DocumentFieldType_numberValueTypeMetadata::setNumDecimalPlaces(long long  numDecimalPlaces)
{
	this->numDecimalPlaces = numDecimalPlaces;
}


