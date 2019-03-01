#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TripResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TripResponse::TripResponse()
{
	//__init();
}

TripResponse::~TripResponse()
{
	//__cleanup();
}

void
TripResponse::__init()
{
	//new std::list()std::list> trips;
}

void
TripResponse::__cleanup()
{
	//if(trips != NULL) {
	//trips.RemoveAll(true);
	//delete trips;
	//trips = NULL;
	//}
	//
}

void
TripResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *tripsKey = "trips";
	node = json_object_get_member(pJsonObject, tripsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TripResponse_trips> new_list;
			TripResponse_trips inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TripResponse_trips")) {
					jsonToValue(&inst, temp_json, "TripResponse_trips", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			trips = new_list;
		}
		
	}
}

TripResponse::TripResponse(char* json)
{
	this->fromJson(json);
}

char*
TripResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TripResponse_trips")) {
		list<TripResponse_trips> new_list = static_cast<list <TripResponse_trips> > (getTrips());
		node = converttoJson(&new_list, "TripResponse_trips", "array");
	} else {
		node = json_node_alloc();
		list<TripResponse_trips> new_list = static_cast<list <TripResponse_trips> > (getTrips());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TripResponse_trips>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TripResponse_trips obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *tripsKey = "trips";
	json_object_set_member(pJsonObject, tripsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<TripResponse_trips>
TripResponse::getTrips()
{
	return trips;
}

void
TripResponse::setTrips(std::list <TripResponse_trips> trips)
{
	this->trips = trips;
}


