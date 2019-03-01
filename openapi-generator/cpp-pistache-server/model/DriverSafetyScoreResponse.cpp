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


#include "DriverSafetyScoreResponse.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

DriverSafetyScoreResponse::DriverSafetyScoreResponse()
{
    m_CrashCount = 0;
    m_CrashCountIsSet = false;
    m_DriverId = 0;
    m_DriverIdIsSet = false;
    m_HarshAccelCount = 0;
    m_HarshAccelCountIsSet = false;
    m_HarshBrakingCount = 0;
    m_HarshBrakingCountIsSet = false;
    m_HarshEventsIsSet = false;
    m_HarshTurningCount = 0;
    m_HarshTurningCountIsSet = false;
    m_SafetyScore = 0;
    m_SafetyScoreIsSet = false;
    m_SafetyScoreRank = "";
    m_SafetyScoreRankIsSet = false;
    m_TimeOverSpeedLimitMs = 0;
    m_TimeOverSpeedLimitMsIsSet = false;
    m_TotalDistanceDrivenMeters = 0;
    m_TotalDistanceDrivenMetersIsSet = false;
    m_TotalHarshEventCount = 0;
    m_TotalHarshEventCountIsSet = false;
    m_TotalTimeDrivenMs = 0;
    m_TotalTimeDrivenMsIsSet = false;
    
}

DriverSafetyScoreResponse::~DriverSafetyScoreResponse()
{
}

void DriverSafetyScoreResponse::validate()
{
    // TODO: implement validation
}

nlohmann::json DriverSafetyScoreResponse::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_CrashCountIsSet)
    {
        val["crashCount"] = m_CrashCount;
    }
    if(m_DriverIdIsSet)
    {
        val["driverId"] = m_DriverId;
    }
    if(m_HarshAccelCountIsSet)
    {
        val["harshAccelCount"] = m_HarshAccelCount;
    }
    if(m_HarshBrakingCountIsSet)
    {
        val["harshBrakingCount"] = m_HarshBrakingCount;
    }
    {
        nlohmann::json jsonArray;
        for( const auto& item : m_HarshEvents )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val["harshEvents"] = jsonArray;
        } 
    }
    if(m_HarshTurningCountIsSet)
    {
        val["harshTurningCount"] = m_HarshTurningCount;
    }
    if(m_SafetyScoreIsSet)
    {
        val["safetyScore"] = m_SafetyScore;
    }
    if(m_SafetyScoreRankIsSet)
    {
        val["safetyScoreRank"] = ModelBase::toJson(m_SafetyScoreRank);
    }
    if(m_TimeOverSpeedLimitMsIsSet)
    {
        val["timeOverSpeedLimitMs"] = m_TimeOverSpeedLimitMs;
    }
    if(m_TotalDistanceDrivenMetersIsSet)
    {
        val["totalDistanceDrivenMeters"] = m_TotalDistanceDrivenMeters;
    }
    if(m_TotalHarshEventCountIsSet)
    {
        val["totalHarshEventCount"] = m_TotalHarshEventCount;
    }
    if(m_TotalTimeDrivenMsIsSet)
    {
        val["totalTimeDrivenMs"] = m_TotalTimeDrivenMs;
    }
    

    return val;
}

