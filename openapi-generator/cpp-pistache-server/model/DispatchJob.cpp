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


#include "DispatchJob.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

DispatchJob::DispatchJob()
{
    m_Destination_address = "";
    m_Destination_addressIsSet = false;
    m_Destination_address_id = 0L;
    m_Destination_address_idIsSet = false;
    m_Destination_lat = 0.0;
    m_Destination_latIsSet = false;
    m_Destination_lng = 0.0;
    m_Destination_lngIsSet = false;
    m_Destination_name = "";
    m_Destination_nameIsSet = false;
    m_Notes = "";
    m_NotesIsSet = false;
    m_Scheduled_arrival_time_ms = 0L;
    m_Scheduled_departure_time_ms = 0L;
    m_Scheduled_departure_time_msIsSet = false;
    m_Arrived_at_ms = 0L;
    m_Arrived_at_msIsSet = false;
    m_Completed_at_ms = 0L;
    m_Completed_at_msIsSet = false;
    m_Dispatch_route_id = 0L;
    m_Driver_id = 0L;
    m_Driver_idIsSet = false;
    m_En_route_at_ms = 0L;
    m_En_route_at_msIsSet = false;
    m_Estimated_arrival_ms = 0L;
    m_Estimated_arrival_msIsSet = false;
    m_Fleet_viewer_url = "";
    m_Fleet_viewer_urlIsSet = false;
    m_Group_id = 0L;
    m_Id = 0L;
    m_Skipped_at_ms = 0L;
    m_Skipped_at_msIsSet = false;
    m_Vehicle_id = 0L;
    m_Vehicle_idIsSet = false;
    
}

DispatchJob::~DispatchJob()
{
}

void DispatchJob::validate()
{
    // TODO: implement validation
}

nlohmann::json DispatchJob::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Destination_addressIsSet)
    {
        val["destination_address"] = ModelBase::toJson(m_Destination_address);
    }
    if(m_Destination_address_idIsSet)
    {
        val["destination_address_id"] = m_Destination_address_id;
    }
    if(m_Destination_latIsSet)
    {
        val["destination_lat"] = m_Destination_lat;
    }
    if(m_Destination_lngIsSet)
    {
        val["destination_lng"] = m_Destination_lng;
    }
    if(m_Destination_nameIsSet)
    {
        val["destination_name"] = ModelBase::toJson(m_Destination_name);
    }
    if(m_NotesIsSet)
    {
        val["notes"] = ModelBase::toJson(m_Notes);
    }
    val["scheduled_arrival_time_ms"] = m_Scheduled_arrival_time_ms;
    if(m_Scheduled_departure_time_msIsSet)
    {
        val["scheduled_departure_time_ms"] = m_Scheduled_departure_time_ms;
    }
    if(m_Arrived_at_msIsSet)
    {
        val["arrived_at_ms"] = m_Arrived_at_ms;
    }
    if(m_Completed_at_msIsSet)
    {
        val["completed_at_ms"] = m_Completed_at_ms;
    }
    val["dispatch_route_id"] = m_Dispatch_route_id;
    if(m_Driver_idIsSet)
    {
        val["driver_id"] = m_Driver_id;
    }
    if(m_En_route_at_msIsSet)
    {
        val["en_route_at_ms"] = m_En_route_at_ms;
    }
    if(m_Estimated_arrival_msIsSet)
    {
        val["estimated_arrival_ms"] = m_Estimated_arrival_ms;
    }
    if(m_Fleet_viewer_urlIsSet)
    {
        val["fleet_viewer_url"] = ModelBase::toJson(m_Fleet_viewer_url);
    }
    val["group_id"] = m_Group_id;
    val["id"] = m_Id;
    val["job_state"] = ModelBase::toJson(m_Job_state);
    if(m_Skipped_at_msIsSet)
    {
        val["skipped_at_ms"] = m_Skipped_at_ms;
    }
    if(m_Vehicle_idIsSet)
    {
        val["vehicle_id"] = m_Vehicle_id;
    }
    

    return val;
}

