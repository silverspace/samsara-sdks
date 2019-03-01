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



#include "DispatchJob.h"

#include <string>
#include <sstream>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

DispatchJob::DispatchJob()
{
    m_Destination_address = "";
    m_Destination_address_id = 0L;
    m_Destination_lat = 0.0;
    m_Destination_lng = 0.0;
    m_Destination_name = "";
    m_Notes = "";
    m_Scheduled_arrival_time_ms = 0L;
    m_Scheduled_departure_time_ms = 0L;
    m_Arrived_at_ms = 0L;
    m_Completed_at_ms = 0L;
    m_Dispatch_route_id = 0L;
    m_Driver_id = 0L;
    m_En_route_at_ms = 0L;
    m_Estimated_arrival_ms = 0L;
    m_Fleet_viewer_url = "";
    m_Group_id = 0L;
    m_Id = 0L;
    m_Skipped_at_ms = 0L;
    m_Vehicle_id = 0L;
    
}

DispatchJob::~DispatchJob()
{
}

std::string DispatchJob::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	pt.put("Destination_address", m_Destination_address);
	pt.put("Destination_address_id", m_Destination_address_id);
	pt.put("Destination_lat", m_Destination_lat);
	pt.put("Destination_lng", m_Destination_lng);
	pt.put("Destination_name", m_Destination_name);
	pt.put("Notes", m_Notes);
	pt.put("Scheduled_arrival_time_ms", m_Scheduled_arrival_time_ms);
	pt.put("Scheduled_departure_time_ms", m_Scheduled_departure_time_ms);
	pt.put("Arrived_at_ms", m_Arrived_at_ms);
	pt.put("Completed_at_ms", m_Completed_at_ms);
	pt.put("Dispatch_route_id", m_Dispatch_route_id);
	pt.put("Driver_id", m_Driver_id);
	pt.put("En_route_at_ms", m_En_route_at_ms);
	pt.put("Estimated_arrival_ms", m_Estimated_arrival_ms);
	pt.put("Fleet_viewer_url", m_Fleet_viewer_url);
	pt.put("Group_id", m_Group_id);
	pt.put("Id", m_Id);
	pt.put("Skipped_at_ms", m_Skipped_at_ms);
	pt.put("Vehicle_id", m_Vehicle_id);
	write_json(ss, pt, false);
	return ss.str();
}

void DispatchJob::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	m_Destination_address = pt.get("Destination_address", "");
	m_Destination_address_id = pt.get("Destination_address_id", 0L);
	m_Destination_lat = pt.get("Destination_lat", 0.0);
	m_Destination_lng = pt.get("Destination_lng", 0.0);
	m_Destination_name = pt.get("Destination_name", "");
	m_Notes = pt.get("Notes", "");
	m_Scheduled_arrival_time_ms = pt.get("Scheduled_arrival_time_ms", 0L);
	m_Scheduled_departure_time_ms = pt.get("Scheduled_departure_time_ms", 0L);
	m_Arrived_at_ms = pt.get("Arrived_at_ms", 0L);
	m_Completed_at_ms = pt.get("Completed_at_ms", 0L);
	m_Dispatch_route_id = pt.get("Dispatch_route_id", 0L);
	m_Driver_id = pt.get("Driver_id", 0L);
	m_En_route_at_ms = pt.get("En_route_at_ms", 0L);
	m_Estimated_arrival_ms = pt.get("Estimated_arrival_ms", 0L);
	m_Fleet_viewer_url = pt.get("Fleet_viewer_url", "");
	m_Group_id = pt.get("Group_id", 0L);
	m_Id = pt.get("Id", 0L);
	m_Skipped_at_ms = pt.get("Skipped_at_ms", 0L);
	m_Vehicle_id = pt.get("Vehicle_id", 0L);
}

