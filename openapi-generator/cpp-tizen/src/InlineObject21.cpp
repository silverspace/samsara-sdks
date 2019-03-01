#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_object_21.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_object_21::Inline_object_21()
{
	//__init();
}

Inline_object_21::~Inline_object_21()
{
	//__cleanup();
}

void
Inline_object_21::__init()
{
	//endMs = int(0);
	//fillMissing = std::string();
	//groupId = long(0);
	//new std::list()std::list> series;
	//startMs = int(0);
	//stepMs = int(0);
}

void
Inline_object_21::__cleanup()
{
	//if(endMs != NULL) {
	//
	//delete endMs;
	//endMs = NULL;
	//}
	//if(fillMissing != NULL) {
	//
	//delete fillMissing;
	//fillMissing = NULL;
	//}
	//if(groupId != NULL) {
	//
	//delete groupId;
	//groupId = NULL;
	//}
	//if(series != NULL) {
	//series.RemoveAll(true);
	//delete series;
	//series = NULL;
	//}
	//if(startMs != NULL) {
	//
	//delete startMs;
	//startMs = NULL;
	//}
	//if(stepMs != NULL) {
	//
	//delete stepMs;
	//stepMs = NULL;
	//}
	//
}

void
Inline_object_21::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *endMsKey = "endMs";
	node = json_object_get_member(pJsonObject, endMsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&endMs, node, "int", "");
		} else {
			
		}
	}
	const gchar *fillMissingKey = "fillMissing";
	node = json_object_get_member(pJsonObject, fillMissingKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&fillMissing, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *groupIdKey = "groupId";
	node = json_object_get_member(pJsonObject, groupIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&groupId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *seriesKey = "series";
	node = json_object_get_member(pJsonObject, seriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<_sensors_history_series> new_list;
			_sensors_history_series inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("_sensors_history_series")) {
					jsonToValue(&inst, temp_json, "_sensors_history_series", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			series = new_list;
		}
		
	}
	const gchar *startMsKey = "startMs";
	node = json_object_get_member(pJsonObject, startMsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&startMs, node, "int", "");
		} else {
			
		}
	}
	const gchar *stepMsKey = "stepMs";
	node = json_object_get_member(pJsonObject, stepMsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&stepMs, node, "int", "");
		} else {
			
		}
	}
}

Inline_object_21::Inline_object_21(char* json)
{
	this->fromJson(json);
}

char*
Inline_object_21::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getEndMs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *endMsKey = "endMs";
	json_object_set_member(pJsonObject, endMsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFillMissing();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fillMissingKey = "fillMissing";
	json_object_set_member(pJsonObject, fillMissingKey, node);
	if (isprimitive("long long")) {
		long long obj = getGroupId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *groupIdKey = "groupId";
	json_object_set_member(pJsonObject, groupIdKey, node);
	if (isprimitive("_sensors_history_series")) {
		list<_sensors_history_series> new_list = static_cast<list <_sensors_history_series> > (getSeries());
		node = converttoJson(&new_list, "_sensors_history_series", "array");
	} else {
		node = json_node_alloc();
		list<_sensors_history_series> new_list = static_cast<list <_sensors_history_series> > (getSeries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<_sensors_history_series>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			_sensors_history_series obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *seriesKey = "series";
	json_object_set_member(pJsonObject, seriesKey, node);
	if (isprimitive("int")) {
		int obj = getStartMs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *startMsKey = "startMs";
	json_object_set_member(pJsonObject, startMsKey, node);
	if (isprimitive("int")) {
		int obj = getStepMs();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *stepMsKey = "stepMs";
	json_object_set_member(pJsonObject, stepMsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
Inline_object_21::getEndMs()
{
	return endMs;
}

void
Inline_object_21::setEndMs(int  endMs)
{
	this->endMs = endMs;
}

std::string
Inline_object_21::getFillMissing()
{
	return fillMissing;
}

void
Inline_object_21::setFillMissing(std::string  fillMissing)
{
	this->fillMissing = fillMissing;
}

long long
Inline_object_21::getGroupId()
{
	return groupId;
}

void
Inline_object_21::setGroupId(long long  groupId)
{
	this->groupId = groupId;
}

std::list<_sensors_history_series>
Inline_object_21::getSeries()
{
	return series;
}

void
Inline_object_21::setSeries(std::list <_sensors_history_series> series)
{
	this->series = series;
}

int
Inline_object_21::getStartMs()
{
	return startMs;
}

void
Inline_object_21::setStartMs(int  startMs)
{
	this->startMs = startMs;
}

int
Inline_object_21::getStepMs()
{
	return stepMs;
}

void
Inline_object_21::setStepMs(int  stepMs)
{
	this->stepMs = stepMs;
}


