#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Address.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Address::Address()
{
	//__init();
}

Address::~Address()
{
	//__cleanup();
}

void
Address::__init()
{
	//new std::list()std::list> contacts;
	//formattedAddress = std::string();
	//geofence = new AddressGeofence();
	//id = long(0);
	//name = std::string();
	//notes = std::string();
	//new std::list()std::list> tags;
}

void
Address::__cleanup()
{
	//if(contacts != NULL) {
	//contacts.RemoveAll(true);
	//delete contacts;
	//contacts = NULL;
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
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
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
	//if(tags != NULL) {
	//tags.RemoveAll(true);
	//delete tags;
	//tags = NULL;
	//}
	//
}

void
Address::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *contactsKey = "contacts";
	node = json_object_get_member(pJsonObject, contactsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Contact> new_list;
			Contact inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Contact")) {
					jsonToValue(&inst, temp_json, "Contact", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			contacts = new_list;
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&id, node, "long long", "");
		} else {
			
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
	const gchar *tagsKey = "tags";
	node = json_object_get_member(pJsonObject, tagsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TagMetadata> new_list;
			TagMetadata inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TagMetadata")) {
					jsonToValue(&inst, temp_json, "TagMetadata", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tags = new_list;
		}
		
	}
}

Address::Address(char* json)
{
	this->fromJson(json);
}

char*
Address::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Contact")) {
		list<Contact> new_list = static_cast<list <Contact> > (getContacts());
		node = converttoJson(&new_list, "Contact", "array");
	} else {
		node = json_node_alloc();
		list<Contact> new_list = static_cast<list <Contact> > (getContacts());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Contact>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Contact obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *contactsKey = "contacts";
	json_object_set_member(pJsonObject, contactsKey, node);
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
	if (isprimitive("long long")) {
		long long obj = getId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
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
	if (isprimitive("TagMetadata")) {
		list<TagMetadata> new_list = static_cast<list <TagMetadata> > (getTags());
		node = converttoJson(&new_list, "TagMetadata", "array");
	} else {
		node = json_node_alloc();
		list<TagMetadata> new_list = static_cast<list <TagMetadata> > (getTags());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TagMetadata>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TagMetadata obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *tagsKey = "tags";
	json_object_set_member(pJsonObject, tagsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<Contact>
Address::getContacts()
{
	return contacts;
}

void
Address::setContacts(std::list <Contact> contacts)
{
	this->contacts = contacts;
}

std::string
Address::getFormattedAddress()
{
	return formattedAddress;
}

void
Address::setFormattedAddress(std::string  formattedAddress)
{
	this->formattedAddress = formattedAddress;
}

AddressGeofence
Address::getGeofence()
{
	return geofence;
}

void
Address::setGeofence(AddressGeofence  geofence)
{
	this->geofence = geofence;
}

long long
Address::getId()
{
	return id;
}

void
Address::setId(long long  id)
{
	this->id = id;
}

std::string
Address::getName()
{
	return name;
}

void
Address::setName(std::string  name)
{
	this->name = name;
}

std::string
Address::getNotes()
{
	return notes;
}

void
Address::setNotes(std::string  notes)
{
	this->notes = notes;
}

std::list<TagMetadata>
Address::getTags()
{
	return tags;
}

void
Address::setTags(std::list <TagMetadata> tags)
{
	this->tags = tags;
}


