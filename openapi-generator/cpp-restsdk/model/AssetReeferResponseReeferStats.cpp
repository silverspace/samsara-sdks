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



#include "AssetReeferResponse_reeferStats.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

AssetReeferResponse_reeferStats::AssetReeferResponse_reeferStats()
{
    m_FuelPercentageIsSet = false;
    m_PowerStatusIsSet = false;
    m_EngineHoursIsSet = false;
    m_SetPointIsSet = false;
    m_ReturnAirTempIsSet = false;
    m_AlarmsIsSet = false;
}

AssetReeferResponse_reeferStats::~AssetReeferResponse_reeferStats()
{
}

void AssetReeferResponse_reeferStats::validate()
{
    // TODO: implement validation
}

web::json::value AssetReeferResponse_reeferStats::toJson() const
{
    web::json::value val = web::json::value::object();

    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_FuelPercentage )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("fuelPercentage")] = web::json::value::array(jsonArray);
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_PowerStatus )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("powerStatus")] = web::json::value::array(jsonArray);
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_EngineHours )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("engineHours")] = web::json::value::array(jsonArray);
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_SetPoint )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("setPoint")] = web::json::value::array(jsonArray);
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_ReturnAirTemp )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("returnAirTemp")] = web::json::value::array(jsonArray);
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Alarms )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("alarms")] = web::json::value::array(jsonArray);
        }
    }

    return val;
}

void AssetReeferResponse_reeferStats::fromJson(const web::json::value& val)
{
    {
        m_FuelPercentage.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("fuelPercentage")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("fuelPercentage")).as_array() )
        {
            if(item.is_null())
            {
                m_FuelPercentage.push_back( std::shared_ptr<AssetReeferResponse_reeferStats_fuelPercentage>(nullptr) );
            }
            else
            {
                std::shared_ptr<AssetReeferResponse_reeferStats_fuelPercentage> newItem(new AssetReeferResponse_reeferStats_fuelPercentage());
                newItem->fromJson(item);
                m_FuelPercentage.push_back( newItem );
            }
        }
        }
    }
    {
        m_PowerStatus.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("powerStatus")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("powerStatus")).as_array() )
        {
            if(item.is_null())
            {
                m_PowerStatus.push_back( std::shared_ptr<AssetReeferResponse_reeferStats_powerStatus>(nullptr) );
            }
            else
            {
                std::shared_ptr<AssetReeferResponse_reeferStats_powerStatus> newItem(new AssetReeferResponse_reeferStats_powerStatus());
                newItem->fromJson(item);
                m_PowerStatus.push_back( newItem );
            }
        }
        }
    }
    {
        m_EngineHours.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("engineHours")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("engineHours")).as_array() )
        {
            if(item.is_null())
            {
                m_EngineHours.push_back( std::shared_ptr<AssetReeferResponse_reeferStats_engineHours>(nullptr) );
            }
            else
            {
                std::shared_ptr<AssetReeferResponse_reeferStats_engineHours> newItem(new AssetReeferResponse_reeferStats_engineHours());
                newItem->fromJson(item);
                m_EngineHours.push_back( newItem );
            }
        }
        }
    }
    {
        m_SetPoint.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("setPoint")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("setPoint")).as_array() )
        {
            if(item.is_null())
            {
                m_SetPoint.push_back( std::shared_ptr<AssetReeferResponse_reeferStats_setPoint>(nullptr) );
            }
            else
            {
                std::shared_ptr<AssetReeferResponse_reeferStats_setPoint> newItem(new AssetReeferResponse_reeferStats_setPoint());
                newItem->fromJson(item);
                m_SetPoint.push_back( newItem );
            }
        }
        }
    }
    {
        m_ReturnAirTemp.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("returnAirTemp")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("returnAirTemp")).as_array() )
        {
            if(item.is_null())
            {
                m_ReturnAirTemp.push_back( std::shared_ptr<AssetReeferResponse_reeferStats_returnAirTemp>(nullptr) );
            }
            else
            {
                std::shared_ptr<AssetReeferResponse_reeferStats_returnAirTemp> newItem(new AssetReeferResponse_reeferStats_returnAirTemp());
                newItem->fromJson(item);
                m_ReturnAirTemp.push_back( newItem );
            }
        }
        }
    }
    {
        m_Alarms.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("alarms")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("alarms")).as_array() )
        {
            if(item.is_null())
            {
                m_Alarms.push_back( std::shared_ptr<AssetReeferResponse_reeferStats_alarms_1>(nullptr) );
            }
            else
            {
                std::shared_ptr<AssetReeferResponse_reeferStats_alarms_1> newItem(new AssetReeferResponse_reeferStats_alarms_1());
                newItem->fromJson(item);
                m_Alarms.push_back( newItem );
            }
        }
        }
    }
}

