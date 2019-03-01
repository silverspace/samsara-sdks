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


#include "DispatchRouteCreate.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

DispatchRouteCreate::DispatchRouteCreate()
{
    m_Actual_end_ms = 0L;
    m_Actual_end_msIsSet = false;
    m_Actual_start_ms = 0L;
    m_Actual_start_msIsSet = false;
    m_Driver_id = 0L;
    m_Driver_idIsSet = false;
    m_Group_id = 0L;
    m_Group_idIsSet = false;
    m_Name = "";
    m_Scheduled_end_ms = 0L;
    m_Scheduled_meters = 0L;
    m_Scheduled_metersIsSet = false;
    m_Scheduled_start_ms = 0L;
    m_Start_location_address = "";
    m_Start_location_addressIsSet = false;
    m_Start_location_address_id = 0L;
    m_Start_location_address_idIsSet = false;
    m_Start_location_lat = 0.0;
    m_Start_location_latIsSet = false;
    m_Start_location_lng = 0.0;
    m_Start_location_lngIsSet = false;
    m_Start_location_name = "";
    m_Start_location_nameIsSet = false;
    m_Trailer_id = 0L;
    m_Trailer_idIsSet = false;
    m_Vehicle_id = 0L;
    m_Vehicle_idIsSet = false;
    
}

DispatchRouteCreate::~DispatchRouteCreate()
{
}

void DispatchRouteCreate::validate()
{
    // TODO: implement validation
}

nlohmann::json DispatchRouteCreate::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Actual_end_msIsSet)
    {
        val["actual_end_ms"] = m_Actual_end_ms;
    }
    if(m_Actual_start_msIsSet)
    {
        val["actual_start_ms"] = m_Actual_start_ms;
    }
    if(m_Driver_idIsSet)
    {
        val["driver_id"] = m_Driver_id;
    }
    if(m_Group_idIsSet)
    {
        val["group_id"] = m_Group_id;
    }
    val["name"] = ModelBase::toJson(m_Name);
    val["scheduled_end_ms"] = m_Scheduled_end_ms;
    if(m_Scheduled_metersIsSet)
    {
        val["scheduled_meters"] = m_Scheduled_meters;
    }
    val["scheduled_start_ms"] = m_Scheduled_start_ms;
    if(m_Start_location_addressIsSet)
    {
        val["start_location_address"] = ModelBase::toJson(m_Start_location_address);
    }
    if(m_Start_location_address_idIsSet)
    {
        val["start_location_address_id"] = m_Start_location_address_id;
    }
    if(m_Start_location_latIsSet)
    {
        val["start_location_lat"] = m_Start_location_lat;
    }
    if(m_Start_location_lngIsSet)
    {
        val["start_location_lng"] = m_Start_location_lng;
    }
    if(m_Start_location_nameIsSet)
    {
        val["start_location_name"] = ModelBase::toJson(m_Start_location_name);
    }
    if(m_Trailer_idIsSet)
    {
        val["trailer_id"] = m_Trailer_id;
    }
    if(m_Vehicle_idIsSet)
    {
        val["vehicle_id"] = m_Vehicle_id;
    }
    {
        nlohmann::json jsonArray;
        for( const auto& item : m_Dispatch_jobs )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        val["dispatch_jobs"] = jsonArray;
        
    }
    

    return val;
}