void DriverSafetyScoreResponse::fromJson(const nlohmann::json& val)
{
    if(val.find("crashCount") != val.end())
    {
        setCrashCount(val.at("crashCount"));
    }
    if(val.find("driverId") != val.end())
    {
        setDriverId(val.at("driverId"));
    }
    if(val.find("harshAccelCount") != val.end())
    {
        setHarshAccelCount(val.at("harshAccelCount"));
    }
    if(val.find("harshBrakingCount") != val.end())
    {
        setHarshBrakingCount(val.at("harshBrakingCount"));
    }
    {
        m_HarshEvents.clear();
        if(val.find("harshEvents") != val.end())
        {
            for( const auto& item : val["harshEvents"] )
            {
                
                if(item.is_null())
                {
                    m_HarshEvents.push_back( SafetyReportHarshEvent() );
                }
                else
                {
                    SafetyReportHarshEvent newItem;
                    newItem.fromJson(item);
                    m_HarshEvents.push_back( newItem );
                }
                
            }
        }
    }
    if(val.find("harshTurningCount") != val.end())
    {
        setHarshTurningCount(val.at("harshTurningCount"));
    }
    if(val.find("safetyScore") != val.end())
    {
        setSafetyScore(val.at("safetyScore"));
    }
    if(val.find("safetyScoreRank") != val.end())
    {
        setSafetyScoreRank(val.at("safetyScoreRank"));
    }
    if(val.find("timeOverSpeedLimitMs") != val.end())
    {
        setTimeOverSpeedLimitMs(val.at("timeOverSpeedLimitMs"));
    }
    if(val.find("totalDistanceDrivenMeters") != val.end())
    {
        setTotalDistanceDrivenMeters(val.at("totalDistanceDrivenMeters"));
    }
    if(val.find("totalHarshEventCount") != val.end())
    {
        setTotalHarshEventCount(val.at("totalHarshEventCount"));
    }
    if(val.find("totalTimeDrivenMs") != val.end())
    {
        setTotalTimeDrivenMs(val.at("totalTimeDrivenMs"));
    }
    
}


