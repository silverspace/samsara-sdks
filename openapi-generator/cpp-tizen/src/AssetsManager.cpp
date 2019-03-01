#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "AssetsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


AssetsManager::AssetsManager()
{

}

AssetsManager::~AssetsManager()
{

}

static gboolean __AssetsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __AssetsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__AssetsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
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
		NetClient::easycurl(AssetsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (AssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAllAssetCurrentLocationsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssetsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssetsManager::getAllAssetCurrentLocationsAsync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200_1, Error, void* )
	, void* userData)
{
	return getAllAssetCurrentLocationsHelper(accessToken,
	accessToken, groupId, 
	handler, userData, true);
}

bool AssetsManager::getAllAssetCurrentLocationsSync(char * accessToken,
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
		NetClient::easycurl(AssetsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (AssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAllAssetsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssetsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssetsManager::getAllAssetsAsync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200, Error, void* )
	, void* userData)
{
	return getAllAssetsHelper(accessToken,
	accessToken, groupId, 
	handler, userData, true);
}

bool AssetsManager::getAllAssetsSync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200, Error, void* )
	, void* userData)
{
	return getAllAssetsHelper(accessToken,
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
		NetClient::easycurl(AssetsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (AssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAssetLocationProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssetsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssetsManager::getAssetLocationAsync(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData)
{
	return getAssetLocationHelper(accessToken,
	accessToken, assetId, startMs, endMs, 
	handler, userData, true);
}

bool AssetsManager::getAssetLocationSync(char * accessToken,
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
		NetClient::easycurl(AssetsManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (AssetsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAssetReeferProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssetsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssetsManager::getAssetReeferAsync(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(AssetReeferResponse, Error, void* )
	, void* userData)
{
	return getAssetReeferHelper(accessToken,
	accessToken, assetId, startMs, endMs, 
	handler, userData, true);
}

bool AssetsManager::getAssetReeferSync(char * accessToken,
	std::string accessToken, long long assetId, long long startMs, long long endMs, 
	void(* handler)(AssetReeferResponse, Error, void* )
	, void* userData)
{
	return getAssetReeferHelper(accessToken,
	accessToken, assetId, startMs, endMs, 
	handler, userData, false);
}

