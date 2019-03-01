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
 * HosLogsResponse_logs.h
 *
 * 
 */

#ifndef HosLogsResponse_logs_H_
#define HosLogsResponse_logs_H_


#include "ModelBase.h"

#include <string>
#include <vector>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  HosLogsResponse_logs
    : public ModelBase
{
public:
    HosLogsResponse_logs();
    virtual ~HosLogsResponse_logs();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// HosLogsResponse_logs members

    /// <summary>
    /// Longitude at which the log was recorded.
    /// </summary>
    double getLocLng() const;
    void setLocLng(double const value);
    bool locLngIsSet() const;
    void unsetLocLng();
    /// <summary>
    /// The time at which the log/HOS status started in UNIX milliseconds.
    /// </summary>
    int64_t getLogStartMs() const;
    void setLogStartMs(int64_t const value);
    bool logStartMsIsSet() const;
    void unsetLogStartMs();
    /// <summary>
    /// ID of the driver.
    /// </summary>
    int64_t getDriverId() const;
    void setDriverId(int64_t const value);
    bool driverIdIsSet() const;
    void unsetDriverId();
    /// <summary>
    /// The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.
    /// </summary>
    std::string getStatusType() const;
    void setStatusType(std::string const& value);
    bool statusTypeIsSet() const;
    void unsetStatusType();
    /// <summary>
    /// City in which the log was recorded.
    /// </summary>
    std::string getLocCity() const;
    void setLocCity(std::string const& value);
    bool locCityIsSet() const;
    void unsetLocCity();
    /// <summary>
    /// ID of the group.
    /// </summary>
    int64_t getGroupId() const;
    void setGroupId(int64_t const value);
    bool groupIdIsSet() const;
    void unsetGroupId();
    /// <summary>
    /// Name of location at which the log was recorded.
    /// </summary>
    std::string getLocName() const;
    void setLocName(std::string const& value);
    bool locNameIsSet() const;
    void unsetLocName();
    /// <summary>
    /// Latitude at which the log was recorded.
    /// </summary>
    double getLocLat() const;
    void setLocLat(double const value);
    bool locLatIsSet() const;
    void unsetLocLat();
    /// <summary>
    /// Remark associated with the log entry.
    /// </summary>
    std::string getRemark() const;
    void setRemark(std::string const& value);
    bool remarkIsSet() const;
    void unsetRemark();
    /// <summary>
    /// State in which the log was recorded.
    /// </summary>
    std::string getLocState() const;
    void setLocState(std::string const& value);
    bool locStateIsSet() const;
    void unsetLocState();
    /// <summary>
    /// ID of the vehicle.
    /// </summary>
    int64_t getVehicleId() const;
    void setVehicleId(int64_t const value);
    bool vehicleIdIsSet() const;
    void unsetVehicleId();
    /// <summary>
    /// 
    /// </summary>
    std::vector<int64_t>& getCodriverIds();
    bool codriverIdsIsSet() const;
    void unsetCodriverIds();

protected:
    double m_LocLng;
    bool m_LocLngIsSet;
    int64_t m_LogStartMs;
    bool m_LogStartMsIsSet;
    int64_t m_DriverId;
    bool m_DriverIdIsSet;
    std::string m_StatusType;
    bool m_StatusTypeIsSet;
    std::string m_LocCity;
    bool m_LocCityIsSet;
    int64_t m_GroupId;
    bool m_GroupIdIsSet;
    std::string m_LocName;
    bool m_LocNameIsSet;
    double m_LocLat;
    bool m_LocLatIsSet;
    std::string m_Remark;
    bool m_RemarkIsSet;
    std::string m_LocState;
    bool m_LocStateIsSet;
    int64_t m_VehicleId;
    bool m_VehicleIdIsSet;
    std::vector<int64_t> m_CodriverIds;
    bool m_CodriverIdsIsSet;
};

}
}
}
}

#endif /* HosLogsResponse_logs_H_ */
