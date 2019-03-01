#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AllRouteJobUpdates.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AllRouteJobUpdates::AllRouteJobUpdates()
{
	//__init();
}

AllRouteJobUpdates::~AllRouteJobUpdates()
{
	//__cleanup();
}

void
AllRouteJobUpdates::__init()
{
	//new std::list()std::list> job_updates;
	//sequence_id = std::string();
}

void
AllRouteJobUpdates::__cleanup()
{
	//if(job_updates != NULL) {
	//job_updates.RemoveAll(true);
	//delete job_updates;
	//job_updates = NULL;
	//}
	//if(sequence_id != NULL) {
	//
	//delete sequence_id;
	//sequence_id = NULL;
	//}
	//
}

void
AllRouteJobUpdates::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *job_updatesKey = "job_updates";
	node = json_object_get_member(pJsonObject, job_updatesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<JobUpdateObject> new_list;
			JobUpdateObject inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("JobUpdateObject")) {
					jsonToValue(&inst, temp_json, "JobUpdateObject", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			job_updates = new_list;
		}
		
	}
	const gchar *sequence_idKey = "sequence_id";
	node = json_object_get_member(pJsonObject, sequence_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&sequence_id, node, "std::string", "");
		} else {
			
		}
	}
}

AllRouteJobUpdates::AllRouteJobUpdates(char* json)
{
	this->fromJson(json);
}

char*
AllRouteJobUpdates::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("JobUpdateObject")) {
		list<JobUpdateObject> new_list = static_cast<list <JobUpdateObject> > (getJobUpdates());
		node = converttoJson(&new_list, "JobUpdateObject", "array");
	} else {
		node = json_node_alloc();
		list<JobUpdateObject> new_list = static_cast<list <JobUpdateObject> > (getJobUpdates());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<JobUpdateObject>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			JobUpdateObject obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *job_updatesKey = "job_updates";
	json_object_set_member(pJsonObject, job_updatesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSequenceId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *sequence_idKey = "sequence_id";
	json_object_set_member(pJsonObject, sequence_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<JobUpdateObject>
AllRouteJobUpdates::getJobUpdates()
{
	return job_updates;
}

void
AllRouteJobUpdates::setJobUpdates(std::list <JobUpdateObject> job_updates)
{
	this->job_updates = job_updates;
}

std::string
AllRouteJobUpdates::getSequenceId()
{
	return sequence_id;
}

void
AllRouteJobUpdates::setSequenceId(std::string  sequence_id)
{
	this->sequence_id = sequence_id;
}


