#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "SafetyManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


SafetyManager::SafetyManager()
{

}

SafetyManager::~SafetyManager()
{

}

static gboolean __SafetyManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __SafetyManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__SafetyManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool getDriverSafetyScoreProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DriverSafetyScoreResponse, Error, void* )
	= reinterpret_cast<void(*)(DriverSafetyScoreResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DriverSafetyScoreResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DriverSafetyScoreResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DriverSafetyScoreResponse", "DriverSafetyScoreResponse");
			json_node_free(pJson);

			if ("DriverSafetyScoreResponse" == "std::string") {
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

static bool getDriverSafetyScoreHelper(char * accessToken,
	long long driverId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(DriverSafetyScoreResponse, Error, void* )
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


	itemAtq = stringify(&startMs, "long long");
	queryParams.insert(pair<string, string>("startMs", itemAtq));


	itemAtq = stringify(&endMs, "long long");
	queryParams.insert(pair<string, string>("endMs", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fleet/drivers/{driverId}/safety/score");
	int pos;

	string s_driverId("{");
	s_driverId.append("driverId");
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
		NetClient::easycurl(SafetyManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getDriverSafetyScoreProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SafetyManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDriverSafetyScoreProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SafetyManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SafetyManager::getDriverSafetyScoreAsync(char * accessToken,
	long long driverId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(DriverSafetyScoreResponse, Error, void* )
	, void* userData)
{
	return getDriverSafetyScoreHelper(accessToken,
	driverId, accessToken, startMs, endMs, 
	handler, userData, true);
}

bool SafetyManager::getDriverSafetyScoreSync(char * accessToken,
	long long driverId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(DriverSafetyScoreResponse, Error, void* )
	, void* userData)
{
	return getDriverSafetyScoreHelper(accessToken,
	driverId, accessToken, startMs, endMs, 
	handler, userData, false);
}

static bool getVehicleHarshEventProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(VehicleHarshEventResponse, Error, void* )
	= reinterpret_cast<void(*)(VehicleHarshEventResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	VehicleHarshEventResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("VehicleHarshEventResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "VehicleHarshEventResponse", "VehicleHarshEventResponse");
			json_node_free(pJson);

			if ("VehicleHarshEventResponse" == "std::string") {
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

static bool getVehicleHarshEventHelper(char * accessToken,
	long long vehicleId, std::string accessToken, long long timestamp, 
	void(* handler)(VehicleHarshEventResponse, Error, void* )
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


	itemAtq = stringify(&timestamp, "long long");
	queryParams.insert(pair<string, string>("timestamp", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fleet/vehicles/{vehicleId}/safety/harsh_event");
	int pos;

	string s_vehicleId("{");
	s_vehicleId.append("vehicleId");
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
		NetClient::easycurl(SafetyManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getVehicleHarshEventProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SafetyManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getVehicleHarshEventProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SafetyManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SafetyManager::getVehicleHarshEventAsync(char * accessToken,
	long long vehicleId, std::string accessToken, long long timestamp, 
	void(* handler)(VehicleHarshEventResponse, Error, void* )
	, void* userData)
{
	return getVehicleHarshEventHelper(accessToken,
	vehicleId, accessToken, timestamp, 
	handler, userData, true);
}

bool SafetyManager::getVehicleHarshEventSync(char * accessToken,
	long long vehicleId, std::string accessToken, long long timestamp, 
	void(* handler)(VehicleHarshEventResponse, Error, void* )
	, void* userData)
{
	return getVehicleHarshEventHelper(accessToken,
	vehicleId, accessToken, timestamp, 
	handler, userData, false);
}

static bool getVehicleSafetyScoreProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(VehicleSafetyScoreResponse, Error, void* )
	= reinterpret_cast<void(*)(VehicleSafetyScoreResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	VehicleSafetyScoreResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("VehicleSafetyScoreResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "VehicleSafetyScoreResponse", "VehicleSafetyScoreResponse");
			json_node_free(pJson);

			if ("VehicleSafetyScoreResponse" == "std::string") {
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

static bool getVehicleSafetyScoreHelper(char * accessToken,
	long long vehicleId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(VehicleSafetyScoreResponse, Error, void* )
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


	itemAtq = stringify(&startMs, "long long");
	queryParams.insert(pair<string, string>("startMs", itemAtq));


	itemAtq = stringify(&endMs, "long long");
	queryParams.insert(pair<string, string>("endMs", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fleet/vehicles/{vehicleId}/safety/score");
	int pos;

	string s_vehicleId("{");
	s_vehicleId.append("vehicleId");
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
		NetClient::easycurl(SafetyManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getVehicleSafetyScoreProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SafetyManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getVehicleSafetyScoreProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SafetyManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SafetyManager::getVehicleSafetyScoreAsync(char * accessToken,
	long long vehicleId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(VehicleSafetyScoreResponse, Error, void* )
	, void* userData)
{
	return getVehicleSafetyScoreHelper(accessToken,
	vehicleId, accessToken, startMs, endMs, 
	handler, userData, true);
}

bool SafetyManager::getVehicleSafetyScoreSync(char * accessToken,
	long long vehicleId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(VehicleSafetyScoreResponse, Error, void* )
	, void* userData)
{
	return getVehicleSafetyScoreHelper(accessToken,
	vehicleId, accessToken, startMs, endMs, 
	handler, userData, false);
}

