#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_object.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_object::Inline_object()
{
	//__init();
}

Inline_object::~Inline_object()
{
	//__cleanup();
}

void
Inline_object::__init()
{
	//new std::list()std::list> addresses;
}

void
Inline_object::__cleanup()
{
	//if(addresses != NULL) {
	//addresses.RemoveAll(true);
	//delete addresses;
	//addresses = NULL;
	//}
	//
}

void
Inline_object::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *addressesKey = "addresses";
	node = json_object_get_member(pJsonObject, addressesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<_addresses_addresses> new_list;
			_addresses_addresses inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("_addresses_addresses")) {
					jsonToValue(&inst, temp_json, "_addresses_addresses", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			addresses = new_list;
		}
		
	}
}

Inline_object::Inline_object(char* json)
{
	this->fromJson(json);
}

char*
Inline_object::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("_addresses_addresses")) {
		list<_addresses_addresses> new_list = static_cast<list <_addresses_addresses> > (getAddresses());
		node = converttoJson(&new_list, "_addresses_addresses", "array");
	} else {
		node = json_node_alloc();
		list<_addresses_addresses> new_list = static_cast<list <_addresses_addresses> > (getAddresses());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<_addresses_addresses>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			_addresses_addresses obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *addressesKey = "addresses";
	json_object_set_member(pJsonObject, addressesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<_addresses_addresses>
Inline_object::getAddresses()
{
	return addresses;
}

void
Inline_object::setAddresses(std::list <_addresses_addresses> addresses)
{
	this->addresses = addresses;
}


