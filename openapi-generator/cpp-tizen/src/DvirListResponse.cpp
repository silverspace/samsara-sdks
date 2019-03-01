#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DvirListResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DvirListResponse::DvirListResponse()
{
	//__init();
}

DvirListResponse::~DvirListResponse()
{
	//__cleanup();
}

void
DvirListResponse::__init()
{
	//new std::list()std::list> dvirs;
}

void
DvirListResponse::__cleanup()
{
	//if(dvirs != NULL) {
	//dvirs.RemoveAll(true);
	//delete dvirs;
	//dvirs = NULL;
	//}
	//
}

void
DvirListResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dvirsKey = "dvirs";
	node = json_object_get_member(pJsonObject, dvirsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<DvirBase> new_list;
			DvirBase inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("DvirBase")) {
					jsonToValue(&inst, temp_json, "DvirBase", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			dvirs = new_list;
		}
		
	}
}

DvirListResponse::DvirListResponse(char* json)
{
	this->fromJson(json);
}

char*
DvirListResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("DvirBase")) {
		list<DvirBase> new_list = static_cast<list <DvirBase> > (getDvirs());
		node = converttoJson(&new_list, "DvirBase", "array");
	} else {
		node = json_node_alloc();
		list<DvirBase> new_list = static_cast<list <DvirBase> > (getDvirs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<DvirBase>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			DvirBase obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *dvirsKey = "dvirs";
	json_object_set_member(pJsonObject, dvirsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<DvirBase>
DvirListResponse::getDvirs()
{
	return dvirs;
}

void
DvirListResponse::setDvirs(std::list <DvirBase> dvirs)
{
	this->dvirs = dvirs;
}


