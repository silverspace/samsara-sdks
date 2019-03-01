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



#include "TripResponse_trips.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

TripResponse_trips::TripResponse_trips()
{
    m_EndOdometer = 0;
    m_EndOdometerIsSet = false;
    m_DistanceMeters = 0;
    m_DistanceMetersIsSet = false;
    m_EndMs = 0;
    m_EndMsIsSet = false;
    m_StartMs = 0;
    m_StartMsIsSet = false;
    m_FuelConsumedMl = 0;
    m_FuelConsumedMlIsSet = false;
    m_StartAddress = utility::conversions::to_string_t("");
    m_StartAddressIsSet = false;
    m_StartCoordinatesIsSet = false;
    m_EndCoordinatesIsSet = false;
    m_StartOdometer = 0;
    m_StartOdometerIsSet = false;
    m_DriverId = 0;
    m_DriverIdIsSet = false;
    m_StartLocation = utility::conversions::to_string_t("");
    m_StartLocationIsSet = false;
    m_TollMeters = 0;
    m_TollMetersIsSet = false;
    m_EndAddress = utility::conversions::to_string_t("");
    m_EndAddressIsSet = false;
    m_EndLocation = utility::conversions::to_string_t("");
    m_EndLocationIsSet = false;
}

TripResponse_trips::~TripResponse_trips()
{
}

void TripResponse_trips::validate()
{
    // TODO: implement validation
}

web::json::value TripResponse_trips::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_EndOdometerIsSet)
    {
        val[utility::conversions::to_string_t("endOdometer")] = ModelBase::toJson(m_EndOdometer);
    }
    if(m_DistanceMetersIsSet)
    {
        val[utility::conversions::to_string_t("distanceMeters")] = ModelBase::toJson(m_DistanceMeters);
    }
    if(m_EndMsIsSet)
    {
        val[utility::conversions::to_string_t("endMs")] = ModelBase::toJson(m_EndMs);
    }
    if(m_StartMsIsSet)
    {
        val[utility::conversions::to_string_t("startMs")] = ModelBase::toJson(m_StartMs);
    }
    if(m_FuelConsumedMlIsSet)
    {
        val[utility::conversions::to_string_t("fuelConsumedMl")] = ModelBase::toJson(m_FuelConsumedMl);
    }
    if(m_StartAddressIsSet)
    {
        val[utility::conversions::to_string_t("startAddress")] = ModelBase::toJson(m_StartAddress);
    }
    if(m_StartCoordinatesIsSet)
    {
        val[utility::conversions::to_string_t("startCoordinates")] = ModelBase::toJson(m_StartCoordinates);
    }
    if(m_EndCoordinatesIsSet)
    {
        val[utility::conversions::to_string_t("endCoordinates")] = ModelBase::toJson(m_EndCoordinates);
    }
    if(m_StartOdometerIsSet)
    {
        val[utility::conversions::to_string_t("startOdometer")] = ModelBase::toJson(m_StartOdometer);
    }
    if(m_DriverIdIsSet)
    {
        val[utility::conversions::to_string_t("driverId")] = ModelBase::toJson(m_DriverId);
    }
    if(m_StartLocationIsSet)
    {
        val[utility::conversions::to_string_t("startLocation")] = ModelBase::toJson(m_StartLocation);
    }
    if(m_TollMetersIsSet)
    {
        val[utility::conversions::to_string_t("tollMeters")] = ModelBase::toJson(m_TollMeters);
    }
    if(m_EndAddressIsSet)
    {
        val[utility::conversions::to_string_t("endAddress")] = ModelBase::toJson(m_EndAddress);
    }
    if(m_EndLocationIsSet)
    {
        val[utility::conversions::to_string_t("endLocation")] = ModelBase::toJson(m_EndLocation);
    }

    return val;
}