void DispatchRouteCreate::fromJson(const nlohmann::json& val)
{
    if(val.find("actual_end_ms") != val.end())
    {
        setActualEndMs(val.at("actual_end_ms"));
    }
    if(val.find("actual_start_ms") != val.end())
    {
        setActualStartMs(val.at("actual_start_ms"));
    }
    if(val.find("driver_id") != val.end())
    {
        setDriverId(val.at("driver_id"));
    }
    if(val.find("group_id") != val.end())
    {
        setGroupId(val.at("group_id"));
    }
    setName(val.at("name"));
    setScheduledEndMs(val.at("scheduled_end_ms"));
    if(val.find("scheduled_meters") != val.end())
    {
        setScheduledMeters(val.at("scheduled_meters"));
    }
    setScheduledStartMs(val.at("scheduled_start_ms"));
    if(val.find("start_location_address") != val.end())
    {
        setStartLocationAddress(val.at("start_location_address"));
    }
    if(val.find("start_location_address_id") != val.end())
    {
        setStartLocationAddressId(val.at("start_location_address_id"));
    }
    if(val.find("start_location_lat") != val.end())
    {
        setStartLocationLat(val.at("start_location_lat"));
    }
    if(val.find("start_location_lng") != val.end())
    {
        setStartLocationLng(val.at("start_location_lng"));
    }
    if(val.find("start_location_name") != val.end())
    {
        setStartLocationName(val.at("start_location_name"));
    }
    if(val.find("trailer_id") != val.end())
    {
        setTrailerId(val.at("trailer_id"));
    }
    if(val.find("vehicle_id") != val.end())
    {
        setVehicleId(val.at("vehicle_id"));
    }
    {
        m_Dispatch_jobs.clear();
                    for( const auto& item : val["dispatch_jobs"] )
            {
                
                if(item.is_null())
                {
                    m_Dispatch_jobs.push_back( DispatchJobCreate() );
                }
                else
                {
                    DispatchJobCreate newItem;
                    newItem.fromJson(item);
                    m_Dispatch_jobs.push_back( newItem );
                }
                
            }
    }
    
}