void AssetReeferResponse_reeferStats::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_FuelPercentage )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("fuelPercentage"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_PowerStatus )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("powerStatus"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_EngineHours )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("engineHours"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_SetPoint )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("setPoint"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_ReturnAirTemp )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("returnAirTemp"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Alarms )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("alarms"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
}

void AssetReeferResponse_reeferStats::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    {
        m_FuelPercentage.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("fuelPercentage")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("fuelPercentage"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_FuelPercentage.push_back( std::shared_ptr<AssetReeferResponse_reeferStats_fuelPercentage>(nullptr) );
            }
            else
            {
                std::shared_ptr<AssetReeferResponse_reeferStats_fuelPercentage> newItem(new AssetReeferResponse_reeferStats_fuelPercentage());
                newItem->fromJson(item);
                m_FuelPercentage.push_back( newItem );
            }
        }
        }
    }
    {
        m_PowerStatus.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("powerStatus")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("powerStatus"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_PowerStatus.push_back( std::shared_ptr<AssetReeferResponse_reeferStats_powerStatus>(nullptr) );
            }
            else
            {
                std::shared_ptr<AssetReeferResponse_reeferStats_powerStatus> newItem(new AssetReeferResponse_reeferStats_powerStatus());
                newItem->fromJson(item);
                m_PowerStatus.push_back( newItem );
            }
        }
        }
    }
    {
        m_EngineHours.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("engineHours")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("engineHours"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_EngineHours.push_back( std::shared_ptr<AssetReeferResponse_reeferStats_engineHours>(nullptr) );
            }
            else
            {
                std::shared_ptr<AssetReeferResponse_reeferStats_engineHours> newItem(new AssetReeferResponse_reeferStats_engineHours());
                newItem->fromJson(item);
                m_EngineHours.push_back( newItem );
            }
        }
        }
    }
    {
        m_SetPoint.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("setPoint")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("setPoint"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_SetPoint.push_back( std::shared_ptr<AssetReeferResponse_reeferStats_setPoint>(nullptr) );
            }
            else
            {
                std::shared_ptr<AssetReeferResponse_reeferStats_setPoint> newItem(new AssetReeferResponse_reeferStats_setPoint());
                newItem->fromJson(item);
                m_SetPoint.push_back( newItem );
            }
        }
        }
    }
    {
        m_ReturnAirTemp.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("returnAirTemp")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("returnAirTemp"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_ReturnAirTemp.push_back( std::shared_ptr<AssetReeferResponse_reeferStats_returnAirTemp>(nullptr) );
            }
            else
            {
                std::shared_ptr<AssetReeferResponse_reeferStats_returnAirTemp> newItem(new AssetReeferResponse_reeferStats_returnAirTemp());
                newItem->fromJson(item);
                m_ReturnAirTemp.push_back( newItem );
            }
        }
        }
    }
    {
        m_Alarms.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("alarms")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("alarms"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_Alarms.push_back( std::shared_ptr<AssetReeferResponse_reeferStats_alarms_1>(nullptr) );
            }
            else
            {
                std::shared_ptr<AssetReeferResponse_reeferStats_alarms_1> newItem(new AssetReeferResponse_reeferStats_alarms_1());
                newItem->fromJson(item);
                m_Alarms.push_back( newItem );
            }
        }
        }
    }
}

std::vector<std::shared_ptr<AssetReeferResponse_reeferStats_fuelPercentage>>& AssetReeferResponse_reeferStats::getFuelPercentage()
{
    return m_FuelPercentage;
}

