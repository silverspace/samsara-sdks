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



#include "DriverBase.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

DriverBase::DriverBase()
{
    m_EldAdverseWeatherExemptionEnabled = false;
    m_EldAdverseWeatherExemptionEnabledIsSet = false;
    m_EldBigDayExemptionEnabled = false;
    m_EldBigDayExemptionEnabledIsSet = false;
    m_EldDayStartHour = 0;
    m_EldDayStartHourIsSet = false;
    m_EldExempt = false;
    m_EldExemptIsSet = false;
    m_EldExemptReason = utility::conversions::to_string_t("");
    m_EldExemptReasonIsSet = false;
    m_EldPcEnabled = false;
    m_EldPcEnabledIsSet = false;
    m_EldYmEnabled = false;
    m_EldYmEnabledIsSet = false;
    m_ExternalIdsIsSet = false;
    m_GroupId = 0L;
    m_GroupIdIsSet = false;
    m_LicenseNumber = utility::conversions::to_string_t("");
    m_LicenseNumberIsSet = false;
    m_LicenseState = utility::conversions::to_string_t("");
    m_LicenseStateIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_Notes = utility::conversions::to_string_t("");
    m_NotesIsSet = false;
    m_Phone = utility::conversions::to_string_t("");
    m_PhoneIsSet = false;
    m_Username = utility::conversions::to_string_t("");
    m_UsernameIsSet = false;
    m_VehicleId = 0L;
    m_VehicleIdIsSet = false;
}

DriverBase::~DriverBase()
{
}

void DriverBase::validate()
{
    // TODO: implement validation
}

web::json::value DriverBase::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_EldAdverseWeatherExemptionEnabledIsSet)
    {
        val[utility::conversions::to_string_t("eldAdverseWeatherExemptionEnabled")] = ModelBase::toJson(m_EldAdverseWeatherExemptionEnabled);
    }
    if(m_EldBigDayExemptionEnabledIsSet)
    {
        val[utility::conversions::to_string_t("eldBigDayExemptionEnabled")] = ModelBase::toJson(m_EldBigDayExemptionEnabled);
    }
    if(m_EldDayStartHourIsSet)
    {
        val[utility::conversions::to_string_t("eldDayStartHour")] = ModelBase::toJson(m_EldDayStartHour);
    }
    if(m_EldExemptIsSet)
    {
        val[utility::conversions::to_string_t("eldExempt")] = ModelBase::toJson(m_EldExempt);
    }
    if(m_EldExemptReasonIsSet)
    {
        val[utility::conversions::to_string_t("eldExemptReason")] = ModelBase::toJson(m_EldExemptReason);
    }
    if(m_EldPcEnabledIsSet)
    {
        val[utility::conversions::to_string_t("eldPcEnabled")] = ModelBase::toJson(m_EldPcEnabled);
    }
    if(m_EldYmEnabledIsSet)
    {
        val[utility::conversions::to_string_t("eldYmEnabled")] = ModelBase::toJson(m_EldYmEnabled);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_ExternalIds )
        {
            web::json::value tmp = web::json::value::object();
            tmp[utility::conversions::to_string_t("key")] = ModelBase::toJson(item.first);
            tmp[utility::conversions::to_string_t("value")] = ModelBase::toJson(item.second);
            jsonArray.push_back(tmp);
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("externalIds")] = web::json::value::array(jsonArray);
        }
    }
    if(m_GroupIdIsSet)
    {
        val[utility::conversions::to_string_t("groupId")] = ModelBase::toJson(m_GroupId);
    }
    if(m_LicenseNumberIsSet)
    {
        val[utility::conversions::to_string_t("licenseNumber")] = ModelBase::toJson(m_LicenseNumber);
    }
    if(m_LicenseStateIsSet)
    {
        val[utility::conversions::to_string_t("licenseState")] = ModelBase::toJson(m_LicenseState);
    }
    val[utility::conversions::to_string_t("name")] = ModelBase::toJson(m_Name);
    if(m_NotesIsSet)
    {
        val[utility::conversions::to_string_t("notes")] = ModelBase::toJson(m_Notes);
    }
    if(m_PhoneIsSet)
    {
        val[utility::conversions::to_string_t("phone")] = ModelBase::toJson(m_Phone);
    }
    if(m_UsernameIsSet)
    {
        val[utility::conversions::to_string_t("username")] = ModelBase::toJson(m_Username);
    }
    if(m_VehicleIdIsSet)
    {
        val[utility::conversions::to_string_t("vehicleId")] = ModelBase::toJson(m_VehicleId);
    }

    return val;
}

