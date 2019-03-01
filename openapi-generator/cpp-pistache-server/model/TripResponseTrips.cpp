/**
* Samsara API
* # Introduction  Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.  The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.  API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.  If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)  # Endpoints  All our APIs can be accessed through HTTP requests to URLs like:  ```curl https://api.samsara.com/<version>/<endpoint> ```  All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.  # Authentication  To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under `Settings->Organization->API Tokens`.  Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.  Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.  ```curl https://api.samsara.com/<version>/<endpoint>?access_token={access_token} ```  All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.  # Request Methods  Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.  ## GET  GET requests are typically used for fetching data (like data for a particular driver).  ## POST  POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).  ## PUT  PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).  ## PATCH  PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).  ## DELETE  DELETE requests are used for deleting a record (like deleting a tag from the system).  # Response Codes  All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.  ## 2XX  These are successful responses and indicate that the API request returned the expected response.  ## 4XX  These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.  ## 5XX  These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.  # Error Responses  In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.  | Status Code | Message | Description | |-------------|----------------|-------------------------------------------------------------------| | 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). | | 404 | Page not found | The API endpoint being accessed is invalid. | | 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |  # Versioning  All our APIs are versioned. Our current API version is `v1` and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.  # FAQs  Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "TripResponse_trips.h"

namespace org {
namespace openapitools {
namespace server {
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
    m_StartAddress = "";
    m_StartAddressIsSet = false;
    m_StartCoordinatesIsSet = false;
    m_EndCoordinatesIsSet = false;
    m_StartOdometer = 0;
    m_StartOdometerIsSet = false;
    m_DriverId = 0;
    m_DriverIdIsSet = false;
    m_StartLocation = "";
    m_StartLocationIsSet = false;
    m_TollMeters = 0;
    m_TollMetersIsSet = false;
    m_EndAddress = "";
    m_EndAddressIsSet = false;
    m_EndLocation = "";
    m_EndLocationIsSet = false;
    
}

TripResponse_trips::~TripResponse_trips()
{
}

void TripResponse_trips::validate()
{
    // TODO: implement validation
}

nlohmann::json TripResponse_trips::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_EndOdometerIsSet)
    {
        val["endOdometer"] = m_EndOdometer;
    }
    if(m_DistanceMetersIsSet)
    {
        val["distanceMeters"] = m_DistanceMeters;
    }
    if(m_EndMsIsSet)
    {
        val["endMs"] = m_EndMs;
    }
    if(m_StartMsIsSet)
    {
        val["startMs"] = m_StartMs;
    }
    if(m_FuelConsumedMlIsSet)
    {
        val["fuelConsumedMl"] = m_FuelConsumedMl;
    }
    if(m_StartAddressIsSet)
    {
        val["startAddress"] = ModelBase::toJson(m_StartAddress);
    }
    if(m_StartCoordinatesIsSet)
    {
        val["startCoordinates"] = ModelBase::toJson(m_StartCoordinates);
    }
    if(m_EndCoordinatesIsSet)
    {
        val["endCoordinates"] = ModelBase::toJson(m_EndCoordinates);
    }
    if(m_StartOdometerIsSet)
    {
        val["startOdometer"] = m_StartOdometer;
    }
    if(m_DriverIdIsSet)
    {
        val["driverId"] = m_DriverId;
    }
    if(m_StartLocationIsSet)
    {
        val["startLocation"] = ModelBase::toJson(m_StartLocation);
    }
    if(m_TollMetersIsSet)
    {
        val["tollMeters"] = m_TollMeters;
    }
    if(m_EndAddressIsSet)
    {
        val["endAddress"] = ModelBase::toJson(m_EndAddress);
    }
    if(m_EndLocationIsSet)
    {
        val["endLocation"] = ModelBase::toJson(m_EndLocation);
    }
    

    return val;
}

void TripResponse_trips::fromJson(const nlohmann::json& val)
{
    if(val.find("endOdometer") != val.end())
    {
        setEndOdometer(val.at("endOdometer"));
    }
    if(val.find("distanceMeters") != val.end())
    {
        setDistanceMeters(val.at("distanceMeters"));
    }
    if(val.find("endMs") != val.end())
    {
        setEndMs(val.at("endMs"));
    }
    if(val.find("startMs") != val.end())
    {
        setStartMs(val.at("startMs"));
    }
    if(val.find("fuelConsumedMl") != val.end())
    {
        setFuelConsumedMl(val.at("fuelConsumedMl"));
    }
    if(val.find("startAddress") != val.end())
    {
        setStartAddress(val.at("startAddress"));
    }
    if(val.find("startCoordinates") != val.end())
    {
        if(!val["startCoordinates"].is_null())
        {
            TripResponse_startCoordinates newItem;
            newItem.fromJson(val["startCoordinates"]);
            setStartCoordinates( newItem );
        }
        
    }
    if(val.find("endCoordinates") != val.end())
    {
        if(!val["endCoordinates"].is_null())
        {
            TripResponse_endCoordinates newItem;
            newItem.fromJson(val["endCoordinates"]);
            setEndCoordinates( newItem );
        }
        
    }
    if(val.find("startOdometer") != val.end())
    {
        setStartOdometer(val.at("startOdometer"));
    }
    if(val.find("driverId") != val.end())
    {
        setDriverId(val.at("driverId"));
    }
    if(val.find("startLocation") != val.end())
    {
        setStartLocation(val.at("startLocation"));
    }
    if(val.find("tollMeters") != val.end())
    {
        setTollMeters(val.at("tollMeters"));
    }
    if(val.find("endAddress") != val.end())
    {
        setEndAddress(val.at("endAddress"));
    }
    if(val.find("endLocation") != val.end())
    {
        setEndLocation(val.at("endLocation"));
    }
    
}


int32_t TripResponse_trips::getEndOdometer() const
{
    return m_EndOdometer;
}
void TripResponse_trips::setEndOdometer(int32_t const value)
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
void TripResponse_trips::setDistanceMeters(int32_t const value)
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
void TripResponse_trips::setEndMs(int32_t const value)
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
void TripResponse_trips::setStartMs(int32_t const value)
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
void TripResponse_trips::setFuelConsumedMl(int32_t const value)
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
std::string TripResponse_trips::getStartAddress() const
{
    return m_StartAddress;
}
void TripResponse_trips::setStartAddress(std::string const& value)
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
TripResponse_startCoordinates TripResponse_trips::getStartCoordinates() const
{
    return m_StartCoordinates;
}
void TripResponse_trips::setStartCoordinates(TripResponse_startCoordinates const& value)
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
TripResponse_endCoordinates TripResponse_trips::getEndCoordinates() const
{
    return m_EndCoordinates;
}
void TripResponse_trips::setEndCoordinates(TripResponse_endCoordinates const& value)
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
void TripResponse_trips::setStartOdometer(int32_t const value)
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
void TripResponse_trips::setDriverId(int32_t const value)
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
std::string TripResponse_trips::getStartLocation() const
{
    return m_StartLocation;
}
void TripResponse_trips::setStartLocation(std::string const& value)
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
void TripResponse_trips::setTollMeters(int32_t const value)
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
std::string TripResponse_trips::getEndAddress() const
{
    return m_EndAddress;
}
void TripResponse_trips::setEndAddress(std::string const& value)
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
std::string TripResponse_trips::getEndLocation() const
{
    return m_EndLocation;
}
void TripResponse_trips::setEndLocation(std::string const& value)
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

