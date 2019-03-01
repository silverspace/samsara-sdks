#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MachineHistoryResponse_vibrations.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MachineHistoryResponse_vibrations::MachineHistoryResponse_vibrations()
{
	//__init();
}

MachineHistoryResponse_vibrations::~MachineHistoryResponse_vibrations()
{
	//__cleanup();
}

void
MachineHistoryResponse_vibrations::__init()
{
	//x = double(0);
	//y = double(0);
	//z = double(0);
	//time = long(0);
}

void
MachineHistoryResponse_vibrations::__cleanup()
{
	//if(x != NULL) {
	//
	//delete x;
	//x = NULL;
	//}
	//if(y != NULL) {
	//
	//delete y;
	//y = NULL;
	//}
	//if(z != NULL) {
	//
	//delete z;
	//z = NULL;
	//}
	//if(time != NULL) {
	//
	//delete time;
	//time = NULL;
	//}
	//
}

void
MachineHistoryResponse_vibrations::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *xKey = "X";
	node = json_object_get_member(pJsonObject, xKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&x, node, "double", "");
		} else {
			
		}
	}
	const gchar *yKey = "Y";
	node = json_object_get_member(pJsonObject, yKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&y, node, "double", "");
		} else {
			
		}
	}
	const gchar *zKey = "Z";
	node = json_object_get_member(pJsonObject, zKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&z, node, "double", "");
		} else {
			
		}
	}
	const gchar *timeKey = "time";
	node = json_object_get_member(pJsonObject, timeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&time, node, "long long", "");
		} else {
			
		}
	}
}

MachineHistoryResponse_vibrations::MachineHistoryResponse_vibrations(char* json)
{
	this->fromJson(json);
}

char*
MachineHistoryResponse_vibrations::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("double")) {
		double obj = getX();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *xKey = "X";
	json_object_set_member(pJsonObject, xKey, node);
	if (isprimitive("double")) {
		double obj = getY();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *yKey = "Y";
	json_object_set_member(pJsonObject, yKey, node);
	if (isprimitive("double")) {
		double obj = getZ();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *zKey = "Z";
	json_object_set_member(pJsonObject, zKey, node);
	if (isprimitive("long long")) {
		long long obj = getTime();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *timeKey = "time";
	json_object_set_member(pJsonObject, timeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

double
MachineHistoryResponse_vibrations::getX()
{
	return x;
}

void
MachineHistoryResponse_vibrations::setX(double  x)
{
	this->x = x;
}

double
MachineHistoryResponse_vibrations::getY()
{
	return y;
}

void
MachineHistoryResponse_vibrations::setY(double  y)
{
	this->y = y;
}

double
MachineHistoryResponse_vibrations::getZ()
{
	return z;
}

void
MachineHistoryResponse_vibrations::setZ(double  z)
{
	this->z = z;
}

long long
MachineHistoryResponse_vibrations::getTime()
{
	return time;
}

void
MachineHistoryResponse_vibrations::setTime(long long  time)
{
	this->time = time;
}


