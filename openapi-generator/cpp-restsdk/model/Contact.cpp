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



#include "Contact.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

Contact::Contact()
{
    m_Email = utility::conversions::to_string_t("");
    m_EmailIsSet = false;
    m_FirstName = utility::conversions::to_string_t("");
    m_FirstNameIsSet = false;
    m_Id = 0L;
    m_IdIsSet = false;
    m_LastName = utility::conversions::to_string_t("");
    m_LastNameIsSet = false;
    m_Phone = utility::conversions::to_string_t("");
    m_PhoneIsSet = false;
}

Contact::~Contact()
{
}

void Contact::validate()
{
    // TODO: implement validation
}

web::json::value Contact::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_EmailIsSet)
    {
        val[utility::conversions::to_string_t("email")] = ModelBase::toJson(m_Email);
    }
    if(m_FirstNameIsSet)
    {
        val[utility::conversions::to_string_t("firstName")] = ModelBase::toJson(m_FirstName);
    }
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t("id")] = ModelBase::toJson(m_Id);
    }
    if(m_LastNameIsSet)
    {
        val[utility::conversions::to_string_t("lastName")] = ModelBase::toJson(m_LastName);
    }
    if(m_PhoneIsSet)
    {
        val[utility::conversions::to_string_t("phone")] = ModelBase::toJson(m_Phone);
    }

    return val;
}

void Contact::fromJson(const web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("email")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("email"));
        if(!fieldValue.is_null())
        {
            setEmail(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("firstName")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("firstName"));
        if(!fieldValue.is_null())
        {
            setFirstName(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("id"));
        if(!fieldValue.is_null())
        {
            setId(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("lastName")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("lastName"));
        if(!fieldValue.is_null())
        {
            setLastName(ModelBase::stringFromJson(fieldValue));
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
}

void Contact::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_EmailIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("email"), m_Email));
    }
    if(m_FirstNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("firstName"), m_FirstName));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("id"), m_Id));
    }
    if(m_LastNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("lastName"), m_LastName));
    }
    if(m_PhoneIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("phone"), m_Phone));
    }
}

void Contact::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("email")))
    {
        setEmail(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("email"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("firstName")))
    {
        setFirstName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("firstName"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("id")))
    {
        setId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("id"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("lastName")))
    {
        setLastName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("lastName"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("phone")))
    {
        setPhone(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("phone"))));
    }
}

utility::string_t Contact::getEmail() const
{
    return m_Email;
}

void Contact::setEmail(const utility::string_t& value)
{
    m_Email = value;
    m_EmailIsSet = true;
}

bool Contact::emailIsSet() const
{
    return m_EmailIsSet;
}

void Contact::unsetEmail()
{
    m_EmailIsSet = false;
}

utility::string_t Contact::getFirstName() const
{
    return m_FirstName;
}

void Contact::setFirstName(const utility::string_t& value)
{
    m_FirstName = value;
    m_FirstNameIsSet = true;
}

bool Contact::firstNameIsSet() const
{
    return m_FirstNameIsSet;
}

void Contact::unsetFirstName()
{
    m_FirstNameIsSet = false;
}

int64_t Contact::getId() const
{
    return m_Id;
}

void Contact::setId(int64_t value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Contact::idIsSet() const
{
    return m_IdIsSet;
}

void Contact::unsetId()
{
    m_IdIsSet = false;
}

utility::string_t Contact::getLastName() const
{
    return m_LastName;
}

void Contact::setLastName(const utility::string_t& value)
{
    m_LastName = value;
    m_LastNameIsSet = true;
}

bool Contact::lastNameIsSet() const
{
    return m_LastNameIsSet;
}

void Contact::unsetLastName()
{
    m_LastNameIsSet = false;
}

utility::string_t Contact::getPhone() const
{
    return m_Phone;
}

void Contact::setPhone(const utility::string_t& value)
{
    m_Phone = value;
    m_PhoneIsSet = true;
}

bool Contact::phoneIsSet() const
{
    return m_PhoneIsSet;
}

void Contact::unsetPhone()
{
    m_PhoneIsSet = false;
}

}
}
}
}

