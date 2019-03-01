#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_response_200_5.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_response_200_5::Inline_response_200_5()
{
	//__init();
}

Inline_response_200_5::~Inline_response_200_5()
{
	//__cleanup();
}

void
Inline_response_200_5::__init()
{
	//pagination = new Pagination();
	//new std::list()std::list> vehicleStats;
}

void
Inline_response_200_5::__cleanup()
{
	//if(pagination != NULL) {
	//
	//delete pagination;
	//pagination = NULL;
	//}
	//if(vehicleStats != NULL) {
	//vehicleStats.RemoveAll(true);
	//delete vehicleStats;
	//vehicleStats = NULL;
	//}
	//
}

void
Inline_response_200_5::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *paginationKey = "pagination";
	node = json_object_get_member(pJsonObject, paginationKey);
	if (node !=NULL) {
	

		if (isprimitive("Pagination")) {
			jsonToValue(&pagination, node, "Pagination", "Pagination");
		} else {
			
			Pagination* obj = static_cast<Pagination*> (&pagination);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *vehicleStatsKey = "vehicleStats";
	node = json_object_get_member(pJsonObject, vehicleStatsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Inline_response_200_5_vehicleStats> new_list;
			Inline_response_200_5_vehicleStats inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Inline_response_200_5_vehicleStats")) {
					jsonToValue(&inst, temp_json, "Inline_response_200_5_vehicleStats", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			vehicleStats = new_list;
		}
		
	}
}

Inline_response_200_5::Inline_response_200_5(char* json)
{
	this->fromJson(json);
}

char*
Inline_response_200_5::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Pagination")) {
		Pagination obj = getPagination();
		node = converttoJson(&obj, "Pagination", "");
	}
	else {
		
		Pagination obj = static_cast<Pagination> (getPagination());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *paginationKey = "pagination";
	json_object_set_member(pJsonObject, paginationKey, node);
	if (isprimitive("Inline_response_200_5_vehicleStats")) {
		list<Inline_response_200_5_vehicleStats> new_list = static_cast<list <Inline_response_200_5_vehicleStats> > (getVehicleStats());
		node = converttoJson(&new_list, "Inline_response_200_5_vehicleStats", "array");
	} else {
		node = json_node_alloc();
		list<Inline_response_200_5_vehicleStats> new_list = static_cast<list <Inline_response_200_5_vehicleStats> > (getVehicleStats());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Inline_response_200_5_vehicleStats>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Inline_response_200_5_vehicleStats obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *vehicleStatsKey = "vehicleStats";
	json_object_set_member(pJsonObject, vehicleStatsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Pagination
Inline_response_200_5::getPagination()
{
	return pagination;
}

void
Inline_response_200_5::setPagination(Pagination  pagination)
{
	this->pagination = pagination;
}

std::list<Inline_response_200_5_vehicleStats>
Inline_response_200_5::getVehicleStats()
{
	return vehicleStats;
}

void
Inline_response_200_5::setVehicleStats(std::list <Inline_response_200_5_vehicleStats> vehicleStats)
{
	this->vehicleStats = vehicleStats;
}


