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



#include "VehicleSafetyScoreResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

VehicleSafetyScoreResponse::VehicleSafetyScoreResponse()
{
    m_CrashCount = 0;
    m_CrashCountIsSet = false;
    m_HarshAccelCount = 0;
    m_HarshAccelCountIsSet = false;
    m_HarshBrakingCount = 0;
    m_HarshBrakingCountIsSet = false;
    m_HarshEventsIsSet = false;
    m_HarshTurningCount = 0;
    m_HarshTurningCountIsSet = false;
    m_SafetyScore = 0;
    m_SafetyScoreIsSet = false;
    m_SafetyScoreRank = utility::conversions::to_string_t("");
    m_SafetyScoreRankIsSet = false;
    m_TimeOverSpeedLimitMs = 0;
    m_TimeOverSpeedLimitMsIsSet = false;
    m_TotalDistanceDrivenMeters = 0;
    m_TotalDistanceDrivenMetersIsSet = false;
    m_TotalHarshEventCount = 0;
    m_TotalHarshEventCountIsSet = false;
    m_TotalTimeDrivenMs = 0;
    m_TotalTimeDrivenMsIsSet = false;
    m_VehicleId = 0;
    m_VehicleIdIsSet = false;
}

VehicleSafetyScoreResponse::~VehicleSafetyScoreResponse()
{
}

void VehicleSafetyScoreResponse::validate()
{
    // TODO: implement validation
}

web::json::value VehicleSafetyScoreResponse::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_CrashCountIsSet)
    {
        val[utility::conversions::to_string_t("crashCount")] = ModelBase::toJson(m_CrashCount);
    }
    if(m_HarshAccelCountIsSet)
    {
        val[utility::conversions::to_string_t("harshAccelCount")] = ModelBase::toJson(m_HarshAccelCount);
    }
    if(m_HarshBrakingCountIsSet)
    {
        val[utility::conversions::to_string_t("harshBrakingCount")] = ModelBase::toJson(m_HarshBrakingCount);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_HarshEvents )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        if(jsonArray.size() > 0)
        {
            val[utility::conversions::to_string_t("harshEvents")] = web::json::value::array(jsonArray);
        }
    }
    if(m_HarshTurningCountIsSet)
    {
        val[utility::conversions::to_string_t("harshTurningCount")] = ModelBase::toJson(m_HarshTurningCount);
    }
    if(m_SafetyScoreIsSet)
    {
        val[utility::conversions::to_string_t("safetyScore")] = ModelBase::toJson(m_SafetyScore);
    }
    if(m_SafetyScoreRankIsSet)
    {
        val[utility::conversions::to_string_t("safetyScoreRank")] = ModelBase::toJson(m_SafetyScoreRank);
    }
    if(m_TimeOverSpeedLimitMsIsSet)
    {
        val[utility::conversions::to_string_t("timeOverSpeedLimitMs")] = ModelBase::toJson(m_TimeOverSpeedLimitMs);
    }
    if(m_TotalDistanceDrivenMetersIsSet)
    {
        val[utility::conversions::to_string_t("totalDistanceDrivenMeters")] = ModelBase::toJson(m_TotalDistanceDrivenMeters);
    }
    if(m_TotalHarshEventCountIsSet)
    {
        val[utility::conversions::to_string_t("totalHarshEventCount")] = ModelBase::toJson(m_TotalHarshEventCount);
    }
    if(m_TotalTimeDrivenMsIsSet)
    {
        val[utility::conversions::to_string_t("totalTimeDrivenMs")] = ModelBase::toJson(m_TotalTimeDrivenMs);
    }
    if(m_VehicleIdIsSet)
    {
        val[utility::conversions::to_string_t("vehicleId")] = ModelBase::toJson(m_VehicleId);
    }

    return val;
}

