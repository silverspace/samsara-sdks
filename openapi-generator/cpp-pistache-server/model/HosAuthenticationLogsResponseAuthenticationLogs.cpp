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


#include "HosAuthenticationLogsResponse_authenticationLogs.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

HosAuthenticationLogsResponse_authenticationLogs::HosAuthenticationLogsResponse_authenticationLogs()
{
    m_ActionType = "";
    m_ActionTypeIsSet = false;
    m_Address = "";
    m_AddressIsSet = false;
    m_City = "";
    m_CityIsSet = false;
    m_HappenedAtMs = 0L;
    m_HappenedAtMsIsSet = false;
    m_AddressName = "";
    m_AddressNameIsSet = false;
    m_State = "";
    m_StateIsSet = false;
    
}

HosAuthenticationLogsResponse_authenticationLogs::~HosAuthenticationLogsResponse_authenticationLogs()
{
}

void HosAuthenticationLogsResponse_authenticationLogs::validate()
{
    // TODO: implement validation
}

nlohmann::json HosAuthenticationLogsResponse_authenticationLogs::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_ActionTypeIsSet)
    {
        val["actionType"] = ModelBase::toJson(m_ActionType);
    }
    if(m_AddressIsSet)
    {
        val["address"] = ModelBase::toJson(m_Address);
    }
    if(m_CityIsSet)
    {
        val["city"] = ModelBase::toJson(m_City);
    }
    if(m_HappenedAtMsIsSet)
    {
        val["happenedAtMs"] = m_HappenedAtMs;
    }
    if(m_AddressNameIsSet)
    {
        val["addressName"] = ModelBase::toJson(m_AddressName);
    }
    if(m_StateIsSet)
    {
        val["state"] = ModelBase::toJson(m_State);
    }
    

    return val;
}

void HosAuthenticationLogsResponse_authenticationLogs::fromJson(const nlohmann::json& val)
{
    if(val.find("actionType") != val.end())
    {
        setActionType(val.at("actionType"));
    }
    if(val.find("address") != val.end())
    {
        setAddress(val.at("address"));
    }
    if(val.find("city") != val.end())
    {
        setCity(val.at("city"));
    }
    if(val.find("happenedAtMs") != val.end())
    {
        setHappenedAtMs(val.at("happenedAtMs"));
    }
    if(val.find("addressName") != val.end())
    {
        setAddressName(val.at("addressName"));
    }
    if(val.find("state") != val.end())
    {
        setState(val.at("state"));
    }
    
}


std::string HosAuthenticationLogsResponse_authenticationLogs::getActionType() const
{
    return m_ActionType;
}
void HosAuthenticationLogsResponse_authenticationLogs::setActionType(std::string const& value)
{
    m_ActionType = value;
    m_ActionTypeIsSet = true;
}
bool HosAuthenticationLogsResponse_authenticationLogs::actionTypeIsSet() const
{
    return m_ActionTypeIsSet;
}
void HosAuthenticationLogsResponse_authenticationLogs::unsetActionType()
{
    m_ActionTypeIsSet = false;
}
std::string HosAuthenticationLogsResponse_authenticationLogs::getAddress() const
{
    return m_Address;
}
void HosAuthenticationLogsResponse_authenticationLogs::setAddress(std::string const& value)
{
    m_Address = value;
    m_AddressIsSet = true;
}
bool HosAuthenticationLogsResponse_authenticationLogs::addressIsSet() const
{
    return m_AddressIsSet;
}
void HosAuthenticationLogsResponse_authenticationLogs::unsetAddress()
{
    m_AddressIsSet = false;
}
std::string HosAuthenticationLogsResponse_authenticationLogs::getCity() const
{
    return m_City;
}
void HosAuthenticationLogsResponse_authenticationLogs::setCity(std::string const& value)
{
    m_City = value;
    m_CityIsSet = true;
}
bool HosAuthenticationLogsResponse_authenticationLogs::cityIsSet() const
{
    return m_CityIsSet;
}
void HosAuthenticationLogsResponse_authenticationLogs::unsetCity()
{
    m_CityIsSet = false;
}
int64_t HosAuthenticationLogsResponse_authenticationLogs::getHappenedAtMs() const
{
    return m_HappenedAtMs;
}
void HosAuthenticationLogsResponse_authenticationLogs::setHappenedAtMs(int64_t const value)
{
    m_HappenedAtMs = value;
    m_HappenedAtMsIsSet = true;
}
bool HosAuthenticationLogsResponse_authenticationLogs::happenedAtMsIsSet() const
{
    return m_HappenedAtMsIsSet;
}
void HosAuthenticationLogsResponse_authenticationLogs::unsetHappenedAtMs()
{
    m_HappenedAtMsIsSet = false;
}
std::string HosAuthenticationLogsResponse_authenticationLogs::getAddressName() const
{
    return m_AddressName;
}
void HosAuthenticationLogsResponse_authenticationLogs::setAddressName(std::string const& value)
{
    m_AddressName = value;
    m_AddressNameIsSet = true;
}
bool HosAuthenticationLogsResponse_authenticationLogs::addressNameIsSet() const
{
    return m_AddressNameIsSet;
}
void HosAuthenticationLogsResponse_authenticationLogs::unsetAddressName()
{
    m_AddressNameIsSet = false;
}
std::string HosAuthenticationLogsResponse_authenticationLogs::getState() const
{
    return m_State;
}
void HosAuthenticationLogsResponse_authenticationLogs::setState(std::string const& value)
{
    m_State = value;
    m_StateIsSet = true;
}
bool HosAuthenticationLogsResponse_authenticationLogs::stateIsSet() const
{
    return m_StateIsSet;
}
void HosAuthenticationLogsResponse_authenticationLogs::unsetState()
{
    m_StateIsSet = false;
}

}
}
}
}

