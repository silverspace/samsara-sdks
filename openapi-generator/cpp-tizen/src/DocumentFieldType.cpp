#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DocumentFieldType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DocumentFieldType::DocumentFieldType()
{
	//__init();
}

DocumentFieldType::~DocumentFieldType()
{
	//__cleanup();
}

void
DocumentFieldType::__init()
{
	//label = std::string();
	//numberValueTypeMetadata = new DocumentFieldType_numberValueTypeMetadata();
	//valueType = std::string();
}

void
DocumentFieldType::__cleanup()
{
	//if(label != NULL) {
	//
	//delete label;
	//label = NULL;
	//}
	//if(numberValueTypeMetadata != NULL) {
	//
	//delete numberValueTypeMetadata;
	//numberValueTypeMetadata = NULL;
	//}
	//if(valueType != NULL) {
	//
	//delete valueType;
	//valueType = NULL;
	//}
	//
}

void
DocumentFieldType::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *labelKey = "label";
	node = json_object_get_member(pJsonObject, labelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&label, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *numberValueTypeMetadataKey = "numberValueTypeMetadata";
	node = json_object_get_member(pJsonObject, numberValueTypeMetadataKey);
	if (node !=NULL) {
	

		if (isprimitive("DocumentFieldType_numberValueTypeMetadata")) {
			jsonToValue(&numberValueTypeMetadata, node, "DocumentFieldType_numberValueTypeMetadata", "DocumentFieldType_numberValueTypeMetadata");
		} else {
			
			DocumentFieldType_numberValueTypeMetadata* obj = static_cast<DocumentFieldType_numberValueTypeMetadata*> (&numberValueTypeMetadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *valueTypeKey = "valueType";
	node = json_object_get_member(pJsonObject, valueTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&valueType, node, "std::string", "");
		} else {
			
		}
	}
}

DocumentFieldType::DocumentFieldType(char* json)
{
	this->fromJson(json);
}

char*
DocumentFieldType::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getLabel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *labelKey = "label";
	json_object_set_member(pJsonObject, labelKey, node);
	if (isprimitive("DocumentFieldType_numberValueTypeMetadata")) {
		DocumentFieldType_numberValueTypeMetadata obj = getNumberValueTypeMetadata();
		node = converttoJson(&obj, "DocumentFieldType_numberValueTypeMetadata", "");
	}
	else {
		
		DocumentFieldType_numberValueTypeMetadata obj = static_cast<DocumentFieldType_numberValueTypeMetadata> (getNumberValueTypeMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *numberValueTypeMetadataKey = "numberValueTypeMetadata";
	json_object_set_member(pJsonObject, numberValueTypeMetadataKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValueType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueTypeKey = "valueType";
	json_object_set_member(pJsonObject, valueTypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
DocumentFieldType::getLabel()
{
	return label;
}

void
DocumentFieldType::setLabel(std::string  label)
{
	this->label = label;
}

DocumentFieldType_numberValueTypeMetadata
DocumentFieldType::getNumberValueTypeMetadata()
{
	return numberValueTypeMetadata;
}

void
DocumentFieldType::setNumberValueTypeMetadata(DocumentFieldType_numberValueTypeMetadata  numberValueTypeMetadata)
{
	this->numberValueTypeMetadata = numberValueTypeMetadata;
}

std::string
DocumentFieldType::getValueType()
{
	return valueType;
}

void
DocumentFieldType::setValueType(std::string  valueType)
{
	this->valueType = valueType;
}


