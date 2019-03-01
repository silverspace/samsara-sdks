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


#include "DriverDailyLogResponse_days.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

DriverDailyLogResponse_days::DriverDailyLogResponse_days()
{
    m_CertifiedAtMs = 0L;
    m_CertifiedAtMsIsSet = false;
    m_EndMs = 0;
    m_EndMsIsSet = false;
    m_StartMs = 0;
    m_StartMsIsSet = false;
    m_TrailerIdsIsSet = false;
    m_ActiveHours = 0.0;
    m_ActiveHoursIsSet = false;
    m_DistanceMiles = 0.0;
    m_DistanceMilesIsSet = false;
    m_ActiveMs = 0L;
    m_ActiveMsIsSet = false;
    m_Certified = false;
    m_CertifiedIsSet = false;
    m_VehicleIdsIsSet = false;
    
}

DriverDailyLogResponse_days::~DriverDailyLogResponse_days()
{
}

void DriverDailyLogResponse_days::validate()
{
    // TODO: implement validation
}

nlohmann::json DriverDailyLogResponse_days::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_CertifiedAtMsIsSet)
    {
        val["certifiedAtMs"] = m_CertifiedAtMs;
    }
    if(m_EndMsIsSet)
    {
        val["endMs"] = m_EndMs;
    }
    if(m_StartMsIsSet)
    {
        val["startMs"] = m_StartMs;
    }
    if(m_TrailerIdsIsSet)
    {
        val["trailerIds"] = ModelBase::toJson(m_TrailerIds);
    }
    if(m_ActiveHoursIsSet)
    {
        val["activeHours"] = m_ActiveHours;
    }
    if(m_DistanceMilesIsSet)
    {
        val["distanceMiles"] = m_DistanceMiles;
    }
    if(m_ActiveMsIsSet)
    {
        val["activeMs"] = m_ActiveMs;
    }
    if(m_CertifiedIsSet)
    {
        val["certified"] = m_Certified;
    }
    if(m_VehicleIdsIsSet)
    {
        val["vehicleIds"] = ModelBase::toJson(m_VehicleIds);
    }
    

    return val;
}

void DriverDailyLogResponse_days::fromJson(const nlohmann::json& val)
{
    if(val.find("certifiedAtMs") != val.end())
    {
        setCertifiedAtMs(val.at("certifiedAtMs"));
    }
    if(val.find("endMs") != val.end())
    {
        setEndMs(val.at("endMs"));
    }
    if(val.find("startMs") != val.end())
    {
        setStartMs(val.at("startMs"));
    }
    if(val.find("trailerIds") != val.end())
    {
        if(!val["trailerIds"].is_null())
        {
            Object newItem;
            newItem.fromJson(val["trailerIds"]);
            setTrailerIds( newItem );
        }
        
    }
    if(val.find("activeHours") != val.end())
    {
        setActiveHours(val.at("activeHours"));
    }
    if(val.find("distanceMiles") != val.end())
    {
        setDistanceMiles(val.at("distanceMiles"));
    }
    if(val.find("activeMs") != val.end())
    {
        setActiveMs(val.at("activeMs"));
    }
    if(val.find("certified") != val.end())
    {
        setCertified(val.at("certified"));
    }
    if(val.find("vehicleIds") != val.end())
    {
        if(!val["vehicleIds"].is_null())
        {
            Object newItem;
            newItem.fromJson(val["vehicleIds"]);
            setVehicleIds( newItem );
        }
        
    }
    
}


