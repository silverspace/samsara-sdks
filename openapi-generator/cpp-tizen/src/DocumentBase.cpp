#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DocumentBase.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DocumentBase::DocumentBase()
{
	//__init();
}

DocumentBase::~DocumentBase()
{
	//__cleanup();
}

void
DocumentBase::__init()
{
	//dispatchJobId = long(0);
	//notes = std::string();
}

void
DocumentBase::__cleanup()
{
	//if(dispatchJobId != NULL) {
	//
	//delete dispatchJobId;
	//dispatchJobId = NULL;
	//}
	//if(notes != NULL) {
	//
	//delete notes;
	//notes = NULL;
	//}
	//
}

void
DocumentBase::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dispatchJobIdKey = "dispatchJobId";
	node = json_object_get_member(pJsonObject, dispatchJobIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&dispatchJobId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *notesKey = "notes";
	node = json_object_get_member(pJsonObject, notesKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&notes, node, "std::string", "");
		} else {
			
		}
	}
}

DocumentBase::DocumentBase(char* json)
{
	this->fromJson(json);
}

char*
DocumentBase::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getDispatchJobId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *dispatchJobIdKey = "dispatchJobId";
	json_object_set_member(pJsonObject, dispatchJobIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNotes();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *notesKey = "notes";
	json_object_set_member(pJsonObject, notesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
DocumentBase::getDispatchJobId()
{
	return dispatchJobId;
}

void
DocumentBase::setDispatchJobId(long long  dispatchJobId)
{
	this->dispatchJobId = dispatchJobId;
}

std::string
DocumentBase::getNotes()
{
	return notes;
}

void
DocumentBase::setNotes(std::string  notes)
{
	this->notes = notes;
}