int64_t DispatchRouteCreate::getActualEndMs() const
{
    return m_Actual_end_ms;
}
void DispatchRouteCreate::setActualEndMs(int64_t const value)
{
    m_Actual_end_ms = value;
    m_Actual_end_msIsSet = true;
}
bool DispatchRouteCreate::actualEndMsIsSet() const
{
    return m_Actual_end_msIsSet;
}
void DispatchRouteCreate::unsetActual_end_ms()
{
    m_Actual_end_msIsSet = false;
}
int64_t DispatchRouteCreate::getActualStartMs() const
{
    return m_Actual_start_ms;
}
void DispatchRouteCreate::setActualStartMs(int64_t const value)
{
    m_Actual_start_ms = value;
    m_Actual_start_msIsSet = true;
}
bool DispatchRouteCreate::actualStartMsIsSet() const
{
    return m_Actual_start_msIsSet;
}
void DispatchRouteCreate::unsetActual_start_ms()
{
    m_Actual_start_msIsSet = false;
}
int64_t DispatchRouteCreate::getDriverId() const
{
    return m_Driver_id;
}
void DispatchRouteCreate::setDriverId(int64_t const value)
{
    m_Driver_id = value;
    m_Driver_idIsSet = true;
}
bool DispatchRouteCreate::driverIdIsSet() const
{
    return m_Driver_idIsSet;
}
void DispatchRouteCreate::unsetDriver_id()
{
    m_Driver_idIsSet = false;
}
int64_t DispatchRouteCreate::getGroupId() const
{
    return m_Group_id;
}
void DispatchRouteCreate::setGroupId(int64_t const value)
{
    m_Group_id = value;
    m_Group_idIsSet = true;
}
bool DispatchRouteCreate::groupIdIsSet() const
{
    return m_Group_idIsSet;
}
void DispatchRouteCreate::unsetGroup_id()
{
    m_Group_idIsSet = false;
}
std::string DispatchRouteCreate::getName() const
{
    return m_Name;
}
void DispatchRouteCreate::setName(std::string const& value)
{
    m_Name = value;
    
}
int64_t DispatchRouteCreate::getScheduledEndMs() const
{
    return m_Scheduled_end_ms;
}
void DispatchRouteCreate::setScheduledEndMs(int64_t const value)
{
    m_Scheduled_end_ms = value;
    
}
int64_t DispatchRouteCreate::getScheduledMeters() const
{
    return m_Scheduled_meters;
}
void DispatchRouteCreate::setScheduledMeters(int64_t const value)
{
    m_Scheduled_meters = value;
    m_Scheduled_metersIsSet = true;
}
bool DispatchRouteCreate::scheduledMetersIsSet() const
{
    return m_Scheduled_metersIsSet;
}
void DispatchRouteCreate::unsetScheduled_meters()
{
    m_Scheduled_metersIsSet = false;
}
int64_t DispatchRouteCreate::getScheduledStartMs() const
{
    return m_Scheduled_start_ms;
}
void DispatchRouteCreate::setScheduledStartMs(int64_t const value)
{
    m_Scheduled_start_ms = value;
    
}
std::string DispatchRouteCreate::getStartLocationAddress() const
{
    return m_Start_location_address;
}
void DispatchRouteCreate::setStartLocationAddress(std::string const& value)
{
    m_Start_location_address = value;
    m_Start_location_addressIsSet = true;
}
bool DispatchRouteCreate::startLocationAddressIsSet() const
{
    return m_Start_location_addressIsSet;
}
void DispatchRouteCreate::unsetStart_location_address()
{
    m_Start_location_addressIsSet = false;
}
int64_t DispatchRouteCreate::getStartLocationAddressId() const
{
    return m_Start_location_address_id;
}
void DispatchRouteCreate::setStartLocationAddressId(int64_t const value)
{
    m_Start_location_address_id = value;
    m_Start_location_address_idIsSet = true;
}
bool DispatchRouteCreate::startLocationAddressIdIsSet() const
{
    return m_Start_location_address_idIsSet;
}
void DispatchRouteCreate::unsetStart_location_address_id()
{
    m_Start_location_address_idIsSet = false;
}
double DispatchRouteCreate::getStartLocationLat() const
{
    return m_Start_location_lat;
}
void DispatchRouteCreate::setStartLocationLat(double const value)
{
    m_Start_location_lat = value;
    m_Start_location_latIsSet = true;
}
bool DispatchRouteCreate::startLocationLatIsSet() const
{
    return m_Start_location_latIsSet;
}
void DispatchRouteCreate::unsetStart_location_lat()
{
    m_Start_location_latIsSet = false;
}
double DispatchRouteCreate::getStartLocationLng() const
{
    return m_Start_location_lng;
}
void DispatchRouteCreate::setStartLocationLng(double const value)
{
    m_Start_location_lng = value;
    m_Start_location_lngIsSet = true;
}
bool DispatchRouteCreate::startLocationLngIsSet() const
{
    return m_Start_location_lngIsSet;
}
void DispatchRouteCreate::unsetStart_location_lng()
{
    m_Start_location_lngIsSet = false;
}
std::string DispatchRouteCreate::getStartLocationName() const
{
    return m_Start_location_name;
}
void DispatchRouteCreate::setStartLocationName(std::string const& value)
{
    m_Start_location_name = value;
    m_Start_location_nameIsSet = true;
}
bool DispatchRouteCreate::startLocationNameIsSet() const
{
    return m_Start_location_nameIsSet;
}
void DispatchRouteCreate::unsetStart_location_name()
{
    m_Start_location_nameIsSet = false;
}
int64_t DispatchRouteCreate::getTrailerId() const
{
    return m_Trailer_id;
}
void DispatchRouteCreate::setTrailerId(int64_t const value)
{
    m_Trailer_id = value;
    m_Trailer_idIsSet = true;
}
bool DispatchRouteCreate::trailerIdIsSet() const
{
    return m_Trailer_idIsSet;
}
void DispatchRouteCreate::unsetTrailer_id()
{
    m_Trailer_idIsSet = false;
}
int64_t DispatchRouteCreate::getVehicleId() const
{
    return m_Vehicle_id;
}
void DispatchRouteCreate::setVehicleId(int64_t const value)
{
    m_Vehicle_id = value;
    m_Vehicle_idIsSet = true;
}
bool DispatchRouteCreate::vehicleIdIsSet() const
{
    return m_Vehicle_idIsSet;
}
void DispatchRouteCreate::unsetVehicle_id()
{
    m_Vehicle_idIsSet = false;
}
std::vector<DispatchJobCreate>& DispatchRouteCreate::getDispatchJobs()
{
    return m_Dispatch_jobs;
}

}
}
}
}

