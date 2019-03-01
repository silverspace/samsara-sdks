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



#include "DvirBase_mechanicOrAgentSignature.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

DvirBase_mechanicOrAgentSignature::DvirBase_mechanicOrAgentSignature()
{
    m_MechanicUserId = 0L;
    m_MechanicUserIdIsSet = false;
    m_DriverId = 0L;
    m_DriverIdIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_SignedAt = 0L;
    m_SignedAtIsSet = false;
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_Email = utility::conversions::to_string_t("");
    m_EmailIsSet = false;
    m_Username = utility::conversions::to_string_t("");
    m_UsernameIsSet = false;
}

DvirBase_mechanicOrAgentSignature::~DvirBase_mechanicOrAgentSignature()
{
}

void DvirBase_mechanicOrAgentSignature::validate()
{
    // TODO: implement validation
}

web::json::value DvirBase_mechanicOrAgentSignature::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_MechanicUserIdIsSet)
    {
        val[utility::conversions::to_string_t("mechanicUserId")] = ModelBase::toJson(m_MechanicUserId);
    }
    if(m_DriverIdIsSet)
    {
        val[utility::conversions::to_string_t("driverId")] = ModelBase::toJson(m_DriverId);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t("name")] = ModelBase::toJson(m_Name);
    }
    if(m_SignedAtIsSet)
    {
        val[utility::conversions::to_string_t("signedAt")] = ModelBase::toJson(m_SignedAt);
    }
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t("type")] = ModelBase::toJson(m_Type);
    }
    if(m_EmailIsSet)
    {
        val[utility::conversions::to_string_t("email")] = ModelBase::toJson(m_Email);
    }
    if(m_UsernameIsSet)
    {
        val[utility::conversions::to_string_t("username")] = ModelBase::toJson(m_Username);
    }

    return val;
}

void DvirBase_mechanicOrAgentSignature::fromJson(const web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("mechanicUserId")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("mechanicUserId"));
        if(!fieldValue.is_null())
        {
            setMechanicUserId(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("driverId")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("driverId"));
        if(!fieldValue.is_null())
        {
            setDriverId(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("name")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("name"));
        if(!fieldValue.is_null())
        {
            setName(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("signedAt")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("signedAt"));
        if(!fieldValue.is_null())
        {
            setSignedAt(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("type")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("type"));
        if(!fieldValue.is_null())
        {
            setType(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("email")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("email"));
        if(!fieldValue.is_null())
        {
            setEmail(ModelBase::stringFromJson(fieldValue));
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
}

void DvirBase_mechanicOrAgentSignature::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_MechanicUserIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("mechanicUserId"), m_MechanicUserId));
    }
    if(m_DriverIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("driverId"), m_DriverId));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("name"), m_Name));
    }
    if(m_SignedAtIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("signedAt"), m_SignedAt));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("type"), m_Type));
    }
    if(m_EmailIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("email"), m_Email));
    }
    if(m_UsernameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("username"), m_Username));
    }
}

void DvirBase_mechanicOrAgentSignature::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("mechanicUserId")))
    {
        setMechanicUserId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("mechanicUserId"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("driverId")))
    {
        setDriverId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("driverId"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("name")))
    {
        setName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("name"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("signedAt")))
    {
        setSignedAt(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("signedAt"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("type")))
    {
        setType(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("type"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("email")))
    {
        setEmail(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("email"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("username")))
    {
        setUsername(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("username"))));
    }
}

int64_t DvirBase_mechanicOrAgentSignature::getMechanicUserId() const
{
    return m_MechanicUserId;
}

void DvirBase_mechanicOrAgentSignature::setMechanicUserId(int64_t value)
{
    m_MechanicUserId = value;
    m_MechanicUserIdIsSet = true;
}

bool DvirBase_mechanicOrAgentSignature::mechanicUserIdIsSet() const
{
    return m_MechanicUserIdIsSet;
}

void DvirBase_mechanicOrAgentSignature::unsetMechanicUserId()
{
    m_MechanicUserIdIsSet = false;
}

int64_t DvirBase_mechanicOrAgentSignature::getDriverId() const
{
    return m_DriverId;
}

void DvirBase_mechanicOrAgentSignature::setDriverId(int64_t value)
{
    m_DriverId = value;
    m_DriverIdIsSet = true;
}

bool DvirBase_mechanicOrAgentSignature::driverIdIsSet() const
{
    return m_DriverIdIsSet;
}

void DvirBase_mechanicOrAgentSignature::unsetDriverId()
{
    m_DriverIdIsSet = false;
}

utility::string_t DvirBase_mechanicOrAgentSignature::getName() const
{
    return m_Name;
}

void DvirBase_mechanicOrAgentSignature::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool DvirBase_mechanicOrAgentSignature::nameIsSet() const
{
    return m_NameIsSet;
}

void DvirBase_mechanicOrAgentSignature::unsetName()
{
    m_NameIsSet = false;
}

int64_t DvirBase_mechanicOrAgentSignature::getSignedAt() const
{
    return m_SignedAt;
}

void DvirBase_mechanicOrAgentSignature::setSignedAt(int64_t value)
{
    m_SignedAt = value;
    m_SignedAtIsSet = true;
}

bool DvirBase_mechanicOrAgentSignature::signedAtIsSet() const
{
    return m_SignedAtIsSet;
}

void DvirBase_mechanicOrAgentSignature::unsetSignedAt()
{
    m_SignedAtIsSet = false;
}

utility::string_t DvirBase_mechanicOrAgentSignature::getType() const
{
    return m_Type;
}

void DvirBase_mechanicOrAgentSignature::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool DvirBase_mechanicOrAgentSignature::typeIsSet() const
{
    return m_TypeIsSet;
}

void DvirBase_mechanicOrAgentSignature::unsetType()
{
    m_TypeIsSet = false;
}

utility::string_t DvirBase_mechanicOrAgentSignature::getEmail() const
{
    return m_Email;
}

void DvirBase_mechanicOrAgentSignature::setEmail(const utility::string_t& value)
{
    m_Email = value;
    m_EmailIsSet = true;
}

bool DvirBase_mechanicOrAgentSignature::emailIsSet() const
{
    return m_EmailIsSet;
}

void DvirBase_mechanicOrAgentSignature::unsetEmail()
{
    m_EmailIsSet = false;
}

utility::string_t DvirBase_mechanicOrAgentSignature::getUsername() const
{
    return m_Username;
}

void DvirBase_mechanicOrAgentSignature::setUsername(const utility::string_t& value)
{
    m_Username = value;
    m_UsernameIsSet = true;
}

bool DvirBase_mechanicOrAgentSignature::usernameIsSet() const
{
    return m_UsernameIsSet;
}

void DvirBase_mechanicOrAgentSignature::unsetUsername()
{
    m_UsernameIsSet = false;
}

}
}
}
}

