#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "IndustrialManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


IndustrialManager::IndustrialManager()
{

}

IndustrialManager::~IndustrialManager()
{

}

static gboolean __IndustrialManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __IndustrialManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__IndustrialManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool getAllDataInputsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Inline_response_200_6, Error, void* )
	= reinterpret_cast<void(*)(Inline_response_200_6, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Inline_response_200_6 out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Inline_response_200_6")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Inline_response_200_6", "Inline_response_200_6");
			json_node_free(pJson);

			if ("Inline_response_200_6" == "std::string") {
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

static bool getAllDataInputsHelper(char * accessToken,
	std::string accessToken, long long groupId, long long startMs, long long endMs, 
	void(* handler)(Inline_response_200_6, Error, void* )
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


	itemAtq = stringify(&startMs, "long long");
	queryParams.insert(pair<string, string>("startMs", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("startMs");
	}


	itemAtq = stringify(&endMs, "long long");
	queryParams.insert(pair<string, string>("endMs", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("endMs");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/industrial/data");
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
		NetClient::easycurl(IndustrialManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAllDataInputsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (IndustrialManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAllDataInputsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __IndustrialManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool IndustrialManager::getAllDataInputsAsync(char * accessToken,
	std::string accessToken, long long groupId, long long startMs, long long endMs, 
	void(* handler)(Inline_response_200_6, Error, void* )
	, void* userData)
{
	return getAllDataInputsHelper(accessToken,
	accessToken, groupId, startMs, endMs, 
	handler, userData, true);
}

bool IndustrialManager::getAllDataInputsSync(char * accessToken,
	std::string accessToken, long long groupId, long long startMs, long long endMs, 
	void(* handler)(Inline_response_200_6, Error, void* )
	, void* userData)
{
	return getAllDataInputsHelper(accessToken,
	accessToken, groupId, startMs, endMs, 
	handler, userData, false);
}

static bool getDataInputProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DataInputHistoryResponse, Error, void* )
	= reinterpret_cast<void(*)(DataInputHistoryResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DataInputHistoryResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DataInputHistoryResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DataInputHistoryResponse", "DataInputHistoryResponse");
			json_node_free(pJson);

			if ("DataInputHistoryResponse" == "std::string") {
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

static bool getDataInputHelper(char * accessToken,
	std::string accessToken, long long dataInputId, long long startMs, long long endMs, 
	void(* handler)(DataInputHistoryResponse, Error, void* )
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
	if( itemAtq.empty()==true){
		queryParams.erase("startMs");
	}


	itemAtq = stringify(&endMs, "long long");
	queryParams.insert(pair<string, string>("endMs", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("endMs");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/industrial/data/{data_input_id}");
	int pos;

	string s_dataInputId("{");
	s_dataInputId.append("data_input_id");
	s_dataInputId.append("}");
	pos = url.find(s_dataInputId);
	url.erase(pos, s_dataInputId.length());
	url.insert(pos, stringify(&dataInputId, "long long"));

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
		NetClient::easycurl(IndustrialManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getDataInputProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (IndustrialManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDataInputProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __IndustrialManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool IndustrialManager::getDataInputAsync(char * accessToken,
	std::string accessToken, long long dataInputId, long long startMs, long long endMs, 
	void(* handler)(DataInputHistoryResponse, Error, void* )
	, void* userData)
{
	return getDataInputHelper(accessToken,
	accessToken, dataInputId, startMs, endMs, 
	handler, userData, true);
}

bool IndustrialManager::getDataInputSync(char * accessToken,
	std::string accessToken, long long dataInputId, long long startMs, long long endMs, 
	void(* handler)(DataInputHistoryResponse, Error, void* )
	, void* userData)
{
	return getDataInputHelper(accessToken,
	accessToken, dataInputId, startMs, endMs, 
	handler, userData, false);
}

static bool getMachinesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Inline_response_200_7, Error, void* )
	= reinterpret_cast<void(*)(Inline_response_200_7, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Inline_response_200_7 out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Inline_response_200_7")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Inline_response_200_7", "Inline_response_200_7");
			json_node_free(pJson);

			if ("Inline_response_200_7" == "std::string") {
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

static bool getMachinesHelper(char * accessToken,
	std::string accessToken, Inline_object_18 groupParam, 
	void(* handler)(Inline_response_200_7, Error, void* )
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

	if (isprimitive("Inline_object_18")) {
		node = converttoJson(&groupParam, "Inline_object_18", "");
	}
	
	char *jsonStr =  groupParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/machines/list");
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
		NetClient::easycurl(IndustrialManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getMachinesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (IndustrialManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getMachinesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __IndustrialManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool IndustrialManager::getMachinesAsync(char * accessToken,
	std::string accessToken, Inline_object_18 groupParam, 
	void(* handler)(Inline_response_200_7, Error, void* )
	, void* userData)
{
	return getMachinesHelper(accessToken,
	accessToken, groupParam, 
	handler, userData, true);
}

bool IndustrialManager::getMachinesSync(char * accessToken,
	std::string accessToken, Inline_object_18 groupParam, 
	void(* handler)(Inline_response_200_7, Error, void* )
	, void* userData)
{
	return getMachinesHelper(accessToken,
	accessToken, groupParam, 
	handler, userData, false);
}

static bool getMachinesHistoryProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(MachineHistoryResponse, Error, void* )
	= reinterpret_cast<void(*)(MachineHistoryResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	MachineHistoryResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("MachineHistoryResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "MachineHistoryResponse", "MachineHistoryResponse");
			json_node_free(pJson);

			if ("MachineHistoryResponse" == "std::string") {
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

static bool getMachinesHistoryHelper(char * accessToken,
	std::string accessToken, Inline_object_17 historyParam, 
	void(* handler)(MachineHistoryResponse, Error, void* )
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

	if (isprimitive("Inline_object_17")) {
		node = converttoJson(&historyParam, "Inline_object_17", "");
	}
	
	char *jsonStr =  historyParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/machines/history");
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
		NetClient::easycurl(IndustrialManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getMachinesHistoryProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (IndustrialManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getMachinesHistoryProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __IndustrialManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool IndustrialManager::getMachinesHistoryAsync(char * accessToken,
	std::string accessToken, Inline_object_17 historyParam, 
	void(* handler)(MachineHistoryResponse, Error, void* )
	, void* userData)
{
	return getMachinesHistoryHelper(accessToken,
	accessToken, historyParam, 
	handler, userData, true);
}

bool IndustrialManager::getMachinesHistorySync(char * accessToken,
	std::string accessToken, Inline_object_17 historyParam, 
	void(* handler)(MachineHistoryResponse, Error, void* )
	, void* userData)
{
	return getMachinesHistoryHelper(accessToken,
	accessToken, historyParam, 
	handler, userData, false);
}

