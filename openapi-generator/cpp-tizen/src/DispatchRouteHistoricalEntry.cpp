#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DispatchRouteHistoricalEntry.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DispatchRouteHistoricalEntry::DispatchRouteHistoricalEntry()
{
	//__init();
}

DispatchRouteHistoricalEntry::~DispatchRouteHistoricalEntry()
{
	//__cleanup();
}

void
DispatchRouteHistoricalEntry::__init()
{
	//changed_at_ms = long(0);
	//route = new DispatchRoute();
}

void
DispatchRouteHistoricalEntry::__cleanup()
{
	//if(changed_at_ms != NULL) {
	//
	//delete changed_at_ms;
	//changed_at_ms = NULL;
	//}
	//if(route != NULL) {
	//
	//delete route;
	//route = NULL;
	//}
	//
}

void
DispatchRouteHistoricalEntry::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *changed_at_msKey = "changed_at_ms";
	node = json_object_get_member(pJsonObject, changed_at_msKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&changed_at_ms, node, "long long", "");
		} else {
			
		}
	}
	const gchar *routeKey = "route";
	node = json_object_get_member(pJsonObject, routeKey);
	if (node !=NULL) {
	

		if (isprimitive("DispatchRoute")) {
			jsonToValue(&route, node, "DispatchRoute", "DispatchRoute");
		} else {
			
			DispatchRoute* obj = static_cast<DispatchRoute*> (&route);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

DispatchRouteHistoricalEntry::DispatchRouteHistoricalEntry(char* json)
{
	this->fromJson(json);
}

char*
DispatchRouteHistoricalEntry::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getChangedAtMs();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *changed_at_msKey = "changed_at_ms";
	json_object_set_member(pJsonObject, changed_at_msKey, node);
	if (isprimitive("DispatchRoute")) {
		DispatchRoute obj = getRoute();
		node = converttoJson(&obj, "DispatchRoute", "");
	}
	else {
		
		DispatchRoute obj = static_cast<DispatchRoute> (getRoute());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *routeKey = "route";
	json_object_set_member(pJsonObject, routeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
DispatchRouteHistoricalEntry::getChangedAtMs()
{
	return changed_at_ms;
}

void
DispatchRouteHistoricalEntry::setChangedAtMs(long long  changed_at_ms)
{
	this->changed_at_ms = changed_at_ms;
}

DispatchRoute
DispatchRouteHistoricalEntry::getRoute()
{
	return route;
}

void
DispatchRouteHistoricalEntry::setRoute(DispatchRoute  route)
{
	this->route = route;
}


