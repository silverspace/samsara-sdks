#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DocumentFieldCreate_photoValue.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DocumentFieldCreate_photoValue::DocumentFieldCreate_photoValue()
{
	//__init();
}

DocumentFieldCreate_photoValue::~DocumentFieldCreate_photoValue()
{
	//__cleanup();
}

void
DocumentFieldCreate_photoValue::__init()
{
	//url = std::string();
}

void
DocumentFieldCreate_photoValue::__cleanup()
{
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
DocumentFieldCreate_photoValue::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
}

DocumentFieldCreate_photoValue::DocumentFieldCreate_photoValue(char* json)
{
	this->fromJson(json);
}

char*
DocumentFieldCreate_photoValue::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
DocumentFieldCreate_photoValue::getUrl()
{
	return url;
}

void
DocumentFieldCreate_photoValue::setUrl(std::string  url)
{
	this->url = url;
}


