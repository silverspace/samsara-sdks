#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "SensorsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


SensorsManager::SensorsManager()
{

}

SensorsManager::~SensorsManager()
{

}

static gboolean __SensorsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __SensorsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__SensorsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool getSensorsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Inline_response_200_8, Error, void* )
	= reinterpret_cast<void(*)(Inline_response_200_8, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Inline_response_200_8 out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Inline_response_200_8")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Inline_response_200_8", "Inline_response_200_8");
			json_node_free(pJson);

			if ("Inline_response_200_8" == "std::string") {
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

static bool getSensorsHelper(char * accessToken,
	std::string accessToken, Inline_object_23 groupParam, 
	void(* handler)(Inline_response_200_8, Error, void* )
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

	if (isprimitive("Inline_object_23")) {
		node = converttoJson(&groupParam, "Inline_object_23", "");
	}
	
	char *jsonStr =  groupParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/sensors/list");
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
		NetClient::easycurl(SensorsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getSensorsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SensorsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getSensorsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SensorsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SensorsManager::getSensorsAsync(char * accessToken,
	std::string accessToken, Inline_object_23 groupParam, 
	void(* handler)(Inline_response_200_8, Error, void* )
	, void* userData)
{
	return getSensorsHelper(accessToken,
	accessToken, groupParam, 
	handler, userData, true);
}

bool SensorsManager::getSensorsSync(char * accessToken,
	std::string accessToken, Inline_object_23 groupParam, 
	void(* handler)(Inline_response_200_8, Error, void* )
	, void* userData)
{
	return getSensorsHelper(accessToken,
	accessToken, groupParam, 
	handler, userData, false);
}

static bool getSensorsCargoProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CargoResponse, Error, void* )
	= reinterpret_cast<void(*)(CargoResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CargoResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CargoResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CargoResponse", "CargoResponse");
			json_node_free(pJson);

			if ("CargoResponse" == "std::string") {
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

static bool getSensorsCargoHelper(char * accessToken,
	std::string accessToken, Inline_object_19 sensorParam, 
	void(* handler)(CargoResponse, Error, void* )
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

	if (isprimitive("Inline_object_19")) {
		node = converttoJson(&sensorParam, "Inline_object_19", "");
	}
	
	char *jsonStr =  sensorParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/sensors/cargo");
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
		NetClient::easycurl(SensorsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getSensorsCargoProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SensorsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getSensorsCargoProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SensorsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SensorsManager::getSensorsCargoAsync(char * accessToken,
	std::string accessToken, Inline_object_19 sensorParam, 
	void(* handler)(CargoResponse, Error, void* )
	, void* userData)
{
	return getSensorsCargoHelper(accessToken,
	accessToken, sensorParam, 
	handler, userData, true);
}

bool SensorsManager::getSensorsCargoSync(char * accessToken,
	std::string accessToken, Inline_object_19 sensorParam, 
	void(* handler)(CargoResponse, Error, void* )
	, void* userData)
{
	return getSensorsCargoHelper(accessToken,
	accessToken, sensorParam, 
	handler, userData, false);
}

static bool getSensorsDoorProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DoorResponse, Error, void* )
	= reinterpret_cast<void(*)(DoorResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DoorResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DoorResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DoorResponse", "DoorResponse");
			json_node_free(pJson);

			if ("DoorResponse" == "std::string") {
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

static bool getSensorsDoorHelper(char * accessToken,
	std::string accessToken, Inline_object_20 sensorParam, 
	void(* handler)(DoorResponse, Error, void* )
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

	if (isprimitive("Inline_object_20")) {
		node = converttoJson(&sensorParam, "Inline_object_20", "");
	}
	
	char *jsonStr =  sensorParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/sensors/door");
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
		NetClient::easycurl(SensorsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getSensorsDoorProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SensorsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getSensorsDoorProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SensorsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SensorsManager::getSensorsDoorAsync(char * accessToken,
	std::string accessToken, Inline_object_20 sensorParam, 
	void(* handler)(DoorResponse, Error, void* )
	, void* userData)
{
	return getSensorsDoorHelper(accessToken,
	accessToken, sensorParam, 
	handler, userData, true);
}

bool SensorsManager::getSensorsDoorSync(char * accessToken,
	std::string accessToken, Inline_object_20 sensorParam, 
	void(* handler)(DoorResponse, Error, void* )
	, void* userData)
{
	return getSensorsDoorHelper(accessToken,
	accessToken, sensorParam, 
	handler, userData, false);
}

static bool getSensorsHistoryProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SensorHistoryResponse, Error, void* )
	= reinterpret_cast<void(*)(SensorHistoryResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SensorHistoryResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SensorHistoryResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SensorHistoryResponse", "SensorHistoryResponse");
			json_node_free(pJson);

			if ("SensorHistoryResponse" == "std::string") {
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

static bool getSensorsHistoryHelper(char * accessToken,
	std::string accessToken, Inline_object_21 historyParam, 
	void(* handler)(SensorHistoryResponse, Error, void* )
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

	if (isprimitive("Inline_object_21")) {
		node = converttoJson(&historyParam, "Inline_object_21", "");
	}
	
	char *jsonStr =  historyParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/sensors/history");
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
		NetClient::easycurl(SensorsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getSensorsHistoryProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SensorsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getSensorsHistoryProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SensorsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SensorsManager::getSensorsHistoryAsync(char * accessToken,
	std::string accessToken, Inline_object_21 historyParam, 
	void(* handler)(SensorHistoryResponse, Error, void* )
	, void* userData)
{
	return getSensorsHistoryHelper(accessToken,
	accessToken, historyParam, 
	handler, userData, true);
}

bool SensorsManager::getSensorsHistorySync(char * accessToken,
	std::string accessToken, Inline_object_21 historyParam, 
	void(* handler)(SensorHistoryResponse, Error, void* )
	, void* userData)
{
	return getSensorsHistoryHelper(accessToken,
	accessToken, historyParam, 
	handler, userData, false);
}

static bool getSensorsHumidityProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(HumidityResponse, Error, void* )
	= reinterpret_cast<void(*)(HumidityResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	HumidityResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("HumidityResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "HumidityResponse", "HumidityResponse");
			json_node_free(pJson);

			if ("HumidityResponse" == "std::string") {
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

static bool getSensorsHumidityHelper(char * accessToken,
	std::string accessToken, Inline_object_22 sensorParam, 
	void(* handler)(HumidityResponse, Error, void* )
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

	if (isprimitive("Inline_object_22")) {
		node = converttoJson(&sensorParam, "Inline_object_22", "");
	}
	
	char *jsonStr =  sensorParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/sensors/humidity");
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
		NetClient::easycurl(SensorsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getSensorsHumidityProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SensorsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getSensorsHumidityProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SensorsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SensorsManager::getSensorsHumidityAsync(char * accessToken,
	std::string accessToken, Inline_object_22 sensorParam, 
	void(* handler)(HumidityResponse, Error, void* )
	, void* userData)
{
	return getSensorsHumidityHelper(accessToken,
	accessToken, sensorParam, 
	handler, userData, true);
}

bool SensorsManager::getSensorsHumiditySync(char * accessToken,
	std::string accessToken, Inline_object_22 sensorParam, 
	void(* handler)(HumidityResponse, Error, void* )
	, void* userData)
{
	return getSensorsHumidityHelper(accessToken,
	accessToken, sensorParam, 
	handler, userData, false);
}

static bool getSensorsTemperatureProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(TemperatureResponse, Error, void* )
	= reinterpret_cast<void(*)(TemperatureResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	TemperatureResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("TemperatureResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "TemperatureResponse", "TemperatureResponse");
			json_node_free(pJson);

			if ("TemperatureResponse" == "std::string") {
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

static bool getSensorsTemperatureHelper(char * accessToken,
	std::string accessToken, Inline_object_24 sensorParam, 
	void(* handler)(TemperatureResponse, Error, void* )
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

	if (isprimitive("Inline_object_24")) {
		node = converttoJson(&sensorParam, "Inline_object_24", "");
	}
	
	char *jsonStr =  sensorParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/sensors/temperature");
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
		NetClient::easycurl(SensorsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getSensorsTemperatureProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (SensorsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getSensorsTemperatureProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __SensorsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool SensorsManager::getSensorsTemperatureAsync(char * accessToken,
	std::string accessToken, Inline_object_24 sensorParam, 
	void(* handler)(TemperatureResponse, Error, void* )
	, void* userData)
{
	return getSensorsTemperatureHelper(accessToken,
	accessToken, sensorParam, 
	handler, userData, true);
}

bool SensorsManager::getSensorsTemperatureSync(char * accessToken,
	std::string accessToken, Inline_object_24 sensorParam, 
	void(* handler)(TemperatureResponse, Error, void* )
	, void* userData)
{
	return getSensorsTemperatureHelper(accessToken,
	accessToken, sensorParam, 
	handler, userData, false);
}