int32_t DriverSafetyScoreResponse::getCrashCount() const
{
    return m_CrashCount;
}
void DriverSafetyScoreResponse::setCrashCount(int32_t const value)
{
    m_CrashCount = value;
    m_CrashCountIsSet = true;
}
bool DriverSafetyScoreResponse::crashCountIsSet() const
{
    return m_CrashCountIsSet;
}
void DriverSafetyScoreResponse::unsetCrashCount()
{
    m_CrashCountIsSet = false;
}
int32_t DriverSafetyScoreResponse::getDriverId() const
{
    return m_DriverId;
}
void DriverSafetyScoreResponse::setDriverId(int32_t const value)
{
    m_DriverId = value;
    m_DriverIdIsSet = true;
}
bool DriverSafetyScoreResponse::driverIdIsSet() const
{
    return m_DriverIdIsSet;
}
void DriverSafetyScoreResponse::unsetDriverId()
{
    m_DriverIdIsSet = false;
}
int32_t DriverSafetyScoreResponse::getHarshAccelCount() const
{
    return m_HarshAccelCount;
}
void DriverSafetyScoreResponse::setHarshAccelCount(int32_t const value)
{
    m_HarshAccelCount = value;
    m_HarshAccelCountIsSet = true;
}
bool DriverSafetyScoreResponse::harshAccelCountIsSet() const
{
    return m_HarshAccelCountIsSet;
}
void DriverSafetyScoreResponse::unsetHarshAccelCount()
{
    m_HarshAccelCountIsSet = false;
}
int32_t DriverSafetyScoreResponse::getHarshBrakingCount() const
{
    return m_HarshBrakingCount;
}
void DriverSafetyScoreResponse::setHarshBrakingCount(int32_t const value)
{
    m_HarshBrakingCount = value;
    m_HarshBrakingCountIsSet = true;
}
bool DriverSafetyScoreResponse::harshBrakingCountIsSet() const
{
    return m_HarshBrakingCountIsSet;
}
void DriverSafetyScoreResponse::unsetHarshBrakingCount()
{
    m_HarshBrakingCountIsSet = false;
}
std::vector<SafetyReportHarshEvent>& DriverSafetyScoreResponse::getHarshEvents()
{
    return m_HarshEvents;
}
bool DriverSafetyScoreResponse::harshEventsIsSet() const
{
    return m_HarshEventsIsSet;
}
void DriverSafetyScoreResponse::unsetHarshEvents()
{
    m_HarshEventsIsSet = false;
}
int32_t DriverSafetyScoreResponse::getHarshTurningCount() const
{
    return m_HarshTurningCount;
}
void DriverSafetyScoreResponse::setHarshTurningCount(int32_t const value)
{
    m_HarshTurningCount = value;
    m_HarshTurningCountIsSet = true;
}
bool DriverSafetyScoreResponse::harshTurningCountIsSet() const
{
    return m_HarshTurningCountIsSet;
}
void DriverSafetyScoreResponse::unsetHarshTurningCount()
{
    m_HarshTurningCountIsSet = false;
}
int32_t DriverSafetyScoreResponse::getSafetyScore() const
{
    return m_SafetyScore;
}
void DriverSafetyScoreResponse::setSafetyScore(int32_t const value)
{
    m_SafetyScore = value;
    m_SafetyScoreIsSet = true;
}
bool DriverSafetyScoreResponse::safetyScoreIsSet() const
{
    return m_SafetyScoreIsSet;
}
void DriverSafetyScoreResponse::unsetSafetyScore()
{
    m_SafetyScoreIsSet = false;
}
std::string DriverSafetyScoreResponse::getSafetyScoreRank() const
{
    return m_SafetyScoreRank;
}
void DriverSafetyScoreResponse::setSafetyScoreRank(std::string const& value)
{
    m_SafetyScoreRank = value;
    m_SafetyScoreRankIsSet = true;
}
bool DriverSafetyScoreResponse::safetyScoreRankIsSet() const
{
    return m_SafetyScoreRankIsSet;
}
void DriverSafetyScoreResponse::unsetSafetyScoreRank()
{
    m_SafetyScoreRankIsSet = false;
}
int32_t DriverSafetyScoreResponse::getTimeOverSpeedLimitMs() const
{
    return m_TimeOverSpeedLimitMs;
}
void DriverSafetyScoreResponse::setTimeOverSpeedLimitMs(int32_t const value)
{
    m_TimeOverSpeedLimitMs = value;
    m_TimeOverSpeedLimitMsIsSet = true;
}
bool DriverSafetyScoreResponse::timeOverSpeedLimitMsIsSet() const
{
    return m_TimeOverSpeedLimitMsIsSet;
}
void DriverSafetyScoreResponse::unsetTimeOverSpeedLimitMs()
{
    m_TimeOverSpeedLimitMsIsSet = false;
}
int32_t DriverSafetyScoreResponse::getTotalDistanceDrivenMeters() const
{
    return m_TotalDistanceDrivenMeters;
}
void DriverSafetyScoreResponse::setTotalDistanceDrivenMeters(int32_t const value)
{
    m_TotalDistanceDrivenMeters = value;
    m_TotalDistanceDrivenMetersIsSet = true;
}
bool DriverSafetyScoreResponse::totalDistanceDrivenMetersIsSet() const
{
    return m_TotalDistanceDrivenMetersIsSet;
}
void DriverSafetyScoreResponse::unsetTotalDistanceDrivenMeters()
{
    m_TotalDistanceDrivenMetersIsSet = false;
}
int32_t DriverSafetyScoreResponse::getTotalHarshEventCount() const
{
    return m_TotalHarshEventCount;
}
void DriverSafetyScoreResponse::setTotalHarshEventCount(int32_t const value)
{
    m_TotalHarshEventCount = value;
    m_TotalHarshEventCountIsSet = true;
}
bool DriverSafetyScoreResponse::totalHarshEventCountIsSet() const
{
    return m_TotalHarshEventCountIsSet;
}
void DriverSafetyScoreResponse::unsetTotalHarshEventCount()
{
    m_TotalHarshEventCountIsSet = false;
}
int32_t DriverSafetyScoreResponse::getTotalTimeDrivenMs() const
{
    return m_TotalTimeDrivenMs;
}
void DriverSafetyScoreResponse::setTotalTimeDrivenMs(int32_t const value)
{
    m_TotalTimeDrivenMs = value;
    m_TotalTimeDrivenMsIsSet = true;
}
bool DriverSafetyScoreResponse::totalTimeDrivenMsIsSet() const
{
    return m_TotalTimeDrivenMsIsSet;
}
void DriverSafetyScoreResponse::unsetTotalTimeDrivenMs()
{
    m_TotalTimeDrivenMsIsSet = false;
}

}
}
}
}

