#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuxInputSeries.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuxInputSeries::AuxInputSeries()
{
	//__init();
}

AuxInputSeries::~AuxInputSeries()
{
	//__cleanup();
}

void
AuxInputSeries::__init()
{
	//name = std::string();
	//new std::list()std::list> values;
}

void
AuxInputSeries::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(values != NULL) {
	//values.RemoveAll(true);
	//delete values;
	//values = NULL;
	//}
	//
}

void
AuxInputSeries::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AuxInput> new_list;
			AuxInput inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AuxInput")) {
					jsonToValue(&inst, temp_json, "AuxInput", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			values = new_list;
		}
		
	}
}

AuxInputSeries::AuxInputSeries(char* json)
{
	this->fromJson(json);
}

char*
AuxInputSeries::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("AuxInput")) {
		list<AuxInput> new_list = static_cast<list <AuxInput> > (getValues());
		node = converttoJson(&new_list, "AuxInput", "array");
	} else {
		node = json_node_alloc();
		list<AuxInput> new_list = static_cast<list <AuxInput> > (getValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AuxInput>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AuxInput obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *valuesKey = "values";
	json_object_set_member(pJsonObject, valuesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AuxInputSeries::getName()
{
	return name;
}

void
AuxInputSeries::setName(std::string  name)
{
	this->name = name;
}

std::list<AuxInput>
AuxInputSeries::getValues()
{
	return values;
}

void
AuxInputSeries::setValues(std::list <AuxInput> values)
{
	this->values = values;
}


