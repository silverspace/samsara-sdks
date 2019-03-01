#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DocumentType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DocumentType::DocumentType()
{
	//__init();
}

DocumentType::~DocumentType()
{
	//__cleanup();
}

void
DocumentType::__init()
{
	//new std::list()std::list> fieldTypes;
	//name = std::string();
	//orgId = long(0);
	//uuid = std::string();
}

void
DocumentType::__cleanup()
{
	//if(fieldTypes != NULL) {
	//fieldTypes.RemoveAll(true);
	//delete fieldTypes;
	//fieldTypes = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(orgId != NULL) {
	//
	//delete orgId;
	//orgId = NULL;
	//}
	//if(uuid != NULL) {
	//
	//delete uuid;
	//uuid = NULL;
	//}
	//
}

void
DocumentType::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fieldTypesKey = "fieldTypes";
	node = json_object_get_member(pJsonObject, fieldTypesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::list> new_list;
			std::list inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::list")) {
					jsonToValue(&inst, temp_json, "std::list", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			fieldTypes = new_list;
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
	const gchar *orgIdKey = "orgId";
	node = json_object_get_member(pJsonObject, orgIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&orgId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *uuidKey = "uuid";
	node = json_object_get_member(pJsonObject, uuidKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&uuid, node, "std::string", "");
		} else {
			
		}
	}
}

DocumentType::DocumentType(char* json)
{
	this->fromJson(json);
}

char*
DocumentType::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::list")) {
		list<std::list> new_list = static_cast<list <std::list> > (getFieldTypes());
		node = converttoJson(&new_list, "std::list", "array");
	} else {
		node = json_node_alloc();
		list<std::list> new_list = static_cast<list <std::list> > (getFieldTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<std::list>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			std::list obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *fieldTypesKey = "fieldTypes";
	json_object_set_member(pJsonObject, fieldTypesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getOrgId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *orgIdKey = "orgId";
	json_object_set_member(pJsonObject, orgIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUuid();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *uuidKey = "uuid";
	json_object_set_member(pJsonObject, uuidKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::list>
DocumentType::getFieldTypes()
{
	return fieldTypes;
}

void
DocumentType::setFieldTypes(std::list <std::list> fieldTypes)
{
	this->fieldTypes = fieldTypes;
}

std::string
DocumentType::getName()
{
	return name;
}

void
DocumentType::setName(std::string  name)
{
	this->name = name;
}

long long
DocumentType::getOrgId()
{
	return orgId;
}

void
DocumentType::setOrgId(long long  orgId)
{
	this->orgId = orgId;
}

std::string
DocumentType::getUuid()
{
	return uuid;
}

void
DocumentType::setUuid(std::string  uuid)
{
	this->uuid = uuid;
}


