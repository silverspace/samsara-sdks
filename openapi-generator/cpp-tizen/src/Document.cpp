#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Document.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Document::Document()
{
	//__init();
}

Document::~Document()
{
	//__cleanup();
}

void
Document::__init()
{
	//dispatchJobId = long(0);
	//notes = std::string();
	//documentType = std::string();
	//driverCreatedAtMs = long(0);
	//driverId = long(0);
	//new std::list()std::list> fields;
	//vehicleId = long(0);
}

void
Document::__cleanup()
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
	//if(documentType != NULL) {
	//
	//delete documentType;
	//documentType = NULL;
	//}
	//if(driverCreatedAtMs != NULL) {
	//
	//delete driverCreatedAtMs;
	//driverCreatedAtMs = NULL;
	//}
	//if(driverId != NULL) {
	//
	//delete driverId;
	//driverId = NULL;
	//}
	//if(fields != NULL) {
	//fields.RemoveAll(true);
	//delete fields;
	//fields = NULL;
	//}
	//if(vehicleId != NULL) {
	//
	//delete vehicleId;
	//vehicleId = NULL;
	//}
	//
}

void
Document::fromJson(char* jsonStr)
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
	const gchar *documentTypeKey = "documentType";
	node = json_object_get_member(pJsonObject, documentTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&documentType, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *driverCreatedAtMsKey = "driverCreatedAtMs";
	node = json_object_get_member(pJsonObject, driverCreatedAtMsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&driverCreatedAtMs, node, "long long", "");
		} else {
			
		}
	}
	const gchar *driverIdKey = "driverId";
	node = json_object_get_member(pJsonObject, driverIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&driverId, node, "long long", "");
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
	const gchar *vehicleIdKey = "vehicleId";
	node = json_object_get_member(pJsonObject, vehicleIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&vehicleId, node, "long long", "");
		} else {
			
		}
	}
}

Document::Document(char* json)
{
	this->fromJson(json);
}

char*
Document::toJson()
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
		std::string obj = getDocumentType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *documentTypeKey = "documentType";
	json_object_set_member(pJsonObject, documentTypeKey, node);
	if (isprimitive("long long")) {
		long long obj = getDriverCreatedAtMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *driverCreatedAtMsKey = "driverCreatedAtMs";
	json_object_set_member(pJsonObject, driverCreatedAtMsKey, node);
	if (isprimitive("long long")) {
		long long obj = getDriverId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *driverIdKey = "driverId";
	json_object_set_member(pJsonObject, driverIdKey, node);
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
	if (isprimitive("long long")) {
		long long obj = getVehicleId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *vehicleIdKey = "vehicleId";
	json_object_set_member(pJsonObject, vehicleIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
Document::getDispatchJobId()
{
	return dispatchJobId;
}

void
Document::setDispatchJobId(long long  dispatchJobId)
{
	this->dispatchJobId = dispatchJobId;
}

std::string
Document::getNotes()
{
	return notes;
}

void
Document::setNotes(std::string  notes)
{
	this->notes = notes;
}

std::string
Document::getDocumentType()
{
	return documentType;
}

void
Document::setDocumentType(std::string  documentType)
{
	this->documentType = documentType;
}

long long
Document::getDriverCreatedAtMs()
{
	return driverCreatedAtMs;
}

void
Document::setDriverCreatedAtMs(long long  driverCreatedAtMs)
{
	this->driverCreatedAtMs = driverCreatedAtMs;
}

long long
Document::getDriverId()
{
	return driverId;
}

void
Document::setDriverId(long long  driverId)
{
	this->driverId = driverId;
}

std::list<DocumentField>
Document::getFields()
{
	return fields;
}

void
Document::setFields(std::list <DocumentField> fields)
{
	this->fields = fields;
}

long long
Document::getVehicleId()
{
	return vehicleId;
}

void
Document::setVehicleId(long long  vehicleId)
{
	this->vehicleId = vehicleId;
}


