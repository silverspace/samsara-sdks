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



#include "DriversSummaryResponse_Summaries.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

DriversSummaryResponse_Summaries::DriversSummaryResponse_Summaries()
{
    m_DriverId = 0L;
    m_DriverIdIsSet = false;
    m_DistanceMiles = 0.0;
    m_DistanceMilesIsSet = false;
    m_DriveMs = 0L;
    m_DriveMsIsSet = false;
    m_ActiveMs = 0L;
    m_ActiveMsIsSet = false;
    m_DriverUsername = utility::conversions::to_string_t("");
    m_DriverUsernameIsSet = false;
    m_GroupId = 0L;
    m_GroupIdIsSet = false;
    m_DriverName = utility::conversions::to_string_t("");
    m_DriverNameIsSet = false;
    m_OnDutyMs = 0L;
    m_OnDutyMsIsSet = false;
}

DriversSummaryResponse_Summaries::~DriversSummaryResponse_Summaries()
{
}

void DriversSummaryResponse_Summaries::validate()
{
    // TODO: implement validation
}

web::json::value DriversSummaryResponse_Summaries::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_DriverIdIsSet)
    {
        val[utility::conversions::to_string_t("driverId")] = ModelBase::toJson(m_DriverId);
    }
    if(m_DistanceMilesIsSet)
    {
        val[utility::conversions::to_string_t("distanceMiles")] = ModelBase::toJson(m_DistanceMiles);
    }
    if(m_DriveMsIsSet)
    {
        val[utility::conversions::to_string_t("driveMs")] = ModelBase::toJson(m_DriveMs);
    }
    if(m_ActiveMsIsSet)
    {
        val[utility::conversions::to_string_t("activeMs")] = ModelBase::toJson(m_ActiveMs);
    }
    if(m_DriverUsernameIsSet)
    {
        val[utility::conversions::to_string_t("driverUsername")] = ModelBase::toJson(m_DriverUsername);
    }
    if(m_GroupIdIsSet)
    {
        val[utility::conversions::to_string_t("groupId")] = ModelBase::toJson(m_GroupId);
    }
    if(m_DriverNameIsSet)
    {
        val[utility::conversions::to_string_t("driverName")] = ModelBase::toJson(m_DriverName);
    }
    if(m_OnDutyMsIsSet)
    {
        val[utility::conversions::to_string_t("onDutyMs")] = ModelBase::toJson(m_OnDutyMs);
    }

    return val;
}

void DriversSummaryResponse_Summaries::fromJson(const web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("driverId")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("driverId"));
        if(!fieldValue.is_null())
        {
            setDriverId(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("distanceMiles")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("distanceMiles"));
        if(!fieldValue.is_null())
        {
            setDistanceMiles(ModelBase::doubleFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("driveMs")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("driveMs"));
        if(!fieldValue.is_null())
        {
            setDriveMs(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("activeMs")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("activeMs"));
        if(!fieldValue.is_null())
        {
            setActiveMs(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("driverUsername")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("driverUsername"));
        if(!fieldValue.is_null())
        {
            setDriverUsername(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("groupId")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("groupId"));
        if(!fieldValue.is_null())
        {
            setGroupId(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("driverName")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("driverName"));
        if(!fieldValue.is_null())
        {
            setDriverName(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("onDutyMs")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("onDutyMs"));
        if(!fieldValue.is_null())
        {
            setOnDutyMs(ModelBase::int64_tFromJson(fieldValue));
        }
    }
}

void DriversSummaryResponse_Summaries::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_DriverIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("driverId"), m_DriverId));
    }
    if(m_DistanceMilesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("distanceMiles"), m_DistanceMiles));
    }
    if(m_DriveMsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("driveMs"), m_DriveMs));
    }
    if(m_ActiveMsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("activeMs"), m_ActiveMs));
    }
    if(m_DriverUsernameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("driverUsername"), m_DriverUsername));
    }
    if(m_GroupIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("groupId"), m_GroupId));
    }
    if(m_DriverNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("driverName"), m_DriverName));
    }
    if(m_OnDutyMsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("onDutyMs"), m_OnDutyMs));
    }
}

