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


#include "HosLogsResponse_logs.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

HosLogsResponse_logs::HosLogsResponse_logs()
{
    m_LocLng = 0.0;
    m_LocLngIsSet = false;
    m_LogStartMs = 0L;
    m_LogStartMsIsSet = false;
    m_DriverId = 0L;
    m_DriverIdIsSet = false;
    m_StatusType = "";
    m_StatusTypeIsSet = false;
    m_LocCity = "";
    m_LocCityIsSet = false;
    m_GroupId = 0L;
    m_GroupIdIsSet = false;
    m_LocName = "";
    m_LocNameIsSet = false;
    m_LocLat = 0.0;
    m_LocLatIsSet = false;
    m_Remark = "";
    m_RemarkIsSet = false;
    m_LocState = "";
    m_LocStateIsSet = false;
    m_VehicleId = 0L;
    m_VehicleIdIsSet = false;
    m_CodriverIdsIsSet = false;
    
}

HosLogsResponse_logs::~HosLogsResponse_logs()
{
}

void HosLogsResponse_logs::validate()
{
    // TODO: implement validation
}

nlohmann::json HosLogsResponse_logs::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_LocLngIsSet)
    {
        val["locLng"] = m_LocLng;
    }
    if(m_LogStartMsIsSet)
    {
        val["logStartMs"] = m_LogStartMs;
    }
    if(m_DriverIdIsSet)
    {
        val["driverId"] = m_DriverId;
    }
    if(m_StatusTypeIsSet)
    {
        val["statusType"] = ModelBase::toJson(m_StatusType);
    }
    if(m_LocCityIsSet)
    {
        val["locCity"] = ModelBase::toJson(m_LocCity);
    }
    if(m_GroupIdIsSet)
    {
        val["groupId"] = m_GroupId;
    }
    if(m_LocNameIsSet)
    {
        val["locName"] = ModelBase::toJson(m_LocName);
    }
    if(m_LocLatIsSet)
    {
        val["locLat"] = m_LocLat;
    }
    if(m_RemarkIsSet)
    {
        val["remark"] = ModelBase::toJson(m_Remark);
    }
    if(m_LocStateIsSet)
    {
        val["locState"] = ModelBase::toJson(m_LocState);
    }
    if(m_VehicleIdIsSet)
    {
        val["vehicleId"] = m_VehicleId;
    }
    {
        nlohmann::json jsonArray;
        for( const auto& item : m_CodriverIds )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val["codriverIds"] = jsonArray;
        } 
    }
    

    return val;
}

void HosLogsResponse_logs::fromJson(const nlohmann::json& val)
{
    if(val.find("locLng") != val.end())
    {
        setLocLng(val.at("locLng"));
    }
    if(val.find("logStartMs") != val.end())
    {
        setLogStartMs(val.at("logStartMs"));
    }
    if(val.find("driverId") != val.end())
    {
        setDriverId(val.at("driverId"));
    }
    if(val.find("statusType") != val.end())
    {
        setStatusType(val.at("statusType"));
    }
    if(val.find("locCity") != val.end())
    {
        setLocCity(val.at("locCity"));
    }
    if(val.find("groupId") != val.end())
    {
        setGroupId(val.at("groupId"));
    }
    if(val.find("locName") != val.end())
    {
        setLocName(val.at("locName"));
    }
    if(val.find("locLat") != val.end())
    {
        setLocLat(val.at("locLat"));
    }
    if(val.find("remark") != val.end())
    {
        setRemark(val.at("remark"));
    }
    if(val.find("locState") != val.end())
    {
        setLocState(val.at("locState"));
    }
    if(val.find("vehicleId") != val.end())
    {
        setVehicleId(val.at("vehicleId"));
    }
    {
        m_CodriverIds.clear();
        if(val.find("codriverIds") != val.end())
        {
            for( const auto& item : val["codriverIds"] )
            {
                m_CodriverIds.push_back(item);
                
            }
        }
    }
    
}


