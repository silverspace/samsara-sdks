#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Inline_response_200_9.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Inline_response_200_9::Inline_response_200_9()
{
	//__init();
}

Inline_response_200_9::~Inline_response_200_9()
{
	//__cleanup();
}

void
Inline_response_200_9::__init()
{
	//new std::list()std::list> tags;
}

void
Inline_response_200_9::__cleanup()
{
	//if(tags != NULL) {
	//tags.RemoveAll(true);
	//delete tags;
	//tags = NULL;
	//}
	//
}

void
Inline_response_200_9::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *tagsKey = "tags";
	node = json_object_get_member(pJsonObject, tagsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Tag> new_list;
			Tag inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Tag")) {
					jsonToValue(&inst, temp_json, "Tag", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tags = new_list;
		}
		
	}
}

Inline_response_200_9::Inline_response_200_9(char* json)
{
	this->fromJson(json);
}

char*
Inline_response_200_9::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Tag")) {
		list<Tag> new_list = static_cast<list <Tag> > (getTags());
		node = converttoJson(&new_list, "Tag", "array");
	} else {
		node = json_node_alloc();
		list<Tag> new_list = static_cast<list <Tag> > (getTags());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Tag>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Tag obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *tagsKey = "tags";
	json_object_set_member(pJsonObject, tagsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<Tag>
Inline_response_200_9::getTags()
{
	return tags;
}

void
Inline_response_200_9::setTags(std::list <Tag> tags)
{
	this->tags = tags;
}


