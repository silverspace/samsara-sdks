#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_object_1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_object_1::Inline_object_1()
{
	//__init();
}

Inline_object_1::~Inline_object_1()
{
	//__cleanup();
}

void
Inline_object_1::__init()
{
	//new std::list()std::list> contactIds;
	//formattedAddress = std::string();
	//geofence = new AddressGeofence();
	//name = std::string();
	//notes = std::string();
	//new std::list()std::list> tagIds;
}

void
Inline_object_1::__cleanup()
{
	//if(contactIds != NULL) {
	//contactIds.RemoveAll(true);
	//delete contactIds;
	//contactIds = NULL;
	//}
	//if(formattedAddress != NULL) {
	//
	//delete formattedAddress;
	//formattedAddress = NULL;
	//}
	//if(geofence != NULL) {
	//
	//delete geofence;
	//geofence = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(notes != NULL) {
	//
	//delete notes;
	//notes = NULL;
	//}
	//if(tagIds != NULL) {
	//tagIds.RemoveAll(true);
	//delete tagIds;
	//tagIds = NULL;
	//}
	//
}

void
Inline_object_1::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *contactIdsKey = "contactIds";
	node = json_object_get_member(pJsonObject, contactIdsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<long long> new_list;
			long long inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("long long")) {
					jsonToValue(&inst, temp_json, "long long", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			contactIds = new_list;
		}
		
	}
	const gchar *formattedAddressKey = "formattedAddress";
	node = json_object_get_member(pJsonObject, formattedAddressKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&formattedAddress, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *geofenceKey = "geofence";
	node = json_object_get_member(pJsonObject, geofenceKey);
	if (node !=NULL) {
	

		if (isprimitive("AddressGeofence")) {
			jsonToValue(&geofence, node, "AddressGeofence", "AddressGeofence");
		} else {
			
			AddressGeofence* obj = static_cast<AddressGeofence*> (&geofence);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *notesKey = "notes";
	node = json_object_get_member(pJsonObject, notesKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&notes, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *tagIdsKey = "tagIds";
	node = json_object_get_member(pJsonObject, tagIdsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<long long> new_list;
			long long inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("long long")) {
					jsonToValue(&inst, temp_json, "long long", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			tagIds = new_list;
		}
		
	}
}

Inline_object_1::Inline_object_1(char* json)
{
	this->fromJson(json);
}

char*
Inline_object_1::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getContactIds());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getContactIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *contactIdsKey = "contactIds";
	json_object_set_member(pJsonObject, contactIdsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFormattedAddress();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *formattedAddressKey = "formattedAddress";
	json_object_set_member(pJsonObject, formattedAddressKey, node);
	if (isprimitive("AddressGeofence")) {
		AddressGeofence obj = getGeofence();
		node = converttoJson(&obj, "AddressGeofence", "");
	}
	else {
		
		AddressGeofence obj = static_cast<AddressGeofence> (getGeofence());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *geofenceKey = "geofence";
	json_object_set_member(pJsonObject, geofenceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNotes();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *notesKey = "notes";
	json_object_set_member(pJsonObject, notesKey, node);
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getTagIds());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getTagIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *tagIdsKey = "tagIds";
	json_object_set_member(pJsonObject, tagIdsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<long long>
Inline_object_1::getContactIds()
{
	return contactIds;
}

void
Inline_object_1::setContactIds(std::list <long long> contactIds)
{
	this->contactIds = contactIds;
}

std::string
Inline_object_1::getFormattedAddress()
{
	return formattedAddress;
}

void
Inline_object_1::setFormattedAddress(std::string  formattedAddress)
{
	this->formattedAddress = formattedAddress;
}

AddressGeofence
Inline_object_1::getGeofence()
{
	return geofence;
}

void
Inline_object_1::setGeofence(AddressGeofence  geofence)
{
	this->geofence = geofence;
}

std::string
Inline_object_1::getName()
{
	return name;
}

void
Inline_object_1::setName(std::string  name)
{
	this->name = name;
}

std::string
Inline_object_1::getNotes()
{
	return notes;
}

void
Inline_object_1::setNotes(std::string  notes)
{
	this->notes = notes;
}

std::list<long long>
Inline_object_1::getTagIds()
{
	return tagIds;
}

void
Inline_object_1::setTagIds(std::list <long long> tagIds)
{
	this->tagIds = tagIds;
}


