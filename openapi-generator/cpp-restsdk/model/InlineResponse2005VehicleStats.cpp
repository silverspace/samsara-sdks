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



#include "Inline_response_200_5_vehicleStats.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

Inline_response_200_5_vehicleStats::Inline_response_200_5_vehicleStats()
{
    m_EngineStateIsSet = false;
    m_AuxInput2IsSet = false;
    m_VehicleId = 0L;
    m_AuxInput1IsSet = false;
}

Inline_response_200_5_vehicleStats::~Inline_response_200_5_vehicleStats()
{
}

void Inline_response_200_5_vehicleStats::validate()
{
    // TODO: implement validation
}

web::json::value Inline_response_200_5_vehicleStats::toJson() const
{
    web::json::value val = web::json::value::object();

    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_EngineState )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("engineState")] = web::json::value::array(jsonArray);
        }
    }
    if(m_AuxInput2IsSet)
    {
        val[utility::conversions::to_string_t("auxInput2")] = ModelBase::toJson(m_AuxInput2);
    }
    val[utility::conversions::to_string_t("vehicleId")] = ModelBase::toJson(m_VehicleId);
    if(m_AuxInput1IsSet)
    {
        val[utility::conversions::to_string_t("auxInput1")] = ModelBase::toJson(m_AuxInput1);
    }

    return val;
}

void Inline_response_200_5_vehicleStats::fromJson(const web::json::value& val)
{
    {
        m_EngineState.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("engineState")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("engineState")).as_array() )
        {
            if(item.is_null())
            {
                m_EngineState.push_back( std::shared_ptr<EngineState>(nullptr) );
            }
            else
            {
                std::shared_ptr<EngineState> newItem(new EngineState());
                newItem->fromJson(item);
                m_EngineState.push_back( newItem );
            }
        }
        }
    }
    if(val.has_field(utility::conversions::to_string_t("auxInput2")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("auxInput2"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AuxInputSeries> newItem(new AuxInputSeries());
            newItem->fromJson(fieldValue);
            setAuxInput2( newItem );
        }
    }
    setVehicleId(ModelBase::int64_tFromJson(val.at(utility::conversions::to_string_t("vehicleId"))));
    if(val.has_field(utility::conversions::to_string_t("auxInput1")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("auxInput1"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AuxInputSeries> newItem(new AuxInputSeries());
            newItem->fromJson(fieldValue);
            setAuxInput1( newItem );
        }
    }
}

void Inline_response_200_5_vehicleStats::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_EngineState )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("engineState"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    if(m_AuxInput2IsSet)
    {
        if (m_AuxInput2.get())
        {
            m_AuxInput2->toMultipart(multipart, utility::conversions::to_string_t("auxInput2."));
        }
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("vehicleId"), m_VehicleId));
    if(m_AuxInput1IsSet)
    {
        if (m_AuxInput1.get())
        {
            m_AuxInput1->toMultipart(multipart, utility::conversions::to_string_t("auxInput1."));
        }
    }
}

void Inline_response_200_5_vehicleStats::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    {
        m_EngineState.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("engineState")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("engineState"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_EngineState.push_back( std::shared_ptr<EngineState>(nullptr) );
            }
            else
            {
                std::shared_ptr<EngineState> newItem(new EngineState());
                newItem->fromJson(item);
                m_EngineState.push_back( newItem );
            }
        }
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("auxInput2")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("auxInput2")))
        {
            std::shared_ptr<AuxInputSeries> newItem(new AuxInputSeries());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("auxInput2."));
            setAuxInput2( newItem );
        }
    }
    setVehicleId(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("vehicleId"))));
    if(multipart->hasContent(utility::conversions::to_string_t("auxInput1")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("auxInput1")))
        {
            std::shared_ptr<AuxInputSeries> newItem(new AuxInputSeries());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("auxInput1."));
            setAuxInput1( newItem );
        }
    }
}

std::vector<std::shared_ptr<EngineState>>& Inline_response_200_5_vehicleStats::getEngineState()
{
    return m_EngineState;
}

void Inline_response_200_5_vehicleStats::setEngineState(const std::vector<std::shared_ptr<EngineState>>& value)
{
    m_EngineState = value;
    m_EngineStateIsSet = true;
}

bool Inline_response_200_5_vehicleStats::engineStateIsSet() const
{
    return m_EngineStateIsSet;
}

void Inline_response_200_5_vehicleStats::unsetEngineState()
{
    m_EngineStateIsSet = false;
}

std::shared_ptr<AuxInputSeries> Inline_response_200_5_vehicleStats::getAuxInput2() const
{
    return m_AuxInput2;
}

void Inline_response_200_5_vehicleStats::setAuxInput2(const std::shared_ptr<AuxInputSeries>& value)
{
    m_AuxInput2 = value;
    m_AuxInput2IsSet = true;
}

bool Inline_response_200_5_vehicleStats::auxInput2IsSet() const
{
    return m_AuxInput2IsSet;
}

void Inline_response_200_5_vehicleStats::unsetAuxInput2()
{
    m_AuxInput2IsSet = false;
}

int64_t Inline_response_200_5_vehicleStats::getVehicleId() const
{
    return m_VehicleId;
}

void Inline_response_200_5_vehicleStats::setVehicleId(int64_t value)
{
    m_VehicleId = value;
    
}

std::shared_ptr<AuxInputSeries> Inline_response_200_5_vehicleStats::getAuxInput1() const
{
    return m_AuxInput1;
}

void Inline_response_200_5_vehicleStats::setAuxInput1(const std::shared_ptr<AuxInputSeries>& value)
{
    m_AuxInput1 = value;
    m_AuxInput1IsSet = true;
}

bool Inline_response_200_5_vehicleStats::auxInput1IsSet() const
{
    return m_AuxInput1IsSet;
}

void Inline_response_200_5_vehicleStats::unsetAuxInput1()
{
    m_AuxInput1IsSet = false;
}

}
}
}
}

