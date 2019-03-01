#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DocumentField.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DocumentField::DocumentField()
{
	//__init();
}

DocumentField::~DocumentField()
{
	//__cleanup();
}

void
DocumentField::__init()
{
	//numberValue = double(0);
	//new std::list()std::list> photoValue;
	//stringValue = std::string();
	//valueType = std::string();
	//label = std::string();
	//value = null;
}

void
DocumentField::__cleanup()
{
	//if(numberValue != NULL) {
	//
	//delete numberValue;
	//numberValue = NULL;
	//}
	//if(photoValue != NULL) {
	//photoValue.RemoveAll(true);
	//delete photoValue;
	//photoValue = NULL;
	//}
	//if(stringValue != NULL) {
	//
	//delete stringValue;
	//stringValue = NULL;
	//}
	//if(valueType != NULL) {
	//
	//delete valueType;
	//valueType = NULL;
	//}
	//if(label != NULL) {
	//
	//delete label;
	//label = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
DocumentField::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *numberValueKey = "numberValue";
	node = json_object_get_member(pJsonObject, numberValueKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&numberValue, node, "double", "");
		} else {
			
		}
	}
	const gchar *photoValueKey = "photoValue";
	node = json_object_get_member(pJsonObject, photoValueKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<DocumentFieldCreate_photoValue> new_list;
			DocumentFieldCreate_photoValue inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("DocumentFieldCreate_photoValue")) {
					jsonToValue(&inst, temp_json, "DocumentFieldCreate_photoValue", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			photoValue = new_list;
		}
		
	}
	const gchar *stringValueKey = "stringValue";
	node = json_object_get_member(pJsonObject, stringValueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&stringValue, node, "std::string", "");
		} else {
			
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
	const gchar *labelKey = "label";
	node = json_object_get_member(pJsonObject, labelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&label, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&value);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

DocumentField::DocumentField(char* json)
{
	this->fromJson(json);
}

char*
DocumentField::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("double")) {
		double obj = getNumberValue();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *numberValueKey = "numberValue";
	json_object_set_member(pJsonObject, numberValueKey, node);
	if (isprimitive("DocumentFieldCreate_photoValue")) {
		list<DocumentFieldCreate_photoValue> new_list = static_cast<list <DocumentFieldCreate_photoValue> > (getPhotoValue());
		node = converttoJson(&new_list, "DocumentFieldCreate_photoValue", "array");
	} else {
		node = json_node_alloc();
		list<DocumentFieldCreate_photoValue> new_list = static_cast<list <DocumentFieldCreate_photoValue> > (getPhotoValue());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<DocumentFieldCreate_photoValue>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			DocumentFieldCreate_photoValue obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *photoValueKey = "photoValue";
	json_object_set_member(pJsonObject, photoValueKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStringValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *stringValueKey = "stringValue";
	json_object_set_member(pJsonObject, stringValueKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValueType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueTypeKey = "valueType";
	json_object_set_member(pJsonObject, valueTypeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLabel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *labelKey = "label";
	json_object_set_member(pJsonObject, labelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getValue());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

double
DocumentField::getNumberValue()
{
	return numberValue;
}

void
DocumentField::setNumberValue(double  numberValue)
{
	this->numberValue = numberValue;
}

std::list<DocumentFieldCreate_photoValue>
DocumentField::getPhotoValue()
{
	return photoValue;
}

void
DocumentField::setPhotoValue(std::list <DocumentFieldCreate_photoValue> photoValue)
{
	this->photoValue = photoValue;
}

std::string
DocumentField::getStringValue()
{
	return stringValue;
}

void
DocumentField::setStringValue(std::string  stringValue)
{
	this->stringValue = stringValue;
}

std::string
DocumentField::getValueType()
{
	return valueType;
}

void
DocumentField::setValueType(std::string  valueType)
{
	this->valueType = valueType;
}

std::string
DocumentField::getLabel()
{
	return label;
}

void
DocumentField::setLabel(std::string  label)
{
	this->label = label;
}

std::string
DocumentField::getValue()
{
	return value;
}

void
DocumentField::setValue(std::string  value)
{
	this->value = value;
}


