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



#include "DriverDailyLogResponse_days.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

DriverDailyLogResponse_days::DriverDailyLogResponse_days()
{
    m_CertifiedAtMs = 0L;
    m_CertifiedAtMsIsSet = false;
    m_EndMs = 0;
    m_EndMsIsSet = false;
    m_StartMs = 0;
    m_StartMsIsSet = false;
    m_TrailerIdsIsSet = false;
    m_ActiveHours = 0.0;
    m_ActiveHoursIsSet = false;
    m_DistanceMiles = 0.0;
    m_DistanceMilesIsSet = false;
    m_ActiveMs = 0L;
    m_ActiveMsIsSet = false;
    m_Certified = false;
    m_CertifiedIsSet = false;
    m_VehicleIdsIsSet = false;
}

DriverDailyLogResponse_days::~DriverDailyLogResponse_days()
{
}

void DriverDailyLogResponse_days::validate()
{
    // TODO: implement validation
}

web::json::value DriverDailyLogResponse_days::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_CertifiedAtMsIsSet)
    {
        val[utility::conversions::to_string_t("certifiedAtMs")] = ModelBase::toJson(m_CertifiedAtMs);
    }
    if(m_EndMsIsSet)
    {
        val[utility::conversions::to_string_t("endMs")] = ModelBase::toJson(m_EndMs);
    }
    if(m_StartMsIsSet)
    {
        val[utility::conversions::to_string_t("startMs")] = ModelBase::toJson(m_StartMs);
    }
    if(m_TrailerIdsIsSet)
    {
        val[utility::conversions::to_string_t("trailerIds")] = ModelBase::toJson(m_TrailerIds);
    }
    if(m_ActiveHoursIsSet)
    {
        val[utility::conversions::to_string_t("activeHours")] = ModelBase::toJson(m_ActiveHours);
    }
    if(m_DistanceMilesIsSet)
    {
        val[utility::conversions::to_string_t("distanceMiles")] = ModelBase::toJson(m_DistanceMiles);
    }
    if(m_ActiveMsIsSet)
    {
        val[utility::conversions::to_string_t("activeMs")] = ModelBase::toJson(m_ActiveMs);
    }
    if(m_CertifiedIsSet)
    {
        val[utility::conversions::to_string_t("certified")] = ModelBase::toJson(m_Certified);
    }
    if(m_VehicleIdsIsSet)
    {
        val[utility::conversions::to_string_t("vehicleIds")] = ModelBase::toJson(m_VehicleIds);
    }

    return val;
}

void DriverDailyLogResponse_days::fromJson(const web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("certifiedAtMs")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("certifiedAtMs"));
        if(!fieldValue.is_null())
        {
            setCertifiedAtMs(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("endMs")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("endMs"));
        if(!fieldValue.is_null())
        {
            setEndMs(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("startMs")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("startMs"));
        if(!fieldValue.is_null())
        {
            setStartMs(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("trailerIds")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("trailerIds"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Object> newItem(nullptr);
            newItem->fromJson(fieldValue);
            setTrailerIds( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("activeHours")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("activeHours"));
        if(!fieldValue.is_null())
        {
            setActiveHours(ModelBase::doubleFromJson(fieldValue));
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
    if(val.has_field(utility::conversions::to_string_t("activeMs")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("activeMs"));
        if(!fieldValue.is_null())
        {
            setActiveMs(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("certified")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("certified"));
        if(!fieldValue.is_null())
        {
            setCertified(ModelBase::boolFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("vehicleIds")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("vehicleIds"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Object> newItem(nullptr);
            newItem->fromJson(fieldValue);
            setVehicleIds( newItem );
        }
    }
}

void DriverDailyLogResponse_days::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_CertifiedAtMsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("certifiedAtMs"), m_CertifiedAtMs));
    }
    if(m_EndMsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("endMs"), m_EndMs));
    }
    if(m_StartMsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("startMs"), m_StartMs));
    }
    if(m_TrailerIdsIsSet)
    {
        if (m_TrailerIds.get())
        {
            m_TrailerIds->toMultipart(multipart, utility::conversions::to_string_t("trailerIds."));
        }
    }
    if(m_ActiveHoursIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("activeHours"), m_ActiveHours));
    }
    if(m_DistanceMilesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("distanceMiles"), m_DistanceMiles));
    }
    if(m_ActiveMsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("activeMs"), m_ActiveMs));
    }
    if(m_CertifiedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("certified"), m_Certified));
    }
    if(m_VehicleIdsIsSet)
    {
        if (m_VehicleIds.get())
        {
            m_VehicleIds->toMultipart(multipart, utility::conversions::to_string_t("vehicleIds."));
        }
    }
}

