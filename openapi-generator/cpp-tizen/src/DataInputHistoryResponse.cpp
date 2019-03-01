#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DataInputHistoryResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DataInputHistoryResponse::DataInputHistoryResponse()
{
	//__init();
}

DataInputHistoryResponse::~DataInputHistoryResponse()
{
	//__cleanup();
}

void
DataInputHistoryResponse::__init()
{
	//id = long(0);
	//name = std::string();
	//new std::list()std::list> points;
}

void
DataInputHistoryResponse::__cleanup()
{
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
	//if(points != NULL) {
	//points.RemoveAll(true);
	//delete points;
	//points = NULL;
	//}
	//
}

void
DataInputHistoryResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *pointsKey = "points";
	node = json_object_get_member(pJsonObject, pointsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<DataInputHistoryResponse_points> new_list;
			DataInputHistoryResponse_points inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("DataInputHistoryResponse_points")) {
					jsonToValue(&inst, temp_json, "DataInputHistoryResponse_points", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			points = new_list;
		}
		
	}
}

DataInputHistoryResponse::DataInputHistoryResponse(char* json)
{
	this->fromJson(json);
}

char*
DataInputHistoryResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("DataInputHistoryResponse_points")) {
		list<DataInputHistoryResponse_points> new_list = static_cast<list <DataInputHistoryResponse_points> > (getPoints());
		node = converttoJson(&new_list, "DataInputHistoryResponse_points", "array");
	} else {
		node = json_node_alloc();
		list<DataInputHistoryResponse_points> new_list = static_cast<list <DataInputHistoryResponse_points> > (getPoints());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<DataInputHistoryResponse_points>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			DataInputHistoryResponse_points obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pointsKey = "points";
	json_object_set_member(pJsonObject, pointsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
DataInputHistoryResponse::getId()
{
	return id;
}

void
DataInputHistoryResponse::setId(long long  id)
{
	this->id = id;
}

std::string
DataInputHistoryResponse::getName()
{
	return name;
}

void
DataInputHistoryResponse::setName(std::string  name)
{
	this->name = name;
}

std::list<DataInputHistoryResponse_points>
DataInputHistoryResponse::getPoints()
{
	return points;
}

void
DataInputHistoryResponse::setPoints(std::list <DataInputHistoryResponse_points> points)
{
	this->points = points;
}