int64_t DriverDailyLogResponse_days::getCertifiedAtMs() const
{
    return m_CertifiedAtMs;
}
void DriverDailyLogResponse_days::setCertifiedAtMs(int64_t const value)
{
    m_CertifiedAtMs = value;
    m_CertifiedAtMsIsSet = true;
}
bool DriverDailyLogResponse_days::certifiedAtMsIsSet() const
{
    return m_CertifiedAtMsIsSet;
}
void DriverDailyLogResponse_days::unsetCertifiedAtMs()
{
    m_CertifiedAtMsIsSet = false;
}
int32_t DriverDailyLogResponse_days::getEndMs() const
{
    return m_EndMs;
}
void DriverDailyLogResponse_days::setEndMs(int32_t const value)
{
    m_EndMs = value;
    m_EndMsIsSet = true;
}
bool DriverDailyLogResponse_days::endMsIsSet() const
{
    return m_EndMsIsSet;
}
void DriverDailyLogResponse_days::unsetEndMs()
{
    m_EndMsIsSet = false;
}
int32_t DriverDailyLogResponse_days::getStartMs() const
{
    return m_StartMs;
}
void DriverDailyLogResponse_days::setStartMs(int32_t const value)
{
    m_StartMs = value;
    m_StartMsIsSet = true;
}
bool DriverDailyLogResponse_days::startMsIsSet() const
{
    return m_StartMsIsSet;
}
void DriverDailyLogResponse_days::unsetStartMs()
{
    m_StartMsIsSet = false;
}
Object DriverDailyLogResponse_days::getTrailerIds() const
{
    return m_TrailerIds;
}
void DriverDailyLogResponse_days::setTrailerIds(Object const& value)
{
    m_TrailerIds = value;
    m_TrailerIdsIsSet = true;
}
bool DriverDailyLogResponse_days::trailerIdsIsSet() const
{
    return m_TrailerIdsIsSet;
}
void DriverDailyLogResponse_days::unsetTrailerIds()
{
    m_TrailerIdsIsSet = false;
}
double DriverDailyLogResponse_days::getActiveHours() const
{
    return m_ActiveHours;
}
void DriverDailyLogResponse_days::setActiveHours(double const value)
{
    m_ActiveHours = value;
    m_ActiveHoursIsSet = true;
}
bool DriverDailyLogResponse_days::activeHoursIsSet() const
{
    return m_ActiveHoursIsSet;
}
void DriverDailyLogResponse_days::unsetActiveHours()
{
    m_ActiveHoursIsSet = false;
}
double DriverDailyLogResponse_days::getDistanceMiles() const
{
    return m_DistanceMiles;
}
void DriverDailyLogResponse_days::setDistanceMiles(double const value)
{
    m_DistanceMiles = value;
    m_DistanceMilesIsSet = true;
}
bool DriverDailyLogResponse_days::distanceMilesIsSet() const
{
    return m_DistanceMilesIsSet;
}
void DriverDailyLogResponse_days::unsetDistanceMiles()
{
    m_DistanceMilesIsSet = false;
}
int64_t DriverDailyLogResponse_days::getActiveMs() const
{
    return m_ActiveMs;
}
void DriverDailyLogResponse_days::setActiveMs(int64_t const value)
{
    m_ActiveMs = value;
    m_ActiveMsIsSet = true;
}
bool DriverDailyLogResponse_days::activeMsIsSet() const
{
    return m_ActiveMsIsSet;
}
void DriverDailyLogResponse_days::unsetActiveMs()
{
    m_ActiveMsIsSet = false;
}
bool DriverDailyLogResponse_days::isCertified() const
{
    return m_Certified;
}
void DriverDailyLogResponse_days::setCertified(bool const value)
{
    m_Certified = value;
    m_CertifiedIsSet = true;
}
bool DriverDailyLogResponse_days::certifiedIsSet() const
{
    return m_CertifiedIsSet;
}
void DriverDailyLogResponse_days::unsetCertified()
{
    m_CertifiedIsSet = false;
}
Object DriverDailyLogResponse_days::getVehicleIds() const
{
    return m_VehicleIds;
}
void DriverDailyLogResponse_days::setVehicleIds(Object const& value)
{
    m_VehicleIds = value;
    m_VehicleIdsIsSet = true;
}
bool DriverDailyLogResponse_days::vehicleIdsIsSet() const
{
    return m_VehicleIdsIsSet;
}
void DriverDailyLogResponse_days::unsetVehicleIds()
{
    m_VehicleIdsIsSet = false;
}

}
}
}
}

