#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "HosAuthenticationLogsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

HosAuthenticationLogsResponse::HosAuthenticationLogsResponse()
{
	//__init();
}

HosAuthenticationLogsResponse::~HosAuthenticationLogsResponse()
{
	//__cleanup();
}

void
HosAuthenticationLogsResponse::__init()
{
	//new std::list()std::list> authenticationLogs;
}

void
HosAuthenticationLogsResponse::__cleanup()
{
	//if(authenticationLogs != NULL) {
	//authenticationLogs.RemoveAll(true);
	//delete authenticationLogs;
	//authenticationLogs = NULL;
	//}
	//
}

void
HosAuthenticationLogsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *authenticationLogsKey = "authenticationLogs";
	node = json_object_get_member(pJsonObject, authenticationLogsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<HosAuthenticationLogsResponse_authenticationLogs> new_list;
			HosAuthenticationLogsResponse_authenticationLogs inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("HosAuthenticationLogsResponse_authenticationLogs")) {
					jsonToValue(&inst, temp_json, "HosAuthenticationLogsResponse_authenticationLogs", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			authenticationLogs = new_list;
		}
		
	}
}

HosAuthenticationLogsResponse::HosAuthenticationLogsResponse(char* json)
{
	this->fromJson(json);
}

char*
HosAuthenticationLogsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("HosAuthenticationLogsResponse_authenticationLogs")) {
		list<HosAuthenticationLogsResponse_authenticationLogs> new_list = static_cast<list <HosAuthenticationLogsResponse_authenticationLogs> > (getAuthenticationLogs());
		node = converttoJson(&new_list, "HosAuthenticationLogsResponse_authenticationLogs", "array");
	} else {
		node = json_node_alloc();
		list<HosAuthenticationLogsResponse_authenticationLogs> new_list = static_cast<list <HosAuthenticationLogsResponse_authenticationLogs> > (getAuthenticationLogs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<HosAuthenticationLogsResponse_authenticationLogs>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			HosAuthenticationLogsResponse_authenticationLogs obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *authenticationLogsKey = "authenticationLogs";
	json_object_set_member(pJsonObject, authenticationLogsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<HosAuthenticationLogsResponse_authenticationLogs>
HosAuthenticationLogsResponse::getAuthenticationLogs()
{
	return authenticationLogs;
}

void
HosAuthenticationLogsResponse::setAuthenticationLogs(std::list <HosAuthenticationLogsResponse_authenticationLogs> authenticationLogs)
{
	this->authenticationLogs = authenticationLogs;
}