void TripResponse_trips::fromJson(const web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("endOdometer")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("endOdometer"));
        if(!fieldValue.is_null())
        {
            setEndOdometer(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("distanceMeters")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("distanceMeters"));
        if(!fieldValue.is_null())
        {
            setDistanceMeters(ModelBase::int32_tFromJson(fieldValue));
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
    if(val.has_field(utility::conversions::to_string_t("fuelConsumedMl")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("fuelConsumedMl"));
        if(!fieldValue.is_null())
        {
            setFuelConsumedMl(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("startAddress")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("startAddress"));
        if(!fieldValue.is_null())
        {
            setStartAddress(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("startCoordinates")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("startCoordinates"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<TripResponse_startCoordinates> newItem(new TripResponse_startCoordinates());
            newItem->fromJson(fieldValue);
            setStartCoordinates( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("endCoordinates")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("endCoordinates"));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<TripResponse_endCoordinates> newItem(new TripResponse_endCoordinates());
            newItem->fromJson(fieldValue);
            setEndCoordinates( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("startOdometer")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("startOdometer"));
        if(!fieldValue.is_null())
        {
            setStartOdometer(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("driverId")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("driverId"));
        if(!fieldValue.is_null())
        {
            setDriverId(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("startLocation")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("startLocation"));
        if(!fieldValue.is_null())
        {
            setStartLocation(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("tollMeters")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("tollMeters"));
        if(!fieldValue.is_null())
        {
            setTollMeters(ModelBase::int32_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("endAddress")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("endAddress"));
        if(!fieldValue.is_null())
        {
            setEndAddress(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("endLocation")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("endLocation"));
        if(!fieldValue.is_null())
        {
            setEndLocation(ModelBase::stringFromJson(fieldValue));
        }
    }
}

void TripResponse_trips::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_EndOdometerIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("endOdometer"), m_EndOdometer));
    }
    if(m_DistanceMetersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("distanceMeters"), m_DistanceMeters));
    }
    if(m_EndMsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("endMs"), m_EndMs));
    }
    if(m_StartMsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("startMs"), m_StartMs));
    }
    if(m_FuelConsumedMlIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("fuelConsumedMl"), m_FuelConsumedMl));
    }
    if(m_StartAddressIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("startAddress"), m_StartAddress));
    }
    if(m_StartCoordinatesIsSet)
    {
        if (m_StartCoordinates.get())
        {
            m_StartCoordinates->toMultipart(multipart, utility::conversions::to_string_t("startCoordinates."));
        }
    }
    if(m_EndCoordinatesIsSet)
    {
        if (m_EndCoordinates.get())
        {
            m_EndCoordinates->toMultipart(multipart, utility::conversions::to_string_t("endCoordinates."));
        }
    }
    if(m_StartOdometerIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("startOdometer"), m_StartOdometer));
    }
    if(m_DriverIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("driverId"), m_DriverId));
    }
    if(m_StartLocationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("startLocation"), m_StartLocation));
    }
    if(m_TollMetersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("tollMeters"), m_TollMeters));
    }
    if(m_EndAddressIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("endAddress"), m_EndAddress));
    }
    if(m_EndLocationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("endLocation"), m_EndLocation));
    }
}

