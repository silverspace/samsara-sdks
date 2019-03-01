#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_response_200_6.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_response_200_6::Inline_response_200_6()
{
	//__init();
}

Inline_response_200_6::~Inline_response_200_6()
{
	//__cleanup();
}

void
Inline_response_200_6::__init()
{
	//new std::list()std::list> dataInputs;
}

void
Inline_response_200_6::__cleanup()
{
	//if(dataInputs != NULL) {
	//dataInputs.RemoveAll(true);
	//delete dataInputs;
	//dataInputs = NULL;
	//}
	//
}

void
Inline_response_200_6::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataInputsKey = "dataInputs";
	node = json_object_get_member(pJsonObject, dataInputsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<DataInputHistoryResponse> new_list;
			DataInputHistoryResponse inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("DataInputHistoryResponse")) {
					jsonToValue(&inst, temp_json, "DataInputHistoryResponse", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			dataInputs = new_list;
		}
		
	}
}

Inline_response_200_6::Inline_response_200_6(char* json)
{
	this->fromJson(json);
}

char*
Inline_response_200_6::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("DataInputHistoryResponse")) {
		list<DataInputHistoryResponse> new_list = static_cast<list <DataInputHistoryResponse> > (getDataInputs());
		node = converttoJson(&new_list, "DataInputHistoryResponse", "array");
	} else {
		node = json_node_alloc();
		list<DataInputHistoryResponse> new_list = static_cast<list <DataInputHistoryResponse> > (getDataInputs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<DataInputHistoryResponse>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			DataInputHistoryResponse obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *dataInputsKey = "dataInputs";
	json_object_set_member(pJsonObject, dataInputsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<DataInputHistoryResponse>
Inline_response_200_6::getDataInputs()
{
	return dataInputs;
}

void
Inline_response_200_6::setDataInputs(std::list <DataInputHistoryResponse> dataInputs)
{
	this->dataInputs = dataInputs;
}


