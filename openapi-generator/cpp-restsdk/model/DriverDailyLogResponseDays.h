/**
 * Samsara API
 * # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
 *
 * OpenAPI spec version: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 4.0.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * DriverDailyLogResponse_days.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_DriverDailyLogResponse_days_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_DriverDailyLogResponse_days_H_


#include "../ModelBase.h"

#include "Object.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  DriverDailyLogResponse_days
    : public ModelBase
{
public:
    DriverDailyLogResponse_days();
    virtual ~DriverDailyLogResponse_days();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// DriverDailyLogResponse_days members

    /// <summary>
    /// Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
    /// </summary>
    int64_t getCertifiedAtMs() const;
    bool certifiedAtMsIsSet() const;
    void unsetCertifiedAtMs();

    void setCertifiedAtMs(int64_t value);

    /// <summary>
    /// End of the HOS day, specified in milliseconds UNIX time.
    /// </summary>
    int32_t getEndMs() const;
    bool endMsIsSet() const;
    void unsetEndMs();

    void setEndMs(int32_t value);

    /// <summary>
    /// End of the HOS day, specified in milliseconds UNIX time.
    /// </summary>
    int32_t getStartMs() const;
    bool startMsIsSet() const;
    void unsetStartMs();

    void setStartMs(int32_t value);

    /// <summary>
    /// List of trailer ID&#39;s associated with the driver for the day.
    /// </summary>
    std::shared_ptr<Object> getTrailerIds() const;
    bool trailerIdsIsSet() const;
    void unsetTrailerIds();

    void setTrailerIds(const std::shared_ptr<Object>& value);

    /// <summary>
    /// Hours spent on duty or driving, rounded to two decimal places.
    /// </summary>
    double getActiveHours() const;
    bool activeHoursIsSet() const;
    void unsetActiveHours();

    void setActiveHours(double value);

    /// <summary>
    /// Distance driven in miles, rounded to two decimal places.
    /// </summary>
    double getDistanceMiles() const;
    bool distanceMilesIsSet() const;
    void unsetDistanceMiles();

    void setDistanceMiles(double value);

    /// <summary>
    /// Milliseconds spent on duty or driving.
    /// </summary>
    int64_t getActiveMs() const;
    bool activeMsIsSet() const;
    void unsetActiveMs();

    void setActiveMs(int64_t value);

    /// <summary>
    /// Whether this HOS day chart was certified by the driver.
    /// </summary>
    bool isCertified() const;
    bool certifiedIsSet() const;
    void unsetCertified();

    void setCertified(bool value);

    /// <summary>
    /// List of vehicle ID&#39;s associated with the driver for the day.
    /// </summary>
    std::shared_ptr<Object> getVehicleIds() const;
    bool vehicleIdsIsSet() const;
    void unsetVehicleIds();

    void setVehicleIds(const std::shared_ptr<Object>& value);


protected:
    int64_t m_CertifiedAtMs;
    bool m_CertifiedAtMsIsSet;
    int32_t m_EndMs;
    bool m_EndMsIsSet;
    int32_t m_StartMs;
    bool m_StartMsIsSet;
    std::shared_ptr<Object> m_TrailerIds;
    bool m_TrailerIdsIsSet;
    double m_ActiveHours;
    bool m_ActiveHoursIsSet;
    double m_DistanceMiles;
    bool m_DistanceMilesIsSet;
    int64_t m_ActiveMs;
    bool m_ActiveMsIsSet;
    bool m_Certified;
    bool m_CertifiedIsSet;
    std::shared_ptr<Object> m_VehicleIds;
    bool m_VehicleIdsIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_DriverDailyLogResponse_days_H_ */
