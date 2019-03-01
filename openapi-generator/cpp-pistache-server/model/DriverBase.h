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
 * DriverBase.h
 *
 * 
 */

#ifndef DriverBase_H_
#define DriverBase_H_


#include "ModelBase.h"

#include <string>
#include <map>
#include <vector>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  DriverBase
    : public ModelBase
{
public:
    DriverBase();
    virtual ~DriverBase();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// DriverBase members

    /// <summary>
    /// Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
    /// </summary>
    bool isEldAdverseWeatherExemptionEnabled() const;
    void setEldAdverseWeatherExemptionEnabled(bool const value);
    bool eldAdverseWeatherExemptionEnabledIsSet() const;
    void unsetEldAdverseWeatherExemptionEnabled();
    /// <summary>
    /// Flag indicating this driver may use Big Day excemptions in ELD logs.
    /// </summary>
    bool isEldBigDayExemptionEnabled() const;
    void setEldBigDayExemptionEnabled(bool const value);
    bool eldBigDayExemptionEnabledIsSet() const;
    void unsetEldBigDayExemptionEnabled();
    /// <summary>
    /// 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
    /// </summary>
    int32_t getEldDayStartHour() const;
    void setEldDayStartHour(int32_t const value);
    bool eldDayStartHourIsSet() const;
    void unsetEldDayStartHour();
    /// <summary>
    /// Flag indicating this driver is exempt from the Electronic Logging Mandate.
    /// </summary>
    bool isEldExempt() const;
    void setEldExempt(bool const value);
    bool eldExemptIsSet() const;
    void unsetEldExempt();
    /// <summary>
    /// Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
    /// </summary>
    std::string getEldExemptReason() const;
    void setEldExemptReason(std::string const& value);
    bool eldExemptReasonIsSet() const;
    void unsetEldExemptReason();
    /// <summary>
    /// Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
    /// </summary>
    bool isEldPcEnabled() const;
    void setEldPcEnabled(bool const value);
    bool eldPcEnabledIsSet() const;
    void unsetEldPcEnabled();
    /// <summary>
    /// Flag indicating this driver may select the Yard Move duty status in ELD logs.
    /// </summary>
    bool isEldYmEnabled() const;
    void setEldYmEnabled(bool const value);
    bool eldYmEnabledIsSet() const;
    void unsetEldYmEnabled();
    /// <summary>
    /// Dictionary of external IDs (string key-value pairs)
    /// </summary>
    std::map<std::string, std::string>& getExternalIds();
    bool externalIdsIsSet() const;
    void unsetExternalIds();
    /// <summary>
    /// ID of the group if the organization has multiple groups (uncommon).
    /// </summary>
    int64_t getGroupId() const;
    void setGroupId(int64_t const value);
    bool groupIdIsSet() const;
    void unsetGroupId();
    /// <summary>
    /// Driver&#39;s state issued license number.
    /// </summary>
    std::string getLicenseNumber() const;
    void setLicenseNumber(std::string const& value);
    bool licenseNumberIsSet() const;
    void unsetLicenseNumber();
    /// <summary>
    /// Abbreviation of state that issued driver&#39;s license.
    /// </summary>
    std::string getLicenseState() const;
    void setLicenseState(std::string const& value);
    bool licenseStateIsSet() const;
    void unsetLicenseState();
    /// <summary>
    /// Driver&#39;s name.
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
        /// <summary>
    /// Notes about the driver.
    /// </summary>
    std::string getNotes() const;
    void setNotes(std::string const& value);
    bool notesIsSet() const;
    void unsetNotes();
    /// <summary>
    /// Driver&#39;s phone number. Please include only digits, ex. 4157771234
    /// </summary>
    std::string getPhone() const;
    void setPhone(std::string const& value);
    bool phoneIsSet() const;
    void unsetPhone();
    /// <summary>
    /// Driver&#39;s login username into the driver app.
    /// </summary>
    std::string getUsername() const;
    void setUsername(std::string const& value);
    bool usernameIsSet() const;
    void unsetUsername();
    /// <summary>
    /// ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
    /// </summary>
    int64_t getVehicleId() const;
    void setVehicleId(int64_t const value);
    bool vehicleIdIsSet() const;
    void unsetVehicleId();

protected:
    bool m_EldAdverseWeatherExemptionEnabled;
    bool m_EldAdverseWeatherExemptionEnabledIsSet;
    bool m_EldBigDayExemptionEnabled;
    bool m_EldBigDayExemptionEnabledIsSet;
    int32_t m_EldDayStartHour;
    bool m_EldDayStartHourIsSet;
    bool m_EldExempt;
    bool m_EldExemptIsSet;
    std::string m_EldExemptReason;
    bool m_EldExemptReasonIsSet;
    bool m_EldPcEnabled;
    bool m_EldPcEnabledIsSet;
    bool m_EldYmEnabled;
    bool m_EldYmEnabledIsSet;
    std::map<std::string, std::string> m_ExternalIds;
    bool m_ExternalIdsIsSet;
    int64_t m_GroupId;
    bool m_GroupIdIsSet;
    std::string m_LicenseNumber;
    bool m_LicenseNumberIsSet;
    std::string m_LicenseState;
    bool m_LicenseStateIsSet;
    std::string m_Name;

    std::string m_Notes;
    bool m_NotesIsSet;
    std::string m_Phone;
    bool m_PhoneIsSet;
    std::string m_Username;
    bool m_UsernameIsSet;
    int64_t m_VehicleId;
    bool m_VehicleIdIsSet;
};

}
}
}
}

#endif /* DriverBase_H_ */
