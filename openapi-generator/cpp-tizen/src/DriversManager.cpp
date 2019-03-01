#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "DriversManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


DriversManager::DriversManager()
{

}

DriversManager::~DriversManager()
{

}

static gboolean __DriversManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __DriversManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__DriversManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool createDriverProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Driver, Error, void* )
	= reinterpret_cast<void(*)(Driver, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Driver out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Driver")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Driver", "Driver");
			json_node_free(pJson);

			if ("Driver" == "std::string") {
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

static bool createDriverHelper(char * accessToken,
	std::string accessToken, DriverForCreate createDriverParam, 
	void(* handler)(Driver, Error, void* )
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

	if (isprimitive("DriverForCreate")) {
		node = converttoJson(&createDriverParam, "DriverForCreate", "");
	}
	
	char *jsonStr =  createDriverParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/drivers/create");
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
		NetClient::easycurl(DriversManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createDriverProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DriversManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createDriverProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DriversManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DriversManager::createDriverAsync(char * accessToken,
	std::string accessToken, DriverForCreate createDriverParam, 
	void(* handler)(Driver, Error, void* )
	, void* userData)
{
	return createDriverHelper(accessToken,
	accessToken, createDriverParam, 
	handler, userData, true);
}

bool DriversManager::createDriverSync(char * accessToken,
	std::string accessToken, DriverForCreate createDriverParam, 
	void(* handler)(Driver, Error, void* )
	, void* userData)
{
	return createDriverHelper(accessToken,
	accessToken, createDriverParam, 
	handler, userData, false);
}

static bool deactivateDriverProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool deactivateDriverHelper(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	
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

	string url("/fleet/drivers/{driver_id_or_external_id}");
	int pos;

	string s_driverIdOrExternalId("{");
	s_driverIdOrExternalId.append("driver_id_or_external_id");
	s_driverIdOrExternalId.append("}");
	pos = url.find(s_driverIdOrExternalId);
	url.erase(pos, s_driverIdOrExternalId.length());
	url.insert(pos, stringify(&driverIdOrExternalId, "std::string"));

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
		NetClient::easycurl(DriversManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deactivateDriverProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DriversManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deactivateDriverProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DriversManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DriversManager::deactivateDriverAsync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return deactivateDriverHelper(accessToken,
	accessToken, driverIdOrExternalId, 
	handler, userData, true);
}

bool DriversManager::deactivateDriverSync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return deactivateDriverHelper(accessToken,
	accessToken, driverIdOrExternalId, 
	handler, userData, false);
}

static bool getAllDeactivatedDriversProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<Driver>, Error, void* )
	= reinterpret_cast<void(*)(std::list<Driver>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<Driver> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			Driver singlemodel;
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

static bool getAllDeactivatedDriversHelper(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(std::list<Driver>, Error, void* )
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

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fleet/drivers/inactive");
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
		NetClient::easycurl(DriversManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAllDeactivatedDriversProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DriversManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAllDeactivatedDriversProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DriversManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DriversManager::getAllDeactivatedDriversAsync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(std::list<Driver>, Error, void* )
	, void* userData)
{
	return getAllDeactivatedDriversHelper(accessToken,
	accessToken, groupId, 
	handler, userData, true);
}

bool DriversManager::getAllDeactivatedDriversSync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(std::list<Driver>, Error, void* )
	, void* userData)
{
	return getAllDeactivatedDriversHelper(accessToken,
	accessToken, groupId, 
	handler, userData, false);
}

static bool getDeactivatedDriverByIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Driver, Error, void* )
	= reinterpret_cast<void(*)(Driver, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Driver out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Driver")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Driver", "Driver");
			json_node_free(pJson);

			if ("Driver" == "std::string") {
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

static bool getDeactivatedDriverByIdHelper(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
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

	string url("/fleet/drivers/inactive/{driver_id_or_external_id}");
	int pos;

	string s_driverIdOrExternalId("{");
	s_driverIdOrExternalId.append("driver_id_or_external_id");
	s_driverIdOrExternalId.append("}");
	pos = url.find(s_driverIdOrExternalId);
	url.erase(pos, s_driverIdOrExternalId.length());
	url.insert(pos, stringify(&driverIdOrExternalId, "std::string"));

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
		NetClient::easycurl(DriversManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getDeactivatedDriverByIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DriversManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDeactivatedDriverByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DriversManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DriversManager::getDeactivatedDriverByIdAsync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
	, void* userData)
{
	return getDeactivatedDriverByIdHelper(accessToken,
	accessToken, driverIdOrExternalId, 
	handler, userData, true);
}

bool DriversManager::getDeactivatedDriverByIdSync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
	, void* userData)
{
	return getDeactivatedDriverByIdHelper(accessToken,
	accessToken, driverIdOrExternalId, 
	handler, userData, false);
}

static bool getDriverByIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Driver, Error, void* )
	= reinterpret_cast<void(*)(Driver, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Driver out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Driver")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Driver", "Driver");
			json_node_free(pJson);

			if ("Driver" == "std::string") {
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

static bool getDriverByIdHelper(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
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

	string url("/fleet/drivers/{driver_id_or_external_id}");
	int pos;

	string s_driverIdOrExternalId("{");
	s_driverIdOrExternalId.append("driver_id_or_external_id");
	s_driverIdOrExternalId.append("}");
	pos = url.find(s_driverIdOrExternalId);
	url.erase(pos, s_driverIdOrExternalId.length());
	url.insert(pos, stringify(&driverIdOrExternalId, "std::string"));

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
		NetClient::easycurl(DriversManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getDriverByIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DriversManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDriverByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DriversManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DriversManager::getDriverByIdAsync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
	, void* userData)
{
	return getDriverByIdHelper(accessToken,
	accessToken, driverIdOrExternalId, 
	handler, userData, true);
}

bool DriversManager::getDriverByIdSync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
	, void* userData)
{
	return getDriverByIdHelper(accessToken,
	accessToken, driverIdOrExternalId, 
	handler, userData, false);
}

static bool reactivateDriverByIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Driver, Error, void* )
	= reinterpret_cast<void(*)(Driver, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Driver out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Driver")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Driver", "Driver");
			json_node_free(pJson);

			if ("Driver" == "std::string") {
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

static bool reactivateDriverByIdHelper(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, Inline_object_4 reactivateDriverParam, 
	void(* handler)(Driver, Error, void* )
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

	if (isprimitive("Inline_object_4")) {
		node = converttoJson(&reactivateDriverParam, "Inline_object_4", "");
	}
	
	char *jsonStr =  reactivateDriverParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/drivers/inactive/{driver_id_or_external_id}");
	int pos;

	string s_driverIdOrExternalId("{");
	s_driverIdOrExternalId.append("driver_id_or_external_id");
	s_driverIdOrExternalId.append("}");
	pos = url.find(s_driverIdOrExternalId);
	url.erase(pos, s_driverIdOrExternalId.length());
	url.insert(pos, stringify(&driverIdOrExternalId, "std::string"));

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
		NetClient::easycurl(DriversManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = reactivateDriverByIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DriversManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), reactivateDriverByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DriversManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DriversManager::reactivateDriverByIdAsync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, Inline_object_4 reactivateDriverParam, 
	void(* handler)(Driver, Error, void* )
	, void* userData)
{
	return reactivateDriverByIdHelper(accessToken,
	accessToken, driverIdOrExternalId, reactivateDriverParam, 
	handler, userData, true);
}

bool DriversManager::reactivateDriverByIdSync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, Inline_object_4 reactivateDriverParam, 
	void(* handler)(Driver, Error, void* )
	, void* userData)
{
	return reactivateDriverByIdHelper(accessToken,
	accessToken, driverIdOrExternalId, reactivateDriverParam, 
	handler, userData, false);
}

