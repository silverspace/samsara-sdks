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
 * Driver.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Driver_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Driver_H_


#include "../ModelBase.h"

#include "TagMetadata.h"
#include <cpprest/details/basic_types.h>
#include "DriverBase.h"
#include <map>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  Driver
    : public ModelBase
{
public:
    Driver();
    virtual ~Driver();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Driver members

    /// <summary>
    /// Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
    /// </summary>
    bool isEldAdverseWeatherExemptionEnabled() const;
    bool eldAdverseWeatherExemptionEnabledIsSet() const;
    void unsetEldAdverseWeatherExemptionEnabled();

    void setEldAdverseWeatherExemptionEnabled(bool value);

    /// <summary>
    /// Flag indicating this driver may use Big Day excemptions in ELD logs.
    /// </summary>
    bool isEldBigDayExemptionEnabled() const;
    bool eldBigDayExemptionEnabledIsSet() const;
    void unsetEldBigDayExemptionEnabled();

    void setEldBigDayExemptionEnabled(bool value);

    /// <summary>
    /// 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
    /// </summary>
    int32_t getEldDayStartHour() const;
    bool eldDayStartHourIsSet() const;
    void unsetEldDayStartHour();

    void setEldDayStartHour(int32_t value);

    /// <summary>
    /// Flag indicating this driver is exempt from the Electronic Logging Mandate.
    /// </summary>
    bool isEldExempt() const;
    bool eldExemptIsSet() const;
    void unsetEldExempt();

    void setEldExempt(bool value);

    /// <summary>
    /// Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
    /// </summary>
    utility::string_t getEldExemptReason() const;
    bool eldExemptReasonIsSet() const;
    void unsetEldExemptReason();

    void setEldExemptReason(const utility::string_t& value);

    /// <summary>
    /// Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
    /// </summary>
    bool isEldPcEnabled() const;
    bool eldPcEnabledIsSet() const;
    void unsetEldPcEnabled();

    void setEldPcEnabled(bool value);

    /// <summary>
    /// Flag indicating this driver may select the Yard Move duty status in ELD logs.
    /// </summary>
    bool isEldYmEnabled() const;
    bool eldYmEnabledIsSet() const;
    void unsetEldYmEnabled();

    void setEldYmEnabled(bool value);

    /// <summary>
    /// Dictionary of external IDs (string key-value pairs)
    /// </summary>
    std::map<utility::string_t, utility::string_t>& getExternalIds();
    bool externalIdsIsSet() const;
    void unsetExternalIds();

    void setExternalIds(const std::map<utility::string_t, utility::string_t>& value);

    /// <summary>
    /// ID of the group if the organization has multiple groups (uncommon).
    /// </summary>
    int64_t getGroupId() const;
    bool groupIdIsSet() const;
    void unsetGroupId();

    void setGroupId(int64_t value);

    /// <summary>
    /// Driver&#39;s state issued license number.
    /// </summary>
    utility::string_t getLicenseNumber() const;
    bool licenseNumberIsSet() const;
    void unsetLicenseNumber();

    void setLicenseNumber(const utility::string_t& value);

    /// <summary>
    /// Abbreviation of state that issued driver&#39;s license.
    /// </summary>
    utility::string_t getLicenseState() const;
    bool licenseStateIsSet() const;
    void unsetLicenseState();

    void setLicenseState(const utility::string_t& value);

    /// <summary>
    /// Driver&#39;s name.
    /// </summary>
    utility::string_t getName() const;
    
    void setName(const utility::string_t& value);

    /// <summary>
    /// Notes about the driver.
    /// </summary>
    utility::string_t getNotes() const;
    bool notesIsSet() const;
    void unsetNotes();

    void setNotes(const utility::string_t& value);

    /// <summary>
    /// Driver&#39;s phone number. Please include only digits, ex. 4157771234
    /// </summary>
    utility::string_t getPhone() const;
    bool phoneIsSet() const;
    void unsetPhone();

    void setPhone(const utility::string_t& value);

    /// <summary>
    /// Driver&#39;s login username into the driver app.
    /// </summary>
    utility::string_t getUsername() const;
    bool usernameIsSet() const;
    void unsetUsername();

    void setUsername(const utility::string_t& value);

    /// <summary>
    /// ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
    /// </summary>
    int64_t getVehicleId() const;
    bool vehicleIdIsSet() const;
    void unsetVehicleId();

    void setVehicleId(int64_t value);

    /// <summary>
    /// ID of the driver.
    /// </summary>
    int64_t getId() const;
    
    void setId(int64_t value);

    /// <summary>
    /// True if the driver account has been deactivated.
    /// </summary>
    bool isIsDeactivated() const;
    bool isDeactivatedIsSet() const;
    void unsetIsDeactivated();

    void setIsDeactivated(bool value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<TagMetadata>>& getTags();
    bool tagsIsSet() const;
    void unsetTags();

    void setTags(const std::vector<std::shared_ptr<TagMetadata>>& value);


protected:
    bool m_EldAdverseWeatherExemptionEnabled;
    bool m_EldAdverseWeatherExemptionEnabledIsSet;
    bool m_EldBigDayExemptionEnabled;
    bool m_EldBigDayExemptionEnabledIsSet;
    int32_t m_EldDayStartHour;
    bool m_EldDayStartHourIsSet;
    bool m_EldExempt;
    bool m_EldExemptIsSet;
    utility::string_t m_EldExemptReason;
    bool m_EldExemptReasonIsSet;
    bool m_EldPcEnabled;
    bool m_EldPcEnabledIsSet;
    bool m_EldYmEnabled;
    bool m_EldYmEnabledIsSet;
    std::map<utility::string_t, utility::string_t> m_ExternalIds;
    bool m_ExternalIdsIsSet;
    int64_t m_GroupId;
    bool m_GroupIdIsSet;
    utility::string_t m_LicenseNumber;
    bool m_LicenseNumberIsSet;
    utility::string_t m_LicenseState;
    bool m_LicenseStateIsSet;
    utility::string_t m_Name;
        utility::string_t m_Notes;
    bool m_NotesIsSet;
    utility::string_t m_Phone;
    bool m_PhoneIsSet;
    utility::string_t m_Username;
    bool m_UsernameIsSet;
    int64_t m_VehicleId;
    bool m_VehicleIdIsSet;
    int64_t m_Id;
        bool m_IsDeactivated;
    bool m_IsDeactivatedIsSet;
    std::vector<std::shared_ptr<TagMetadata>> m_Tags;
    bool m_TagsIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Driver_H_ */