void TripResponse_trips::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("endOdometer")))
    {
        setEndOdometer(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("endOdometer"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("distanceMeters")))
    {
        setDistanceMeters(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("distanceMeters"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("endMs")))
    {
        setEndMs(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("endMs"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("startMs")))
    {
        setStartMs(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("startMs"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("fuelConsumedMl")))
    {
        setFuelConsumedMl(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("fuelConsumedMl"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("startAddress")))
    {
        setStartAddress(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("startAddress"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("startCoordinates")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("startCoordinates")))
        {
            std::shared_ptr<TripResponse_startCoordinates> newItem(new TripResponse_startCoordinates());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("startCoordinates."));
            setStartCoordinates( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("endCoordinates")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("endCoordinates")))
        {
            std::shared_ptr<TripResponse_endCoordinates> newItem(new TripResponse_endCoordinates());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("endCoordinates."));
            setEndCoordinates( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("startOdometer")))
    {
        setStartOdometer(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("startOdometer"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("driverId")))
    {
        setDriverId(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("driverId"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("startLocation")))
    {
        setStartLocation(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("startLocation"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("tollMeters")))
    {
        setTollMeters(ModelBase::int32_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("tollMeters"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("endAddress")))
    {
        setEndAddress(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("endAddress"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("endLocation")))
    {
        setEndLocation(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("endLocation"))));
    }
}

int32_t TripResponse_trips::getEndOdometer() const
{
    return m_EndOdometer;
}

void TripResponse_trips::setEndOdometer(int32_t value)
{
    m_EndOdometer = value;
    m_EndOdometerIsSet = true;
}

bool TripResponse_trips::endOdometerIsSet() const
{
    return m_EndOdometerIsSet;
}

void TripResponse_trips::unsetEndOdometer()
{
    m_EndOdometerIsSet = false;
}

int32_t TripResponse_trips::getDistanceMeters() const
{
    return m_DistanceMeters;
}

void TripResponse_trips::setDistanceMeters(int32_t value)
{
    m_DistanceMeters = value;
    m_DistanceMetersIsSet = true;
}

bool TripResponse_trips::distanceMetersIsSet() const
{
    return m_DistanceMetersIsSet;
}

void TripResponse_trips::unsetDistanceMeters()
{
    m_DistanceMetersIsSet = false;
}

int32_t TripResponse_trips::getEndMs() const
{
    return m_EndMs;
}

void TripResponse_trips::setEndMs(int32_t value)
{
    m_EndMs = value;
    m_EndMsIsSet = true;
}

bool TripResponse_trips::endMsIsSet() const
{
    return m_EndMsIsSet;
}

void TripResponse_trips::unsetEndMs()
{
    m_EndMsIsSet = false;
}

int32_t TripResponse_trips::getStartMs() const
{
    return m_StartMs;
}

void TripResponse_trips::setStartMs(int32_t value)
{
    m_StartMs = value;
    m_StartMsIsSet = true;
}

bool TripResponse_trips::startMsIsSet() const
{
    return m_StartMsIsSet;
}

void TripResponse_trips::unsetStartMs()
{
    m_StartMsIsSet = false;
}

int32_t TripResponse_trips::getFuelConsumedMl() const
{
    return m_FuelConsumedMl;
}

void TripResponse_trips::setFuelConsumedMl(int32_t value)
{
    m_FuelConsumedMl = value;
    m_FuelConsumedMlIsSet = true;
}

bool TripResponse_trips::fuelConsumedMlIsSet() const
{
    return m_FuelConsumedMlIsSet;
}

void TripResponse_trips::unsetFuelConsumedMl()
{
    m_FuelConsumedMlIsSet = false;
}

utility::string_t TripResponse_trips::getStartAddress() const
{
    return m_StartAddress;
}

void TripResponse_trips::setStartAddress(const utility::string_t& value)
{
    m_StartAddress = value;
    m_StartAddressIsSet = true;
}

bool TripResponse_trips::startAddressIsSet() const
{
    return m_StartAddressIsSet;
}

void TripResponse_trips::unsetStartAddress()
{
    m_StartAddressIsSet = false;
}

std::shared_ptr<TripResponse_startCoordinates> TripResponse_trips::getStartCoordinates() const
{
    return m_StartCoordinates;
}

void TripResponse_trips::setStartCoordinates(const std::shared_ptr<TripResponse_startCoordinates>& value)
{
    m_StartCoordinates = value;
    m_StartCoordinatesIsSet = true;
}

bool TripResponse_trips::startCoordinatesIsSet() const
{
    return m_StartCoordinatesIsSet;
}

void TripResponse_trips::unsetStartCoordinates()
{
    m_StartCoordinatesIsSet = false;
}

std::shared_ptr<TripResponse_endCoordinates> TripResponse_trips::getEndCoordinates() const
{
    return m_EndCoordinates;
}

void TripResponse_trips::setEndCoordinates(const std::shared_ptr<TripResponse_endCoordinates>& value)
{
    m_EndCoordinates = value;
    m_EndCoordinatesIsSet = true;
}

bool TripResponse_trips::endCoordinatesIsSet() const
{
    return m_EndCoordinatesIsSet;
}

void TripResponse_trips::unsetEndCoordinates()
{
    m_EndCoordinatesIsSet = false;
}

int32_t TripResponse_trips::getStartOdometer() const
{
    return m_StartOdometer;
}

void TripResponse_trips::setStartOdometer(int32_t value)
{
    m_StartOdometer = value;
    m_StartOdometerIsSet = true;
}

bool TripResponse_trips::startOdometerIsSet() const
{
    return m_StartOdometerIsSet;
}

void TripResponse_trips::unsetStartOdometer()
{
    m_StartOdometerIsSet = false;
}

int32_t TripResponse_trips::getDriverId() const
{
    return m_DriverId;
}

void TripResponse_trips::setDriverId(int32_t value)
{
    m_DriverId = value;
    m_DriverIdIsSet = true;
}

bool TripResponse_trips::driverIdIsSet() const
{
    return m_DriverIdIsSet;
}

void TripResponse_trips::unsetDriverId()
{
    m_DriverIdIsSet = false;
}

utility::string_t TripResponse_trips::getStartLocation() const
{
    return m_StartLocation;
}

void TripResponse_trips::setStartLocation(const utility::string_t& value)
{
    m_StartLocation = value;
    m_StartLocationIsSet = true;
}

bool TripResponse_trips::startLocationIsSet() const
{
    return m_StartLocationIsSet;
}

void TripResponse_trips::unsetStartLocation()
{
    m_StartLocationIsSet = false;
}

int32_t TripResponse_trips::getTollMeters() const
{
    return m_TollMeters;
}

void TripResponse_trips::setTollMeters(int32_t value)
{
    m_TollMeters = value;
    m_TollMetersIsSet = true;
}

bool TripResponse_trips::tollMetersIsSet() const
{
    return m_TollMetersIsSet;
}

void TripResponse_trips::unsetTollMeters()
{
    m_TollMetersIsSet = false;
}

utility::string_t TripResponse_trips::getEndAddress() const
{
    return m_EndAddress;
}

void TripResponse_trips::setEndAddress(const utility::string_t& value)
{
    m_EndAddress = value;
    m_EndAddressIsSet = true;
}

bool TripResponse_trips::endAddressIsSet() const
{
    return m_EndAddressIsSet;
}

void TripResponse_trips::unsetEndAddress()
{
    m_EndAddressIsSet = false;
}

utility::string_t TripResponse_trips::getEndLocation() const
{
    return m_EndLocation;
}

void TripResponse_trips::setEndLocation(const utility::string_t& value)
{
    m_EndLocation = value;
    m_EndLocationIsSet = true;
}

bool TripResponse_trips::endLocationIsSet() const
{
    return m_EndLocationIsSet;
}

void TripResponse_trips::unsetEndLocation()
{
    m_EndLocationIsSet = false;
}

}
}
}
}