void DriverBase::fromJson(const web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("eldAdverseWeatherExemptionEnabled")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("eldAdverseWeatherExemptionEnabled"));
        if(!fieldValue.is_null())
        {
            setEldAdverseWeatherExemptionEnabled(ModelBase::boolFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("eldBigDayExemptionEnabled")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("eldBigDayExemptionEnabled"));
        if(!fieldValue.is_null())
        {
            setEldBigDayExemptionEnabled(ModelBase::boolFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("eldDayStartHour")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("eldDayStartHour"));
        if(!fieldValue.is_null())
        {
            setEldDayStartHour(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("eldExempt")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("eldExempt"));
        if(!fieldValue.is_null())
        {
            setEldExempt(ModelBase::boolFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("eldExemptReason")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("eldExemptReason"));
        if(!fieldValue.is_null())
        {
            setEldExemptReason(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("eldPcEnabled")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("eldPcEnabled"));
        if(!fieldValue.is_null())
        {
            setEldPcEnabled(ModelBase::boolFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("eldYmEnabled")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("eldYmEnabled"));
        if(!fieldValue.is_null())
        {
            setEldYmEnabled(ModelBase::boolFromJson(fieldValue));
        }
    }
    {
        m_ExternalIds.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("externalIds")))
        {
        for( const auto& item : val.at(utility::conversions::to_string_t("externalIds")).as_array() )
        {  
            if(item.has_field(utility::conversions::to_string_t("key")))
            {
                utility::string_t key = ModelBase::stringFromJson(item.at(utility::conversions::to_string_t("key")));
                m_ExternalIds.insert(std::pair<utility::string_t,utility::string_t>( key, ModelBase::stringFromJson(item.at(utility::conversions::to_string_t("value")))));
            }
        }
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
    if(val.has_field(utility::conversions::to_string_t("licenseNumber")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("licenseNumber"));
        if(!fieldValue.is_null())
        {
            setLicenseNumber(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("licenseState")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("licenseState"));
        if(!fieldValue.is_null())
        {
            setLicenseState(ModelBase::stringFromJson(fieldValue));
        }
    }
    setName(ModelBase::stringFromJson(val.at(utility::conversions::to_string_t("name"))));
    if(val.has_field(utility::conversions::to_string_t("notes")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("notes"));
        if(!fieldValue.is_null())
        {
            setNotes(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("phone")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("phone"));
        if(!fieldValue.is_null())
        {
            setPhone(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("username")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("username"));
        if(!fieldValue.is_null())
        {
            setUsername(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("vehicleId")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("vehicleId"));
        if(!fieldValue.is_null())
        {
            setVehicleId(ModelBase::int64_tFromJson(fieldValue));
        }
    }
}

void DriverBase::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_EldAdverseWeatherExemptionEnabledIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("eldAdverseWeatherExemptionEnabled"), m_EldAdverseWeatherExemptionEnabled));
    }
    if(m_EldBigDayExemptionEnabledIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("eldBigDayExemptionEnabled"), m_EldBigDayExemptionEnabled));
    }
    if(m_EldDayStartHourIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("eldDayStartHour"), m_EldDayStartHour));
    }
    if(m_EldExemptIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("eldExempt"), m_EldExempt));
    }
    if(m_EldExemptReasonIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("eldExemptReason"), m_EldExemptReason));
    }
    if(m_EldPcEnabledIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("eldPcEnabled"), m_EldPcEnabled));
    }
    if(m_EldYmEnabledIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("eldYmEnabled"), m_EldYmEnabled));
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_ExternalIds )
        {
            web::json::value tmp = web::json::value::object();
            tmp[utility::conversions::to_string_t("key")] = ModelBase::toJson(item.first);
            tmp[utility::conversions::to_string_t("value")] = ModelBase::toJson(item.second);
            jsonArray.push_back(tmp);
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("externalIds"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    if(m_GroupIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("groupId"), m_GroupId));
    }
    if(m_LicenseNumberIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("licenseNumber"), m_LicenseNumber));
    }
    if(m_LicenseStateIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("licenseState"), m_LicenseState));
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("name"), m_Name));
    if(m_NotesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("notes"), m_Notes));
    }
    if(m_PhoneIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("phone"), m_Phone));
    }
    if(m_UsernameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("username"), m_Username));
    }
    if(m_VehicleIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("vehicleId"), m_VehicleId));
    }
}

