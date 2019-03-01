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
 * DispatchRouteCreate.h
 *
 * 
 */

#ifndef DispatchRouteCreate_H_
#define DispatchRouteCreate_H_


#include "ModelBase.h"

#include "DispatchRouteBase.h"
#include <string>
#include "DispatchJobCreate.h"
#include <vector>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  DispatchRouteCreate
    : public ModelBase
{
public:
    DispatchRouteCreate();
    virtual ~DispatchRouteCreate();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// DispatchRouteCreate members

    /// <summary>
    /// The time in Unix epoch milliseconds that the route actually ended.
    /// </summary>
    int64_t getActualEndMs() const;
    void setActualEndMs(int64_t const value);
    bool actualEndMsIsSet() const;
    void unsetActual_end_ms();
    /// <summary>
    /// The time in Unix epoch milliseconds that the route actually started.
    /// </summary>
    int64_t getActualStartMs() const;
    void setActualStartMs(int64_t const value);
    bool actualStartMsIsSet() const;
    void unsetActual_start_ms();
    /// <summary>
    /// ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
    /// </summary>
    int64_t getDriverId() const;
    void setDriverId(int64_t const value);
    bool driverIdIsSet() const;
    void unsetDriver_id();
    /// <summary>
    /// ID of the group if the organization has multiple groups (optional).
    /// </summary>
    int64_t getGroupId() const;
    void setGroupId(int64_t const value);
    bool groupIdIsSet() const;
    void unsetGroup_id();
    /// <summary>
    /// Descriptive name of this route.
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
        /// <summary>
    /// The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
    /// </summary>
    int64_t getScheduledEndMs() const;
    void setScheduledEndMs(int64_t const value);
        /// <summary>
    /// The distance expected to be traveled for this route in meters.
    /// </summary>
    int64_t getScheduledMeters() const;
    void setScheduledMeters(int64_t const value);
    bool scheduledMetersIsSet() const;
    void unsetScheduled_meters();
    /// <summary>
    /// The time in Unix epoch milliseconds that the route is scheduled to start.
    /// </summary>
    int64_t getScheduledStartMs() const;
    void setScheduledStartMs(int64_t const value);
        /// <summary>
    /// The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
    /// </summary>
    std::string getStartLocationAddress() const;
    void setStartLocationAddress(std::string const& value);
    bool startLocationAddressIsSet() const;
    void unsetStart_location_address();
    /// <summary>
    /// ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
    /// </summary>
    int64_t getStartLocationAddressId() const;
    void setStartLocationAddressId(int64_t const value);
    bool startLocationAddressIdIsSet() const;
    void unsetStart_location_address_id();
    /// <summary>
    /// Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    /// </summary>
    double getStartLocationLat() const;
    void setStartLocationLat(double const value);
    bool startLocationLatIsSet() const;
    void unsetStart_location_lat();
    /// <summary>
    /// Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
    /// </summary>
    double getStartLocationLng() const;
    void setStartLocationLng(double const value);
    bool startLocationLngIsSet() const;
    void unsetStart_location_lng();
    /// <summary>
    /// The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.
    /// </summary>
    std::string getStartLocationName() const;
    void setStartLocationName(std::string const& value);
    bool startLocationNameIsSet() const;
    void unsetStart_location_name();
    /// <summary>
    /// ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
    /// </summary>
    int64_t getTrailerId() const;
    void setTrailerId(int64_t const value);
    bool trailerIdIsSet() const;
    void unsetTrailer_id();
    /// <summary>
    /// ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
    /// </summary>
    int64_t getVehicleId() const;
    void setVehicleId(int64_t const value);
    bool vehicleIdIsSet() const;
    void unsetVehicle_id();
    /// <summary>
    /// The dispatch jobs to create for this route.
    /// </summary>
    std::vector<DispatchJobCreate>& getDispatchJobs();
    
protected:
    int64_t m_Actual_end_ms;
    bool m_Actual_end_msIsSet;
    int64_t m_Actual_start_ms;
    bool m_Actual_start_msIsSet;
    int64_t m_Driver_id;
    bool m_Driver_idIsSet;
    int64_t m_Group_id;
    bool m_Group_idIsSet;
    std::string m_Name;

    int64_t m_Scheduled_end_ms;

    int64_t m_Scheduled_meters;
    bool m_Scheduled_metersIsSet;
    int64_t m_Scheduled_start_ms;

    std::string m_Start_location_address;
    bool m_Start_location_addressIsSet;
    int64_t m_Start_location_address_id;
    bool m_Start_location_address_idIsSet;
    double m_Start_location_lat;
    bool m_Start_location_latIsSet;
    double m_Start_location_lng;
    bool m_Start_location_lngIsSet;
    std::string m_Start_location_name;
    bool m_Start_location_nameIsSet;
    int64_t m_Trailer_id;
    bool m_Trailer_idIsSet;
    int64_t m_Vehicle_id;
    bool m_Vehicle_idIsSet;
    std::vector<DispatchJobCreate> m_Dispatch_jobs;

};

}
}
}
}

#endif /* DispatchRouteCreate_H_ */
