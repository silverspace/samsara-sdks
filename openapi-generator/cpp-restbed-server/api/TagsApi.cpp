/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 4.0.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


#include <corvusoft/restbed/byte.hpp>
#include <corvusoft/restbed/string.hpp>
#include <corvusoft/restbed/settings.hpp>
#include <corvusoft/restbed/request.hpp>

#include "TagsApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

TagsApi::TagsApi() {
	std::shared_ptr<TagsApiTagsResource> spTagsApiTagsResource = std::make_shared<TagsApiTagsResource>();
	this->publish(spTagsApiTagsResource);
	
	std::shared_ptr<TagsApiTagsTag_idResource> spTagsApiTagsTag_idResource = std::make_shared<TagsApiTagsTag_idResource>();
	this->publish(spTagsApiTagsTag_idResource);
	
}

TagsApi::~TagsApi() {}

void TagsApi::startService(int const& port) {
	std::shared_ptr<restbed::Settings> settings = std::make_shared<restbed::Settings>();
	settings->set_port(port);
	settings->set_root("/v1");
	
	this->start(settings);
}

void TagsApi::stopService() {
	this->stop();
}

TagsApiTagsResource::TagsApiTagsResource()
{
	this->set_path("/tags/");
	this->set_method_handler("POST",
		std::bind(&TagsApiTagsResource::POST_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("GET",
		std::bind(&TagsApiTagsResource::GET_method_handler, this,
			std::placeholders::_1));
}

TagsApiTagsResource::~TagsApiTagsResource()
{
}

void TagsApiTagsResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Newly created tag object, including the new tag ID.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}

void TagsApiTagsResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");
			const int64_t groupId = request->get_query_parameter("groupId", 0L);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				std::shared_ptr<Inline_response_200_9> response = NULL;
				session->close(200, "List of tags.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				std::shared_ptr<std::string> response = NULL;
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}


TagsApiTagsTag_idResource::TagsApiTagsTag_idResource()
{
	this->set_path("/tags/{tag_id: .*}/");
	this->set_method_handler("DELETE",
		std::bind(&TagsApiTagsTag_idResource::DELETE_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("GET",
		std::bind(&TagsApiTagsTag_idResource::GET_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("PATCH",
		std::bind(&TagsApiTagsTag_idResource::PATCH_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("PUT",
		std::bind(&TagsApiTagsTag_idResource::PUT_method_handler, this,
			std::placeholders::_1));
}

TagsApiTagsTag_idResource::~TagsApiTagsTag_idResource()
{
}

void TagsApiTagsTag_idResource::DELETE_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			// Getting the path params
			const int64_t tagId = request->get_path_parameter("tagId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "Successfully deleted the tag. No response body is returned.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}

void TagsApiTagsTag_idResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			// Getting the path params
			const int64_t tagId = request->get_path_parameter("tagId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				std::shared_ptr<Tag> response = NULL;
				session->close(200, "The tag corresponding to tag_id.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				std::shared_ptr<std::string> response = NULL;
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

}
void TagsApiTagsTag_idResource::PATCH_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));

			// Getting the path params
			const int64_t tagId = request->get_path_parameter("tagId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				std::shared_ptr<Tag> response = NULL;
				session->close(200, "The updated tag data.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				std::shared_ptr<std::string> response = NULL;
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}
void TagsApiTagsTag_idResource::PUT_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));

			// Getting the path params
			const int64_t tagId = request->get_path_parameter("tagId", 0L);
			
			// Getting the query params
			const std::string accessToken = request->get_query_parameter("accessToken", "");

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				std::shared_ptr<Tag> response = NULL;
				session->close(200, "The updated tag data.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 0) {
				std::shared_ptr<std::string> response = NULL;
				session->close(0, "Unexpected error.", { {"Connection", "close"} });
				return;
			}

		});
}



}
}
}
}

