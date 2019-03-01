#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "RoutesManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


RoutesManager::RoutesManager()
{

}

RoutesManager::~RoutesManager()
{

}

static gboolean __RoutesManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __RoutesManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__RoutesManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool createDispatchRouteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DispatchRoute, Error, void* )
	= reinterpret_cast<void(*)(DispatchRoute, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DispatchRoute out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DispatchRoute")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DispatchRoute", "DispatchRoute");
			json_node_free(pJson);

			if ("DispatchRoute" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool createDispatchRouteHelper(char * accessToken,
	std::string accessToken, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&accessToken, "std::string");
	queryParams.insert(pair<string, string>("access_token", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("DispatchRouteCreate")) {
		node = converttoJson(&createDispatchRouteParams, "DispatchRouteCreate", "");
	}
	
	char *jsonStr =  createDispatchRouteParams.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/dispatch/routes");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createDispatchRouteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createDispatchRouteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RoutesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RoutesManager::createDispatchRouteAsync(char * accessToken,
	std::string accessToken, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return createDispatchRouteHelper(accessToken,
	accessToken, createDispatchRouteParams, 
	handler, userData, true);
}

bool RoutesManager::createDispatchRouteSync(char * accessToken,
	std::string accessToken, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return createDispatchRouteHelper(accessToken,
	accessToken, createDispatchRouteParams, 
	handler, userData, false);
}

static bool createDriverDispatchRouteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DispatchRoute, Error, void* )
	= reinterpret_cast<void(*)(DispatchRoute, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DispatchRoute out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DispatchRoute")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DispatchRoute", "DispatchRoute");
			json_node_free(pJson);

			if ("DispatchRoute" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool createDriverDispatchRouteHelper(char * accessToken,
	std::string accessToken, long long driverId, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&accessToken, "std::string");
	queryParams.insert(pair<string, string>("access_token", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("DispatchRouteCreate")) {
		node = converttoJson(&createDispatchRouteParams, "DispatchRouteCreate", "");
	}
	
	char *jsonStr =  createDispatchRouteParams.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/drivers/{driver_id}/dispatch/routes");
	int pos;

	string s_driverId("{");
	s_driverId.append("driver_id");
	s_driverId.append("}");
	pos = url.find(s_driverId);
	url.erase(pos, s_driverId.length());
	url.insert(pos, stringify(&driverId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createDriverDispatchRouteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createDriverDispatchRouteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RoutesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RoutesManager::createDriverDispatchRouteAsync(char * accessToken,
	std::string accessToken, long long driverId, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return createDriverDispatchRouteHelper(accessToken,
	accessToken, driverId, createDispatchRouteParams, 
	handler, userData, true);
}

bool RoutesManager::createDriverDispatchRouteSync(char * accessToken,
	std::string accessToken, long long driverId, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return createDriverDispatchRouteHelper(accessToken,
	accessToken, driverId, createDispatchRouteParams, 
	handler, userData, false);
}

static bool createVehicleDispatchRouteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DispatchRoute, Error, void* )
	= reinterpret_cast<void(*)(DispatchRoute, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DispatchRoute out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DispatchRoute")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DispatchRoute", "DispatchRoute");
			json_node_free(pJson);

			if ("DispatchRoute" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool createVehicleDispatchRouteHelper(char * accessToken,
	std::string accessToken, long long vehicleId, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&accessToken, "std::string");
	queryParams.insert(pair<string, string>("access_token", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("DispatchRouteCreate")) {
		node = converttoJson(&createDispatchRouteParams, "DispatchRouteCreate", "");
	}
	
	char *jsonStr =  createDispatchRouteParams.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/vehicles/{vehicle_id}/dispatch/routes");
	int pos;

	string s_vehicleId("{");
	s_vehicleId.append("vehicle_id");
	s_vehicleId.append("}");
	pos = url.find(s_vehicleId);
	url.erase(pos, s_vehicleId.length());
	url.insert(pos, stringify(&vehicleId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createVehicleDispatchRouteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createVehicleDispatchRouteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RoutesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RoutesManager::createVehicleDispatchRouteAsync(char * accessToken,
	std::string accessToken, long long vehicleId, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return createVehicleDispatchRouteHelper(accessToken,
	accessToken, vehicleId, createDispatchRouteParams, 
	handler, userData, true);
}

bool RoutesManager::createVehicleDispatchRouteSync(char * accessToken,
	std::string accessToken, long long vehicleId, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return createVehicleDispatchRouteHelper(accessToken,
	accessToken, vehicleId, createDispatchRouteParams, 
	handler, userData, false);
}

static bool deleteDispatchRouteByIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool deleteDispatchRouteByIdHelper(char * accessToken,
	std::string accessToken, long long routeId, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&accessToken, "std::string");
	queryParams.insert(pair<string, string>("access_token", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fleet/dispatch/routes/{route_id}");
	int pos;

	string s_routeId("{");
	s_routeId.append("route_id");
	s_routeId.append("}");
	pos = url.find(s_routeId);
	url.erase(pos, s_routeId.length());
	url.insert(pos, stringify(&routeId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteDispatchRouteByIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteDispatchRouteByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RoutesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RoutesManager::deleteDispatchRouteByIdAsync(char * accessToken,
	std::string accessToken, long long routeId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return deleteDispatchRouteByIdHelper(accessToken,
	accessToken, routeId, 
	handler, userData, true);
}

bool RoutesManager::deleteDispatchRouteByIdSync(char * accessToken,
	std::string accessToken, long long routeId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return deleteDispatchRouteByIdHelper(accessToken,
	accessToken, routeId, 
	handler, userData, false);
}

static bool fetchAllDispatchRoutesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	= reinterpret_cast<void(*)(std::list<DispatchRoute>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<DispatchRoute> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			DispatchRoute singlemodel;
			singlemodel.fromJson(singlenodestr);
			out.push_front(singlemodel);
			g_free(static_cast<gpointer>(singlenodestr));
			json_node_free(myJson);
		}
		json_array_unref (jsonarray);
		json_node_free(pJson);


	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool fetchAllDispatchRoutesHelper(char * accessToken,
	std::string accessToken, long long groupId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&accessToken, "std::string");
	queryParams.insert(pair<string, string>("access_token", itemAtq));


	itemAtq = stringify(&groupId, "long long");
	queryParams.insert(pair<string, string>("group_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("group_id");
	}


	itemAtq = stringify(&endTime, "long long");
	queryParams.insert(pair<string, string>("end_time", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("end_time");
	}


	itemAtq = stringify(&duration, "long long");
	queryParams.insert(pair<string, string>("duration", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("duration");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fleet/dispatch/routes");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = fetchAllDispatchRoutesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), fetchAllDispatchRoutesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RoutesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RoutesManager::fetchAllDispatchRoutesAsync(char * accessToken,
	std::string accessToken, long long groupId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData)
{
	return fetchAllDispatchRoutesHelper(accessToken,
	accessToken, groupId, endTime, duration, 
	handler, userData, true);
}

bool RoutesManager::fetchAllDispatchRoutesSync(char * accessToken,
	std::string accessToken, long long groupId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData)
{
	return fetchAllDispatchRoutesHelper(accessToken,
	accessToken, groupId, endTime, duration, 
	handler, userData, false);
}

static bool fetchAllRouteJobUpdatesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AllRouteJobUpdates, Error, void* )
	= reinterpret_cast<void(*)(AllRouteJobUpdates, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AllRouteJobUpdates out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AllRouteJobUpdates")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AllRouteJobUpdates", "AllRouteJobUpdates");
			json_node_free(pJson);

			if ("AllRouteJobUpdates" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool fetchAllRouteJobUpdatesHelper(char * accessToken,
	std::string accessToken, long long groupId, std::string sequenceId, std::string include, 
	void(* handler)(AllRouteJobUpdates, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&accessToken, "std::string");
	queryParams.insert(pair<string, string>("access_token", itemAtq));


	itemAtq = stringify(&groupId, "long long");
	queryParams.insert(pair<string, string>("group_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("group_id");
	}


	itemAtq = stringify(&sequenceId, "std::string");
	queryParams.insert(pair<string, string>("sequence_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("sequence_id");
	}


	itemAtq = stringify(&include, "std::string");
	queryParams.insert(pair<string, string>("include", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fleet/dispatch/routes/job_updates");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = fetchAllRouteJobUpdatesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), fetchAllRouteJobUpdatesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RoutesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RoutesManager::fetchAllRouteJobUpdatesAsync(char * accessToken,
	std::string accessToken, long long groupId, std::string sequenceId, std::string include, 
	void(* handler)(AllRouteJobUpdates, Error, void* )
	, void* userData)
{
	return fetchAllRouteJobUpdatesHelper(accessToken,
	accessToken, groupId, sequenceId, include, 
	handler, userData, true);
}

bool RoutesManager::fetchAllRouteJobUpdatesSync(char * accessToken,
	std::string accessToken, long long groupId, std::string sequenceId, std::string include, 
	void(* handler)(AllRouteJobUpdates, Error, void* )
	, void* userData)
{
	return fetchAllRouteJobUpdatesHelper(accessToken,
	accessToken, groupId, sequenceId, include, 
	handler, userData, false);
}

static bool getDispatchRouteByIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DispatchRoute, Error, void* )
	= reinterpret_cast<void(*)(DispatchRoute, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DispatchRoute out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DispatchRoute")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DispatchRoute", "DispatchRoute");
			json_node_free(pJson);

			if ("DispatchRoute" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getDispatchRouteByIdHelper(char * accessToken,
	std::string accessToken, long long routeId, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&accessToken, "std::string");
	queryParams.insert(pair<string, string>("access_token", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fleet/dispatch/routes/{route_id}");
	int pos;

	string s_routeId("{");
	s_routeId.append("route_id");
	s_routeId.append("}");
	pos = url.find(s_routeId);
	url.erase(pos, s_routeId.length());
	url.insert(pos, stringify(&routeId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getDispatchRouteByIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDispatchRouteByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RoutesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RoutesManager::getDispatchRouteByIdAsync(char * accessToken,
	std::string accessToken, long long routeId, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return getDispatchRouteByIdHelper(accessToken,
	accessToken, routeId, 
	handler, userData, true);
}

bool RoutesManager::getDispatchRouteByIdSync(char * accessToken,
	std::string accessToken, long long routeId, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return getDispatchRouteByIdHelper(accessToken,
	accessToken, routeId, 
	handler, userData, false);
}

static bool getDispatchRouteHistoryProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DispatchRouteHistory, Error, void* )
	= reinterpret_cast<void(*)(DispatchRouteHistory, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DispatchRouteHistory out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DispatchRouteHistory")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DispatchRouteHistory", "DispatchRouteHistory");
			json_node_free(pJson);

			if ("DispatchRouteHistory" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getDispatchRouteHistoryHelper(char * accessToken,
	std::string accessToken, long long routeId, long long startTime, long long endTime, 
	void(* handler)(DispatchRouteHistory, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&accessToken, "std::string");
	queryParams.insert(pair<string, string>("access_token", itemAtq));


	itemAtq = stringify(&startTime, "long long");
	queryParams.insert(pair<string, string>("start_time", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("start_time");
	}


	itemAtq = stringify(&endTime, "long long");
	queryParams.insert(pair<string, string>("end_time", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("end_time");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fleet/dispatch/routes/{route_id}/history");
	int pos;

	string s_routeId("{");
	s_routeId.append("route_id");
	s_routeId.append("}");
	pos = url.find(s_routeId);
	url.erase(pos, s_routeId.length());
	url.insert(pos, stringify(&routeId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getDispatchRouteHistoryProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDispatchRouteHistoryProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RoutesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RoutesManager::getDispatchRouteHistoryAsync(char * accessToken,
	std::string accessToken, long long routeId, long long startTime, long long endTime, 
	void(* handler)(DispatchRouteHistory, Error, void* )
	, void* userData)
{
	return getDispatchRouteHistoryHelper(accessToken,
	accessToken, routeId, startTime, endTime, 
	handler, userData, true);
}

bool RoutesManager::getDispatchRouteHistorySync(char * accessToken,
	std::string accessToken, long long routeId, long long startTime, long long endTime, 
	void(* handler)(DispatchRouteHistory, Error, void* )
	, void* userData)
{
	return getDispatchRouteHistoryHelper(accessToken,
	accessToken, routeId, startTime, endTime, 
	handler, userData, false);
}

static bool getDispatchRoutesByDriverIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	= reinterpret_cast<void(*)(std::list<DispatchRoute>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<DispatchRoute> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			DispatchRoute singlemodel;
			singlemodel.fromJson(singlenodestr);
			out.push_front(singlemodel);
			g_free(static_cast<gpointer>(singlenodestr));
			json_node_free(myJson);
		}
		json_array_unref (jsonarray);
		json_node_free(pJson);


	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getDispatchRoutesByDriverIdHelper(char * accessToken,
	std::string accessToken, long long driverId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&accessToken, "std::string");
	queryParams.insert(pair<string, string>("access_token", itemAtq));


	itemAtq = stringify(&endTime, "long long");
	queryParams.insert(pair<string, string>("end_time", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("end_time");
	}


	itemAtq = stringify(&duration, "long long");
	queryParams.insert(pair<string, string>("duration", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("duration");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fleet/drivers/{driver_id}/dispatch/routes");
	int pos;

	string s_driverId("{");
	s_driverId.append("driver_id");
	s_driverId.append("}");
	pos = url.find(s_driverId);
	url.erase(pos, s_driverId.length());
	url.insert(pos, stringify(&driverId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getDispatchRoutesByDriverIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDispatchRoutesByDriverIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RoutesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RoutesManager::getDispatchRoutesByDriverIdAsync(char * accessToken,
	std::string accessToken, long long driverId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData)
{
	return getDispatchRoutesByDriverIdHelper(accessToken,
	accessToken, driverId, endTime, duration, 
	handler, userData, true);
}

bool RoutesManager::getDispatchRoutesByDriverIdSync(char * accessToken,
	std::string accessToken, long long driverId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData)
{
	return getDispatchRoutesByDriverIdHelper(accessToken,
	accessToken, driverId, endTime, duration, 
	handler, userData, false);
}

static bool getDispatchRoutesByVehicleIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	= reinterpret_cast<void(*)(std::list<DispatchRoute>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<DispatchRoute> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			DispatchRoute singlemodel;
			singlemodel.fromJson(singlenodestr);
			out.push_front(singlemodel);
			g_free(static_cast<gpointer>(singlenodestr));
			json_node_free(myJson);
		}
		json_array_unref (jsonarray);
		json_node_free(pJson);


	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getDispatchRoutesByVehicleIdHelper(char * accessToken,
	std::string accessToken, long long vehicleId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&accessToken, "std::string");
	queryParams.insert(pair<string, string>("access_token", itemAtq));


	itemAtq = stringify(&endTime, "long long");
	queryParams.insert(pair<string, string>("end_time", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("end_time");
	}


	itemAtq = stringify(&duration, "long long");
	queryParams.insert(pair<string, string>("duration", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("duration");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fleet/vehicles/{vehicle_id}/dispatch/routes");
	int pos;

	string s_vehicleId("{");
	s_vehicleId.append("vehicle_id");
	s_vehicleId.append("}");
	pos = url.find(s_vehicleId);
	url.erase(pos, s_vehicleId.length());
	url.insert(pos, stringify(&vehicleId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getDispatchRoutesByVehicleIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDispatchRoutesByVehicleIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RoutesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RoutesManager::getDispatchRoutesByVehicleIdAsync(char * accessToken,
	std::string accessToken, long long vehicleId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData)
{
	return getDispatchRoutesByVehicleIdHelper(accessToken,
	accessToken, vehicleId, endTime, duration, 
	handler, userData, true);
}

bool RoutesManager::getDispatchRoutesByVehicleIdSync(char * accessToken,
	std::string accessToken, long long vehicleId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData)
{
	return getDispatchRoutesByVehicleIdHelper(accessToken,
	accessToken, vehicleId, endTime, duration, 
	handler, userData, false);
}

static bool updateDispatchRouteByIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DispatchRoute, Error, void* )
	= reinterpret_cast<void(*)(DispatchRoute, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DispatchRoute out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DispatchRoute")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DispatchRoute", "DispatchRoute");
			json_node_free(pJson);

			if ("DispatchRoute" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool updateDispatchRouteByIdHelper(char * accessToken,
	std::string accessToken, long long routeId, DispatchRoute updateDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&accessToken, "std::string");
	queryParams.insert(pair<string, string>("access_token", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("DispatchRoute")) {
		node = converttoJson(&updateDispatchRouteParams, "DispatchRoute", "");
	}
	
	char *jsonStr =  updateDispatchRouteParams.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/dispatch/routes/{route_id}");
	int pos;

	string s_routeId("{");
	s_routeId.append("route_id");
	s_routeId.append("}");
	pos = url.find(s_routeId);
	url.erase(pos, s_routeId.length());
	url.insert(pos, stringify(&routeId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateDispatchRouteByIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (RoutesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateDispatchRouteByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __RoutesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool RoutesManager::updateDispatchRouteByIdAsync(char * accessToken,
	std::string accessToken, long long routeId, DispatchRoute updateDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return updateDispatchRouteByIdHelper(accessToken,
	accessToken, routeId, updateDispatchRouteParams, 
	handler, userData, true);
}

bool RoutesManager::updateDispatchRouteByIdSync(char * accessToken,
	std::string accessToken, long long routeId, DispatchRoute updateDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return updateDispatchRouteByIdHelper(accessToken,
	accessToken, routeId, updateDispatchRouteParams, 
	handler, userData, false);
}