void DispatchJob::fromJson(const nlohmann::json& val)
{
    if(val.find("destination_address") != val.end())
    {
        setDestinationAddress(val.at("destination_address"));
    }
    if(val.find("destination_address_id") != val.end())
    {
        setDestinationAddressId(val.at("destination_address_id"));
    }
    if(val.find("destination_lat") != val.end())
    {
        setDestinationLat(val.at("destination_lat"));
    }
    if(val.find("destination_lng") != val.end())
    {
        setDestinationLng(val.at("destination_lng"));
    }
    if(val.find("destination_name") != val.end())
    {
        setDestinationName(val.at("destination_name"));
    }
    if(val.find("notes") != val.end())
    {
        setNotes(val.at("notes"));
    }
    setScheduledArrivalTimeMs(val.at("scheduled_arrival_time_ms"));
    if(val.find("scheduled_departure_time_ms") != val.end())
    {
        setScheduledDepartureTimeMs(val.at("scheduled_departure_time_ms"));
    }
    if(val.find("arrived_at_ms") != val.end())
    {
        setArrivedAtMs(val.at("arrived_at_ms"));
    }
    if(val.find("completed_at_ms") != val.end())
    {
        setCompletedAtMs(val.at("completed_at_ms"));
    }
    setDispatchRouteId(val.at("dispatch_route_id"));
    if(val.find("driver_id") != val.end())
    {
        setDriverId(val.at("driver_id"));
    }
    if(val.find("en_route_at_ms") != val.end())
    {
        setEnRouteAtMs(val.at("en_route_at_ms"));
    }
    if(val.find("estimated_arrival_ms") != val.end())
    {
        setEstimatedArrivalMs(val.at("estimated_arrival_ms"));
    }
    if(val.find("fleet_viewer_url") != val.end())
    {
        setFleetViewerUrl(val.at("fleet_viewer_url"));
    }
    setGroupId(val.at("group_id"));
    setId(val.at("id"));
    if(val.find("skipped_at_ms") != val.end())
    {
        setSkippedAtMs(val.at("skipped_at_ms"));
    }
    if(val.find("vehicle_id") != val.end())
    {
        setVehicleId(val.at("vehicle_id"));
    }
    
}


