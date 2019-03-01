#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Pagination.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Pagination::Pagination()
{
	//__init();
}

Pagination::~Pagination()
{
	//__cleanup();
}

void
Pagination::__init()
{
	//endCursor = std::string();
	//hasNextPage = bool(false);
	//hasPrevPage = bool(false);
	//startCursor = std::string();
}

void
Pagination::__cleanup()
{
	//if(endCursor != NULL) {
	//
	//delete endCursor;
	//endCursor = NULL;
	//}
	//if(hasNextPage != NULL) {
	//
	//delete hasNextPage;
	//hasNextPage = NULL;
	//}
	//if(hasPrevPage != NULL) {
	//
	//delete hasPrevPage;
	//hasPrevPage = NULL;
	//}
	//if(startCursor != NULL) {
	//
	//delete startCursor;
	//startCursor = NULL;
	//}
	//
}

void
Pagination::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *endCursorKey = "endCursor";
	node = json_object_get_member(pJsonObject, endCursorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&endCursor, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *hasNextPageKey = "hasNextPage";
	node = json_object_get_member(pJsonObject, hasNextPageKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&hasNextPage, node, "bool", "");
		} else {
			
		}
	}
	const gchar *hasPrevPageKey = "hasPrevPage";
	node = json_object_get_member(pJsonObject, hasPrevPageKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&hasPrevPage, node, "bool", "");
		} else {
			
		}
	}
	const gchar *startCursorKey = "startCursor";
	node = json_object_get_member(pJsonObject, startCursorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&startCursor, node, "std::string", "");
		} else {
			
		}
	}
}

Pagination::Pagination(char* json)
{
	this->fromJson(json);
}

char*
Pagination::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getEndCursor();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *endCursorKey = "endCursor";
	json_object_set_member(pJsonObject, endCursorKey, node);
	if (isprimitive("bool")) {
		bool obj = getHasNextPage();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *hasNextPageKey = "hasNextPage";
	json_object_set_member(pJsonObject, hasNextPageKey, node);
	if (isprimitive("bool")) {
		bool obj = getHasPrevPage();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *hasPrevPageKey = "hasPrevPage";
	json_object_set_member(pJsonObject, hasPrevPageKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStartCursor();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *startCursorKey = "startCursor";
	json_object_set_member(pJsonObject, startCursorKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Pagination::getEndCursor()
{
	return endCursor;
}

void
Pagination::setEndCursor(std::string  endCursor)
{
	this->endCursor = endCursor;
}

bool
Pagination::getHasNextPage()
{
	return hasNextPage;
}

void
Pagination::setHasNextPage(bool  hasNextPage)
{
	this->hasNextPage = hasNextPage;
}

bool
Pagination::getHasPrevPage()
{
	return hasPrevPage;
}

void
Pagination::setHasPrevPage(bool  hasPrevPage)
{
	this->hasPrevPage = hasPrevPage;
}

std::string
Pagination::getStartCursor()
{
	return startCursor;
}

void
Pagination::setStartCursor(std::string  startCursor)
{
	this->startCursor = startCursor;
}


