#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DvirBase_trailerDefects.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DvirBase_trailerDefects::DvirBase_trailerDefects()
{
	//__init();
}

DvirBase_trailerDefects::~DvirBase_trailerDefects()
{
	//__cleanup();
}

void
DvirBase_trailerDefects::__init()
{
	//comment = std::string();
	//defectType = std::string();
}

void
DvirBase_trailerDefects::__cleanup()
{
	//if(comment != NULL) {
	//
	//delete comment;
	//comment = NULL;
	//}
	//if(defectType != NULL) {
	//
	//delete defectType;
	//defectType = NULL;
	//}
	//
}

void
DvirBase_trailerDefects::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *commentKey = "comment";
	node = json_object_get_member(pJsonObject, commentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&comment, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *defectTypeKey = "defectType";
	node = json_object_get_member(pJsonObject, defectTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&defectType, node, "std::string", "");
		} else {
			
		}
	}
}

DvirBase_trailerDefects::DvirBase_trailerDefects(char* json)
{
	this->fromJson(json);
}

char*
DvirBase_trailerDefects::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getComment();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *commentKey = "comment";
	json_object_set_member(pJsonObject, commentKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDefectType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *defectTypeKey = "defectType";
	json_object_set_member(pJsonObject, defectTypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
DvirBase_trailerDefects::getComment()
{
	return comment;
}

void
DvirBase_trailerDefects::setComment(std::string  comment)
{
	this->comment = comment;
}

std::string
DvirBase_trailerDefects::getDefectType()
{
	return defectType;
}

void
DvirBase_trailerDefects::setDefectType(std::string  defectType)
{
	this->defectType = defectType;
}


