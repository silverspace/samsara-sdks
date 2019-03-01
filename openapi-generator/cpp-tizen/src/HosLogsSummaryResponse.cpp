#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "HosLogsSummaryResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

HosLogsSummaryResponse::HosLogsSummaryResponse()
{
	//__init();
}

HosLogsSummaryResponse::~HosLogsSummaryResponse()
{
	//__cleanup();
}

void
HosLogsSummaryResponse::__init()
{
	//new std::list()std::list> drivers;
}

void
HosLogsSummaryResponse::__cleanup()
{
	//if(drivers != NULL) {
	//drivers.RemoveAll(true);
	//delete drivers;
	//drivers = NULL;
	//}
	//
}

void
HosLogsSummaryResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *driversKey = "drivers";
	node = json_object_get_member(pJsonObject, driversKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<HosLogsSummaryResponse_drivers> new_list;
			HosLogsSummaryResponse_drivers inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("HosLogsSummaryResponse_drivers")) {
					jsonToValue(&inst, temp_json, "HosLogsSummaryResponse_drivers", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			drivers = new_list;
		}
		
	}
}

HosLogsSummaryResponse::HosLogsSummaryResponse(char* json)
{
	this->fromJson(json);
}

char*
HosLogsSummaryResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("HosLogsSummaryResponse_drivers")) {
		list<HosLogsSummaryResponse_drivers> new_list = static_cast<list <HosLogsSummaryResponse_drivers> > (getDrivers());
		node = converttoJson(&new_list, "HosLogsSummaryResponse_drivers", "array");
	} else {
		node = json_node_alloc();
		list<HosLogsSummaryResponse_drivers> new_list = static_cast<list <HosLogsSummaryResponse_drivers> > (getDrivers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<HosLogsSummaryResponse_drivers>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			HosLogsSummaryResponse_drivers obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *driversKey = "drivers";
	json_object_set_member(pJsonObject, driversKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<HosLogsSummaryResponse_drivers>
HosLogsSummaryResponse::getDrivers()
{
	return drivers;
}

void
HosLogsSummaryResponse::setDrivers(std::list <HosLogsSummaryResponse_drivers> drivers)
{
	this->drivers = drivers;
}


