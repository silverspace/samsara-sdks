#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DocumentCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DocumentCreate::DocumentCreate()
{
	//__init();
}

DocumentCreate::~DocumentCreate()
{
	//__cleanup();
}

void
DocumentCreate::__init()
{
	//dispatchJobId = long(0);
	//notes = std::string();
	//documentTypeUuid = std::string();
	//new std::list()std::list> fields;
}

void
DocumentCreate::__cleanup()
{
	//if(dispatchJobId != NULL) {
	//
	//delete dispatchJobId;
	//dispatchJobId = NULL;
	//}
	//if(notes != NULL) {
	//
	//delete notes;
	//notes = NULL;
	//}
	//if(documentTypeUuid != NULL) {
	//
	//delete documentTypeUuid;
	//documentTypeUuid = NULL;
	//}
	//if(fields != NULL) {
	//fields.RemoveAll(true);
	//delete fields;
	//fields = NULL;
	//}
	//
}

void
DocumentCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dispatchJobIdKey = "dispatchJobId";
	node = json_object_get_member(pJsonObject, dispatchJobIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&dispatchJobId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *notesKey = "notes";
	node = json_object_get_member(pJsonObject, notesKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&notes, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *documentTypeUuidKey = "documentTypeUuid";
	node = json_object_get_member(pJsonObject, documentTypeUuidKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&documentTypeUuid, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *fieldsKey = "fields";
	node = json_object_get_member(pJsonObject, fieldsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<DocumentField> new_list;
			DocumentField inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("DocumentField")) {
					jsonToValue(&inst, temp_json, "DocumentField", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			fields = new_list;
		}
		
	}
}

DocumentCreate::DocumentCreate(char* json)
{
	this->fromJson(json);
}

char*
DocumentCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getDispatchJobId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *dispatchJobIdKey = "dispatchJobId";
	json_object_set_member(pJsonObject, dispatchJobIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNotes();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *notesKey = "notes";
	json_object_set_member(pJsonObject, notesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDocumentTypeUuid();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *documentTypeUuidKey = "documentTypeUuid";
	json_object_set_member(pJsonObject, documentTypeUuidKey, node);
	if (isprimitive("DocumentField")) {
		list<DocumentField> new_list = static_cast<list <DocumentField> > (getFields());
		node = converttoJson(&new_list, "DocumentField", "array");
	} else {
		node = json_node_alloc();
		list<DocumentField> new_list = static_cast<list <DocumentField> > (getFields());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<DocumentField>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			DocumentField obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *fieldsKey = "fields";
	json_object_set_member(pJsonObject, fieldsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
DocumentCreate::getDispatchJobId()
{
	return dispatchJobId;
}

void
DocumentCreate::setDispatchJobId(long long  dispatchJobId)
{
	this->dispatchJobId = dispatchJobId;
}

std::string
DocumentCreate::getNotes()
{
	return notes;
}

void
DocumentCreate::setNotes(std::string  notes)
{
	this->notes = notes;
}

std::string
DocumentCreate::getDocumentTypeUuid()
{
	return documentTypeUuid;
}

void
DocumentCreate::setDocumentTypeUuid(std::string  documentTypeUuid)
{
	this->documentTypeUuid = documentTypeUuid;
}

std::list<DocumentField>
DocumentCreate::getFields()
{
	return fields;
}

void
DocumentCreate::setFields(std::list <DocumentField> fields)
{
	this->fields = fields;
}