void AssetReeferResponse_reeferStats::setFuelPercentage(const std::vector<std::shared_ptr<AssetReeferResponse_reeferStats_fuelPercentage>>& value)
{
    m_FuelPercentage = value;
    m_FuelPercentageIsSet = true;
}

bool AssetReeferResponse_reeferStats::fuelPercentageIsSet() const
{
    return m_FuelPercentageIsSet;
}

void AssetReeferResponse_reeferStats::unsetFuelPercentage()
{
    m_FuelPercentageIsSet = false;
}

std::vector<std::shared_ptr<AssetReeferResponse_reeferStats_powerStatus>>& AssetReeferResponse_reeferStats::getPowerStatus()
{
    return m_PowerStatus;
}

void AssetReeferResponse_reeferStats::setPowerStatus(const std::vector<std::shared_ptr<AssetReeferResponse_reeferStats_powerStatus>>& value)
{
    m_PowerStatus = value;
    m_PowerStatusIsSet = true;
}

bool AssetReeferResponse_reeferStats::powerStatusIsSet() const
{
    return m_PowerStatusIsSet;
}

void AssetReeferResponse_reeferStats::unsetPowerStatus()
{
    m_PowerStatusIsSet = false;
}

std::vector<std::shared_ptr<AssetReeferResponse_reeferStats_engineHours>>& AssetReeferResponse_reeferStats::getEngineHours()
{
    return m_EngineHours;
}

void AssetReeferResponse_reeferStats::setEngineHours(const std::vector<std::shared_ptr<AssetReeferResponse_reeferStats_engineHours>>& value)
{
    m_EngineHours = value;
    m_EngineHoursIsSet = true;
}

bool AssetReeferResponse_reeferStats::engineHoursIsSet() const
{
    return m_EngineHoursIsSet;
}

void AssetReeferResponse_reeferStats::unsetEngineHours()
{
    m_EngineHoursIsSet = false;
}

std::vector<std::shared_ptr<AssetReeferResponse_reeferStats_setPoint>>& AssetReeferResponse_reeferStats::getSetPoint()
{
    return m_SetPoint;
}

void AssetReeferResponse_reeferStats::setSetPoint(const std::vector<std::shared_ptr<AssetReeferResponse_reeferStats_setPoint>>& value)
{
    m_SetPoint = value;
    m_SetPointIsSet = true;
}

bool AssetReeferResponse_reeferStats::setPointIsSet() const
{
    return m_SetPointIsSet;
}

void AssetReeferResponse_reeferStats::unsetSetPoint()
{
    m_SetPointIsSet = false;
}

std::vector<std::shared_ptr<AssetReeferResponse_reeferStats_returnAirTemp>>& AssetReeferResponse_reeferStats::getReturnAirTemp()
{
    return m_ReturnAirTemp;
}

void AssetReeferResponse_reeferStats::setReturnAirTemp(const std::vector<std::shared_ptr<AssetReeferResponse_reeferStats_returnAirTemp>>& value)
{
    m_ReturnAirTemp = value;
    m_ReturnAirTempIsSet = true;
}

bool AssetReeferResponse_reeferStats::returnAirTempIsSet() const
{
    return m_ReturnAirTempIsSet;
}

void AssetReeferResponse_reeferStats::unsetReturnAirTemp()
{
    m_ReturnAirTempIsSet = false;
}

std::vector<std::shared_ptr<AssetReeferResponse_reeferStats_alarms_1>>& AssetReeferResponse_reeferStats::getAlarms()
{
    return m_Alarms;
}

void AssetReeferResponse_reeferStats::setAlarms(const std::vector<std::shared_ptr<AssetReeferResponse_reeferStats_alarms_1>>& value)
{
    m_Alarms = value;
    m_AlarmsIsSet = true;
}

bool AssetReeferResponse_reeferStats::alarmsIsSet() const
{
    return m_AlarmsIsSet;
}

void AssetReeferResponse_reeferStats::unsetAlarms()
{
    m_AlarmsIsSet = false;
}

}
}
}
}

