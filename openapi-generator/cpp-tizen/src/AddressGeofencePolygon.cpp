#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AddressGeofence_polygon.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AddressGeofence_polygon::AddressGeofence_polygon()
{
	//__init();
}

AddressGeofence_polygon::~AddressGeofence_polygon()
{
	//__cleanup();
}

void
AddressGeofence_polygon::__init()
{
	//new std::list()std::list> vertices;
}

void
AddressGeofence_polygon::__cleanup()
{
	//if(vertices != NULL) {
	//vertices.RemoveAll(true);
	//delete vertices;
	//vertices = NULL;
	//}
	//
}

void
AddressGeofence_polygon::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *verticesKey = "vertices";
	node = json_object_get_member(pJsonObject, verticesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AddressGeofence_polygon_vertices> new_list;
			AddressGeofence_polygon_vertices inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AddressGeofence_polygon_vertices")) {
					jsonToValue(&inst, temp_json, "AddressGeofence_polygon_vertices", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			vertices = new_list;
		}
		
	}
}

AddressGeofence_polygon::AddressGeofence_polygon(char* json)
{
	this->fromJson(json);
}

char*
AddressGeofence_polygon::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AddressGeofence_polygon_vertices")) {
		list<AddressGeofence_polygon_vertices> new_list = static_cast<list <AddressGeofence_polygon_vertices> > (getVertices());
		node = converttoJson(&new_list, "AddressGeofence_polygon_vertices", "array");
	} else {
		node = json_node_alloc();
		list<AddressGeofence_polygon_vertices> new_list = static_cast<list <AddressGeofence_polygon_vertices> > (getVertices());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AddressGeofence_polygon_vertices>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AddressGeofence_polygon_vertices obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *verticesKey = "vertices";
	json_object_set_member(pJsonObject, verticesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<AddressGeofence_polygon_vertices>
AddressGeofence_polygon::getVertices()
{
	return vertices;
}

void
AddressGeofence_polygon::setVertices(std::list <AddressGeofence_polygon_vertices> vertices)
{
	this->vertices = vertices;
}


