#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SensorHistoryResponse_results.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SensorHistoryResponse_results::SensorHistoryResponse_results()
{
	//__init();
}

SensorHistoryResponse_results::~SensorHistoryResponse_results()
{
	//__cleanup();
}

void
SensorHistoryResponse_results::__init()
{
	//new std::list()std::list> series;
	//timeMs = int(0);
}

void
SensorHistoryResponse_results::__cleanup()
{
	//if(series != NULL) {
	//series.RemoveAll(true);
	//delete series;
	//series = NULL;
	//}
	//if(timeMs != NULL) {
	//
	//delete timeMs;
	//timeMs = NULL;
	//}
	//
}

void
SensorHistoryResponse_results::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *seriesKey = "series";
	node = json_object_get_member(pJsonObject, seriesKey);
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
			series = new_list;
		}
		
	}
	const gchar *timeMsKey = "timeMs";
	node = json_object_get_member(pJsonObject, timeMsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&timeMs, node, "int", "");
		} else {
			
		}
	}
}

SensorHistoryResponse_results::SensorHistoryResponse_results(char* json)
{
	this->fromJson(json);
}

char*
SensorHistoryResponse_results::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getSeries());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getSeries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *seriesKey = "series";
	json_object_set_member(pJsonObject, seriesKey, node);
	if (isprimitive("int")) {
		int obj = getTimeMs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *timeMsKey = "timeMs";
	json_object_set_member(pJsonObject, timeMsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<long long>
SensorHistoryResponse_results::getSeries()
{
	return series;
}

void
SensorHistoryResponse_results::setSeries(std::list <long long> series)
{
	this->series = series;
}

int
SensorHistoryResponse_results::getTimeMs()
{
	return timeMs;
}

void
SensorHistoryResponse_results::setTimeMs(int  timeMs)
{
	this->timeMs = timeMs;
}