void DriversSummaryResponse_Summaries::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("driverId")))
    {
        setDriverId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("driverId"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("distanceMiles")))
    {
        setDistanceMiles(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("distanceMiles"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("driveMs")))
    {
        setDriveMs(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("driveMs"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("activeMs")))
    {
        setActiveMs(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("activeMs"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("driverUsername")))
    {
        setDriverUsername(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("driverUsername"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("groupId")))
    {
        setGroupId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("groupId"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("driverName")))
    {
        setDriverName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("driverName"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("onDutyMs")))
    {
        setOnDutyMs(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("onDutyMs"))));
    }
}

int64_t DriversSummaryResponse_Summaries::getDriverId() const
{
    return m_DriverId;
}

void DriversSummaryResponse_Summaries::setDriverId(int64_t value)
{
    m_DriverId = value;
    m_DriverIdIsSet = true;
}

bool DriversSummaryResponse_Summaries::driverIdIsSet() const
{
    return m_DriverIdIsSet;
}

void DriversSummaryResponse_Summaries::unsetDriverId()
{
    m_DriverIdIsSet = false;
}

double DriversSummaryResponse_Summaries::getDistanceMiles() const
{
    return m_DistanceMiles;
}

void DriversSummaryResponse_Summaries::setDistanceMiles(double value)
{
    m_DistanceMiles = value;
    m_DistanceMilesIsSet = true;
}

bool DriversSummaryResponse_Summaries::distanceMilesIsSet() const
{
    return m_DistanceMilesIsSet;
}

void DriversSummaryResponse_Summaries::unsetDistanceMiles()
{
    m_DistanceMilesIsSet = false;
}

int64_t DriversSummaryResponse_Summaries::getDriveMs() const
{
    return m_DriveMs;
}

void DriversSummaryResponse_Summaries::setDriveMs(int64_t value)
{
    m_DriveMs = value;
    m_DriveMsIsSet = true;
}

bool DriversSummaryResponse_Summaries::driveMsIsSet() const
{
    return m_DriveMsIsSet;
}

void DriversSummaryResponse_Summaries::unsetDriveMs()
{
    m_DriveMsIsSet = false;
}

int64_t DriversSummaryResponse_Summaries::getActiveMs() const
{
    return m_ActiveMs;
}

void DriversSummaryResponse_Summaries::setActiveMs(int64_t value)
{
    m_ActiveMs = value;
    m_ActiveMsIsSet = true;
}

bool DriversSummaryResponse_Summaries::activeMsIsSet() const
{
    return m_ActiveMsIsSet;
}

void DriversSummaryResponse_Summaries::unsetActiveMs()
{
    m_ActiveMsIsSet = false;
}

utility::string_t DriversSummaryResponse_Summaries::getDriverUsername() const
{
    return m_DriverUsername;
}

void DriversSummaryResponse_Summaries::setDriverUsername(const utility::string_t& value)
{
    m_DriverUsername = value;
    m_DriverUsernameIsSet = true;
}

bool DriversSummaryResponse_Summaries::driverUsernameIsSet() const
{
    return m_DriverUsernameIsSet;
}

void DriversSummaryResponse_Summaries::unsetDriverUsername()
{
    m_DriverUsernameIsSet = false;
}

int64_t DriversSummaryResponse_Summaries::getGroupId() const
{
    return m_GroupId;
}

void DriversSummaryResponse_Summaries::setGroupId(int64_t value)
{
    m_GroupId = value;
    m_GroupIdIsSet = true;
}

bool DriversSummaryResponse_Summaries::groupIdIsSet() const
{
    return m_GroupIdIsSet;
}

void DriversSummaryResponse_Summaries::unsetGroupId()
{
    m_GroupIdIsSet = false;
}

utility::string_t DriversSummaryResponse_Summaries::getDriverName() const
{
    return m_DriverName;
}

void DriversSummaryResponse_Summaries::setDriverName(const utility::string_t& value)
{
    m_DriverName = value;
    m_DriverNameIsSet = true;
}

bool DriversSummaryResponse_Summaries::driverNameIsSet() const
{
    return m_DriverNameIsSet;
}

void DriversSummaryResponse_Summaries::unsetDriverName()
{
    m_DriverNameIsSet = false;
}

int64_t DriversSummaryResponse_Summaries::getOnDutyMs() const
{
    return m_OnDutyMs;
}

void DriversSummaryResponse_Summaries::setOnDutyMs(int64_t value)
{
    m_OnDutyMs = value;
    m_OnDutyMsIsSet = true;
}

bool DriversSummaryResponse_Summaries::onDutyMsIsSet() const
{
    return m_OnDutyMsIsSet;
}

void DriversSummaryResponse_Summaries::unsetOnDutyMs()
{
    m_OnDutyMsIsSet = false;
}

}
}
}
}