std::string DispatchJob::getDestinationAddress() const
{
    return m_Destination_address;
}
void DispatchJob::setDestinationAddress(std::string value)
{
    m_Destination_address = value;
}
int64_t DispatchJob::getDestinationAddressId() const
{
    return m_Destination_address_id;
}
void DispatchJob::setDestinationAddressId(int64_t value)
{
    m_Destination_address_id = value;
}
double DispatchJob::getDestinationLat() const
{
    return m_Destination_lat;
}
void DispatchJob::setDestinationLat(double value)
{
    m_Destination_lat = value;
}
double DispatchJob::getDestinationLng() const
{
    return m_Destination_lng;
}
void DispatchJob::setDestinationLng(double value)
{
    m_Destination_lng = value;
}
std::string DispatchJob::getDestinationName() const
{
    return m_Destination_name;
}
void DispatchJob::setDestinationName(std::string value)
{
    m_Destination_name = value;
}
std::string DispatchJob::getNotes() const
{
    return m_Notes;
}
void DispatchJob::setNotes(std::string value)
{
    m_Notes = value;
}
int64_t DispatchJob::getScheduledArrivalTimeMs() const
{
    return m_Scheduled_arrival_time_ms;
}
void DispatchJob::setScheduledArrivalTimeMs(int64_t value)
{
    m_Scheduled_arrival_time_ms = value;
}
int64_t DispatchJob::getScheduledDepartureTimeMs() const
{
    return m_Scheduled_departure_time_ms;
}
void DispatchJob::setScheduledDepartureTimeMs(int64_t value)
{
    m_Scheduled_departure_time_ms = value;
}
int64_t DispatchJob::getArrivedAtMs() const
{
    return m_Arrived_at_ms;
}
void DispatchJob::setArrivedAtMs(int64_t value)
{
    m_Arrived_at_ms = value;
}
int64_t DispatchJob::getCompletedAtMs() const
{
    return m_Completed_at_ms;
}
void DispatchJob::setCompletedAtMs(int64_t value)
{
    m_Completed_at_ms = value;
}
int64_t DispatchJob::getDispatchRouteId() const
{
    return m_Dispatch_route_id;
}
void DispatchJob::setDispatchRouteId(int64_t value)
{
    m_Dispatch_route_id = value;
}
int64_t DispatchJob::getDriverId() const
{
    return m_Driver_id;
}
void DispatchJob::setDriverId(int64_t value)
{
    m_Driver_id = value;
}
int64_t DispatchJob::getEnRouteAtMs() const
{
    return m_En_route_at_ms;
}
void DispatchJob::setEnRouteAtMs(int64_t value)
{
    m_En_route_at_ms = value;
}
int64_t DispatchJob::getEstimatedArrivalMs() const
{
    return m_Estimated_arrival_ms;
}
void DispatchJob::setEstimatedArrivalMs(int64_t value)
{
    m_Estimated_arrival_ms = value;
}
std::string DispatchJob::getFleetViewerUrl() const
{
    return m_Fleet_viewer_url;
}
void DispatchJob::setFleetViewerUrl(std::string value)
{
    m_Fleet_viewer_url = value;
}
int64_t DispatchJob::getGroupId() const
{
    return m_Group_id;
}
void DispatchJob::setGroupId(int64_t value)
{
    m_Group_id = value;
}
int64_t DispatchJob::getId() const
{
    return m_Id;
}
void DispatchJob::setId(int64_t value)
{
    m_Id = value;
}
std::shared_ptr<JobStatus> DispatchJob::getJobState() const
{
    return m_Job_state;
}
void DispatchJob::setJobState(std::shared_ptr<JobStatus> value)
{
    m_Job_state = value;
}
int64_t DispatchJob::getSkippedAtMs() const
{
    return m_Skipped_at_ms;
}
void DispatchJob::setSkippedAtMs(int64_t value)
{
    m_Skipped_at_ms = value;
}
int64_t DispatchJob::getVehicleId() const
{
    return m_Vehicle_id;
}
void DispatchJob::setVehicleId(int64_t value)
{
    m_Vehicle_id = value;
}

}
}
}
}