std::string DispatchJob::getDestinationAddress() const
{
    return m_Destination_address;
}
void DispatchJob::setDestinationAddress(std::string const& value)
{
    m_Destination_address = value;
    m_Destination_addressIsSet = true;
}
bool DispatchJob::destinationAddressIsSet() const
{
    return m_Destination_addressIsSet;
}
void DispatchJob::unsetDestination_address()
{
    m_Destination_addressIsSet = false;
}
int64_t DispatchJob::getDestinationAddressId() const
{
    return m_Destination_address_id;
}
void DispatchJob::setDestinationAddressId(int64_t const value)
{
    m_Destination_address_id = value;
    m_Destination_address_idIsSet = true;
}
bool DispatchJob::destinationAddressIdIsSet() const
{
    return m_Destination_address_idIsSet;
}
void DispatchJob::unsetDestination_address_id()
{
    m_Destination_address_idIsSet = false;
}
double DispatchJob::getDestinationLat() const
{
    return m_Destination_lat;
}
void DispatchJob::setDestinationLat(double const value)
{
    m_Destination_lat = value;
    m_Destination_latIsSet = true;
}
bool DispatchJob::destinationLatIsSet() const
{
    return m_Destination_latIsSet;
}
void DispatchJob::unsetDestination_lat()
{
    m_Destination_latIsSet = false;
}
double DispatchJob::getDestinationLng() const
{
    return m_Destination_lng;
}
void DispatchJob::setDestinationLng(double const value)
{
    m_Destination_lng = value;
    m_Destination_lngIsSet = true;
}
bool DispatchJob::destinationLngIsSet() const
{
    return m_Destination_lngIsSet;
}
void DispatchJob::unsetDestination_lng()
{
    m_Destination_lngIsSet = false;
}
std::string DispatchJob::getDestinationName() const
{
    return m_Destination_name;
}
void DispatchJob::setDestinationName(std::string const& value)
{
    m_Destination_name = value;
    m_Destination_nameIsSet = true;
}
bool DispatchJob::destinationNameIsSet() const
{
    return m_Destination_nameIsSet;
}
void DispatchJob::unsetDestination_name()
{
    m_Destination_nameIsSet = false;
}
std::string DispatchJob::getNotes() const
{
    return m_Notes;
}
void DispatchJob::setNotes(std::string const& value)
{
    m_Notes = value;
    m_NotesIsSet = true;
}
bool DispatchJob::notesIsSet() const
{
    return m_NotesIsSet;
}
void DispatchJob::unsetNotes()
{
    m_NotesIsSet = false;
}
int64_t DispatchJob::getScheduledArrivalTimeMs() const
{
    return m_Scheduled_arrival_time_ms;
}
void DispatchJob::setScheduledArrivalTimeMs(int64_t const value)
{
    m_Scheduled_arrival_time_ms = value;
    
}
int64_t DispatchJob::getScheduledDepartureTimeMs() const
{
    return m_Scheduled_departure_time_ms;
}
void DispatchJob::setScheduledDepartureTimeMs(int64_t const value)
{
    m_Scheduled_departure_time_ms = value;
    m_Scheduled_departure_time_msIsSet = true;
}
bool DispatchJob::scheduledDepartureTimeMsIsSet() const
{
    return m_Scheduled_departure_time_msIsSet;
}
void DispatchJob::unsetScheduled_departure_time_ms()
{
    m_Scheduled_departure_time_msIsSet = false;
}
int64_t DispatchJob::getArrivedAtMs() const
{
    return m_Arrived_at_ms;
}
void DispatchJob::setArrivedAtMs(int64_t const value)
{
    m_Arrived_at_ms = value;
    m_Arrived_at_msIsSet = true;
}
bool DispatchJob::arrivedAtMsIsSet() const
{
    return m_Arrived_at_msIsSet;
}
void DispatchJob::unsetArrived_at_ms()
{
    m_Arrived_at_msIsSet = false;
}
int64_t DispatchJob::getCompletedAtMs() const
{
    return m_Completed_at_ms;
}
void DispatchJob::setCompletedAtMs(int64_t const value)
{
    m_Completed_at_ms = value;
    m_Completed_at_msIsSet = true;
}
bool DispatchJob::completedAtMsIsSet() const
{
    return m_Completed_at_msIsSet;
}
void DispatchJob::unsetCompleted_at_ms()
{
    m_Completed_at_msIsSet = false;
}
int64_t DispatchJob::getDispatchRouteId() const
{
    return m_Dispatch_route_id;
}
void DispatchJob::setDispatchRouteId(int64_t const value)
{
    m_Dispatch_route_id = value;
    
}
int64_t DispatchJob::getDriverId() const
{
    return m_Driver_id;
}
void DispatchJob::setDriverId(int64_t const value)
{
    m_Driver_id = value;
    m_Driver_idIsSet = true;
}
bool DispatchJob::driverIdIsSet() const
{
    return m_Driver_idIsSet;
}
void DispatchJob::unsetDriver_id()
{
    m_Driver_idIsSet = false;
}
int64_t DispatchJob::getEnRouteAtMs() const
{
    return m_En_route_at_ms;
}
void DispatchJob::setEnRouteAtMs(int64_t const value)
{
    m_En_route_at_ms = value;
    m_En_route_at_msIsSet = true;
}
bool DispatchJob::enRouteAtMsIsSet() const
{
    return m_En_route_at_msIsSet;
}
void DispatchJob::unsetEn_route_at_ms()
{
    m_En_route_at_msIsSet = false;
}
int64_t DispatchJob::getEstimatedArrivalMs() const
{
    return m_Estimated_arrival_ms;
}
void DispatchJob::setEstimatedArrivalMs(int64_t const value)
{
    m_Estimated_arrival_ms = value;
    m_Estimated_arrival_msIsSet = true;
}
bool DispatchJob::estimatedArrivalMsIsSet() const
{
    return m_Estimated_arrival_msIsSet;
}
void DispatchJob::unsetEstimated_arrival_ms()
{
    m_Estimated_arrival_msIsSet = false;
}
std::string DispatchJob::getFleetViewerUrl() const
{
    return m_Fleet_viewer_url;
}
void DispatchJob::setFleetViewerUrl(std::string const& value)
{
    m_Fleet_viewer_url = value;
    m_Fleet_viewer_urlIsSet = true;
}
bool DispatchJob::fleetViewerUrlIsSet() const
{
    return m_Fleet_viewer_urlIsSet;
}
void DispatchJob::unsetFleet_viewer_url()
{
    m_Fleet_viewer_urlIsSet = false;
}
int64_t DispatchJob::getGroupId() const
{
    return m_Group_id;
}
void DispatchJob::setGroupId(int64_t const value)
{
    m_Group_id = value;
    
}
int64_t DispatchJob::getId() const
{
    return m_Id;
}
void DispatchJob::setId(int64_t const value)
{
    m_Id = value;
    
}
JobStatus DispatchJob::getJobState() const
{
    return m_Job_state;
}
void DispatchJob::setJobState(JobStatus const& value)
{
    m_Job_state = value;
    
}
int64_t DispatchJob::getSkippedAtMs() const
{
    return m_Skipped_at_ms;
}
void DispatchJob::setSkippedAtMs(int64_t const value)
{
    m_Skipped_at_ms = value;
    m_Skipped_at_msIsSet = true;
}
bool DispatchJob::skippedAtMsIsSet() const
{
    return m_Skipped_at_msIsSet;
}
void DispatchJob::unsetSkipped_at_ms()
{
    m_Skipped_at_msIsSet = false;
}
int64_t DispatchJob::getVehicleId() const
{
    return m_Vehicle_id;
}
void DispatchJob::setVehicleId(int64_t const value)
{
    m_Vehicle_id = value;
    m_Vehicle_idIsSet = true;
}
bool DispatchJob::vehicleIdIsSet() const
{
    return m_Vehicle_idIsSet;
}
void DispatchJob::unsetVehicle_id()
{
    m_Vehicle_idIsSet = false;
}

}
}
}
}

