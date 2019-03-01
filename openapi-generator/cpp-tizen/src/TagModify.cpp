#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TagModify.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TagModify::TagModify()
{
	//__init();
}

TagModify::~TagModify()
{
	//__cleanup();
}

void
TagModify::__init()
{
	//add = new TagModify_add();
	//_delete = new TagModify_delete();
	//name = std::string();
	//parentTagId = long(0);
}

void
TagModify::__cleanup()
{
	//if(add != NULL) {
	//
	//delete add;
	//add = NULL;
	//}
	//if(_delete != NULL) {
	//
	//delete _delete;
	//_delete = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(parentTagId != NULL) {
	//
	//delete parentTagId;
	//parentTagId = NULL;
	//}
	//
}

void
TagModify::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *addKey = "add";
	node = json_object_get_member(pJsonObject, addKey);
	if (node !=NULL) {
	

		if (isprimitive("TagModify_add")) {
			jsonToValue(&add, node, "TagModify_add", "TagModify_add");
		} else {
			
			TagModify_add* obj = static_cast<TagModify_add*> (&add);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *_deleteKey = "delete";
	node = json_object_get_member(pJsonObject, _deleteKey);
	if (node !=NULL) {
	

		if (isprimitive("TagModify_delete")) {
			jsonToValue(&_delete, node, "TagModify_delete", "TagModify_delete");
		} else {
			
			TagModify_delete* obj = static_cast<TagModify_delete*> (&_delete);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *parentTagIdKey = "parentTagId";
	node = json_object_get_member(pJsonObject, parentTagIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&parentTagId, node, "long long", "");
		} else {
			
		}
	}
}

TagModify::TagModify(char* json)
{
	this->fromJson(json);
}

char*
TagModify::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TagModify_add")) {
		TagModify_add obj = getAdd();
		node = converttoJson(&obj, "TagModify_add", "");
	}
	else {
		
		TagModify_add obj = static_cast<TagModify_add> (getAdd());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *addKey = "add";
	json_object_set_member(pJsonObject, addKey, node);
	if (isprimitive("TagModify_delete")) {
		TagModify_delete obj = getDelete();
		node = converttoJson(&obj, "TagModify_delete", "");
	}
	else {
		
		TagModify_delete obj = static_cast<TagModify_delete> (getDelete());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *_deleteKey = "delete";
	json_object_set_member(pJsonObject, _deleteKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getParentTagId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *parentTagIdKey = "parentTagId";
	json_object_set_member(pJsonObject, parentTagIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

TagModify_add
TagModify::getAdd()
{
	return add;
}

void
TagModify::setAdd(TagModify_add  add)
{
	this->add = add;
}

TagModify_delete
TagModify::getDelete()
{
	return _delete;
}

void
TagModify::setDelete(TagModify_delete  _delete)
{
	this->_delete = _delete;
}

std::string
TagModify::getName()
{
	return name;
}

void
TagModify::setName(std::string  name)
{
	this->name = name;
}

long long
TagModify::getParentTagId()
{
	return parentTagId;
}

void
TagModify::setParentTagId(long long  parentTagId)
{
	this->parentTagId = parentTagId;
}