void DriverBase::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("eldAdverseWeatherExemptionEnabled")))
    {
        setEldAdverseWeatherExemptionEnabled(ModelBase::boolFromHttpContent(multipart->getContent(utility::conversions::to_string_t("eldAdverseWeatherExemptionEnabled"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("eldBigDayExemptionEnabled")))
    {
        setEldBigDayExemptionEnabled(ModelBase::boolFromHttpContent(multipart->getContent(utility::conversions::to_string_t("eldBigDayExemptionEnabled"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("eldDayStartHour")))
    {
        setEldDayStartHour(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("eldDayStartHour"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("eldExempt")))
    {
        setEldExempt(ModelBase::boolFromHttpContent(multipart->getContent(utility::conversions::to_string_t("eldExempt"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("eldExemptReason")))
    {
        setEldExemptReason(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("eldExemptReason"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("eldPcEnabled")))
    {
        setEldPcEnabled(ModelBase::boolFromHttpContent(multipart->getContent(utility::conversions::to_string_t("eldPcEnabled"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("eldYmEnabled")))
    {
        setEldYmEnabled(ModelBase::boolFromHttpContent(multipart->getContent(utility::conversions::to_string_t("eldYmEnabled"))));
    }
    {
        m_ExternalIds.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("externalIds")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("externalIds"))));
        for( auto& item : jsonArray.as_array() )
        {
            utility::string_t key;
            if(item.has_field(utility::conversions::to_string_t("key")))
            {
                key = ModelBase::stringFromJson(item[utility::conversions::to_string_t("key")]);
            }
            m_ExternalIds.insert(std::pair<utility::string_t,utility::string_t>( key, ModelBase::stringFromJson(item[utility::conversions::to_string_t("value")])));
        }
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("groupId")))
    {
        setGroupId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("groupId"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("licenseNumber")))
    {
        setLicenseNumber(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("licenseNumber"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("licenseState")))
    {
        setLicenseState(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("licenseState"))));
    }
    setName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("name"))));
    if(multipart->hasContent(utility::conversions::to_string_t("notes")))
    {
        setNotes(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("notes"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("phone")))
    {
        setPhone(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("phone"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("username")))
    {
        setUsername(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("username"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("vehicleId")))
    {
        setVehicleId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("vehicleId"))));
    }
}

bool DriverBase::isEldAdverseWeatherExemptionEnabled() const
{
    return m_EldAdverseWeatherExemptionEnabled;
}

void DriverBase::setEldAdverseWeatherExemptionEnabled(bool value)
{
    m_EldAdverseWeatherExemptionEnabled = value;
    m_EldAdverseWeatherExemptionEnabledIsSet = true;
}

bool DriverBase::eldAdverseWeatherExemptionEnabledIsSet() const
{
    return m_EldAdverseWeatherExemptionEnabledIsSet;
}

void DriverBase::unsetEldAdverseWeatherExemptionEnabled()
{
    m_EldAdverseWeatherExemptionEnabledIsSet = false;
}

bool DriverBase::isEldBigDayExemptionEnabled() const
{
    return m_EldBigDayExemptionEnabled;
}

void DriverBase::setEldBigDayExemptionEnabled(bool value)
{
    m_EldBigDayExemptionEnabled = value;
    m_EldBigDayExemptionEnabledIsSet = true;
}

bool DriverBase::eldBigDayExemptionEnabledIsSet() const
{
    return m_EldBigDayExemptionEnabledIsSet;
}

void DriverBase::unsetEldBigDayExemptionEnabled()
{
    m_EldBigDayExemptionEnabledIsSet = false;
}

int32_t DriverBase::getEldDayStartHour() const
{
    return m_EldDayStartHour;
}

void DriverBase::setEldDayStartHour(int32_t value)
{
    m_EldDayStartHour = value;
    m_EldDayStartHourIsSet = true;
}

bool DriverBase::eldDayStartHourIsSet() const
{
    return m_EldDayStartHourIsSet;
}

void DriverBase::unsetEldDayStartHour()
{
    m_EldDayStartHourIsSet = false;
}

bool DriverBase::isEldExempt() const
{
    return m_EldExempt;
}

void DriverBase::setEldExempt(bool value)
{
    m_EldExempt = value;
    m_EldExemptIsSet = true;
}

bool DriverBase::eldExemptIsSet() const
{
    return m_EldExemptIsSet;
}

void DriverBase::unsetEldExempt()
{
    m_EldExemptIsSet = false;
}

utility::string_t DriverBase::getEldExemptReason() const
{
    return m_EldExemptReason;
}

void DriverBase::setEldExemptReason(const utility::string_t& value)
{
    m_EldExemptReason = value;
    m_EldExemptReasonIsSet = true;
}

bool DriverBase::eldExemptReasonIsSet() const
{
    return m_EldExemptReasonIsSet;
}

void DriverBase::unsetEldExemptReason()
{
    m_EldExemptReasonIsSet = false;
}

bool DriverBase::isEldPcEnabled() const
{
    return m_EldPcEnabled;
}

void DriverBase::setEldPcEnabled(bool value)
{
    m_EldPcEnabled = value;
    m_EldPcEnabledIsSet = true;
}

bool DriverBase::eldPcEnabledIsSet() const
{
    return m_EldPcEnabledIsSet;
}

void DriverBase::unsetEldPcEnabled()
{
    m_EldPcEnabledIsSet = false;
}

bool DriverBase::isEldYmEnabled() const
{
    return m_EldYmEnabled;
}

void DriverBase::setEldYmEnabled(bool value)
{
    m_EldYmEnabled = value;
    m_EldYmEnabledIsSet = true;
}

bool DriverBase::eldYmEnabledIsSet() const
{
    return m_EldYmEnabledIsSet;
}

void DriverBase::unsetEldYmEnabled()
{
    m_EldYmEnabledIsSet = false;
}

std::map<utility::string_t, utility::string_t>& DriverBase::getExternalIds()
{
    return m_ExternalIds;
}

void DriverBase::setExternalIds(const std::map<utility::string_t, utility::string_t>& value)
{
    m_ExternalIds = value;
    m_ExternalIdsIsSet = true;
}

bool DriverBase::externalIdsIsSet() const
{
    return m_ExternalIdsIsSet;
}

void DriverBase::unsetExternalIds()
{
    m_ExternalIdsIsSet = false;
}

int64_t DriverBase::getGroupId() const
{
    return m_GroupId;
}

void DriverBase::setGroupId(int64_t value)
{
    m_GroupId = value;
    m_GroupIdIsSet = true;
}

bool DriverBase::groupIdIsSet() const
{
    return m_GroupIdIsSet;
}

void DriverBase::unsetGroupId()
{
    m_GroupIdIsSet = false;
}

utility::string_t DriverBase::getLicenseNumber() const
{
    return m_LicenseNumber;
}

void DriverBase::setLicenseNumber(const utility::string_t& value)
{
    m_LicenseNumber = value;
    m_LicenseNumberIsSet = true;
}

bool DriverBase::licenseNumberIsSet() const
{
    return m_LicenseNumberIsSet;
}

void DriverBase::unsetLicenseNumber()
{
    m_LicenseNumberIsSet = false;
}

utility::string_t DriverBase::getLicenseState() const
{
    return m_LicenseState;
}

void DriverBase::setLicenseState(const utility::string_t& value)
{
    m_LicenseState = value;
    m_LicenseStateIsSet = true;
}

bool DriverBase::licenseStateIsSet() const
{
    return m_LicenseStateIsSet;
}

void DriverBase::unsetLicenseState()
{
    m_LicenseStateIsSet = false;
}

utility::string_t DriverBase::getName() const
{
    return m_Name;
}

void DriverBase::setName(const utility::string_t& value)
{
    m_Name = value;
    
}

utility::string_t DriverBase::getNotes() const
{
    return m_Notes;
}

void DriverBase::setNotes(const utility::string_t& value)
{
    m_Notes = value;
    m_NotesIsSet = true;
}

bool DriverBase::notesIsSet() const
{
    return m_NotesIsSet;
}

void DriverBase::unsetNotes()
{
    m_NotesIsSet = false;
}

utility::string_t DriverBase::getPhone() const
{
    return m_Phone;
}

void DriverBase::setPhone(const utility::string_t& value)
{
    m_Phone = value;
    m_PhoneIsSet = true;
}

bool DriverBase::phoneIsSet() const
{
    return m_PhoneIsSet;
}

void DriverBase::unsetPhone()
{
    m_PhoneIsSet = false;
}

utility::string_t DriverBase::getUsername() const
{
    return m_Username;
}

void DriverBase::setUsername(const utility::string_t& value)
{
    m_Username = value;
    m_UsernameIsSet = true;
}

bool DriverBase::usernameIsSet() const
{
    return m_UsernameIsSet;
}

void DriverBase::unsetUsername()
{
    m_UsernameIsSet = false;
}

int64_t DriverBase::getVehicleId() const
{
    return m_VehicleId;
}

void DriverBase::setVehicleId(int64_t value)
{
    m_VehicleId = value;
    m_VehicleIdIsSet = true;
}

bool DriverBase::vehicleIdIsSet() const
{
    return m_VehicleIdIsSet;
}

void DriverBase::unsetVehicleId()
{
    m_VehicleIdIsSet = false;
}

}
}
}
}