void DriverDailyLogResponse_days::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("certifiedAtMs")))
    {
        setCertifiedAtMs(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("certifiedAtMs"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("endMs")))
    {
        setEndMs(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("endMs"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("startMs")))
    {
        setStartMs(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("startMs"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("trailerIds")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("trailerIds")))
        {
            std::shared_ptr<Object> newItem(nullptr);
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("trailerIds."));
            setTrailerIds( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("activeHours")))
    {
        setActiveHours(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("activeHours"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("distanceMiles")))
    {
        setDistanceMiles(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("distanceMiles"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("activeMs")))
    {
        setActiveMs(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("activeMs"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("certified")))
    {
        setCertified(ModelBase::boolFromHttpContent(multipart->getContent(utility::conversions::to_string_t("certified"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("vehicleIds")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("vehicleIds")))
        {
            std::shared_ptr<Object> newItem(nullptr);
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("vehicleIds."));
            setVehicleIds( newItem );
        }
    }
}

int64_t DriverDailyLogResponse_days::getCertifiedAtMs() const
{
    return m_CertifiedAtMs;
}

void DriverDailyLogResponse_days::setCertifiedAtMs(int64_t value)
{
    m_CertifiedAtMs = value;
    m_CertifiedAtMsIsSet = true;
}

bool DriverDailyLogResponse_days::certifiedAtMsIsSet() const
{
    return m_CertifiedAtMsIsSet;
}

void DriverDailyLogResponse_days::unsetCertifiedAtMs()
{
    m_CertifiedAtMsIsSet = false;
}

int32_t DriverDailyLogResponse_days::getEndMs() const
{
    return m_EndMs;
}

void DriverDailyLogResponse_days::setEndMs(int32_t value)
{
    m_EndMs = value;
    m_EndMsIsSet = true;
}

bool DriverDailyLogResponse_days::endMsIsSet() const
{
    return m_EndMsIsSet;
}

void DriverDailyLogResponse_days::unsetEndMs()
{
    m_EndMsIsSet = false;
}

int32_t DriverDailyLogResponse_days::getStartMs() const
{
    return m_StartMs;
}

void DriverDailyLogResponse_days::setStartMs(int32_t value)
{
    m_StartMs = value;
    m_StartMsIsSet = true;
}

bool DriverDailyLogResponse_days::startMsIsSet() const
{
    return m_StartMsIsSet;
}

void DriverDailyLogResponse_days::unsetStartMs()
{
    m_StartMsIsSet = false;
}

std::shared_ptr<Object> DriverDailyLogResponse_days::getTrailerIds() const
{
    return m_TrailerIds;
}

void DriverDailyLogResponse_days::setTrailerIds(const std::shared_ptr<Object>& value)
{
    m_TrailerIds = value;
    m_TrailerIdsIsSet = true;
}

bool DriverDailyLogResponse_days::trailerIdsIsSet() const
{
    return m_TrailerIdsIsSet;
}

void DriverDailyLogResponse_days::unsetTrailerIds()
{
    m_TrailerIdsIsSet = false;
}

double DriverDailyLogResponse_days::getActiveHours() const
{
    return m_ActiveHours;
}

void DriverDailyLogResponse_days::setActiveHours(double value)
{
    m_ActiveHours = value;
    m_ActiveHoursIsSet = true;
}

bool DriverDailyLogResponse_days::activeHoursIsSet() const
{
    return m_ActiveHoursIsSet;
}

void DriverDailyLogResponse_days::unsetActiveHours()
{
    m_ActiveHoursIsSet = false;
}

double DriverDailyLogResponse_days::getDistanceMiles() const
{
    return m_DistanceMiles;
}

void DriverDailyLogResponse_days::setDistanceMiles(double value)
{
    m_DistanceMiles = value;
    m_DistanceMilesIsSet = true;
}

bool DriverDailyLogResponse_days::distanceMilesIsSet() const
{
    return m_DistanceMilesIsSet;
}

void DriverDailyLogResponse_days::unsetDistanceMiles()
{
    m_DistanceMilesIsSet = false;
}

int64_t DriverDailyLogResponse_days::getActiveMs() const
{
    return m_ActiveMs;
}

void DriverDailyLogResponse_days::setActiveMs(int64_t value)
{
    m_ActiveMs = value;
    m_ActiveMsIsSet = true;
}

bool DriverDailyLogResponse_days::activeMsIsSet() const
{
    return m_ActiveMsIsSet;
}

void DriverDailyLogResponse_days::unsetActiveMs()
{
    m_ActiveMsIsSet = false;
}

bool DriverDailyLogResponse_days::isCertified() const
{
    return m_Certified;
}

void DriverDailyLogResponse_days::setCertified(bool value)
{
    m_Certified = value;
    m_CertifiedIsSet = true;
}

bool DriverDailyLogResponse_days::certifiedIsSet() const
{
    return m_CertifiedIsSet;
}

void DriverDailyLogResponse_days::unsetCertified()
{
    m_CertifiedIsSet = false;
}

std::shared_ptr<Object> DriverDailyLogResponse_days::getVehicleIds() const
{
    return m_VehicleIds;
}

void DriverDailyLogResponse_days::setVehicleIds(const std::shared_ptr<Object>& value)
{
    m_VehicleIds = value;
    m_VehicleIdsIsSet = true;
}

bool DriverDailyLogResponse_days::vehicleIdsIsSet() const
{
    return m_VehicleIdsIsSet;
}

void DriverDailyLogResponse_days::unsetVehicleIds()
{
    m_VehicleIdsIsSet = false;
}

}
}
}
}

