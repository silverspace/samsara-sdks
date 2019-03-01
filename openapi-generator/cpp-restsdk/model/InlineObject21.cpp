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



#include "Inline_object_21.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

Inline_object_21::Inline_object_21()
{
    m_EndMs = 0;
    m_FillMissing = utility::conversions::to_string_t("");
    m_FillMissingIsSet = false;
    m_GroupId = 0L;
    m_StartMs = 0;
    m_StepMs = 0;
}

Inline_object_21::~Inline_object_21()
{
}

void Inline_object_21::validate()
{
    // TODO: implement validation
}

web::json::value Inline_object_21::toJson() const
{
    web::json::value val = web::json::value::object();

    val[utility::conversions::to_string_t("endMs")] = ModelBase::toJson(m_EndMs);
    if(m_FillMissingIsSet)
    {
        val[utility::conversions::to_string_t("fillMissing")] = ModelBase::toJson(m_FillMissing);
    }
    val[utility::conversions::to_string_t("groupId")] = ModelBase::toJson(m_GroupId);
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Series )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        val[utility::conversions::to_string_t("series")] = web::json::value::array(jsonArray);
    }
    val[utility::conversions::to_string_t("startMs")] = ModelBase::toJson(m_StartMs);
    val[utility::conversions::to_string_t("stepMs")] = ModelBase::toJson(m_StepMs);

    return val;
}

void Inline_object_21::fromJson(const web::json::value& val)
{
    setEndMs(ModelBase::int32_tFromJson(val.at(utility::conversions::to_string_t("endMs"))));
    if(val.has_field(utility::conversions::to_string_t("fillMissing")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("fillMissing"));
        if(!fieldValue.is_null())
        {
            setFillMissing(ModelBase::stringFromJson(fieldValue));
        }
    }
    setGroupId(ModelBase::int64_tFromJson(val.at(utility::conversions::to_string_t("groupId"))));
    {
        m_Series.clear();
        std::vector<web::json::value> jsonArray;
        for( auto& item : val.at(utility::conversions::to_string_t("series")).as_array() )
        {
            if(item.is_null())
            {
                m_Series.push_back( std::shared_ptr<_sensors_history_series>(nullptr) );
            }
            else
            {
                std::shared_ptr<_sensors_history_series> newItem(new _sensors_history_series());
                newItem->fromJson(item);
                m_Series.push_back( newItem );
            }
        }
    }
    setStartMs(ModelBase::int32_tFromJson(val.at(utility::conversions::to_string_t("startMs"))));
    setStepMs(ModelBase::int32_tFromJson(val.at(utility::conversions::to_string_t("stepMs"))));
}

void Inline_object_21::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("endMs"), m_EndMs));
    if(m_FillMissingIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("fillMissing"), m_FillMissing));
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("groupId"), m_GroupId));
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Series )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("series"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
            }
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("startMs"), m_StartMs));
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("stepMs"), m_StepMs));
}

void Inline_object_21::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    setEndMs(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("endMs"))));
    if(multipart->hasContent(utility::conversions::to_string_t("fillMissing")))
    {
        setFillMissing(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("fillMissing"))));
    }
    setGroupId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("groupId"))));
    {
        m_Series.clear();

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("series"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_Series.push_back( std::shared_ptr<_sensors_history_series>(nullptr) );
            }
            else
            {
                std::shared_ptr<_sensors_history_series> newItem(new _sensors_history_series());
                newItem->fromJson(item);
                m_Series.push_back( newItem );
            }
        }
    }
    setStartMs(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("startMs"))));
    setStepMs(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("stepMs"))));
}

int32_t Inline_object_21::getEndMs() const
{
    return m_EndMs;
}

void Inline_object_21::setEndMs(int32_t value)
{
    m_EndMs = value;
    
}

utility::string_t Inline_object_21::getFillMissing() const
{
    return m_FillMissing;
}

void Inline_object_21::setFillMissing(const utility::string_t& value)
{
    m_FillMissing = value;
    m_FillMissingIsSet = true;
}

bool Inline_object_21::fillMissingIsSet() const
{
    return m_FillMissingIsSet;
}

void Inline_object_21::unsetFillMissing()
{
    m_FillMissingIsSet = false;
}

int64_t Inline_object_21::getGroupId() const
{
    return m_GroupId;
}

void Inline_object_21::setGroupId(int64_t value)
{
    m_GroupId = value;
    
}

std::vector<std::shared_ptr<_sensors_history_series>>& Inline_object_21::getSeries()
{
    return m_Series;
}

void Inline_object_21::setSeries(const std::vector<std::shared_ptr<_sensors_history_series>>& value)
{
    m_Series = value;
    
}

int32_t Inline_object_21::getStartMs() const
{
    return m_StartMs;
}

void Inline_object_21::setStartMs(int32_t value)
{
    m_StartMs = value;
    
}

int32_t Inline_object_21::getStepMs() const
{
    return m_StepMs;
}

void Inline_object_21::setStepMs(int32_t value)
{
    m_StepMs = value;
    
}

}
}
}
}

