/**
* Samsara API
* # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

#include "TagsApi.h"
#include "Helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::helpers;
using namespace org::openapitools::server::model;

TagsApi::TagsApi(std::shared_ptr<Pistache::Rest::Router> rtr) { 
    router = rtr;
};

void TagsApi::init() {
    setupRoutes();
}

void TagsApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Post(*router, base + "/tags", Routes::bind(&TagsApi::create_tag_handler, this));
    Routes::Delete(*router, base + "/tags/:tag_id", Routes::bind(&TagsApi::delete_tag_by_id_handler, this));
    Routes::Get(*router, base + "/tags", Routes::bind(&TagsApi::get_all_tags_handler, this));
    Routes::Get(*router, base + "/tags/:tag_id", Routes::bind(&TagsApi::get_tag_by_id_handler, this));
    Routes::Patch(*router, base + "/tags/:tag_id", Routes::bind(&TagsApi::modify_tag_by_id_handler, this));
    Routes::Put(*router, base + "/tags/:tag_id", Routes::bind(&TagsApi::update_tag_by_id_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&TagsApi::tags_api_default_handler, this));
}

void TagsApi::create_tag_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the body param
    
    TagCreate tagCreateParams;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      tagCreateParams.fromJson(request_body);
    
      this->create_tag(accessToken, tagCreateParams, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void TagsApi::delete_tag_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto tagId = request.param(":tagId").as<int64_t>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      this->delete_tag_by_id(accessToken, tagId, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void TagsApi::get_all_tags_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    auto groupIdQuery = request.query().get("group_id");
    Pistache::Optional<int64_t> groupId;
    if(!groupIdQuery.isEmpty()){
        int64_t value;
        if(fromStringValue(groupIdQuery.get(), value)){
            groupId = Pistache::Some(value);
        }
    }
    
    try {
      this->get_all_tags(accessToken, groupId, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void TagsApi::get_tag_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto tagId = request.param(":tagId").as<int64_t>();
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      this->get_tag_by_id(accessToken, tagId, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void TagsApi::modify_tag_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto tagId = request.param(":tagId").as<int64_t>();
    
    // Getting the body param
    
    TagModify tagModifyParams;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      tagModifyParams.fromJson(request_body);
    
      this->modify_tag_by_id(accessToken, tagId, tagModifyParams, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}
void TagsApi::update_tag_by_id_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto tagId = request.param(":tagId").as<int64_t>();
    
    // Getting the body param
    
    TagUpdate updateTagParams;
    
    // Getting the query params
    auto accessTokenQuery = request.query().get("access_token");
    Pistache::Optional<std::string> accessToken;
    if(!accessTokenQuery.isEmpty()){
        std::string value;
        if(fromStringValue(accessTokenQuery.get(), value)){
            accessToken = Pistache::Some(value);
        }
    }
    
    try {
      nlohmann::json request_body = nlohmann::json::parse(request.body());
    
      updateTagParams.fromJson(request_body);
    
      this->update_tag_by_id(accessToken, tagId, updateTagParams, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}

void TagsApi::tags_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    response.send(Pistache::Http::Code::Not_Found, "The requested method does not exist");
}

}
}
}
}