double HosLogsResponse_logs::getLocLng() const
{
    return m_LocLng;
}
void HosLogsResponse_logs::setLocLng(double const value)
{
    m_LocLng = value;
    m_LocLngIsSet = true;
}
bool HosLogsResponse_logs::locLngIsSet() const
{
    return m_LocLngIsSet;
}
void HosLogsResponse_logs::unsetLocLng()
{
    m_LocLngIsSet = false;
}
int64_t HosLogsResponse_logs::getLogStartMs() const
{
    return m_LogStartMs;
}
void HosLogsResponse_logs::setLogStartMs(int64_t const value)
{
    m_LogStartMs = value;
    m_LogStartMsIsSet = true;
}
bool HosLogsResponse_logs::logStartMsIsSet() const
{
    return m_LogStartMsIsSet;
}
void HosLogsResponse_logs::unsetLogStartMs()
{
    m_LogStartMsIsSet = false;
}
int64_t HosLogsResponse_logs::getDriverId() const
{
    return m_DriverId;
}
void HosLogsResponse_logs::setDriverId(int64_t const value)
{
    m_DriverId = value;
    m_DriverIdIsSet = true;
}
bool HosLogsResponse_logs::driverIdIsSet() const
{
    return m_DriverIdIsSet;
}
void HosLogsResponse_logs::unsetDriverId()
{
    m_DriverIdIsSet = false;
}
std::string HosLogsResponse_logs::getStatusType() const
{
    return m_StatusType;
}
void HosLogsResponse_logs::setStatusType(std::string const& value)
{
    m_StatusType = value;
    m_StatusTypeIsSet = true;
}
bool HosLogsResponse_logs::statusTypeIsSet() const
{
    return m_StatusTypeIsSet;
}
void HosLogsResponse_logs::unsetStatusType()
{
    m_StatusTypeIsSet = false;
}
std::string HosLogsResponse_logs::getLocCity() const
{
    return m_LocCity;
}
void HosLogsResponse_logs::setLocCity(std::string const& value)
{
    m_LocCity = value;
    m_LocCityIsSet = true;
}
bool HosLogsResponse_logs::locCityIsSet() const
{
    return m_LocCityIsSet;
}
void HosLogsResponse_logs::unsetLocCity()
{
    m_LocCityIsSet = false;
}
int64_t HosLogsResponse_logs::getGroupId() const
{
    return m_GroupId;
}
void HosLogsResponse_logs::setGroupId(int64_t const value)
{
    m_GroupId = value;
    m_GroupIdIsSet = true;
}
bool HosLogsResponse_logs::groupIdIsSet() const
{
    return m_GroupIdIsSet;
}
void HosLogsResponse_logs::unsetGroupId()
{
    m_GroupIdIsSet = false;
}
std::string HosLogsResponse_logs::getLocName() const
{
    return m_LocName;
}
void HosLogsResponse_logs::setLocName(std::string const& value)
{
    m_LocName = value;
    m_LocNameIsSet = true;
}
bool HosLogsResponse_logs::locNameIsSet() const
{
    return m_LocNameIsSet;
}
void HosLogsResponse_logs::unsetLocName()
{
    m_LocNameIsSet = false;
}
double HosLogsResponse_logs::getLocLat() const
{
    return m_LocLat;
}
void HosLogsResponse_logs::setLocLat(double const value)
{
    m_LocLat = value;
    m_LocLatIsSet = true;
}
bool HosLogsResponse_logs::locLatIsSet() const
{
    return m_LocLatIsSet;
}
void HosLogsResponse_logs::unsetLocLat()
{
    m_LocLatIsSet = false;
}
std::string HosLogsResponse_logs::getRemark() const
{
    return m_Remark;
}
void HosLogsResponse_logs::setRemark(std::string const& value)
{
    m_Remark = value;
    m_RemarkIsSet = true;
}
bool HosLogsResponse_logs::remarkIsSet() const
{
    return m_RemarkIsSet;
}
void HosLogsResponse_logs::unsetRemark()
{
    m_RemarkIsSet = false;
}
std::string HosLogsResponse_logs::getLocState() const
{
    return m_LocState;
}
void HosLogsResponse_logs::setLocState(std::string const& value)
{
    m_LocState = value;
    m_LocStateIsSet = true;
}
bool HosLogsResponse_logs::locStateIsSet() const
{
    return m_LocStateIsSet;
}
void HosLogsResponse_logs::unsetLocState()
{
    m_LocStateIsSet = false;
}
int64_t HosLogsResponse_logs::getVehicleId() const
{
    return m_VehicleId;
}
void HosLogsResponse_logs::setVehicleId(int64_t const value)
{
    m_VehicleId = value;
    m_VehicleIdIsSet = true;
}
bool HosLogsResponse_logs::vehicleIdIsSet() const
{
    return m_VehicleIdIsSet;
}
void HosLogsResponse_logs::unsetVehicleId()
{
    m_VehicleIdIsSet = false;
}
std::vector<int64_t>& HosLogsResponse_logs::getCodriverIds()
{
    return m_CodriverIds;
}
bool HosLogsResponse_logs::codriverIdsIsSet() const
{
    return m_CodriverIdsIsSet;
}
void HosLogsResponse_logs::unsetCodriverIds()
{
    m_CodriverIdsIsSet = false;
}

}
}
}
}

