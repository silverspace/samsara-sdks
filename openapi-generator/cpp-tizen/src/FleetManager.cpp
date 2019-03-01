#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "FleetManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


FleetManager::FleetManager()
{

}

FleetManager::~FleetManager()
{

}

static gboolean __FleetManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __FleetManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__FleetManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool addFleetAddressProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool addFleetAddressHelper(char * accessToken,
	std::string accessToken, Inline_object_2 addressParam, 
	
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

	if (isprimitive("Inline_object_2")) {
		node = converttoJson(&addressParam, "Inline_object_2", "");
	}
	
	char *jsonStr =  addressParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/add_address");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = addFleetAddressProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), addFleetAddressProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::addFleetAddressAsync(char * accessToken,
	std::string accessToken, Inline_object_2 addressParam, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return addFleetAddressHelper(accessToken,
	accessToken, addressParam, 
	handler, userData, true);
}

bool FleetManager::addFleetAddressSync(char * accessToken,
	std::string accessToken, Inline_object_2 addressParam, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return addFleetAddressHelper(accessToken,
	accessToken, addressParam, 
	handler, userData, false);
}

static bool addOrganizationAddressesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<Address>, Error, void* )
	= reinterpret_cast<void(*)(std::list<Address>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<Address> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			Address singlemodel;
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

static bool addOrganizationAddressesHelper(char * accessToken,
	std::string accessToken, Inline_object addresses, 
	void(* handler)(std::list<Address>, Error, void* )
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

	if (isprimitive("Inline_object")) {
		node = converttoJson(&addresses, "Inline_object", "");
	}
	
	char *jsonStr =  addresses.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/addresses");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = addOrganizationAddressesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), addOrganizationAddressesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::addOrganizationAddressesAsync(char * accessToken,
	std::string accessToken, Inline_object addresses, 
	void(* handler)(std::list<Address>, Error, void* )
	, void* userData)
{
	return addOrganizationAddressesHelper(accessToken,
	accessToken, addresses, 
	handler, userData, true);
}

bool FleetManager::addOrganizationAddressesSync(char * accessToken,
	std::string accessToken, Inline_object addresses, 
	void(* handler)(std::list<Address>, Error, void* )
	, void* userData)
{
	return addOrganizationAddressesHelper(accessToken,
	accessToken, addresses, 
	handler, userData, false);
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createDispatchRouteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::createDispatchRouteAsync(char * accessToken,
	std::string accessToken, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return createDispatchRouteHelper(accessToken,
	accessToken, createDispatchRouteParams, 
	handler, userData, true);
}

bool FleetManager::createDispatchRouteSync(char * accessToken,
	std::string accessToken, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return createDispatchRouteHelper(accessToken,
	accessToken, createDispatchRouteParams, 
	handler, userData, false);
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createDriverProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::createDriverAsync(char * accessToken,
	std::string accessToken, DriverForCreate createDriverParam, 
	void(* handler)(Driver, Error, void* )
	, void* userData)
{
	return createDriverHelper(accessToken,
	accessToken, createDriverParam, 
	handler, userData, true);
}

bool FleetManager::createDriverSync(char * accessToken,
	std::string accessToken, DriverForCreate createDriverParam, 
	void(* handler)(Driver, Error, void* )
	, void* userData)
{
	return createDriverHelper(accessToken,
	accessToken, createDriverParam, 
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createDriverDispatchRouteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::createDriverDispatchRouteAsync(char * accessToken,
	std::string accessToken, long long driverId, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return createDriverDispatchRouteHelper(accessToken,
	accessToken, driverId, createDispatchRouteParams, 
	handler, userData, true);
}

bool FleetManager::createDriverDispatchRouteSync(char * accessToken,
	std::string accessToken, long long driverId, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return createDriverDispatchRouteHelper(accessToken,
	accessToken, driverId, createDispatchRouteParams, 
	handler, userData, false);
}

static bool createDriverDocumentProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Document, Error, void* )
	= reinterpret_cast<void(*)(Document, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Document out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Document")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Document", "Document");
			json_node_free(pJson);

			if ("Document" == "std::string") {
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

static bool createDriverDocumentHelper(char * accessToken,
	std::string accessToken, long long driverId, DocumentCreate createDocumentParams, 
	void(* handler)(Document, Error, void* )
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

	if (isprimitive("DocumentCreate")) {
		node = converttoJson(&createDocumentParams, "DocumentCreate", "");
	}
	
	char *jsonStr =  createDocumentParams.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/drivers/{driver_id}/documents");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createDriverDocumentProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createDriverDocumentProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::createDriverDocumentAsync(char * accessToken,
	std::string accessToken, long long driverId, DocumentCreate createDocumentParams, 
	void(* handler)(Document, Error, void* )
	, void* userData)
{
	return createDriverDocumentHelper(accessToken,
	accessToken, driverId, createDocumentParams, 
	handler, userData, true);
}

bool FleetManager::createDriverDocumentSync(char * accessToken,
	std::string accessToken, long long driverId, DocumentCreate createDocumentParams, 
	void(* handler)(Document, Error, void* )
	, void* userData)
{
	return createDriverDocumentHelper(accessToken,
	accessToken, driverId, createDocumentParams, 
	handler, userData, false);
}

static bool createDvirProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DvirBase, Error, void* )
	= reinterpret_cast<void(*)(DvirBase, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DvirBase out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DvirBase")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DvirBase", "DvirBase");
			json_node_free(pJson);

			if ("DvirBase" == "std::string") {
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

static bool createDvirHelper(char * accessToken,
	std::string accessToken, Inline_object_12 createDvirParam, 
	void(* handler)(DvirBase, Error, void* )
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

	if (isprimitive("Inline_object_12")) {
		node = converttoJson(&createDvirParam, "Inline_object_12", "");
	}
	
	char *jsonStr =  createDvirParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/maintenance/dvirs");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createDvirProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createDvirProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::createDvirAsync(char * accessToken,
	std::string accessToken, Inline_object_12 createDvirParam, 
	void(* handler)(DvirBase, Error, void* )
	, void* userData)
{
	return createDvirHelper(accessToken,
	accessToken, createDvirParam, 
	handler, userData, true);
}

bool FleetManager::createDvirSync(char * accessToken,
	std::string accessToken, Inline_object_12 createDvirParam, 
	void(* handler)(DvirBase, Error, void* )
	, void* userData)
{
	return createDvirHelper(accessToken,
	accessToken, createDvirParam, 
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createVehicleDispatchRouteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::createVehicleDispatchRouteAsync(char * accessToken,
	std::string accessToken, long long vehicleId, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return createVehicleDispatchRouteHelper(accessToken,
	accessToken, vehicleId, createDispatchRouteParams, 
	handler, userData, true);
}

bool FleetManager::createVehicleDispatchRouteSync(char * accessToken,
	std::string accessToken, long long vehicleId, DispatchRouteCreate createDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return createVehicleDispatchRouteHelper(accessToken,
	accessToken, vehicleId, createDispatchRouteParams, 
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deactivateDriverProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::deactivateDriverAsync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return deactivateDriverHelper(accessToken,
	accessToken, driverIdOrExternalId, 
	handler, userData, true);
}

bool FleetManager::deactivateDriverSync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return deactivateDriverHelper(accessToken,
	accessToken, driverIdOrExternalId, 
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteDispatchRouteByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::deleteDispatchRouteByIdAsync(char * accessToken,
	std::string accessToken, long long routeId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return deleteDispatchRouteByIdHelper(accessToken,
	accessToken, routeId, 
	handler, userData, true);
}

bool FleetManager::deleteDispatchRouteByIdSync(char * accessToken,
	std::string accessToken, long long routeId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return deleteDispatchRouteByIdHelper(accessToken,
	accessToken, routeId, 
	handler, userData, false);
}

static bool deleteOrganizationAddressProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool deleteOrganizationAddressHelper(char * accessToken,
	std::string accessToken, long long addressId, 
	
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

	string url("/addresses/{addressId}");
	int pos;

	string s_addressId("{");
	s_addressId.append("addressId");
	s_addressId.append("}");
	pos = url.find(s_addressId);
	url.erase(pos, s_addressId.length());
	url.insert(pos, stringify(&addressId, "long long"));

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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteOrganizationAddressProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteOrganizationAddressProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::deleteOrganizationAddressAsync(char * accessToken,
	std::string accessToken, long long addressId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return deleteOrganizationAddressHelper(accessToken,
	accessToken, addressId, 
	handler, userData, true);
}

bool FleetManager::deleteOrganizationAddressSync(char * accessToken,
	std::string accessToken, long long addressId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return deleteOrganizationAddressHelper(accessToken,
	accessToken, addressId, 
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), fetchAllDispatchRoutesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::fetchAllDispatchRoutesAsync(char * accessToken,
	std::string accessToken, long long groupId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData)
{
	return fetchAllDispatchRoutesHelper(accessToken,
	accessToken, groupId, endTime, duration, 
	handler, userData, true);
}

bool FleetManager::fetchAllDispatchRoutesSync(char * accessToken,
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), fetchAllRouteJobUpdatesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::fetchAllRouteJobUpdatesAsync(char * accessToken,
	std::string accessToken, long long groupId, std::string sequenceId, std::string include, 
	void(* handler)(AllRouteJobUpdates, Error, void* )
	, void* userData)
{
	return fetchAllRouteJobUpdatesHelper(accessToken,
	accessToken, groupId, sequenceId, include, 
	handler, userData, true);
}

bool FleetManager::fetchAllRouteJobUpdatesSync(char * accessToken,
	std::string accessToken, long long groupId, std::string sequenceId, std::string include, 
	void(* handler)(AllRouteJobUpdates, Error, void* )
	, void* userData)
{
	return fetchAllRouteJobUpdatesHelper(accessToken,
	accessToken, groupId, sequenceId, include, 
	handler, userData, false);
}

static bool getAllAssetCurrentLocationsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Inline_response_200_1, Error, void* )
	= reinterpret_cast<void(*)(Inline_response_200_1, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Inline_response_200_1 out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Inline_response_200_1")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Inline_response_200_1", "Inline_response_200_1");
			json_node_free(pJson);

			if ("Inline_response_200_1" == "std::string") {
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

static bool getAllAssetCurrentLocationsHelper(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200_1, Error, void* )
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

	string url("/fleet/assets/locations");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAllAssetCurrentLocationsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAllAssetCurrentLocationsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getAllAssetCurrentLocationsAsync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200_1, Error, void* )
	, void* userData)
{
	return getAllAssetCurrentLocationsHelper(accessToken,
	accessToken, groupId, 
	handler, userData, true);
}

bool FleetManager::getAllAssetCurrentLocationsSync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200_1, Error, void* )
	, void* userData)
{
	return getAllAssetCurrentLocationsHelper(accessToken,
	accessToken, groupId, 
	handler, userData, false);
}

static bool getAllAssetsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Inline_response_200, Error, void* )
	= reinterpret_cast<void(*)(Inline_response_200, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Inline_response_200 out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Inline_response_200")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Inline_response_200", "Inline_response_200");
			json_node_free(pJson);

			if ("Inline_response_200" == "std::string") {
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

static bool getAllAssetsHelper(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200, Error, void* )
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

	string url("/fleet/assets");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAllAssetsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAllAssetsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getAllAssetsAsync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200, Error, void* )
	, void* userData)
{
	return getAllAssetsHelper(accessToken,
	accessToken, groupId, 
	handler, userData, true);
}

bool FleetManager::getAllAssetsSync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200, Error, void* )
	, void* userData)
{
	return getAllAssetsHelper(accessToken,
	accessToken, groupId, 
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAllDeactivatedDriversProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getAllDeactivatedDriversAsync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(std::list<Driver>, Error, void* )
	, void* userData)
{
	return getAllDeactivatedDriversHelper(accessToken,
	accessToken, groupId, 
	handler, userData, true);
}

bool FleetManager::getAllDeactivatedDriversSync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(std::list<Driver>, Error, void* )
	, void* userData)
{
	return getAllDeactivatedDriversHelper(accessToken,
	accessToken, groupId, 
	handler, userData, false);
}

static bool getAssetLocationProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<std::string>, Error, void* )
	= reinterpret_cast<void(*)(std::list<std::string>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<std::string> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			std::string singlemodel;
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

static bool getAssetLocationHelper(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(std::list<std::string>, Error, void* )
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

	string url("/fleet/assets/{asset_id}/locations");
	int pos;

	string s_assetId("{");
	s_assetId.append("asset_id");
	s_assetId.append("}");
	pos = url.find(s_assetId);
	url.erase(pos, s_assetId.length());
	url.insert(pos, stringify(&assetId, "long long"));

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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAssetLocationProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAssetLocationProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getAssetLocationAsync(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData)
{
	return getAssetLocationHelper(accessToken,
	accessToken, assetId, startMs, endMs, 
	handler, userData, true);
}

bool FleetManager::getAssetLocationSync(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData)
{
	return getAssetLocationHelper(accessToken,
	accessToken, assetId, startMs, endMs, 
	handler, userData, false);
}

static bool getAssetReeferProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AssetReeferResponse, Error, void* )
	= reinterpret_cast<void(*)(AssetReeferResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AssetReeferResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AssetReeferResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AssetReeferResponse", "AssetReeferResponse");
			json_node_free(pJson);

			if ("AssetReeferResponse" == "std::string") {
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

static bool getAssetReeferHelper(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(AssetReeferResponse, Error, void* )
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

	string url("/fleet/assets/{asset_id}/reefer");
	int pos;

	string s_assetId("{");
	s_assetId.append("asset_id");
	s_assetId.append("}");
	pos = url.find(s_assetId);
	url.erase(pos, s_assetId.length());
	url.insert(pos, stringify(&assetId, "long long"));

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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAssetReeferProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAssetReeferProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getAssetReeferAsync(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(AssetReeferResponse, Error, void* )
	, void* userData)
{
	return getAssetReeferHelper(accessToken,
	accessToken, assetId, startMs, endMs, 
	handler, userData, true);
}

bool FleetManager::getAssetReeferSync(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(AssetReeferResponse, Error, void* )
	, void* userData)
{
	return getAssetReeferHelper(accessToken,
	accessToken, assetId, startMs, endMs, 
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDeactivatedDriverByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getDeactivatedDriverByIdAsync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
	, void* userData)
{
	return getDeactivatedDriverByIdHelper(accessToken,
	accessToken, driverIdOrExternalId, 
	handler, userData, true);
}

bool FleetManager::getDeactivatedDriverByIdSync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
	, void* userData)
{
	return getDeactivatedDriverByIdHelper(accessToken,
	accessToken, driverIdOrExternalId, 
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDispatchRouteByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getDispatchRouteByIdAsync(char * accessToken,
	std::string accessToken, long long routeId, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return getDispatchRouteByIdHelper(accessToken,
	accessToken, routeId, 
	handler, userData, true);
}

bool FleetManager::getDispatchRouteByIdSync(char * accessToken,
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDispatchRouteHistoryProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getDispatchRouteHistoryAsync(char * accessToken,
	std::string accessToken, long long routeId, long long startTime, long long endTime, 
	void(* handler)(DispatchRouteHistory, Error, void* )
	, void* userData)
{
	return getDispatchRouteHistoryHelper(accessToken,
	accessToken, routeId, startTime, endTime, 
	handler, userData, true);
}

bool FleetManager::getDispatchRouteHistorySync(char * accessToken,
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDispatchRoutesByDriverIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getDispatchRoutesByDriverIdAsync(char * accessToken,
	std::string accessToken, long long driverId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData)
{
	return getDispatchRoutesByDriverIdHelper(accessToken,
	accessToken, driverId, endTime, duration, 
	handler, userData, true);
}

bool FleetManager::getDispatchRoutesByDriverIdSync(char * accessToken,
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDispatchRoutesByVehicleIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getDispatchRoutesByVehicleIdAsync(char * accessToken,
	std::string accessToken, long long vehicleId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData)
{
	return getDispatchRoutesByVehicleIdHelper(accessToken,
	accessToken, vehicleId, endTime, duration, 
	handler, userData, true);
}

bool FleetManager::getDispatchRoutesByVehicleIdSync(char * accessToken,
	std::string accessToken, long long vehicleId, long long endTime, long long duration, 
	void(* handler)(std::list<DispatchRoute>, Error, void* )
	, void* userData)
{
	return getDispatchRoutesByVehicleIdHelper(accessToken,
	accessToken, vehicleId, endTime, duration, 
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDriverByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getDriverByIdAsync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
	, void* userData)
{
	return getDriverByIdHelper(accessToken,
	accessToken, driverIdOrExternalId, 
	handler, userData, true);
}

bool FleetManager::getDriverByIdSync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, 
	void(* handler)(Driver, Error, void* )
	, void* userData)
{
	return getDriverByIdHelper(accessToken,
	accessToken, driverIdOrExternalId, 
	handler, userData, false);
}

static bool getDriverDocumentTypesByOrgIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<DocumentType>, Error, void* )
	= reinterpret_cast<void(*)(std::list<DocumentType>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<DocumentType> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			DocumentType singlemodel;
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

static bool getDriverDocumentTypesByOrgIdHelper(char * accessToken,
	
	void(* handler)(std::list<DocumentType>, Error, void* )
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
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fleet/drivers/document_types");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getDriverDocumentTypesByOrgIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDriverDocumentTypesByOrgIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getDriverDocumentTypesByOrgIdAsync(char * accessToken,
	
	void(* handler)(std::list<DocumentType>, Error, void* )
	, void* userData)
{
	return getDriverDocumentTypesByOrgIdHelper(accessToken,
	
	handler, userData, true);
}

bool FleetManager::getDriverDocumentTypesByOrgIdSync(char * accessToken,
	
	void(* handler)(std::list<DocumentType>, Error, void* )
	, void* userData)
{
	return getDriverDocumentTypesByOrgIdHelper(accessToken,
	
	handler, userData, false);
}

static bool getDriverDocumentsByOrgIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<Document>, Error, void* )
	= reinterpret_cast<void(*)(std::list<Document>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<Document> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			Document singlemodel;
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

static bool getDriverDocumentsByOrgIdHelper(char * accessToken,
	std::string accessToken, long long endMs, long long durationMs, 
	void(* handler)(std::list<Document>, Error, void* )
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


	itemAtq = stringify(&endMs, "long long");
	queryParams.insert(pair<string, string>("endMs", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("endMs");
	}


	itemAtq = stringify(&durationMs, "long long");
	queryParams.insert(pair<string, string>("durationMs", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("durationMs");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fleet/drivers/documents");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getDriverDocumentsByOrgIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDriverDocumentsByOrgIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getDriverDocumentsByOrgIdAsync(char * accessToken,
	std::string accessToken, long long endMs, long long durationMs, 
	void(* handler)(std::list<Document>, Error, void* )
	, void* userData)
{
	return getDriverDocumentsByOrgIdHelper(accessToken,
	accessToken, endMs, durationMs, 
	handler, userData, true);
}

bool FleetManager::getDriverDocumentsByOrgIdSync(char * accessToken,
	std::string accessToken, long long endMs, long long durationMs, 
	void(* handler)(std::list<Document>, Error, void* )
	, void* userData)
{
	return getDriverDocumentsByOrgIdHelper(accessToken,
	accessToken, endMs, durationMs, 
	handler, userData, false);
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDriverSafetyScoreProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getDriverSafetyScoreAsync(char * accessToken,
	long long driverId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(DriverSafetyScoreResponse, Error, void* )
	, void* userData)
{
	return getDriverSafetyScoreHelper(accessToken,
	driverId, accessToken, startMs, endMs, 
	handler, userData, true);
}

bool FleetManager::getDriverSafetyScoreSync(char * accessToken,
	long long driverId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(DriverSafetyScoreResponse, Error, void* )
	, void* userData)
{
	return getDriverSafetyScoreHelper(accessToken,
	driverId, accessToken, startMs, endMs, 
	handler, userData, false);
}

static bool getDvirsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DvirListResponse, Error, void* )
	= reinterpret_cast<void(*)(DvirListResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DvirListResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DvirListResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DvirListResponse", "DvirListResponse");
			json_node_free(pJson);

			if ("DvirListResponse" == "std::string") {
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

static bool getDvirsHelper(char * accessToken,
	std::string accessToken, int endMs, int durationMs, int groupId, 
	void(* handler)(DvirListResponse, Error, void* )
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


	itemAtq = stringify(&endMs, "int");
	queryParams.insert(pair<string, string>("end_ms", itemAtq));


	itemAtq = stringify(&durationMs, "int");
	queryParams.insert(pair<string, string>("duration_ms", itemAtq));


	itemAtq = stringify(&groupId, "int");
	queryParams.insert(pair<string, string>("group_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("group_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fleet/maintenance/dvirs");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getDvirsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getDvirsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getDvirsAsync(char * accessToken,
	std::string accessToken, int endMs, int durationMs, int groupId, 
	void(* handler)(DvirListResponse, Error, void* )
	, void* userData)
{
	return getDvirsHelper(accessToken,
	accessToken, endMs, durationMs, groupId, 
	handler, userData, true);
}

bool FleetManager::getDvirsSync(char * accessToken,
	std::string accessToken, int endMs, int durationMs, int groupId, 
	void(* handler)(DvirListResponse, Error, void* )
	, void* userData)
{
	return getDvirsHelper(accessToken,
	accessToken, endMs, durationMs, groupId, 
	handler, userData, false);
}

static bool getFleetDriversProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DriversResponse, Error, void* )
	= reinterpret_cast<void(*)(DriversResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DriversResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DriversResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DriversResponse", "DriversResponse");
			json_node_free(pJson);

			if ("DriversResponse" == "std::string") {
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

static bool getFleetDriversHelper(char * accessToken,
	std::string accessToken, Inline_object_3 groupDriversParam, 
	void(* handler)(DriversResponse, Error, void* )
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

	if (isprimitive("Inline_object_3")) {
		node = converttoJson(&groupDriversParam, "Inline_object_3", "");
	}
	
	char *jsonStr =  groupDriversParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/drivers");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getFleetDriversProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFleetDriversProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getFleetDriversAsync(char * accessToken,
	std::string accessToken, Inline_object_3 groupDriversParam, 
	void(* handler)(DriversResponse, Error, void* )
	, void* userData)
{
	return getFleetDriversHelper(accessToken,
	accessToken, groupDriversParam, 
	handler, userData, true);
}

bool FleetManager::getFleetDriversSync(char * accessToken,
	std::string accessToken, Inline_object_3 groupDriversParam, 
	void(* handler)(DriversResponse, Error, void* )
	, void* userData)
{
	return getFleetDriversHelper(accessToken,
	accessToken, groupDriversParam, 
	handler, userData, false);
}

static bool getFleetDriversHosDailyLogsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DriverDailyLogResponse, Error, void* )
	= reinterpret_cast<void(*)(DriverDailyLogResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DriverDailyLogResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DriverDailyLogResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DriverDailyLogResponse", "DriverDailyLogResponse");
			json_node_free(pJson);

			if ("DriverDailyLogResponse" == "std::string") {
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

static bool getFleetDriversHosDailyLogsHelper(char * accessToken,
	std::string accessToken, long long driverId, Inline_object_6 hosLogsParam, 
	void(* handler)(DriverDailyLogResponse, Error, void* )
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

	if (isprimitive("Inline_object_6")) {
		node = converttoJson(&hosLogsParam, "Inline_object_6", "");
	}
	
	char *jsonStr =  hosLogsParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/drivers/{driver_id}/hos_daily_logs");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getFleetDriversHosDailyLogsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFleetDriversHosDailyLogsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getFleetDriversHosDailyLogsAsync(char * accessToken,
	std::string accessToken, long long driverId, Inline_object_6 hosLogsParam, 
	void(* handler)(DriverDailyLogResponse, Error, void* )
	, void* userData)
{
	return getFleetDriversHosDailyLogsHelper(accessToken,
	accessToken, driverId, hosLogsParam, 
	handler, userData, true);
}

bool FleetManager::getFleetDriversHosDailyLogsSync(char * accessToken,
	std::string accessToken, long long driverId, Inline_object_6 hosLogsParam, 
	void(* handler)(DriverDailyLogResponse, Error, void* )
	, void* userData)
{
	return getFleetDriversHosDailyLogsHelper(accessToken,
	accessToken, driverId, hosLogsParam, 
	handler, userData, false);
}

static bool getFleetDriversSummaryProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DriversSummaryResponse, Error, void* )
	= reinterpret_cast<void(*)(DriversSummaryResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DriversSummaryResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DriversSummaryResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DriversSummaryResponse", "DriversSummaryResponse");
			json_node_free(pJson);

			if ("DriversSummaryResponse" == "std::string") {
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

static bool getFleetDriversSummaryHelper(char * accessToken,
	std::string accessToken, Inline_object_5 driversSummaryParam, bool snapToDayBounds, 
	void(* handler)(DriversSummaryResponse, Error, void* )
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


	itemAtq = stringify(&snapToDayBounds, "bool");
	queryParams.insert(pair<string, string>("snap_to_day_bounds", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("snap_to_day_bounds");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("Inline_object_5")) {
		node = converttoJson(&driversSummaryParam, "Inline_object_5", "");
	}
	
	char *jsonStr =  driversSummaryParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/drivers/summary");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getFleetDriversSummaryProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFleetDriversSummaryProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getFleetDriversSummaryAsync(char * accessToken,
	std::string accessToken, Inline_object_5 driversSummaryParam, bool snapToDayBounds, 
	void(* handler)(DriversSummaryResponse, Error, void* )
	, void* userData)
{
	return getFleetDriversSummaryHelper(accessToken,
	accessToken, driversSummaryParam, snapToDayBounds, 
	handler, userData, true);
}

bool FleetManager::getFleetDriversSummarySync(char * accessToken,
	std::string accessToken, Inline_object_5 driversSummaryParam, bool snapToDayBounds, 
	void(* handler)(DriversSummaryResponse, Error, void* )
	, void* userData)
{
	return getFleetDriversSummaryHelper(accessToken,
	accessToken, driversSummaryParam, snapToDayBounds, 
	handler, userData, false);
}

static bool getFleetHosAuthenticationLogsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(HosAuthenticationLogsResponse, Error, void* )
	= reinterpret_cast<void(*)(HosAuthenticationLogsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	HosAuthenticationLogsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("HosAuthenticationLogsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "HosAuthenticationLogsResponse", "HosAuthenticationLogsResponse");
			json_node_free(pJson);

			if ("HosAuthenticationLogsResponse" == "std::string") {
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

static bool getFleetHosAuthenticationLogsHelper(char * accessToken,
	std::string accessToken, Inline_object_7 hosAuthenticationLogsParam, 
	void(* handler)(HosAuthenticationLogsResponse, Error, void* )
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

	if (isprimitive("Inline_object_7")) {
		node = converttoJson(&hosAuthenticationLogsParam, "Inline_object_7", "");
	}
	
	char *jsonStr =  hosAuthenticationLogsParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/hos_authentication_logs");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getFleetHosAuthenticationLogsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFleetHosAuthenticationLogsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getFleetHosAuthenticationLogsAsync(char * accessToken,
	std::string accessToken, Inline_object_7 hosAuthenticationLogsParam, 
	void(* handler)(HosAuthenticationLogsResponse, Error, void* )
	, void* userData)
{
	return getFleetHosAuthenticationLogsHelper(accessToken,
	accessToken, hosAuthenticationLogsParam, 
	handler, userData, true);
}

bool FleetManager::getFleetHosAuthenticationLogsSync(char * accessToken,
	std::string accessToken, Inline_object_7 hosAuthenticationLogsParam, 
	void(* handler)(HosAuthenticationLogsResponse, Error, void* )
	, void* userData)
{
	return getFleetHosAuthenticationLogsHelper(accessToken,
	accessToken, hosAuthenticationLogsParam, 
	handler, userData, false);
}

static bool getFleetHosLogsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(HosLogsResponse, Error, void* )
	= reinterpret_cast<void(*)(HosLogsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	HosLogsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("HosLogsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "HosLogsResponse", "HosLogsResponse");
			json_node_free(pJson);

			if ("HosLogsResponse" == "std::string") {
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

static bool getFleetHosLogsHelper(char * accessToken,
	std::string accessToken, Inline_object_8 hosLogsParam, 
	void(* handler)(HosLogsResponse, Error, void* )
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

	if (isprimitive("Inline_object_8")) {
		node = converttoJson(&hosLogsParam, "Inline_object_8", "");
	}
	
	char *jsonStr =  hosLogsParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/hos_logs");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getFleetHosLogsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFleetHosLogsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getFleetHosLogsAsync(char * accessToken,
	std::string accessToken, Inline_object_8 hosLogsParam, 
	void(* handler)(HosLogsResponse, Error, void* )
	, void* userData)
{
	return getFleetHosLogsHelper(accessToken,
	accessToken, hosLogsParam, 
	handler, userData, true);
}

bool FleetManager::getFleetHosLogsSync(char * accessToken,
	std::string accessToken, Inline_object_8 hosLogsParam, 
	void(* handler)(HosLogsResponse, Error, void* )
	, void* userData)
{
	return getFleetHosLogsHelper(accessToken,
	accessToken, hosLogsParam, 
	handler, userData, false);
}

static bool getFleetHosLogsSummaryProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(HosLogsSummaryResponse, Error, void* )
	= reinterpret_cast<void(*)(HosLogsSummaryResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	HosLogsSummaryResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("HosLogsSummaryResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "HosLogsSummaryResponse", "HosLogsSummaryResponse");
			json_node_free(pJson);

			if ("HosLogsSummaryResponse" == "std::string") {
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

static bool getFleetHosLogsSummaryHelper(char * accessToken,
	std::string accessToken, Inline_object_9 hosLogsParam, 
	void(* handler)(HosLogsSummaryResponse, Error, void* )
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

	if (isprimitive("Inline_object_9")) {
		node = converttoJson(&hosLogsParam, "Inline_object_9", "");
	}
	
	char *jsonStr =  hosLogsParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/hos_logs_summary");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getFleetHosLogsSummaryProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFleetHosLogsSummaryProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getFleetHosLogsSummaryAsync(char * accessToken,
	std::string accessToken, Inline_object_9 hosLogsParam, 
	void(* handler)(HosLogsSummaryResponse, Error, void* )
	, void* userData)
{
	return getFleetHosLogsSummaryHelper(accessToken,
	accessToken, hosLogsParam, 
	handler, userData, true);
}

bool FleetManager::getFleetHosLogsSummarySync(char * accessToken,
	std::string accessToken, Inline_object_9 hosLogsParam, 
	void(* handler)(HosLogsSummaryResponse, Error, void* )
	, void* userData)
{
	return getFleetHosLogsSummaryHelper(accessToken,
	accessToken, hosLogsParam, 
	handler, userData, false);
}

static bool getFleetLocationsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Inline_response_200_3, Error, void* )
	= reinterpret_cast<void(*)(Inline_response_200_3, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Inline_response_200_3 out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Inline_response_200_3")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Inline_response_200_3", "Inline_response_200_3");
			json_node_free(pJson);

			if ("Inline_response_200_3" == "std::string") {
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

static bool getFleetLocationsHelper(char * accessToken,
	std::string accessToken, Inline_object_11 groupParam, 
	void(* handler)(Inline_response_200_3, Error, void* )
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

	if (isprimitive("Inline_object_11")) {
		node = converttoJson(&groupParam, "Inline_object_11", "");
	}
	
	char *jsonStr =  groupParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/locations");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getFleetLocationsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFleetLocationsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getFleetLocationsAsync(char * accessToken,
	std::string accessToken, Inline_object_11 groupParam, 
	void(* handler)(Inline_response_200_3, Error, void* )
	, void* userData)
{
	return getFleetLocationsHelper(accessToken,
	accessToken, groupParam, 
	handler, userData, true);
}

bool FleetManager::getFleetLocationsSync(char * accessToken,
	std::string accessToken, Inline_object_11 groupParam, 
	void(* handler)(Inline_response_200_3, Error, void* )
	, void* userData)
{
	return getFleetLocationsHelper(accessToken,
	accessToken, groupParam, 
	handler, userData, false);
}

static bool getFleetMaintenanceListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Inline_response_200_4, Error, void* )
	= reinterpret_cast<void(*)(Inline_response_200_4, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Inline_response_200_4 out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Inline_response_200_4")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Inline_response_200_4", "Inline_response_200_4");
			json_node_free(pJson);

			if ("Inline_response_200_4" == "std::string") {
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

static bool getFleetMaintenanceListHelper(char * accessToken,
	std::string accessToken, Inline_object_13 groupParam, 
	void(* handler)(Inline_response_200_4, Error, void* )
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

	if (isprimitive("Inline_object_13")) {
		node = converttoJson(&groupParam, "Inline_object_13", "");
	}
	
	char *jsonStr =  groupParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/maintenance/list");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getFleetMaintenanceListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFleetMaintenanceListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getFleetMaintenanceListAsync(char * accessToken,
	std::string accessToken, Inline_object_13 groupParam, 
	void(* handler)(Inline_response_200_4, Error, void* )
	, void* userData)
{
	return getFleetMaintenanceListHelper(accessToken,
	accessToken, groupParam, 
	handler, userData, true);
}

bool FleetManager::getFleetMaintenanceListSync(char * accessToken,
	std::string accessToken, Inline_object_13 groupParam, 
	void(* handler)(Inline_response_200_4, Error, void* )
	, void* userData)
{
	return getFleetMaintenanceListHelper(accessToken,
	accessToken, groupParam, 
	handler, userData, false);
}

static bool getFleetTripsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(TripResponse, Error, void* )
	= reinterpret_cast<void(*)(TripResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	TripResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("TripResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "TripResponse", "TripResponse");
			json_node_free(pJson);

			if ("TripResponse" == "std::string") {
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

static bool getFleetTripsHelper(char * accessToken,
	std::string accessToken, Inline_object_15 tripsParam, 
	void(* handler)(TripResponse, Error, void* )
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

	if (isprimitive("Inline_object_15")) {
		node = converttoJson(&tripsParam, "Inline_object_15", "");
	}
	
	char *jsonStr =  tripsParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/trips");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getFleetTripsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFleetTripsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getFleetTripsAsync(char * accessToken,
	std::string accessToken, Inline_object_15 tripsParam, 
	void(* handler)(TripResponse, Error, void* )
	, void* userData)
{
	return getFleetTripsHelper(accessToken,
	accessToken, tripsParam, 
	handler, userData, true);
}

bool FleetManager::getFleetTripsSync(char * accessToken,
	std::string accessToken, Inline_object_15 tripsParam, 
	void(* handler)(TripResponse, Error, void* )
	, void* userData)
{
	return getFleetTripsHelper(accessToken,
	accessToken, tripsParam, 
	handler, userData, false);
}

static bool getFleetVehicleProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(FleetVehicleResponse, Error, void* )
	= reinterpret_cast<void(*)(FleetVehicleResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	FleetVehicleResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("FleetVehicleResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "FleetVehicleResponse", "FleetVehicleResponse");
			json_node_free(pJson);

			if ("FleetVehicleResponse" == "std::string") {
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

static bool getFleetVehicleHelper(char * accessToken,
	std::string accessToken, std::string vehicleIdOrExternalId, 
	void(* handler)(FleetVehicleResponse, Error, void* )
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

	string url("/fleet/vehicles/{vehicle_id_or_external_id}");
	int pos;

	string s_vehicleIdOrExternalId("{");
	s_vehicleIdOrExternalId.append("vehicle_id_or_external_id");
	s_vehicleIdOrExternalId.append("}");
	pos = url.find(s_vehicleIdOrExternalId);
	url.erase(pos, s_vehicleIdOrExternalId.length());
	url.insert(pos, stringify(&vehicleIdOrExternalId, "std::string"));

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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getFleetVehicleProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getFleetVehicleProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getFleetVehicleAsync(char * accessToken,
	std::string accessToken, std::string vehicleIdOrExternalId, 
	void(* handler)(FleetVehicleResponse, Error, void* )
	, void* userData)
{
	return getFleetVehicleHelper(accessToken,
	accessToken, vehicleIdOrExternalId, 
	handler, userData, true);
}

bool FleetManager::getFleetVehicleSync(char * accessToken,
	std::string accessToken, std::string vehicleIdOrExternalId, 
	void(* handler)(FleetVehicleResponse, Error, void* )
	, void* userData)
{
	return getFleetVehicleHelper(accessToken,
	accessToken, vehicleIdOrExternalId, 
	handler, userData, false);
}

static bool getOrganizationAddressProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Address, Error, void* )
	= reinterpret_cast<void(*)(Address, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Address out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Address")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Address", "Address");
			json_node_free(pJson);

			if ("Address" == "std::string") {
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

static bool getOrganizationAddressHelper(char * accessToken,
	std::string accessToken, long long addressId, 
	void(* handler)(Address, Error, void* )
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

	string url("/addresses/{addressId}");
	int pos;

	string s_addressId("{");
	s_addressId.append("addressId");
	s_addressId.append("}");
	pos = url.find(s_addressId);
	url.erase(pos, s_addressId.length());
	url.insert(pos, stringify(&addressId, "long long"));

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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOrganizationAddressProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOrganizationAddressProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getOrganizationAddressAsync(char * accessToken,
	std::string accessToken, long long addressId, 
	void(* handler)(Address, Error, void* )
	, void* userData)
{
	return getOrganizationAddressHelper(accessToken,
	accessToken, addressId, 
	handler, userData, true);
}

bool FleetManager::getOrganizationAddressSync(char * accessToken,
	std::string accessToken, long long addressId, 
	void(* handler)(Address, Error, void* )
	, void* userData)
{
	return getOrganizationAddressHelper(accessToken,
	accessToken, addressId, 
	handler, userData, false);
}

static bool getOrganizationAddressesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<Address>, Error, void* )
	= reinterpret_cast<void(*)(std::list<Address>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<Address> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			Address singlemodel;
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

static bool getOrganizationAddressesHelper(char * accessToken,
	std::string accessToken, 
	void(* handler)(std::list<Address>, Error, void* )
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

	string url("/addresses");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOrganizationAddressesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOrganizationAddressesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getOrganizationAddressesAsync(char * accessToken,
	std::string accessToken, 
	void(* handler)(std::list<Address>, Error, void* )
	, void* userData)
{
	return getOrganizationAddressesHelper(accessToken,
	accessToken, 
	handler, userData, true);
}

bool FleetManager::getOrganizationAddressesSync(char * accessToken,
	std::string accessToken, 
	void(* handler)(std::list<Address>, Error, void* )
	, void* userData)
{
	return getOrganizationAddressesHelper(accessToken,
	accessToken, 
	handler, userData, false);
}

static bool getOrganizationContactProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Contact, Error, void* )
	= reinterpret_cast<void(*)(Contact, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Contact out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Contact")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Contact", "Contact");
			json_node_free(pJson);

			if ("Contact" == "std::string") {
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

static bool getOrganizationContactHelper(char * accessToken,
	std::string accessToken, long long contactId, 
	void(* handler)(Contact, Error, void* )
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

	string url("/contacts/{contact_id}");
	int pos;

	string s_contactId("{");
	s_contactId.append("contact_id");
	s_contactId.append("}");
	pos = url.find(s_contactId);
	url.erase(pos, s_contactId.length());
	url.insert(pos, stringify(&contactId, "long long"));

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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOrganizationContactProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOrganizationContactProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getOrganizationContactAsync(char * accessToken,
	std::string accessToken, long long contactId, 
	void(* handler)(Contact, Error, void* )
	, void* userData)
{
	return getOrganizationContactHelper(accessToken,
	accessToken, contactId, 
	handler, userData, true);
}

bool FleetManager::getOrganizationContactSync(char * accessToken,
	std::string accessToken, long long contactId, 
	void(* handler)(Contact, Error, void* )
	, void* userData)
{
	return getOrganizationContactHelper(accessToken,
	accessToken, contactId, 
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getVehicleHarshEventProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getVehicleHarshEventAsync(char * accessToken,
	long long vehicleId, std::string accessToken, long long timestamp, 
	void(* handler)(VehicleHarshEventResponse, Error, void* )
	, void* userData)
{
	return getVehicleHarshEventHelper(accessToken,
	vehicleId, accessToken, timestamp, 
	handler, userData, true);
}

bool FleetManager::getVehicleHarshEventSync(char * accessToken,
	long long vehicleId, std::string accessToken, long long timestamp, 
	void(* handler)(VehicleHarshEventResponse, Error, void* )
	, void* userData)
{
	return getVehicleHarshEventHelper(accessToken,
	vehicleId, accessToken, timestamp, 
	handler, userData, false);
}

static bool getVehicleLocationsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<FleetVehicleLocation>, Error, void* )
	= reinterpret_cast<void(*)(std::list<FleetVehicleLocation>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<FleetVehicleLocation> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			FleetVehicleLocation singlemodel;
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

static bool getVehicleLocationsHelper(char * accessToken,
	std::string accessToken, long long vehicleId, long long startMs, long long endMs, 
	void(* handler)(std::list<FleetVehicleLocation>, Error, void* )
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

	string url("/fleet/vehicles/{vehicle_id}/locations");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getVehicleLocationsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getVehicleLocationsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getVehicleLocationsAsync(char * accessToken,
	std::string accessToken, long long vehicleId, long long startMs, long long endMs, 
	void(* handler)(std::list<FleetVehicleLocation>, Error, void* )
	, void* userData)
{
	return getVehicleLocationsHelper(accessToken,
	accessToken, vehicleId, startMs, endMs, 
	handler, userData, true);
}

bool FleetManager::getVehicleLocationsSync(char * accessToken,
	std::string accessToken, long long vehicleId, long long startMs, long long endMs, 
	void(* handler)(std::list<FleetVehicleLocation>, Error, void* )
	, void* userData)
{
	return getVehicleLocationsHelper(accessToken,
	accessToken, vehicleId, startMs, endMs, 
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getVehicleSafetyScoreProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getVehicleSafetyScoreAsync(char * accessToken,
	long long vehicleId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(VehicleSafetyScoreResponse, Error, void* )
	, void* userData)
{
	return getVehicleSafetyScoreHelper(accessToken,
	vehicleId, accessToken, startMs, endMs, 
	handler, userData, true);
}

bool FleetManager::getVehicleSafetyScoreSync(char * accessToken,
	long long vehicleId, std::string accessToken, long long startMs, long long endMs, 
	void(* handler)(VehicleSafetyScoreResponse, Error, void* )
	, void* userData)
{
	return getVehicleSafetyScoreHelper(accessToken,
	vehicleId, accessToken, startMs, endMs, 
	handler, userData, false);
}

static bool getVehicleStatsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Inline_response_200_5, Error, void* )
	= reinterpret_cast<void(*)(Inline_response_200_5, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Inline_response_200_5 out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Inline_response_200_5")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Inline_response_200_5", "Inline_response_200_5");
			json_node_free(pJson);

			if ("Inline_response_200_5" == "std::string") {
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

static bool getVehicleStatsHelper(char * accessToken,
	std::string accessToken, int startMs, int endMs, std::string series, std::string tagIds, std::string startingAfter, std::string endingBefore, long long limit, 
	void(* handler)(Inline_response_200_5, Error, void* )
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


	itemAtq = stringify(&startMs, "int");
	queryParams.insert(pair<string, string>("startMs", itemAtq));


	itemAtq = stringify(&endMs, "int");
	queryParams.insert(pair<string, string>("endMs", itemAtq));


	itemAtq = stringify(&series, "std::string");
	queryParams.insert(pair<string, string>("series", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("series");
	}


	itemAtq = stringify(&tagIds, "std::string");
	queryParams.insert(pair<string, string>("tagIds", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("tagIds");
	}


	itemAtq = stringify(&startingAfter, "std::string");
	queryParams.insert(pair<string, string>("startingAfter", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("startingAfter");
	}


	itemAtq = stringify(&endingBefore, "std::string");
	queryParams.insert(pair<string, string>("endingBefore", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("endingBefore");
	}


	itemAtq = stringify(&limit, "long long");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fleet/vehicles/stats");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getVehicleStatsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getVehicleStatsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getVehicleStatsAsync(char * accessToken,
	std::string accessToken, int startMs, int endMs, std::string series, std::string tagIds, std::string startingAfter, std::string endingBefore, long long limit, 
	void(* handler)(Inline_response_200_5, Error, void* )
	, void* userData)
{
	return getVehicleStatsHelper(accessToken,
	accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, 
	handler, userData, true);
}

bool FleetManager::getVehicleStatsSync(char * accessToken,
	std::string accessToken, int startMs, int endMs, std::string series, std::string tagIds, std::string startingAfter, std::string endingBefore, long long limit, 
	void(* handler)(Inline_response_200_5, Error, void* )
	, void* userData)
{
	return getVehicleStatsHelper(accessToken,
	accessToken, startMs, endMs, series, tagIds, startingAfter, endingBefore, limit, 
	handler, userData, false);
}

static bool getVehiclesLocationsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<std::string>, Error, void* )
	= reinterpret_cast<void(*)(std::list<std::string>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<std::string> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			std::string singlemodel;
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

static bool getVehiclesLocationsHelper(char * accessToken,
	std::string accessToken, int startMs, int endMs, 
	void(* handler)(std::list<std::string>, Error, void* )
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


	itemAtq = stringify(&startMs, "int");
	queryParams.insert(pair<string, string>("startMs", itemAtq));


	itemAtq = stringify(&endMs, "int");
	queryParams.insert(pair<string, string>("endMs", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fleet/vehicles/locations");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getVehiclesLocationsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getVehiclesLocationsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::getVehiclesLocationsAsync(char * accessToken,
	std::string accessToken, int startMs, int endMs, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData)
{
	return getVehiclesLocationsHelper(accessToken,
	accessToken, startMs, endMs, 
	handler, userData, true);
}

bool FleetManager::getVehiclesLocationsSync(char * accessToken,
	std::string accessToken, int startMs, int endMs, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData)
{
	return getVehiclesLocationsHelper(accessToken,
	accessToken, startMs, endMs, 
	handler, userData, false);
}

static bool listContactsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<Contact>, Error, void* )
	= reinterpret_cast<void(*)(std::list<Contact>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<Contact> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			Contact singlemodel;
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

static bool listContactsHelper(char * accessToken,
	std::string accessToken, 
	void(* handler)(std::list<Contact>, Error, void* )
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

	string url("/contacts");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listContactsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listContactsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::listContactsAsync(char * accessToken,
	std::string accessToken, 
	void(* handler)(std::list<Contact>, Error, void* )
	, void* userData)
{
	return listContactsHelper(accessToken,
	accessToken, 
	handler, userData, true);
}

bool FleetManager::listContactsSync(char * accessToken,
	std::string accessToken, 
	void(* handler)(std::list<Contact>, Error, void* )
	, void* userData)
{
	return listContactsHelper(accessToken,
	accessToken, 
	handler, userData, false);
}

static bool listFleetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Inline_response_200_2, Error, void* )
	= reinterpret_cast<void(*)(Inline_response_200_2, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Inline_response_200_2 out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Inline_response_200_2")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Inline_response_200_2", "Inline_response_200_2");
			json_node_free(pJson);

			if ("Inline_response_200_2" == "std::string") {
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

static bool listFleetHelper(char * accessToken,
	std::string accessToken, Inline_object_10 groupParam, std::string startingAfter, std::string endingBefore, long long limit, 
	void(* handler)(Inline_response_200_2, Error, void* )
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


	itemAtq = stringify(&startingAfter, "std::string");
	queryParams.insert(pair<string, string>("startingAfter", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("startingAfter");
	}


	itemAtq = stringify(&endingBefore, "std::string");
	queryParams.insert(pair<string, string>("endingBefore", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("endingBefore");
	}


	itemAtq = stringify(&limit, "long long");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("Inline_object_10")) {
		node = converttoJson(&groupParam, "Inline_object_10", "");
	}
	
	char *jsonStr =  groupParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/list");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listFleetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listFleetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::listFleetAsync(char * accessToken,
	std::string accessToken, Inline_object_10 groupParam, std::string startingAfter, std::string endingBefore, long long limit, 
	void(* handler)(Inline_response_200_2, Error, void* )
	, void* userData)
{
	return listFleetHelper(accessToken,
	accessToken, groupParam, startingAfter, endingBefore, limit, 
	handler, userData, true);
}

bool FleetManager::listFleetSync(char * accessToken,
	std::string accessToken, Inline_object_10 groupParam, std::string startingAfter, std::string endingBefore, long long limit, 
	void(* handler)(Inline_response_200_2, Error, void* )
	, void* userData)
{
	return listFleetHelper(accessToken,
	accessToken, groupParam, startingAfter, endingBefore, limit, 
	handler, userData, false);
}

static bool patchFleetVehicleProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(FleetVehicleResponse, Error, void* )
	= reinterpret_cast<void(*)(FleetVehicleResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	FleetVehicleResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("FleetVehicleResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "FleetVehicleResponse", "FleetVehicleResponse");
			json_node_free(pJson);

			if ("FleetVehicleResponse" == "std::string") {
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

static bool patchFleetVehicleHelper(char * accessToken,
	std::string accessToken, std::string vehicleIdOrExternalId, Inline_object_16 data, 
	void(* handler)(FleetVehicleResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");
	headerList = curl_slist_append(headerList, "Content-Type: application/merge-patch+json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&accessToken, "std::string");
	queryParams.insert(pair<string, string>("access_token", itemAtq));

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("Inline_object_16")) {
		node = converttoJson(&data, "Inline_object_16", "");
	}
	
	char *jsonStr =  data.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/vehicles/{vehicle_id_or_external_id}");
	int pos;

	string s_vehicleIdOrExternalId("{");
	s_vehicleIdOrExternalId.append("vehicle_id_or_external_id");
	s_vehicleIdOrExternalId.append("}");
	pos = url.find(s_vehicleIdOrExternalId);
	url.erase(pos, s_vehicleIdOrExternalId.length());
	url.insert(pos, stringify(&vehicleIdOrExternalId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PATCH");

	if(strcmp("PUT", "PATCH") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = patchFleetVehicleProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), patchFleetVehicleProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::patchFleetVehicleAsync(char * accessToken,
	std::string accessToken, std::string vehicleIdOrExternalId, Inline_object_16 data, 
	void(* handler)(FleetVehicleResponse, Error, void* )
	, void* userData)
{
	return patchFleetVehicleHelper(accessToken,
	accessToken, vehicleIdOrExternalId, data, 
	handler, userData, true);
}

bool FleetManager::patchFleetVehicleSync(char * accessToken,
	std::string accessToken, std::string vehicleIdOrExternalId, Inline_object_16 data, 
	void(* handler)(FleetVehicleResponse, Error, void* )
	, void* userData)
{
	return patchFleetVehicleHelper(accessToken,
	accessToken, vehicleIdOrExternalId, data, 
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), reactivateDriverByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::reactivateDriverByIdAsync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, Inline_object_4 reactivateDriverParam, 
	void(* handler)(Driver, Error, void* )
	, void* userData)
{
	return reactivateDriverByIdHelper(accessToken,
	accessToken, driverIdOrExternalId, reactivateDriverParam, 
	handler, userData, true);
}

bool FleetManager::reactivateDriverByIdSync(char * accessToken,
	std::string accessToken, std::string driverIdOrExternalId, Inline_object_4 reactivateDriverParam, 
	void(* handler)(Driver, Error, void* )
	, void* userData)
{
	return reactivateDriverByIdHelper(accessToken,
	accessToken, driverIdOrExternalId, reactivateDriverParam, 
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateDispatchRouteByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::updateDispatchRouteByIdAsync(char * accessToken,
	std::string accessToken, long long routeId, DispatchRoute updateDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return updateDispatchRouteByIdHelper(accessToken,
	accessToken, routeId, updateDispatchRouteParams, 
	handler, userData, true);
}

bool FleetManager::updateDispatchRouteByIdSync(char * accessToken,
	std::string accessToken, long long routeId, DispatchRoute updateDispatchRouteParams, 
	void(* handler)(DispatchRoute, Error, void* )
	, void* userData)
{
	return updateDispatchRouteByIdHelper(accessToken,
	accessToken, routeId, updateDispatchRouteParams, 
	handler, userData, false);
}

static bool updateOrganizationAddressProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateOrganizationAddressHelper(char * accessToken,
	std::string accessToken, long long addressId, Inline_object_1 address, 
	
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

	if (isprimitive("Inline_object_1")) {
		node = converttoJson(&address, "Inline_object_1", "");
	}
	
	char *jsonStr =  address.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/addresses/{addressId}");
	int pos;

	string s_addressId("{");
	s_addressId.append("addressId");
	s_addressId.append("}");
	pos = url.find(s_addressId);
	url.erase(pos, s_addressId.length());
	url.insert(pos, stringify(&addressId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PATCH");

	if(strcmp("PUT", "PATCH") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateOrganizationAddressProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateOrganizationAddressProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::updateOrganizationAddressAsync(char * accessToken,
	std::string accessToken, long long addressId, Inline_object_1 address, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return updateOrganizationAddressHelper(accessToken,
	accessToken, addressId, address, 
	handler, userData, true);
}

bool FleetManager::updateOrganizationAddressSync(char * accessToken,
	std::string accessToken, long long addressId, Inline_object_1 address, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return updateOrganizationAddressHelper(accessToken,
	accessToken, addressId, address, 
	handler, userData, false);
}

static bool updateVehiclesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateVehiclesHelper(char * accessToken,
	std::string accessToken, Inline_object_14 vehicleUpdateParam, 
	
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

	if (isprimitive("Inline_object_14")) {
		node = converttoJson(&vehicleUpdateParam, "Inline_object_14", "");
	}
	
	char *jsonStr =  vehicleUpdateParam.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fleet/set_data");
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
		NetClient::easycurl(FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateVehiclesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FleetManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateVehiclesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FleetManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FleetManager::updateVehiclesAsync(char * accessToken,
	std::string accessToken, Inline_object_14 vehicleUpdateParam, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return updateVehiclesHelper(accessToken,
	accessToken, vehicleUpdateParam, 
	handler, userData, true);
}

bool FleetManager::updateVehiclesSync(char * accessToken,
	std::string accessToken, Inline_object_14 vehicleUpdateParam, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return updateVehiclesHelper(accessToken,
	accessToken, vehicleUpdateParam, 
	handler, userData, false);
}

