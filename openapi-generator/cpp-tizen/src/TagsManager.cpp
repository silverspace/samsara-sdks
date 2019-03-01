#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "TagsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


TagsManager::TagsManager()
{

}

TagsManager::~TagsManager()
{

}

static gboolean __TagsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __TagsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__TagsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool createTagProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Tag, Error, void* )
	= reinterpret_cast<void(*)(Tag, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Tag out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Tag")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Tag", "Tag");
			json_node_free(pJson);

			if ("Tag" == "std::string") {
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

static bool createTagHelper(char * accessToken,
	std::string accessToken, TagCreate tagCreateParams, 
	void(* handler)(Tag, Error, void* )
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

	if (isprimitive("TagCreate")) {
		node = converttoJson(&tagCreateParams, "TagCreate", "");
	}
	
	char *jsonStr =  tagCreateParams.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/tags");
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
		NetClient::easycurl(TagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createTagProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (TagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createTagProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __TagsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool TagsManager::createTagAsync(char * accessToken,
	std::string accessToken, TagCreate tagCreateParams, 
	void(* handler)(Tag, Error, void* )
	, void* userData)
{
	return createTagHelper(accessToken,
	accessToken, tagCreateParams, 
	handler, userData, true);
}

bool TagsManager::createTagSync(char * accessToken,
	std::string accessToken, TagCreate tagCreateParams, 
	void(* handler)(Tag, Error, void* )
	, void* userData)
{
	return createTagHelper(accessToken,
	accessToken, tagCreateParams, 
	handler, userData, false);
}

static bool deleteTagByIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool deleteTagByIdHelper(char * accessToken,
	std::string accessToken, long long tagId, 
	
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

	string url("/tags/{tag_id}");
	int pos;

	string s_tagId("{");
	s_tagId.append("tag_id");
	s_tagId.append("}");
	pos = url.find(s_tagId);
	url.erase(pos, s_tagId.length());
	url.insert(pos, stringify(&tagId, "long long"));

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
		NetClient::easycurl(TagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteTagByIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (TagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteTagByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __TagsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool TagsManager::deleteTagByIdAsync(char * accessToken,
	std::string accessToken, long long tagId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return deleteTagByIdHelper(accessToken,
	accessToken, tagId, 
	handler, userData, true);
}

bool TagsManager::deleteTagByIdSync(char * accessToken,
	std::string accessToken, long long tagId, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return deleteTagByIdHelper(accessToken,
	accessToken, tagId, 
	handler, userData, false);
}

static bool getAllTagsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Inline_response_200_9, Error, void* )
	= reinterpret_cast<void(*)(Inline_response_200_9, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Inline_response_200_9 out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Inline_response_200_9")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Inline_response_200_9", "Inline_response_200_9");
			json_node_free(pJson);

			if ("Inline_response_200_9" == "std::string") {
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

static bool getAllTagsHelper(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200_9, Error, void* )
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

	string url("/tags");
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
		NetClient::easycurl(TagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAllTagsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (TagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAllTagsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __TagsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool TagsManager::getAllTagsAsync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200_9, Error, void* )
	, void* userData)
{
	return getAllTagsHelper(accessToken,
	accessToken, groupId, 
	handler, userData, true);
}

bool TagsManager::getAllTagsSync(char * accessToken,
	std::string accessToken, long long groupId, 
	void(* handler)(Inline_response_200_9, Error, void* )
	, void* userData)
{
	return getAllTagsHelper(accessToken,
	accessToken, groupId, 
	handler, userData, false);
}

static bool getTagByIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Tag, Error, void* )
	= reinterpret_cast<void(*)(Tag, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Tag out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Tag")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Tag", "Tag");
			json_node_free(pJson);

			if ("Tag" == "std::string") {
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

static bool getTagByIdHelper(char * accessToken,
	std::string accessToken, long long tagId, 
	void(* handler)(Tag, Error, void* )
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

	string url("/tags/{tag_id}");
	int pos;

	string s_tagId("{");
	s_tagId.append("tag_id");
	s_tagId.append("}");
	pos = url.find(s_tagId);
	url.erase(pos, s_tagId.length());
	url.insert(pos, stringify(&tagId, "long long"));

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
		NetClient::easycurl(TagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getTagByIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (TagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getTagByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __TagsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool TagsManager::getTagByIdAsync(char * accessToken,
	std::string accessToken, long long tagId, 
	void(* handler)(Tag, Error, void* )
	, void* userData)
{
	return getTagByIdHelper(accessToken,
	accessToken, tagId, 
	handler, userData, true);
}

bool TagsManager::getTagByIdSync(char * accessToken,
	std::string accessToken, long long tagId, 
	void(* handler)(Tag, Error, void* )
	, void* userData)
{
	return getTagByIdHelper(accessToken,
	accessToken, tagId, 
	handler, userData, false);
}

static bool modifyTagByIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Tag, Error, void* )
	= reinterpret_cast<void(*)(Tag, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Tag out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Tag")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Tag", "Tag");
			json_node_free(pJson);

			if ("Tag" == "std::string") {
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

static bool modifyTagByIdHelper(char * accessToken,
	std::string accessToken, long long tagId, TagModify tagModifyParams, 
	void(* handler)(Tag, Error, void* )
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

	if (isprimitive("TagModify")) {
		node = converttoJson(&tagModifyParams, "TagModify", "");
	}
	
	char *jsonStr =  tagModifyParams.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/tags/{tag_id}");
	int pos;

	string s_tagId("{");
	s_tagId.append("tag_id");
	s_tagId.append("}");
	pos = url.find(s_tagId);
	url.erase(pos, s_tagId.length());
	url.insert(pos, stringify(&tagId, "long long"));

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
		NetClient::easycurl(TagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = modifyTagByIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (TagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), modifyTagByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __TagsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool TagsManager::modifyTagByIdAsync(char * accessToken,
	std::string accessToken, long long tagId, TagModify tagModifyParams, 
	void(* handler)(Tag, Error, void* )
	, void* userData)
{
	return modifyTagByIdHelper(accessToken,
	accessToken, tagId, tagModifyParams, 
	handler, userData, true);
}

bool TagsManager::modifyTagByIdSync(char * accessToken,
	std::string accessToken, long long tagId, TagModify tagModifyParams, 
	void(* handler)(Tag, Error, void* )
	, void* userData)
{
	return modifyTagByIdHelper(accessToken,
	accessToken, tagId, tagModifyParams, 
	handler, userData, false);
}

static bool updateTagByIdProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Tag, Error, void* )
	= reinterpret_cast<void(*)(Tag, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Tag out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Tag")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Tag", "Tag");
			json_node_free(pJson);

			if ("Tag" == "std::string") {
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

static bool updateTagByIdHelper(char * accessToken,
	std::string accessToken, long long tagId, TagUpdate updateTagParams, 
	void(* handler)(Tag, Error, void* )
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

	if (isprimitive("TagUpdate")) {
		node = converttoJson(&updateTagParams, "TagUpdate", "");
	}
	
	char *jsonStr =  updateTagParams.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/tags/{tag_id}");
	int pos;

	string s_tagId("{");
	s_tagId.append("tag_id");
	s_tagId.append("}");
	pos = url.find(s_tagId);
	url.erase(pos, s_tagId.length());
	url.insert(pos, stringify(&tagId, "long long"));

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
		NetClient::easycurl(TagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateTagByIdProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (TagsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateTagByIdProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __TagsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool TagsManager::updateTagByIdAsync(char * accessToken,
	std::string accessToken, long long tagId, TagUpdate updateTagParams, 
	void(* handler)(Tag, Error, void* )
	, void* userData)
{
	return updateTagByIdHelper(accessToken,
	accessToken, tagId, updateTagParams, 
	handler, userData, true);
}

bool TagsManager::updateTagByIdSync(char * accessToken,
	std::string accessToken, long long tagId, TagUpdate updateTagParams, 
	void(* handler)(Tag, Error, void* )
	, void* userData)
{
	return updateTagByIdHelper(accessToken,
	accessToken, tagId, updateTagParams, 
	handler, userData, false);
}