void VehicleSafetyScoreResponse::fromJson(const web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("crashCount")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("crashCount"));
        if(!fieldValue.is_null())
        {
            setCrashCount(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("harshAccelCount")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("harshAccelCount"));
        if(!fieldValue.is_null())
        {
            setHarshAccelCount(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("harshBrakingCount")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("harshBrakingCount"));
        if(!fieldValue.is_null())
        {
            setHarshBrakingCount(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    {
        m_HarshEvents.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(utility::conversions::to_string_t("harshEvents")))
        {
        for( auto& item : val.at(utility::conversions::to_string_t("harshEvents")).as_array() )
        {
            if(item.is_null())
            {
                m_HarshEvents.push_back( std::shared_ptr<SafetyReportHarshEvent>(nullptr) );
            }
            else
            {
                std::shared_ptr<SafetyReportHarshEvent> newItem(new SafetyReportHarshEvent());
                newItem->fromJson(item);
                m_HarshEvents.push_back( newItem );
            }
        }
        }
    }
    if(val.has_field(utility::conversions::to_string_t("harshTurningCount")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("harshTurningCount"));
        if(!fieldValue.is_null())
        {
            setHarshTurningCount(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("safetyScore")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("safetyScore"));
        if(!fieldValue.is_null())
        {
            setSafetyScore(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("safetyScoreRank")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("safetyScoreRank"));
        if(!fieldValue.is_null())
        {
            setSafetyScoreRank(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("timeOverSpeedLimitMs")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("timeOverSpeedLimitMs"));
        if(!fieldValue.is_null())
        {
            setTimeOverSpeedLimitMs(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("totalDistanceDrivenMeters")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("totalDistanceDrivenMeters"));
        if(!fieldValue.is_null())
        {
            setTotalDistanceDrivenMeters(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("totalHarshEventCount")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("totalHarshEventCount"));
        if(!fieldValue.is_null())
        {
            setTotalHarshEventCount(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("totalTimeDrivenMs")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("totalTimeDrivenMs"));
        if(!fieldValue.is_null())
        {
            setTotalTimeDrivenMs(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("vehicleId")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("vehicleId"));
        if(!fieldValue.is_null())
        {
            setVehicleId(ModelBase::int32_tFromJson(fieldValue));
        }
    }
}

void VehicleSafetyScoreResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_CrashCountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("crashCount"), m_CrashCount));
    }
    if(m_HarshAccelCountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("harshAccelCount"), m_HarshAccelCount));
    }
    if(m_HarshBrakingCountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("harshBrakingCount"), m_HarshBrakingCount));
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_HarshEvents )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("harshEvents"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
        }
    }
    if(m_HarshTurningCountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("harshTurningCount"), m_HarshTurningCount));
    }
    if(m_SafetyScoreIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("safetyScore"), m_SafetyScore));
    }
    if(m_SafetyScoreRankIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("safetyScoreRank"), m_SafetyScoreRank));
    }
    if(m_TimeOverSpeedLimitMsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("timeOverSpeedLimitMs"), m_TimeOverSpeedLimitMs));
    }
    if(m_TotalDistanceDrivenMetersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("totalDistanceDrivenMeters"), m_TotalDistanceDrivenMeters));
    }
    if(m_TotalHarshEventCountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("totalHarshEventCount"), m_TotalHarshEventCount));
    }
    if(m_TotalTimeDrivenMsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("totalTimeDrivenMs"), m_TotalTimeDrivenMs));
    }
    if(m_VehicleIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("vehicleId"), m_VehicleId));
    }
}

void VehicleSafetyScoreResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("crashCount")))
    {
        setCrashCount(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("crashCount"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("harshAccelCount")))
    {
        setHarshAccelCount(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("harshAccelCount"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("harshBrakingCount")))
    {
        setHarshBrakingCount(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("harshBrakingCount"))));
    }
    {
        m_HarshEvents.clear();
        if(multipart->hasContent(utility::conversions::to_string_t("harshEvents")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("harshEvents"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_HarshEvents.push_back( std::shared_ptr<SafetyReportHarshEvent>(nullptr) );
            }
            else
            {
                std::shared_ptr<SafetyReportHarshEvent> newItem(new SafetyReportHarshEvent());
                newItem->fromJson(item);
                m_HarshEvents.push_back( newItem );
            }
        }
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("harshTurningCount")))
    {
        setHarshTurningCount(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("harshTurningCount"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("safetyScore")))
    {
        setSafetyScore(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("safetyScore"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("safetyScoreRank")))
    {
        setSafetyScoreRank(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("safetyScoreRank"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("timeOverSpeedLimitMs")))
    {
        setTimeOverSpeedLimitMs(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("timeOverSpeedLimitMs"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("totalDistanceDrivenMeters")))
    {
        setTotalDistanceDrivenMeters(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("totalDistanceDrivenMeters"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("totalHarshEventCount")))
    {
        setTotalHarshEventCount(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("totalHarshEventCount"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("totalTimeDrivenMs")))
    {
        setTotalTimeDrivenMs(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("totalTimeDrivenMs"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("vehicleId")))
    {
        setVehicleId(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("vehicleId"))));
    }
}

int32_t VehicleSafetyScoreResponse::getCrashCount() const
{
    return m_CrashCount;
}

void VehicleSafetyScoreResponse::setCrashCount(int32_t value)
{
    m_CrashCount = value;
    m_CrashCountIsSet = true;
}

bool VehicleSafetyScoreResponse::crashCountIsSet() const
{
    return m_CrashCountIsSet;
}

void VehicleSafetyScoreResponse::unsetCrashCount()
{
    m_CrashCountIsSet = false;
}

int32_t VehicleSafetyScoreResponse::getHarshAccelCount() const
{
    return m_HarshAccelCount;
}

void VehicleSafetyScoreResponse::setHarshAccelCount(int32_t value)
{
    m_HarshAccelCount = value;
    m_HarshAccelCountIsSet = true;
}

bool VehicleSafetyScoreResponse::harshAccelCountIsSet() const
{
    return m_HarshAccelCountIsSet;
}

void VehicleSafetyScoreResponse::unsetHarshAccelCount()
{
    m_HarshAccelCountIsSet = false;
}

int32_t VehicleSafetyScoreResponse::getHarshBrakingCount() const
{
    return m_HarshBrakingCount;
}

void VehicleSafetyScoreResponse::setHarshBrakingCount(int32_t value)
{
    m_HarshBrakingCount = value;
    m_HarshBrakingCountIsSet = true;
}

bool VehicleSafetyScoreResponse::harshBrakingCountIsSet() const
{
    return m_HarshBrakingCountIsSet;
}

void VehicleSafetyScoreResponse::unsetHarshBrakingCount()
{
    m_HarshBrakingCountIsSet = false;
}

std::vector<std::shared_ptr<SafetyReportHarshEvent>>& VehicleSafetyScoreResponse::getHarshEvents()
{
    return m_HarshEvents;
}

void VehicleSafetyScoreResponse::setHarshEvents(const std::vector<std::shared_ptr<SafetyReportHarshEvent>>& value)
{
    m_HarshEvents = value;
    m_HarshEventsIsSet = true;
}

bool VehicleSafetyScoreResponse::harshEventsIsSet() const
{
    return m_HarshEventsIsSet;
}

void VehicleSafetyScoreResponse::unsetHarshEvents()
{
    m_HarshEventsIsSet = false;
}

int32_t VehicleSafetyScoreResponse::getHarshTurningCount() const
{
    return m_HarshTurningCount;
}

void VehicleSafetyScoreResponse::setHarshTurningCount(int32_t value)
{
    m_HarshTurningCount = value;
    m_HarshTurningCountIsSet = true;
}

bool VehicleSafetyScoreResponse::harshTurningCountIsSet() const
{
    return m_HarshTurningCountIsSet;
}

void VehicleSafetyScoreResponse::unsetHarshTurningCount()
{
    m_HarshTurningCountIsSet = false;
}

int32_t VehicleSafetyScoreResponse::getSafetyScore() const
{
    return m_SafetyScore;
}

void VehicleSafetyScoreResponse::setSafetyScore(int32_t value)
{
    m_SafetyScore = value;
    m_SafetyScoreIsSet = true;
}

bool VehicleSafetyScoreResponse::safetyScoreIsSet() const
{
    return m_SafetyScoreIsSet;
}

void VehicleSafetyScoreResponse::unsetSafetyScore()
{
    m_SafetyScoreIsSet = false;
}

utility::string_t VehicleSafetyScoreResponse::getSafetyScoreRank() const
{
    return m_SafetyScoreRank;
}

void VehicleSafetyScoreResponse::setSafetyScoreRank(const utility::string_t& value)
{
    m_SafetyScoreRank = value;
    m_SafetyScoreRankIsSet = true;
}

bool VehicleSafetyScoreResponse::safetyScoreRankIsSet() const
{
    return m_SafetyScoreRankIsSet;
}

void VehicleSafetyScoreResponse::unsetSafetyScoreRank()
{
    m_SafetyScoreRankIsSet = false;
}

int32_t VehicleSafetyScoreResponse::getTimeOverSpeedLimitMs() const
{
    return m_TimeOverSpeedLimitMs;
}

void VehicleSafetyScoreResponse::setTimeOverSpeedLimitMs(int32_t value)
{
    m_TimeOverSpeedLimitMs = value;
    m_TimeOverSpeedLimitMsIsSet = true;
}

bool VehicleSafetyScoreResponse::timeOverSpeedLimitMsIsSet() const
{
    return m_TimeOverSpeedLimitMsIsSet;
}

void VehicleSafetyScoreResponse::unsetTimeOverSpeedLimitMs()
{
    m_TimeOverSpeedLimitMsIsSet = false;
}

int32_t VehicleSafetyScoreResponse::getTotalDistanceDrivenMeters() const
{
    return m_TotalDistanceDrivenMeters;
}

void VehicleSafetyScoreResponse::setTotalDistanceDrivenMeters(int32_t value)
{
    m_TotalDistanceDrivenMeters = value;
    m_TotalDistanceDrivenMetersIsSet = true;
}

bool VehicleSafetyScoreResponse::totalDistanceDrivenMetersIsSet() const
{
    return m_TotalDistanceDrivenMetersIsSet;
}

void VehicleSafetyScoreResponse::unsetTotalDistanceDrivenMeters()
{
    m_TotalDistanceDrivenMetersIsSet = false;
}

int32_t VehicleSafetyScoreResponse::getTotalHarshEventCount() const
{
    return m_TotalHarshEventCount;
}

void VehicleSafetyScoreResponse::setTotalHarshEventCount(int32_t value)
{
    m_TotalHarshEventCount = value;
    m_TotalHarshEventCountIsSet = true;
}

bool VehicleSafetyScoreResponse::totalHarshEventCountIsSet() const
{
    return m_TotalHarshEventCountIsSet;
}

void VehicleSafetyScoreResponse::unsetTotalHarshEventCount()
{
    m_TotalHarshEventCountIsSet = false;
}

int32_t VehicleSafetyScoreResponse::getTotalTimeDrivenMs() const
{
    return m_TotalTimeDrivenMs;
}

void VehicleSafetyScoreResponse::setTotalTimeDrivenMs(int32_t value)
{
    m_TotalTimeDrivenMs = value;
    m_TotalTimeDrivenMsIsSet = true;
}

bool VehicleSafetyScoreResponse::totalTimeDrivenMsIsSet() const
{
    return m_TotalTimeDrivenMsIsSet;
}

void VehicleSafetyScoreResponse::unsetTotalTimeDrivenMs()
{
    m_TotalTimeDrivenMsIsSet = false;
}

int32_t VehicleSafetyScoreResponse::getVehicleId() const
{
    return m_VehicleId;
}

void VehicleSafetyScoreResponse::setVehicleId(int32_t value)
{
    m_VehicleId = value;
    m_VehicleIdIsSet = true;
}

bool VehicleSafetyScoreResponse::vehicleIdIsSet() const
{
    return m_VehicleIdIsSet;
}

void VehicleSafetyScoreResponse::unsetVehicleId()
{
    m_VehicleIdIsSet = false;
}

}
}
}
}

