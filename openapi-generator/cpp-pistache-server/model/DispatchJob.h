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
/*
 * DispatchJob.h
 *
 * 
 */

#ifndef DispatchJob_H_
#define DispatchJob_H_


#include "ModelBase.h"

#include <string>
#include "DispatchJobCreate.h"
#include "JobStatus.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  DispatchJob
    : public ModelBase
{
public:
    DispatchJob();
    virtual ~DispatchJob();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// DispatchJob members

    /// <summary>
    /// The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
    /// </summary>
    std::string getDestinationAddress() const;
    void setDestinationAddress(std::string const& value);
    bool destinationAddressIsSet() const;
    void unsetDestination_address();
    /// <summary>
    /// ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
    /// </summary>
    int64_t getDestinationAddressId() const;
    void setDestinationAddressId(int64_t const value);
    bool destinationAddressIdIsSet() const;
    void unsetDestination_address_id();
    /// <summary>
    /// Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
    /// </summary>
    double getDestinationLat() const;
    void setDestinationLat(double const value);
    bool destinationLatIsSet() const;
    void unsetDestination_lat();
    /// <summary>
    /// Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
    /// </summary>
    double getDestinationLng() const;
    void setDestinationLng(double const value);
    bool destinationLngIsSet() const;
    void unsetDestination_lng();
    /// <summary>
    /// The name of the job destination. If provided, it will take precedence over the name of the address book entry.
    /// </summary>
    std::string getDestinationName() const;
    void setDestinationName(std::string const& value);
    bool destinationNameIsSet() const;
    void unsetDestination_name();
    /// <summary>
    /// Notes regarding the details of this job.
    /// </summary>
    std::string getNotes() const;
    void setNotes(std::string const& value);
    bool notesIsSet() const;
    void unsetNotes();
    /// <summary>
    /// The time at which the assigned driver is scheduled to arrive at the job destination.
    /// </summary>
    int64_t getScheduledArrivalTimeMs() const;
    void setScheduledArrivalTimeMs(int64_t const value);
        /// <summary>
    /// The time at which the assigned driver is scheduled to depart from the job destination.
    /// </summary>
    int64_t getScheduledDepartureTimeMs() const;
    void setScheduledDepartureTimeMs(int64_t const value);
    bool scheduledDepartureTimeMsIsSet() const;
    void unsetScheduled_departure_time_ms();
    /// <summary>
    /// The time at which the driver arrived at the job destination.
    /// </summary>
    int64_t getArrivedAtMs() const;
    void setArrivedAtMs(int64_t const value);
    bool arrivedAtMsIsSet() const;
    void unsetArrived_at_ms();
    /// <summary>
    /// The time at which the job was marked complete (e.g. started driving to the next destination).
    /// </summary>
    int64_t getCompletedAtMs() const;
    void setCompletedAtMs(int64_t const value);
    bool completedAtMsIsSet() const;
    void unsetCompleted_at_ms();
    /// <summary>
    /// ID of the route that this job belongs to.
    /// </summary>
    int64_t getDispatchRouteId() const;
    void setDispatchRouteId(int64_t const value);
        /// <summary>
    /// ID of the driver assigned to the dispatch job.
    /// </summary>
    int64_t getDriverId() const;
    void setDriverId(int64_t const value);
    bool driverIdIsSet() const;
    void unsetDriver_id();
    /// <summary>
    /// The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
    /// </summary>
    int64_t getEnRouteAtMs() const;
    void setEnRouteAtMs(int64_t const value);
    bool enRouteAtMsIsSet() const;
    void unsetEn_route_at_ms();
    /// <summary>
    /// The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
    /// </summary>
    int64_t getEstimatedArrivalMs() const;
    void setEstimatedArrivalMs(int64_t const value);
    bool estimatedArrivalMsIsSet() const;
    void unsetEstimated_arrival_ms();
    /// <summary>
    /// Fleet viewer url of the dispatch job.
    /// </summary>
    std::string getFleetViewerUrl() const;
    void setFleetViewerUrl(std::string const& value);
    bool fleetViewerUrlIsSet() const;
    void unsetFleet_viewer_url();
    /// <summary>
    /// 
    /// </summary>
    int64_t getGroupId() const;
    void setGroupId(int64_t const value);
        /// <summary>
    /// ID of the Samsara dispatch job.
    /// </summary>
    int64_t getId() const;
    void setId(int64_t const value);
        /// <summary>
    /// 
    /// </summary>
    JobStatus getJobState() const;
    void setJobState(JobStatus const& value);
        /// <summary>
    /// The time at which the job was marked skipped.
    /// </summary>
    int64_t getSkippedAtMs() const;
    void setSkippedAtMs(int64_t const value);
    bool skippedAtMsIsSet() const;
    void unsetSkipped_at_ms();
    /// <summary>
    /// ID of the vehicle used for the dispatch job.
    /// </summary>
    int64_t getVehicleId() const;
    void setVehicleId(int64_t const value);
    bool vehicleIdIsSet() const;
    void unsetVehicle_id();

protected:
    std::string m_Destination_address;
    bool m_Destination_addressIsSet;
    int64_t m_Destination_address_id;
    bool m_Destination_address_idIsSet;
    double m_Destination_lat;
    bool m_Destination_latIsSet;
    double m_Destination_lng;
    bool m_Destination_lngIsSet;
    std::string m_Destination_name;
    bool m_Destination_nameIsSet;
    std::string m_Notes;
    bool m_NotesIsSet;
    int64_t m_Scheduled_arrival_time_ms;

    int64_t m_Scheduled_departure_time_ms;
    bool m_Scheduled_departure_time_msIsSet;
    int64_t m_Arrived_at_ms;
    bool m_Arrived_at_msIsSet;
    int64_t m_Completed_at_ms;
    bool m_Completed_at_msIsSet;
    int64_t m_Dispatch_route_id;

    int64_t m_Driver_id;
    bool m_Driver_idIsSet;
    int64_t m_En_route_at_ms;
    bool m_En_route_at_msIsSet;
    int64_t m_Estimated_arrival_ms;
    bool m_Estimated_arrival_msIsSet;
    std::string m_Fleet_viewer_url;
    bool m_Fleet_viewer_urlIsSet;
    int64_t m_Group_id;

    int64_t m_Id;

    JobStatus m_Job_state;

    int64_t m_Skipped_at_ms;
    bool m_Skipped_at_msIsSet;
    int64_t m_Vehicle_id;
    bool m_Vehicle_idIsSet;
};

}
}
}
}

#endif /* DispatchJob_H_ */
